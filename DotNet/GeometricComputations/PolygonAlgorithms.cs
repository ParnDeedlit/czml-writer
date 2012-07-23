﻿using System;
using System.Collections.Generic;
using System.Linq;
using CesiumLanguageWriter;

namespace GeometricComputations
{
    public static class PolygonAlgorithms 
    {
        /// <summary>
        /// Determines if a given point lies inside or on the boundary of the triangle formed by three points.
        /// </summary>
        /// <param name="a">The first vertex of the triangle.</param>
        /// <param name="b">The second vertex of the triangle.</param>
        /// <param name="c">The third vertex of the triangle.</param>
        /// <param name="point">The point to test.</param>
        /// <returns>True if the point lies within the triangle formed by a, b, and c, false otherwise.</returns>
        public static bool IsPointInTriangle(Cartesian a, Cartesian b, Cartesian c, Cartesian point)
        {
            Cartesian v0 = c - a;
            Cartesian v1 = b - a;
            Cartesian v2 = point - a;

            double dot00 = v0.Dot(v0);
            double dot01 = v0.Dot(v1);
            double dot02 = v0.Dot(v2);
            double dot11 = v1.Dot(v1);
            double dot12 = v1.Dot(v2);

            double inverseDenominator = 1 / (dot00 * dot11 - dot01 * dot01);
            double u = (dot11 * dot02 - dot01 * dot12) * inverseDenominator;
            double v = (dot00 * dot12 - dot01 * dot02) * inverseDenominator;

            return (u >= 0) && (v >= 0) && (u + v < 1);
        }

        /// <summary>
        /// Returns the index of the vertex with the maximum X-coordinate.
        /// </summary>
        /// <param name="vertices">The list of vertices.</param>
        /// <returns>The index of the vertex with the maximum X-coordinate.</returns>
        public static int GetRightmostVertexIndex(List<Cartesian> vertices)
        {
            double maximumX = vertices[0].X;
            int rightmostVertexIndex = 0;
            for (int i = 0; i < vertices.Count; i++)
            {
                if (vertices[i].X > maximumX)
                {
                    maximumX = vertices[i].X;
                    rightmostVertexIndex = i;
                }
            }
            return rightmostVertexIndex;
        }

        /// <summary>
        /// Returns the index of the inner ring that contains the rightmost vertex.
        /// </summary>
        /// <param name="innerRings">A list containing the vertex lists for each inner ring of the polygon.</param>
        /// <returns></returns>
        public static int GetRightmostRingIndex(List<List<Cartesian>> rings)
        {
            double rightmostX = rings[0][0].X;
            int rightmostRingIndex = 0;
            for (int ring = 0; ring < rings.Count; ring++)
            {
                    double maximumX = rings[ring].Max(vertex => vertex.X);
                    if (maximumX > rightmostX)
                    {
                        rightmostX = maximumX;
                        rightmostRingIndex = ring;
                    }
                }

            return rightmostRingIndex;
        }

        /// <summary>
        /// Returns a list containing the reflex vertices for a given polygon.
        /// </summary>
        /// <param name="polygon">A list of Cartesian points composing a polygon.</param>
        /// <returns>A list of Cartesians that are reflex vertices.</returns>
        public static List<Cartesian> GetReflexVertices(List<Cartesian> polygon)
        {
            List<Cartesian> reflexVertices = new List<Cartesian>();
            for (int i = 0; i < polygon.Count; i++)
            {
                Cartesian p0 = polygon[(i - 1 + polygon.Count) % polygon.Count];
                Cartesian p1 = polygon[i];
                Cartesian p2 = polygon[(i + 1) % polygon.Count];

                Cartesian v0 = p0 - p1;
                Cartesian v1 = p2 - p1;

                Cartesian v0_perp = new Cartesian(-v0.Y, v0.X, 0.0);
                double angle = Math.Atan2(v0_perp.Dot(v1), v0.Dot(v1));     // Signed angle from v0 to v1
                double perpDotProduct = v0.Magnitude * v1.Magnitude * Math.Sin(angle);
                if (perpDotProduct < 0)
                {
                    reflexVertices.Add(p1);
                }
            }
            return reflexVertices;
        }

        /// <summary>
        /// Checks whether a point is a vertex of a specific polygon.
        /// </summary>
        /// <param name="polygon">A list of vertices defining a polygon.</param>
        /// <param name="point">The point to test.</param>
        /// <returns></returns>
        public static bool IsVertex(List<Cartesian> polygon, Cartesian point)
        {
            foreach (Cartesian vertex in polygon)
            {
                if (vertex.Equals(point))
                {
                    return true;
                }
            }
            return false;
        }

        /// <summary>
        /// Given a point inside a polygon, find the nearest point directly to the right that lies on one of the polygon's edges.
        /// </summary>
        /// <param name="point">A point inside the ring.</param>
        /// <param name="ring">A list of <see cref="Cartesian">Cartesian</see> points defining a polygon.</param>
        /// <returns>The intersected point on the ring.</returns>
        public static Cartesian IntersectPointWithRing(Cartesian point, List<Cartesian> ring)
        {
            Cartesian[] temp;
            return IntersectPointWithRing(point, ring, out temp);
        }

        /// <summary>
        /// Given a point inside a polygon, find the nearest point directly to the right that lies on one of the polygon's edges.
        /// </summary>
        /// <param name="point">A point inside the ring.</param>
        /// <param name="ring">A list of <see cref="Cartesian">Cartesian</see> points defining a polygon.</param>
        /// <param name="edge">An array containing the two endpoints of the edge containing the intersection.</param>
        /// <returns>The intersected point on the ring.</returns>
        public static Cartesian IntersectPointWithRing(Cartesian point, List<Cartesian> ring, out Cartesian[] edge)
        {
            // Intersect point + t(1,0) with all edges of the ring.
            List<double> intersections = new List<double>();
            List<Cartesian[]> edges = new List<Cartesian[]>();
            for (int i = 0; i < ring.Count; i++)
            {
                Cartesian v1 = ring[i];
                Cartesian v2 = ring[(i + 1) % ring.Count];
               
                double m = (v2.Y - v1.Y) / (v2.X - v1.X);
                if (m != 0.0)
                {
                    double x = v2.X;

                    if (!(double.IsNaN(m)))
                    {
                        x = v1.X + (point.Y - v1.Y) / m;
                    }

                    // We only care about intersections on edges to the right of the point
                    if (x >= point.X)
                    {
                        intersections.Add(x);
                        edges.Add(new Cartesian[] { v1, v2 });
                    }
                }
            }
                        
            // Find the closest intersection
            int minDistanceIndex = 0;
            double minDistance = intersections[0] - point.X;
            for (int i = 0; i < intersections.Count; i++)
            {
                double distance = intersections[i] - point.X;
                if (distance < minDistance)
                {
                    minDistance = distance;
                    minDistanceIndex = i;
                }
            }

            edge = edges[minDistanceIndex];
            return new Cartesian(intersections[minDistanceIndex], point.Y, 0.0);
        }

        /// <summary>
        /// Given an outer ring and multiple inner rings, determine the point on the outer ring that is visible
        /// to the rightmost vertex of the rightmost inner ring.
        /// </summary>
        /// <param name="outerRing"></param>
        /// <param name="innerRings"></param>
        /// <returns>The index of the vertex in <paramref name="outerRing"/> that is mutually visible to the rightmost vertex in <paramref name="innerRings"/></returns>
        public static int GetMutuallyVisibleVertexIndex(List<Cartesian> outerRing, List<List<Cartesian>> innerRings)
        {
            int innerRingIndex = GetRightmostRingIndex(innerRings);
            List<Cartesian> innerRing = innerRings[innerRingIndex];
            int innerRingVertexIndex = GetRightmostVertexIndex(innerRings[innerRingIndex]);
            Cartesian innerRingVertex = innerRings[innerRingIndex][innerRingVertexIndex];
            Cartesian[] edge;
            Cartesian intersection = IntersectPointWithRing(innerRingVertex, outerRing, out edge);

            Cartesian visibleVertex;
            if (IsVertex(outerRing, intersection))
            {
                visibleVertex = intersection;
            }
            else
            {
                // Set P to be the endpoint of maximum x value for this edge
                Cartesian p = (edge[0].X > edge[1].X) ? edge[0] : edge[1];
                List<Cartesian> reflexVertices = GetReflexVertices(outerRing);
                reflexVertices.Remove(p); // Do not include p if it happens to be reflex.

                List<Cartesian> pointsInside = new List<Cartesian>();
                foreach (Cartesian vertex in reflexVertices)
                {
                    if (PolygonAlgorithms.IsPointInTriangle(innerRingVertex, intersection, p, vertex))
                    {
                        pointsInside.Add(vertex);
                    }
                }

                // If all reflexive vertices are outside the triangle formed by points 
                // innerRingVertex, intersection and P, then P is the visible vertex.
                // Otherwise, return the reflex vertex that minimizes the angle between <1,0> and <k, reflex>.
                double minAngle = Math.PI;
                if (pointsInside.Count > 0)
                {
                    Cartesian v1 = new Cartesian(1.0, 0.0, 0.0);
                    for (int i = 0; i < pointsInside.Count; i++)
                    {
                        Cartesian v2 = pointsInside[i] - innerRingVertex;
                        double angle = Math.Abs(Math.Acos(v1.Dot(v2) / (v1.Magnitude * v2.Magnitude)));
                        if (angle < minAngle)
                        {
                            minAngle = angle;
                            p = pointsInside[i];
                        }
                    }
                }
                visibleVertex = p;
            }

            return outerRing.FindIndex(delegate(Cartesian point)
            {
                return point.Equals(visibleVertex);
            });
        }

        public static List<Cartographic> EliminateHole(List<Cartographic> outerRing, ref List<List<Cartographic>> innerRings)
        {
            // Convert from LLA -> XYZ and project points onto a tangent plane to find the mutually visible vertex.
            List<Cartesian> cartesianOuterRing = new List<Cartesian>();
            foreach (Cartographic point in outerRing)
            {
                cartesianOuterRing.Add(Ellipsoid.Wgs84.ToCartesian(point));
            }

            List<List<Cartesian>> cartesianInnerRings = new List<List<Cartesian>>();
            foreach (IList<Cartographic> ring in innerRings)
            {
                List<Cartesian> cartesianInnerRing = new List<Cartesian>();
                foreach (Cartographic point in ring)
                {
                    cartesianInnerRing.Add(Ellipsoid.Wgs84.ToCartesian(point));
                }
                cartesianInnerRings.Add(cartesianInnerRing);
            }

            EllipsoidTangentPlane tangentPlane = new EllipsoidTangentPlane(Ellipsoid.Wgs84, cartesianOuterRing);
            cartesianOuterRing = (List<Cartesian>)(tangentPlane.ComputePositionsOnPlane(cartesianOuterRing));
            for (int i = 0; i < cartesianInnerRings.Count; i++)
            {
                cartesianInnerRings[i] = (List<Cartesian>)(tangentPlane.ComputePositionsOnPlane(cartesianInnerRings[i]));
            }

            int visibleVertexIndex = GetMutuallyVisibleVertexIndex(cartesianOuterRing, cartesianInnerRings);
                
            int innerRingIndex = GetRightmostRingIndex(cartesianInnerRings);
            int innerRingVertexIndex = GetRightmostVertexIndex(cartesianInnerRings[innerRingIndex]);

            List<Cartographic> innerRing = innerRings[innerRingIndex];
            List<Cartographic> newPolygonVertices = new List<Cartographic>();

            Cartographic innerRingVertex = innerRings[innerRingIndex][innerRingVertexIndex];

            for (int i = 0; i < outerRing.Count; i++)
            {
                newPolygonVertices.Add(outerRing[i]);
            }

            List<Cartographic> holeVerticesToAdd = new List<Cartographic>();

            // If the rightmost inner vertex is not the starting and ending point of the ring,
            // then some other point is duplicated in the inner ring and should be skipped once.
            if (innerRingVertexIndex != 0)
            {
                for (int j = 0; j <= innerRing.Count; j++)
                {
                    int index = (j + innerRingVertexIndex) % innerRing.Count;
                    if (index != 0)
                    {
                        holeVerticesToAdd.Add(innerRing[index]);
                    }
                }
            }
            else
            {
                for (int j = 0; j < innerRing.Count; j++)
                {
                    holeVerticesToAdd.Add(innerRing[(j + innerRingVertexIndex) % innerRing.Count]);
                }
            }

            int lastVisibleVertexIndex = newPolygonVertices.FindLastIndex(delegate(Cartographic point)
            {
                return point.Equals(outerRing[visibleVertexIndex]);
            });

            holeVerticesToAdd.Add(outerRing[lastVisibleVertexIndex]);
            newPolygonVertices.InsertRange(lastVisibleVertexIndex + 1, holeVerticesToAdd);
            innerRings.RemoveAt(innerRingIndex);

            // Simplify the polygon - Avoid consecutively traversing the same edge twice in a given direction.
            for (int i = 0; i < newPolygonVertices.Count; i++)
            {
                if (!newPolygonVertices[i].Equals(newPolygonVertices[0]))
                {
                    int count = newPolygonVertices.Where(p => p.Equals(newPolygonVertices[i])).Count();

                    Predicate<Cartographic> matchPoint = delegate(Cartographic p)
                    {
                        return p.Equals(newPolygonVertices[i]) && !p.Equals(newPolygonVertices[0]);
                    };

                    if (count >= 3)
                    {
                        List<int> indices = new List<int>();
                        int index = newPolygonVertices.FindIndex(0, matchPoint);
                        while (index >= 0)
                        {
                            indices.Add(index);
                            index = newPolygonVertices.FindIndex(index + 1, matchPoint);
                        }

                        List<Cartesian> previousVertices = new List<Cartesian>();
                        previousVertices.Add(Ellipsoid.Wgs84.ToCartesian(newPolygonVertices[i]));
                        for (int j = 1; j < indices.Count; j++)
                        {
                            previousVertices.Add(Ellipsoid.Wgs84.ToCartesian(newPolygonVertices[indices[j] - 1]));
                        }

                        List<Cartesian> points = (List<Cartesian>)tangentPlane.ComputePositionsOnPlane(previousVertices);

                        for (int j = 1; j < indices.Count - 1; j++)
                        {
                            var m1 = (points[0].Y - points[j].Y) / (points[0].X - points[j].X);
                            var m2 = (points[0].Y - points[j + 1].Y) / (points[0].X - points[j + 1].X);
                            if (m1 - m2 <= Constants.Epsilon10)
                            {
                                newPolygonVertices.RemoveAt(indices[j]);
                                i--;
                            }
                        }
                    }
                }
            }
            return newPolygonVertices;
        }
    }
}
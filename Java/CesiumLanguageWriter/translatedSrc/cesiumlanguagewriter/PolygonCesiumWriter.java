package cesiumlanguagewriter;


import agi.foundation.compatibility.*;
import agi.foundation.compatibility.DisposeHelper;
import agi.foundation.compatibility.Func1;
import agi.foundation.compatibility.Lazy;
import cesiumlanguagewriter.advanced.*;
import cesiumlanguagewriter.BooleanCesiumWriter;
import cesiumlanguagewriter.ColorCesiumWriter;
import cesiumlanguagewriter.DistanceDisplayConditionCesiumWriter;
import cesiumlanguagewriter.DoubleCesiumWriter;
import cesiumlanguagewriter.MaterialCesiumWriter;
import cesiumlanguagewriter.PositionListCesiumWriter;
import cesiumlanguagewriter.ShadowModeCesiumWriter;
import java.awt.Color;
import java.util.List;
import javax.annotation.Nonnull;

/**
 *  
 Writes a {@code Polygon} to a {@link CesiumOutputStream}.  A {@code Polygon} is a polygon, which is a closed figure on the surface of the Earth.
 

 */
@SuppressWarnings( {
        "unused",
        "deprecation",
        "serial"
})
public class PolygonCesiumWriter extends CesiumPropertyWriter<PolygonCesiumWriter> {
    /**
    *  
    The name of the {@code show} property.
    

    */
    public static final String ShowPropertyName = "show";
    /**
    *  
    The name of the {@code positions} property.
    

    */
    public static final String PositionsPropertyName = "positions";
    /**
    *  
    The name of the {@code height} property.
    

    */
    public static final String HeightPropertyName = "height";
    /**
    *  
    The name of the {@code extrudedHeight} property.
    

    */
    public static final String ExtrudedHeightPropertyName = "extrudedHeight";
    /**
    *  
    The name of the {@code stRotation} property.
    

    */
    public static final String StRotationPropertyName = "stRotation";
    /**
    *  
    The name of the {@code granularity} property.
    

    */
    public static final String GranularityPropertyName = "granularity";
    /**
    *  
    The name of the {@code fill} property.
    

    */
    public static final String FillPropertyName = "fill";
    /**
    *  
    The name of the {@code material} property.
    

    */
    public static final String MaterialPropertyName = "material";
    /**
    *  
    The name of the {@code outline} property.
    

    */
    public static final String OutlinePropertyName = "outline";
    /**
    *  
    The name of the {@code outlineColor} property.
    

    */
    public static final String OutlineColorPropertyName = "outlineColor";
    /**
    *  
    The name of the {@code outlineWidth} property.
    

    */
    public static final String OutlineWidthPropertyName = "outlineWidth";
    /**
    *  
    The name of the {@code perPositionHeight} property.
    

    */
    public static final String PerPositionHeightPropertyName = "perPositionHeight";
    /**
    *  
    The name of the {@code closeTop} property.
    

    */
    public static final String CloseTopPropertyName = "closeTop";
    /**
    *  
    The name of the {@code closeBottom} property.
    

    */
    public static final String CloseBottomPropertyName = "closeBottom";
    /**
    *  
    The name of the {@code shadows} property.
    

    */
    public static final String ShadowsPropertyName = "shadows";
    /**
    *  
    The name of the {@code distanceDisplayCondition} property.
    

    */
    public static final String DistanceDisplayConditionPropertyName = "distanceDisplayCondition";
    private Lazy<BooleanCesiumWriter> m_show = new Lazy<cesiumlanguagewriter.BooleanCesiumWriter>(new Func1<cesiumlanguagewriter.BooleanCesiumWriter>() {
        public cesiumlanguagewriter.BooleanCesiumWriter invoke() {
            return new BooleanCesiumWriter(ShowPropertyName);
        }
    }, false);
    private Lazy<PositionListCesiumWriter> m_positions = new Lazy<cesiumlanguagewriter.PositionListCesiumWriter>(new Func1<cesiumlanguagewriter.PositionListCesiumWriter>() {
        public cesiumlanguagewriter.PositionListCesiumWriter invoke() {
            return new PositionListCesiumWriter(PositionsPropertyName);
        }
    }, false);
    private Lazy<DoubleCesiumWriter> m_height = new Lazy<cesiumlanguagewriter.DoubleCesiumWriter>(new Func1<cesiumlanguagewriter.DoubleCesiumWriter>() {
        public cesiumlanguagewriter.DoubleCesiumWriter invoke() {
            return new DoubleCesiumWriter(HeightPropertyName);
        }
    }, false);
    private Lazy<DoubleCesiumWriter> m_extrudedHeight = new Lazy<cesiumlanguagewriter.DoubleCesiumWriter>(new Func1<cesiumlanguagewriter.DoubleCesiumWriter>() {
        public cesiumlanguagewriter.DoubleCesiumWriter invoke() {
            return new DoubleCesiumWriter(ExtrudedHeightPropertyName);
        }
    }, false);
    private Lazy<DoubleCesiumWriter> m_stRotation = new Lazy<cesiumlanguagewriter.DoubleCesiumWriter>(new Func1<cesiumlanguagewriter.DoubleCesiumWriter>() {
        public cesiumlanguagewriter.DoubleCesiumWriter invoke() {
            return new DoubleCesiumWriter(StRotationPropertyName);
        }
    }, false);
    private Lazy<DoubleCesiumWriter> m_granularity = new Lazy<cesiumlanguagewriter.DoubleCesiumWriter>(new Func1<cesiumlanguagewriter.DoubleCesiumWriter>() {
        public cesiumlanguagewriter.DoubleCesiumWriter invoke() {
            return new DoubleCesiumWriter(GranularityPropertyName);
        }
    }, false);
    private Lazy<BooleanCesiumWriter> m_fill = new Lazy<cesiumlanguagewriter.BooleanCesiumWriter>(new Func1<cesiumlanguagewriter.BooleanCesiumWriter>() {
        public cesiumlanguagewriter.BooleanCesiumWriter invoke() {
            return new BooleanCesiumWriter(FillPropertyName);
        }
    }, false);
    private Lazy<MaterialCesiumWriter> m_material = new Lazy<cesiumlanguagewriter.MaterialCesiumWriter>(new Func1<cesiumlanguagewriter.MaterialCesiumWriter>() {
        public cesiumlanguagewriter.MaterialCesiumWriter invoke() {
            return new MaterialCesiumWriter(MaterialPropertyName);
        }
    }, false);
    private Lazy<BooleanCesiumWriter> m_outline = new Lazy<cesiumlanguagewriter.BooleanCesiumWriter>(new Func1<cesiumlanguagewriter.BooleanCesiumWriter>() {
        public cesiumlanguagewriter.BooleanCesiumWriter invoke() {
            return new BooleanCesiumWriter(OutlinePropertyName);
        }
    }, false);
    private Lazy<ColorCesiumWriter> m_outlineColor = new Lazy<cesiumlanguagewriter.ColorCesiumWriter>(new Func1<cesiumlanguagewriter.ColorCesiumWriter>() {
        public cesiumlanguagewriter.ColorCesiumWriter invoke() {
            return new ColorCesiumWriter(OutlineColorPropertyName);
        }
    }, false);
    private Lazy<DoubleCesiumWriter> m_outlineWidth = new Lazy<cesiumlanguagewriter.DoubleCesiumWriter>(new Func1<cesiumlanguagewriter.DoubleCesiumWriter>() {
        public cesiumlanguagewriter.DoubleCesiumWriter invoke() {
            return new DoubleCesiumWriter(OutlineWidthPropertyName);
        }
    }, false);
    private Lazy<BooleanCesiumWriter> m_perPositionHeight = new Lazy<cesiumlanguagewriter.BooleanCesiumWriter>(new Func1<cesiumlanguagewriter.BooleanCesiumWriter>() {
        public cesiumlanguagewriter.BooleanCesiumWriter invoke() {
            return new BooleanCesiumWriter(PerPositionHeightPropertyName);
        }
    }, false);
    private Lazy<BooleanCesiumWriter> m_closeTop = new Lazy<cesiumlanguagewriter.BooleanCesiumWriter>(new Func1<cesiumlanguagewriter.BooleanCesiumWriter>() {
        public cesiumlanguagewriter.BooleanCesiumWriter invoke() {
            return new BooleanCesiumWriter(CloseTopPropertyName);
        }
    }, false);
    private Lazy<BooleanCesiumWriter> m_closeBottom = new Lazy<cesiumlanguagewriter.BooleanCesiumWriter>(new Func1<cesiumlanguagewriter.BooleanCesiumWriter>() {
        public cesiumlanguagewriter.BooleanCesiumWriter invoke() {
            return new BooleanCesiumWriter(CloseBottomPropertyName);
        }
    }, false);
    private Lazy<ShadowModeCesiumWriter> m_shadows = new Lazy<cesiumlanguagewriter.ShadowModeCesiumWriter>(new Func1<cesiumlanguagewriter.ShadowModeCesiumWriter>() {
        public cesiumlanguagewriter.ShadowModeCesiumWriter invoke() {
            return new ShadowModeCesiumWriter(ShadowsPropertyName);
        }
    }, false);
    private Lazy<DistanceDisplayConditionCesiumWriter> m_distanceDisplayCondition = new Lazy<cesiumlanguagewriter.DistanceDisplayConditionCesiumWriter>(
            new Func1<cesiumlanguagewriter.DistanceDisplayConditionCesiumWriter>() {
                public cesiumlanguagewriter.DistanceDisplayConditionCesiumWriter invoke() {
                    return new DistanceDisplayConditionCesiumWriter(DistanceDisplayConditionPropertyName);
                }
            }, false);

    /**
    *  
    Initializes a new instance.
    
    

    * @param propertyName The name of the property.
    */
    public PolygonCesiumWriter(@Nonnull String propertyName) {
        super(propertyName);
    }

    /**
    *  
    Initializes a new instance as a copy of an existing instance.
    
    

    * @param existingInstance The existing instance to copy.
    */
    protected PolygonCesiumWriter(@Nonnull PolygonCesiumWriter existingInstance) {
        super(existingInstance);
    }

    /**
    *  
    
    Copies this instance and returns the copy.
    
    

    * @return The copy.
    */
    @Override
    public PolygonCesiumWriter clone() {
        return new PolygonCesiumWriter(this);
    }

    /**
    *  Gets the writer for the {@code show} property.  The returned instance must be opened by calling the {@link CesiumElementWriter#open} method before it can be used for writing.  The {@code show} property defines whether or not the polygon is shown.  If not specified, the default value is {@code true}.
    

    */
    @Nonnull
    public final BooleanCesiumWriter getShowWriter() {
        return m_show.getValue();
    }

    /**
    *  
    Opens and returns the writer for the {@code show} property.  The {@code show} property defines whether or not the polygon is shown.  If not specified, the default value is {@code true}.
    

    */
    @Nonnull
    public final BooleanCesiumWriter openShowProperty() {
        openIntervalIfNecessary();
        return this.<BooleanCesiumWriter> openAndReturn(getShowWriter());
    }

    /**
    *  
    Writes a value for the {@code show} property as a {@code boolean} value.  The {@code show} property specifies whether or not the polygon is shown.  If not specified, the default value is {@code true}.
    
    

    * @param value The value.
    */
    public final void writeShowProperty(boolean value) {
        {
            cesiumlanguagewriter.BooleanCesiumWriter writer = openShowProperty();
            try {
                writer.writeBoolean(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code show} property as a {@code reference} value.  The {@code show} property specifies whether or not the polygon is shown.  If not specified, the default value is {@code true}.
    
    

    * @param value The reference.
    */
    public final void writeShowPropertyReference(Reference value) {
        {
            cesiumlanguagewriter.BooleanCesiumWriter writer = openShowProperty();
            try {
                writer.writeReference(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code show} property as a {@code reference} value.  The {@code show} property specifies whether or not the polygon is shown.  If not specified, the default value is {@code true}.
    
    

    * @param value The earliest date of the interval.
    */
    public final void writeShowPropertyReference(String value) {
        {
            cesiumlanguagewriter.BooleanCesiumWriter writer = openShowProperty();
            try {
                writer.writeReference(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code show} property as a {@code reference} value.  The {@code show} property specifies whether or not the polygon is shown.  If not specified, the default value is {@code true}.
    
    
    

    * @param identifier The identifier of the object which contains the referenced property.
    * @param propertyName The property on the referenced object.
    */
    public final void writeShowPropertyReference(String identifier, String propertyName) {
        {
            cesiumlanguagewriter.BooleanCesiumWriter writer = openShowProperty();
            try {
                writer.writeReference(identifier, propertyName);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code show} property as a {@code reference} value.  The {@code show} property specifies whether or not the polygon is shown.  If not specified, the default value is {@code true}.
    
    
    

    * @param identifier The identifier of the object which contains the referenced property.
    * @param propertyNames The hierarchy of properties to be indexed on the referenced object.
    */
    public final void writeShowPropertyReference(String identifier, String[] propertyNames) {
        {
            cesiumlanguagewriter.BooleanCesiumWriter writer = openShowProperty();
            try {
                writer.writeReference(identifier, propertyNames);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  Gets the writer for the {@code positions} property.  The returned instance must be opened by calling the {@link CesiumElementWriter#open} method before it can be used for writing.  The {@code positions} property defines the array of positions defining a simple polygon.
    

    */
    @Nonnull
    public final PositionListCesiumWriter getPositionsWriter() {
        return m_positions.getValue();
    }

    /**
    *  
    Opens and returns the writer for the {@code positions} property.  The {@code positions} property defines the array of positions defining a simple polygon.
    

    */
    @Nonnull
    public final PositionListCesiumWriter openPositionsProperty() {
        openIntervalIfNecessary();
        return this.<PositionListCesiumWriter> openAndReturn(getPositionsWriter());
    }

    /**
    *  
    Writes a value for the {@code positions} property as a {@code cartesian} value.  The {@code positions} property specifies the array of positions defining a simple polygon.
    
    

    * @param values The values.
    */
    public final void writePositionsProperty(Iterable<Cartesian> values) {
        {
            cesiumlanguagewriter.PositionListCesiumWriter writer = openPositionsProperty();
            try {
                writer.writeCartesian(values);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code positions} property as a {@code cartographicRadians} value.  The {@code positions} property specifies the array of positions defining a simple polygon.
    
    

    * @param values The values.
    */
    public final void writePositionsPropertyCartographicRadians(Iterable<Cartographic> values) {
        {
            cesiumlanguagewriter.PositionListCesiumWriter writer = openPositionsProperty();
            try {
                writer.writeCartographicRadians(values);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code positions} property as a {@code cartographicDegrees} value.  The {@code positions} property specifies the array of positions defining a simple polygon.
    
    

    * @param values The values.
    */
    public final void writePositionsPropertyCartographicDegrees(Iterable<Cartographic> values) {
        {
            cesiumlanguagewriter.PositionListCesiumWriter writer = openPositionsProperty();
            try {
                writer.writeCartographicDegrees(values);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code positions} property as a {@code references} value.  The {@code positions} property specifies the array of positions defining a simple polygon.
    
    

    * @param references The list of references.
    */
    public final void writePositionsPropertyReferences(Iterable<Reference> references) {
        {
            cesiumlanguagewriter.PositionListCesiumWriter writer = openPositionsProperty();
            try {
                writer.writeReferences(references);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  Gets the writer for the {@code height} property.  The returned instance must be opened by calling the {@link CesiumElementWriter#open} method before it can be used for writing.  The {@code height} property defines the height of the polygon when {@code perPositionHeight} is false.
    

    */
    @Nonnull
    public final DoubleCesiumWriter getHeightWriter() {
        return m_height.getValue();
    }

    /**
    *  
    Opens and returns the writer for the {@code height} property.  The {@code height} property defines the height of the polygon when {@code perPositionHeight} is false.
    

    */
    @Nonnull
    public final DoubleCesiumWriter openHeightProperty() {
        openIntervalIfNecessary();
        return this.<DoubleCesiumWriter> openAndReturn(getHeightWriter());
    }

    /**
    *  
    Writes a value for the {@code height} property as a {@code number} value.  The {@code height} property specifies the height of the polygon when {@code perPositionHeight} is false.
    
    

    * @param value The value.
    */
    public final void writeHeightProperty(double value) {
        {
            cesiumlanguagewriter.DoubleCesiumWriter writer = openHeightProperty();
            try {
                writer.writeNumber(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code height} property as a {@code number} value.  The {@code height} property specifies the height of the polygon when {@code perPositionHeight} is false.
    
    
    

    * @param dates The dates at which the value is specified.
    * @param values The values corresponding to each date.
    */
    public final void writeHeightProperty(List<JulianDate> dates, List<Double> values) {
        {
            cesiumlanguagewriter.DoubleCesiumWriter writer = openHeightProperty();
            try {
                writer.writeNumber(dates, values);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code height} property as a {@code number} value.  The {@code height} property specifies the height of the polygon when {@code perPositionHeight} is false.
    
    
    
    
    

    * @param dates The dates at which the value is specified.
    * @param values The value corresponding to each date.
    * @param startIndex The index of the first element to write.
    * @param length The number of elements to write.
    */
    public final void writeHeightProperty(List<JulianDate> dates, List<Double> values, int startIndex, int length) {
        {
            cesiumlanguagewriter.DoubleCesiumWriter writer = openHeightProperty();
            try {
                writer.writeNumber(dates, values, startIndex, length);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code height} property as a {@code reference} value.  The {@code height} property specifies the height of the polygon when {@code perPositionHeight} is false.
    
    

    * @param value The reference.
    */
    public final void writeHeightPropertyReference(Reference value) {
        {
            cesiumlanguagewriter.DoubleCesiumWriter writer = openHeightProperty();
            try {
                writer.writeReference(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code height} property as a {@code reference} value.  The {@code height} property specifies the height of the polygon when {@code perPositionHeight} is false.
    
    

    * @param value The earliest date of the interval.
    */
    public final void writeHeightPropertyReference(String value) {
        {
            cesiumlanguagewriter.DoubleCesiumWriter writer = openHeightProperty();
            try {
                writer.writeReference(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code height} property as a {@code reference} value.  The {@code height} property specifies the height of the polygon when {@code perPositionHeight} is false.
    
    
    

    * @param identifier The identifier of the object which contains the referenced property.
    * @param propertyName The property on the referenced object.
    */
    public final void writeHeightPropertyReference(String identifier, String propertyName) {
        {
            cesiumlanguagewriter.DoubleCesiumWriter writer = openHeightProperty();
            try {
                writer.writeReference(identifier, propertyName);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code height} property as a {@code reference} value.  The {@code height} property specifies the height of the polygon when {@code perPositionHeight} is false.
    
    
    

    * @param identifier The identifier of the object which contains the referenced property.
    * @param propertyNames The hierarchy of properties to be indexed on the referenced object.
    */
    public final void writeHeightPropertyReference(String identifier, String[] propertyNames) {
        {
            cesiumlanguagewriter.DoubleCesiumWriter writer = openHeightProperty();
            try {
                writer.writeReference(identifier, propertyNames);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  Gets the writer for the {@code extrudedHeight} property.  The returned instance must be opened by calling the {@link CesiumElementWriter#open} method before it can be used for writing.  The {@code extrudedHeight} property defines the extruded height of the polygon.
    

    */
    @Nonnull
    public final DoubleCesiumWriter getExtrudedHeightWriter() {
        return m_extrudedHeight.getValue();
    }

    /**
    *  
    Opens and returns the writer for the {@code extrudedHeight} property.  The {@code extrudedHeight} property defines the extruded height of the polygon.
    

    */
    @Nonnull
    public final DoubleCesiumWriter openExtrudedHeightProperty() {
        openIntervalIfNecessary();
        return this.<DoubleCesiumWriter> openAndReturn(getExtrudedHeightWriter());
    }

    /**
    *  
    Writes a value for the {@code extrudedHeight} property as a {@code number} value.  The {@code extrudedHeight} property specifies the extruded height of the polygon.
    
    

    * @param value The value.
    */
    public final void writeExtrudedHeightProperty(double value) {
        {
            cesiumlanguagewriter.DoubleCesiumWriter writer = openExtrudedHeightProperty();
            try {
                writer.writeNumber(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code extrudedHeight} property as a {@code number} value.  The {@code extrudedHeight} property specifies the extruded height of the polygon.
    
    
    

    * @param dates The dates at which the value is specified.
    * @param values The values corresponding to each date.
    */
    public final void writeExtrudedHeightProperty(List<JulianDate> dates, List<Double> values) {
        {
            cesiumlanguagewriter.DoubleCesiumWriter writer = openExtrudedHeightProperty();
            try {
                writer.writeNumber(dates, values);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code extrudedHeight} property as a {@code number} value.  The {@code extrudedHeight} property specifies the extruded height of the polygon.
    
    
    
    
    

    * @param dates The dates at which the value is specified.
    * @param values The value corresponding to each date.
    * @param startIndex The index of the first element to write.
    * @param length The number of elements to write.
    */
    public final void writeExtrudedHeightProperty(List<JulianDate> dates, List<Double> values, int startIndex, int length) {
        {
            cesiumlanguagewriter.DoubleCesiumWriter writer = openExtrudedHeightProperty();
            try {
                writer.writeNumber(dates, values, startIndex, length);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code extrudedHeight} property as a {@code reference} value.  The {@code extrudedHeight} property specifies the extruded height of the polygon.
    
    

    * @param value The reference.
    */
    public final void writeExtrudedHeightPropertyReference(Reference value) {
        {
            cesiumlanguagewriter.DoubleCesiumWriter writer = openExtrudedHeightProperty();
            try {
                writer.writeReference(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code extrudedHeight} property as a {@code reference} value.  The {@code extrudedHeight} property specifies the extruded height of the polygon.
    
    

    * @param value The earliest date of the interval.
    */
    public final void writeExtrudedHeightPropertyReference(String value) {
        {
            cesiumlanguagewriter.DoubleCesiumWriter writer = openExtrudedHeightProperty();
            try {
                writer.writeReference(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code extrudedHeight} property as a {@code reference} value.  The {@code extrudedHeight} property specifies the extruded height of the polygon.
    
    
    

    * @param identifier The identifier of the object which contains the referenced property.
    * @param propertyName The property on the referenced object.
    */
    public final void writeExtrudedHeightPropertyReference(String identifier, String propertyName) {
        {
            cesiumlanguagewriter.DoubleCesiumWriter writer = openExtrudedHeightProperty();
            try {
                writer.writeReference(identifier, propertyName);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code extrudedHeight} property as a {@code reference} value.  The {@code extrudedHeight} property specifies the extruded height of the polygon.
    
    
    

    * @param identifier The identifier of the object which contains the referenced property.
    * @param propertyNames The hierarchy of properties to be indexed on the referenced object.
    */
    public final void writeExtrudedHeightPropertyReference(String identifier, String[] propertyNames) {
        {
            cesiumlanguagewriter.DoubleCesiumWriter writer = openExtrudedHeightProperty();
            try {
                writer.writeReference(identifier, propertyNames);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  Gets the writer for the {@code stRotation} property.  The returned instance must be opened by calling the {@link CesiumElementWriter#open} method before it can be used for writing.  The {@code stRotation} property defines the rotation of any applied texture. A positive rotation is counter-clockwise.
    

    */
    @Nonnull
    public final DoubleCesiumWriter getStRotationWriter() {
        return m_stRotation.getValue();
    }

    /**
    *  
    Opens and returns the writer for the {@code stRotation} property.  The {@code stRotation} property defines the rotation of any applied texture. A positive rotation is counter-clockwise.
    

    */
    @Nonnull
    public final DoubleCesiumWriter openStRotationProperty() {
        openIntervalIfNecessary();
        return this.<DoubleCesiumWriter> openAndReturn(getStRotationWriter());
    }

    /**
    *  
    Writes a value for the {@code stRotation} property as a {@code number} value.  The {@code stRotation} property specifies the rotation of any applied texture. A positive rotation is counter-clockwise.
    
    

    * @param value The value.
    */
    public final void writeStRotationProperty(double value) {
        {
            cesiumlanguagewriter.DoubleCesiumWriter writer = openStRotationProperty();
            try {
                writer.writeNumber(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code stRotation} property as a {@code number} value.  The {@code stRotation} property specifies the rotation of any applied texture. A positive rotation is counter-clockwise.
    
    
    

    * @param dates The dates at which the value is specified.
    * @param values The values corresponding to each date.
    */
    public final void writeStRotationProperty(List<JulianDate> dates, List<Double> values) {
        {
            cesiumlanguagewriter.DoubleCesiumWriter writer = openStRotationProperty();
            try {
                writer.writeNumber(dates, values);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code stRotation} property as a {@code number} value.  The {@code stRotation} property specifies the rotation of any applied texture. A positive rotation is counter-clockwise.
    
    
    
    
    

    * @param dates The dates at which the value is specified.
    * @param values The value corresponding to each date.
    * @param startIndex The index of the first element to write.
    * @param length The number of elements to write.
    */
    public final void writeStRotationProperty(List<JulianDate> dates, List<Double> values, int startIndex, int length) {
        {
            cesiumlanguagewriter.DoubleCesiumWriter writer = openStRotationProperty();
            try {
                writer.writeNumber(dates, values, startIndex, length);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code stRotation} property as a {@code reference} value.  The {@code stRotation} property specifies the rotation of any applied texture. A positive rotation is counter-clockwise.
    
    

    * @param value The reference.
    */
    public final void writeStRotationPropertyReference(Reference value) {
        {
            cesiumlanguagewriter.DoubleCesiumWriter writer = openStRotationProperty();
            try {
                writer.writeReference(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code stRotation} property as a {@code reference} value.  The {@code stRotation} property specifies the rotation of any applied texture. A positive rotation is counter-clockwise.
    
    

    * @param value The earliest date of the interval.
    */
    public final void writeStRotationPropertyReference(String value) {
        {
            cesiumlanguagewriter.DoubleCesiumWriter writer = openStRotationProperty();
            try {
                writer.writeReference(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code stRotation} property as a {@code reference} value.  The {@code stRotation} property specifies the rotation of any applied texture. A positive rotation is counter-clockwise.
    
    
    

    * @param identifier The identifier of the object which contains the referenced property.
    * @param propertyName The property on the referenced object.
    */
    public final void writeStRotationPropertyReference(String identifier, String propertyName) {
        {
            cesiumlanguagewriter.DoubleCesiumWriter writer = openStRotationProperty();
            try {
                writer.writeReference(identifier, propertyName);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code stRotation} property as a {@code reference} value.  The {@code stRotation} property specifies the rotation of any applied texture. A positive rotation is counter-clockwise.
    
    
    

    * @param identifier The identifier of the object which contains the referenced property.
    * @param propertyNames The hierarchy of properties to be indexed on the referenced object.
    */
    public final void writeStRotationPropertyReference(String identifier, String[] propertyNames) {
        {
            cesiumlanguagewriter.DoubleCesiumWriter writer = openStRotationProperty();
            try {
                writer.writeReference(identifier, propertyNames);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  Gets the writer for the {@code granularity} property.  The returned instance must be opened by calling the {@link CesiumElementWriter#open} method before it can be used for writing.  The {@code granularity} property defines the sampling distance, in radians.
    

    */
    @Nonnull
    public final DoubleCesiumWriter getGranularityWriter() {
        return m_granularity.getValue();
    }

    /**
    *  
    Opens and returns the writer for the {@code granularity} property.  The {@code granularity} property defines the sampling distance, in radians.
    

    */
    @Nonnull
    public final DoubleCesiumWriter openGranularityProperty() {
        openIntervalIfNecessary();
        return this.<DoubleCesiumWriter> openAndReturn(getGranularityWriter());
    }

    /**
    *  
    Writes a value for the {@code granularity} property as a {@code number} value.  The {@code granularity} property specifies the sampling distance, in radians.
    
    

    * @param value The value.
    */
    public final void writeGranularityProperty(double value) {
        {
            cesiumlanguagewriter.DoubleCesiumWriter writer = openGranularityProperty();
            try {
                writer.writeNumber(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code granularity} property as a {@code number} value.  The {@code granularity} property specifies the sampling distance, in radians.
    
    
    

    * @param dates The dates at which the value is specified.
    * @param values The values corresponding to each date.
    */
    public final void writeGranularityProperty(List<JulianDate> dates, List<Double> values) {
        {
            cesiumlanguagewriter.DoubleCesiumWriter writer = openGranularityProperty();
            try {
                writer.writeNumber(dates, values);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code granularity} property as a {@code number} value.  The {@code granularity} property specifies the sampling distance, in radians.
    
    
    
    
    

    * @param dates The dates at which the value is specified.
    * @param values The value corresponding to each date.
    * @param startIndex The index of the first element to write.
    * @param length The number of elements to write.
    */
    public final void writeGranularityProperty(List<JulianDate> dates, List<Double> values, int startIndex, int length) {
        {
            cesiumlanguagewriter.DoubleCesiumWriter writer = openGranularityProperty();
            try {
                writer.writeNumber(dates, values, startIndex, length);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code granularity} property as a {@code reference} value.  The {@code granularity} property specifies the sampling distance, in radians.
    
    

    * @param value The reference.
    */
    public final void writeGranularityPropertyReference(Reference value) {
        {
            cesiumlanguagewriter.DoubleCesiumWriter writer = openGranularityProperty();
            try {
                writer.writeReference(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code granularity} property as a {@code reference} value.  The {@code granularity} property specifies the sampling distance, in radians.
    
    

    * @param value The earliest date of the interval.
    */
    public final void writeGranularityPropertyReference(String value) {
        {
            cesiumlanguagewriter.DoubleCesiumWriter writer = openGranularityProperty();
            try {
                writer.writeReference(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code granularity} property as a {@code reference} value.  The {@code granularity} property specifies the sampling distance, in radians.
    
    
    

    * @param identifier The identifier of the object which contains the referenced property.
    * @param propertyName The property on the referenced object.
    */
    public final void writeGranularityPropertyReference(String identifier, String propertyName) {
        {
            cesiumlanguagewriter.DoubleCesiumWriter writer = openGranularityProperty();
            try {
                writer.writeReference(identifier, propertyName);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code granularity} property as a {@code reference} value.  The {@code granularity} property specifies the sampling distance, in radians.
    
    
    

    * @param identifier The identifier of the object which contains the referenced property.
    * @param propertyNames The hierarchy of properties to be indexed on the referenced object.
    */
    public final void writeGranularityPropertyReference(String identifier, String[] propertyNames) {
        {
            cesiumlanguagewriter.DoubleCesiumWriter writer = openGranularityProperty();
            try {
                writer.writeReference(identifier, propertyNames);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  Gets the writer for the {@code fill} property.  The returned instance must be opened by calling the {@link CesiumElementWriter#open} method before it can be used for writing.  The {@code fill} property defines whether or not the polygon is filled.  If not specified, the default value is {@code true}.
    

    */
    @Nonnull
    public final BooleanCesiumWriter getFillWriter() {
        return m_fill.getValue();
    }

    /**
    *  
    Opens and returns the writer for the {@code fill} property.  The {@code fill} property defines whether or not the polygon is filled.  If not specified, the default value is {@code true}.
    

    */
    @Nonnull
    public final BooleanCesiumWriter openFillProperty() {
        openIntervalIfNecessary();
        return this.<BooleanCesiumWriter> openAndReturn(getFillWriter());
    }

    /**
    *  
    Writes a value for the {@code fill} property as a {@code boolean} value.  The {@code fill} property specifies whether or not the polygon is filled.  If not specified, the default value is {@code true}.
    
    

    * @param value The value.
    */
    public final void writeFillProperty(boolean value) {
        {
            cesiumlanguagewriter.BooleanCesiumWriter writer = openFillProperty();
            try {
                writer.writeBoolean(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code fill} property as a {@code reference} value.  The {@code fill} property specifies whether or not the polygon is filled.  If not specified, the default value is {@code true}.
    
    

    * @param value The reference.
    */
    public final void writeFillPropertyReference(Reference value) {
        {
            cesiumlanguagewriter.BooleanCesiumWriter writer = openFillProperty();
            try {
                writer.writeReference(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code fill} property as a {@code reference} value.  The {@code fill} property specifies whether or not the polygon is filled.  If not specified, the default value is {@code true}.
    
    

    * @param value The earliest date of the interval.
    */
    public final void writeFillPropertyReference(String value) {
        {
            cesiumlanguagewriter.BooleanCesiumWriter writer = openFillProperty();
            try {
                writer.writeReference(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code fill} property as a {@code reference} value.  The {@code fill} property specifies whether or not the polygon is filled.  If not specified, the default value is {@code true}.
    
    
    

    * @param identifier The identifier of the object which contains the referenced property.
    * @param propertyName The property on the referenced object.
    */
    public final void writeFillPropertyReference(String identifier, String propertyName) {
        {
            cesiumlanguagewriter.BooleanCesiumWriter writer = openFillProperty();
            try {
                writer.writeReference(identifier, propertyName);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code fill} property as a {@code reference} value.  The {@code fill} property specifies whether or not the polygon is filled.  If not specified, the default value is {@code true}.
    
    
    

    * @param identifier The identifier of the object which contains the referenced property.
    * @param propertyNames The hierarchy of properties to be indexed on the referenced object.
    */
    public final void writeFillPropertyReference(String identifier, String[] propertyNames) {
        {
            cesiumlanguagewriter.BooleanCesiumWriter writer = openFillProperty();
            try {
                writer.writeReference(identifier, propertyNames);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  Gets the writer for the {@code material} property.  The returned instance must be opened by calling the {@link CesiumElementWriter#open} method before it can be used for writing.  The {@code material} property defines the material to use to fill the polygon.
    

    */
    @Nonnull
    public final MaterialCesiumWriter getMaterialWriter() {
        return m_material.getValue();
    }

    /**
    *  
    Opens and returns the writer for the {@code material} property.  The {@code material} property defines the material to use to fill the polygon.
    

    */
    @Nonnull
    public final MaterialCesiumWriter openMaterialProperty() {
        openIntervalIfNecessary();
        return this.<MaterialCesiumWriter> openAndReturn(getMaterialWriter());
    }

    /**
    *  Gets the writer for the {@code outline} property.  The returned instance must be opened by calling the {@link CesiumElementWriter#open} method before it can be used for writing.  The {@code outline} property defines whether or not the polygon is outlined.  If not specified, the default value is {@code false}.
    

    */
    @Nonnull
    public final BooleanCesiumWriter getOutlineWriter() {
        return m_outline.getValue();
    }

    /**
    *  
    Opens and returns the writer for the {@code outline} property.  The {@code outline} property defines whether or not the polygon is outlined.  If not specified, the default value is {@code false}.
    

    */
    @Nonnull
    public final BooleanCesiumWriter openOutlineProperty() {
        openIntervalIfNecessary();
        return this.<BooleanCesiumWriter> openAndReturn(getOutlineWriter());
    }

    /**
    *  
    Writes a value for the {@code outline} property as a {@code boolean} value.  The {@code outline} property specifies whether or not the polygon is outlined.  If not specified, the default value is {@code false}.
    
    

    * @param value The value.
    */
    public final void writeOutlineProperty(boolean value) {
        {
            cesiumlanguagewriter.BooleanCesiumWriter writer = openOutlineProperty();
            try {
                writer.writeBoolean(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code outline} property as a {@code reference} value.  The {@code outline} property specifies whether or not the polygon is outlined.  If not specified, the default value is {@code false}.
    
    

    * @param value The reference.
    */
    public final void writeOutlinePropertyReference(Reference value) {
        {
            cesiumlanguagewriter.BooleanCesiumWriter writer = openOutlineProperty();
            try {
                writer.writeReference(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code outline} property as a {@code reference} value.  The {@code outline} property specifies whether or not the polygon is outlined.  If not specified, the default value is {@code false}.
    
    

    * @param value The earliest date of the interval.
    */
    public final void writeOutlinePropertyReference(String value) {
        {
            cesiumlanguagewriter.BooleanCesiumWriter writer = openOutlineProperty();
            try {
                writer.writeReference(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code outline} property as a {@code reference} value.  The {@code outline} property specifies whether or not the polygon is outlined.  If not specified, the default value is {@code false}.
    
    
    

    * @param identifier The identifier of the object which contains the referenced property.
    * @param propertyName The property on the referenced object.
    */
    public final void writeOutlinePropertyReference(String identifier, String propertyName) {
        {
            cesiumlanguagewriter.BooleanCesiumWriter writer = openOutlineProperty();
            try {
                writer.writeReference(identifier, propertyName);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code outline} property as a {@code reference} value.  The {@code outline} property specifies whether or not the polygon is outlined.  If not specified, the default value is {@code false}.
    
    
    

    * @param identifier The identifier of the object which contains the referenced property.
    * @param propertyNames The hierarchy of properties to be indexed on the referenced object.
    */
    public final void writeOutlinePropertyReference(String identifier, String[] propertyNames) {
        {
            cesiumlanguagewriter.BooleanCesiumWriter writer = openOutlineProperty();
            try {
                writer.writeReference(identifier, propertyNames);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  Gets the writer for the {@code outlineColor} property.  The returned instance must be opened by calling the {@link CesiumElementWriter#open} method before it can be used for writing.  The {@code outlineColor} property defines the color of the polygon outline.
    

    */
    @Nonnull
    public final ColorCesiumWriter getOutlineColorWriter() {
        return m_outlineColor.getValue();
    }

    /**
    *  
    Opens and returns the writer for the {@code outlineColor} property.  The {@code outlineColor} property defines the color of the polygon outline.
    

    */
    @Nonnull
    public final ColorCesiumWriter openOutlineColorProperty() {
        openIntervalIfNecessary();
        return this.<ColorCesiumWriter> openAndReturn(getOutlineColorWriter());
    }

    /**
    *  
    Writes a value for the {@code outlineColor} property as a {@code rgba} value.  The {@code outlineColor} property specifies the color of the polygon outline.
    
    

    * @param color The color.
    */
    public final void writeOutlineColorProperty(@Nonnull Color color) {
        {
            cesiumlanguagewriter.ColorCesiumWriter writer = openOutlineColorProperty();
            try {
                writer.writeRgba(color);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code outlineColor} property as a {@code rgba} value.  The {@code outlineColor} property specifies the color of the polygon outline.
    
    
    
    
    

    * @param red The red component in the range 0 to 255.
    * @param green The green component in the range 0 to 255.
    * @param blue The blue component in the range 0 to 255.
    * @param alpha The alpha component in the range 0 to 255.
    */
    public final void writeOutlineColorProperty(int red, int green, int blue, int alpha) {
        {
            cesiumlanguagewriter.ColorCesiumWriter writer = openOutlineColorProperty();
            try {
                writer.writeRgba(red, green, blue, alpha);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code outlineColor} property as a {@code rgba} value.  The {@code outlineColor} property specifies the color of the polygon outline.
    
    
    

    * @param dates The dates at which the value is specified.
    * @param values The values corresponding to each date.
    */
    public final void writeOutlineColorProperty(List<JulianDate> dates, List<Color> values) {
        {
            cesiumlanguagewriter.ColorCesiumWriter writer = openOutlineColorProperty();
            try {
                writer.writeRgba(dates, values);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code outlineColor} property as a {@code rgba} value.  The {@code outlineColor} property specifies the color of the polygon outline.
    
    
    
    
    

    * @param dates The dates at which the value is specified.
    * @param colors The color corresponding to each date.
    * @param startIndex The index of the first element to write.
    * @param length The number of elements to write.
    */
    public final void writeOutlineColorProperty(List<JulianDate> dates, List<Color> colors, int startIndex, int length) {
        {
            cesiumlanguagewriter.ColorCesiumWriter writer = openOutlineColorProperty();
            try {
                writer.writeRgba(dates, colors, startIndex, length);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code outlineColor} property as a {@code rgbaf} value.  The {@code outlineColor} property specifies the color of the polygon outline.
    
    

    * @param color The color.
    */
    public final void writeOutlineColorPropertyRgbaf(@Nonnull Color color) {
        {
            cesiumlanguagewriter.ColorCesiumWriter writer = openOutlineColorProperty();
            try {
                writer.writeRgbaf(color);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code outlineColor} property as a {@code rgbaf} value.  The {@code outlineColor} property specifies the color of the polygon outline.
    
    
    
    
    

    * @param red The red component in the range 0 to 1.0.
    * @param green The green component in the range 0 to 1.0.
    * @param blue The blue component in the range 0 to 1.0.
    * @param alpha The alpha component in the range 0 to 1.0.
    */
    public final void writeOutlineColorPropertyRgbaf(float red, float green, float blue, float alpha) {
        {
            cesiumlanguagewriter.ColorCesiumWriter writer = openOutlineColorProperty();
            try {
                writer.writeRgbaf(red, green, blue, alpha);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code outlineColor} property as a {@code rgbaf} value.  The {@code outlineColor} property specifies the color of the polygon outline.
    
    
    

    * @param dates The dates at which the value is specified.
    * @param values The values corresponding to each date.
    */
    public final void writeOutlineColorPropertyRgbaf(List<JulianDate> dates, List<Color> values) {
        {
            cesiumlanguagewriter.ColorCesiumWriter writer = openOutlineColorProperty();
            try {
                writer.writeRgbaf(dates, values);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code outlineColor} property as a {@code rgbaf} value.  The {@code outlineColor} property specifies the color of the polygon outline.
    
    
    
    
    

    * @param dates The dates at which the value is specified.
    * @param colors The color corresponding to each date.
    * @param startIndex The index of the first element to write.
    * @param length The number of elements to write.
    */
    public final void writeOutlineColorPropertyRgbaf(List<JulianDate> dates, List<Color> colors, int startIndex, int length) {
        {
            cesiumlanguagewriter.ColorCesiumWriter writer = openOutlineColorProperty();
            try {
                writer.writeRgbaf(dates, colors, startIndex, length);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code outlineColor} property as a {@code reference} value.  The {@code outlineColor} property specifies the color of the polygon outline.
    
    

    * @param value The reference.
    */
    public final void writeOutlineColorPropertyReference(Reference value) {
        {
            cesiumlanguagewriter.ColorCesiumWriter writer = openOutlineColorProperty();
            try {
                writer.writeReference(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code outlineColor} property as a {@code reference} value.  The {@code outlineColor} property specifies the color of the polygon outline.
    
    

    * @param value The earliest date of the interval.
    */
    public final void writeOutlineColorPropertyReference(String value) {
        {
            cesiumlanguagewriter.ColorCesiumWriter writer = openOutlineColorProperty();
            try {
                writer.writeReference(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code outlineColor} property as a {@code reference} value.  The {@code outlineColor} property specifies the color of the polygon outline.
    
    
    

    * @param identifier The identifier of the object which contains the referenced property.
    * @param propertyName The property on the referenced object.
    */
    public final void writeOutlineColorPropertyReference(String identifier, String propertyName) {
        {
            cesiumlanguagewriter.ColorCesiumWriter writer = openOutlineColorProperty();
            try {
                writer.writeReference(identifier, propertyName);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code outlineColor} property as a {@code reference} value.  The {@code outlineColor} property specifies the color of the polygon outline.
    
    
    

    * @param identifier The identifier of the object which contains the referenced property.
    * @param propertyNames The hierarchy of properties to be indexed on the referenced object.
    */
    public final void writeOutlineColorPropertyReference(String identifier, String[] propertyNames) {
        {
            cesiumlanguagewriter.ColorCesiumWriter writer = openOutlineColorProperty();
            try {
                writer.writeReference(identifier, propertyNames);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  Gets the writer for the {@code outlineWidth} property.  The returned instance must be opened by calling the {@link CesiumElementWriter#open} method before it can be used for writing.  The {@code outlineWidth} property defines the width of the polygon outline.  If not specified, the default value is 1.0.
    

    */
    @Nonnull
    public final DoubleCesiumWriter getOutlineWidthWriter() {
        return m_outlineWidth.getValue();
    }

    /**
    *  
    Opens and returns the writer for the {@code outlineWidth} property.  The {@code outlineWidth} property defines the width of the polygon outline.  If not specified, the default value is 1.0.
    

    */
    @Nonnull
    public final DoubleCesiumWriter openOutlineWidthProperty() {
        openIntervalIfNecessary();
        return this.<DoubleCesiumWriter> openAndReturn(getOutlineWidthWriter());
    }

    /**
    *  
    Writes a value for the {@code outlineWidth} property as a {@code number} value.  The {@code outlineWidth} property specifies the width of the polygon outline.  If not specified, the default value is 1.0.
    
    

    * @param value The value.
    */
    public final void writeOutlineWidthProperty(double value) {
        {
            cesiumlanguagewriter.DoubleCesiumWriter writer = openOutlineWidthProperty();
            try {
                writer.writeNumber(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code outlineWidth} property as a {@code number} value.  The {@code outlineWidth} property specifies the width of the polygon outline.  If not specified, the default value is 1.0.
    
    
    

    * @param dates The dates at which the value is specified.
    * @param values The values corresponding to each date.
    */
    public final void writeOutlineWidthProperty(List<JulianDate> dates, List<Double> values) {
        {
            cesiumlanguagewriter.DoubleCesiumWriter writer = openOutlineWidthProperty();
            try {
                writer.writeNumber(dates, values);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code outlineWidth} property as a {@code number} value.  The {@code outlineWidth} property specifies the width of the polygon outline.  If not specified, the default value is 1.0.
    
    
    
    
    

    * @param dates The dates at which the value is specified.
    * @param values The value corresponding to each date.
    * @param startIndex The index of the first element to write.
    * @param length The number of elements to write.
    */
    public final void writeOutlineWidthProperty(List<JulianDate> dates, List<Double> values, int startIndex, int length) {
        {
            cesiumlanguagewriter.DoubleCesiumWriter writer = openOutlineWidthProperty();
            try {
                writer.writeNumber(dates, values, startIndex, length);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code outlineWidth} property as a {@code reference} value.  The {@code outlineWidth} property specifies the width of the polygon outline.  If not specified, the default value is 1.0.
    
    

    * @param value The reference.
    */
    public final void writeOutlineWidthPropertyReference(Reference value) {
        {
            cesiumlanguagewriter.DoubleCesiumWriter writer = openOutlineWidthProperty();
            try {
                writer.writeReference(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code outlineWidth} property as a {@code reference} value.  The {@code outlineWidth} property specifies the width of the polygon outline.  If not specified, the default value is 1.0.
    
    

    * @param value The earliest date of the interval.
    */
    public final void writeOutlineWidthPropertyReference(String value) {
        {
            cesiumlanguagewriter.DoubleCesiumWriter writer = openOutlineWidthProperty();
            try {
                writer.writeReference(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code outlineWidth} property as a {@code reference} value.  The {@code outlineWidth} property specifies the width of the polygon outline.  If not specified, the default value is 1.0.
    
    
    

    * @param identifier The identifier of the object which contains the referenced property.
    * @param propertyName The property on the referenced object.
    */
    public final void writeOutlineWidthPropertyReference(String identifier, String propertyName) {
        {
            cesiumlanguagewriter.DoubleCesiumWriter writer = openOutlineWidthProperty();
            try {
                writer.writeReference(identifier, propertyName);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code outlineWidth} property as a {@code reference} value.  The {@code outlineWidth} property specifies the width of the polygon outline.  If not specified, the default value is 1.0.
    
    
    

    * @param identifier The identifier of the object which contains the referenced property.
    * @param propertyNames The hierarchy of properties to be indexed on the referenced object.
    */
    public final void writeOutlineWidthPropertyReference(String identifier, String[] propertyNames) {
        {
            cesiumlanguagewriter.DoubleCesiumWriter writer = openOutlineWidthProperty();
            try {
                writer.writeReference(identifier, propertyNames);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  Gets the writer for the {@code perPositionHeight} property.  The returned instance must be opened by calling the {@link CesiumElementWriter#open} method before it can be used for writing.  The {@code perPositionHeight} property defines whether to use the height of each position to define the polygon or to use {@code height} as a constant height above the surface.
    

    */
    @Nonnull
    public final BooleanCesiumWriter getPerPositionHeightWriter() {
        return m_perPositionHeight.getValue();
    }

    /**
    *  
    Opens and returns the writer for the {@code perPositionHeight} property.  The {@code perPositionHeight} property defines whether to use the height of each position to define the polygon or to use {@code height} as a constant height above the surface.
    

    */
    @Nonnull
    public final BooleanCesiumWriter openPerPositionHeightProperty() {
        openIntervalIfNecessary();
        return this.<BooleanCesiumWriter> openAndReturn(getPerPositionHeightWriter());
    }

    /**
    *  
    Writes a value for the {@code perPositionHeight} property as a {@code boolean} value.  The {@code perPositionHeight} property specifies whether to use the height of each position to define the polygon or to use {@code height} as a constant height above the surface.
    
    

    * @param value The value.
    */
    public final void writePerPositionHeightProperty(boolean value) {
        {
            cesiumlanguagewriter.BooleanCesiumWriter writer = openPerPositionHeightProperty();
            try {
                writer.writeBoolean(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code perPositionHeight} property as a {@code reference} value.  The {@code perPositionHeight} property specifies whether to use the height of each position to define the polygon or to use {@code height} as a constant height above the surface.
    
    

    * @param value The reference.
    */
    public final void writePerPositionHeightPropertyReference(Reference value) {
        {
            cesiumlanguagewriter.BooleanCesiumWriter writer = openPerPositionHeightProperty();
            try {
                writer.writeReference(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code perPositionHeight} property as a {@code reference} value.  The {@code perPositionHeight} property specifies whether to use the height of each position to define the polygon or to use {@code height} as a constant height above the surface.
    
    

    * @param value The earliest date of the interval.
    */
    public final void writePerPositionHeightPropertyReference(String value) {
        {
            cesiumlanguagewriter.BooleanCesiumWriter writer = openPerPositionHeightProperty();
            try {
                writer.writeReference(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code perPositionHeight} property as a {@code reference} value.  The {@code perPositionHeight} property specifies whether to use the height of each position to define the polygon or to use {@code height} as a constant height above the surface.
    
    
    

    * @param identifier The identifier of the object which contains the referenced property.
    * @param propertyName The property on the referenced object.
    */
    public final void writePerPositionHeightPropertyReference(String identifier, String propertyName) {
        {
            cesiumlanguagewriter.BooleanCesiumWriter writer = openPerPositionHeightProperty();
            try {
                writer.writeReference(identifier, propertyName);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code perPositionHeight} property as a {@code reference} value.  The {@code perPositionHeight} property specifies whether to use the height of each position to define the polygon or to use {@code height} as a constant height above the surface.
    
    
    

    * @param identifier The identifier of the object which contains the referenced property.
    * @param propertyNames The hierarchy of properties to be indexed on the referenced object.
    */
    public final void writePerPositionHeightPropertyReference(String identifier, String[] propertyNames) {
        {
            cesiumlanguagewriter.BooleanCesiumWriter writer = openPerPositionHeightProperty();
            try {
                writer.writeReference(identifier, propertyNames);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  Gets the writer for the {@code closeTop} property.  The returned instance must be opened by calling the {@link CesiumElementWriter#open} method before it can be used for writing.  The {@code closeTop} property defines whether to close the top of the polygon.  If not specified, the default value is {@code true}.
    

    */
    @Nonnull
    public final BooleanCesiumWriter getCloseTopWriter() {
        return m_closeTop.getValue();
    }

    /**
    *  
    Opens and returns the writer for the {@code closeTop} property.  The {@code closeTop} property defines whether to close the top of the polygon.  If not specified, the default value is {@code true}.
    

    */
    @Nonnull
    public final BooleanCesiumWriter openCloseTopProperty() {
        openIntervalIfNecessary();
        return this.<BooleanCesiumWriter> openAndReturn(getCloseTopWriter());
    }

    /**
    *  
    Writes a value for the {@code closeTop} property as a {@code boolean} value.  The {@code closeTop} property specifies whether to close the top of the polygon.  If not specified, the default value is {@code true}.
    
    

    * @param value The value.
    */
    public final void writeCloseTopProperty(boolean value) {
        {
            cesiumlanguagewriter.BooleanCesiumWriter writer = openCloseTopProperty();
            try {
                writer.writeBoolean(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code closeTop} property as a {@code reference} value.  The {@code closeTop} property specifies whether to close the top of the polygon.  If not specified, the default value is {@code true}.
    
    

    * @param value The reference.
    */
    public final void writeCloseTopPropertyReference(Reference value) {
        {
            cesiumlanguagewriter.BooleanCesiumWriter writer = openCloseTopProperty();
            try {
                writer.writeReference(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code closeTop} property as a {@code reference} value.  The {@code closeTop} property specifies whether to close the top of the polygon.  If not specified, the default value is {@code true}.
    
    

    * @param value The earliest date of the interval.
    */
    public final void writeCloseTopPropertyReference(String value) {
        {
            cesiumlanguagewriter.BooleanCesiumWriter writer = openCloseTopProperty();
            try {
                writer.writeReference(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code closeTop} property as a {@code reference} value.  The {@code closeTop} property specifies whether to close the top of the polygon.  If not specified, the default value is {@code true}.
    
    
    

    * @param identifier The identifier of the object which contains the referenced property.
    * @param propertyName The property on the referenced object.
    */
    public final void writeCloseTopPropertyReference(String identifier, String propertyName) {
        {
            cesiumlanguagewriter.BooleanCesiumWriter writer = openCloseTopProperty();
            try {
                writer.writeReference(identifier, propertyName);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code closeTop} property as a {@code reference} value.  The {@code closeTop} property specifies whether to close the top of the polygon.  If not specified, the default value is {@code true}.
    
    
    

    * @param identifier The identifier of the object which contains the referenced property.
    * @param propertyNames The hierarchy of properties to be indexed on the referenced object.
    */
    public final void writeCloseTopPropertyReference(String identifier, String[] propertyNames) {
        {
            cesiumlanguagewriter.BooleanCesiumWriter writer = openCloseTopProperty();
            try {
                writer.writeReference(identifier, propertyNames);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  Gets the writer for the {@code closeBottom} property.  The returned instance must be opened by calling the {@link CesiumElementWriter#open} method before it can be used for writing.  The {@code closeBottom} property defines whether to close the bottom of the polygon.  If not specified, the default value is {@code true}.
    

    */
    @Nonnull
    public final BooleanCesiumWriter getCloseBottomWriter() {
        return m_closeBottom.getValue();
    }

    /**
    *  
    Opens and returns the writer for the {@code closeBottom} property.  The {@code closeBottom} property defines whether to close the bottom of the polygon.  If not specified, the default value is {@code true}.
    

    */
    @Nonnull
    public final BooleanCesiumWriter openCloseBottomProperty() {
        openIntervalIfNecessary();
        return this.<BooleanCesiumWriter> openAndReturn(getCloseBottomWriter());
    }

    /**
    *  
    Writes a value for the {@code closeBottom} property as a {@code boolean} value.  The {@code closeBottom} property specifies whether to close the bottom of the polygon.  If not specified, the default value is {@code true}.
    
    

    * @param value The value.
    */
    public final void writeCloseBottomProperty(boolean value) {
        {
            cesiumlanguagewriter.BooleanCesiumWriter writer = openCloseBottomProperty();
            try {
                writer.writeBoolean(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code closeBottom} property as a {@code reference} value.  The {@code closeBottom} property specifies whether to close the bottom of the polygon.  If not specified, the default value is {@code true}.
    
    

    * @param value The reference.
    */
    public final void writeCloseBottomPropertyReference(Reference value) {
        {
            cesiumlanguagewriter.BooleanCesiumWriter writer = openCloseBottomProperty();
            try {
                writer.writeReference(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code closeBottom} property as a {@code reference} value.  The {@code closeBottom} property specifies whether to close the bottom of the polygon.  If not specified, the default value is {@code true}.
    
    

    * @param value The earliest date of the interval.
    */
    public final void writeCloseBottomPropertyReference(String value) {
        {
            cesiumlanguagewriter.BooleanCesiumWriter writer = openCloseBottomProperty();
            try {
                writer.writeReference(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code closeBottom} property as a {@code reference} value.  The {@code closeBottom} property specifies whether to close the bottom of the polygon.  If not specified, the default value is {@code true}.
    
    
    

    * @param identifier The identifier of the object which contains the referenced property.
    * @param propertyName The property on the referenced object.
    */
    public final void writeCloseBottomPropertyReference(String identifier, String propertyName) {
        {
            cesiumlanguagewriter.BooleanCesiumWriter writer = openCloseBottomProperty();
            try {
                writer.writeReference(identifier, propertyName);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code closeBottom} property as a {@code reference} value.  The {@code closeBottom} property specifies whether to close the bottom of the polygon.  If not specified, the default value is {@code true}.
    
    
    

    * @param identifier The identifier of the object which contains the referenced property.
    * @param propertyNames The hierarchy of properties to be indexed on the referenced object.
    */
    public final void writeCloseBottomPropertyReference(String identifier, String[] propertyNames) {
        {
            cesiumlanguagewriter.BooleanCesiumWriter writer = openCloseBottomProperty();
            try {
                writer.writeReference(identifier, propertyNames);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  Gets the writer for the {@code shadows} property.  The returned instance must be opened by calling the {@link CesiumElementWriter#open} method before it can be used for writing.  The {@code shadows} property defines whether or not the polygon casts or receives shadows.  If not specified, the default value is DISABLED.
    

    */
    @Nonnull
    public final ShadowModeCesiumWriter getShadowsWriter() {
        return m_shadows.getValue();
    }

    /**
    *  
    Opens and returns the writer for the {@code shadows} property.  The {@code shadows} property defines whether or not the polygon casts or receives shadows.  If not specified, the default value is DISABLED.
    

    */
    @Nonnull
    public final ShadowModeCesiumWriter openShadowsProperty() {
        openIntervalIfNecessary();
        return this.<ShadowModeCesiumWriter> openAndReturn(getShadowsWriter());
    }

    /**
    *  
    Writes a value for the {@code shadows} property as a {@code shadowMode} value.  The {@code shadows} property specifies whether or not the polygon casts or receives shadows.  If not specified, the default value is DISABLED.
    
    

    * @param value The shadow mode.
    */
    public final void writeShadowsProperty(@Nonnull CesiumShadowMode value) {
        {
            cesiumlanguagewriter.ShadowModeCesiumWriter writer = openShadowsProperty();
            try {
                writer.writeShadowMode(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code shadows} property as a {@code reference} value.  The {@code shadows} property specifies whether or not the polygon casts or receives shadows.  If not specified, the default value is DISABLED.
    
    

    * @param value The reference.
    */
    public final void writeShadowsPropertyReference(Reference value) {
        {
            cesiumlanguagewriter.ShadowModeCesiumWriter writer = openShadowsProperty();
            try {
                writer.writeReference(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code shadows} property as a {@code reference} value.  The {@code shadows} property specifies whether or not the polygon casts or receives shadows.  If not specified, the default value is DISABLED.
    
    

    * @param value The earliest date of the interval.
    */
    public final void writeShadowsPropertyReference(String value) {
        {
            cesiumlanguagewriter.ShadowModeCesiumWriter writer = openShadowsProperty();
            try {
                writer.writeReference(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code shadows} property as a {@code reference} value.  The {@code shadows} property specifies whether or not the polygon casts or receives shadows.  If not specified, the default value is DISABLED.
    
    
    

    * @param identifier The identifier of the object which contains the referenced property.
    * @param propertyName The property on the referenced object.
    */
    public final void writeShadowsPropertyReference(String identifier, String propertyName) {
        {
            cesiumlanguagewriter.ShadowModeCesiumWriter writer = openShadowsProperty();
            try {
                writer.writeReference(identifier, propertyName);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code shadows} property as a {@code reference} value.  The {@code shadows} property specifies whether or not the polygon casts or receives shadows.  If not specified, the default value is DISABLED.
    
    
    

    * @param identifier The identifier of the object which contains the referenced property.
    * @param propertyNames The hierarchy of properties to be indexed on the referenced object.
    */
    public final void writeShadowsPropertyReference(String identifier, String[] propertyNames) {
        {
            cesiumlanguagewriter.ShadowModeCesiumWriter writer = openShadowsProperty();
            try {
                writer.writeReference(identifier, propertyNames);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  Gets the writer for the {@code distanceDisplayCondition} property.  The returned instance must be opened by calling the {@link CesiumElementWriter#open} method before it can be used for writing.  The {@code distanceDisplayCondition} property defines the display condition specifying the distance from the camera at which this polygon will be displayed.
    

    */
    @Nonnull
    public final DistanceDisplayConditionCesiumWriter getDistanceDisplayConditionWriter() {
        return m_distanceDisplayCondition.getValue();
    }

    /**
    *  
    Opens and returns the writer for the {@code distanceDisplayCondition} property.  The {@code distanceDisplayCondition} property defines the display condition specifying the distance from the camera at which this polygon will be displayed.
    

    */
    @Nonnull
    public final DistanceDisplayConditionCesiumWriter openDistanceDisplayConditionProperty() {
        openIntervalIfNecessary();
        return this.<DistanceDisplayConditionCesiumWriter> openAndReturn(getDistanceDisplayConditionWriter());
    }

    /**
    *  
    Writes a value for the {@code distanceDisplayCondition} property as a {@code distanceDisplayCondition} value.  The {@code distanceDisplayCondition} property specifies the display condition specifying the distance from the camera at which this polygon will be displayed.
    
    

    * @param value The value.
    */
    public final void writeDistanceDisplayConditionProperty(@Nonnull Bounds value) {
        {
            cesiumlanguagewriter.DistanceDisplayConditionCesiumWriter writer = openDistanceDisplayConditionProperty();
            try {
                writer.writeDistanceDisplayCondition(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code distanceDisplayCondition} property as a {@code distanceDisplayCondition} value.  The {@code distanceDisplayCondition} property specifies the display condition specifying the distance from the camera at which this polygon will be displayed.
    
    
    

    * @param lowerBound The lower bound.
    * @param upperBound The upper bound.
    */
    public final void writeDistanceDisplayConditionProperty(double lowerBound, double upperBound) {
        {
            cesiumlanguagewriter.DistanceDisplayConditionCesiumWriter writer = openDistanceDisplayConditionProperty();
            try {
                writer.writeDistanceDisplayCondition(lowerBound, upperBound);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code distanceDisplayCondition} property as a {@code distanceDisplayCondition} value.  The {@code distanceDisplayCondition} property specifies the display condition specifying the distance from the camera at which this polygon will be displayed.
    
    
    

    * @param dates The dates at which the value is specified.
    * @param values The values corresponding to each date.
    */
    public final void writeDistanceDisplayConditionProperty(List<JulianDate> dates, List<Bounds> values) {
        {
            cesiumlanguagewriter.DistanceDisplayConditionCesiumWriter writer = openDistanceDisplayConditionProperty();
            try {
                writer.writeDistanceDisplayCondition(dates, values);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code distanceDisplayCondition} property as a {@code distanceDisplayCondition} value.  The {@code distanceDisplayCondition} property specifies the display condition specifying the distance from the camera at which this polygon will be displayed.
    
    
    
    
    

    * @param dates The dates at which the value is specified.
    * @param values The values corresponding to each date.
    * @param startIndex The index of the first element to write.
    * @param length The number of elements to write.
    */
    public final void writeDistanceDisplayConditionProperty(List<JulianDate> dates, List<Bounds> values, int startIndex, int length) {
        {
            cesiumlanguagewriter.DistanceDisplayConditionCesiumWriter writer = openDistanceDisplayConditionProperty();
            try {
                writer.writeDistanceDisplayCondition(dates, values, startIndex, length);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code distanceDisplayCondition} property as a {@code reference} value.  The {@code distanceDisplayCondition} property specifies the display condition specifying the distance from the camera at which this polygon will be displayed.
    
    

    * @param value The reference.
    */
    public final void writeDistanceDisplayConditionPropertyReference(Reference value) {
        {
            cesiumlanguagewriter.DistanceDisplayConditionCesiumWriter writer = openDistanceDisplayConditionProperty();
            try {
                writer.writeReference(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code distanceDisplayCondition} property as a {@code reference} value.  The {@code distanceDisplayCondition} property specifies the display condition specifying the distance from the camera at which this polygon will be displayed.
    
    

    * @param value The earliest date of the interval.
    */
    public final void writeDistanceDisplayConditionPropertyReference(String value) {
        {
            cesiumlanguagewriter.DistanceDisplayConditionCesiumWriter writer = openDistanceDisplayConditionProperty();
            try {
                writer.writeReference(value);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code distanceDisplayCondition} property as a {@code reference} value.  The {@code distanceDisplayCondition} property specifies the display condition specifying the distance from the camera at which this polygon will be displayed.
    
    
    

    * @param identifier The identifier of the object which contains the referenced property.
    * @param propertyName The property on the referenced object.
    */
    public final void writeDistanceDisplayConditionPropertyReference(String identifier, String propertyName) {
        {
            cesiumlanguagewriter.DistanceDisplayConditionCesiumWriter writer = openDistanceDisplayConditionProperty();
            try {
                writer.writeReference(identifier, propertyName);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }

    /**
    *  
    Writes a value for the {@code distanceDisplayCondition} property as a {@code reference} value.  The {@code distanceDisplayCondition} property specifies the display condition specifying the distance from the camera at which this polygon will be displayed.
    
    
    

    * @param identifier The identifier of the object which contains the referenced property.
    * @param propertyNames The hierarchy of properties to be indexed on the referenced object.
    */
    public final void writeDistanceDisplayConditionPropertyReference(String identifier, String[] propertyNames) {
        {
            cesiumlanguagewriter.DistanceDisplayConditionCesiumWriter writer = openDistanceDisplayConditionProperty();
            try {
                writer.writeReference(identifier, propertyNames);
            } finally {
                DisposeHelper.dispose(writer);
            }
        }
    }
}
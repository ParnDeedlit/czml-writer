package agi.foundation.compatibility;

//DERIVED FROM:
//
//System.Collections.Generic.LinkedList
//
//Author:
// David Waite
//
//(C) 2005 David Waite (mass@akuma.org)
//

//
//Copyright (C) 2005 David Waite
//
//Permission is hereby granted, free of charge, to any person obtaining
//a copy of this software and associated documentation files (the
//"Software"), to deal in the Software without restriction, including
//without limitation the rights to use, copy, modify, merge, publish,
//distribute, sublicense, and/or sell copies of the Software, and to
//permit persons to whom the Software is furnished to do so, subject to
//the following conditions:
//
//The above copyright notice and this permission notice shall be
//included in all copies or substantial portions of the Software.
//
//THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
//EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
//MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
//NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
//LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
//OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
//WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
//

import agi.foundation.compatibility.annotations.Internal;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;

import javax.annotation.Nonnull;

/**
 * Represents a doubly linked list. Unlike the built-in LinkedList, this class allows
 * direct access to the nodes in the linked list, instead of only operating on values.
 *
 * @param <T>
 *            Specifies the element type of the linked list.
 *
 * @deprecated Internal use only.
 */
@Internal
@Deprecated
public class LinkedList<T> implements Collection<T> {
    private int count;

    // Internally a circular list - first.previous == last
    private LinkedListNode<T> head;

    /**
     * Initializes a new instance of the LinkedList class that is empty.
     */
    public LinkedList() {}

    /**
     * Initializes a new instance of the LinkedList class that contains elements copied
     * from the specified Iterable.
     *
     * @param collection
     *            The Iterable whose elements are copied to the new LinkedList.
     */
    public LinkedList(Iterable<? extends T> collection) {
        for (T item : collection) {
            addLast(item);
        }
    }

    private void verifyReferencedNode(LinkedListNode<T> node) {
        if (node == null) {
            throw new ArgumentNullException("node");
        }
        if (node.getList() != this) {
            throw new IllegalStateException("node is not in the current LinkedList");
        }
    }

    private static <T> void verifyBlankNode(LinkedListNode<T> newNode) {
        if (newNode == null) {
            throw new ArgumentNullException("newNode");
        }
        if (newNode.getList() != null) {
            throw new IllegalStateException("newNode belongs to another LinkedList");
        }
    }

    /**
     * Adds the specified new node at the start of the LinkedList.
     *
     * @param node
     *            The new LinkedListNode to add at the start of the LinkedList.
     */
    public final void addFirst(LinkedListNode<T> node) {
        verifyBlankNode(node);
        if (head == null) {
            node.selfReference(this);
        } else {
            node.insertBetween(head.previous, head, this);
        }
        count++;
        head = node;
    }

    /**
     * Adds a new node containing the specified value at the start of the LinkedList.
     *
     * @param value
     *            The value to add at the start of the LinkedList.
     * @return The new LinkedListNode containing value.
     */
    public final LinkedListNode<T> addFirst(T value) {
        LinkedListNode<T> newNode;
        if (head == null) {
            newNode = new LinkedListNode<>(this, value);
        } else {
            newNode = new LinkedListNode<>(this, value, head.previous, head);
        }
        count++;
        head = newNode;
        return newNode;
    }

    /**
     * Adds a new node containing the specified value at the end of the LinkedList.
     *
     * @param value
     *            The value to add at the end of the LinkedList.
     * @return The new LinkedListNode containing value.
     */
    public final LinkedListNode<T> addLast(T value) {
        LinkedListNode<T> newNode;
        if (head == null) {
            newNode = new LinkedListNode<>(this, value);
            head = newNode;
        } else {
            newNode = new LinkedListNode<>(this, value, head.previous, head);
        }
        count++;
        return newNode;
    }

    @Override
    public final void clear() {
        while (head != null)
            remove(head);
    }

    @Override
    public final boolean contains(Object value) {
        LinkedListNode<T> node = head;
        if (node == null) {
            return false;
        }
        do {
            if (value.equals(node.getValue())) {
                return true;
            }
            node = node.next;
        } while (node != head);

        return false;
    }

    /**
     * Finds the first node that contains the specified value.
     *
     * @param value
     *            The value to locate in the LinkedList.
     * @return The first LinkedListNode that contains the specified value, if found;
     *         otherwise, null.
     */
    public final LinkedListNode<T> find(T value) {
        LinkedListNode<T> node = head;
        if (node == null) {
            return null;
        }

        do {
            if (value == null && node.getValue() == null) {
                return node;
            } else if (value != null && value.equals(node.getValue())) {
                return node;
            }
            node = node.next;
        } while (node != head);

        return null;
    }

    @Override
    public final Iterator<T> iterator() {
        return new Enumerator<>(this);
    }

    @Override
    public final boolean remove(Object value) {
        @SuppressWarnings("unchecked")
        T value_1 = (T) value;
        LinkedListNode<T> node = find(value_1);
        if (node == null) {
            return false;
        }
        remove(node);
        return true;
    }

    /**
     * Removes the specified node from the LinkedList.
     *
     * @param node
     *            The LinkedListNode to remove from the LinkedList.
     */
    public final void remove(LinkedListNode<T> node) {
        verifyReferencedNode(node);
        count--;
        if (count == 0) {
            head = null;
        }
        if (node == head) {
            head = head.next;
        }
        node.detach();
    }

    /**
     * Removes the node at the end of the LinkedList.
     */
    public final void removeLast() {
        if (head != null) {
            remove(head.previous);
        }
    }

    @Override
    public final boolean add(T value) {
        addLast(value);
        return true;
    }

    @Override
    public final int size() {
        return count;
    }

    /**
     * Gets the first node of the LinkedList.
     *
     * @return The first LinkedListNode of the LinkedList.
     */
    public final LinkedListNode<T> getFirst() {
        return head;
    }

    /**
     * Gets the last node of the LinkedList.
     *
     * @return The last LinkedListNode of the LinkedList.
     */
    public final LinkedListNode<T> getLast() {
        return head != null ? head.previous : null;
    }

    private static class Enumerator<T> implements Iterator<T> {
        @Nonnull
        private final LinkedList<T> list;
        private LinkedListNode<T> current;
        private int index;

        public Enumerator(@Nonnull LinkedList<T> list) {
            this.list = list;
            current = null;
            index = -1;
        }

        private T getCurrent() {
            return current.getValue();
        }

        private boolean moveNext() {
            if (current == null) {
                current = list.head;
            } else {
                current = current.next;
                if (current == list.head) {
                    current = null;
                }
            }
            if (current == null) {
                index = -1;
                return false;
            }
            ++index;
            return true;
        }

        private int __state;

        @Override
        public final boolean hasNext() {
            if (__state == 0)
                __state = moveNext() ? 1 : 2;
            return __state == 1;
        }

        @Override
        public final T next() {
            if (__state == 0) {
                if (moveNext())
                    return getCurrent();
            } else if (__state == 1) {
                __state = 0;
                return getCurrent();
            }
            throw new NoSuchElementException();
        }
    }

    @Override
    public final boolean isEmpty() {
        return count == 0;
    }

    @Override
    public final boolean containsAll(Collection<?> c) {
        for (Object e : c) {
            if (!contains(e)) {
                return false;
            }
        }
        return true;
    }

    @Override
    public final Object[] toArray() {
        Object[] r = new Object[count];
        int i = 0;
        for (Iterator<T> it = iterator(); it.hasNext();) {
            r[i] = it.next();
            ++i;
        }
        return r;
    }

    @Override
    @SuppressWarnings({
            "unchecked",
            "hiding"
    })
    public final <T> T[] toArray(T[] a) {
        T[] r = a.length >= count ? a : (T[]) Array.newInstance(a.getClass().getComponentType(), count);
        int i = 0;
        for (Iterator<?> it = iterator(); it.hasNext();) {
            r[i] = (T) it.next();
            ++i;
        }
        return r;
    }

    @Override
    public final boolean removeAll(Collection<?> c) {
        throw new UnsupportedOperationException("Method not implemented.");
    }

    @Override
    public final boolean addAll(Collection<? extends T> c) {
        throw new UnsupportedOperationException("Method not implemented.");
    }

    @Override
    public final boolean retainAll(Collection<?> c) {
        throw new UnsupportedOperationException("Method not implemented.");
    }
}
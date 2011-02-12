/*
 * Milyn - Copyright (C) 2006 - 2011
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License (version 2.1) as published by the Free Software
 * Foundation.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 *
 * See the GNU Lesser General Public License for more details:
 * http://www.gnu.org/licenses/lgpl.txt
 */

package org.milyn.edisax.model.internal;

import java.util.ArrayList;
import java.util.Collection;

/**
 * Node indexed array.
 * <p/>
 * Ensures that all nodes added to the list contain an index, either preset or
 * based on it's index in the array.
 *
 * @author <a href="mailto:tom.fennelly@gmail.com">tom.fennelly@gmail.com</a>
 */
class NodeIndexedArray<E extends MappingNode> extends ArrayList<E> {

    @Override
    public boolean add(E e) {
        if(e.isNodeIndexUndefined()) {
            e.setNodeIndex(size());
        }
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        for(E e : c) {
            super.add(e);
        }
        return true;
    }

    @Override
    public void add(int index, E element) {
        throw new UnsupportedOperationException("Operation not supported.");
    }

    @Override
    public E set(int index, E element) {
        throw new UnsupportedOperationException("Operation not supported.");
    }

    @Override
    public E remove(int index) {
        throw new UnsupportedOperationException("Operation not supported.");
    }

    @Override
    public boolean remove(Object o) {
        throw new UnsupportedOperationException("Operation not supported.");
    }

    @Override
    public void clear() {
        throw new UnsupportedOperationException("Operation not supported.");
    }

    @Override
    public boolean addAll(int index, Collection<? extends E> c) {
        throw new UnsupportedOperationException("Operation not supported.");
    }

    @Override
    protected void removeRange(int fromIndex, int toIndex) {
        throw new UnsupportedOperationException("Operation not supported.");
    }
}

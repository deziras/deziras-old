package org.deziras.util.iterator;

import org.deziras.util.Iterator;

import java.util.Enumeration;

/**
 * Created by glavo on 17-5-7.
 *
 * @author Glavo
 * @since 1.0.0
 */
public class EnumerationIterator<E> implements Iterator<E>, Enumeration<E> {
    private Enumeration<E> e;

    public EnumerationIterator(Enumeration<E> e) {
        this.e = e;
    }

    public boolean hasNext() {
        return e.hasMoreElements();
    }

    public E next() {
        return e.nextElement();
    }

    public void remove() {
        throw new UnsupportedOperationException("EnumerationIterator.remove()");
    }

    public boolean hasMoreElements() {
        return hasNext();
    }

    public E nextElement() {
        return next();
    }
}

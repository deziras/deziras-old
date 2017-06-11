package org.deziras.util.iterator;

import java.util.Enumeration;

/**
 * Created by glavo on 17-5-7.
 *
 * @author Glavo
 * @since 1.0.0
 */
public class EnumerationIterator<E> implements Enumeration<E>, java.util.Iterator<E> {
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

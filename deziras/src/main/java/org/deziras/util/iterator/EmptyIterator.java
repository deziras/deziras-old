package org.deziras.util.iterator;

import org.deziras.util.AbstractIterator;
import org.deziras.util.NoSuchElementException;
import org.deziras.Nothing;

/**
 * Created by glavo on 17-5-7.
 *
 * @author Glavo
 * @since 1.0.0
 */
public class EmptyIterator implements AbstractIterator<Nothing> {
    public static final EmptyIterator Instance = new EmptyIterator();

    public static EmptyIterator instance() {
        return Instance;
    }

    protected EmptyIterator() {

    }

    public boolean hasNext() {
        return false;
    }

    public Nothing next() {
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new UnsupportedOperationException("EmptyIterator.remove()");
    }
}

package tech.glacial.util.iterator;

import tech.glacial.Nothing;
import tech.glacial.util.Iterator;
import tech.glacial.util.NoSuchElementException;

/**
 * Created by glavo on 17-5-7.
 *
 * @author Glavo
 * @since 1.0.0
 */
public class EmptyIterator implements Iterator<Nothing> {
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

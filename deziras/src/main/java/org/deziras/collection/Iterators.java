package org.deziras.collection;

import org.deziras.ToolClass;
import org.deziras.util.Objects;
import org.deziras.util.iterator.EmptyIterator;
import org.deziras.util.iterator.EnumerationIterator;

import java.util.Enumeration;
import java.util.Iterator;

/**
 * Created by glavo on 17-5-7.
 *
 * @author Glavo
 * @since 1.0.0
 */
public final class Iterators extends ToolClass {
    private Iterators() {
    }

    @SuppressWarnings("unchecked")
    public static <T> Iterator<T> of(Enumeration<T> e) {
        Objects.requireNonNull(e);

        return (e instanceof Iterator<?>) ? (Iterator<T>) e
                : new EnumerationIterator<>(e);
    }

    @SuppressWarnings("unchecked")
    public static <T> Iterator<T> empty() {
        return (Iterator<T>) EmptyIterator.instance();
    }
}

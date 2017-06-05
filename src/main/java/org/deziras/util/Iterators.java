package tech.glacial.util;

import tech.glacial.ToolClass;
import tech.glacial.util.iterator.EmptyIterator;
import tech.glacial.util.iterator.EnumerationIterator;

import java.util.Enumeration;

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
                : new EnumerationIterator<T>(e);
    }

    @SuppressWarnings("unchecked")
    public static <T> Iterator<T> empty() {
        return (Iterator<T>) EmptyIterator.instance();
    }
}

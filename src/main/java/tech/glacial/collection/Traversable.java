package tech.glacial.collection;

import tech.glacial.util.Iterable;

/**
 * Created by glavo on 17-5-1.
 *
 * @author Glavo
 * @since 1.0.0
 */
public interface Traversable<E>
        extends Iterable<E> {
    boolean isEmpty();
}

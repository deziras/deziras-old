package org.deziras.function;

/**
 * Represents a function that accepts a object-valued and an int-valued argument,and
 * produces a result. This is the {@code (reference, int)} specialization for
 * {@link Function2}.
 *
 * @param <R> return type of the function
 * @author Glavo
 * @since 0.1.0
 */
@FunctionalInterface
public interface ObjIntFunction2<T, R> {

    /**
     * Applies this function to the given arguments.
     *
     * @param t function argument 1
     * @param i function argument 2
     * @return the function result
     */
    R invoke(T t, int i);

    default Function2<T, Integer, R> boxed() {
        return this::invoke;
    }
}
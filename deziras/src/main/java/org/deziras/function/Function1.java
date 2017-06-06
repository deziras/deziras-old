package org.deziras.function;

import org.deziras.Tuple1;

/**
 * Represents a function with 1 argument.
 *
 * @param <T> argument 1 of the function
 * @param <R> return type of the function
 *
 * @author Glavo
 * @since 0.1.0
 */
@FunctionalInterface
public interface Function1<T, R>
        extends CheckedFunction1<T, R> {

    /**
     * Applies this function to the given argument.
     *
     * @param t the function argument
     *
     * @return the function result
     */
    R invoke(T t);

    /**
     * Creates a tupled version of this function: instead of 1 argument,
     * it accepts a single {@link org.deziras.Tuple1} argument.
     */
    default Function1<Tuple1<? extends T>, R> tupled() {
        return t -> invoke(t.$1);
    }
}

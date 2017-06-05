package org.deziras.function;

/**
 * Represents a function that accepts an int-valued argument and produces a
 * result.  This is the {@code int}-consuming primitive specialization for
 * {@link Function1}.
 *
 * @param <R> return type of the function
 * @author Glavo
 * @since 0.1.0
 */
@FunctionalInterface
public interface IntFunction1<R> {

    /**
     * Applies this function to the given argument.
     *
     * @param t the function argument
     * @return the function result
     */
    R invoke(int t);

    default Function1<Integer, R> boxed() {
        return this::invoke;
    }
}
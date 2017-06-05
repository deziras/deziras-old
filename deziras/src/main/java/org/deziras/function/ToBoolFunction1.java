package org.deziras.function;

/**
 * Represents a function that accepts a argument and produces a {@code boolean}-valued
 * result.  This is the {@code double}-to-{@code long} primitive specialization for
 * {@link Function1}.
 *
 * @author Glavo
 * @since 0.1.0
 */
@FunctionalInterface
public interface ToBoolFunction1<T> {

    /**
     * Applies this function to the given argument.
     *
     * @param t the function argument
     * @return the function result
     */
    boolean invoke(T t);
}

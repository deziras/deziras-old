package org.deziras.function;

/**
 * Represents an operation upon two {@code int}-valued operands and producing an
 * {@code int}-valued result.  This is the {@code (int, int)}-to-{@code int} primitive
 * specialization for {@link Function2}.
 *
 * @author Glavo
 * @since 0.1.0
 */
@FunctionalInterface
public interface IntIntToIntFunction2 {

    /**
     * Applies this function to the given arguments.
     *
     * @param i1 function argument 1
     * @param i2 function argument 2
     * @return the function result
     */
    int invoke(int i1, int i2);

    default Function2<Integer, Integer, Integer> boxed() {
        return this::invoke;
    }
}
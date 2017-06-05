package org.deziras.function;

import org.deziras.Unit;

/**
 * Represents a function with 1 argument and returns no result.
 *
 * @param <T> argument 1 of the function
 *
 * @author Glavo
 * @since 0.1.0
 */
@FunctionalInterface
public interface CheckedToVoidFunction1<T> {

    /**
     * Performs this function to the given argument.
     *
     * @param t the function argument
     */
    void invoke(T t) throws Throwable;

    default CheckedFunction1<T, Unit> boxed() {
        return t -> {
            invoke(t);
            return Unit.instance();
        };
    }
}

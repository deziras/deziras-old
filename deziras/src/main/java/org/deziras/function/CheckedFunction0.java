package org.deziras.function;

/**
 * Represents a function with no argument.
 *
 * @param <R> return base of the function
 *
 * @author Glavo
 * @since 0.1.0
 */
@FunctionalInterface
public interface CheckedFunction0<R> {

    /**
     * Gets a result.
     *
     * @return a result
     */
    R invoke() throws Throwable;
}

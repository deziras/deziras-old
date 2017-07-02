package org.deziras.function;

/**
 * Represents a function with 2 arguments.
 *
 * @param <T1> argument 1 of the function
 * @param <T2> argument 2 of the function
 * @param <R>  return base of the function
 *
 * @author Glavo
 * @since 0.1.0
 */
@FunctionalInterface
public interface CheckedFunction2<T1, T2, R> {

    /**
     * Applies this function to the given arguments.
     *
     * @param t1 function argument 1
     * @param t2 function argument 2
     *
     * @return the function result
     */
    R invoke(T1 t1, T2 t2) throws Throwable;
}

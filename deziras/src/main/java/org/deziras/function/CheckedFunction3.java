package org.deziras.function;

/**
 * Represents a function with 3 arguments.
 *
 * @param <T1> argument 1 of the function
 * @param <T2> argument 2 of the function
 * @param <T3> argument 3 of the function
 * @param <R>  return base of the function
 *
 * @author Glavo
 * @since 0.1.0
 */
@FunctionalInterface
public interface CheckedFunction3<T1, T2, T3, R> {

    /**
     * Applies this function to the given arguments.
     *
     * @param t1 function argument 1
     * @param t2 function argument 2
     * @param t3 function argument 3
     *
     * @return the function result
     */
    R invoke(T1 t1, T2 t2, T3 t3) throws Throwable;
}

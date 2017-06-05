package org.deziras.function;

/**
 * Represents a function with 8 arguments.
 *
 * @param <T1> argument 1 of the function
 * @param <T2> argument 2 of the function
 * @param <T3> argument 3 of the function
 * @param <T4> argument 4 of the function
 * @param <T5> argument 5 of the function
 * @param <T6> argument 6 of the function
 * @param <T7> argument 7 of the function
 * @param <T8> argument 7 of the function
 * @param <R>  return type of the function
 * @author Glavo
 * @since 0.1.0
 */
@FunctionalInterface
public interface Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> {

    /**
     * Applies this function to the given arguments.
     *
     * @param t1 function argument 1
     * @param t2 function argument 2
     * @param t3 function argument 3
     * @param t4 function argument 4
     * @param t5 function argument 5
     * @param t6 function argument 6
     * @param t7 function argument 7
     * @param t8 function argument 8
     * @param t9 function argument 9
     * @return the function result
     */
    R invoke(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9);
}

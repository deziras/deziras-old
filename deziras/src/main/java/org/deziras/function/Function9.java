package org.deziras.function;

import org.deziras.Tuple9;

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
 * @param <T8> argument 8 of the function
 * @param <T9> argument 9 of the function
 * @param <R>  return type of the function
 *
 * @author Glavo
 * @since 0.1.0
 */
@FunctionalInterface
public interface Function9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R>
        extends CheckedFunction9<T1, T2, T3, T4, T5, T6, T7, T8, T9, R> {

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
     *
     * @return the function result
     */
    R invoke(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9);

    /**
     * Creates a tupled version of this function: instead of 9 arguments,
     * it accepts a single {@link org.deziras.Tuple9} argument.
     */
    default Function1<Tuple9<? extends T1, ? extends T2, ? extends T3, ? extends T4, ? extends T5, ? extends T6, ? extends T7, ? extends T8, ? extends T9>, R> tupled() {
        return t -> invoke(t.$1, t.$2, t.$3, t.$4, t.$5, t.$6, t.$7, t.$8, t.$9);
    }
}

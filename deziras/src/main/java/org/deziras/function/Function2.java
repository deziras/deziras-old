package org.deziras.function;

import org.deziras.Tuple2;

/**
 * Represents a function with 2 arguments.
 *
 * @param <T1> argument 1 of the function
 * @param <T2> argument 2 of the function
 * @param <R>  return type of the function
 *
 * @author Glavo
 * @since 0.1.0
 */
@FunctionalInterface
public interface Function2<T1, T2, R>
        extends CheckedFunction2<T1, T2, R> {

    /**
     * Applies this function to the given arguments.
     *
     * @param t1 function argument 1
     * @param t2 function argument 2
     *
     * @return the function result
     */
    R invoke(T1 t1, T2 t2);

    /**
     * Creates a tupled version of this function: instead of 2 arguments,
     * it accepts a single {@link org.deziras.Tuple2} argument.
     */
    default Function1<Tuple2<? extends T1, ? extends T2>, R> tupled() {
        return t -> invoke(t.$1, t.$2);
    }
}

package org.deziras.function;

import org.deziras.Unit;

/**
 * Represents a function with 2 arguments and returns no result.
 *
 * @param <T1> argument 1 of the function
 * @param <T2> argument 2 of the function
 *
 * @author Glavo
 * @since 0.1.0
 */
@FunctionalInterface
public interface ToVoidFunction2<T1, T2>
        extends CheckedToVoidFunction2<T1, T2> {

    /**
     * Performs this function to the given argument.
     *
     * @param t1 function argument 1
     * @param t2 function argument 2
     */
    void invoke(T1 t1, T2 t2);

    default Function2<T1, T2, Unit> boxed() {
        return (t1, t2) -> {
            invoke(t1, t2);
            return Unit.instance();
        };
    }
}

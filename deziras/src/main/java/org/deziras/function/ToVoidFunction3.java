package org.deziras.function;

import org.deziras.Unit;

/**
 * Represents a function with 3 arguments.
 *
 * @param <T1> argument 1 of the function
 * @param <T2> argument 2 of the function
 * @param <T3> argument 3 of the function
 *
 * @author Glavo
 * @since 0.1.0
 */
@FunctionalInterface
public interface ToVoidFunction3<T1, T2, T3>
        extends CheckedToVoidFunction3<T1, T2, T3> {

    /**
     * Performs this function to the given arguments.
     *
     * @param t1 function argument 1
     * @param t2 function argument 2
     * @param t3 function argument 3
     */
    void invoke(T1 t1, T2 t2, T3 t3);

    default Function3<T1, T2, T3, Unit> boxed() {
        return (t1, t2, t3) -> {
            invoke(t1, t2, t3);
            return Unit.instance();
        };
    }
}

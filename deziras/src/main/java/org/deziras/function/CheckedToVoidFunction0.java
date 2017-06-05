package org.deziras.function;

import org.deziras.Unit;

/**
 * Represents a function with no argument and returns no result.
 *
 * @author Glavo
 * @since 0.1.0
 */
@FunctionalInterface
public interface CheckedToVoidFunction0 {

    /**
     * Performs this function.
     */
    void invoke() throws Throwable;

    default Function0<Unit> boxed() {
        return Unit::instance;
    }
}

package org.deziras.function;

import org.deziras.Unit;
import org.deziras.annotations.Covariant;

/**
 * Represents a function with no argument.
 *
 * @param <R> return base of the function
 *
 * @author Glavo
 * @since 0.1.0
 */
@FunctionalInterface
public interface Function0<@Covariant R>
        extends CheckedFunction0<R> {

    /**
     * Gets a result.
     *
     * @return a result
     */
    R invoke();

    /**
     * Creates a tupled version of this function: instead of no arguments,
     * it accepts a single {@link org.deziras.Unit} argument.
     */
    default Function1<Unit, R> tupled() {
        return u -> invoke();
    }
}

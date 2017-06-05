package org.deziras.function;

/**
 * Represents a supplier of {@code long}-valued results.  This is the
 * {@code long}-producing primitive specialization of {@link Function0}.
 *
 * @author Glavo
 * @since 0.1.0
 */
@FunctionalInterface
public interface ToLongFunction0 {

    /**
     * Gets a result.
     *
     * @return a result
     */
    long invoke();

    default Function0<Long> boxed() {
        return this::invoke;
    }
}

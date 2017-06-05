package org.deziras.function;

/**
 * Represents a supplier of {@code double}-valued results.  This is the
 * {@code double}-producing primitive specialization of {@link Function0}.
 *
 * @author Glavo
 * @since 0.1.0
 */
@FunctionalInterface
public interface ToDoubleFunction0 {

    /**
     * Gets a result.
     *
     * @return a result
     */
    double invoke();
}

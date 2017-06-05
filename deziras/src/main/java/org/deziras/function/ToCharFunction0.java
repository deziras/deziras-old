package org.deziras.function;

/**
 * Represents a supplier of {@code char}-valued results.  This is the
 * {@code char}-producing primitive specialization of {@link Function0}.
 *
 * @author Glavo
 * @since 0.1.0
 */
@FunctionalInterface
public interface ToCharFunction0 {

    /**
     * Gets a result.
     *
     * @return a result
     */
    char invoke();
}

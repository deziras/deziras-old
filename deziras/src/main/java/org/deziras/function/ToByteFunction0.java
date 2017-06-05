package org.deziras.function;

/**
 * Represents a supplier of {@code byte}-valued results.  This is the
 * {@code byte}-producing primitive specialization of {@link Function0}.
 *
 * @author Glavo
 * @since 0.1.0
 */
@FunctionalInterface
public interface ToByteFunction0 {

    /**
     * Gets a result.
     *
     * @return a result
     */
    byte invoke();
}

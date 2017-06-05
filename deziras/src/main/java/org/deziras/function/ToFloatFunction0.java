package org.deziras.function;

/**
 * Represents a supplier of {@code float}-valued results.  This is the
 * {@code float}-producing primitive specialization of {@link Function0}.
 *
 * @author Glavo
 * @since 0.1.0
 */
@FunctionalInterface
public interface ToFloatFunction0 {

    /**
     * Gets a result.
     *
     * @return a result
     */
    float invoke();

    default Function0<Float> boxed() {
        return this::invoke;
    }
}

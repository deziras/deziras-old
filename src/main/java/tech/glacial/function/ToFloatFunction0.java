package tech.glacial.function;

/**
 * Represents a supplier of {@code float}-valued results.  This is the
 * {@code float}-producing primitive specialization of {@link Function0}.
 *
 * @author Glavo
 * @since 1.0.0
 */
public interface ToFloatFunction0 {

    /**
     * Gets a result.
     *
     * @return a result
     */
    float invoke();
}

package tech.glacial.function;

/**
 * Represents a supplier of {@code int}-valued results.  This is the
 * {@code int}-producing primitive specialization of {@link Function0}.
 *
 * @author Glavo
 * @since 1.0.0
 */
public interface ToIntFunction0 {

    /**
     * Gets a result.
     *
     * @return a result
     */
    int invoke();
}

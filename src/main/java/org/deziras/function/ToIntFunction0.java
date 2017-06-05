package tech.glacial.function;

/**
 * Represents a supplier of {@code int}-valued results.  This is the
 * {@code int}-producing primitive specialization of {@link Function0}.
 *
 * @author Glavo
 * @since 0.1.0
 */
@FunctionalInterface
public interface ToIntFunction0 {

    /**
     * Gets a result.
     *
     * @return a result
     */
    int invoke();
}

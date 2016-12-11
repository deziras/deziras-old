package tech.glacial.function;

/**
 * Represents a supplier of {@code char}-valued results.  This is the
 * {@code char}-producing primitive specialization of {@link Function0}.
 *
 * @author Glavo
 * @since 1.0.0
 */
public interface ToCharFunction0 {

    /**
     * Gets a result.
     *
     * @return a result
     */
    char invoke();
}

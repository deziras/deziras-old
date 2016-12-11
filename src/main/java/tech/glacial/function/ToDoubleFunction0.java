package tech.glacial.function;
/**
 * Represents a supplier of {@code double}-valued results.  This is the
 * {@code double}-producing primitive specialization of {@link Function0}.
 *
 * @author Glavo
 * @since 1.0.0
 */
public interface ToDoubleFunction0 {

    /**
     * Gets a result.
     *
     * @return a result
     */
    double invoke();
}

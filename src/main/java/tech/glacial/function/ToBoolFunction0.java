package tech.glacial.function;

/**
 * Represents a supplier of {@code boolean}-valued results.  This is the
 * {@code boolean}-producing primitive specialization of {@link Function0}.
 *
 * @author Glavo
 * @since 1.0.0
 */
public interface ToBoolFunction0 {

    /**
     * Gets a result.
     *
     * @return a result
     */
    boolean invoke();
}

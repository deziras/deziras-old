package tech.glacial.function;

/**
 * Represents a function that accepts an int-valued argument and returns no
 * result.  This is the {@code int}-consuming primitive specialization for
 * {@link Function1}.
 *
 * @author Glavo
 * @since 1.0.0
 */
public interface IntToVoidFunction1 {

    /**
     * Performs this function to the given argument.
     *
     * @param i the function argument
     */
    void apply(int i);
}
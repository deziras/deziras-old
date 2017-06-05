package org.deziras.function;

/**
 * Represents a function that accepts an long-valued argument and returns no
 * result.  This is the {@code long}-consuming primitive specialization for
 * {@link Function1}.
 *
 * @author Glavo
 * @since 0.1.0
 */
@FunctionalInterface
public interface LongToVoidFunction1 {

    /**
     * Performs this function to the given argument.
     *
     * @param l the function argument
     */
    void invoke(long l);
}

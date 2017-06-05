package org.deziras.function;

import org.deziras.Unit;

/**
 * Represents a function that accepts an int-valued argument and returns no
 * result.  This is the {@code int}-consuming primitive specialization for
 * {@link Function1}.
 *
 * @author Glavo
 * @since 0.1.0
 */
@FunctionalInterface
public interface IntToVoidFunction1 {

    /**
     * Performs this function to the given argument.
     *
     * @param i the function argument
     */
    void invoke(int i);

    default Function1<Integer, Unit> boxed() {
        return i -> {
            invoke(i);
            return Unit.instance();
        };
    }
}
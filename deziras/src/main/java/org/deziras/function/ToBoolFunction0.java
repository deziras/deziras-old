package org.deziras.function;

/**
 * Represents a supplier of {@code boolean}-valued results.  This is the
 * {@code boolean}-producing primitive specialization of {@link Function0}.
 *
 * <p>This is a <a href="package-summary.html">functional interface</a>
 * whose functional method is {@link #invoke()}.
 *
 * @author Glavo
 * @since 0.1.0
 */
@FunctionalInterface
public interface ToBoolFunction0 {

    /**
     * Gets a result.
     *
     * @return a result
     */
    boolean invoke();
}

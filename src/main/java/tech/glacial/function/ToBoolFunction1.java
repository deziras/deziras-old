package tech.glacial.function;

/**
 * Represents a function that accepts a argument and produces a {@code boolean}-valued
 * result.  This is the {@code double}-to-{@code long} primitive specialization for
 * {@link Function}.
 *
 * @author Glavo
 * @since 1.0.0
 */
public interface ToBoolFunction1<T> {

    /**
     * Applies this function to the given argument.
     *
     * @param t the function argument
     * @return the function result
     */
    boolean invoke(T t);
}

package tech.glacial.function;

/**
 * Represents a function with no argument.
 *
 * @author Glavo
 * @since 1.0.0
 */
public interface Function0<R> extends Function<R> {

    /**
     * Gets a result.
     *
     * @return a result
     */
    R invoke();
}

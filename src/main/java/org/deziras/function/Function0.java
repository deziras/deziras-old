package tech.glacial.function;

/**
 * Represents a function with no argument.
 *
 * @author Glavo
 * @since 0.1.0
 */
@FunctionalInterface
public interface Function0<R>  {

    /**
     * Gets a result.
     *
     * @return a result
     */
    R invoke();


}

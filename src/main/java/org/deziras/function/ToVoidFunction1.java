package tech.glacial.function;

/**
 * Created by glavo on 16-12-30.
 *
 * @author Glavo
 * @since 0.1.0
 */
@FunctionalInterface
public interface ToVoidFunction1<T> {

    /**
     * Performs this function to the given argument.
     *
     * @param t the function argument
     */
    void invoke(T t);
}

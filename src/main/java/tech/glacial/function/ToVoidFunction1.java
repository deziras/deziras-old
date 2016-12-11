package tech.glacial.function;

/**
 * Created by glavo on 16-12-30.
 *
 * @since 1.0.0
 * @author Glavo
 */
public interface ToVoidFunction1<T> {

    /**
     * Performs this function to the given argument.
     *
     * @param t the function argument
     */
    void invoke(T t);
}

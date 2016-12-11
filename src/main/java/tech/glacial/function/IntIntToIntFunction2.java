package tech.glacial.function;

/**
 * Represents an operation upon two {@code int}-valued operands and producing an
 * {@code int}-valued result.  This is the {@code (int, int)}-to-{@code int} primitive
 * specialization for {@link Function2}.
 *
 * @author Glavo
 * @since 1.0.0
 */
public interface IntIntToIntFunction2 {
    int apply(int i1, int i2);
}
package tech.glacial;

import tech.glacial.util.IndexOutOfBoundsException;
import tech.glacial.util.Objects;

import java.io.Serializable;

/**
 * A Tuple of one element.
 *
 * @param <T1> type of element 1
 *
 * @author Glavo
 * @since 1.0.0
 */
public final class Tuple1<@Covariant T1>
        extends Tuple implements Product1<T1>, Serializable {

    private static final long serialVersionUID = 9153394155866466173L;

    /**
     * Element 1 of this Tuple.
     */
    public final T1 $1;

    /**
     * Create a new tuple with 1 element.
     *
     * @param t1 Element 1 of this Tuple1
     */
    public Tuple1(T1 t1) {
        $1 = t1;
    }


    @Override
    public Object productElement(int n) {
        switch (n) {
            case 0:
                return $1;
            default:
                throw new IndexOutOfBoundsException(Integer.toString(n));
        }
    }

    /**
     * Getter of element 1 of this Tuple.
     *
     * @return element 1 of this Tuple.
     */
    public T1 _1() {
        return $1;
    }

    /**
     * Sets element 1 of this Tuple to the given {@code value}.
     *
     * @param value the new value
     *
     * @return a copy of this Tuple with a new value for element 1 of this Tuple.
     */
    public <T> Tuple1<T> update1(T value) {
        return new Tuple1<T>(value);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (!canEqual(obj)) return false;

        Tuple1<?> o =
                (Tuple1<?>) obj;

        return Objects.equals(o.$1, $1);
    }

    @Override
    public String toString() {
        return "("
                + $1 + ")";
    }
}

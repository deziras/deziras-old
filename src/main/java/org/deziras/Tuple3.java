package tech.glacial;

import tech.glacial.util.IndexOutOfBoundsException;
import tech.glacial.util.Objects;

import java.io.Serializable;

/**
 * A Tuple of 3 elements.
 *
 * @param <T1> type of element 1
 * @param <T2> type of element 2
 * @param <T3> type of element 3
 *
 * @author Glavo
 * @since 1.0.0
 */
public final class Tuple3<T1, T2, T3>
        extends Tuple implements Product3<T1, T2, T3>, Serializable {

    private static final long serialVersionUID = -7347441901252161633L;

    /**
     * Element 1 of this Tuple.
     */
    public final T1 $1;

    /**
     * Element 2 of this Tuple.
     */
    public final T2 $2;

    /**
     * The 3rd element of this Tuple.
     */
    public final T3 $3;

    /**
     * Create a new tuple with 3 elements.
     *
     * @param t1 Element 1 of this Tuple3
     * @param t2 Element 2 of this Tuple3
     * @param t3 Element 3 of this Tuple3
     */
    public Tuple3(T1 t1, T2 t2, T3 t3) {
        $1 = t1;
        $2 = t2;
        $3 = t3;
    }


    public Object productElement(int n) {
        switch (n) {
            case 0:
                return $1;
            case 1:
                return $2;
            case 2:
                return $3;
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
    public <T> Tuple3<T, T2, T3> update1(T value) {
        return new Tuple3<T, T2, T3>(value, $2, $3);
    }

    /**
     * Getter of element 2 of this Tuple.
     *
     * @return element 2 of this Tuple.
     */
    public T2 _2() {
        return $2;
    }

    /**
     * Sets element 2 of this Tuple to the given {@code value}.
     *
     * @param value the new value
     *
     * @return a copy of this Tuple with a new value for element 2 of this Tuple.
     */
    public <T> Tuple3<T1, T, T3> update2(T value) {
        return new Tuple3<T1, T, T3>($1, value, $3);
    }

    /**
     * Getter of element 3 of this Tuple.
     *
     * @return element 3 of this Tuple.
     */
    public T3 _3() {
        return $3;
    }

    /**
     * Sets element 3 of this Tuple to the given {@code value}.
     *
     * @param value the new value
     *
     * @return a copy of this Tuple with a new value for element 3 of this Tuple.
     */
    public <T> Tuple3<T1, T2, T> update3(T value) {
        return new Tuple3<T1, T2, T>($1, $2, value);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (!canEqual(obj)) return false;

        Tuple3<?, ?, ?> o =
                (Tuple3<?, ?, ?>) obj;

        return Objects.equals($1, o.$1)
                && Objects.equals($2, o.$2)
                && Objects.equals($3, o.$3);
    }

    @Override
    public String toString() {
        return "("
                + $1 + ", "
                + $2 + ", "
                + $3 + ")";
    }
}

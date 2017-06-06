package org.deziras;

import org.deziras.util.IndexOutOfBoundsException;
import org.deziras.util.Objects;

import java.io.Serializable;

/**
 * A Tuple of 4 elements.
 *
 * @param <T1> type of element 1
 * @param <T2> type of element 2
 * @param <T3> type of element 3
 * @param <T4> type of element 4
 * @author Glavo
 * @since 1.0.0
 */
public final class Tuple4<T1, T2, T3, T4>
        extends Tuple implements Product4<T1, T2, T3, T4>, Serializable {

    private static final long serialVersionUID = 5566096736435346633L;

    /**
     * Element 1 of this Tuple.
     */
    public final T1 $1;

    /**
     * Element 2 of this Tuple.
     */
    public final T2 $2;

    /**
     * Element 3 of this Tuple.
     */
    public final T3 $3;

    /**
     * Element 4 of this Tuple.
     */
    public final T4 $4;

    /**
     * Create a new tuple with 4 elements.
     *
     * @param t1 Element 1 of this Tuple4
     * @param t2 Element 2 of this Tuple4
     * @param t3 Element 3 of this Tuple4
     * @param t4 Element 4 of this Tuple4
     */
    public Tuple4(T1 t1, T2 t2, T3 t3, T4 t4) {
        $1 = t1;
        $2 = t2;
        $3 = t3;
        $4 = t4;
    }


    public Object productElement(int n) {
        switch (n) {
            case 0:
                return $1;
            case 1:
                return $2;
            case 2:
                return $3;
            case 3:
                return $4;
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
     * @return a copy of this Tuple with a new value for element 1 of this Tuple.
     */
    public <T> Tuple4<T, T2, T3, T4> update1(T value) {
        return new Tuple4<>(value, $2, $3, $4);
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
     * @return a copy of this Tuple with a new value for element 2 of this Tuple.
     */
    public <T> Tuple4<T1, T, T3, T4> update2(T value) {
        return new Tuple4<>($1, value, $3, $4);
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
     * @return a copy of this Tuple with a new value for element 3 of this Tuple.
     */
    public <T> Tuple4<T1, T2, T, T4> update3(T value) {
        return new Tuple4<>($1, $2, value, $4);
    }

    /**
     * Getter of element 4 of this Tuple.
     *
     * @return element 4 of this Tuple.
     */
    public T4 _4() {
        return $4;
    }

    /**
     * Sets element 4 of this Tuple to the given {@code value}.
     *
     * @param value the new value
     * @return a copy of this Tuple with a new value for element 4 of this Tuple.
     */
    public <T> Tuple4<T1, T2, T3, T> update4(T value) {
        return new Tuple4<>($1, $2, $3, value);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (!canEqual(obj)) return false;

        Tuple4<?, ?, ?, ?> o =
                (Tuple4<?, ?, ?, ?>) obj;

        return Objects.equals($1, o.$1)
                && Objects.equals($2, o.$2)
                && Objects.equals($3, o.$3)
                && Objects.equals($4, o.$4);
    }

    @Override
    public String toString() {
        return "("
                + $1 + ", "
                + $2 + ", "
                + $3 + ", "
                + $4 + ")";
    }
}

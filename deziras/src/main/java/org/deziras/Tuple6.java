package org.deziras;

import org.deziras.util.IndexOutOfBoundsException;
import org.deziras.util.Objects;

import java.io.Serializable;

/**
 * A Tuple of 6 elements.
 *
 * @param <T1> type of element 1
 * @param <T2> type of element 2
 * @param <T3> type of element 3
 * @param <T4> type of element 4
 * @param <T5> type of element 5
 * @param <T6> type of element 6
 *
 * @author Glavo
 * @since 1.0.0
 */
public final class Tuple6<T1, T2, T3, T4, T5, T6>
        extends Tuple implements Product6<T1, T2, T3, T4, T5, T6>, Serializable {

    private static final long serialVersionUID = -4969015335077698227L;

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
     * Element 5 of this Tuple.
     */
    public final T5 $5;

    /**
     * Element 6 of this Tuple.
     */
    public final T6 $6;

    /**
     * Create a new tuple with 6 elements.
     *
     * @param t1 Element 1 of this Tuple6
     * @param t2 Element 2 of this Tuple6
     * @param t3 Element 3 of this Tuple6
     * @param t4 Element 4 of this Tuple6
     * @param t5 Element 5 of this Tuple6
     * @param t6 Element 6 of this Tuple6
     */
    public Tuple6(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        $1 = t1;
        $2 = t2;
        $3 = t3;
        $4 = t4;
        $5 = t5;
        $6 = t6;
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
            case 4:
                return $5;
            case 5:
                return $6;
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
    public <T> Tuple6<T, T2, T3, T4, T5, T6> update1(T value) {
        return new Tuple6<>(value, $2, $3, $4, $5, $6);
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
    public <T> Tuple6<T1, T, T3, T4, T5, T6> update2(T value) {
        return new Tuple6<>($1, value, $3, $4, $5, $6);
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
    public <T> Tuple6<T1, T2, T, T4, T5, T6> update3(T value) {
        return new Tuple6<>($1, $2, value, $4, $5, $6);
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
     *
     * @return a copy of this Tuple with a new value for element 4 of this Tuple.
     */
    public <T> Tuple6<T1, T2, T3, T, T5, T6> update4(T value) {
        return new Tuple6<>($1, $2, $3, value, $5, $6);
    }

    /**
     * Getter of element 5 of this Tuple.
     *
     * @return element 5 of this Tuple.
     */
    public T5 _5() {
        return $5;
    }

    /**
     * Sets element 5 of this Tuple to the given {@code value}.
     *
     * @param value the new value
     *
     * @return a copy of this Tuple with a new value for element 5 of this Tuple.
     */
    public <T> Tuple6<T1, T2, T3, T4, T, T6> update5(T value) {
        return new Tuple6<>($1, $2, $3, $4, value, $6);
    }

    /**
     * Getter of element 6 of this Tuple.
     *
     * @return element 6 of this Tuple.
     */
    public T6 _6() {
        return $6;
    }

    /**
     * Sets element 6 of this Tuple to the given {@code value}.
     *
     * @param value the new value
     *
     * @return a copy of this Tuple with a new value for element 6 of this Tuple.
     */
    public <T> Tuple6<T1, T2, T3, T4, T5, T> update6(T value) {
        return new Tuple6<>($1, $2, $3, $4, $5, value);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (!canEqual(obj)) return false;

        Tuple6<?, ?, ?, ?, ?, ?> o =
                (Tuple6<?, ?, ?, ?, ?, ?>) obj;

        return Objects.equals($1, o.$1)
                && Objects.equals($2, o.$2)
                && Objects.equals($3, o.$3)
                && Objects.equals($4, o.$4)
                && Objects.equals($5, o.$5)
                && Objects.equals($6, o.$6);
    }

    @Override
    public String toString() {
        return "("
                + $1 + ", "
                + $2 + ", "
                + $3 + ", "
                + $4 + ", "
                + $5 + ", "
                + $6 + ")";
    }
}

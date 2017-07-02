package org.deziras;

import org.deziras.base.Product2;
import org.deziras.base.Tuple;
import org.deziras.util.IndexOutOfBoundsException;
import org.deziras.util.Objects;

import java.io.Serializable;

/**
 * A Tuple of 2 elements.
 *
 * @param <T1> base of element 1
 * @param <T2> base of element 2
 *
 * @author Glavo
 * @since 0.1.0
 */
public final class Tuple2<T1, T2>
		extends Tuple implements Product2<T1, T2>, java.util.Map.Entry<T1, T2>, Serializable {

	private static final long serialVersionUID = 6536802480564173544L;

	/**
	 * Element 1 of this Tuple.
	 */
	public final T1 $1;

	/**
	 * Element 2 of this Tuple.
	 */
	public final T2 $2;

	/**
	 * Create a new tuple with 2 elements.
	 *
	 * @param t1 Element 1 of this Tuple2
	 * @param t2 Element 2 of this Tuple2
	 */
	public Tuple2(T1 t1, T2 t2) {
		$1 = t1;
		$2 = t2;
	}

	@Override
	public Object productElement(int n) {
		switch (n) {
			case 0:
				return $1;
			case 1:
				return $2;
			default:
				throw new IndexOutOfBoundsException(Integer.toString(n));
		}
	}

	/**
	 * Getter of element 1 of this Tuple.
	 *
	 * @return element 1 of this Tuple.
	 */
	@Override
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
	public <T> Tuple2<T, T2> update1(T value) {
		return new Tuple2<>(value, $2);
	}

	/**
	 * Getter of element 2 of this Tuple.
	 *
	 * @return element 2 of this Tuple.
	 */
	@Override
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
	public <T> Tuple2<T1, T> update2(T value) {
		return new Tuple2<>($1, value);
	}

	@Override
	public T1 getKey() {
		return _1();
	}

	@Override
	public T2 getValue() {
		return _2();
	}

	@Override
	public T2 setValue(T2 value) {
		throw new UnsupportedOperationException("Tuple#setValue");
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null) return false;
		if (!canEqual(obj)) return false;

		Tuple2<?, ?> o =
				(Tuple2<?, ?>) obj;

		return Objects.equals($1, o.$1)
				&& Objects.equals($2, o.$2);
	}

	@Override
	public String toString() {
		return "("
				+ $1 + ", "
				+ $2 + ")";
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}

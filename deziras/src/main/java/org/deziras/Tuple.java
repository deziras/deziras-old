package org.deziras;

/**
 * The base class of all tuples.
 *
 * @author Glavo
 * @since 0.1.0
 */
public abstract class Tuple implements Product {

	Tuple() {
	}

	/**
	 * Get Unit's instance.
	 *
	 * @return {@code Unit.instance()}
	 */
	public static Unit of() {
		return Unit.instance();
	}


	/**
	 * Creates a Tuple of 1 element.
	 *
	 * @param <T1> type of element 1
	 * @param t1   element 1
	 *
	 * @return a {@code Tuple1} of 1 element.
	 */
	public static <T1> Tuple1<T1> of(
			T1 t1) {
		return new Tuple1<>(t1);
	}

	/**
	 * Creates a Tuple of 2 elements.
	 *
	 * @param <T1> type of element 1
	 * @param <T2> type of element 2
	 * @param t1   element 1
	 * @param t2   element 2
	 *
	 * @return a {@code Tuple2} of 2 elements.
	 */
	public static <T1, T2> Tuple2<T1, T2> of(
			T1 t1, T2 t2) {
		return new Tuple2<>(t1, t2);
	}

	/**
	 * Creates a Tuple of 3 elements.
	 *
	 * @param <T1> type of element 1
	 * @param <T2> type of element 2
	 * @param <T3> type of element 3
	 * @param t1   element 1
	 * @param t2   element 2
	 * @param t3   element 3
	 *
	 * @return a {@code Tuple3} of 3 elements.
	 */
	public static <T1, T2, T3> Tuple3<T1, T2, T3> of(
			T1 t1, T2 t2, T3 t3) {
		return new Tuple3<>(t1, t2, t3);
	}

	/**
	 * Creates a Tuple of 4 elements.
	 *
	 * @param <T1> type of element 1
	 * @param <T2> type of element 2
	 * @param <T3> type of element 3
	 * @param <T4> type of element 4
	 * @param t1   element 1
	 * @param t2   element 2
	 * @param t3   element 3
	 * @param t4   element 4
	 *
	 * @return a {@code Tuple4} of 4 elements.
	 */
	public static <T1, T2, T3, T4> Tuple4<T1, T2, T3, T4> of(
			T1 t1, T2 t2, T3 t3, T4 t4) {
		return new Tuple4<>(t1, t2, t3, t4);
	}

	/**
	 * Creates a Tuple of 5 elements.
	 *
	 * @param <T1> type of element 1
	 * @param <T2> type of element 2
	 * @param <T3> type of element 3
	 * @param <T4> type of element 4
	 * @param <T5> type of element 5
	 * @param t1   element 1
	 * @param t2   element 2
	 * @param t3   element 3
	 * @param t4   element 4
	 * @param t5   element 5
	 *
	 * @return a {@code Tuple5} of 5 elements.
	 */
	public static <T1, T2, T3, T4, T5> Tuple5<T1, T2, T3, T4, T5> of(
			T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
		return new Tuple5<>(t1, t2, t3, t4, t5);
	}

	/**
	 * Creates a Tuple of 6 elements.
	 *
	 * @param <T1> type of element 1
	 * @param <T2> type of element 2
	 * @param <T3> type of element 3
	 * @param <T4> type of element 4
	 * @param <T5> type of element 5
	 * @param <T6> type of element 6
	 * @param t1   element 1
	 * @param t2   element 2
	 * @param t3   element 3
	 * @param t4   element 4
	 * @param t5   element 5
	 * @param t6   element 6
	 *
	 * @return a {@code Tuple6} of 6 elements.
	 */
	public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> of(
			T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
		return new Tuple6<>(t1, t2, t3, t4, t5, t6);
	}

	/**
	 * Creates a Tuple of 7 elements.
	 *
	 * @param <T1> type of element 1
	 * @param <T2> type of element 2
	 * @param <T3> type of element 3
	 * @param <T4> type of element 4
	 * @param <T5> type of element 5
	 * @param <T6> type of element 6
	 * @param <T7> type of element 7
	 * @param t1   element 1
	 * @param t2   element 2
	 * @param t3   element 3
	 * @param t4   element 4
	 * @param t5   element 5
	 * @param t6   element 6
	 * @param t7   element 7
	 *
	 * @return a {@code Tuple7} of 7 elements.
	 */
	public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> of(
			T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
		return new Tuple7<>(t1, t2, t3, t4, t5, t6, t7);
	}

	/**
	 * Creates a Tuple of 8 elements.
	 *
	 * @param <T1> type of element 1
	 * @param <T2> type of element 2
	 * @param <T3> type of element 3
	 * @param <T4> type of element 4
	 * @param <T5> type of element 5
	 * @param <T6> type of element 6
	 * @param <T7> type of element 7
	 * @param <T8> type of element 8
	 * @param t1   element 1
	 * @param t2   element 2
	 * @param t3   element 3
	 * @param t4   element 4
	 * @param t5   element 5
	 * @param t6   element 6
	 * @param t7   element 7
	 * @param t8   element 8
	 *
	 * @return a {@code Tuple8} of 8 elements.
	 */
	public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> of(
			T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
		return new Tuple8<>(t1, t2, t3, t4, t5, t6, t7, t8);
	}

	/**
	 * Creates a Tuple of 9 elements.
	 *
	 * @param <T1> type of element 1
	 * @param <T2> type of element 2
	 * @param <T3> type of element 3
	 * @param <T4> type of element 4
	 * @param <T5> type of element 5
	 * @param <T6> type of element 6
	 * @param <T7> type of element 7
	 * @param <T8> type of element 8
	 * @param <T9> type of element 9
	 * @param t1   element 1
	 * @param t2   element 2
	 * @param t3   element 3
	 * @param t4   element 4
	 * @param t5   element 5
	 * @param t6   element 6
	 * @param t7   element 7
	 * @param t8   element 8
	 * @param t9   element 9
	 *
	 * @return a {@code Tuple9} of 9 elements.
	 */
	public static <T1, T2, T3, T4, T5, T6, T7, T8, T9> Tuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9> of(
			T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9) {
		return new Tuple9<>(t1, t2, t3, t4, t5, t6, t7, t8, t9);
	}

	public boolean canEqual(Object o) {
		return o != null && o.getClass() == getClass();
	}

}

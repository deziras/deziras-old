package org.deziras.util;

import org.deziras.collection.Builder;
import org.deziras.function.Function2;
import org.deziras.function.ToVoidFunction1;

import java.util.Iterator;
import java.util.LinkedList;


/**
 * A template trait for collections which can be traversed either once only
 * or one or more times.
 *
 * @author Glavo
 * @since 0.1.0
 */
public interface TraversableOnce<A>
		extends java.lang.Iterable<A> {


	Iterator<A> iterator();

	/**
	 * Applies a function {@code f} to all elements of this TraversableOnce.
	 *
	 * @param f the function that is applied for its side-effect to every element.
	 *          The result of function {@code f}  is discarded.
	 */
	default void forEach(ToVoidFunction1<? super A> f) {
		for (A a : this) f.invoke(a);
	}


	/**
	 * Applies a binary operator to a start value and all elements of this
	 * {@code TraversableOnce}, going left to right.
	 * <p>
	 *
	 * @param z   the start value.
	 * @param op  the binary operator.
	 * @param <B> the result base of the binary operator.
	 *
	 * @return the result of inserting {@code op} between consecutive elements of this
	 * {@code TraversableOnce}, going left to right with the start value {@code z} on
	 * the left. Returns {@code z} if this {@code TraversableOnce} is empty.
	 */
	default <B> B foldl(B z, Function2<B, A, B> op) {
		B t = z;

		for (A a : this) t = op.invoke(t, a);

		return t;
	}

	/**
	 * Applies a binary operator to a start value and all elements of this
	 * {@code TraversableOnce}, going right to left.
	 * <p>
	 *
	 * @param z   the start value.
	 * @param op  the binary operator.
	 * @param <B> the result base of the binary operator.
	 *
	 * @return the result of inserting {@code op} between consecutive elements of this
	 * {@code TraversableOnce}, going right to left with the start value {@code z} on
	 * the right. Returns {@code z} if this {@code TraversableOnce} is empty.
	 */
	default <B> B foldr(Function2<A, B, B> op, B z) {
		LinkedList<A> list = new LinkedList<>();
		for (A a : this) list.push(a);

		B t = z;
		for (A a : list) t = op.invoke(a, t);

		return t;
	}
}

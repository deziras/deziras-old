package org.deziras.collection;

import org.deziras.base.Equals;
import org.deziras.function.Function0;
import org.deziras.function.Function1;
import org.deziras.function.ToBoolFunction1;
import org.deziras.util.NoSuchElementException;
import org.deziras.util.Objects;
import org.deziras.util.Option;
import org.deziras.util.TraversableOnce;

import java.util.Iterator;

/**
 * The root interface in the <i>collection hierarchy</i>.  E collection
 * represents a group of objects, known as its <i>elements</i>.
 *
 * @param <E> the base of elements in this collection
 *
 * @author Glavo
 * @since 0.1.0
 */

public interface Collection<E>
		extends TraversableOnce<E>, Cloneable, Equals {

	<New> Builder<? super New, ? extends Collection<New>> newBuilder();

	default boolean isEmpty() {
		return !iterator().hasNext();
	}

	default boolean nonEmpty() {
		return iterator().hasNext();
	}

	default boolean exists(E v) {
		for (E e : this) {
			if (Objects.equals(e, v))
				return true;
		}
		return false;
	}

	/**
	 * Builds a new collection by applying a function to all elements of this {@code Collection}.
	 *
	 * @param mapper   the function to apply to each element.
	 * @param supplier an implicit value of class CanBuildFrom which
	 *                 determines the result class That from the current
	 *                 representation base Repr and the new element base B .
	 * @param <To>     the base of new collection
	 * @param <B>      the element base of the returned collection.
	 *
	 * @return a new {@code collection} resulting from applying the given function
	 * {@code f} to each element of this $coll and collecting the results.
	 */
	default <B, To> To map(Function1<? super E, ? extends B> mapper,
	                       Function0<? extends Builder<? super B, ? extends To>> supplier) {
		Builder<? super B, ? extends To> builder = supplier.invoke();

		for (E elem : this) {
			builder.append(mapper.invoke(elem));
		}

		return builder.result();
	}


	default <B> Collection<B> map(Function1<? super E, ? extends B> mapper) {
		return this.<B, Collection<B>>map(mapper, this::newBuilder);
	}

	default <To> To filter(ToBoolFunction1<? super E> p,
	                       Function0<? extends Builder<? super E, ? extends To>> supplier) {
		Builder<? super E, ? extends To> builder = supplier.invoke();
		for (E e : this) {
			if (p.invoke(e)) builder.append(e);
		}

		return builder.result();
	}

	default <To> To filterNot(ToBoolFunction1<? super E> p,
	                          Function0<? extends Builder<? super E, ? extends To>> supplier) {
		Builder<? super E, ? extends To> builder = supplier.invoke();
		for (E e : this) {
			if (!p.invoke(e)) builder.append(e);
		}

		return builder.result();
	}

	default Collection<E> filter(ToBoolFunction1<? super E> p) {
		return filter(p, this::<E>newBuilder);
	}

	default Collection<E> filterNot(ToBoolFunction1<? super E> p) {
		return filterNot(p, this::<E>newBuilder);
	}

	/**
	 * Selects the first element of this Collection.
	 *
	 * @return the first element of this Collection.
	 *
	 * @throws NoSuchElementException if the Collection is empty.
	 */
	default E head() {
		Iterator<E> it = iterator();
		if (it.hasNext()) return it.next();
		else throw new NoSuchElementException("head of empty Collection");
	}

	default Option<E> headOption() {
		Iterator<E> it = iterator();
		if (it.hasNext()) return Option.some(it.next());
		else return Option.none();
	}

	/**
	 * Selects the last element of this Collection.
	 *
	 * @return the last element of this Collection.
	 *
	 * @throws NoSuchElementException if the Collection is empty.
	 */
	default E last() {
		Iterator<E> it = iterator();
		if (!it.hasNext()) throw new NoSuchElementException("last of empty Collection");
		E last = null;
		while (it.hasNext()) {
			last = it.next();
		}

		return last;
	}

	default Option<E> lastOption() {
		Iterator<E> it = iterator();
		if (!it.hasNext())
			return Option.none();
		E last = null;
		while (it.hasNext()) {
			last = it.next();
		}

		return Option.some(last);
	}

	default long count() {
		long l = 0;
		for (E ignored : this) {
			l++;
		}
		return l;
	}

	default long count(ToBoolFunction1<? super E> p) {
		long l = 0;
		for (E e : this) {
			if (p.invoke(e)) {
				l++;
			}
		}
		return l;
	}

	/**
	 * Creates and returns a copy of this object.
	 *
	 * @return a clone of this instance.
	 */
	default Collection<E> clone() {
		Builder<? super E, ? extends Collection<E>> builder = newBuilder();

		for (E e : this) {
			builder.append(e);
		}

		return builder.result();
	}
}

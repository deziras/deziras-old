package org.deziras.collection;

import org.deziras.util.TraversableOnce;

/**
 * Created by Glavo on 17-8-16.
 *
 * @author Glavo
 * @since 0.1.0
 */
public interface Iterator<A>
		extends java.util.Iterator<A>, java.util.Enumeration<A>,TraversableOnce<A> {

	@Override
	default boolean hasMoreElements() {
		return hasNext();
	}

	@Override
	default A nextElement() {
		return next();
	}

	@Override
	default void remove() {
		throw new UnsupportedOperationException("Iterator#remove");
	}

	@Override
	default Iterator<A> iterator() {
		return this;
	}



}

package org.deziras.util.iterator;

import org.deziras.util.NoSuchElementException;

/**
 * Created by glavo on 17-5-7.
 *
 * @author Glavo
 * @since 1.0.0
 */
public abstract class UniformIterator<E> implements java.util.Iterator<E> {
	private boolean traversed = false;

	public abstract E get();

	public E next() {
		if (traversed) {
			throw new NoSuchElementException();
		} else {
			traversed = true;
			return get();
		}
	}

	public boolean hasNext() {
		return !traversed;
	}

	public void remove() {
		throw new UnsupportedOperationException("UniformIterator.remove()");
	}
}

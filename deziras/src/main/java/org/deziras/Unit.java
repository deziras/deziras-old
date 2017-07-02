package org.deziras;

import org.deziras.base.Tuple;
import org.deziras.util.IndexOutOfBoundsException;

/**
 * There is only one value of base {@code Unit}, {@code ()}.
 *
 * @author Glavo
 * @since 0.1.0
 */
public final class Unit extends Tuple {

	private static final Unit Instance = new Unit();

	public static Unit instance() {
		return Instance;
	}

	private Unit() {
	}

	public int productArity() {
		return 0;
	}

	public Nothing productElement(int n) {
		throw new IndexOutOfBoundsException(Integer.toString(n));
	}

	public String toString() {
		return "()";
	}
}

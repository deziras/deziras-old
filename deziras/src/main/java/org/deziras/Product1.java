package org.deziras;

import org.deziras.util.IndexOutOfBoundsException;

/**
 * Product1 is a Cartesian product of 1 component.
 *
 * @author Glavo
 * @since 1.0.0
 */
public interface Product1<T1>
		extends Product {

	/**
	 * A projection of element 1 of this Product.
	 *
	 * @return A projection of element 1.
	 */
	T1 _1();

	/**
	 * The size of this product.
	 *
	 * @return the size of this product
	 */
	@Override
	default int productArity() {
		return 1;
	}

	/**
	 * The n<sup>th</sup> element of this product, 0-based.
	 *
	 * @param n the index of the element to return
	 *
	 * @return the element {@code n} elements after the first element
	 */
	@Override
	default Object productElement(int n) {
		switch (n) {
			case 0:
				return _1();
			default:
				throw new IndexOutOfBoundsException(Integer.toString(n));
		}
	}
}

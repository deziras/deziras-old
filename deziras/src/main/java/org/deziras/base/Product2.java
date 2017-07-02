package org.deziras.base;

import org.deziras.util.IndexOutOfBoundsException;

/**
 * Product2 is a Cartesian product of 2 components.
 *
 * @author Glavo
 * @since 1.0.0
 */
public interface Product2<T1, T2>
		extends Product {

	/**
	 * A projection of element 1 of this Product.
	 *
	 * @return A projection of element 1.
	 */
	T1 _1();

	/**
	 * A projection of element 2 of this Product.
	 *
	 * @return A projection of element 2.
	 */
	T2 _2();

	/**
	 * The size of this product.
	 *
	 * @return the size of this product
	 */
	@Override
	default int productArity() {
		return 2;
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
			case 1:
				return _2();
			default:
				throw new IndexOutOfBoundsException(Integer.toString(n));
		}
	}
}

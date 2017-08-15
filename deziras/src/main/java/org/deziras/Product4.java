package org.deziras;

import org.deziras.util.IndexOutOfBoundsException;

/**
 * Product4 is a Cartesian product of 4 components.
 *
 * @author Glavo
 * @since 1.0.0
 */
public interface Product4<T1, T2, T3, T4>
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
	 * A projection of element 3 of this Product.
	 *
	 * @return A projection of element 3.
	 */
	T3 _3();

	/**
	 * A projection of element 4 of this Product.
	 *
	 * @return A projection of element 4.
	 */
	T4 _4();

	/**
	 * The size of this product.
	 *
	 * @return the size of this product
	 */
	@Override
	default int productArity() {
		return 4;
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
			case 2:
				return _3();
			case 3:
				return _4();
			default:
				throw new IndexOutOfBoundsException(Integer.toString(n));
		}
	}
}

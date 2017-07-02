package org.deziras.type;

import org.deziras.util.IndexOutOfBoundsException;

/**
 * Product8 is a Cartesian product of 8 components.
 *
 * @author Glavo
 * @since 1.0.0
 */
public interface Product8<T1, T2, T3, T4, T5, T6, T7, T8>
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
	 * A projection of element 5 of this Product.
	 *
	 * @return A projection of element 5.
	 */
	T5 _5();

	/**
	 * A projection of element 6 of this Product.
	 *
	 * @return A projection of element 6.
	 */
	T6 _6();

	/**
	 * A projection of element 7 of this Product.
	 *
	 * @return A projection of element 7.
	 */
	T7 _7();

	/**
	 * A projection of element 8 of this Product.
	 *
	 * @return A projection of element 8.
	 */
	T8 _8();

	/**
	 * The size of this product.
	 *
	 * @return the size of this product
	 */
	@Override
	default int productArity() {
		return 8;
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
			case 4:
				return _5();
			case 5:
				return _6();
			case 6:
				return _7();
			case 7:
				return _8();
			default:
				throw new IndexOutOfBoundsException(Integer.toString(n));
		}
	}
}

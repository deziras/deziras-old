package org.deziras.base;

import org.deziras.util.Objects;

import java.util.Iterator;

/**
 * Base interface for all products.
 *
 * @author Glavo
 * @since 1.0.0
 */
public interface Product
		extends Iterable<Object>, Equals {

	final class ProductIterator implements Iterator<Object> {
		private final Product _p;
		private int c = 0;

		public ProductIterator(Product p) {
			_p = p;
		}

		private int cmax() {
			return _p.productArity();
		}

		public boolean hasNext() {
			return c < cmax();
		}

		public Object next() {
			return _p.productElement(c);
		}

		public void remove() {

		}
	}

	/**
	 * The size of the product.
	 *
	 * @return the size of this product
	 */
	static int productArity(Product p) {
		Objects.requireNonNull(p);
		return p.productArity();
	}

	/**
	 * The n<sup>th</sup> element of the product, 0-based.
	 *
	 * @param n the index of the element to return
	 *
	 * @return the element {@code n} elements after the first element
	 */
	static Object productElement(Product p, int n) {
		Objects.requireNonNull(p);
		return p.productElement(n);
	}

	/**
	 * The size of this product.
	 *
	 * @return the size of this product
	 */
	int productArity();

	/**
	 * The n<sup>th</sup> element of this product, 0-based.
	 *
	 * @param n the index of the element to return
	 *
	 * @return the element {@code n} elements after the first element
	 */
	Object productElement(int n);

	/**
	 * An iterator over all the elements of this product.
	 *
	 * @return in the default implementation, an {@link ProductIterator}
	 */
	default ProductIterator iterator() {
		return new ProductIterator(this);
	}


}

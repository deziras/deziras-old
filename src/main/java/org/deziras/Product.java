package tech.glacial;

import tech.glacial.util.Objects;

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

    static int productArity(Product p) {
        Objects.requireNonNull(p);
        return p.productArity();
    }

    static Object productElement(Product p, int i) {
        Objects.requireNonNull(p);
        return p.productElement(i);
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
     * @return the element `n` elements after the first element
     *
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

package tech.glacial;

import java.util.Iterator;

/**
 * Created by glavo on 17-3-19.
 *
 * @author Glavo
 * @since 1.0.0
 */
public final class Products {
    public static final class ProductIterator implements Iterator<Object> {
        private final Product _p;
        private int c = 0;

        private int cmax() {
            return _p.productArity();
        }

        public ProductIterator(Product p) {
            _p = p;
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

    public static int productArity(Product p) {
        return p.productArity();
    }

    public static Object productElement(Product p, int i) {
        return p.productElement(i);
    }
}

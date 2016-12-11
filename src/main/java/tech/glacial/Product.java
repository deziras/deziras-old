package tech.glacial;

/**
 * Base interface for all products.
 *
 * @author Glavo
 * @since 1.0.0
 */
public interface Product
        extends Iterable<Object>, Equals {
    int productArity();

    Object productElement(int n);

    Products.ProductIterator iterator();
}

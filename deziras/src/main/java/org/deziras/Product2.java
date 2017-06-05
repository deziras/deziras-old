package org.deziras;

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

    @Override
    default int productArity() {
        return 2;
    }
}

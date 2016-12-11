package tech.glacial;

/**
 * Product3 is a Cartesian product of 3 components.
 *
 * @author Glavo
 * @since 1.0.0
 */
public interface Product3<T1, T2, T3>
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
}

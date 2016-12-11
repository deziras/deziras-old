package tech.glacial;

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
}

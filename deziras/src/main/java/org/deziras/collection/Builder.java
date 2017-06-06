package org.deziras.collection;

import org.deziras.function.Function1;

/**
 * The base trait of all builders.
 * A builder lets one construct a collection incrementally, by adding
 * elements to the builder with {@link #append(Object)} and then converting
 * to the required collection type with {@link #result()}.
 * <p>
 *
 * @param <Elem> the type of elements that get added to the builder.
 * @param <To>   the type of collection that it produced.
 *
 * @since 0.1.0
 */
public interface Builder<Elem, To> {
    /**
     * Adds a single element to the builder.
     *
     * @param elem the element to be added.
     *
     * @return the builder itself.
     */
    Builder<Elem, To> append(Elem elem);

    /**
     * Clears the contents of this builder.
     * After execution of this method the builder will contain no elements.
     */
    void clear();

    /**
     * Produces a collection from the added elements.  This is a terminal operation:
     * the builder's contents are undefined after this operation, and no further
     * methods should be called.
     *
     * @return a collection containing the elements added to this builder.
     */
    To result();

    /**
     * Creates a new builder by applying a transformation function to
     * the results of this builder.
     *
     * @param f the transformation function.
     *
     * @return a new builder which is the same as the current builder except
     * that a transformation function is applied to this builder's result.
     *@
     * @note The original builder should no longer be used after `mapResult` is called.
     */
    default <NewTo> Builder<Elem, NewTo> mapResult(Function1<? super To, ? extends NewTo> f) {
        return new Builder<Elem, NewTo>() {
            Builder<Elem, To> self = Builder.this;

            public Builder<Elem, NewTo> append(Elem x) {
                self.append(x);
                return this;
            }

            public void clear() {
                self.clear();
            }

            @Override
            public NewTo result() {
                return f.invoke(self.result());
            }
        };
    }
}

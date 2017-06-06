package org.deziras.util;

import org.deziras.function.Function1;

/**
 * Created by Glavo on 17-6-6.
 *
 * @author Glavo
 * @since 0.1.0
 */
public interface Functor<A> {
    <B> Functor<B> map(Function1<A, B> mapper);
}

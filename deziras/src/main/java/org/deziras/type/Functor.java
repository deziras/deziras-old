package org.deziras.type;

import org.deziras.annotations.Covariant;
import org.deziras.function.Function1;

/**
 * Created by Glavo on 17-6-6.
 *
 * @author Glavo
 * @since 0.1.0
 */
public interface Functor<@Covariant A> {
    <B> Functor<B> map(Function1<A, B> mapper);
}

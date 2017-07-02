package org.deziras.base;

import org.deziras.annotations.Contravariant;
import org.deziras.annotations.Covariant;
import org.deziras.function.Function1;

/**
 * Created by Glavo on 17-6-6.
 *
 * @author Glavo
 * @since 0.1.0
 */
public interface Functor<@Contravariant A> {
    <@Covariant B> Functor<B> map(Function1<? super A, ? extends B> mapper);
}

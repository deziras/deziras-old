package tech.glacial;

import tech.glacial.function.Function1;

/**
 * Created by Glavo on 上午8:23.
 *
 * @author Glavo
 * @since 1.0.0
 */
public interface Functor<A> {
    <B> Functor<B> map(Function1<A, B> f);
}

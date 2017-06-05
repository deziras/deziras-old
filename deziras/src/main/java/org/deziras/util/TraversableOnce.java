package org.deziras.util;

import org.deziras.function.Function1;
import org.deziras.function.Function2;
import org.deziras.util.iterator.CanBuildFrom;
import org.deziras.function.ToVoidFunction1;

import java.util.LinkedList;
import java.util.List;


/**
 * Created by glavo on 16-12-30.
 *
 * @author Glavo
 * @since 1.0.0
 */
public interface TraversableOnce<A>
        extends java.lang.Iterable<A> {


    Iterator<A> iterator();

    default void foreach(ToVoidFunction1<? super A> f) {
        for (A a : this) {
            f.invoke(a);
        }
    }


    default <B> B foldl(B z, Function2<B, A, B> op) {
        B t = z;

        for (A a : this) {
            t = op.invoke(t, a);
        }

        return t;
    }


    default <B> B foldr(Function2<A, B, B> op, B z) {
        LinkedList<A> list = new LinkedList<>();
        for (A a : this) {
            list.push(a);
        }

        B t = z;
        for (A a : list) {
            t = op.invoke(a, t);
        }

        return t;
    }
}

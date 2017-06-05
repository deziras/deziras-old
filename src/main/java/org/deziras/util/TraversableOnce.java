package tech.glacial.util;

import tech.glacial.function.Function1;
import tech.glacial.function.IntToVoidFunction1;
import tech.glacial.function.LongToVoidFunction1;
import tech.glacial.function.ToVoidFunction1;
import tech.glacial.util.iterator.CanBuildFrom;


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

    default <From, B, To> To map(Function1<? super A, ? extends B> f
            , CanBuildFrom<From, B, To> collector) {
        From builder = collector.getBuilder();

        for (A a : this) {
            collector.append(builder, f.invoke(a));
        }

        return collector.finish(builder);
    }
}

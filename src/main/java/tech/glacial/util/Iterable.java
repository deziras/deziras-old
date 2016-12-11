package tech.glacial.util;

import tech.glacial.function.IntToVoidFunction1;
import tech.glacial.function.LongToVoidFunction1;
import tech.glacial.function.ToVoidFunction1;


/**
 * Created by glavo on 16-12-30.
 *
 * @author Glavo
 * @since 1.0.0
 */
public interface Iterable<A>
        extends java.lang.Iterable<A> {

    interface OfInt {
        void foreach(IntToVoidFunction1 f);
    }

    interface OfLong {
        void foreach(LongToVoidFunction1 f);
    }


    void foreach(ToVoidFunction1<? super A> f);

    Iterator<A> iterator();
}

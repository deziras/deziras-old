package org.deziras.util;

/**
 * Created by glavo on 17-3-19.
 *
 * @author Glavo
 * @version 1.0.0
 */
public final class Ref<A> {
    public static final class OfInt {
        public static <B> Ref<B> of(B b) {
            return new Ref<>(b);
        }

        public int value;



        public OfInt(int i) {
            this.value = i;
        }
    }



    public A value;

    public static <B> Ref<B> of(B b) {
        return new Ref<>(b);
    }

    public static Ref.OfInt ofInt(int i) {
        return new Ref.OfInt(i);
    }

    public Ref(A a) {
        this.value = a;
    }
}

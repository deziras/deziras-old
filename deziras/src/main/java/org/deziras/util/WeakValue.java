package org.deziras.util;

import org.deziras.function.Function0;

import java.lang.ref.WeakReference;

/**
 * Created by Glavo on 17-6-5.
 *
 * @author Glavo
 * @since 0.1.0
 */
public class WeakValue<A> {
    private WeakReference<A> value;
    private Function0<? extends A> supplier;


    public WeakValue(Function0<? extends A> supplier) {
        Objects.requireNonNull(supplier);
        this.supplier = supplier;
        value = new WeakReference<>(null);
    }

    public A get() {
        A a = value.get();
        if (a == null) a = Objects.requireNonNull(supplier.invoke());
        return a;
    }
}
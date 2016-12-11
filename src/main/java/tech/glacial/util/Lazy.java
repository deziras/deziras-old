package tech.glacial.util;

import tech.glacial.function.Function;
import tech.glacial.function.Function0;

/**
 * Created by glavo on 17-5-8.
 *
 * @author Glavo
 * @since 1.0.0
 */
public class Lazy<A> {
    private transient final Function0<? extends A> supplier;
    private A value = null;
    private boolean called = false;

    public Lazy(Function0<? extends A> supplier) {
        Objects.requireNonNull(supplier);
        this.supplier = supplier;
    }

    public A get() {
        if (value != null || called) return value;
        else {
            synchronized (this) {
                if (called) return value;
                value = supplier.invoke();
                called = true;
                return value;
            }
        }
    }
}

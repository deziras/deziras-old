package org.deziras.util;

import org.deziras.ToolClass;
import org.deziras.function.Function0;

/**
 * Created by glavo on 17-3-19.
 *
 * @author Glavo
 * @version 1.0.0
 */
public final class Objects extends ToolClass {
    private Objects() {
    }

    public static boolean equals(Object o1, Object o2) {
        return (o1 == o2) || (o1 != null && o1.equals(o2));
    }

    public static String toString(Object o) {
        return o == null ? "null" : o.toString();
    }

    public static <T> T requireNonNull(T var0) {
        if (var0 == null) {
            throw new NullPointerException();
        } else {
            return var0;
        }
    }

    public static <T> T requireNonNull(T var0, String var1) {
        if (var0 == null) {
            throw new NullPointerException(var1);
        } else {
            return var0;
        }
    }

    public static boolean isNull(Object var0) {
        return var0 == null;
    }

    public static boolean nonNull(Object var0) {
        return var0 != null;
    }

    public static <T> T requireNonNull(T var0, Function0<String> f) {
        if (var0 == null) {
            throw new NullPointerException(f.invoke());
        } else {
            return var0;
        }
    }
}

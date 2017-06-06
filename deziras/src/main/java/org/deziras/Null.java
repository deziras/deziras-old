package org.deziras;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.Nullable;

/**
 * Created by glavo on 17-5-7.
 *
 * @author Glavo
 * @since 1.0.0
 */
public class Null {
    @Nullable
    @Contract(pure = true)
    public static Null instance() {
        return null;
    }

    private Null() {
    }
}

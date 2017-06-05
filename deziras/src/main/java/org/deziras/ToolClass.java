package org.deziras;

/**
 * Created by glavo on 17-5-7.
 *
 * @author Glavo
 * @since 1.0.0
 */
public abstract class ToolClass {
    protected ToolClass() {
        throw new AssertionError("No " + String.valueOf(getClass()) + " instances for you!");
    }
}

package org.deziras.json;

/**
 * Created by glavo on 17-3-15.
 *
 * @author Glavo
 * @version 1.0.0
 */
public final class JSONNull implements JsonValue {
    public static final JSONNull Null = new JSONNull();

    private JSONNull() {
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        return "Null";
    }

}
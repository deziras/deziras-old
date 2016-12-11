package tech.glacial.json;

/**
 * Created by glavo on 17-3-15.
 *
 * @author Glavo
 * @version 1.0.0
 */
public final class JSONBoolean extends JSON {
    private final boolean value;

    public static final JSONBoolean True = new JSONBoolean(true);
    public static final JSONBoolean False = new JSONBoolean(false);

    private JSONBoolean(boolean b) {
        this.value = b;
    }

    public static JSONBoolean valueOf(boolean b) {
        return b ? True : False;
    }

    public static JSONBoolean valueOf(String s) {
        return valueOf(Boolean.parseBoolean(s));
    }

    public boolean get() {
        return value;
    }

    @Override
    public int hashCode() {
        return value ? 1 : 0;
    }

    @Override
    public String toString() {
        return value ? "True" : "False";
    }

    public String toString(int n) {
        return getSpaces(n) + toString();
    }
}

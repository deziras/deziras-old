package tech.glacial.json;

/**
 * Created by glavo on 17-3-15.
 *
 * @author Glavo
 * @version 1.0.0
 */
public final class JSONNull extends JSON {
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

    @Override
    public String toString(int n) {
        return getSpaces(n) + "Null";
    }
}
package tech.glacial.json;

/**
 * Created by glavo on 17-3-15.
 *
 * @author Glavo
 * @version 1.0.0
 */
public final class JsonBoolean implements JsonValue {
    private final boolean value;

    public static final JsonBoolean True = new JsonBoolean(true);
    public static final JsonBoolean False = new JsonBoolean(false);

    private JsonBoolean(boolean b) {
        this.value = b;
    }

    public static JsonBoolean valueOf(boolean b) {
        return b ? True : False;
    }

    public static JsonBoolean valueOf(String s) {
        return valueOf(Boolean.parseBoolean(s));
    }

    public boolean value() {
        return value;
    }

    @Override
    public int hashCode() {
        return value ? 1 : 0;
    }

    @Override
    public String toString() {
        return value ? "true" : "false";
    }

}

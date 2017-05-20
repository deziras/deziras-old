package tech.glacial.json;

import java.util.*;

/**
 * Created by glavo on 17-3-15.
 *
 * @author Glavo
 * @version 1.0.0
 */
public final class JsonArray implements JsonStructure {

    private final List<JsonValue> value;


    public JsonArray(JsonValue[] v) {
        this.value = new ArrayList<>(Arrays.asList(v));
    }

    void append(JsonValue v) {
        value.add(v);
    }

    public JsonValue get(int index) {
        return value.get(index);
    }


    public String toString() {
        return value == null ? "[]" : value.toString();
    }

}


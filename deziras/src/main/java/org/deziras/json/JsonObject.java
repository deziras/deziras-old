package org.deziras.json;

import java.util.*;

/**
 * Created by glavo on 17-3-15.
 *
 * @author Glavo
 * @since 1.0.0
 */
public final class JsonObject implements JsonStructure {
    private final Map<JsonString, JsonValue> values;

    public JsonObject() {
        values = new LinkedHashMap<>();
    }

    public JsonValue get(JsonString js) {
        return values.get(js);
    }

    public JsonValue get(String s) {
        return get(JsonString.valueOf(s));
    }

    public JsonArray getArray(String s) {
        return (JsonArray) get(s);
    }

    public JsonNumber getNumber(String s) {
        return (JsonNumber) get(s);
    }

    public JsonBoolean getBoolean(String s) {
        return (JsonBoolean) get(s);
    }

    void put(JsonString k, JsonValue v) {
        values.put(k, v);
    }

    void put(String k, JsonValue v) {
        values.put(JsonString.valueOf(k), v);
    }

    @Override
    public String toString() {
        return "{" +
                values.toString() +
                "}";
    }
}

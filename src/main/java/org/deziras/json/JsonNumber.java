package tech.glacial.json;

import java.math.*;

/**
 * Created by glavo on 17-3-15.
 *
 * @author Glavo
 * @version 1.0.0
 */
public final class JsonNumber extends Number implements JsonValue {
    private final BigDecimal value;

    public static JsonNumber valueOf(String s) {
        return new JsonNumber(s);
    }

    public JsonNumber(String s) {
        this.value = new BigDecimal(s);
    }

    @Override
    public int intValue() {
        return value.intValue();
    }

    @Override
    public long longValue() {
        return value.longValue();
    }

    @Override
    public float floatValue() {
        return value.floatValue();
    }

    @Override
    public double doubleValue() {
        return value.doubleValue();
    }

    public BigDecimal getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value.toString();
    }
}

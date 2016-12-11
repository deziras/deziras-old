package tech.glacial.json;

import java.math.*;

/**
 * Created by glavo on 17-3-15.
 *
 * @author Glavo
 * @version 1.0.0
 */
public final class JSONNumber extends JSON {
    private final String value;

    public static JSONNumber valueOf(String s) {
        return new JSONNumber(s);
    }

    private JSONNumber(String s) {
        this.value = s;
    }

    public boolean isInteger() {
        try {
            new BigInteger(value);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    public long getLong() {
        if (isInteger()) return Long.parseLong(value);
        else return (long) getDouble();
    }

    public int getInt() {
        if (isInteger()) return Integer.parseInt(value);
        else return (int) getDouble();
    }

    public double getDouble() {
        return Double.parseDouble(value);
    }

    public BigInteger getBigInteger() {
        return isInteger() ? new BigInteger(value) : new BigDecimal(value).toBigInteger();
    }

    public BigDecimal getBigDecimal() {
        return new BigDecimal(value);
    }

    @Override
    public int hashCode() {
        return getBigDecimal().hashCode();
    }

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object obj) {
        return obj.getClass() == getClass() && ((JSONNumber) obj).getBigDecimal().equals(getBigDecimal());
    }
}

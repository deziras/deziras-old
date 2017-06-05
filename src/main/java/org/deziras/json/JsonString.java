package tech.glacial.json;

import java.io.IOException;
import java.io.StringReader;

/**
 * Created by glavo on 17-3-15.
 *
 * @author Glavo
 * @version 1.0.0
 */
public final class JsonString implements JsonValue {
    private final String value;

    public JsonString(String v) {
        this.value = v;
    }

    public static JsonString parseString(String s) throws IOException {
        StringReader sr = new StringReader(s.substring(1, s.length() - 1));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int ci;
            char c;
            if ((ci = sr.read()) == -1) break;

            c = (char) ci;

            switch (c) {
                case '\\':
                    if ((ci = sr.read()) == -1)
                        throw new JsonParseException("parse failed ");
                    c = (char) ci;
                    switch (c) {
                        case '\\':
                            sb.append('\\');
                            continue;
                        case '\"':
                            sb.append('\"');
                            continue;
                        case '/':
                            sb.append('/');
                            continue;
                        case 'b':
                            sb.append('\b');
                            continue;
                        case 'f':
                            sb.append('\f');
                            continue;
                        case 'n':
                            sb.append('\n');
                            continue;
                        case 'r':
                            sb.append('\r');
                            continue;
                        case 't':
                            sb.append('\t');
                            continue;
                        case 'u':
                            String sbb = String.valueOf((char) sr.read()) +
                                    (char) sr.read() +
                                    (char) sr.read() +
                                    (char) sr.read();
                            int ii =
                                    Integer.parseInt(sbb, 16);

                            sb.append((char) ii);
                            continue;
                    }
                default:
                    sb.append(c);
            }
        }

        return new JsonString(sb.toString());
    }

    public static JsonString valueOf(String s) {
        return new JsonString(s);
    }

    public String getValue() {
        return value;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return obj.getClass() == getClass() && ((JsonString) obj).value.equals(value);
    }

    @Override
    public String toString() {
        return "\"" + value + "\"";
    }
}
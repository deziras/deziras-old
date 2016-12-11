package tech.glacial.json;

import java.io.IOException;
import java.io.StringReader;

/**
 * Created by glavo on 17-3-15.
 *
 * @author Glavo
 * @version 1.0.0
 */
public final class JSONString extends JSON {
    private final String value;

    public JSONString(String v) {
        this.value = v;
    }

    public static JSONString parseString(String s) throws IOException, StringParseException {
        StringReader sr = new StringReader(s.substring(1, s.length() - 1));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int ci;
            char c;
            if ((ci = sr.read()) == -1) break;

            c = (char) ci;

            switch (c) {
                case '\\':
                    if ((ci = sr.read()) == -1) throw new StringParseException("Failed at " + c);
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
                            StringBuilder sbb = new StringBuilder();
                            sbb.append((char) sr.read());
                            sbb.append((char) sr.read());
                            sbb.append((char) sr.read());
                            sbb.append((char) sr.read());
                            int ii =
                                Integer.parseInt(sbb.toString(), 16);

                            sb.append((char) ii);
                            continue;
                    }
                default:
                    sb.append(c);
            }
        }

        return new JSONString(sb.toString());
    }

    public static JSONString valueOf(String s) {
        return new JSONString(s);
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
        return obj.getClass() == getClass() && ((JSONString) obj).value.equals(value);
    }

    @Override
    public String toString() {
        return "\"" + value + "\"";
    }
}
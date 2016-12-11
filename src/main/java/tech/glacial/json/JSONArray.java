package tech.glacial.json;

import java.util.*;

/**
 * Created by glavo on 17-3-15.
 *
 * @author Glavo
 * @version 1.0.0
 */
public final class JSONArray extends JSON {

    private final JSON[] value;

    public JSONArray(JSON[] v) {
        this.value = v;
    }

    public JSON get(int index) {
        return value[index];
    }

    public String toString() {
        int length = value.length;
        if (length == 0) {
            return "[]";
        } else if (length == 1) {
            return "[" + value[0] + "]";
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            sb.append(value[0].toString(1));
            for (int i = 1; i < length; i++) {
                sb.append(",\n" + value[i].toString(1));
            }
            return sb.append("]").toString();
        }
    }

    static final class JSONArrayBuffer {
        private List<JSON> l;

        JSONArrayBuffer() {
            l = new ArrayList<JSON>();
        }

        void append(JSON j) {
            l.add(j);
        }

        JSONArray result() {
            return new JSONArray(l.toArray(new JSON[0]));
        }

        int getSize() {
            return l.size();
        }
    }
}


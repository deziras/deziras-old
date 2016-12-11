package tech.glacial.json;

import java.util.*;

/**
 * Created by glavo on 17-3-15.
 *
 * @author Glavo
 * @version 1.0.0
 */
public final class JSONObject extends JSON {
    private final Map<JSONString, JSON> values;

    public JSONObject() {
        values = new Map<JSONString, JSON>() {
            private ArrayList<JSONString> keys = new ArrayList<JSONString>();
            private ArrayList<JSON> values = new ArrayList<JSON>();

            public int size() {
                return keys.size();
            }

            public boolean isEmpty() {
                return keys.isEmpty();
            }

            public boolean containsKey(Object key) {
                return keys.contains(key);
            }

            public boolean containsValue(Object value) {
                return values.contains(value);
            }

            public JSON get(Object key) {

                for (int i = 0; i < keys.size(); i++) {
                    if (keys.get(i).equals(key)) return values.get(i);
                }

                return null;
            }

            public JSON put(JSONString key, JSON value) {
                boolean flag = true;
                for (int i = 0; i < keys.size(); i++) {
                    if (keys.get(i).equals(key)) {
                        values.set(i, value);
                        flag = false;
                        break;
                    }
                }

                if (flag) {
                    keys.add(key);
                    values.add(value);
                }

                return value;
            }

            public JSON remove(Object key) {
                return null;
            }

            public void putAll(Map<? extends JSONString, ? extends JSON> t) {
                //TODO
            }

            public void clear() {
                keys.clear();
                values.clear();
            }

            public Set<JSONString> keySet() {
                HashSet<JSONString> hs = new HashSet<JSONString>();
                hs.addAll(keys);
                return hs;
            }

            public Collection<JSON> values() {
                return values;
            }

            public Set<Entry<JSONString, JSON>> entrySet() {
                HashSet<Entry<JSONString, JSON>> hs = new HashSet<Entry<JSONString, JSON>>();

                for (int i = 0; i < keys.size(); i++) {
                    final JSONString k = keys.get(i);
                    final JSON v = values.get(i);
                    hs.add(new Entry<JSONString, JSON>() {
                        public JSONString getKey() {
                            return k;
                        }

                        public JSON getValue() {
                            return v;
                        }

                        public JSON setValue(JSON value) {
                            return put(getKey(), value);
                        }
                    });
                }

                return new HashSet<Entry<JSONString, JSON>>();
            }

            @Override
            public String toString() {

                if (keys.size() == 0) return "";
                else {
                    StringBuilder sb = new StringBuilder();

                    sb.append(getSpaces(1) + keys.get(0) + ":" + values.get(0));
                    for (int i = 1; i < keys.size(); i++) {
                        sb.append(",\n" + getSpaces(1) + keys.get(i) + ":" + values.get(i));
                    }
                    return sb.toString();
                }

            }
        };
    }

    public JSON get(JSONString js) {
        return values.get(js);
    }

    public JSON get(String s) {
        return get(JSONString.valueOf(s));
    }

    public JSONArray getArray(String s) {
        return (JSONArray) get(s);
    }

    public JSONNumber getNumber(String s) {
        return (JSONNumber) get(s);
    }

    public JSONBoolean getBoolean(String s) {
        return (JSONBoolean) get(s);
    }

    void put(JSONString k, JSON v) {
        values.put(k, v);
    }

    void put(String k, JSON v) {
        values.put(JSONString.valueOf(k), v);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        sb.append(values.toString());
        sb.append("}");


        return sb.toString();
    }
}

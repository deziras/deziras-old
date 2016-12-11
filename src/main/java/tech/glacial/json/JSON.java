package tech.glacial.json;


public abstract class JSON {
    static String getSpaces(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append("  ");
        }
        return sb.toString();
    }

    public String toString(int n) {
        StringBuilder sb = new StringBuilder();
        for (String s : toString().split("\n")) {
            sb.append(getSpaces(n) + s);
        }
        return sb.toString();
    }
}
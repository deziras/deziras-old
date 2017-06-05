package org.deziras.json;

import java.io.IOException;
import java.io.PushbackReader;
import java.io.Reader;

/**
 * Created by Glavo on 下午5:33.
 *
 * @author Glavo
 * @since 1.0.0
 */
public class JsonReader {
    private enum Status {
        InArray,
        InObject
    }

    PushbackReader reader;


    public JsonReader(Reader reader) {
        this.reader = new PushbackReader(reader, 1);
    }

    private void skip() throws IOException {
        for (; ; ) {
            int i = reader.read();
            if (i == -1) return;
            if (Character.isWhitespace(i)) continue;

            reader.unread(i);
            return;
        }
    }
}

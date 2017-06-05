package org.deziras.json;

/**
 * Created by Glavo on 下午4:59.
 *
 * @author Glavo
 * @since 1.0.0
 */
public class JsonParseException extends RuntimeException {
    public JsonParseException() {

    }

    public JsonParseException(String message) {
        super(message);
    }
}

package tech.glacial.util;

/**
 * Created by glavo on 17-4-28.
 *
 * @author Glavo
 * @since 1.0.0
 */
public class Exceptions {
    @SuppressWarnings("unchecked")
    public static <T extends Exception> void rethrow(Exception t) throws T {
        throw (T) t;
    }
}

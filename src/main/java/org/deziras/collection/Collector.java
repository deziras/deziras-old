package tech.glacial.collection;

/**
 * Created by glavo on 17-3-18.
 *
 * @author Glavo
 * @version 0.1.0
 */
public interface Collector<From, Elem, To> {
    From newBuilder();
    void append(From f, Elem e);
    To result(From f);
}

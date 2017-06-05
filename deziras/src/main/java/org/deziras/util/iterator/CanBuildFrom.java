package org.deziras.util.iterator;

/**
 * Created by Glavo on 下午11:22.
 *
 * @author Glavo
 * @since 1.0.0
 */
public interface CanBuildFrom<From, Elem, To> {
    From getBuilder();
    void append(From from, Elem elem);
    To finish(From from);
}

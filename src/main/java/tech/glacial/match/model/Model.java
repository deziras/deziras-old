package tech.glacial.match.model;

import tech.glacial.util.Option;

/**
 * Created by glavo on 17-5-8.
 *
 * @author Glavo
 * @since 1.0.0
 */
public abstract class Model<R> {
    public abstract Option<? extends R> execut(Object obj);
}

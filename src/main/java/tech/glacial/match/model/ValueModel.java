package tech.glacial.match.model;

import tech.glacial.util.Option;

/**
 * Created by glavo on 17-5-8.
 *
 * @author Glavo
 * @since 1.0.0
 */
public class ValueModel<A> extends Model {
    private final A value;

    public ValueModel(A value) {
        this.value = value;

    }

    public Option<?> match(Object obj) {
        return null;
    }
}

package tech.glacial.match.model;

import tech.glacial.function.Function1;
import tech.glacial.util.Objects;
import tech.glacial.util.Option;

/**
 * Created by glavo on 17-5-8.
 *
 * @author Glavo
 * @since 1.0.0
 */
public class TypeModel<A, R> extends Model<R> {
    private final Class<A> type;
    private final Function1<? super A, ? extends R> f;

    public TypeModel(Class<A> type, Function1<? super A, ? extends R> f) {
        Objects.requireNonNull(type);
        Objects.requireNonNull(f);

        this.type = type;
        this.f = f;
    }

    @SuppressWarnings("unchecked")
    public Option<? extends R> execut(Object obj) {
        if (obj == null || (!type.isInstance(obj))) return Option.empty();

        return Option.of(f.invoke((A) obj));
    }
}

package tech.glacial.match.model;

import tech.glacial.Tuple1;
import tech.glacial.Unit;
import tech.glacial.function.Function0;
import tech.glacial.function.Function1;
import tech.glacial.util.Objects;
import tech.glacial.util.Option;

/**
 * Created by glavo on 17-5-8.
 *
 * @author Glavo
 * @since 1.0.0
 */
public abstract class PatternModel<R> extends Model<R> {
    public static final class PatternModel0<R> extends PatternModel<R> {
        private final Function1<? super Object, ? extends Option<Unit>> model;
        private final Function0<? extends R> body;

        public PatternModel0(Function1<? super Object,
                ? extends Option<Unit>> model, Function0<? extends R> body) {
            Objects.requireNonNull(model);
            Objects.requireNonNull(body);

            this.model = model;
            this.body = body;
        }

        public Option<? extends R> execut(Object obj) {
            if (model.invoke(obj).isEmpty()) return Option.empty();
            return Option.of(body.invoke());
        }
    }

    public static final class PatternModel1<T1, R> extends PatternModel<R> {
        private final Function1<? super Object, Option<Tuple1<? extends T1>>> model;
        private final Function1<? super T1, ? extends R> body;

        public PatternModel1(Function1<? super Object, Option<Tuple1<? extends T1>>> model,
                             Function1<? super T1, ? extends R> body) {
            Objects.requireNonNull(model);
            Objects.requireNonNull(body);

            this.model = model;
            this.body = body;
        }

        public Option<? extends R> execut(Object obj) {
            Option<Tuple1<? extends T1>> t = model.invoke(obj);
            if (t.isEmpty()) return Option.empty();
            return Option.of(body.invoke(t.get()._1()));
        }
    }
}

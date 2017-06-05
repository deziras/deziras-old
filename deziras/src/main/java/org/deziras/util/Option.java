package org.deziras.util;

import org.deziras.Equals;
import org.deziras.Null;
import org.deziras.function.Function0;
import org.deziras.function.Function1;
import org.deziras.function.ToBoolFunction1;
import org.deziras.function.ToVoidFunction1;
import org.deziras.util.iterator.UniformIterator;

import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * Created by glavo on 16-12-30.
 *
 * @author Glavo
 * @since 1.0.0
 */
public class Option<A> implements TraversableOnce<A>, Serializable, Equals, Function0<A> {

    private static final long serialVersionUID = -2936428877283252528L;

    @SuppressWarnings("unchecked")
    public <A> Option<A> narrow(Option<? extends A> opt) {
        return (Option<A>) opt;
    }

    public static final Option<Null> None = new Option<>();

    public static final Option<Null> Null = new Option<>(null);

    @SuppressWarnings("unchecked")
    public static <A> Option<A> none() {
        return (Option<A>) None;
    }

    @SuppressWarnings("unchecked")
    public static <A> Option<A> some(A value) {
        return value == null ? (Option<A>) Null : new Option<>(value);
    }

    public static <A> Option<A> of(A a) {
        return a == null ? Option.none() : new Option<>(a);
    }

    public final class OptionIterator extends UniformIterator<A> {
        public A get() {
            return Option.this.get();
        }
    }

    private final boolean empty;
    private final A value;


    private Option() {
        empty = true;
        value = null;
    }

    private Option(A value) {
        empty = false;
        this.value = value;
    }

    public void foreach(ToVoidFunction1<? super A> f) {
        Objects.requireNonNull(f);
        if (!empty) f.invoke(value);
    }

    public <B> Option<B> map(Function1<? super A, ? extends B> mapper) {
        return empty ? none() : Option.of(mapper.invoke(value));
    }

    public Option<A> filter(ToBoolFunction1<A> f) {
        return Objects.requireNonNull(f).invoke(value) ? this : none();
    }

    public Option<A> filterNot(ToBoolFunction1<A> f) {
        return Objects.requireNonNull(f).invoke(value) ? none() : this;
    }

    public Iterator<A> iterator() {
        return empty ? Iterators.empty() : new OptionIterator();
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean nonEmpty() {
        return !empty;
    }

    public A get() {
        if (empty) {
            throw new NoSuchElementException("Option is empty!");
        } else {
            return value;
        }
    }

    @SuppressWarnings("unchecked")
    public A orElse(Function0<? extends A> f) {
        return empty ? f.invoke() : value;
    }

    public A orDefault(A a) {
        return empty ? a : value;
    }

    public A orNull() {
        return empty ? null : value;
    }

    public A orElseGet(Option<? extends A> other) {
        return empty ? other.get() : value;
    }

    public <T extends Throwable> A orThrow(T t) throws T {
        throw t;
    }

    public <T extends Throwable> A orThrow(Function0<? extends T> t) throws T {
        throw t.invoke();
    }

    public A invoke() {
        return get();
    }

    @Override
    public String toString() {
        return empty ? "None" : "Option(" + Objects.toString(value) + "";
    }

    public boolean canEqual(Object that) {
        return that == this || that != null && that instanceof Option<?>;
    }

    @Override
    public boolean equals(Object obj) {
        return canEqual(obj) && (empty ? obj == this : ((Option<?>) obj).value.equals(value));
    }

    private Object readResolve() throws ObjectStreamException {
        return empty ? none() : (value == null ? Null : this);
    }
}

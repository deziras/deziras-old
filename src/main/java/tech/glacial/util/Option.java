package tech.glacial.util;

import tech.glacial.Equals;
import tech.glacial.Null;
import tech.glacial.function.*;
import tech.glacial.util.iterator.UniformIterator;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;

/**
 * Created by glavo on 16-12-30.
 *
 * @author Glavo
 * @since 1.0.0
 */
public class Option<A> implements Iterable<A>, Serializable, Equals, Function0<A> {

    private static final long serialVersionUID = -2936428877283252528L;


    public final class OptionIterator extends UniformIterator<A> {
        public A get() {
            return Option.this.get();
        }
    }

    public static final Option<Null> None = new Option<Null>();

    @SuppressWarnings("unchecked")
    public static <A> Option<A> empty() {
        return (Option<A>) None;
    }

    public static <A> Option<A> of(A a) {
        return a == null ? Option.<A>empty() : new Option<A>(a);
    }

    private final boolean empty;
    private final A value;


    private Option() {
        empty = true;
        value = null;
    }

    private Option(A value) {
        Objects.requireNonNull(value);
        empty = false;
        this.value = value;
    }

    public void foreach(ToVoidFunction1<? super A> f) {
        Objects.requireNonNull(f);
        if (!empty) f.invoke(value);
    }

    public <B> Option<B> map(Function1<? super A, ? extends B> mapper) {
        return empty ? Option.<B>empty() : Option.of(mapper.invoke(value));
    }

    public Option<A> filter(ToBoolFunction1<A> f) {
        return Objects.requireNonNull(f).invoke(value) ? this : Option.<A>empty();
    }

    public Option<A> filterNot(ToBoolFunction1<A> f) {
        return Objects.requireNonNull(f).invoke(value) ? Option.<A>empty() : this;
    }

    public Iterator<A> iterator() {
        return empty ? Iterators.<A>empty() : new OptionIterator();
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

    public A getOrDefault(A defaultValue) {
        return empty ? defaultValue : value;
    }

    public A getOrElse(Function0<? extends A> f) {
        return empty ? f.invoke() : value;
    }

    @SuppressWarnings("unchecked")
    public Option<A> orElse(Function0<? extends Option<? extends A>> f) {
        return empty ? (Option<A>) f.invoke() : this;
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
        return empty ? Option.empty() : this;
    }
}

package org.deziras.util;

import org.deziras.Equals;
import org.deziras.Null;
import org.deziras.annotations.Covariant;
import org.deziras.function.Function0;
import org.deziras.function.Function1;
import org.deziras.function.ToBoolFunction1;
import org.deziras.function.ToVoidFunction1;
import org.deziras.util.iterator.UniformIterator;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.Optional;

/**
 * Represents optional values.
 *
 * @param <A> The type of the optional value.
 *
 * @author Glavo
 * @since 0.1.0
 */
public final class Option<@Covariant A>
        implements TraversableOnce<A>, Serializable, Equals, Function0<A> {

    private static final long serialVersionUID = -2936428877283252528L;

    /**
     * Narrows a widened {@code Option<? extends T>} to {@code Option<T>}
     * by performing a type-safe cast.
     *
     * @param option A {@code Option}.
     * @param <A>    Component type of the {@code Option}.
     *
     * @return the given {@code option} instance as narrowed type {@code Option<T>}.
     */
    @SuppressWarnings("unchecked")
    public static <A> Option<A> narrow(Option<? extends A> option) {
        return (Option<A>) option;
    }

    /**
     * This object represents non-existent values.
     */
    public static final Option<Null> None = new Option<>();

    public static final Option<Null> Null = new Option<>(null);

    /**
     * Returns an empty {@code Option} instance.  No value is present for this
     * Option.
     *
     * @param <A> Type of the non-existent value
     *
     * @return an empty {@code Option}
     *
     * @note Though it may be tempting to do so, avoid testing if an object
     * is empty by comparing with {@code ==} against instances returned by
     * {@code Option.none()}. There is no guarantee that it is a singleton.
     * Instead, use {@link #isEmpty()}.
     */
    @SuppressWarnings("unchecked")
    public static <A> Option<A> none() {
        return (Option<A>) None;
    }

    @SuppressWarnings("unchecked")
    public static <A> Option<A> some(A value) {
        return value == null ? (Option<A>) Null : new Option<>(value);
    }

    /**
     * Returns an {@code Option} describing the specified value, if non-null,
     * otherwise returns an empty {@code Option}.
     *
     * @param <A>   the class of the value
     * @param value the possibly-null value to describe
     *
     * @return an {@code Option} with a present value if the specified value
     * is non-null, otherwise an empty {@code Option}
     */
    public static <A> Option<A> of(A value) {
        return value == null ? Option.none() : new Option<>(value);
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


    public Iterator<A> iterator() {
        return empty ? Iterators.empty() : new OptionIterator();
    }

    /**
     * Returns true if the option is {@link #None}, false otherwise.
     */
    public boolean isEmpty() {
        return empty;
    }

    /**
     * Returns true if the option isn't {@link #None}, false otherwise.
     */
    public boolean nonEmpty() {
        return !empty;
    }

    /**
     * Returns the option's value.
     *
     * @throws java.util.NoSuchElementException if the option is empty.
     * @note The option must be nonempty.
     */
    public A get() {
        if (empty) {
            throw new NoSuchElementException("Option is empty!");
        } else {
            return value;
        }
    }

    /**
     * Returns the option's value.
     *
     * @throws java.util.NoSuchElementException if the option is empty.
     * @note The option must be nonempty.
     * @see #get()
     */
    public A getValue() {
        if (empty) {
            throw new NoSuchElementException("Option is empty!");
        } else {
            return value;
        }
    }

    /**
     * Returns the option's value.
     *
     * @throws java.util.NoSuchElementException if the option is empty.
     * @note The option must be nonempty.
     * @see #get()
     */
    public A invoke() {
        return get();
    }

    /**
     * Returns the option's value if the option is nonempty, otherwise
     * return the result of evaluating {@code f}.
     *
     * @param f the default expression.
     */
    @SuppressWarnings("unchecked")
    public A orElse(Function0<? extends A> f) {
        return empty ? f.invoke() : value;
    }

    /**
     * Returns the option's value if the option is nonempty, otherwise
     * return the default value {@code a}.
     *
     * @param a the default value.
     */
    public A orDefault(A a) {
        return empty ? a : value;
    }

    /**
     * Returns the option's value if it is nonempty, or {@code null}
     * if it is empty.
     */
    public A orNull() {
        return empty ? null : value;
    }


    /**
     * Return the contained value, if present, otherwise throw an exception
     * to be created by the provided supplier.
     *
     * @param <T>               Type of the exception to be thrown
     * @param exceptionSupplier The supplier which will return the exception to
     *                          be thrown
     *
     * @return the present value
     *
     * @throws T                    if there is no value present
     * @throws NullPointerException if no value is present and
     *                              {@code exceptionSupplier} is null
     * @note A method reference to the exception constructor with an empty
     * argument list can be used as the supplier. For example,
     * {@code IllegalStateException::new}
     */
    public <T extends Throwable> A orThrow(Function0<? extends T> exceptionSupplier) throws T {
        throw exceptionSupplier.invoke();
    }

    /**
     * Apply the given procedure {@code f} to the option's value,
     * if it is nonempty. Otherwise, do nothing.
     *
     * @param f the procedure to apply.
     */
    public void foreach(ToVoidFunction1<? super A> f) {
        Objects.requireNonNull(f);
        if (!empty) f.invoke(value);
    }

    /**
     * Returns a {@link Option} containing the result of applying {@code mapper}
     * to this {@link Option}'s value if this {@link Option} is nonempty.
     * Otherwise return {@link #None}.
     *
     * @param mapper the function to apply
     */
    public <B> Option<B> map(Function1<? super A, ? extends B> mapper) {
        return empty ? none() : Option.of(mapper.invoke(value));
    }

    /**
     * Returns a {@link Option} containing the result of applying {@code mapper}
     * to this {@link Option}'s value if this {@link Option} is nonempty.
     * Otherwise return {@link #Null}.
     *
     * @param mapper the function to apply
     */
    public <B> Option<B> mapToSome(Function1<? super A, ? extends B> mapper) {
        return empty ? none() : Option.of(mapper.invoke(value));
    }

    /**
     * Returns this {@link Option} if it is nonempty <em>and</em> applying the
     * predicate {@code p} to this {@link Option}'s value returns true. Otherwise,
     * return {@link #None}.
     *
     * @param p the predicate used for testing.
     */
    public Option<A> filter(ToBoolFunction1<A> p) {
        return Objects.requireNonNull(p).invoke(value) ? this : none();
    }

    /**
     * Returns this {@link Option} if it is nonempty <em>and</em> applying the
     * predicate {@code p} to this {@link Option}'s value returns false. Otherwise,
     * return {@link #None}.
     *
     * @param p the predicate used for testing.
     */
    public Option<A> filterNot(ToBoolFunction1<A> p) {
        return Objects.requireNonNull(p).invoke(value) ? none() : this;
    }


    /**
     *
     */
    public Optional<A> asJava() {
        return Optional.ofNullable(value);
    }

    @Override
    public String toString() {
        if (empty) {
            return "None";
        } else {
            return "Some(" + Objects.toString(value) + ")";
        }
    }

    public boolean canEqual(Object that) {
        return that == this || that instanceof Option<?>;
    }

    @Override
    public boolean equals(Object obj) {
        if (!canEqual(obj)) {
            return false;
        }

        Option<?> opt = (Option<?>) obj;

        if (empty || opt.empty) {
            return obj == this;
        } else {
            return Objects.equals(((Option<?>) obj).value, value);
        }
    }

    private Object readResolve() throws ObjectStreamException {
        return empty ? none() : (value == null ? Null : this);
    }
}

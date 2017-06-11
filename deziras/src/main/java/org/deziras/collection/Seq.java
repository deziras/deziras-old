package org.deziras.collection;

import org.deziras.function.Function1;
import org.deziras.function.IntFunction1;
import org.deziras.function.ToBoolFunction1;

/**
 * Created by Glavo on 17-6-10.
 *
 * @author Glavo
 * @since 0.1.0
 */
public interface Seq<E>
		extends Collection<E>, IntFunction1<E> {

	@Override
	<New> Builder<? super New, ? extends Seq<New>> newBuilder();

	@Override
	@SuppressWarnings("unchecked")
	default <B> Seq<B> map(Function1<? super E, ? extends B> mapper) {
		return (Seq<B>)Collection.super.map(mapper);
	}

	@Override
	@SuppressWarnings("unchecked")
	default Seq<E> filter(ToBoolFunction1<? super E> p) {
		return (Seq<E>)Collection.super.filter(p);
	}

	@Override
	@SuppressWarnings("unchecked")
	default Seq<E> filterNot(ToBoolFunction1<? super E> p) {
		return (Seq<E>)Collection.super.filterNot(p);
	}
}

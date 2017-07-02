package org.deziras;

import org.deziras.function.Function1;


/**
 * Created by ice1000 on 17-7-2.
 *
 * @author ice1000
 */
public abstract class Either<L, R> {
	private Either() {
	}

	public abstract <T> T map(Function1<L, T> lt, Function1<R, T> rt);

	public static <L, R> Either<L, R> left(L l) {
		return new Either<L, R>() {
			@Override
			public <T> T map(Function1<L, T> lt, Function1<R, T> rt) {
				return lt.invoke(l);
			}

			@Override
			@SuppressWarnings("unchecked")
			public boolean equals(Object rhs) {
				return rhs instanceof Either<?, ?> && ((Either<L, R>) rhs).map(l::equals, rr -> false);
			}
		};
	}

	public static <L, R> Either<L, R> right(R r) {
		return new Either<L, R>() {
			@Override
			public <T> T map(Function1<L, T> lt, Function1<R, T> rt) {
				return rt.invoke(r);
			}

			@Override
			@SuppressWarnings("unchecked")
			public boolean equals(Object rhs) {
				return rhs instanceof Either<?, ?> && ((Either<L, R>) rhs).map(ll -> false, r::equals);
			}
		};
	}
}


package org.deziras.type;

import org.deziras.annotations.Covariant;
import org.deziras.function.Function1;

/**
 * Created by ice1000 on 17-7-2.
 *
 * @author ice1000
 */
public interface Monad<@Covariant A> {
	<B> Monad<B> flatMap(Function1<A, Monad<B>> mapper);
}

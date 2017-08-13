package org.deziras.util;

import org.deziras.Nothing;
import sun.misc.Unsafe;


/**
 * Created by glavo on 17-4-28.
 *
 * @author Glavo
 */
public class Try<A> {
	@SuppressWarnings("unchecked")
	public static <T extends Throwable> void throwAs(Throwable t) throws T {
		throw (T) t;
	}

	public static Nothing throwException(Throwable t) {
		Try.throwAs(t);
		assert false;
		return null;
	}

	public static <T extends Throwable> void _throws() throws T {

	}

	public static <T1 extends Throwable> void _throws(Class<T1> c1) throws T1 {

	}

	public static <T1 extends Throwable, T2 extends Throwable>
	void _throws(Class<T1> c1, Class<T2> c2) throws T1, T2 {
	}

	public static <T1 extends Throwable, T2 extends Throwable, T3 extends Throwable>
	void _throws(Class<T1> c1, Class<T2> c2, Class<T3> c3) throws T1, T2, T3 {
	}


}

package org.deziras;

import org.deziras.annotations.Contravariant;

/**
 * Created by glavo on 17-3-19.
 *
 * @author Glavo
 * @since 1.0.0
 */
public final class Nothing extends Null {
	private Nothing() {
	}

	/**
	 * Nothing cannot have instance
	 * So this method is invoked, `NullPointerException` will be thrown first.
	 *
	 * @param <T> any type
	 * @return an absurd value
	 */
	public <@Contravariant T> T absurd() {
		throw new UnsupportedOperationException("calling absurd!");
	}
}

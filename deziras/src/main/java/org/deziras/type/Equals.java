package org.deziras.type;

/**
 * An interface containing operations for equality.
 *
 * @author Glavo
 * @version 1.0.0
 */
public interface Equals {
	/**
	 * A method that should be called from every well-designed equals method
	 * that is open to be overridden in a subclass.
	 *
	 * @param that the value being probed for possible equality
	 *
	 * @return true if this instance can possibly equal {@code that}, otherwise false
	 */
	default boolean canEqual(Object that) {
		return that != null && that.getClass() == getClass();
	}

	/**
	 * The universal equality method defined in {@link Object}.
	 */
	boolean equals(Object o);
}

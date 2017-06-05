package org.deziras.util;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Glavo on 上午8:39.
 *
 * @author Glavo
 * @since 1.0.0
 */
public class TryTest {
    private class CheckedException extends Exception {

    }

    @Test(expected = CheckedException.class)
    public void testThrow() {
        try {
            Try.throw_(new CheckedException());
            Try.<CheckedException>throws_();
            fail();
        } catch (CheckedException ignored) {

        }

        Try.throw_(new CheckedException());
    }

}
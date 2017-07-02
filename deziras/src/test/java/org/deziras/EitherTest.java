package org.deziras;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by ice1000 on 17-7-2.
 *
 * @author ice1000
 */
public class EitherTest {
    @Test
    public void left() throws Exception {
        assertEquals(new Long(233L), Either.left(666).map(integer -> integer - 433L, Object::hashCode));
    }

    @Test
    public void right() throws Exception {
        assertEquals(new Long(666L), Either.left(233).map(integer -> integer + 433L, Object::hashCode));
    }
}
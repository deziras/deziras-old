package org.deziras.util;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by glavo on 17-5-7.
 *
 * @author Glavo
 * @since 1.0.0
 */
public class OptionTest {
    @Test
    public void testEmpty() throws Exception {
        assertNotEquals(Option.empty(), Option.of(""));
        assertNotEquals(Option.empty(), Option.of(0));
        assertEquals(Option.empty(), Option.None);
    }

    @Test
    public void testOf() throws Exception {
        assertEquals(Option.of(0), Option.of(0));
    }

    @Test
    public void testGet() {

    }

}
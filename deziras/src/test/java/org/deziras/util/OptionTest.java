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
        assertNotEquals(Option.none(), Option.of(""));
        assertNotEquals(Option.none(), Option.of(0));
        assertEquals(Option.none(), Option.None);
        assertNotEquals(Option.Null, Option.None);
    }

    @Test
    public void testOf() throws Exception {
        assertEquals(Option.of(0), Option.of(0));
    }

    @Test
    public void testGet() {
        final Option<String> stringOption = Option.of("Option");
    }

    @Test
    public void testToString() {
        assertEquals(Option.of("Opt").toString(), "Some(Opt)");
    }

}
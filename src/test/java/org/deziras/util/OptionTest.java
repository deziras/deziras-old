package tech.glacial.util;

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
    public void foreach() throws Exception {
    }

    @Test
    public void map() throws Exception {
    }

    @Test
    public void filter() throws Exception {
    }

    @Test
    public void filterNot() throws Exception {
    }

    @Test
    public void iterator() throws Exception {
    }

    @Test
    public void isEmpty() throws Exception {
    }

    @Test
    public void nonEmpty() throws Exception {
    }

    @Test
    public void get() throws Exception {
    }

    @Test
    public void getOrDefault() throws Exception {
    }

    @Test
    public void getOrElse() throws Exception {
    }

    @Test
    public void orElse() throws Exception {
    }

}
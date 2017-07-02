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
        assertEquals(Either.left());
    }

    @Test
    public void right() throws Exception {
    }

}
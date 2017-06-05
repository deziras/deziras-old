package tech.glacial;

import org.junit.Test;
import tech.glacial.helper.TestData;

import java.io.Serializable;

import static org.junit.Assert.*;

/**
 * Created by glavo on 17-5-6.
 *
 * @author Glavo
 * @since 1.0.0
 */
public class TupleTest {

    @Test
    public void testEquals() {
        assertEquals(
                new Tuple1<>(TestData.s1),
                new Tuple1<>("String 1"));

        assertEquals(
                new Tuple1<>(null),
                new Tuple1<>(null));

        assertEquals(
                new Tuple2<>(TestData.s1, TestData.s2),
                new Tuple2<>("String 1",
                        "String 2"));

        assertEquals(
                new Tuple2<>(null, null),
                new Tuple2<>(null, null));

        assertEquals(
                new Tuple3<>(TestData.s1, TestData.s2, TestData.s3),
                new Tuple3<>("String 1",
                        "String 2",
                        "String 3"));

        assertEquals(
                new Tuple3<>(null, null, null),
                new Tuple3<>(null,
                        null,
                        null));

        assertEquals(
                new Tuple4<>(TestData.s1, TestData.s2, TestData.s3, TestData.s4),
                new Tuple4<>("String 1",
                        "String 2",
                        "String 3",
                        "String 4"));

        assertEquals(
                new Tuple5<>(TestData.s1, TestData.s2, TestData.s3, TestData.s4, TestData.s5),
                new Tuple5<>("String 1",
                        "String 2",
                        "String 3",
                        "String 4",
                        "String 5"));

        assertEquals(
                new Tuple6<>(TestData.s1, TestData.s2, TestData.s3, TestData.s4, TestData.s5, TestData.s6),
                new Tuple6<>("String 1",
                        "String 2",
                        "String 3",
                        "String 4",
                        "String 5",
                        "String 6"));


        assertEquals(
                new Tuple7<>(TestData.s1, TestData.s2, TestData.s3, TestData.s4, TestData.s5, TestData.s6, TestData.s7),
                new Tuple7<>("String 1",
                        "String 2",
                        "String 3",
                        "String 4",
                        "String 5",
                        "String 6",
                        "String 7"));

        assertEquals(
                new Tuple8<>(TestData.s1, TestData.s2, TestData.s3, TestData.s4, TestData.s5, TestData.s6, TestData.s7, TestData.s8),
                new Tuple8<>("String 1",
                        "String 2",
                        "String 3",
                        "String 4",
                        "String 5",
                        "String 6",
                        "String 7",
                        "String 8"));

        assertEquals(
                new Tuple9<>(TestData.s1, TestData.s2, TestData.s3, TestData.s4, TestData.s5, TestData.s6, TestData.s7, TestData.s8, TestData.s9),
                new Tuple9<>("String 1",
                        "String 2",
                        "String 3",
                        "String 4",
                        "String 5",
                        "String 6",
                        "String 7",
                        "String 8",
                        "String 9"));
    }

    @Test
    public void testTuple() {

    }
}
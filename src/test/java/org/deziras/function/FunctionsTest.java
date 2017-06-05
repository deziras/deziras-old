package tech.glacial.function;

import org.junit.Test;
import tech.glacial.helper.TestData;

import static org.junit.Assert.*;

/**
 * Created by glavo on 17-5-6.
 *
 * @author Glavo
 * @since 1.0.0
 */
public class FunctionsTest {
    @Test
    public void curry() throws Exception {
        Function2<String, String, String> f2
                = (a1, a2) -> a1 + a2;
        Function3<String, String, String, String> f3
                = (a1, a2, a3) -> a1 + a2 + a3;
        Function4<String, String, String, String, String> f4
                = (a1, a2, a3, a4) -> a1 + a2 + a3 + a4;
        Function5<String, String, String, String, String, String> f5
                = (a1, a2, a3, a4, a5) -> a1 + a2 + a3 + a4 + a5;
        Function6<String, String, String, String, String, String, String> f6
                = (a1, a2, a3, a4, a5, a6) -> a1 + a2 + a3 + a4 + a5 + a6;
        Function7<String, String, String, String, String, String, String, String> f7
                = (a1, a2, a3, a4, a5, a6, a7) -> a1 + a2 + a3 + a4 + a5 + a6 + a7;
        Function8<String, String, String, String, String, String, String, String, String> f8
                = (a1, a2, a3, a4, a5, a6, a7, a8) -> a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8;
        Function9<String, String, String, String, String, String, String, String, String, String> f9
                = (a1, a2, a3, a4, a5, a6, a7, a8, a9) -> a1 + a2 + a3 + a4 + a5 + a6 + a7 + a8 + a9;

        assertEquals(f2.invoke(TestData.s1, TestData.s2),
                Functions.curry(f2)
                        .invoke(TestData.s1)
                        .invoke(TestData.s2));
        assertEquals(f3.invoke(TestData.s1, TestData.s2, TestData.s3),
                Functions.curry(f3)
                        .invoke(TestData.s1)
                        .invoke(TestData.s2)
                        .invoke(TestData.s3));
        assertEquals(f4.invoke(TestData.s1, TestData.s2, TestData.s3, TestData.s4),
                Functions.curry(f4)
                        .invoke(TestData.s1)
                        .invoke(TestData.s2)
                        .invoke(TestData.s3)
                        .invoke(TestData.s4));
        assertEquals(f5.invoke(TestData.s1, TestData.s2, TestData.s3, TestData.s4, TestData.s5),
                Functions.curry(f5)
                        .invoke(TestData.s1)
                        .invoke(TestData.s2)
                        .invoke(TestData.s3)
                        .invoke(TestData.s4)
                        .invoke(TestData.s5));
        assertEquals(f6.invoke(TestData.s1, TestData.s2, TestData.s3, TestData.s4, TestData.s5, TestData.s6),
                Functions.curry(f6)
                        .invoke(TestData.s1)
                        .invoke(TestData.s2)
                        .invoke(TestData.s3)
                        .invoke(TestData.s4)
                        .invoke(TestData.s5)
                        .invoke(TestData.s6));
        assertEquals(f7.invoke(TestData.s1, TestData.s2, TestData.s3, TestData.s4, TestData.s5, TestData.s6, TestData.s7),
                Functions.curry(f7)
                        .invoke(TestData.s1)
                        .invoke(TestData.s2)
                        .invoke(TestData.s3)
                        .invoke(TestData.s4)
                        .invoke(TestData.s5)
                        .invoke(TestData.s6)
                        .invoke(TestData.s7));
        assertEquals(f8.invoke(TestData.s1, TestData.s2, TestData.s3, TestData.s4, TestData.s5, TestData.s6, TestData.s7, TestData.s8),
                Functions.curry(f8)
                        .invoke(TestData.s1)
                        .invoke(TestData.s2)
                        .invoke(TestData.s3)
                        .invoke(TestData.s4)
                        .invoke(TestData.s5)
                        .invoke(TestData.s6)
                        .invoke(TestData.s7)
                        .invoke(TestData.s8));
        assertEquals(f9.invoke(TestData.s1, TestData.s2, TestData.s3, TestData.s4, TestData.s5, TestData.s6, TestData.s7, TestData.s8, TestData.s9),
                Functions.curry(f9)
                        .invoke(TestData.s1)
                        .invoke(TestData.s2)
                        .invoke(TestData.s3)
                        .invoke(TestData.s4)
                        .invoke(TestData.s5)
                        .invoke(TestData.s6)
                        .invoke(TestData.s7)
                        .invoke(TestData.s8)
                        .invoke(TestData.s9));
    }

}
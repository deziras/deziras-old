package org.deziras;

/**
 * Define many useful methods.
 *
 * @author Glavo
 * @since 1.0.0
 */
public class Predef {

    /**
     * Prints a newline character on the {@link System#out}.
     */
    public static void println() {
        System.out.println();
    }

    /**
     * Prints an integer on the {@link System#out} and then terminates the line.
     *
     * @param i the integer to print.
     */
    public static void println(int i) {
        System.out.println(i);
    }

    /**
     * Prints an integer on the {@link System#out} and then terminates the line.
     *
     * @param b the integer to print.
     */
    public static void println(byte b) {
        System.out.println(b);
    }

    /**
     * Prints an integer on the {@link System#out} and then terminates the line.
     *
     * @param s the integer to print.
     */
    public static void println(short s) {
        System.out.println(s);
    }

    /**
     * Prints a floating-point number on the {@link System#out}
     * and then terminates the line.
     *
     * @param f the <code>float</code> value to be printed
     */
    public static void println(float f) {
        System.out.println(f);
    }

    /**
     * Prints a double-precision floating-point number on the {@link System#out}
     * and then terminates the line.
     *
     * @param d  the {@code double} value to be printed
     */
    public static void println(double d) {
        System.out.println(d);
    }

    /**
     * Prints a double-precision floating-point number on the {@link System#out}
     * and then terminates the line.
     *
     * @param c the number to print.
     */
    public static void println(char c) {
        System.out.println(c);
    }

    public static void println(boolean b) {
        System.out.println(b);
    }

    public static void println(String s) {
        System.out.println(s);
    }

    public static void println(Object o) {
        System.out.println(o);
    }


    public static void print(int i) {
        System.out.print(i);
    }

    public static void print(byte b) {
        System.out.print(b);
    }

    public static void print(short s) {
        System.out.print(s);
    }

    public static void print(double d) {
        System.out.print(d);
    }

    public static void print(float f) {
        System.out.print(f);
    }

    public static void print(char c) {
        System.out.print(c);
    }

    public static void print(boolean b) {
        System.out.print(b);
    }

    public static void print(String s) {
        System.out.print(s);
    }

    public static void print(Object o) {
        System.out.print(o);
    }


    public static void printf(String f, Object... args) {
        System.out.printf(f, args);
    }

    public static <T1> Tuple1<T1> tuple(
            T1 t1) {
        return new Tuple1<T1>(t1);
    }

    public static <T1, T2> Tuple2<T1, T2> tuple(
            T1 t1, T2 t2) {
        return new Tuple2<T1, T2>(t1, t2);
    }

    public static <T1, T2, T3> Tuple3<T1, T2, T3> tuple(
            T1 t1, T2 t2, T3 t3) {
        return new Tuple3<T1, T2, T3>(t1, t2, t3);
    }

    public static <T1, T2, T3, T4> Tuple4<T1, T2, T3, T4> tuple(
            T1 t1, T2 t2, T3 t3, T4 t4) {
        return new Tuple4<T1, T2, T3, T4>(t1, t2, t3, t4);
    }

    public static <T1, T2, T3, T4, T5> Tuple5<T1, T2, T3, T4, T5> tuple(
            T1 t1, T2 t2, T3 t3, T4 t4, T5 t5) {
        return new Tuple5<T1, T2, T3, T4, T5>(t1, t2, t3, t4, t5);
    }

    public static <T1, T2, T3, T4, T5, T6> Tuple6<T1, T2, T3, T4, T5, T6> tuple(
            T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6) {
        return new Tuple6<T1, T2, T3, T4, T5, T6>(t1, t2, t3, t4, t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7> Tuple7<T1, T2, T3, T4, T5, T6, T7> tuple(
            T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7) {
        return new Tuple7<T1, T2, T3, T4, T5, T6, T7>(t1, t2, t3, t4, t5, t6, t7);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8> Tuple8<T1, T2, T3, T4, T5, T6, T7, T8> tuple(
            T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8) {
        return new Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9> Tuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9> tuple(
            T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9) {
        return new Tuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9>(t1, t2, t3, t4, t5, t6, t7, t8, t9);
    }

}

package tech.glacial.function;

import tech.glacial.ToolClass;

/**
 * Created by glavo on 16-12-25.
 * Some helper function for Function.
 *
 * @author Glavo
 * @since 1.0.0
 */
public class Functions extends ToolClass {
    public static <T1, T2, R>
    Function1<T1, Function1<T2, R>> curry(
            final Function2<
                    ? super T1,
                    ? super T2, ? extends R> f) {
        return t1 -> t2
                -> f.invoke(t1, t2);
    }

    public static <T1, T2, T3, R>
    Function1<T1,
            Function1<T2,
                    Function1<T3, R>>> curry(
            final Function3<
                    ? super T1,
                    ? super T2,
                    ? super T3, ? extends R> f) {
        return t1 -> t2 -> t3
                -> f.invoke(t1, t2, t3);
    }

    public static <T1, T2, T3, T4, R>
    Function1<T1,
            Function1<T2,
                    Function1<T3,
                            Function1<T4, R>>>> curry(
            final Function4<
                    ? super T1,
                    ? super T2,
                    ? super T3,
                    ? super T4,
                    ? extends R> f) {
        return t1 -> t2 -> t3 -> t4
                -> f.invoke(t1, t2, t3, t4);
    }

    public static <T1, T2, T3, T4, T5, R>
    Function1<T1,
            Function1<T2,
                    Function1<T3,
                            Function1<T4,
                                    Function1<T5, R>>>>> curry(
            final Function5<? super T1,
                    ? super T2,
                    ? super T3, ? super T4, ? super T5,
                    ? extends R> f) {
        return t1 -> t2 -> t3 -> t4 -> t5
                -> f.invoke(t1, t2, t3, t4, t5);

    }

    public static <T1, T2, T3, T4, T5, T6, R>
    Function1<T1,
            Function1<T2,
                    Function1<T3,
                            Function1<T4,
                                    Function1<T5,
                                            Function1<T6, R>>>>>> curry(
            final Function6<
                    ? super T1,
                    ? super T2,
                    ? super T3,
                    ? super T4,
                    ? super T5,
                    ? super T6,
                    ? extends R> f) {
        return t1 -> t2 -> t3 -> t4 -> t5 -> t6
                -> f.invoke(t1, t2, t3, t4, t5, t6);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, R>
    Function1<T1,
            Function1<T2,
                    Function1<T3,
                            Function1<T4,
                                    Function1<T5,
                                            Function1<T6, Function1<T7, R>>>>>>> curry(
            final Function7<
                    ? super T1,
                    ? super T2,
                    ? super T3,
                    ? super T4,
                    ? super T5,
                    ? super T6,
                    ? super T7,
                    ? extends R> f) {
        return t1 -> t2 -> t3 -> t4 -> t5 -> t6 -> t7
                -> f.invoke(t1, t2, t3, t4, t5, t6, t7);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, R>
    Function1<T1,
            Function1<T2,
                    Function1<T3,
                            Function1<T4,
                                    Function1<T5,
                                            Function1<T6,
                                                    Function1<T7, Function1<T8, R>>>>>>>> curry(
            final Function8<
                    ? super T1,
                    ? super T2,
                    ? super T3,
                    ? super T4,
                    ? super T5,
                    ? super T6,
                    ? super T7,
                    ? super T8,
                    ? extends R> f) {
        return t1 -> t2 -> t3 -> t4 -> t5 -> t6 -> t7 -> t8
                -> f.invoke(t1, t2, t3, t4, t5, t6, t7, t8);
    }

    public static <T1, T2, T3, T4, T5, T6, T7, T8, T9, R>
    Function1<T1,
            Function1<T2,
                    Function1<T3,
                            Function1<T4,
                                    Function1<T5,
                                            Function1<T6,
                                                    Function1<T7, Function1<T8,
                                                            Function1<T9, R>>>>>>>>> curry(
            final Function9<
                    ? super T1,
                    ? super T2,
                    ? super T3,
                    ? super T4,
                    ? super T5,
                    ? super T6,
                    ? super T7,
                    ? super T8,
                    ? super T9,
                    ? extends R> f) {
        return t1 -> t2 -> t3 -> t4 -> t5 -> t6 -> t7 -> t8 -> t9
                -> f.invoke(t1, t2, t3, t4, t5, t6, t7, t8, t9);
    }

}

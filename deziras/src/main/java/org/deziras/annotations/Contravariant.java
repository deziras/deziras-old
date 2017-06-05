package org.deziras.annotations;

import java.lang.annotation.*;

/**
 * Created by Glavo on 上午11:09.
 *
 * @author Glavo
 * @since 0.1.0
 */
@Documented
@Target(ElementType.TYPE_PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
public @interface Contravariant {
}

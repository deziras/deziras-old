package org.deziras.annotations;

import java.lang.annotation.*;

/**
 * Created by Glavo on 下午7:25.
 *
 * @author Glavo
 * @since 0.1.0
 */
@Documented
@Target(ElementType.TYPE_PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
public @interface Covariant {
}

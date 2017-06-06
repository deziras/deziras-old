package org.deziras.annotations;

import java.lang.annotation.*;

/**
 * Created by Glavo on 17-6-7.
 *
 * @author Glavo
 * @since 0.1.0
 */
@Documented
@Retention(RetentionPolicy.CLASS)
@Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE})
public @interface NotNull {
}

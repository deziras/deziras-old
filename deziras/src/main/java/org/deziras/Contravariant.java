package org.deziras;

import java.lang.annotation.*;

/**
 * Created by Glavo on 上午11:09.
 *
 * @author Glavo
 * @since 1.0.0
 */
@Target(ElementType.TYPE_PARAMETER)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Contravariant {
}

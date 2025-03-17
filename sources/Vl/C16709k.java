package VL;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: VL.k  reason: case insensitive filesystem */
public @interface C16709k {
    boolean allowUnsafeNonAsciiValues() default false;

    String[] value();
}

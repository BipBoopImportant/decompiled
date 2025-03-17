package VL;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Target({ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: VL.j  reason: case insensitive filesystem */
public @interface C16708j {
    boolean allowUnsafeNonAsciiValues() default false;
}

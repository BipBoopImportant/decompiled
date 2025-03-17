package JI;

import TI.w;
import TI.x;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import kotlin.jvm.internal.C17542s;

public final class D extends y implements w {

    /* renamed from: a  reason: collision with root package name */
    private final Object f135750a;

    public D(Object obj) {
        C17542s.j(obj, "recordComponent");
        this.f135750a = obj;
    }

    public Member S() {
        Method c10 = C15960a.f135760a.c(this.f135750a);
        if (c10 != null) {
            return c10;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }

    public boolean b() {
        return false;
    }

    public x getType() {
        Class<?> d10 = C15960a.f135760a.d(this.f135750a);
        if (d10 != null) {
            return new s(d10);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }
}

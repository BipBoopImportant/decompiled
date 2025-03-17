package iJ;

import DI.C15538I;
import kotlin.jvm.internal.C17542s;
import uJ.C18113f0;

/* renamed from: iJ.x  reason: case insensitive filesystem */
public final class C17390x extends C17384r<Short> {
    public C17390x(short s10) {
        super(Short.valueOf(s10));
    }

    /* renamed from: c */
    public C18113f0 a(C15538I i10) {
        C17542s.j(i10, "module");
        C18113f0 U10 = i10.p().U();
        C17542s.i(U10, "getShortType(...)");
        return U10;
    }

    public String toString() {
        return ((Number) b()).intValue() + ".toShort()";
    }
}

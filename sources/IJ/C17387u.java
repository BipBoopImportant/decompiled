package iJ;

import DI.C15538I;
import kotlin.jvm.internal.C17542s;
import uJ.C18113f0;

/* renamed from: iJ.u  reason: case insensitive filesystem */
public final class C17387u extends C17384r<Long> {
    public C17387u(long j10) {
        super(Long.valueOf(j10));
    }

    /* renamed from: c */
    public C18113f0 a(C15538I i10) {
        C17542s.j(i10, "module");
        C18113f0 G10 = i10.p().G();
        C17542s.i(G10, "getLongType(...)");
        return G10;
    }

    public String toString() {
        return ((Number) b()).longValue() + ".toLong()";
    }
}

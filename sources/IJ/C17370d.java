package iJ;

import DI.C15538I;
import kotlin.jvm.internal.C17542s;
import uJ.C18113f0;

/* renamed from: iJ.d  reason: case insensitive filesystem */
public final class C17370d extends C17384r<Byte> {
    public C17370d(byte b10) {
        super(Byte.valueOf(b10));
    }

    /* renamed from: c */
    public C18113f0 a(C15538I i10) {
        C17542s.j(i10, "module");
        C18113f0 u10 = i10.p().u();
        C17542s.i(u10, "getByteType(...)");
        return u10;
    }

    public String toString() {
        return ((Number) b()).intValue() + ".toByte()";
    }
}

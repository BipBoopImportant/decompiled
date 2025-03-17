package iJ;

import DI.C15538I;
import kotlin.jvm.internal.C17542s;
import uJ.C18113f0;

/* renamed from: iJ.y  reason: case insensitive filesystem */
public final class C17391y extends C17373g<String> {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17391y(String str) {
        super(str);
        C17542s.j(str, "value");
    }

    /* renamed from: c */
    public C18113f0 a(C15538I i10) {
        C17542s.j(i10, "module");
        C18113f0 X10 = i10.p().X();
        C17542s.i(X10, "getStringType(...)");
        return X10;
    }

    public String toString() {
        return '\"' + ((String) b()) + '\"';
    }
}

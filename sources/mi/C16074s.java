package MI;

import DI.C15554a;
import DI.C15558e;
import DI.a0;
import QI.C16261d;
import gJ.C17279j;
import kotlin.jvm.internal.C17542s;

/* renamed from: MI.s  reason: case insensitive filesystem */
public final class C16074s implements C17279j {
    public C17279j.a a() {
        return C17279j.a.BOTH;
    }

    public C17279j.b b(C15554a aVar, C15554a aVar2, C15558e eVar) {
        C17542s.j(aVar, "superDescriptor");
        C17542s.j(aVar2, "subDescriptor");
        if (!(aVar2 instanceof a0) || !(aVar instanceof a0)) {
            return C17279j.b.UNKNOWN;
        }
        a0 a0Var = (a0) aVar2;
        a0 a0Var2 = (a0) aVar;
        return !C17542s.e(a0Var.getName(), a0Var2.getName()) ? C17279j.b.UNKNOWN : (!C16261d.a(a0Var) || !C16261d.a(a0Var2)) ? (C16261d.a(a0Var) || C16261d.a(a0Var2)) ? C17279j.b.INCOMPATIBLE : C17279j.b.UNKNOWN : C17279j.b.OVERRIDABLE;
    }
}

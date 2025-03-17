package BI;

import BI.f;
import DI.C15558e;
import DI.C15579z;
import YH.C16877v;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import nJ.C17651f;
import tJ.C17994n;

public final class d extends C17651f {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(C17994n nVar, C15464b bVar) {
        super(nVar, bVar);
        C17542s.j(nVar, "storageManager");
        C17542s.j(bVar, "containingClass");
    }

    /* access modifiers changed from: protected */
    public List<C15579z> j() {
        C15558e m10 = m();
        C17542s.h(m10, "null cannot be cast to non-null type org.jetbrains.kotlin.builtins.functions.FunctionClassDescriptor");
        f U02 = ((C15464b) m10).U0();
        return C17542s.e(U02, f.a.f133287e) ? C16877v.e(e.f133282E.a((C15464b) m(), false)) : C17542s.e(U02, f.d.f133290e) ? C16877v.e(e.f133282E.a((C15464b) m(), true)) : C16877v.n();
    }
}

package QI;

import DI.a0;
import DI.d0;
import DI.n0;
import DI.u0;
import PI.C16201k;
import QI.U;
import TI.r;
import YH.C16877v;
import cJ.C17069f;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import uJ.C18096U;

public abstract class b0 extends U {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b0(C16201k kVar) {
        super(kVar, (U) null, 2, (DefaultConstructorMarker) null);
        C17542s.j(kVar, "c");
    }

    /* access modifiers changed from: protected */
    public void C(C17069f fVar, Collection<a0> collection) {
        C17542s.j(fVar, "name");
        C17542s.j(collection, "result");
    }

    /* access modifiers changed from: protected */
    public d0 O() {
        return null;
    }

    /* access modifiers changed from: protected */
    public U.a Y(r rVar, List<? extends n0> list, C18096U u10, List<? extends u0> list2) {
        C17542s.j(rVar, "method");
        C17542s.j(list, "methodTypeParameters");
        C17542s.j(u10, "returnType");
        C17542s.j(list2, "valueParameters");
        return new U.a(u10, (C18096U) null, list2, list, false, C16877v.n());
    }
}

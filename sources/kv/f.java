package Kv;

import U0.C4889m;
import U0.C4895p;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import p0.C5685c;
import z1.C6271a;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lp0/c;", "LKv/d;", "draggableState", "Lz1/a;", "a", "(Lp0/c;LU0/m;I)Lz1/a;", "membership-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class f {
    public static final C6271a a(C5685c<d> cVar, C4889m mVar, int i10) {
        C17542s.j(cVar, "draggableState");
        mVar.W(1313860798);
        if (C4895p.J()) {
            C4895p.S(1313860798, i10, -1, "com.ingka.ikea.membership.impl.compose.member.scaffold.rememberDispatchingScrollConnection (DispatchingScrollConnection.kt:24)");
        }
        mVar.W(-109832777);
        boolean z10 = (((i10 & 14) ^ 6) > 4 && mVar.V(cVar)) || (i10 & 6) == 4;
        Object D10 = mVar.D();
        if (z10 || D10 == C4889m.f14007a.a()) {
            D10 = new e(cVar);
            mVar.u(D10);
        }
        e eVar = (e) D10;
        mVar.P();
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return eVar;
    }
}

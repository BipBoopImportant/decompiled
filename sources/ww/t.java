package Ww;

import U0.C4889m;
import U0.C4895p;
import Ww.r;
import XH.C16807N;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a-\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "permission", "Lkotlin/Function1;", "LWw/r$a;", "LXH/N;", "initialPermissionStatus", "LWw/r;", "b", "(Ljava/lang/String;LnI/l;LU0/m;II)LWw/r;", "permissions_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class t {
    public static final r b(String str, C17642l<? super r.a, C16807N> lVar, C4889m mVar, int i10, int i11) {
        C17542s.j(str, "permission");
        mVar.W(-1203239864);
        if ((i11 & 2) != 0) {
            mVar.W(2053371166);
            Object D10 = mVar.D();
            if (D10 == C4889m.f14007a.a()) {
                D10 = new s();
                mVar.u(D10);
            }
            lVar = (C17642l) D10;
            mVar.P();
        }
        if (C4895p.J()) {
            C4895p.S(-1203239864, i10, -1, "com.ingka.ikea.permissions.rememberPermissionRequest (PermissionRequest.kt:98)");
        }
        k e10 = p.e(str, lVar, mVar, i10 & 126, 0);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return e10;
    }

    /* access modifiers changed from: private */
    public static final C16807N c(r.a aVar) {
        C17542s.j(aVar, "it");
        return C16807N.f139792a;
    }
}

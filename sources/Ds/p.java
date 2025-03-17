package Ds;

import KJ.C15985a;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import ys.C12504c;
import ys.C12506e;
import ys.C12507f;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LDs/o;", "Lys/e;", "a", "(LDs/o;)Lys/e;", "inbox-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class p {
    public static final C12506e a(o oVar) {
        C17542s.j(oVar, "<this>");
        C12507f f10 = oVar.f();
        C12507f fVar = (f10 == null || oVar.j()) ? null : f10;
        if (oVar.d().isEmpty()) {
            return (oVar.g() || oVar.i()) ? new C12506e.d(oVar.c(), fVar) : oVar.f() instanceof C12507f.c ? new C12506e.c(oVar.c()) : new C12506e.b(oVar.c(), fVar, oVar.e());
        }
        return new C12506e.a(oVar.c(), fVar, oVar.h() ? C12504c.d.f107230a : C12504c.C2554c.f107229a, C15985a.h(oVar.d()), oVar.i() || oVar.g(), oVar.e());
    }
}

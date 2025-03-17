package rK;

import U0.C4889m;
import U0.C4895p;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import o1.C5673m;
import t1.C5942c;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001e\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0005"}, d2 = {"Lt1/c;", "Lo1/m;", "size", "a", "(Lt1/c;JLU0/m;I)Lt1/c;", "core_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: rK.h  reason: case insensitive filesystem */
public final class C17873h {
    public static final C5942c a(C5942c cVar, long j10, C4889m mVar, int i10) {
        C17542s.j(cVar, "$this$scaledToMatch");
        mVar.C(-79748709);
        if (C4895p.J()) {
            C4895p.S(-79748709, i10, -1, "me.saket.telephoto.zoomable.internal.scaledToMatch (FixedSizePainter.kt:15)");
        }
        long h10 = cVar.h();
        mVar.C(-948354976);
        boolean e10 = ((((i10 & 112) ^ 48) > 32 && mVar.e(j10)) || (i10 & 48) == 32) | mVar.e(h10) | mVar.V(cVar);
        Object D10 = mVar.D();
        if (e10 || D10 == C4889m.f14007a.a()) {
            C5673m.a aVar = C5673m.f26722b;
            D10 = new C17872g(cVar, (j10 == aVar.a() || C5673m.n(j10) || cVar.h() == aVar.a()) ? cVar.h() : C5673m.o(cVar.h(), C5673m.l(cVar.h()) / C5673m.l(j10)), (DefaultConstructorMarker) null);
            mVar.u(D10);
        }
        C17872g gVar = (C17872g) D10;
        mVar.U();
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.U();
        return gVar;
    }
}

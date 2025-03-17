package Pi;

import E1.I;
import G1.C4504g;
import Mi.C10772g;
import N1.P;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13606k2;
import SC.C13607l;
import SC.C13610l2;
import TC.C13679b;
import TC.e;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import XH.C16807N;
import Y1.f;
import Y1.j;
import Y1.k;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import c2.h;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import s0.C5862h;
import t0.C5938c;
import t0.x;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lt0/x;", "LMi/g;", "productDetailsSummary", "LXH/N;", "a", "(Lt0/x;LMi/g;)V", "ratingsandreviews-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: Pi.e  reason: case insensitive filesystem */
public final class C10881e {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: Pi.e$a */
    static final class a implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C10772g f85482a;

        a(C10772g gVar) {
            this.f85482a = gVar;
        }

        public final void a(C5938c cVar, C4889m mVar, int i10) {
            C4889m mVar2 = mVar;
            int i11 = i10;
            C17542s.j(cVar, "$this$item");
            if ((i11 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1905015137, i11, -1, "com.ingka.ikea.app.ratingsandreviews.presentation.composable.overallRating.<anonymous> (OverallRating.kt:23)");
                }
                d.a aVar = d.f18749a;
                d k10 = D.k(e.i(aVar), 0.0f, h.B((float) 32), 1, (Object) null);
                C10772g gVar = this.f85482a;
                I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), mVar2, 0);
                int a11 = C4883j.a(mVar2, 0);
                C4912y s10 = mVar.s();
                d e10 = c.e(mVar2, k10);
                C4504g.a aVar2 = C4504g.f6515W;
                C17631a<C4504g> a12 = aVar2.a();
                if (mVar.m() == null) {
                    C4883j.c();
                }
                mVar.I();
                if (mVar.i()) {
                    mVar2.p(a12);
                } else {
                    mVar.t();
                }
                C4889m a13 = F1.a(mVar);
                F1.c(a13, a10, aVar2.c());
                F1.c(a13, s10, aVar2.e());
                p<C4504g, Integer, C16807N> b10 = aVar2.b();
                if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                    a13.u(Integer.valueOf(a11));
                    a13.w(Integer.valueOf(a11), b10);
                }
                F1.c(a13, e10, aVar2.d());
                C5862h hVar = C5862h.f28810a;
                C10772g gVar2 = gVar;
                C13607l.j(String.valueOf(gVar.a()), C13679b.C2857b.a.f116683a, D.m(aVar, 0.0f, 0.0f, 0.0f, h.B((float) 6), 7, (Object) null), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar, 432, 0, 262136);
                float a14 = gVar2.a();
                int d10 = gVar2.d();
                C13610l2 l2Var = C13610l2.Small;
                C13606k2.b(a14, C5116k1.a(aVar, "OverallRatingStars"), (String) null, (String) null, Integer.valueOf(d10), l2Var, (C17631a<C16807N>) null, mVar, 196656, 76);
                mVar.x();
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((C5938c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    public static final void a(x xVar, C10772g gVar) {
        C17542s.j(xVar, "<this>");
        C17542s.j(gVar, "productDetailsSummary");
        x.i(xVar, (Object) null, "OVERALL_RATING", c1.c.c(1905015137, true, new a(gVar)), 1, (Object) null);
    }
}

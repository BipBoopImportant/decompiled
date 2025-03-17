package Yp;

import J1.j;
import KJ.C15987c;
import N1.P;
import Oo.b;
import Op.K;
import Op.c1;
import Op.d1;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13607l;
import SC.K0;
import SC.L;
import SC.M;
import SC.N;
import TC.C13679b;
import TC.e;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import XH.t;
import Y1.f;
import Y1.k;
import YH.C16877v;
import Zp.a;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import androidx.lifecycle.r;
import c1.c;
import c2.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import r0.m;
import t0.C5934A;
import t0.C5938c;
import t0.x;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\b\u0004\u001a]\u0010\r\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u001e\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000b\u0012\u0004\u0012\u00020\u00050\tH\u0000¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lt0/x;", "LZp/a$b;", "uiState", "Lkotlin/Function1;", "LOp/c1;", "LXH/N;", "onProductItemEvent", "Lkotlin/Function0;", "onOffersClicked", "Lkotlin/Function2;", "", "", "onCarouselViewed", "a", "(Lt0/x;LZp/a$b;LnI/l;LnI/a;LnI/p;)V", "discover-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class S {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ a.b.c.C1937b f89588a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ p<String, List<String>, C16807N> f89589b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<c1, C16807N> f89590c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f89591d;

        a(a.b.c.C1937b bVar, p<? super String, ? super List<String>, C16807N> pVar, C17642l<? super c1, C16807N> lVar, C17631a<C16807N> aVar) {
            this.f89588a = bVar;
            this.f89589b = pVar;
            this.f89590c = lVar;
            this.f89591d = aVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(p pVar, a.b.c.C1937b bVar) {
            a.b.c.C1937b.C1939b bVar2 = (a.b.c.C1937b.C1939b) bVar;
            String a10 = bVar2.a().a();
            C15987c<d1> b10 = bVar2.a().b();
            ArrayList arrayList = new ArrayList(C16877v.y(b10, 10));
            for (d1 p10 : b10) {
                arrayList.add(p10.p().f());
            }
            pVar.invoke(a10, arrayList);
            return C16807N.f139792a;
        }

        public final void b(C5938c cVar, C4889m mVar, int i10) {
            String c10;
            Object obj;
            int i11;
            C4889m mVar2;
            int i12;
            C4889m mVar3 = mVar;
            int i13 = i10;
            C17542s.j(cVar, "$this$item");
            if ((i13 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-599977578, i13, -1, "com.ingka.ikea.discover.impl.ui.recommendationsCarousel.<anonymous> (RecommendationComposables.kt:39)");
                }
                a.b.c.C1937b bVar = this.f89588a;
                mVar3.W(-1855547469);
                a.b.c.C1937b.C1938a aVar = a.b.c.C1937b.C1938a.f90120a;
                if (C17542s.e(bVar, aVar)) {
                    c10 = j.b(b.f84552X4, mVar3, 0);
                } else if (bVar instanceof a.b.c.C1937b.C1939b) {
                    c10 = ((a.b.c.C1937b.C1939b) this.f89588a).a().c();
                } else {
                    throw new t();
                }
                String str = c10;
                mVar.P();
                C13679b.C2857b.C2858b bVar2 = C13679b.C2857b.C2858b.f116684a;
                d.a aVar2 = d.f18749a;
                d.a aVar3 = aVar2;
                C13607l.j(str, bVar2, D.k(e.i(aVar2), 0.0f, h.B((float) 24), 1, (Object) null), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar, 48, 0, 262136);
                a.b.c.C1937b bVar3 = this.f89588a;
                if (C17542s.e(bVar3, aVar)) {
                    mVar2 = mVar;
                    mVar2.W(-1686722284);
                    K.e(true, (d) null, 0, false, mVar, 6, 14);
                    mVar.P();
                    i12 = 0;
                    i11 = 1;
                    obj = null;
                } else {
                    mVar2 = mVar;
                    if (bVar3 instanceof a.b.c.C1937b.C1939b) {
                        mVar2.W(-1686498464);
                        mVar2.W(-1855517398);
                        boolean V10 = mVar2.V(this.f89589b) | mVar2.F(this.f89588a);
                        p<String, List<String>, C16807N> pVar = this.f89589b;
                        a.b.c.C1937b bVar4 = this.f89588a;
                        Object D10 = mVar.D();
                        if (V10 || D10 == C4889m.f14007a.a()) {
                            D10 = new Q(pVar, bVar4);
                            mVar2.u(D10);
                        }
                        mVar.P();
                        i12 = 0;
                        i11 = 1;
                        obj = null;
                        pl.d.d((r) null, (C17631a) D10, mVar2, 0, 1);
                        K.g(((a.b.c.C1937b.C1939b) this.f89588a).a().b(), this.f89590c, (d) null, (C5934A) null, true, false, mVar, 24576, 44);
                        mVar.P();
                    } else {
                        mVar2.W(-1855528621);
                        mVar.P();
                        throw new t();
                    }
                }
                L.b(j.b(b.f84572Z4, mVar2, i12), D.m(e.i(J.h(aVar3, 0.0f, i11, obj)), 0.0f, h.B((float) 16), 0.0f, 0.0f, 13, (Object) null), false, (N) null, (M) null, false, (Integer) null, (K0) null, (m) null, this.f89591d, mVar, 0, 508);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((C5938c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    public static final void a(x xVar, a.b bVar, C17642l<? super c1, C16807N> lVar, C17631a<C16807N> aVar, p<? super String, ? super List<String>, C16807N> pVar) {
        a.b.c.C1937b bVar2;
        C17542s.j(xVar, "<this>");
        C17542s.j(bVar, "uiState");
        C17542s.j(lVar, "onProductItemEvent");
        C17542s.j(aVar, "onOffersClicked");
        C17542s.j(pVar, "onCarouselViewed");
        if (bVar instanceof a.b.c) {
            bVar2 = ((a.b.c) bVar).f();
        } else if (bVar instanceof a.b.C1935b) {
            bVar2 = ((a.b.C1935b) bVar).c();
        } else if (!(bVar instanceof a.b.C1934a)) {
            throw new t();
        } else {
            return;
        }
        if (bVar2 != null) {
            xVar.b("RecommendedOffers", "RecommendedOffers", c.c(-599977578, true, new a(bVar2, pVar, lVar, aVar)));
        }
    }
}

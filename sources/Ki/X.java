package ki;

import E1.I;
import G1.C4504g;
import KJ.C15987c;
import N1.P;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13606k2;
import SC.C13607l;
import SC.C13610l2;
import TC.C13679b;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import Y1.f;
import Y1.j;
import Y1.k;
import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import c1.c;
import c2.h;
import com.google.ar.core.ImageMetadata;
import i1.C5437c;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import m1.e;
import mi.g;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import p1.i1;
import s0.C5862h;
import t0.C5938c;
import t0.x;
import tK.C18030v;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a!\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lt0/x;", "LKJ/c;", "Lmi/g;", "reviews", "LXH/N;", "d", "(Lt0/x;LKJ/c;)V", "reviewItemUiModel", "b", "(Lmi/g;LU0/m;I)V", "productinformationpage-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class X {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C15987c<g> f75122a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: ki.X$a$a  reason: collision with other inner class name */
        static final class C1361a implements q<C5938c, C4889m, Integer, C16807N> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ g f75123a;

            C1361a(g gVar) {
                this.f75123a = gVar;
            }

            public final void a(C5938c cVar, C4889m mVar, int i10) {
                C17542s.j(cVar, "$this$item");
                if ((i10 & 17) != 16 || !mVar.l()) {
                    if (C4895p.J()) {
                        C4895p.S(-956542277, i10, -1, "com.ingka.ikea.app.productinformationpage.v3.compose.pipReviewsCarousel.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PipReviewsCarousel.kt:45)");
                    }
                    X.b(this.f75123a, mVar, 0);
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

        a(C15987c<g> cVar) {
            this.f75122a = cVar;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(C15987c cVar, x xVar) {
            C17542s.j(xVar, "$this$LazyRow");
            Iterator it = cVar.iterator();
            while (it.hasNext()) {
                x.i(xVar, (Object) null, (Object) null, c.c(-956542277, true, new C1361a((g) it.next())), 3, (Object) null);
            }
            return C16807N.f139792a;
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: nI.l} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void b(t0.C5938c r15, U0.C4889m r16, int r17) {
            /*
                r14 = this;
                r0 = r14
                r10 = r16
                r1 = r17
                java.lang.String r2 = "$this$item"
                r3 = r15
                kotlin.jvm.internal.C17542s.j(r15, r2)
                r2 = r1 & 17
                r3 = 16
                if (r2 != r3) goto L_0x001d
                boolean r2 = r16.l()
                if (r2 != 0) goto L_0x0018
                goto L_0x001d
            L_0x0018:
                r16.L()
                goto L_0x009b
            L_0x001d:
                boolean r2 = U0.C4895p.J()
                if (r2 == 0) goto L_0x002c
                r2 = -1
                java.lang.String r3 = "com.ingka.ikea.app.productinformationpage.v3.compose.pipReviewsCarousel.<anonymous> (PipReviewsCarousel.kt:34)"
                r4 = -214222448(0xfffffffff33b3990, float:-1.4833481E31)
                U0.C4895p.S(r4, r1, r2, r3)
            L_0x002c:
                androidx.compose.ui.d$a r1 = androidx.compose.ui.d.f18749a
                r2 = 0
                r3 = 1
                r4 = 0
                androidx.compose.ui.d r1 = androidx.compose.foundation.layout.J.h(r1, r2, r3, r4)
                r5 = 24
                float r5 = (float) r5
                float r6 = c2.h.B(r5)
                androidx.compose.ui.d r1 = androidx.compose.foundation.layout.D.k(r1, r2, r6, r3, r4)
                androidx.compose.foundation.layout.d r3 = androidx.compose.foundation.layout.C5073d.f18068a
                r6 = 8
                float r6 = (float) r6
                float r6 = c2.h.B(r6)
                androidx.compose.foundation.layout.d$f r6 = r3.n(r6)
                float r3 = c2.h.B(r5)
                r5 = 2
                s0.E r3 = androidx.compose.foundation.layout.D.c(r3, r2, r5, r4)
                r2 = -531761949(0xffffffffe04df4e3, float:-5.9362945E19)
                r10.W(r2)
                KJ.c<mi.g> r2 = r0.f75122a
                boolean r2 = r10.V(r2)
                KJ.c<mi.g> r4 = r0.f75122a
                java.lang.Object r5 = r16.D()
                if (r2 != 0) goto L_0x0072
                U0.m$a r2 = U0.C4889m.f14007a
                java.lang.Object r2 = r2.a()
                if (r5 != r2) goto L_0x007a
            L_0x0072:
                ki.W r5 = new ki.W
                r5.<init>(r4)
                r10.u(r5)
            L_0x007a:
                r9 = r5
                nI.l r9 = (nI.C17642l) r9
                r16.P()
                r11 = 24966(0x6186, float:3.4985E-41)
                r12 = 234(0xea, float:3.28E-43)
                r2 = 0
                r4 = 0
                r7 = 0
                r8 = 0
                r13 = 0
                r5 = r6
                r6 = r7
                r7 = r8
                r8 = r13
                r10 = r16
                t0.C5937b.b(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                boolean r1 = U0.C4895p.J()
                if (r1 == 0) goto L_0x009b
                U0.C4895p.R()
            L_0x009b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ki.X.a.b(t0.c, U0.m, int):void");
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((C5938c) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    public static final void b(g gVar, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        g gVar2 = gVar;
        int i12 = i10;
        C17542s.j(gVar2, "reviewItemUiModel");
        C4889m k10 = mVar.k(-126624881);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(gVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-126624881, i11, -1, "com.ingka.ikea.app.productinformationpage.v3.compose.PipReviewItem (PipReviewsCarousel.kt:55)");
            }
            d.a aVar = d.f18749a;
            d a10 = e.a(J.y(aVar, h.B((float) 280)), A0.g.e(h.B((float) 8)));
            C18030v vVar = C18030v.f147664a;
            int i13 = C18030v.f147665b;
            d i14 = D.i(b.d(a10, vVar.a(k10, i13).l0(), (i1) null, 2, (Object) null), h.B((float) 24));
            I a11 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), k10, 0);
            int a12 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = androidx.compose.ui.c.e(k10, i14);
            C4504g.a aVar2 = C4504g.f6515W;
            C17631a<C4504g> a13 = aVar2.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a13);
            } else {
                k10.t();
            }
            C4889m a14 = F1.a(k10);
            F1.c(a14, a11, aVar2.c());
            F1.c(a14, s10, aVar2.e());
            p<C4504g, Integer, C16807N> b10 = aVar2.b();
            if (a14.i() || !C17542s.e(a14.D(), Integer.valueOf(a12))) {
                a14.u(Integer.valueOf(a12));
                a14.w(Integer.valueOf(a12), b10);
            }
            F1.c(a14, e10, aVar2.d());
            C5862h hVar = C5862h.f28810a;
            C4889m mVar3 = k10;
            C4889m mVar4 = mVar3;
            C13607l.j(gVar.f(), C13679b.C2857b.f.f116688a, (d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar4, 48, 0, 262140);
            C13606k2.b(gVar.c(), (d) null, (String) null, (String) null, (Integer) null, C13610l2.Small, (C17631a<C16807N>) null, mVar3, ImageMetadata.EDGE_MODE, 94);
            String d10 = gVar.d();
            C13679b.a.c cVar = C13679b.a.c.f116681a;
            C18030v vVar2 = vVar;
            int i15 = i13;
            C13607l.j(d10, cVar, D.m(aVar, 0.0f, h.B((float) 12), 0.0f, 0.0f, 13, (Object) null), vVar2.a(mVar3, i15).G0(), 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar4, 432, 0, 262128);
            mVar2 = mVar3;
            C13607l.j(gVar.e(), cVar, D.m(aVar, 0.0f, h.B((float) 16), 0.0f, 0.0f, 13, (Object) null), vVar2.a(mVar2, i15).I0(), 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar2, 432, 0, 262128);
            mVar2.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new V(gVar2, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(g gVar, int i10, C4889m mVar, int i11) {
        b(gVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final void d(x xVar, C15987c<g> cVar) {
        C17542s.j(xVar, "<this>");
        C17542s.j(cVar, "reviews");
        xVar.b("pip:ReviewsCarousel", "ReviewsCarousel", c.c(-214222448, true, new a(cVar)));
    }
}

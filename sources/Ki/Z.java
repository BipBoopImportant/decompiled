package ki;

import E1.I;
import G1.C4504g;
import O0.C4747p0;
import O0.C4762x0;
import O0.H0;
import O0.L0;
import SC.Y2;
import T0.c;
import U0.A1;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import U0.p1;
import XH.C16807N;
import Xo.g;
import android.content.Context;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c2.h;
import i1.C5437c;
import ji.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import mi.l;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import nI.r;
import s0.C5834E;
import s0.C5850V;
import t0.C5934A;
import t0.C5935B;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a3\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\f²\u0006\f\u0010\u000b\u001a\u00020\n8\nX\u0002"}, d2 = {"Lmi/l;", "uiState", "LT0/c;", "windowSize", "Lkotlin/Function1;", "Lji/c;", "LXH/N;", "screenUiEvent", "b", "(Lmi/l;LT0/c;LnI/l;LU0/m;I)V", "", "showAddToCartButtonInFullWidth", "productinformationpage-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class Z {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ L0 f75128a;

        a(L0 l02) {
            this.f75128a = l02;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1689730874, i10, -1, "com.ingka.ikea.app.productinformationpage.v3.compose.PipScreenV3.<anonymous> (PipScreenV3.kt:51)");
                }
                Y2.c(this.f75128a, (d) null, (r<? super H0, ? super p<? super C4889m, ? super Integer, C16807N>, ? super C4889m, ? super Integer, C16807N>) null, mVar, 6, 6);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements q<C5834E, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ c f75129a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ l f75130b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17642l<ji.c, C16807N> f75131c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ L0 f75132d;

        b(c cVar, l lVar, C17642l<? super ji.c, C16807N> lVar2, L0 l02) {
            this.f75129a = cVar;
            this.f75130b = lVar;
            this.f75131c = lVar2;
            this.f75132d = l02;
        }

        /* access modifiers changed from: private */
        public static final boolean e(C5934A a10) {
            return a10.s() <= 1;
        }

        private static final boolean f(A1<Boolean> a12) {
            return a12.getValue().booleanValue();
        }

        /* access modifiers changed from: private */
        public static final C16807N h(C17642l lVar) {
            lVar.invoke(c.b.f74846a);
            return C16807N.f139792a;
        }

        public final void c(C5834E e10, C4889m mVar, int i10) {
            int i11;
            C5934A a10;
            C5079j jVar;
            C5834E e11 = e10;
            C4889m mVar2 = mVar;
            C17542s.j(e11, "contentPadding");
            if ((i10 & 6) == 0) {
                i11 = i10 | (mVar2.V(e11) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) != 18 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-18156605, i11, -1, "com.ingka.ikea.app.productinformationpage.v3.compose.PipScreenV3.<anonymous> (PipScreenV3.kt:54)");
                }
                d.a aVar = d.f18749a;
                d h10 = D.h(J.f(aVar, 0.0f, 1, (Object) null), e11);
                T0.c cVar = this.f75129a;
                l lVar = this.f75130b;
                C17642l<ji.c, C16807N> lVar2 = this.f75131c;
                L0 l02 = this.f75132d;
                C5437c.a aVar2 = C5437c.f24302a;
                I h11 = C5077h.h(aVar2.o(), false);
                int a11 = C4883j.a(mVar2, 0);
                C4912y s10 = mVar.s();
                d e12 = androidx.compose.ui.c.e(mVar2, h10);
                C4504g.a aVar3 = C4504g.f6515W;
                C17631a<C4504g> a12 = aVar3.a();
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
                F1.c(a13, h11, aVar3.c());
                F1.c(a13, s10, aVar3.e());
                p<C4504g, Integer, C16807N> b10 = aVar3.b();
                if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                    a13.u(Integer.valueOf(a11));
                    a13.w(Integer.valueOf(a11), b10);
                }
                F1.c(a13, e12, aVar3.d());
                C5079j jVar2 = C5079j.f18125a;
                boolean b11 = g.b(cVar.b());
                boolean b12 = Xo.c.b((Context) mVar2.Q(AndroidCompositionLocals_androidKt.g()));
                C5934A c10 = C5935B.c(0, 0, mVar2, 0, 3);
                mVar2.W(-959976536);
                Object D10 = mVar.D();
                C4889m.a aVar4 = C4889m.f14007a;
                if (D10 == aVar4.a()) {
                    D10 = p1.e(new a0(c10));
                    mVar2.u(D10);
                }
                A1 a14 = (A1) D10;
                mVar.P();
                mVar2.W(-959969402);
                if (lVar.f()) {
                    a10 = c10;
                    jVar = jVar2;
                    C4747p0.c(jVar2.a(J.h(aVar, 0.0f, 1, (Object) null), aVar2.b()), 0, 0, 0, 0.0f, mVar, 0, 30);
                } else {
                    a10 = c10;
                    jVar = jVar2;
                }
                mVar.P();
                if (lVar.b()) {
                    mVar2.W(306015135);
                    E.b(mVar2, 0);
                    mVar.P();
                } else {
                    mVar2.W(306071865);
                    C10001v.c(lVar, b11, b12, a10, lVar2, mVar, 0);
                    mVar.P();
                }
                mVar2.W(-959946297);
                boolean V10 = mVar2.V(lVar2);
                Object D11 = mVar.D();
                if (V10 || D11 == aVar4.a()) {
                    D11 = new b0(lVar2);
                    mVar2.u(D11);
                }
                mVar.P();
                C9998s.b((C17631a) D11, mVar2, 0);
                mVar2.W(-959944055);
                if (!b11 && !b12) {
                    C9997q.e(jVar, lVar.a(), f(a14), lVar2, (d) null, mVar, 6, 8);
                }
                mVar.P();
                oi.a c11 = lVar.c();
                mVar2.W(-959932269);
                if (c11 != null) {
                    C9992l.i(c11, lVar2, l02, mVar2, 384);
                }
                mVar.P();
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
            c((C5834E) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    public static final void b(l lVar, T0.c cVar, C17642l<? super ji.c, C16807N> lVar2, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        l lVar3 = lVar;
        T0.c cVar2 = cVar;
        C17642l<? super ji.c, C16807N> lVar4 = lVar2;
        int i12 = i10;
        C17542s.j(lVar3, "uiState");
        C17542s.j(cVar2, "windowSize");
        C17542s.j(lVar4, "screenUiEvent");
        C4889m k10 = mVar.k(330590196);
        if ((i12 & 6) == 0) {
            i11 = ((i12 & 8) == 0 ? k10.V(lVar3) : k10.F(lVar3) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.V(cVar2) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.F(lVar4) ? 256 : 128;
        }
        if ((i11 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(330590196, i11, -1, "com.ingka.ikea.app.productinformationpage.v3.compose.PipScreenV3 (PipScreenV3.kt:45)");
            }
            k10.W(1836761179);
            Object D10 = k10.D();
            if (D10 == C4889m.f14007a.a()) {
                D10 = new L0();
                k10.u(D10);
            }
            L0 l02 = (L0) D10;
            k10.P();
            mVar2 = k10;
            C4762x0.a((d) null, (p<? super C4889m, ? super Integer, C16807N>) null, (p<? super C4889m, ? super Integer, C16807N>) null, c1.c.e(1689730874, true, new a(l02), k10, 54), (p<? super C4889m, ? super Integer, C16807N>) null, 0, 0, 0, C5850V.c(h.B((float) 0), 0.0f, 0.0f, 0.0f, 14, (Object) null), c1.c.e(-18156605, true, new b(cVar2, lVar3, lVar4, l02), k10, 54), mVar2, 805309440, 247);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new Y(lVar3, cVar2, lVar4, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(l lVar, T0.c cVar, C17642l lVar2, int i10, C4889m mVar, int i11) {
        b(lVar, cVar, lVar2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}

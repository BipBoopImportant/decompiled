package ki;

import G1.C4504g;
import Op.C10828d;
import Op.F;
import Op.i1;
import SC.C13606k2;
import SC.C13610l2;
import SC.P1;
import SC.Q1;
import TC.e;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import c2.h;
import i1.C5437c;
import ji.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import mi.j;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import s0.C5862h;
import t0.C5938c;
import t0.x;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a/\u0010\t\u001a\u00020\u0004*\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lmi/j$c;", "uiData", "Lkotlin/Function1;", "Lji/c;", "LXH/N;", "screenUiEvent", "c", "(Lmi/j$c;LnI/l;LU0/m;I)V", "Lt0/x;", "f", "(Lt0/x;Lmi/j$c;LnI/l;)V", "productinformationpage-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class I {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements q<C5938c, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ j.c f75092a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C17642l<c, C16807N> f75093b;

        a(j.c cVar, C17642l<? super c, C16807N> lVar) {
            this.f75092a = cVar;
            this.f75093b = lVar;
        }

        public final void a(C5938c cVar, C4889m mVar, int i10) {
            C17542s.j(cVar, "$this$item");
            if ((i10 & 17) != 16 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(92490781, i10, -1, "com.ingka.ikea.app.productinformationpage.v3.compose.pipPriceModuleItem.<anonymous> (PipPriceModule.kt:76)");
                }
                I.c(this.f75092a, this.f75093b, mVar, 0);
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

    public static final void c(j.c cVar, C17642l<? super c, C16807N> lVar, C4889m mVar, int i10) {
        int i11;
        j.c cVar2 = cVar;
        C17642l<? super c, C16807N> lVar2 = lVar;
        int i12 = i10;
        C17542s.j(cVar2, "uiData");
        C17542s.j(lVar2, "screenUiEvent");
        C4889m k10 = mVar.k(1338490043);
        if ((i12 & 6) == 0) {
            i11 = (k10.F(cVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(lVar2) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1338490043, i11, -1, "com.ingka.ikea.app.productinformationpage.v3.compose.PipPriceModule (PipPriceModule.kt:32)");
            }
            d.a aVar = d.f18749a;
            boolean z10 = true;
            d k11 = D.k(e.i(aVar), 0.0f, h.B((float) 16), 1, (Object) null);
            E1.I a10 = C5080k.a(C5073d.f18068a.n(h.B((float) 8)), C5437c.f24302a.k(), k10, 6);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = androidx.compose.ui.c.e(k10, k11);
            C4504g.a aVar2 = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar2.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a12);
            } else {
                k10.t();
            }
            C4889m a13 = F1.a(k10);
            F1.c(a13, a10, aVar2.c());
            F1.c(a13, s10, aVar2.e());
            p<C4504g, Integer, C16807N> b10 = aVar2.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e10, aVar2.d());
            C5862h hVar = C5862h.f28810a;
            C10828d.h i13 = cVar.i();
            i1 i1Var = new i1(cVar.g());
            Q1.b bVar = new Q1.b(P1.Medium, false, (String) null, 4, (DefaultConstructorMarker) null);
            boolean h10 = cVar.h();
            k10.W(-1297222231);
            if ((i11 & 112) != 32) {
                z10 = false;
            }
            boolean F10 = k10.F(cVar2) | z10;
            Object D10 = k10.D();
            if (F10 || D10 == C4889m.f14007a.a()) {
                D10 = new G(lVar2, cVar2);
                k10.u(D10);
            }
            k10.P();
            F.g(i13, i1Var, h10, (C17631a) D10, (d) null, bVar, k10, Q1.b.f115896e << 15, 16);
            j.c.a n10 = cVar.n();
            k10.W(-1297208506);
            if (n10 != null) {
                C13606k2.b(n10.a(), C5116k1.a(aVar, "OverallRatingStars"), (String) null, (String) null, Integer.valueOf(n10.b()), C13610l2.Small, (C17631a<C16807N>) null, k10, 196656, 76);
            }
            k10.P();
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n11 = k10.n();
        if (n11 != null) {
            n11.a(new H(cVar2, lVar2, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N d(C17642l lVar, j.c cVar) {
        lVar.invoke(new c.C1353c(cVar.j()));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N e(j.c cVar, C17642l lVar, int i10, C4889m mVar, int i11) {
        c(cVar, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    public static final void f(x xVar, j.c cVar, C17642l<? super c, C16807N> lVar) {
        C17542s.j(xVar, "<this>");
        C17542s.j(cVar, "uiData");
        C17542s.j(lVar, "screenUiEvent");
        xVar.b("pip:PriceModuleData", "PriceModuleData", c1.c.c(92490781, true, new a(cVar, lVar)));
    }
}

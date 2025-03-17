package yn;

import E1.I;
import G1.C4504g;
import J1.j;
import KJ.C15985a;
import KJ.C15990f;
import N1.P;
import Oo.b;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13607l;
import SC.Z2;
import SC.b3;
import TC.C13679b;
import TC.e;
import U0.C4877g1;
import U0.C4883j;
import U0.C4889m;
import U0.C4894o0;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import XH.t;
import Y1.f;
import Y1.k;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
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
import s0.C5842M;
import s0.C5843N;
import uK.C18146a;
import vn.g;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a3\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n²\u0006\u000e\u0010\t\u001a\u00020\u00008\n@\nX\u0002"}, d2 = {"", "count", "Lvn/g;", "selectedToggle", "Lkotlin/Function1;", "LXH/N;", "onSelect", "c", "(ILvn/g;LnI/l;LU0/m;I)V", "selectedIndex", "plp-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class k2 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f106992a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                vn.g[] r0 = vn.g.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                vn.g r1 = vn.g.MULTI     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                vn.g r1 = vn.g.SINGLE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f106992a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: yn.k2.a.<clinit>():void");
        }
    }

    public static final void c(int i10, g gVar, C17642l<? super Integer, C16807N> lVar, C4889m mVar, int i11) {
        int i12;
        C4889m mVar2;
        int i13;
        int i14 = i10;
        g gVar2 = gVar;
        C17642l<? super Integer, C16807N> lVar2 = lVar;
        int i15 = i11;
        C17542s.j(gVar2, "selectedToggle");
        C17542s.j(lVar2, "onSelect");
        C4889m k10 = mVar.k(-1723870416);
        if ((i15 & 6) == 0) {
            i12 = (k10.d(i14) ? 4 : 2) | i15;
        } else {
            i12 = i15;
        }
        if ((i15 & 48) == 0) {
            i12 |= k10.V(gVar2) ? 32 : 16;
        }
        if ((i15 & 384) == 0) {
            i12 |= k10.F(lVar2) ? 256 : 128;
        }
        int i16 = i12;
        if ((i16 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1723870416, i16, -1, "com.ingka.ikea.browseandsearch.plp.impl.composables.PlpTotalCountAndGridToggle (PlpTotalCountAndGridToggle.kt:43)");
            }
            d.a aVar = d.f18749a;
            d k11 = D.k(e.i(aVar), 0.0f, h.B((float) 16), 1, (Object) null);
            I b10 = G.b(C5073d.f18068a.n(h.B((float) 8)), C5437c.f24302a.i(), k10, 54);
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, k11);
            C4504g.a aVar2 = C4504g.f6515W;
            C17631a<C4504g> a11 = aVar2.a();
            if (k10.m() == null) {
                C4883j.c();
            }
            k10.I();
            if (k10.i()) {
                k10.p(a11);
            } else {
                k10.t();
            }
            C4889m a12 = F1.a(k10);
            F1.c(a12, b10, aVar2.c());
            F1.c(a12, s10, aVar2.e());
            p<C4504g, Integer, C16807N> b11 = aVar2.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b11);
            }
            F1.c(a12, e10, aVar2.d());
            int i17 = i16;
            C4889m mVar3 = k10;
            C13607l.j(j.a(Oo.a.f84316k, i14, new Object[]{Integer.valueOf(i10)}, k10, (i16 << 3) & 112), C13679b.a.C2856b.f116680a, C5116k1.a(C5842M.e(C5843N.f28726a, aVar, 1.0f, false, 2, (Object) null), "TOTAL_COUNT_TEXT"), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar3, 48, 0, 262136);
            mVar2 = mVar3;
            boolean z10 = false;
            C15990f b12 = C15985a.b(new Z2.a(C18146a.f148121Kb, j.b(b.f84697k9, mVar2, 0), true), new Z2.a(C18146a.f148151Mb, j.b(b.f84708l9, mVar2, 0), true));
            int i18 = a.f106992a[gVar.ordinal()];
            if (i18 == 1) {
                i13 = 0;
            } else if (i18 == 2) {
                i13 = 1;
            } else {
                throw new t();
            }
            mVar2.W(-739785716);
            Object D10 = mVar2.D();
            C4889m.a aVar3 = C4889m.f14007a;
            if (D10 == aVar3.a()) {
                D10 = C4877g1.a(i13);
                mVar2.u(D10);
            }
            C4894o0 o0Var = (C4894o0) D10;
            mVar2.P();
            if (i13 != d(o0Var)) {
                e(o0Var, i13);
            }
            d a13 = C5116k1.a(aVar, "GRID_TOGGLE");
            int d10 = d(o0Var);
            mVar2.W(-739777219);
            if ((i17 & 896) == 256) {
                z10 = true;
            }
            Object D11 = mVar2.D();
            if (z10 || D11 == aVar3.a()) {
                D11 = new i2(lVar2, o0Var);
                mVar2.u(D11);
            }
            mVar2.P();
            b3.b(b12, a13, d10, false, (C17642l) D11, mVar2, Z2.a.f116097e | 48, 8);
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
            n10.a(new j2(i14, gVar2, lVar2, i15));
        }
    }

    private static final int d(C4894o0 o0Var) {
        return o0Var.e();
    }

    private static final void e(C4894o0 o0Var, int i10) {
        o0Var.g(i10);
    }

    /* access modifiers changed from: private */
    public static final C16807N f(C17642l lVar, C4894o0 o0Var, int i10) {
        e(o0Var, i10);
        lVar.invoke(Integer.valueOf(i10));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N g(int i10, g gVar, C17642l lVar, int i11, C4889m mVar, int i12) {
        c(i10, gVar, lVar, mVar, M0.a(i11 | 1));
        return C16807N.f139792a;
    }
}

package Dy;

import B0.C4373q;
import By.C12674m;
import E1.I;
import G1.C4504g;
import J1.j;
import Jy.n;
import KJ.C15988d;
import N1.C4669d;
import N1.G;
import N1.P;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import S1.C4831y;
import SC.C13607l;
import SC.K0;
import SC.L;
import SC.M;
import SC.N;
import TC.C13679b;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import U1.e;
import XH.C16807N;
import Y1.a;
import Y1.f;
import Y1.k;
import Y1.o;
import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import androidx.recyclerview.widget.RecyclerView;
import c2.h;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import p1.g1;
import p1.i1;
import r0.m;
import r1.g;
import rz.K;
import s0.C5844O;
import s0.C5862h;
import tK.C18030v;

@Metadata(d1 = {"\u0000,\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a3\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001¢\u0006\u0004\b\b\u0010\t\u001a+\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a+\u0010\f\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\f\u0010\u000b\u001a9\u0010\u0011\u001a\u00020\u00062\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010H\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u0013\u0010\u0014\u001a'\u0010\u0017\u001a\u00020\u00062\b\b\u0001\u0010\u0015\u001a\u00020\r2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010H\u0003¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"", "formattedTotalSavings", "Lrz/K;", "profileState", "Lkotlin/Function1;", "LJy/n$a;", "LXH/N;", "onBtnClick", "m", "(Ljava/lang/String;Lrz/K;LnI/l;LU0/m;I)V", "q", "(Ljava/lang/String;LnI/l;LU0/m;I)V", "t", "", "description", "buttonText", "Lkotlin/Function0;", "l", "(IILjava/lang/String;LnI/a;LU0/m;I)V", "w", "(Ljava/lang/String;LU0/m;I)V", "strRes", "onClick", "j", "(ILnI/a;LU0/m;I)V", "cart-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: Dy.j  reason: case insensitive filesystem */
public final class C12810j {
    private static final void j(int i10, C17631a<C16807N> aVar, C4889m mVar, int i11) {
        int i12;
        C4889m mVar2;
        int i13 = i10;
        C17631a<C16807N> aVar2 = aVar;
        int i14 = i11;
        C4889m k10 = mVar.k(1344081629);
        if ((i14 & 6) == 0) {
            i12 = (k10.d(i13) ? 4 : 2) | i14;
        } else {
            i12 = i14;
        }
        if ((i14 & 48) == 0) {
            i12 |= k10.F(aVar2) ? 32 : 16;
        }
        if ((i12 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1344081629, i12, -1, "com.ingka.ikea.scanandgo.cart.impl.compose.Button (CartFamilyPromotionBanner.kt:144)");
            }
            mVar2 = k10;
            L.b(j.b(i13, k10, i12 & 14), J.h(C5116k1.a(d.f18749a, "CartFamilySavingsBanner.Button"), 0.0f, 1, (Object) null), false, (N) null, (M) null, false, (Integer) null, (K0) null, (m) null, aVar, k10, ((i12 << 24) & 1879048192) | 48, 508);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new C12807h(i13, aVar2, i14));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N k(int i10, C17631a aVar, int i11, C4889m mVar, int i12) {
        j(i10, aVar, mVar, M0.a(i11 | 1));
        return C16807N.f139792a;
    }

    private static final void l(int i10, int i11, String str, C17631a<C16807N> aVar, C4889m mVar, int i12) {
        int i13;
        C4889m mVar2;
        int i14 = i10;
        int i15 = i11;
        String str2 = str;
        C17631a<C16807N> aVar2 = aVar;
        int i16 = i12;
        C4889m k10 = mVar.k(-293840202);
        if ((i16 & 6) == 0) {
            i13 = (k10.d(i14) ? 4 : 2) | i16;
        } else {
            i13 = i16;
        }
        if ((i16 & 48) == 0) {
            i13 |= k10.d(i15) ? 32 : 16;
        }
        if ((i16 & 384) == 0) {
            i13 |= k10.V(str2) ? 256 : 128;
        }
        if ((i16 & 3072) == 0) {
            i13 |= k10.F(aVar2) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        int i17 = i13;
        if ((i17 & 1171) != 1170 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-293840202, i17, -1, "com.ingka.ikea.scanandgo.cart.impl.compose.CartFamilySavingsBanner (CartFamilyPromotionBanner.kt:87)");
            }
            d.a aVar3 = d.f18749a;
            float f10 = (float) 24;
            d h10 = J.h(D.i(b.d(C5116k1.a(aVar3, "CartFamilySavingsBanner.Root"), C18030v.f147664a.a(k10, C18030v.f147665b).l0(), (i1) null, 2, (Object) null), h.B(f10)), 0.0f, 1, (Object) null);
            I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, h10);
            C4504g.a aVar4 = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar4.a();
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
            F1.c(a13, a10, aVar4.c());
            F1.c(a13, s10, aVar4.e());
            p<C4504g, Integer, C16807N> b10 = aVar4.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e10, aVar4.d());
            C5862h hVar = C5862h.f28810a;
            w(str2, k10, (i17 >> 6) & 14);
            C5844O.a(J.t(aVar3, h.B((float) 8)), k10, 6);
            C4889m mVar3 = k10;
            C13607l.j(j.b(i14, k10, i17 & 14), C13679b.a.C2856b.f116680a, C5116k1.a(aVar3, "CartFamilySavingsBanner.Description"), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar3, 432, 0, 262136);
            mVar2 = mVar3;
            C5844O.a(J.t(aVar3, h.B(f10)), mVar2, 6);
            mVar2.W(1966157723);
            int i18 = i17;
            boolean z10 = (i18 & 7168) == 2048;
            Object D10 = mVar2.D();
            if (z10 || D10 == C4889m.f14007a.a()) {
                D10 = new C12803f(aVar2);
                mVar2.u(D10);
            }
            mVar2.P();
            j(i15, (C17631a) D10, mVar2, (i18 >> 3) & 14);
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
            n10.a(new C12805g(i10, i11, str, aVar, i12));
        }
    }

    public static final void m(String str, K k10, C17642l<? super n.a, C16807N> lVar, C4889m mVar, int i10) {
        int i11;
        C17542s.j(str, "formattedTotalSavings");
        C17542s.j(k10, "profileState");
        C17542s.j(lVar, "onBtnClick");
        C4889m k11 = mVar.k(-1637064869);
        if ((i10 & 6) == 0) {
            i11 = (k11.V(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k11.F(k10) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= k11.F(lVar) ? 256 : 128;
        }
        if ((i11 & 147) != 146 || !k11.l()) {
            if (C4895p.J()) {
                C4895p.S(-1637064869, i11, -1, "com.ingka.ikea.scanandgo.cart.impl.compose.CartFamilySavingsBanner (CartFamilyPromotionBanner.kt:37)");
            }
            if (C17542s.e(k10, K.b.f130758b)) {
                k11.W(118059545);
                q(str, lVar, k11, (i11 & 14) | ((i11 >> 3) & 112));
                k11.P();
            } else if (C17542s.e(k10, K.a.c.f130757b)) {
                k11.W(118065915);
                t(str, lVar, k11, (i11 & 14) | ((i11 >> 3) & 112));
                k11.P();
            } else {
                k11.W(118070928);
                k11.P();
            }
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k11.L();
        }
        Y0 n10 = k11.n();
        if (n10 != null) {
            n10.a(new C12793a(str, k10, lVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N n(String str, K k10, C17642l lVar, int i10, C4889m mVar, int i11) {
        m(str, k10, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N o(int i10, int i11, String str, C17631a aVar, int i12, C4889m mVar, int i13) {
        l(i10, i11, str, aVar, mVar, M0.a(i12 | 1));
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N p(C17631a aVar) {
        aVar.invoke();
        return C16807N.f139792a;
    }

    private static final void q(String str, C17642l<? super n.a, C16807N> lVar, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(163536105);
        if ((i10 & 6) == 0) {
            i11 = (k10.V(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.F(lVar) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(163536105, i11, -1, "com.ingka.ikea.scanandgo.cart.impl.compose.CartFamilySavingsBannerNotLoggedIn (CartFamilyPromotionBanner.kt:57)");
            }
            int i12 = C12674m.f108270b0;
            int i13 = Oo.b.f84824w4;
            k10.W(-982356696);
            boolean z10 = (i11 & 112) == 32;
            Object D10 = k10.D();
            if (z10 || D10 == C4889m.f14007a.a()) {
                D10 = new C12799d(lVar);
                k10.u(D10);
            }
            k10.P();
            l(i12, i13, str, (C17631a) D10, k10, (i11 << 6) & 896);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C12801e(str, lVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N r(C17642l lVar) {
        lVar.invoke(n.a.SIGNUP_LOGIN);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N s(String str, C17642l lVar, int i10, C4889m mVar, int i11) {
        q(str, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void t(String str, C17642l<? super n.a, C16807N> lVar, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(514147725);
        if ((i10 & 6) == 0) {
            i11 = (k10.V(str) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.F(lVar) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(514147725, i11, -1, "com.ingka.ikea.scanandgo.cart.impl.compose.CartFamilySavingsBannerRegularMember (CartFamilyPromotionBanner.kt:70)");
            }
            int i12 = C12674m.f108274d0;
            int i13 = C12674m.f108276e0;
            k10.W(2099026973);
            boolean z10 = (i11 & 112) == 32;
            Object D10 = k10.D();
            if (z10 || D10 == C4889m.f14007a.a()) {
                D10 = new C12795b(lVar);
                k10.u(D10);
            }
            k10.P();
            l(i12, i13, str, (C17631a) D10, k10, (i11 << 6) & 896);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C12797c(str, lVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N u(C17642l lVar) {
        lVar.invoke(n.a.UPGRADE_TO_FAMILY);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N v(String str, C17642l lVar, int i10, C4889m mVar, int i11) {
        t(str, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    /* JADX INFO: finally extract failed */
    private static final void w(String str, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        String str2 = str;
        int i12 = i10;
        C4889m k10 = mVar.k(2072862393);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(str2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(2072862393, i11, -1, "com.ingka.ikea.scanandgo.cart.impl.compose.Title (CartFamilyPromotionBanner.kt:115)");
            }
            d a10 = C5116k1.a(d.f18749a, "CartFamilySavingsBanner.Title");
            k10.W(-470218629);
            C4669d.a aVar = new C4669d.a(0, 1, (DefaultConstructorMarker) null);
            aVar.j(j.c(C12674m.f108272c0, new Object[]{str}, k10, 0));
            aVar.j(" ");
            k10.W(-470210610);
            int p10 = aVar.p(new G(C18030v.f147664a.a(k10, C18030v.f147665b).D0(), 0, (C) null, (C4830x) null, (C4831y) null, (C4820m) null, (String) null, 0, (a) null, (o) null, (e) null, 0, (k) null, (g1) null, (N1.D) null, (g) null, 65534, (DefaultConstructorMarker) null));
            try {
                aVar.j(j.b(Oo.b.f84451N3, k10, 0));
                C16807N n10 = C16807N.f139792a;
                aVar.m(p10);
                k10.P();
                C4669d q10 = aVar.q();
                k10.P();
                mVar2 = k10;
                C13607l.h(q10, C13679b.C2857b.c.f116685a, a10, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, (f) null, 0, 0, false, 0, 0, (C15988d<String, C4373q>) null, (C17642l<? super P, C16807N>) null, mVar2, 432, 0, 524280);
                if (C4895p.J()) {
                    C4895p.R();
                }
            } catch (Throwable th2) {
                aVar.m(p10);
                throw th2;
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n11 = mVar2.n();
        if (n11 != null) {
            n11.a(new C12809i(str2, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N x(String str, int i10, C4889m mVar, int i11) {
        w(str, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}

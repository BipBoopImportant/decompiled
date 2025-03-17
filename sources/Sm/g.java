package Sm;

import E1.C4478k;
import E1.I;
import G1.C4504g;
import J1.j;
import N1.P;
import Oo.b;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13607l;
import SC.F0;
import SC.G0;
import SC.H0;
import SC.K0;
import SC.L;
import SC.M;
import SC.N;
import TC.C13679b;
import TC.e;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import Y1.f;
import Y1.k;
import android.app.Activity;
import android.content.Context;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5074e;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.foundation.layout.x;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.C5116k1;
import androidx.recyclerview.widget.RecyclerView;
import c2.h;
import com.google.ar.core.ImageMetadata;
import com.ingka.ikea.boka.impl.bottomsheet.a;
import gs.C11352b;
import gs.e;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import p1.C5749w0;
import r0.m;
import s0.C5842M;
import s0.C5843N;
import s0.C5844O;
import s0.C5862h;
import s0.C5880z;
import t1.C5942c;
import uK.C18146a;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a3\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a;\u0010\n\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\b2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u0019\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u000f\u0010\u0010\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a%\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0003¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/ingka/ikea/boka/impl/bottomsheet/a$a;", "state", "Lkotlin/Function0;", "LXH/N;", "bookAppointmentClick", "onCloseClick", "i", "(Lcom/ingka/ikea/boka/impl/bottomsheet/a$a;LnI/a;LnI/a;LU0/m;I)V", "LT0/d;", "widthSizeClass", "g", "(Lcom/ingka/ikea/boka/impl/bottomsheet/a$a;ILnI/a;LnI/a;LU0/m;I)V", "Landroidx/compose/ui/d;", "modifier", "o", "(Landroidx/compose/ui/d;LU0/m;II)V", "m", "(LU0/m;I)V", "", "isLoading", "onClick", "k", "(ZLnI/a;LU0/m;I)V", "boka-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class g {
    public static final void g(a.C2078a aVar, int i10, C17631a<C16807N> aVar2, C17631a<C16807N> aVar3, C4889m mVar, int i11) {
        int i12;
        C4889m mVar2;
        a.C2078a aVar4 = aVar;
        int i13 = i10;
        C17631a<C16807N> aVar5 = aVar2;
        C17631a<C16807N> aVar6 = aVar3;
        int i14 = i11;
        C17542s.j(aVar4, "state");
        C17542s.j(aVar5, "bookAppointmentClick");
        C17542s.j(aVar6, "onCloseClick");
        C4889m k10 = mVar.k(-686383891);
        if ((i14 & 6) == 0) {
            i12 = ((i14 & 8) == 0 ? k10.V(aVar4) : k10.F(aVar4) ? 4 : 2) | i14;
        } else {
            i12 = i14;
        }
        if ((i14 & 48) == 0) {
            i12 |= k10.d(i13) ? 32 : 16;
        }
        if ((i14 & 384) == 0) {
            i12 |= k10.F(aVar5) ? 256 : 128;
        }
        if ((i14 & 3072) == 0) {
            i12 |= k10.F(aVar6) ? RecyclerView.n.FLAG_MOVED : 1024;
        }
        if ((i12 & 1171) != 1170 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-686383891, i12, -1, "com.ingka.ikea.boka.impl.bottomsheet.compose.BokaBottomSheetContent (BokaBottomSheetScreen.kt:76)");
            }
            d.a aVar7 = d.f18749a;
            d h10 = J.h(aVar7, 0.0f, 1, (Object) null);
            C5437c.a aVar8 = C5437c.f24302a;
            I h11 = C5077h.h(aVar8.o(), false);
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, h10);
            C4504g.a aVar9 = C4504g.f6515W;
            C17631a<C4504g> a11 = aVar9.a();
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
            F1.c(a12, h11, aVar9.c());
            F1.c(a12, s10, aVar9.e());
            p<C4504g, Integer, C16807N> b10 = aVar9.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b10);
            }
            F1.c(a12, e10, aVar9.d());
            C5079j jVar = C5079j.f18125a;
            if (T0.d.F(i13, T0.d.f13504b.d())) {
                k10.W(-1499978030);
                I a13 = C5080k.a(C5073d.f18068a.g(), aVar8.k(), k10, 0);
                int a14 = C4883j.a(k10, 0);
                C4912y s11 = k10.s();
                d e11 = c.e(k10, aVar7);
                C17631a<C4504g> a15 = aVar9.a();
                if (k10.m() == null) {
                    C4883j.c();
                }
                k10.I();
                if (k10.i()) {
                    k10.p(a15);
                } else {
                    k10.t();
                }
                C4889m a16 = F1.a(k10);
                F1.c(a16, a13, aVar9.c());
                F1.c(a16, s11, aVar9.e());
                p<C4504g, Integer, C16807N> b11 = aVar9.b();
                if (a16.i() || !C17542s.e(a16.D(), Integer.valueOf(a14))) {
                    a16.u(Integer.valueOf(a14));
                    a16.w(Integer.valueOf(a14), b11);
                }
                F1.c(a16, e11, aVar9.d());
                C5862h hVar = C5862h.f28810a;
                o(J.d(C5074e.b(aVar7, 1.5f, false, 2, (Object) null), 0.0f, 1, (Object) null), k10, 6, 0);
                C5844O.a(J.i(aVar7, h.B((float) 32)), k10, 6);
                m(k10, 0);
                C5844O.a(J.i(aVar7, h.B((float) 16)), k10, 6);
                k(!(aVar4 instanceof a.C2078a.c), aVar5, k10, (i12 >> 3) & 112);
                k10.x();
                k10.P();
            } else {
                k10.W(-1499423626);
                d a17 = x.a(aVar7, C5880z.Max);
                C5073d dVar = C5073d.f18068a;
                I b12 = G.b(dVar.f(), aVar8.l(), k10, 0);
                int a18 = C4883j.a(k10, 0);
                C4912y s12 = k10.s();
                d e12 = c.e(k10, a17);
                C17631a<C4504g> a19 = aVar9.a();
                if (k10.m() == null) {
                    C4883j.c();
                }
                k10.I();
                if (k10.i()) {
                    k10.p(a19);
                } else {
                    k10.t();
                }
                C4889m a20 = F1.a(k10);
                F1.c(a20, b12, aVar9.c());
                F1.c(a20, s12, aVar9.e());
                p<C4504g, Integer, C16807N> b13 = aVar9.b();
                if (a20.i() || !C17542s.e(a20.D(), Integer.valueOf(a18))) {
                    a20.u(Integer.valueOf(a18));
                    a20.w(Integer.valueOf(a18), b13);
                }
                F1.c(a20, e12, aVar9.d());
                C5843N n10 = C5843N.f28726a;
                d.a aVar10 = aVar7;
                o(C5842M.e(n10, aVar10, 1.0f, false, 2, (Object) null), k10, 0, 0);
                d e13 = C5842M.e(n10, aVar10, 1.0f, false, 2, (Object) null);
                I a21 = C5080k.a(dVar.g(), aVar8.k(), k10, 0);
                int a22 = C4883j.a(k10, 0);
                C4912y s13 = k10.s();
                d e14 = c.e(k10, e13);
                C17631a<C4504g> a23 = aVar9.a();
                if (k10.m() == null) {
                    C4883j.c();
                }
                k10.I();
                if (k10.i()) {
                    k10.p(a23);
                } else {
                    k10.t();
                }
                C4889m a24 = F1.a(k10);
                F1.c(a24, a21, aVar9.c());
                F1.c(a24, s13, aVar9.e());
                p<C4504g, Integer, C16807N> b14 = aVar9.b();
                if (a24.i() || !C17542s.e(a24.D(), Integer.valueOf(a22))) {
                    a24.u(Integer.valueOf(a22));
                    a24.w(Integer.valueOf(a22), b14);
                }
                F1.c(a24, e14, aVar9.d());
                C5862h hVar2 = C5862h.f28810a;
                C5844O.a(J.i(aVar7, h.B((float) 80)), k10, 6);
                m(k10, 0);
                C5844O.a(J.i(aVar7, h.B((float) 24)), k10, 6);
                k(C17542s.e(aVar4, a.C2078a.b.f93262a), aVar5, k10, (i12 >> 3) & 112);
                k10.x();
                k10.x();
                k10.P();
            }
            float f10 = (float) 16;
            mVar2 = k10;
            F0.b(C18146a.f148097J2, j.b(b.f84665i, k10, 0), C5116k1.a(jVar.a(D.m(aVar7, 0.0f, h.B(f10), h.B(f10), 0.0f, 9, (Object) null), aVar8.n()), "CLOSE_BUTTON"), false, H0.Primary, G0.Small, (m) null, false, aVar3, k10, ((i12 << 15) & 234881024) | 221184, 200);
            mVar2.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n11 = mVar2.n();
        if (n11 != null) {
            n11.a(new b(aVar, i10, aVar2, aVar3, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N h(a.C2078a aVar, int i10, C17631a aVar2, C17631a aVar3, int i11, C4889m mVar, int i12) {
        g(aVar, i10, aVar2, aVar3, mVar, M0.a(i11 | 1));
        return C16807N.f139792a;
    }

    public static final void i(a.C2078a aVar, C17631a<C16807N> aVar2, C17631a<C16807N> aVar3, C4889m mVar, int i10) {
        int i11;
        C17542s.j(aVar, "state");
        C17542s.j(aVar2, "bookAppointmentClick");
        C17542s.j(aVar3, "onCloseClick");
        C4889m k10 = mVar.k(1163201655);
        if ((i10 & 6) == 0) {
            i11 = ((i10 & 8) == 0 ? k10.V(aVar) : k10.F(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.F(aVar2) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i11 |= k10.F(aVar3) ? 256 : 128;
        }
        if ((i11 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1163201655, i11, -1, "com.ingka.ikea.boka.impl.bottomsheet.compose.BokaBottomSheetScreen (BokaBottomSheetScreen.kt:56)");
            }
            Activity a10 = Xo.c.a((Context) k10.Q(AndroidCompositionLocals_androidKt.g()));
            if (a10 != null) {
                int b10 = T0.a.a(a10, k10, 0).b();
                int i12 = i11 & 14;
                int i13 = i11 << 3;
                g(aVar, b10, aVar2, aVar3, k10, i12 | (i13 & 896) | (i13 & 7168));
                if (C4895p.J()) {
                    C4895p.R();
                }
            } else {
                throw new IllegalArgumentException("Required value was null.");
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new a(aVar, aVar2, aVar3, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N j(a.C2078a aVar, C17631a aVar2, C17631a aVar3, int i10, C4889m mVar, int i11) {
        i(aVar, aVar2, aVar3, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void k(boolean z10, C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        boolean z11 = z10;
        C17631a<C16807N> aVar2 = aVar;
        int i12 = i10;
        C4889m k10 = mVar.k(-651980416);
        if ((i12 & 6) == 0) {
            i11 = (k10.b(z11) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.F(aVar2) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-651980416, i11, -1, "com.ingka.ikea.boka.impl.bottomsheet.compose.BookAnAppointmentButton (BokaBottomSheetScreen.kt:175)");
            }
            d.a aVar3 = d.f18749a;
            d i13 = e.i(aVar3);
            I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, i13);
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
            float f10 = (float) 24;
            C5844O.a(J.i(aVar3, h.B(f10)), k10, 6);
            mVar2 = k10;
            L.b(j.b(Pm.b.f85629b, k10, 0), C5116k1.a(J.h(aVar3, 0.0f, 1, (Object) null), "BOOK_BUTTON"), false, N.Primary, (M) null, z10, (Integer) null, (K0) null, (m) null, aVar, k10, ((i11 << 15) & ImageMetadata.JPEG_GPS_COORDINATES) | 3120 | ((i11 << 24) & 1879048192), 468);
            C5844O.a(J.i(aVar3, h.B(f10)), mVar2, 6);
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
            n10.a(new e(z10, aVar2, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N l(boolean z10, C17631a aVar, int i10, C4889m mVar, int i11) {
        k(z10, aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void m(C4889m mVar, int i10) {
        C4889m mVar2;
        int i11 = i10;
        C4889m k10 = mVar.k(-1813596700);
        if (i11 != 0 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1813596700, i11, -1, "com.ingka.ikea.boka.impl.bottomsheet.compose.Content (BokaBottomSheetScreen.kt:150)");
            }
            d.a aVar = d.f18749a;
            d i12 = e.i(aVar);
            I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, i12);
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
            C4889m mVar3 = k10;
            C13607l.j(j.b(Pm.b.f85630c, k10, 0), C13679b.C2857b.a.f116683a, J.h(aVar, 0.0f, 1, (Object) null), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar3, 432, 0, 262136);
            C4889m mVar4 = mVar3;
            C5844O.a(J.i(aVar, h.B((float) 16)), mVar4, 6);
            mVar2 = mVar4;
            C13607l.j(j.b(Pm.b.f85628a, mVar4, 0), C13679b.a.C2855a.f116679a, J.h(aVar, 0.0f, 1, (Object) null), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar2, 432, 0, 262136);
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
            n10.a(new f(i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N n(int i10, C4889m mVar, int i11) {
        m(mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void o(d dVar, C4889m mVar, int i10, int i11) {
        int i12;
        d dVar2;
        C4889m mVar2;
        int i13 = i10;
        int i14 = i11;
        C4889m k10 = mVar.k(1567236390);
        int i15 = i14 & 1;
        if (i15 != 0) {
            i12 = i13 | 6;
            dVar2 = dVar;
        } else if ((i13 & 6) == 0) {
            dVar2 = dVar;
            i12 = (k10.V(dVar2) ? 4 : 2) | i13;
        } else {
            dVar2 = dVar;
            i12 = i13;
        }
        if ((i12 & 3) != 2 || !k10.l()) {
            d.a aVar = i15 != 0 ? d.f18749a : dVar2;
            if (C4895p.J()) {
                C4895p.S(1567236390, i12, -1, "com.ingka.ikea.boka.impl.bottomsheet.compose.HeaderImage (BokaBottomSheetScreen.kt:138)");
            }
            k10.W(1510108880);
            Object D10 = k10.D();
            if (D10 == C4889m.f14007a.a()) {
                D10 = new c();
                k10.u(D10);
            }
            k10.P();
            mVar2 = k10;
            C11352b.b(gs.f.a((C17642l) D10, k10, 6), "", aVar, (C5942c) null, (C5942c) null, (C5942c) null, (C5437c) null, C4478k.f5915a.a(), 0.0f, (C5749w0) null, 0, k10, 12582960 | gs.e.f97946h | ((i12 << 6) & 896), 0, 1912);
            if (C4895p.J()) {
                C4895p.R();
            }
            dVar2 = aVar;
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new d(dVar2, i13, i14));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N p(e.a aVar) {
        C17542s.j(aVar, "$this$ikeaImageRequest");
        aVar.j("https://shop.static.ingka.ikea.com/boka/book_appointment.jpg?imwidth=1080");
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N q(d dVar, int i10, int i11, C4889m mVar, int i12) {
        o(dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}

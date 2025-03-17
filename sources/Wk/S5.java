package wK;

import E1.I;
import G1.C4504g;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.p;
import s0.C5842M;
import s0.C5843N;
import s0.C5862h;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a7\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LwK/F5;", "buttonAlignment", "Lkotlin/Function0;", "LXH/N;", "primaryButton", "secondaryButton", "b", "(LwK/F5;LnI/p;LnI/p;LU0/m;II)V", "design_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class S5 {
    public static final void b(F5 f52, p<? super C4889m, ? super Integer, C16807N> pVar, p<? super C4889m, ? super Integer, C16807N> pVar2, C4889m mVar, int i10, int i11) {
        int i12;
        F5 f53;
        F5 f54;
        p<? super C4889m, ? super Integer, C16807N> pVar3 = pVar;
        p<? super C4889m, ? super Integer, C16807N> pVar4 = pVar2;
        int i13 = i10;
        C17542s.j(pVar3, "primaryButton");
        C4889m k10 = mVar.k(1795296852);
        int i14 = i11 & 1;
        if (i14 != 0) {
            i12 = i13 | 6;
            f53 = f52;
        } else if ((i13 & 6) == 0) {
            f53 = f52;
            i12 = (k10.V(f53) ? 4 : 2) | i13;
        } else {
            f53 = f52;
            i12 = i13;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i13 & 48) == 0) {
            i12 |= k10.F(pVar3) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i13 & 384) == 0) {
            i12 |= k10.F(pVar4) ? 256 : 128;
        }
        if ((i12 & 147) != 146 || !k10.l()) {
            F5 f55 = i14 != 0 ? F5.SideBySide : f53;
            if (C4895p.J()) {
                C4895p.S(1795296852, i12, -1, "net.ikea.skapa.ui.components.ModalsActionFooter (ModalsActionFooter.kt:20)");
            }
            V5 a10 = U5.f150255a.a(f55, k10, (i12 & 14) | 48);
            d.a aVar = d.f18749a;
            d h10 = D.h(J.h(aVar, 0.0f, 1, (Object) null), a10.a());
            if (f55 == F5.Stacked) {
                k10.W(416550683);
                I a11 = C5080k.a(C5073d.f18068a.n(a10.b()), C5437c.f24302a.k(), k10, 0);
                int a12 = C4883j.a(k10, 0);
                C4912y s10 = k10.s();
                d e10 = c.e(k10, h10);
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
                pVar3.invoke(k10, Integer.valueOf((i12 >> 3) & 14));
                k10.W(1867761615);
                if (pVar4 != null) {
                    pVar4.invoke(k10, Integer.valueOf((i12 >> 6) & 14));
                    C16807N n10 = C16807N.f139792a;
                }
                k10.P();
                k10.x();
                k10.P();
            } else {
                k10.W(416782811);
                C5073d.f n11 = C5073d.f18068a.n(a10.b());
                C5437c.a aVar3 = C5437c.f24302a;
                I b11 = G.b(n11, aVar3.l(), k10, 0);
                int a15 = C4883j.a(k10, 0);
                C4912y s11 = k10.s();
                d e11 = c.e(k10, h10);
                C4504g.a aVar4 = C4504g.f6515W;
                C17631a<C4504g> a16 = aVar4.a();
                if (k10.m() == null) {
                    C4883j.c();
                }
                k10.I();
                if (k10.i()) {
                    k10.p(a16);
                } else {
                    k10.t();
                }
                C4889m a17 = F1.a(k10);
                F1.c(a17, b11, aVar4.c());
                F1.c(a17, s11, aVar4.e());
                p<C4504g, Integer, C16807N> b12 = aVar4.b();
                if (a17.i() || !C17542s.e(a17.D(), Integer.valueOf(a15))) {
                    a17.u(Integer.valueOf(a15));
                    a17.w(Integer.valueOf(a15), b12);
                }
                F1.c(a17, e11, aVar4.d());
                C5843N n12 = C5843N.f28726a;
                k10.W(1867768119);
                if (pVar4 != null) {
                    d e12 = C5842M.e(n12, aVar, 1.0f, false, 2, (Object) null);
                    I h11 = C5077h.h(aVar3.o(), false);
                    int a18 = C4883j.a(k10, 0);
                    C4912y s12 = k10.s();
                    d e13 = c.e(k10, e12);
                    C17631a<C4504g> a19 = aVar4.a();
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
                    F1.c(a20, h11, aVar4.c());
                    F1.c(a20, s12, aVar4.e());
                    p<C4504g, Integer, C16807N> b13 = aVar4.b();
                    if (a20.i() || !C17542s.e(a20.D(), Integer.valueOf(a18))) {
                        a20.u(Integer.valueOf(a18));
                        a20.w(Integer.valueOf(a18), b13);
                    }
                    F1.c(a20, e13, aVar4.d());
                    C5079j jVar = C5079j.f18125a;
                    pVar4.invoke(k10, 0);
                    k10.x();
                    C16807N n13 = C16807N.f139792a;
                }
                k10.P();
                d e14 = C5842M.e(n12, aVar, 1.0f, false, 2, (Object) null);
                I h12 = C5077h.h(aVar3.o(), false);
                int a21 = C4883j.a(k10, 0);
                C4912y s13 = k10.s();
                d e15 = c.e(k10, e14);
                C17631a<C4504g> a22 = aVar4.a();
                if (k10.m() == null) {
                    C4883j.c();
                }
                k10.I();
                if (k10.i()) {
                    k10.p(a22);
                } else {
                    k10.t();
                }
                C4889m a23 = F1.a(k10);
                F1.c(a23, h12, aVar4.c());
                F1.c(a23, s13, aVar4.e());
                p<C4504g, Integer, C16807N> b14 = aVar4.b();
                if (a23.i() || !C17542s.e(a23.D(), Integer.valueOf(a21))) {
                    a23.u(Integer.valueOf(a21));
                    a23.w(Integer.valueOf(a21), b14);
                }
                F1.c(a23, e15, aVar4.d());
                C5079j jVar2 = C5079j.f18125a;
                pVar3.invoke(k10, Integer.valueOf((i12 >> 3) & 14));
                k10.x();
                k10.x();
                k10.P();
            }
            if (C4895p.J()) {
                C4895p.R();
            }
            f54 = f55;
        } else {
            k10.L();
            f54 = f53;
        }
        Y0 n14 = k10.n();
        if (n14 != null) {
            n14.a(new R5(f54, pVar, pVar2, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(F5 f52, p pVar, p pVar2, int i10, int i11, C4889m mVar, int i12) {
        b(f52, pVar, pVar2, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}

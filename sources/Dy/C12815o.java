package Dy;

import Dy.C0;
import E1.I;
import G1.C4504g;
import IC.C13023e;
import My.d;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import c2.h;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import s0.C5843N;
import s0.C5844O;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LMy/d;", "state", "LDy/k;", "actions", "LXH/N;", "d", "(LMy/d;LDy/k;LU0/m;I)V", "cart-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: Dy.o  reason: case insensitive filesystem */
public final class C12815o {
    public static final void d(d dVar, C12811k kVar, C4889m mVar, int i10) {
        int i11;
        d dVar2 = dVar;
        C12811k kVar2 = kVar;
        int i12 = i10;
        C17542s.j(dVar2, "state");
        C17542s.j(kVar2, "actions");
        C4889m k10 = mVar.k(775504408);
        if ((i12 & 6) == 0) {
            i11 = ((i12 & 8) == 0 ? k10.V(dVar2) : k10.F(dVar2) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= (i12 & 64) == 0 ? k10.V(kVar2) : k10.F(kVar2) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(775504408, i11, -1, "com.ingka.ikea.scanandgo.cart.impl.compose.CartFooterButton (CartFooterButton.kt:23)");
            }
            d.a aVar = androidx.compose.ui.d.f18749a;
            float f10 = (float) 16;
            androidx.compose.ui.d j10 = D.j(J.h(aVar, 0.0f, 1, (Object) null), h.B((float) 24), h.B(f10));
            I b10 = G.b(C5073d.f18068a.f(), C5437c.f24302a.l(), k10, 0);
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = c.e(k10, j10);
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
            C5843N n10 = C5843N.f28726a;
            C0 b12 = dVar.b();
            k10.W(-1850785345);
            int i13 = i11 & 112;
            boolean z10 = i13 == 32 || ((i11 & 64) != 0 && k10.F(kVar2));
            Object D10 = k10.D();
            if (z10 || D10 == C4889m.f14007a.a()) {
                D10 = new C12812l(kVar2);
                k10.u(D10);
            }
            k10.P();
            F0.c(b12, (C17631a) D10, k10, 0);
            k10.W(-1850783613);
            if (dVar.b() instanceof C0.b) {
                C5844O.a(J.y(aVar, h.B(f10)), k10, 6);
            }
            k10.P();
            G a13 = dVar.a();
            k10.W(-1850776606);
            boolean z11 = i13 == 32 || ((i11 & 64) != 0 && k10.F(kVar2));
            Object D11 = k10.D();
            if (z11 || D11 == C4889m.f14007a.a()) {
                D11 = new C12813m(kVar2);
                k10.u(D11);
            }
            k10.P();
            M.f(a13, (C17642l) D11, k10, C13023e.f110931a);
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n11 = k10.n();
        if (n11 != null) {
            n11.a(new C12814n(dVar2, kVar2, i12));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N e(C12811k kVar) {
        kVar.a();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N f(C12811k kVar, G g10) {
        C17542s.j(g10, "it");
        kVar.b(g10);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N g(My.d dVar, C12811k kVar, int i10, C4889m mVar, int i11) {
        d(dVar, kVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}

package xK;

import E1.I;
import G1.C4504g;
import U0.A1;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.compose.foundation.layout.A;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.graphics.b;
import c2.h;
import c2.n;
import c2.o;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import m0.C5534c;
import m0.C5548j;
import m0.y0;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import tK.C18028t;

@Metadata(d1 = {"\u0000 \n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\u001a/\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\f²\u0006\f\u0010\t\u001a\u00020\u00028\nX\u0002²\u0006\f\u0010\u000b\u001a\u00020\n8\nX\u0002"}, d2 = {"", "visible", "Lc2/h;", "transitionOffset", "Lkotlin/Function0;", "LXH/N;", "content", "d", "(ZFLnI/p;LU0/m;II)V", "targetSlide", "", "targetAlpha", "design_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: xK.d  reason: case insensitive filesystem */
public final class C18678d {
    public static final void d(boolean z10, float f10, p<? super C4889m, ? super Integer, C16807N> pVar, C4889m mVar, int i10, int i11) {
        int i12;
        boolean z11;
        float f11;
        boolean z12;
        p<? super C4889m, ? super Integer, C16807N> pVar2 = pVar;
        int i13 = i10;
        C17542s.j(pVar2, "content");
        C4889m k10 = mVar.k(1282111240);
        int i14 = i11 & 1;
        if (i14 != 0) {
            i12 = i13 | 6;
            z11 = z10;
        } else if ((i13 & 6) == 0) {
            z11 = z10;
            i12 = (k10.b(z11) ? 4 : 2) | i13;
        } else {
            z11 = z10;
            i12 = i13;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
            f11 = f10;
        } else {
            f11 = f10;
            if ((i13 & 48) == 0) {
                i12 |= k10.c(f11) ? 32 : 16;
            }
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i13 & 384) == 0) {
            i12 |= k10.F(pVar2) ? 256 : 128;
        }
        int i15 = i12;
        if ((i15 & 147) != 146 || !k10.l()) {
            boolean z13 = i14 != 0 ? true : z11;
            if (C4895p.J()) {
                C4895p.S(1282111240, i15, -1, "net.ikea.skapa.ui.motion.VerticalTransition (Animations.kt:20)");
            }
            C18028t tVar = C18028t.f147640a;
            y0 j10 = C5548j.j(300, 0, tVar.a(), 2, (Object) null);
            y0 j11 = C5548j.j(300, 0, tVar.a(), 2, (Object) null);
            A1<h> c10 = C5534c.c(z13 ? h.B((float) 0) : f11, j10, "Text transition", (C17642l<? super h, C16807N>) null, k10, 384, 8);
            z12 = z13;
            A1<Float> d10 = C5534c.d(z13 ? 1.0f : 0.0f, j11, 0.0f, "Text Alpha", (C17642l<? super Float, C16807N>) null, k10, 3072, 20);
            d.a aVar = d.f18749a;
            k10.W(589220584);
            int i16 = i15 & 14;
            boolean V10 = k10.V(d10) | (i16 == 4);
            Object D10 = k10.D();
            if (V10 || D10 == C4889m.f14007a.a()) {
                D10 = new C18675a(z12, d10);
                k10.u(D10);
            }
            k10.P();
            d a10 = b.a(aVar, (C17642l) D10);
            k10.W(589222681);
            boolean V11 = (i16 == 4) | k10.V(c10);
            Object D11 = k10.D();
            if (V11 || D11 == C4889m.f14007a.a()) {
                D11 = new C18676b(z12, c10);
                k10.u(D11);
            }
            k10.P();
            d a11 = A.a(a10, (C17642l) D11);
            I h10 = C5077h.h(C5437c.f24302a.o(), false);
            int a12 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, a11);
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
            F1.c(a14, h10, aVar2.c());
            F1.c(a14, s10, aVar2.e());
            p<C4504g, Integer, C16807N> b10 = aVar2.b();
            if (a14.i() || !C17542s.e(a14.D(), Integer.valueOf(a12))) {
                a14.u(Integer.valueOf(a12));
                a14.w(Integer.valueOf(a12), b10);
            }
            F1.c(a14, e10, aVar2.d());
            C5079j jVar = C5079j.f18125a;
            pVar2.invoke(k10, Integer.valueOf((i15 >> 6) & 14));
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            z12 = z11;
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C18677c(z12, f10, pVar, i10, i11));
        }
    }

    private static final float e(A1<h> a12) {
        return a12.getValue().G();
    }

    private static final float f(A1<Float> a12) {
        return a12.getValue().floatValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N g(boolean z10, A1 a12, androidx.compose.ui.graphics.c cVar) {
        C17542s.j(cVar, "$this$graphicsLayer");
        cVar.d(z10 ? f(a12) : 0.0f);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final n h(boolean z10, A1 a12, c2.d dVar) {
        C17542s.j(dVar, "$this$offset");
        return n.b(o.a(0, z10 ? dVar.K0(e(a12)) : 0));
    }

    /* access modifiers changed from: private */
    public static final C16807N i(boolean z10, float f10, p pVar, int i10, int i11, C4889m mVar, int i12) {
        d(z10, f10, pVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}

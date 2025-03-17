package kF;

import A0.g;
import E1.I;
import G1.C4504g;
import I0.b1;
import J1.j;
import N1.P;
import OE.n;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import Y1.k;
import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.G;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import c2.h;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import m1.e;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import p1.i1;
import rF.C15002a;
import s0.C5842M;
import s0.C5843N;
import s0.C5844O;
import tK.C18030v;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/d;", "modifier", "LkF/K;", "stepIndicatorInformation", "LXH/N;", "b", "(Landroidx/compose/ui/d;LkF/K;LU0/m;II)V", "base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: kF.M  reason: case insensitive filesystem */
public final class C14692M {
    public static final void b(d dVar, C14690K k10, C4889m mVar, int i10, int i11) {
        int i12;
        d dVar2;
        C4889m mVar2;
        d dVar3;
        long n10;
        C14690K k11 = k10;
        int i13 = i10;
        int i14 = i11;
        C17542s.j(k11, "stepIndicatorInformation");
        C4889m k12 = mVar.k(-1329316571);
        int i15 = i14 & 1;
        if (i15 != 0) {
            i12 = i13 | 6;
            dVar2 = dVar;
        } else if ((i13 & 6) == 0) {
            dVar2 = dVar;
            i12 = (k12.V(dVar2) ? 4 : 2) | i13;
        } else {
            dVar2 = dVar;
            i12 = i13;
        }
        if ((i14 & 2) != 0) {
            i12 |= 48;
        } else if ((i13 & 48) == 0) {
            i12 |= k12.V(k11) ? 32 : 16;
        }
        if ((i12 & 19) != 18 || !k12.l()) {
            d.a aVar = i15 != 0 ? d.f18749a : dVar2;
            if (C4895p.J()) {
                C4895p.S(-1329316571, i12, -1, "com.sugarcube.app.base.ui.compose.common.StepIndicator (StepIndicator.kt:48)");
            }
            String c10 = j.c(n.f113458t1, new Object[]{Integer.valueOf(k10.a()), Integer.valueOf(k10.b())}, k12, 0);
            d h10 = J.h(aVar, 0.0f, 1, (Object) null);
            C5437c.a aVar2 = C5437c.f24302a;
            C5437c.C0386c i16 = aVar2.i();
            C5073d dVar4 = C5073d.f18068a;
            I b10 = G.b(dVar4.f(), i16, k12, 48);
            int a10 = C4883j.a(k12, 0);
            C4912y s10 = k12.s();
            d e10 = c.e(k12, h10);
            C4504g.a aVar3 = C4504g.f6515W;
            C17631a<C4504g> a11 = aVar3.a();
            if (k12.m() == null) {
                C4883j.c();
            }
            k12.I();
            if (k12.i()) {
                k12.p(a11);
            } else {
                k12.t();
            }
            C4889m a12 = F1.a(k12);
            F1.c(a12, b10, aVar3.c());
            F1.c(a12, s10, aVar3.e());
            p<C4504g, Integer, C16807N> b11 = aVar3.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b11);
            }
            F1.c(a12, e10, aVar3.d());
            C5843N n11 = C5843N.f28726a;
            C18030v vVar = C18030v.f147664a;
            int i17 = C18030v.f147665b;
            d dVar5 = aVar;
            C4889m mVar3 = k12;
            b1.b(c10, (d) null, vVar.a(k12, i17).u0(), 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (Y1.j) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, vVar.b(k12, i17).c().c(), mVar3, 0, 0, 65530);
            d.a aVar4 = d.f18749a;
            mVar2 = mVar3;
            C5844O.a(J.y(aVar4, h.B((float) 16)), mVar2, 6);
            I b12 = G.b(dVar4.f(), aVar2.l(), mVar2, 0);
            int a13 = C4883j.a(mVar2, 0);
            C4912y s11 = mVar2.s();
            d e11 = c.e(mVar2, aVar4);
            C17631a<C4504g> a14 = aVar3.a();
            if (mVar2.m() == null) {
                C4883j.c();
            }
            mVar2.I();
            if (mVar2.i()) {
                mVar2.p(a14);
            } else {
                mVar2.t();
            }
            C4889m a15 = F1.a(mVar2);
            F1.c(a15, b12, aVar3.c());
            F1.c(a15, s11, aVar3.e());
            p<C4504g, Integer, C16807N> b13 = aVar3.b();
            if (a15.i() || !C17542s.e(a15.D(), Integer.valueOf(a13))) {
                a15.u(Integer.valueOf(a13));
                a15.w(Integer.valueOf(a13), b13);
            }
            F1.c(a15, e11, aVar3.d());
            mVar2.W(288282026);
            int b14 = k10.b();
            for (int i18 = 0; i18 < b14; i18++) {
                if (k10.a() - 1 >= i18) {
                    mVar2.W(-742748928);
                    n10 = C15002a.a(mVar2, 0).m();
                    mVar2.P();
                } else {
                    mVar2.W(-742664546);
                    n10 = C15002a.a(mVar2, 0).n();
                    mVar2.P();
                }
                float f10 = (float) 2;
                C5077h.a(J.i(C5842M.e(n11, b.d(e.a(D.i(d.f18749a, h.B(f10)), g.e(h.B(f10))), n10, (i1) null, 2, (Object) null), 1.0f, false, 2, (Object) null), h.B(f10)), mVar2, 0);
            }
            mVar2.P();
            mVar2.x();
            mVar2.x();
            if (C4895p.J()) {
                C4895p.R();
            }
            dVar3 = dVar5;
        } else {
            k12.L();
            dVar3 = dVar2;
            mVar2 = k12;
        }
        Y0 n12 = mVar2.n();
        if (n12 != null) {
            n12.a(new C14691L(dVar3, k11, i13, i14));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(d dVar, C14690K k10, int i10, int i11, C4889m mVar, int i12) {
        b(dVar, k10, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}

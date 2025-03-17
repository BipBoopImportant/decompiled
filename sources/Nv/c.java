package Nv;

import Dr.d;
import E1.I;
import G1.C4504g;
import N1.P;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13575d;
import SC.C13607l;
import TC.C13679b;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4910x;
import U0.C4912y;
import U0.F1;
import U0.I0;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import Y1.f;
import Y1.j;
import Y1.k;
import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.C5074e;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5135u0;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import p1.i1;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\"&\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0000X\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/d;", "modifier", "LXH/N;", "c", "(Landroidx/compose/ui/d;LU0/m;II)V", "LU0/I0;", "LDr/d;", "a", "LU0/I0;", "f", "()LU0/I0;", "getLocalKreativListsCard$annotations", "()V", "LocalKreativListsCard", "membership-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final I0<d> f39190a = C4910x.f(new a());

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0017¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Nv/c$a", "LDr/d;", "Landroidx/compose/ui/d;", "modifier", "LDr/d$b;", "model", "Lkotlin/Function1;", "LDr/d$a;", "LXH/N;", "onAction", "a", "(Landroidx/compose/ui/d;LDr/d$b;LnI/l;LU0/m;I)V", "membership-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements d {
        a() {
        }

        public void a(androidx.compose.ui.d dVar, d.b bVar, C17642l<? super d.a, C16807N> lVar, C4889m mVar, int i10) {
            C17542s.j(dVar, "modifier");
            C17542s.j(bVar, "model");
            C17542s.j(lVar, "onAction");
            mVar.W(-2070554322);
            if (C4895p.J()) {
                C4895p.S(-2070554322, i10, -1, "com.ingka.ikea.membership.impl.compose.util.LocalKreativListsCard.<anonymous>.<no name provided>.Execute (CompositionLocal.kt:32)");
            }
            if (((Boolean) mVar.Q(C5135u0.a())).booleanValue()) {
                c.c((androidx.compose.ui.d) null, mVar, 0, 1);
                if (C4895p.J()) {
                    C4895p.R();
                }
                mVar.P();
                return;
            }
            throw new IllegalStateException("Trying to use default implementation on a real build.\nNeed to provide real implementation by doing:\n\n  CompositionLocalProvider(LocalKreativListsCard provides <impl>) { \n      // your Composable\n  }");
        }
    }

    public static final void c(androidx.compose.ui.d dVar, C4889m mVar, int i10, int i11) {
        int i12;
        androidx.compose.ui.d dVar2;
        C4889m mVar2;
        androidx.compose.ui.d dVar3;
        int i13 = i10;
        int i14 = i11;
        C4889m k10 = mVar.k(1034222258);
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
            d.a aVar = i15 != 0 ? androidx.compose.ui.d.f18749a : dVar2;
            if (C4895p.J()) {
                C4895p.S(1034222258, i12, -1, "com.ingka.ikea.membership.impl.compose.util.KreativPlaceholder (CompositionLocal.kt:55)");
            }
            androidx.compose.ui.d d10 = b.d(C5074e.b(J.h(aVar, 0.0f, 1, (Object) null), 0.7653061f, false, 2, (Object) null), C13575d.a(k10, 0).m0(), (i1) null, 2, (Object) null);
            I h10 = C5077h.h(C5437c.f24302a.e(), false);
            int a10 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            androidx.compose.ui.d e10 = androidx.compose.ui.c.e(k10, d10);
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
            F1.c(a12, h10, aVar2.c());
            F1.c(a12, s10, aVar2.e());
            p<C4504g, Integer, C16807N> b10 = aVar2.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b10);
            }
            F1.c(a12, e10, aVar2.d());
            C5079j jVar = C5079j.f18125a;
            dVar3 = aVar;
            mVar2 = k10;
            C13607l.j("Kreativ Placeholder", C13679b.C2857b.a.f116683a, (androidx.compose.ui.d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar2, 54, 0, 262140);
            mVar2.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            dVar3 = dVar2;
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new b(dVar3, i13, i14));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N d(androidx.compose.ui.d dVar, int i10, int i11, C4889m mVar, int i12) {
        c(dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final Dr.d e() {
        return new a();
    }

    public static final I0<Dr.d> f() {
        return f39190a;
    }
}

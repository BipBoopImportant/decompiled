package nj;

import E1.I;
import G1.C4504g;
import J1.e;
import N1.P;
import O0.V;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13607l;
import TC.C13679b;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import Y1.f;
import Y1.j;
import Y1.k;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
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
import nj.C11608B;
import s0.C5862h;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0019\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\tH\u0003¢\u0006\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Loj/d;", "model", "LXH/N;", "i", "(Loj/d;LU0/m;I)V", "", "icon", "g", "(ILU0/m;I)V", "", "title", "k", "(Ljava/lang/String;LU0/m;I)V", "text", "e", "scanandgo-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: nj.g  reason: case insensitive filesystem */
public final class C11622g {
    private static final void e(String str, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        String str2 = str;
        C4889m k10 = mVar.k(-1726579975);
        if ((i10 & 6) == 0) {
            i11 = i10 | (k10.V(str2) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-1726579975, i11, -1, "com.ingka.ikea.app.scanandgoonlineredesign.dialog.bottomsheet.composable.BodyText (GeneralErrorMessageContent.kt:75)");
            }
            mVar2 = k10;
            C13607l.j(str, C13679b.a.C2856b.f116680a, (d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, j.h(j.f14783b.a()), (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar2, (i11 & 14) | 48, 0, 261116);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new C11620e(str, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N f(String str, int i10, C4889m mVar, int i11) {
        e(str, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void g(int i10, C4889m mVar, int i11) {
        int i12;
        C4889m k10 = mVar.k(1069200891);
        if ((i11 & 6) == 0) {
            i12 = (k10.d(i10) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i12 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1069200891, i12, -1, "com.ingka.ikea.app.scanandgoonlineredesign.dialog.bottomsheet.composable.ErrorIcon (GeneralErrorMessageContent.kt:53)");
            }
            d a10 = C5116k1.a(d.f18749a, "GENERAL_ERROR_MESSAGE_ICON_TEST_TAG");
            C11608B.a aVar = C11608B.a.f99717a;
            V.a(e.c(i10, k10, i12 & 14), (String) null, D.m(a10, 0.0f, 0.0f, 0.0f, aVar.a(), 7, (Object) null), aVar.b(k10, 6), k10, 432, 0);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C11621f(i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N h(int i10, int i11, C4889m mVar, int i12) {
        g(i10, mVar, M0.a(i11 | 1));
        return C16807N.f139792a;
    }

    public static final void i(oj.d dVar, C4889m mVar, int i10) {
        int i11;
        C17542s.j(dVar, "model");
        C4889m k10 = mVar.k(1221048523);
        if ((i10 & 6) == 0) {
            i11 = (k10.V(dVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1221048523, i11, -1, "com.ingka.ikea.app.scanandgoonlineredesign.dialog.bottomsheet.composable.GeneralErrorMessageContent (GeneralErrorMessageContent.kt:32)");
            }
            d k11 = D.k(TC.e.i(J.h(d.f18749a, 0.0f, 1, (Object) null)), 0.0f, h.B((float) 24), 1, (Object) null);
            I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.g(), k10, 48);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, k11);
            C4504g.a aVar = C4504g.f6515W;
            C17631a<C4504g> a12 = aVar.a();
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
            F1.c(a13, a10, aVar.c());
            F1.c(a13, s10, aVar.e());
            p<C4504g, Integer, C16807N> b10 = aVar.b();
            if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                a13.u(Integer.valueOf(a11));
                a13.w(Integer.valueOf(a11), b10);
            }
            F1.c(a13, e10, aVar.d());
            C5862h hVar = C5862h.f28810a;
            k10.W(849631101);
            if (dVar.g() != 0) {
                g(dVar.g(), k10, 0);
            }
            k10.P();
            k10.W(849633751);
            if (dVar.i() != null) {
                k(dVar.i(), k10, 0);
            }
            k10.P();
            e(dVar.h(), k10, 0);
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C11618c(dVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N j(oj.d dVar, int i10, C4889m mVar, int i11) {
        i(dVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }

    private static final void k(String str, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        String str2 = str;
        C4889m k10 = mVar.k(-471750842);
        if ((i10 & 6) == 0) {
            i11 = i10 | (k10.V(str2) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-471750842, i11, -1, "com.ingka.ikea.app.scanandgoonlineredesign.dialog.bottomsheet.composable.Title (GeneralErrorMessageContent.kt:65)");
            }
            mVar2 = k10;
            C13607l.j(str, C13679b.C2857b.c.f116685a, D.m(d.f18749a, 0.0f, 0.0f, 0.0f, h.B((float) 12), 7, (Object) null), 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, j.h(j.f14783b.a()), (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar2, (i11 & 14) | 432, 0, 261112);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new C11619d(str, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N l(String str, int i10, C4889m mVar, int i11) {
        k(str, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}

package jF;

import E1.I;
import G1.C4504g;
import I0.b1;
import N1.P;
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
import Y1.j;
import Y1.k;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.layout.D;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import c2.h;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import s0.C5844O;
import s0.C5862h;
import tK.C18030v;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "title", "body", "LXH/N;", "b", "(Ljava/lang/String;Ljava/lang/String;LU0/m;I)V", "base_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: jF.x  reason: case insensitive filesystem */
public final class C14652x {
    public static final void b(String str, String str2, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        String str3 = str;
        String str4 = str2;
        C17542s.j(str3, "title");
        C17542s.j(str4, "body");
        C4889m k10 = mVar.k(-2047781278);
        if ((i10 & 6) == 0) {
            i11 = i10 | (k10.V(str3) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.V(str4) ? 32 : 16;
        }
        int i12 = i11;
        if ((i12 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-2047781278, i12, -1, "com.sugarcube.app.base.ui.compose.capture.chooseroom.SmallSpaceScanTip (SmallSpaceScanTip.kt:27)");
            }
            d.a aVar = d.f18749a;
            float f10 = (float) 16;
            d j10 = D.j(aVar, h.B(f10), h.B(f10));
            I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), k10, 0);
            int a11 = C4883j.a(k10, 0);
            C4912y s10 = k10.s();
            d e10 = c.e(k10, j10);
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
            C18030v vVar = C18030v.f147664a;
            int i13 = C18030v.f147665b;
            C4889m mVar3 = k10;
            b1.b(str, (d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, vVar.b(k10, i13).c().b(), mVar3, i12 & 14, 0, 65534);
            C4889m mVar4 = mVar3;
            C5844O.a(D.k(aVar, 0.0f, h.B((float) 4), 1, (Object) null), mVar4, 6);
            mVar2 = mVar4;
            b1.b(str2, (d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, vVar.b(mVar4, i13).a().b(), mVar2, (i12 >> 3) & 14, 0, 65534);
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
            n10.a(new C14651w(str, str2, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(String str, String str2, int i10, C4889m mVar, int i11) {
        b(str, str2, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}

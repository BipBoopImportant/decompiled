package xD;

import E1.C4478k;
import E1.I;
import G1.C4504g;
import QJ.M;
import SC.C13575d;
import SC.H2;
import U0.C4883j;
import U0.C4889m;
import U0.C4895p;
import U0.C4912y;
import U0.F1;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.compose.foundation.b;
import androidx.compose.foundation.layout.C5077h;
import androidx.compose.foundation.layout.C5079j;
import androidx.compose.foundation.layout.D;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import c2.h;
import com.google.android.libraries.places.api.model.PlaceTypes;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import m1.e;
import n0.C5583F;
import nI.C17631a;
import nI.p;
import nI.q;
import p1.C5749w0;
import s0.C5857c;
import t1.C5940a;
import t1.C5942c;
import vD.C15135c;
import vm.C12190a;
import vm.C12192c;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a-\u0010\n\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00040\u0007H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u0019\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lt1/c;", "painter", "Landroidx/compose/ui/d;", "modifier", "LXH/N;", "d", "(Lt1/c;Landroidx/compose/ui/d;LU0/m;II)V", "Lkotlin/Function1;", "Ls0/c;", "content", "f", "(Landroidx/compose/ui/d;LnI/q;LU0/m;II)V", "h", "(Landroidx/compose/ui/d;LU0/m;II)V", "", "number", "Lt1/a;", "j", "(Ljava/lang/String;LU0/m;I)Lt1/a;", "wallet-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class k {
    public static final void d(C5942c cVar, d dVar, C4889m mVar, int i10, int i11) {
        int i12;
        C17542s.j(cVar, PlaceTypes.PAINTER);
        C4889m k10 = mVar.k(-332907623);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (k10.F(cVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= k10.V(dVar) ? 32 : 16;
        }
        if ((i12 & 19) != 18 || !k10.l()) {
            if (i13 != 0) {
                dVar = d.f18749a;
            }
            if (C4895p.J()) {
                C4895p.S(-332907623, i12, -1, "com.ingka.ikea.wallet.impl.compose.card.common.QrCode (QrCode.kt:29)");
            }
            C5583F.a(cVar, (String) null, C5116k1.a(dVar, "WalletTestTags-QrCode"), (C5437c) null, (C4478k) null, 0.0f, (C5749w0) null, k10, (i12 & 14) | 48, 120);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new h(cVar, dVar, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N e(C5942c cVar, d dVar, int i10, int i11, C4889m mVar, int i12) {
        d(cVar, dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    public static final void f(d dVar, q<? super C5857c, ? super C4889m, ? super Integer, C16807N> qVar, C4889m mVar, int i10, int i11) {
        int i12;
        d dVar2;
        d dVar3;
        q<? super C5857c, ? super C4889m, ? super Integer, C16807N> qVar2 = qVar;
        int i13 = i10;
        int i14 = i11;
        C17542s.j(qVar2, "content");
        C4889m k10 = mVar.k(1781904387);
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
        if ((i14 & 2) != 0) {
            i12 |= 48;
        } else if ((i13 & 48) == 0) {
            i12 |= k10.F(qVar2) ? 32 : 16;
        }
        if ((i12 & 19) != 18 || !k10.l()) {
            dVar3 = i15 != 0 ? d.f18749a : dVar2;
            if (C4895p.J()) {
                C4895p.S(1781904387, i12, -1, "com.ingka.ikea.wallet.impl.compose.card.common.QrCodeContainer (QrCode.kt:41)");
            }
            d m10 = D.m(d.f18749a, 0.0f, h.B((float) 4), 0.0f, 0.0f, 13, (Object) null);
            C15135c cVar = C15135c.f131438a;
            d s10 = D.i(b.c(J.w(m10, cVar.b(), cVar.b(), cVar.a(), cVar.a()), C13575d.a(k10, 0).F0(), cVar.d()), cVar.c()).s(dVar3);
            int i16 = (i12 << 6) & 7168;
            I h10 = C5077h.h(C5437c.f24302a.o(), false);
            int a10 = C4883j.a(k10, 0);
            C4912y s11 = k10.s();
            d e10 = c.e(k10, s10);
            C4504g.a aVar = C4504g.f6515W;
            C17631a<C4504g> a11 = aVar.a();
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
            F1.c(a12, h10, aVar.c());
            F1.c(a12, s11, aVar.e());
            p<C4504g, Integer, C16807N> b10 = aVar.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b10);
            }
            F1.c(a12, e10, aVar.d());
            qVar2.invoke(C5079j.f18125a, k10, Integer.valueOf(((i16 >> 6) & 112) | 6));
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            dVar3 = dVar2;
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new i(dVar3, qVar2, i13, i14));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N g(d dVar, q qVar, int i10, int i11, C4889m mVar, int i12) {
        f(dVar, qVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    public static final void h(d dVar, C4889m mVar, int i10, int i11) {
        int i12;
        d dVar2;
        d dVar3;
        int i13 = i10;
        int i14 = i11;
        C4889m k10 = mVar.k(-1569577611);
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
            dVar3 = i15 != 0 ? d.f18749a : dVar2;
            if (C4895p.J()) {
                C4895p.S(-1569577611, i12, -1, "com.ingka.ikea.wallet.impl.compose.card.common.QrCodeContainerLoading (QrCode.kt:64)");
            }
            d.a aVar = d.f18749a;
            d m10 = D.m(aVar, 0.0f, h.B((float) 4), 0.0f, 0.0f, 13, (Object) null);
            C15135c cVar = C15135c.f131438a;
            d s10 = e.a(J.w(m10, cVar.b(), cVar.b(), cVar.a(), cVar.a()), cVar.d()).s(dVar3);
            I h10 = C5077h.h(C5437c.f24302a.o(), false);
            int a10 = C4883j.a(k10, 0);
            C4912y s11 = k10.s();
            d e10 = c.e(k10, s10);
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
            F1.c(a12, s11, aVar2.e());
            p<C4504g, Integer, C16807N> b10 = aVar2.b();
            if (a12.i() || !C17542s.e(a12.D(), Integer.valueOf(a10))) {
                a12.u(Integer.valueOf(a10));
                a12.w(Integer.valueOf(a10), b10);
            }
            F1.c(a12, e10, aVar2.d());
            C5079j jVar = C5079j.f18125a;
            H2.b(J.f(aVar, 0.0f, 1, (Object) null), false, k10, 6, 2);
            k10.x();
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            dVar3 = dVar2;
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new j(dVar3, i13, i14));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N i(d dVar, int i10, int i11, C4889m mVar, int i12) {
        h(dVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }

    public static final C5940a j(String str, C4889m mVar, int i10) {
        C17542s.j(str, "number");
        mVar.W(1006871309);
        if (C4895p.J()) {
            C4895p.S(1006871309, i10, -1, "com.ingka.ikea.wallet.impl.compose.card.common.rememberQrPainter (QrCode.kt:83)");
        }
        C15135c cVar = C15135c.f131438a;
        String str2 = str;
        C5940a e10 = C12192c.e(str2, C12190a.C2496a.QR_CODE, cVar.a(), cVar.a(), 0.0f, false, false, 0.0f, (M) null, mVar, (i10 & 14) | 3504, 496);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
        return e10;
    }
}

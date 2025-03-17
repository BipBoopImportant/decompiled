package yn;

import E1.I;
import G1.C4504g;
import N1.P;
import O0.F0;
import Oo.b;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import SC.C13607l;
import SC.C13656x1;
import SC.C13660y1;
import SC.C13664z1;
import SC.J;
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
import Y1.j;
import Y1.k;
import androidx.compose.foundation.layout.C5073d;
import androidx.compose.foundation.layout.C5080k;
import androidx.compose.foundation.m;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import i1.C5437c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import p0.s;
import s0.C5848T;
import s0.C5850V;
import s0.C5851W;
import s0.C5853Y;
import s0.C5862h;
import s0.a0;
import uK.C18146a;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LO0/F0;", "bottomSheetState", "", "disclaimer", "Lkotlin/Function0;", "LXH/N;", "onHideBottomSheet", "b", "(LO0/F0;Ljava/lang/String;LnI/a;LU0/m;I)V", "plp-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: yn.J  reason: case insensitive filesystem */
public final class C12396J {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: yn.J$a */
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f106638a;

        a(String str) {
            this.f106638a = str;
        }

        public final void a(C4889m mVar, int i10) {
            C4889m mVar2 = mVar;
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(2040744541, i11, -1, "com.ingka.ikea.browseandsearch.plp.impl.composables.DisclaimerBottomSheet.<anonymous> (DisclaimerBottomSheet.kt:39)");
                }
                d i12 = e.i(C5851W.d(m.f(d.f18749a, m.c(0, mVar2, 0, 1), false, (s) null, false, 14, (Object) null), C5850V.i(a0.b(C5848T.f28733a, mVar2, 6), C5853Y.f28774a.e())));
                String str = this.f106638a;
                I a10 = C5080k.a(C5073d.f18068a.g(), C5437c.f24302a.k(), mVar2, 0);
                int a11 = C4883j.a(mVar2, 0);
                C4912y s10 = mVar.s();
                d e10 = c.e(mVar2, i12);
                C4504g.a aVar = C4504g.f6515W;
                C17631a<C4504g> a12 = aVar.a();
                if (mVar.m() == null) {
                    C4883j.c();
                }
                mVar.I();
                if (mVar.i()) {
                    mVar2.p(a12);
                } else {
                    mVar.t();
                }
                C4889m a13 = F1.a(mVar);
                F1.c(a13, a10, aVar.c());
                F1.c(a13, s10, aVar.e());
                p<C4504g, Integer, C16807N> b10 = aVar.b();
                if (a13.i() || !C17542s.e(a13.D(), Integer.valueOf(a11))) {
                    a13.u(Integer.valueOf(a11));
                    a13.w(Integer.valueOf(a11), b10);
                }
                F1.c(a13, e10, aVar.d());
                C5862h hVar = C5862h.f28810a;
                C13607l.j(str, C13679b.a.C2856b.f116680a, (d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C17642l<? super P, C16807N>) null, mVar, 48, 0, 262140);
                mVar.x();
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    public static final void b(F0 f02, String str, C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        F0 f03 = f02;
        String str2 = str;
        C17631a<C16807N> aVar2 = aVar;
        int i12 = i10;
        C17542s.j(f03, "bottomSheetState");
        C17542s.j(str2, "disclaimer");
        C17542s.j(aVar2, "onHideBottomSheet");
        C4889m k10 = mVar.k(-317961189);
        if ((i12 & 6) == 0) {
            i11 = (k10.V(f03) ? 4 : 2) | i12;
        } else {
            i11 = i12;
        }
        if ((i12 & 48) == 0) {
            i11 |= k10.V(str2) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i11 |= k10.F(aVar2) ? 256 : 128;
        }
        if ((i11 & 147) != 146 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-317961189, i11, -1, "com.ingka.ikea.browseandsearch.plp.impl.composables.DisclaimerBottomSheet (DisclaimerBottomSheet.kt:34)");
            }
            mVar2 = k10;
            J.c(true, new C13656x1.b((String) null, new C13660y1(C18146a.f148097J2, J1.j.b(b.f84665i, k10, 0), aVar2), (C13660y1) null), aVar, (d) null, f02, (C13664z1) null, false, 0, 0.0f, (C5848T) null, c1.c.e(2040744541, true, new a(str2), k10, 54), mVar2, (C13656x1.b.f116494d << 3) | 6 | (i11 & 896) | ((i11 << 12) & 57344), 6, 1000);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new C12394I(f02, str, aVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(F0 f02, String str, C17631a aVar, int i10, C4889m mVar, int i11) {
        b(f02, str, aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}

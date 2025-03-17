package Yn;

import B0.C4373q;
import IC.C13021c;
import KJ.C15988d;
import N1.C4669d;
import N1.D;
import N1.G;
import N1.P;
import S1.C;
import S1.C4820m;
import S1.C4830x;
import S1.C4831y;
import SC.C13585f1;
import SC.C13589g1;
import SC.C13607l;
import TC.C13679b;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import U1.e;
import XH.C16807N;
import Y1.f;
import Y1.j;
import Y1.k;
import Y1.o;
import androidx.compose.ui.d;
import c1.c;
import c2.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import nI.q;
import p1.g1;
import r0.m;
import r1.g;
import rv.C11849b;
import s0.C5842M;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "postalCode", "Lkotlin/Function0;", "LXH/N;", "onPostalCodeClicked", "b", "(Ljava/lang/String;LnI/a;LU0/m;I)V", "checkout-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class i0 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C4669d f89455a;

        a(C4669d dVar) {
            this.f89455a = dVar;
        }

        public final void a(C4889m mVar, int i10) {
            int i11 = i10;
            if ((i11 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1368145, i11, -1, "com.ingka.ikea.checkout.impl.compose.PostalCodeInfoEntry.<anonymous> (PostalCodeInfoEntry.kt:46)");
                }
                C13607l.h(this.f89455a, C13679b.a.C2856b.f116680a, (d) null, 0, 0, (C4830x) null, (C) null, (C4820m) null, 0, (k) null, (j) null, (f) null, 0, 0, false, 0, 0, (C15988d<String, C4373q>) null, (C17642l<? super P, C16807N>) null, mVar, 48, 0, 524284);
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

    public static final void b(String str, C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        C4889m mVar2;
        String str2 = str;
        C17631a<C16807N> aVar2 = aVar;
        C17542s.j(str2, "postalCode");
        C17542s.j(aVar2, "onPostalCodeClicked");
        C4889m k10 = mVar.k(1536064566);
        if ((i10 & 6) == 0) {
            i11 = i10 | (k10.V(str2) ? 4 : 2);
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.F(aVar2) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1536064566, i11, -1, "com.ingka.ikea.checkout.impl.compose.PostalCodeInfoEntry (PostalCodeInfoEntry.kt:28)");
            }
            mVar2 = k10;
            C13585f1.d(c.e(1368145, true, new a(C13021c.e(J1.j.c(C11849b.f102174D, new Object[]{str}, k10, 0), str2, new G(0, 0, C.f13316b.a(), (C4830x) null, (C4831y) null, (C4820m) null, (String) null, 0, (Y1.a) null, (o) null, (e) null, 0, k.f14792b.d(), (g1) null, (D) null, (g) null, 61435, (DefaultConstructorMarker) null))), k10, 54), aVar, androidx.compose.foundation.layout.D.m(d.f18749a, 0.0f, 0.0f, 0.0f, h.B((float) 16), 7, (Object) null), (p<? super C4889m, ? super Integer, C16807N>) null, (q<? super C5842M, ? super C4889m, ? super Integer, C16807N>) null, (q<? super C5842M, ? super C4889m, ? super Integer, C16807N>) null, (p<? super C4889m, ? super Integer, C16807N>) null, C13589g1.Small, 0.0f, false, (m) null, k10, (i11 & 112) | 12583302, 0, 1912);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
            mVar2 = k10;
        }
        Y0 n10 = mVar2.n();
        if (n10 != null) {
            n10.a(new h0(str2, aVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(String str, C17631a aVar, int i10, C4889m mVar, int i11) {
        b(str, aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}

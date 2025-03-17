package eC;

import J1.j;
import SC.K0;
import SC.L;
import SC.M;
import SC.N;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.compose.animation.g;
import androidx.compose.foundation.layout.J;
import androidx.compose.ui.d;
import androidx.compose.ui.platform.C5116k1;
import c1.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import l0.e;
import nI.C17631a;
import nI.q;
import r0.m;
import uK.C18148c;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"", "visible", "Landroidx/compose/ui/d;", "modifier", "Lkotlin/Function0;", "LXH/N;", "onClick", "b", "(ZLandroidx/compose/ui/d;LnI/a;LU0/m;II)V", "storedetails-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: eC.b  reason: case insensitive filesystem */
public final class C14379b {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* renamed from: eC.b$a */
    static final class a implements q<e, C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f126539a;

        a(C17631a<C16807N> aVar) {
            this.f126539a = aVar;
        }

        public final void a(e eVar, C4889m mVar, int i10) {
            C17542s.j(eVar, "$this$AnimatedVisibility");
            if (C4895p.J()) {
                C4895p.S(-450394785, i10, -1, "com.ingka.ikea.storedetails.impl.presentation.ui.PopularTimesButton.<anonymous> (PopularTimesButton.kt:34)");
            }
            C4889m mVar2 = mVar;
            String b10 = j.b(ax.e.f118801a, mVar2, 0);
            int m10 = C18148c.People.m();
            L.b(b10, C5116k1.a(TC.e.i(J.h(d.f18749a, 0.0f, 1, (Object) null)), "popular_times_entry_point"), false, N.Emphasised, (M) null, false, Integer.valueOf(m10), (K0) null, (m) null, this.f126539a, mVar2, 3072, 436);
            if (C4895p.J()) {
                C4895p.R();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((e) obj, (C4889m) obj2, ((Number) obj3).intValue());
            return C16807N.f139792a;
        }
    }

    public static final void b(boolean z10, d dVar, C17631a<C16807N> aVar, C4889m mVar, int i10, int i11) {
        int i12;
        C17542s.j(aVar, "onClick");
        C4889m k10 = mVar.k(-1938332873);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (k10.b(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= k10.V(dVar) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            i12 |= k10.F(aVar) ? 256 : 128;
        }
        if ((i12 & 147) != 146 || !k10.l()) {
            if (i13 != 0) {
                dVar = d.f18749a;
            }
            if (C4895p.J()) {
                C4895p.S(-1938332873, i12, -1, "com.ingka.ikea.storedetails.impl.presentation.ui.PopularTimesButton (PopularTimesButton.kt:27)");
            }
            l0.d.g(z10, dVar, g.o((m0.N) null, 0.0f, 3, (Object) null), g.q((m0.N) null, 0.0f, 3, (Object) null), (String) null, c.e(-450394785, true, new a(aVar), k10, 54), k10, (i12 & 14) | 200064 | (i12 & 112), 16);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        d dVar2 = dVar;
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C14378a(z10, dVar2, aVar, i10, i11));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(boolean z10, d dVar, C17631a aVar, int i10, int i11, C4889m mVar, int i12) {
        b(z10, dVar, aVar, mVar, M0.a(i10 | 1), i11);
        return C16807N.f139792a;
    }
}

package yn;

import An.c;
import HC.C12975d;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import XH.C16807N;
import androidx.compose.ui.d;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kp.C11519a;
import kp.C11520b;
import nI.C17642l;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LAn/c;", "campaignsUiModel", "Lkotlin/Function1;", "Lkp/a;", "LXH/N;", "onCampaignClicked", "c", "(LAn/c;LnI/l;LU0/m;I)V", "plp-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: yn.m0  reason: case insensitive filesystem */
public final class C12455m0 {
    public static final void c(c cVar, C17642l<? super C11519a, C16807N> lVar, C4889m mVar, int i10) {
        int i11;
        C17542s.j(cVar, "campaignsUiModel");
        C17542s.j(lVar, "onCampaignClicked");
        C4889m k10 = mVar.k(-44471045);
        if ((i10 & 6) == 0) {
            i11 = (k10.F(cVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= k10.F(lVar) ? 32 : 16;
        }
        if ((i11 & 19) != 18 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(-44471045, i11, -1, "com.ingka.ikea.browseandsearch.plp.impl.composables.PlpCampaigns (PlpCampaigns.kt:16)");
            }
            C11520b bVar = new C11520b(cVar.h(), cVar.g());
            k10.W(-1932474236);
            boolean z10 = (i11 & 112) == 32;
            Object D10 = k10.D();
            if (z10 || D10 == C4889m.f14007a.a()) {
                D10 = new C12449k0(lVar);
                k10.u(D10);
            }
            k10.P();
            C12975d.d(bVar, (C17642l) D10, (d) null, k10, 0, 4);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new C12452l0(cVar, lVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N d(C17642l lVar, C11519a aVar) {
        C17542s.j(aVar, "campaign");
        lVar.invoke(aVar);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N e(c cVar, C17642l lVar, int i10, C4889m mVar, int i11) {
        c(cVar, lVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}

package Xu;

import TC.e;
import U0.C4889m;
import U0.C4895p;
import U0.M0;
import U0.Y0;
import Vu.h;
import XH.C16807N;
import c1.c;
import kotlin.Metadata;
import nI.C17631a;
import nI.p;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0003¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/Function0;", "LXH/N;", "onClosedClicked", "b", "(LnI/a;LU0/m;I)V", "itemavailability-implementation_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C17631a<C16807N> f89292a;

        a(C17631a<C16807N> aVar) {
            this.f89292a = aVar;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1713603898, i10, -1, "com.ingka.ikea.itemavailability.impl.ui.SkapaThemedLearnAboutDeliveryScreen.<anonymous> (LearnAboutDeliveryDialogFragment.kt:51)");
                }
                h.r(this.f89292a, mVar, 0);
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

    /* access modifiers changed from: private */
    public static final void b(C17631a<C16807N> aVar, C4889m mVar, int i10) {
        int i11;
        C4889m k10 = mVar.k(1490333396);
        if ((i10 & 6) == 0) {
            i11 = (k10.F(aVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 3) != 2 || !k10.l()) {
            if (C4895p.J()) {
                C4895p.S(1490333396, i11, -1, "com.ingka.ikea.itemavailability.impl.ui.SkapaThemedLearnAboutDeliveryScreen (LearnAboutDeliveryDialogFragment.kt:49)");
            }
            e.e(false, c.e(1713603898, true, new a(aVar), k10, 54), k10, 48, 1);
            if (C4895p.J()) {
                C4895p.R();
            }
        } else {
            k10.L();
        }
        Y0 n10 = k10.n();
        if (n10 != null) {
            n10.a(new a(aVar, i10));
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N c(C17631a aVar, int i10, C4889m mVar, int i11) {
        b(aVar, mVar, M0.a(i10 | 1));
        return C16807N.f139792a;
    }
}

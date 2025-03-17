package com.ingka.ikea.instore.wayfinding.impl.ui;

import Gu.i;
import TC.e;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import c1.c;
import kotlin.Metadata;
import nI.C17631a;
import nI.p;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0015¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/ingka/ikea/instore/wayfinding/impl/ui/WayfindingFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseComposeFragment;", "<init>", "()V", "LXH/N;", "D0", "(LU0/m;I)V", "wayfinding-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WayfindingFragment extends a {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ WayfindingFragment f96370a;

        a(WayfindingFragment wayfindingFragment) {
            this.f96370a = wayfindingFragment;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(WayfindingFragment wayfindingFragment) {
            androidx.navigation.fragment.a.a(wayfindingFragment).i0();
            return C16807N.f139792a;
        }

        public final void b(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(779787654, i10, -1, "com.ingka.ikea.instore.wayfinding.impl.ui.WayfindingFragment.FragmentContent.<anonymous> (WayfindingFragment.kt:17)");
                }
                mVar.W(1731707401);
                boolean V10 = mVar.V(this.f96370a);
                WayfindingFragment wayfindingFragment = this.f96370a;
                Object D10 = mVar.D();
                if (V10 || D10 == C4889m.f14007a.a()) {
                    D10 = new b(wayfindingFragment);
                    mVar.u(D10);
                }
                mVar.P();
                i.f((C17631a) D10, mVar, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    /* access modifiers changed from: protected */
    public void D0(C4889m mVar, int i10) {
        mVar.W(-2083112160);
        if (C4895p.J()) {
            C4895p.S(-2083112160, i10, -1, "com.ingka.ikea.instore.wayfinding.impl.ui.WayfindingFragment.FragmentContent (WayfindingFragment.kt:15)");
        }
        e.e(false, c.e(779787654, true, new a(this), mVar, 54), mVar, 48, 1);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
    }
}

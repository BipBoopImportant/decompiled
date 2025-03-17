package com.ingka.ikea.app.productinformationpage.v3;

import U0.C4889m;
import U0.C4895p;
import U0.C4910x;
import U0.J0;
import XH.C16807N;
import ZC.C13892o;
import c1.c;
import ki.C10004y;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import nI.p;
import oi.b;
import x3.r;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0015¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u000e\u001a\u00020\u00078\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/ingka/ikea/app/productinformationpage/v3/PipFragmentV3;", "Lcom/ingka/ikea/core/android/fragments/BaseComposeFragment;", "<init>", "()V", "LXH/N;", "D0", "(LU0/m;I)V", "Lli/a;", "X", "Lli/a;", "G0", "()Lli/a;", "setNavigationContract", "(Lli/a;)V", "navigationContract", "Lx3/r;", "Y", "Lx3/r;", "H0", "()Lx3/r;", "setSimpleCache", "(Lx3/r;)V", "simpleCache", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PipFragmentV3 extends a {

    /* renamed from: X  reason: collision with root package name */
    public li.a f72295X;

    /* renamed from: Y  reason: collision with root package name */
    public r f72296Y;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ PipFragmentV3 f72297a;

        a(PipFragmentV3 pipFragmentV3) {
            this.f72297a = pipFragmentV3;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1202437994, i10, -1, "com.ingka.ikea.app.productinformationpage.v3.PipFragmentV3.FragmentContent.<anonymous> (PipFragmentV3.kt:31)");
                }
                C10004y.c(this.f72297a.G0(), (b) null, mVar, 0, 2);
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

    /* access modifiers changed from: protected */
    public void D0(C4889m mVar, int i10) {
        mVar.W(-1611486166);
        if (C4895p.J()) {
            C4895p.S(-1611486166, i10, -1, "com.ingka.ikea.app.productinformationpage.v3.PipFragmentV3.FragmentContent (PipFragmentV3.kt:29)");
        }
        C4910x.a(C13892o.H().d(H0()), c.e(1202437994, true, new a(this), mVar, 54), mVar, J0.f13770i | 48);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
    }

    public final li.a G0() {
        li.a aVar = this.f72295X;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("navigationContract");
        return null;
    }

    public final r H0() {
        r rVar = this.f72296Y;
        if (rVar != null) {
            return rVar;
        }
        C17542s.z("simpleCache");
        return null;
    }
}

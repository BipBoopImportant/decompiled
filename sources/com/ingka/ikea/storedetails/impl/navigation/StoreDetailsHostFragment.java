package com.ingka.ikea.storedetails.impl.navigation;

import U0.C4889m;
import U0.C4895p;
import ZB.C13876d;
import ZB.C13877e;
import ZB.n;
import android.os.Bundle;
import androidx.navigation.fragment.a;
import dH.C17158b;
import kotlin.Metadata;
import x4.C8935A;
import x4.C8951o;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0015¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\f\u001a\u00020\u00078\u0014XD¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u00078\u0014XD¢\u0006\f\n\u0004\b\r\u0010\t\u001a\u0004\b\u000e\u0010\u000bR\u001a\u0010\u0011\u001a\u00020\u00078\u0014XD¢\u0006\f\n\u0004\b\t\u0010\t\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/ingka/ikea/storedetails/impl/navigation/StoreDetailsHostFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseComposeFragment;", "<init>", "()V", "LXH/N;", "D0", "(LU0/m;I)V", "", "X", "Z", "v0", "()Z", "drawUnderStatusBar", "Y", "u0", "drawUnderNavigationBar", "t0", "drawUnderDisplayCutout", "storedetails-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class StoreDetailsHostFragment extends a {

    /* renamed from: X  reason: collision with root package name */
    private final boolean f120518X = true;

    /* renamed from: Y  reason: collision with root package name */
    private final boolean f120519Y;

    /* renamed from: Z  reason: collision with root package name */
    private final boolean f120520Z;

    /* access modifiers changed from: protected */
    public void D0(C4889m mVar, int i10) {
        mVar.W(-1137798739);
        if (C4895p.J()) {
            C4895p.S(-1137798739, i10, -1, "com.ingka.ikea.storedetails.impl.navigation.StoreDetailsHostFragment.FragmentContent (StoreDetailsHostFragment.kt:21)");
        }
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("storeId") : null;
        if (string != null) {
            C8951o a10 = a.a(this);
            mVar.W(-840987276);
            Object D10 = mVar.D();
            if (D10 == C4889m.f14007a.a()) {
                D10 = ((C13876d) C17158b.c(this, C13876d.class)).E1();
                mVar.u(D10);
            }
            mVar.P();
            n.c(string, a10, (C13877e) D10, (C8935A) null, mVar, 0, 8);
            if (C4895p.J()) {
                C4895p.R();
            }
            mVar.P();
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* access modifiers changed from: protected */
    public boolean t0() {
        return this.f120520Z;
    }

    /* access modifiers changed from: protected */
    public boolean u0() {
        return this.f120519Y;
    }

    /* access modifiers changed from: protected */
    public boolean v0() {
        return this.f120518X;
    }
}

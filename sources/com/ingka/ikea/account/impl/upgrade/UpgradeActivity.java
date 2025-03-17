package com.ingka.ikea.account.impl.upgrade;

import Ae.s;
import Sd.a;
import YH.g0;
import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.r;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import ow.b;
import x4.C8948l;
import x4.C8951o;
import x4.v;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0015¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000b\u0010\u0004R\"\u0010\u0013\u001a\u00020\f8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010#\u001a\u00020\u001c8\u0000@\u0000X.¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R(\u0010,\u001a\b\u0012\u0004\u0012\u00020%0$8V@\u0016X\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8VX\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00102\u001a\u00020-8VX\u0004¢\u0006\u0006\u001a\u0004\b1\u0010/¨\u00063"}, d2 = {"Lcom/ingka/ikea/account/impl/upgrade/UpgradeActivity;", "Lcom/ingka/ikea/core/android/activities/NavigationHostActivity;", "LSd/a;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "LXH/N;", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "o0", "", "R", "Z", "U0", "()Z", "c", "(Z)V", "isInteractionBlocked", "LAe/s;", "S", "LAe/s;", "S0", "()LAe/s;", "setScreenAnalyticsTracker", "(LAe/s;)V", "screenAnalyticsTracker", "Lcom/ingka/ikea/account/impl/upgrade/k;", "T", "Lcom/ingka/ikea/account/impl/upgrade/k;", "T0", "()Lcom/ingka/ikea/account/impl/upgrade/k;", "setUpgradeDestinationBuilder$account_implementation_release", "(Lcom/ingka/ikea/account/impl/upgrade/k;)V", "upgradeDestinationBuilder", "", "Low/b;", "U", "Ljava/util/Set;", "D0", "()Ljava/util/Set;", "setDestinationBuilders", "(Ljava/util/Set;)V", "destinationBuilders", "", "K0", "()Ljava/lang/String;", "startRoute", "I0", "path", "account-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UpgradeActivity extends Hilt_UpgradeActivity implements a {

    /* renamed from: R  reason: collision with root package name */
    private boolean f69847R;

    /* renamed from: S  reason: collision with root package name */
    public s f69848S;

    /* renamed from: T  reason: collision with root package name */
    public C9609k f69849T;

    /* renamed from: U  reason: collision with root package name */
    private Set<? extends b> f69850U = g0.d();

    /* access modifiers changed from: private */
    public static final void V0(UpgradeActivity upgradeActivity, C8951o oVar, v vVar, Bundle bundle) {
        r lifecycle;
        C17542s.j(oVar, "navController");
        C17542s.j(vVar, "destination");
        C8948l H10 = oVar.H();
        if (H10 != null && (lifecycle = H10.getLifecycle()) != null) {
            upgradeActivity.S0().a(vVar, upgradeActivity, lifecycle, Xo.b.a(bundle));
        }
    }

    public Set<b> D0() {
        return g0.c(T0());
    }

    public String I0() {
        return "profile/account/upgradeForm";
    }

    public String K0() {
        return "profile/account/upgradeForm";
    }

    public final s S0() {
        s sVar = this.f69848S;
        if (sVar != null) {
            return sVar;
        }
        C17542s.z("screenAnalyticsTracker");
        return null;
    }

    public final C9609k T0() {
        C9609k kVar = this.f69849T;
        if (kVar != null) {
            return kVar;
        }
        C17542s.z("upgradeDestinationBuilder");
        return null;
    }

    public boolean U0() {
        return this.f69847R;
    }

    public void c(boolean z10) {
        this.f69847R = z10;
    }

    public void o0() {
        finish();
    }

    public void onBackPressed() {
        if (!U0() && !F0().k0()) {
            super.onBackPressed();
        }
    }

    /* access modifiers changed from: protected */
    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        F0().r(new C9606h(this));
    }
}

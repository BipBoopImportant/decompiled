package com.ingka.ikea.app.splash.onboarding.steps.notifications;

import Cw.C12727a;
import Mk.a;
import Nk.j;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import am.d;
import android.os.Bundle;
import androidx.core.app.s;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import nI.C17631a;
import uI.C18059h;
import x4.C8951o;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0005H\u0015¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u00078\u0014XD¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\tR\u001a\u0010\u0016\u001a\u00020\u00078\u0014XD¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\tR\u001a\u0010\u0018\u001a\u00020\u00078\u0014XD¢\u0006\f\n\u0004\b\u0011\u0010\u0011\u001a\u0004\b\u0017\u0010\tR\u001a\u0010\u001e\u001a\u00020\u00198\u0016XD¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00106\u001a\u00020/8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105¨\u00067"}, d2 = {"Lcom/ingka/ikea/app/splash/onboarding/steps/notifications/OnboardingEnablePushFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseComposeFragment;", "", "<init>", "()V", "LXH/N;", "K0", "", "H0", "()Z", "Landroid/os/Bundle;", "savedInstanceState", "E0", "(Landroid/os/Bundle;)V", "D0", "(LU0/m;I)V", "X", "Z", "v0", "drawUnderStatusBar", "Y", "u0", "drawUnderNavigationBar", "t0", "drawUnderDisplayCutout", "", "y0", "Ljava/lang/String;", "I0", "()Ljava/lang/String;", "destId", "Lam/d;", "z0", "Lam/d;", "getDeviceIntentProvider", "()Lam/d;", "setDeviceIntentProvider", "(Lam/d;)V", "deviceIntentProvider", "LCw/a;", "A0", "LCw/a;", "getOnboardingNavigation", "()LCw/a;", "setOnboardingNavigation", "(LCw/a;)V", "onboardingNavigation", "LMk/a;", "B0", "LMk/a;", "J0", "()LMk/a;", "setOnboardingEnablePushAnalytics", "(LMk/a;)V", "onboardingEnablePushAnalytics", "splash_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OnboardingEnablePushFragment extends a {

    /* renamed from: A0  reason: collision with root package name */
    public C12727a f92495A0;

    /* renamed from: B0  reason: collision with root package name */
    public Mk.a f92496B0;

    /* renamed from: X  reason: collision with root package name */
    private final boolean f92497X;

    /* renamed from: Y  reason: collision with root package name */
    private final boolean f92498Y;

    /* renamed from: Z  reason: collision with root package name */
    private final boolean f92499Z;

    /* renamed from: y0  reason: collision with root package name */
    private final String f92500y0 = "onboarding/enablePush";

    /* renamed from: z0  reason: collision with root package name */
    public d f92501z0;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a extends C17540p implements C17631a<C16807N> {
        a(Object obj) {
            super(0, obj, OnboardingEnablePushFragment.class, "onContinue", "onContinue()V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            t();
            return C16807N.f139792a;
        }

        public final void t() {
            ((OnboardingEnablePushFragment) this.receiver).K0();
        }
    }

    private final boolean H0() {
        return s.g(requireContext()).a();
    }

    /* access modifiers changed from: private */
    public final void K0() {
        J0().a(H0() ? a.C1671a.AUTHORIZED : a.C1671a.DENIED);
        rw.d.a(this, C12727a.C2595a.b.f108465a, "NotificationsResult");
        C8951o.o0(androidx.navigation.fragment.a.a(this), I0(), true, false, 4, (Object) null);
    }

    /* access modifiers changed from: protected */
    public void D0(C4889m mVar, int i10) {
        mVar.W(-1251809810);
        if (C4895p.J()) {
            C4895p.S(-1251809810, i10, -1, "com.ingka.ikea.app.splash.onboarding.steps.notifications.OnboardingEnablePushFragment.FragmentContent (OnboardingEnablePushFragment.kt:47)");
        }
        mVar.W(1657547618);
        boolean F10 = mVar.F(this);
        Object D10 = mVar.D();
        if (F10 || D10 == C4889m.f14007a.a()) {
            D10 = new a(this);
            mVar.u(D10);
        }
        mVar.P();
        j.f((C17631a) ((C18059h) D10), mVar, 0);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
    }

    /* access modifiers changed from: protected */
    public void E0(Bundle bundle) {
        rw.d.a(this, C12727a.C2595a.C2596a.f108464a, "NotificationsResult");
    }

    public String I0() {
        return this.f92500y0;
    }

    public final Mk.a J0() {
        Mk.a aVar = this.f92496B0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("onboardingEnablePushAnalytics");
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean t0() {
        return this.f92499Z;
    }

    /* access modifiers changed from: protected */
    public boolean u0() {
        return this.f92498Y;
    }

    /* access modifiers changed from: protected */
    public boolean v0() {
        return this.f92497X;
    }
}

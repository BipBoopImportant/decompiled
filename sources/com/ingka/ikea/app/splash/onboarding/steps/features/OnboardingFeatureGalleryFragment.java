package com.ingka.ikea.app.splash.onboarding.steps.features;

import Cw.C12727a;
import Gk.j;
import U0.A1;
import U0.C4889m;
import U0.C4895p;
import U0.C4910x;
import U0.J0;
import U0.L;
import U0.M;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import ZC.C13892o;
import aA.C13909a;
import android.os.Bundle;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.C5191t;
import androidx.fragment.app.W;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import androidx.lifecycle.r;
import com.ingka.ikea.app.splash.onboarding.steps.features.b;
import dI.C17168i;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.P;
import l3.a;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import uI.C18059h;
import x3.r;
import x4.C8951o;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\u0004J\u0019\u0010\u000b\u001a\u00020\u00052\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0005H\u0015¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0016\u001a\u00020\u000f8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00106\u001a\u00020/8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001a\u0010<\u001a\u0002078\u0016XD¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;R\u001a\u0010A\u001a\u00020=8\u0014XD¢\u0006\f\n\u0004\b>\u0010 \u001a\u0004\b?\u0010@R\u001a\u0010D\u001a\u00020=8\u0014XD¢\u0006\f\n\u0004\bB\u0010 \u001a\u0004\bC\u0010@R\u001a\u0010F\u001a\u00020=8\u0014XD¢\u0006\f\n\u0004\b\r\u0010 \u001a\u0004\bE\u0010@R\u001b\u0010K\u001a\u00020G8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010H\u001a\u0004\bI\u0010J¨\u0006M²\u0006\f\u0010L\u001a\u00020=8\nX\u0002"}, d2 = {"Lcom/ingka/ikea/app/splash/onboarding/steps/features/OnboardingFeatureGalleryFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseComposeFragment;", "", "<init>", "()V", "LXH/N;", "T0", "U0", "S0", "Landroid/os/Bundle;", "savedInstanceState", "E0", "(Landroid/os/Bundle;)V", "D0", "(LU0/m;I)V", "LaA/a;", "X", "LaA/a;", "P0", "()LaA/a;", "setSessionManager", "(LaA/a;)V", "sessionManager", "LRd/a;", "Y", "LRd/a;", "M0", "()LRd/a;", "setAccountNavigation", "(LRd/a;)V", "accountNavigation", "LCw/a;", "Z", "LCw/a;", "getOnboardingNavigation", "()LCw/a;", "setOnboardingNavigation", "(LCw/a;)V", "onboardingNavigation", "LFk/a;", "y0", "LFk/a;", "O0", "()LFk/a;", "setOnboardingFeaturesAnalytics", "(LFk/a;)V", "onboardingFeaturesAnalytics", "Lx3/r;", "z0", "Lx3/r;", "Q0", "()Lx3/r;", "setSimpleCache", "(Lx3/r;)V", "simpleCache", "", "A0", "Ljava/lang/String;", "N0", "()Ljava/lang/String;", "destId", "", "B0", "v0", "()Z", "drawUnderStatusBar", "C0", "u0", "drawUnderNavigationBar", "t0", "drawUnderDisplayCutout", "Lcom/ingka/ikea/app/splash/onboarding/steps/features/b;", "LXH/o;", "R0", "()Lcom/ingka/ikea/app/splash/onboarding/steps/features/b;", "viewModel", "isLoggedIn", "splash_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OnboardingFeatureGalleryFragment extends a {

    /* renamed from: A0  reason: collision with root package name */
    private final String f92442A0 = "onboarding/features";

    /* renamed from: B0  reason: collision with root package name */
    private final boolean f92443B0;

    /* renamed from: C0  reason: collision with root package name */
    private final boolean f92444C0;

    /* renamed from: D0  reason: collision with root package name */
    private final boolean f92445D0;

    /* renamed from: E0  reason: collision with root package name */
    private final C16824o f92446E0;

    /* renamed from: X  reason: collision with root package name */
    public C13909a f92447X;

    /* renamed from: Y  reason: collision with root package name */
    public Rd.a f92448Y;

    /* renamed from: Z  reason: collision with root package name */
    public C12727a f92449Z;

    /* renamed from: y0  reason: collision with root package name */
    public Fk.a f92450y0;

    /* renamed from: z0  reason: collision with root package name */
    public r f92451z0;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ OnboardingFeatureGalleryFragment f92452a;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.ingka.ikea.app.splash.onboarding.steps.features.OnboardingFeatureGalleryFragment$a$a  reason: collision with other inner class name */
        /* synthetic */ class C2052a extends C17540p implements C17631a<C16807N> {
            C2052a(Object obj) {
                super(0, obj, OnboardingFeatureGalleryFragment.class, "onLoginClick", "onLoginClick()V", 0);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                t();
                return C16807N.f139792a;
            }

            public final void t() {
                ((OnboardingFeatureGalleryFragment) this.receiver).T0();
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* synthetic */ class b extends C17540p implements C17631a<C16807N> {
            b(Object obj) {
                super(0, obj, OnboardingFeatureGalleryFragment.class, "onMaybeLater", "onMaybeLater()V", 0);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                t();
                return C16807N.f139792a;
            }

            public final void t() {
                ((OnboardingFeatureGalleryFragment) this.receiver).U0();
            }
        }

        a(OnboardingFeatureGalleryFragment onboardingFeatureGalleryFragment) {
            this.f92452a = onboardingFeatureGalleryFragment;
        }

        public final void a(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(1419157385, i10, -1, "com.ingka.ikea.app.splash.onboarding.steps.features.OnboardingFeatureGalleryFragment.FragmentContent.<anonymous> (OnboardingFeatureGalleryFragment.kt:77)");
                }
                b J02 = this.f92452a.R0();
                OnboardingFeatureGalleryFragment onboardingFeatureGalleryFragment = this.f92452a;
                mVar.W(1972522963);
                boolean F10 = mVar.F(onboardingFeatureGalleryFragment);
                Object D10 = mVar.D();
                if (F10 || D10 == C4889m.f14007a.a()) {
                    D10 = new C2052a(onboardingFeatureGalleryFragment);
                    mVar.u(D10);
                }
                mVar.P();
                C17631a aVar = (C17631a) ((C18059h) D10);
                OnboardingFeatureGalleryFragment onboardingFeatureGalleryFragment2 = this.f92452a;
                mVar.W(1972524691);
                boolean F11 = mVar.F(onboardingFeatureGalleryFragment2);
                Object D11 = mVar.D();
                if (F11 || D11 == C4889m.f14007a.a()) {
                    D11 = new b(onboardingFeatureGalleryFragment2);
                    mVar.u(D11);
                }
                mVar.P();
                j.m(J02, aVar, (C17631a) ((C18059h) D11), mVar, 0);
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

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/ingka/ikea/app/splash/onboarding/steps/features/OnboardingFeatureGalleryFragment$b", "LU0/L;", "LXH/N;", "b", "()V", "runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements L {
        public void b() {
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f92453c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C5187o oVar) {
            super(0);
            this.f92453c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f92453c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f92454c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C17631a aVar) {
            super(0);
            this.f92454c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f92454c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f92455c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C16824o oVar) {
            super(0);
            this.f92455c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f92455c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f92456c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f92457d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C17631a aVar, C16824o oVar) {
            super(0);
            this.f92456c = aVar;
            this.f92457d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f92456c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f92457d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f92458c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f92459d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f92458c = oVar;
            this.f92459d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f92459d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f92458c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public OnboardingFeatureGalleryFragment() {
        C16824o a10 = C16825p.a(s.NONE, new d(new c(this)));
        this.f92446E0 = W.b(this, P.b(b.class), new e(a10), new f((C17631a) null, a10), new g(this, a10));
    }

    private static final boolean H0(A1<Boolean> a12) {
        return a12.getValue().booleanValue();
    }

    /* access modifiers changed from: private */
    public static final L I0(OnboardingFeatureGalleryFragment onboardingFeatureGalleryFragment, A1 a12, M m10) {
        C17542s.j(m10, "$this$DisposableEffect");
        if (H0(a12)) {
            onboardingFeatureGalleryFragment.S0();
        }
        return new b();
    }

    /* access modifiers changed from: private */
    public final b R0() {
        return (b) this.f92446E0.getValue();
    }

    private final void S0() {
        rw.d.a(this, C12727a.C2595a.b.f108465a, "FeaturesResult");
        C8951o.o0(androidx.navigation.fragment.a.a(this), N0(), true, false, 4, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void T0() {
        b.C2055b value = R0().getState().getValue();
        if (C17542s.e(value.f(), b.a.c.f92469a)) {
            O0().a(value.c(), value.d() + 1);
        }
        Rd.a M02 = M0();
        C5191t requireActivity = requireActivity();
        C17542s.i(requireActivity, "requireActivity(...)");
        M02.d(requireActivity);
    }

    /* access modifiers changed from: private */
    public final void U0() {
        b.C2055b value = R0().getState().getValue();
        if (C17542s.e(value.f(), b.a.c.f92469a)) {
            O0().b(value.c(), value.d() + 1);
        }
        S0();
    }

    /* access modifiers changed from: protected */
    public void D0(C4889m mVar, int i10) {
        mVar.W(105474761);
        if (C4895p.J()) {
            C4895p.S(105474761, i10, -1, "com.ingka.ikea.app.splash.onboarding.steps.features.OnboardingFeatureGalleryFragment.FragmentContent (OnboardingFeatureGalleryFragment.kt:65)");
        }
        A1<Boolean> b10 = j3.a.b(P0().n(), Boolean.valueOf(P0().isLoggedIn()), (C5221y) null, (r.b) null, (C17168i) null, mVar, 0, 14);
        Boolean valueOf = Boolean.valueOf(H0(b10));
        mVar.W(1122480244);
        boolean V10 = mVar.V(b10) | mVar.F(this);
        Object D10 = mVar.D();
        if (V10 || D10 == C4889m.f14007a.a()) {
            D10 = new Ek.a(this, b10);
            mVar.u(D10);
        }
        mVar.P();
        U0.P.c(valueOf, (C17642l) D10, mVar, 0);
        C4910x.a(C13892o.H().d(Q0()), c1.c.e(1419157385, true, new a(this), mVar, 54), mVar, J0.f13770i | 48);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
    }

    /* access modifiers changed from: protected */
    public void E0(Bundle bundle) {
        rw.d.a(this, C12727a.C2595a.C2596a.f108464a, "FeaturesResult");
    }

    public final Rd.a M0() {
        Rd.a aVar = this.f92448Y;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("accountNavigation");
        return null;
    }

    public String N0() {
        return this.f92442A0;
    }

    public final Fk.a O0() {
        Fk.a aVar = this.f92450y0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("onboardingFeaturesAnalytics");
        return null;
    }

    public final C13909a P0() {
        C13909a aVar = this.f92447X;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("sessionManager");
        return null;
    }

    public final x3.r Q0() {
        x3.r rVar = this.f92451z0;
        if (rVar != null) {
            return rVar;
        }
        C17542s.z("simpleCache");
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean t0() {
        return this.f92445D0;
    }

    /* access modifiers changed from: protected */
    public boolean u0() {
        return this.f92444C0;
    }

    /* access modifiers changed from: protected */
    public boolean v0() {
        return this.f92443B0;
    }
}

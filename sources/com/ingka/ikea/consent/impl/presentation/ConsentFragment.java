package com.ingka.ikea.consent.impl.presentation;

import Ar.j;
import Cw.C12727a;
import So.u;
import To.a;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import android.os.Bundle;
import android.view.View;
import androidx.activity.v;
import androidx.activity.y;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.W;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.P;
import l3.a;
import nI.C17631a;
import nI.C17642l;
import uI.C18059h;
import x4.C8951o;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u0019\u0010\r\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0015¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0016\u001a\u00020\u00058\u0016XD¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\"\u0010\u001e\u001a\u00020\u00178\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020\u001f8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\"\u0010.\u001a\u00020'8\u0000@\u0000X.¢\u0006\u0012\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\"\u00106\u001a\u00020/8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b0\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u001b\u0010<\u001a\u0002078BX\u0002¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;¨\u0006="}, d2 = {"Lcom/ingka/ikea/consent/impl/presentation/ConsentFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseComposeFragment;", "", "<init>", "()V", "", "url", "LXH/N;", "Q0", "(Ljava/lang/String;)V", "P0", "Landroid/os/Bundle;", "savedInstanceState", "E0", "(Landroid/os/Bundle;)V", "onCreate", "D0", "(LU0/m;I)V", "X", "Ljava/lang/String;", "L0", "()Ljava/lang/String;", "destId", "LEo/a;", "Y", "LEo/a;", "K0", "()LEo/a;", "setChromeTabApi", "(LEo/a;)V", "chromeTabApi", "Lam/b;", "Z", "Lam/b;", "J0", "()Lam/b;", "setAppService", "(Lam/b;)V", "appService", "LAr/j;", "y0", "LAr/j;", "M0", "()LAr/j;", "setFeedback$consent_implementation_release", "(LAr/j;)V", "feedback", "LCw/a;", "z0", "LCw/a;", "getOnboardingNavigation", "()LCw/a;", "setOnboardingNavigation", "(LCw/a;)V", "onboardingNavigation", "LRo/d;", "A0", "LXH/o;", "N0", "()LRo/d;", "viewModel", "consent-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ConsentFragment extends a {

    /* renamed from: A0  reason: collision with root package name */
    private final C16824o f94800A0;

    /* renamed from: X  reason: collision with root package name */
    private final String f94801X = "onboarding/consent";

    /* renamed from: Y  reason: collision with root package name */
    public Eo.a f94802Y;

    /* renamed from: Z  reason: collision with root package name */
    public am.b f94803Z;

    /* renamed from: y0  reason: collision with root package name */
    public j f94804y0;

    /* renamed from: z0  reason: collision with root package name */
    public C12727a f94805z0;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a extends C17540p implements C17642l<String, C16807N> {
        a(Object obj) {
            super(1, obj, ConsentFragment.class, "openPolicyUrl", "openPolicyUrl(Ljava/lang/String;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            t((String) obj);
            return C16807N.f139792a;
        }

        public final void t(String str) {
            ((ConsentFragment) this.receiver).Q0(str);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class b extends C17540p implements C17631a<C16807N> {
        b(Object obj) {
            super(0, obj, ConsentFragment.class, "onSubmit", "onSubmit()V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            t();
            return C16807N.f139792a;
        }

        public final void t() {
            ((ConsentFragment) this.receiver).P0();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f94806c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C5187o oVar) {
            super(0);
            this.f94806c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f94806c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f94807c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C17631a aVar) {
            super(0);
            this.f94807c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f94807c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f94808c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C16824o oVar) {
            super(0);
            this.f94808c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f94808c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f94809c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f94810d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C17631a aVar, C16824o oVar) {
            super(0);
            this.f94809c = aVar;
            this.f94810d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f94809c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f94810d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f94811c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f94812d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f94811c = oVar;
            this.f94812d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f94812d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f94811c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public ConsentFragment() {
        C16824o a10 = C16825p.a(s.NONE, new d(new c(this)));
        this.f94800A0 = W.b(this, P.b(Ro.d.class), new e(a10), new f((C17631a) null, a10), new g(this, a10));
    }

    private final Ro.d N0() {
        return (Ro.d) this.f94800A0.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N O0(ConsentFragment consentFragment, v vVar) {
        C17542s.j(vVar, "$this$addCallback");
        j.a.r(consentFragment.M0(), consentFragment.getView(), Oo.b.f84801u3, 0, 0, (View) null, (C17631a) null, 60, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final void P0() {
        J0().b();
        rw.d.a(this, a.C1832a.b.f87744a, "ConsentKey");
        C8951o.o0(androidx.navigation.fragment.a.a(this), L0(), true, false, 4, (Object) null);
    }

    /* access modifiers changed from: private */
    public final void Q0(String str) {
        if (str != null) {
            K0().a(requireContext(), str);
        }
    }

    /* access modifiers changed from: protected */
    public void D0(C4889m mVar, int i10) {
        mVar.W(2010823616);
        if (C4895p.J()) {
            C4895p.S(2010823616, i10, -1, "com.ingka.ikea.consent.impl.presentation.ConsentFragment.FragmentContent (ConsentFragment.kt:63)");
        }
        Ro.d N02 = N0();
        mVar.W(1213785421);
        boolean F10 = mVar.F(this);
        Object D10 = mVar.D();
        if (F10 || D10 == C4889m.f14007a.a()) {
            D10 = new a(this);
            mVar.u(D10);
        }
        mVar.P();
        C17642l lVar = (C17642l) ((C18059h) D10);
        mVar.W(1213786920);
        boolean F11 = mVar.F(this);
        Object D11 = mVar.D();
        if (F11 || D11 == C4889m.f14007a.a()) {
            D11 = new b(this);
            mVar.u(D11);
        }
        mVar.P();
        u.r(N02, lVar, (C17631a) ((C18059h) D11), mVar, 0);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
    }

    /* access modifiers changed from: protected */
    public void E0(Bundle bundle) {
        rw.d.a(this, a.C1832a.C1833a.f87743a, "ConsentKey");
    }

    public final am.b J0() {
        am.b bVar = this.f94803Z;
        if (bVar != null) {
            return bVar;
        }
        C17542s.z("appService");
        return null;
    }

    public final Eo.a K0() {
        Eo.a aVar = this.f94802Y;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("chromeTabApi");
        return null;
    }

    public String L0() {
        return this.f94801X;
    }

    public final j M0() {
        j jVar = this.f94804y0;
        if (jVar != null) {
            return jVar;
        }
        C17542s.z("feedback");
        return null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        y.b(requireActivity().getOnBackPressedDispatcher(), this, false, new Ro.a(this), 2, (Object) null);
    }
}

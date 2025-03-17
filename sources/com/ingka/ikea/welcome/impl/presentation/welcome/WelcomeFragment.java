package com.ingka.ikea.welcome.impl.presentation.welcome;

import RD.C13520c;
import U0.C4889m;
import U0.C4895p;
import U0.L;
import U0.M;
import VD.C13757a;
import WD.C13795l;
import XD.C13803a;
import XD.C13804b;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.C5191t;
import androidx.fragment.app.W;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import jC.C14615b;
import jC.i;
import jC.k;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.P;
import l3.a;
import lC.l;
import nI.C17631a;
import nI.C17642l;
import uI.C18059h;
import x4.C8951o;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0019\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0005H\u0015¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u00128\u0016XD¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\"\u001a\u00020\u001e8\u0014XD¢\u0006\f\n\u0004\b\u001f\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010%\u001a\u00020\u001e8\u0014XD¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010!R\u001a\u0010(\u001a\u00020\u001e8\u0014XD¢\u0006\f\n\u0004\b&\u0010\u001f\u001a\u0004\b'\u0010!R\"\u00100\u001a\u00020)8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u0018\u00104\u001a\u0004\u0018\u0001018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b2\u00103¨\u00065"}, d2 = {"Lcom/ingka/ikea/welcome/impl/presentation/welcome/WelcomeFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseComposeFragment;", "", "<init>", "()V", "LXH/N;", "M0", "Landroid/os/Bundle;", "savedInstanceState", "E0", "(Landroid/os/Bundle;)V", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "D0", "(LU0/m;I)V", "onResume", "", "X", "Ljava/lang/String;", "J0", "()Ljava/lang/String;", "destId", "LVD/d;", "Y", "LXH/o;", "K0", "()LVD/d;", "viewModel", "", "Z", "v0", "()Z", "drawUnderStatusBar", "y0", "u0", "drawUnderNavigationBar", "z0", "t0", "drawUnderDisplayCutout", "LRD/c;", "A0", "LRD/c;", "L0", "()LRD/c;", "setWelcomeAnalytics", "(LRD/c;)V", "welcomeAnalytics", "LXD/a;", "B0", "LXD/a;", "callback", "welcome-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WelcomeFragment extends a {

    /* renamed from: A0  reason: collision with root package name */
    public C13520c f120705A0;

    /* renamed from: B0  reason: collision with root package name */
    private C13803a f120706B0;

    /* renamed from: X  reason: collision with root package name */
    private final String f120707X = "onboarding/welcome";

    /* renamed from: Y  reason: collision with root package name */
    private final C16824o f120708Y;

    /* renamed from: Z  reason: collision with root package name */
    private final boolean f120709Z;

    /* renamed from: y0  reason: collision with root package name */
    private final boolean f120710y0;

    /* renamed from: z0  reason: collision with root package name */
    private final boolean f120711z0;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a extends C17540p implements C17631a<C16807N> {
        a(Object obj) {
            super(0, obj, WelcomeFragment.class, "onDismiss", "onDismiss()V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            t();
            return C16807N.f139792a;
        }

        public final void t() {
            ((WelcomeFragment) this.receiver).M0();
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/ingka/ikea/welcome/impl/presentation/welcome/WelcomeFragment$b", "LU0/L;", "LXH/N;", "b", "()V", "runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements L {
        public void b() {
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f120712c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C5187o oVar) {
            super(0);
            this.f120712c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f120712c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f120713c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C17631a aVar) {
            super(0);
            this.f120713c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f120713c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f120714c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C16824o oVar) {
            super(0);
            this.f120714c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f120714c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f120715c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f120716d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C17631a aVar, C16824o oVar) {
            super(0);
            this.f120715c = aVar;
            this.f120716d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f120715c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f120716d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f120717c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f120718d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f120717c = oVar;
            this.f120718d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f120718d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f120717c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public WelcomeFragment() {
        C16824o a10 = C16825p.a(s.NONE, new d(new c(this)));
        this.f120708Y = W.b(this, P.b(VD.d.class), new e(a10), new f((C17631a) null, a10), new g(this, a10));
        this.f120709Z = true;
        this.f120710y0 = true;
        this.f120711z0 = true;
    }

    /* access modifiers changed from: private */
    public static final L H0(i iVar, M m10) {
        C17542s.j(m10, "$this$DisposableEffect");
        l a10 = iVar.a();
        C14615b.c cVar = C14615b.c.f127858b;
        a10.a(cVar);
        iVar.b().a(cVar);
        return new b();
    }

    private final VD.d K0() {
        return (VD.d) this.f120708Y.getValue();
    }

    /* access modifiers changed from: private */
    public final void M0() {
        C13803a aVar = this.f120706B0;
        if (aVar != null) {
            aVar.b0();
            return;
        }
        rw.d.a(this, C13804b.a.C2916b.f117804a, "Welcome");
        C8951o.o0(androidx.navigation.fragment.a.a(this), J0(), true, false, 4, (Object) null);
    }

    /* access modifiers changed from: protected */
    public void D0(C4889m mVar, int i10) {
        mVar.W(-107983636);
        if (C4895p.J()) {
            C4895p.S(-107983636, i10, -1, "com.ingka.ikea.welcome.impl.presentation.welcome.WelcomeFragment.FragmentContent (WelcomeFragment.kt:52)");
        }
        i c10 = k.c((Window) null, mVar, 0, 1);
        C16807N n10 = C16807N.f139792a;
        mVar.W(1336401313);
        boolean F10 = mVar.F(c10);
        Object D10 = mVar.D();
        if (F10 || D10 == C4889m.f14007a.a()) {
            D10 = new C13757a(c10);
            mVar.u(D10);
        }
        mVar.P();
        U0.P.c(n10, (C17642l) D10, mVar, 6);
        VD.d K02 = K0();
        mVar.W(1336409261);
        boolean F11 = mVar.F(this);
        Object D11 = mVar.D();
        if (F11 || D11 == C4889m.f14007a.a()) {
            D11 = new a(this);
            mVar.u(D11);
        }
        mVar.P();
        C13795l.p(K02, (C17631a) ((C18059h) D11), mVar, 0);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
    }

    /* access modifiers changed from: protected */
    public void E0(Bundle bundle) {
        rw.d.a(this, C13804b.a.C2914a.f117803a, "Welcome");
    }

    public String J0() {
        return this.f120707X;
    }

    public final C13520c L0() {
        C13520c cVar = this.f120705A0;
        if (cVar != null) {
            return cVar;
        }
        C17542s.z("welcomeAnalytics");
        return null;
    }

    public void onAttach(Context context) {
        C17542s.j(context, "context");
        super.onAttach(context);
        C5191t activity = getActivity();
        this.f120706B0 = activity instanceof C13803a ? (C13803a) activity : null;
    }

    public void onResume() {
        super.onResume();
        L0().a();
    }

    /* access modifiers changed from: protected */
    public boolean t0() {
        return this.f120711z0;
    }

    /* access modifiers changed from: protected */
    public boolean u0() {
        return this.f120710y0;
    }

    /* access modifiers changed from: protected */
    public boolean v0() {
        return this.f120709Z;
    }
}

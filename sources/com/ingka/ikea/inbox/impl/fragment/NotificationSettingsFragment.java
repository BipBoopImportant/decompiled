package com.ingka.ikea.inbox.impl.fragment;

import Ds.D;
import Ds.z;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
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
import ss.C11885A;
import uI.C18059h;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u000f\u0010\b\u001a\u00020\u0005H\u0015¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u000b8\u0016XD¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001d\u001a\u00020\u00198\u0014XD¢\u0006\f\n\u0004\b\u001a\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010 \u001a\u00020\u00198\u0014XD¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u001a\u0010#\u001a\u00020\u00198\u0014XD¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\u001cR\u001b\u0010)\u001a\u00020$8BX\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lcom/ingka/ikea/inbox/impl/fragment/NotificationSettingsFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseComposeFragment;", "", "<init>", "()V", "LXH/N;", "L0", "K0", "D0", "(LU0/m;I)V", "onResume", "", "X", "Ljava/lang/String;", "getDestId", "()Ljava/lang/String;", "destId", "Lam/d;", "Y", "Lam/d;", "I0", "()Lam/d;", "setDeviceIntentProvider", "(Lam/d;)V", "deviceIntentProvider", "", "Z", "v0", "()Z", "drawUnderStatusBar", "y0", "u0", "drawUnderNavigationBar", "z0", "t0", "drawUnderDisplayCutout", "LDs/D;", "A0", "LXH/o;", "J0", "()LDs/D;", "viewModel", "inbox-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NotificationSettingsFragment extends d {

    /* renamed from: A0  reason: collision with root package name */
    private final C16824o f96045A0;

    /* renamed from: X  reason: collision with root package name */
    private final String f96046X = "notification_settings";

    /* renamed from: Y  reason: collision with root package name */
    public am.d f96047Y;

    /* renamed from: Z  reason: collision with root package name */
    private final boolean f96048Z;

    /* renamed from: y0  reason: collision with root package name */
    private final boolean f96049y0;

    /* renamed from: z0  reason: collision with root package name */
    private final boolean f96050z0;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a extends C17540p implements C17631a<C16807N> {
        a(Object obj) {
            super(0, obj, NotificationSettingsFragment.class, "navigateBack", "navigateBack()V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            t();
            return C16807N.f139792a;
        }

        public final void t() {
            ((NotificationSettingsFragment) this.receiver).K0();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class b extends C17540p implements C17631a<C16807N> {
        b(Object obj) {
            super(0, obj, NotificationSettingsFragment.class, "openSystemSettings", "openSystemSettings()V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            t();
            return C16807N.f139792a;
        }

        public final void t() {
            ((NotificationSettingsFragment) this.receiver).L0();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f96051c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C5187o oVar) {
            super(0);
            this.f96051c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f96051c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f96052c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C17631a aVar) {
            super(0);
            this.f96052c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f96052c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f96053c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C16824o oVar) {
            super(0);
            this.f96053c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f96053c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f96054c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f96055d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C17631a aVar, C16824o oVar) {
            super(0);
            this.f96054c = aVar;
            this.f96055d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f96054c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f96055d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f96056c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f96057d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f96056c = oVar;
            this.f96057d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f96057d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f96056c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public NotificationSettingsFragment() {
        C16824o a10 = C16825p.a(s.NONE, new d(new c(this)));
        this.f96045A0 = W.b(this, P.b(D.class), new e(a10), new f((C17631a) null, a10), new g(this, a10));
    }

    private final D J0() {
        return (D) this.f96045A0.getValue();
    }

    /* access modifiers changed from: private */
    public final void K0() {
        androidx.navigation.fragment.a.a(this).k0();
    }

    /* access modifiers changed from: private */
    public final void L0() {
        startActivity(I0().b());
    }

    /* access modifiers changed from: protected */
    public void D0(C4889m mVar, int i10) {
        mVar.W(-266280416);
        if (C4895p.J()) {
            C4895p.S(-266280416, i10, -1, "com.ingka.ikea.inbox.impl.fragment.NotificationSettingsFragment.FragmentContent (NotificationSettingsFragment.kt:36)");
        }
        D J02 = J0();
        mVar.W(-311364372);
        boolean F10 = mVar.F(this);
        Object D10 = mVar.D();
        if (F10 || D10 == C4889m.f14007a.a()) {
            D10 = new a(this);
            mVar.u(D10);
        }
        mVar.P();
        C17631a aVar = (C17631a) ((C18059h) D10);
        mVar.W(-311362734);
        boolean F11 = mVar.F(this);
        Object D11 = mVar.D();
        if (F11 || D11 == C4889m.f14007a.a()) {
            D11 = new b(this);
            mVar.u(D11);
        }
        mVar.P();
        C11885A.g(J02, aVar, (C17631a) ((C18059h) D11), mVar, 0);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
    }

    public final am.d I0() {
        am.d dVar = this.f96047Y;
        if (dVar != null) {
            return dVar;
        }
        C17542s.z("deviceIntentProvider");
        return null;
    }

    public void onResume() {
        super.onResume();
        J0().i(z.b.f80314a);
    }

    /* access modifiers changed from: protected */
    public boolean t0() {
        return this.f96050z0;
    }

    /* access modifiers changed from: protected */
    public boolean u0() {
        return this.f96049y0;
    }

    /* access modifiers changed from: protected */
    public boolean v0() {
        return this.f96048Z;
    }
}

package com.ingka.ikea.inbox.impl.fragment;

import Ds.u;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import android.net.Uri;
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
import ss.v;
import uI.C18059h;
import x4.C8951o;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0007H\u0015¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0011\u001a\u00020\u00058\u0016XD¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0016X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001c\u001a\u00020\u00188\u0014XD¢\u0006\f\n\u0004\b\u0019\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\u00020\u00188\u0014XD¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR\u001a\u0010\"\u001a\u00020\u00188\u0014XD¢\u0006\f\n\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u001bR\u001b\u0010(\u001a\u00020#8BX\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lcom/ingka/ikea/inbox/impl/fragment/NotificationDetailsFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseComposeFragment;", "", "<init>", "()V", "", "uri", "LXH/N;", "N0", "(Ljava/lang/String;)V", "M0", "D0", "(LU0/m;I)V", "X", "Ljava/lang/String;", "K0", "()Ljava/lang/String;", "destId", "Lkotlin/Function0;", "Y", "LnI/a;", "getCallbackNavControllerSet", "()LnI/a;", "callbackNavControllerSet", "", "Z", "v0", "()Z", "drawUnderStatusBar", "y0", "u0", "drawUnderNavigationBar", "z0", "t0", "drawUnderDisplayCutout", "LDs/u;", "A0", "LXH/o;", "L0", "()LDs/u;", "viewModel", "inbox-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class NotificationDetailsFragment extends b {

    /* renamed from: A0  reason: collision with root package name */
    private final C16824o f96025A0;

    /* renamed from: X  reason: collision with root package name */
    private final String f96026X = "notification_details?id_key={id_key}&feature_key={feature_key}";

    /* renamed from: Y  reason: collision with root package name */
    private final C17631a<C16807N> f96027Y = new ws.e();

    /* renamed from: Z  reason: collision with root package name */
    private final boolean f96028Z;

    /* renamed from: y0  reason: collision with root package name */
    private final boolean f96029y0;

    /* renamed from: z0  reason: collision with root package name */
    private final boolean f96030z0;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a extends C17540p implements C17631a<C16807N> {
        a(Object obj) {
            super(0, obj, NotificationDetailsFragment.class, "navigateBack", "navigateBack()V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            t();
            return C16807N.f139792a;
        }

        public final void t() {
            ((NotificationDetailsFragment) this.receiver).M0();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class b extends C17540p implements C17642l<String, C16807N> {
        b(Object obj) {
            super(1, obj, NotificationDetailsFragment.class, "navigateTo", "navigateTo(Ljava/lang/String;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            t((String) obj);
            return C16807N.f139792a;
        }

        public final void t(String str) {
            C17542s.j(str, "p0");
            ((NotificationDetailsFragment) this.receiver).N0(str);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f96031c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C5187o oVar) {
            super(0);
            this.f96031c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f96031c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f96032c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C17631a aVar) {
            super(0);
            this.f96032c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f96032c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f96033c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C16824o oVar) {
            super(0);
            this.f96033c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f96033c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f96034c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f96035d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C17631a aVar, C16824o oVar) {
            super(0);
            this.f96034c = aVar;
            this.f96035d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f96034c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f96035d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f96036c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f96037d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f96036c = oVar;
            this.f96037d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f96037d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f96036c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public NotificationDetailsFragment() {
        C16824o a10 = C16825p.a(s.NONE, new d(new c(this)));
        this.f96025A0 = W.b(this, P.b(u.class), new e(a10), new f((C17631a) null, a10), new g(this, a10));
    }

    /* access modifiers changed from: private */
    public static final C16807N J0() {
        return C16807N.f139792a;
    }

    private final u L0() {
        return (u) this.f96025A0.getValue();
    }

    /* access modifiers changed from: private */
    public final void M0() {
        androidx.navigation.fragment.a.a(this).k0();
    }

    /* access modifiers changed from: private */
    public final void N0(String str) {
        C8951o f10 = rw.f.f(this, K0(), (C17642l) null, 2, (Object) null);
        if (f10 != null) {
            Uri parse = Uri.parse(str);
            C17542s.i(parse, "parse(...)");
            f10.Y(parse, rw.c.f28698a.c().a());
        }
    }

    /* access modifiers changed from: protected */
    public void D0(C4889m mVar, int i10) {
        mVar.W(24106728);
        if (C4895p.J()) {
            C4895p.S(24106728, i10, -1, "com.ingka.ikea.inbox.impl.fragment.NotificationDetailsFragment.FragmentContent (NotificationDetailsFragment.kt:33)");
        }
        u L02 = L0();
        mVar.W(1216733483);
        boolean F10 = mVar.F(this);
        Object D10 = mVar.D();
        if (F10 || D10 == C4889m.f14007a.a()) {
            D10 = new a(this);
            mVar.u(D10);
        }
        mVar.P();
        C17631a aVar = (C17631a) ((C18059h) D10);
        mVar.W(1216734793);
        boolean F11 = mVar.F(this);
        Object D11 = mVar.D();
        if (F11 || D11 == C4889m.f14007a.a()) {
            D11 = new b(this);
            mVar.u(D11);
        }
        mVar.P();
        v.w(L02, aVar, (C17642l) ((C18059h) D11), mVar, 0);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
    }

    public String K0() {
        return this.f96026X;
    }

    /* access modifiers changed from: protected */
    public boolean t0() {
        return this.f96030z0;
    }

    /* access modifiers changed from: protected */
    public boolean u0() {
        return this.f96029y0;
    }

    /* access modifiers changed from: protected */
    public boolean v0() {
        return this.f96028Z;
    }
}

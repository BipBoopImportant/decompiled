package com.ingka.ikea.inbox.impl.fragment;

import Ds.k;
import TJ.C16532g;
import TJ.C16534i;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import XH.t;
import XH.y;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.W;
import androidx.lifecycle.C5208k;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.C5222z;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import androidx.lifecycle.r;
import com.ingka.ikea.inbox.impl.fragment.NotificationPermissionDialog;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.P;
import l3.a;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import rs.C11844a;
import ss.i;
import uI.C18059h;
import ws.C12300a;
import ws.C12301b;
import x4.C;
import x4.C8948l;
import x4.C8951o;
import x4.I;
import ys.C12502a;
import ys.C12503b;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0007H\u0015¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0011\u0010\u0004J\u0019\u0010\u0014\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010*\u001a\u00020&8\u0014XD¢\u0006\f\n\u0004\b'\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010-\u001a\u00020&8\u0014XD¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b,\u0010)R\u001a\u00100\u001a\u00020&8\u0014XD¢\u0006\f\n\u0004\b.\u0010'\u001a\u0004\b/\u0010)R\u001b\u00106\u001a\u0002018BX\u0002¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u001a\u0010;\u001a\u00020\n8\u0016XD¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:¨\u0006<"}, d2 = {"Lcom/ingka/ikea/inbox/impl/fragment/InboxFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseComposeFragment;", "", "<init>", "()V", "Lys/a;", "navigation", "LXH/N;", "O0", "(Lys/a;)V", "", "uri", "R0", "(Ljava/lang/String;)V", "S0", "D0", "(LU0/m;I)V", "onResume", "Landroid/os/Bundle;", "savedInstanceState", "E0", "(Landroid/os/Bundle;)V", "Lrs/a;", "X", "Lrs/a;", "M0", "()Lrs/a;", "setInboxAnalytics", "(Lrs/a;)V", "inboxAnalytics", "Lam/d;", "Y", "Lam/d;", "L0", "()Lam/d;", "setDeviceIntentProvider", "(Lam/d;)V", "deviceIntentProvider", "", "Z", "v0", "()Z", "drawUnderStatusBar", "y0", "u0", "drawUnderNavigationBar", "z0", "t0", "drawUnderDisplayCutout", "LDs/k;", "A0", "LXH/o;", "N0", "()LDs/k;", "viewModel", "B0", "Ljava/lang/String;", "K0", "()Ljava/lang/String;", "destId", "inbox-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InboxFragment extends a {

    /* renamed from: A0  reason: collision with root package name */
    private final C16824o f96005A0;

    /* renamed from: B0  reason: collision with root package name */
    private final String f96006B0 = "inbox_page";

    /* renamed from: X  reason: collision with root package name */
    public C11844a f96007X;

    /* renamed from: Y  reason: collision with root package name */
    public am.d f96008Y;

    /* renamed from: Z  reason: collision with root package name */
    private final boolean f96009Z;

    /* renamed from: y0  reason: collision with root package name */
    private final boolean f96010y0;

    /* renamed from: z0  reason: collision with root package name */
    private final boolean f96011z0;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a extends C17540p implements C17642l<C12502a, C16807N> {
        a(Object obj) {
            super(1, obj, InboxFragment.class, "handleNavigation", "handleNavigation(Lcom/ingka/ikea/inbox/impl/model/Inbox$Destination;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            t((C12502a) obj);
            return C16807N.f139792a;
        }

        public final void t(C12502a aVar) {
            C17542s.j(aVar, "p0");
            ((InboxFragment) this.receiver).O0(aVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f96012a;

        /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|3|4|5|6|7|8|9|10|11|13) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
        static {
            /*
                com.ingka.ikea.inbox.impl.fragment.NotificationPermissionDialog$a$a[] r0 = com.ingka.ikea.inbox.impl.fragment.NotificationPermissionDialog.a.C2128a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.ingka.ikea.inbox.impl.fragment.NotificationPermissionDialog$a$a r1 = com.ingka.ikea.inbox.impl.fragment.NotificationPermissionDialog.a.C2128a.Granted     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                com.ingka.ikea.inbox.impl.fragment.NotificationPermissionDialog$a$a r1 = com.ingka.ikea.inbox.impl.fragment.NotificationPermissionDialog.a.C2128a.FirstDeny     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                com.ingka.ikea.inbox.impl.fragment.NotificationPermissionDialog$a$a r1 = com.ingka.ikea.inbox.impl.fragment.NotificationPermissionDialog.a.C2128a.SecondDeny     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                com.ingka.ikea.inbox.impl.fragment.NotificationPermissionDialog$a$a r1 = com.ingka.ikea.inbox.impl.fragment.NotificationPermissionDialog.a.C2128a.Blocked     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                com.ingka.ikea.inbox.impl.fragment.NotificationPermissionDialog$a$a r1 = com.ingka.ikea.inbox.impl.fragment.NotificationPermissionDialog.a.C2128a.Cancelled     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                f96012a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.inbox.impl.fragment.InboxFragment.b.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00018\u0000H\n"}, d2 = {"T", "value", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.inbox.impl.fragment.InboxFragment$setupFragmentListeners$$inlined$consumeResult$1", f = "InboxFragment.kt", l = {}, m = "invokeSuspend")
    public static final class c extends l implements p<String, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f96013c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f96014d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C8948l f96015e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f96016f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ InboxFragment f96017g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C8948l lVar, String str, C17164e eVar, InboxFragment inboxFragment) {
            super(2, eVar);
            this.f96015e = lVar;
            this.f96016f = str;
            this.f96017g = inboxFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            c cVar = new c(this.f96015e, this.f96016f, eVar, this.f96017g);
            cVar.f96014d = obj;
            return cVar;
        }

        /* renamed from: i */
        public final Object invoke(String str, C17164e<? super C16807N> eVar) {
            return ((c) create(str, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C12503b.f fVar;
            C17187b.f();
            if (this.f96013c == 0) {
                y.b(obj);
                Object obj2 = this.f96014d;
                if (obj2 != null) {
                    int i10 = b.f96012a[NotificationPermissionDialog.a.C2128a.Companion.a((String) obj2).ordinal()];
                    if (i10 == 1) {
                        fVar = C12503b.f.Granted;
                    } else if (i10 == 2) {
                        fVar = C12503b.f.FirstDeny;
                    } else if (i10 == 3) {
                        fVar = C12503b.f.SecondDeny;
                    } else if (i10 != 4) {
                        if (i10 != 5) {
                            throw new t();
                        }
                        this.f96015e.h().m(this.f96016f, null);
                    } else {
                        fVar = C12503b.f.Blocked;
                    }
                    this.f96017g.N0().t0(fVar);
                    this.f96015e.h().m(this.f96016f, null);
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f96018c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C5187o oVar) {
            super(0);
            this.f96018c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f96018c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f96019c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C17631a aVar) {
            super(0);
            this.f96019c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f96019c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f96020c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C16824o oVar) {
            super(0);
            this.f96020c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f96020c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f96021c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f96022d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(C17631a aVar, C16824o oVar) {
            super(0);
            this.f96021c = aVar;
            this.f96022d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f96021c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f96022d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class h extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f96023c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f96024d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f96023c = oVar;
            this.f96024d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f96024d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f96023c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public InboxFragment() {
        C16824o a10 = C16825p.a(s.NONE, new e(new d(this)));
        this.f96005A0 = W.b(this, P.b(k.class), new f(a10), new g((C17631a) null, a10), new h(this, a10));
    }

    /* access modifiers changed from: private */
    public final k N0() {
        return (k) this.f96005A0.getValue();
    }

    /* access modifiers changed from: private */
    public final void O0(C12502a aVar) {
        if (aVar instanceof C12502a.C2552a) {
            androidx.navigation.fragment.a.a(this).k0();
        } else if (aVar instanceof C12502a.b) {
            R0(((C12502a.b) aVar).a());
        } else if (aVar instanceof C12502a.e) {
            startActivity(L0().b());
        } else if (aVar instanceof C12502a.d) {
            rw.f.d(this, K0(), new C12300a());
        } else if (aVar instanceof C12502a.c) {
            rw.f.d(this, K0(), new C12301b());
        } else {
            throw new t();
        }
    }

    /* access modifiers changed from: private */
    public static final C16807N P0(C8951o oVar) {
        C17542s.j(oVar, "$this$safeNavController");
        C8951o.g0(oVar, "notification_settings", rw.c.f28698a.c().a(), (I.a) null, 4, (Object) null);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N Q0(C8951o oVar) {
        C17542s.j(oVar, "$this$safeNavController");
        C8951o.g0(oVar, "notification_permission", (C) null, (I.a) null, 6, (Object) null);
        return C16807N.f139792a;
    }

    private final void R0(String str) {
        C8951o f10 = rw.f.f(this, K0(), (C17642l) null, 2, (Object) null);
        if (f10 != null) {
            Uri parse = Uri.parse(str);
            C17542s.i(parse, "parse(...)");
            f10.Y(parse, rw.c.f28698a.c().a());
        }
    }

    private final void S0() {
        if (rw.a.b(this)) {
            C8948l E10 = androidx.navigation.fragment.a.a(this).E(K0());
            C16532g R10 = C16534i.R(C5208k.a(E10.h().i("NotificationPermissionDialog-REQUEST_KEY", null), E10.getLifecycle(), r.b.RESUMED), new c(E10, "NotificationPermissionDialog-REQUEST_KEY", (C17164e) null, this));
            C5221y viewLifecycleOwner = getViewLifecycleOwner();
            C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            C16534i.M(R10, C5222z.a(viewLifecycleOwner));
        }
    }

    /* access modifiers changed from: protected */
    public void D0(C4889m mVar, int i10) {
        mVar.W(1139837578);
        if (C4895p.J()) {
            C4895p.S(1139837578, i10, -1, "com.ingka.ikea.inbox.impl.fragment.InboxFragment.FragmentContent (InboxFragment.kt:48)");
        }
        k N02 = N0();
        mVar.W(-794351010);
        boolean F10 = mVar.F(this);
        Object D10 = mVar.D();
        if (F10 || D10 == C4889m.f14007a.a()) {
            D10 = new a(this);
            mVar.u(D10);
        }
        mVar.P();
        i.m(N02, (C17642l) ((C18059h) D10), mVar, 0);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
    }

    /* access modifiers changed from: protected */
    public void E0(Bundle bundle) {
        String string;
        Bundle arguments = getArguments();
        if (!(arguments == null || (string = arguments.getString("click_analytics_key")) == null)) {
            M0().d(string);
        }
        S0();
    }

    public String K0() {
        return this.f96006B0;
    }

    public final am.d L0() {
        am.d dVar = this.f96008Y;
        if (dVar != null) {
            return dVar;
        }
        C17542s.z("deviceIntentProvider");
        return null;
    }

    public final C11844a M0() {
        C11844a aVar = this.f96007X;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("inboxAnalytics");
        return null;
    }

    public void onResume() {
        super.onResume();
        N0().t0(C12503b.h.f107223a);
    }

    /* access modifiers changed from: protected */
    public boolean t0() {
        return this.f96011z0;
    }

    /* access modifiers changed from: protected */
    public boolean u0() {
        return this.f96010y0;
    }

    /* access modifiers changed from: protected */
    public boolean v0() {
        return this.f96009Z;
    }
}

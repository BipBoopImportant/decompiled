package com.ingka.ikea.app.scanandgoonlineredesign.fragment;

import Iz.Y;
import MB.C13194a;
import Si.C10913b;
import Si.m;
import TJ.C16532g;
import TJ.C16534i;
import U0.C4889m;
import U0.C4895p;
import Uj.q;
import Uj.u;
import Uj.v;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import XH.t;
import XH.y;
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
import com.ingka.ikea.store.datalayer.StorageType;
import dI.C17164e;
import eI.C17187b;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.P;
import l3.a;
import nI.C17631a;
import nI.p;
import tj.C11905m;
import x4.C;
import x4.C8948l;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0007H\u0015¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u00128\u0016XD¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u00188\u0016X\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\"\u001a\u00020\u001e8\u0014XD¢\u0006\f\n\u0004\b\u001f\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010%\u001a\u00020\u001e8\u0014XD¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010!R\u001b\u0010+\u001a\u00020&8BX\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\"\u00103\u001a\u00020,8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010;\u001a\u0002048\u0006@\u0006X.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010C\u001a\u00020<8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010B¨\u0006D"}, d2 = {"Lcom/ingka/ikea/app/scanandgoonlineredesign/fragment/ScanAndGoOnboardingFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseComposeFragment;", "", "<init>", "()V", "LUj/u;", "navAction", "LXH/N;", "Q0", "(LUj/u;)V", "R0", "P0", "D0", "(LU0/m;I)V", "Landroid/os/Bundle;", "savedInstanceState", "E0", "(Landroid/os/Bundle;)V", "", "X", "Ljava/lang/String;", "K0", "()Ljava/lang/String;", "destId", "Lkotlin/Function0;", "Y", "LnI/a;", "getCallbackNavControllerSet", "()LnI/a;", "callbackNavControllerSet", "", "Z", "u0", "()Z", "drawUnderNavigationBar", "y0", "t0", "drawUnderDisplayCutout", "LUj/q;", "z0", "LXH/o;", "O0", "()LUj/q;", "viewModel", "LMB/a;", "A0", "LMB/a;", "N0", "()LMB/a;", "setStorePickerNavigation", "(LMB/a;)V", "storePickerNavigation", "LIz/Y;", "B0", "LIz/Y;", "M0", "()LIz/Y;", "setScanAndGoNavigation", "(LIz/Y;)V", "scanAndGoNavigation", "LSy/a;", "C0", "LSy/a;", "L0", "()LSy/a;", "setScanAndGoAnalytics", "(LSy/a;)V", "scanAndGoAnalytics", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ScanAndGoOnboardingFragment extends e {

    /* renamed from: A0  reason: collision with root package name */
    public C13194a f91591A0;

    /* renamed from: B0  reason: collision with root package name */
    public Y f91592B0;

    /* renamed from: C0  reason: collision with root package name */
    public Sy.a f91593C0;

    /* renamed from: X  reason: collision with root package name */
    private final String f91594X = "scanandgo/onboarding?entryPoint={entryPoint}&";

    /* renamed from: Y  reason: collision with root package name */
    private final C17631a<C16807N> f91595Y = new C11905m();

    /* renamed from: Z  reason: collision with root package name */
    private final boolean f91596Z;

    /* renamed from: y0  reason: collision with root package name */
    private final boolean f91597y0;

    /* renamed from: z0  reason: collision with root package name */
    private final C16824o f91598z0;

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/ingka/ikea/app/scanandgoonlineredesign/fragment/ScanAndGoOnboardingFragment$a", "LSi/b;", "LUj/v;", "action", "LXH/N;", "a", "(LUj/v;)V", "LUj/u;", "navAction", "b", "(LUj/u;)V", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements C10913b {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ScanAndGoOnboardingFragment f91599a;

        a(ScanAndGoOnboardingFragment scanAndGoOnboardingFragment) {
            this.f91599a = scanAndGoOnboardingFragment;
        }

        public void a(v vVar) {
            C17542s.j(vVar, "action");
            this.f91599a.O0().G(vVar);
        }

        public void b(u uVar) {
            this.f91599a.Q0(uVar);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00018\u0000H\n"}, d2 = {"T", "value", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.fragment.ScanAndGoOnboardingFragment$onChangeStoreResultListener$$inlined$consumeResult$1", f = "ScanAndGoOnboardingFragment.kt", l = {}, m = "invokeSuspend")
    public static final class b extends l implements p<C13194a.b, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f91600c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f91601d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C8948l f91602e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f91603f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ScanAndGoOnboardingFragment f91604g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C8948l lVar, String str, C17164e eVar, ScanAndGoOnboardingFragment scanAndGoOnboardingFragment) {
            super(2, eVar);
            this.f91602e = lVar;
            this.f91603f = str;
            this.f91604g = scanAndGoOnboardingFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            b bVar = new b(this.f91602e, this.f91603f, eVar, this.f91604g);
            bVar.f91601d = obj;
            return bVar;
        }

        /* renamed from: i */
        public final Object invoke(C13194a.b bVar, C17164e<? super C16807N> eVar) {
            return ((b) create(bVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f91600c == 0) {
                y.b(obj);
                Object obj2 = this.f91601d;
                if (obj2 != null) {
                    this.f91604g.O0().G(new v.c((C13194a.b) obj2));
                    this.f91602e.h().m(this.f91603f, null);
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00018\u0000H\n"}, d2 = {"T", "value", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.scanandgoonlineredesign.fragment.ScanAndGoOnboardingFragment$onSelectStoreResultListener$$inlined$consumeResult$1", f = "ScanAndGoOnboardingFragment.kt", l = {}, m = "invokeSuspend")
    public static final class c extends l implements p<C13194a.b, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f91605c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f91606d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C8948l f91607e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f91608f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ ScanAndGoOnboardingFragment f91609g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C8948l lVar, String str, C17164e eVar, ScanAndGoOnboardingFragment scanAndGoOnboardingFragment) {
            super(2, eVar);
            this.f91607e = lVar;
            this.f91608f = str;
            this.f91609g = scanAndGoOnboardingFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            c cVar = new c(this.f91607e, this.f91608f, eVar, this.f91609g);
            cVar.f91606d = obj;
            return cVar;
        }

        /* renamed from: i */
        public final Object invoke(C13194a.b bVar, C17164e<? super C16807N> eVar) {
            return ((c) create(bVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f91605c == 0) {
                y.b(obj);
                Object obj2 = this.f91606d;
                if (obj2 != null) {
                    this.f91609g.O0().G(new v.h((C13194a.b) obj2));
                    this.f91607e.h().m(this.f91608f, null);
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f91610c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C5187o oVar) {
            super(0);
            this.f91610c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f91610c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f91611c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C17631a aVar) {
            super(0);
            this.f91611c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f91611c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f91612c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C16824o oVar) {
            super(0);
            this.f91612c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f91612c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f91613c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f91614d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(C17631a aVar, C16824o oVar) {
            super(0);
            this.f91613c = aVar;
            this.f91614d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f91613c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f91614d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class h extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f91615c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f91616d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f91615c = oVar;
            this.f91616d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f91616d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f91615c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public ScanAndGoOnboardingFragment() {
        C16824o a10 = C16825p.a(s.NONE, new e(new d(this)));
        this.f91598z0 = W.b(this, P.b(q.class), new f(a10), new g((C17631a) null, a10), new h(this, a10));
    }

    /* access modifiers changed from: private */
    public static final C16807N J0() {
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final q O0() {
        return (q) this.f91598z0.getValue();
    }

    private final void P0() {
        C8948l E10 = androidx.navigation.fragment.a.a(this).E(K0());
        C16532g R10 = C16534i.R(C5208k.a(E10.h().i("StorePickerNavigation.RequestKey.Change", null), E10.getLifecycle(), r.b.RESUMED), new b(E10, "StorePickerNavigation.RequestKey.Change", (C17164e) null, this));
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C16534i.M(R10, C5222z.a(viewLifecycleOwner));
    }

    /* access modifiers changed from: private */
    public final void Q0(u uVar) {
        if (C17542s.e(uVar, u.a.f88268a)) {
            androidx.navigation.fragment.a.a(this).k0();
        } else if (uVar instanceof u.c) {
            androidx.navigation.fragment.a.a(this).k0();
            Y.b.a(M0(), androidx.navigation.fragment.a.a(this), ((u.c) uVar).a(), (String) null, 4, (Object) null);
        } else if (uVar instanceof u.d) {
            C13194a.C2742a.a(N0(), androidx.navigation.fragment.a.a(this), StorageType.LOCAL, (String) null, true, "StorePickerNavigation.RequestKey.Select", (C) null, 36, (Object) null);
        } else if (uVar instanceof u.b) {
            L0().n();
            C13194a.C2742a.a(N0(), androidx.navigation.fragment.a.a(this), StorageType.LOCAL, (String) null, true, "StorePickerNavigation.RequestKey.Change", (C) null, 36, (Object) null);
        } else if (uVar == null) {
            O0().G(v.a.f88273a);
        } else {
            throw new t();
        }
    }

    private final void R0() {
        C8948l E10 = androidx.navigation.fragment.a.a(this).E(K0());
        C16532g R10 = C16534i.R(C5208k.a(E10.h().i("StorePickerNavigation.RequestKey.Select", null), E10.getLifecycle(), r.b.RESUMED), new c(E10, "StorePickerNavigation.RequestKey.Select", (C17164e) null, this));
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C16534i.M(R10, C5222z.a(viewLifecycleOwner));
    }

    /* access modifiers changed from: protected */
    public void D0(C4889m mVar, int i10) {
        mVar.W(-183960073);
        if (C4895p.J()) {
            C4895p.S(-183960073, i10, -1, "com.ingka.ikea.app.scanandgoonlineredesign.fragment.ScanAndGoOnboardingFragment.FragmentContent (ScanAndGoOnboardingFragment.kt:47)");
        }
        m.k(O0(), new a(this), mVar, 0);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
    }

    /* access modifiers changed from: protected */
    public void E0(Bundle bundle) {
        super.E0(bundle);
        R0();
        P0();
    }

    public String K0() {
        return this.f91594X;
    }

    public final Sy.a L0() {
        Sy.a aVar = this.f91593C0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("scanAndGoAnalytics");
        return null;
    }

    public final Y M0() {
        Y y10 = this.f91592B0;
        if (y10 != null) {
            return y10;
        }
        C17542s.z("scanAndGoNavigation");
        return null;
    }

    public final C13194a N0() {
        C13194a aVar = this.f91591A0;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("storePickerNavigation");
        return null;
    }

    /* access modifiers changed from: protected */
    public boolean t0() {
        return this.f91597y0;
    }

    /* access modifiers changed from: protected */
    public boolean u0() {
        return this.f91596Z;
    }
}

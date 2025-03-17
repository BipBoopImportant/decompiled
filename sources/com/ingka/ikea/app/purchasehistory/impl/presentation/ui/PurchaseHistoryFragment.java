package com.ingka.ikea.app.purchasehistory.impl.presentation.ui;

import Ai.q1;
import Ci.C10650v;
import Ci.C10651w;
import Ci.C10652x;
import Ei.C10703x;
import HJ.C15854t;
import TJ.C16532g;
import TJ.C16534i;
import U0.A1;
import U0.C4889m;
import U0.C4895p;
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
import com.ingka.ikea.app.purchasehistory.impl.presentation.ui.k;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import java.util.ArrayList;
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
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import uI.C18059h;
import vi.C12127a;
import x4.C;
import x4.C8948l;
import x4.C8951o;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\u0004J\u000f\u0010\f\u001a\u00020\u0005H\u0015¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0019\u001a\u00020\u00128\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001f\u001a\u00020\u001a8BX\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010%\u001a\u00020 8\u0016XD¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R \u0010+\u001a\b\u0012\u0004\u0012\u00020\u00050&8\u0016X\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0016\u0010-\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b,\u0010!¨\u00060²\u0006\f\u0010/\u001a\u00020.8\nX\u0002"}, d2 = {"Lcom/ingka/ikea/app/purchasehistory/impl/presentation/ui/PurchaseHistoryFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseComposeFragment;", "", "<init>", "()V", "LXH/N;", "T0", "", "popCurrent", "S0", "(Z)V", "U0", "D0", "(LU0/m;I)V", "Landroid/os/Bundle;", "savedInstanceState", "E0", "(Landroid/os/Bundle;)V", "Lvi/a;", "X", "Lvi/a;", "Q0", "()Lvi/a;", "setPurchaseHistoryNavigation", "(Lvi/a;)V", "purchaseHistoryNavigation", "LEi/x;", "Y", "LXH/o;", "R0", "()LEi/x;", "purchaseHistoryViewModel", "", "Z", "Ljava/lang/String;", "P0", "()Ljava/lang/String;", "destId", "Lkotlin/Function0;", "y0", "LnI/a;", "getCallbackNavControllerSet", "()LnI/a;", "callbackNavControllerSet", "z0", "navControllerRequiredTaskRemaining", "LEi/x$a;", "uiState", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PurchaseHistoryFragment extends f {

    /* renamed from: X  reason: collision with root package name */
    public C12127a f90874X;

    /* renamed from: Y  reason: collision with root package name */
    private final C16824o f90875Y;

    /* renamed from: Z  reason: collision with root package name */
    private final String f90876Z = "purchaseHistory/purchases";

    /* renamed from: y0  reason: collision with root package name */
    private final C17631a<C16807N> f90877y0 = new C10650v(this);

    /* renamed from: z0  reason: collision with root package name */
    private boolean f90878z0 = true;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a extends C17540p implements C17631a<C16807N> {
        a(Object obj) {
            super(0, obj, PurchaseHistoryFragment.class, "popBackStack", "popBackStack()V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            t();
            return C16807N.f139792a;
        }

        public final void t() {
            ((PurchaseHistoryFragment) this.receiver).U0();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class b extends C17540p implements C17631a<C16807N> {
        b(Object obj) {
            super(0, obj, PurchaseHistoryFragment.class, "popBackStack", "popBackStack()V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            t();
            return C16807N.f139792a;
        }

        public final void t() {
            ((PurchaseHistoryFragment) this.receiver).U0();
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00018\u0000H\n"}, d2 = {"T", "value", "LXH/N;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.app.purchasehistory.impl.presentation.ui.PurchaseHistoryFragment$observeNavigationResult$$inlined$consumeResult$1", f = "PurchaseHistoryFragment.kt", l = {}, m = "invokeSuspend")
    public static final class c extends l implements p<k, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f90879c;

        /* renamed from: d  reason: collision with root package name */
        /* synthetic */ Object f90880d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ C8948l f90881e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ String f90882f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ PurchaseHistoryFragment f90883g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C8948l lVar, String str, C17164e eVar, PurchaseHistoryFragment purchaseHistoryFragment) {
            super(2, eVar);
            this.f90881e = lVar;
            this.f90882f = str;
            this.f90883g = purchaseHistoryFragment;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            c cVar = new c(this.f90881e, this.f90882f, eVar, this.f90883g);
            cVar.f90880d = obj;
            return cVar;
        }

        /* renamed from: i */
        public final Object invoke(k kVar, C17164e<? super C16807N> eVar) {
            return ((c) create(kVar, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f90879c == 0) {
                y.b(obj);
                Object obj2 = this.f90880d;
                if (obj2 != null) {
                    k kVar = (k) obj2;
                    PurchaseHistoryFragment purchaseHistoryFragment = this.f90883g;
                    qv.e eVar = qv.e.DEBUG;
                    ArrayList<C11819b> arrayList = new ArrayList<>();
                    for (Object next : qv.d.f102012a.a()) {
                        if (((C11819b) next).b(eVar, false)) {
                            arrayList.add(next);
                        }
                    }
                    String str = null;
                    String str2 = null;
                    for (C11819b bVar : arrayList) {
                        if (str == null) {
                            String a10 = C11818a.a("Navigation result: " + kVar, (Throwable) null);
                            if (a10 == null) {
                                break;
                            }
                            str = C11820c.a(a10);
                        }
                        String str3 = str;
                        if (str2 == null) {
                            String name = purchaseHistoryFragment.getClass().getName();
                            C17542s.g(name);
                            String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                            if (o12.length() != 0) {
                                name = C15854t.P0(o12, "Kt");
                            }
                            str2 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : DslKt.INDICATOR_BACKGROUND) + DslKt.INDICATOR_SEPARATOR + name;
                        }
                        String str4 = str2;
                        bVar.a(eVar, str4, false, (Throwable) null, str3);
                        str = str3;
                        str2 = str4;
                    }
                    if (C17542s.e(kVar, k.a.f90951a)) {
                        this.f90883g.R0().G();
                        this.f90881e.h().m(this.f90882f, null);
                    } else {
                        throw new t();
                    }
                }
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f90884c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C5187o oVar) {
            super(0);
            this.f90884c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f90884c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f90885c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C17631a aVar) {
            super(0);
            this.f90885c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f90885c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f90886c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C16824o oVar) {
            super(0);
            this.f90886c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f90886c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f90887c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f90888d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(C17631a aVar, C16824o oVar) {
            super(0);
            this.f90887c = aVar;
            this.f90888d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f90887c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f90888d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class h extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f90889c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f90890d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f90889c = oVar;
            this.f90890d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f90890d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f90889c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public PurchaseHistoryFragment() {
        C16824o a10 = C16825p.a(s.NONE, new e(new d(this)));
        this.f90875Y = W.b(this, P.b(C10703x.class), new f(a10), new g((C17631a) null, a10), new h(this, a10));
    }

    private static final C10703x.a J0(A1<? extends C10703x.a> a12) {
        return (C10703x.a) a12.getValue();
    }

    /* access modifiers changed from: private */
    public static final C16807N K0(PurchaseHistoryFragment purchaseHistoryFragment) {
        purchaseHistoryFragment.S0(false);
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N L0(PurchaseHistoryFragment purchaseHistoryFragment, Hx.f fVar, String str) {
        C17542s.j(fVar, "type");
        C17542s.j(str, "id");
        C8951o f10 = rw.f.f(purchaseHistoryFragment, purchaseHistoryFragment.P0(), (C17642l) null, 2, (Object) null);
        if (f10 != null) {
            purchaseHistoryFragment.Q0().f(f10, str, fVar, (String) null, false, rw.c.f28698a.c().a());
        }
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N O0(PurchaseHistoryFragment purchaseHistoryFragment) {
        purchaseHistoryFragment.T0();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final C10703x R0() {
        return (C10703x) this.f90875Y.getValue();
    }

    private final void S0(boolean z10) {
        C12127a.C2488a.a(Q0(), androidx.navigation.fragment.a.a(this), (String) null, (String) null, (String) null, C.a.l(new C.a(), P0(), z10, false, 4, (Object) null).a(), 14, (Object) null);
    }

    private final void T0() {
        if (rw.a.b(this) && this.f90878z0) {
            this.f90878z0 = false;
            C8948l E10 = androidx.navigation.fragment.a.a(this).E(P0());
            C16532g R10 = C16534i.R(C5208k.a(E10.h().i("PurchaseDetailsFragmentRequestKey", null), E10.getLifecycle(), r.b.RESUMED), new c(E10, "PurchaseDetailsFragmentRequestKey", (C17164e) null, this));
            C5221y viewLifecycleOwner = getViewLifecycleOwner();
            C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            C16534i.M(R10, C5222z.a(viewLifecycleOwner));
        }
    }

    /* access modifiers changed from: private */
    public final void U0() {
        androidx.navigation.fragment.a.a(this).i0();
    }

    /* access modifiers changed from: protected */
    public void D0(C4889m mVar, int i10) {
        mVar.W(-43316268);
        if (C4895p.J()) {
            C4895p.S(-43316268, i10, -1, "com.ingka.ikea.app.purchasehistory.impl.presentation.ui.PurchaseHistoryFragment.FragmentContent (PurchaseHistoryFragment.kt:43)");
        }
        C10703x.a J02 = J0(j3.a.c(R0().m(), (C5221y) null, (r.b) null, (C17168i) null, mVar, 0, 7));
        mVar.W(-1461538451);
        boolean F10 = mVar.F(this);
        Object D10 = mVar.D();
        if (F10 || D10 == C4889m.f14007a.a()) {
            D10 = new a(this);
            mVar.u(D10);
        }
        mVar.P();
        C17631a aVar = (C17631a) ((C18059h) D10);
        mVar.W(-1461536760);
        boolean F11 = mVar.F(this);
        Object D11 = mVar.D();
        if (F11 || D11 == C4889m.f14007a.a()) {
            D11 = new C10651w(this);
            mVar.u(D11);
        }
        C17631a aVar2 = (C17631a) D11;
        mVar.P();
        mVar.W(-1461533427);
        boolean F12 = mVar.F(this);
        Object D12 = mVar.D();
        if (F12 || D12 == C4889m.f14007a.a()) {
            D12 = new b(this);
            mVar.u(D12);
        }
        mVar.P();
        C17631a aVar3 = (C17631a) ((C18059h) D12);
        mVar.W(-1461531429);
        boolean F13 = mVar.F(this);
        Object D13 = mVar.D();
        if (F13 || D13 == C4889m.f14007a.a()) {
            D13 = new C10652x(this);
            mVar.u(D13);
        }
        mVar.P();
        q1.r(J02, aVar, aVar2, aVar3, (p) D13, mVar, 0);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
    }

    /* access modifiers changed from: protected */
    public void E0(Bundle bundle) {
        super.E0(bundle);
        T0();
    }

    public String P0() {
        return this.f90876Z;
    }

    public final C12127a Q0() {
        C12127a aVar = this.f90874X;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("purchaseHistoryNavigation");
        return null;
    }
}

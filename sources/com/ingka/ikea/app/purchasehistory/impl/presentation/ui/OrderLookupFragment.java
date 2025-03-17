package com.ingka.ikea.app.purchasehistory.impl.presentation.ui;

import Ai.C10557b0;
import Ei.C10687h;
import U0.C4889m;
import U0.C4895p;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import XH.t;
import android.view.View;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.W;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import jp.g;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.P;
import l3.a;
import nI.C17631a;
import nI.C17642l;
import uI.C18059h;
import vi.C12127a;
import x4.C;
import x4.C8951o;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0007H\u0015¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\r\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u000e8\u0016XD¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u001b\u001a\u00020\u00148\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001b\u0010!\u001a\u00020\u001c8BX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lcom/ingka/ikea/app/purchasehistory/impl/presentation/ui/OrderLookupFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseComposeFragment;", "", "<init>", "()V", "LEi/h$b$c;", "action", "LXH/N;", "K0", "(LEi/h$b$c;)V", "L0", "D0", "(LU0/m;I)V", "onDestroyView", "", "X", "Ljava/lang/String;", "H0", "()Ljava/lang/String;", "destId", "Lvi/a;", "Y", "Lvi/a;", "J0", "()Lvi/a;", "setPurchaseHistoryNavigation", "(Lvi/a;)V", "purchaseHistoryNavigation", "LEi/h;", "Z", "LXH/o;", "I0", "()LEi/h;", "orderLookupViewModel", "purchasehistory-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class OrderLookupFragment extends d {

    /* renamed from: X  reason: collision with root package name */
    private final String f90807X = "purchaseHistory/order?orderId={orderId}&liteId={liteId}&cc={cc}";

    /* renamed from: Y  reason: collision with root package name */
    public C12127a f90808Y;

    /* renamed from: Z  reason: collision with root package name */
    private final C16824o f90809Z;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a extends C17540p implements C17642l<C10687h.b.c, C16807N> {
        a(Object obj) {
            super(1, obj, OrderLookupFragment.class, "handleNavigationAction", "handleNavigationAction(Lcom/ingka/ikea/app/purchasehistory/impl/presentation/viewmodels/OrderLookupViewModel$OrderLookupUiState$NavigationAction;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            t((C10687h.b.c) obj);
            return C16807N.f139792a;
        }

        public final void t(C10687h.b.c cVar) {
            C17542s.j(cVar, "p0");
            ((OrderLookupFragment) this.receiver).K0(cVar);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class b extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f90810c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(C5187o oVar) {
            super(0);
            this.f90810c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f90810c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f90811c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C17631a aVar) {
            super(0);
            this.f90811c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f90811c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f90812c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C16824o oVar) {
            super(0);
            this.f90812c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f90812c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f90813c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f90814d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C17631a aVar, C16824o oVar) {
            super(0);
            this.f90813c = aVar;
            this.f90814d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f90813c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f90814d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f90815c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f90816d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f90815c = oVar;
            this.f90816d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f90816d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f90815c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public OrderLookupFragment() {
        C16824o a10 = C16825p.a(s.NONE, new c(new b(this)));
        this.f90809Z = W.b(this, P.b(C10687h.class), new d(a10), new e((C17631a) null, a10), new f(this, a10));
    }

    private final C10687h I0() {
        return (C10687h) this.f90809Z.getValue();
    }

    /* access modifiers changed from: private */
    public final void K0(C10687h.b.c cVar) {
        if (C17542s.e(cVar, C10687h.b.c.a.f80482a)) {
            L0();
        } else if (cVar instanceof C10687h.b.c.C1527b) {
            C8951o f10 = rw.f.f(this, H0(), (C17642l) null, 2, (Object) null);
            if (f10 != null) {
                C10687h.b.c.C1527b bVar = (C10687h.b.c.C1527b) cVar;
                J0().f(f10, bVar.b(), bVar.c(), bVar.a(), false, C.a.l(rw.c.f28698a.c(), H0(), I0().M(), false, 4, (Object) null).a());
            }
        } else {
            throw new t();
        }
    }

    private final void L0() {
        C8951o f10 = rw.f.f(this, H0(), (C17642l) null, 2, (Object) null);
        if (f10 != null) {
            f10.k0();
        }
    }

    /* access modifiers changed from: protected */
    public void D0(C4889m mVar, int i10) {
        mVar.W(-1718694220);
        if (C4895p.J()) {
            C4895p.S(-1718694220, i10, -1, "com.ingka.ikea.app.purchasehistory.impl.presentation.ui.OrderLookupFragment.FragmentContent (OrderLookupFragment.kt:35)");
        }
        C10687h I02 = I0();
        mVar.W(1707801004);
        boolean F10 = mVar.F(this);
        Object D10 = mVar.D();
        if (F10 || D10 == C4889m.f14007a.a()) {
            D10 = new a(this);
            mVar.u(D10);
        }
        mVar.P();
        C10557b0.z(I02, (C17642l) ((C18059h) D10), mVar, 0);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
    }

    public String H0() {
        return this.f90807X;
    }

    public final C12127a J0() {
        C12127a aVar = this.f90808Y;
        if (aVar != null) {
            return aVar;
        }
        C17542s.z("purchaseHistoryNavigation");
        return null;
    }

    public void onDestroyView() {
        View view = getView();
        if (view != null) {
            g.b(view);
        }
        super.onDestroyView();
    }
}

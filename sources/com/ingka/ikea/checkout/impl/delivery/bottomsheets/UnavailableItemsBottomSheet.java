package com.ingka.ikea.checkout.impl.delivery.bottomsheets;

import Do.m;
import Nn.C10804g;
import Nn.C10813p;
import Nn.u;
import QJ.Q;
import U0.C4889m;
import U0.C4895p;
import XH.C16796C;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import XH.y;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.C5197z;
import androidx.fragment.app.W;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import com.ingka.ikea.ui.bottomsheetdialog.BottomSheetComposeDialogFragment;
import dI.C17164e;
import eI.C17187b;
import fo.n;
import fo.o;
import fo.r;
import go.m0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import l3.a;
import nI.C17631a;
import nI.C17642l;
import nI.p;
import uI.C18059h;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \u00142\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0015¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\f\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/ingka/ikea/checkout/impl/delivery/bottomsheets/UnavailableItemsBottomSheet;", "Lcom/ingka/ikea/ui/bottomsheetdialog/BottomSheetComposeDialogFragment;", "<init>", "()V", "Lfo/o;", "result", "LXH/N;", "L0", "(Lfo/o;)V", "u0", "(LU0/m;I)V", "Lcom/ingka/ikea/ui/bottomsheetdialog/BottomSheetComposeDialogFragment$a;", "D0", "()Lcom/ingka/ikea/ui/bottomsheetdialog/BottomSheetComposeDialogFragment$a;", "Lfo/r;", "U", "LXH/o;", "K0", "()Lfo/r;", "viewModel", "X", "c", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UnavailableItemsBottomSheet extends e {

    /* renamed from: X  reason: collision with root package name */
    public static final c f94509X = new c((DefaultConstructorMarker) null);

    /* renamed from: Y  reason: collision with root package name */
    public static final int f94510Y = 8;

    /* renamed from: U  reason: collision with root package name */
    private final C16824o f94511U;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a extends C17540p implements C17631a<C16807N> {
        a(Object obj) {
            super(0, obj, UnavailableItemsBottomSheet.class, "dismiss", "dismiss()V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            t();
            return C16807N.f139792a;
        }

        public final void t() {
            ((UnavailableItemsBottomSheet) this.receiver).dismiss();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.impl.delivery.bottomsheets.UnavailableItemsBottomSheet$BottomSheetContent$3$1$1", f = "UnavailableItemsBottomSheet.kt", l = {}, m = "invokeSuspend")
    static final class b extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f94512c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ UnavailableItemsBottomSheet f94513d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        b(UnavailableItemsBottomSheet unavailableItemsBottomSheet, C17164e<? super b> eVar) {
            super(2, eVar);
            this.f94513d = unavailableItemsBottomSheet;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new b(this.f94513d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f94512c == 0) {
                y.b(obj);
                this.f94513d.x0();
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0006XT¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00148\u0000XT¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00148\u0000XT¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00148\u0000XT¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00148\u0000XT¢\u0006\u0006\n\u0004\b\u001a\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00148\u0000XT¢\u0006\u0006\n\u0004\b\u001b\u0010\u0016R\u0014\u0010\u001c\u001a\u00020\u00148\u0000XT¢\u0006\u0006\n\u0004\b\u001c\u0010\u0016¨\u0006\u001d"}, d2 = {"Lcom/ingka/ikea/checkout/impl/delivery/bottomsheets/UnavailableItemsBottomSheet$c;", "", "<init>", "()V", "", "isSelectable", "", "LNn/Q;", "unavailableItems", "LNn/g;", "productList", "LDo/m;", "selectedDeliveryOption", "LNn/p;", "deliveryServiceType", "LNn/u;", "serviceType", "Lcom/ingka/ikea/checkout/impl/delivery/bottomsheets/UnavailableItemsBottomSheet;", "a", "(ZLjava/util/List;Ljava/util/List;LDo/m;LNn/p;LNn/u;)Lcom/ingka/ikea/checkout/impl/delivery/bottomsheets/UnavailableItemsBottomSheet;", "", "TAG", "Ljava/lang/String;", "UNAVAILABLE_ITEMS", "ALL_ITEMS", "DELIVERY_OPTION", "IS_SELECTABLE", "DELIVERY_SERVICE_TYPE", "SERVICE_TYPE", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final UnavailableItemsBottomSheet a(boolean z10, List<Nn.Q> list, List<C10804g> list2, m mVar, C10813p pVar, u uVar) {
            C17542s.j(list, "unavailableItems");
            C17542s.j(list2, "productList");
            C17542s.j(mVar, "selectedDeliveryOption");
            C17542s.j(pVar, "deliveryServiceType");
            C17542s.j(uVar, "serviceType");
            UnavailableItemsBottomSheet unavailableItemsBottomSheet = new UnavailableItemsBottomSheet();
            unavailableItemsBottomSheet.setArguments(D2.d.b(C16796C.a("unavailable_items", new ArrayList(list)), C16796C.a("all_items", new ArrayList(list2)), C16796C.a("delivery_option", mVar), C16796C.a("is_selectable", Boolean.valueOf(z10)), C16796C.a("delivery_service_type", pVar), C16796C.a("serviceType", uVar)));
            return unavailableItemsBottomSheet;
        }

        private c() {
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f94514c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C5187o oVar) {
            super(0);
            this.f94514c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f94514c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f94515c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C17631a aVar) {
            super(0);
            this.f94515c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f94515c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f94516c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C16824o oVar) {
            super(0);
            this.f94516c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f94516c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f94517c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f94518d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(C17631a aVar, C16824o oVar) {
            super(0);
            this.f94517c = aVar;
            this.f94518d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f94517c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f94518d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class h extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f94519c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f94520d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f94519c = oVar;
            this.f94520d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f94520d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f94519c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public UnavailableItemsBottomSheet() {
        C16824o a10 = C16825p.a(s.NONE, new e(new d(this)));
        this.f94511U = W.b(this, P.b(r.class), new f(a10), new g((C17631a) null, a10), new h(this, a10));
    }

    /* access modifiers changed from: private */
    public static final C16807N I0(UnavailableItemsBottomSheet unavailableItemsBottomSheet, o oVar) {
        C17542s.j(oVar, "it");
        unavailableItemsBottomSheet.L0(oVar);
        return C16807N.f139792a;
    }

    private final r K0() {
        return (r) this.f94511U.getValue();
    }

    private final void L0(o oVar) {
        C5197z.c(this, "UnavailableItemsBottomSheetRequestKey", D2.d.b(C16796C.a("UnavailableItemsBottomSheetBundleKey", oVar)));
        dismiss();
    }

    /* access modifiers changed from: protected */
    public BottomSheetComposeDialogFragment.a D0() {
        return null;
    }

    /* access modifiers changed from: protected */
    public void u0(C4889m mVar, int i10) {
        mVar.W(-175344077);
        if (C4895p.J()) {
            C4895p.S(-175344077, i10, -1, "com.ingka.ikea.checkout.impl.delivery.bottomsheets.UnavailableItemsBottomSheet.BottomSheetContent (UnavailableItemsBottomSheet.kt:31)");
        }
        r K02 = K0();
        mVar.W(1441446688);
        boolean F10 = mVar.F(this);
        Object D10 = mVar.D();
        if (F10 || D10 == C4889m.f14007a.a()) {
            D10 = new a(this);
            mVar.u(D10);
        }
        mVar.P();
        C17631a aVar = (C17631a) ((C18059h) D10);
        mVar.W(1441448240);
        boolean F11 = mVar.F(this);
        Object D11 = mVar.D();
        if (F11 || D11 == C4889m.f14007a.a()) {
            D11 = new n(this);
            mVar.u(D11);
        }
        mVar.P();
        m0.m(K02, aVar, (C17642l) D11, mVar, 0);
        C16807N n10 = C16807N.f139792a;
        mVar.W(-1281984951);
        boolean F12 = mVar.F(this);
        Object D12 = mVar.D();
        if (F12 || D12 == C4889m.f14007a.a()) {
            D12 = new b(this, (C17164e<? super b>) null);
            mVar.u(D12);
        }
        mVar.P();
        U0.P.g(n10, (p) D12, mVar, 6);
        if (C4895p.J()) {
            C4895p.R();
        }
        mVar.P();
    }
}

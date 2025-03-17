package com.ingka.ikea.checkout.impl.delivery.bottomsheets;

import HJ.C15854t;
import QJ.Q;
import U0.C4889m;
import U0.C4895p;
import XH.C16796C;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import XH.y;
import android.os.Bundle;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.C5197z;
import androidx.fragment.app.W;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import com.ingka.ikea.ui.bottomsheetdialog.BottomSheetComposeDialogFragment;
import com.sugarcube.core.logger.DslKt;
import dI.C17164e;
import eI.C17187b;
import fo.j;
import fo.k;
import go.I;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import l3.a;
import lo.o;
import nI.C17631a;
import nI.p;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \u00102\u00020\u0001:\u0001\u0011B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0015¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/ingka/ikea/checkout/impl/delivery/bottomsheets/DeliveryPricesBottomSheet;", "Lcom/ingka/ikea/ui/bottomsheetdialog/BottomSheetComposeDialogFragment;", "<init>", "()V", "LXH/N;", "u0", "(LU0/m;I)V", "Lcom/ingka/ikea/ui/bottomsheetdialog/BottomSheetComposeDialogFragment$a;", "D0", "()Lcom/ingka/ikea/ui/bottomsheetdialog/BottomSheetComposeDialogFragment$a;", "Llo/o;", "U", "LXH/o;", "M0", "()Llo/o;", "viewModel", "X", "b", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DeliveryPricesBottomSheet extends c {

    /* renamed from: X  reason: collision with root package name */
    public static final b f94494X = new b((DefaultConstructorMarker) null);

    /* renamed from: Y  reason: collision with root package name */
    public static final int f94495Y = 8;

    /* renamed from: U  reason: collision with root package name */
    private final C16824o f94496U;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
    @kotlin.coroutines.jvm.internal.f(c = "com.ingka.ikea.checkout.impl.delivery.bottomsheets.DeliveryPricesBottomSheet$BottomSheetContent$3$1", f = "DeliveryPricesBottomSheet.kt", l = {}, m = "invokeSuspend")
    static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

        /* renamed from: c  reason: collision with root package name */
        int f94497c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ DeliveryPricesBottomSheet f94498d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        a(DeliveryPricesBottomSheet deliveryPricesBottomSheet, C17164e<? super a> eVar) {
            super(2, eVar);
            this.f94498d = deliveryPricesBottomSheet;
        }

        public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
            return new a(this.f94498d, eVar);
        }

        public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
            return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
        }

        public final Object invokeSuspend(Object obj) {
            C17187b.f();
            if (this.f94497c == 0) {
                y.b(obj);
                this.f94498d.x0();
                return C16807N.f139792a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/ingka/ikea/checkout/impl/delivery/bottomsheets/DeliveryPricesBottomSheet$b;", "", "<init>", "()V", "", "checkoutId", "Lcom/ingka/ikea/checkout/impl/delivery/bottomsheets/DeliveryPricesBottomSheet;", "a", "(Ljava/lang/String;)Lcom/ingka/ikea/checkout/impl/delivery/bottomsheets/DeliveryPricesBottomSheet;", "TAG", "Ljava/lang/String;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final DeliveryPricesBottomSheet a(String str) {
            C17542s.j(str, "checkoutId");
            DeliveryPricesBottomSheet deliveryPricesBottomSheet = new DeliveryPricesBottomSheet();
            deliveryPricesBottomSheet.setArguments(D2.d.b(C16796C.a("checkoutId", str)));
            return deliveryPricesBottomSheet;
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class c extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f94499c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(C5187o oVar) {
            super(0);
            this.f94499c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f94499c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f94500c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C17631a aVar) {
            super(0);
            this.f94500c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f94500c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f94501c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C16824o oVar) {
            super(0);
            this.f94501c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f94501c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f94502c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f94503d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C17631a aVar, C16824o oVar) {
            super(0);
            this.f94502c = aVar;
            this.f94503d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f94502c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f94503d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f94504c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f94505d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f94504c = oVar;
            this.f94505d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f94505d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f94504c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public DeliveryPricesBottomSheet() {
        C16824o a10 = C16825p.a(s.NONE, new d(new c(this)));
        this.f94496U = W.b(this, P.b(o.class), new e(a10), new f((C17631a) null, a10), new g(this, a10));
    }

    /* access modifiers changed from: private */
    public static final C16807N J0(DeliveryPricesBottomSheet deliveryPricesBottomSheet) {
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
                String a10 = C11818a.a("Change delivery method clicked", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = deliveryPricesBottomSheet.getClass().getName();
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
        Bundle bundle = Bundle.EMPTY;
        C17542s.i(bundle, "EMPTY");
        C5197z.c(deliveryPricesBottomSheet, "ChangeDeliveryMethodRequestKey", bundle);
        deliveryPricesBottomSheet.dismiss();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final C16807N K0(DeliveryPricesBottomSheet deliveryPricesBottomSheet) {
        deliveryPricesBottomSheet.dismiss();
        return C16807N.f139792a;
    }

    private final o M0() {
        return (o) this.f94496U.getValue();
    }

    /* access modifiers changed from: protected */
    public BottomSheetComposeDialogFragment.a D0() {
        return null;
    }

    /* access modifiers changed from: protected */
    public void u0(C4889m mVar, int i10) {
        mVar.W(273891791);
        if (C4895p.J()) {
            C4895p.S(273891791, i10, -1, "com.ingka.ikea.checkout.impl.delivery.bottomsheets.DeliveryPricesBottomSheet.BottomSheetContent (DeliveryPricesBottomSheet.kt:27)");
        }
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("checkoutId") : null;
        if (string != null) {
            o M02 = M0();
            mVar.W(-1874892148);
            boolean F10 = mVar.F(this);
            Object D10 = mVar.D();
            if (F10 || D10 == C4889m.f14007a.a()) {
                D10 = new j(this);
                mVar.u(D10);
            }
            C17631a aVar = (C17631a) D10;
            mVar.P();
            mVar.W(-1874885170);
            boolean F11 = mVar.F(this);
            Object D11 = mVar.D();
            if (F11 || D11 == C4889m.f14007a.a()) {
                D11 = new k(this);
                mVar.u(D11);
            }
            mVar.P();
            I.o(string, M02, aVar, (C17631a) D11, mVar, 0);
            C16807N n10 = C16807N.f139792a;
            mVar.W(-1874882512);
            boolean F12 = mVar.F(this);
            Object D12 = mVar.D();
            if (F12 || D12 == C4889m.f14007a.a()) {
                D12 = new a(this, (C17164e<? super a>) null);
                mVar.u(D12);
            }
            mVar.P();
            U0.P.g(n10, (p) D12, mVar, 6);
            if (C4895p.J()) {
                C4895p.R();
            }
            mVar.P();
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}

package com.ingka.ikea.checkout.impl.delivery.fragments;

import Ar.j;
import XH.C16796C;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import android.app.Dialog;
import android.os.Bundle;
import android.view.Window;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.W;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import com.ingka.ikea.core.android.fragments.FullscreenDialogFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import l3.a;
import lo.k;
import nI.C17631a;
import rv.C11849b;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0015¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u0003R\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/ingka/ikea/checkout/impl/delivery/fragments/DeliveryDetailsFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseComposeDialogFragment;", "<init>", "()V", "LXH/N;", "D0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "u0", "(LU0/m;I)V", "onStart", "LAr/j;", "Q", "LAr/j;", "B0", "()LAr/j;", "setFeedback", "(LAr/j;)V", "feedback", "Llo/k;", "R", "LXH/o;", "C0", "()Llo/k;", "viewModel", "S", "a", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DeliveryDetailsFragment extends c {

    /* renamed from: S  reason: collision with root package name */
    public static final a f94569S = new a((DefaultConstructorMarker) null);

    /* renamed from: T  reason: collision with root package name */
    public static final int f94570T = 8;

    /* renamed from: Q  reason: collision with root package name */
    public j f94571Q;

    /* renamed from: R  reason: collision with root package name */
    private final C16824o f94572R;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/ingka/ikea/checkout/impl/delivery/fragments/DeliveryDetailsFragment$a;", "", "<init>", "()V", "", "checkoutId", "deliveryId", "Lcom/ingka/ikea/checkout/impl/delivery/fragments/DeliveryDetailsFragment;", "a", "(Ljava/lang/String;Ljava/lang/String;)Lcom/ingka/ikea/checkout/impl/delivery/fragments/DeliveryDetailsFragment;", "TAG", "Ljava/lang/String;", "CHECKOUT_ID_KEY", "DELIVERY_ID_KEY", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final DeliveryDetailsFragment a(String str, String str2) {
            C17542s.j(str, "checkoutId");
            C17542s.j(str2, "deliveryId");
            DeliveryDetailsFragment deliveryDetailsFragment = new DeliveryDetailsFragment();
            deliveryDetailsFragment.setArguments(D2.d.b(C16796C.a("checkout_id_key", str), C16796C.a("delivery_id_key", str2)));
            return deliveryDetailsFragment;
        }

        private a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class b extends C17540p implements C17631a<C16807N> {
        b(Object obj) {
            super(0, obj, DeliveryDetailsFragment.class, "showError", "showError()V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            t();
            return C16807N.f139792a;
        }

        public final void t() {
            ((DeliveryDetailsFragment) this.receiver).D0();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class c extends C17540p implements C17631a<C16807N> {
        c(Object obj) {
            super(0, obj, DeliveryDetailsFragment.class, "dismiss", "dismiss()V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            t();
            return C16807N.f139792a;
        }

        public final void t() {
            ((DeliveryDetailsFragment) this.receiver).dismiss();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f94573c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C5187o oVar) {
            super(0);
            this.f94573c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f94573c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f94574c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C17631a aVar) {
            super(0);
            this.f94574c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f94574c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f94575c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C16824o oVar) {
            super(0);
            this.f94575c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f94575c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f94576c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f94577d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(C17631a aVar, C16824o oVar) {
            super(0);
            this.f94576c = aVar;
            this.f94577d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f94576c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f94577d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class h extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f94578c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f94579d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f94578c = oVar;
            this.f94579d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f94579d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f94578c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public DeliveryDetailsFragment() {
        C16824o a10 = C16825p.a(s.NONE, new e(new d(this)));
        this.f94572R = W.b(this, P.b(k.class), new f(a10), new g((C17631a) null, a10), new h(this, a10));
    }

    private final k C0() {
        return (k) this.f94572R.getValue();
    }

    /* access modifiers changed from: private */
    public final void D0() {
        j.a.j(B0(), getContext(), C11849b.f102203K0, Integer.valueOf(Oo.b.f84722n1), false, 0, (C17631a) null, (String) null, (C17631a) null, (C17631a) null, 504, (Object) null);
        dismiss();
    }

    /* access modifiers changed from: private */
    public static final C16807N z0(DeliveryDetailsFragment deliveryDetailsFragment) {
        FullscreenDialogFragment.a aVar = FullscreenDialogFragment.f94870N;
        String string = deliveryDetailsFragment.getString(Oo.b.f84700l1);
        String string2 = deliveryDetailsFragment.getString(C11849b.f102292f0);
        C17542s.i(string2, "getString(...)");
        FullscreenDialogFragment.a.b(aVar, string, (String) null, string2, 0, (FullscreenDialogFragment.b) null, 26, (Object) null).show(deliveryDetailsFragment.getParentFragmentManager(), "fullscreen_dialog");
        return C16807N.f139792a;
    }

    public final j B0() {
        j jVar = this.f94571Q;
        if (jVar != null) {
            return jVar;
        }
        C17542s.z("feedback");
        return null;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, lg.f.f75301m);
    }

    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(-1, -1);
            window.setWindowAnimations(lg.f.f75300l);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: nI.a} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void u0(U0.C4889m r10, int r11) {
        /*
            r9 = this;
            r0 = -481489623(0xffffffffe34d0d29, float:-3.7825308E21)
            r10.W(r0)
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0012
            r1 = -1
            java.lang.String r2 = "com.ingka.ikea.checkout.impl.delivery.fragments.DeliveryDetailsFragment.DialogContent (DeliveryDetailsFragment.kt:37)"
            U0.C4895p.S(r0, r11, r1, r2)
        L_0x0012:
            lo.k r3 = r9.C0()
            r11 = -745128326(0xffffffffd3963e7a, float:-1.29058655E12)
            r10.W(r11)
            boolean r11 = r10.F(r9)
            java.lang.Object r0 = r10.D()
            if (r11 != 0) goto L_0x002e
            U0.m$a r11 = U0.C4889m.f14007a
            java.lang.Object r11 = r11.a()
            if (r0 != r11) goto L_0x0036
        L_0x002e:
            com.ingka.ikea.checkout.impl.delivery.fragments.DeliveryDetailsFragment$b r0 = new com.ingka.ikea.checkout.impl.delivery.fragments.DeliveryDetailsFragment$b
            r0.<init>(r9)
            r10.u(r0)
        L_0x0036:
            uI.h r0 = (uI.C18059h) r0
            r10.P()
            r4 = r0
            nI.a r4 = (nI.C17631a) r4
            r11 = -745127176(0xffffffffd39642f8, float:-1.29073729E12)
            r10.W(r11)
            boolean r11 = r10.F(r9)
            java.lang.Object r0 = r10.D()
            if (r11 != 0) goto L_0x0056
            U0.m$a r11 = U0.C4889m.f14007a
            java.lang.Object r11 = r11.a()
            if (r0 != r11) goto L_0x005e
        L_0x0056:
            com.ingka.ikea.checkout.impl.delivery.fragments.DeliveryDetailsFragment$c r0 = new com.ingka.ikea.checkout.impl.delivery.fragments.DeliveryDetailsFragment$c
            r0.<init>(r9)
            r10.u(r0)
        L_0x005e:
            uI.h r0 = (uI.C18059h) r0
            r10.P()
            r5 = r0
            nI.a r5 = (nI.C17631a) r5
            r11 = -745125083(0xffffffffd3964b25, float:-1.29101162E12)
            r10.W(r11)
            boolean r11 = r10.F(r9)
            java.lang.Object r0 = r10.D()
            if (r11 != 0) goto L_0x007e
            U0.m$a r11 = U0.C4889m.f14007a
            java.lang.Object r11 = r11.a()
            if (r0 != r11) goto L_0x0086
        L_0x007e:
            io.e r0 = new io.e
            r0.<init>(r9)
            r10.u(r0)
        L_0x0086:
            r6 = r0
            nI.a r6 = (nI.C17631a) r6
            r10.P()
            r8 = 0
            r7 = r10
            go.O.e(r3, r4, r5, r6, r7, r8)
            boolean r11 = U0.C4895p.J()
            if (r11 == 0) goto L_0x009a
            U0.C4895p.R()
        L_0x009a:
            r10.P()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.checkout.impl.delivery.fragments.DeliveryDetailsFragment.u0(U0.m, int):void");
    }
}

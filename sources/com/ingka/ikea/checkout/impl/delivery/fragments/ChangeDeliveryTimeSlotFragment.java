package com.ingka.ikea.checkout.impl.delivery.fragments;

import Ar.j;
import HJ.C15854t;
import Nn.M;
import U0.C4889m;
import U0.C4895p;
import XH.C16796C;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import XH.t;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.s1;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.W;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.F;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import com.ingka.ikea.app.base.UserPostalCodeAddress;
import com.sugarcube.core.logger.DslKt;
import go.C11324h;
import io.C11408a;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import l3.a;
import lo.C11556a;
import nI.C17631a;
import nI.p;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;
import rv.C11849b;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0002-.B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\u0019\u0010\n\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0017\u0010\u0004R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010%\u001a\u00020 8\u0016XD¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001b\u0010+\u001a\u00020&8BX\u0002¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006/"}, d2 = {"Lcom/ingka/ikea/checkout/impl/delivery/fragments/ChangeDeliveryTimeSlotFragment;", "Lcom/ingka/ikea/core/android/fragments/BaseDialogFragment;", "", "<init>", "()V", "LXH/N;", "A0", "C0", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroidx/compose/ui/platform/ComposeView;", "z0", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onStart", "LAr/j;", "P", "LAr/j;", "y0", "()LAr/j;", "setFeedback", "(LAr/j;)V", "feedback", "", "Q", "Ljava/lang/String;", "getDestId", "()Ljava/lang/String;", "destId", "Llo/a;", "R", "LXH/o;", "x0", "()Llo/a;", "changeDeliveryTimeSlotViewModel", "S", "a", "b", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ChangeDeliveryTimeSlotFragment extends b {

    /* renamed from: S  reason: collision with root package name */
    public static final b f94553S = new b((DefaultConstructorMarker) null);

    /* renamed from: T  reason: collision with root package name */
    public static final int f94554T = 8;

    /* renamed from: P  reason: collision with root package name */
    public j f94555P;

    /* renamed from: Q  reason: collision with root package name */
    private final String f94556Q = "checkout/changeDeliveryTimeSlot?checkoutId={checkoutId}&deliveryId={deliveryId}";

    /* renamed from: R  reason: collision with root package name */
    private final C16824o f94557R;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0011J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u0013¨\u0006\u001f"}, d2 = {"Lcom/ingka/ikea/checkout/impl/delivery/fragments/ChangeDeliveryTimeSlotFragment$a;", "Landroid/os/Parcelable;", "", "LNn/M;", "availableTimeSlots", "", "timeWindowDescription", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Ljava/lang/String;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C2105a();

        /* renamed from: c  reason: collision with root package name */
        public static final int f94558c = 8;

        /* renamed from: a  reason: collision with root package name */
        private final List<M> f94559a;

        /* renamed from: b  reason: collision with root package name */
        private final String f94560b;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        /* renamed from: com.ingka.ikea.checkout.impl.delivery.fragments.ChangeDeliveryTimeSlotFragment$a$a  reason: collision with other inner class name */
        public static final class C2105a implements Parcelable.Creator<a> {
            /* renamed from: a */
            public final a createFromParcel(Parcel parcel) {
                C17542s.j(parcel, "parcel");
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i10 = 0; i10 != readInt; i10++) {
                    arrayList.add(parcel.readParcelable(a.class.getClassLoader()));
                }
                return new a(arrayList, parcel.readString());
            }

            /* renamed from: b */
            public final a[] newArray(int i10) {
                return new a[i10];
            }
        }

        public a(List<M> list, String str) {
            C17542s.j(list, "availableTimeSlots");
            this.f94559a = list;
            this.f94560b = str;
        }

        public final List<M> a() {
            return this.f94559a;
        }

        public final String b() {
            return this.f94560b;
        }

        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f94559a, aVar.f94559a) && C17542s.e(this.f94560b, aVar.f94560b);
        }

        public int hashCode() {
            int hashCode = this.f94559a.hashCode() * 31;
            String str = this.f94560b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            List<M> list = this.f94559a;
            String str = this.f94560b;
            return "AvailableTimeSlots(availableTimeSlots=" + list + ", timeWindowDescription=" + str + ")";
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C17542s.j(parcel, "dest");
            List<M> list = this.f94559a;
            parcel.writeInt(list.size());
            for (M writeParcelable : list) {
                parcel.writeParcelable(writeParcelable, i10);
            }
            parcel.writeString(this.f94560b);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0011\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/ingka/ikea/checkout/impl/delivery/fragments/ChangeDeliveryTimeSlotFragment$b;", "", "<init>", "()V", "", "checkoutId", "Lcom/ingka/ikea/app/base/UserPostalCodeAddress;", "postalCodeAddress", "deliveryArrangementId", "Lcom/ingka/ikea/checkout/impl/delivery/fragments/ChangeDeliveryTimeSlotFragment$a;", "timeWindowData", "Lcom/ingka/ikea/checkout/impl/delivery/fragments/ChangeDeliveryTimeSlotFragment;", "a", "(Ljava/lang/String;Lcom/ingka/ikea/app/base/UserPostalCodeAddress;Ljava/lang/String;Lcom/ingka/ikea/checkout/impl/delivery/fragments/ChangeDeliveryTimeSlotFragment$a;)Lcom/ingka/ikea/checkout/impl/delivery/fragments/ChangeDeliveryTimeSlotFragment;", "TAG", "Ljava/lang/String;", "POSTAL_CODE_ADDRESS", "TIME_WINDOW_DATA", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ChangeDeliveryTimeSlotFragment a(String str, UserPostalCodeAddress userPostalCodeAddress, String str2, a aVar) {
            C17542s.j(str, "checkoutId");
            C17542s.j(userPostalCodeAddress, "postalCodeAddress");
            C17542s.j(str2, "deliveryArrangementId");
            ChangeDeliveryTimeSlotFragment changeDeliveryTimeSlotFragment = new ChangeDeliveryTimeSlotFragment();
            changeDeliveryTimeSlotFragment.setArguments(D2.d.b(C16796C.a("checkoutId", str), C16796C.a("postal_code_address_id", userPostalCodeAddress), C16796C.a("deliveryId", str2), C16796C.a("time_window_data", aVar)));
            return changeDeliveryTimeSlotFragment;
        }

        private b() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c implements p<C4889m, Integer, C16807N> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ChangeDeliveryTimeSlotFragment f94561a;

        c(ChangeDeliveryTimeSlotFragment changeDeliveryTimeSlotFragment) {
            this.f94561a = changeDeliveryTimeSlotFragment;
        }

        /* access modifiers changed from: private */
        public static final C16807N c(ChangeDeliveryTimeSlotFragment changeDeliveryTimeSlotFragment) {
            changeDeliveryTimeSlotFragment.dismiss();
            return C16807N.f139792a;
        }

        public final void b(C4889m mVar, int i10) {
            if ((i10 & 3) != 2 || !mVar.l()) {
                if (C4895p.J()) {
                    C4895p.S(-18129210, i10, -1, "com.ingka.ikea.checkout.impl.delivery.fragments.ChangeDeliveryTimeSlotFragment.onCreateView.<anonymous>.<anonymous> (ChangeDeliveryTimeSlotFragment.kt:59)");
                }
                C11556a w02 = this.f94561a.x0();
                mVar.W(-1493520788);
                boolean F10 = mVar.F(this.f94561a);
                ChangeDeliveryTimeSlotFragment changeDeliveryTimeSlotFragment = this.f94561a;
                Object D10 = mVar.D();
                if (F10 || D10 == C4889m.f14007a.a()) {
                    D10 = new a(changeDeliveryTimeSlotFragment);
                    mVar.u(D10);
                }
                mVar.P();
                C11324h.b(w02, (C17631a) D10, mVar, 0);
                if (C4895p.J()) {
                    C4895p.R();
                    return;
                }
                return;
            }
            mVar.L();
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((C4889m) obj, ((Number) obj2).intValue());
            return C16807N.f139792a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f94562c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public d(C5187o oVar) {
            super(0);
            this.f94562c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f94562c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class e extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f94563c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public e(C17631a aVar) {
            super(0);
            this.f94563c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f94563c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class f extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f94564c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public f(C16824o oVar) {
            super(0);
            this.f94564c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f94564c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f94565c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f94566d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(C17631a aVar, C16824o oVar) {
            super(0);
            this.f94565c = aVar;
            this.f94566d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f94565c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f94566d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class h extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f94567c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f94568d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f94567c = oVar;
            this.f94568d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f94568d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f94567c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public ChangeDeliveryTimeSlotFragment() {
        C16824o a10 = C16825p.a(s.NONE, new e(new d(this)));
        this.f94557R = W.b(this, P.b(C11556a.class), new f(a10), new g((C17631a) null, a10), new h(this, a10));
    }

    private final void A0() {
        F<C11556a.C2264a> M10 = x0().M();
        C5221y viewLifecycleOwner = getViewLifecycleOwner();
        C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        ip.j.a(M10, viewLifecycleOwner, new C11408a(this));
    }

    /* access modifiers changed from: private */
    public static final C16807N B0(ChangeDeliveryTimeSlotFragment changeDeliveryTimeSlotFragment, C11556a.C2264a aVar) {
        C17542s.j(aVar, "it");
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
                String a10 = C11818a.a("Action received: " + aVar, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = changeDeliveryTimeSlotFragment.getClass().getName();
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
        if (C17542s.e(aVar, C11556a.C2264a.C2265a.f99265a)) {
            changeDeliveryTimeSlotFragment.C0();
        } else if (C17542s.e(aVar, C11556a.C2264a.b.f99266a)) {
            changeDeliveryTimeSlotFragment.dismiss();
        } else if (C17542s.e(aVar, C11556a.C2264a.c.f99267a)) {
            changeDeliveryTimeSlotFragment.dismiss();
        } else {
            throw new t();
        }
        return C16807N.f139792a;
    }

    private final void C0() {
        j.a.j(y0(), getContext(), C11849b.f102203K0, Integer.valueOf(Oo.b.f84722n1), false, 0, new io.b(this), (String) null, (C17631a) null, (C17631a) null, 464, (Object) null);
    }

    /* access modifiers changed from: private */
    public static final C16807N D0(ChangeDeliveryTimeSlotFragment changeDeliveryTimeSlotFragment) {
        changeDeliveryTimeSlotFragment.dismiss();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public final C11556a x0() {
        return (C11556a) this.f94557R.getValue();
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
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        C17542s.j(view, "view");
        super.onViewCreated(view, bundle);
        A0();
    }

    public final j y0() {
        j jVar = this.f94555P;
        if (jVar != null) {
            return jVar;
        }
        C17542s.z("feedback");
        return null;
    }

    /* renamed from: z0 */
    public ComposeView onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C17542s.j(layoutInflater, "inflater");
        Context requireContext = requireContext();
        C17542s.i(requireContext, "requireContext(...)");
        ComposeView composeView = new ComposeView(requireContext, (AttributeSet) null, 0, 6, (DefaultConstructorMarker) null);
        composeView.setViewCompositionStrategy(s1.d.f19581b);
        TC.e.l(composeView, false, c1.c.c(-18129210, true, new c(this)), 1, (Object) null);
        return composeView;
    }
}

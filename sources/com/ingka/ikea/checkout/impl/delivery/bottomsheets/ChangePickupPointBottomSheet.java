package com.ingka.ikea.checkout.impl.delivery.bottomsheets;

import Do.m;
import HJ.C15854t;
import Nn.C10811n;
import Nn.C10813p;
import Nn.G;
import Nn.Q;
import Nn.u;
import XH.C16796C;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.s;
import XH.t;
import YH.C16877v;
import android.content.Context;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C5187o;
import androidx.fragment.app.C5197z;
import androidx.fragment.app.W;
import androidx.lifecycle.C5212o;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.F;
import androidx.lifecycle.i0;
import androidx.lifecycle.j0;
import androidx.lifecycle.k0;
import com.ingka.ikea.app.base.UserPostalCodeAddress;
import com.ingka.ikea.checkout.impl.delivery.PickupPointDetailsActivity;
import com.ingka.ikea.checkout.impl.delivery.bottomsheets.f;
import com.ingka.ikea.ui.bottomsheetdialog.BottomSheetComposeDialogFragment;
import com.sugarcube.core.logger.DslKt;
import g.C5312a;
import g.C5314c;
import go.U;
import h.C5406d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17540p;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.C17544u;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import l3.a;
import lo.f;
import lo.w;
import nI.C17631a;
import nI.C17642l;
import qv.C11818a;
import qv.C11819b;
import qv.C11820c;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \u00152\u00020\u0001:\u0002;<B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000b\u0010\u0003J\u000f\u0010\f\u001a\u00020\u0006H\u0015¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u0003J\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u00128\u0014XD¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00188\u0006@\u0006X.¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010'\u001a\u00020 8\u0006@\u0006X.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020(8\u0002XD¢\u0006\u0006\n\u0004\b\u0014\u0010)R\u001b\u00100\u001a\u00020+8BX\u0002¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\"\u00106\u001a\u0010\u0012\f\u0012\n 3*\u0004\u0018\u00010202018\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078BX\u0004¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006="}, d2 = {"Lcom/ingka/ikea/checkout/impl/delivery/bottomsheets/ChangePickupPointBottomSheet;", "Lcom/ingka/ikea/ui/bottomsheetdialog/BottomSheetComposeDialogFragment;", "<init>", "()V", "LNn/G;", "pickupPoint", "LXH/N;", "T0", "(LNn/G;)V", "U0", "V0", "B0", "u0", "(LU0/m;I)V", "onResume", "Lcom/ingka/ikea/ui/bottomsheetdialog/BottomSheetComposeDialogFragment$a;", "D0", "()Lcom/ingka/ikea/ui/bottomsheetdialog/BottomSheetComposeDialogFragment$a;", "", "U", "Z", "A0", "()Z", "skipPartiallyExpanded", "LWn/b;", "X", "LWn/b;", "P0", "()LWn/b;", "setCheckoutAnalytics", "(LWn/b;)V", "checkoutAnalytics", "LAe/e;", "Y", "LAe/e;", "N0", "()LAe/e;", "setAnalytics", "(LAe/e;)V", "analytics", "", "Ljava/lang/String;", "viewName", "Llo/f;", "y0", "LXH/o;", "O0", "()Llo/f;", "changePickupPointViewModel", "Lg/c;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "z0", "Lg/c;", "launchPupDetailsActivity", "Lcom/ingka/ikea/app/base/UserPostalCodeAddress;", "Q0", "()Lcom/ingka/ikea/app/base/UserPostalCodeAddress;", "postalCodeAddress", "d", "e", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ChangePickupPointBottomSheet extends b {

    /* renamed from: A0  reason: collision with root package name */
    public static final d f94470A0 = new d((DefaultConstructorMarker) null);

    /* renamed from: B0  reason: collision with root package name */
    public static final int f94471B0 = 8;

    /* renamed from: U  reason: collision with root package name */
    private final boolean f94472U;

    /* renamed from: X  reason: collision with root package name */
    public Wn.b f94473X;

    /* renamed from: Y  reason: collision with root package name */
    public Ae.e f94474Y;

    /* renamed from: Z  reason: collision with root package name */
    private final String f94475Z = "ChangePickupPoint";

    /* renamed from: y0  reason: collision with root package name */
    private final C16824o f94476y0;

    /* renamed from: z0  reason: collision with root package name */
    private final C5314c<Intent> f94477z0;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class a extends C17540p implements C17642l<G, C16807N> {
        a(Object obj) {
            super(1, obj, ChangePickupPointBottomSheet.class, "onPickupPointClicked", "onPickupPointClicked(Lcom/ingka/ikea/checkout/datalayer/PickUpPointHolder;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            t((G) obj);
            return C16807N.f139792a;
        }

        public final void t(G g10) {
            C17542s.j(g10, "p0");
            ((ChangePickupPointBottomSheet) this.receiver).U0(g10);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class b extends C17540p implements C17642l<G, C16807N> {
        b(Object obj) {
            super(1, obj, ChangePickupPointBottomSheet.class, "onPickupDetailsClicked", "onPickupDetailsClicked(Lcom/ingka/ikea/checkout/datalayer/PickUpPointHolder;)V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            t((G) obj);
            return C16807N.f139792a;
        }

        public final void t(G g10) {
            C17542s.j(g10, "p0");
            ((ChangePickupPointBottomSheet) this.receiver).T0(g10);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class c extends C17540p implements C17631a<C16807N> {
        c(Object obj) {
            super(0, obj, ChangePickupPointBottomSheet.class, "dismiss", "dismiss()V", 0);
        }

        public /* bridge */ /* synthetic */ Object invoke() {
            t();
            return C16807N.f139792a;
        }

        public final void t() {
            ((ChangePickupPointBottomSheet) this.receiver).dismiss();
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JC\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0019\u0010\u0014R\u0014\u0010\u001a\u001a\u00020\u00048\u0006XT¢\u0006\u0006\n\u0004\b\u001a\u0010\u0014¨\u0006\u001b"}, d2 = {"Lcom/ingka/ikea/checkout/impl/delivery/bottomsheets/ChangePickupPointBottomSheet$d;", "", "<init>", "()V", "", "checkoutId", "Lcom/ingka/ikea/app/base/UserPostalCodeAddress;", "postalCodeAddress", "", "showDeliveryPriceExclVat", "showSelected", "", "deliveryPartIndex", "", "Lcom/ingka/ikea/checkout/impl/delivery/bottomsheets/ChangePickupPointBottomSheet$e;", "pickUpPointDeliveries", "Lcom/ingka/ikea/checkout/impl/delivery/bottomsheets/ChangePickupPointBottomSheet;", "a", "(Ljava/lang/String;Lcom/ingka/ikea/app/base/UserPostalCodeAddress;ZZILjava/util/List;)Lcom/ingka/ikea/checkout/impl/delivery/bottomsheets/ChangePickupPointBottomSheet;", "TAG", "Ljava/lang/String;", "SHOW_DELIVERY_PRICE_EXCL_VAT", "CHECKOUT_ID", "SHOW_SELECTED", "PICKUP_POINT_DELIVERIES", "POSTAL_CODE_ADDRESS", "DELIVERY_PART", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d {
        public /* synthetic */ d(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ChangePickupPointBottomSheet a(String str, UserPostalCodeAddress userPostalCodeAddress, boolean z10, boolean z11, int i10, List<e> list) {
            C17542s.j(str, "checkoutId");
            C17542s.j(userPostalCodeAddress, "postalCodeAddress");
            C17542s.j(list, "pickUpPointDeliveries");
            ChangePickupPointBottomSheet changePickupPointBottomSheet = new ChangePickupPointBottomSheet();
            changePickupPointBottomSheet.setArguments(D2.d.b(C16796C.a("checkout_id_key", str), C16796C.a("postal_code_address_id", userPostalCodeAddress), C16796C.a("show_delivery_price_excl_vat_id", Boolean.valueOf(z10)), C16796C.a("show_selected_id", Boolean.valueOf(z11)), C16796C.a("pickup_point_deliveries_id", new ArrayList(list)), C16796C.a("delivery_part_id", Integer.valueOf(i10))));
            return changePickupPointBottomSheet;
        }

        private d() {
        }
    }

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001aJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u001cR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b#\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b%\u0010'\u001a\u0004\b(\u0010)R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b(\u0010.\u001a\u0004\b&\u0010/R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b0\u00102R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b,\u00103\u001a\u0004\b*\u00104¨\u00065"}, d2 = {"Lcom/ingka/ikea/checkout/impl/delivery/bottomsheets/ChangePickupPointBottomSheet$e;", "Landroid/os/Parcelable;", "", "deliveryServiceId", "deliveryId", "LNn/G;", "pickUpPoint", "", "LNn/Q;", "unavailableItems", "LNn/n;", "deliveryPrice", "LNn/u;", "serviceType", "LNn/p;", "deliveryServiceType", "<init>", "(Ljava/lang/String;Ljava/lang/String;LNn/G;Ljava/util/List;LNn/n;LNn/u;LNn/p;)V", "Landroid/os/Parcel;", "dest", "", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "LNn/G;", "e", "()LNn/G;", "d", "Ljava/util/List;", "g", "()Ljava/util/List;", "LNn/n;", "()LNn/n;", "f", "LNn/u;", "()LNn/u;", "LNn/p;", "()LNn/p;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: h  reason: collision with root package name */
        public static final int f94478h = 8;

        /* renamed from: a  reason: collision with root package name */
        private final String f94479a;

        /* renamed from: b  reason: collision with root package name */
        private final String f94480b;

        /* renamed from: c  reason: collision with root package name */
        private final G f94481c;

        /* renamed from: d  reason: collision with root package name */
        private final List<Q> f94482d;

        /* renamed from: e  reason: collision with root package name */
        private final C10811n f94483e;

        /* renamed from: f  reason: collision with root package name */
        private final u f94484f;

        /* renamed from: g  reason: collision with root package name */
        private final C10813p f94485g;

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<e> {
            /* renamed from: a */
            public final e createFromParcel(Parcel parcel) {
                C17542s.j(parcel, "parcel");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                Class<e> cls = e.class;
                G g10 = (G) parcel.readParcelable(cls.getClassLoader());
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                for (int i10 = 0; i10 != readInt; i10++) {
                    arrayList.add(parcel.readParcelable(cls.getClassLoader()));
                }
                return new e(readString, readString2, g10, arrayList, (C10811n) parcel.readParcelable(cls.getClassLoader()), u.valueOf(parcel.readString()), C10813p.valueOf(parcel.readString()));
            }

            /* renamed from: b */
            public final e[] newArray(int i10) {
                return new e[i10];
            }
        }

        public e(String str, String str2, G g10, List<Q> list, C10811n nVar, u uVar, C10813p pVar) {
            C17542s.j(str, "deliveryServiceId");
            C17542s.j(str2, "deliveryId");
            C17542s.j(g10, "pickUpPoint");
            C17542s.j(list, "unavailableItems");
            C17542s.j(uVar, "serviceType");
            C17542s.j(pVar, "deliveryServiceType");
            this.f94479a = str;
            this.f94480b = str2;
            this.f94481c = g10;
            this.f94482d = list;
            this.f94483e = nVar;
            this.f94484f = uVar;
            this.f94485g = pVar;
        }

        public final String a() {
            return this.f94480b;
        }

        public final C10811n b() {
            return this.f94483e;
        }

        public final String c() {
            return this.f94479a;
        }

        public final C10813p d() {
            return this.f94485g;
        }

        public final int describeContents() {
            return 0;
        }

        public final G e() {
            return this.f94481c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return C17542s.e(this.f94479a, eVar.f94479a) && C17542s.e(this.f94480b, eVar.f94480b) && C17542s.e(this.f94481c, eVar.f94481c) && C17542s.e(this.f94482d, eVar.f94482d) && C17542s.e(this.f94483e, eVar.f94483e) && this.f94484f == eVar.f94484f && this.f94485g == eVar.f94485g;
        }

        public final u f() {
            return this.f94484f;
        }

        public final List<Q> g() {
            return this.f94482d;
        }

        public int hashCode() {
            int hashCode = ((((((this.f94479a.hashCode() * 31) + this.f94480b.hashCode()) * 31) + this.f94481c.hashCode()) * 31) + this.f94482d.hashCode()) * 31;
            C10811n nVar = this.f94483e;
            return ((((hashCode + (nVar == null ? 0 : nVar.hashCode())) * 31) + this.f94484f.hashCode()) * 31) + this.f94485g.hashCode();
        }

        public String toString() {
            String str = this.f94479a;
            String str2 = this.f94480b;
            G g10 = this.f94481c;
            List<Q> list = this.f94482d;
            C10811n nVar = this.f94483e;
            u uVar = this.f94484f;
            C10813p pVar = this.f94485g;
            return "PickUpPointDelivery(deliveryServiceId=" + str + ", deliveryId=" + str2 + ", pickUpPoint=" + g10 + ", unavailableItems=" + list + ", deliveryPrice=" + nVar + ", serviceType=" + uVar + ", deliveryServiceType=" + pVar + ")";
        }

        public final void writeToParcel(Parcel parcel, int i10) {
            C17542s.j(parcel, "dest");
            parcel.writeString(this.f94479a);
            parcel.writeString(this.f94480b);
            parcel.writeParcelable(this.f94481c, i10);
            List<Q> list = this.f94482d;
            parcel.writeInt(list.size());
            for (Q writeParcelable : list) {
                parcel.writeParcelable(writeParcelable, i10);
            }
            parcel.writeParcelable(this.f94483e, i10);
            parcel.writeString(this.f94484f.name());
            parcel.writeString(this.f94485g.name());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class f {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f94486a;

        /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|7|9) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        static {
            /*
                Nn.G$b[] r0 = Nn.G.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                Nn.G$b r1 = Nn.G.b.YES     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                Nn.G$b r1 = Nn.G.b.UNCERTAIN     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                Nn.G$b r1 = Nn.G.b.NO     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                f94486a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.checkout.impl.delivery.bottomsheets.ChangePickupPointBottomSheet.f.<clinit>():void");
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/fragment/app/o;", "b", "()Landroidx/fragment/app/o;"}, k = 3, mv = {2, 1, 0})
    public static final class g extends C17544u implements C17631a<C5187o> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f94487c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(C5187o oVar) {
            super(0);
            this.f94487c = oVar;
        }

        /* renamed from: b */
        public final C5187o invoke() {
            return this.f94487c;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/k0;", "b", "()Landroidx/lifecycle/k0;"}, k = 3, mv = {2, 1, 0})
    public static final class h extends C17544u implements C17631a<k0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f94488c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public h(C17631a aVar) {
            super(0);
            this.f94488c = aVar;
        }

        /* renamed from: b */
        public final k0 invoke() {
            return (k0) this.f94488c.invoke();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/j0;", "b", "()Landroidx/lifecycle/j0;"}, k = 3, mv = {2, 1, 0})
    public static final class i extends C17544u implements C17631a<j0> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C16824o f94489c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public i(C16824o oVar) {
            super(0);
            this.f94489c = oVar;
        }

        /* renamed from: b */
        public final j0 invoke() {
            return W.d(this.f94489c).getViewModelStore();
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Ll3/a;", "b", "()Ll3/a;"}, k = 3, mv = {2, 1, 0})
    public static final class j extends C17544u implements C17631a<l3.a> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C17631a f94490c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f94491d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public j(C17631a aVar, C16824o oVar) {
            super(0);
            this.f94490c = aVar;
            this.f94491d = oVar;
        }

        /* renamed from: b */
        public final l3.a invoke() {
            l3.a aVar;
            C17631a aVar2 = this.f94490c;
            if (aVar2 != null && (aVar = (l3.a) aVar2.invoke()) != null) {
                return aVar;
            }
            k0 a10 = W.d(this.f94491d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return oVar != null ? oVar.getDefaultViewModelCreationExtras() : a.C0407a.f25486b;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/f0;", "VM", "Landroidx/lifecycle/i0$c;", "b", "()Landroidx/lifecycle/i0$c;"}, k = 3, mv = {2, 1, 0})
    public static final class k extends C17544u implements C17631a<i0.c> {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ C5187o f94492c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ C16824o f94493d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public k(C5187o oVar, C16824o oVar2) {
            super(0);
            this.f94492c = oVar;
            this.f94493d = oVar2;
        }

        /* renamed from: b */
        public final i0.c invoke() {
            i0.c defaultViewModelProviderFactory;
            k0 a10 = W.d(this.f94493d);
            C5212o oVar = a10 instanceof C5212o ? (C5212o) a10 : null;
            return (oVar == null || (defaultViewModelProviderFactory = oVar.getDefaultViewModelProviderFactory()) == null) ? this.f94492c.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public ChangePickupPointBottomSheet() {
        C16824o a10 = C16825p.a(s.NONE, new h(new g(this)));
        this.f94476y0 = W.b(this, P.b(lo.f.class), new i(a10), new j((C17631a) null, a10), new k(this, a10));
        C5314c<Intent> registerForActivityResult = registerForActivityResult(new C5406d(), new fo.e(this));
        C17542s.i(registerForActivityResult, "registerForActivityResult(...)");
        this.f94477z0 = registerForActivityResult;
    }

    /* access modifiers changed from: private */
    public static final C16807N K0(ChangePickupPointBottomSheet changePickupPointBottomSheet, List list) {
        C17542s.j(list, "pickUpPoints");
        C5314c<Intent> cVar = changePickupPointBottomSheet.f94477z0;
        PickupPointDetailsActivity.a aVar = PickupPointDetailsActivity.f94449M;
        Context requireContext = changePickupPointBottomSheet.requireContext();
        C17542s.i(requireContext, "requireContext(...)");
        Iterable<U> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (U j10 : iterable) {
            arrayList.add(lo.s.f99429h.a(j10.j()));
        }
        cVar.a(aVar.a(requireContext, new ArrayList(arrayList), true));
        changePickupPointBottomSheet.P0().H();
        return C16807N.f139792a;
    }

    private final lo.f O0() {
        return (lo.f) this.f94476y0.getValue();
    }

    private final UserPostalCodeAddress Q0() {
        Parcelable parcelable = requireArguments().getParcelable("postal_code_address_id");
        if (parcelable != null) {
            return (UserPostalCodeAddress) parcelable;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    /* access modifiers changed from: private */
    public static final C16807N R0(ChangePickupPointBottomSheet changePickupPointBottomSheet, w wVar) {
        C17542s.j(wVar, "pickupPointSelected");
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
                String a10 = C11818a.a("Saved pickup point successful", (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str = C11820c.a(a10);
            }
            String str3 = str;
            if (str2 == null) {
                String name = changePickupPointBottomSheet.getClass().getName();
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
        if (C17542s.e(wVar, w.a.f99450a)) {
            C5197z.c(changePickupPointBottomSheet, "ChangePickupPointBottomSheetRequestKey", D2.d.b(C16796C.a("ChangePickupPointBottomSheetBundleKey", f.b.f94540a)));
        } else if (wVar instanceof w.b) {
            w.b bVar2 = (w.b) wVar;
            C5197z.c(changePickupPointBottomSheet, "ChangePickupPointBottomSheetRequestKey", D2.d.b(C16796C.a("ChangePickupPointBottomSheetBundleKey", new f.a(bVar2.b(), bVar2.c(), bVar2.a()))));
        } else {
            throw new t();
        }
        changePickupPointBottomSheet.dismissAllowingStateLoss();
        return C16807N.f139792a;
    }

    /* access modifiers changed from: private */
    public static final void S0(ChangePickupPointBottomSheet changePickupPointBottomSheet, C5312a aVar) {
        String str;
        e G10;
        C17542s.j(aVar, "result");
        int b10 = aVar.b();
        qv.e eVar = qv.e.DEBUG;
        ArrayList arrayList = new ArrayList();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        Iterator it = arrayList.iterator();
        String str2 = null;
        String str3 = null;
        while (true) {
            boolean hasNext = it.hasNext();
            str = DslKt.INDICATOR_BACKGROUND;
            if (!hasNext) {
                break;
            }
            C11819b bVar = (C11819b) it.next();
            if (str2 == null) {
                String a10 = C11818a.a("PUP details activity result, resultCode: " + b10, (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str2 = C11820c.a(a10);
            }
            String str4 = str2;
            if (str3 == null) {
                String name = changePickupPointBottomSheet.getClass().getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                if (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true)) {
                    str = DslKt.INDICATOR_MAIN;
                }
                str3 = str + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str5 = str3;
            bVar.a(eVar, str5, false, (Throwable) null, str4);
            str2 = str4;
            str3 = str5;
        }
        if (b10 == -1) {
            Intent a11 = aVar.a();
            String stringExtra = a11 != null ? a11.getStringExtra("result_selected_id_key") : null;
            G e10 = (stringExtra == null || (G10 = changePickupPointBottomSheet.O0().G(stringExtra)) == null) ? null : G10.e();
            if (e10 != null) {
                qv.e eVar2 = qv.e.DEBUG;
                ArrayList<C11819b> arrayList2 = new ArrayList<>();
                for (Object next2 : qv.d.f102012a.a()) {
                    if (((C11819b) next2).b(eVar2, false)) {
                        arrayList2.add(next2);
                    }
                }
                String str6 = null;
                String str7 = null;
                for (C11819b bVar2 : arrayList2) {
                    if (str6 == null) {
                        String a12 = C11818a.a("Selected pup returned from activity: " + stringExtra, (Throwable) null);
                        if (a12 == null) {
                            break;
                        }
                        str6 = C11820c.a(a12);
                    }
                    if (str7 == null) {
                        String name2 = changePickupPointBottomSheet.getClass().getName();
                        C17542s.g(name2);
                        String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                        if (o13.length() != 0) {
                            name2 = C15854t.P0(o13, "Kt");
                        }
                        str7 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name2;
                    }
                    bVar2.a(eVar2, str7, false, (Throwable) null, str6);
                }
                changePickupPointBottomSheet.U0(e10);
                changePickupPointBottomSheet.P0().r(Wn.s.MAP);
                return;
            }
            ChangePickupPointBottomSheet changePickupPointBottomSheet2 = changePickupPointBottomSheet;
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Selected pup not found, id: " + stringExtra);
            qv.e eVar3 = qv.e.ERROR;
            ArrayList<C11819b> arrayList3 = new ArrayList<>();
            for (Object next3 : qv.d.f102012a.a()) {
                if (((C11819b) next3).b(eVar3, false)) {
                    arrayList3.add(next3);
                }
            }
            String str8 = null;
            String str9 = null;
            for (C11819b bVar3 : arrayList3) {
                if (str8 == null) {
                    String a13 = C11818a.a((String) null, illegalArgumentException);
                    if (a13 != null) {
                        str8 = C11820c.a(a13);
                    } else {
                        return;
                    }
                }
                if (str9 == null) {
                    String name3 = changePickupPointBottomSheet.getClass().getName();
                    C17542s.g(name3);
                    String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o14.length() != 0) {
                        name3 = C15854t.P0(o14, "Kt");
                    }
                    str9 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name3;
                }
                bVar3.a(eVar3, str9, false, illegalArgumentException, str8);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void T0(G g10) {
        Iterable<U> c10 = O0().m().getValue().c();
        if (!(c10 instanceof Collection) || !((Collection) c10).isEmpty()) {
            for (U h10 : c10) {
                if (h10.h()) {
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
                            String a10 = C11818a.a("Don't start pickup details when loading", (Throwable) null);
                            if (a10 != null) {
                                str = C11820c.a(a10);
                            } else {
                                return;
                            }
                        }
                        String str3 = str;
                        if (str2 == null) {
                            String name = ChangePickupPointBottomSheet.class.getName();
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
                    return;
                }
            }
        }
        PickupPointDetailsActivity.a aVar = PickupPointDetailsActivity.f94449M;
        Context requireContext = requireContext();
        C17542s.i(requireContext, "requireContext(...)");
        this.f94477z0.a(aVar.a(requireContext, C16877v.h(lo.s.f99429h.a(g10)), true));
    }

    /* access modifiers changed from: private */
    public final void U0(G g10) {
        O0().N(new f.a.b(g10.g()));
        V0(g10);
    }

    private final void V0(G g10) {
        String str;
        char c10;
        Class<ChangePickupPointBottomSheet> cls;
        boolean z10;
        qv.e eVar = qv.e.DEBUG;
        ArrayList arrayList = new ArrayList();
        for (Object next : qv.d.f102012a.a()) {
            if (((C11819b) next).b(eVar, false)) {
                arrayList.add(next);
            }
        }
        Iterator it = arrayList.iterator();
        String str2 = null;
        String str3 = null;
        while (true) {
            boolean hasNext = it.hasNext();
            str = DslKt.INDICATOR_BACKGROUND;
            c10 = '$';
            cls = ChangePickupPointBottomSheet.class;
            if (!hasNext) {
                break;
            }
            C11819b bVar = (C11819b) it.next();
            if (str2 == null) {
                String a10 = C11818a.a("savePickupPoint: " + g10.e(), (Throwable) null);
                if (a10 == null) {
                    break;
                }
                str2 = C11820c.a(a10);
            }
            String str4 = str2;
            if (str3 == null) {
                String name = cls.getName();
                C17542s.g(name);
                String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o12.length() != 0) {
                    name = C15854t.P0(o12, "Kt");
                }
                if (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true)) {
                    str = DslKt.INDICATOR_MAIN;
                }
                str3 = str + DslKt.INDICATOR_SEPARATOR + name;
            }
            String str5 = str3;
            bVar.a(eVar, str5, false, (Throwable) null, str4);
            str2 = str4;
            str3 = str5;
        }
        e G10 = O0().G(g10.g());
        if (G10 == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Unknown pickup selected");
            qv.e eVar2 = qv.e.ERROR;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            for (Object next2 : qv.d.f102012a.a()) {
                if (((C11819b) next2).b(eVar2, false)) {
                    arrayList2.add(next2);
                }
            }
            String str6 = null;
            String str7 = null;
            for (C11819b bVar2 : arrayList2) {
                if (str6 == null) {
                    String a11 = C11818a.a((String) null, illegalStateException);
                    if (a11 != null) {
                        str6 = C11820c.a(a11);
                    } else {
                        return;
                    }
                }
                if (str7 == null) {
                    String name2 = cls.getName();
                    C17542s.g(name2);
                    String o13 = C15854t.o1(C15854t.s1(name2, c10, (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o13.length() != 0) {
                        name2 = C15854t.P0(o13, "Kt");
                    }
                    str7 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name2;
                }
                bVar2.a(eVar2, str7, false, illegalStateException, str6);
                c10 = '$';
            }
            return;
        }
        List<Q> g11 = G10.g();
        qv.e eVar3 = qv.e.DEBUG;
        ArrayList<C11819b> arrayList3 = new ArrayList<>();
        for (Object next3 : qv.d.f102012a.a()) {
            if (((C11819b) next3).b(eVar3, false)) {
                arrayList3.add(next3);
            }
        }
        String str8 = null;
        String str9 = null;
        for (C11819b bVar3 : arrayList3) {
            if (str8 == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Pickup point saved, has unavailable items: ");
                sb2.append(!g11.isEmpty());
                String a12 = C11818a.a(sb2.toString(), (Throwable) null);
                if (a12 == null) {
                    break;
                }
                str8 = C11820c.a(a12);
            }
            if (str9 == null) {
                String name3 = cls.getName();
                C17542s.g(name3);
                String o14 = C15854t.o1(C15854t.s1(name3, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                if (o14.length() != 0) {
                    name3 = C15854t.P0(o14, "Kt");
                }
                str9 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name3;
            }
            bVar3.a(eVar3, str9, false, (Throwable) null, str8);
        }
        if (!g11.isEmpty()) {
            int i10 = f.f94486a[g10.i().ordinal()];
            if (i10 == 1 || i10 == 2) {
                z10 = true;
            } else if (i10 == 3) {
                z10 = false;
            } else {
                throw new t();
            }
            C5197z.c(this, "ChangePickupPointBottomSheetRequestKey", D2.d.b(C16796C.a("ChangePickupPointBottomSheetBundleKey", new f.c(z10, g11, new m.c(g10.d()), G10.d(), G10.f()))));
            dismiss();
            return;
        }
        O0().O(G10, Q0());
    }

    /* access modifiers changed from: protected */
    public boolean A0() {
        return this.f94472U;
    }

    /* access modifiers changed from: protected */
    public void B0() {
        String str;
        super.B0();
        String string = requireArguments().getString("checkout_id_key");
        ArrayList parcelableArrayList = requireArguments().getParcelableArrayList("pickup_point_deliveries_id");
        String str2 = DslKt.INDICATOR_BACKGROUND;
        Class<ChangePickupPointBottomSheet> cls = ChangePickupPointBottomSheet.class;
        int i10 = 2;
        if (string == null || string.length() == 0) {
            String str3 = str2;
            IllegalStateException illegalStateException = new IllegalStateException("No checkoutId provided");
            qv.e eVar = qv.e.ERROR;
            ArrayList<C11819b> arrayList = new ArrayList<>();
            for (Object next : qv.d.f102012a.a()) {
                if (((C11819b) next).b(eVar, false)) {
                    arrayList.add(next);
                }
            }
            String str4 = null;
            String str5 = null;
            for (C11819b bVar : arrayList) {
                if (str4 == null) {
                    String a10 = C11818a.a((String) null, illegalStateException);
                    if (a10 == null) {
                        break;
                    }
                    str4 = C11820c.a(a10);
                }
                if (str5 == null) {
                    String name = cls.getName();
                    C17542s.g(name);
                    String o12 = C15854t.o1(C15854t.s1(name, '$', (String) null, i10, (Object) null), '.', (String) null, i10, (Object) null);
                    if (o12.length() != 0) {
                        name = C15854t.P0(o12, "Kt");
                    }
                    str5 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str3) + DslKt.INDICATOR_SEPARATOR + name;
                }
                bVar.a(eVar, str5, false, illegalStateException, str4);
                i10 = 2;
            }
            dismiss();
        } else if (parcelableArrayList == null || parcelableArrayList.isEmpty()) {
            IllegalStateException illegalStateException2 = new IllegalStateException("Pickup points are null");
            qv.e eVar2 = qv.e.ERROR;
            ArrayList<C11819b> arrayList2 = new ArrayList<>();
            for (Object next2 : qv.d.f102012a.a()) {
                if (((C11819b) next2).b(eVar2, false)) {
                    arrayList2.add(next2);
                }
            }
            String str6 = null;
            String str7 = null;
            for (C11819b bVar2 : arrayList2) {
                if (str6 == null) {
                    String a11 = C11818a.a((String) null, illegalStateException2);
                    if (a11 == null) {
                        break;
                    }
                    str6 = C11820c.a(a11);
                }
                if (str7 == null) {
                    String name2 = cls.getName();
                    C17542s.g(name2);
                    str = str2;
                    String o13 = C15854t.o1(C15854t.s1(name2, '$', (String) null, 2, (Object) null), '.', (String) null, 2, (Object) null);
                    if (o13.length() != 0) {
                        name2 = C15854t.P0(o13, "Kt");
                    }
                    str7 = (C15854t.b0(Thread.currentThread().getName(), DslKt.MAIN_THREAD_NAME, true) ? DslKt.INDICATOR_MAIN : str) + DslKt.INDICATOR_SEPARATOR + name2;
                } else {
                    str = str2;
                }
                String str8 = str7;
                bVar2.a(eVar2, str8, false, illegalStateException2, str6);
                str7 = str8;
                str2 = str;
            }
            dismiss();
        } else {
            O0().L(parcelableArrayList);
            F<w> I10 = O0().I();
            C5221y viewLifecycleOwner = getViewLifecycleOwner();
            C17542s.i(viewLifecycleOwner, "getViewLifecycleOwner(...)");
            ip.j.a(I10, viewLifecycleOwner, new fo.f(this));
        }
    }

    /* access modifiers changed from: protected */
    public BottomSheetComposeDialogFragment.a D0() {
        return null;
    }

    public final Ae.e N0() {
        Ae.e eVar = this.f94474Y;
        if (eVar != null) {
            return eVar;
        }
        C17542s.z("analytics");
        return null;
    }

    public final Wn.b P0() {
        Wn.b bVar = this.f94473X;
        if (bVar != null) {
            return bVar;
        }
        C17542s.z("checkoutAnalytics");
        return null;
    }

    public void onResume() {
        super.onResume();
        N0().e(getActivity(), this.f94475Z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: nI.l} */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void u0(U0.C4889m r11, int r12) {
        /*
            r10 = this;
            r0 = -196740725(0xfffffffff445f98b, float:-6.274071E31)
            r11.W(r0)
            boolean r1 = U0.C4895p.J()
            if (r1 == 0) goto L_0x0012
            r1 = -1
            java.lang.String r2 = "com.ingka.ikea.checkout.impl.delivery.bottomsheets.ChangePickupPointBottomSheet.BottomSheetContent (ChangePickupPointBottomSheet.kt:146)"
            U0.C4895p.S(r0, r12, r1, r2)
        L_0x0012:
            lo.f r3 = r10.O0()
            r12 = -15751727(0xffffffffff0fa5d1, float:-1.9094057E38)
            r11.W(r12)
            boolean r12 = r11.F(r10)
            java.lang.Object r0 = r11.D()
            if (r12 != 0) goto L_0x002e
            U0.m$a r12 = U0.C4889m.f14007a
            java.lang.Object r12 = r12.a()
            if (r0 != r12) goto L_0x0036
        L_0x002e:
            com.ingka.ikea.checkout.impl.delivery.bottomsheets.ChangePickupPointBottomSheet$a r0 = new com.ingka.ikea.checkout.impl.delivery.bottomsheets.ChangePickupPointBottomSheet$a
            r0.<init>(r10)
            r11.u(r0)
        L_0x0036:
            uI.h r0 = (uI.C18059h) r0
            r11.P()
            r4 = r0
            nI.l r4 = (nI.C17642l) r4
            r12 = -15749933(0xffffffffff0facd3, float:-1.9097696E38)
            r11.W(r12)
            boolean r12 = r11.F(r10)
            java.lang.Object r0 = r11.D()
            if (r12 != 0) goto L_0x0056
            U0.m$a r12 = U0.C4889m.f14007a
            java.lang.Object r12 = r12.a()
            if (r0 != r12) goto L_0x005e
        L_0x0056:
            com.ingka.ikea.checkout.impl.delivery.bottomsheets.ChangePickupPointBottomSheet$b r0 = new com.ingka.ikea.checkout.impl.delivery.bottomsheets.ChangePickupPointBottomSheet$b
            r0.<init>(r10)
            r11.u(r0)
        L_0x005e:
            uI.h r0 = (uI.C18059h) r0
            r11.P()
            r5 = r0
            nI.l r5 = (nI.C17642l) r5
            r12 = -15747176(0xffffffffff0fb798, float:-1.9103288E38)
            r11.W(r12)
            boolean r12 = r11.F(r10)
            java.lang.Object r0 = r11.D()
            if (r12 != 0) goto L_0x007e
            U0.m$a r12 = U0.C4889m.f14007a
            java.lang.Object r12 = r12.a()
            if (r0 != r12) goto L_0x0086
        L_0x007e:
            fo.g r0 = new fo.g
            r0.<init>(r10)
            r11.u(r0)
        L_0x0086:
            r6 = r0
            nI.l r6 = (nI.C17642l) r6
            r11.P()
            r12 = -15727580(0xffffffffff100424, float:-1.9143033E38)
            r11.W(r12)
            boolean r12 = r11.F(r10)
            java.lang.Object r0 = r11.D()
            if (r12 != 0) goto L_0x00a4
            U0.m$a r12 = U0.C4889m.f14007a
            java.lang.Object r12 = r12.a()
            if (r0 != r12) goto L_0x00ac
        L_0x00a4:
            com.ingka.ikea.checkout.impl.delivery.bottomsheets.ChangePickupPointBottomSheet$c r0 = new com.ingka.ikea.checkout.impl.delivery.bottomsheets.ChangePickupPointBottomSheet$c
            r0.<init>(r10)
            r11.u(r0)
        L_0x00ac:
            uI.h r0 = (uI.C18059h) r0
            r11.P()
            r7 = r0
            nI.a r7 = (nI.C17631a) r7
            r9 = 0
            r8 = r11
            go.C11331o.j(r3, r4, r5, r6, r7, r8, r9)
            boolean r12 = U0.C4895p.J()
            if (r12 == 0) goto L_0x00c2
            U0.C4895p.R()
        L_0x00c2:
            r11.P()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ingka.ikea.checkout.impl.delivery.bottomsheets.ChangePickupPointBottomSheet.u0(U0.m, int):void");
    }
}

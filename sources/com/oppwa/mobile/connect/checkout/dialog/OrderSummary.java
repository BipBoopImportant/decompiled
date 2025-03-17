package com.oppwa.mobile.connect.checkout.dialog;

import Ba.C6385i;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.identity.intents.model.UserAddress;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutConstants;
import com.oppwa.mobile.connect.utils.Utils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;

public class OrderSummary implements Parcelable {
    public static final Parcelable.Creator<OrderSummary> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private LinkedHashMap<String, Double> f121037a;

    /* renamed from: b  reason: collision with root package name */
    private Double f121038b;

    /* renamed from: c  reason: collision with root package name */
    private String f121039c;

    /* renamed from: d  reason: collision with root package name */
    private String f121040d;

    /* renamed from: e  reason: collision with root package name */
    private String f121041e;

    class a implements Parcelable.Creator<OrderSummary> {
        a() {
        }

        /* renamed from: a */
        public OrderSummary createFromParcel(Parcel parcel) {
            return new OrderSummary(parcel, (a) null);
        }

        /* renamed from: a */
        public OrderSummary[] newArray(int i10) {
            return new OrderSummary[i10];
        }
    }

    /* synthetic */ OrderSummary(Parcel parcel, a aVar) {
        this(parcel);
    }

    private String a(UserAddress userAddress) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(userAddress.x());
        arrayList.add(userAddress.B());
        String a10 = a(arrayList, " ");
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(userAddress.F());
        arrayList2.add(userAddress.U());
        String a11 = a(arrayList2, ", ");
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(userAddress.J());
        arrayList3.add(a10);
        arrayList3.add(a11);
        return a(arrayList3, "\n");
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OrderSummary orderSummary = (OrderSummary) obj;
        return Utils.compare(this.f121037a, orderSummary.f121037a) && Double.compare(this.f121038b.doubleValue(), orderSummary.f121038b.doubleValue()) == 0 && Utils.compare(this.f121039c, orderSummary.f121039c) && Utils.compare(this.f121040d, orderSummary.f121040d) && Utils.compare(this.f121041e, orderSummary.f121041e);
    }

    public LinkedHashMap<String, Double> getOrderItems() {
        return this.f121037a;
    }

    public Double getOrderTotal() {
        return this.f121038b;
    }

    public String getPaymentBrand() {
        return this.f121040d;
    }

    public String getPaymentDetails() {
        return this.f121039c;
    }

    public String getShippingInfo() {
        return this.f121041e;
    }

    public int hashCode() {
        int hashCode = ((((((this.f121037a.hashCode() * 31) + Long.valueOf(Double.doubleToLongBits(this.f121038b.doubleValue())).hashCode()) * 31) + this.f121039c.hashCode()) * 31) + this.f121040d.hashCode()) * 31;
        String str = this.f121041e;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public OrderSummary setOrderItems(LinkedHashMap<String, Double> linkedHashMap) {
        this.f121037a = linkedHashMap;
        return this;
    }

    public OrderSummary setOrderTotal(Double d10) {
        this.f121038b = d10;
        return this;
    }

    public OrderSummary setPaymentBrand(String str) {
        this.f121040d = str;
        return this;
    }

    public OrderSummary setPaymentDetails(String str) {
        this.f121039c = str;
        return this;
    }

    public OrderSummary setShippingInfo(String str) {
        this.f121041e = str;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f121037a.size());
        for (String next : this.f121037a.keySet()) {
            parcel.writeString(next);
            parcel.writeDouble(this.f121037a.get(next).doubleValue());
        }
        parcel.writeDouble(this.f121038b.doubleValue());
        parcel.writeString(this.f121039c);
        parcel.writeString(this.f121040d);
        parcel.writeString(this.f121041e);
    }

    public OrderSummary(LinkedHashMap<String, Double> linkedHashMap, Double d10, String str, String str2) {
        this.f121037a = linkedHashMap;
        this.f121038b = d10;
        this.f121039c = str;
        this.f121040d = str2;
    }

    public OrderSummary(LinkedHashMap<String, Double> linkedHashMap, Double d10, C6385i iVar) {
        this(linkedHashMap, d10, "", CheckoutConstants.PaymentBrands.GOOGLEPAY);
        if (iVar.x() != null) {
            this.f121039c = iVar.x().x();
        }
        if (iVar.J() != null) {
            this.f121041e = a(iVar.J());
        }
    }

    private OrderSummary(Parcel parcel) {
        this.f121037a = new LinkedHashMap<>();
        int readInt = parcel.readInt();
        if (readInt > 0) {
            for (int i10 = 0; i10 < readInt; i10++) {
                this.f121037a.put(parcel.readString(), Double.valueOf(parcel.readDouble()));
            }
        }
        this.f121038b = Double.valueOf(parcel.readDouble());
        this.f121039c = parcel.readString();
        this.f121040d = parcel.readString();
        this.f121041e = parcel.readString();
    }

    private String a(ArrayList<String> arrayList, String str) {
        arrayList.removeAll(Collections.singleton((Object) null));
        arrayList.removeAll(Collections.singleton(""));
        return TextUtils.join(str, arrayList);
    }
}

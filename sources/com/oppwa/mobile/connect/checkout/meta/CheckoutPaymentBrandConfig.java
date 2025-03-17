package com.oppwa.mobile.connect.checkout.meta;

import android.os.Parcel;
import android.os.Parcelable;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutConstants;
import com.oppwa.mobile.connect.payment.BrandConfig;
import com.oppwa.mobile.connect.payment.amazonpay.AmazonPayConfig;
import com.oppwa.mobile.connect.payment.processor.cashapppay.CashAppPayConfig;
import com.oppwa.mobile.connect.utils.ParcelUtils;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u0000 !2\u00020\u0001:\u0002\"!B\u001f\b\u0002\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001e\u0010\u0010R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/oppwa/mobile/connect/checkout/meta/CheckoutPaymentBrandConfig;", "Landroid/os/Parcelable;", "", "", "Lcom/oppwa/mobile/connect/payment/BrandConfig;", "brandConfigMap", "<init>", "(Ljava/util/Map;)V", "Lcom/oppwa/mobile/connect/payment/processor/cashapppay/CashAppPayConfig;", "getCashAppPayConfig", "()Lcom/oppwa/mobile/connect/payment/processor/cashapppay/CashAppPayConfig;", "Lcom/oppwa/mobile/connect/payment/amazonpay/AmazonPayConfig;", "getAmazonPayConfig", "()Lcom/oppwa/mobile/connect/payment/amazonpay/AmazonPayConfig;", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "LXH/N;", "writeToParcel", "(Landroid/os/Parcel;I)V", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "a", "Ljava/util/Map;", "CREATOR", "Builder", "oppwa.mobile-6.19.0_release"}, k = 1, mv = {1, 7, 1})
public final class CheckoutPaymentBrandConfig implements Parcelable {
    public static final CREATOR CREATOR = new CREATOR((DefaultConstructorMarker) null);

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, BrandConfig> f121379a;

    @Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\u0006\u0010\t\u001a\u00020\bR \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/oppwa/mobile/connect/checkout/meta/CheckoutPaymentBrandConfig$Builder;", "", "Lcom/oppwa/mobile/connect/payment/processor/cashapppay/CashAppPayConfig;", "cashAppPayConfig", "setCashAppPayConfig", "Lcom/oppwa/mobile/connect/payment/amazonpay/AmazonPayConfig;", "amazonPayConfig", "setAmazonPayConfig", "Lcom/oppwa/mobile/connect/checkout/meta/CheckoutPaymentBrandConfig;", "build", "", "", "Lcom/oppwa/mobile/connect/payment/BrandConfig;", "a", "Ljava/util/Map;", "brandConfigMap", "<init>", "()V", "oppwa.mobile-6.19.0_release"}, k = 1, mv = {1, 7, 1})
    public static final class Builder {

        /* renamed from: a  reason: collision with root package name */
        private final Map<String, BrandConfig> f121380a = new LinkedHashMap();

        public final CheckoutPaymentBrandConfig build() {
            return new CheckoutPaymentBrandConfig(this.f121380a, (DefaultConstructorMarker) null);
        }

        public final Builder setAmazonPayConfig(AmazonPayConfig amazonPayConfig) {
            C17542s.j(amazonPayConfig, "amazonPayConfig");
            this.f121380a.put(CheckoutConstants.PaymentBrands.AMAZONPAY, amazonPayConfig);
            return this;
        }

        public final Builder setCashAppPayConfig(CashAppPayConfig cashAppPayConfig) {
            C17542s.j(cashAppPayConfig, "cashAppPayConfig");
            this.f121380a.put(CheckoutConstants.PaymentBrands.CASH_APP_PAY, cashAppPayConfig);
            return this;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/oppwa/mobile/connect/checkout/meta/CheckoutPaymentBrandConfig$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/oppwa/mobile/connect/checkout/meta/CheckoutPaymentBrandConfig;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/oppwa/mobile/connect/checkout/meta/CheckoutPaymentBrandConfig;", "oppwa.mobile-6.19.0_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class CREATOR implements Parcelable.Creator<CheckoutPaymentBrandConfig> {
        public /* synthetic */ CREATOR(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private CREATOR() {
        }

        public CheckoutPaymentBrandConfig createFromParcel(Parcel parcel) {
            C17542s.j(parcel, "parcel");
            Map readParcelableMap = ParcelUtils.readParcelableMap(parcel);
            if (readParcelableMap == null) {
                readParcelableMap = new LinkedHashMap();
            }
            return new CheckoutPaymentBrandConfig(readParcelableMap, (DefaultConstructorMarker) null);
        }

        public CheckoutPaymentBrandConfig[] newArray(int i10) {
            return new CheckoutPaymentBrandConfig[i10];
        }
    }

    public /* synthetic */ CheckoutPaymentBrandConfig(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CheckoutPaymentBrandConfig) && C17542s.e(this.f121379a, ((CheckoutPaymentBrandConfig) obj).f121379a);
    }

    public final AmazonPayConfig getAmazonPayConfig() {
        BrandConfig brandConfig = this.f121379a.get(CheckoutConstants.PaymentBrands.AMAZONPAY);
        if (brandConfig instanceof AmazonPayConfig) {
            return (AmazonPayConfig) brandConfig;
        }
        return null;
    }

    public final CashAppPayConfig getCashAppPayConfig() {
        BrandConfig brandConfig = this.f121379a.get(CheckoutConstants.PaymentBrands.CASH_APP_PAY);
        if (brandConfig instanceof CashAppPayConfig) {
            return (CashAppPayConfig) brandConfig;
        }
        return null;
    }

    public int hashCode() {
        return this.f121379a.hashCode();
    }

    public String toString() {
        return "CheckoutPaymentBrandConfig(brandConfigMap=" + this.f121379a + ')';
    }

    public void writeToParcel(Parcel parcel, int i10) {
        C17542s.j(parcel, "parcel");
        ParcelUtils.writeParcelableMap(parcel, this.f121379a);
    }

    private CheckoutPaymentBrandConfig(Map<String, BrandConfig> map) {
        this.f121379a = map;
    }
}

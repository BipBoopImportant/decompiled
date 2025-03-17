package com.oppwa.mobile.connect.payment.amazonpay;

import android.os.Parcel;
import android.os.Parcelable;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutConstants;
import com.oppwa.mobile.connect.payment.PaymentParams;
import java.util.Map;
import java.util.Objects;

public class AmazonPayPaymentParams extends PaymentParams {
    public static final Parcelable.Creator<AmazonPayPaymentParams> CREATOR = new a();

    /* renamed from: g  reason: collision with root package name */
    private final AmazonPayConfig f121820g;

    class a implements Parcelable.Creator<AmazonPayPaymentParams> {
        a() {
        }

        /* renamed from: a */
        public AmazonPayPaymentParams createFromParcel(Parcel parcel) {
            return new AmazonPayPaymentParams(parcel);
        }

        /* renamed from: a */
        public AmazonPayPaymentParams[] newArray(int i10) {
            return new AmazonPayPaymentParams[i10];
        }
    }

    public AmazonPayPaymentParams(String str, AmazonPayConfig amazonPayConfig) {
        super(str, CheckoutConstants.PaymentBrands.AMAZONPAY);
        this.f121820g = amazonPayConfig;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof AmazonPayPaymentParams) && super.equals(obj)) {
            return Objects.equals(this.f121820g, ((AmazonPayPaymentParams) obj).f121820g);
        }
        return false;
    }

    public AmazonPayConfig getAmazonPayConfig() {
        return this.f121820g;
    }

    public Map<String, String> getParamsForRequest() {
        Map<String, String> paramsForRequest = super.getParamsForRequest();
        paramsForRequest.put("customParameters[inlineFlow]", "true");
        paramsForRequest.put("customParameters[SHOPPER_Flow]", "MSDK");
        return paramsForRequest;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), this.f121820g});
    }

    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeParcelable(this.f121820g, i10);
    }

    protected AmazonPayPaymentParams(Parcel parcel) {
        super(parcel);
        this.f121820g = (AmazonPayConfig) parcel.readParcelable(AmazonPayConfig.class.getClassLoader());
    }
}

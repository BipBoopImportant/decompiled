package com.oppwa.mobile.connect.payment.affirm;

import android.os.Parcel;
import android.os.Parcelable;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutConstants;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.payment.PaymentParams;
import com.oppwa.mobile.connect.provider.Connect;
import java.util.Map;
import java.util.Objects;

public class AffirmPaymentParams extends PaymentParams {
    public static final Parcelable.Creator<AffirmPaymentParams> CREATOR = new a();

    /* renamed from: g  reason: collision with root package name */
    private String f121813g;

    class a implements Parcelable.Creator<AffirmPaymentParams> {
        a() {
        }

        /* renamed from: a */
        public AffirmPaymentParams createFromParcel(Parcel parcel) {
            return new AffirmPaymentParams(parcel);
        }

        /* renamed from: a */
        public AffirmPaymentParams[] newArray(int i10) {
            return new AffirmPaymentParams[i10];
        }
    }

    public AffirmPaymentParams(String str, Connect.ProviderMode providerMode) {
        super(str, CheckoutConstants.PaymentBrands.AFFIRM);
        a(providerMode);
        setProviderMode(providerMode);
    }

    private void a(Connect.ProviderMode providerMode) {
        if (providerMode == null) {
            throw new PaymentException(PaymentError.getAffirmError("Provider mode is null"));
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        return Objects.equals(this.f121813g, ((AffirmPaymentParams) obj).f121813g);
    }

    public Map<String, String> getParamsForRequest() {
        Map<String, String> paramsForRequest = super.getParamsForRequest();
        paramsForRequest.put("customParameters[AFFIRM.CHECKOUT.TOKEN]", this.f121813g);
        return paramsForRequest;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), this.f121813g});
    }

    public void setAffirmToken(String str) {
        this.f121813g = str;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeString(this.f121813g);
    }

    protected AffirmPaymentParams(Parcel parcel) {
        super(parcel);
        this.f121813g = parcel.readString();
    }
}

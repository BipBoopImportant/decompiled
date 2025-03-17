package com.oppwa.mobile.connect.payment.klarna;

import android.os.Parcel;
import android.os.Parcelable;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutConstants;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.payment.PaymentParams;
import java.util.Map;
import java.util.Objects;

public class KlarnaInlinePaymentParams extends PaymentParams {
    public static final Parcelable.Creator<KlarnaInlinePaymentParams> CREATOR = new a();

    /* renamed from: g  reason: collision with root package name */
    private String f121881g;

    class a implements Parcelable.Creator<KlarnaInlinePaymentParams> {
        a() {
        }

        /* renamed from: a */
        public KlarnaInlinePaymentParams createFromParcel(Parcel parcel) {
            return new KlarnaInlinePaymentParams(parcel, (a) null);
        }

        /* renamed from: a */
        public KlarnaInlinePaymentParams[] newArray(int i10) {
            return new KlarnaInlinePaymentParams[i10];
        }
    }

    /* synthetic */ KlarnaInlinePaymentParams(Parcel parcel, a aVar) {
        this(parcel);
    }

    private boolean a(String str) {
        return str.equals(CheckoutConstants.PaymentBrands.KLARNA_PAYMENTS_PAYLATER) || str.equals(CheckoutConstants.PaymentBrands.KLARNA_PAYMENTS_PAYNOW) || str.equals(CheckoutConstants.PaymentBrands.KLARNA_PAYMENTS_SLICEIT) || str.equals(CheckoutConstants.PaymentBrands.KLARNA_PAYMENTS_ONE);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        return Objects.equals(this.f121881g, ((KlarnaInlinePaymentParams) obj).f121881g);
    }

    public String getInitialTransactionId() {
        return this.f121881g;
    }

    public Map<String, String> getParamsForRequest() {
        Map<String, String> paramsForRequest = super.getParamsForRequest();
        paramsForRequest.put("customParameters[inlineFlow]", "true");
        String str = this.f121881g;
        if (str != null) {
            paramsForRequest.put("customParameters[SHOPPER_submit_payment]", str);
        }
        return paramsForRequest;
    }

    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.f121881g;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public KlarnaInlinePaymentParams setInitialTransactionId(String str) {
        this.f121881g = str;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeString(this.f121881g);
    }

    public KlarnaInlinePaymentParams(String str, String str2) {
        super(str, str2);
        if (!a(str2)) {
            throw new PaymentException(PaymentError.getPaymentParamsPaymentSchemeInvalidError());
        }
    }

    private KlarnaInlinePaymentParams(Parcel parcel) {
        super(parcel);
        this.f121881g = parcel.readString();
    }
}

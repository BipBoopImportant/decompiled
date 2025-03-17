package com.oppwa.mobile.connect.payment;

import android.os.Parcel;
import android.text.TextUtils;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutConstants;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.exception.PaymentException;
import java.util.Map;
import java.util.Objects;

public abstract class VirtualAccountPaymentParams extends PaymentParams {

    /* renamed from: g  reason: collision with root package name */
    protected String f121812g;

    public VirtualAccountPaymentParams(String str, String str2, String str3) {
        super(str, str2);
        this.f121812g = str3;
        h();
    }

    private String e() {
        return f() ? "googlePay.paymentToken" : g() ? "samsungPay.paymentToken" : "virtualAccount.paymentToken";
    }

    private boolean f() {
        return TextUtils.equals(getPaymentBrand(), CheckoutConstants.PaymentBrands.GOOGLEPAY);
    }

    private boolean g() {
        return TextUtils.equals(getPaymentBrand(), CheckoutConstants.PaymentBrands.SAMSUNGPAY);
    }

    private void h() {
        if (!TextUtils.isEmpty(this.f121812g)) {
            return;
        }
        if (f()) {
            throw new PaymentException(PaymentError.getPaymentParamsGooglePayTokenInvalidError());
        }
        throw new PaymentException(PaymentError.getPaymentParamsPaymentTokenMissingError());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        return this.f121812g.equals(((VirtualAccountPaymentParams) obj).f121812g);
    }

    public Map<String, String> getParamsForRequest() {
        Map<String, String> paramsForRequest = super.getParamsForRequest();
        paramsForRequest.put(e(), getPaymentToken());
        return paramsForRequest;
    }

    public String getPaymentToken() {
        return this.f121812g;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), this.f121812g});
    }

    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeString(this.f121812g);
    }

    protected VirtualAccountPaymentParams(Parcel parcel) {
        super(parcel);
        this.f121812g = parcel.readString();
    }
}

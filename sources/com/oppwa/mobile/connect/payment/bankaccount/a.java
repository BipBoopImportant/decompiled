package com.oppwa.mobile.connect.payment.bankaccount;

import android.os.Parcel;
import android.os.Parcelable;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutConstants;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.exception.PaymentException;
import java.util.Map;
import java.util.Optional;

class a extends BankAccountPaymentParams {
    public static final Parcelable.Creator<a> CREATOR = new C3013a();

    /* renamed from: com.oppwa.mobile.connect.payment.bankaccount.a$a  reason: collision with other inner class name */
    class C3013a implements Parcelable.Creator<a> {
        C3013a() {
        }

        /* renamed from: a */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, (C3013a) null);
        }

        /* renamed from: a */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    /* synthetic */ a(Parcel parcel, C3013a aVar) {
        this(parcel);
    }

    public Map<String, String> getParamsForRequest() {
        Map<String, String> paramsForRequest = super.getParamsForRequest();
        Optional.ofNullable(getHolder()).ifPresent(new g(paramsForRequest));
        Optional.ofNullable(getAccountNumber()).ifPresent(new h(paramsForRequest));
        Optional.ofNullable(getBankCode()).ifPresent(new i(paramsForRequest));
        Optional.ofNullable(getCountry()).ifPresent(new j(paramsForRequest));
        return paramsForRequest;
    }

    a(String str, String str2, String str3, String str4, String str5) {
        super(str, CheckoutConstants.PaymentBrands.ACI_INSTANTPAY, str2, (String) null, str3, (String) null, str4, str5, (String) null);
        if (str2.isEmpty() || !BankAccountPaymentParams.isHolderValid(str2)) {
            throw new PaymentException(PaymentError.getPaymentParamsBankAccountHolderInvalidError());
        } else if (str3.isEmpty() || !BankAccountPaymentParams.isAccountNumberValid(str3)) {
            throw new PaymentException(PaymentError.getPaymentParamsBankAccountNumberInvalidError());
        } else if (str4.isEmpty() || !BankAccountPaymentParams.isRoutingNumberValid(str4)) {
            throw new PaymentException(PaymentError.getPaymentParamsRoutingNumberInvalidError());
        } else if (!BankAccountPaymentParams.isCountryValid(str5)) {
            throw new PaymentException(PaymentError.getPaymentParamsCountryCodeInvalidError());
        }
    }

    private a(Parcel parcel) {
        super(parcel);
    }
}

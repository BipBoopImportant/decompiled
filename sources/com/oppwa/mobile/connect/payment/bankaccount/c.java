package com.oppwa.mobile.connect.payment.bankaccount;

import android.os.Parcel;
import android.os.Parcelable;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutConstants;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.exception.PaymentException;
import java.util.Map;

class c extends BankAccountPaymentParams {
    public static final Parcelable.Creator<c> CREATOR = new a();

    class a implements Parcelable.Creator<c> {
        a() {
        }

        /* renamed from: a */
        public c createFromParcel(Parcel parcel) {
            return new c(parcel, (a) null);
        }

        /* renamed from: a */
        public c[] newArray(int i10) {
            return new c[i10];
        }
    }

    /* synthetic */ c(Parcel parcel, a aVar) {
        this(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public Map<String, String> getParamsForRequest() {
        Map<String, String> paramsForRequest = super.getParamsForRequest();
        paramsForRequest.put("bankAccount.country", "DE");
        if (this.f121829h != null) {
            paramsForRequest.put("bankAccount.iban", getIban());
        }
        if (this.f121830i != null) {
            paramsForRequest.put("bankAccount.number", getAccountNumber());
        }
        if (this.f121831j != null) {
            paramsForRequest.put("bankAccount.bic", getBic());
        }
        if (this.f121832k != null) {
            paramsForRequest.put("bankAccount.bankCode", getBankCode());
        }
        return paramsForRequest;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
    }

    c(String str, String str2, String str3, String str4, String str5) {
        super(str, CheckoutConstants.PaymentBrands.GIROPAY, (String) null, str2, str3, str4, str5, (String) null, (String) null);
        if (str2 != null && !BankAccountPaymentParams.isIbanValid(str2)) {
            throw new PaymentException(PaymentError.getPaymentParamsBankAccountIbanInvalidError());
        } else if (str3 != null && !BankAccountPaymentParams.isAccountNumberValid(str3)) {
            throw new PaymentException(PaymentError.getPaymentParamsBankAccountNumberInvalidError());
        } else if (str4 != null && !BankAccountPaymentParams.isBicValid(str4)) {
            throw new PaymentException(PaymentError.getPaymentParamsBankAccountBicInvalidError());
        } else if (str5 != null && !BankAccountPaymentParams.isBankCodeValid(str5)) {
            throw new PaymentException(PaymentError.getPaymentParamsBankAccountBankCodeInvalidError());
        }
    }

    private c(Parcel parcel) {
        super(parcel);
    }
}

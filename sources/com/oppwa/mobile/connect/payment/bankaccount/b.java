package com.oppwa.mobile.connect.payment.bankaccount;

import android.os.Parcel;
import android.os.Parcelable;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutConstants;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.exception.PaymentException;
import java.util.Map;

class b extends BankAccountPaymentParams {
    public static final Parcelable.Creator<b> CREATOR = new a();

    class a implements Parcelable.Creator<b> {
        a() {
        }

        /* renamed from: a */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel, (a) null);
        }

        /* renamed from: a */
        public b[] newArray(int i10) {
            return new b[i10];
        }
    }

    /* synthetic */ b(Parcel parcel, a aVar) {
        this(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public Map<String, String> getParamsForRequest() {
        Map<String, String> paramsForRequest = super.getParamsForRequest();
        paramsForRequest.put("bankAccount.holder", getHolder());
        paramsForRequest.put("bankAccount.iban", getIban());
        if (this.f121835n) {
            paramsForRequest.put("createRegistration", "true");
        }
        return paramsForRequest;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
    }

    b(String str, String str2, String str3, boolean z10) {
        super(str, CheckoutConstants.PaymentBrands.DIRECTDEBIT_SEPA, str2, str3, (String) null, (String) null, (String) null, (String) null, (String) null);
        if (!BankAccountPaymentParams.isHolderValid(str2)) {
            throw new PaymentException(PaymentError.getPaymentParamsBankAccountHolderInvalidError());
        } else if (BankAccountPaymentParams.isIbanValid(str3)) {
            this.f121835n = z10;
        } else {
            throw new PaymentException(PaymentError.getPaymentParamsBankAccountIbanInvalidError());
        }
    }

    private b(Parcel parcel) {
        super(parcel);
    }
}

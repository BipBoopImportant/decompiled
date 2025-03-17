package com.oppwa.mobile.connect.payment.bankaccount;

import android.os.Parcel;
import android.os.Parcelable;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutConstants;
import java.util.Map;

class e extends BankAccountPaymentParams {
    public static final Parcelable.Creator<e> CREATOR = new a();

    class a implements Parcelable.Creator<e> {
        a() {
        }

        /* renamed from: a */
        public e createFromParcel(Parcel parcel) {
            return new e(parcel, (a) null);
        }

        /* renamed from: a */
        public e[] newArray(int i10) {
            return new e[i10];
        }
    }

    /* synthetic */ e(Parcel parcel, a aVar) {
        this(parcel);
    }

    public Map<String, String> getParamsForRequest() {
        Map<String, String> paramsForRequest = super.getParamsForRequest();
        paramsForRequest.put("bankAccount.country", getCountry());
        return paramsForRequest;
    }

    e(String str) {
        super(str, CheckoutConstants.PaymentBrands.PAYTRAIL, (String) null, (String) null, (String) null, (String) null, (String) null, "FI", (String) null);
    }

    private e(Parcel parcel) {
        super(parcel);
    }
}

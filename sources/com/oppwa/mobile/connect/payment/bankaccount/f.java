package com.oppwa.mobile.connect.payment.bankaccount;

import android.os.Parcel;
import android.os.Parcelable;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutConstants;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.exception.PaymentException;
import java.util.Map;

class f extends BankAccountPaymentParams {
    public static final Parcelable.Creator<f> CREATOR = new a();

    class a implements Parcelable.Creator<f> {
        a() {
        }

        /* renamed from: a */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel, (a) null);
        }

        /* renamed from: a */
        public f[] newArray(int i10) {
            return new f[i10];
        }
    }

    /* synthetic */ f(Parcel parcel, a aVar) {
        this(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public Map<String, String> getParamsForRequest() {
        Map<String, String> paramsForRequest = super.getParamsForRequest();
        paramsForRequest.put("bankAccount.country", getCountry());
        return paramsForRequest;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
    }

    f(String str, String str2) {
        super(str, CheckoutConstants.PaymentBrands.SOFORTUEBERWEISUNG, (String) null, (String) null, (String) null, (String) null, (String) null, str2, (String) null);
        if (!BankAccountPaymentParams.isCountryValid(str2)) {
            throw new PaymentException(PaymentError.getPaymentParamsSofortCountryInvalidError());
        }
    }

    private f(Parcel parcel) {
        super(parcel);
    }
}

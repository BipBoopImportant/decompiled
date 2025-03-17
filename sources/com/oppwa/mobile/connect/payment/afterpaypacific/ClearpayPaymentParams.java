package com.oppwa.mobile.connect.payment.afterpaypacific;

import android.os.Parcel;
import android.os.Parcelable;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutConstants;

public class ClearpayPaymentParams extends AfterpayPacificPaymentParams {
    public static final Parcelable.Creator<ClearpayPaymentParams> CREATOR = new a();

    class a implements Parcelable.Creator<ClearpayPaymentParams> {
        a() {
        }

        /* renamed from: a */
        public ClearpayPaymentParams createFromParcel(Parcel parcel) {
            return new ClearpayPaymentParams(parcel);
        }

        /* renamed from: a */
        public ClearpayPaymentParams[] newArray(int i10) {
            return new ClearpayPaymentParams[i10];
        }
    }

    public ClearpayPaymentParams(String str) {
        super(str, CheckoutConstants.PaymentBrands.CLEARPAY);
    }

    protected ClearpayPaymentParams(Parcel parcel) {
        super(parcel);
    }
}

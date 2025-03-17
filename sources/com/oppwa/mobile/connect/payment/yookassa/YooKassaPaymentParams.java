package com.oppwa.mobile.connect.payment.yookassa;

import android.os.Parcel;
import android.os.Parcelable;
import com.oppwa.mobile.connect.payment.VirtualAccountPaymentParams;

public class YooKassaPaymentParams extends VirtualAccountPaymentParams {
    public static final Parcelable.Creator<YooKassaPaymentParams> CREATOR = new a();

    class a implements Parcelable.Creator<YooKassaPaymentParams> {
        a() {
        }

        /* renamed from: a */
        public YooKassaPaymentParams createFromParcel(Parcel parcel) {
            return new YooKassaPaymentParams(parcel);
        }

        /* renamed from: a */
        public YooKassaPaymentParams[] newArray(int i10) {
            return new YooKassaPaymentParams[i10];
        }
    }

    public YooKassaPaymentParams(String str, String str2) {
        super(str, "YANDEX_CHECKOUT", str2);
    }

    protected YooKassaPaymentParams(Parcel parcel) {
        super(parcel);
    }
}

package com.oppwa.mobile.connect.payment.stcpay;

import android.os.Parcel;
import android.os.Parcelable;

public enum STCPayVerificationOption implements Parcelable {
    MOBILE_PHONE,
    QR_CODE;
    
    public static final Parcelable.Creator<STCPayVerificationOption> CREATOR = null;

    class a implements Parcelable.Creator<STCPayVerificationOption> {
        a() {
        }

        /* renamed from: a */
        public STCPayVerificationOption createFromParcel(Parcel parcel) {
            return STCPayVerificationOption.values()[parcel.readInt()];
        }

        /* renamed from: a */
        public STCPayVerificationOption[] newArray(int i10) {
            return new STCPayVerificationOption[i10];
        }
    }

    static {
        CREATOR = new a();
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(ordinal());
    }
}

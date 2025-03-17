package com.oppwa.mobile.connect.payment.mbway;

import android.os.Parcel;
import android.os.Parcelable;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutConstants;
import com.oppwa.mobile.connect.payment.PaymentParams;
import com.oppwa.mobile.connect.utils.Utils;
import java.util.Arrays;
import java.util.Map;

public class MBWayPaymentParams extends PaymentParams {
    public static final Parcelable.Creator<MBWayPaymentParams> CREATOR = new a();

    /* renamed from: g  reason: collision with root package name */
    private final byte[] f121882g;

    /* renamed from: h  reason: collision with root package name */
    private final byte[] f121883h;

    class a implements Parcelable.Creator<MBWayPaymentParams> {
        a() {
        }

        /* renamed from: a */
        public MBWayPaymentParams createFromParcel(Parcel parcel) {
            return new MBWayPaymentParams(parcel, (a) null);
        }

        /* renamed from: a */
        public MBWayPaymentParams[] newArray(int i10) {
            return new MBWayPaymentParams[i10];
        }
    }

    /* synthetic */ MBWayPaymentParams(Parcel parcel, a aVar) {
        this(parcel);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        MBWayPaymentParams mBWayPaymentParams = (MBWayPaymentParams) obj;
        return Arrays.equals(this.f121882g, mBWayPaymentParams.f121882g) && Arrays.equals(this.f121883h, mBWayPaymentParams.f121883h);
    }

    public String getCountryCode() {
        return Utils.stringFromBytes(this.f121882g);
    }

    public String getMobilePhone() {
        return Utils.stringFromBytes(this.f121883h);
    }

    public Map<String, String> getParamsForRequest() {
        Map<String, String> paramsForRequest = super.getParamsForRequest();
        paramsForRequest.put("virtualAccount.accountId", getMobilePhone());
        paramsForRequest.put("virtualAccount.holder", getCountryCode());
        return paramsForRequest;
    }

    public int hashCode() {
        return (((super.hashCode() * 31) + Arrays.hashCode(this.f121882g)) * 31) + Arrays.hashCode(this.f121883h);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        Utils.writeByteArray(parcel, this.f121882g);
        Utils.writeByteArray(parcel, this.f121883h);
    }

    public MBWayPaymentParams(String str, String str2, String str3) {
        super(str, CheckoutConstants.PaymentBrands.MBWAY);
        this.f121882g = Utils.bytesFromString(str2);
        this.f121883h = Utils.bytesFromString(str3);
    }

    private MBWayPaymentParams(Parcel parcel) {
        super(parcel);
        this.f121882g = Utils.readByteArray(parcel);
        this.f121883h = Utils.readByteArray(parcel);
    }
}

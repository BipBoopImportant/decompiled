package com.oppwa.mobile.connect.payment.chinaunionpay;

import android.os.Parcel;
import android.os.Parcelable;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutConstants;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.payment.PaymentParams;
import com.oppwa.mobile.connect.utils.Utils;
import java.lang.ref.SoftReference;
import java.util.Arrays;
import java.util.Map;
import java.util.regex.Pattern;

public class ChinaUnionPayPaymentParams extends PaymentParams {
    public static final Parcelable.Creator<ChinaUnionPayPaymentParams> CREATOR = new a();

    /* renamed from: h  reason: collision with root package name */
    private static SoftReference<Pattern> f121867h;

    /* renamed from: g  reason: collision with root package name */
    private final byte[] f121868g;

    class a implements Parcelable.Creator<ChinaUnionPayPaymentParams> {
        a() {
        }

        /* renamed from: a */
        public ChinaUnionPayPaymentParams createFromParcel(Parcel parcel) {
            return new ChinaUnionPayPaymentParams(parcel, (a) null);
        }

        /* renamed from: a */
        public ChinaUnionPayPaymentParams[] newArray(int i10) {
            return new ChinaUnionPayPaymentParams[i10];
        }
    }

    /* synthetic */ ChinaUnionPayPaymentParams(Parcel parcel, a aVar) {
        this(parcel);
    }

    private static Pattern e() {
        SoftReference<Pattern> softReference = f121867h;
        if (softReference == null || softReference.get() == null) {
            f121867h = new SoftReference<>(Pattern.compile(".{3,128}"));
        }
        return f121867h.get();
    }

    public static boolean isHolderValid(String str) {
        if (str == null) {
            return false;
        }
        return str.isEmpty() || e().matcher(Utils.normalizeHolder(str)).matches();
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
        return Arrays.equals(this.f121868g, ((ChinaUnionPayPaymentParams) obj).f121868g);
    }

    public String getHolder() {
        return Utils.stringFromBytes(this.f121868g);
    }

    public Map<String, String> getParamsForRequest() {
        Map<String, String> paramsForRequest = super.getParamsForRequest();
        if (this.f121868g != null) {
            paramsForRequest.put("virtualAccount.holder", getHolder());
        }
        return paramsForRequest;
    }

    public int hashCode() {
        return (super.hashCode() * 31) + Arrays.hashCode(this.f121868g);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        Utils.writeByteArray(parcel, this.f121868g);
    }

    public ChinaUnionPayPaymentParams(String str, String str2) {
        super(str, CheckoutConstants.PaymentBrands.CHINAUNIONPAY);
        if (str2 == null || isHolderValid(str2)) {
            this.f121868g = Utils.bytesFromString(Utils.normalizeHolder(str2));
            return;
        }
        throw new PaymentException(PaymentError.getPaymentParamsCardHolderInvalidError());
    }

    private ChinaUnionPayPaymentParams(Parcel parcel) {
        super(parcel);
        this.f121868g = Utils.readByteArray(parcel);
    }
}

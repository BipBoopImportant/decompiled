package com.oppwa.mobile.connect.payment.blik;

import android.os.Parcel;
import android.os.Parcelable;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutConstants;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.payment.PaymentParams;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.regex.Pattern;

public class BlikPaymentParams extends PaymentParams {
    public static final Parcelable.Creator<BlikPaymentParams> CREATOR = new a();

    /* renamed from: h  reason: collision with root package name */
    private static final Pattern f121841h = Pattern.compile("[0-9]{6}");

    /* renamed from: g  reason: collision with root package name */
    private final String f121842g;

    class a implements Parcelable.Creator<BlikPaymentParams> {
        a() {
        }

        /* renamed from: a */
        public BlikPaymentParams createFromParcel(Parcel parcel) {
            return new BlikPaymentParams(parcel);
        }

        /* renamed from: a */
        public BlikPaymentParams[] newArray(int i10) {
            return new BlikPaymentParams[i10];
        }
    }

    public BlikPaymentParams(String str, String str2) {
        super(str, CheckoutConstants.PaymentBrands.BLIK);
        if (str2 == null || f121841h.matcher(str2).matches()) {
            this.f121842g = str2;
            return;
        }
        throw new PaymentException(PaymentError.getBlikError("Blik code is not valid."));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        return Objects.equals(this.f121842g, ((BlikPaymentParams) obj).f121842g);
    }

    public String getBlikCode() {
        return this.f121842g;
    }

    public Map<String, String> getParamsForRequest() {
        Map<String, String> paramsForRequest = super.getParamsForRequest();
        Optional.ofNullable(getBlikCode()).ifPresent(new a(paramsForRequest));
        return paramsForRequest;
    }

    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        String str = this.f121842g;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeString(this.f121842g);
    }

    public BlikPaymentParams(Parcel parcel) {
        super(parcel);
        this.f121842g = parcel.readString();
    }
}

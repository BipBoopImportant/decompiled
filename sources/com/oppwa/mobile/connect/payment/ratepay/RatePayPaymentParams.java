package com.oppwa.mobile.connect.payment.ratepay;

import android.os.Parcel;
import android.os.Parcelable;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutConstants;
import com.oppwa.mobile.connect.payment.PaymentParams;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

public class RatePayPaymentParams extends PaymentParams {
    public static final Parcelable.Creator<RatePayPaymentParams> CREATOR = new a();

    /* renamed from: g  reason: collision with root package name */
    private final Date f121943g;

    class a implements Parcelable.Creator<RatePayPaymentParams> {
        a() {
        }

        /* renamed from: a */
        public RatePayPaymentParams createFromParcel(Parcel parcel) {
            return new RatePayPaymentParams(parcel, (a) null);
        }

        /* renamed from: a */
        public RatePayPaymentParams[] newArray(int i10) {
            return new RatePayPaymentParams[i10];
        }
    }

    /* synthetic */ RatePayPaymentParams(Parcel parcel, a aVar) {
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
        return Objects.equals(this.f121943g, ((RatePayPaymentParams) obj).f121943g);
    }

    public String getDateOfBirth() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
        simpleDateFormat.setLenient(false);
        Date date = this.f121943g;
        if (date != null) {
            return simpleDateFormat.format(date);
        }
        return null;
    }

    public Map<String, String> getParamsForRequest() {
        Map<String, String> paramsForRequest = super.getParamsForRequest();
        String dateOfBirth = getDateOfBirth();
        if (dateOfBirth != null) {
            paramsForRequest.put("customer.birthDate", dateOfBirth);
        }
        return paramsForRequest;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{Integer.valueOf(super.hashCode()), this.f121943g});
    }

    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeLong(this.f121943g.getTime());
    }

    public RatePayPaymentParams(String str, Date date) {
        super(str, CheckoutConstants.PaymentBrands.RATEPAY_INVOICE);
        this.f121943g = date;
    }

    private RatePayPaymentParams(Parcel parcel) {
        super(parcel);
        this.f121943g = new Date(parcel.readLong());
    }
}

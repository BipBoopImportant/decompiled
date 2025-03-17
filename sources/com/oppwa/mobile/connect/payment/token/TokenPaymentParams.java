package com.oppwa.mobile.connect.payment.token;

import android.os.Parcel;
import android.os.Parcelable;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.payment.card.BaseCardPaymentParams;
import com.oppwa.mobile.connect.utils.Utils;
import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.regex.Pattern;

public class TokenPaymentParams extends BaseCardPaymentParams {
    public static final Parcelable.Creator<TokenPaymentParams> CREATOR = new a();

    /* renamed from: k  reason: collision with root package name */
    private static SoftReference<Pattern> f121960k;

    /* renamed from: j  reason: collision with root package name */
    private final String f121961j;

    class a implements Parcelable.Creator<TokenPaymentParams> {
        a() {
        }

        /* renamed from: a */
        public TokenPaymentParams createFromParcel(Parcel parcel) {
            return new TokenPaymentParams(parcel, (a) null);
        }

        /* renamed from: a */
        public TokenPaymentParams[] newArray(int i10) {
            return new TokenPaymentParams[i10];
        }
    }

    /* synthetic */ TokenPaymentParams(Parcel parcel, a aVar) {
        this(parcel);
    }

    private static Pattern e() {
        SoftReference<Pattern> softReference = f121960k;
        if (softReference == null || softReference.get() == null) {
            f121960k = new SoftReference<>(Pattern.compile("[a-zA-Z0-9]{32}"));
        }
        return f121960k.get();
    }

    public static boolean isTokenIdValid(String str) {
        return str != null && e().matcher(str).matches();
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
        return Utils.compare(this.f121961j, ((TokenPaymentParams) obj).f121961j);
    }

    public Map<String, String> getParamsForRequest() {
        Map<String, String> paramsForRequest = super.getParamsForRequest();
        paramsForRequest.put("registrationId", this.f121961j);
        return paramsForRequest;
    }

    public String getTokenId() {
        return this.f121961j;
    }

    public int hashCode() {
        return (super.hashCode() * 31) + this.f121961j.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeString(this.f121961j);
    }

    public TokenPaymentParams(String str, String str2, String str3) {
        super(str, str3);
        if (isTokenIdValid(str2)) {
            this.f121961j = str2;
            return;
        }
        throw new PaymentException(PaymentError.getPaymentParamsTokenInvalidError());
    }

    public TokenPaymentParams(String str, String str2, String str3, String str4) {
        this(str, str2, str3);
        if (str4 == null || BaseCardPaymentParams.isCvvValid(str4)) {
            a(str4);
            return;
        }
        throw new PaymentException(PaymentError.getPaymentParamsCardCvvInvalidError());
    }

    private TokenPaymentParams(Parcel parcel) {
        super(parcel);
        this.f121961j = parcel.readString();
    }
}

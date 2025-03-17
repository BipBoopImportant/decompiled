package com.oppwa.mobile.connect.payment.ikanooi;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutConstants;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.payment.PaymentParams;
import com.oppwa.mobile.connect.utils.Utils;
import java.lang.ref.SoftReference;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

public class IkanoOiPaymentParams extends PaymentParams {
    public static final Parcelable.Creator<IkanoOiPaymentParams> CREATOR = new a();

    /* renamed from: h  reason: collision with root package name */
    private static SoftReference<Pattern> f121876h;

    /* renamed from: i  reason: collision with root package name */
    private static SoftReference<Pattern> f121877i;

    /* renamed from: j  reason: collision with root package name */
    private static SoftReference<Pattern> f121878j;

    /* renamed from: g  reason: collision with root package name */
    private final String f121879g;

    class a implements Parcelable.Creator<IkanoOiPaymentParams> {
        a() {
        }

        /* renamed from: a */
        public IkanoOiPaymentParams createFromParcel(Parcel parcel) {
            return new IkanoOiPaymentParams(parcel, (a) null);
        }

        /* renamed from: a */
        public IkanoOiPaymentParams[] newArray(int i10) {
            return new IkanoOiPaymentParams[i10];
        }
    }

    /* synthetic */ IkanoOiPaymentParams(Parcel parcel, a aVar) {
        this(parcel);
    }

    private static boolean a(String str) {
        if (e().matcher(str).matches()) {
            return a(str, "ddMMyy");
        }
        return false;
    }

    private static boolean b(String str) {
        if (f().matcher(str).matches()) {
            return a(str, "ddMMyy");
        }
        return false;
    }

    private static boolean c(String str) {
        if (g().matcher(str).matches()) {
            return a(str, "yyyyMMdd");
        }
        return false;
    }

    private static Pattern e() {
        SoftReference<Pattern> softReference = f121878j;
        if (softReference == null || softReference.get() == null) {
            f121878j = new SoftReference<>(Pattern.compile("^[0-9]{6}-[a-zA-Z0-9]{4}$"));
        }
        return f121878j.get();
    }

    private static Pattern f() {
        SoftReference<Pattern> softReference = f121877i;
        if (softReference == null || softReference.get() == null) {
            f121877i = new SoftReference<>(Pattern.compile("^[0-9]{11}$"));
        }
        return f121877i.get();
    }

    private static Pattern g() {
        SoftReference<Pattern> softReference = f121876h;
        if (softReference == null || softReference.get() == null) {
            f121876h = new SoftReference<>(Pattern.compile("^[0-9]{12}$"));
        }
        return f121876h.get();
    }

    public static boolean isNationalIdentifierValid(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        str2.hashCode();
        char c10 = 65535;
        switch (str2.hashCode()) {
            case 580579304:
                if (str2.equals(CheckoutConstants.PaymentBrands.IKANOOI_FI)) {
                    c10 = 0;
                    break;
                }
                break;
            case 580579558:
                if (str2.equals(CheckoutConstants.PaymentBrands.IKANOOI_NO)) {
                    c10 = 1;
                    break;
                }
                break;
            case 580579703:
                if (str2.equals(CheckoutConstants.PaymentBrands.IKANOOI_SE)) {
                    c10 = 2;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return a(str);
            case 1:
                return b(str);
            case 2:
                return c(str);
            default:
                return false;
        }
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
        return Utils.compare(this.f121879g, ((IkanoOiPaymentParams) obj).f121879g);
    }

    public String getNationalIdentifier() {
        return this.f121879g;
    }

    public Map<String, String> getParamsForRequest() {
        Map<String, String> paramsForRequest = super.getParamsForRequest();
        paramsForRequest.put("customer.identificationDocId", this.f121879g);
        paramsForRequest.put("customer.identificationDocType", "IDCARD");
        return paramsForRequest;
    }

    public int hashCode() {
        return (super.hashCode() * 31) + this.f121879g.hashCode();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeString(this.f121879g);
    }

    public IkanoOiPaymentParams(String str, String str2, String str3) {
        super(str, str2);
        if (isNationalIdentifierValid(str3, str2)) {
            this.f121879g = str3;
            return;
        }
        throw new PaymentException(PaymentError.getPaymentParamsNationalIdentifierInvalidError());
    }

    private static boolean a(String str, String str2) {
        return b(str.substring(0, str2.length()), str2);
    }

    private static boolean b(String str, String str2) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(str2, Locale.US);
            simpleDateFormat.setLenient(false);
            simpleDateFormat.parse(str);
            return true;
        } catch (ParseException unused) {
            return false;
        }
    }

    private IkanoOiPaymentParams(Parcel parcel) {
        super(parcel);
        this.f121879g = parcel.readString();
    }
}

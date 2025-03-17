package com.oppwa.mobile.connect.payment.stcpay;

import android.os.Parcel;
import android.os.Parcelable;
import com.oppwa.mobile.connect.checkout.dialog.CheckoutConstants;
import com.oppwa.mobile.connect.payment.PaymentParams;
import com.oppwa.mobile.connect.utils.Utils;
import java.lang.ref.SoftReference;
import java.util.Arrays;
import java.util.Map;
import java.util.regex.Pattern;

public class STCPayPaymentParams extends PaymentParams {
    public static final Parcelable.Creator<STCPayPaymentParams> CREATOR = new a();

    /* renamed from: i  reason: collision with root package name */
    private static SoftReference<Pattern> f121944i;

    /* renamed from: g  reason: collision with root package name */
    private STCPayVerificationOption f121945g;

    /* renamed from: h  reason: collision with root package name */
    private byte[] f121946h;

    class a implements Parcelable.Creator<STCPayPaymentParams> {
        a() {
        }

        /* renamed from: a */
        public STCPayPaymentParams createFromParcel(Parcel parcel) {
            return new STCPayPaymentParams(parcel, (a) null);
        }

        /* renamed from: a */
        public STCPayPaymentParams[] newArray(int i10) {
            return new STCPayPaymentParams[i10];
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f121947a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                com.oppwa.mobile.connect.payment.stcpay.STCPayVerificationOption[] r0 = com.oppwa.mobile.connect.payment.stcpay.STCPayVerificationOption.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f121947a = r0
                com.oppwa.mobile.connect.payment.stcpay.STCPayVerificationOption r1 = com.oppwa.mobile.connect.payment.stcpay.STCPayVerificationOption.MOBILE_PHONE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f121947a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.oppwa.mobile.connect.payment.stcpay.STCPayVerificationOption r1 = com.oppwa.mobile.connect.payment.stcpay.STCPayVerificationOption.QR_CODE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.oppwa.mobile.connect.payment.stcpay.STCPayPaymentParams.b.<clinit>():void");
        }
    }

    /* synthetic */ STCPayPaymentParams(Parcel parcel, a aVar) {
        this(parcel);
    }

    private static Pattern e() {
        if (f121944i == null) {
            f121944i = new SoftReference<>(Pattern.compile("^[0-9].*"));
        }
        return f121944i.get();
    }

    public static boolean isMobilePhoneNumberValid(String str) {
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
        STCPayPaymentParams sTCPayPaymentParams = (STCPayPaymentParams) obj;
        return Utils.compare(this.f121945g, sTCPayPaymentParams.f121945g) && Arrays.equals(this.f121946h, sTCPayPaymentParams.f121946h);
    }

    public String getMobilePhoneNumber() {
        return Utils.stringFromBytes(this.f121946h);
    }

    public Map<String, String> getParamsForRequest() {
        Map<String, String> paramsForRequest = super.getParamsForRequest();
        int i10 = b.f121947a[this.f121945g.ordinal()];
        if (i10 == 1) {
            paramsForRequest.put("customParameters[SHOPPER_payment_mode]", "mobile");
            if (this.f121946h != null) {
                paramsForRequest.put("customer.mobile", getMobilePhoneNumber());
            }
        } else if (i10 == 2) {
            paramsForRequest.put("customParameters[SHOPPER_payment_mode]", "qr_code");
        }
        return paramsForRequest;
    }

    public STCPayVerificationOption getVerificationOption() {
        return this.f121945g;
    }

    public int hashCode() {
        int hashCode = super.hashCode() * 31;
        STCPayVerificationOption sTCPayVerificationOption = this.f121945g;
        return ((hashCode + (sTCPayVerificationOption != null ? sTCPayVerificationOption.hashCode() : 0)) * 31) + Arrays.hashCode(this.f121946h);
    }

    public void setMobilePhoneNumber(String str) {
        this.f121946h = Utils.bytesFromString(str);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        parcel.writeParcelable(this.f121945g, 0);
        Utils.writeByteArray(parcel, this.f121946h);
    }

    public STCPayPaymentParams(String str, STCPayVerificationOption sTCPayVerificationOption) {
        super(str, CheckoutConstants.PaymentBrands.STC_PAY);
        int i10 = b.f121947a[sTCPayVerificationOption.ordinal()];
        if (i10 == 1) {
            this.f121945g = STCPayVerificationOption.MOBILE_PHONE;
        } else if (i10 == 2) {
            this.f121945g = STCPayVerificationOption.QR_CODE;
        }
    }

    private STCPayPaymentParams(Parcel parcel) {
        super(parcel);
        this.f121945g = (STCPayVerificationOption) parcel.readParcelable(STCPayVerificationOption.class.getClassLoader());
        this.f121946h = Utils.readByteArray(parcel);
    }
}

package com.oppwa.mobile.connect.payment.card;

import android.os.Parcel;
import com.oppwa.mobile.connect.payment.PaymentParams;
import com.oppwa.mobile.connect.utils.Utils;
import java.util.Arrays;
import java.util.Map;

public abstract class BaseCardPaymentParams extends PaymentParams {

    /* renamed from: g  reason: collision with root package name */
    private byte[] f121844g;

    /* renamed from: h  reason: collision with root package name */
    private Integer f121845h;

    /* renamed from: i  reason: collision with root package name */
    private String f121846i;

    protected BaseCardPaymentParams(String str, String str2) {
        super(str, str2);
    }

    public static boolean isCvvValid(String str) {
        return a.a().matcher(str).matches();
    }

    /* access modifiers changed from: protected */
    public void a(String str) {
        this.f121844g = Utils.bytesFromString(str);
    }

    public int describeContents() {
        return super.describeContents();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        BaseCardPaymentParams baseCardPaymentParams = (BaseCardPaymentParams) obj;
        return Arrays.equals(this.f121844g, baseCardPaymentParams.f121844g) && Utils.compare(this.f121845h, baseCardPaymentParams.f121845h) && Utils.compare(this.f121846i, baseCardPaymentParams.f121846i);
    }

    public String getCvv() {
        return Utils.stringFromBytes(this.f121844g);
    }

    public Integer getNumberOfInstallments() {
        return this.f121845h;
    }

    public Map<String, String> getParamsForRequest() {
        Map<String, String> paramsForRequest = super.getParamsForRequest();
        if (this.f121844g != null) {
            paramsForRequest.put("card.cvv", getCvv());
        }
        Integer num = this.f121845h;
        if (num != null) {
            paramsForRequest.put("recurring.numberOfInstallments", num.toString());
        }
        String str = this.f121846i;
        if (str != null) {
            paramsForRequest.put("threeDSecure.deviceInfo", str);
        }
        paramsForRequest.put("threeDSecure.mobileFlow", "auto");
        return paramsForRequest;
    }

    public String getThreeDS2AuthParams() {
        return this.f121846i;
    }

    public int hashCode() {
        int hashCode = ((super.hashCode() * 31) + Arrays.hashCode(this.f121844g)) * 31;
        Integer num = this.f121845h;
        int i10 = 0;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str = this.f121846i;
        if (str != null) {
            i10 = str.hashCode();
        }
        return hashCode2 + i10;
    }

    public void mask() {
        super.mask();
        if (this.f121844g != null) {
            this.f121844g = Utils.bytesFromString(new String(new char[getCvv().length()]).replace(0, '*'));
        }
    }

    public BaseCardPaymentParams setNumberOfInstallments(Integer num) {
        this.f121845h = num;
        return this;
    }

    public BaseCardPaymentParams setThreeDS2AuthParams(String str) {
        this.f121846i = str;
        return this;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        super.writeToParcel(parcel, i10);
        Utils.writeByteArray(parcel, this.f121844g);
        parcel.writeValue(this.f121845h);
        parcel.writeString(this.f121846i);
    }

    protected BaseCardPaymentParams(Parcel parcel) {
        super(parcel);
        this.f121844g = Utils.readByteArray(parcel);
        this.f121845h = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.f121846i = parcel.readString();
    }
}

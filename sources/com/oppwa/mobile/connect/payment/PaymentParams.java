package com.oppwa.mobile.connect.payment;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.oppwa.mobile.connect.BuildConfig;
import com.oppwa.mobile.connect.checkout.uicomponent.PaymentDetailsUiComponentContainer;
import com.oppwa.mobile.connect.exception.PaymentError;
import com.oppwa.mobile.connect.exception.PaymentException;
import com.oppwa.mobile.connect.provider.Connect;
import java.lang.ref.SoftReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Pattern;

public class PaymentParams implements Parcelable {
    public static final Parcelable.Creator<PaymentParams> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    private static SoftReference<Pattern> f121788f;

    /* renamed from: a  reason: collision with root package name */
    private Connect.ProviderMode f121789a = Connect.ProviderMode.LIVE;

    /* renamed from: b  reason: collision with root package name */
    protected Map<String, String> f121790b;

    /* renamed from: c  reason: collision with root package name */
    private String f121791c;

    /* renamed from: d  reason: collision with root package name */
    private final String f121792d;

    /* renamed from: e  reason: collision with root package name */
    private String f121793e;

    class a implements Parcelable.Creator<PaymentParams> {
        a() {
        }

        /* renamed from: a */
        public PaymentParams createFromParcel(Parcel parcel) {
            return new PaymentParams(parcel);
        }

        /* renamed from: a */
        public PaymentParams[] newArray(int i10) {
            return new PaymentParams[i10];
        }
    }

    public PaymentParams(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            this.f121791c = str;
            this.f121792d = str2;
            this.f121790b = new HashMap();
            return;
        }
        throw new PaymentException(PaymentError.getPaymentParamsCheckoutIdInvalidError());
    }

    private void a(Map<String, String> map, Map<String, String> map2) {
        String str;
        if (map.containsKey("customParameters[SHOPPER_MSDKIntegrationType]")) {
            str = null;
        } else {
            str = "Custom";
        }
        a("customParameters[SHOPPER_MSDKIntegrationType]", str, map2);
        map2.put("customParameters[SHOPPER_OS]", d());
        map2.put("customParameters[SHOPPER_device]", b());
        map2.put("customParameters[SHOPPER_MSDKVersion]", c());
        for (String next : map.keySet()) {
            a(next, map.get(next), map2);
        }
    }

    private static String b() {
        return Build.MANUFACTURER + " " + Build.BRAND + " " + Build.MODEL;
    }

    private static String c() {
        return BuildConfig.VERSION_NAME;
    }

    private static String d() {
        return "Android " + Build.VERSION.RELEASE;
    }

    public boolean addParam(String str, String str2) {
        if (!a().matcher(str).matches() || str2.length() > 2048) {
            return false;
        }
        this.f121790b.put(str, str2);
        return true;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PaymentParams paymentParams = (PaymentParams) obj;
        return this.f121790b.equals(paymentParams.f121790b) && this.f121791c.equals(paymentParams.f121791c) && Objects.equals(this.f121792d, paymentParams.f121792d) && Objects.equals(this.f121793e, paymentParams.f121793e) && Objects.equals(this.f121789a, paymentParams.f121789a);
    }

    public String getCheckoutId() {
        return this.f121791c;
    }

    public Parcelable.Creator<?> getCreator() {
        return CREATOR;
    }

    public Map<String, String> getParamsForRequest() {
        HashMap hashMap = new HashMap();
        String str = this.f121792d;
        if (str != null) {
            hashMap.put(PaymentDetailsUiComponentContainer.ARG_PAYMENT_BRAND, str);
        }
        hashMap.put("source", "MSDK");
        a("shopperResultUrl", this.f121793e, hashMap);
        a(this.f121790b, hashMap);
        return hashMap;
    }

    public String getPaymentBrand() {
        return this.f121792d;
    }

    public Connect.ProviderMode getProviderMode() {
        return this.f121789a;
    }

    public String getShopperResultUrl() {
        return this.f121793e;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f121790b, this.f121791c, this.f121792d, this.f121793e, this.f121789a});
    }

    public void mask() {
    }

    public void removeParam(String str) {
        this.f121790b.remove(str);
    }

    public void setCheckoutId(String str) {
        this.f121791c = str;
    }

    public void setProviderMode(Connect.ProviderMode providerMode) {
        this.f121789a = providerMode;
    }

    public void setShopperResultUrl(String str) {
        this.f121793e = str;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f121791c);
        parcel.writeString(this.f121792d);
        parcel.writeString(this.f121793e);
        parcel.writeString(this.f121789a.name());
        parcel.writeInt(this.f121790b.size());
        if (!this.f121790b.isEmpty()) {
            for (String next : this.f121790b.keySet()) {
                parcel.writeString(next);
                parcel.writeString(this.f121790b.get(next));
            }
        }
    }

    protected PaymentParams(Parcel parcel) {
        this.f121791c = parcel.readString();
        this.f121792d = parcel.readString();
        this.f121793e = parcel.readString();
        this.f121789a = Connect.ProviderMode.valueOf(parcel.readString());
        int readInt = parcel.readInt();
        this.f121790b = new HashMap();
        if (readInt > 0) {
            this.f121790b = new HashMap(readInt);
            for (int i10 = 0; i10 < readInt; i10++) {
                this.f121790b.put(parcel.readString(), parcel.readString());
            }
        }
    }

    /* access modifiers changed from: protected */
    public void a(String str, String str2, Map<String, String> map) {
        if (str2 != null) {
            map.put(str, str2);
        }
    }

    private static Pattern a() {
        SoftReference<Pattern> softReference = f121788f;
        if (softReference == null || softReference.get() == null) {
            f121788f = new SoftReference<>(Pattern.compile("^[a-zA-Z0-9\\._\\]\\[]{2,64}$"));
        }
        return f121788f.get();
    }
}

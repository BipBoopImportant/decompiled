package com.oppwa.mobile.connect.payment;

import android.os.Parcel;
import android.os.Parcelable;
import com.oppwa.mobile.connect.checkout.meta.CheckoutMsdkUi;
import com.oppwa.mobile.connect.payment.processor.affirm.AffirmConfig;
import com.oppwa.mobile.connect.payment.token.Token;
import com.oppwa.mobile.connect.provider.parser.CheckoutInfoResponseParser;
import com.oppwa.mobile.connect.utils.Logger;
import java.util.Arrays;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

public class CheckoutInfo implements Parcelable {
    public static final Parcelable.Creator<CheckoutInfo> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final double f121744a;

    /* renamed from: b  reason: collision with root package name */
    private final String f121745b;

    /* renamed from: c  reason: collision with root package name */
    private final String f121746c;

    /* renamed from: d  reason: collision with root package name */
    private final String[] f121747d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f121748e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f121749f;

    /* renamed from: g  reason: collision with root package name */
    private final Token[] f121750g;

    /* renamed from: h  reason: collision with root package name */
    private final String[] f121751h;

    /* renamed from: i  reason: collision with root package name */
    private final boolean f121752i;

    /* renamed from: j  reason: collision with root package name */
    private final CheckoutMsdkUi f121753j;

    /* renamed from: k  reason: collision with root package name */
    private final String f121754k;

    /* renamed from: l  reason: collision with root package name */
    private String f121755l;

    /* renamed from: m  reason: collision with root package name */
    private String f121756m;

    /* renamed from: n  reason: collision with root package name */
    private final AffirmConfig f121757n;

    public static class Builder {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public String f121758a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public String f121759b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public double f121760c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public String f121761d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public String f121762e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public String[] f121763f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public boolean f121764g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public boolean f121765h;
        /* access modifiers changed from: private */

        /* renamed from: i  reason: collision with root package name */
        public Token[] f121766i;
        /* access modifiers changed from: private */

        /* renamed from: j  reason: collision with root package name */
        public String[] f121767j;
        /* access modifiers changed from: private */

        /* renamed from: k  reason: collision with root package name */
        public boolean f121768k;
        /* access modifiers changed from: private */

        /* renamed from: l  reason: collision with root package name */
        public CheckoutMsdkUi f121769l;
        /* access modifiers changed from: private */

        /* renamed from: m  reason: collision with root package name */
        public String f121770m;
        /* access modifiers changed from: private */

        /* renamed from: n  reason: collision with root package name */
        public AffirmConfig f121771n;

        public CheckoutInfo build() {
            return new CheckoutInfo(this, (a) null);
        }

        public void setAffirmConfig(AffirmConfig affirmConfig) {
            this.f121771n = affirmConfig;
        }

        public Builder setAmount(double d10) {
            this.f121760c = d10;
            return this;
        }

        public Builder setBrands(String[] strArr) {
            this.f121763f = strArr;
            return this;
        }

        public Builder setBrandsActivated(boolean z10) {
            this.f121765h = z10;
            return this;
        }

        public Builder setCollectRedShieldDeviceId(boolean z10) {
            this.f121768k = z10;
            return this;
        }

        public Builder setCountryCode(String str) {
            this.f121762e = str;
            return this;
        }

        public Builder setCurrencyCode(String str) {
            this.f121761d = str;
            return this;
        }

        public Builder setEndpoint(String str) {
            this.f121758a = str;
            return this;
        }

        public Builder setKlarnaMerchantIds(String[] strArr) {
            this.f121767j = strArr;
            return this;
        }

        public Builder setLogLevel(String str) {
            this.f121770m = str;
            return this;
        }

        public Builder setMsdkUi(CheckoutMsdkUi checkoutMsdkUi) {
            this.f121769l = checkoutMsdkUi;
            return this;
        }

        public Builder setResourcePath(String str) {
            this.f121759b = str;
            return this;
        }

        public Builder setShopBrandsOverridden(boolean z10) {
            this.f121764g = z10;
            return this;
        }

        public Builder setTokens(Token[] tokenArr) {
            this.f121766i = tokenArr;
            return this;
        }
    }

    class a implements Parcelable.Creator<CheckoutInfo> {
        a() {
        }

        /* renamed from: a */
        public CheckoutInfo createFromParcel(Parcel parcel) {
            return new CheckoutInfo(parcel, (a) null);
        }

        /* renamed from: a */
        public CheckoutInfo[] newArray(int i10) {
            return new CheckoutInfo[i10];
        }
    }

    /* synthetic */ CheckoutInfo(Parcel parcel, a aVar) {
        this(parcel);
    }

    @Deprecated
    public static CheckoutInfo createCheckoutInfoFromJSON(JSONObject jSONObject) {
        try {
            return (CheckoutInfo) new CheckoutInfoResponseParser().parse(jSONObject.toString());
        } catch (Exception e10) {
            Logger.error((Throwable) e10);
            throw new JSONException(e10.getMessage());
        }
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
        CheckoutInfo checkoutInfo = (CheckoutInfo) obj;
        return Double.compare(checkoutInfo.f121744a, this.f121744a) == 0 && this.f121748e == checkoutInfo.f121748e && this.f121749f == checkoutInfo.f121749f && this.f121752i == checkoutInfo.f121752i && Objects.equals(this.f121745b, checkoutInfo.f121745b) && Objects.equals(this.f121746c, checkoutInfo.f121746c) && Arrays.equals(this.f121747d, checkoutInfo.f121747d) && Arrays.equals(this.f121750g, checkoutInfo.f121750g) && Arrays.equals(this.f121751h, checkoutInfo.f121751h) && this.f121753j == checkoutInfo.f121753j && Objects.equals(this.f121754k, checkoutInfo.f121754k) && Objects.equals(this.f121755l, checkoutInfo.f121755l) && Objects.equals(this.f121756m, checkoutInfo.f121756m) && Objects.equals(this.f121757n, checkoutInfo.f121757n);
    }

    public AffirmConfig getAffirmConfig() {
        return this.f121757n;
    }

    public double getAmount() {
        return this.f121744a;
    }

    public String[] getBrands() {
        return this.f121747d;
    }

    public String getCountryCode() {
        return this.f121746c;
    }

    public String getCurrencyCode() {
        return this.f121745b;
    }

    public String getEndpoint() {
        return this.f121755l;
    }

    public String[] getKlarnaMerchantIds() {
        return this.f121751h;
    }

    public String getLogLevel() {
        return this.f121754k;
    }

    public CheckoutMsdkUi getMsdkUi() {
        return this.f121753j;
    }

    public String getResourcePath() {
        return this.f121756m;
    }

    public Token[] getTokens() {
        return a.a(this.f121750g);
    }

    public int hashCode() {
        return (((((Objects.hash(new Object[]{Double.valueOf(this.f121744a), this.f121745b, this.f121746c, Boolean.valueOf(this.f121748e), Boolean.valueOf(this.f121749f), Boolean.valueOf(this.f121752i), this.f121753j, this.f121754k, this.f121755l, this.f121756m, this.f121757n}) * 31) + Arrays.hashCode(this.f121747d)) * 31) + Arrays.hashCode(this.f121750g)) * 31) + Arrays.hashCode(this.f121751h);
    }

    public boolean isBrandsActivated() {
        return this.f121749f;
    }

    public boolean isCollectRedShieldDeviceId() {
        return this.f121752i;
    }

    public boolean isShopBrandsOverridden() {
        return this.f121748e;
    }

    public void setEndpoint(String str) {
        this.f121755l = str;
    }

    public void setResourcePath(String str) {
        this.f121756m = str;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f121755l);
        parcel.writeString(this.f121756m);
        parcel.writeParcelable(this.f121753j, 0);
        parcel.writeDouble(this.f121744a);
        parcel.writeString(this.f121745b);
        parcel.writeString(this.f121746c);
        parcel.writeByte(this.f121748e ? (byte) 1 : 0);
        parcel.writeByte(this.f121749f ? (byte) 1 : 0);
        parcel.writeStringArray(this.f121747d);
        parcel.writeTypedArray(this.f121750g, i10);
        parcel.writeStringArray(this.f121751h);
        parcel.writeByte(this.f121752i ? (byte) 1 : 0);
        parcel.writeString(this.f121754k);
        parcel.writeParcelable(this.f121757n, 0);
    }

    /* synthetic */ CheckoutInfo(Builder builder, a aVar) {
        this(builder);
    }

    private CheckoutInfo(Builder builder) {
        this.f121755l = builder.f121758a;
        this.f121756m = builder.f121759b;
        this.f121753j = builder.f121769l;
        this.f121744a = builder.f121760c;
        this.f121745b = builder.f121761d;
        this.f121746c = builder.f121762e;
        this.f121748e = builder.f121764g;
        this.f121749f = builder.f121765h;
        this.f121747d = builder.f121763f;
        this.f121750g = builder.f121766i;
        this.f121751h = builder.f121767j;
        this.f121752i = builder.f121768k;
        this.f121754k = builder.f121770m;
        this.f121757n = builder.f121771n;
    }

    private CheckoutInfo(Parcel parcel) {
        this.f121755l = parcel.readString();
        this.f121756m = parcel.readString();
        this.f121753j = (CheckoutMsdkUi) parcel.readParcelable(CheckoutMsdkUi.class.getClassLoader());
        this.f121744a = parcel.readDouble();
        this.f121745b = parcel.readString();
        this.f121746c = parcel.readString();
        boolean z10 = false;
        this.f121748e = parcel.readByte() != 0;
        this.f121749f = parcel.readByte() != 0;
        this.f121747d = parcel.createStringArray();
        this.f121750g = (Token[]) parcel.createTypedArray(Token.CREATOR);
        this.f121751h = parcel.createStringArray();
        this.f121752i = parcel.readByte() != 0 ? true : z10;
        this.f121754k = parcel.readString();
        this.f121757n = (AffirmConfig) parcel.readParcelable(AffirmConfig.class.getClassLoader());
    }
}

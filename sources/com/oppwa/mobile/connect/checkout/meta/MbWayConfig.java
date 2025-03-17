package com.oppwa.mobile.connect.checkout.meta;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

public class MbWayConfig implements Parcelable {
    public static final Parcelable.Creator<MbWayConfig> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private String f121433a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f121434b;

    class a implements Parcelable.Creator<MbWayConfig> {
        a() {
        }

        /* renamed from: a */
        public MbWayConfig createFromParcel(Parcel parcel) {
            return new MbWayConfig(parcel);
        }

        /* renamed from: a */
        public MbWayConfig[] newArray(int i10) {
            return new MbWayConfig[i10];
        }
    }

    public MbWayConfig() {
        this.f121433a = "351";
        this.f121434b = true;
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
        MbWayConfig mbWayConfig = (MbWayConfig) obj;
        return this.f121434b == mbWayConfig.f121434b && this.f121433a.equals(mbWayConfig.f121433a);
    }

    public String getCountryCode() {
        return this.f121433a;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f121433a, Boolean.valueOf(this.f121434b)});
    }

    public boolean isCountryCodeDisplayed() {
        return this.f121434b;
    }

    public MbWayConfig setCountryCode(String str) {
        this.f121433a = str;
        return this;
    }

    public MbWayConfig setCountryCodeDisplayed(boolean z10) {
        this.f121434b = z10;
        return this;
    }

    public String toString() {
        return "MbWayConfig{countryCode='" + this.f121433a + '\'' + ", isCountryCodeDisplayed=" + this.f121434b + '}';
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f121433a);
        parcel.writeByte(this.f121434b ? (byte) 1 : 0);
    }

    protected MbWayConfig(Parcel parcel) {
        this.f121433a = parcel.readString();
        this.f121434b = parcel.readByte() != 0;
    }
}

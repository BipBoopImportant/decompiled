package com.oppwa.mobile.connect.payment;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

public class Merchant implements Parcelable {
    public static final Parcelable.Creator<Merchant> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final String f121786a;

    public static class Builder {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public String f121787a;

        public Merchant build() {
            return new Merchant(this);
        }

        public Builder setName(String str) {
            this.f121787a = str;
            return this;
        }
    }

    class a implements Parcelable.Creator<Merchant> {
        a() {
        }

        /* renamed from: a */
        public Merchant createFromParcel(Parcel parcel) {
            return new Merchant(parcel);
        }

        /* renamed from: a */
        public Merchant[] newArray(int i10) {
            return new Merchant[i10];
        }
    }

    protected Merchant(Parcel parcel) {
        this.f121786a = parcel.readString();
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
        return Objects.equals(this.f121786a, ((Merchant) obj).f121786a);
    }

    public String getName() {
        return this.f121786a;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f121786a});
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f121786a);
    }

    public Merchant(Builder builder) {
        this.f121786a = builder.f121787a;
    }
}

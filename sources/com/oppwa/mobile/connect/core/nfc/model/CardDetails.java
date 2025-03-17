package com.oppwa.mobile.connect.core.nfc.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

public class CardDetails implements Parcelable {
    public static final Parcelable.Creator<CardDetails> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final String f121568a;

    /* renamed from: b  reason: collision with root package name */
    private final String f121569b;

    /* renamed from: c  reason: collision with root package name */
    private final String f121570c;

    class a implements Parcelable.Creator<CardDetails> {
        a() {
        }

        /* renamed from: a */
        public CardDetails createFromParcel(Parcel parcel) {
            return new CardDetails(parcel);
        }

        /* renamed from: a */
        public CardDetails[] newArray(int i10) {
            return new CardDetails[i10];
        }
    }

    public CardDetails(String str, String str2, String str3) {
        this.f121568a = str;
        this.f121569b = str2;
        this.f121570c = str3;
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
        CardDetails cardDetails = (CardDetails) obj;
        return Objects.equals(this.f121568a, cardDetails.f121568a) && Objects.equals(this.f121569b, cardDetails.f121569b) && Objects.equals(this.f121570c, cardDetails.f121570c);
    }

    public String getExpiryMonth() {
        return this.f121569b;
    }

    public String getExpiryYear() {
        return this.f121570c;
    }

    public String getPan() {
        return this.f121568a;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f121568a, this.f121569b, this.f121570c});
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f121568a);
        parcel.writeString(this.f121569b);
        parcel.writeString(this.f121570c);
    }

    protected CardDetails(Parcel parcel) {
        this.f121568a = parcel.readString();
        this.f121569b = parcel.readString();
        this.f121570c = parcel.readString();
    }
}

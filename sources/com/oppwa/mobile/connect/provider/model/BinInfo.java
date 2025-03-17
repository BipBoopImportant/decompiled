package com.oppwa.mobile.connect.provider.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Objects;

public class BinInfo implements Parcelable {
    public static final Parcelable.Creator<BinInfo> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final String[] f122022a;

    /* renamed from: b  reason: collision with root package name */
    private final String f122023b;

    /* renamed from: c  reason: collision with root package name */
    private final String f122024c;

    class a implements Parcelable.Creator<BinInfo> {
        a() {
        }

        /* renamed from: a */
        public BinInfo createFromParcel(Parcel parcel) {
            return new BinInfo(parcel, (a) null);
        }

        /* renamed from: a */
        public BinInfo[] newArray(int i10) {
            return new BinInfo[i10];
        }
    }

    /* synthetic */ BinInfo(Parcel parcel, a aVar) {
        this(parcel);
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
        BinInfo binInfo = (BinInfo) obj;
        return Arrays.equals(this.f122022a, binInfo.f122022a) && Objects.equals(this.f122023b, binInfo.f122023b) && Objects.equals(this.f122024c, binInfo.f122024c);
    }

    public String getBinType() {
        return this.f122023b;
    }

    public String[] getBrands() {
        return this.f122022a;
    }

    public String getType() {
        return this.f122024c;
    }

    public int hashCode() {
        return (Objects.hash(new Object[]{this.f122023b, this.f122024c}) * 31) + Arrays.hashCode(this.f122022a);
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeStringArray(this.f122022a);
        parcel.writeString(this.f122023b);
        parcel.writeString(this.f122024c);
    }

    public BinInfo(String[] strArr, String str, String str2) {
        this.f122022a = strArr;
        this.f122023b = str;
        this.f122024c = str2;
    }

    private BinInfo(Parcel parcel) {
        this.f122022a = parcel.createStringArray();
        this.f122023b = parcel.readString();
        this.f122024c = parcel.readString();
    }
}

package com.oppwa.mobile.connect.payment;

import android.os.Parcel;
import android.os.Parcelable;
import com.oppwa.mobile.connect.utils.Utils;

public class ImageDetail implements Parcelable {
    public static final Parcelable.Creator<ImageDetail> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private String f121780a;

    /* renamed from: b  reason: collision with root package name */
    private String f121781b;

    /* renamed from: c  reason: collision with root package name */
    private String f121782c;

    /* renamed from: d  reason: collision with root package name */
    private String f121783d;

    /* renamed from: e  reason: collision with root package name */
    private String f121784e;

    class a implements Parcelable.Creator<ImageDetail> {
        a() {
        }

        /* renamed from: a */
        public ImageDetail createFromParcel(Parcel parcel) {
            return new ImageDetail(parcel, (a) null);
        }

        /* renamed from: a */
        public ImageDetail[] newArray(int i10) {
            return new ImageDetail[i10];
        }
    }

    /* synthetic */ ImageDetail(Parcel parcel, a aVar) {
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
        ImageDetail imageDetail = (ImageDetail) obj;
        return Utils.compare(this.f121780a, imageDetail.f121780a) && Utils.compare(this.f121781b, imageDetail.f121781b) && Utils.compare(this.f121782c, imageDetail.f121782c) && Utils.compare(this.f121783d, imageDetail.f121783d) && Utils.compare(this.f121784e, imageDetail.f121784e);
    }

    public String getContent() {
        return this.f121784e;
    }

    public String getHeight() {
        return this.f121782c;
    }

    public String getType() {
        return this.f121780a;
    }

    public String getUrl() {
        return this.f121783d;
    }

    public String getWidth() {
        return this.f121781b;
    }

    public int hashCode() {
        String str = this.f121780a;
        int i10 = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f121781b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f121782c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f121783d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f121784e;
        if (str5 != null) {
            i10 = str5.hashCode();
        }
        return hashCode4 + i10;
    }

    public void setContent(String str) {
        this.f121784e = str;
    }

    public void setHeight(String str) {
        this.f121782c = str;
    }

    public void setType(String str) {
        this.f121780a = str;
    }

    public void setUrl(String str) {
        this.f121783d = str;
    }

    public void setWidth(String str) {
        this.f121781b = str;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f121780a);
        parcel.writeString(this.f121781b);
        parcel.writeString(this.f121782c);
        parcel.writeString(this.f121783d);
        parcel.writeString(this.f121784e);
    }

    public ImageDetail() {
    }

    public ImageDetail(String str, String str2, String str3, String str4, String str5) {
        this.f121780a = str;
        this.f121781b = str2;
        this.f121782c = str3;
        this.f121783d = str4;
        this.f121784e = str5;
    }

    private ImageDetail(Parcel parcel) {
        this.f121780a = parcel.readString();
        this.f121781b = parcel.readString();
        this.f121782c = parcel.readString();
        this.f121783d = parcel.readString();
        this.f121784e = parcel.readString();
    }
}

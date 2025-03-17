package com.oppwa.mobile.connect.provider.model.yookassa;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

public class YooKassaInfo implements Parcelable {
    public static final Parcelable.Creator<YooKassaInfo> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final String f122031a;

    /* renamed from: b  reason: collision with root package name */
    private final String f122032b;

    /* renamed from: c  reason: collision with root package name */
    private final YooKassaStatus f122033c;

    class a implements Parcelable.Creator<YooKassaInfo> {
        a() {
        }

        /* renamed from: a */
        public YooKassaInfo createFromParcel(Parcel parcel) {
            return new YooKassaInfo(parcel, (a) null);
        }

        /* renamed from: a */
        public YooKassaInfo[] newArray(int i10) {
            return new YooKassaInfo[i10];
        }
    }

    /* synthetic */ YooKassaInfo(Parcel parcel, a aVar) {
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
        YooKassaInfo yooKassaInfo = (YooKassaInfo) obj;
        return Objects.equals(this.f122031a, yooKassaInfo.f122031a) && Objects.equals(this.f122032b, yooKassaInfo.f122032b) && this.f122033c == yooKassaInfo.f122033c;
    }

    public String getCallbackUrl() {
        return this.f122032b;
    }

    public String getConfirmationUrl() {
        return this.f122031a;
    }

    public YooKassaStatus getStatus() {
        return this.f122033c;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.f122031a, this.f122032b, this.f122033c});
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f122031a);
        parcel.writeString(this.f122032b);
        parcel.writeString(this.f122033c.name());
    }

    public YooKassaInfo(String str, String str2, YooKassaStatus yooKassaStatus) {
        this.f122031a = str;
        this.f122032b = str2;
        this.f122033c = yooKassaStatus == null ? YooKassaStatus.UNDEFINED : yooKassaStatus;
    }

    private YooKassaInfo(Parcel parcel) {
        this.f122031a = parcel.readString();
        this.f122032b = parcel.readString();
        this.f122033c = YooKassaStatus.valueOf(parcel.readString());
    }
}

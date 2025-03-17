package org.maplibre.android.util;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;

public class DefaultStyle implements Parcelable {
    public static final Parcelable.Creator<DefaultStyle> CREATOR = new a();
    @Keep
    private String name;
    @Keep
    private String url;
    @Keep
    private int version;

    class a implements Parcelable.Creator<DefaultStyle> {
        a() {
        }

        /* renamed from: a */
        public DefaultStyle createFromParcel(Parcel parcel) {
            return new DefaultStyle(parcel);
        }

        /* renamed from: b */
        public DefaultStyle[] newArray(int i10) {
            return new DefaultStyle[i10];
        }
    }

    @Keep
    public DefaultStyle(String str, String str2, int i10) {
        c(str);
        b(str2);
        d(i10);
    }

    public String a() {
        return this.name;
    }

    public void b(String str) {
        this.name = str;
    }

    public void c(String str) {
        this.url = str;
    }

    public void d(int i10) {
        this.version = i10;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.url);
        parcel.writeString(this.name);
        parcel.writeInt(this.version);
    }

    protected DefaultStyle(Parcel parcel) {
        c(parcel.readString());
        b(parcel.readString());
        d(parcel.readInt());
    }
}

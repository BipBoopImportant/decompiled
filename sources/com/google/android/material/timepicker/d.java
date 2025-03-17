package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

class d implements Parcelable {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final b f67618a;

    /* renamed from: b  reason: collision with root package name */
    private final b f67619b;

    /* renamed from: c  reason: collision with root package name */
    final int f67620c;

    /* renamed from: d  reason: collision with root package name */
    int f67621d;

    /* renamed from: e  reason: collision with root package name */
    int f67622e;

    /* renamed from: f  reason: collision with root package name */
    int f67623f;

    /* renamed from: g  reason: collision with root package name */
    int f67624g;

    class a implements Parcelable.Creator<d> {
        a() {
        }

        /* renamed from: a */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel);
        }

        /* renamed from: b */
        public d[] newArray(int i10) {
            return new d[i10];
        }
    }

    public d() {
        this(0);
    }

    public static String a(Resources resources, CharSequence charSequence) {
        return b(resources, charSequence, "%02d");
    }

    public static String b(Resources resources, CharSequence charSequence, String str) {
        try {
            return String.format(resources.getConfiguration().locale, str, new Object[]{Integer.valueOf(Integer.parseInt(String.valueOf(charSequence)))});
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    private static int c(int i10) {
        return i10 >= 12 ? 1 : 0;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f67621d == dVar.f67621d && this.f67622e == dVar.f67622e && this.f67620c == dVar.f67620c && this.f67623f == dVar.f67623f;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f67620c), Integer.valueOf(this.f67621d), Integer.valueOf(this.f67622e), Integer.valueOf(this.f67623f)});
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f67621d);
        parcel.writeInt(this.f67622e);
        parcel.writeInt(this.f67623f);
        parcel.writeInt(this.f67620c);
    }

    public d(int i10) {
        this(0, 0, 10, i10);
    }

    public d(int i10, int i11, int i12, int i13) {
        this.f67621d = i10;
        this.f67622e = i11;
        this.f67623f = i12;
        this.f67620c = i13;
        this.f67624g = c(i10);
        this.f67618a = new b(59);
        this.f67619b = new b(i13 == 1 ? 23 : 12);
    }

    protected d(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}

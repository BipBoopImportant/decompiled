package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.a;
import java.util.Arrays;

public class k implements a.c {
    public static final Parcelable.Creator<k> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final long f66627a;

    class a implements Parcelable.Creator<k> {
        a() {
        }

        /* renamed from: a */
        public k createFromParcel(Parcel parcel) {
            return new k(parcel.readLong(), (a) null);
        }

        /* renamed from: b */
        public k[] newArray(int i10) {
            return new k[i10];
        }
    }

    /* synthetic */ k(long j10, a aVar) {
        this(j10);
    }

    public static k a(long j10) {
        return new k(j10);
    }

    public boolean W0(long j10) {
        return j10 <= this.f66627a;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        return this.f66627a == ((k) obj).f66627a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f66627a)});
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f66627a);
    }

    private k(long j10) {
        this.f66627a = j10;
    }
}

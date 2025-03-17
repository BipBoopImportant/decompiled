package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.material.datepicker.a;
import java.util.Arrays;

public class l implements a.c {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* renamed from: a  reason: collision with root package name */
    private final long f66628a;

    class a implements Parcelable.Creator<l> {
        a() {
        }

        /* renamed from: a */
        public l createFromParcel(Parcel parcel) {
            return new l(parcel.readLong(), (a) null);
        }

        /* renamed from: b */
        public l[] newArray(int i10) {
            return new l[i10];
        }
    }

    /* synthetic */ l(long j10, a aVar) {
        this(j10);
    }

    public static l a(long j10) {
        return new l(j10);
    }

    public boolean W0(long j10) {
        return j10 >= this.f66628a;
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        return this.f66628a == ((l) obj).f66628a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f66628a)});
    }

    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f66628a);
    }

    private l(long j10) {
        this.f66628a = j10;
    }
}

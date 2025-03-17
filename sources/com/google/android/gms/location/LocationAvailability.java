package com.google.android.gms.location;

import K9.C6619q;
import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;
import na.s;

public final class LocationAvailability extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationAvailability> CREATOR = new a();

    /* renamed from: f  reason: collision with root package name */
    public static final LocationAvailability f49424f = new LocationAvailability(0, 1, 1, 0, (s[]) null, true);

    /* renamed from: g  reason: collision with root package name */
    public static final LocationAvailability f49425g = new LocationAvailability(1000, 1, 1, 0, (s[]) null, false);

    /* renamed from: a  reason: collision with root package name */
    private final int f49426a;

    /* renamed from: b  reason: collision with root package name */
    private final int f49427b;

    /* renamed from: c  reason: collision with root package name */
    private final long f49428c;

    /* renamed from: d  reason: collision with root package name */
    final int f49429d;

    /* renamed from: e  reason: collision with root package name */
    private final s[] f49430e;

    LocationAvailability(int i10, int i11, int i12, long j10, s[] sVarArr, boolean z10) {
        this.f49429d = i10 < 1000 ? 0 : 1000;
        this.f49426a = i11;
        this.f49427b = i12;
        this.f49428c = j10;
        this.f49430e = sVarArr;
    }

    public boolean equals(Object obj) {
        if (obj instanceof LocationAvailability) {
            LocationAvailability locationAvailability = (LocationAvailability) obj;
            return this.f49426a == locationAvailability.f49426a && this.f49427b == locationAvailability.f49427b && this.f49428c == locationAvailability.f49428c && this.f49429d == locationAvailability.f49429d && Arrays.equals(this.f49430e, locationAvailability.f49430e);
        }
    }

    public int hashCode() {
        return C6619q.c(Integer.valueOf(this.f49429d));
    }

    public String toString() {
        boolean x10 = x();
        StringBuilder sb2 = new StringBuilder(String.valueOf(x10).length() + 22);
        sb2.append("LocationAvailability[");
        sb2.append(x10);
        sb2.append("]");
        return sb2.toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        int i11 = this.f49426a;
        int a10 = c.a(parcel);
        c.n(parcel, 1, i11);
        c.n(parcel, 2, this.f49427b);
        c.r(parcel, 3, this.f49428c);
        c.n(parcel, 4, this.f49429d);
        c.x(parcel, 5, this.f49430e, i10, false);
        c.c(parcel, 6, x());
        c.b(parcel, a10);
    }

    public boolean x() {
        return this.f49429d < 1000;
    }
}

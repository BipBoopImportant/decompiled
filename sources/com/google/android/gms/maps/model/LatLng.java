package com.google.android.gms.maps.model;

import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import qa.q;

public final class LatLng extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLng> CREATOR = new q();

    /* renamed from: a  reason: collision with root package name */
    public final double f49500a;

    /* renamed from: b  reason: collision with root package name */
    public final double f49501b;

    public LatLng(double d10, double d11) {
        if (d11 < -180.0d || d11 >= 180.0d) {
            this.f49501b = ((((d11 - 0.02490234375d) % 360.0d) + 360.0d) % 360.0d) - 0.02490234375d;
        } else {
            this.f49501b = d11;
        }
        this.f49500a = Math.max(-90.0d, Math.min(90.0d, d10));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLng)) {
            return false;
        }
        LatLng latLng = (LatLng) obj;
        return Double.doubleToLongBits(this.f49500a) == Double.doubleToLongBits(latLng.f49500a) && Double.doubleToLongBits(this.f49501b) == Double.doubleToLongBits(latLng.f49501b);
    }

    public int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.f49500a);
        long j10 = doubleToLongBits ^ (doubleToLongBits >>> 32);
        long doubleToLongBits2 = Double.doubleToLongBits(this.f49501b);
        return ((((int) j10) + 31) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
    }

    public String toString() {
        return "lat/lng: (" + this.f49500a + "," + this.f49501b + ")";
    }

    public void writeToParcel(Parcel parcel, int i10) {
        double d10 = this.f49500a;
        int a10 = c.a(parcel);
        c.i(parcel, 2, d10);
        c.i(parcel, 3, this.f49501b);
        c.b(parcel, a10);
    }
}

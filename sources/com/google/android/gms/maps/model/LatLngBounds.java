package com.google.android.gms.maps.model;

import K9.C6619q;
import K9.C6620s;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import qa.p;

public final class LatLngBounds extends L9.a implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new p();

    /* renamed from: a  reason: collision with root package name */
    public final LatLng f49502a;

    /* renamed from: b  reason: collision with root package name */
    public final LatLng f49503b;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private double f49504a = Double.POSITIVE_INFINITY;

        /* renamed from: b  reason: collision with root package name */
        private double f49505b = Double.NEGATIVE_INFINITY;

        /* renamed from: c  reason: collision with root package name */
        private double f49506c = Double.NaN;

        /* renamed from: d  reason: collision with root package name */
        private double f49507d = Double.NaN;

        public LatLngBounds a() {
            C6620s.q(!Double.isNaN(this.f49506c), "no included points");
            return new LatLngBounds(new LatLng(this.f49504a, this.f49506c), new LatLng(this.f49505b, this.f49507d));
        }

        public a b(LatLng latLng) {
            C6620s.m(latLng, "point must not be null");
            this.f49504a = Math.min(this.f49504a, latLng.f49500a);
            this.f49505b = Math.max(this.f49505b, latLng.f49500a);
            double d10 = latLng.f49501b;
            if (Double.isNaN(this.f49506c)) {
                this.f49506c = d10;
                this.f49507d = d10;
            } else {
                double d11 = this.f49506c;
                double d12 = this.f49507d;
                if (d11 > d12 ? !(d11 <= d10 || d10 <= d12) : !(d11 <= d10 && d10 <= d12)) {
                    Parcelable.Creator<LatLngBounds> creator = LatLngBounds.CREATOR;
                    if (((d11 - d10) + 360.0d) % 360.0d < ((d10 - d12) + 360.0d) % 360.0d) {
                        this.f49506c = d10;
                    } else {
                        this.f49507d = d10;
                    }
                }
            }
            return this;
        }
    }

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        C6620s.m(latLng, "southwest must not be null.");
        C6620s.m(latLng2, "northeast must not be null.");
        double d10 = latLng2.f49500a;
        double d11 = latLng.f49500a;
        C6620s.c(d10 >= d11, "southern latitude exceeds northern latitude (%s > %s)", Double.valueOf(d11), Double.valueOf(latLng2.f49500a));
        this.f49502a = latLng;
        this.f49503b = latLng2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.f49502a.equals(latLngBounds.f49502a) && this.f49503b.equals(latLngBounds.f49503b);
    }

    public int hashCode() {
        return C6619q.c(this.f49502a, this.f49503b);
    }

    public String toString() {
        return C6619q.d(this).a("southwest", this.f49502a).a("northeast", this.f49503b).toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        LatLng latLng = this.f49502a;
        int a10 = c.a(parcel);
        c.t(parcel, 2, latLng, i10, false);
        c.t(parcel, 3, this.f49503b, i10, false);
        c.b(parcel, a10);
    }

    public LatLng x() {
        LatLng latLng = this.f49503b;
        LatLng latLng2 = this.f49502a;
        double d10 = latLng2.f49500a + latLng.f49500a;
        double d11 = latLng.f49501b;
        double d12 = latLng2.f49501b;
        if (d12 > d11) {
            d11 += 360.0d;
        }
        return new LatLng(d10 / 2.0d, (d11 + d12) / 2.0d);
    }
}

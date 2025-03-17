package com.google.android.gms.maps.model;

import K9.C6619q;
import K9.C6620s;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import qa.n;

public final class CameraPosition extends L9.a implements ReflectedParcelable {
    public static final Parcelable.Creator<CameraPosition> CREATOR = new n();

    /* renamed from: a  reason: collision with root package name */
    public final LatLng f49492a;

    /* renamed from: b  reason: collision with root package name */
    public final float f49493b;

    /* renamed from: c  reason: collision with root package name */
    public final float f49494c;

    /* renamed from: d  reason: collision with root package name */
    public final float f49495d;

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private LatLng f49496a;

        /* renamed from: b  reason: collision with root package name */
        private float f49497b;

        /* renamed from: c  reason: collision with root package name */
        private float f49498c;

        /* renamed from: d  reason: collision with root package name */
        private float f49499d;

        public a a(float f10) {
            this.f49499d = f10;
            return this;
        }

        public CameraPosition b() {
            return new CameraPosition(this.f49496a, this.f49497b, this.f49498c, this.f49499d);
        }

        public a c(LatLng latLng) {
            this.f49496a = (LatLng) C6620s.m(latLng, "location must not be null.");
            return this;
        }

        public a d(float f10) {
            this.f49498c = f10;
            return this;
        }

        public a e(float f10) {
            this.f49497b = f10;
            return this;
        }
    }

    public CameraPosition(LatLng latLng, float f10, float f11, float f12) {
        C6620s.m(latLng, "camera target must not be null.");
        boolean z10 = false;
        if (f11 >= 0.0f && f11 <= 90.0f) {
            z10 = true;
        }
        C6620s.c(z10, "Tilt needs to be between 0 and 90 inclusive: %s", Float.valueOf(f11));
        this.f49492a = latLng;
        this.f49493b = f10;
        this.f49494c = f11 + 0.0f;
        this.f49495d = (((double) f12) <= 0.0d ? (f12 % 360.0f) + 360.0f : f12) % 360.0f;
    }

    public static a x() {
        return new a();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        return this.f49492a.equals(cameraPosition.f49492a) && Float.floatToIntBits(this.f49493b) == Float.floatToIntBits(cameraPosition.f49493b) && Float.floatToIntBits(this.f49494c) == Float.floatToIntBits(cameraPosition.f49494c) && Float.floatToIntBits(this.f49495d) == Float.floatToIntBits(cameraPosition.f49495d);
    }

    public int hashCode() {
        return C6619q.c(this.f49492a, Float.valueOf(this.f49493b), Float.valueOf(this.f49494c), Float.valueOf(this.f49495d));
    }

    public String toString() {
        return C6619q.d(this).a("target", this.f49492a).a("zoom", Float.valueOf(this.f49493b)).a("tilt", Float.valueOf(this.f49494c)).a("bearing", Float.valueOf(this.f49495d)).toString();
    }

    public void writeToParcel(Parcel parcel, int i10) {
        LatLng latLng = this.f49492a;
        int a10 = c.a(parcel);
        c.t(parcel, 2, latLng, i10, false);
        c.k(parcel, 3, this.f49493b);
        c.k(parcel, 4, this.f49494c);
        c.k(parcel, 5, this.f49495d);
        c.b(parcel, a10);
    }
}

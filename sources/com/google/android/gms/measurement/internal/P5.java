package com.google.android.gms.measurement.internal;

import K9.C6620s;
import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;

public final class P5 extends a {
    public static final Parcelable.Creator<P5> CREATOR = new O5();

    /* renamed from: a  reason: collision with root package name */
    private final int f49911a;

    /* renamed from: b  reason: collision with root package name */
    public final String f49912b;

    /* renamed from: c  reason: collision with root package name */
    public final long f49913c;

    /* renamed from: d  reason: collision with root package name */
    public final Long f49914d;

    /* renamed from: e  reason: collision with root package name */
    public final String f49915e;

    /* renamed from: f  reason: collision with root package name */
    public final String f49916f;

    /* renamed from: g  reason: collision with root package name */
    public final Double f49917g;

    P5(R5 r52) {
        this(r52.f49944c, r52.f49945d, r52.f49946e, r52.f49943b);
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.n(parcel, 1, this.f49911a);
        c.u(parcel, 2, this.f49912b, false);
        c.r(parcel, 3, this.f49913c);
        c.s(parcel, 4, this.f49914d, false);
        c.l(parcel, 5, (Float) null, false);
        c.u(parcel, 6, this.f49915e, false);
        c.u(parcel, 7, this.f49916f, false);
        c.j(parcel, 8, this.f49917g, false);
        c.b(parcel, a10);
    }

    public final Object x() {
        Long l10 = this.f49914d;
        if (l10 != null) {
            return l10;
        }
        Double d10 = this.f49917g;
        if (d10 != null) {
            return d10;
        }
        String str = this.f49915e;
        if (str != null) {
            return str;
        }
        return null;
    }

    P5(String str, long j10, Object obj, String str2) {
        C6620s.f(str);
        this.f49911a = 2;
        this.f49912b = str;
        this.f49913c = j10;
        this.f49916f = str2;
        if (obj == null) {
            this.f49914d = null;
            this.f49917g = null;
            this.f49915e = null;
        } else if (obj instanceof Long) {
            this.f49914d = (Long) obj;
            this.f49917g = null;
            this.f49915e = null;
        } else if (obj instanceof String) {
            this.f49914d = null;
            this.f49917g = null;
            this.f49915e = (String) obj;
        } else if (obj instanceof Double) {
            this.f49914d = null;
            this.f49917g = (Double) obj;
            this.f49915e = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    P5(int i10, String str, long j10, Long l10, Float f10, String str2, String str3, Double d10) {
        this.f49911a = i10;
        this.f49912b = str;
        this.f49913c = j10;
        this.f49914d = l10;
        if (i10 == 1) {
            this.f49917g = f10 != null ? Double.valueOf(f10.doubleValue()) : null;
        } else {
            this.f49917g = d10;
        }
        this.f49915e = str2;
        this.f49916f = str3;
    }
}

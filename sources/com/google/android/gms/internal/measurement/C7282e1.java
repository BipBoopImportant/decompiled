package com.google.android.gms.internal.measurement;

import L9.a;
import L9.c;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.internal.measurement.e1  reason: case insensitive filesystem */
public final class C7282e1 extends a {
    public static final Parcelable.Creator<C7282e1> CREATOR = new C7318i1();

    /* renamed from: a  reason: collision with root package name */
    public final long f48900a;

    /* renamed from: b  reason: collision with root package name */
    public final long f48901b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f48902c;

    /* renamed from: d  reason: collision with root package name */
    public final String f48903d;

    /* renamed from: e  reason: collision with root package name */
    public final String f48904e;

    /* renamed from: f  reason: collision with root package name */
    public final String f48905f;

    /* renamed from: g  reason: collision with root package name */
    public final Bundle f48906g;

    /* renamed from: h  reason: collision with root package name */
    public final String f48907h;

    public C7282e1(long j10, long j11, boolean z10, String str, String str2, String str3, Bundle bundle, String str4) {
        this.f48900a = j10;
        this.f48901b = j11;
        this.f48902c = z10;
        this.f48903d = str;
        this.f48904e = str2;
        this.f48905f = str3;
        this.f48906g = bundle;
        this.f48907h = str4;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.r(parcel, 1, this.f48900a);
        c.r(parcel, 2, this.f48901b);
        c.c(parcel, 3, this.f48902c);
        c.u(parcel, 4, this.f48903d, false);
        c.u(parcel, 5, this.f48904e, false);
        c.u(parcel, 6, this.f48905f, false);
        c.e(parcel, 7, this.f48906g, false);
        c.u(parcel, 8, this.f48907h, false);
        c.b(parcel, a10);
    }
}

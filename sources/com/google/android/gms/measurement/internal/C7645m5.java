package com.google.android.gms.measurement.internal;

import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.measurement.internal.m5  reason: case insensitive filesystem */
public final class C7645m5 extends a {
    public static final Parcelable.Creator<C7645m5> CREATOR = new C7666p5();

    /* renamed from: a  reason: collision with root package name */
    public final String f50239a;

    /* renamed from: b  reason: collision with root package name */
    public final long f50240b;

    /* renamed from: c  reason: collision with root package name */
    public final int f50241c;

    C7645m5(String str, long j10, int i10) {
        this.f50239a = str;
        this.f50240b = j10;
        this.f50241c = i10;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.u(parcel, 1, this.f50239a, false);
        c.r(parcel, 2, this.f50240b);
        c.n(parcel, 3, this.f50241c);
        c.b(parcel, a10);
    }
}

package com.google.android.gms.measurement.internal;

import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.measurement.internal.e  reason: case insensitive filesystem */
public final class C7583e extends a {
    public static final Parcelable.Creator<C7583e> CREATOR = new C7604h();

    /* renamed from: a  reason: collision with root package name */
    public final long f50114a;

    /* renamed from: b  reason: collision with root package name */
    public final int f50115b;

    /* renamed from: c  reason: collision with root package name */
    public final long f50116c;

    C7583e(long j10, int i10, long j11) {
        this.f50114a = j10;
        this.f50115b = i10;
        this.f50116c = j11;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.r(parcel, 1, this.f50114a);
        c.n(parcel, 2, this.f50115b);
        c.r(parcel, 3, this.f50116c);
        c.b(parcel, a10);
    }
}

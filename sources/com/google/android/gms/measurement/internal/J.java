package com.google.android.gms.measurement.internal;

import K9.C6620s;
import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;
import sa.C8751d;

public final class J extends a {
    public static final Parcelable.Creator<J> CREATOR = new C8751d();

    /* renamed from: a  reason: collision with root package name */
    public final String f49672a;

    /* renamed from: b  reason: collision with root package name */
    public final F f49673b;

    /* renamed from: c  reason: collision with root package name */
    public final String f49674c;

    /* renamed from: d  reason: collision with root package name */
    public final long f49675d;

    J(J j10, long j11) {
        C6620s.l(j10);
        this.f49672a = j10.f49672a;
        this.f49673b = j10.f49673b;
        this.f49674c = j10.f49674c;
        this.f49675d = j11;
    }

    public final String toString() {
        String str = this.f49674c;
        String str2 = this.f49672a;
        String valueOf = String.valueOf(this.f49673b);
        return "origin=" + str + ",name=" + str2 + ",params=" + valueOf;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.u(parcel, 2, this.f49672a, false);
        c.t(parcel, 3, this.f49673b, i10, false);
        c.u(parcel, 4, this.f49674c, false);
        c.r(parcel, 5, this.f49675d);
        c.b(parcel, a10);
    }

    public J(String str, F f10, String str2, long j10) {
        this.f49672a = str;
        this.f49673b = f10;
        this.f49674c = str2;
        this.f49675d = j10;
    }
}

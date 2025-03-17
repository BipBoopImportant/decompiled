package com.google.android.gms.measurement.internal;

import L9.a;
import L9.c;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.measurement.internal.t5  reason: case insensitive filesystem */
public final class C7693t5 extends a {
    public static final Parcelable.Creator<C7693t5> CREATOR = new C7686s5();

    /* renamed from: a  reason: collision with root package name */
    public final long f50427a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f50428b;

    /* renamed from: c  reason: collision with root package name */
    public final String f50429c;

    /* renamed from: d  reason: collision with root package name */
    public final Bundle f50430d;

    /* renamed from: e  reason: collision with root package name */
    private final int f50431e;

    /* renamed from: f  reason: collision with root package name */
    public final long f50432f;

    /* renamed from: g  reason: collision with root package name */
    public String f50433g;

    C7693t5(long j10, byte[] bArr, String str, Bundle bundle, int i10, long j11) {
        this(j10, bArr, str, bundle, i10, j11, "");
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.r(parcel, 1, this.f50427a);
        c.g(parcel, 2, this.f50428b, false);
        c.u(parcel, 3, this.f50429c, false);
        c.e(parcel, 4, this.f50430d, false);
        c.n(parcel, 5, this.f50431e);
        c.r(parcel, 6, this.f50432f);
        c.u(parcel, 7, this.f50433g, false);
        c.b(parcel, a10);
    }

    C7693t5(long j10, byte[] bArr, String str, Bundle bundle, int i10, long j11, String str2) {
        this.f50427a = j10;
        this.f50428b = bArr;
        this.f50429c = str;
        this.f50430d = bundle;
        this.f50431e = i10;
        this.f50432f = j11;
        this.f50433g = str2;
    }
}

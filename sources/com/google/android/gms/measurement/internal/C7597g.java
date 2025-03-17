package com.google.android.gms.measurement.internal;

import K9.C6620s;
import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: com.google.android.gms.measurement.internal.g  reason: case insensitive filesystem */
public final class C7597g extends a {
    public static final Parcelable.Creator<C7597g> CREATOR = new C7618j();

    /* renamed from: a  reason: collision with root package name */
    public String f50134a;

    /* renamed from: b  reason: collision with root package name */
    public String f50135b;

    /* renamed from: c  reason: collision with root package name */
    public P5 f50136c;

    /* renamed from: d  reason: collision with root package name */
    public long f50137d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f50138e;

    /* renamed from: f  reason: collision with root package name */
    public String f50139f;

    /* renamed from: g  reason: collision with root package name */
    public J f50140g;

    /* renamed from: h  reason: collision with root package name */
    public long f50141h;

    /* renamed from: i  reason: collision with root package name */
    public J f50142i;

    /* renamed from: j  reason: collision with root package name */
    public long f50143j;

    /* renamed from: k  reason: collision with root package name */
    public J f50144k;

    C7597g(C7597g gVar) {
        C6620s.l(gVar);
        this.f50134a = gVar.f50134a;
        this.f50135b = gVar.f50135b;
        this.f50136c = gVar.f50136c;
        this.f50137d = gVar.f50137d;
        this.f50138e = gVar.f50138e;
        this.f50139f = gVar.f50139f;
        this.f50140g = gVar.f50140g;
        this.f50141h = gVar.f50141h;
        this.f50142i = gVar.f50142i;
        this.f50143j = gVar.f50143j;
        this.f50144k = gVar.f50144k;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.u(parcel, 2, this.f50134a, false);
        c.u(parcel, 3, this.f50135b, false);
        c.t(parcel, 4, this.f50136c, i10, false);
        c.r(parcel, 5, this.f50137d);
        c.c(parcel, 6, this.f50138e);
        c.u(parcel, 7, this.f50139f, false);
        c.t(parcel, 8, this.f50140g, i10, false);
        c.r(parcel, 9, this.f50141h);
        c.t(parcel, 10, this.f50142i, i10, false);
        c.r(parcel, 11, this.f50143j);
        c.t(parcel, 12, this.f50144k, i10, false);
        c.b(parcel, a10);
    }

    C7597g(String str, String str2, P5 p52, long j10, boolean z10, String str3, J j11, long j12, J j13, long j14, J j15) {
        this.f50134a = str;
        this.f50135b = str2;
        this.f50136c = p52;
        this.f50137d = j10;
        this.f50138e = z10;
        this.f50139f = str3;
        this.f50140g = j11;
        this.f50141h = j12;
        this.f50142i = j13;
        this.f50143j = j14;
        this.f50144k = j15;
    }
}

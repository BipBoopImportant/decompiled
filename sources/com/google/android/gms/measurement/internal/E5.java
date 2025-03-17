package com.google.android.gms.measurement.internal;

import K9.C6620s;
import L9.a;
import L9.c;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

public final class E5 extends a {
    public static final Parcelable.Creator<E5> CREATOR = new T5();

    /* renamed from: A  reason: collision with root package name */
    public final String f49589A;

    /* renamed from: B  reason: collision with root package name */
    public final int f49590B;

    /* renamed from: C  reason: collision with root package name */
    public final long f49591C;

    /* renamed from: D  reason: collision with root package name */
    public final String f49592D;

    /* renamed from: E  reason: collision with root package name */
    public final String f49593E;

    /* renamed from: F  reason: collision with root package name */
    public final long f49594F;

    /* renamed from: G  reason: collision with root package name */
    public final int f49595G;

    /* renamed from: a  reason: collision with root package name */
    public final String f49596a;

    /* renamed from: b  reason: collision with root package name */
    public final String f49597b;

    /* renamed from: c  reason: collision with root package name */
    public final String f49598c;

    /* renamed from: d  reason: collision with root package name */
    public final String f49599d;

    /* renamed from: e  reason: collision with root package name */
    public final long f49600e;

    /* renamed from: f  reason: collision with root package name */
    public final long f49601f;

    /* renamed from: g  reason: collision with root package name */
    public final String f49602g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f49603h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f49604i;

    /* renamed from: j  reason: collision with root package name */
    public final long f49605j;

    /* renamed from: k  reason: collision with root package name */
    public final String f49606k;

    /* renamed from: l  reason: collision with root package name */
    public final long f49607l;

    /* renamed from: m  reason: collision with root package name */
    public final int f49608m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f49609n;

    /* renamed from: o  reason: collision with root package name */
    public final boolean f49610o;

    /* renamed from: p  reason: collision with root package name */
    public final String f49611p;

    /* renamed from: q  reason: collision with root package name */
    public final Boolean f49612q;

    /* renamed from: r  reason: collision with root package name */
    public final long f49613r;

    /* renamed from: s  reason: collision with root package name */
    public final List<String> f49614s;

    /* renamed from: t  reason: collision with root package name */
    private final String f49615t;

    /* renamed from: u  reason: collision with root package name */
    public final String f49616u;

    /* renamed from: v  reason: collision with root package name */
    public final String f49617v;

    /* renamed from: w  reason: collision with root package name */
    public final String f49618w;

    /* renamed from: x  reason: collision with root package name */
    public final boolean f49619x;

    /* renamed from: y  reason: collision with root package name */
    public final long f49620y;

    /* renamed from: z  reason: collision with root package name */
    public final int f49621z;

    E5(String str, String str2, String str3, long j10, String str4, long j11, long j12, String str5, boolean z10, boolean z11, String str6, long j13, int i10, boolean z12, boolean z13, String str7, Boolean bool, long j14, List<String> list, String str8, String str9, String str10, String str11, boolean z14, long j15, int i11, String str12, int i12, long j16, String str13, String str14, long j17, int i13) {
        C6620s.f(str);
        this.f49596a = str;
        this.f49597b = TextUtils.isEmpty(str2) ? null : str2;
        this.f49598c = str3;
        this.f49605j = j10;
        this.f49599d = str4;
        this.f49600e = j11;
        this.f49601f = j12;
        this.f49602g = str5;
        this.f49603h = z10;
        this.f49604i = z11;
        this.f49606k = str6;
        this.f49607l = j13;
        this.f49608m = i10;
        this.f49609n = z12;
        this.f49610o = z13;
        this.f49611p = str7;
        this.f49612q = bool;
        this.f49613r = j14;
        this.f49614s = list;
        this.f49615t = null;
        this.f49616u = str9;
        this.f49617v = str10;
        this.f49618w = str11;
        this.f49619x = z14;
        this.f49620y = j15;
        this.f49621z = i11;
        this.f49589A = str12;
        this.f49590B = i12;
        this.f49591C = j16;
        this.f49592D = str13;
        this.f49593E = str14;
        this.f49594F = j17;
        this.f49595G = i13;
    }

    public final void writeToParcel(Parcel parcel, int i10) {
        int a10 = c.a(parcel);
        c.u(parcel, 2, this.f49596a, false);
        c.u(parcel, 3, this.f49597b, false);
        c.u(parcel, 4, this.f49598c, false);
        c.u(parcel, 5, this.f49599d, false);
        c.r(parcel, 6, this.f49600e);
        c.r(parcel, 7, this.f49601f);
        c.u(parcel, 8, this.f49602g, false);
        c.c(parcel, 9, this.f49603h);
        c.c(parcel, 10, this.f49604i);
        c.r(parcel, 11, this.f49605j);
        c.u(parcel, 12, this.f49606k, false);
        c.r(parcel, 14, this.f49607l);
        c.n(parcel, 15, this.f49608m);
        c.c(parcel, 16, this.f49609n);
        c.c(parcel, 18, this.f49610o);
        c.u(parcel, 19, this.f49611p, false);
        c.d(parcel, 21, this.f49612q, false);
        c.r(parcel, 22, this.f49613r);
        c.w(parcel, 23, this.f49614s, false);
        c.u(parcel, 24, this.f49615t, false);
        c.u(parcel, 25, this.f49616u, false);
        c.u(parcel, 26, this.f49617v, false);
        c.u(parcel, 27, this.f49618w, false);
        c.c(parcel, 28, this.f49619x);
        c.r(parcel, 29, this.f49620y);
        c.n(parcel, 30, this.f49621z);
        c.u(parcel, 31, this.f49589A, false);
        c.n(parcel, 32, this.f49590B);
        c.r(parcel, 34, this.f49591C);
        c.u(parcel, 35, this.f49592D, false);
        c.u(parcel, 36, this.f49593E, false);
        c.r(parcel, 37, this.f49594F);
        c.n(parcel, 38, this.f49595G);
        c.b(parcel, a10);
    }

    E5(String str, String str2, String str3, String str4, long j10, long j11, String str5, boolean z10, boolean z11, long j12, String str6, long j13, int i10, boolean z12, boolean z13, String str7, Boolean bool, long j14, List<String> list, String str8, String str9, String str10, String str11, boolean z14, long j15, int i11, String str12, int i12, long j16, String str13, String str14, long j17, int i13) {
        this.f49596a = str;
        this.f49597b = str2;
        this.f49598c = str3;
        this.f49605j = j12;
        this.f49599d = str4;
        this.f49600e = j10;
        this.f49601f = j11;
        this.f49602g = str5;
        this.f49603h = z10;
        this.f49604i = z11;
        this.f49606k = str6;
        this.f49607l = j13;
        this.f49608m = i10;
        this.f49609n = z12;
        this.f49610o = z13;
        this.f49611p = str7;
        this.f49612q = bool;
        this.f49613r = j14;
        this.f49614s = list;
        this.f49615t = str8;
        this.f49616u = str9;
        this.f49617v = str10;
        this.f49618w = str11;
        this.f49619x = z14;
        this.f49620y = j15;
        this.f49621z = i11;
        this.f49589A = str12;
        this.f49590B = i12;
        this.f49591C = j16;
        this.f49592D = str13;
        this.f49593E = str14;
        this.f49594F = j17;
        this.f49595G = i13;
    }
}

package com.google.android.gms.measurement.internal;

import K9.C6620s;

final class G {

    /* renamed from: a  reason: collision with root package name */
    final String f49628a;

    /* renamed from: b  reason: collision with root package name */
    final String f49629b;

    /* renamed from: c  reason: collision with root package name */
    final long f49630c;

    /* renamed from: d  reason: collision with root package name */
    final long f49631d;

    /* renamed from: e  reason: collision with root package name */
    final long f49632e;

    /* renamed from: f  reason: collision with root package name */
    final long f49633f;

    /* renamed from: g  reason: collision with root package name */
    final long f49634g;

    /* renamed from: h  reason: collision with root package name */
    final Long f49635h;

    /* renamed from: i  reason: collision with root package name */
    final Long f49636i;

    /* renamed from: j  reason: collision with root package name */
    final Long f49637j;

    /* renamed from: k  reason: collision with root package name */
    final Boolean f49638k;

    G(String str, String str2, long j10, long j11, long j12, long j13, Long l10, Long l11, Long l12, Boolean bool) {
        this(str, str2, 0, 0, 0, j12, 0, (Long) null, (Long) null, (Long) null, (Boolean) null);
    }

    /* access modifiers changed from: package-private */
    public final G a(long j10) {
        return new G(this.f49628a, this.f49629b, this.f49630c, this.f49631d, this.f49632e, j10, this.f49634g, this.f49635h, this.f49636i, this.f49637j, this.f49638k);
    }

    /* access modifiers changed from: package-private */
    public final G b(long j10, long j11) {
        return new G(this.f49628a, this.f49629b, this.f49630c, this.f49631d, this.f49632e, this.f49633f, j10, Long.valueOf(j11), this.f49636i, this.f49637j, this.f49638k);
    }

    /* access modifiers changed from: package-private */
    public final G c(Long l10, Long l11, Boolean bool) {
        return new G(this.f49628a, this.f49629b, this.f49630c, this.f49631d, this.f49632e, this.f49633f, this.f49634g, this.f49635h, l10, l11, (bool == null || bool.booleanValue()) ? bool : null);
    }

    G(String str, String str2, long j10, long j11, long j12, long j13, long j14, Long l10, Long l11, Long l12, Boolean bool) {
        long j15 = j10;
        long j16 = j11;
        long j17 = j12;
        long j18 = j14;
        C6620s.f(str);
        C6620s.f(str2);
        boolean z10 = false;
        C6620s.a(j15 >= 0);
        C6620s.a(j16 >= 0);
        C6620s.a(j17 >= 0);
        C6620s.a(j18 >= 0 ? true : z10);
        this.f49628a = str;
        this.f49629b = str2;
        this.f49630c = j15;
        this.f49631d = j16;
        this.f49632e = j17;
        this.f49633f = j13;
        this.f49634g = j18;
        this.f49635h = l10;
        this.f49636i = l11;
        this.f49637j = l12;
        this.f49638k = bool;
    }
}

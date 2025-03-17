package com.google.android.gms.measurement.internal;

import K9.C6620s;
import android.content.SharedPreferences;
import android.util.Pair;

/* renamed from: com.google.android.gms.measurement.internal.w2  reason: case insensitive filesystem */
public final class C7711w2 {

    /* renamed from: a  reason: collision with root package name */
    private final String f50455a;

    /* renamed from: b  reason: collision with root package name */
    private final String f50456b;

    /* renamed from: c  reason: collision with root package name */
    private final String f50457c;

    /* renamed from: d  reason: collision with root package name */
    private final long f50458d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ C7683s2 f50459e;

    private final long c() {
        return this.f50459e.H().getLong(this.f50455a, 0);
    }

    private final void d() {
        this.f50459e.k();
        long a10 = this.f50459e.zzb().a();
        SharedPreferences.Editor edit = this.f50459e.H().edit();
        edit.remove(this.f50456b);
        edit.remove(this.f50457c);
        edit.putLong(this.f50455a, a10);
        edit.apply();
    }

    public final Pair<String, Long> a() {
        long j10;
        this.f50459e.k();
        this.f50459e.k();
        long c10 = c();
        if (c10 == 0) {
            d();
            j10 = 0;
        } else {
            j10 = Math.abs(c10 - this.f50459e.zzb().a());
        }
        long j11 = this.f50458d;
        if (j10 < j11) {
            return null;
        }
        if (j10 > (j11 << 1)) {
            d();
            return null;
        }
        String string = this.f50459e.H().getString(this.f50457c, (String) null);
        long j12 = this.f50459e.H().getLong(this.f50456b, 0);
        d();
        return (string == null || j12 <= 0) ? C7683s2.f50356B : new Pair<>(string, Long.valueOf(j12));
    }

    public final void b(String str, long j10) {
        this.f50459e.k();
        if (c() == 0) {
            d();
        }
        if (str == null) {
            str = "";
        }
        long j11 = this.f50459e.H().getLong(this.f50456b, 0);
        if (j11 <= 0) {
            SharedPreferences.Editor edit = this.f50459e.H().edit();
            edit.putString(this.f50457c, str);
            edit.putLong(this.f50456b, 1);
            edit.apply();
            return;
        }
        long j12 = j11 + 1;
        boolean z10 = (this.f50459e.h().R0().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j12;
        SharedPreferences.Editor edit2 = this.f50459e.H().edit();
        if (z10) {
            edit2.putString(this.f50457c, str);
        }
        edit2.putLong(this.f50456b, j12);
        edit2.apply();
    }

    private C7711w2(C7683s2 s2Var, String str, long j10) {
        this.f50459e = s2Var;
        C6620s.f(str);
        C6620s.a(j10 > 0);
        this.f50455a = str + ":start";
        this.f50456b = str + ":count";
        this.f50457c = str + ":value";
        this.f50458d = j10;
    }
}

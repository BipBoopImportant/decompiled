package com.google.android.gms.measurement.internal;

import K9.C6620s;
import android.content.SharedPreferences;

/* renamed from: com.google.android.gms.measurement.internal.x2  reason: case insensitive filesystem */
public final class C7718x2 {

    /* renamed from: a  reason: collision with root package name */
    private final String f50465a;

    /* renamed from: b  reason: collision with root package name */
    private final long f50466b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f50467c;

    /* renamed from: d  reason: collision with root package name */
    private long f50468d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ C7683s2 f50469e;

    public C7718x2(C7683s2 s2Var, String str, long j10) {
        this.f50469e = s2Var;
        C6620s.f(str);
        this.f50465a = str;
        this.f50466b = j10;
    }

    public final long a() {
        if (!this.f50467c) {
            this.f50467c = true;
            this.f50468d = this.f50469e.H().getLong(this.f50465a, this.f50466b);
        }
        return this.f50468d;
    }

    public final void b(long j10) {
        SharedPreferences.Editor edit = this.f50469e.H().edit();
        edit.putLong(this.f50465a, j10);
        edit.apply();
        this.f50468d = j10;
    }
}

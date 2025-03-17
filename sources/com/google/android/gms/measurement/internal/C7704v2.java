package com.google.android.gms.measurement.internal;

import K9.C6620s;
import android.content.SharedPreferences;

/* renamed from: com.google.android.gms.measurement.internal.v2  reason: case insensitive filesystem */
public final class C7704v2 {

    /* renamed from: a  reason: collision with root package name */
    private final String f50443a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f50444b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f50445c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f50446d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ C7683s2 f50447e;

    public C7704v2(C7683s2 s2Var, String str, boolean z10) {
        this.f50447e = s2Var;
        C6620s.f(str);
        this.f50443a = str;
        this.f50444b = z10;
    }

    public final void a(boolean z10) {
        SharedPreferences.Editor edit = this.f50447e.H().edit();
        edit.putBoolean(this.f50443a, z10);
        edit.apply();
        this.f50446d = z10;
    }

    public final boolean b() {
        if (!this.f50445c) {
            this.f50445c = true;
            this.f50446d = this.f50447e.H().getBoolean(this.f50443a, this.f50444b);
        }
        return this.f50446d;
    }
}

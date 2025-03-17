package com.google.android.gms.measurement.internal;

import K9.C6620s;
import android.content.SharedPreferences;

/* renamed from: com.google.android.gms.measurement.internal.y2  reason: case insensitive filesystem */
public final class C7725y2 {

    /* renamed from: a  reason: collision with root package name */
    private final String f50480a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f50481b;

    /* renamed from: c  reason: collision with root package name */
    private String f50482c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ C7683s2 f50483d;

    public C7725y2(C7683s2 s2Var, String str, String str2) {
        this.f50483d = s2Var;
        C6620s.f(str);
        this.f50480a = str;
    }

    public final String a() {
        if (!this.f50481b) {
            this.f50481b = true;
            this.f50482c = this.f50483d.H().getString(this.f50480a, (String) null);
        }
        return this.f50482c;
    }

    public final void b(String str) {
        SharedPreferences.Editor edit = this.f50483d.H().edit();
        edit.putString(this.f50480a, str);
        edit.apply();
        this.f50482c = str;
    }
}

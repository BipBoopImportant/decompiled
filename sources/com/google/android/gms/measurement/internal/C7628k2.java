package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.k2  reason: case insensitive filesystem */
public final class C7628k2 {

    /* renamed from: a  reason: collision with root package name */
    public String f50203a;

    /* renamed from: b  reason: collision with root package name */
    public String f50204b;

    /* renamed from: c  reason: collision with root package name */
    private long f50205c;

    /* renamed from: d  reason: collision with root package name */
    public Bundle f50206d;

    public C7628k2(String str, String str2, Bundle bundle, long j10) {
        this.f50203a = str;
        this.f50204b = str2;
        this.f50206d = bundle == null ? new Bundle() : bundle;
        this.f50205c = j10;
    }

    public static C7628k2 b(J j10) {
        return new C7628k2(j10.f49672a, j10.f49674c, j10.f49673b.J(), j10.f49675d);
    }

    public final J a() {
        return new J(this.f50203a, new F(new Bundle(this.f50206d)), this.f50204b, this.f50205c);
    }

    public final String toString() {
        String str = this.f50204b;
        String str2 = this.f50203a;
        String valueOf = String.valueOf(this.f50206d);
        return "origin=" + str + ",name=" + str2 + ",params=" + valueOf;
    }
}

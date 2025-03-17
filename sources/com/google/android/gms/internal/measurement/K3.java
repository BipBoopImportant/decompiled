package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.net.Uri;
import jb.f;

public final class K3 {

    /* renamed from: a  reason: collision with root package name */
    final String f48705a;

    /* renamed from: b  reason: collision with root package name */
    final Uri f48706b;

    /* renamed from: c  reason: collision with root package name */
    final String f48707c;

    /* renamed from: d  reason: collision with root package name */
    final String f48708d;

    /* renamed from: e  reason: collision with root package name */
    final boolean f48709e;

    /* renamed from: f  reason: collision with root package name */
    final boolean f48710f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f48711g;

    /* renamed from: h  reason: collision with root package name */
    final boolean f48712h;

    /* renamed from: i  reason: collision with root package name */
    final f<Context, Boolean> f48713i;

    public K3(Uri uri) {
        this((String) null, uri, "", "", false, false, false, false, (f<Context, Boolean>) null);
    }

    public final B3<Double> a(String str, double d10) {
        return B3.b(this, str, Double.valueOf(-3.0d), true);
    }

    public final B3<Long> b(String str, long j10) {
        return B3.c(this, str, Long.valueOf(j10), true);
    }

    public final B3<String> c(String str, String str2) {
        return B3.d(this, str, str2, true);
    }

    public final B3<Boolean> d(String str, boolean z10) {
        return B3.a(this, str, Boolean.valueOf(z10), true);
    }

    public final K3 e() {
        return new K3(this.f48705a, this.f48706b, this.f48707c, this.f48708d, this.f48709e, this.f48710f, true, this.f48712h, this.f48713i);
    }

    public final K3 f() {
        if (this.f48707c.isEmpty()) {
            f<Context, Boolean> fVar = this.f48713i;
            if (fVar == null) {
                return new K3(this.f48705a, this.f48706b, this.f48707c, this.f48708d, true, this.f48710f, this.f48711g, this.f48712h, fVar);
            }
            throw new IllegalStateException("Cannot skip gservices both always and conditionally");
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }

    private K3(String str, Uri uri, String str2, String str3, boolean z10, boolean z11, boolean z12, boolean z13, f<Context, Boolean> fVar) {
        this.f48705a = str;
        this.f48706b = uri;
        this.f48707c = str2;
        this.f48708d = str3;
        this.f48709e = z10;
        this.f48710f = z11;
        this.f48711g = z12;
        this.f48712h = z13;
        this.f48713i = fVar;
    }
}

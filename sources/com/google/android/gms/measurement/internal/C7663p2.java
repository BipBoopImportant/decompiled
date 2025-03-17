package com.google.android.gms.measurement.internal;

import K9.C6620s;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.p2  reason: case insensitive filesystem */
final class C7663p2 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final C7642m2 f50275a;

    /* renamed from: b  reason: collision with root package name */
    private final int f50276b;

    /* renamed from: c  reason: collision with root package name */
    private final Throwable f50277c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f50278d;

    /* renamed from: e  reason: collision with root package name */
    private final String f50279e;

    /* renamed from: f  reason: collision with root package name */
    private final Map<String, List<String>> f50280f;

    public final void run() {
        this.f50275a.a(this.f50279e, this.f50276b, this.f50277c, this.f50278d, this.f50280f);
    }

    private C7663p2(String str, C7642m2 m2Var, int i10, Throwable th2, byte[] bArr, Map<String, List<String>> map) {
        C6620s.l(m2Var);
        this.f50275a = m2Var;
        this.f50276b = i10;
        this.f50277c = th2;
        this.f50278d = bArr;
        this.f50279e = str;
        this.f50280f = map;
    }
}

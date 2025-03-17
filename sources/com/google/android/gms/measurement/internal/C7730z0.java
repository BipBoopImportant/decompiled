package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import sa.E;

/* renamed from: com.google.android.gms.measurement.internal.z0  reason: case insensitive filesystem */
final class C7730z0 {

    /* renamed from: a  reason: collision with root package name */
    private final E f50540a;

    C7730z0(E e10) {
        this.f50540a = e10;
    }

    static C7730z0 a(String str) {
        return new C7730z0((TextUtils.isEmpty(str) || str.length() > 1) ? E.UNINITIALIZED : C7671q3.i(str.charAt(0)));
    }

    /* access modifiers changed from: package-private */
    public final E b() {
        return this.f50540a;
    }

    /* access modifiers changed from: package-private */
    public final String c() {
        return String.valueOf(C7671q3.a(this.f50540a));
    }
}

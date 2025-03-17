package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.C7186g0;

/* renamed from: com.google.android.gms.internal.clearcut.a1  reason: case insensitive filesystem */
final class C7167a1 implements K0 {

    /* renamed from: a  reason: collision with root package name */
    private final M0 f48292a;

    /* renamed from: b  reason: collision with root package name */
    private final String f48293b;

    /* renamed from: c  reason: collision with root package name */
    private final C7171b1 f48294c;

    C7167a1(M0 m02, String str, Object[] objArr) {
        this.f48292a = m02;
        this.f48293b = str;
        this.f48294c = new C7171b1(m02.getClass(), str, objArr);
    }

    public final int a() {
        return (this.f48294c.f48315d & 1) == 1 ? C7186g0.e.f48389i : C7186g0.e.f48390j;
    }

    public final boolean b() {
        return (this.f48294c.f48315d & 2) == 2;
    }

    public final M0 c() {
        return this.f48292a;
    }

    public final int d() {
        return this.f48294c.f48316e;
    }

    /* access modifiers changed from: package-private */
    public final C7171b1 e() {
        return this.f48294c;
    }

    public final int f() {
        return this.f48294c.f48319h;
    }

    public final int g() {
        return this.f48294c.f48320i;
    }

    public final int h() {
        return this.f48294c.f48321j;
    }

    public final int i() {
        return this.f48294c.f48324m;
    }

    /* access modifiers changed from: package-private */
    public final int[] j() {
        return this.f48294c.f48325n;
    }

    public final int k() {
        return this.f48294c.f48323l;
    }

    public final int l() {
        return this.f48294c.f48322k;
    }
}

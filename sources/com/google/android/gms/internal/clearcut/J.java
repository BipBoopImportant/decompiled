package com.google.android.gms.internal.clearcut;

public abstract class J {

    /* renamed from: a  reason: collision with root package name */
    private int f48196a;

    /* renamed from: b  reason: collision with root package name */
    private int f48197b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f48198c;

    private J() {
        this.f48196a = 100;
        this.f48197b = Integer.MAX_VALUE;
        this.f48198c = false;
    }

    public static long a(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    static J b(byte[] bArr, int i10, int i11, boolean z10) {
        L l10 = new L(bArr, 0, i11, false);
        try {
            l10.d(i11);
            return l10;
        } catch (C7204m0 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static int e(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public abstract int c();

    public abstract int d(int i10);
}

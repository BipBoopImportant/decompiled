package com.google.android.gms.internal.vision;

/* renamed from: com.google.android.gms.internal.vision.v0  reason: case insensitive filesystem */
public abstract class C7541v0 {

    /* renamed from: a  reason: collision with root package name */
    int f49403a;

    /* renamed from: b  reason: collision with root package name */
    private int f49404b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f49405c;

    private C7541v0() {
        this.f49403a = 100;
        this.f49404b = Integer.MAX_VALUE;
        this.f49405c = false;
    }

    public static long a(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    static C7541v0 b(byte[] bArr, int i10, int i11, boolean z10) {
        C7544w0 w0Var = new C7544w0(bArr, i11);
        try {
            w0Var.c(i11);
            return w0Var;
        } catch (Z0 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static int d(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public abstract int c(int i10);

    public abstract int e();
}

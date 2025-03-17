package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.q4  reason: case insensitive filesystem */
public abstract class C7390q4 {

    /* renamed from: b  reason: collision with root package name */
    private static volatile int f49046b = 100;

    /* renamed from: a  reason: collision with root package name */
    private int f49047a;

    public static long b(long j10) {
        return (-(j10 & 1)) ^ (j10 >>> 1);
    }

    static C7390q4 c(byte[] bArr, int i10, int i11, boolean z10) {
        C7382p4 p4Var = new C7382p4(bArr, i11);
        try {
            p4Var.a(i11);
            return p4Var;
        } catch (U4 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static int e(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public abstract int a(int i10);

    public abstract int d();

    private C7390q4() {
        this.f49047a = f49046b;
    }
}

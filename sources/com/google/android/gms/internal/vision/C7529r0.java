package com.google.android.gms.internal.vision;

/* renamed from: com.google.android.gms.internal.vision.r0  reason: case insensitive filesystem */
final class C7529r0 {

    /* renamed from: a  reason: collision with root package name */
    private final C7547x0 f49392a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f49393b;

    private C7529r0(int i10) {
        byte[] bArr = new byte[i10];
        this.f49393b = bArr;
        this.f49392a = C7547x0.f(bArr);
    }

    public final C7497i0 a() {
        this.f49392a.N();
        return new C7535t0(this.f49393b);
    }

    public final C7547x0 b() {
        return this.f49392a;
    }

    /* synthetic */ C7529r0(int i10, C7493h0 h0Var) {
        this(i10);
    }
}

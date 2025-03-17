package com.google.android.gms.internal.vision;

/* renamed from: com.google.android.gms.internal.vision.w0  reason: case insensitive filesystem */
final class C7544w0 extends C7541v0 {

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f49406d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f49407e;

    /* renamed from: f  reason: collision with root package name */
    private int f49408f;

    /* renamed from: g  reason: collision with root package name */
    private int f49409g;

    /* renamed from: h  reason: collision with root package name */
    private int f49410h;

    /* renamed from: i  reason: collision with root package name */
    private int f49411i;

    /* renamed from: j  reason: collision with root package name */
    private int f49412j;

    private C7544w0(byte[] bArr, int i10, int i11, boolean z10) {
        super();
        this.f49412j = Integer.MAX_VALUE;
        this.f49406d = bArr;
        this.f49408f = i11 + i10;
        this.f49410h = i10;
        this.f49411i = i10;
        this.f49407e = z10;
    }

    private final void f() {
        int i10 = this.f49408f + this.f49409g;
        this.f49408f = i10;
        int i11 = i10 - this.f49411i;
        int i12 = this.f49412j;
        if (i11 > i12) {
            int i13 = i11 - i12;
            this.f49409g = i13;
            this.f49408f = i10 - i13;
            return;
        }
        this.f49409g = 0;
    }

    public final int c(int i10) {
        if (i10 >= 0) {
            int e10 = i10 + e();
            int i11 = this.f49412j;
            if (e10 <= i11) {
                this.f49412j = e10;
                f();
                return i11;
            }
            throw Z0.a();
        }
        throw Z0.b();
    }

    public final int e() {
        return this.f49410h - this.f49411i;
    }
}

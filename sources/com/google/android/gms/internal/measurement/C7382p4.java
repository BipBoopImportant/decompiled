package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.p4  reason: case insensitive filesystem */
final class C7382p4 extends C7390q4 {

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f49034c;

    /* renamed from: d  reason: collision with root package name */
    private int f49035d;

    /* renamed from: e  reason: collision with root package name */
    private int f49036e;

    /* renamed from: f  reason: collision with root package name */
    private int f49037f;

    /* renamed from: g  reason: collision with root package name */
    private int f49038g;

    /* renamed from: h  reason: collision with root package name */
    private int f49039h;

    private final void f() {
        int i10 = this.f49035d + this.f49036e;
        this.f49035d = i10;
        int i11 = i10 - this.f49038g;
        int i12 = this.f49039h;
        if (i11 > i12) {
            int i13 = i11 - i12;
            this.f49036e = i13;
            this.f49035d = i10 - i13;
            return;
        }
        this.f49036e = 0;
    }

    public final int a(int i10) {
        if (i10 >= 0) {
            int d10 = i10 + d();
            if (d10 >= 0) {
                int i11 = this.f49039h;
                if (d10 <= i11) {
                    this.f49039h = d10;
                    f();
                    return i11;
                }
                throw U4.g();
            }
            throw U4.e();
        }
        throw U4.d();
    }

    public final int d() {
        return this.f49037f - this.f49038g;
    }

    private C7382p4(byte[] bArr, int i10, int i11, boolean z10) {
        super();
        this.f49039h = Integer.MAX_VALUE;
        this.f49034c = bArr;
        this.f49035d = i11 + i10;
        this.f49037f = i10;
        this.f49038g = i10;
    }
}

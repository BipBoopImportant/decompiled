package com.google.android.gms.internal.clearcut;

final class L extends J {

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f48201d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f48202e;

    /* renamed from: f  reason: collision with root package name */
    private int f48203f;

    /* renamed from: g  reason: collision with root package name */
    private int f48204g;

    /* renamed from: h  reason: collision with root package name */
    private int f48205h;

    /* renamed from: i  reason: collision with root package name */
    private int f48206i;

    /* renamed from: j  reason: collision with root package name */
    private int f48207j;

    private L(byte[] bArr, int i10, int i11, boolean z10) {
        super();
        this.f48207j = Integer.MAX_VALUE;
        this.f48201d = bArr;
        this.f48203f = i11 + i10;
        this.f48205h = i10;
        this.f48206i = i10;
        this.f48202e = z10;
    }

    public final int c() {
        return this.f48205h - this.f48206i;
    }

    public final int d(int i10) {
        if (i10 >= 0) {
            int c10 = i10 + c();
            int i11 = this.f48207j;
            if (c10 <= i11) {
                this.f48207j = c10;
                int i12 = this.f48203f + this.f48204g;
                this.f48203f = i12;
                int i13 = i12 - this.f48206i;
                if (i13 > c10) {
                    int i14 = i13 - c10;
                    this.f48204g = i14;
                    this.f48203f = i12 - i14;
                } else {
                    this.f48204g = 0;
                }
                return i11;
            }
            throw C7204m0.a();
        }
        throw new C7204m0("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }
}

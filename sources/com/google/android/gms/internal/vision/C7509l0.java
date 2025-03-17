package com.google.android.gms.internal.vision;

/* renamed from: com.google.android.gms.internal.vision.l0  reason: case insensitive filesystem */
final class C7509l0 extends C7535t0 {

    /* renamed from: f  reason: collision with root package name */
    private final int f49347f;

    /* renamed from: g  reason: collision with root package name */
    private final int f49348g;

    C7509l0(byte[] bArr, int i10, int i11) {
        super(bArr);
        C7497i0.y(i10, i10 + i11, bArr.length);
        this.f49347f = i10;
        this.f49348g = i11;
    }

    /* access modifiers changed from: protected */
    public final int E() {
        return this.f49347f;
    }

    public final byte b(int i10) {
        int i11 = i();
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return this.f49398e[this.f49347f + i10];
        }
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(22);
            sb2.append("Index < 0: ");
            sb2.append(i10);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(40);
        sb3.append("Index > length: ");
        sb3.append(i10);
        sb3.append(", ");
        sb3.append(i11);
        throw new ArrayIndexOutOfBoundsException(sb3.toString());
    }

    public final int i() {
        return this.f49348g;
    }

    /* access modifiers changed from: package-private */
    public final byte t(int i10) {
        return this.f49398e[this.f49347f + i10];
    }
}

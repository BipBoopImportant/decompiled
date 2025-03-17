package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.i4  reason: case insensitive filesystem */
final class C7321i4 extends C7348l4 {

    /* renamed from: e  reason: collision with root package name */
    private final int f48947e;

    /* renamed from: f  reason: collision with root package name */
    private final int f48948f;

    C7321i4(byte[] bArr, int i10, int i11) {
        super(bArr);
        C7276d4.k(i10, i10 + i11, bArr.length);
        this.f48947e = i10;
        this.f48948f = i11;
    }

    /* access modifiers changed from: protected */
    public final int C() {
        return this.f48947e;
    }

    public final byte b(int i10) {
        int x10 = x();
        if (((x10 - (i10 + 1)) | i10) >= 0) {
            return this.f48997d[this.f48947e + i10];
        }
        if (i10 < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i10);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i10 + ", " + x10);
    }

    /* access modifiers changed from: package-private */
    public final byte t(int i10) {
        return this.f48997d[this.f48947e + i10];
    }

    public final int x() {
        return this.f48948f;
    }
}

package com.google.android.gms.internal.clearcut;

final class D extends H {

    /* renamed from: e  reason: collision with root package name */
    private final int f48187e;

    /* renamed from: f  reason: collision with root package name */
    private final int f48188f;

    D(byte[] bArr, int i10, int i11) {
        super(bArr);
        A.q(i10, i10 + i11, bArr.length);
        this.f48187e = i10;
        this.f48188f = i11;
    }

    /* access modifiers changed from: protected */
    public final int B() {
        return this.f48187e;
    }

    public final int size() {
        return this.f48188f;
    }

    public final byte t(int i10) {
        int size = size();
        if (((size - (i10 + 1)) | i10) >= 0) {
            return this.f48195d[this.f48187e + i10];
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
        sb3.append(size);
        throw new ArrayIndexOutOfBoundsException(sb3.toString());
    }
}

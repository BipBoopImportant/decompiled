package com.google.android.gms.internal.vision;

abstract class u2 {
    u2() {
    }

    /* access modifiers changed from: package-private */
    public abstract int a(int i10, byte[] bArr, int i11, int i12);

    /* access modifiers changed from: package-private */
    public abstract int b(CharSequence charSequence, byte[] bArr, int i10, int i11);

    /* access modifiers changed from: package-private */
    public final boolean c(byte[] bArr, int i10, int i11) {
        return a(0, bArr, i10, i11) == 0;
    }

    /* access modifiers changed from: package-private */
    public abstract String d(byte[] bArr, int i10, int i11);
}

package com.google.android.gms.internal.clearcut;

import java.io.IOException;

public class X1 {

    /* renamed from: a  reason: collision with root package name */
    protected volatile int f48281a = -1;

    public static final void b(X1 x12, byte[] bArr, int i10, int i11) {
        try {
            R1 t10 = R1.t(bArr, 0, i11);
            x12.a(t10);
            t10.p();
        } catch (IOException e10) {
            throw new RuntimeException("Serializing to a byte array threw an IOException (should never happen).", e10);
        }
    }

    public void a(R1 r12) {
    }

    public final int c() {
        int d10 = d();
        this.f48281a = d10;
        return d10;
    }

    /* access modifiers changed from: protected */
    public int d() {
        return 0;
    }

    /* renamed from: e */
    public X1 clone() {
        return (X1) super.clone();
    }

    public String toString() {
        return Z1.a(this);
    }
}

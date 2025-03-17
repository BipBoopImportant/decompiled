package com.google.android.gms.internal.vision;

import java.nio.charset.Charset;

/* renamed from: com.google.android.gms.internal.vision.t0  reason: case insensitive filesystem */
class C7535t0 extends C7527q0 {

    /* renamed from: e  reason: collision with root package name */
    protected final byte[] f49398e;

    C7535t0(byte[] bArr) {
        bArr.getClass();
        this.f49398e = bArr;
    }

    /* access modifiers changed from: package-private */
    public final boolean D(C7497i0 i0Var, int i10, int i11) {
        if (i11 > i0Var.i()) {
            int i12 = i();
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Length too large: ");
            sb2.append(i11);
            sb2.append(i12);
            throw new IllegalArgumentException(sb2.toString());
        } else if (i11 > i0Var.i()) {
            int i13 = i0Var.i();
            StringBuilder sb3 = new StringBuilder(59);
            sb3.append("Ran off end of other: 0, ");
            sb3.append(i11);
            sb3.append(", ");
            sb3.append(i13);
            throw new IllegalArgumentException(sb3.toString());
        } else if (!(i0Var instanceof C7535t0)) {
            return i0Var.m(0, i11).equals(m(0, i11));
        } else {
            C7535t0 t0Var = (C7535t0) i0Var;
            byte[] bArr = this.f49398e;
            byte[] bArr2 = t0Var.f49398e;
            int E10 = E() + i11;
            int E11 = E();
            int E12 = t0Var.E();
            while (E11 < E10) {
                if (bArr[E11] != bArr2[E12]) {
                    return false;
                }
                E11++;
                E12++;
            }
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public int E() {
        return 0;
    }

    public byte b(int i10) {
        return this.f49398e[i10];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7497i0) || i() != ((C7497i0) obj).i()) {
            return false;
        }
        if (i() == 0) {
            return true;
        }
        if (!(obj instanceof C7535t0)) {
            return obj.equals(this);
        }
        C7535t0 t0Var = (C7535t0) obj;
        int C10 = C();
        int C11 = t0Var.C();
        if (C10 == 0 || C11 == 0 || C10 == C11) {
            return D(t0Var, 0, i());
        }
        return false;
    }

    public int i() {
        return this.f49398e.length;
    }

    /* access modifiers changed from: protected */
    public final int k(int i10, int i11, int i12) {
        return U0.a(i10, this.f49398e, E(), i12);
    }

    public final C7497i0 m(int i10, int i11) {
        int y10 = C7497i0.y(0, i11, i());
        return y10 == 0 ? C7497i0.f49335b : new C7509l0(this.f49398e, E(), y10);
    }

    /* access modifiers changed from: protected */
    public final String r(Charset charset) {
        return new String(this.f49398e, E(), i(), charset);
    }

    /* access modifiers changed from: package-private */
    public final void s(C7485f0 f0Var) {
        f0Var.a(this.f49398e, E(), i());
    }

    /* access modifiers changed from: package-private */
    public byte t(int i10) {
        return this.f49398e[i10];
    }

    public final boolean zzc() {
        int E10 = E();
        return t2.g(this.f49398e, E10, i() + E10);
    }
}

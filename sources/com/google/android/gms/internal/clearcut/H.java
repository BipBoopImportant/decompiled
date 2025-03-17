package com.google.android.gms.internal.clearcut;

import java.nio.charset.Charset;

class H extends G {

    /* renamed from: d  reason: collision with root package name */
    protected final byte[] f48195d;

    H(byte[] bArr) {
        this.f48195d = bArr;
    }

    /* access modifiers changed from: package-private */
    public final boolean A(A a10, int i10, int i11) {
        if (i11 > a10.size()) {
            int size = size();
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Length too large: ");
            sb2.append(i11);
            sb2.append(size);
            throw new IllegalArgumentException(sb2.toString());
        } else if (i11 > a10.size()) {
            int size2 = a10.size();
            StringBuilder sb3 = new StringBuilder(59);
            sb3.append("Ran off end of other: 0, ");
            sb3.append(i11);
            sb3.append(", ");
            sb3.append(size2);
            throw new IllegalArgumentException(sb3.toString());
        } else if (!(a10 instanceof H)) {
            return a10.i(0, i11).equals(i(0, i11));
        } else {
            H h10 = (H) a10;
            byte[] bArr = this.f48195d;
            byte[] bArr2 = h10.f48195d;
            int B10 = B() + i11;
            int B11 = B();
            int B12 = h10.B();
            while (B11 < B10) {
                if (bArr[B11] != bArr2[B12]) {
                    return false;
                }
                B11++;
                B12++;
            }
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public int B() {
        return 0;
    }

    /* access modifiers changed from: protected */
    public final int b(int i10, int i11, int i12) {
        return C7192i0.c(i10, this.f48195d, B(), i12);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof A) || size() != ((A) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof H)) {
            return obj.equals(this);
        }
        H h10 = (H) obj;
        int p10 = p();
        int p11 = h10.p();
        if (p10 == 0 || p11 == 0 || p10 == p11) {
            return A(h10, 0, size());
        }
        return false;
    }

    public final A i(int i10, int i11) {
        int q10 = A.q(0, i11, size());
        return q10 == 0 ? A.f48133b : new D(this.f48195d, B(), q10);
    }

    /* access modifiers changed from: protected */
    public final String j(Charset charset) {
        return new String(this.f48195d, B(), size(), charset);
    }

    /* access modifiers changed from: package-private */
    public final void k(C7241z zVar) {
        zVar.a(this.f48195d, B(), size());
    }

    public final boolean m() {
        int B10 = B();
        return E1.i(this.f48195d, B10, size() + B10);
    }

    public int size() {
        return this.f48195d.length;
    }

    public byte t(int i10) {
        return this.f48195d[i10];
    }
}

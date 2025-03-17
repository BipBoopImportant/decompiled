package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.l4  reason: case insensitive filesystem */
class C7348l4 extends C7357m4 {

    /* renamed from: d  reason: collision with root package name */
    protected final byte[] f48997d;

    C7348l4(byte[] bArr) {
        super();
        bArr.getClass();
        this.f48997d = bArr;
    }

    /* access modifiers changed from: package-private */
    public final boolean B(C7276d4 d4Var, int i10, int i11) {
        if (i11 > d4Var.x()) {
            int x10 = x();
            throw new IllegalArgumentException("Length too large: " + i11 + x10);
        } else if (i11 > d4Var.x()) {
            int x11 = d4Var.x();
            throw new IllegalArgumentException("Ran off end of other: " + 0 + ", " + i11 + ", " + x11);
        } else if (!(d4Var instanceof C7348l4)) {
            return d4Var.m(0, i11).equals(m(0, i11));
        } else {
            C7348l4 l4Var = (C7348l4) d4Var;
            byte[] bArr = this.f48997d;
            byte[] bArr2 = l4Var.f48997d;
            int C10 = C() + i11;
            int C11 = C();
            int C12 = l4Var.C();
            while (C11 < C10) {
                if (bArr[C11] != bArr2[C12]) {
                    return false;
                }
                C11++;
                C12++;
            }
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public int C() {
        return 0;
    }

    public byte b(int i10) {
        return this.f48997d[i10];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7276d4) || x() != ((C7276d4) obj).x()) {
            return false;
        }
        if (x() == 0) {
            return true;
        }
        if (!(obj instanceof C7348l4)) {
            return obj.equals(this);
        }
        C7348l4 l4Var = (C7348l4) obj;
        int i10 = i();
        int i11 = l4Var.i();
        if (i10 == 0 || i11 == 0 || i10 == i11) {
            return B(l4Var, 0, x());
        }
        return false;
    }

    public final C7276d4 m(int i10, int i11) {
        int k10 = C7276d4.k(0, i11, x());
        return k10 == 0 ? C7276d4.f48892b : new C7321i4(this.f48997d, C(), k10);
    }

    /* access modifiers changed from: package-private */
    public final void s(C7249a4 a4Var) {
        a4Var.a(this.f48997d, C(), x());
    }

    /* access modifiers changed from: package-private */
    public byte t(int i10) {
        return this.f48997d[i10];
    }

    public int x() {
        return this.f48997d.length;
    }

    /* access modifiers changed from: protected */
    public final int y(int i10, int i11, int i12) {
        return O4.a(i10, this.f48997d, C(), i12);
    }
}

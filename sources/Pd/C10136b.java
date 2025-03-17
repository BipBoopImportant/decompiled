package pd;

/* renamed from: pd.b  reason: case insensitive filesystem */
final class C10136b {

    /* renamed from: a  reason: collision with root package name */
    private final C10135a f75849a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f75850b;

    C10136b(C10135a aVar, int[] iArr) {
        if (iArr.length != 0) {
            this.f75849a = aVar;
            int length = iArr.length;
            int i10 = 1;
            if (length <= 1 || iArr[0] != 0) {
                this.f75850b = iArr;
                return;
            }
            while (i10 < length && iArr[i10] == 0) {
                i10++;
            }
            if (i10 == length) {
                this.f75850b = new int[]{0};
                return;
            }
            int[] iArr2 = new int[(length - i10)];
            this.f75850b = iArr2;
            System.arraycopy(iArr, i10, iArr2, 0, iArr2.length);
            return;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: package-private */
    public C10136b a(C10136b bVar) {
        if (!this.f75849a.equals(bVar.f75849a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (f()) {
            return bVar;
        } else {
            if (bVar.f()) {
                return this;
            }
            int[] iArr = this.f75850b;
            int[] iArr2 = bVar.f75850b;
            if (iArr.length <= iArr2.length) {
                int[] iArr3 = iArr;
                iArr = iArr2;
                iArr2 = iArr3;
            }
            int[] iArr4 = new int[iArr.length];
            int length = iArr.length - iArr2.length;
            System.arraycopy(iArr, 0, iArr4, 0, length);
            for (int i10 = length; i10 < iArr.length; i10++) {
                iArr4[i10] = C10135a.a(iArr2[i10 - length], iArr[i10]);
            }
            return new C10136b(this.f75849a, iArr4);
        }
    }

    /* access modifiers changed from: package-private */
    public C10136b[] b(C10136b bVar) {
        if (!this.f75849a.equals(bVar.f75849a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (!bVar.f()) {
            C10136b e10 = this.f75849a.e();
            int f10 = this.f75849a.f(bVar.c(bVar.e()));
            C10136b bVar2 = this;
            while (bVar2.e() >= bVar.e() && !bVar2.f()) {
                int e11 = bVar2.e() - bVar.e();
                int h10 = this.f75849a.h(bVar2.c(bVar2.e()), f10);
                C10136b h11 = bVar.h(e11, h10);
                e10 = e10.a(this.f75849a.b(e11, h10));
                bVar2 = bVar2.a(h11);
            }
            return new C10136b[]{e10, bVar2};
        } else {
            throw new IllegalArgumentException("Divide by 0");
        }
    }

    /* access modifiers changed from: package-private */
    public int c(int i10) {
        int[] iArr = this.f75850b;
        return iArr[(iArr.length - 1) - i10];
    }

    /* access modifiers changed from: package-private */
    public int[] d() {
        return this.f75850b;
    }

    /* access modifiers changed from: package-private */
    public int e() {
        return this.f75850b.length - 1;
    }

    /* access modifiers changed from: package-private */
    public boolean f() {
        return this.f75850b[0] == 0;
    }

    /* access modifiers changed from: package-private */
    public C10136b g(C10136b bVar) {
        if (!this.f75849a.equals(bVar.f75849a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        } else if (f() || bVar.f()) {
            return this.f75849a.e();
        } else {
            int[] iArr = this.f75850b;
            int length = iArr.length;
            int[] iArr2 = bVar.f75850b;
            int length2 = iArr2.length;
            int[] iArr3 = new int[((length + length2) - 1)];
            for (int i10 = 0; i10 < length; i10++) {
                int i11 = iArr[i10];
                for (int i12 = 0; i12 < length2; i12++) {
                    int i13 = i10 + i12;
                    iArr3[i13] = C10135a.a(iArr3[i13], this.f75849a.h(i11, iArr2[i12]));
                }
            }
            return new C10136b(this.f75849a, iArr3);
        }
    }

    /* access modifiers changed from: package-private */
    public C10136b h(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        } else if (i11 == 0) {
            return this.f75849a.e();
        } else {
            int length = this.f75850b.length;
            int[] iArr = new int[(i10 + length)];
            for (int i12 = 0; i12 < length; i12++) {
                iArr[i12] = this.f75849a.h(this.f75850b[i12], i11);
            }
            return new C10136b(this.f75849a, iArr);
        }
    }

    public String toString() {
        if (f()) {
            return "0";
        }
        StringBuilder sb2 = new StringBuilder(e() * 8);
        for (int e10 = e(); e10 >= 0; e10--) {
            int c10 = c(e10);
            if (c10 != 0) {
                if (c10 < 0) {
                    if (e10 == e()) {
                        sb2.append("-");
                    } else {
                        sb2.append(" - ");
                    }
                    c10 = -c10;
                } else if (sb2.length() > 0) {
                    sb2.append(" + ");
                }
                if (e10 == 0 || c10 != 1) {
                    int g10 = this.f75849a.g(c10);
                    if (g10 == 0) {
                        sb2.append('1');
                    } else if (g10 == 1) {
                        sb2.append('a');
                    } else {
                        sb2.append("a^");
                        sb2.append(g10);
                    }
                }
                if (e10 != 0) {
                    if (e10 == 1) {
                        sb2.append('x');
                    } else {
                        sb2.append("x^");
                        sb2.append(e10);
                    }
                }
            }
        }
        return sb2.toString();
    }
}

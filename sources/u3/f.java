package u3;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f30155a;

    /* renamed from: b  reason: collision with root package name */
    private int f30156b;

    /* renamed from: c  reason: collision with root package name */
    private int f30157c;

    /* renamed from: d  reason: collision with root package name */
    private int f30158d;

    public f(byte[] bArr, int i10, int i11) {
        j(bArr, i10, i11);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.f30156b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a() {
        /*
            r2 = this;
            int r0 = r2.f30157c
            if (r0 < 0) goto L_0x0010
            int r1 = r2.f30156b
            if (r0 < r1) goto L_0x000e
            if (r0 != r1) goto L_0x0010
            int r0 = r2.f30158d
            if (r0 != 0) goto L_0x0010
        L_0x000e:
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            t3.C5950a.g(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u3.f.a():void");
    }

    private int g() {
        int i10 = 0;
        int i11 = 0;
        while (!e()) {
            i11++;
        }
        int i12 = (1 << i11) - 1;
        if (i11 > 0) {
            i10 = f(i11);
        }
        return i12 + i10;
    }

    private boolean k(int i10) {
        if (2 <= i10 && i10 < this.f30156b) {
            byte[] bArr = this.f30155a;
            return bArr[i10] == 3 && bArr[i10 + -2] == 0 && bArr[i10 - 1] == 0;
        }
    }

    public void b() {
        int i10 = this.f30158d;
        if (i10 > 0) {
            m(8 - i10);
        }
    }

    public boolean c(int i10) {
        int i11 = this.f30157c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        int i14 = (this.f30158d + i10) - (i12 * 8);
        if (i14 > 7) {
            i13++;
            i14 -= 8;
        }
        while (true) {
            i11++;
            if (i11 > i13 || i13 >= this.f30156b) {
                int i15 = this.f30156b;
            } else if (k(i11)) {
                i13++;
                i11 += 2;
            }
        }
        int i152 = this.f30156b;
        if (i13 >= i152) {
            return i13 == i152 && i14 == 0;
        }
        return true;
    }

    public boolean d() {
        int i10 = this.f30157c;
        int i11 = this.f30158d;
        int i12 = 0;
        while (this.f30157c < this.f30156b && !e()) {
            i12++;
        }
        boolean z10 = this.f30157c == this.f30156b;
        this.f30157c = i10;
        this.f30158d = i11;
        return !z10 && c((i12 * 2) + 1);
    }

    public boolean e() {
        boolean z10 = (this.f30155a[this.f30157c] & (128 >> this.f30158d)) != 0;
        l();
        return z10;
    }

    public int f(int i10) {
        int i11;
        int i12;
        this.f30158d += i10;
        int i13 = 0;
        while (true) {
            i11 = this.f30158d;
            i12 = 2;
            if (i11 <= 8) {
                break;
            }
            int i14 = i11 - 8;
            this.f30158d = i14;
            byte[] bArr = this.f30155a;
            int i15 = this.f30157c;
            i13 |= (bArr[i15] & 255) << i14;
            if (!k(i15 + 1)) {
                i12 = 1;
            }
            this.f30157c = i15 + i12;
        }
        byte[] bArr2 = this.f30155a;
        int i16 = this.f30157c;
        int i17 = (-1 >>> (32 - i10)) & (i13 | ((bArr2[i16] & 255) >> (8 - i11)));
        if (i11 == 8) {
            this.f30158d = 0;
            if (!k(i16 + 1)) {
                i12 = 1;
            }
            this.f30157c = i16 + i12;
        }
        a();
        return i17;
    }

    public int h() {
        int g10 = g();
        return (g10 % 2 == 0 ? -1 : 1) * ((g10 + 1) / 2);
    }

    public int i() {
        return g();
    }

    public void j(byte[] bArr, int i10, int i11) {
        this.f30155a = bArr;
        this.f30157c = i10;
        this.f30156b = i11;
        this.f30158d = 0;
        a();
    }

    public void l() {
        int i10 = 1;
        int i11 = this.f30158d + 1;
        this.f30158d = i11;
        if (i11 == 8) {
            this.f30158d = 0;
            int i12 = this.f30157c;
            if (k(i12 + 1)) {
                i10 = 2;
            }
            this.f30157c = i12 + i10;
        }
        a();
    }

    public void m(int i10) {
        int i11 = this.f30157c;
        int i12 = i10 / 8;
        int i13 = i11 + i12;
        this.f30157c = i13;
        int i14 = this.f30158d + (i10 - (i12 * 8));
        this.f30158d = i14;
        if (i14 > 7) {
            this.f30157c = i13 + 1;
            this.f30158d = i14 - 8;
        }
        while (true) {
            i11++;
            if (i11 > this.f30157c) {
                a();
                return;
            } else if (k(i11)) {
                this.f30157c++;
                i11 += 2;
            }
        }
    }
}

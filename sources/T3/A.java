package t3;

import java.nio.charset.Charset;

public final class A {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f29434a;

    /* renamed from: b  reason: collision with root package name */
    private int f29435b;

    /* renamed from: c  reason: collision with root package name */
    private int f29436c;

    /* renamed from: d  reason: collision with root package name */
    private int f29437d;

    public A() {
        this.f29434a = N.f29467f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.f29437d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a() {
        /*
            r2 = this;
            int r0 = r2.f29435b
            if (r0 < 0) goto L_0x0010
            int r1 = r2.f29437d
            if (r0 < r1) goto L_0x000e
            if (r0 != r1) goto L_0x0010
            int r0 = r2.f29436c
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
        throw new UnsupportedOperationException("Method not decompiled: t3.A.a():void");
    }

    public int b() {
        return ((this.f29437d - this.f29435b) * 8) - this.f29436c;
    }

    public void c() {
        if (this.f29436c != 0) {
            this.f29436c = 0;
            this.f29435b++;
            a();
        }
    }

    public int d() {
        C5950a.g(this.f29436c == 0);
        return this.f29435b;
    }

    public int e() {
        return (this.f29435b * 8) + this.f29436c;
    }

    public void f(int i10, int i11) {
        if (i11 < 32) {
            i10 &= (1 << i11) - 1;
        }
        int min = Math.min(8 - this.f29436c, i11);
        int i12 = this.f29436c;
        int i13 = (8 - i12) - min;
        byte[] bArr = this.f29434a;
        int i14 = this.f29435b;
        byte b10 = (byte) (((65280 >> i12) | ((1 << i13) - 1)) & bArr[i14]);
        bArr[i14] = b10;
        int i15 = i11 - min;
        bArr[i14] = (byte) (b10 | ((i10 >>> i15) << i13));
        int i16 = i14 + 1;
        while (i15 > 8) {
            this.f29434a[i16] = (byte) (i10 >>> (i15 - 8));
            i15 -= 8;
            i16++;
        }
        int i17 = 8 - i15;
        byte[] bArr2 = this.f29434a;
        byte b11 = (byte) (bArr2[i16] & ((1 << i17) - 1));
        bArr2[i16] = b11;
        bArr2[i16] = (byte) (((i10 & ((1 << i15) - 1)) << i17) | b11);
        r(i11);
        a();
    }

    public boolean g() {
        boolean z10 = (this.f29434a[this.f29435b] & (128 >> this.f29436c)) != 0;
        q();
        return z10;
    }

    public int h(int i10) {
        int i11;
        if (i10 == 0) {
            return 0;
        }
        this.f29436c += i10;
        int i12 = 0;
        while (true) {
            i11 = this.f29436c;
            if (i11 <= 8) {
                break;
            }
            int i13 = i11 - 8;
            this.f29436c = i13;
            byte[] bArr = this.f29434a;
            int i14 = this.f29435b;
            this.f29435b = i14 + 1;
            i12 |= (bArr[i14] & 255) << i13;
        }
        byte[] bArr2 = this.f29434a;
        int i15 = this.f29435b;
        int i16 = (-1 >>> (32 - i10)) & (i12 | ((bArr2[i15] & 255) >> (8 - i11)));
        if (i11 == 8) {
            this.f29436c = 0;
            this.f29435b = i15 + 1;
        }
        a();
        return i16;
    }

    public void i(byte[] bArr, int i10, int i11) {
        int i12 = (i11 >> 3) + i10;
        while (i10 < i12) {
            byte[] bArr2 = this.f29434a;
            int i13 = this.f29435b;
            int i14 = i13 + 1;
            this.f29435b = i14;
            byte b10 = bArr2[i13];
            int i15 = this.f29436c;
            byte b11 = (byte) (b10 << i15);
            bArr[i10] = b11;
            bArr[i10] = (byte) (((255 & bArr2[i14]) >> (8 - i15)) | b11);
            i10++;
        }
        int i16 = i11 & 7;
        if (i16 != 0) {
            byte b12 = (byte) (bArr[i12] & (255 >> i16));
            bArr[i12] = b12;
            int i17 = this.f29436c;
            if (i17 + i16 > 8) {
                byte[] bArr3 = this.f29434a;
                int i18 = this.f29435b;
                this.f29435b = i18 + 1;
                bArr[i12] = (byte) (b12 | ((bArr3[i18] & 255) << i17));
                this.f29436c = i17 - 8;
            }
            int i19 = this.f29436c + i16;
            this.f29436c = i19;
            byte[] bArr4 = this.f29434a;
            int i20 = this.f29435b;
            bArr[i12] = (byte) (((byte) (((255 & bArr4[i20]) >> (8 - i19)) << (8 - i16))) | bArr[i12]);
            if (i19 == 8) {
                this.f29436c = 0;
                this.f29435b = i20 + 1;
            }
            a();
        }
    }

    public long j(int i10) {
        return i10 <= 32 ? N.o1(h(i10)) : N.n1(h(i10 - 32), h(32));
    }

    public void k(byte[] bArr, int i10, int i11) {
        C5950a.g(this.f29436c == 0);
        System.arraycopy(this.f29434a, this.f29435b, bArr, i10, i11);
        this.f29435b += i11;
        a();
    }

    public String l(int i10, Charset charset) {
        byte[] bArr = new byte[i10];
        k(bArr, 0, i10);
        return new String(bArr, charset);
    }

    public void m(B b10) {
        o(b10.e(), b10.g());
        p(b10.f() * 8);
    }

    public void n(byte[] bArr) {
        o(bArr, bArr.length);
    }

    public void o(byte[] bArr, int i10) {
        this.f29434a = bArr;
        this.f29435b = 0;
        this.f29436c = 0;
        this.f29437d = i10;
    }

    public void p(int i10) {
        int i11 = i10 / 8;
        this.f29435b = i11;
        this.f29436c = i10 - (i11 * 8);
        a();
    }

    public void q() {
        int i10 = this.f29436c + 1;
        this.f29436c = i10;
        if (i10 == 8) {
            this.f29436c = 0;
            this.f29435b++;
        }
        a();
    }

    public void r(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f29435b + i11;
        this.f29435b = i12;
        int i13 = this.f29436c + (i10 - (i11 * 8));
        this.f29436c = i13;
        if (i13 > 7) {
            this.f29435b = i12 + 1;
            this.f29436c = i13 - 8;
        }
        a();
    }

    public void s(int i10) {
        C5950a.g(this.f29436c == 0);
        this.f29435b += i10;
        a();
    }

    public A(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public A(byte[] bArr, int i10) {
        this.f29434a = bArr;
        this.f29437d = i10;
    }
}

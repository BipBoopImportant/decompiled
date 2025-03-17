package nts;

/* renamed from: nts.ヰ  reason: contains not printable characters */
public class C4216 implements C4193 {

    /* renamed from: ϴ  reason: contains not printable characters */
    public byte[] f4132 = null;

    /* renamed from: ࡏ  reason: contains not printable characters */
    public byte[] f4133 = null;

    /* renamed from: ખ  reason: contains not printable characters */
    public int f4134 = 512;

    /* renamed from: ગ  reason: contains not printable characters */
    public int f4135 = 10;

    /* renamed from: ഇ  reason: contains not printable characters */
    public int[] f4136;

    /* renamed from: ᐳ  reason: contains not printable characters */
    public int[] f4137 = null;

    /* renamed from: ⶊ  reason: contains not printable characters */
    public long f4138;

    /* renamed from: ⶏ  reason: contains not printable characters */
    public boolean f4139;

    public C4216(byte[] bArr, boolean z10) {
        int[] iArr = new int[64];
        this.f4136 = iArr;
        this.f4139 = z10;
        int length = bArr.length / 2;
        this.f4137 = new int[64];
        int[] iArr2 = new int[64];
        this.f4133 = new byte[16];
        if (z10) {
            this.f4135 = C3724.m1025(bArr, 0, length, iArr, iArr2);
        } else {
            this.f4135 = C3724.m1025(bArr, 0, length, iArr2, iArr);
        }
        C3724.m1025(bArr, length, length, this.f4137, iArr2);
    }

    /* renamed from: ϴ  reason: contains not printable characters */
    public final void m3805() {
        int i10 = 0;
        byte b10 = 0;
        while (true) {
            byte b11 = b10;
            if (i10 >= 16) {
                break;
            }
            byte[] bArr = this.f4132;
            byte b12 = bArr[i10];
            bArr[i10] = (byte) (((b12 << 1) + b11) & 255);
            i10++;
            b10 = (byte) ((b12 >> 7) & 1);
        }
        if (b10 != 0) {
            byte[] bArr2 = this.f4132;
            bArr2[0] = (byte) (bArr2[0] ^ 135);
        }
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public boolean m3806() {
        return true;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public int m3807(byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        int i13 = (i11 / 16) * 16;
        m3808(bArr, i10, i13, bArr2, i12, false);
        return i13;
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public final void m3810() {
        C3823.m1599(this.f4138, this.f4132, 0, 16);
        C3724.m1023(this.f4132, this.f4137, this.f4135);
    }

    /* renamed from: ⶊ  reason: contains not printable characters */
    public final void m3811() {
        if (this.f4139) {
            C3724.m1023(this.f4133, this.f4136, this.f4135);
        } else {
            C3724.m1026(this.f4133, this.f4136, this.f4135);
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public byte[] m3809(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[i11];
        m3808(bArr, i10, i11, bArr2, 0, true);
        return bArr2;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public final void m3808(byte[] bArr, int i10, int i11, byte[] bArr2, int i12, boolean z10) {
        if (i11 != 0) {
            if (i11 >= 16) {
                int i13 = i11 / 16;
                int i14 = i11 % 16;
                if (z10 || i14 <= 0) {
                    if (i14 != 0) {
                        i13--;
                    }
                    if (this.f4132 == null) {
                        this.f4132 = new byte[16];
                        m3810();
                    }
                    int i15 = 0;
                    while (i15 < i13 && i11 > 0) {
                        System.arraycopy(bArr, i10, this.f4133, 0, 16);
                        i10 += 16;
                        if (i15 % (this.f4134 / 16) == 0 && i15 != 0) {
                            this.f4138++;
                            m3810();
                        }
                        for (int i16 = 0; i16 < 16; i16++) {
                            byte[] bArr3 = this.f4133;
                            bArr3[i16] = (byte) (bArr3[i16] ^ this.f4132[i16]);
                        }
                        m3811();
                        for (int i17 = 0; i17 < 16; i17++) {
                            byte[] bArr4 = this.f4133;
                            bArr4[i17] = (byte) (bArr4[i17] ^ this.f4132[i17]);
                        }
                        m3805();
                        System.arraycopy(this.f4133, 0, bArr2, i12, 16);
                        i12 += 16;
                        i11 -= 16;
                        i15++;
                    }
                    if (i15 % (this.f4134 / 16) == 0 && i15 != 0) {
                        this.f4138++;
                        m3810();
                    }
                    if (i14 > 0) {
                        byte[] bArr5 = new byte[16];
                        if (!this.f4139) {
                            System.arraycopy(this.f4132, 0, bArr5, 0, 16);
                            m3805();
                        }
                        System.arraycopy(bArr, i10, this.f4133, 0, 16);
                        int i18 = i10 + 16;
                        for (int i19 = 0; i19 < 16; i19++) {
                            byte[] bArr6 = this.f4133;
                            bArr6[i19] = (byte) (bArr6[i19] ^ this.f4132[i19]);
                        }
                        m3811();
                        for (int i20 = 0; i20 < 16; i20++) {
                            byte[] bArr7 = this.f4133;
                            bArr7[i20] = (byte) (bArr7[i20] ^ this.f4132[i20]);
                        }
                        if (this.f4139) {
                            m3805();
                        }
                        byte[] bArr8 = new byte[i14];
                        System.arraycopy(this.f4133, 0, bArr8, 0, i14);
                        System.arraycopy(bArr, i18, this.f4133, 0, i14);
                        if (!this.f4139) {
                            System.arraycopy(bArr5, 0, this.f4132, 0, 16);
                        }
                        for (int i21 = 0; i21 < 16; i21++) {
                            byte[] bArr9 = this.f4133;
                            bArr9[i21] = (byte) (bArr9[i21] ^ this.f4132[i21]);
                        }
                        m3811();
                        for (int i22 = 0; i22 < 16; i22++) {
                            byte[] bArr10 = this.f4133;
                            bArr10[i22] = (byte) (bArr10[i22] ^ this.f4132[i22]);
                        }
                        System.arraycopy(this.f4133, 0, bArr2, i12, 16);
                        System.arraycopy(bArr8, 0, bArr2, i12 + 16, i14);
                        return;
                    }
                    return;
                }
                throw new C3738(C3727.m1052("iOTBHLB\u0007aGZ^X\u00035\u0013\b\u001e\u0014\u0010\u001e[=\u001b\u0006\u0002\u0004_", 14, 14, 124));
            }
            throw new C3738(C3727.m1052("iOTBHLB\u0007aGZ^X\u00035\u0013\b\u001e\u0014\u0010\u001e[=\u001b\u0006\u0002\u0004_", 0, 14, 46));
        }
    }
}

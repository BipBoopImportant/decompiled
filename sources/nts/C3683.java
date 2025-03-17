package nts;

/* renamed from: nts.ॴ  reason: contains not printable characters */
public class C3683 {

    /* renamed from: ഇ  reason: contains not printable characters */
    public static final int[] f821 = {1634760805, 857760878, 2036477234, 1797285236};

    /* renamed from: ϴ  reason: contains not printable characters */
    public byte[] f822 = new byte[64];

    /* renamed from: ગ  reason: contains not printable characters */
    public int[] f823 = new int[16];

    /* renamed from: ᐳ  reason: contains not printable characters */
    public int[] f824 = new int[16];

    /* renamed from: ⶊ  reason: contains not printable characters */
    public int f825 = 0;

    public C3683() {
        m809();
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static int m806(int i10, int i11) {
        return (i10 >>> (-i11)) | (i10 << i11);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m809() {
        for (int i10 = 0; i10 < 16; i10++) {
            int[] iArr = this.f823;
            this.f824[i10] = 0;
            iArr[i10] = 0;
        }
        for (int i11 = 0; i11 < 64; i11++) {
            this.f822[i11] = 0;
        }
        this.f825 = 0;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m811(byte[] bArr, byte[] bArr2, long j10) {
        int[] iArr = this.f823;
        System.arraycopy(f821, 0, iArr, 0, 4);
        iArr[4] = m807(bArr, 0);
        iArr[5] = m807(bArr, 4);
        iArr[6] = m807(bArr, 8);
        iArr[7] = m807(bArr, 12);
        iArr[8] = m807(bArr, 16);
        iArr[9] = m807(bArr, 20);
        iArr[10] = m807(bArr, 24);
        iArr[11] = m807(bArr, 28);
        if (bArr2.length == 12) {
            iArr[12] = (int) j10;
            iArr[13] = m807(bArr2, 0);
            iArr[14] = m807(bArr2, 4);
            iArr[15] = m807(bArr2, 8);
        } else if (bArr2.length == 8) {
            iArr[12] = (int) (j10 >>> 32);
            iArr[13] = (int) j10;
            iArr[14] = m807(bArr2, 0);
            iArr[15] = m807(bArr2, 4);
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m810(byte[] bArr) {
        m808(bArr, this.f823, this.f824, this.f822, this.f825);
        this.f825 = (this.f825 + bArr.length) % 64;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static int m807(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] << 24) & -16777216) | (bArr[i10] & 255) | ((bArr[i10 + 1] << 8) & 65280) | ((bArr[i10 + 2] << 16) & 16711680);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static void m808(byte[] bArr, int[] iArr, int[] iArr2, byte[] bArr2, int i10) {
        byte[] bArr3 = bArr;
        int[] iArr3 = iArr;
        int[] iArr4 = iArr2;
        for (int i11 = 0; i11 < bArr3.length; i11++) {
            int i12 = (i11 + i10) % 64;
            if (i12 == 0) {
                System.arraycopy(iArr3, 0, iArr4, 0, 16);
                for (int i13 = 20; i13 > 0; i13 -= 2) {
                    int i14 = iArr4[0] + iArr4[4];
                    iArr4[0] = i14;
                    int r11 = m806(i14 ^ iArr4[12], 16);
                    iArr4[12] = r11;
                    int i15 = iArr4[8] + r11;
                    iArr4[8] = i15;
                    int r112 = m806(iArr4[4] ^ i15, 12);
                    iArr4[4] = r112;
                    int i16 = iArr4[0] + r112;
                    iArr4[0] = i16;
                    int r113 = m806(iArr4[12] ^ i16, 8);
                    iArr4[12] = r113;
                    int i17 = iArr4[8] + r113;
                    iArr4[8] = i17;
                    iArr4[4] = m806(iArr4[4] ^ i17, 7);
                    int i18 = iArr4[1] + iArr4[5];
                    iArr4[1] = i18;
                    int r114 = m806(iArr4[13] ^ i18, 16);
                    iArr4[13] = r114;
                    int i19 = iArr4[9] + r114;
                    iArr4[9] = i19;
                    int r115 = m806(iArr4[5] ^ i19, 12);
                    iArr4[5] = r115;
                    int i20 = iArr4[1] + r115;
                    iArr4[1] = i20;
                    int r116 = m806(iArr4[13] ^ i20, 8);
                    iArr4[13] = r116;
                    int i21 = iArr4[9] + r116;
                    iArr4[9] = i21;
                    iArr4[5] = m806(iArr4[5] ^ i21, 7);
                    int i22 = iArr4[2] + iArr4[6];
                    iArr4[2] = i22;
                    int r12 = m806(iArr4[14] ^ i22, 16);
                    iArr4[14] = r12;
                    int i23 = iArr4[10] + r12;
                    iArr4[10] = i23;
                    int r122 = m806(iArr4[6] ^ i23, 12);
                    iArr4[6] = r122;
                    int i24 = iArr4[2] + r122;
                    iArr4[2] = i24;
                    int r123 = m806(iArr4[14] ^ i24, 8);
                    iArr4[14] = r123;
                    int i25 = iArr4[10] + r123;
                    iArr4[10] = i25;
                    iArr4[6] = m806(iArr4[6] ^ i25, 7);
                    int i26 = iArr4[3] + iArr4[7];
                    iArr4[3] = i26;
                    int r124 = m806(iArr4[15] ^ i26, 16);
                    iArr4[15] = r124;
                    int i27 = iArr4[11] + r124;
                    iArr4[11] = i27;
                    int r125 = m806(iArr4[7] ^ i27, 12);
                    iArr4[7] = r125;
                    int i28 = iArr4[3] + r125;
                    iArr4[3] = i28;
                    int r126 = m806(iArr4[15] ^ i28, 8);
                    iArr4[15] = r126;
                    int i29 = iArr4[11] + r126;
                    iArr4[11] = i29;
                    iArr4[7] = m806(iArr4[7] ^ i29, 7);
                    int i30 = iArr4[0] + iArr4[5];
                    iArr4[0] = i30;
                    int r127 = m806(iArr4[15] ^ i30, 16);
                    iArr4[15] = r127;
                    int i31 = iArr4[10] + r127;
                    iArr4[10] = i31;
                    int r128 = m806(iArr4[5] ^ i31, 12);
                    iArr4[5] = r128;
                    int i32 = iArr4[0] + r128;
                    iArr4[0] = i32;
                    int r129 = m806(iArr4[15] ^ i32, 8);
                    iArr4[15] = r129;
                    int i33 = iArr4[10] + r129;
                    iArr4[10] = i33;
                    iArr4[5] = m806(iArr4[5] ^ i33, 7);
                    int i34 = iArr4[1] + iArr4[6];
                    iArr4[1] = i34;
                    int r1210 = m806(i34 ^ iArr4[12], 16);
                    iArr4[12] = r1210;
                    int i35 = iArr4[11] + r1210;
                    iArr4[11] = i35;
                    int r1211 = m806(iArr4[6] ^ i35, 12);
                    iArr4[6] = r1211;
                    int i36 = iArr4[1] + r1211;
                    iArr4[1] = i36;
                    int r92 = m806(iArr4[12] ^ i36, 8);
                    iArr4[12] = r92;
                    int i37 = iArr4[11] + r92;
                    iArr4[11] = i37;
                    iArr4[6] = m806(iArr4[6] ^ i37, 7);
                    int i38 = iArr4[2] + iArr4[7];
                    iArr4[2] = i38;
                    int r93 = m806(i38 ^ iArr4[13], 16);
                    iArr4[13] = r93;
                    int i39 = iArr4[8] + r93;
                    iArr4[8] = i39;
                    int r94 = m806(iArr4[7] ^ i39, 12);
                    iArr4[7] = r94;
                    int i40 = iArr4[2] + r94;
                    iArr4[2] = i40;
                    int r95 = m806(iArr4[13] ^ i40, 8);
                    iArr4[13] = r95;
                    int i41 = iArr4[8] + r95;
                    iArr4[8] = i41;
                    iArr4[7] = m806(iArr4[7] ^ i41, 7);
                    int i42 = iArr4[3] + iArr4[4];
                    iArr4[3] = i42;
                    int r96 = m806(i42 ^ iArr4[14], 16);
                    iArr4[14] = r96;
                    int i43 = iArr4[9] + r96;
                    iArr4[9] = i43;
                    int r97 = m806(iArr4[4] ^ i43, 12);
                    iArr4[4] = r97;
                    int i44 = iArr4[3] + r97;
                    iArr4[3] = i44;
                    int r82 = m806(iArr4[14] ^ i44, 8);
                    iArr4[14] = r82;
                    int i45 = iArr4[9] + r82;
                    iArr4[9] = i45;
                    iArr4[4] = m806(iArr4[4] ^ i45, 7);
                }
                for (int i46 = 0; i46 < 16; i46++) {
                    int i47 = iArr4[i46] + iArr3[i46];
                    int i48 = i46 * 4;
                    bArr2[i48] = (byte) i47;
                    bArr2[i48 + 1] = (byte) (i47 >>> 8);
                    bArr2[i48 + 2] = (byte) (i47 >>> 16);
                    bArr2[i48 + 3] = (byte) (i47 >>> 24);
                }
                int i49 = iArr3[12] + 1;
                iArr3[12] = i49;
                if (i49 == 0) {
                    throw new C3738(C3727.m1052("Ydj.J`jIme'enumvxn?qo}i|y{`8", 0, 28, 17));
                }
            }
            bArr3[i11] = (byte) (bArr2[i12] ^ bArr3[i11]);
        }
    }
}

package nts;

/* renamed from: nts.ᦊ  reason: contains not printable characters */
public class C4002 extends C3638 {

    /* renamed from: ϴ  reason: contains not printable characters */
    public static final int[] f2666 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 14, 10, 4, 8, 9, 15, 13, 6, 1, 12, 0, 2, 11, 7, 5, 3, 11, 8, 12, 0, 5, 2, 15, 13, 10, 14, 3, 6, 7, 1, 9, 4, 7, 9, 3, 1, 13, 12, 11, 14, 2, 6, 5, 10, 4, 0, 15, 8, 9, 0, 5, 7, 2, 4, 10, 15, 14, 1, 11, 12, 6, 8, 3, 13, 2, 12, 6, 10, 0, 11, 8, 3, 4, 13, 7, 5, 15, 14, 1, 9, 12, 5, 1, 15, 14, 13, 4, 10, 0, 7, 6, 3, 9, 2, 8, 11, 13, 11, 7, 14, 12, 1, 3, 9, 5, 0, 15, 4, 8, 6, 2, 10, 6, 15, 14, 9, 11, 3, 0, 8, 12, 2, 13, 7, 1, 4, 10, 5, 10, 2, 8, 4, 7, 6, 1, 5, 15, 11, 9, 14, 3, 12, 13, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 14, 10, 4, 8, 9, 15, 13, 6, 1, 12, 0, 2, 11, 7, 5, 3};

    /* renamed from: ᐳ  reason: contains not printable characters */
    public static final int[] f2667 = {1779033703, -205731576, -1150833019, -2067093701, 1013904242, -23791573, -1521486534, 1595750129, 1359893119, -1377402159, -1694144372, 725511199, 528734635, -79577749, 1541459225, 327033209};

    /* renamed from: Е  reason: contains not printable characters */
    public int f2668 = 0;

    /* renamed from: ࡏ  reason: contains not printable characters */
    public int[] f2669 = new int[16];

    /* renamed from: ખ  reason: contains not printable characters */
    public int[] f2670 = new int[2];

    /* renamed from: ᅯ  reason: contains not printable characters */
    public int[] f2671 = new int[32];

    /* renamed from: ⴸ  reason: contains not printable characters */
    public int[] f2672 = new int[32];

    /* renamed from: ⶊ  reason: contains not printable characters */
    public int f2673 = 64;

    /* renamed from: ⶏ  reason: contains not printable characters */
    public byte[] f2674 = new byte[128];

    public C4002() {
        m2464();
    }

    /* renamed from: ϴ  reason: contains not printable characters */
    public void m2464() {
        for (int i10 = 0; i10 < 16; i10++) {
            this.f2669[i10] = f2667[i10];
        }
        int[] iArr = this.f2669;
        iArr[1] = iArr[1] ^ (this.f2673 ^ 16842752);
        int[] iArr2 = this.f2670;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.f2668 = 0;
        for (int i11 = 0; i11 < 128; i11++) {
            this.f2674[i11] = 0;
        }
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public void m2465(byte[] bArr, int i10, int i11) {
        while (i10 < i11) {
            int i12 = this.f2668;
            if (i12 == 128) {
                int[] iArr = this.f2670;
                int i13 = iArr[0] + i12;
                iArr[0] = i13;
                if (i13 < i12) {
                    iArr[1] = iArr[1] + 1;
                }
                m2466(0);
                this.f2668 = 0;
            }
            byte[] bArr2 = this.f2674;
            int i14 = this.f2668;
            this.f2668 = i14 + 1;
            bArr2[i14] = bArr[i10];
            i10++;
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public final void m2466(int i10) {
        this.f2672 = new int[32];
        this.f2671 = new int[32];
        for (int i11 = 0; i11 < 16; i11++) {
            int[] iArr = this.f2672;
            iArr[i11] = this.f2669[i11];
            iArr[i11 + 16] = f2667[i11];
        }
        int[] iArr2 = this.f2672;
        int i12 = iArr2[25];
        int[] iArr3 = this.f2670;
        iArr2[25] = i12 ^ iArr3[0];
        iArr2[27] = iArr2[27] ^ iArr3[1];
        if (i10 > 0) {
            iArr2[28] = ~iArr2[28];
            iArr2[29] = ~iArr2[29];
        }
        for (int i13 = 0; i13 < 16; i13++) {
            int i14 = i13 * 2;
            int i15 = i13 * 8;
            this.f2671[i14] = m2463(this.f2674, i15 + 4);
            this.f2671[i14 + 1] = m2463(this.f2674, i15);
        }
        for (int i16 = 0; i16 < 12; i16++) {
            int[] iArr4 = this.f2671;
            int[] iArr5 = f2666;
            int i17 = i16 * 16;
            int i18 = iArr5[i17];
            int i19 = iArr4[i18 * 2];
            int i20 = iArr4[(i18 * 2) + 1];
            int i21 = iArr5[i17 + 1];
            m2467(0, 8, 16, 24, i19, i20, iArr4[i21 * 2], iArr4[(i21 * 2) + 1]);
            int[] iArr6 = this.f2671;
            int i22 = iArr5[i17 + 2];
            int i23 = iArr6[i22 * 2];
            int i24 = iArr6[(i22 * 2) + 1];
            int i25 = iArr5[i17 + 3];
            m2467(2, 10, 18, 26, i23, i24, iArr6[i25 * 2], iArr6[(i25 * 2) + 1]);
            int[] iArr7 = this.f2671;
            int i26 = iArr5[i17 + 4];
            int i27 = iArr7[i26 * 2];
            int i28 = iArr7[(i26 * 2) + 1];
            int i29 = iArr5[i17 + 5];
            m2467(4, 12, 20, 28, i27, i28, iArr7[i29 * 2], iArr7[(i29 * 2) + 1]);
            int[] iArr8 = this.f2671;
            int i30 = iArr5[i17 + 6];
            int i31 = iArr8[i30 * 2];
            int i32 = iArr8[(i30 * 2) + 1];
            int i33 = iArr5[i17 + 7];
            m2467(6, 14, 22, 30, i31, i32, iArr8[i33 * 2], iArr8[(i33 * 2) + 1]);
            int[] iArr9 = this.f2671;
            int i34 = iArr5[i17 + 8];
            int i35 = iArr9[i34 * 2];
            int i36 = iArr9[(i34 * 2) + 1];
            int i37 = iArr5[i17 + 9];
            m2467(0, 10, 20, 30, i35, i36, iArr9[i37 * 2], iArr9[(i37 * 2) + 1]);
            int[] iArr10 = this.f2671;
            int i38 = iArr5[i17 + 10];
            int i39 = iArr10[i38 * 2];
            int i40 = iArr10[(i38 * 2) + 1];
            int i41 = iArr5[i17 + 11];
            m2467(2, 12, 22, 24, i39, i40, iArr10[i41 * 2], iArr10[(i41 * 2) + 1]);
            int[] iArr11 = this.f2671;
            int i42 = iArr5[i17 + 12];
            int i43 = iArr11[i42 * 2];
            int i44 = iArr11[(i42 * 2) + 1];
            int i45 = iArr5[i17 + 13];
            m2467(4, 14, 16, 26, i43, i44, iArr11[i45 * 2], iArr11[(i45 * 2) + 1]);
            int[] iArr12 = this.f2671;
            int i46 = iArr5[i17 + 14];
            int i47 = iArr12[i46 * 2];
            int i48 = iArr12[(i46 * 2) + 1];
            int i49 = iArr5[i17 + 15];
            m2467(6, 8, 18, 28, i47, i48, iArr12[i49 * 2], iArr12[(i49 * 2) + 1]);
        }
        for (int i50 = 0; i50 < 16; i50++) {
            int[] iArr13 = this.f2669;
            int i51 = iArr13[i50];
            int[] iArr14 = this.f2672;
            iArr13[i50] = i51 ^ (iArr14[i50 + 16] ^ iArr14[i50]);
        }
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public byte[] m2468() {
        int[] iArr = this.f2670;
        int i10 = iArr[0];
        int i11 = this.f2668;
        int i12 = i10 + i11;
        iArr[0] = i12;
        if (i12 < i11) {
            iArr[1] = iArr[1] + 1;
        }
        while (true) {
            int i13 = this.f2668;
            if (i13 >= 128) {
                break;
            }
            byte[] bArr = this.f2674;
            this.f2668 = i13 + 1;
            bArr[i13] = 0;
        }
        m2466(1);
        byte[] bArr2 = new byte[this.f2673];
        for (int i14 = 0; i14 < this.f2673; i14++) {
            if (i14 % 8 < 4) {
                bArr2[i14] = (byte) ((this.f2669[(i14 >> 2) + 1] >> ((i14 & 3) * 8)) & 255);
            } else {
                bArr2[i14] = (byte) ((this.f2669[(i14 >> 2) - 1] >> ((i14 & 3) * 8)) & 255);
            }
        }
        return bArr2;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public final void m2467(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int[] iArr = this.f2672;
        int i18 = i10 + 1;
        int i19 = i11 + 1;
        long j10 = (((long) iArr[i18]) & 4294967295L) + (((long) iArr[i19]) & 4294967295L) + (((long) i15) & 4294967295L);
        iArr[i10] = iArr[i10] + iArr[i11] + i14 + ((int) (j10 >> 32));
        iArr[i18] = (int) j10;
        iArr[i13] = iArr[i13] ^ iArr[i10];
        int i20 = i13 + 1;
        int i21 = iArr[i20] ^ iArr[i18];
        iArr[i20] = i21;
        int i22 = iArr[i13];
        iArr[i13] = i21;
        iArr[i20] = i22;
        int i23 = i12 + 1;
        long j11 = (((long) iArr[i23]) & 4294967295L) + (((long) i22) & 4294967295L);
        iArr[i12] = iArr[i12] + iArr[i13] + ((int) (j11 >> 32));
        iArr[i23] = (int) j11;
        iArr[i11] = iArr[i11] ^ iArr[i12];
        int i24 = iArr[i19] ^ iArr[i23];
        iArr[i19] = i24;
        int i25 = iArr[i11];
        iArr[i11] = (i24 << 8) ^ ((i25 >> 24) & 255);
        int i26 = ((i24 >> 24) & 255) ^ (i25 << 8);
        iArr[i19] = i26;
        long j12 = (((long) iArr[i18]) & 4294967295L) + (((long) i26) & 4294967295L) + (((long) i17) & 4294967295L);
        iArr[i10] = iArr[i10] + iArr[i11] + i16 + ((int) (j12 >> 32));
        iArr[i18] = (int) j12;
        iArr[i13] = iArr[i13] ^ iArr[i10];
        int i27 = iArr[i18] ^ iArr[i20];
        iArr[i20] = i27;
        int i28 = iArr[i13];
        iArr[i13] = (i27 << 16) ^ ((i28 >> 16) & 65535);
        int i29 = ((i27 >> 16) & 65535) ^ (i28 << 16);
        iArr[i20] = i29;
        long j13 = (((long) iArr[i23]) & 4294967295L) + (((long) i29) & 4294967295L);
        iArr[i12] = iArr[i12] + iArr[i13] + ((int) (j13 >> 32));
        iArr[i23] = (int) j13;
        iArr[i11] = iArr[i11] ^ iArr[i12];
        int i30 = iArr[i19] ^ iArr[i23];
        iArr[i19] = i30;
        int i31 = iArr[i11];
        iArr[i11] = (i31 << 1) ^ (((i30 >> 24) & 255) >> 7);
        iArr[i19] = (i30 << 1) ^ (((i31 >> 24) & 255) >> 7);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static int m2463(byte[] bArr, int i10) {
        return (bArr[i10] & 255) ^ ((((bArr[i10 + 3] & 255) << 24) ^ ((bArr[i10 + 2] & 255) << 16)) ^ ((bArr[i10 + 1] & 255) << 8));
    }
}

package nts;

/* renamed from: nts.ⷞ  reason: contains not printable characters */
public class C4191 extends C3638 {

    /* renamed from: ϴ  reason: contains not printable characters */
    public static final long[][] f4025 = {new long[]{0, 36, 3, 41, 18}, new long[]{1, 44, 10, 45, 2}, new long[]{62, 6, 43, 15, 61}, new long[]{28, 55, 25, 21, 56}, new long[]{27, 20, 39, 8, 14}};

    /* renamed from: ᐳ  reason: contains not printable characters */
    public static final long[] f4026 = {1, 32898, -9223372036854742902L, -9223372034707259392L, 32907, 2147483649L, -9223372034707259263L, -9223372036854743031L, 138, 136, 2147516425L, 2147483658L, 2147516555L, -9223372036854775669L, -9223372036854742903L, -9223372036854743037L, -9223372036854743038L, -9223372036854775680L, 32778, -9223372034707292150L, -9223372034707259263L, -9223372036854742912L, 2147483649L, -9223372034707259384L};

    /* renamed from: Е  reason: contains not printable characters */
    public boolean f4027;

    /* renamed from: ࡏ  reason: contains not printable characters */
    public int f4028 = 0;

    /* renamed from: ખ  reason: contains not printable characters */
    public int f4029;

    /* renamed from: ⶊ  reason: contains not printable characters */
    public long[][] f4030 = null;

    /* renamed from: ⶏ  reason: contains not printable characters */
    public byte[] f4031 = null;

    public C4191() {
        this.f625 = 512;
        this.f4029 = 72;
        this.f4027 = false;
        m3701();
    }

    public Object clone() {
        C4191 r02 = new C4191();
        m3703(r02);
        return r02;
    }

    /* renamed from: ϴ  reason: contains not printable characters */
    public void m3701() {
        int i10 = 0;
        this.f4028 = 0;
        this.f4030 = new long[5][];
        while (true) {
            long[][] jArr = this.f4030;
            if (i10 < jArr.length) {
                jArr[i10] = new long[5];
                i10++;
            } else {
                this.f4031 = new byte[144];
                return;
            }
        }
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public void m3702(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            int i12 = this.f4029;
            int i13 = this.f4028;
            int i14 = i12 - i13;
            if (i11 < i14) {
                System.arraycopy(bArr, i10, this.f4031, i13, i11);
                this.f4028 += i11;
                return;
            }
            if (i13 > 0) {
                System.arraycopy(bArr, 0, this.f4031, i13, i14);
                m3704(this.f4031, this.f4029);
            } else {
                i14 = 0;
            }
            int i15 = i11 - i14;
            int i16 = this.f4029;
            if (i15 >= i16) {
                int i17 = i15 - (i15 % i16);
                byte[] bArr2 = new byte[i17];
                System.arraycopy(bArr, i14, bArr2, 0, i17);
                m3704(bArr2, i17);
            }
            int i18 = i15 % this.f4029;
            this.f4028 = i18;
            if (i18 > 0) {
                System.arraycopy(bArr, i11 - i18, this.f4031, 0, i18);
                return;
            }
            return;
        }
        throw new C3641(C3727.m1052("nj|h_bl(bk~bed toa;wlkk>y3s0~xaqLXHD\u000fCX@WKQLB\u0006JB\u001bNQ]\u001f\\QSPY\u0011C^LP\u001a", 0, 4, 14));
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m3703(C4191 r92) {
        for (int i10 = 0; i10 < 5; i10++) {
            for (int i11 = 0; i11 < 5; i11++) {
                r92.f4030[i10][i11] = this.f4030[i10][i11];
            }
        }
        byte[] bArr = this.f4031;
        System.arraycopy(bArr, 0, r92.f4031, 0, bArr.length);
        r92.f4028 = this.f4028;
        r92.f4029 = this.f4029;
        r92.f625 = this.f625;
        r92.f4027 = this.f4027;
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public byte[] m3705() {
        byte[] bArr = this.f4031;
        int i10 = this.f4028;
        int i11 = this.f4029;
        int i12 = (i10 + i11) - (i10 % i11);
        byte[] bArr2 = new byte[i12];
        System.arraycopy(bArr, 0, bArr2, 0, i10);
        int i13 = this.f4029;
        if (i10 % i13 > i13 - 2) {
            bArr2[i10] = -127;
        } else {
            if (this.f4027) {
                bArr2[i10] = 1;
            } else {
                bArr2[i10] = 6;
            }
            bArr2[i12 - 1] = Byte.MIN_VALUE;
        }
        m3704(bArr2, i13);
        this.f624 = new byte[(this.f625 / 8)];
        int i14 = 0;
        for (int i15 = 0; i15 < 5; i15++) {
            for (int i16 = 0; i16 < 5; i16++) {
                if ((i15 * 5) + i16 < this.f4029 / 8) {
                    long j10 = this.f4030[i16][i15];
                    for (int i17 = 0; i17 < 8 && i14 < this.f625 / 8; i17++) {
                        this.f624[i14] = (byte) ((int) j10);
                        i14++;
                        j10 >>= 8;
                    }
                }
            }
        }
        return this.f624;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m3704(byte[] bArr, int i10) {
        int i11;
        int i12;
        int i13;
        int i14 = this.f4029;
        if (i10 % i14 == 0) {
            int i15 = 8;
            int i16 = i14 / 8;
            int i17 = 0;
            while (i17 < i10 / this.f4029) {
                int i18 = 0;
                while (true) {
                    i12 = 5;
                    if (i18 >= 5) {
                        break;
                    }
                    int i19 = 0;
                    while (i19 < 5) {
                        int i20 = i18 * 5;
                        if (i19 + i20 < i16) {
                            long[] jArr = this.f4030[i19];
                            int i21 = ((i17 * i16) + i19 + i20) * i15;
                            i13 = i17;
                            jArr[i18] = ((((((((((long) (bArr[i21 + 7] & 255)) << 56) | (((long) (bArr[i21 + 6] & 255)) << 48)) | (((long) (bArr[i21 + 5] & 255)) << 40)) | (((long) (bArr[i21 + 4] & 255)) << 32)) | (((long) (bArr[i21 + 3] & 255)) << 24)) | (((long) (bArr[i21 + 2] & 255)) << 16)) | (((long) (bArr[i21 + 1] & 255)) << i15)) | ((long) (bArr[i21] & 255))) ^ jArr[i18];
                        } else {
                            i13 = i17;
                        }
                        i19++;
                        i17 = i13;
                    }
                    int i22 = i17;
                    i18++;
                }
                int i23 = i17;
                long[][] jArr2 = this.f4030;
                int i24 = 0;
                for (i11 = 24; i24 < i11; i11 = 24) {
                    long j10 = f4026[i24];
                    long[] jArr3 = new long[i12];
                    long[] jArr4 = new long[i12];
                    long[][] jArr5 = new long[i12][];
                    for (int i25 = 0; i25 < i12; i25++) {
                        jArr5[i25] = new long[i12];
                    }
                    for (int i26 = 0; i26 < i12; i26++) {
                        long[] jArr6 = jArr2[i26];
                        jArr3[i26] = (((jArr6[0] ^ jArr6[1]) ^ jArr6[2]) ^ jArr6[3]) ^ jArr6[4];
                    }
                    int i27 = 0;
                    while (i27 < i12) {
                        long j11 = jArr3[(i27 + 4) % i12];
                        int i28 = i27 + 1;
                        long j12 = jArr3[i28 % 5];
                        jArr4[i27] = j11 ^ ((j12 << 1) | (j12 >>> 63));
                        i27 = i28;
                    }
                    for (int i29 = 0; i29 < i12; i29++) {
                        for (int i30 = 0; i30 < i12; i30++) {
                            long[] jArr7 = jArr2[i29];
                            jArr7[i30] = jArr7[i30] ^ jArr4[i29];
                        }
                    }
                    for (int i31 = 0; i31 < i12; i31++) {
                        int i32 = 0;
                        while (i32 < i12) {
                            long[] jArr8 = jArr5[i32];
                            int r13 = m3700((i31 * 2) + (i32 * 3), i12);
                            long j13 = jArr2[i31][i32];
                            long j14 = f4025[i31][i32];
                            jArr8[r13] = (j13 << ((int) j14)) | (j13 >>> (64 - ((int) j14)));
                            i32++;
                            jArr2 = jArr2;
                        }
                        long[][] jArr9 = jArr2;
                    }
                    long[][] jArr10 = jArr2;
                    for (int i33 = 0; i33 < i12; i33++) {
                        int i34 = 0;
                        while (i34 < i12) {
                            jArr10[i33][i34] = ((~jArr5[m3700(i33 + 1, i12)][i34]) & jArr5[m3700(i33 + 2, 5)][i34]) ^ jArr5[i33][i34];
                            i34++;
                            i12 = 5;
                        }
                        int i35 = i12;
                    }
                    long[] jArr11 = jArr10[0];
                    jArr11[0] = jArr11[0] ^ j10;
                    i24++;
                    i12 = i12;
                    jArr2 = jArr10;
                }
                i17 = i23 + 1;
                i15 = 8;
            }
            return;
        }
        throw new C3625((Throwable) null, 0, C3727.m1052("nj|h_bl(bk~bed toa;wlkk>y3s0~xaqLXHD\u000fCX@WKQLB\u0006JB\u001bNQ]\u001f\\QSPY\u0011C^LP\u001a", 4, 64, 79));
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static int m3700(int i10, int i11) {
        if (i11 < 0) {
            return m3700(-i10, -i11);
        }
        int i12 = i10 % i11;
        return i12 < 0 ? i12 + i11 : i12;
    }
}

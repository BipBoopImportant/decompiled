package nts;

/* renamed from: nts.ᰗ  reason: contains not printable characters */
public class C4035 extends C4070 {

    /* renamed from: и  reason: contains not printable characters */
    public short[] f2805;

    /* renamed from: ࡑ  reason: contains not printable characters */
    public int f2806;

    /* renamed from: ᅯ  reason: contains not printable characters */
    public C3548 f2807;

    /* renamed from: ᖑ  reason: contains not printable characters */
    public short[] f2808;

    /* renamed from: ᘺ  reason: contains not printable characters */
    public int f2809 = 80;

    /* renamed from: ᜇ  reason: contains not printable characters */
    public int f2810;

    /* renamed from: ᢼ  reason: contains not printable characters */
    public int f2811;

    /* renamed from: ⴸ  reason: contains not printable characters */
    public int[] f2812;

    public C4035() {
        int[] iArr = new int[6];
        this.f2812 = iArr;
        iArr[0] = 6;
        iArr[1] = 20;
        iArr[2] = 45;
        iArr[3] = 80;
        iArr[4] = 200;
        iArr[5] = 1000;
        this.f2807 = new C3548();
        this.f3346 = new C4096();
        this.f3344 = 0;
        this.f3345 = 0;
        this.f3348 = new byte[65535];
        this.f3347 = 0;
        this.f3349 = 0;
        this.f2805 = new short[16384];
        for (int i10 = 0; i10 < 16384; i10++) {
            this.f2805[i10] = -1;
        }
        this.f2808 = new short[65535];
        for (int i11 = 0; i11 < 65535; i11++) {
            this.f2808[i11] = -1;
        }
        m2677();
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public final int m2676(int i10, int i11, int i12) {
        return (((i10 << 6) ^ (i11 << 3)) ^ i12) & 16383;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m2677() {
        this.f3344 = 0;
        this.f3345 = 0;
        C4096 r12 = this.f3346;
        r12.f3487 = 0;
        r12.f3489 = 0;
        r12.f3490 = 0;
        this.f3347 = 1;
        this.f3349 = 1;
        this.f2807.m111();
        for (int i10 = 0; i10 < 16384; i10++) {
            this.f2805[i10] = -1;
        }
        for (int i11 = 0; i11 < 65535; i11++) {
            this.f2808[i11] = -1;
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public final void m2679(int i10, int i11, int i12, int i13) {
        int i14 = (((i10 << 6) ^ (i11 << 3)) ^ i12) & 16383;
        short[] sArr = this.f2805;
        short s10 = sArr[i14];
        sArr[i14] = (short) i13;
        this.f2808[i13] = s10;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public final void m2678(int i10, int i11) {
        int i12;
        int i13 = this.f2809;
        short s10 = this.f2805[i10] & 65535;
        int i14 = this.f3347 + i11;
        while (s10 != 65535 && s10 >= i14 - 32768 && i13 > 0) {
            byte[] bArr = this.f3348;
            int i15 = this.f2810;
            if (bArr[s10 + i15] == bArr[i15 + i14]) {
                int i16 = 0;
                while (true) {
                    i12 = this.f2806;
                    if (i16 >= i12) {
                        break;
                    }
                    byte[] bArr2 = this.f3348;
                    if (bArr2[s10 + i16] != bArr2[i14 + i16]) {
                        break;
                    }
                    i16++;
                }
                if (i16 > this.f2810) {
                    this.f2810 = i16;
                    this.f2811 = s10;
                    if (i16 == i12) {
                        return;
                    }
                }
            }
            i13 -= 2;
            if (i13 == 0) {
                this.f2808[s10] = -1;
                return;
            }
            s10 = this.f2808[s10] & 65535;
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public final boolean m2680(boolean z10) {
        int i10;
        C3548 r02;
        byte[] bArr;
        boolean z11;
        boolean z12;
        int i11 = this.f3349 - 259;
        this.f2806 = 258;
        do {
            int i12 = this.f3347;
            if (i12 < i11) {
                byte[] bArr2 = this.f3348;
                int r22 = m2676(bArr2[i12], bArr2[i12 + 1], bArr2[i12 + 2]);
                this.f2810 = 0;
                if (this.f2805[r22] != -1) {
                    m2678(r22, 0);
                }
                int i13 = this.f2810;
                if (i13 > 2) {
                    byte[] bArr3 = this.f3348;
                    int i14 = this.f3347;
                    int r52 = m2676(bArr3[i14 + 1], bArr3[i14 + 2], bArr3[i14 + 3]);
                    if (this.f2805[r52] != -1) {
                        m2678(r52, 1);
                        if (i13 < this.f2810) {
                            byte[] bArr4 = this.f3348;
                            int i15 = this.f3347;
                            m2679(bArr4[i15], bArr4[i15 + 1], bArr4[i15 + 2], i15);
                            C3548 r23 = this.f2807;
                            byte[] bArr5 = this.f3348;
                            int i16 = this.f3347;
                            this.f3347 = i16 + 1;
                            if (r23.m114(bArr5[i16] & 255)) {
                                return true;
                            }
                        }
                    }
                    byte[] bArr6 = this.f3348;
                    int i17 = this.f3347;
                    m2679(bArr6[i17], bArr6[i17 + 1], bArr6[i17 + 2], i17);
                    z12 = this.f2807.m113(this.f2810, this.f3347 - this.f2811);
                    int i18 = this.f3347;
                    int i19 = this.f2810 + i18;
                    this.f3347 = i18 + 1;
                    if (!z12) {
                        while (true) {
                            int i20 = this.f3347;
                            if (i20 >= i19) {
                                continue;
                                break;
                            }
                            byte[] bArr7 = this.f3348;
                            int i21 = i20 + 1;
                            byte b10 = (bArr7[i20 + 2] ^ ((bArr7[i20] << 6) ^ (bArr7[i21] << 3))) & 16383;
                            short[] sArr = this.f2805;
                            short s10 = sArr[b10];
                            sArr[b10] = (short) i20;
                            this.f2808[i20] = (short) s10;
                            this.f3347 = i21;
                        }
                    } else {
                        this.f3347 = i19;
                        return true;
                    }
                } else {
                    byte[] bArr8 = this.f3348;
                    int i22 = this.f3347;
                    byte b11 = bArr8[i22];
                    int i23 = i22 + 1;
                    byte b12 = (bArr8[i22 + 2] ^ ((bArr8[i23] << 3) ^ (b11 << 6))) & 16383;
                    short[] sArr2 = this.f2805;
                    short s11 = sArr2[b12];
                    sArr2[b12] = (short) i22;
                    this.f2808[i22] = (short) s11;
                    C3548 r24 = this.f2807;
                    this.f3347 = i23;
                    z12 = r24.m114(b11 & 255);
                    continue;
                }
            } else if (z10) {
                return false;
            } else {
                while (true) {
                    int i24 = this.f3347;
                    if (i24 >= this.f3349 - 2) {
                        do {
                            i10 = this.f3347;
                            if (i10 >= this.f3349) {
                                break;
                            }
                            r02 = this.f2807;
                            bArr = this.f3348;
                            this.f3347 = i10 + 1;
                        } while (!r02.m114(bArr[i10] & 255));
                    } else {
                        byte[] bArr9 = this.f3348;
                        int r13 = m2676(bArr9[i24], bArr9[i24 + 1], bArr9[i24 + 2]);
                        this.f2810 = 0;
                        if (this.f2805[r13] != -1) {
                            int i25 = this.f3349 - this.f3347;
                            if (i25 >= 258) {
                                i25 = 258;
                            }
                            this.f2806 = i25;
                            m2678(r13, 0);
                        }
                        byte[] bArr10 = this.f3348;
                        int i26 = this.f3347;
                        m2679(bArr10[i26], bArr10[i26 + 1], bArr10[i26 + 2], i26);
                        int i27 = this.f2810;
                        if (i27 >= 3) {
                            z11 = this.f2807.m113(i27, this.f3347 - this.f2811);
                            int i28 = this.f3347;
                            int i29 = this.f2810 + i28;
                            this.f3347 = i28 + 1;
                            while (true) {
                                int i30 = this.f3347;
                                if (i30 >= i29) {
                                    continue;
                                    break;
                                }
                                if (i30 < this.f3349 - 2) {
                                    byte[] bArr11 = this.f3348;
                                    m2679(bArr11[i30], bArr11[i30 + 1], bArr11[i30 + 2], i30);
                                }
                                this.f3347++;
                            }
                        } else {
                            C3548 r132 = this.f2807;
                            byte[] bArr12 = this.f3348;
                            int i31 = this.f3347;
                            this.f3347 = i31 + 1;
                            z11 = r132.m114(bArr12[i31] & 255);
                            continue;
                        }
                        if (z11) {
                            break;
                        }
                    }
                }
                return true;
            }
        } while (!z12);
        return true;
    }
}

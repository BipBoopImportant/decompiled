package nts;

/* renamed from: nts.ᙜ  reason: contains not printable characters */
public class C3944 {

    /* renamed from: ϴ  reason: contains not printable characters */
    public int f2257 = 0;

    /* renamed from: ગ  reason: contains not printable characters */
    public int f2258 = 0;

    /* renamed from: ഇ  reason: contains not printable characters */
    public int f2259 = 0;

    /* renamed from: ᐳ  reason: contains not printable characters */
    public int f2260 = 0;

    /* renamed from: ⶊ  reason: contains not printable characters */
    public byte[] f2261 = null;

    /* renamed from: ગ  reason: contains not printable characters */
    public final int m2110(int i10, int i11) {
        int i12 = i10 & 65535;
        int i13 = i11 & 65535;
        return ((((((i10 >> 16) & 65535) * i13) + (((i11 >> 16) & 65535) * i12)) & 65535) << 16) + (i12 * i13);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public final int m2112(int i10, int i11) {
        int i12 = (i10 >> 16) & 65535;
        int i13 = i10 & 65535;
        int i14 = (i11 >> 16) & 65535;
        int i15 = i11 & 65535;
        return (((int) (((((long) i12) * ((long) i15)) + (((long) i13) * ((long) i14))) >> 16)) & 1048575) + (i12 * i14) + (((((i12 * i15) + (i13 * i14)) & 65535) + (65535 & ((i13 * i15) >> 16))) >> 16);
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public final void m2111(byte[] bArr, int i10, int i11) {
        bArr[i10] = (byte) i11;
        bArr[i10 + 1] = (byte) (i11 >> 8);
        bArr[i10 + 2] = (byte) (i11 >> 16);
        bArr[i10 + 3] = (byte) (i11 >> 24);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public final C4002 m2115(C4002 r72, int i10, byte[] bArr, int i11) {
        while (i10 > 64) {
            C4094 r32 = C3990.f2631;
            byte[] bArr2 = r72.f624;
            System.arraycopy(bArr2, 0, bArr, i11, 32);
            i11 += 32;
            i10 -= 32;
            r72.m2464();
            int i12 = i10 > 64 ? 64 : i10;
            if (r72.f2673 != i12) {
                r72.f2673 = i12;
                r72.m2464();
            }
            r72.m623(bArr2, 0, 64);
        }
        C4094 r02 = C3990.f2631;
        System.arraycopy(r72.f624, 0, bArr, i11, i10);
        return r72;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public final byte[] m2120(int i10) {
        return new byte[]{(byte) (i10 & 255), (byte) ((i10 >> 8) & 255), (byte) ((i10 >> 16) & 255), (byte) ((i10 >> 24) & 255)};
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public final int m2113(byte[] bArr, int i10) {
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public final void m2116(byte[] bArr, int i10, long j10) {
        bArr[i10] = (byte) ((int) j10);
        bArr[i10 + 1] = (byte) ((int) (j10 >> 8));
        bArr[i10 + 2] = (byte) ((int) (j10 >> 16));
        bArr[i10 + 3] = (byte) ((int) (j10 >> 24));
        bArr[i10 + 4] = (byte) ((int) (j10 >> 32));
        bArr[i10 + 5] = (byte) ((int) (j10 >> 40));
        bArr[i10 + 6] = (byte) ((int) (j10 >> 48));
        bArr[i10 + 7] = (byte) ((int) (j10 >> 56));
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public final C4002 m2114(C4002 r32, int i10) {
        r32.m2464();
        int i11 = 64;
        if (i10 <= 64) {
            i11 = i10;
        }
        if (r32.f2673 != i11) {
            r32.f2673 = i11;
            r32.m2464();
        }
        r32.m2465(m2120(i10), 0, 4);
        return r32;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public final void m2118(int[] iArr, int i10, int i11, int i12, int i13) {
        int i14 = i10 + 1;
        int i15 = i11 + 1;
        int r22 = m2112(iArr[i14], iArr[i15]);
        int r42 = m2110(iArr[i14], iArr[i15]);
        long j10 = (((long) iArr[i14]) & 4294967295L) + (((long) iArr[i15]) & 4294967295L) + (((long) (r42 << 1)) & 4294967295L);
        iArr[i10] = iArr[i10] + iArr[i11] + (r22 << 1) + (((r42 >> 24) & 255) >> 7) + ((int) (j10 >> 32));
        int i16 = (int) j10;
        iArr[i14] = i16;
        int i17 = iArr[i13] ^ iArr[i10];
        int i18 = i13 + 1;
        iArr[i13] = i16 ^ iArr[i18];
        iArr[i18] = i17;
        int i19 = i12 + 1;
        int r52 = m2112(iArr[i19], i17);
        int r92 = m2110(iArr[i19], iArr[i18]);
        long j11 = (((long) iArr[i19]) & 4294967295L) + (((long) iArr[i18]) & 4294967295L) + (((long) (r92 << 1)) & 4294967295L);
        iArr[i12] = iArr[i12] + iArr[i13] + (r52 << 1) + (((r92 >> 24) & 255) >> 7) + ((int) (j11 >> 32));
        int i20 = (int) j11;
        iArr[i19] = i20;
        int i21 = iArr[i11] ^ iArr[i12];
        int i22 = i20 ^ iArr[i15];
        iArr[i11] = (i22 << 8) | ((i21 >> 24) & 255);
        int i23 = ((i22 >> 24) & 255) | (i21 << 8);
        iArr[i15] = i23;
        int r53 = m2112(iArr[i14], i23);
        int r93 = m2110(iArr[i14], iArr[i15]);
        long j12 = (((long) iArr[i14]) & 4294967295L) + (((long) iArr[i15]) & 4294967295L) + (((long) (r93 << 1)) & 4294967295L);
        iArr[i10] = iArr[i10] + iArr[i11] + (r53 << 1) + (((r93 >> 24) & 255) >> 7) + ((int) (j12 >> 32));
        int i24 = (int) j12;
        iArr[i14] = i24;
        int i25 = iArr[i13] ^ iArr[i10];
        int i26 = i24 ^ iArr[i18];
        iArr[i13] = (i26 << 16) ^ ((i25 >> 16) & 65535);
        int i27 = (i25 << 16) ^ ((i26 >> 16) & 65535);
        iArr[i18] = i27;
        int r12 = m2112(iArr[i19], i27);
        int r54 = m2110(iArr[i19], iArr[i18]);
        long j13 = (((long) iArr[i19]) & 4294967295L) + (((long) iArr[i18]) & 4294967295L) + (((long) (r54 << 1)) & 4294967295L);
        iArr[i12] = iArr[i12] + iArr[i13] + (r12 << 1) + (((r54 >> 24) & 255) >> 7) + ((int) (j13 >> 32));
        int i28 = (int) j13;
        iArr[i19] = i28;
        int i29 = iArr[i11] ^ iArr[i12];
        int i30 = i28 ^ iArr[i15];
        iArr[i11] = (i29 << 1) ^ (((i30 >> 24) & 255) >> 7);
        iArr[i15] = (i30 << 1) ^ (((i29 >> 24) & 255) >> 7);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public final void m2119(int[] iArr, int i10, int i11, int[] iArr2, int i12, int i13) {
        for (int i14 = 0; i14 < 8; i14++) {
            int i15 = (i10 + (i14 * i11)) * 2;
            int i16 = (i12 + (i14 * i13)) * 2;
            iArr[i15] = iArr2[i16];
            iArr[i15 + 1] = iArr2[i16 + 1];
            iArr[i15 + 2] = iArr2[i16 + 2];
            iArr[i15 + 3] = iArr2[i16 + 3];
        }
        int i17 = i10 * 2;
        int i18 = i10 + (i11 * 2);
        int i19 = i18 * 2;
        int i20 = i10 + (i11 * 4);
        int i21 = i20 * 2;
        int i22 = i10 + (i11 * 6);
        int i23 = i22 * 2;
        m2118(iArr, i17, i19, i21, i23);
        int i24 = (i10 + 1) * 2;
        int i25 = (i18 + 1) * 2;
        int i26 = (i20 + 1) * 2;
        int i27 = (i22 + 1) * 2;
        int[] iArr3 = iArr;
        m2118(iArr3, i24, i25, i26, i27);
        int i28 = i10 + i11;
        int i29 = i28 * 2;
        int i30 = i10 + (i11 * 3);
        int i31 = i30 * 2;
        int i32 = i10 + (i11 * 5);
        int i33 = i32 * 2;
        int i34 = i10 + (i11 * 7);
        int i35 = i34 * 2;
        m2118(iArr3, i29, i31, i33, i35);
        int i36 = (i28 + 1) * 2;
        int i37 = (i30 + 1) * 2;
        int i38 = (i32 + 1) * 2;
        int i39 = (i34 + 1) * 2;
        m2118(iArr3, i36, i37, i38, i39);
        int[] iArr4 = iArr;
        m2118(iArr4, i17, i25, i33, i39);
        m2118(iArr4, i24, i31, i38, i23);
        m2118(iArr4, i29, i37, i21, i27);
        m2118(iArr4, i36, i19, i26, i35);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public final void m2117(byte[] bArr, int i10, byte[] bArr2, int i11, byte[] bArr3, int i12) {
        byte[] bArr4 = bArr;
        byte[] bArr5 = bArr2;
        byte[] bArr6 = bArr3;
        int[] iArr = new int[256];
        int[] iArr2 = new int[256];
        int[] iArr3 = new int[256];
        for (int i13 = 0; i13 < 256; i13 += 2) {
            int i14 = i13 * 4;
            int i15 = i11 + i14;
            int i16 = i12 + i14;
            iArr[i13 + 1] = m2113(bArr5, i15) ^ m2113(bArr6, i16);
            iArr[i13] = m2113(bArr5, i15 + 4) ^ m2113(bArr6, i16 + 4);
        }
        for (int i17 = 0; i17 < 8; i17++) {
            int i18 = i17 * 16;
            m2119(iArr2, i18, 2, iArr, i18, 2);
        }
        for (int i19 = 0; i19 < 8; i19++) {
            int i20 = i19 * 2;
            m2119(iArr3, i20, 16, iArr2, i20, 16);
        }
        for (int i21 = 0; i21 < 256; i21 += 2) {
            int i22 = i10 + (i21 * 4);
            int i23 = i21 + 1;
            m2111(bArr4, i22, (m2113(bArr4, i22) ^ iArr[i23]) ^ iArr3[i23]);
            int i24 = i22 + 4;
            m2111(bArr4, i24, (m2113(bArr4, i24) ^ iArr[i21]) ^ iArr3[i21]);
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public byte[] m2121(byte[] bArr, int i10, int i11) {
        char c10;
        int i12;
        byte[] bArr2;
        int i13;
        int i14;
        int i15;
        byte[] bArr3;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22 = i11;
        int i23 = 1;
        String r12 = C3727.m1052("Qcu|z'r\u0018*<53n6\u00046 )/r*&LCMFO\u0019j", 22, 7, 63);
        C4094 r22 = C3990.f2631;
        C4002 r13 = (C4002) C3618.f582.m563(r12);
        int i24 = 0;
        int i25 = 4;
        r13.m2465(m2120(this.f2257), 0, 4);
        r13.m2465(m2120(80), 0, 4);
        r13.m2465(m2120(this.f2260), 0, 4);
        r13.m2465(m2120(this.f2258), 0, 4);
        r13.m2465(m2120(19), 0, 4);
        r13.m2465(m2120(this.f2259), 0, 4);
        r13.m2465(m2120(i22), 0, 4);
        r13.m2465(bArr, i10, i22);
        r13.m2465(m2120(this.f2261.length), 0, 4);
        byte[] bArr4 = this.f2261;
        r13.m2465(bArr4, 0, bArr4.length);
        r13.m2465(m2120(0), 0, 4);
        byte[] r02 = m2120(0);
        r13.m2465(r02, 0, 4);
        r13.f624 = r13.m2468();
        System.arraycopy(r02, 0, new byte[4], 0, 4);
        byte[] bArr5 = r13.f624;
        int i26 = this.f2260;
        int i27 = this.f2257;
        int i28 = i26 / (i27 * 4);
        int i29 = i28 * 4;
        int i30 = i29 * i27;
        int i31 = 1024;
        byte[] bArr6 = new byte[(i30 * 1024)];
        for (int i32 = 0; i32 < this.f2257; i32++) {
            r13 = m2114(r13, 1024);
            r13.m621(bArr5, 0, 64, (byte[]) null, 0);
            r13.m2465(m2120(0), 0, 4);
            byte[] r122 = m2120(i32);
            r13.m2465(r122, 0, 4);
            r13.f624 = r13.m2468();
            System.arraycopy(r122, 0, new byte[4], 0, 4);
            m2115(r13, 1024, bArr6, i32 * 1024);
        }
        C4002 r123 = r13;
        int i33 = 0;
        while (i33 < this.f2257) {
            C4002 r23 = m2114(r123, 1024);
            r23.m621(bArr5, 0, 64, (byte[]) null, 0);
            r23.m2465(m2120(1), 0, 4);
            byte[] r124 = m2120(i33);
            r23.m2465(r124, 0, 4);
            r23.f624 = r23.m2468();
            System.arraycopy(r124, 0, new byte[4], 0, 4);
            m2115(r23, 1024, bArr6, (this.f2257 + i33) * 1024);
            i33++;
            r123 = r23;
        }
        int i34 = this.f2259 == 0 ? 1 : 0;
        byte[] bArr7 = new byte[1024];
        int i35 = 2;
        int i36 = 0;
        int i37 = 2;
        while (i36 < this.f2258) {
            int i38 = i37;
            int i39 = i24;
            while (i39 < i25) {
                int i40 = (i36 == 0 && i39 == i35 && this.f2259 == i35) ? i23 : i34;
                int i41 = i24;
                while (i41 < this.f2257) {
                    int i42 = i38;
                    while (i42 < i28) {
                        int i43 = i39 * i28;
                        int i44 = i43 + i42;
                        int i45 = i44 == 0 ? i29 - 1 : i44 - 1;
                        int i46 = i28;
                        if (i40 != 0) {
                            int r82 = m2113(bArr6, ((this.f2257 * i45) + i41) * i31);
                            i17 = m2113(bArr6, (((this.f2257 * i45) + i41) * i31) + i25);
                            i14 = i46;
                            i16 = i41;
                            bArr3 = bArr7;
                            i12 = i39;
                            bArr2 = bArr6;
                            i18 = r82;
                            i13 = i40;
                            c10 = ' ';
                            int i47 = i31;
                            i15 = i30;
                        } else {
                            if (i42 == i38 || i42 % 128 == 0) {
                                byte[] bArr8 = new byte[i31];
                                i13 = i40;
                                m2116(bArr8, i24, (long) i36);
                                m2116(bArr8, 8, (long) i41);
                                m2116(bArr8, 16, (long) i39);
                                m2116(bArr8, 24, (long) i30);
                                m2116(bArr8, 32, (long) this.f2258);
                                m2116(bArr8, 40, (long) this.f2259);
                                m2116(bArr8, 48, (long) ((i42 / 128) + 1));
                                byte[] bArr9 = new byte[i31];
                                int i48 = i41;
                                i16 = i48;
                                i12 = i39;
                                bArr2 = bArr6;
                                i15 = i30;
                                c10 = ' ';
                                i14 = i46;
                                m2117(bArr9, 0, bArr9, 0, bArr8, 0);
                                byte[] bArr10 = new byte[i31];
                                m2117(bArr10, 0, bArr10, 0, bArr9, 0);
                                bArr7 = bArr10;
                            } else {
                                i14 = i46;
                                i16 = i41;
                                i12 = i39;
                                bArr2 = bArr6;
                                int i49 = i31;
                                i13 = i40;
                                c10 = ' ';
                                i15 = i30;
                            }
                            int i50 = (i42 % 128) * 8;
                            i18 = m2113(bArr7, i50);
                            i17 = m2113(bArr7, i50 + 4);
                            bArr3 = bArr7;
                        }
                        if (i36 == 0 && i12 == 0) {
                            i19 = i16;
                        } else {
                            i19 = i17 % this.f2257;
                        }
                        if (i36 == 0) {
                            i21 = 0;
                            i20 = 4;
                        } else {
                            i20 = 4;
                            i21 = ((i12 + 1) % 4) * i14;
                        }
                        if (i19 == i16) {
                            i43 = i45;
                        } else if (i42 == 0) {
                            i43 = ((i43 + i29) - 1) % i29;
                        }
                        int i51 = ((i43 + i29) - i21) % i29;
                        long j10 = ((long) i18) & 4294967295L;
                        int i52 = i16;
                        int i53 = i51 - 1;
                        int i54 = this.f2257;
                        int i55 = (i19 + (i54 * ((i21 + (i53 - ((int) (((((long) i51) & 4294967295L) * (((long) ((int) ((j10 * j10) >> c10))) & 4294967295L)) >> c10)))) % i29))) * 1024;
                        bArr6 = bArr2;
                        m2117(bArr2, (i52 + (i44 * i54)) * 1024, bArr6, (i52 + (i45 * i54)) * 1024, bArr2, i55);
                        i42++;
                        i23 = 1;
                        bArr7 = bArr3;
                        i30 = i15;
                        i41 = i52;
                        i28 = i14;
                        i25 = i20;
                        i40 = i13;
                        i39 = i12;
                        i31 = 1024;
                        i24 = 0;
                    }
                    int i56 = i39;
                    byte[] bArr11 = bArr6;
                    int i57 = i28;
                    int i58 = i23;
                    int i59 = i25;
                    int i60 = i40;
                    int i61 = i30;
                    i41++;
                    i40 = i60;
                    i39 = i56;
                    i31 = 1024;
                    i24 = 0;
                }
                int i62 = i39;
                byte[] bArr12 = bArr6;
                int i63 = i28;
                int i64 = i23;
                int i65 = i25;
                int i66 = i40;
                int i67 = i30;
                i31 = 1024;
                i24 = 0;
                i35 = 2;
                i38 = 0;
                i39 = i62 + 1;
                i34 = i66;
            }
            byte[] bArr13 = bArr6;
            int i68 = i30;
            int i69 = i28;
            int i70 = i25;
            i36 += i23;
            i37 = i38;
            i31 = 1024;
            i24 = 0;
            i35 = 2;
        }
        int i71 = i31;
        int i72 = i23;
        byte[] bArr14 = new byte[i71];
        int i73 = i29 - 1;
        byte[] bArr15 = bArr6;
        System.arraycopy(bArr15, this.f2257 * i73 * i71, bArr14, 0, i71);
        int i74 = 1;
        while (true) {
            int i75 = this.f2257;
            if (i74 < i75) {
                int i76 = ((i75 * i73) + i74) * i71;
                int i77 = 0;
                int i78 = 0;
                int i79 = 1024;
                while (i79 >= 16) {
                    i79 -= 16;
                    int i80 = i76;
                    int i81 = i78;
                    int i82 = 0;
                    while (i82 < 16) {
                        bArr14[i81] = (byte) (bArr14[i77] ^ bArr15[i80]);
                        i82++;
                        i81++;
                        i77++;
                        i80++;
                    }
                    i78 = i81;
                    i76 = i80;
                }
                i74++;
                i71 = 1024;
            } else {
                byte[] bArr16 = new byte[80];
                C4002 r32 = m2114(r123, 80);
                r32.m2465(bArr14, 0, 1024);
                r32.f624 = r32.m2468();
                System.arraycopy(bArr14, 0, new byte[1024], 0, 1024);
                m2115(r32, 80, bArr16, 0);
                return bArr16;
            }
        }
    }
}

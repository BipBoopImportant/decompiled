package nts;

/* renamed from: nts.ೞ  reason: contains not printable characters */
public class C3724 extends C3550 {

    /* renamed from: и  reason: contains not printable characters */
    public static int[] f996 = new int[256];

    /* renamed from: ࡑ  reason: contains not printable characters */
    public static int[] f997 = new int[256];

    /* renamed from: ഗ  reason: contains not printable characters */
    public static int[] f998 = new int[256];

    /* renamed from: ภ  reason: contains not printable characters */
    public static int[] f999 = new int[256];

    /* renamed from: ᅯ  reason: contains not printable characters */
    public static int[] f1000 = new int[256];

    /* renamed from: ᐽ  reason: contains not printable characters */
    public static int[] f1001 = new int[256];

    /* renamed from: ᖑ  reason: contains not printable characters */
    public static int[] f1002 = new int[256];

    /* renamed from: ᘺ  reason: contains not printable characters */
    public static int[] f1003 = new int[256];

    /* renamed from: ᚪ  reason: contains not printable characters */
    public static int[] f1004 = new int[256];

    /* renamed from: ᜇ  reason: contains not printable characters */
    public static int[] f1005 = new int[256];

    /* renamed from: ᢼ  reason: contains not printable characters */
    public static int[] f1006 = new int[256];

    /* renamed from: ṧ  reason: contains not printable characters */
    public static int[] f1007 = new int[10];

    /* renamed from: ⱑ  reason: contains not printable characters */
    public static int[] f1008 = new int[256];

    /* renamed from: ⴸ  reason: contains not printable characters */
    public static int[] f1009 = new int[256];

    /* renamed from: ⵜ  reason: contains not printable characters */
    public static int[] f1010 = new int[256];

    static {
        int[] iArr = new int[256];
        int[] iArr2 = new int[256];
        int i10 = 0;
        int i11 = 1;
        while (i10 < 256) {
            iArr[i10] = i11;
            iArr2[i11] = i10;
            i10++;
            i11 ^= m1028(i11);
        }
        int i12 = 0;
        int i13 = 1;
        while (i12 < 10) {
            f1007[i12] = i13 << 24;
            i12++;
            i13 = m1028(i13);
        }
        f1009[0] = 99;
        f1002[99] = 0;
        for (int i14 = 1; i14 < 256; i14++) {
            int i15 = iArr[255 - iArr2[i14]];
            int i16 = ((i15 << 1) | (i15 >>> 7)) & 255;
            int i17 = i15 ^ i16;
            int i18 = ((i16 >>> 7) | (i16 << 1)) & 255;
            int i19 = i17 ^ i18;
            int i20 = ((i18 >>> 7) | (i18 << 1)) & 255;
            int i21 = (i19 ^ i20) ^ ((((i20 >>> 7) | (i20 << 1)) & 255) ^ 99);
            f1009[i14] = i21;
            f1002[i21] = i14;
        }
        for (int i22 = 0; i22 < 256; i22++) {
            int i23 = f1009[i22];
            int r62 = m1028(i23);
            int i24 = ((i23 << 16) ^ ((i23 ^ r62) ^ (i23 << 8))) ^ (r62 << 24);
            f1000[i22] = i24;
            f1003[i22] = m1027(i24);
            f997[i22] = m1027(f1003[i22]);
            f996[i22] = m1027(f997[i22]);
            int i25 = f1002[i22];
            f1005[i22] = (m1024(14, i25, iArr, iArr2) << 24) ^ ((m1024(11, i25, iArr, iArr2) ^ (m1024(13, i25, iArr, iArr2) << 8)) ^ (m1024(9, i25, iArr, iArr2) << 16));
            f1006[i22] = m1027(f1005[i22]);
            f998[i22] = m1027(f1006[i22]);
            f1008[i22] = m1027(f998[i22]);
        }
        for (int i26 = 0; i26 < 256; i26++) {
            int[] iArr3 = f999;
            int[] iArr4 = f1005;
            int[] iArr5 = f1009;
            iArr3[i26] = iArr4[iArr5[i26]];
            f1001[i26] = f1006[iArr5[i26]];
            f1004[i26] = f998[iArr5[i26]];
            f1010[i26] = f1008[iArr5[i26]];
        }
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public static void m1023(byte[] bArr, int[] iArr, int i10) {
        int[] iArr2 = new int[4];
        int[] iArr3 = new int[4];
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < 4) {
            int i15 = i13 + 1;
            int i16 = iArr[i13];
            byte b10 = ((bArr[i14 + 1] << 16) & 16711680) | ((bArr[i14] << 24) & -16777216);
            int i17 = i14 + 3;
            i14 += 4;
            iArr2[i12] = i16 ^ ((b10 | ((bArr[i14 + 2] << 8) & 65280)) | (bArr[i17] & 255));
            i12++;
            i13 = i15;
        }
        char c10 = 1;
        int i18 = 1;
        while (true) {
            int[] iArr4 = iArr3;
            iArr3 = iArr2;
            iArr2 = iArr4;
            if (i18 >= i10) {
                break;
            }
            int i19 = iArr[i13];
            int[] iArr5 = f1000;
            int i20 = i19 ^ iArr5[(iArr3[0] >>> 24) & 255];
            int[] iArr6 = f1003;
            int i21 = iArr3[c10];
            int i22 = i20 ^ iArr6[(i21 >>> 16) & 255];
            int[] iArr7 = f997;
            int i23 = iArr3[2];
            int i24 = iArr7[(i23 >>> 8) & 255] ^ i22;
            int[] iArr8 = f996;
            int i25 = iArr3[3];
            iArr2[0] = i24 ^ iArr8[i25 & 255];
            int i26 = ((iArr[i13 + 1] ^ iArr5[(i21 >>> 24) & 255]) ^ iArr6[(i23 >>> 16) & 255]) ^ iArr7[(i25 >>> 8) & 255];
            int i27 = iArr3[0];
            iArr2[c10] = i26 ^ iArr8[i27 & 255];
            int i28 = i13 + 3;
            int i29 = ((iArr[i13 + 2] ^ iArr5[(i23 >>> 24) & 255]) ^ iArr6[(i25 >>> 16) & 255]) ^ iArr7[(i27 >>> 8) & 255];
            int i30 = iArr3[c10];
            iArr2[2] = i29 ^ iArr8[i30 & 255];
            i13 += 4;
            iArr2[3] = (((iArr[i28] ^ iArr5[(i25 >>> 24) & 255]) ^ iArr6[(i27 >>> 16) & 255]) ^ iArr7[(i30 >>> 8) & 255]) ^ iArr8[iArr3[2] & 255];
            i18++;
            c10 = 1;
        }
        int i31 = iArr[i13];
        int[] iArr9 = f1009;
        int i32 = iArr3[1];
        int i33 = iArr3[2];
        int i34 = iArr3[3];
        iArr2[0] = (((i31 ^ (iArr9[(iArr3[0] >>> 24) & 255] << 24)) ^ (iArr9[(i32 >>> 16) & 255] << 16)) ^ (iArr9[(i33 >>> 8) & 255] << 8)) ^ iArr9[i34 & 255];
        int i35 = ((iArr[i13 + 1] ^ (iArr9[(i32 >>> 24) & 255] << 24)) ^ (iArr9[(i33 >>> 16) & 255] << 16)) ^ (iArr9[(i34 >>> 8) & 255] << 8);
        int i36 = iArr3[0];
        iArr2[1] = i35 ^ iArr9[i36 & 255];
        int i37 = ((iArr[i13 + 2] ^ (iArr9[(i33 >>> 24) & 255] << 24)) ^ (iArr9[(i34 >>> 16) & 255] << 16)) ^ (iArr9[(i36 >>> 8) & 255] << 8);
        int i38 = iArr3[1];
        iArr2[2] = i37 ^ iArr9[i38 & 255];
        iArr2[3] = (((iArr[i13 + 3] ^ (iArr9[(i34 >>> 24) & 255] << 24)) ^ (iArr9[(i36 >>> 16) & 255] << 16)) ^ (iArr9[(i38 >>> 8) & 255] << 8)) ^ iArr9[iArr3[2] & 255];
        int i39 = 0;
        for (int i40 = 4; i11 < i40; i40 = 4) {
            int i41 = iArr2[i11];
            bArr[i39] = (byte) (i41 >>> 24);
            bArr[i39 + 1] = (byte) (i41 >>> 16);
            int i42 = i39 + 3;
            bArr[i39 + 2] = (byte) (i41 >>> 8);
            i39 += 4;
            bArr[i42] = (byte) i41;
            i11++;
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static int m1024(int i10, int i11, int[] iArr, int[] iArr2) {
        if (i10 == 0 || i11 == 0) {
            return 0;
        }
        return iArr[(iArr2[i10] + iArr2[i11]) % 255];
    }

    /* renamed from: ⶊ  reason: contains not printable characters */
    public static int m1027(int i10) {
        return (i10 >>> 8) | (i10 << 24);
    }

    /* renamed from: ⶏ  reason: contains not printable characters */
    public static int m1028(int i10) {
        return ((i10 & 128) != 0 ? 27 : 0) ^ ((i10 << 1) & 255);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0020 A[LOOP:0: B:8:0x001b->B:10:0x0020, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x014a  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x01b7 A[LOOP:4: B:26:0x01b5->B:27:0x01b7, LOOP_END] */
    /* renamed from: ഇ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m1025(byte[] r14, int r15, int r16, int[] r17, int[] r18) {
        /*
            r0 = 8
            int r1 = r16 * 8
            r2 = 256(0x100, float:3.59E-43)
            r3 = 192(0xc0, float:2.69E-43)
            r4 = 10
            r5 = 128(0x80, float:1.794E-43)
            if (r1 == r5) goto L_0x0012
            if (r1 == r3) goto L_0x0017
            if (r1 == r2) goto L_0x0014
        L_0x0012:
            r6 = r4
            goto L_0x0019
        L_0x0014:
            r6 = 14
            goto L_0x0019
        L_0x0017:
            r6 = 12
        L_0x0019:
            r7 = 0
            r8 = r7
        L_0x001b:
            int r9 = r1 >>> 5
            r10 = 3
            if (r8 >= r9) goto L_0x0049
            int r9 = r8 * 4
            int r9 = r9 + r15
            byte r11 = r14[r9]
            int r11 = r11 << 24
            r12 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r11 = r11 & r12
            int r12 = r9 + 1
            byte r12 = r14[r12]
            int r12 = r12 << 16
            r13 = 16711680(0xff0000, float:2.3418052E-38)
            r12 = r12 & r13
            r11 = r11 | r12
            int r12 = r9 + 2
            byte r12 = r14[r12]
            int r12 = r12 << r0
            r13 = 65280(0xff00, float:9.1477E-41)
            r12 = r12 & r13
            r11 = r11 | r12
            int r9 = r9 + r10
            byte r9 = r14[r9]
            r9 = r9 & 255(0xff, float:3.57E-43)
            r9 = r9 | r11
            r17[r8] = r9
            int r8 = r8 + 1
            goto L_0x001b
        L_0x0049:
            if (r1 == r5) goto L_0x014a
            if (r1 == r3) goto L_0x00e7
            if (r1 == r2) goto L_0x0052
            r2 = r7
            goto L_0x019b
        L_0x0052:
            r1 = r7
            r2 = r1
        L_0x0054:
            r3 = 7
            if (r1 >= r3) goto L_0x019b
            int r3 = r2 + 8
            r4 = r17[r2]
            int[] r5 = f1007
            r5 = r5[r1]
            r4 = r4 ^ r5
            int[] r5 = f1009
            int r8 = r2 + 7
            r9 = r17[r8]
            int r11 = r9 >>> 16
            r11 = r11 & 255(0xff, float:3.57E-43)
            r11 = r5[r11]
            int r11 = r11 << 24
            r4 = r4 ^ r11
            int r11 = r9 >>> 8
            r11 = r11 & 255(0xff, float:3.57E-43)
            r11 = r5[r11]
            int r11 = r11 << 16
            r4 = r4 ^ r11
            r11 = r9 & 255(0xff, float:3.57E-43)
            r11 = r5[r11]
            int r11 = r11 << r0
            r4 = r4 ^ r11
            int r9 = r9 >>> 24
            r9 = r9 & 255(0xff, float:3.57E-43)
            r9 = r5[r9]
            r4 = r4 ^ r9
            r17[r3] = r4
            int r9 = r2 + 9
            int r11 = r2 + 1
            r11 = r17[r11]
            r4 = r4 ^ r11
            r17[r9] = r4
            int r9 = r2 + 10
            int r11 = r2 + 2
            r11 = r17[r11]
            r4 = r4 ^ r11
            r17[r9] = r4
            int r9 = r2 + 11
            int r11 = r2 + 3
            r11 = r17[r11]
            r4 = r4 ^ r11
            r17[r9] = r4
            int r9 = r2 + 12
            int r11 = r2 + 4
            r11 = r17[r11]
            int r12 = r4 >>> 24
            r12 = r12 & 255(0xff, float:3.57E-43)
            r12 = r5[r12]
            int r12 = r12 << 24
            r11 = r11 ^ r12
            int r12 = r4 >>> 16
            r12 = r12 & 255(0xff, float:3.57E-43)
            r12 = r5[r12]
            int r12 = r12 << 16
            r11 = r11 ^ r12
            int r12 = r4 >>> 8
            r12 = r12 & 255(0xff, float:3.57E-43)
            r12 = r5[r12]
            int r12 = r12 << r0
            r11 = r11 ^ r12
            r4 = r4 & 255(0xff, float:3.57E-43)
            r4 = r5[r4]
            r4 = r4 ^ r11
            r17[r9] = r4
            int r5 = r2 + 13
            int r9 = r2 + 5
            r9 = r17[r9]
            r4 = r4 ^ r9
            r17[r5] = r4
            int r5 = r2 + 14
            int r9 = r2 + 6
            r9 = r17[r9]
            r4 = r4 ^ r9
            r17[r5] = r4
            int r2 = r2 + 15
            r5 = r17[r8]
            r4 = r4 ^ r5
            r17[r2] = r4
            int r1 = r1 + 1
            r2 = r3
            goto L_0x0054
        L_0x00e7:
            r1 = r7
            r2 = r1
        L_0x00e9:
            if (r1 >= r0) goto L_0x019b
            int r3 = r2 + 6
            r4 = r17[r2]
            int[] r5 = f1007
            r5 = r5[r1]
            r4 = r4 ^ r5
            int[] r5 = f1009
            int r8 = r2 + 5
            r9 = r17[r8]
            int r11 = r9 >>> 16
            r11 = r11 & 255(0xff, float:3.57E-43)
            r11 = r5[r11]
            int r11 = r11 << 24
            r4 = r4 ^ r11
            int r11 = r9 >>> 8
            r11 = r11 & 255(0xff, float:3.57E-43)
            r11 = r5[r11]
            int r11 = r11 << 16
            r4 = r4 ^ r11
            r11 = r9 & 255(0xff, float:3.57E-43)
            r11 = r5[r11]
            int r11 = r11 << r0
            r4 = r4 ^ r11
            int r9 = r9 >>> 24
            r9 = r9 & 255(0xff, float:3.57E-43)
            r5 = r5[r9]
            r4 = r4 ^ r5
            r17[r3] = r4
            int r5 = r2 + 7
            int r9 = r2 + 1
            r9 = r17[r9]
            r4 = r4 ^ r9
            r17[r5] = r4
            int r5 = r2 + 8
            int r9 = r2 + 2
            r9 = r17[r9]
            r4 = r4 ^ r9
            r17[r5] = r4
            int r5 = r2 + 9
            int r9 = r2 + 3
            r9 = r17[r9]
            r4 = r4 ^ r9
            r17[r5] = r4
            int r5 = r2 + 10
            int r9 = r2 + 4
            r9 = r17[r9]
            r4 = r4 ^ r9
            r17[r5] = r4
            int r2 = r2 + 11
            r5 = r17[r8]
            r4 = r4 ^ r5
            r17[r2] = r4
            int r1 = r1 + 1
            r2 = r3
            goto L_0x00e9
        L_0x014a:
            r1 = r7
            r2 = r1
        L_0x014c:
            if (r1 >= r4) goto L_0x019b
            int r3 = r2 + 4
            r5 = r17[r2]
            int[] r8 = f1007
            r8 = r8[r1]
            r5 = r5 ^ r8
            int[] r8 = f1009
            int r9 = r2 + 3
            r11 = r17[r9]
            int r12 = r11 >>> 16
            r12 = r12 & 255(0xff, float:3.57E-43)
            r12 = r8[r12]
            int r12 = r12 << 24
            r5 = r5 ^ r12
            int r12 = r11 >>> 8
            r12 = r12 & 255(0xff, float:3.57E-43)
            r12 = r8[r12]
            int r12 = r12 << 16
            r5 = r5 ^ r12
            r12 = r11 & 255(0xff, float:3.57E-43)
            r12 = r8[r12]
            int r12 = r12 << r0
            r5 = r5 ^ r12
            int r11 = r11 >>> 24
            r11 = r11 & 255(0xff, float:3.57E-43)
            r8 = r8[r11]
            r5 = r5 ^ r8
            r17[r3] = r5
            int r8 = r2 + 5
            int r11 = r2 + 1
            r11 = r17[r11]
            r5 = r5 ^ r11
            r17[r8] = r5
            int r8 = r2 + 6
            int r11 = r2 + 2
            r11 = r17[r11]
            r5 = r5 ^ r11
            r17[r8] = r5
            int r2 = r2 + 7
            r8 = r17[r9]
            r5 = r5 ^ r8
            r17[r2] = r5
            int r1 = r1 + 1
            r2 = r3
            goto L_0x014c
        L_0x019b:
            int r0 = r2 + 1
            r1 = r17[r2]
            r18[r7] = r1
            int r1 = r2 + 2
            r0 = r17[r0]
            r3 = 1
            r18[r3] = r0
            int r0 = r2 + 3
            r1 = r17[r1]
            r4 = 2
            r18[r4] = r1
            r1 = 4
            int r2 = r2 + r1
            r0 = r17[r0]
            r18[r10] = r0
        L_0x01b5:
            if (r3 >= r6) goto L_0x0249
            int r0 = r2 + -8
            int r4 = r1 + 1
            int[] r5 = f999
            r0 = r17[r0]
            int r7 = r0 >>> 24
            r7 = r7 & 255(0xff, float:3.57E-43)
            r7 = r5[r7]
            int[] r8 = f1001
            int r9 = r0 >>> 16
            r9 = r9 & 255(0xff, float:3.57E-43)
            r9 = r8[r9]
            r7 = r7 ^ r9
            int[] r9 = f1004
            int r11 = r0 >>> 8
            r11 = r11 & 255(0xff, float:3.57E-43)
            r11 = r9[r11]
            r7 = r7 ^ r11
            int[] r11 = f1010
            r0 = r0 & 255(0xff, float:3.57E-43)
            r0 = r11[r0]
            r0 = r0 ^ r7
            r18[r1] = r0
            int r0 = r2 + -7
            int r7 = r1 + 2
            r0 = r17[r0]
            int r12 = r0 >>> 24
            r12 = r12 & 255(0xff, float:3.57E-43)
            r12 = r5[r12]
            int r13 = r0 >>> 16
            r13 = r13 & 255(0xff, float:3.57E-43)
            r13 = r8[r13]
            r12 = r12 ^ r13
            int r13 = r0 >>> 8
            r13 = r13 & 255(0xff, float:3.57E-43)
            r13 = r9[r13]
            r12 = r12 ^ r13
            r0 = r0 & 255(0xff, float:3.57E-43)
            r0 = r11[r0]
            r0 = r0 ^ r12
            r18[r4] = r0
            int r0 = r2 + -6
            int r4 = r1 + 3
            r0 = r17[r0]
            int r12 = r0 >>> 24
            r12 = r12 & 255(0xff, float:3.57E-43)
            r12 = r5[r12]
            int r13 = r0 >>> 16
            r13 = r13 & 255(0xff, float:3.57E-43)
            r13 = r8[r13]
            r12 = r12 ^ r13
            int r13 = r0 >>> 8
            r13 = r13 & 255(0xff, float:3.57E-43)
            r13 = r9[r13]
            r12 = r12 ^ r13
            r0 = r0 & 255(0xff, float:3.57E-43)
            r0 = r11[r0]
            r0 = r0 ^ r12
            r18[r7] = r0
            int r0 = r2 + -5
            int r1 = r1 + 4
            r0 = r17[r0]
            int r7 = r0 >>> 24
            r7 = r7 & 255(0xff, float:3.57E-43)
            r5 = r5[r7]
            int r7 = r0 >>> 16
            r7 = r7 & 255(0xff, float:3.57E-43)
            r7 = r8[r7]
            r5 = r5 ^ r7
            int r7 = r0 >>> 8
            r7 = r7 & 255(0xff, float:3.57E-43)
            r7 = r9[r7]
            r5 = r5 ^ r7
            r0 = r0 & 255(0xff, float:3.57E-43)
            r0 = r11[r0]
            r0 = r0 ^ r5
            r18[r4] = r0
            int r2 = r2 + -4
            int r3 = r3 + 1
            goto L_0x01b5
        L_0x0249:
            int r0 = r2 + -8
            int r3 = r1 + 1
            int r4 = r2 + -7
            r0 = r17[r0]
            r18[r1] = r0
            int r0 = r1 + 2
            int r5 = r2 + -6
            r4 = r17[r4]
            r18[r3] = r4
            int r1 = r1 + r10
            int r2 = r2 + -5
            r3 = r17[r5]
            r18[r0] = r3
            r0 = r17[r2]
            r18[r1] = r0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: nts.C3724.m1025(byte[], int, int, int[], int[]):int");
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static void m1026(byte[] bArr, int[] iArr, int i10) {
        int[] iArr2 = new int[4];
        int[] iArr3 = new int[4];
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i12 < 4) {
            int i15 = i13 + 1;
            int i16 = iArr[i13];
            byte b10 = ((bArr[i14 + 1] << 16) & 16711680) | ((bArr[i14] << 24) & -16777216);
            int i17 = i14 + 3;
            i14 += 4;
            iArr2[i12] = i16 ^ ((b10 | ((bArr[i14 + 2] << 8) & 65280)) | (bArr[i17] & 255));
            i12++;
            i13 = i15;
        }
        char c10 = 1;
        int i18 = 1;
        while (true) {
            int[] iArr4 = iArr3;
            iArr3 = iArr2;
            iArr2 = iArr4;
            if (i18 >= i10) {
                break;
            }
            int i19 = iArr[i13];
            int[] iArr5 = f1005;
            int i20 = i19 ^ iArr5[(iArr3[0] >>> 24) & 255];
            int[] iArr6 = f1006;
            int i21 = iArr3[3];
            int i22 = i20 ^ iArr6[(i21 >>> 16) & 255];
            int[] iArr7 = f998;
            int i23 = iArr3[2];
            int i24 = iArr7[(i23 >>> 8) & 255] ^ i22;
            int[] iArr8 = f1008;
            int i25 = iArr3[c10];
            iArr2[0] = iArr8[i25 & 255] ^ i24;
            int i26 = iArr[i13 + 1] ^ iArr5[(i25 >>> 24) & 255];
            int i27 = iArr3[0];
            iArr2[1] = ((i26 ^ iArr6[(i27 >>> 16) & 255]) ^ iArr7[(i21 >>> 8) & 255]) ^ iArr8[i23 & 255];
            int i28 = i13 + 3;
            int i29 = iArr5[(i23 >>> 24) & 255] ^ iArr[i13 + 2];
            int i30 = iArr3[1];
            iArr2[2] = ((i29 ^ iArr6[(i30 >>> 16) & 255]) ^ iArr7[(i27 >>> 8) & 255]) ^ iArr8[i21 & 255];
            i13 += 4;
            iArr2[3] = (((iArr[i28] ^ iArr5[(i21 >>> 24) & 255]) ^ iArr6[(iArr3[2] >>> 16) & 255]) ^ iArr7[(i30 >>> 8) & 255]) ^ iArr8[i27 & 255];
            i18++;
            c10 = 1;
        }
        int i31 = iArr[i13];
        int[] iArr9 = f1002;
        int i32 = iArr3[3];
        int i33 = iArr3[2];
        int i34 = iArr3[1];
        iArr2[0] = (((i31 ^ (iArr9[(iArr3[0] >>> 24) & 255] << 24)) ^ (iArr9[(i32 >>> 16) & 255] << 16)) ^ (iArr9[(i33 >>> 8) & 255] << 8)) ^ iArr9[i34 & 255];
        int i35 = iArr[i13 + 1] ^ (iArr9[(i34 >>> 24) & 255] << 24);
        int i36 = iArr3[0];
        iArr2[1] = ((i35 ^ (iArr9[(i36 >>> 16) & 255] << 16)) ^ (iArr9[(i32 >>> 8) & 255] << 8)) ^ iArr9[i33 & 255];
        int i37 = iArr[i13 + 2] ^ (iArr9[(i33 >>> 24) & 255] << 24);
        int i38 = iArr3[1];
        iArr2[2] = ((i37 ^ (iArr9[(i38 >>> 16) & 255] << 16)) ^ (iArr9[(i36 >>> 8) & 255] << 8)) ^ iArr9[i32 & 255];
        iArr2[3] = (((iArr[i13 + 3] ^ (iArr9[(i32 >>> 24) & 255] << 24)) ^ (iArr9[(iArr3[2] >>> 16) & 255] << 16)) ^ (iArr9[(i38 >>> 8) & 255] << 8)) ^ iArr9[i36 & 255];
        int i39 = 0;
        for (int i40 = 4; i11 < i40; i40 = 4) {
            int i41 = iArr2[i11];
            bArr[i39] = (byte) (i41 >>> 24);
            bArr[i39 + 1] = (byte) (i41 >>> 16);
            int i42 = i39 + 3;
            bArr[i39 + 2] = (byte) (i41 >>> 8);
            i39 += 4;
            bArr[i42] = (byte) i41;
            i11++;
        }
    }
}

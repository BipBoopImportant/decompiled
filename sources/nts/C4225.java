package nts;

/* renamed from: nts.ㅤ  reason: contains not printable characters */
public class C4225 extends C3842 {

    /* renamed from: ᅯ  reason: contains not printable characters */
    public static byte[] f4206 = {1, 2, 3, 5};

    /* renamed from: ⴸ  reason: contains not printable characters */
    public static byte[] f4207 = {-39, 120, -7, -60, 25, -35, -75, -19, 40, -23, -3, 121, 74, -96, -40, -99, -58, 126, 55, -125, 43, 118, 83, -114, 98, 76, 100, -120, 68, -117, -5, -94, 23, -102, 89, -11, -121, -77, 79, 19, 97, 69, 109, -115, 9, -127, 125, 50, -67, -113, 64, -21, -122, -73, 123, 11, -16, -107, 33, 34, 92, 107, 78, -126, 84, -42, 101, -109, -50, 96, -78, 28, 115, 86, -64, 20, -89, -116, -15, -36, 18, 117, -54, 31, 59, -66, -28, -47, 66, 61, -44, 48, -93, 60, -74, 38, 111, -65, 14, -38, 70, 105, 7, 87, 39, -14, 29, -101, -68, -108, 67, 3, -8, 17, -57, -10, -112, -17, 62, -25, 6, -61, -43, 47, -56, 102, 30, -41, 8, -24, -22, -34, Byte.MIN_VALUE, 82, -18, -9, -124, -86, 114, -84, 53, 77, 106, 42, -106, 26, -46, 113, 90, 21, 73, 116, 75, -97, -48, 94, 4, 24, -92, -20, -62, -32, 65, 110, 15, 81, -53, -52, 36, -111, -81, 80, -95, -12, 112, 57, -103, 124, 58, -123, 35, -72, -76, 122, -4, 2, 54, 91, 37, 85, -105, 49, 45, 93, -6, -104, -29, -118, -110, -82, 5, -33, 41, 16, 103, 108, -70, -55, -45, 0, -26, -49, -31, -98, -88, 44, 99, 22, 1, 63, 88, -30, -119, -87, 13, 56, 52, 27, -85, 51, -1, -80, -69, 72, 12, 95, -71, -79, -51, 46, -59, -13, -37, 71, -27, -91, -100, 119, 10, -90, 32, 104, -2, Byte.MAX_VALUE, -63, -83};

    /* renamed from: ગ  reason: contains not printable characters */
    public static int m3837(int[] iArr, int i10, int[] iArr2, int i11) {
        int i12 = iArr[i10];
        byte b10 = (byte) (f4206[i10] & 15);
        if (b10 != 0) {
            i12 = ((i12 << (16 - b10)) | (i12 >> b10)) & 65535;
        }
        iArr[i10] = i12;
        int i13 = i12 - iArr2[i11];
        int i14 = i10 - 1;
        iArr[i10] = ((i13 - (iArr[m3846(i14)] & iArr[m3846(i10 - 2)])) - ((~iArr[m3846(i14)]) & iArr[m3846(i10 - 3)])) & 65535;
        return i11 - 1;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static int m3840(byte[] bArr, int i10) {
        return (bArr[i10] & 255) | ((bArr[i10 + 1] << 8) & 65280);
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public static int[] m3845(byte[] bArr) {
        int[] iArr = new int[128];
        int length = bArr.length;
        int i10 = length * 8;
        int i11 = 0;
        while (i11 < length && i11 < 128) {
            iArr[i11] = 255 & bArr[i11];
            i11++;
        }
        int i12 = (i10 + 7) / 8;
        int pow = 255 % ((int) Math.pow(2.0d, (double) ((i10 + 8) - (i12 * 8))));
        for (int i13 = length; i13 < 128; i13++) {
            iArr[i13] = f4207[(iArr[i13 - 1] + iArr[i13 - length]) % 256] & 255;
        }
        int i14 = 128 - i12;
        iArr[i14] = f4207[pow & iArr[i14]] & 255;
        for (int i15 = 127 - i12; i15 >= 0; i15--) {
            iArr[i15] = f4207[iArr[i15 + 1] ^ iArr[i15 + i12]] & 255;
        }
        int[] iArr2 = new int[64];
        for (int i16 = 0; i16 < 64; i16++) {
            int i17 = i16 * 2;
            iArr2[i16] = (iArr[i17] & 255) | ((iArr[i17 + 1] << 8) & 65280);
        }
        return iArr2;
    }

    /* renamed from: ⶊ  reason: contains not printable characters */
    public static int m3846(int i10) {
        return i10 < 0 ? i10 + 4 : i10;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static int m3841(int[] iArr, int i10, int[] iArr2, int i11) {
        int i12 = iArr[i10] + iArr2[i11];
        int i13 = i10 - 1;
        int i14 = (i12 + (iArr[m3846(i13)] & iArr[m3846(i10 - 2)]) + ((~iArr[m3846(i13)]) & iArr[m3846(i10 - 3)])) & 65535;
        iArr[i10] = i14;
        byte b10 = (byte) (f4206[i10] & 15);
        if (b10 != 0) {
            i14 = ((i14 >> (16 - b10)) | (i14 << b10)) & 65535;
        }
        iArr[i10] = i14;
        return i11 + 1;
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public static int m3838(int[] iArr, int[] iArr2, int i10) {
        return m3837(iArr, 0, iArr2, m3837(iArr, 1, iArr2, m3837(iArr, 2, iArr2, m3837(iArr, 3, iArr2, i10))));
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static int m3842(int[] iArr, int[] iArr2, int i10) {
        return m3841(iArr, 3, iArr2, m3841(iArr, 2, iArr2, m3841(iArr, 1, iArr2, m3841(iArr, 0, iArr2, i10))));
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public static void m3839(int[] iArr, int i10, int[] iArr2) {
        iArr[i10] = 65535 & (iArr[i10] - iArr2[iArr[m3846(i10 - 1)] & 63]);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static void m3844(int[] iArr, int i10, int[] iArr2) {
        iArr[i10] = iArr[i10] + iArr2[iArr[m3846(i10 - 1)] & 63];
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static void m3843(byte[] bArr, int[] iArr) {
        int[] iArr2 = new int[4];
        for (int i10 = 0; i10 < 4; i10++) {
            iArr2[i10] = m3840(bArr, i10 * 2);
        }
        int i11 = 0;
        for (int i12 = 0; i12 < 5; i12++) {
            i11 = m3842(iArr2, iArr, i11);
        }
        m3844(iArr2, 0, iArr);
        m3844(iArr2, 1, iArr);
        m3844(iArr2, 2, iArr);
        m3844(iArr2, 3, iArr);
        for (int i13 = 0; i13 < 6; i13++) {
            i11 = m3842(iArr2, iArr, i11);
        }
        m3844(iArr2, 0, iArr);
        m3844(iArr2, 1, iArr);
        m3844(iArr2, 2, iArr);
        m3844(iArr2, 3, iArr);
        for (int i14 = 0; i14 < 5; i14++) {
            i11 = m3842(iArr2, iArr, i11);
        }
        for (int i15 = 0; i15 < 4; i15++) {
            int i16 = iArr2[i15];
            int i17 = i15 * 2;
            bArr[i17] = (byte) i16;
            bArr[i17 + 1] = (byte) (i16 >>> 8);
        }
    }
}

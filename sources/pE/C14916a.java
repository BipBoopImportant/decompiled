package pE;

/* renamed from: pE.a  reason: case insensitive filesystem */
public class C14916a {

    /* renamed from: a  reason: collision with root package name */
    private static final char[] f130332a = new char[64];

    /* renamed from: b  reason: collision with root package name */
    private static final byte[] f130333b = new byte[128];

    static {
        char c10 = 'A';
        int i10 = 0;
        while (c10 <= 'Z') {
            f130332a[i10] = c10;
            c10 = (char) (c10 + 1);
            i10++;
        }
        char c11 = 'a';
        while (c11 <= 'z') {
            f130332a[i10] = c11;
            c11 = (char) (c11 + 1);
            i10++;
        }
        char c12 = '0';
        while (c12 <= '9') {
            f130332a[i10] = c12;
            c12 = (char) (c12 + 1);
            i10++;
        }
        char[] cArr = f130332a;
        cArr[i10] = '+';
        cArr[i10 + 1] = '/';
        int i11 = 0;
        while (true) {
            byte[] bArr = f130333b;
            if (i11 >= bArr.length) {
                break;
            }
            bArr[i11] = -1;
            i11++;
        }
        for (int i12 = 0; i12 < 64; i12++) {
            f130333b[f130332a[i12]] = (byte) i12;
        }
    }

    public static char[] a(byte[] bArr) {
        return b(bArr, bArr.length);
    }

    public static char[] b(byte[] bArr, int i10) {
        byte b10;
        int i11;
        int i12;
        byte b11;
        int i13 = ((i10 * 4) + 2) / 3;
        char[] cArr = new char[(((i10 + 2) / 3) * 4)];
        int i14 = 0;
        int i15 = 0;
        while (i14 < i10) {
            int i16 = i14 + 1;
            byte b12 = bArr[i14];
            byte b13 = b12 & 255;
            if (i16 < i10) {
                i11 = i14 + 2;
                b10 = bArr[i16] & 255;
            } else {
                i11 = i16;
                b10 = 0;
            }
            if (i11 < i10) {
                i12 = i11 + 1;
                b11 = bArr[i11] & 255;
            } else {
                i12 = i11;
                b11 = 0;
            }
            int i17 = ((b12 & 3) << 4) | (b10 >>> 4);
            int i18 = ((b10 & 15) << 2) | (b11 >>> 6);
            byte b14 = b11 & 63;
            char[] cArr2 = f130332a;
            cArr[i15] = cArr2[b13 >>> 2];
            int i19 = i15 + 2;
            cArr[i15 + 1] = cArr2[i17];
            char c10 = '=';
            cArr[i19] = i19 < i13 ? cArr2[i18] : '=';
            int i20 = i15 + 3;
            if (i20 < i13) {
                c10 = cArr2[b14];
            }
            cArr[i20] = c10;
            i15 += 4;
            i14 = i12;
        }
        return cArr;
    }

    public static String c(String str) {
        return new String(a(str.getBytes()));
    }
}

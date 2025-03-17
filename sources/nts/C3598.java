package nts;

/* renamed from: nts.ѕ  reason: contains not printable characters */
public class C3598 {

    /* renamed from: ગ  reason: contains not printable characters */
    public String f382 = "";

    /* renamed from: ഇ  reason: contains not printable characters */
    public String f383 = C4081.m3208(0, 3, 88);

    /* renamed from: ᐳ  reason: contains not printable characters */
    public byte[] f384 = new byte[0];

    /* renamed from: ગ  reason: contains not printable characters */
    public byte[] m379(int i10, int i11) {
        byte[] bArr = new byte[64];
        for (int i12 = 0; i12 < 64; i12++) {
            bArr[i12] = 1;
        }
        return m381(i10, bArr, i11);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public byte[] m380(int i10, int i11) {
        byte[] bArr = new byte[64];
        for (int i12 = 0; i12 < 64; i12++) {
            bArr[i12] = 2;
        }
        return m381(i10, bArr, i11);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public final byte[] m381(int i10, byte[] bArr, int i11) {
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        byte[] bArr5 = bArr;
        int i12 = i11;
        int i13 = 1;
        String str = this.f383;
        C4094 r52 = C3990.f2631;
        C3638 r42 = C3618.f582.m563(str);
        int i14 = r42.f625 / 8;
        byte[] bArr6 = this.f384;
        int i15 = 64;
        int i16 = 0;
        if (bArr6 == null || bArr6.length == 0) {
            bArr2 = C3596.f365;
        } else {
            int ceil = ((int) Math.ceil(((double) bArr6.length) / 64.0d)) * 64;
            bArr2 = new byte[ceil];
            for (int i17 = 0; i17 < ceil; i17++) {
                byte[] bArr7 = this.f384;
                bArr2[i17] = bArr7[i17 % bArr7.length];
            }
        }
        if (this.f382.length() == 0) {
            bArr3 = C3596.f365;
        } else {
            bArr3 = new byte[((this.f382.length() + 1) * 2)];
            byte[] bytes = this.f382.getBytes(C3727.m1052("\u0016\u001el^^O%>8OI", 3, 8, 0));
            System.arraycopy(bytes, 0, bArr3, 0, bytes.length);
        }
        if (bArr3.length == 0) {
            bArr4 = C3596.f365;
        } else {
            int ceil2 = ((int) Math.ceil(((double) bArr3.length) / 64.0d)) * 64;
            byte[] bArr8 = new byte[ceil2];
            for (int i18 = 0; i18 < ceil2; i18++) {
                bArr8[i18] = bArr3[i18 % bArr3.length];
            }
            bArr4 = bArr8;
        }
        C3874 r82 = new C3874(256);
        r82.m1920(bArr2);
        r82.m1920(bArr4);
        byte[] r72 = r82.m1923();
        int ceil3 = (int) Math.ceil(((double) i12) / ((double) i14));
        byte[] bArr9 = C3596.f365;
        int i19 = 0;
        while (i19 < ceil3) {
            r42.m617();
            int length = bArr5.length;
            r42.m618(bArr5, i16, length);
            System.arraycopy(bArr5, i16, bArr5, i16, length);
            int length2 = r72.length;
            r42.m618(r72, i16, length2);
            r42.f624 = r42.m624();
            System.arraycopy(r72, i16, new byte[length2], i16, length2);
            byte[] bArr10 = r42.f624;
            int i20 = i10;
            for (int i21 = i13; i21 < i20; i21 += i13) {
                r42.m617();
                bArr10 = r42.m620(bArr10);
            }
            byte[] bArr11 = new byte[i15];
            for (int i22 = i16; i22 < i15; i22 += i13) {
                bArr11[i22] = bArr10[i22 % bArr10.length];
            }
            int i23 = 0;
            while (i23 < r72.length / i15) {
                int i24 = 63;
                int i25 = i13;
                while (i24 >= 0) {
                    int i26 = (i23 * 64) + i24;
                    int i27 = i25 + (r72[i26] & 255) + (bArr11[i24] & 255);
                    r72[i26] = (byte) i27;
                    i25 = i27 >> 8;
                    i24--;
                    i13 = 1;
                }
                i23 += i13;
                i15 = 64;
            }
            byte[] r32 = C3823.m1636(bArr9);
            bArr9 = new byte[(r32.length + bArr10.length)];
            System.arraycopy(r32, 0, bArr9, 0, r32.length);
            System.arraycopy(bArr10, 0, bArr9, r32.length, bArr10.length);
            i13 = 1;
            i19++;
            i16 = 0;
            i15 = 64;
        }
        C3874 r12 = new C3874(256);
        r12.m1920(bArr9);
        return r12.m1917(i16, i12);
    }
}

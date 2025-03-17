package nts;

import nts.C3744;

/* renamed from: nts.ܧ  reason: contains not printable characters */
public class C3658 extends C3744 {
    /* renamed from: ഇ  reason: contains not printable characters */
    public static int m700(long j10) {
        if (j10 == 0) {
            return 64;
        }
        int i10 = 0;
        while ((1 & j10) == 0) {
            i10++;
            j10 >>>= 1;
        }
        return i10;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static void m701(C3744.C3747 r72, boolean z10, byte[] bArr, byte[] bArr2, byte[] bArr3, int i10) {
        r72.f1125 = z10;
        r72.f1128 = i10 / 8;
        int[] iArr = new int[64];
        r72.f1118 = iArr;
        int[] iArr2 = new int[64];
        r72.f1136 = iArr2;
        r72.f1137 = C3724.m1025(bArr, 0, bArr.length, iArr, iArr2);
        if (z10) {
            System.arraycopy(r72.f1118, 0, r72.f1136, 0, 64);
        }
        byte[] bArr4 = new byte[16];
        r72.f1121 = bArr4;
        C3724.m1023(bArr4, r72.f1118, r72.f1137);
        m706(r72.f1121, 0, r72.f1123);
        r72.f1119 = new C3874(256);
        m706(r72.f1123, 0, r72.f1132);
        r72.f1119.m1920(r72.f1132);
        byte[] bArr5 = new byte[16];
        System.arraycopy(bArr2, 0, bArr5, 16 - bArr2.length, bArr2.length);
        bArr5[0] = (byte) (r72.f1128 << 4);
        bArr5[15 - bArr2.length] = 1;
        bArr5[15] = (byte) (bArr5[15] & 192);
        C3724.m1023(bArr5, r72.f1118, r72.f1137);
        System.arraycopy(bArr5, 0, r72.f1135, 0, 16);
        int i11 = 0;
        while (i11 < 8) {
            byte[] bArr6 = r72.f1135;
            int i12 = i11 + 16;
            byte b10 = bArr5[i11];
            i11++;
            bArr6[i12] = (byte) (b10 ^ bArr5[i11]);
        }
        byte b11 = bArr2[bArr2.length - 1] & 63;
        int i13 = b11 % 8;
        int i14 = b11 / 8;
        if (i13 == 0) {
            System.arraycopy(r72.f1135, i14, r72.f1127, 0, 16);
        } else {
            for (int i15 = 0; i15 < 16; i15++) {
                byte[] bArr7 = r72.f1135;
                i14++;
                r72.f1127[i15] = (byte) (((bArr7[i14] & 255) >>> (8 - i13)) | ((bArr7[i14] & 255) << i13));
            }
        }
        System.arraycopy(r72.f1127, 0, r72.f1130, 0, 16);
        r72.f1122 = new byte[16];
        r72.f1120 = new byte[16];
        r72.f1129 = new byte[16];
        r72.f1131 = new byte[16];
        r72.f1126 = 0;
        r72.f1134 = 0;
        r72.f1133 = 0;
        if (bArr3 != null) {
            for (byte b12 : bArr3) {
                byte[] bArr8 = r72.f1131;
                int i16 = r72.f1126;
                bArr8[i16] = b12;
                int i17 = i16 + 1;
                r72.f1126 = i17;
                if (i17 == 16) {
                    long j10 = r72.f1134 + 1;
                    r72.f1134 = j10;
                    m705(r72.f1119.f1729, m699(m700(j10), r72), r72);
                    r72.f1126 = 0;
                }
            }
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static void m702(C3744.C3747 r92, byte[] bArr, int i10, int i11, byte[] bArr2, int i12) {
        int i13 = i11 / 16;
        for (int i14 = 0; i14 < i13; i14++) {
            int i15 = i14 * 16;
            System.arraycopy(bArr, i10 + i15, r92.f1132, 0, 16);
            byte[] bArr3 = r92.f1132;
            if (r92.f1125) {
                m707(r92.f1122, bArr3, 0);
            }
            long j10 = r92.f1133 + 1;
            r92.f1133 = j10;
            m707(r92.f1130, r92.f1119.f1729, m699(m700(j10), r92));
            m707(bArr3, r92.f1130, 0);
            if (r92.f1125) {
                C3724.m1023(bArr3, r92.f1136, r92.f1137);
                m707(bArr3, r92.f1130, 0);
            } else {
                C3724.m1026(bArr3, r92.f1136, r92.f1137);
                m707(bArr3, r92.f1130, 0);
                m707(r92.f1122, bArr3, 0);
            }
            System.arraycopy(r92.f1132, 0, bArr2, i15 + i12, 16);
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static void m703(C3744.C3747 r92, byte[] bArr, byte[] bArr2) {
        if (bArr.length >= 16) {
            int length = bArr.length % 16;
            int length2 = bArr.length - length;
            m702(r92, bArr, 0, length2, bArr, 0);
            byte[] bArr3 = new byte[length];
            System.arraycopy(bArr, length2, bArr3, 0, length);
            m703(r92, bArr3, bArr2);
            System.arraycopy(bArr3, 0, bArr, length2, length);
            return;
        }
        int i10 = r92.f1126;
        if (i10 > 0) {
            m704(r92.f1131, i10);
            m705(r92.f1121, 0, r92);
        }
        int length3 = bArr.length;
        if (length3 > 0) {
            byte[] bArr4 = new byte[16];
            if (length3 < 16) {
                System.arraycopy(bArr, 0, bArr4, 0, length3);
                if (r92.f1125) {
                    m704(bArr4, length3);
                    m707(r92.f1122, bArr4, 0);
                }
                m707(r92.f1130, r92.f1121, 0);
                byte[] bArr5 = new byte[16];
                System.arraycopy(r92.f1130, 0, bArr5, 0, 16);
                C3724.m1023(bArr5, r92.f1118, r92.f1137);
                m707(bArr4, bArr5, 0);
                System.arraycopy(bArr4, 0, bArr, 0, length3);
                if (!r92.f1125) {
                    m704(bArr4, length3);
                    m707(r92.f1122, bArr4, 0);
                }
            } else {
                throw new C3738(C3727.m1052("\\zaw}yw2|nx$9|znd", 0, 17, 4));
            }
        }
        m707(r92.f1122, r92.f1130, 0);
        m707(r92.f1122, r92.f1123, 0);
        C3724.m1023(r92.f1122, r92.f1118, r92.f1137);
        m707(r92.f1122, r92.f1120, 0);
        System.arraycopy(r92.f1122, 0, bArr2, 0, r92.f1128);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static void m705(byte[] bArr, int i10, C3744.C3747 r42) {
        m707(r42.f1129, bArr, i10);
        m707(r42.f1131, r42.f1129, 0);
        C3724.m1023(r42.f1131, r42.f1118, r42.f1137);
        m707(r42.f1120, r42.f1131, 0);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static int m699(int i10, C3744.C3747 r62) {
        byte[] bArr = new byte[16];
        for (int i11 = r62.f1119.f1728 >> 4; i11 <= i10; i11++) {
            m706(r62.f1119.f1729, (i11 << 4) - 16, bArr);
            r62.f1119.m1920(bArr);
        }
        return i10 << 4;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static void m704(byte[] bArr, int i10) {
        bArr[i10] = Byte.MIN_VALUE;
        while (true) {
            i10++;
            if (i10 < 16) {
                bArr[i10] = 0;
            } else {
                return;
            }
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static void m706(byte[] bArr, int i10, byte[] bArr2) {
        int i11 = 0;
        for (int i12 = 15; i12 >= 0; i12--) {
            byte b10 = bArr[i10 + i12] & 255;
            bArr2[i12] = (byte) (i11 | (b10 << 1));
            i11 = (b10 >>> 7) & 1;
        }
        bArr2[15] = (byte) (bArr2[15] ^ ((byte) (135 >>> ((1 - i11) << 3))));
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static void m707(byte[] bArr, byte[] bArr2, int i10) {
        for (int i11 = 15; i11 >= 0; i11--) {
            bArr[i11] = (byte) (bArr[i11] ^ bArr2[i10 + i11]);
        }
    }
}

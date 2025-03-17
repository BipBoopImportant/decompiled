package nts;

/* renamed from: nts.ᆉ  reason: contains not printable characters */
public class C3795 extends C3811 {

    /* renamed from: и  reason: contains not printable characters */
    public static final long[] f1328 = {0, 7200, 14400, 9312, 28800, 27808, 18624, 21728, 57600, 64800, 55616, 50528, 37248, 36256, 43456, 46560};

    /* renamed from: ϴ  reason: contains not printable characters */
    public static void m1309(C3761 r18, byte[] bArr) {
        C3761 r02 = r18;
        byte[] bArr2 = bArr;
        byte b10 = (byte) (bArr2[15] & 15);
        long j10 = r02.f1210[b10];
        long j11 = r02.f1206[b10];
        for (int i10 = 15; i10 >= 0; i10--) {
            byte b11 = bArr2[i10];
            byte b12 = (byte) (b11 & 15);
            byte b13 = (byte) ((b11 & 255) >>> 4);
            if (i10 != 15) {
                long j12 = (j11 >>> 4) ^ (f1328[(int) (j10 & 15)] << 48);
                j10 = ((j11 << 60) | (j10 >>> 4)) ^ r02.f1210[b12];
                j11 = j12 ^ r02.f1206[b12];
            }
            long j13 = (j10 >>> 4) | (j11 << 60);
            long j14 = (j11 >>> 4) ^ (f1328[(int) (j10 & 15)] << 48);
            j10 = j13 ^ r02.f1210[b13];
            j11 = j14 ^ r02.f1206[b13];
        }
        m1313((int) (j11 >>> 32), bArr2, 0);
        m1313((int) j11, bArr2, 4);
        m1313((int) (j10 >>> 32), bArr2, 8);
        m1313((int) j10, bArr2, 12);
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public static void m1310(C3761 r15) {
        r15.f1205 = new byte[16];
        r15.f1204 = new byte[16];
        r15.f1207 = new byte[16];
        r15.f1198 = new byte[16];
        r15.f1211 = 0;
        r15.f1212 = 0;
        r15.f1201 = true;
        r15.f1203 = 0;
        r15.f1199 = 0;
        r15.f1210 = new long[16];
        r15.f1206 = new long[16];
        r15.f1209 = null;
        r15.f1208 = -1;
        byte[] bArr = new byte[16];
        C3724.m1023(bArr, r15.f1202, r15.f1200);
        long r32 = (m1312(bArr, 0) << 32) | m1312(bArr, 4);
        long r92 = (m1312(bArr, 8) << 32) | m1312(bArr, 12);
        r15.f1210[8] = r92;
        r15.f1206[8] = r32;
        for (int i10 = 4; i10 > 0; i10 >>>= 1) {
            r92 = (r92 >>> 1) | (r32 << 63);
            r32 = (r32 >>> 1) ^ (((1 & r92) * -520093696) << 32);
            r15.f1210[i10] = r92;
            r15.f1206[i10] = r32;
        }
        for (int i11 = 2; i11 <= 8; i11 *= 2) {
            long j10 = r15.f1210[i11];
            long j11 = r15.f1206[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                long[] jArr = r15.f1210;
                int i13 = i11 + i12;
                jArr[i13] = jArr[i12] ^ j10;
                long[] jArr2 = r15.f1206;
                jArr2[i13] = jArr2[i12] ^ j11;
            }
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static void m1315(C3761 r12, byte[] bArr) {
        int i10;
        int i11;
        int i12;
        int i13 = r12.f1211;
        if (i13 > 16 || i13 < 0) {
            throw new C3738(C3727.m1052("}[@V\\XV\u0013_\\RS\u0016%\u0003\u0018\u000e\u0004\u0000\u000eK\u0005\u0017\u0001\u0012\r\u0004\f\u0017\u000fS\u001f9\"4>:4q?-;(7>6-5iy_DRX\\R\u0017YK]NQXPKS\u000flJQGMIG\u0002L^H[DME^F\u001aKmv`jn`%kyo|cjbya=vPK]WS]\u0018VDRA^W_D\\\u0000^xcu{u0~lzivwlt(¤ÓØÑ", 31, 18, 91));
        }
        if (r12.f1212 == 0) {
            if (!r12.f1201 || i13 != 12) {
                int i14 = 0;
                while (true) {
                    i12 = r12.f1211;
                    if (i14 >= i12) {
                        break;
                    }
                    byte[] bArr2 = r12.f1205;
                    bArr2[i14] = (byte) (bArr2[i14] ^ r12.f1198[i14]);
                    i14++;
                }
                if (i12 > 0) {
                    r12.f1203 += (long) (i12 * 8);
                    m1309(r12, r12.f1205);
                }
                for (int i15 = 0; i15 < 8; i15++) {
                    r12.f1198[i15] = 0;
                }
                m1313((int) (r12.f1203 >>> 32), r12.f1198, 8);
                m1313((int) r12.f1203, r12.f1198, 12);
                for (int i16 = 0; i16 < 16; i16++) {
                    byte[] bArr3 = r12.f1205;
                    bArr3[i16] = (byte) (bArr3[i16] ^ r12.f1198[i16]);
                }
                m1309(r12, r12.f1205);
                System.arraycopy(r12.f1205, 0, r12.f1204, 0, 16);
                r12.f1205 = new byte[16];
            } else {
                System.arraycopy(r12.f1198, 0, r12.f1204, 0, 12);
                byte[] bArr4 = r12.f1204;
                bArr4[12] = 0;
                bArr4[13] = 0;
                bArr4[14] = 0;
                bArr4[15] = 1;
            }
            System.arraycopy(r12.f1204, 0, r12.f1207, 0, 16);
            r12.f1198 = new byte[16];
            r12.f1211 = 0;
            r12.f1203 = 0;
            r12.f1212 = 1;
        }
        if (r12.f1212 != 1 || (i10 = r12.f1211) >= 16) {
            throw new C3738(C3727.m1052("}[@V\\XV\u0013_\\RS\u0016%\u0003\u0018\u000e\u0004\u0000\u000eK\u0005\u0017\u0001\u0012\r\u0004\f\u0017\u000fS\u001f9\"4>:4q?-;(7>6-5iy_DRX\\R\u0017YK]NQXPKS\u000flJQGMIG\u0002L^H[DME^F\u001aKmv`jn`%kyo|cjbya=vPK]WS]\u0018VDRA^W_D\\\u0000^xcu{u0~lzivwlt(¤ÓØÑ", 49, 18, 19));
        }
        if (bArr == null) {
            bArr = new byte[0];
        }
        if (i10 == 0) {
            i11 = 0;
            while (i11 < (bArr.length & -16)) {
                for (int i17 = 0; i17 < 16; i17++) {
                    byte[] bArr5 = r12.f1205;
                    bArr5[i17] = (byte) (bArr5[i17] ^ bArr[i11 + i17]);
                }
                m1309(r12, r12.f1205);
                r12.f1203 += 128;
                i11 += 16;
            }
        } else {
            i11 = 0;
        }
        int i18 = i11;
        while (i11 < bArr.length) {
            byte[] bArr6 = r12.f1205;
            int i19 = r12.f1211;
            bArr6[i19] = (byte) (bArr6[i19] ^ bArr[i18]);
            i18++;
            int i20 = i19 + 1;
            r12.f1211 = i20;
            if (i20 == 16) {
                m1309(r12, bArr6);
                r12.f1211 = 0;
                r12.f1203 += 128;
            }
            i11++;
        }
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public static void m1317(C3761 r82, byte[] bArr) {
        int i10 = r82.f1211;
        if (i10 > 16 || i10 < 0) {
            throw new C3738(C3727.m1052("}[@V\\XV\u0013_\\RS\u0016%\u0003\u0018\u000e\u0004\u0000\u000eK\u0005\u0017\u0001\u0012\r\u0004\f\u0017\u000fS\u001f9\"4>:4q?-;(7>6-5iy_DRX\\R\u0017YK]NQXPKS\u000flJQGMIG\u0002L^H[DME^F\u001aKmv`jn`%kyo|cjbya=vPK]WS]\u0018VDRA^W_D\\\u0000^xcu{u0~lzivwlt(¤ÓØÑ", 103, 18, 74));
        } else if (r82.f1212 == 2) {
            if (i10 > 0) {
                r82.f1199 += (long) (i10 * 8);
                m1309(r82, r82.f1205);
            }
            m1313((int) (r82.f1203 >>> 32), r82.f1198, 0);
            m1313((int) r82.f1203, r82.f1198, 4);
            m1313((int) (r82.f1199 >>> 32), r82.f1198, 8);
            m1313((int) r82.f1199, r82.f1198, 12);
            for (int i11 = 0; i11 < 16; i11++) {
                byte[] bArr2 = r82.f1205;
                bArr2[i11] = (byte) (bArr2[i11] ^ r82.f1198[i11]);
            }
            m1309(r82, r82.f1205);
            System.arraycopy(r82.f1207, 0, r82.f1198, 0, 16);
            C3724.m1023(r82.f1198, r82.f1202, r82.f1200);
            int i12 = 0;
            while (i12 < 16 && i12 < bArr.length) {
                bArr[i12] = (byte) (r82.f1198[i12] ^ r82.f1205[i12]);
                i12++;
            }
            r82.f1212 = 0;
        } else {
            throw new C3738(C3727.m1052("}[@V\\XV\u0013_\\RS\u0016%\u0003\u0018\u000e\u0004\u0000\u000eK\u0005\u0017\u0001\u0012\r\u0004\f\u0017\u000fS\u001f9\"4>:4q?-;(7>6-5iy_DRX\\R\u0017YK]NQXPKS\u000flJQGMIG\u0002L^H[DME^F\u001aKmv`jn`%kyo|cjbya=vPK]WS]\u0018VDRA^W_D\\\u0000^xcu{u0~lzivwlt(¤ÓØÑ", 121, 18, 124));
        }
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public static void m1311(C3761 r10, byte[] bArr) {
        int i10;
        if (r10.f1212 == 0) {
            int i11 = r10.f1211;
            if (i11 < 0 || i11 >= 16) {
                throw new C3738(C3727.m1052("}[@V\\XV\u0013_\\RS\u0016%\u0003\u0018\u000e\u0004\u0000\u000eK\u0005\u0017\u0001\u0012\r\u0004\f\u0017\u000fS\u001f9\"4>:4q?-;(7>6-5iy_DRX\\R\u0017YK]NQXPKS\u000flJQGMIG\u0002L^H[DME^F\u001aKmv`jn`%kyo|cjbya=vPK]WS]\u0018VDRA^W_D\\\u0000^xcu{u0~lzivwlt(¤ÓØÑ", 13, 18, 115));
            }
            if (bArr == null) {
                bArr = new byte[0];
            }
            if (bArr.length + i11 > 12) {
                r10.f1201 = false;
            }
            if (i11 == 0) {
                i10 = 0;
                while (i10 < (bArr.length & -16)) {
                    for (int i12 = 0; i12 < 16; i12++) {
                        byte[] bArr2 = r10.f1205;
                        bArr2[i12] = (byte) (bArr2[i12] ^ bArr[i10 + i12]);
                    }
                    m1309(r10, r10.f1205);
                    r10.f1203 += 128;
                    i10 += 16;
                }
            } else {
                i10 = 0;
            }
            int i13 = i10;
            while (i10 < bArr.length) {
                byte[] bArr3 = r10.f1198;
                int i14 = r10.f1211;
                bArr3[i14] = bArr[i13];
                i13++;
                int i15 = i14 + 1;
                r10.f1211 = i15;
                if (i15 == 16) {
                    for (int i16 = 0; i16 < 16; i16++) {
                        byte[] bArr4 = r10.f1205;
                        bArr4[i16] = (byte) (bArr4[i16] ^ r10.f1198[i16]);
                    }
                    m1309(r10, r10.f1205);
                    r10.f1211 = 0;
                    r10.f1203 += 128;
                }
                i10++;
            }
            return;
        }
        throw new C3738(C3727.m1052("}[@V\\XV\u0013_\\RS\u0016%\u0003\u0018\u000e\u0004\u0000\u000eK\u0005\u0017\u0001\u0012\r\u0004\f\u0017\u000fS\u001f9\"4>:4q?-;(7>6-5iy_DRX\\R\u0017YK]NQXPKS\u000flJQGMIG\u0002L^H[DME^F\u001aKmv`jn`%kyo|cjbya=vPK]WS]\u0018VDRA^W_D\\\u0000^xcu{u0~lzivwlt(¤ÓØÑ", 0, 13, 57));
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static void m1316(C3761 r12, byte[] bArr, byte[] bArr2, boolean z10) {
        int i10;
        byte b10;
        int i11 = r12.f1211;
        if (i11 > 16 || i11 < 0) {
            throw new C3738(C3727.m1052("}[@V\\XV\u0013_\\RS\u0016%\u0003\u0018\u000e\u0004\u0000\u000eK\u0005\u0017\u0001\u0012\r\u0004\f\u0017\u000fS\u001f9\"4>:4q?-;(7>6-5iy_DRX\\R\u0017YK]NQXPKS\u000flJQGMIG\u0002L^H[DME^F\u001aKmv`jn`%kyo|cjbya=vPK]WS]\u0018VDRA^W_D\\\u0000^xcu{u0~lzivwlt(¤ÓØÑ", 67, 18, 116));
        }
        if (r12.f1212 == 1) {
            if (i11 > 0) {
                r12.f1203 += (long) (i11 * 8);
                m1309(r12, r12.f1205);
            }
            m1314(r12);
            System.arraycopy(r12.f1204, 0, r12.f1198, 0, 16);
            C3724.m1023(r12.f1198, r12.f1202, r12.f1200);
            r12.f1211 = 0;
            r12.f1212 = 2;
        }
        if (r12.f1212 == 2) {
            if (r12.f1211 != 0) {
                i10 = 0;
            } else if (z10) {
                i10 = 0;
                while (i10 < (bArr.length & -16)) {
                    for (int i12 = 0; i12 < 16; i12++) {
                        int i13 = i10 + i12;
                        byte b11 = (byte) (bArr[i13] ^ r12.f1198[i12]);
                        bArr2[i13] = b11;
                        byte[] bArr3 = r12.f1205;
                        bArr3[i12] = (byte) (b11 ^ bArr3[i12]);
                    }
                    r12.f1199 += 128;
                    m1309(r12, r12.f1205);
                    m1314(r12);
                    System.arraycopy(r12.f1204, 0, r12.f1198, 0, 16);
                    C3724.m1023(r12.f1198, r12.f1202, r12.f1200);
                    i10 += 16;
                }
            } else {
                int i14 = 0;
                while (i10 < (bArr.length & -16)) {
                    for (int i15 = 0; i15 < 16; i15++) {
                        byte[] bArr4 = r12.f1205;
                        int i16 = i10 + i15;
                        bArr4[i15] = (byte) (bArr4[i15] ^ bArr2[i16]);
                        bArr[i16] = (byte) (bArr2[i16] ^ r12.f1198[i15]);
                    }
                    r12.f1199 += 128;
                    m1309(r12, r12.f1205);
                    m1314(r12);
                    System.arraycopy(r12.f1204, 0, r12.f1198, 0, 16);
                    C3724.m1023(r12.f1198, r12.f1202, r12.f1200);
                    i14 = i10 + 16;
                }
            }
            while (i10 < bArr.length) {
                if (r12.f1211 == 16) {
                    r12.f1199 += 128;
                    m1309(r12, r12.f1205);
                    m1314(r12);
                    System.arraycopy(r12.f1204, 0, r12.f1198, 0, 16);
                    C3724.m1023(r12.f1198, r12.f1202, r12.f1200);
                    r12.f1211 = 0;
                }
                if (z10) {
                    b10 = (byte) (bArr[i10] ^ r12.f1198[r12.f1211]);
                    bArr2[i10] = b10;
                } else {
                    b10 = bArr2[i10];
                    bArr[i10] = (byte) (r12.f1198[r12.f1211] ^ b10);
                }
                byte[] bArr5 = r12.f1205;
                int i17 = r12.f1211;
                r12.f1211 = i17 + 1;
                bArr5[i17] = (byte) (b10 ^ bArr5[i17]);
                i10++;
            }
            return;
        }
        throw new C3738(C3727.m1052("}[@V\\XV\u0013_\\RS\u0016%\u0003\u0018\u000e\u0004\u0000\u000eK\u0005\u0017\u0001\u0012\r\u0004\f\u0017\u000fS\u001f9\"4>:4q?-;(7>6-5iy_DRX\\R\u0017YK]NQXPKS\u000flJQGMIG\u0002L^H[DME^F\u001aKmv`jn`%kyo|cjbya=vPK]WS]\u0018VDRA^W_D\\\u0000^xcu{u0~lzivwlt(¤ÓØÑ", 85, 18, 69));
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static long m1312(byte[] bArr, int i10) {
        return (((long) bArr[i10 + 3]) & 255) | (((long) (bArr[i10] << 24)) & 4278190080L) | (((long) (bArr[i10 + 1] << 16)) & 16711680) | (((long) (bArr[i10 + 2] << 8)) & 65280);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static void m1313(int i10, byte[] bArr, int i11) {
        bArr[i11] = (byte) (i10 >>> 24);
        bArr[i11 + 1] = (byte) (i10 >>> 16);
        bArr[i11 + 2] = (byte) (i10 >>> 8);
        bArr[i11 + 3] = (byte) i10;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static void m1314(C3761 r42) {
        int i10 = r42.f1208;
        if (i10 != 0) {
            r42.f1208 = i10 - 1;
            int i11 = 15;
            while (i11 >= 12) {
                byte[] bArr = r42.f1204;
                byte b10 = (byte) (bArr[i11] + 1);
                bArr[i11] = b10;
                if ((b10 & 255) == 0) {
                    i11--;
                } else {
                    return;
                }
            }
            return;
        }
        throw new C3738(C3727.m1052("}[@V\\XV\u0013_\\RS\u0016%\u0003\u0018\u000e\u0004\u0000\u000eK\u0005\u0017\u0001\u0012\r\u0004\f\u0017\u000fS\u001f9\"4>:4q?-;(7>6-5iy_DRX\\R\u0017YK]NQXPKS\u000flJQGMIG\u0002L^H[DME^F\u001aKmv`jn`%kyo|cjbya=vPK]WS]\u0018VDRA^W_D\\\u0000^xcu{u0~lzivwlt(¤ÓØÑ", 139, 16, 107));
    }
}

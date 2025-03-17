package nts;

import nts.C3867;

/* renamed from: nts.ᴸ  reason: contains not printable characters */
public class C4052 extends C3867 {
    /* renamed from: ഇ  reason: contains not printable characters */
    public static void m2824(C3867.C3870 r22, byte[] bArr, int i10, int i11, boolean z10) {
        int i12;
        byte[] bArr2;
        C3867.C3870 r02 = r22;
        byte[] bArr3 = bArr;
        int i13 = i10;
        int i14 = i11;
        byte[] bArr4 = r02.f1700;
        if (bArr4 == null || bArr4.length < 7 || bArr4.length > 13) {
            throw new C3738(C3727.m1052("iOTBHLB\u0007FFDHI\u0003\u001e8#5?;5p/?/=6?-=5|e0\"%oYdj.mik%mt&uol\"q}my|6`FMIGG\u0000UA\u000fHHIYQYB\u0019\u0014|\\EQ]W[\u001cp[X\u0016", 0, 14, 46));
        }
        byte[] bArr5 = r02.f1699;
        if (bArr5 == null || bArr5.length != r02.f1703) {
            throw new C3738(C3727.m1052("iOTBHLB\u0007FFDHI\u0003\u001e8#5?;5p/?/=6?-=5|e0\"%oYdj.mik%mt&uol\"q}my|6`FMIGG\u0000UA\u000fHHIYQYB\u0019\u0014|\\EQ]W[\u001cp[X\u0016", 14, 23, 78));
        }
        int length = bArr4.length;
        int i15 = 15 - length;
        if (i15 >= 4 || i14 < (1 << (i15 * 8))) {
            byte[] bArr6 = new byte[16];
            bArr6[0] = (byte) ((14 - length) & 7);
            System.arraycopy(bArr4, 0, bArr6, 1, bArr4.length);
            C3724 r12 = new C3724();
            r12.m901(r02.f1701);
            r12.m905(bArr6);
            r12.f911 = 6;
            r12.f909 = 1;
            C3724 r14 = new C3724();
            C3932 r13 = new C3932(r14, r02.f1701, new byte[16], r14.m908() / 2, 3);
            r13.m2090();
            int i16 = r12.f912 / 8;
            if (z10) {
                C4193 r10 = r12.m898();
                byte[] r62 = m2825(r02, r13, bArr3, i13, i14);
                try {
                    r10.m3722(r62, 0, r62.length, r62, 0);
                    System.arraycopy(r62, 0, r02.f1699, 0, r02.f1703);
                    int i17 = i13;
                    while (true) {
                        i12 = i13 + i14;
                        if (i17 >= i12 - i16) {
                            break;
                        }
                        try {
                            r10.m3722(bArr, i17, r62.length, bArr, i17);
                            i17 += i16;
                        } catch (Exception e10) {
                            throw new C3738(e10.toString());
                        }
                    }
                    int i18 = i12 - i17;
                    if (i18 > 0) {
                        bArr2 = new byte[i16];
                        System.arraycopy(bArr3, i17, bArr2, 0, i18);
                    } else {
                        bArr2 = new byte[0];
                    }
                    try {
                        System.arraycopy(r10.m3723(bArr2, 0, bArr2.length), 0, bArr3, i17, i18);
                    } catch (Exception e11) {
                        throw new C3738(e11.toString());
                    }
                } catch (Exception e12) {
                    throw new C3738(e12.toString());
                }
            } else {
                C4193 r42 = r12.m902();
                byte[] bArr7 = new byte[i16];
                try {
                    System.arraycopy(r02.f1699, 0, bArr7, 0, r02.f1703);
                    int i19 = i16;
                    r42.m3722(bArr7, 0, i19, bArr7, 0);
                    int i20 = i19;
                    byte[] bArr8 = bArr7;
                    C3932 r122 = r13;
                    int r15 = r42.m3722(bArr, i10, i11, bArr, i10) + i13;
                    int i21 = (i14 - r15) + i13;
                    byte[] bArr9 = new byte[i20];
                    System.arraycopy(bArr3, r15, bArr9, 0, i21);
                    System.arraycopy(r42.m3723(bArr9, 0, i20), 0, bArr3, r15, i21);
                    byte[] r16 = m2825(r02, r122, bArr3, i13, i14);
                    boolean z11 = true;
                    for (int i22 = 0; i22 < r02.f1703; i22++) {
                        if (r16[i22] != bArr8[i22]) {
                            z11 = false;
                        }
                    }
                    if (!z11) {
                        throw new C3738(C3727.m1052("iOTBHLB\u0007FFDHI\u0003\u001e8#5?;5p/?/=6?-=5|e0\"%oYdj.mik%mt&uol\"q}my|6`FMIGG\u0000UA\u000fHHIYQYB\u0019\u0014|\\EQ]W[\u001cp[X\u0016", 59, 31, 2));
                    }
                } catch (Exception e13) {
                    throw new C3738(e13.toString());
                }
            }
        } else {
            throw new C3738(C3727.m1052("iOTBHLB\u0007FFDHI\u0003\u001e8#5?;5p/?/=6?-=5|e0\"%oYdj.mik%mt&uol\"q}my|6`FMIGG\u0000UA\u000fHHIYQYB\u0019\u0014|\\EQ]W[\u001cp[X\u0016", 37, 22, 62));
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static byte[] m2825(C3867.C3870 r10, C3932 r11, byte[] bArr, int i10, int i11) {
        byte[] bArr2 = new byte[16];
        byte[] bArr3 = r10.f1702;
        boolean z10 = bArr3 != null && bArr3.length > 0;
        if (z10) {
            bArr2[0] = (byte) (bArr2[0] | 64);
        }
        int i12 = 2;
        byte b10 = (byte) (bArr2[0] | ((byte) ((((r10.f1703 - 2) / 2) & 7) << 3)));
        bArr2[0] = b10;
        byte[] bArr4 = r10.f1700;
        bArr2[0] = (byte) (b10 | ((byte) ((14 - bArr4.length) & 7)));
        System.arraycopy(bArr4, 0, bArr2, 1, bArr4.length);
        int i13 = i11;
        int i14 = 1;
        while (i13 > 0) {
            bArr2[16 - i14] = (byte) (i13 & 255);
            i13 >>>= 8;
            i14++;
        }
        r11.m2091(bArr2, 0, 16);
        if (z10) {
            byte[] bArr5 = r10.f1702;
            if (bArr5.length < 65280) {
                r11.m2092((byte) (bArr5.length >> 8));
                r11.m2092((byte) r10.f1702.length);
            } else {
                r11.m2092((byte) -1);
                r11.m2092((byte) -2);
                r11.m2092((byte) (r10.f1702.length >> 24));
                r11.m2092((byte) (r10.f1702.length >> 16));
                r11.m2092((byte) (r10.f1702.length >> 8));
                r11.m2092((byte) r10.f1702.length);
                i12 = 6;
            }
            byte[] bArr6 = r10.f1702;
            r11.m2091(bArr6, 0, bArr6.length);
            int length = (i12 + r10.f1702.length) % 16;
            if (length != 0) {
                while (length != 16) {
                    r11.m2092((byte) 0);
                    length++;
                }
            }
        }
        r11.m2091(bArr, i10, i11);
        r11.f624 = r11.m2093();
        System.arraycopy(bArr, i10, new byte[i11], 0, i11);
        return r11.f624;
    }
}

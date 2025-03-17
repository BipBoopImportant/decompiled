package nts;

/* renamed from: nts.ዸ  reason: contains not printable characters */
public class C3843 {

    /* renamed from: ϴ  reason: contains not printable characters */
    public static final C3843 f1603 = new C3843(1);

    /* renamed from: ગ  reason: contains not printable characters */
    public static final String f1604 = C3727.m1052("vLWYYO\u001eK_^\u0012_UGQR\u001e2.0-633r1)q,2&:HlhsTn@jkD`{mnoy4|e7~~f3upns}tuP\u0004pZWxXCQR_IlVrvRI\u0002JS\u0001HHP\u0005CFXEKBICf2", 16, 16, 90);

    /* renamed from: ഇ  reason: contains not printable characters */
    public static final String f1605 = C3727.m1052("vLWYYO\u001eK_^\u0012_UGQR\u001e2.0-633r1)q,2&:HlhsTn@jkD`{mnoy4|e7~~f3upns}tuP\u0004pZWxXCQR_IlVrvRI\u0002JS\u0001HHP\u0005CFXEKBICf2", 0, 16, 40);

    /* renamed from: ᐳ  reason: contains not printable characters */
    public static final C3843 f1606 = new C3843(0);

    /* renamed from: ࡏ  reason: contains not printable characters */
    public boolean f1607 = true;

    /* renamed from: ⶊ  reason: contains not printable characters */
    public int f1608 = 1;

    /* renamed from: ⶏ  reason: contains not printable characters */
    public int[] f1609;

    public C3843(int i10) {
        int[] iArr = new int[768];
        this.f1609 = iArr;
        iArr[0] = i10;
    }

    /* renamed from: ϴ  reason: contains not printable characters */
    public static void m1703(C3843 r52) {
        int i10 = r52.f1608;
        if (i10 < 768) {
            r52.f1609[i10] = 0;
            while (i10 >= 1) {
                int[] iArr = r52.f1609;
                iArr[i10] = (iArr[i10] << 1) | (iArr[i10 - 1] >>> 31);
                i10--;
            }
            int[] iArr2 = r52.f1609;
            iArr2[0] = iArr2[0] << 1;
            int i11 = r52.f1608;
            if (iArr2[i11] != 0) {
                r52.f1608 = i11 + 1;
                return;
            }
            return;
        }
        throw new C3738(f1605);
    }

    /* renamed from: ࡏ  reason: contains not printable characters */
    public static void m1706(C3843 r42) {
        System.arraycopy(f1606.f1609, 0, r42.f1609, 0, 768);
        r42.f1608 = 1;
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public static boolean m1709(int i10, int i11) {
        boolean z10 = false;
        boolean z11 = (i10 < 0) ^ (i10 < i11);
        if (i11 < 0) {
            z10 = true;
        }
        return z11 ^ z10;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static boolean m1721(int i10, int i11) {
        boolean z10 = false;
        boolean z11 = (i10 < 0) ^ (i10 > i11);
        if (i11 < 0) {
            z10 = true;
        }
        return z11 ^ z10;
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public static int m1723(C3843 r12, int i10) {
        int i11 = i10 - 1;
        return (r12.f1609[i11 >> 5] >>> (i11 & 31)) & 1;
    }

    /* renamed from: ⶊ  reason: contains not printable characters */
    public static void m1727(C3843 r52) {
        int i10;
        int i11 = r52.f1608;
        if (i11 <= 768) {
            int i12 = 0;
            r52.f1609[i11] = 0;
            while (true) {
                i10 = r52.f1608;
                if (i12 >= i10) {
                    break;
                }
                int[] iArr = r52.f1609;
                int i13 = i12 + 1;
                iArr[i12] = (iArr[i12] >>> 1) | (iArr[i13] << 31);
                i12 = i13;
            }
            int i14 = i10 - 1;
            if (r52.f1609[i14] == 0 && i10 > 1) {
                r52.f1608 = i14;
                return;
            }
            return;
        }
        throw new C3738(f1605);
    }

    /* renamed from: ⶏ  reason: contains not printable characters */
    public static void m1730(C3843 r17, C3843 r18, C3843 r19) {
        C3843 r02 = r17;
        C3843 r12 = r18;
        C3843 r22 = r19;
        if (m1711(r17, r18)) {
            m1706(r19);
            return;
        }
        int i10 = r02.f1608;
        int i11 = r12.f1608;
        int[] iArr = r22.f1609;
        int[] iArr2 = r02.f1609;
        int[] iArr3 = r12.f1609;
        int i12 = 0;
        long j10 = 0;
        while (i12 < i11) {
            j10 = ((((long) iArr2[i12]) & 4294967295L) - (((long) iArr3[i12]) & 4294967295L)) + (j10 >> 32);
            iArr[i12] = (int) j10;
            i12++;
        }
        boolean z10 = (j10 >> 32) != 0;
        while (i12 < i10 && z10) {
            int i13 = iArr2[i12] - 1;
            iArr[i12] = i13;
            z10 = i13 == -1;
            i12++;
        }
        while (i12 < i10) {
            iArr[i12] = iArr2[i12];
            i12++;
        }
        r22.f1608 = i10;
        while (true) {
            int[] iArr4 = r22.f1609;
            int i14 = r22.f1608;
            int i15 = i14 - 1;
            if (iArr4[i15] != 0 || i14 <= 1) {
                r22.f1607 = true;
            } else {
                r22.f1608 = i15;
            }
        }
        r22.f1607 = true;
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public static void m1707(C3843 r82, int i10) {
        if (i10 < 768) {
            C3749 r02 = C3990.m2418();
            byte[] bArr = new byte[4];
            for (int i11 = 0; i11 < i10; i11++) {
                int min = Math.min(4, 4);
                byte[] bArr2 = new byte[min];
                r02.m1168(bArr2);
                System.arraycopy(bArr2, 0, bArr, 0, min);
                r82.f1609[i11] = (int) C3823.m1607(bArr, 0, 4);
            }
            r82.f1608 = i10;
            r82.f1607 = true;
            System.arraycopy(f1606.f1609, 0, r82.f1609, i10, 768 - i10);
            return;
        }
        throw new C3738(f1605);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static void m1719(byte[] bArr, C3843 r32) {
        m1718(bArr, 0, bArr.length, r32);
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public static boolean m1725(C3843 r42) {
        int i10 = r42.f1608;
        if (i10 >= 1 && !(i10 == 1 && r42.f1609[0] == 0)) {
            for (int i11 = 0; i11 < r42.f1608; i11++) {
                if (r42.f1609[i11] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static void m1718(byte[] bArr, int i10, int i11, C3843 r10) {
        int i12;
        if ((i11 >>> 2) <= 768) {
            r10.f1608 = i11 >> 2;
            int i13 = 0;
            int i14 = 0;
            while (true) {
                i12 = r10.f1608;
                if (i14 >= i12) {
                    break;
                }
                int i15 = i10 + i11;
                r10.f1609[i14] = (bArr[i15 - 1] & 255) | ((bArr[i15 - 4] & 255) << 24) | ((bArr[i15 - 3] & 255) << 16) | ((bArr[i15 - 2] & 255) << 8);
                i11 -= 4;
                i14++;
            }
            if (i11 > 0) {
                r10.f1608 = i12 + 1;
                r10.f1609[i12] = 0;
                while (i11 > 0) {
                    int[] iArr = r10.f1609;
                    int i16 = r10.f1608 - 1;
                    int i17 = iArr[i16];
                    iArr[i16] = i17 | ((bArr[(i10 + i11) - 1] & 255) << i13) | i17;
                    i11--;
                    i13 += 8;
                }
            }
            while (true) {
                int[] iArr2 = r10.f1609;
                int i18 = r10.f1608;
                int i19 = i18 - 1;
                if (iArr2[i19] == 0 && i18 > 1) {
                    r10.f1608 = i19;
                } else {
                    return;
                }
            }
        } else {
            throw new C3738(f1605);
        }
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public static boolean m1726(C3843 r32, C3843 r42) {
        int i10 = r32.f1608;
        int i11 = r42.f1608;
        if (i10 == i11) {
            int i12 = i10 - 1;
            while (i12 > 0 && r32.f1609[i12] == r42.f1609[i12]) {
                i12--;
            }
            return m1721(r32.f1609[i12], r42.f1609[i12]);
        } else if (i10 > i11) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: ϴ  reason: contains not printable characters */
    public static void m1704(C3843 r72, int i10) {
        int i11;
        int i12;
        int i13;
        if (i10 != 0) {
            int i14 = r72.f1608;
            if (i14 <= 768) {
                int i15 = i10 >>> 5;
                int i16 = i10 & 31;
                int i17 = 0;
                if (i15 > i14) {
                    r72.f1608 = 1;
                    r72.f1609[0] = 0;
                } else if (i16 == 0) {
                    while (true) {
                        int i18 = r72.f1608 - i15;
                        if (i17 < i18) {
                            int[] iArr = r72.f1609;
                            iArr[i17] = iArr[i17 + i15];
                            i17++;
                        } else {
                            r72.f1608 = i18;
                            return;
                        }
                    }
                } else {
                    while (true) {
                        i11 = r72.f1608;
                        i12 = i11 - i15;
                        i13 = i12 - 1;
                        if (i17 >= i13) {
                            break;
                        }
                        int[] iArr2 = r72.f1609;
                        int i19 = i17 + i15;
                        iArr2[i17] = (iArr2[i19] >>> i16) | (iArr2[i19 + 1] << (32 - i16));
                        i17++;
                    }
                    int[] iArr3 = r72.f1609;
                    int i20 = iArr3[i11 - 1] >>> i16;
                    iArr3[i13] = i20;
                    if (i20 == 0) {
                        r72.f1608 = i13;
                    } else {
                        r72.f1608 = i12;
                    }
                }
            } else {
                throw new C3738(f1605);
            }
        }
    }

    /* renamed from: ⶊ  reason: contains not printable characters */
    public static void m1728(C3843 r42, C3843 r52, C3843 r62) {
        boolean z10 = r42.f1607;
        if (!z10 && r52.f1607) {
            r42.f1607 = true;
            m1715(r42, r52, r62);
            r42.f1607 = false;
            r62.f1607 = false;
        } else if (z10 && !r52.f1607) {
            r52.f1607 = true;
            m1715(r42, r52, r62);
            r52.f1607 = false;
            r62.f1607 = true;
        } else if (z10 || r52.f1607) {
            if (m1726(r52, r42)) {
                m1730(r52, r42, r62);
                r62.f1607 = false;
            } else {
                m1730(r42, r52, r62);
            }
            if (!r42.f1607 && !r52.f1607) {
                r62.f1607 = !r62.f1607;
            }
        } else {
            r42.f1607 = true;
            r52.f1607 = true;
            m1728(r52, r42, r62);
            if (r52 != r62) {
                r52.f1607 = false;
            }
            if (r42 != r62) {
                r42.f1607 = false;
            }
        }
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public static void m1724(C3843 r72, C3843 r82, C3843 r92) {
        int i10;
        if (r72.f1608 > 768 || (i10 = r82.f1608) > 768 || i10 > 768) {
            throw new C3738(f1605);
        } else if (!m1725(r82)) {
            C3843 r02 = new C3843(1);
            m1706(r92);
            for (int r22 = m1712(r72); r22 >= 1; r22--) {
                m1703(r92);
                int[] iArr = r92.f1609;
                iArr[0] = iArr[0] | m1723(r72, r22);
                if (m1726(r92, r82)) {
                    m1728(r92, r82, r02);
                    m1714(r92, r02);
                } else if (m1711(r92, r82)) {
                    m1706(r92);
                }
            }
        } else {
            throw new C3738(f1604);
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static void m1713(C3843 r42, int i10, boolean z10) {
        int i11;
        int i12 = r42.f1608;
        if (i12 > 768 || (i11 = i10 >>> 5) >= 768) {
            throw new C3738(f1605);
        }
        if (z10) {
            int[] iArr = r42.f1609;
            iArr[i11] = (1 << (i10 & 31)) | iArr[i11];
        } else {
            int[] iArr2 = r42.f1609;
            iArr2[i11] = (~(1 << (i10 & 31))) & iArr2[i11];
        }
        if (i11 >= i12) {
            r42.f1608 = i11 + 1;
        }
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public static void m1708(C3843 r19, C3843 r20, C3843 r21) {
        C3843 r02 = r19;
        C3843 r12 = r20;
        C3843 r22 = r21;
        r22.f1607 = true;
        int[] iArr = r02.f1609;
        int[] iArr2 = r12.f1609;
        int[] iArr3 = r22.f1609;
        int i10 = r02.f1608;
        int i11 = r12.f1608;
        int i12 = 0;
        long j10 = 0;
        while (i12 < i11) {
            j10 = (((long) iArr[i12]) & 4294967295L) + (((long) iArr2[i12]) & 4294967295L) + (j10 >>> 32);
            iArr3[i12] = (int) j10;
            i12++;
            iArr = iArr;
        }
        int[] iArr4 = iArr;
        boolean z10 = (j10 >>> 32) != 0;
        while (i12 < i10 && z10) {
            int i13 = iArr4[i12] + 1;
            iArr3[i12] = i13;
            z10 = i13 == 0;
            i12++;
        }
        while (i12 < i10) {
            iArr3[i12] = iArr4[i12];
            i12++;
        }
        if (z10) {
            r22.f1609[i10] = 1;
            r22.f1608 = i10 + 1;
        } else {
            r22.f1608 = i10;
        }
        if (!r02.f1607 && !r12.f1607) {
            r22.f1607 = false;
        }
    }

    /* renamed from: ⶏ  reason: contains not printable characters */
    public static void m1729(C3843 r22) {
        int i10 = r22.f1608;
        if (i10 <= 768) {
            int i11 = i10 - 1;
            while (i11 > 0 && r22.f1609[i11] == 0) {
                i11--;
            }
            r22.f1608 = i11 + 1;
            return;
        }
        throw new C3738(f1605);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static void m1715(C3843 r62, C3843 r72, C3843 r82) {
        int i10;
        int i11 = r62.f1608;
        if (i11 > 768 || (i10 = r72.f1608) > 768) {
            throw new C3738(f1605);
        }
        boolean z10 = r62.f1607;
        if (z10 && !r72.f1607) {
            r72.f1607 = true;
            m1728(r62, r72, r82);
            if (r72 != r82) {
                r72.f1607 = false;
            }
        } else if (!z10 && r72.f1607) {
            r62.f1607 = true;
            m1728(r72, r62, r82);
            if (r62 != r82) {
                r62.f1607 = false;
            }
        } else if (i11 < i10) {
            m1708(r72, r62, r82);
        } else {
            m1708(r62, r72, r82);
        }
    }

    /* renamed from: ϴ  reason: contains not printable characters */
    public static void m1705(C3843 r21, C3843 r22, C3843 r23) {
        C3843 r02 = r21;
        C3843 r12 = r22;
        C3843 r24 = r23;
        if (r02.f1608 > 768 || r12.f1608 > 768) {
            throw new C3738(f1605);
        } else if (m1725(r21) || m1725(r22)) {
            m1706(r23);
        } else {
            int i10 = r02.f1608;
            int i11 = r12.f1608;
            int[] iArr = r02.f1609;
            int[] iArr2 = r12.f1609;
            int[] iArr3 = r24.f1609;
            char c10 = 0;
            int i12 = 0;
            int i13 = 0;
            long j10 = 0;
            while (i12 < i11) {
                long j11 = ((((long) iArr2[i12]) & 4294967295L) * (((long) iArr[c10]) & 4294967295L)) + j10;
                iArr3[i13] = (int) j11;
                j10 = j11 >>> 32;
                i12++;
                i13++;
                c10 = 0;
            }
            iArr3[i13] = (int) j10;
            int i14 = 1;
            while (i14 < i10) {
                int i15 = i14;
                int i16 = 0;
                long j12 = 0;
                while (i16 < i11) {
                    long j13 = ((((long) iArr2[i16]) & 4294967295L) * (((long) iArr[i14]) & 4294967295L)) + (((long) iArr3[i15]) & 4294967295L) + j12;
                    iArr3[i15] = (int) j13;
                    j12 = j13 >>> 32;
                    i16++;
                    i15++;
                    iArr = iArr;
                    iArr2 = iArr2;
                }
                iArr3[i11 + i14] = (int) j12;
                i14++;
                iArr = iArr;
                iArr2 = iArr2;
            }
            r24.f1608 = i10 + i11;
            if (r02.f1607 ^ r12.f1607) {
                r24.f1607 = false;
            } else {
                r24.f1607 = true;
            }
            m1729(r23);
        }
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public static boolean m1711(C3843 r42, C3843 r52) {
        if (r42.f1608 != r52.f1608) {
            return false;
        }
        if ((r42.f1607 ^ r52.f1607) && (!m1725(r42) || !m1725(r52))) {
            return false;
        }
        for (int i10 = 0; i10 < r42.f1608; i10++) {
            if (r42.f1609[i10] != r52.f1609[i10]) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static void m1720(C3843[] r32, C3843[] r42) {
        C3843 r12 = r32[0];
        r32[0] = r42[0];
        r42[0] = r12;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static boolean m1722(C3843 r22, int i10) {
        return i10 >= 0 && (r22.f1609[i10 >>> 5] & (1 << (i10 & 31))) != 0;
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public static boolean m1710(C3843 r22) {
        return (r22.f1609[0] & 1) == 0;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static void m1714(C3843 r42, C3843 r52) {
        System.arraycopy(r52.f1609, 0, r42.f1609, 0, 768);
        r42.f1608 = r52.f1608;
        r42.f1607 = r52.f1607;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static int m1712(C3843 r32) {
        int i10 = r32.f1608 - 1;
        while (i10 > 1 && r32.f1609[i10] == 0) {
            i10--;
        }
        int i11 = r32.f1609[i10];
        int i12 = i10 << 5;
        while (m1721(i11, 0)) {
            i11 >>>= 1;
            i12++;
        }
        return i12;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static void m1717(C3843 r17, C3843 r18, C3843 r19, C3843 r20) {
        C3843 r16;
        C3843 r02;
        C3843 r03 = r17;
        C3843 r12 = r18;
        if (r12.f1608 > 768 || r03.f1608 > 768) {
            throw new C3738(f1605);
        } else if (m1725(r18) || m1725(r17)) {
            throw new C3738(f1604);
        } else {
            C3843 r22 = new C3843(1);
            C3843 r42 = new C3843(1);
            C3843 r52 = new C3843(1);
            C3843 r62 = new C3843(1);
            C3843 r72 = new C3843(1);
            C3843 r82 = new C3843(1);
            C3843[] r92 = {new C3843(1)};
            C3843[] r10 = {new C3843(1)};
            C3843[] r11 = {new C3843(1)};
            C3843[] r122 = {new C3843(1)};
            C3843[] r13 = {r82};
            m1714(r22, r12);
            m1714(r42, r03);
            C3843[] r04 = {r72};
            C3843 r15 = r04[0];
            r15.f1608 = 1;
            r15.f1609[0] = 1;
            while (m1710(r22) && m1710(r42)) {
                m1727(r22);
                m1727(r42);
                m1703(r04[0]);
            }
            m1714(r52, r22);
            m1714(r62, r42);
            m1706(r11[0]);
            m1706(r122[0]);
            C3843 r152 = r13[0];
            r152.f1608 = 1;
            r152.f1609[0] = 1;
            while (true) {
                if (m1710(r52)) {
                    m1727(r52);
                    if (!m1710(r10[0]) || !m1710(r11[0])) {
                        m1715(r10[0], r42, r92[0]);
                        m1720(r10, r92);
                        m1727(r10[0]);
                        m1728(r11[0], r22, r92[0]);
                        m1720(r11, r92);
                        m1727(r11[0]);
                    } else {
                        m1727(r10[0]);
                        m1727(r11[0]);
                    }
                } else {
                    while (m1710(r62)) {
                        m1727(r62);
                        if (!m1710(r122[0]) || !m1710(r13[0])) {
                            m1715(r122[0], r42, r92[0]);
                            m1720(r122, r92);
                            m1727(r122[0]);
                            m1728(r13[0], r22, r92[0]);
                            m1720(r13, r92);
                            m1727(r13[0]);
                        } else {
                            m1727(r122[0]);
                            m1727(r13[0]);
                        }
                    }
                    if (m1726(r52, r62) || m1711(r52, r62)) {
                        r16 = r22;
                        m1728(r52, r62, r52);
                        m1728(r10[0], r122[0], r92[0]);
                        m1720(r10, r92);
                        m1728(r11[0], r13[0], r92[0]);
                        m1720(r11, r92);
                    } else {
                        m1728(r62, r52, r62);
                        r16 = r22;
                        m1728(r122[0], r10[0], r92[0]);
                        m1720(r122, r92);
                        m1728(r13[0], r11[0], r92[0]);
                        m1720(r13, r92);
                    }
                    if (m1725(r52)) {
                        break;
                    }
                    C3843 r23 = r19;
                    C3843 r32 = r20;
                    r22 = r16;
                }
            }
            m1705(r04[0], r62, r92[0]);
            m1720(r04, r92);
            C3843 r05 = r04[0];
            if (r05 != r72) {
                r72 = r05;
            }
            while (true) {
                r02 = r13[0];
                if (r02.f1607) {
                    break;
                }
                m1715(r02, r12, r92[0]);
                m1720(r92, r13);
            }
            C3843 r24 = r19;
            if (r82 != r02) {
                r82 = r02;
            }
            m1714(r24, r72);
            m1714(r20, r82);
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static void m1716(C3843 r28, C3843 r29, C3843 r30, int i10, int i11, C3843 r33) {
        int i12;
        C3843 r02 = r28;
        C3843 r12 = r29;
        C3843 r22 = r30;
        int i13 = i11;
        C3843 r42 = r33;
        if (r02.f1608 > 768 || r12.f1608 > 768 || r22.f1608 > 768 || i13 >= 768) {
            throw new C3738(f1605);
        } else if (!m1725(r30)) {
            char c10 = 0;
            int i14 = 0;
            while (true) {
                i12 = i13 + 1;
                if (i14 >= i12) {
                    break;
                }
                r42.f1609[i14] = 0;
                i14++;
            }
            int i15 = r12.f1609[0];
            int i16 = 0;
            while (i16 < i13) {
                int i17 = r02.f1609[i16];
                int i18 = r42.f1609[c10];
                long j10 = ((long) i17) & 4294967295L;
                int i19 = i15;
                long j11 = (((long) r12.f1609[c10]) & 4294967295L) * j10;
                int i20 = i12;
                int i21 = i16;
                long j12 = ((long) (((i17 * i15) + i18) * i10)) & 4294967295L;
                long j13 = (((long) r22.f1609[0]) & 4294967295L) * j12;
                long j14 = j12;
                long j15 = ((long) 0) & 4294967295L;
                long j16 = (((((j11 & 4294967295L) + (j13 & 4294967295L)) + (((long) i18) & 4294967295L)) + j15) >>> 32) + (j11 >>> 32) + (j13 >>> 32) + j15;
                int i22 = (int) j16;
                int i23 = (int) (j16 >>> 32);
                int i24 = 1;
                while (i24 < i13) {
                    long j17 = (((long) r12.f1609[i24]) & 4294967295L) * j10;
                    long j18 = (((long) r22.f1609[i24]) & 4294967295L) * j14;
                    int[] iArr = r42.f1609;
                    long j19 = (j17 & 4294967295L) + (j18 & 4294967295L) + (((long) iArr[i24]) & 4294967295L) + (((long) i22) & 4294967295L);
                    iArr[i24 - 1] = (int) j19;
                    long j20 = (j19 >>> 32) + (j17 >>> 32) + (j18 >>> 32) + (((long) i23) & 4294967295L);
                    i24++;
                    r12 = r29;
                    i22 = (int) j20;
                    j10 = j10;
                    i23 = (int) (j20 >>> 32);
                    C3843 r03 = r28;
                }
                int[] iArr2 = r42.f1609;
                long j21 = (((long) iArr2[i13]) & 4294967295L) + (((long) i22) & 4294967295L);
                iArr2[i13 - 1] = (int) j21;
                iArr2[i13] = (int) ((j21 >>> 32) + (((long) i23) & 4294967295L));
                i16 = i21 + 1;
                r02 = r28;
                r12 = r29;
                i12 = i20;
                i15 = i19;
                c10 = 0;
            }
            r42.f1608 = i12;
            m1729(r33);
            if (m1726(r42, r22)) {
                m1728(r42, r22, r42);
            }
            r42.f1608 = i13;
        } else {
            throw new C3738(f1604);
        }
    }
}

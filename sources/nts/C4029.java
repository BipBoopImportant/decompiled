package nts;

import java.util.Vector;

/* renamed from: nts.ᯣ  reason: contains not printable characters */
public class C4029 {

    /* renamed from: ϴ  reason: contains not printable characters */
    public int f2777 = -1;

    /* renamed from: ગ  reason: contains not printable characters */
    public long f2778 = 0;

    /* renamed from: ഇ  reason: contains not printable characters */
    public int f2779 = 128;

    /* renamed from: ᐳ  reason: contains not printable characters */
    public Vector f2780 = null;

    /* renamed from: ϴ  reason: contains not printable characters */
    public final int m2632() {
        long j10 = this.f2778;
        if (j10 <= 255) {
            return 1;
        }
        if (j10 <= 65535) {
            return 2;
        }
        if (j10 <= 16777215) {
            return 3;
        }
        return j10 <= 4294967295L ? 4 : -1;
    }

    /* renamed from: ࡏ  reason: contains not printable characters */
    public boolean m2633() {
        int i10 = 0;
        while (true) {
            Vector vector = this.f2780;
            if (vector == null || i10 >= vector.size()) {
                return false;
            }
            C3857 r22 = (C3857) this.f2780.get(i10);
            if (!(r22 instanceof C3620) && !(r22 instanceof C4231)) {
                return true;
            }
            i10++;
        }
        return false;
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public int m2634() {
        return this.f2777;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m2642(C4042 r12, C3647 r22) {
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public long m2645() {
        return this.f2778;
    }

    /* renamed from: ⶊ  reason: contains not printable characters */
    public int m2647() {
        return -1;
    }

    /* renamed from: ⶏ  reason: contains not printable characters */
    public boolean m2648() {
        int i10 = 0;
        while (true) {
            Vector vector = this.f2780;
            if (vector == null || i10 >= vector.size()) {
                return false;
            }
            if (((C3857) this.f2780.get(i10)).m1821()) {
                return true;
            }
            i10++;
        }
        return false;
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public static C4029 m2631(C4042 r10, C3647 r11) {
        C3558 r112;
        int i10 = r10.f1610;
        byte[] bArr = r10.f1612;
        byte b10 = bArr[i10];
        int i11 = 0;
        if ((b10 & 128) == 128) {
            if (((int) r10.f1613.m1235(bArr, i10 + 1, 4)) == 0) {
                C3814 r113 = new C3814();
                r113.m209(r10);
                r113.f1522 = new long[(r10.m1731() / 4)];
                while (true) {
                    long[] jArr = r113.f1522;
                    if (i11 < jArr.length) {
                        jArr[i11] = ((long) r10.m1733()) & 4294967295L;
                        i11++;
                    } else {
                        r113.f2777 = r10.f1610;
                        return r113;
                    }
                }
            } else {
                byte b11 = b10 & 240;
                if (b11 == 192) {
                    C4091 r02 = new C4091();
                    int i12 = r10.f1610;
                    r02.m209(r10);
                    r02.f3473 = r10.m1732((int) r10.m2709((int[]) null));
                    r02.m2636(r10, i12, r11.f665);
                    r02.f2777 = r10.f1610 - i12;
                    return r02;
                } else if (b11 == 208) {
                    C3635 r03 = new C3635();
                    int i13 = r10.f1610;
                    r03.m209(r10);
                    r11.getClass();
                    r03.m2636(r10, i13, (C3558) null);
                    r03.f2777 = r10.f1610 - i13;
                    return r03;
                } else if (b11 == 224) {
                    C4202 r04 = new C4202();
                    int i14 = r10.f1610;
                    r04.m209(r10);
                    try {
                        if (r11.f656 == null) {
                            C3807 r22 = r11.f667;
                            r11.f656 = C3558.m150(r22.f1476, r22.m1470());
                            C3807 r23 = r11.f667;
                            r11.f659 = C3558.m150(r23.f1444, r23.m1470());
                        }
                        r04.m2636(r10, i14, r11.f659);
                        r04.f2777 = r10.f1610 - i14;
                        return r04;
                    } catch (Exception e10) {
                        throw new C3625((Throwable) null, 0, C3727.m1052("\u000b-&\",,k>*d7'33&b-=&269?`u773%0LU=\u000f\u001b@_\u0016\u0016\u0012\u001doIY\u0011\u0006\u0002\rhNY]\u0000TXH^XCFFXH@C^\"AL<\u001b\u0019\u0018\u0004\u0018\u0011\u0001\u00030\u0004\u0012\u0010J:)-+1-&*IHKJ0Ls~\t30?7pq|\u000f5\u0017-6r80$45?EDKJIH2N\u0019\u0014cYZU]\u001a·¼¸¶¶ñ¤°þ¾³¶ª¬¬¢æ­¥­¦²¨®¥¨ì ¯°»ÍÖØÊÀÎÃÕÍÅÀÏ©¨Ò®ëÑóÉÒêàáààóÉëÑÊ®¥¡¯¯è½©ç§ª¯³µµ»ÿ½­ªû³¼¯¤îõ§¼®¯ØÙÚÛÔÕÖ×­ÑøÂäÞÁZujB}uds[qo2", 135, 34, 114) + C3625.m592(e10));
                    }
                } else if (b11 != 240) {
                    return null;
                } else {
                    C3762 r114 = new C3762();
                    int i15 = r10.f1610;
                    r114.m209(r10);
                    r114.f1213 = r10.m1732(r10.m1731() - 16);
                    r114.f1214 = C3823.m1630(r10.f1612, i15, r10.f1610 - i15);
                    r114.f1215 = r10.m1738();
                    r114.f2777 = r10.f1610 - i15;
                    return r114;
                }
            }
        } else {
            C3794 r05 = new C3794();
            int i16 = r10.f1610;
            r05.f2779 = r10.m1761() & 255;
            r05.f1327 = r10.m1732(8);
            try {
                r11.m647();
                C3558 r24 = r11.f650;
                int r32 = r10.m1731();
                try {
                    r05.f2778 = r05.m2646(r10, i16, r24);
                    if (r11.f663) {
                        if (System.currentTimeMillis() >= r11.f657) {
                            if (r11.f663) {
                                r11.f663 = false;
                                r11.f657 = 0;
                                r11.f666 = -1;
                                r11.f660 = null;
                                r11.f664.m3367(C3727.m1052("\u000e\u0000\u0006\u000b\u0007\u001cK\u0003\u000btcwrfp!ia`yehqtal\r\u000f\u0006`zwdwmg\u0015\u0015\u0017\u0019w`~qnmzu\u0019!#IPS\\M@T\\-',\"NWWZEOABJB>=Q_GES:GEC(#93AIKz}yt~Ea*\"#$-?wrtgkRniy:20w5/gbdW[bO^YI\u000b\u000f\u0002G\u0005\u001fWRTGKr_NIY\u001d\u0015\u0017W\u0015¬¿ÈÓ¹½ Ý«°àµ´²¡­²½¨®º¤à¶¤¶³üù°®©²ööòý¾£°¶¥°üöüõÛòïÀäÿûíññù§¼ÊñÊåþÓõàêþàæè®äÿÔÐÜÄÓ\u001f0/\u0002 53'9}\u001b1<q[Qr^V\u0014\\I\u001bVVJ\u001fOHRSOSRB@\u0005CE\bog\rq|}az~u{y~8tq{y3mhw|8rbWRMF\u0002JVrwhc'nu\u0006\u0003\u0016\u0012\u0018\u0012\u0011\u001d\u0015EF7\r\u0013\u0014\u0016\u0017\u000b\u0017\u001e\u000e\fI\r\u0006\u001c\u0005\u0017\u0001JQ-(7<x2/ÔÍÑÜÅÀÕØ¹»²ÔËÎÃÐÃÙÓ¡¡£´±¤Û¶³¾ÔÍÑÜÅÀÕØº¼¼ÔËÎÃÐÃÙÓ ¬¡÷òçõðýøáýðëáëèìäÿñíïåæéóõëáëèäìñíïý", 265, 13, 80));
                            } else {
                                throw new C3625((Throwable) null, 0, C3727.m1052("\u000e\u0000\u0006\u000b\u0007\u001cK\u0003\u000btcwrfp!ia`yehqtal\r\u000f\u0006`zwdwmg\u0015\u0015\u0017\u0019w`~qnmzu\u0019!#IPS\\M@T\\-',\"NWWZEOABJB>=Q_GES:GEC(#93AIKz}yt~Ea*\"#$-?wrtgkRniy:20w5/gbdW[bO^YI\u000b\u000f\u0002G\u0005\u001fWRTGKr_NIY\u001d\u0015\u0017W\u0015¬¿ÈÓ¹½ Ý«°àµ´²¡­²½¨®º¤à¶¤¶³üù°®©²ööòý¾£°¶¥°üöüõÛòïÀäÿûíññù§¼ÊñÊåþÓõàêþàæè®äÿÔÐÜÄÓ\u001f0/\u0002 53'9}\u001b1<q[Qr^V\u0014\\I\u001bVVJ\u001fOHRSOSRB@\u0005CE\bog\rq|}az~u{y~8tq{y3mhw|8rbWRMF\u0002JVrwhc'nu\u0006\u0003\u0016\u0012\u0018\u0012\u0011\u001d\u0015EF7\r\u0013\u0014\u0016\u0017\u000b\u0017\u001e\u000e\fI\r\u0006\u001c\u0005\u0017\u0001JQ-(7<x2/ÔÍÑÜÅÀÕØ¹»²ÔËÎÃÐÃÙÓ¡¡£´±¤Û¶³¾ÔÍÑÜÅÀÕØº¼¼ÔËÎÃÐÃÙÓ ¬¡÷òçõðýøáýðëáëèìäÿñíïåæéóõëáëèäìñíïý", 227, 38, 86));
                            }
                        } else if (r05.f2778 < r11.f666) {
                            r112 = r11.f660;
                        }
                        r05.m2635(r10, i16, r32, r24);
                        r05.f2777 = r10.f1610 - i16;
                        return r05;
                    }
                    if (((r05.f2779 & 4) >> 2) != r11.f655) {
                        r11.f652 = C3558.m149(r11.f652);
                        C3558 r25 = r11.f650;
                        r11.f660 = r25;
                        r11.f650 = C3558.m149(r25);
                        r11.m649(r05.f2778, (r05.f2779 & 4) >> 2);
                        r112 = r11.f650;
                    }
                    r05.m2635(r10, i16, r32, r24);
                    r05.f2777 = r10.f1610 - i16;
                    return r05;
                    r24 = r112;
                    r05.m2635(r10, i16, r32, r24);
                    r05.f2777 = r10.f1610 - i16;
                    return r05;
                } catch (Exception e11) {
                    throw new C3625(e11, C3625.m591(e11), C3625.m589(e11));
                }
            } catch (Exception e12) {
                throw new C3625((Throwable) null, 0, C3727.m1052("\u000b-&\",,k>*d7'33&b-=&269?`u773%0LU=\u000f\u001b@_\u0016\u0016\u0012\u001doIY\u0011\u0006\u0002\rhNY]\u0000TXH^XCFFXH@C^\"AL<\u001b\u0019\u0018\u0004\u0018\u0011\u0001\u00030\u0004\u0012\u0010J:)-+1-&*IHKJ0Ls~\t30?7pq|\u000f5\u0017-6r80$45?EDKJIH2N\u0019\u0014cYZU]\u001a·¼¸¶¶ñ¤°þ¾³¶ª¬¬¢æ­¥­¦²¨®¥¨ì ¯°»ÍÖØÊÀÎÃÕÍÅÀÏ©¨Ò®ëÑóÉÒêàáààóÉëÑÊ®¥¡¯¯è½©ç§ª¯³µµ»ÿ½­ªû³¼¯¤îõ§¼®¯ØÙÚÛÔÕÖ×­ÑøÂäÞÁZujB}uds[qo2", 213, 28, 7) + C3625.m592(e12));
            }
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m2638(C3857 r22) {
        if (this.f2780 == null) {
            this.f2780 = new Vector();
        }
        this.f2780.add(r22);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0091  */
    /* renamed from: ᐳ  reason: contains not printable characters */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long m2646(nts.C4042 r9, int r10, nts.C3558 r11) {
        /*
            r8 = this;
            int r0 = r9.f1610
            int r0 = r0 + 4
            byte[] r1 = r9.f1612
            r2 = 16
            byte[] r0 = nts.C3823.m1630(r1, r0, r2)
            byte[] r0 = r11.m153((byte[]) r0)
            int r1 = r8.f2779
            r2 = r1 & 128(0x80, float:1.794E-43)
            r3 = 0
            r4 = 128(0x80, float:1.794E-43)
            if (r2 != r4) goto L_0x0021
            byte r2 = r0[r3]
            r2 = r2 & 15
            r1 = r1 ^ r2
            r8.f2779 = r1
            goto L_0x0028
        L_0x0021:
            byte r2 = r0[r3]
            r2 = r2 & 31
            r1 = r1 ^ r2
            r8.f2779 = r1
        L_0x0028:
            int r1 = r8.f2779
            r2 = r1 & 255(0xff, float:3.57E-43)
            byte r2 = (byte) r2
            byte[] r4 = r9.f1612
            r4[r10] = r2
            r10 = 3
            r1 = r1 & r10
            int r2 = r9.f1610
        L_0x0035:
            if (r3 > r1) goto L_0x0048
            int r4 = r2 + r3
            byte[] r5 = r9.f1612
            byte r6 = r5[r4]
            int r3 = r3 + 1
            byte r7 = r0[r3]
            r6 = r6 ^ r7
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r6 = (byte) r6
            r5[r4] = r6
            goto L_0x0035
        L_0x0048:
            r0 = 1
            if (r1 != 0) goto L_0x0053
            byte r9 = r9.m1761()
            r9 = r9 & 255(0xff, float:3.57E-43)
        L_0x0051:
            long r9 = (long) r9
            goto L_0x006f
        L_0x0053:
            if (r1 != r0) goto L_0x005e
            short r9 = r9.m1736()
            r10 = 65535(0xffff, float:9.1834E-41)
            r9 = r9 & r10
            goto L_0x0051
        L_0x005e:
            r2 = 2
            if (r1 != r2) goto L_0x0066
            int r9 = r9.m1739()
            goto L_0x0051
        L_0x0066:
            if (r1 != r10) goto L_0x006d
            int r9 = r9.m1733()
            goto L_0x0051
        L_0x006d:
            r9 = 0
        L_0x006f:
            int r1 = r1 + r0
            int r1 = r1 * 8
            long r2 = r11.f97
            r4 = 1
            long r2 = r2 + r4
            long r0 = r4 << r1
            r6 = 2
            long r6 = r0 / r6
            long r4 = r0 - r4
            long r4 = ~r4
            long r4 = r4 & r2
            long r9 = r9 | r4
            long r4 = r2 - r6
            int r11 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r11 > 0) goto L_0x0091
            r4 = 4611686018427387904(0x4000000000000000, double:2.0)
            long r4 = r4 - r0
            int r11 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r11 >= 0) goto L_0x0091
            long r9 = r9 + r0
            goto L_0x0097
        L_0x0091:
            long r2 = r2 + r6
            int r11 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r11 <= 0) goto L_0x0097
            long r9 = r9 - r0
        L_0x0097:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: nts.C4029.m2646(nts.ᱞ, int, nts.ʫ):long");
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public final void m2641(C4042 r92, int i10, byte[] bArr, C3558 r12) {
        byte b10;
        int i11 = r92.f1610;
        long j10 = this.f2778;
        long j11 = r12.f97;
        long j12 = j11 >= 0 ? j10 - j11 : j10 + 1;
        int i12 = 1;
        while (j12 > 1) {
            j12 >>= 1;
            i12++;
        }
        int i13 = (i12 + 7) / 8;
        if (i13 == 1) {
            r92.m1745((byte) ((int) (this.f2778 & 255)));
        } else if (i13 == 2) {
            r92.m1740((int) (this.f2778 & 65535));
        } else if (i13 == 3) {
            r92.m1734((int) (this.f2778 & 16777215));
        } else if (i13 == 4) {
            r92.m1749(this.f2778, 4);
        }
        byte[] bArr2 = r92.f1612;
        bArr2[i10] = (byte) ((this.f2779 | ((byte) (i13 - 1))) & 255);
        r12.f93.m2338(m2644(r12.f96, this.f2778), C3823.m1630(bArr2, i10, r92.f1610 - i10), (byte[]) null);
        r92.m1752(r12.f93.m2335(bArr));
        byte[] bArr3 = r92.f1612;
        byte b11 = bArr3[i10];
        byte b12 = b11 & 3;
        byte[] r11 = r12.m153(C3823.m1630(bArr3, i11 + 4, 16));
        int i14 = 0;
        if ((this.f2779 & 128) == 128) {
            b10 = r11[0] & 15;
        } else {
            b10 = r11[0] & 31;
        }
        r92.f1612[i10] = (byte) ((b10 ^ b11) & 255);
        while (i14 <= b12) {
            int i15 = i11 + i14;
            byte[] bArr4 = r92.f1612;
            i14++;
            bArr4[i15] = (byte) ((bArr4[i15] ^ r11[i14]) & 255);
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m2640(C4042 r42, int i10, C3558 r62) {
        byte[] r02 = m2643();
        r42.m2707((long) (r02.length + m2632() + 16));
        try {
            m2641(r42, i10, r02, r62);
        } catch (Exception e10) {
            throw new C3625(e10, C3625.m591(e10), C3625.m589(e10));
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m2637(StringBuilder sb2) {
        Vector vector = this.f2780;
        if (vector != null && vector.size() > 0) {
            for (int i10 = 0; i10 < this.f2780.size(); i10++) {
                sb2.append(" " + ((C3857) this.f2780.get(i10)).toString());
            }
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public final void m2639(C4042 r52, int i10, int i11, C3558 r82) {
        this.f2778 = m2646(r52, i10, r82);
        byte[] r62 = C3823.m1630(r52.f1612, i10, r52.f1610 - i10);
        byte[] r12 = m2644(r82.f96, this.f2778);
        byte[] r72 = r52.m1732((i11 - ((this.f2779 & 3) + 1)) - 16);
        r82.f93.m2338(r12, r62, r52.m1732(16));
        this.f2780 = C3857.m1819(r82.f93.m2340(r72));
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public final byte[] m2644(byte[] bArr, long j10) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        C3823.m1614(j10, bArr2, length - 8, 8);
        for (int i10 = 0; i10 < length; i10++) {
            bArr2[i10] = (byte) (bArr2[i10] ^ bArr[i10]);
        }
        return bArr2;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public final byte[] m2643() {
        C4042 r02 = new C4042();
        for (int i10 = 0; i10 < this.f2780.size(); i10++) {
            ((C3857) this.f2780.get(i10)).m1823(r02);
        }
        return r02.m1755();
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public void m2635(C4042 r52, int i10, int i11, C3558 r82) {
        byte[] r62 = C3823.m1630(r52.f1612, i10, r52.f1610 - i10);
        byte[] r12 = m2644(r82.f96, this.f2778);
        byte[] r72 = r52.m1732((i11 - ((this.f2779 & 3) + 1)) - 16);
        r82.f93.m2338(r12, r62, r52.m1732(16));
        this.f2780 = C3857.m1819(r82.f93.m2340(r72));
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public void m2636(C4042 r62, int i10, C3558 r82) {
        try {
            m2639(r62, i10, (int) r62.m2709((int[]) null), r82);
        } catch (Exception e10) {
            throw new C3625((Throwable) null, 0, C3727.m1052("\u000b-&\",,k>*d7'33&b-=&269?`u773%0LU=\u000f\u001b@_\u0016\u0016\u0012\u001doIY\u0011\u0006\u0002\rhNY]\u0000TXH^XCFFXH@C^\"AL<\u001b\u0019\u0018\u0004\u0018\u0011\u0001\u00030\u0004\u0012\u0010J:)-+1-&*IHKJ0Ls~\t30?7pq|\u000f5\u0017-6r80$45?EDKJIH2N\u0019\u0014cYZU]\u001a·¼¸¶¶ñ¤°þ¾³¶ª¬¬¢æ­¥­¦²¨®¥¨ì ¯°»ÍÖØÊÀÎÃÕÍÅÀÏ©¨Ò®ëÑóÉÒêàáààóÉëÑÊ®¥¡¯¯è½©ç§ª¯³µµ»ÿ½­ªû³¼¯¤îõ§¼®¯ØÙÚÛÔÕÖ×­ÑøÂäÞÁZujB}uds[qo2", 0, 25, 84) + C3625.m592(e10));
        }
    }
}

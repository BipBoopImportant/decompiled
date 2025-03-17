package nts;

/* renamed from: nts.ᢘ  reason: contains not printable characters */
public class C3983 {

    /* renamed from: ϴ  reason: contains not printable characters */
    public long f2560 = 0;

    /* renamed from: Е  reason: contains not printable characters */
    public byte[] f2561 = null;

    /* renamed from: ࡏ  reason: contains not printable characters */
    public int f2562 = 128;

    /* renamed from: ખ  reason: contains not printable characters */
    public byte[] f2563 = null;

    /* renamed from: ગ  reason: contains not printable characters */
    public C4055 f2564 = new C4055();

    /* renamed from: ഇ  reason: contains not printable characters */
    public C3683 f2565 = new C3683();

    /* renamed from: ᅯ  reason: contains not printable characters */
    public long f2566 = 0;

    /* renamed from: ᐳ  reason: contains not printable characters */
    public int f2567 = 0;

    /* renamed from: ᘺ  reason: contains not printable characters */
    public boolean f2568 = false;

    /* renamed from: ⴸ  reason: contains not printable characters */
    public byte[] f2569 = null;

    /* renamed from: ⶊ  reason: contains not printable characters */
    public boolean f2570 = true;

    /* renamed from: ⶏ  reason: contains not printable characters */
    public byte[] f2571 = new byte[16];

    public C3983() {
        m2369();
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public int m2369() {
        this.f2565.m809();
        this.f2564.m2828();
        this.f2567 = 0;
        this.f2560 = 0;
        this.f2570 = true;
        this.f2571 = new byte[16];
        this.f2562 = 128;
        this.f2563 = null;
        this.f2561 = null;
        this.f2569 = null;
        this.f2566 = 0;
        this.f2568 = false;
        return 0;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m2370(boolean z10) {
        this.f2568 = z10;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m2372(byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, int i10, long j10, boolean z10) {
        this.f2569 = bArr;
        this.f2561 = bArr2;
        this.f2563 = bArr3;
        this.f2571 = bArr4;
        this.f2562 = i10;
        this.f2566 = j10;
        this.f2570 = z10;
        this.f2564.m2828();
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m2371(byte[] bArr, byte[] bArr2, byte[] bArr3, int i10) {
        this.f2561 = bArr;
        this.f2563 = bArr2;
        this.f2571 = bArr3;
        this.f2562 = i10;
        this.f2565.m809();
        this.f2564.m2828();
        this.f2560 = 0;
        this.f2567 = 0;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public byte[] m2373(byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        byte[] bArr2 = bArr;
        int i14 = i10;
        int i15 = i11;
        byte[] bArr3 = this.f2571;
        boolean z10 = this.f2570;
        if (i14 + i15 <= bArr2.length) {
            byte[] bArr4 = new byte[i15];
            System.arraycopy(bArr2, i14, bArr4, 0, i15);
            byte[] r12 = m2374(bArr4, z10);
            if (this.f2567 == 2) {
                if (!this.f2568) {
                    byte[] bArr5 = new byte[8];
                    int i16 = (int) (this.f2560 % 16);
                    if (i16 > 0) {
                        int i17 = 16 - i16;
                        this.f2564.m2829(new byte[i17], 0, i17);
                    }
                    m2368(bArr5, (long) this.f2563.length);
                    this.f2564.m2829(bArr5, 0, 8);
                    m2368(bArr5, this.f2560);
                    this.f2564.m2829(bArr5, 0, 8);
                }
                C4055 r22 = this.f2564;
                int i18 = r22.f2960;
                if (i18 > 0) {
                    byte[] bArr6 = r22.f2964;
                    int i19 = i18 + 1;
                    r22.f2960 = i19;
                    bArr6[i18] = 1;
                    while (i19 < 16) {
                        r22.f2964[i19] = 0;
                        i19++;
                    }
                    r22.m2830(r22.f2964, 16, 0, 0, r22);
                }
                int[] iArr = r22.f2963;
                long j10 = (((long) iArr[0]) & 4294967295L) + 5;
                int i20 = (int) j10;
                String str = "#\u0005\u001e\b\u0002\u0006\bM\u0003\u0011\u0007\u0014\u000b\u0002\n\u0011\tUkC@TEU\u0002BBI\u000eCMGM_\\\u0015UX]S[]]IWPV\u0019]Tav&eexmmh-l`}gnx4zp7qc`re3X~esy}s6xj|opyqjr\u0004\u0010\u0015S\u001a\u001a\u0002W\u001d\u0001\u0013\b\b\u000ePBdokee\"wc-jjk{s{`/6~~gsuy>|qir~V\nRFG\u000f";
                long j11 = (((long) iArr[1]) & 4294967295L) + (j10 >> 32);
                int i21 = (int) j11;
                byte[] bArr7 = bArr3;
                long j12 = (((long) iArr[2]) & 4294967295L) + (j11 >> 32);
                int i22 = (int) j12;
                int[] iArr2 = iArr;
                long j13 = (((long) iArr[3]) & 4294967295L) + (j12 >> 32);
                int i23 = 0 - ((iArr2[4] + ((int) (j13 >> 32))) >> 2);
                int i24 = i20 & i23;
                int i25 = i21 & i23;
                int i26 = i22 & i23;
                int i27 = ((int) j13) & i23;
                int i28 = ~i23;
                int i29 = i24 | (iArr2[0] & i28);
                iArr2[0] = i29;
                int i30 = (iArr2[1] & i28) | i25;
                iArr2[1] = i30;
                int i31 = i26 | (iArr2[2] & i28);
                iArr2[2] = i31;
                int i32 = i27 | (i28 & iArr2[3]);
                iArr2[3] = i32;
                int[] iArr3 = r22.f2962;
                long j14 = (((long) i29) & 4294967295L) + (((long) iArr3[0]) & 4294967295L);
                iArr2[0] = (int) j14;
                long j15 = (((long) i30) & 4294967295L) + (j14 >> 32) + (((long) iArr3[1]) & 4294967295L);
                iArr2[1] = (int) j15;
                long j16 = (((long) i31) & 4294967295L) + (j15 >> 32) + (((long) iArr3[2]) & 4294967295L);
                iArr2[2] = (int) j16;
                iArr2[3] = (int) ((((long) i32) & 4294967295L) + (j16 >> 32) + (((long) iArr3[3]) & 4294967295L));
                byte[] bArr8 = new byte[16];
                int i33 = 0;
                int i34 = 0;
                while (i34 < 16) {
                    int i35 = iArr2[i33];
                    bArr8[i34] = (byte) (i35 & 255);
                    bArr8[i34 + 1] = (byte) ((i35 >> 8) & 255);
                    int i36 = i34 + 3;
                    bArr8[i34 + 2] = (byte) ((i35 >> 16) & 255);
                    i34 += 4;
                    bArr8[i36] = (byte) ((i35 >> 24) & 255);
                    i33++;
                }
                r22.f2965 = bArr8;
                if (z10) {
                    if (this.f2571 == null) {
                        i13 = 8;
                        this.f2571 = new byte[(this.f2562 / 8)];
                    } else {
                        i13 = 8;
                    }
                    byte[] bArr9 = this.f2564.f2965;
                    byte[] bArr10 = this.f2571;
                    int i37 = this.f2562 / i13;
                    i12 = 0;
                    System.arraycopy(bArr9, 0, bArr10, 0, i37);
                } else {
                    i12 = 0;
                    if (bArr7 != null) {
                        byte[] bArr11 = bArr7;
                        if (bArr11.length != 0) {
                            if (!C3823.m1615(bArr11, this.f2564.f2965)) {
                                throw new C3625((Throwable) null, 2001, C3727.m1052(str, 108, 38, 78));
                            }
                        }
                    }
                    throw new C3738(C3727.m1052(str, 93, 15, 34));
                }
                this.f2567 = i12;
                return r12;
            }
            throw new C3738(C3727.m1052("#\u0005\u001e\b\u0002\u0006\bM\u0003\u0011\u0007\u0014\u000b\u0002\n\u0011\tUkC@TEU\u0002BBI\u000eCMGM_\\\u0015UX]S[]]IWPV\u0019]Tav&eexmmh-l`}gnx4zp7qc`re3X~esy}s6xj|opyqjr\u0004\u0010\u0015S\u001a\u001a\u0002W\u001d\u0001\u0013\b\b\u000ePBdokee\"wc-jjk{s{`/6~~gsuy>|qir~V\nRFG\u000f", 76, 17, 76));
        }
        throw new Exception(C3727.m1052("#\u0005\u001e\b\u0002\u0006\bM\u0003\u0011\u0007\u0014\u000b\u0002\n\u0011\tUkC@TEU\u0002BBI\u000eCMGM_\\\u0015UX]S[]]IWPV\u0019]Tav&eexmmh-l`}gnx4zp7qc`re3X~esy}s6xj|opyqjr\u0004\u0010\u0015S\u001a\u001a\u0002W\u001d\u0001\u0013\b\b\u000ePBdokee\"wc-jjk{s{`/6~~gsuy>|qir~V\nRFG\u000f", 18, 58, 12));
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public final byte[] m2374(byte[] bArr, boolean z10) {
        if (this.f2567 != 2) {
            byte[] bArr2 = new byte[64];
            this.f2565.m811(this.f2569, this.f2561, this.f2566);
            this.f2565.m810(bArr2);
            C4055 r02 = this.f2564;
            r02.m2831(bArr2, 0, 16, r02.f2961);
            r02.m2831(bArr2, 16, 16, r02.f2962);
            int[] iArr = r02.f2961;
            iArr[0] = iArr[0] & 268435455;
            iArr[1] = iArr[1] & 268435452;
            iArr[2] = iArr[2] & 268435452;
            iArr[3] = 268435452 & iArr[3];
            this.f2567 = 0;
            byte[] bArr3 = this.f2563;
            int length = bArr3.length % 16;
            this.f2564.m2829(bArr3, 0, bArr3.length);
            if (length > 0 && !this.f2568) {
                int i10 = 16 - length;
                this.f2564.m2829(new byte[i10], 0, i10);
            }
            this.f2567 = 1;
        }
        if (this.f2567 == 1) {
            this.f2567 = 2;
        }
        if (this.f2567 == 2) {
            if (bArr == null) {
                bArr = new byte[0];
            }
            this.f2560 += (long) bArr.length;
            if (z10) {
                this.f2565.m810(bArr);
                this.f2564.m2829(bArr, 0, bArr.length);
            } else {
                this.f2564.m2829(bArr, 0, bArr.length);
                this.f2565.m810(bArr);
            }
            return bArr;
        }
        throw new C3738(C3727.m1052("#\u0005\u001e\b\u0002\u0006\bM\u0003\u0011\u0007\u0014\u000b\u0002\n\u0011\tUkC@TEU\u0002BBI\u000eCMGM_\\\u0015UX]S[]]IWPV\u0019]Tav&eexmmh-l`}gnx4zp7qc`re3X~esy}s6xj|opyqjr\u0004\u0010\u0015S\u001a\u001a\u0002W\u001d\u0001\u0013\b\b\u000ePBdokee\"wc-jjk{s{`/6~~gsuy>|qir~V\nRFG\u000f", 0, 18, 120));
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static void m2368(byte[] bArr, long j10) {
        int i10 = (int) (j10 >> 32);
        if (bArr.length < 8) {
            bArr = new byte[8];
        }
        for (int i11 = 0; i11 < 4; i11++) {
            bArr[i11] = (byte) ((int) (j10 >> (i11 * 8)));
        }
        for (int i12 = 0; i12 < 4; i12++) {
            bArr[i12 + 4] = (byte) (i10 >> (i12 * 8));
        }
    }
}

package nts;

/* renamed from: nts.һ  reason: contains not printable characters */
public class C3610 extends C3638 {

    /* renamed from: ᐳ  reason: contains not printable characters */
    public static final int[] f492 = {1518500249, 1859775393, -1894007588, -899497514};

    /* renamed from: ϴ  reason: contains not printable characters */
    public int[] f493 = new int[20];

    /* renamed from: Е  reason: contains not printable characters */
    public boolean f494 = false;

    /* renamed from: ࡏ  reason: contains not printable characters */
    public int f495 = 0;

    /* renamed from: ખ  reason: contains not printable characters */
    public int f496 = 0;

    /* renamed from: ⴸ  reason: contains not printable characters */
    public int[] f497 = new int[80];

    /* renamed from: ⶊ  reason: contains not printable characters */
    public int f498 = 0;

    /* renamed from: ⶏ  reason: contains not printable characters */
    public byte[] f499 = new byte[64];

    public C3610() {
        this.f625 = 160;
        m478();
    }

    public Object clone() {
        C3610 r02 = new C3610();
        int i10 = 0;
        for (int i11 = 0; i11 < 20; i11++) {
            r02.f493[i11] = this.f493[i11];
        }
        r02.f498 = this.f498;
        int i12 = 0;
        while (true) {
            byte[] bArr = this.f499;
            if (i12 >= bArr.length) {
                break;
            }
            r02.f499[i12] = bArr[i12];
            i12++;
        }
        r02.f495 = this.f495;
        r02.f496 = this.f496;
        r02.f494 = this.f494;
        while (true) {
            int[] iArr = this.f497;
            if (i10 >= iArr.length) {
                return r02;
            }
            r02.f497[i10] = iArr[i10];
            i10++;
        }
    }

    /* renamed from: ϴ  reason: contains not printable characters */
    public void m478() {
        this.f496 = 0;
        this.f495 = 0;
        this.f498 = 0;
        int[] iArr = this.f493;
        iArr[0] = 1732584193;
        iArr[1] = -271733879;
        iArr[2] = -1732584194;
        iArr[3] = 271733878;
        iArr[4] = -1009589776;
        this.f494 = false;
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public void m479(byte[] bArr, int i10, int i11) {
        if (!C3596.f363) {
            throw new C3625((Throwable) null, 702, C3727.m1052("\u001b\u0001\u000bzl$=o$$21!&'3==t8\"(YO\u0007\u001eL\u0007\u0007\u0011\u0012\u0002\u0005\u0004\u0010\u001e\u001eW\u0006\u0002\u0014\u0000", 19, 19, 107));
        } else if (bArr != null) {
            while (i11 > 0) {
                int min = Math.min(i11, 64 - this.f498);
                System.arraycopy(bArr, i10, this.f499, this.f498, min);
                i10 += min;
                i11 -= min;
                int i12 = this.f498 + min;
                this.f498 = i12;
                int i13 = this.f496;
                int i14 = (min * 8) + i13;
                if (i13 < 0 && i14 >= 0) {
                    int i15 = this.f495 + 1;
                    this.f495 = i15;
                    if (i15 == 0) {
                        return;
                    }
                }
                this.f496 = i14;
                if (i12 == 64) {
                    m481();
                }
            }
        } else {
            throw new C3641(C3727.m1052("\u001b\u0001\u000bzl$=o$$21!&'3==t8\"(YO\u0007\u001eL\u0007\u0007\u0011\u0012\u0002\u0005\u0004\u0010\u001e\u001eW\u0006\u0002\u0014\u0000", 38, 4, 64));
        }
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public byte[] m480() {
        if (C3596.f363) {
            if (!this.f494) {
                int i10 = this.f498;
                if (i10 <= 55) {
                    byte[] bArr = this.f499;
                    this.f498 = i10 + 1;
                    bArr[i10] = Byte.MIN_VALUE;
                    while (true) {
                        int i11 = this.f498;
                        if (i11 >= 56) {
                            break;
                        }
                        byte[] bArr2 = this.f499;
                        this.f498 = i11 + 1;
                        bArr2[i11] = 0;
                    }
                } else {
                    byte[] bArr3 = this.f499;
                    this.f498 = i10 + 1;
                    bArr3[i10] = Byte.MIN_VALUE;
                    while (true) {
                        int i12 = this.f498;
                        if (i12 >= 64) {
                            break;
                        }
                        byte[] bArr4 = this.f499;
                        this.f498 = i12 + 1;
                        bArr4[i12] = 0;
                    }
                    m481();
                    while (true) {
                        int i13 = this.f498;
                        if (i13 >= 56) {
                            break;
                        }
                        byte[] bArr5 = this.f499;
                        this.f498 = i13 + 1;
                        bArr5[i13] = 0;
                    }
                }
                byte[] bArr6 = this.f499;
                int i14 = this.f495;
                bArr6[56] = (byte) (i14 >>> 24);
                bArr6[57] = (byte) (i14 >>> 16);
                bArr6[58] = (byte) (i14 >>> 8);
                bArr6[59] = (byte) i14;
                int i15 = this.f496;
                bArr6[60] = (byte) (i15 >>> 24);
                bArr6[61] = (byte) (i15 >>> 16);
                bArr6[62] = (byte) (i15 >>> 8);
                bArr6[63] = (byte) i15;
                m481();
                for (int i16 = 0; i16 < 64; i16++) {
                    this.f499[i16] = 0;
                }
                this.f496 = 0;
                this.f495 = 0;
                this.f494 = true;
            }
            this.f624 = new byte[20];
            for (int i17 = 0; i17 < 20; i17++) {
                this.f624[i17] = (byte) (this.f493[i17 >>> 2] >>> ((3 - (i17 & 3)) * 8));
            }
            return this.f624;
        }
        throw new C3625((Throwable) null, 702, C3727.m1052("\u001b\u0001\u000bzl$=o$$21!&'3==t8\"(YO\u0007\u001eL\u0007\u0007\u0011\u0012\u0002\u0005\u0004\u0010\u001e\u001eW\u0006\u0002\u0014\u0000", 0, 19, 91));
    }

    /* renamed from: ⶊ  reason: contains not printable characters */
    public final void m481() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = 0;
        while (true) {
            if (i16 >= 16) {
                break;
            }
            int[] iArr = this.f497;
            byte[] bArr = this.f499;
            int i17 = i16 * 4;
            int i18 = (bArr[i17] << 24) & -16777216;
            iArr[i16] = i18;
            int i19 = ((bArr[i17 + 1] << 16) & 16711680) | i18;
            iArr[i16] = i19;
            int i20 = i19 | ((bArr[i17 + 2] << 8) & 65280);
            iArr[i16] = i20;
            iArr[i16] = i20 | (bArr[i17 + 3] & 255);
            i16++;
        }
        for (i10 = 16; i10 < 80; i10++) {
            int[] iArr2 = this.f497;
            int i21 = ((iArr2[i10 - 3] ^ iArr2[i10 - 8]) ^ iArr2[i10 - 14]) ^ iArr2[i10 - 16];
            iArr2[i10] = (i21 >>> 31) | (i21 << 1);
        }
        int[] iArr3 = this.f493;
        int i22 = iArr3[0];
        int i23 = iArr3[1];
        int i24 = iArr3[2];
        int i25 = iArr3[3];
        int i26 = iArr3[4];
        int i27 = 0;
        while (true) {
            i11 = 20;
            if (i27 >= 20) {
                break;
            }
            int i28 = f492[0] + ((i22 << 5) | (i22 >>> 27)) + ((i23 & i24) | ((~i23) & i25)) + i26 + this.f497[i27];
            i27++;
            int i29 = i22;
            i22 = i28;
            i26 = i25;
            i25 = i24;
            i24 = (i23 >>> 2) | (i23 << 30);
            i23 = i29;
        }
        while (true) {
            int i30 = i22;
            i12 = i26;
            i26 = i25;
            i25 = i24;
            i13 = i23;
            i23 = i30;
            i14 = 40;
            if (i11 >= 40) {
                break;
            }
            i22 = f492[1] + ((i23 << 5) | (i23 >>> 27)) + ((i13 ^ i25) ^ i26) + i12 + this.f497[i11];
            i24 = (i13 >>> 2) | (i13 << 30);
            i11++;
        }
        while (true) {
            i15 = 60;
            if (i14 >= 60) {
                break;
            }
            int i31 = f492[2] + ((i23 << 5) | (i23 >>> 27)) + (((i25 | i26) & i13) | (i25 & i26)) + i12 + this.f497[i14];
            i14++;
            int i32 = i31;
            i12 = i26;
            i26 = i25;
            i25 = (i13 >>> 2) | (i13 << 30);
            i13 = i23;
            i23 = i32;
        }
        while (true) {
            int i33 = i12;
            i12 = i26;
            i26 = i25;
            int i34 = i13;
            i13 = i23;
            int i35 = i33;
            if (i15 < 80) {
                i23 = f492[3] + ((i13 << 5) | (i13 >>> 27)) + ((i34 ^ i26) ^ i12) + i35 + this.f497[i15];
                i25 = (i34 >>> 2) | (i34 << 30);
                i15++;
            } else {
                int[] iArr4 = this.f493;
                iArr4[0] = iArr4[0] + i13;
                iArr4[1] = iArr4[1] + i34;
                iArr4[2] = iArr4[2] + i26;
                iArr4[3] = iArr4[3] + i12;
                iArr4[4] = iArr4[4] + i35;
                this.f498 = 0;
                return;
            }
        }
    }
}

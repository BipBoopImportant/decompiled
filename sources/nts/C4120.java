package nts;

/* renamed from: nts.ₑ  reason: contains not printable characters */
public class C4120 extends C3638 {

    /* renamed from: ᐳ  reason: contains not printable characters */
    public static final int[] f3566 = {1116352408, 1899447441, -1245643825, -373957723, 961987163, 1508970993, -1841331548, -1424204075, -670586216, 310598401, 607225278, 1426881987, 1925078388, -2132889090, -1680079193, -1046744716, -459576895, -272742522, 264347078, 604807628, 770255983, 1249150122, 1555081692, 1996064986, -1740746414, -1473132947, -1341970488, -1084653625, -958395405, -710438585, 113926993, 338241895, 666307205, 773529912, 1294757372, 1396182291, 1695183700, 1986661051, -2117940946, -1838011259, -1564481375, -1474664885, -1035236496, -949202525, -778901479, -694614492, -200395387, 275423344, 430227734, 506948616, 659060556, 883997877, 958139571, 1322822218, 1537002063, 1747873779, 1955562222, 2024104815, -2067236844, -1933114872, -1866530822, -1538233109, -1090935817, -965641998};

    /* renamed from: ϴ  reason: contains not printable characters */
    public int[] f3567 = new int[8];

    /* renamed from: Е  reason: contains not printable characters */
    public boolean f3568 = false;

    /* renamed from: ࡏ  reason: contains not printable characters */
    public int f3569 = 0;

    /* renamed from: ખ  reason: contains not printable characters */
    public int f3570 = 0;

    /* renamed from: ⴸ  reason: contains not printable characters */
    public boolean f3571 = false;

    /* renamed from: ⶊ  reason: contains not printable characters */
    public int f3572 = 0;

    /* renamed from: ⶏ  reason: contains not printable characters */
    public byte[] f3573 = new byte[64];

    public C4120() {
        this.f625 = 256;
        m3303();
    }

    public Object clone() {
        C4120 r02 = new C4120();
        m3306(r02);
        return r02;
    }

    /* renamed from: ϴ  reason: contains not printable characters */
    public void m3303() {
        this.f3570 = 0;
        this.f3569 = 0;
        this.f3572 = 0;
        int[] iArr = this.f3567;
        iArr[0] = 1779033703;
        iArr[1] = -1150833019;
        iArr[2] = 1013904242;
        iArr[3] = -1521486534;
        iArr[4] = 1359893119;
        iArr[5] = -1694144372;
        iArr[6] = 528734635;
        iArr[7] = 1541459225;
        this.f3568 = false;
        this.f3571 = false;
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public void m3304(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            while (i11 > 0 && !this.f3571) {
                i11--;
                byte[] bArr2 = this.f3573;
                int i12 = this.f3572;
                int i13 = i12 + 1;
                this.f3572 = i13;
                int i14 = i10 + 1;
                bArr2[i12] = bArr[i10];
                int i15 = this.f3570 + 8;
                this.f3570 = i15;
                if (i15 == 0) {
                    int i16 = this.f3569 + 1;
                    this.f3569 = i16;
                    if (i16 == 0) {
                        this.f3571 = true;
                    }
                }
                if (i13 == 64) {
                    m3308();
                }
                i10 = i14;
            }
            return;
        }
        throw new C3641(C3727.m1052("-)?+", 0, 4, 77));
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public final int m3305(int i10, int i11) {
        return (i10 << (32 - i11)) | (i10 >>> i11);
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public byte[] m3307() {
        int i10 = 0;
        if (!this.f3568) {
            int i11 = this.f3572;
            if (i11 <= 55) {
                byte[] bArr = this.f3573;
                this.f3572 = i11 + 1;
                bArr[i11] = Byte.MIN_VALUE;
                while (true) {
                    int i12 = this.f3572;
                    if (i12 >= 56) {
                        break;
                    }
                    byte[] bArr2 = this.f3573;
                    this.f3572 = i12 + 1;
                    bArr2[i12] = 0;
                }
            } else {
                byte[] bArr3 = this.f3573;
                this.f3572 = i11 + 1;
                bArr3[i11] = Byte.MIN_VALUE;
                while (true) {
                    int i13 = this.f3572;
                    if (i13 >= 64) {
                        break;
                    }
                    byte[] bArr4 = this.f3573;
                    this.f3572 = i13 + 1;
                    bArr4[i13] = 0;
                }
                m3308();
                while (true) {
                    int i14 = this.f3572;
                    if (i14 >= 56) {
                        break;
                    }
                    byte[] bArr5 = this.f3573;
                    this.f3572 = i14 + 1;
                    bArr5[i14] = 0;
                }
            }
            byte[] bArr6 = this.f3573;
            int i15 = this.f3569;
            bArr6[56] = (byte) (i15 >>> 24);
            bArr6[57] = (byte) (i15 >>> 16);
            bArr6[58] = (byte) (i15 >>> 8);
            bArr6[59] = (byte) i15;
            int i16 = this.f3570;
            bArr6[60] = (byte) (i16 >>> 24);
            bArr6[61] = (byte) (i16 >>> 16);
            bArr6[62] = (byte) (i16 >>> 8);
            bArr6[63] = (byte) i16;
            m3308();
            int i17 = 0;
            while (true) {
                byte[] bArr7 = this.f3573;
                if (i17 >= bArr7.length) {
                    break;
                }
                bArr7[i17] = 0;
                i17++;
            }
            this.f3570 = 0;
            this.f3569 = 0;
            this.f3568 = true;
        }
        this.f624 = new byte[(this.f625 / 8)];
        while (true) {
            byte[] bArr8 = this.f624;
            if (i10 >= bArr8.length) {
                return bArr8;
            }
            bArr8[i10] = (byte) (this.f3567[i10 >>> 2] >>> (((3 - i10) & 3) << 3));
            i10++;
        }
    }

    /* renamed from: ⶊ  reason: contains not printable characters */
    public final void m3308() {
        int i10;
        int[] iArr = new int[64];
        int i11 = 0;
        while (true) {
            if (i11 >= 16) {
                break;
            }
            byte[] bArr = this.f3573;
            int i12 = i11 * 4;
            int i13 = (bArr[i12] << 24) & -16777216;
            iArr[i11] = i13;
            int i14 = ((bArr[i12 + 1] << 16) & 16711680) | i13;
            iArr[i11] = i14;
            int i15 = i14 | ((bArr[i12 + 2] << 8) & 65280);
            iArr[i11] = i15;
            iArr[i11] = i15 | (bArr[i12 + 3] & 255);
            i11++;
        }
        for (i10 = 16; i10 < 64; i10++) {
            int i16 = i10 - 15;
            int r42 = (m3305(iArr[i16], 7) ^ m3305(iArr[i16], 18)) ^ (iArr[i16] >>> 3);
            int i17 = i10 - 2;
            iArr[i10] = iArr[i10 - 16] + r42 + iArr[i10 - 7] + ((iArr[i17] >>> 10) ^ (m3305(iArr[i17], 17) ^ m3305(iArr[i17], 19)));
        }
        int[] iArr2 = this.f3567;
        int i18 = iArr2[0];
        int i19 = iArr2[1];
        int i20 = iArr2[2];
        int i21 = iArr2[3];
        int i22 = iArr2[4];
        int i23 = iArr2[5];
        int i24 = 6;
        int i25 = iArr2[6];
        int i26 = iArr2[7];
        int i27 = 0;
        for (int i28 = 64; i27 < i28; i28 = 64) {
            int r12 = ((m3305(i18, 2) ^ m3305(i18, 13)) ^ m3305(i18, 22)) + (((i18 & i19) ^ (i18 & i20)) ^ (i19 & i20));
            int r52 = i26 + ((m3305(i22, i24) ^ m3305(i22, 11)) ^ m3305(i22, 25)) + (((~i22) & i25) ^ (i22 & i23)) + f3566[i27] + iArr[i27];
            int i29 = i21 + r52;
            int i30 = r12 + r52;
            i27++;
            i21 = i20;
            i26 = i25;
            i24 = 6;
            i20 = i19;
            i25 = i23;
            i19 = i18;
            i23 = i22;
            i18 = i30;
            i22 = i29;
        }
        int[] iArr3 = this.f3567;
        iArr3[0] = iArr3[0] + i18;
        iArr3[1] = iArr3[1] + i19;
        iArr3[2] = iArr3[2] + i20;
        iArr3[3] = iArr3[3] + i21;
        iArr3[4] = iArr3[4] + i22;
        iArr3[5] = iArr3[5] + i23;
        iArr3[6] = iArr3[6] + i25;
        iArr3[7] = iArr3[7] + i26;
        this.f3572 = 0;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m3306(C4120 r52) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int[] iArr = this.f3567;
            if (i11 >= iArr.length) {
                break;
            }
            r52.f3567[i11] = iArr[i11];
            i11++;
        }
        r52.f3572 = this.f3572;
        while (true) {
            byte[] bArr = this.f3573;
            if (i10 < bArr.length) {
                r52.f3573[i10] = bArr[i10];
                i10++;
            } else {
                r52.f3569 = this.f3569;
                r52.f3570 = this.f3570;
                r52.f3568 = this.f3568;
                r52.f3571 = this.f3571;
                return;
            }
        }
    }
}

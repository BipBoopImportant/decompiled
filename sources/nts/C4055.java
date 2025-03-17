package nts;

/* renamed from: nts.ᵓ  reason: contains not printable characters */
public class C4055 {

    /* renamed from: ϴ  reason: contains not printable characters */
    public int f2960 = 0;

    /* renamed from: ગ  reason: contains not printable characters */
    public int[] f2961 = new int[4];

    /* renamed from: ഇ  reason: contains not printable characters */
    public int[] f2962 = new int[4];

    /* renamed from: ᐳ  reason: contains not printable characters */
    public int[] f2963 = new int[5];

    /* renamed from: ⶊ  reason: contains not printable characters */
    public byte[] f2964 = new byte[16];

    /* renamed from: ⶏ  reason: contains not printable characters */
    public byte[] f2965 = new byte[0];

    public C4055() {
        m2828();
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m2828() {
        this.f2960 = 0;
        for (int i10 = 0; i10 < 16; i10++) {
            this.f2964[i10] = 0;
        }
        for (int i11 = 0; i11 < 4; i11++) {
            int[] iArr = this.f2962;
            this.f2961[i11] = 0;
            iArr[i11] = 0;
        }
        for (int i12 = 0; i12 < 5; i12++) {
            this.f2963[i12] = 0;
        }
        this.f2965 = new byte[0];
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public void m2829(byte[] bArr, int i10, int i11) {
        if (i11 != 0) {
            int i12 = this.f2960;
            if (i12 > 0) {
                int i13 = 16 - i12;
                if (i11 >= i13) {
                    System.arraycopy(bArr, i10, this.f2964, i12, i13);
                    m2830(this.f2964, 16, 0, 1, this);
                    i10 += i13;
                    i11 -= i13;
                } else {
                    System.arraycopy(bArr, i10, this.f2964, i12, i11);
                    this.f2960 += i11;
                    return;
                }
            }
            int i14 = i11 % 16;
            int i15 = i11 - i14;
            if (i15 >= 16) {
                m2830(bArr, i15, i10, 1, this);
                i10 += i15;
            }
            if (i14 > 0) {
                System.arraycopy(bArr, i10, this.f2964, 0, i14);
            }
            this.f2960 = i14;
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public final void m2831(byte[] bArr, int i10, int i11, int[] iArr) {
        int i12 = i11 + i10;
        int i13 = 0;
        while (i10 < i12) {
            byte b10 = ((bArr[i10 + 1] << 8) & 65280) | (bArr[i10] & 255);
            int i14 = i10 + 3;
            i10 += 4;
            iArr[i13] = b10 | ((bArr[i10 + 2] << 16) & 16711680) | ((bArr[i14] << 24) & -16777216);
            i13++;
        }
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public final void m2830(byte[] bArr, int i10, int i11, int i12, C4055 r40) {
        C4055 r02 = r40;
        int[] iArr = r02.f2961;
        int i13 = iArr[1];
        int i14 = i13 + (i13 >>> 2);
        int i15 = iArr[2];
        int i16 = i15 + (i15 >>> 2);
        int i17 = iArr[3];
        int i18 = i17 + (i17 >>> 2);
        int i19 = i10;
        int i20 = i11;
        while (i19 >= 16) {
            byte b10 = ((bArr[i20 + 1] << 8) & 65280) | (bArr[i20] & 255) | ((bArr[i20 + 2] << 16) & 16711680) | ((bArr[i20 + 3] << 24) & -16777216);
            int[] iArr2 = r02.f2963;
            int i21 = i16;
            int i22 = i14;
            long j10 = (((long) iArr2[0]) & 4294967295L) + (((long) b10) & 4294967295L);
            int i23 = (int) j10;
            iArr2[0] = i23;
            long j11 = (((long) iArr2[1]) & 4294967295L) + (j10 >>> 32) + (((long) (((bArr[i20 + 5] << 8) & 65280) | (bArr[i20 + 4] & 255) | ((bArr[i20 + 6] << 16) & 16711680) | ((bArr[i20 + 7] << 24) & -16777216))) & 4294967295L);
            int i24 = (int) j11;
            iArr2[1] = i24;
            long j12 = (((long) iArr2[2]) & 4294967295L) + (j11 >>> 32) + (((long) (((bArr[i20 + 9] << 8) & 65280) | (bArr[i20 + 8] & 255) | ((bArr[i20 + 10] << 16) & 16711680) | ((bArr[i20 + 11] << 24) & -16777216))) & 4294967295L);
            int i25 = (int) j12;
            iArr2[2] = i25;
            long j13 = (((long) iArr2[3]) & 4294967295L) + (j12 >>> 32) + (((long) (((bArr[i20 + 15] << 24) & -16777216) | (bArr[i20 + 12] & 255) | (65280 & (bArr[i20 + 13] << 8)) | ((bArr[i20 + 14] << 16) & 16711680))) & 4294967295L);
            int i26 = (int) j13;
            iArr2[3] = i26;
            int i27 = ((int) (j13 >>> 32)) + i12 + iArr2[4];
            iArr2[4] = i27;
            int[] iArr3 = r02.f2961;
            int i28 = iArr3[0];
            int i29 = i28;
            int i30 = i19;
            long j14 = (long) i18;
            int i31 = i21;
            int[] iArr4 = iArr2;
            long j15 = (long) i31;
            int i32 = i31;
            long j16 = j15;
            int i33 = i22;
            long j17 = (long) i33;
            int i34 = i33;
            int i35 = iArr3[1];
            long j18 = ((((long) i23) & 4294967295L) * ((long) i28)) + ((((long) i24) & 4294967295L) * j14) + ((((long) i25) & 4294967295L) * j15) + ((((long) i26) & 4294967295L) * j17);
            int i36 = i29;
            int i37 = i18;
            int i38 = i36;
            int i39 = i23;
            int i40 = i24;
            long j19 = ((((long) i23) & 4294967295L) * ((long) i35)) + ((((long) i24) & 4294967295L) * ((long) i38)) + ((((long) i25) & 4294967295L) * j14) + ((((long) i26) & 4294967295L) * j16);
            int i41 = i27;
            int i42 = i39;
            int i43 = iArr3[2];
            int i44 = i20 + 16;
            int i45 = i40;
            int i46 = i44;
            int i47 = i41 * i38;
            iArr4[4] = i47;
            long j20 = j18;
            int i48 = (int) j20;
            iArr4[0] = i48;
            long j21 = j19 + (((long) i41) * j17) + (j20 >>> 32);
            int i49 = (int) j21;
            iArr4[1] = i49;
            long j22 = ((((long) i42) & 4294967295L) * ((long) i43)) + ((((long) i45) & 4294967295L) * ((long) i35)) + ((((long) i25) & 4294967295L) * ((long) i38)) + ((((long) i26) & 4294967295L) * j14) + (((long) i41) * j16) + (j21 >>> 32);
            int i50 = (int) j22;
            iArr4[2] = i50;
            long j23 = ((((long) i42) & 4294967295L) * ((long) iArr3[3])) + ((((long) i45) & 4294967295L) * ((long) i43)) + ((((long) i25) & 4294967295L) * ((long) i35)) + ((((long) i26) & 4294967295L) * ((long) i38)) + (((long) i41) * j14) + (j22 >>> 32);
            int i51 = (int) j23;
            iArr4[3] = i51;
            int i52 = i47 + ((int) (j23 >>> 32));
            iArr4[4] = i52;
            int i53 = (i52 >>> 2) + (i52 & -4);
            int i54 = i52 & 3;
            iArr4[4] = i54;
            int i55 = i48 + i53;
            iArr4[0] = i55;
            int i56 = (i55 ^ ((i55 ^ i53) | ((i55 - i53) ^ i53))) >>> 31;
            int i57 = i49 + i56;
            iArr4[1] = i57;
            int i58 = (((i56 ^ (i57 - i56)) | (i57 ^ i56)) ^ i57) >>> 31;
            int i59 = i50 + i58;
            iArr4[2] = i59;
            int i60 = (((i58 ^ (i59 - i58)) | (i59 ^ i58)) ^ i59) >>> 31;
            int i61 = i51 + i60;
            iArr4[3] = i61;
            iArr4[4] = i54 + ((((i60 ^ (i61 - i60)) | (i61 ^ i60)) ^ i61) >>> 31);
            i19 = i30 - 16;
            r02 = r40;
            i18 = i37;
            i16 = i32;
            i20 = i46;
            i14 = i34;
        }
    }
}

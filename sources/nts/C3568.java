package nts;

/* renamed from: nts.β  reason: contains not printable characters */
public class C3568 extends C3638 {

    /* renamed from: ϴ  reason: contains not printable characters */
    public byte[] f148 = new byte[64];

    /* renamed from: ࡏ  reason: contains not printable characters */
    public long f149 = 0;

    /* renamed from: ᐳ  reason: contains not printable characters */
    public int[] f150 = new int[4];

    /* renamed from: ⶊ  reason: contains not printable characters */
    public int[] f151 = new int[16];

    /* renamed from: ⶏ  reason: contains not printable characters */
    public int f152 = 0;

    public C3568() {
        this.f625 = 128;
        m214();
    }

    /* renamed from: ϴ  reason: contains not printable characters */
    public void m214() {
        this.f152 = 0;
        this.f149 = (long) 0;
        int[] iArr = this.f150;
        iArr[0] = 1732584193;
        iArr[1] = -271733879;
        iArr[2] = -1732584194;
        iArr[3] = 271733878;
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public void m215(byte[] bArr, int i10, int i11) {
        while (i11 > 0) {
            int min = Math.min(i11, 64 - this.f152);
            System.arraycopy(bArr, i10, this.f148, this.f152, min);
            i11 -= min;
            i10 += min;
            this.f149 += (long) min;
            int i12 = this.f152 + min;
            this.f152 = i12;
            if (i12 == 64) {
                m217();
            }
        }
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public byte[] m216() {
        byte[] bArr = this.f148;
        int i10 = this.f152;
        int i11 = i10 + 1;
        this.f152 = i11;
        bArr[i10] = Byte.MIN_VALUE;
        if (i11 > 56) {
            while (true) {
                int i12 = this.f152;
                if (i12 >= 64) {
                    break;
                }
                this.f148[i12] = 0;
                this.f152 = i12 + 1;
            }
            m217();
        }
        while (true) {
            int i13 = this.f152;
            if (i13 >= 56) {
                break;
            }
            this.f148[i13] = 0;
            this.f152 = i13 + 1;
        }
        this.f149 *= 8;
        while (true) {
            int i14 = this.f152;
            if (i14 >= 64) {
                break;
            }
            byte[] bArr2 = this.f148;
            int i15 = i14 + 1;
            this.f152 = i15;
            long j10 = this.f149;
            bArr2[i14] = (byte) ((int) (255 & j10));
            int i16 = i14 + 2;
            this.f152 = i16;
            bArr2[i15] = (byte) ((int) (j10 >>> 8));
            int i17 = i14 + 3;
            this.f152 = i17;
            bArr2[i16] = (byte) ((int) (j10 >>> 16));
            this.f152 = i14 + 4;
            bArr2[i17] = (byte) ((int) (j10 >>> 24));
            this.f149 = j10 >>> 32;
        }
        m217();
        this.f624 = new byte[16];
        int i18 = 0;
        for (int i19 = 0; i19 < 4; i19++) {
            byte[] bArr3 = this.f624;
            int[] iArr = this.f150;
            int i20 = iArr[i19];
            bArr3[i18] = (byte) (i20 & 255);
            bArr3[i18 + 1] = (byte) (i20 >>> 8);
            int i21 = i18 + 3;
            bArr3[i18 + 2] = (byte) (i20 >>> 16);
            i18 += 4;
            bArr3[i21] = (byte) (i20 >>> 24);
            iArr[i19] = 0;
        }
        return this.f624;
    }

    /* renamed from: ⶊ  reason: contains not printable characters */
    public final void m217() {
        int[] iArr = this.f150;
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int i14 = 0;
        for (int i15 = 0; i15 < 16; i15++) {
            int[] iArr2 = this.f151;
            byte[] bArr = this.f148;
            byte b10 = (bArr[i14] & 255) | ((bArr[i14 + 1] << 8) & 65280);
            int i16 = i14 + 3;
            i14 += 4;
            iArr2[i15] = b10 | ((bArr[i14 + 2] << 16) & 16711680) | ((bArr[i16] << 24) & -16777216);
        }
        int i17 = (i11 & i12) | ((~i11) & i13);
        int[] iArr3 = this.f151;
        int i18 = iArr3[0];
        int i19 = i10 + i17 + i18;
        int i20 = (i19 >>> 29) | (i19 << 3);
        int i21 = (i20 & i11) | ((~i20) & i12);
        int i22 = iArr3[1];
        int i23 = i13 + i21 + i22;
        int i24 = (i23 >>> 25) | (i23 << 7);
        int i25 = (i24 & i20) | ((~i24) & i11);
        int i26 = iArr3[2];
        int i27 = i12 + i25 + i26;
        int i28 = (i27 >>> 21) | (i27 << 11);
        int i29 = iArr3[3];
        int i30 = i11 + ((i28 & i24) | ((~i28) & i20)) + i29;
        int i31 = (i30 >>> 13) | (i30 << 19);
        int i32 = iArr3[4];
        int i33 = i20 + (((~i31) & i24) | (i31 & i28)) + i32;
        int i34 = (i33 >>> 29) | (i33 << 3);
        int i35 = (i34 & i31) | ((~i34) & i28);
        int i36 = iArr3[5];
        int i37 = i24 + i35 + i36;
        int i38 = (i37 >>> 25) | (i37 << 7);
        int i39 = iArr3[6];
        int i40 = i28 + (((~i38) & i31) | (i38 & i34)) + i39;
        int i41 = (i40 << 11) | (i40 >>> 21);
        int i42 = iArr3[7];
        int i43 = i31 + (((~i41) & i34) | (i41 & i38)) + i42;
        int i44 = (i43 << 19) | (i43 >>> 13);
        int i45 = iArr3[8];
        int i46 = i34 + ((i44 & i41) | ((~i44) & i38)) + i45;
        int i47 = (i46 >>> 29) | (i46 << 3);
        int i48 = (i47 & i44) | ((~i47) & i41);
        int i49 = iArr3[9];
        int i50 = i38 + i48 + i49;
        int i51 = (i50 >>> 25) | (i50 << 7);
        int i52 = iArr3[10];
        int i53 = i41 + (((~i51) & i44) | (i51 & i47)) + i52;
        int i54 = (i53 << 11) | (i53 >>> 21);
        int i55 = i42;
        int i56 = (i54 & i51) | ((~i54) & i47);
        int i57 = iArr3[11];
        int i58 = i44 + i56 + i57;
        int i59 = (i58 >>> 13) | (i58 << 19);
        int i60 = i57;
        int i61 = (i59 & i54) | ((~i59) & i51);
        int i62 = iArr3[12];
        int i63 = i47 + i61 + i62;
        int i64 = (i63 >>> 29) | (i63 << 3);
        int i65 = i52;
        int i66 = iArr3[13];
        int i67 = i51 + ((i64 & i59) | ((~i64) & i54)) + i66;
        int i68 = (i67 >>> 25) | (i67 << 7);
        int i69 = (i68 & i64) | ((~i68) & i59);
        int i70 = iArr3[14];
        int i71 = i54 + i69 + i70;
        int i72 = (i71 >>> 21) | (i71 << 11);
        int i73 = i72 & i68;
        int i74 = i70;
        int i75 = iArr3[15];
        int i76 = i59 + (((~i72) & i64) | i73) + i75;
        int i77 = (i76 >>> 13) | (i76 << 19);
        int i78 = i64 + (((i72 | i68) & i77) | i73) + i18 + 1518500249;
        int i79 = (i78 >>> 29) | (i78 << 3);
        int i80 = i68 + (((i77 | i72) & i79) | (i77 & i72)) + i32 + 1518500249;
        int i81 = (i80 >>> 27) | (i80 << 5);
        int i82 = i72 + (((i79 | i77) & i81) | (i79 & i77)) + i45 + 1518500249;
        int i83 = (i82 >>> 23) | (i82 << 9);
        int i84 = i77 + (((i81 | i79) & i83) | (i81 & i79)) + i62 + 1518500249;
        int i85 = (i84 >>> 19) | (i84 << 13);
        int i86 = i79 + (((i83 | i81) & i85) | (i83 & i81)) + i22 + 1518500249;
        int i87 = (i86 >>> 29) | (i86 << 3);
        int i88 = i81 + (((i85 | i83) & i87) | (i85 & i83)) + i36 + 1518500249;
        int i89 = (i88 >>> 27) | (i88 << 5);
        int i90 = i83 + (((i87 | i85) & i89) | (i87 & i85)) + i49 + 1518500249;
        int i91 = (i90 >>> 23) | (i90 << 9);
        int i92 = i85 + (((i89 | i87) & i91) | (i89 & i87)) + i66 + 1518500249;
        int i93 = (i92 >>> 19) | (i92 << 13);
        int i94 = i87 + (((i91 | i89) & i93) | (i91 & i89)) + i26 + 1518500249;
        int i95 = (i94 >>> 29) | (i94 << 3);
        int i96 = i89 + (((i93 | i91) & i95) | (i93 & i91)) + i39 + 1518500249;
        int i97 = (i96 >>> 27) | (i96 << 5);
        int i98 = i91 + (((i95 | i93) & i97) | (i95 & i93)) + i65 + 1518500249;
        int i99 = (i98 >>> 23) | (i98 << 9);
        int i100 = i93 + (((i97 | i95) & i99) | (i97 & i95)) + i74 + 1518500249;
        int i101 = (i100 >>> 19) | (i100 << 13);
        int i102 = i95 + (((i99 | i97) & i101) | (i99 & i97)) + i29 + 1518500249;
        int i103 = (i102 >>> 29) | (i102 << 3);
        int i104 = i97 + (((i101 | i99) & i103) | (i101 & i99)) + i55 + 1518500249;
        int i105 = (i104 >>> 27) | (i104 << 5);
        int i106 = i99 + (((i103 | i101) & i105) | (i103 & i101)) + i60 + 1518500249;
        int i107 = (i106 >>> 23) | (i106 << 9);
        int i108 = i101 + (((i105 | i103) & i107) | (i105 & i103)) + i75 + 1518500249;
        int i109 = (i108 >>> 19) | (i108 << 13);
        int i110 = i103 + ((i109 ^ i107) ^ i105) + i18 + 1859775393;
        int i111 = (i110 >>> 29) | (i110 << 3);
        int i112 = i105 + ((i111 ^ i109) ^ i107) + i45 + 1859775393;
        int i113 = (i112 >>> 23) | (i112 << 9);
        int i114 = i107 + ((i113 ^ i111) ^ i109) + i32 + 1859775393;
        int i115 = (i114 >>> 21) | (i114 << 11);
        int i116 = i109 + ((i115 ^ i113) ^ i111) + i62 + 1859775393;
        int i117 = (i116 >>> 17) | (i116 << 15);
        int i118 = i111 + ((i117 ^ i115) ^ i113) + i26 + 1859775393;
        int i119 = (i118 >>> 29) | (i118 << 3);
        int i120 = i113 + ((i119 ^ i117) ^ i115) + i65 + 1859775393;
        int i121 = (i120 >>> 23) | (i120 << 9);
        int i122 = i115 + ((i121 ^ i119) ^ i117) + i39 + 1859775393;
        int i123 = (i122 >>> 21) | (i122 << 11);
        int i124 = i117 + ((i123 ^ i121) ^ i119) + i74 + 1859775393;
        int i125 = (i124 >>> 17) | (i124 << 15);
        int i126 = i119 + ((i125 ^ i123) ^ i121) + i22 + 1859775393;
        int i127 = (i126 >>> 29) | (i126 << 3);
        int i128 = i121 + ((i127 ^ i125) ^ i123) + i49 + 1859775393;
        int i129 = (i128 >>> 23) | (i128 << 9);
        int i130 = i123 + ((i129 ^ i127) ^ i125) + i36 + 1859775393;
        int i131 = (i130 >>> 21) | (i130 << 11);
        int i132 = i125 + ((i131 ^ i129) ^ i127) + i66 + 1859775393;
        int i133 = (i132 >>> 17) | (i132 << 15);
        int i134 = i127 + ((i133 ^ i131) ^ i129) + i29 + 1859775393;
        int i135 = (i134 >>> 29) | (i134 << 3);
        int i136 = i129 + ((i135 ^ i133) ^ i131) + i60 + 1859775393;
        int i137 = (i136 >>> 23) | (i136 << 9);
        int i138 = i131 + ((i137 ^ i135) ^ i133) + i55 + 1859775393;
        int i139 = (i138 >>> 21) | (i138 << 11);
        int i140 = i133 + ((i139 ^ i137) ^ i135) + i75 + 1859775393;
        int[] iArr4 = this.f150;
        iArr4[0] = iArr4[0] + i135;
        iArr4[1] = iArr4[1] + ((i140 >>> 17) | (i140 << 15));
        iArr4[2] = iArr4[2] + i139;
        iArr4[3] = iArr4[3] + i137;
        this.f152 = 0;
    }
}

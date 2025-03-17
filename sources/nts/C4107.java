package nts;

/* renamed from: nts.ᾂ  reason: contains not printable characters */
public class C4107 extends C3638 {

    /* renamed from: ϴ  reason: contains not printable characters */
    public int[] f3527 = new int[2];

    /* renamed from: ᐳ  reason: contains not printable characters */
    public int[] f3528 = new int[4];

    /* renamed from: ⶊ  reason: contains not printable characters */
    public byte[] f3529 = new byte[64];

    public C4107() {
        this.f625 = 128;
        m3258();
    }

    public Object clone() {
        C4107 r02 = new C4107();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int[] iArr = this.f3528;
            if (i11 >= iArr.length) {
                break;
            }
            r02.f3528[i11] = iArr[i11];
            i11++;
        }
        int i12 = 0;
        while (true) {
            int[] iArr2 = this.f3527;
            if (i12 >= iArr2.length) {
                break;
            }
            r02.f3527[i12] = iArr2[i12];
            i12++;
        }
        while (true) {
            byte[] bArr = this.f3529;
            if (i10 >= bArr.length) {
                return r02;
            }
            r02.f3529[i10] = bArr[i10];
            i10++;
        }
    }

    /* renamed from: ϴ  reason: contains not printable characters */
    public void m3258() {
        int[] iArr = this.f3527;
        iArr[1] = 0;
        iArr[0] = 0;
        int[] iArr2 = this.f3528;
        iArr2[0] = 1732584193;
        iArr2[1] = -271733879;
        iArr2[2] = -1732584194;
        iArr2[3] = 271733878;
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f3529;
            if (i10 < bArr.length) {
                bArr[i10] = 0;
                i10++;
            } else {
                return;
            }
        }
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public void m3259(byte[] bArr, int i10, int i11) {
        int i12 = 0;
        if (C3596.f363) {
            int[] iArr = this.f3527;
            int i13 = iArr[0];
            int i14 = (i13 >>> 3) & 63;
            int i15 = i11 << 3;
            int i16 = i13 + i15;
            iArr[0] = i16;
            if ((((long) i16) & 4294967295L) < ((long) i15)) {
                iArr[1] = iArr[1] + 1;
            }
            iArr[1] = iArr[1] + (i11 >>> 29);
            int i17 = 64 - i14;
            if (i11 >= i17) {
                System.arraycopy(bArr, i10, this.f3529, i14, i17);
                m3261(this.f3529);
                byte[] bArr2 = new byte[64];
                while (i17 + 63 < i11) {
                    System.arraycopy(bArr, i17 + i10, bArr2, 0, 64);
                    m3261(bArr2);
                    i17 += 64;
                }
                i14 = 0;
                i12 = i17;
            }
            System.arraycopy(bArr, i10 + i12, this.f3529, i14, i11 - i12);
            return;
        }
        throw new C3625((Throwable) null, 702, C3727.m1052("\u0001\t{o!:j/!54\"# 6&8sDL>*d/jdpqgfesc}6", 0, 18, 94));
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public final byte[] m3260(int[] iArr) {
        int length = iArr.length * 4;
        byte[] bArr = new byte[length];
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = iArr[i11];
            bArr[i10] = (byte) i12;
            bArr[i10 + 1] = (byte) (i12 >>> 8);
            int i13 = i10 + 3;
            bArr[i10 + 2] = (byte) (i12 >>> 16);
            i10 += 4;
            bArr[i13] = (byte) (i12 >>> 24);
            i11++;
        }
        return bArr;
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public byte[] m3262() {
        if (C3596.f363) {
            byte[] r02 = m3260(this.f3527);
            int i10 = (this.f3527[0] >>> 3) & 63;
            int i11 = i10 < 56 ? 56 - i10 : 120 - i10;
            byte[] bArr = new byte[i11];
            bArr[0] = Byte.MIN_VALUE;
            for (int i12 = 1; i12 < i11; i12++) {
                bArr[i12] = 0;
            }
            m3259(bArr, 0, i11);
            m3259(r02, 0, r02.length);
            byte[] r03 = m3260(this.f3528);
            this.f624 = r03;
            return r03;
        }
        throw new C3625((Throwable) null, 702, C3727.m1052("\u0001\t{o!:j/!54\"# 6&8sDL>*d/jdpqgfesc}6", 18, 18, 9));
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public final void m3261(byte[] bArr) {
        byte[] bArr2 = bArr;
        int[] iArr = this.f3528;
        int i10 = iArr[0];
        int i11 = iArr[1];
        int i12 = iArr[2];
        int i13 = iArr[3];
        int length = bArr2.length / 4;
        int[] iArr2 = new int[length];
        int i14 = 0;
        for (int i15 = 0; i15 < length; i15++) {
            byte b10 = (bArr2[i14] & 255) | ((bArr2[i14 + 1] << 8) & 65280);
            int i16 = i14 + 3;
            i14 += 4;
            iArr2[i15] = b10 | ((bArr2[i14 + 2] << 16) & 16711680) | ((bArr2[i16] << 24) & -16777216);
        }
        int i17 = (i11 & i12) | ((~i11) & i13);
        int i18 = iArr2[0];
        int i19 = i10 + ((i17 + i18) - 680876936);
        int i20 = ((i19 << 7) | (i19 >>> 25)) + i11;
        int i21 = (i20 & i11) | ((~i20) & i12);
        int i22 = iArr2[1];
        int i23 = i13 + ((i21 + i22) - 389564586);
        int i24 = ((i23 >>> 20) | (i23 << 12)) + i20;
        int i25 = (i24 & i20) | ((~i24) & i11);
        int i26 = iArr2[2];
        int i27 = i12 + i25 + i26 + 606105819;
        int i28 = ((i27 << 17) | (i27 >>> 15)) + i24;
        int i29 = iArr2[3];
        int i30 = i11 + ((((i28 & i24) | ((~i28) & i20)) + i29) - 1044525330);
        int i31 = ((i30 >>> 10) | (i30 << 22)) + i28;
        int i32 = iArr2[4];
        int i33 = i20 + (((((~i31) & i24) | (i31 & i28)) + i32) - 176418897);
        int i34 = ((i33 >>> 25) | (i33 << 7)) + i31;
        int i35 = (i34 & i31) | ((~i34) & i28);
        int i36 = iArr2[5];
        int i37 = i24 + i35 + i36 + 1200080426;
        int i38 = ((i37 >>> 20) | (i37 << 12)) + i34;
        int i39 = iArr2[6];
        int i40 = i28 + (((((~i38) & i31) | (i38 & i34)) + i39) - 1473231341);
        int i41 = ((i40 >>> 15) | (i40 << 17)) + i38;
        int i42 = iArr2[7];
        int i43 = i31 + (((((~i41) & i34) | (i41 & i38)) + i42) - 45705983);
        int i44 = ((i43 << 22) | (i43 >>> 10)) + i41;
        int i45 = (i44 & i41) | ((~i44) & i38);
        int i46 = iArr2[8];
        int i47 = i34 + i45 + i46 + 1770035416;
        int i48 = ((i47 >>> 25) | (i47 << 7)) + i44;
        int i49 = iArr2[9];
        int i50 = i38 + ((((i48 & i44) | ((~i48) & i41)) + i49) - 1958414417);
        int i51 = ((i50 >>> 20) | (i50 << 12)) + i48;
        int i52 = iArr2[10];
        int i53 = i41 + ((((i51 & i48) | ((~i51) & i44)) + i52) - 42063);
        int i54 = ((i53 >>> 15) | (i53 << 17)) + i51;
        int i55 = iArr2[11];
        int i56 = i44 + ((((i54 & i51) | ((~i54) & i48)) + i55) - 1990404162);
        int i57 = ((i56 >>> 10) | (i56 << 22)) + i54;
        int i58 = iArr2[12];
        int i59 = i48 + ((i57 & i54) | ((~i57) & i51)) + i58 + 1804603682;
        int i60 = ((i59 >>> 25) | (i59 << 7)) + i57;
        int i61 = (i60 & i57) | ((~i60) & i54);
        int i62 = iArr2[13];
        int i63 = i51 + ((i61 + i62) - 40341101);
        int i64 = ((i63 >>> 20) | (i63 << 12)) + i60;
        int i65 = ~i64;
        int i66 = iArr2[14];
        int i67 = i54 + ((((i64 & i60) | (i65 & i57)) + i66) - 1502002290);
        int i68 = ((i67 >>> 15) | (i67 << 17)) + i64;
        int i69 = i42;
        int i70 = ~i68;
        int i71 = iArr2[15];
        int i72 = i57 + ((i68 & i64) | (i70 & i60)) + i71 + 1236535329;
        int i73 = ((i72 >>> 10) | (i72 << 22)) + i68;
        int i74 = i60 + ((((i65 & i68) | (i73 & i64)) + i22) - 165796510);
        int i75 = ((i74 << 5) | (i74 >>> 27)) + i73;
        int i76 = i64 + ((((i75 & i68) | (i70 & i73)) + i39) - 1069501632);
        int i77 = ((i76 << 9) | (i76 >>> 23)) + i75;
        int i78 = i68 + ((i77 & i73) | ((~i73) & i75)) + i55 + 643717713;
        int i79 = ((i78 << 14) | (i78 >>> 18)) + i77;
        int i80 = i73 + ((((i79 & i75) | ((~i75) & i77)) + i18) - 373897302);
        int i81 = ((i80 >>> 12) | (i80 << 20)) + i79;
        int i82 = i75 + ((((i81 & i77) | ((~i77) & i79)) + i36) - 701558691);
        int i83 = ((i82 >>> 27) | (i82 << 5)) + i81;
        int i84 = i77 + ((i83 & i79) | ((~i79) & i81)) + i52 + 38016083;
        int i85 = ((i84 >>> 23) | (i84 << 9)) + i83;
        int i86 = i79 + ((((i85 & i81) | ((~i81) & i83)) + i71) - 660478335);
        int i87 = ((i86 >>> 18) | (i86 << 14)) + i85;
        int i88 = i81 + ((((i87 & i83) | ((~i83) & i85)) + i32) - 405537848);
        int i89 = ((i88 >>> 12) | (i88 << 20)) + i87;
        int i90 = i83 + ((i89 & i85) | ((~i85) & i87)) + i49 + 568446438;
        int i91 = ((i90 >>> 27) | (i90 << 5)) + i89;
        int i92 = i85 + ((((i91 & i87) | ((~i87) & i89)) + i66) - 1019803690);
        int i93 = ((i92 >>> 23) | (i92 << 9)) + i91;
        int i94 = i87 + ((((i93 & i89) | ((~i89) & i91)) + i29) - 187363961);
        int i95 = ((i94 >>> 18) | (i94 << 14)) + i93;
        int i96 = i89 + ((i95 & i91) | ((~i91) & i93)) + i46 + 1163531501;
        int i97 = ((i96 >>> 12) | (i96 << 20)) + i95;
        int i98 = i91 + ((((i97 & i93) | ((~i93) & i95)) + i62) - 1444681467);
        int i99 = ((i98 >>> 27) | (i98 << 5)) + i97;
        int i100 = i93 + ((((i99 & i95) | ((~i95) & i97)) + i26) - 51403784);
        int i101 = ((i100 >>> 23) | (i100 << 9)) + i99;
        int i102 = i95 + ((i101 & i97) | ((~i97) & i99)) + i69 + 1735328473;
        int i103 = ((i102 >>> 18) | (i102 << 14)) + i101;
        int i104 = i97 + ((((i103 & i99) | ((~i99) & i101)) + i58) - 1926607734);
        int i105 = ((i104 >>> 12) | (i104 << 20)) + i103;
        int i106 = i99 + ((((i105 ^ i103) ^ i101) + i36) - 378558);
        int i107 = ((i106 >>> 28) | (i106 << 4)) + i105;
        int i108 = i101 + ((((i107 ^ i105) ^ i103) + i46) - 2022574463);
        int i109 = ((i108 >>> 21) | (i108 << 11)) + i107;
        int i110 = i103 + ((i109 ^ i107) ^ i105) + i55 + 1839030562;
        int i111 = ((i110 >>> 16) | (i110 << 16)) + i109;
        int i112 = i105 + ((((i111 ^ i109) ^ i107) + i66) - 35309556);
        int i113 = ((i112 >>> 9) | (i112 << 23)) + i111;
        int i114 = i107 + ((((i113 ^ i111) ^ i109) + i22) - 1530992060);
        int i115 = ((i114 >>> 28) | (i114 << 4)) + i113;
        int i116 = i109 + ((i115 ^ i113) ^ i111) + i32 + 1272893353;
        int i117 = ((i116 >>> 21) | (i116 << 11)) + i115;
        int i118 = i111 + ((((i117 ^ i115) ^ i113) + i69) - 155497632);
        int i119 = ((i118 >>> 16) | (i118 << 16)) + i117;
        int i120 = i113 + ((((i119 ^ i117) ^ i115) + i52) - 1094730640);
        int i121 = ((i120 >>> 9) | (i120 << 23)) + i119;
        int i122 = i115 + ((i121 ^ i119) ^ i117) + i62 + 681279174;
        int i123 = ((i122 >>> 28) | (i122 << 4)) + i121;
        int i124 = i117 + ((((i123 ^ i121) ^ i119) + i18) - 358537222);
        int i125 = ((i124 >>> 21) | (i124 << 11)) + i123;
        int i126 = i119 + ((((i125 ^ i123) ^ i121) + i29) - 722521979);
        int i127 = ((i126 >>> 16) | (i126 << 16)) + i125;
        int i128 = i121 + ((i127 ^ i125) ^ i123) + i39 + 76029189;
        int i129 = ((i128 >>> 9) | (i128 << 23)) + i127;
        int i130 = i123 + ((((i129 ^ i127) ^ i125) + i49) - 640364487);
        int i131 = ((i130 >>> 28) | (i130 << 4)) + i129;
        int i132 = i125 + ((((i131 ^ i129) ^ i127) + i58) - 421815835);
        int i133 = ((i132 >>> 21) | (i132 << 11)) + i131;
        int i134 = i127 + ((i133 ^ i131) ^ i129) + i71 + 530742520;
        int i135 = ((i134 >>> 16) | (i134 << 16)) + i133;
        int i136 = i129 + ((((i135 ^ i133) ^ i131) + i26) - 995338651);
        int i137 = ((i136 >>> 9) | (i136 << 23)) + i135;
        int i138 = i131 + (((((~i133) | i137) ^ i135) + i18) - 198630844);
        int i139 = ((i138 >>> 26) | (i138 << 6)) + i137;
        int i140 = i133 + (((~i135) | i139) ^ i137) + i69 + 1126891415;
        int i141 = ((i140 >>> 22) | (i140 << 10)) + i139;
        int i142 = i135 + (((((~i137) | i141) ^ i139) + i66) - 1416354905);
        int i143 = ((i142 >>> 17) | (i142 << 15)) + i141;
        int i144 = i137 + (((((~i139) | i143) ^ i141) + i36) - 57434055);
        int i145 = ((i144 >>> 11) | (i144 << 21)) + i143;
        int i146 = i139 + (((~i141) | i145) ^ i143) + i58 + 1700485571;
        int i147 = ((i146 >>> 26) | (i146 << 6)) + i145;
        int i148 = i141 + (((((~i143) | i147) ^ i145) + i29) - 1894986606);
        int i149 = ((i148 >>> 22) | (i148 << 10)) + i147;
        int i150 = i143 + (((((~i145) | i149) ^ i147) + i52) - 1051523);
        int i151 = ((i150 >>> 17) | (i150 << 15)) + i149;
        int i152 = i145 + (((((~i147) | i151) ^ i149) + i22) - 2054922799);
        int i153 = ((i152 >>> 11) | (i152 << 21)) + i151;
        int i154 = i147 + (((~i149) | i153) ^ i151) + i46 + 1873313359;
        int i155 = ((i154 >>> 26) | (i154 << 6)) + i153;
        int i156 = i149 + (((((~i151) | i155) ^ i153) + i71) - 30611744);
        int i157 = ((i156 >>> 22) | (i156 << 10)) + i155;
        int i158 = i151 + (((((~i153) | i157) ^ i155) + i39) - 1560198380);
        int i159 = ((i158 >>> 17) | (i158 << 15)) + i157;
        int i160 = i153 + (((~i155) | i159) ^ i157) + i62 + 1309151649;
        int i161 = ((i160 >>> 11) | (i160 << 21)) + i159;
        int i162 = i155 + (((((~i157) | i161) ^ i159) + i32) - 145523070);
        int i163 = ((i162 >>> 26) | (i162 << 6)) + i161;
        int i164 = i157 + (((((~i159) | i163) ^ i161) + i55) - 1120210379);
        int i165 = ((i164 >>> 22) | (i164 << 10)) + i163;
        int i166 = i159 + (((~i161) | i165) ^ i163) + i26 + 718787259;
        int i167 = ((i166 >>> 17) | (i166 << 15)) + i165;
        int i168 = i161 + (((((~i163) | i167) ^ i165) + i49) - 343485551);
        int[] iArr3 = this.f3528;
        iArr3[0] = iArr3[0] + i163;
        iArr3[1] = iArr3[1] + ((i168 >>> 11) | (i168 << 21)) + i167;
        iArr3[2] = iArr3[2] + i167;
        iArr3[3] = iArr3[3] + i165;
    }
}

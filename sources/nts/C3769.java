package nts;

/* renamed from: nts.ဥ  reason: contains not printable characters */
public class C3769 extends C3638 {

    /* renamed from: ϴ  reason: contains not printable characters */
    public long f1231 = 0;

    /* renamed from: ࡏ  reason: contains not printable characters */
    public int[] f1232 = new int[5];

    /* renamed from: ᐳ  reason: contains not printable characters */
    public int f1233 = 0;

    /* renamed from: ⶊ  reason: contains not printable characters */
    public int f1234 = 0;

    /* renamed from: ⶏ  reason: contains not printable characters */
    public byte[] f1235 = new byte[64];

    public C3769() {
        this.f625 = 160;
        m1229();
    }

    /* renamed from: Е  reason: contains not printable characters */
    public static int[] m1218(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        return new int[]{m1222(i10 + (((i11 ^ ((~i13) | i12)) + i15) - 1454113458), i16) + i14, m1222(i12, 10)};
    }

    /* renamed from: ࡏ  reason: contains not printable characters */
    public static int[] m1219(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        return new int[]{m1222(i10 + ((((i11 & i13) | ((~i13) & i12)) + i15) - 1894007588), i16) + i14, m1222(i12, 10)};
    }

    /* renamed from: ખ  reason: contains not printable characters */
    public static int[] m1220(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        return new int[]{m1222(i10 + ((i11 & i13) | ((~i13) & i12)) + i15 + 1548603684, i16) + i14, m1222(i12, 10)};
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static int m1222(int i10, int i11) {
        return (i10 >>> (32 - i11)) | (i10 << i11);
    }

    /* renamed from: ⴸ  reason: contains not printable characters */
    public static int[] m1226(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        return new int[]{m1222(i10 + (i11 ^ ((~i13) | i12)) + i15 + 1352829926, i16) + i14, m1222(i12, 10)};
    }

    /* renamed from: ⶊ  reason: contains not printable characters */
    public static int[] m1227(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        return new int[]{m1222(i10 + ((i11 | (~i12)) ^ i13) + i15 + 1859775393, i16) + i14, m1222(i12, 10)};
    }

    /* renamed from: ⶏ  reason: contains not printable characters */
    public static int[] m1228(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        return new int[]{m1222(i10 + ((i11 | (~i12)) ^ i13) + i15 + 1836072691, i16) + i14, m1222(i12, 10)};
    }

    public Object clone() {
        C3769 r02 = new C3769();
        r02.f1233 = this.f1233;
        r02.f1231 = this.f1231;
        r02.f1234 = this.f1234;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            byte[] bArr = this.f1235;
            if (i11 >= bArr.length) {
                break;
            }
            r02.f1235[i11] = bArr[i11];
            i11++;
        }
        while (true) {
            int[] iArr = this.f1232;
            if (i10 >= iArr.length) {
                return r02;
            }
            r02.f1232[i10] = iArr[i10];
            i10++;
        }
    }

    /* renamed from: ϴ  reason: contains not printable characters */
    public void m1229() {
        this.f1234 = 0;
        this.f1233 = 0;
        this.f1231 = 0;
        int[] iArr = this.f1232;
        iArr[0] = 1732584193;
        iArr[1] = -271733879;
        iArr[2] = -1732584194;
        iArr[3] = 271733878;
        iArr[4] = -1009589776;
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public void m1230(byte[] bArr, int i10, int i11) {
        byte[] bArr2;
        int i12;
        if (bArr != null) {
            long j10 = this.f1231 + ((long) i11);
            if (j10 > 4294967295L) {
                this.f1233++;
                this.f1231 = j10 - 4294967296L;
            } else {
                this.f1231 = j10;
            }
            while (true) {
                bArr2 = this.f1235;
                int length = bArr2.length;
                i12 = this.f1234;
                if (i11 < length - i12) {
                    break;
                }
                System.arraycopy(bArr, i10, bArr2, i12, bArr2.length - i12);
                int[] iArr = new int[16];
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    byte[] bArr3 = this.f1235;
                    if (i13 >= bArr3.length / 4) {
                        break;
                    }
                    iArr[i13] = (bArr3[i14] & 255) | ((bArr3[i14 + 3] << 24) & -16777216) | ((bArr3[i14 + 2] << 16) & 16711680) | ((bArr3[i14 + 1] << 8) & 65280);
                    i13++;
                    i14 += 4;
                }
                m1231(iArr);
                byte[] bArr4 = this.f1235;
                int length2 = bArr4.length;
                int i15 = this.f1234;
                i11 -= length2 - i15;
                i10 += bArr4.length - i15;
                this.f1234 = 0;
            }
            if (i11 > 0) {
                System.arraycopy(bArr, i10, bArr2, i12, i11);
                this.f1234 += i11;
                return;
            }
            return;
        }
        throw new C3641(C3727.m1052("\u0018\u001c\n\u001e", 0, 4, 120));
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public byte[] m1232() {
        int i10;
        int i11;
        int[] iArr = new int[16];
        int i12 = 0;
        while (true) {
            i10 = (int) this.f1231;
            i11 = i10 & 63;
            if (i12 >= i11) {
                break;
            }
            int i13 = i12 >> 2;
            iArr[i13] = iArr[i13] | ((this.f1235[i12] & 255) << ((i12 & 3) * 8));
            i12++;
        }
        int i14 = (i10 >>> 2) & 15;
        iArr[i14] = (1 << (((i10 & 3) * 8) + 7)) | iArr[i14];
        if (i11 > 55) {
            m1231(iArr);
            iArr = new int[16];
        }
        int i15 = (int) this.f1231;
        iArr[14] = i15 << 3;
        iArr[15] = (i15 >>> 29) | (this.f1233 << 3);
        m1231(iArr);
        byte[] bArr = new byte[(this.f625 / 8)];
        this.f624 = bArr;
        m1223(this.f1232[0], bArr, 0);
        m1223(this.f1232[1], this.f624, 4);
        m1223(this.f1232[2], this.f624, 8);
        m1223(this.f1232[3], this.f624, 12);
        m1223(this.f1232[4], this.f624, 16);
        return this.f624;
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public final void m1231(int[] iArr) {
        int[] iArr2 = this.f1232;
        int i10 = iArr2[0];
        int i11 = iArr2[1];
        int i12 = iArr2[2];
        int i13 = iArr2[3];
        int i14 = iArr2[4];
        int[] r32 = m1224(i10, i11, i12, i13, i14, iArr[0], 11);
        int i15 = r32[0];
        int i16 = r32[1];
        int[] r33 = m1224(i14, i15, i11, i16, i13, iArr[1], 14);
        int i17 = r33[0];
        int i18 = r33[1];
        int[] r34 = m1224(i13, i17, i15, i18, i16, iArr[2], 15);
        int i19 = r34[0];
        int i20 = r34[1];
        int[] r52 = m1224(i16, i19, i17, i20, i18, iArr[3], 12);
        int i21 = r52[0];
        int i22 = r52[1];
        int[] r42 = m1224(i18, i21, i19, i22, i20, iArr[4], 5);
        int i23 = r42[0];
        int i24 = r42[1];
        int[] r35 = m1224(i20, i23, i21, i24, i22, iArr[5], 8);
        int i25 = r35[0];
        int i26 = r35[1];
        int[] r62 = m1224(i22, i25, i23, i26, i24, iArr[6], 7);
        int i27 = r62[0];
        int i28 = r62[1];
        int[] r43 = m1224(i24, i27, i25, i28, i26, iArr[7], 9);
        int i29 = r43[0];
        int i30 = r43[1];
        int[] r36 = m1224(i26, i29, i27, i30, i28, iArr[8], 11);
        int i31 = r36[0];
        int i32 = r36[1];
        int[] r63 = m1224(i28, i31, i29, i32, i30, iArr[9], 13);
        int i33 = r63[0];
        int i34 = r63[1];
        int[] r44 = m1224(i30, i33, i31, i34, i32, iArr[10], 14);
        int i35 = r44[0];
        int i36 = r44[1];
        int[] r37 = m1224(i32, i35, i33, i36, i34, iArr[11], 15);
        int i37 = r37[0];
        int i38 = r37[1];
        int[] r64 = m1224(i34, i37, i35, i38, i36, iArr[12], 6);
        int i39 = r64[0];
        int i40 = r64[1];
        int[] r45 = m1224(i36, i39, i37, i40, i38, iArr[13], 7);
        int i41 = r45[0];
        int i42 = r45[1];
        int[] r38 = m1224(i38, i41, i39, i42, i40, iArr[14], 9);
        int i43 = r38[0];
        int i44 = r38[1];
        int[] r65 = m1224(i40, i43, i41, i44, i42, iArr[15], 8);
        int i45 = r65[0];
        int i46 = r65[1];
        int[] r46 = m1225(i42, i45, i43, i46, i44, iArr[7], 7);
        int i47 = r46[0];
        int i48 = r46[1];
        int[] r39 = m1225(i44, i47, i45, i48, i46, iArr[4], 6);
        int i49 = r39[0];
        int i50 = r39[1];
        int[] r66 = m1225(i46, i49, i47, i50, i48, iArr[13], 8);
        int i51 = r66[0];
        int i52 = r66[1];
        int[] r47 = m1225(i48, i51, i49, i52, i50, iArr[1], 13);
        int i53 = r47[0];
        int i54 = r47[1];
        int[] r310 = m1225(i50, i53, i51, i54, i52, iArr[10], 11);
        int i55 = r310[0];
        int i56 = r310[1];
        int[] r67 = m1225(i52, i55, i53, i56, i54, iArr[6], 9);
        int i57 = r67[0];
        int i58 = r67[1];
        int[] r48 = m1225(i54, i57, i55, i58, i56, iArr[15], 7);
        int i59 = r48[0];
        int i60 = r48[1];
        int[] r311 = m1225(i56, i59, i57, i60, i58, iArr[3], 15);
        int i61 = r311[0];
        int i62 = r311[1];
        int[] r68 = m1225(i58, i61, i59, i62, i60, iArr[12], 7);
        int i63 = r68[0];
        int i64 = r68[1];
        int[] r49 = m1225(i60, i63, i61, i64, i62, iArr[0], 12);
        int i65 = r49[0];
        int i66 = r49[1];
        int[] r312 = m1225(i62, i65, i63, i66, i64, iArr[9], 15);
        int i67 = r312[0];
        int i68 = r312[1];
        int[] r69 = m1225(i64, i67, i65, i68, i66, iArr[5], 9);
        int i69 = r69[0];
        int i70 = r69[1];
        int[] r410 = m1225(i66, i69, i67, i70, i68, iArr[2], 11);
        int i71 = r410[0];
        int i72 = r410[1];
        int[] r313 = m1225(i68, i71, i69, i72, i70, iArr[14], 7);
        int i73 = r313[0];
        int i74 = r313[1];
        int[] r610 = m1225(i70, i73, i71, i74, i72, iArr[11], 13);
        int i75 = r610[0];
        int i76 = r610[1];
        int[] r411 = m1225(i72, i75, i73, i76, i74, iArr[8], 12);
        int i77 = r411[0];
        int i78 = r411[1];
        int[] r314 = m1227(i74, i77, i75, i78, i76, iArr[3], 11);
        int i79 = r314[0];
        int i80 = r314[1];
        int[] r611 = m1227(i76, i79, i77, i80, i78, iArr[10], 13);
        int i81 = r611[0];
        int i82 = r611[1];
        int[] r412 = m1227(i78, i81, i79, i82, i80, iArr[14], 6);
        int i83 = r412[0];
        int i84 = r412[1];
        int[] r315 = m1227(i80, i83, i81, i84, i82, iArr[4], 7);
        int i85 = r315[0];
        int i86 = r315[1];
        int[] r612 = m1227(i82, i85, i83, i86, i84, iArr[9], 14);
        int i87 = r612[0];
        int i88 = r612[1];
        int[] r413 = m1227(i84, i87, i85, i88, i86, iArr[15], 9);
        int i89 = r413[0];
        int i90 = r413[1];
        int[] r316 = m1227(i86, i89, i87, i90, i88, iArr[8], 13);
        int i91 = r316[0];
        int i92 = r316[1];
        int[] r613 = m1227(i88, i91, i89, i92, i90, iArr[1], 15);
        int i93 = r613[0];
        int i94 = r613[1];
        int[] r414 = m1227(i90, i93, i91, i94, i92, iArr[2], 14);
        int i95 = r414[0];
        int i96 = r414[1];
        int[] r317 = m1227(i92, i95, i93, i96, i94, iArr[7], 8);
        int i97 = r317[0];
        int i98 = r317[1];
        int[] r614 = m1227(i94, i97, i95, i98, i96, iArr[0], 13);
        int i99 = r614[0];
        int i100 = r614[1];
        int[] r415 = m1227(i96, i99, i97, i100, i98, iArr[6], 6);
        int i101 = r415[0];
        int i102 = r415[1];
        int[] r318 = m1227(i98, i101, i99, i102, i100, iArr[13], 5);
        int i103 = r318[0];
        int i104 = r318[1];
        int[] r615 = m1227(i100, i103, i101, i104, i102, iArr[11], 12);
        int i105 = r615[0];
        int i106 = r615[1];
        int[] r416 = m1227(i102, i105, i103, i106, i104, iArr[5], 7);
        int i107 = r416[0];
        int i108 = r416[1];
        int[] r319 = m1227(i104, i107, i105, i108, i106, iArr[12], 5);
        int i109 = r319[0];
        int i110 = r319[1];
        int[] r616 = m1219(i106, i109, i107, i110, i108, iArr[1], 11);
        int i111 = r616[0];
        int i112 = r616[1];
        int[] r417 = m1219(i108, i111, i109, i112, i110, iArr[9], 12);
        int i113 = r417[0];
        int i114 = r417[1];
        int[] r320 = m1219(i110, i113, i111, i114, i112, iArr[11], 14);
        int i115 = r320[0];
        int i116 = r320[1];
        int[] r617 = m1219(i112, i115, i113, i116, i114, iArr[10], 15);
        int i117 = r617[0];
        int i118 = r617[1];
        int[] r418 = m1219(i114, i117, i115, i118, i116, iArr[0], 14);
        int i119 = r418[0];
        int i120 = r418[1];
        int[] r321 = m1219(i116, i119, i117, i120, i118, iArr[8], 15);
        int i121 = r321[0];
        int i122 = r321[1];
        int[] r618 = m1219(i118, i121, i119, i122, i120, iArr[12], 9);
        int i123 = r618[0];
        int i124 = r618[1];
        int[] r419 = m1219(i120, i123, i121, i124, i122, iArr[4], 8);
        int i125 = r419[0];
        int i126 = r419[1];
        int[] r322 = m1219(i122, i125, i123, i126, i124, iArr[13], 9);
        int i127 = r322[0];
        int i128 = r322[1];
        int[] r619 = m1219(i124, i127, i125, i128, i126, iArr[3], 14);
        int i129 = r619[0];
        int i130 = r619[1];
        int[] r420 = m1219(i126, i129, i127, i130, i128, iArr[7], 5);
        int i131 = r420[0];
        int i132 = r420[1];
        int[] r323 = m1219(i128, i131, i129, i132, i130, iArr[15], 6);
        int i133 = r323[0];
        int i134 = r323[1];
        int[] r620 = m1219(i130, i133, i131, i134, i132, iArr[14], 8);
        int i135 = r620[0];
        int i136 = r620[1];
        int[] r421 = m1219(i132, i135, i133, i136, i134, iArr[5], 6);
        int i137 = r421[0];
        int i138 = r421[1];
        int[] r324 = m1219(i134, i137, i135, i138, i136, iArr[6], 5);
        int i139 = r324[0];
        int i140 = r324[1];
        int[] r621 = m1219(i136, i139, i137, i140, i138, iArr[2], 12);
        int i141 = r621[0];
        int i142 = r621[1];
        int[] r422 = m1218(i138, i141, i139, i142, i140, iArr[4], 9);
        int i143 = r422[0];
        int i144 = r422[1];
        int[] r325 = m1218(i140, i143, i141, i144, i142, iArr[0], 15);
        int i145 = r325[0];
        int i146 = r325[1];
        int[] r622 = m1218(i142, i145, i143, i146, i144, iArr[5], 5);
        int i147 = r622[0];
        int i148 = r622[1];
        int[] r423 = m1218(i144, i147, i145, i148, i146, iArr[9], 11);
        int i149 = r423[0];
        int i150 = r423[1];
        int[] r326 = m1218(i146, i149, i147, i150, i148, iArr[7], 6);
        int i151 = r326[0];
        int i152 = r326[1];
        int[] r623 = m1218(i148, i151, i149, i152, i150, iArr[12], 8);
        int i153 = r623[0];
        int i154 = r623[1];
        int[] r424 = m1218(i150, i153, i151, i154, i152, iArr[2], 13);
        int i155 = r424[0];
        int i156 = r424[1];
        int[] r327 = m1218(i152, i155, i153, i156, i154, iArr[10], 12);
        int i157 = r327[0];
        int i158 = r327[1];
        int[] r624 = m1218(i154, i157, i155, i158, i156, iArr[14], 5);
        int i159 = r624[0];
        int i160 = r624[1];
        int[] r425 = m1218(i156, i159, i157, i160, i158, iArr[1], 12);
        int i161 = r425[0];
        int i162 = r425[1];
        int[] r328 = m1218(i158, i161, i159, i162, i160, iArr[3], 13);
        int i163 = r328[0];
        int i164 = r328[1];
        int[] r625 = m1218(i160, i163, i161, i164, i162, iArr[8], 14);
        int i165 = r625[0];
        int i166 = r625[1];
        int[] r426 = m1218(i162, i165, i163, i166, i164, iArr[11], 11);
        int i167 = r426[0];
        int i168 = r426[1];
        int[] r329 = m1218(i164, i167, i165, i168, i166, iArr[6], 8);
        int i169 = r329[0];
        int i170 = r329[1];
        int[] r330 = m1218(i166, i169, i167, i170, i168, iArr[15], 5);
        int i171 = r330[0];
        int i172 = r330[1];
        int[] r331 = m1218(i168, i171, i169, i172, i170, iArr[13], 6);
        int i173 = r331[0];
        int i174 = r331[1];
        int[] r332 = m1226(i10, i11, i12, i13, i14, iArr[5], 8);
        int i175 = r332[0];
        int i176 = r332[1];
        int[] r12 = m1226(i14, i175, i11, i176, i13, iArr[14], 9);
        int i177 = r12[0];
        int i178 = r12[1];
        int[] r333 = m1226(i13, i177, i175, i178, i176, iArr[7], 9);
        int i179 = r333[0];
        int i180 = r333[1];
        int i181 = i180;
        int[] r334 = m1226(i176, i179, i177, i181, i178, iArr[0], 11);
        int i182 = r334[0];
        int i183 = r334[1];
        int[] r13 = m1226(i178, i182, i179, i183, i180, iArr[9], 13);
        int i184 = r13[0];
        int i185 = r13[1];
        int[] r427 = m1226(i181, i184, i182, i185, i183, iArr[2], 15);
        int i186 = r427[0];
        int i187 = r427[1];
        int[] r335 = m1226(i183, i186, i184, i187, i185, iArr[11], 15);
        int i188 = r335[0];
        int i189 = r335[1];
        int[] r14 = m1226(i185, i188, i186, i189, i187, iArr[4], 5);
        int i190 = r14[0];
        int i191 = r14[1];
        int[] r53 = m1226(i187, i190, i188, i191, i189, iArr[13], 7);
        int i192 = r53[0];
        int i193 = r53[1];
        int[] r336 = m1226(i189, i192, i190, i193, i191, iArr[6], 7);
        int i194 = r336[0];
        int i195 = r336[1];
        int[] r15 = m1226(i191, i194, i192, i195, i193, iArr[15], 8);
        int i196 = r15[0];
        int i197 = r15[1];
        int[] r54 = m1226(i193, i196, i194, i197, i195, iArr[8], 11);
        int i198 = r54[0];
        int i199 = r54[1];
        int[] r337 = m1226(i195, i198, i196, i199, i197, iArr[1], 14);
        int i200 = r337[0];
        int i201 = r337[1];
        int[] r16 = m1226(i197, i200, i198, i201, i199, iArr[10], 14);
        int i202 = r16[0];
        int i203 = r16[1];
        int[] r55 = m1226(i199, i202, i200, i203, i201, iArr[3], 12);
        int i204 = r55[0];
        int i205 = r55[1];
        int[] r338 = m1226(i201, i204, i202, i205, i203, iArr[12], 6);
        int i206 = r338[0];
        int i207 = r338[1];
        int[] r17 = m1220(i203, i206, i204, i207, i205, iArr[6], 9);
        int i208 = r17[0];
        int i209 = r17[1];
        int[] r56 = m1220(i205, i208, i206, i209, i207, iArr[11], 13);
        int i210 = r56[0];
        int i211 = r56[1];
        int[] r339 = m1220(i207, i210, i208, i211, i209, iArr[3], 15);
        int i212 = r339[0];
        int i213 = r339[1];
        int[] r18 = m1220(i209, i212, i210, i213, i211, iArr[7], 7);
        int i214 = r18[0];
        int i215 = r18[1];
        int[] r57 = m1220(i211, i214, i212, i215, i213, iArr[0], 12);
        int i216 = r57[0];
        int i217 = r57[1];
        int[] r340 = m1220(i213, i216, i214, i217, i215, iArr[13], 8);
        int i218 = r340[0];
        int i219 = r340[1];
        int[] r19 = m1220(i215, i218, i216, i219, i217, iArr[5], 9);
        int i220 = r19[0];
        int i221 = r19[1];
        int[] r58 = m1220(i217, i220, i218, i221, i219, iArr[10], 11);
        int i222 = r58[0];
        int i223 = r58[1];
        int[] r341 = m1220(i219, i222, i220, i223, i221, iArr[14], 7);
        int i224 = r341[0];
        int i225 = r341[1];
        int[] r110 = m1220(i221, i224, i222, i225, i223, iArr[15], 7);
        int i226 = r110[0];
        int i227 = r110[1];
        int[] r59 = m1220(i223, i226, i224, i227, i225, iArr[8], 12);
        int i228 = r59[0];
        int i229 = r59[1];
        int[] r342 = m1220(i225, i228, i226, i229, i227, iArr[12], 7);
        int i230 = r342[0];
        int i231 = r342[1];
        int[] r111 = m1220(i227, i230, i228, i231, i229, iArr[4], 6);
        int i232 = r111[0];
        int i233 = r111[1];
        int[] r510 = m1220(i229, i232, i230, i233, i231, iArr[9], 15);
        int i234 = r510[0];
        int i235 = r510[1];
        int[] r343 = m1220(i231, i234, i232, i235, i233, iArr[1], 13);
        int i236 = r343[0];
        int i237 = r343[1];
        int[] r112 = m1220(i233, i236, i234, i237, i235, iArr[2], 11);
        int i238 = r112[0];
        int i239 = r112[1];
        int[] r511 = m1228(i235, i238, i236, i239, i237, iArr[15], 9);
        int i240 = r511[0];
        int i241 = r511[1];
        int[] r344 = m1228(i237, i240, i238, i241, i239, iArr[5], 7);
        int i242 = r344[0];
        int i243 = r344[1];
        int[] r113 = m1228(i239, i242, i240, i243, i241, iArr[1], 15);
        int i244 = r113[0];
        int i245 = r113[1];
        int[] r512 = m1228(i241, i244, i242, i245, i243, iArr[3], 11);
        int i246 = r512[0];
        int i247 = r512[1];
        int[] r345 = m1228(i243, i246, i244, i247, i245, iArr[7], 8);
        int i248 = r345[0];
        int i249 = r345[1];
        int[] r114 = m1228(i245, i248, i246, i249, i247, iArr[14], 6);
        int i250 = r114[0];
        int i251 = r114[1];
        int[] r513 = m1228(i247, i250, i248, i251, i249, iArr[6], 6);
        int i252 = r513[0];
        int i253 = r513[1];
        int[] r346 = m1228(i249, i252, i250, i253, i251, iArr[9], 14);
        int i254 = r346[0];
        int i255 = r346[1];
        int[] r115 = m1228(i251, i254, i252, i255, i253, iArr[11], 12);
        int i256 = r115[0];
        int i257 = r115[1];
        int[] r514 = m1228(i253, i256, i254, i257, i255, iArr[8], 13);
        int i258 = r514[0];
        int i259 = r514[1];
        int[] r347 = m1228(i255, i258, i256, i259, i257, iArr[12], 5);
        int i260 = r347[0];
        int i261 = r347[1];
        int[] r116 = m1228(i257, i260, i258, i261, i259, iArr[2], 14);
        int i262 = r116[0];
        int i263 = r116[1];
        int[] r515 = m1228(i259, i262, i260, i263, i261, iArr[10], 13);
        int i264 = r515[0];
        int i265 = r515[1];
        int[] r348 = m1228(i261, i264, i262, i265, i263, iArr[0], 13);
        int i266 = r348[0];
        int i267 = r348[1];
        int[] r117 = m1228(i263, i266, i264, i267, i265, iArr[4], 7);
        int i268 = r117[0];
        int i269 = r117[1];
        int[] r516 = m1228(i265, i268, i266, i269, i267, iArr[13], 5);
        int i270 = r516[0];
        int i271 = r516[1];
        int[] r349 = m1217(i267, i270, i268, i271, i269, iArr[8], 15);
        int i272 = r349[0];
        int i273 = r349[1];
        int[] r118 = m1217(i269, i272, i270, i273, i271, iArr[6], 5);
        int i274 = r118[0];
        int i275 = r118[1];
        int[] r517 = m1217(i271, i274, i272, i275, i273, iArr[4], 8);
        int i276 = r517[0];
        int i277 = r517[1];
        int[] r350 = m1217(i273, i276, i274, i277, i275, iArr[1], 11);
        int i278 = r350[0];
        int i279 = r350[1];
        int[] r119 = m1217(i275, i278, i276, i279, i277, iArr[3], 14);
        int i280 = r119[0];
        int i281 = r119[1];
        int[] r518 = m1217(i277, i280, i278, i281, i279, iArr[11], 14);
        int i282 = r518[0];
        int i283 = r518[1];
        int[] r351 = m1217(i279, i282, i280, i283, i281, iArr[15], 6);
        int i284 = r351[0];
        int i285 = r351[1];
        int[] r120 = m1217(i281, i284, i282, i285, i283, iArr[0], 14);
        int i286 = r120[0];
        int i287 = r120[1];
        int[] r519 = m1217(i283, i286, i284, i287, i285, iArr[5], 6);
        int i288 = r519[0];
        int i289 = r519[1];
        int[] r352 = m1217(i285, i288, i286, i289, i287, iArr[12], 9);
        int i290 = r352[0];
        int i291 = r352[1];
        int[] r121 = m1217(i287, i290, i288, i291, i289, iArr[2], 12);
        int i292 = r121[0];
        int i293 = r121[1];
        int[] r520 = m1217(i289, i292, i290, i293, i291, iArr[13], 9);
        int i294 = r520[0];
        int i295 = r520[1];
        int[] r353 = m1217(i291, i294, i292, i295, i293, iArr[9], 12);
        int i296 = r353[0];
        int i297 = r353[1];
        int[] r122 = m1217(i293, i296, i294, i297, i295, iArr[7], 5);
        int i298 = r122[0];
        int i299 = r122[1];
        int[] r521 = m1217(i295, i298, i296, i299, i297, iArr[10], 15);
        int i300 = r521[0];
        int i301 = r521[1];
        int[] r354 = m1217(i297, i300, i298, i301, i299, iArr[14], 8);
        int i302 = r354[0];
        int i303 = r354[1];
        int[] r123 = m1221(i299, i302, i300, i303, i301, iArr[12], 8);
        int i304 = r123[0];
        int i305 = r123[1];
        int[] r522 = m1221(i301, i304, i302, i305, i303, iArr[15], 5);
        int i306 = r522[0];
        int i307 = r522[1];
        int[] r355 = m1221(i303, i306, i304, i307, i305, iArr[10], 12);
        int i308 = r355[0];
        int i309 = r355[1];
        int[] r124 = m1221(i305, i308, i306, i309, i307, iArr[4], 9);
        int i310 = r124[0];
        int i311 = r124[1];
        int[] r523 = m1221(i307, i310, i308, i311, i309, iArr[1], 12);
        int i312 = r523[0];
        int i313 = r523[1];
        int[] r356 = m1221(i309, i312, i310, i313, i311, iArr[5], 5);
        int i314 = r356[0];
        int i315 = r356[1];
        int[] r125 = m1221(i311, i314, i312, i315, i313, iArr[8], 14);
        int i316 = r125[0];
        int i317 = r125[1];
        int[] r524 = m1221(i313, i316, i314, i317, i315, iArr[7], 6);
        int i318 = r524[0];
        int i319 = r524[1];
        int[] r357 = m1221(i315, i318, i316, i319, i317, iArr[6], 8);
        int i320 = r357[0];
        int i321 = r357[1];
        int[] r126 = m1221(i317, i320, i318, i321, i319, iArr[2], 13);
        int i322 = r126[0];
        int i323 = r126[1];
        int[] r127 = m1221(i319, i322, i320, i323, i321, iArr[13], 6);
        int i324 = r127[0];
        int i325 = r127[1];
        int[] r128 = m1221(i321, i324, i322, i325, i323, iArr[14], 5);
        int i326 = r128[0];
        int i327 = r128[1];
        int[] r129 = m1221(i323, i326, i324, i327, i325, iArr[0], 15);
        int i328 = r129[0];
        int i329 = r129[1];
        int[] r130 = m1221(i325, i328, i326, i329, i327, iArr[3], 13);
        int i330 = r130[0];
        int i331 = r130[1];
        int[] r428 = m1221(i327, i330, i328, i331, i329, iArr[9], 11);
        int i332 = r428[0];
        int i333 = r428[1];
        int[] r358 = m1221(i329, i332, i330, i333, i331, iArr[11], 11);
        int i334 = r358[0];
        int i335 = r358[1];
        int[] iArr3 = this.f1232;
        iArr3[1] = iArr3[2] + i174 + i333;
        iArr3[2] = iArr3[3] + i172 + i331;
        iArr3[3] = iArr3[4] + i170 + i334;
        iArr3[4] = iArr3[0] + i173 + i332;
        iArr3[0] = i335 + i171 + iArr3[1];
    }

    /* renamed from: ϴ  reason: contains not printable characters */
    public static int[] m1217(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        return new int[]{m1222(i10 + (((~i11) & i13) | (i11 & i12)) + i15 + 2053994217, i16) + i14, m1222(i12, 10)};
    }

    /* renamed from: ᐳ  reason: contains not printable characters */
    public static int[] m1225(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        return new int[]{m1222(i10 + (((~i11) & i13) | (i11 & i12)) + i15 + 1518500249, i16) + i14, m1222(i12, 10)};
    }

    /* renamed from: ગ  reason: contains not printable characters */
    public static int[] m1221(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        return new int[]{m1222(i10 + ((i11 ^ i12) ^ i13) + i15, i16) + i14, m1222(i12, 10)};
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static void m1223(int i10, byte[] bArr, int i11) {
        bArr[i11 + 3] = (byte) ((i10 >>> 24) & 255);
        bArr[i11 + 2] = (byte) ((i10 >>> 16) & 255);
        bArr[i11 + 1] = (byte) ((i10 >>> 8) & 255);
        bArr[i11] = (byte) (i10 & 255);
    }

    /* renamed from: ഇ  reason: contains not printable characters */
    public static int[] m1224(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        return new int[]{m1222(i10 + ((i11 ^ i12) ^ i13) + i15, i16) + i14, m1222(i12, 10)};
    }
}

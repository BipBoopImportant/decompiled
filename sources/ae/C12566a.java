package AE;

/* renamed from: AE.a  reason: case insensitive filesystem */
public final class C12566a {
    public static int a(CharSequence charSequence, int i10, int i11, int i12) {
        CharSequence charSequence2 = charSequence;
        int i13 = i10 + i11;
        int i14 = i10;
        int i15 = i12;
        char c10 = 0;
        int i16 = 0;
        int i17 = 0;
        while (i14 < i13) {
            int i18 = i14 + 1;
            char charAt = charSequence2.charAt(i14);
            char c11 = 8;
            if (charAt < 128) {
                i14 = i18;
            } else if (charAt < 2048) {
                charAt = (((charAt & '?') | 128) << 8) | (charAt >> 6) | 192;
                i14 = i18;
                c11 = 16;
            } else if (charAt < 55296 || charAt > 57343 || i18 >= i13) {
                charAt = (((charAt & '?') | 128) << 16) | (charAt >> 12) | 224 | ((((charAt >> 6) & 63) | 128) << 8);
                i14 = i18;
                c11 = 24;
            } else {
                i14 += 2;
                int charAt2 = ((charAt - 55232) << 10) + (charSequence2.charAt(i18) & 1023);
                charAt = (((charAt2 & 63) | 128) << 24) | (((charAt2 >> 18) | 240) & 255) | ((((charAt2 >> 12) & 63) | 128) << 8) | ((((charAt2 >> 6) & 63) | 128) << 16);
                c11 = ' ';
            }
            i17 |= charAt << c10;
            c10 += c11;
            if (c10 >= 32) {
                int i19 = i17 * -862048943;
                int i20 = i15 ^ (((i19 >>> 17) | (i19 << 15)) * 461845907);
                i15 = (((i20 >>> 19) | (i20 << 13)) * 5) - 430675100;
                c10 -= 32;
                i17 = c10 != 0 ? charAt >>> (c11 - c10) : 0;
                i16 += 4;
            }
        }
        if (c10 > 0) {
            i16 += c10 >> 3;
            int i21 = i17 * -862048943;
            i15 ^= ((i21 << 15) | (i21 >>> 17)) * 461845907;
        }
        int i22 = i15 ^ i16;
        int i23 = (i22 ^ (i22 >>> 16)) * -2048144789;
        int i24 = (i23 ^ (i23 >>> 13)) * -1028477387;
        return i24 ^ (i24 >>> 16);
    }
}

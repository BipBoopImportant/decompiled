package com.google.android.gms.internal.vision;

final class x2 extends u2 {
    x2() {
    }

    /* access modifiers changed from: package-private */
    public final int a(int i10, byte[] bArr, int i11, int i12) {
        while (r10 < i12 && bArr[r10] >= 0) {
            i11 = r10 + 1;
        }
        if (r10 >= i12) {
            return 0;
        }
        while (r10 < i12) {
            int i13 = r10 + 1;
            byte b10 = bArr[r10];
            if (b10 >= 0) {
                r10 = i13;
            } else if (b10 < -32) {
                if (i13 >= i12) {
                    return b10;
                }
                if (b10 >= -62) {
                    r10 += 2;
                    if (bArr[i13] > -65) {
                    }
                }
                return -1;
            } else if (b10 < -16) {
                if (i13 >= i12 - 1) {
                    return t2.m(bArr, i13, i12);
                }
                int i14 = r10 + 2;
                byte b11 = bArr[i13];
                if (b11 <= -65 && ((b10 != -32 || b11 >= -96) && (b10 != -19 || b11 < -96))) {
                    r10 += 3;
                    if (bArr[i14] > -65) {
                    }
                }
                return -1;
            } else if (i13 >= i12 - 2) {
                return t2.m(bArr, i13, i12);
            } else {
                int i15 = r10 + 2;
                byte b12 = bArr[i13];
                if (b12 <= -65 && (((b10 << 28) + (b12 + 112)) >> 30) == 0) {
                    int i16 = r10 + 3;
                    if (bArr[i15] <= -65) {
                        r10 += 4;
                        if (bArr[i16] > -65) {
                        }
                    }
                }
                return -1;
            }
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final int b(CharSequence charSequence, byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        char charAt;
        int length = charSequence.length();
        int i14 = i11 + i10;
        int i15 = 0;
        while (i15 < length && (i13 = i15 + i10) < i14 && (charAt = charSequence.charAt(i15)) < 128) {
            bArr[i13] = (byte) charAt;
            i15++;
        }
        if (i15 == length) {
            return i10 + length;
        }
        int i16 = i10 + i15;
        while (i15 < length) {
            char charAt2 = charSequence.charAt(i15);
            if (charAt2 < 128 && i16 < i14) {
                bArr[i16] = (byte) charAt2;
                i16++;
            } else if (charAt2 < 2048 && i16 <= i14 - 2) {
                int i17 = i16 + 1;
                bArr[i16] = (byte) ((charAt2 >>> 6) | 960);
                i16 += 2;
                bArr[i17] = (byte) ((charAt2 & '?') | 128);
            } else if ((charAt2 < 55296 || 57343 < charAt2) && i16 <= i14 - 3) {
                bArr[i16] = (byte) ((charAt2 >>> 12) | 480);
                int i18 = i16 + 2;
                bArr[i16 + 1] = (byte) (((charAt2 >>> 6) & 63) | 128);
                i16 += 3;
                bArr[i18] = (byte) ((charAt2 & '?') | 128);
            } else if (i16 <= i14 - 4) {
                int i19 = i15 + 1;
                if (i19 != charSequence.length()) {
                    char charAt3 = charSequence.charAt(i19);
                    if (Character.isSurrogatePair(charAt2, charAt3)) {
                        int codePoint = Character.toCodePoint(charAt2, charAt3);
                        bArr[i16] = (byte) ((codePoint >>> 18) | 240);
                        bArr[i16 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                        int i20 = i16 + 3;
                        bArr[i16 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                        i16 += 4;
                        bArr[i20] = (byte) ((codePoint & 63) | 128);
                        i15 = i19;
                    } else {
                        i15 = i19;
                    }
                }
                throw new w2(i15 - 1, length);
            } else if (55296 > charAt2 || charAt2 > 57343 || ((i12 = i15 + 1) != charSequence.length() && Character.isSurrogatePair(charAt2, charSequence.charAt(i12)))) {
                StringBuilder sb2 = new StringBuilder(37);
                sb2.append("Failed writing ");
                sb2.append(charAt2);
                sb2.append(" at index ");
                sb2.append(i16);
                throw new ArrayIndexOutOfBoundsException(sb2.toString());
            } else {
                throw new w2(i15, length);
            }
            i15++;
        }
        return i16;
    }

    /* access modifiers changed from: package-private */
    public final String d(byte[] bArr, int i10, int i11) {
        if ((i10 | i11 | ((bArr.length - i10) - i11)) >= 0) {
            int i12 = i10 + i11;
            char[] cArr = new char[i11];
            int i13 = 0;
            while (r11 < i12) {
                byte b10 = bArr[r11];
                if (!v2.l(b10)) {
                    break;
                }
                i10 = r11 + 1;
                v2.i(b10, cArr, i13);
                i13++;
            }
            int i14 = i13;
            while (r11 < i12) {
                int i15 = r11 + 1;
                byte b11 = bArr[r11];
                if (v2.l(b11)) {
                    int i16 = i14 + 1;
                    v2.i(b11, cArr, i14);
                    while (i15 < i12) {
                        byte b12 = bArr[i15];
                        if (!v2.l(b12)) {
                            break;
                        }
                        i15++;
                        v2.i(b12, cArr, i16);
                        i16++;
                    }
                    i14 = i16;
                    r11 = i15;
                } else if (v2.m(b11)) {
                    if (i15 < i12) {
                        r11 += 2;
                        v2.h(b11, bArr[i15], cArr, i14);
                        i14++;
                    } else {
                        throw Z0.f();
                    }
                } else if (v2.n(b11)) {
                    if (i15 < i12 - 1) {
                        int i17 = r11 + 2;
                        r11 += 3;
                        v2.g(b11, bArr[i15], bArr[i17], cArr, i14);
                        i14++;
                    } else {
                        throw Z0.f();
                    }
                } else if (i15 < i12 - 2) {
                    byte b13 = bArr[i15];
                    int i18 = r11 + 3;
                    byte b14 = bArr[r11 + 2];
                    r11 += 4;
                    v2.f(b11, b13, b14, bArr[i18], cArr, i14);
                    i14 += 2;
                } else {
                    throw Z0.f();
                }
            }
            return new String(cArr, 0, i14);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)}));
    }
}

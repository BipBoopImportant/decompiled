package com.google.android.gms.internal.vision;

final class t2 {

    /* renamed from: a  reason: collision with root package name */
    private static final u2 f49400a = ((!q2.m() || !q2.r() || C7465a0.b()) ? new x2() : new z2());

    static int d(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < length && charSequence.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (true) {
            if (i11 >= length) {
                break;
            }
            char charAt = charSequence.charAt(i11);
            if (charAt < 2048) {
                i12 += (127 - charAt) >>> 31;
                i11++;
            } else {
                int length2 = charSequence.length();
                while (i11 < length2) {
                    char charAt2 = charSequence.charAt(i11);
                    if (charAt2 < 2048) {
                        i10 += (127 - charAt2) >>> 31;
                    } else {
                        i10 += 2;
                        if (55296 <= charAt2 && charAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i11) >= 65536) {
                                i11++;
                            } else {
                                throw new w2(i11, length2);
                            }
                        }
                    }
                    i11++;
                }
                i12 += i10;
            }
        }
        if (i12 >= length) {
            return i12;
        }
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("UTF-8 length does not fit in int: ");
        sb2.append(((long) i12) + 4294967296L);
        throw new IllegalArgumentException(sb2.toString());
    }

    static int e(CharSequence charSequence, byte[] bArr, int i10, int i11) {
        return f49400a.b(charSequence, bArr, i10, i11);
    }

    public static boolean f(byte[] bArr) {
        return f49400a.c(bArr, 0, bArr.length);
    }

    public static boolean g(byte[] bArr, int i10, int i11) {
        return f49400a.c(bArr, i10, i11);
    }

    /* access modifiers changed from: private */
    public static int h(int i10) {
        if (i10 > -12) {
            return -1;
        }
        return i10;
    }

    /* access modifiers changed from: private */
    public static int i(int i10, int i11) {
        if (i10 > -12 || i11 > -65) {
            return -1;
        }
        return i10 ^ (i11 << 8);
    }

    /* access modifiers changed from: private */
    public static int j(int i10, int i11, int i12) {
        if (i10 > -12 || i11 > -65 || i12 > -65) {
            return -1;
        }
        return (i10 ^ (i11 << 8)) ^ (i12 << 16);
    }

    static String k(byte[] bArr, int i10, int i11) {
        return f49400a.d(bArr, i10, i11);
    }

    /* access modifiers changed from: private */
    public static int m(byte[] bArr, int i10, int i11) {
        byte b10 = bArr[i10 - 1];
        int i12 = i11 - i10;
        if (i12 == 0) {
            return h(b10);
        }
        if (i12 == 1) {
            return i(b10, bArr[i10]);
        }
        if (i12 == 2) {
            return j(b10, bArr[i10], bArr[i10 + 1]);
        }
        throw new AssertionError();
    }
}

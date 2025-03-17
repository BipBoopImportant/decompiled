package androidx.datastore.preferences.protobuf;

import java.nio.charset.Charset;
import java.util.Arrays;

final class s0 {

    /* renamed from: a  reason: collision with root package name */
    private static final b f21438a = ((!e.c() || C5151d.c()) ? new c() : new e());

    private static class a {
        /* access modifiers changed from: private */
        public static void h(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) {
            if (m(b11) || (((b10 << 28) + (b11 + 112)) >> 30) != 0 || m(b12) || m(b13)) {
                throw A.d();
            }
            int r10 = ((b10 & 7) << 18) | (r(b11) << 12) | (r(b12) << 6) | r(b13);
            cArr[i10] = l(r10);
            cArr[i10 + 1] = q(r10);
        }

        /* access modifiers changed from: private */
        public static void i(byte b10, char[] cArr, int i10) {
            cArr[i10] = (char) b10;
        }

        /* access modifiers changed from: private */
        public static void j(byte b10, byte b11, byte b12, char[] cArr, int i10) {
            if (m(b11) || ((b10 == -32 && b11 < -96) || ((b10 == -19 && b11 >= -96) || m(b12)))) {
                throw A.d();
            }
            cArr[i10] = (char) (((b10 & 15) << 12) | (r(b11) << 6) | r(b12));
        }

        /* access modifiers changed from: private */
        public static void k(byte b10, byte b11, char[] cArr, int i10) {
            if (b10 < -62 || m(b11)) {
                throw A.d();
            }
            cArr[i10] = (char) (((b10 & 31) << 6) | r(b11));
        }

        private static char l(int i10) {
            return (char) ((i10 >>> 10) + 55232);
        }

        private static boolean m(byte b10) {
            return b10 > -65;
        }

        /* access modifiers changed from: private */
        public static boolean n(byte b10) {
            return b10 >= 0;
        }

        /* access modifiers changed from: private */
        public static boolean o(byte b10) {
            return b10 < -16;
        }

        /* access modifiers changed from: private */
        public static boolean p(byte b10) {
            return b10 < -32;
        }

        private static char q(int i10) {
            return (char) ((i10 & 1023) + 56320);
        }

        private static int r(byte b10) {
            return b10 & 63;
        }
    }

    static abstract class b {
        b() {
        }

        /* access modifiers changed from: package-private */
        public abstract String a(byte[] bArr, int i10, int i11);

        /* access modifiers changed from: package-private */
        public abstract int b(String str, byte[] bArr, int i10, int i11);
    }

    static final class c extends b {
        c() {
        }

        /* access modifiers changed from: package-private */
        public String a(byte[] bArr, int i10, int i11) {
            if ((i10 | i11 | ((bArr.length - i10) - i11)) >= 0) {
                int i12 = i10 + i11;
                char[] cArr = new char[i11];
                int i13 = 0;
                while (r11 < i12) {
                    byte b10 = bArr[r11];
                    if (!a.n(b10)) {
                        break;
                    }
                    i10 = r11 + 1;
                    a.i(b10, cArr, i13);
                    i13++;
                }
                int i14 = i13;
                while (r11 < i12) {
                    int i15 = r11 + 1;
                    byte b11 = bArr[r11];
                    if (a.n(b11)) {
                        int i16 = i14 + 1;
                        a.i(b11, cArr, i14);
                        while (i15 < i12) {
                            byte b12 = bArr[i15];
                            if (!a.n(b12)) {
                                break;
                            }
                            i15++;
                            a.i(b12, cArr, i16);
                            i16++;
                        }
                        i14 = i16;
                        r11 = i15;
                    } else if (a.p(b11)) {
                        if (i15 < i12) {
                            r11 += 2;
                            a.k(b11, bArr[i15], cArr, i14);
                            i14++;
                        } else {
                            throw A.d();
                        }
                    } else if (a.o(b11)) {
                        if (i15 < i12 - 1) {
                            int i17 = r11 + 2;
                            r11 += 3;
                            a.j(b11, bArr[i15], bArr[i17], cArr, i14);
                            i14++;
                        } else {
                            throw A.d();
                        }
                    } else if (i15 < i12 - 2) {
                        byte b13 = bArr[i15];
                        int i18 = r11 + 3;
                        byte b14 = bArr[r11 + 2];
                        r11 += 4;
                        a.h(b11, b13, b14, bArr[i18], cArr, i14);
                        i14 += 2;
                    } else {
                        throw A.d();
                    }
                }
                return new String(cArr, 0, i14);
            }
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)}));
        }

        /* access modifiers changed from: package-private */
        public int b(String str, byte[] bArr, int i10, int i11) {
            int i12;
            int i13;
            char charAt;
            int length = str.length();
            int i14 = i11 + i10;
            int i15 = 0;
            while (i15 < length && (i13 = i15 + i10) < i14 && (charAt = str.charAt(i15)) < 128) {
                bArr[i13] = (byte) charAt;
                i15++;
            }
            if (i15 == length) {
                return i10 + length;
            }
            int i16 = i10 + i15;
            while (i15 < length) {
                char charAt2 = str.charAt(i15);
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
                    if (i19 != str.length()) {
                        char charAt3 = str.charAt(i19);
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
                    throw new d(i15 - 1, length);
                } else if (55296 > charAt2 || charAt2 > 57343 || ((i12 = i15 + 1) != str.length() && Character.isSurrogatePair(charAt2, str.charAt(i12)))) {
                    throw new ArrayIndexOutOfBoundsException("Failed writing " + charAt2 + " at index " + i16);
                } else {
                    throw new d(i15, length);
                }
                i15++;
            }
            return i16;
        }
    }

    static class d extends IllegalArgumentException {
        d(int i10, int i11) {
            super("Unpaired surrogate at index " + i10 + " of " + i11);
        }
    }

    static final class e extends b {
        e() {
        }

        static boolean c() {
            return r0.B() && r0.C();
        }

        /* access modifiers changed from: package-private */
        public String a(byte[] bArr, int i10, int i11) {
            Charset charset = C5172z.f21469b;
            String str = new String(bArr, i10, i11, charset);
            if (str.indexOf(65533) < 0 || Arrays.equals(str.getBytes(charset), Arrays.copyOfRange(bArr, i10, i11 + i10))) {
                return str;
            }
            throw A.d();
        }

        /* access modifiers changed from: package-private */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0033 A[LOOP:1: B:13:0x0033->B:38:0x00f8, LOOP_START, PHI: r2 r4 r6 r9 r10 r11 
          PHI: (r2v3 int) = (r2v2 int), (r2v5 int) binds: [B:10:0x002f, B:38:0x00f8] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r4v3 long) = (r4v2 long), (r4v4 long) binds: [B:10:0x002f, B:38:0x00f8] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r6v3 long) = (r6v1 long), (r6v4 long) binds: [B:10:0x002f, B:38:0x00f8] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r9v1 java.lang.String) = (r9v0 java.lang.String), (r9v2 java.lang.String) binds: [B:10:0x002f, B:38:0x00f8] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r10v1 java.lang.String) = (r10v0 java.lang.String), (r10v2 java.lang.String) binds: [B:10:0x002f, B:38:0x00f8] A[DONT_GENERATE, DONT_INLINE]
          PHI: (r11v3 long) = (r11v2 long), (r11v4 long) binds: [B:10:0x002f, B:38:0x00f8] A[DONT_GENERATE, DONT_INLINE]] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int b(java.lang.String r25, byte[] r26, int r27, int r28) {
            /*
                r24 = this;
                r0 = r25
                r1 = r26
                r2 = r27
                r3 = r28
                long r4 = (long) r2
                long r6 = (long) r3
                long r6 = r6 + r4
                int r8 = r25.length()
                java.lang.String r9 = " at index "
                java.lang.String r10 = "Failed writing "
                if (r8 > r3) goto L_0x0144
                int r11 = r1.length
                int r11 = r11 - r3
                if (r11 < r2) goto L_0x0144
                r2 = 0
            L_0x001a:
                r11 = 1
                r3 = 128(0x80, float:1.794E-43)
                if (r2 >= r8) goto L_0x002f
                char r13 = r0.charAt(r2)
                if (r13 >= r3) goto L_0x002f
                long r11 = r11 + r4
                byte r3 = (byte) r13
                androidx.datastore.preferences.protobuf.r0.H(r1, r4, r3)
                int r2 = r2 + 1
                r4 = r11
                goto L_0x001a
            L_0x002f:
                if (r2 != r8) goto L_0x0033
                int r0 = (int) r4
                return r0
            L_0x0033:
                if (r2 >= r8) goto L_0x0142
                char r13 = r0.charAt(r2)
                if (r13 >= r3) goto L_0x004f
                int r14 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                if (r14 >= 0) goto L_0x004f
                long r14 = r4 + r11
                byte r13 = (byte) r13
                androidx.datastore.preferences.protobuf.r0.H(r1, r4, r13)
                r22 = r6
                r17 = r10
                r20 = r11
                r4 = r14
                r14 = r9
                goto L_0x00f8
            L_0x004f:
                r14 = 2048(0x800, float:2.87E-42)
                r15 = 2
                if (r13 >= r14) goto L_0x0076
                long r17 = r6 - r15
                int r14 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
                if (r14 > 0) goto L_0x0076
                r14 = r9
                r17 = r10
                long r9 = r4 + r11
                int r11 = r13 >>> 6
                r11 = r11 | 960(0x3c0, float:1.345E-42)
                byte r11 = (byte) r11
                androidx.datastore.preferences.protobuf.r0.H(r1, r4, r11)
                long r4 = r4 + r15
                r11 = r13 & 63
                r11 = r11 | r3
                byte r11 = (byte) r11
                androidx.datastore.preferences.protobuf.r0.H(r1, r9, r11)
            L_0x0070:
                r22 = r6
                r20 = 1
                goto L_0x00f8
            L_0x0076:
                r14 = r9
                r17 = r10
                r9 = 57343(0xdfff, float:8.0355E-41)
                r10 = 55296(0xd800, float:7.7486E-41)
                r11 = 3
                if (r13 < r10) goto L_0x0085
                if (r9 >= r13) goto L_0x00ad
            L_0x0085:
                long r18 = r6 - r11
                int r18 = (r4 > r18 ? 1 : (r4 == r18 ? 0 : -1))
                if (r18 > 0) goto L_0x00ad
                r18 = 1
                long r9 = r4 + r18
                int r11 = r13 >>> 12
                r11 = r11 | 480(0x1e0, float:6.73E-43)
                byte r11 = (byte) r11
                androidx.datastore.preferences.protobuf.r0.H(r1, r4, r11)
                long r11 = r4 + r15
                int r15 = r13 >>> 6
                r15 = r15 & 63
                r15 = r15 | r3
                byte r15 = (byte) r15
                androidx.datastore.preferences.protobuf.r0.H(r1, r9, r15)
                r9 = 3
                long r4 = r4 + r9
                r9 = r13 & 63
                r9 = r9 | r3
                byte r9 = (byte) r9
                androidx.datastore.preferences.protobuf.r0.H(r1, r11, r9)
                goto L_0x0070
            L_0x00ad:
                r11 = 4
                long r20 = r6 - r11
                int r20 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1))
                if (r20 > 0) goto L_0x010c
                int r9 = r2 + 1
                if (r9 == r8) goto L_0x0104
                char r2 = r0.charAt(r9)
                boolean r10 = java.lang.Character.isSurrogatePair(r13, r2)
                if (r10 == 0) goto L_0x0103
                int r2 = java.lang.Character.toCodePoint(r13, r2)
                r20 = 1
                long r11 = r4 + r20
                int r10 = r2 >>> 18
                r10 = r10 | 240(0xf0, float:3.36E-43)
                byte r10 = (byte) r10
                androidx.datastore.preferences.protobuf.r0.H(r1, r4, r10)
                r22 = r6
                long r6 = r4 + r15
                int r10 = r2 >>> 12
                r10 = r10 & 63
                r10 = r10 | r3
                byte r10 = (byte) r10
                androidx.datastore.preferences.protobuf.r0.H(r1, r11, r10)
                r10 = 3
                long r11 = r4 + r10
                int r10 = r2 >>> 6
                r10 = r10 & 63
                r10 = r10 | r3
                byte r10 = (byte) r10
                androidx.datastore.preferences.protobuf.r0.H(r1, r6, r10)
                r6 = 4
                long r4 = r4 + r6
                r2 = r2 & 63
                r2 = r2 | r3
                byte r2 = (byte) r2
                androidx.datastore.preferences.protobuf.r0.H(r1, r11, r2)
                r2 = r9
            L_0x00f8:
                int r2 = r2 + 1
                r9 = r14
                r10 = r17
                r11 = r20
                r6 = r22
                goto L_0x0033
            L_0x0103:
                r2 = r9
            L_0x0104:
                androidx.datastore.preferences.protobuf.s0$d r0 = new androidx.datastore.preferences.protobuf.s0$d
                int r2 = r2 + -1
                r0.<init>(r2, r8)
                throw r0
            L_0x010c:
                if (r10 > r13) goto L_0x0124
                if (r13 > r9) goto L_0x0124
                int r1 = r2 + 1
                if (r1 == r8) goto L_0x011e
                char r0 = r0.charAt(r1)
                boolean r0 = java.lang.Character.isSurrogatePair(r13, r0)
                if (r0 != 0) goto L_0x0124
            L_0x011e:
                androidx.datastore.preferences.protobuf.s0$d r0 = new androidx.datastore.preferences.protobuf.s0$d
                r0.<init>(r2, r8)
                throw r0
            L_0x0124:
                java.lang.ArrayIndexOutOfBoundsException r0 = new java.lang.ArrayIndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r6 = r17
                r1.append(r6)
                r1.append(r13)
                r7 = r14
                r1.append(r7)
                r1.append(r4)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0142:
                int r0 = (int) r4
                return r0
            L_0x0144:
                r7 = r9
                r6 = r10
                java.lang.ArrayIndexOutOfBoundsException r1 = new java.lang.ArrayIndexOutOfBoundsException
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r6)
                int r8 = r8 + -1
                char r0 = r0.charAt(r8)
                r4.append(r0)
                r4.append(r7)
                int r0 = r2 + r3
                r4.append(r0)
                java.lang.String r0 = r4.toString()
                r1.<init>(r0)
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.preferences.protobuf.s0.e.b(java.lang.String, byte[], int, int):int");
        }
    }

    static String a(byte[] bArr, int i10, int i11) {
        return f21438a.a(bArr, i10, i11);
    }

    static int b(String str, byte[] bArr, int i10, int i11) {
        return f21438a.b(str, bArr, i10, i11);
    }

    static int c(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length && str.charAt(i10) < 128) {
            i10++;
        }
        int i11 = length;
        while (true) {
            if (i10 < length) {
                char charAt = str.charAt(i10);
                if (charAt >= 2048) {
                    i11 += d(str, i10);
                    break;
                }
                i11 += (127 - charAt) >>> 31;
                i10++;
            } else {
                break;
            }
        }
        if (i11 >= length) {
            return i11;
        }
        throw new IllegalArgumentException("UTF-8 length does not fit in int: " + (((long) i11) + 4294967296L));
    }

    private static int d(String str, int i10) {
        int length = str.length();
        int i11 = 0;
        while (i10 < length) {
            char charAt = str.charAt(i10);
            if (charAt < 2048) {
                i11 += (127 - charAt) >>> 31;
            } else {
                i11 += 2;
                if (55296 <= charAt && charAt <= 57343) {
                    if (Character.codePointAt(str, i10) >= 65536) {
                        i10++;
                    } else {
                        throw new d(i10, length);
                    }
                }
            }
            i10++;
        }
        return i11;
    }
}

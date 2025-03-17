package ud;

import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import ld.h;
import od.C10106c;
import od.C10108e;
import od.C10109f;

/* renamed from: ud.g  reason: case insensitive filesystem */
final class C10269g {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f77005a = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 38, 13, 9, 44, 58, 35, 45, 46, 36, 47, 43, 37, 42, 61, 94, 0, 32, 0, 0, 0};

    /* renamed from: b  reason: collision with root package name */
    private static final byte[] f77006b = {59, 60, 62, 64, 91, 92, 93, 95, 96, 126, 33, 13, 9, 44, 58, 10, 45, 46, 36, 47, 34, 124, 42, 40, 41, 63, 123, 125, 39, 0};

    /* renamed from: c  reason: collision with root package name */
    private static final byte[] f77007c;

    /* renamed from: d  reason: collision with root package name */
    private static final byte[] f77008d = new byte[128];

    /* renamed from: e  reason: collision with root package name */
    private static final Charset f77009e = StandardCharsets.ISO_8859_1;

    /* renamed from: ud.g$a */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f77010a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                ud.c[] r0 = ud.C10265c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f77010a = r0
                ud.c r1 = ud.C10265c.TEXT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f77010a     // Catch:{ NoSuchFieldError -> 0x001d }
                ud.c r1 = ud.C10265c.BYTE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f77010a     // Catch:{ NoSuchFieldError -> 0x0028 }
                ud.c r1 = ud.C10265c.NUMERIC     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: ud.C10269g.a.<clinit>():void");
        }
    }

    /* renamed from: ud.g$b */
    private static final class b implements C10108e {

        /* renamed from: a  reason: collision with root package name */
        String f77011a;

        /* synthetic */ b(String str, a aVar) {
            this(str);
        }

        public boolean a(int i10) {
            return false;
        }

        public int b(int i10) {
            return -1;
        }

        public char charAt(int i10) {
            return this.f77011a.charAt(i10);
        }

        public int length() {
            return this.f77011a.length();
        }

        public CharSequence subSequence(int i10, int i11) {
            return this.f77011a.subSequence(i10, i11);
        }

        public String toString() {
            return this.f77011a;
        }

        private b(String str) {
            this.f77011a = str;
        }
    }

    static {
        int i10 = 0;
        byte[] bArr = new byte[128];
        f77007c = bArr;
        Arrays.fill(bArr, (byte) -1);
        int i11 = 0;
        while (true) {
            byte[] bArr2 = f77005a;
            if (i11 >= bArr2.length) {
                break;
            }
            byte b10 = bArr2[i11];
            if (b10 > 0) {
                f77007c[b10] = (byte) i11;
            }
            i11++;
        }
        Arrays.fill(f77008d, (byte) -1);
        while (true) {
            byte[] bArr3 = f77006b;
            if (i10 < bArr3.length) {
                byte b11 = bArr3[i10];
                if (b11 > 0) {
                    f77008d[b11] = (byte) i10;
                }
                i10++;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0025, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0011 A[LOOP:1: B:6:0x0011->B:13:0x0029, LOOP_START, PHI: r2 r3 
      PHI: (r2v1 int) = (r2v0 int), (r2v5 int) binds: [B:5:0x000f, B:13:0x0029] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r3v1 int) = (r3v0 int), (r3v4 int) binds: [B:5:0x000f, B:13:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int a(od.C10108e r6, int r7, java.nio.charset.Charset r8) {
        /*
            if (r8 != 0) goto L_0x0004
            r8 = 0
            goto L_0x0008
        L_0x0004:
            java.nio.charset.CharsetEncoder r8 = r8.newEncoder()
        L_0x0008:
            int r0 = r6.length()
            r1 = r7
        L_0x000d:
            if (r1 >= r0) goto L_0x0067
            r2 = 0
            r3 = r1
        L_0x0011:
            r4 = 13
            if (r2 >= r4) goto L_0x002b
            boolean r5 = r6.a(r3)
            if (r5 != 0) goto L_0x002b
            char r3 = r6.charAt(r3)
            boolean r3 = l(r3)
            if (r3 == 0) goto L_0x002b
            int r2 = r2 + 1
            int r3 = r1 + r2
            if (r3 < r0) goto L_0x0011
        L_0x002b:
            if (r2 < r4) goto L_0x002f
            int r1 = r1 - r7
            return r1
        L_0x002f:
            if (r8 == 0) goto L_0x0064
            char r2 = r6.charAt(r1)
            boolean r2 = r8.canEncode(r2)
            if (r2 == 0) goto L_0x003c
            goto L_0x0064
        L_0x003c:
            char r6 = r6.charAt(r1)
            ld.h r7 = new ld.h
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "Non-encodable character detected: "
            r8.append(r0)
            r8.append(r6)
            java.lang.String r0 = " (Unicode: "
            r8.append(r0)
            r8.append(r6)
            r6 = 41
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r7.<init>(r6)
            throw r7
        L_0x0064:
            int r1 = r1 + 1
            goto L_0x000d
        L_0x0067:
            int r1 = r1 - r7
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ud.C10269g.a(od.e, int, java.nio.charset.Charset):int");
    }

    private static int b(C10108e eVar, int i10) {
        int length = eVar.length();
        int i11 = 0;
        if (i10 < length) {
            while (i10 < length && !eVar.a(i10) && l(eVar.charAt(i10))) {
                i11++;
                i10++;
            }
        }
        return i11;
    }

    private static int c(C10108e eVar, int i10) {
        int length = eVar.length();
        int i11 = i10;
        while (i11 < length) {
            int i12 = 0;
            while (i12 < 13 && i11 < length && !eVar.a(i11) && l(eVar.charAt(i11))) {
                i12++;
                i11++;
            }
            if (i12 >= 13) {
                return (i11 - i10) - i12;
            }
            if (i12 <= 0) {
                if (eVar.a(i11) || !o(eVar.charAt(i11))) {
                    break;
                }
                i11++;
            }
        }
        return i11 - i10;
    }

    private static void d(byte[] bArr, int i10, int i11, int i12, StringBuilder sb2) {
        int i13;
        if (i11 == 1 && i12 == 0) {
            sb2.append(913);
        } else if (i11 % 6 == 0) {
            sb2.append(924);
        } else {
            sb2.append(901);
        }
        if (i11 >= 6) {
            char[] cArr = new char[5];
            i13 = i10;
            while ((i10 + i11) - i13 >= 6) {
                long j10 = 0;
                for (int i14 = 0; i14 < 6; i14++) {
                    j10 = (j10 << 8) + ((long) (bArr[i13 + i14] & 255));
                }
                for (int i15 = 0; i15 < 5; i15++) {
                    cArr[i15] = (char) ((int) (j10 % 900));
                    j10 /= 900;
                }
                for (int i16 = 4; i16 >= 0; i16--) {
                    sb2.append(cArr[i16]);
                }
                i13 += 6;
            }
        } else {
            i13 = i10;
        }
        while (i13 < i10 + i11) {
            sb2.append((char) (bArr[i13] & 255));
            i13++;
        }
    }

    static String e(String str, C10265c cVar, Charset charset, boolean z10) {
        C10108e eVar;
        C10106c b10;
        if (!str.isEmpty()) {
            if (charset == null && !z10) {
                int i10 = 0;
                while (i10 < str.length()) {
                    if (str.charAt(i10) <= 255) {
                        i10++;
                    } else {
                        throw new h("Non-encodable character detected: " + str.charAt(i10) + " (Unicode: " + str.charAt(i10) + "). Consider specifying EncodeHintType.PDF417_AUTO_ECI and/or EncodeTypeHint.CHARACTER_SET.");
                    }
                }
            }
            StringBuilder sb2 = new StringBuilder(str.length());
            if (z10) {
                eVar = new C10109f(str, charset, -1);
            } else {
                eVar = new b(str, (a) null);
                if (charset == null) {
                    charset = f77009e;
                } else if (!f77009e.equals(charset) && (b10 = C10106c.b(charset)) != null) {
                    i(b10.m(), sb2);
                }
            }
            int length = eVar.length();
            int i11 = a.f77010a[cVar.ordinal()];
            if (i11 == 1) {
                h(eVar, 0, length, sb2, 0);
            } else if (i11 != 2) {
                if (i11 != 3) {
                    int i12 = 0;
                    int i13 = 0;
                    int i14 = 0;
                    while (i12 < length) {
                        while (i12 < length && eVar.a(i12)) {
                            i(eVar.b(i12), sb2);
                            i12++;
                        }
                        if (i12 >= length) {
                            break;
                        }
                        int b11 = b(eVar, i12);
                        if (b11 >= 13) {
                            sb2.append(902);
                            g(eVar, i12, b11, sb2);
                            i12 += b11;
                            i13 = 0;
                            i14 = 2;
                        } else {
                            int c10 = c(eVar, i12);
                            if (c10 >= 5 || b11 == length) {
                                if (i14 != 0) {
                                    sb2.append(900);
                                    i13 = 0;
                                    i14 = 0;
                                }
                                i13 = h(eVar, i12, c10, sb2, i13);
                                i12 += c10;
                            } else {
                                int a10 = a(eVar, i12, z10 ? null : charset);
                                if (a10 == 0) {
                                    a10 = 1;
                                }
                                byte[] bytes = z10 ? null : eVar.subSequence(i12, i12 + a10).toString().getBytes(charset);
                                if ((!(bytes == null && a10 == 1) && (bytes == null || bytes.length != 1)) || i14 != 0) {
                                    if (z10) {
                                        f(eVar, i12, i12 + a10, i14, sb2);
                                    } else {
                                        d(bytes, 0, bytes.length, i14, sb2);
                                    }
                                    i13 = 0;
                                    i14 = 1;
                                } else if (z10) {
                                    f(eVar, i12, 1, 0, sb2);
                                } else {
                                    d(bytes, 0, 1, 0, sb2);
                                }
                                i12 += a10;
                            }
                        }
                    }
                } else {
                    sb2.append(902);
                    g(eVar, 0, length, sb2);
                }
            } else if (z10) {
                f(eVar, 0, eVar.length(), 0, sb2);
            } else {
                byte[] bytes2 = eVar.toString().getBytes(charset);
                d(bytes2, 0, bytes2.length, 1, sb2);
            }
            return sb2.toString();
        }
        throw new h("Empty message not allowed");
    }

    private static void f(C10108e eVar, int i10, int i11, int i12, StringBuilder sb2) {
        int min = Math.min(i11 + i10, eVar.length());
        int i13 = i10;
        while (true) {
            if (i13 >= min || !eVar.a(i13)) {
                int i14 = i13;
                while (i14 < min && !eVar.a(i14)) {
                    i14++;
                }
                int i15 = i14 - i13;
                if (i15 > 0) {
                    d(p(eVar, i13, i14), 0, i15, i13 == i10 ? i12 : 1, sb2);
                    i13 = i14;
                } else {
                    return;
                }
            } else {
                i(eVar.b(i13), sb2);
                i13++;
            }
        }
    }

    private static void g(C10108e eVar, int i10, int i11, StringBuilder sb2) {
        StringBuilder sb3 = new StringBuilder((i11 / 3) + 1);
        BigInteger valueOf = BigInteger.valueOf(900);
        BigInteger valueOf2 = BigInteger.valueOf(0);
        int i12 = 0;
        while (i12 < i11) {
            sb3.setLength(0);
            int min = Math.min(44, i11 - i12);
            StringBuilder sb4 = new StringBuilder();
            sb4.append("1");
            int i13 = i10 + i12;
            sb4.append(eVar.subSequence(i13, i13 + min));
            BigInteger bigInteger = new BigInteger(sb4.toString());
            do {
                sb3.append((char) bigInteger.mod(valueOf).intValue());
                bigInteger = bigInteger.divide(valueOf);
            } while (!bigInteger.equals(valueOf2));
            for (int length = sb3.length() - 1; length >= 0; length--) {
                sb2.append(sb3.charAt(length));
            }
            i12 += min;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:70:0x010b A[EDGE_INSN: B:70:0x010b->B:58:0x010b ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x000f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int h(od.C10108e r16, int r17, int r18, java.lang.StringBuilder r19, int r20) {
        /*
            r0 = r16
            r1 = r18
            r2 = r19
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>(r1)
            r4 = 0
            r5 = r20
            r6 = r4
        L_0x000f:
            int r7 = r17 + r6
            boolean r8 = r0.a(r7)
            if (r8 == 0) goto L_0x0021
            int r7 = r0.b(r7)
            i(r7, r2)
            int r6 = r6 + 1
            goto L_0x000f
        L_0x0021:
            char r8 = r0.charAt(r7)
            r9 = 26
            r10 = 32
            r11 = 27
            r12 = 28
            r13 = 29
            r14 = 2
            r15 = 1
            if (r5 == 0) goto L_0x00d4
            if (r5 == r15) goto L_0x0099
            if (r5 == r14) goto L_0x004c
            boolean r7 = n(r8)
            if (r7 == 0) goto L_0x0047
            byte[] r7 = f77008d
            byte r7 = r7[r8]
            char r7 = (char) r7
            r3.append(r7)
            goto L_0x0107
        L_0x0047:
            r3.append(r13)
        L_0x004a:
            r5 = r4
            goto L_0x000f
        L_0x004c:
            boolean r9 = m(r8)
            if (r9 == 0) goto L_0x005c
            byte[] r7 = f77007c
            byte r7 = r7[r8]
            char r7 = (char) r7
            r3.append(r7)
            goto L_0x0107
        L_0x005c:
            boolean r9 = k(r8)
            if (r9 == 0) goto L_0x0066
            r3.append(r12)
            goto L_0x004a
        L_0x0066:
            boolean r9 = j(r8)
            if (r9 == 0) goto L_0x0071
            r3.append(r11)
        L_0x006f:
            r5 = r15
            goto L_0x000f
        L_0x0071:
            int r7 = r7 + 1
            if (r7 >= r1) goto L_0x008c
            boolean r9 = r0.a(r7)
            if (r9 != 0) goto L_0x008c
            char r7 = r0.charAt(r7)
            boolean r7 = n(r7)
            if (r7 == 0) goto L_0x008c
            r5 = 25
            r3.append(r5)
            r5 = 3
            goto L_0x000f
        L_0x008c:
            r3.append(r13)
            byte[] r7 = f77008d
            byte r7 = r7[r8]
            char r7 = (char) r7
            r3.append(r7)
            goto L_0x0107
        L_0x0099:
            boolean r7 = j(r8)
            if (r7 == 0) goto L_0x00ac
            if (r8 != r10) goto L_0x00a5
            r3.append(r9)
            goto L_0x0107
        L_0x00a5:
            int r8 = r8 + -97
            char r7 = (char) r8
            r3.append(r7)
            goto L_0x0107
        L_0x00ac:
            boolean r7 = k(r8)
            if (r7 == 0) goto L_0x00bc
            r3.append(r11)
            int r8 = r8 + -65
            char r7 = (char) r8
            r3.append(r7)
            goto L_0x0107
        L_0x00bc:
            boolean r7 = m(r8)
            if (r7 == 0) goto L_0x00c8
            r3.append(r12)
        L_0x00c5:
            r5 = r14
            goto L_0x000f
        L_0x00c8:
            r3.append(r13)
            byte[] r7 = f77008d
            byte r7 = r7[r8]
            char r7 = (char) r7
            r3.append(r7)
            goto L_0x0107
        L_0x00d4:
            boolean r7 = k(r8)
            if (r7 == 0) goto L_0x00e7
            if (r8 != r10) goto L_0x00e0
            r3.append(r9)
            goto L_0x0107
        L_0x00e0:
            int r8 = r8 + -65
            char r7 = (char) r8
            r3.append(r7)
            goto L_0x0107
        L_0x00e7:
            boolean r7 = j(r8)
            if (r7 == 0) goto L_0x00f2
            r3.append(r11)
            goto L_0x006f
        L_0x00f2:
            boolean r7 = m(r8)
            if (r7 == 0) goto L_0x00fc
            r3.append(r12)
            goto L_0x00c5
        L_0x00fc:
            r3.append(r13)
            byte[] r7 = f77008d
            byte r7 = r7[r8]
            char r7 = (char) r7
            r3.append(r7)
        L_0x0107:
            int r6 = r6 + 1
            if (r6 < r1) goto L_0x000f
            int r0 = r3.length()
            r1 = r4
        L_0x0110:
            if (r4 >= r0) goto L_0x0129
            int r6 = r4 % 2
            if (r6 == 0) goto L_0x0122
            int r1 = r1 * 30
            char r6 = r3.charAt(r4)
            int r1 = r1 + r6
            char r1 = (char) r1
            r2.append(r1)
            goto L_0x0126
        L_0x0122:
            char r1 = r3.charAt(r4)
        L_0x0126:
            int r4 = r4 + 1
            goto L_0x0110
        L_0x0129:
            int r0 = r0 % r14
            if (r0 == 0) goto L_0x0133
            int r1 = r1 * 30
            int r1 = r1 + r13
            char r0 = (char) r1
            r2.append(r0)
        L_0x0133:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ud.C10269g.h(od.e, int, int, java.lang.StringBuilder, int):int");
    }

    private static void i(int i10, StringBuilder sb2) {
        if (i10 >= 0 && i10 < 900) {
            sb2.append(927);
            sb2.append((char) i10);
        } else if (i10 < 810900) {
            sb2.append(926);
            sb2.append((char) ((i10 / 900) - 1));
            sb2.append((char) (i10 % 900));
        } else if (i10 < 811800) {
            sb2.append(925);
            sb2.append((char) (810900 - i10));
        } else {
            throw new h("ECI number not in valid range from 0..811799, but was " + i10);
        }
    }

    private static boolean j(char c10) {
        return c10 == ' ' || (c10 >= 'a' && c10 <= 'z');
    }

    private static boolean k(char c10) {
        return c10 == ' ' || (c10 >= 'A' && c10 <= 'Z');
    }

    private static boolean l(char c10) {
        return c10 >= '0' && c10 <= '9';
    }

    private static boolean m(char c10) {
        return f77007c[c10] != -1;
    }

    private static boolean n(char c10) {
        return f77008d[c10] != -1;
    }

    private static boolean o(char c10) {
        return c10 == 9 || c10 == 10 || c10 == 13 || (c10 >= ' ' && c10 <= '~');
    }

    static byte[] p(C10108e eVar, int i10, int i11) {
        byte[] bArr = new byte[(i11 - i10)];
        for (int i12 = i10; i12 < i11; i12++) {
            bArr[i12 - i10] = (byte) (eVar.charAt(i12) & 255);
        }
        return bArr;
    }
}

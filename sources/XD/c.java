package xd;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import ld.h;
import od.C10104a;
import od.C10106c;
import od.C10110g;
import pd.C10135a;
import wd.C10359a;
import wd.C10360b;
import wd.C10361c;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f77718a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* renamed from: b  reason: collision with root package name */
    static final Charset f77719b = StandardCharsets.ISO_8859_1;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f77720a;

        /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(3:7|8|10)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        static {
            /*
                wd.b[] r0 = wd.C10360b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f77720a = r0
                wd.b r1 = wd.C10360b.NUMERIC     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f77720a     // Catch:{ NoSuchFieldError -> 0x001d }
                wd.b r1 = wd.C10360b.ALPHANUMERIC     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f77720a     // Catch:{ NoSuchFieldError -> 0x0028 }
                wd.b r1 = wd.C10360b.BYTE     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = f77720a     // Catch:{ NoSuchFieldError -> 0x0033 }
                wd.b r1 = wd.C10360b.KANJI     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: xd.c.a.<clinit>():void");
        }
    }

    static void a(String str, C10104a aVar, Charset charset) {
        for (byte c10 : str.getBytes(charset)) {
            aVar.c(c10, 8);
        }
    }

    static void b(CharSequence charSequence, C10104a aVar) {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length) {
            int p10 = p(charSequence.charAt(i10));
            if (p10 != -1) {
                int i11 = i10 + 1;
                if (i11 < length) {
                    int p11 = p(charSequence.charAt(i11));
                    if (p11 != -1) {
                        aVar.c((p10 * 45) + p11, 11);
                        i10 += 2;
                    } else {
                        throw new h();
                    }
                } else {
                    aVar.c(p10, 6);
                    i10 = i11;
                }
            } else {
                throw new h();
            }
        }
    }

    static void c(String str, C10360b bVar, C10104a aVar, Charset charset) {
        int i10 = a.f77720a[bVar.ordinal()];
        if (i10 == 1) {
            h(str, aVar);
        } else if (i10 == 2) {
            b(str, aVar);
        } else if (i10 == 3) {
            a(str, aVar, charset);
        } else if (i10 == 4) {
            e(str, aVar);
        } else {
            throw new h("Invalid mode: " + bVar);
        }
    }

    private static void d(C10106c cVar, C10104a aVar) {
        aVar.c(C10360b.ECI.b(), 4);
        aVar.c(cVar.m(), 8);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003c A[LOOP:0: B:3:0x000f->B:16:0x003c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x004b A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void e(java.lang.String r6, od.C10104a r7) {
        /*
            java.nio.charset.Charset r0 = od.C10110g.f75695b
            byte[] r6 = r6.getBytes(r0)
            int r0 = r6.length
            int r0 = r0 % 2
            if (r0 != 0) goto L_0x0054
            int r0 = r6.length
            int r0 = r0 + -1
            r1 = 0
        L_0x000f:
            if (r1 >= r0) goto L_0x0053
            byte r2 = r6[r1]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r1 + 1
            byte r3 = r6[r3]
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 8
            r2 = r2 | r3
            r3 = 33088(0x8140, float:4.6366E-41)
            r4 = -1
            if (r2 < r3) goto L_0x002b
            r5 = 40956(0x9ffc, float:5.7392E-41)
            if (r2 > r5) goto L_0x002b
        L_0x0029:
            int r2 = r2 - r3
            goto L_0x003a
        L_0x002b:
            r3 = 57408(0xe040, float:8.0446E-41)
            if (r2 < r3) goto L_0x0039
            r3 = 60351(0xebbf, float:8.457E-41)
            if (r2 > r3) goto L_0x0039
            r3 = 49472(0xc140, float:6.9325E-41)
            goto L_0x0029
        L_0x0039:
            r2 = r4
        L_0x003a:
            if (r2 == r4) goto L_0x004b
            int r3 = r2 >> 8
            int r3 = r3 * 192
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r3 + r2
            r2 = 13
            r7.c(r3, r2)
            int r1 = r1 + 2
            goto L_0x000f
        L_0x004b:
            ld.h r6 = new ld.h
            java.lang.String r7 = "Invalid byte sequence"
            r6.<init>(r7)
            throw r6
        L_0x0053:
            return
        L_0x0054:
            ld.h r6 = new ld.h
            java.lang.String r7 = "Kanji byte size not even"
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: xd.c.e(java.lang.String, od.a):void");
    }

    static void f(int i10, C10361c cVar, C10360b bVar, C10104a aVar) {
        int j10 = bVar.j(cVar);
        int i11 = 1 << j10;
        if (i10 < i11) {
            aVar.c(i10, j10);
            return;
        }
        throw new h(i10 + " is bigger than " + (i11 - 1));
    }

    static void g(C10360b bVar, C10104a aVar) {
        aVar.c(bVar.b(), 4);
    }

    static void h(CharSequence charSequence, C10104a aVar) {
        int length = charSequence.length();
        int i10 = 0;
        while (i10 < length) {
            int charAt = charSequence.charAt(i10) - '0';
            int i11 = i10 + 2;
            if (i11 < length) {
                aVar.c((charAt * 100) + ((charSequence.charAt(i10 + 1) - '0') * 10) + (charSequence.charAt(i11) - '0'), 10);
                i10 += 3;
            } else {
                i10++;
                if (i10 < length) {
                    aVar.c((charAt * 10) + (charSequence.charAt(i10) - '0'), 7);
                    i10 = i11;
                } else {
                    aVar.c(charAt, 4);
                }
            }
        }
    }

    private static int i(C10360b bVar, C10104a aVar, C10104a aVar2, C10361c cVar) {
        return aVar.j() + bVar.j(cVar) + aVar2.j();
    }

    private static int j(C10385b bVar) {
        return d.a(bVar) + d.c(bVar) + d.d(bVar) + d.e(bVar);
    }

    private static int k(C10104a aVar, C10359a aVar2, C10361c cVar, C10385b bVar) {
        int i10 = Integer.MAX_VALUE;
        int i11 = -1;
        for (int i12 = 0; i12 < 8; i12++) {
            e.a(aVar, aVar2, cVar, i12, bVar);
            int j10 = j(bVar);
            if (j10 < i10) {
                i11 = i12;
                i10 = j10;
            }
        }
        return i11;
    }

    private static C10360b l(String str, Charset charset) {
        if (C10110g.f75695b.equals(charset) && s(str)) {
            return C10360b.KANJI;
        }
        boolean z10 = false;
        boolean z11 = false;
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (charAt >= '0' && charAt <= '9') {
                z11 = true;
            } else if (p(charAt) == -1) {
                return C10360b.BYTE;
            } else {
                z10 = true;
            }
        }
        return z10 ? C10360b.ALPHANUMERIC : z11 ? C10360b.NUMERIC : C10360b.BYTE;
    }

    private static C10361c m(int i10, C10359a aVar) {
        for (int i11 = 1; i11 <= 40; i11++) {
            C10361c e10 = C10361c.e(i11);
            if (v(i10, e10, aVar)) {
                return e10;
            }
        }
        throw new h("Data too big");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:55:0x013a, code lost:
        if (xd.g.b(r8) != false) goto L_0x013e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0140  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static xd.g n(java.lang.String r6, wd.C10359a r7, java.util.Map<ld.C10010c, ?> r8) {
        /*
            r0 = 0
            r1 = 1
            if (r8 == 0) goto L_0x001c
            ld.c r2 = ld.C10010c.GS1_FORMAT
            boolean r3 = r8.containsKey(r2)
            if (r3 == 0) goto L_0x001c
            java.lang.Object r2 = r8.get(r2)
            java.lang.String r2 = r2.toString()
            boolean r2 = java.lang.Boolean.parseBoolean(r2)
            if (r2 == 0) goto L_0x001c
            r2 = r1
            goto L_0x001d
        L_0x001c:
            r2 = r0
        L_0x001d:
            if (r8 == 0) goto L_0x0037
            ld.c r3 = ld.C10010c.QR_COMPACT
            boolean r4 = r8.containsKey(r3)
            if (r4 == 0) goto L_0x0037
            java.lang.Object r3 = r8.get(r3)
            java.lang.String r3 = r3.toString()
            boolean r3 = java.lang.Boolean.parseBoolean(r3)
            if (r3 == 0) goto L_0x0037
            r3 = r1
            goto L_0x0038
        L_0x0037:
            r3 = r0
        L_0x0038:
            java.nio.charset.Charset r4 = f77719b
            if (r8 == 0) goto L_0x0045
            ld.c r5 = ld.C10010c.CHARACTER_SET
            boolean r5 = r8.containsKey(r5)
            if (r5 == 0) goto L_0x0045
            r0 = r1
        L_0x0045:
            if (r0 == 0) goto L_0x0056
            ld.c r1 = ld.C10010c.CHARACTER_SET
            java.lang.Object r1 = r8.get(r1)
            java.lang.String r1 = r1.toString()
            java.nio.charset.Charset r1 = java.nio.charset.Charset.forName(r1)
            goto L_0x0057
        L_0x0056:
            r1 = r4
        L_0x0057:
            if (r3 == 0) goto L_0x0075
            wd.b r0 = wd.C10360b.BYTE
            boolean r3 = r1.equals(r4)
            r4 = 0
            if (r3 == 0) goto L_0x0063
            r1 = r4
        L_0x0063:
            xd.f$c r6 = xd.f.h(r6, r4, r1, r2, r7)
            od.a r1 = new od.a
            r1.<init>()
            r6.b(r1)
            wd.c r6 = r6.e()
            goto L_0x00ec
        L_0x0075:
            wd.b r3 = l(r6, r1)
            od.a r4 = new od.a
            r4.<init>()
            wd.b r5 = wd.C10360b.BYTE
            if (r3 != r5) goto L_0x008d
            if (r0 == 0) goto L_0x008d
            od.c r0 = od.C10106c.b(r1)
            if (r0 == 0) goto L_0x008d
            d(r0, r4)
        L_0x008d:
            if (r2 == 0) goto L_0x0094
            wd.b r0 = wd.C10360b.FNC1_FIRST_POSITION
            g(r0, r4)
        L_0x0094:
            g(r3, r4)
            od.a r0 = new od.a
            r0.<init>()
            c(r6, r3, r0, r1)
            if (r8 == 0) goto L_0x00cc
            ld.c r1 = ld.C10010c.QR_VERSION
            boolean r2 = r8.containsKey(r1)
            if (r2 == 0) goto L_0x00cc
            java.lang.Object r1 = r8.get(r1)
            java.lang.String r1 = r1.toString()
            int r1 = java.lang.Integer.parseInt(r1)
            wd.c r1 = wd.C10361c.e(r1)
            int r2 = i(r3, r4, r0, r1)
            boolean r2 = v(r2, r1, r7)
            if (r2 == 0) goto L_0x00c4
            goto L_0x00d0
        L_0x00c4:
            ld.h r6 = new ld.h
            java.lang.String r7 = "Data too big for requested version"
            r6.<init>(r7)
            throw r6
        L_0x00cc:
            wd.c r1 = t(r7, r3, r4, r0)
        L_0x00d0:
            od.a r2 = new od.a
            r2.<init>()
            r2.b(r4)
            if (r3 != r5) goto L_0x00df
            int r6 = r0.k()
            goto L_0x00e3
        L_0x00df:
            int r6 = r6.length()
        L_0x00e3:
            f(r6, r1, r3, r2)
            r2.b(r0)
            r6 = r1
            r1 = r2
            r0 = r3
        L_0x00ec:
            wd.c$b r2 = r6.c(r7)
            int r3 = r6.d()
            int r4 = r2.d()
            int r3 = r3 - r4
            u(r3, r1)
            int r4 = r6.d()
            int r2 = r2.c()
            od.a r1 = r(r1, r4, r3, r2)
            xd.g r2 = new xd.g
            r2.<init>()
            r2.c(r7)
            r2.f(r0)
            r2.g(r6)
            int r0 = r6.b()
            xd.b r3 = new xd.b
            r3.<init>(r0, r0)
            r0 = -1
            if (r8 == 0) goto L_0x013d
            ld.c r4 = ld.C10010c.QR_MASK_PATTERN
            boolean r5 = r8.containsKey(r4)
            if (r5 == 0) goto L_0x013d
            java.lang.Object r8 = r8.get(r4)
            java.lang.String r8 = r8.toString()
            int r8 = java.lang.Integer.parseInt(r8)
            boolean r4 = xd.g.b(r8)
            if (r4 == 0) goto L_0x013d
            goto L_0x013e
        L_0x013d:
            r8 = r0
        L_0x013e:
            if (r8 != r0) goto L_0x0144
            int r8 = k(r1, r7, r6, r3)
        L_0x0144:
            r2.d(r8)
            xd.e.a(r1, r7, r6, r8, r3)
            r2.e(r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: xd.c.n(java.lang.String, wd.a, java.util.Map):xd.g");
    }

    static byte[] o(byte[] bArr, int i10) {
        int length = bArr.length;
        int[] iArr = new int[(length + i10)];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = bArr[i11] & 255;
        }
        new pd.c(C10135a.f75838l).b(iArr, i10);
        byte[] bArr2 = new byte[i10];
        for (int i12 = 0; i12 < i10; i12++) {
            bArr2[i12] = (byte) iArr[length + i12];
        }
        return bArr2;
    }

    static int p(int i10) {
        int[] iArr = f77718a;
        if (i10 < iArr.length) {
            return iArr[i10];
        }
        return -1;
    }

    static void q(int i10, int i11, int i12, int i13, int[] iArr, int[] iArr2) {
        if (i13 < i12) {
            int i14 = i10 % i12;
            int i15 = i12 - i14;
            int i16 = i10 / i12;
            int i17 = i16 + 1;
            int i18 = i11 / i12;
            int i19 = i18 + 1;
            int i20 = i16 - i18;
            int i21 = i17 - i19;
            if (i20 != i21) {
                throw new h("EC bytes mismatch");
            } else if (i12 != i15 + i14) {
                throw new h("RS blocks mismatch");
            } else if (i10 != ((i18 + i20) * i15) + ((i19 + i21) * i14)) {
                throw new h("Total bytes mismatch");
            } else if (i13 < i15) {
                iArr[0] = i18;
                iArr2[0] = i20;
            } else {
                iArr[0] = i19;
                iArr2[0] = i21;
            }
        } else {
            throw new h("Block ID too large");
        }
    }

    static C10104a r(C10104a aVar, int i10, int i11, int i12) {
        int i13 = i10;
        int i14 = i11;
        int i15 = i12;
        if (aVar.k() == i14) {
            ArrayList<C10384a> arrayList = new ArrayList<>(i15);
            int i16 = 0;
            int i17 = 0;
            int i18 = 0;
            for (int i19 = 0; i19 < i15; i19++) {
                int[] iArr = new int[1];
                int[] iArr2 = new int[1];
                q(i10, i11, i12, i19, iArr, iArr2);
                int i20 = iArr[0];
                byte[] bArr = new byte[i20];
                aVar.m(i16 * 8, bArr, 0, i20);
                byte[] o10 = o(bArr, iArr2[0]);
                arrayList.add(new C10384a(bArr, o10));
                i17 = Math.max(i17, i20);
                i18 = Math.max(i18, o10.length);
                i16 += iArr[0];
            }
            if (i14 == i16) {
                C10104a aVar2 = new C10104a();
                for (int i21 = 0; i21 < i17; i21++) {
                    for (C10384a a10 : arrayList) {
                        byte[] a11 = a10.a();
                        if (i21 < a11.length) {
                            aVar2.c(a11[i21], 8);
                        }
                    }
                }
                for (int i22 = 0; i22 < i18; i22++) {
                    for (C10384a b10 : arrayList) {
                        byte[] b11 = b10.b();
                        if (i22 < b11.length) {
                            aVar2.c(b11[i22], 8);
                        }
                    }
                }
                if (i13 == aVar2.k()) {
                    return aVar2;
                }
                throw new h("Interleaving error: " + i13 + " and " + aVar2.k() + " differ.");
            }
            throw new h("Data bytes does not match offset");
        }
        throw new h("Number of bits and data bytes does not match");
    }

    static boolean s(String str) {
        byte[] bytes = str.getBytes(C10110g.f75695b);
        int length = bytes.length;
        if (length % 2 != 0) {
            return false;
        }
        for (int i10 = 0; i10 < length; i10 += 2) {
            byte b10 = bytes[i10] & 255;
            if ((b10 < 129 || b10 > 159) && (b10 < 224 || b10 > 235)) {
                return false;
            }
        }
        return true;
    }

    private static C10361c t(C10359a aVar, C10360b bVar, C10104a aVar2, C10104a aVar3) {
        return m(i(bVar, aVar2, aVar3, m(i(bVar, aVar2, aVar3, C10361c.e(1)), aVar)), aVar);
    }

    static void u(int i10, C10104a aVar) {
        int i11 = i10 * 8;
        if (aVar.j() <= i11) {
            for (int i12 = 0; i12 < 4 && aVar.j() < i11; i12++) {
                aVar.a(false);
            }
            int j10 = aVar.j() & 7;
            if (j10 > 0) {
                while (j10 < 8) {
                    aVar.a(false);
                    j10++;
                }
            }
            int k10 = i10 - aVar.k();
            for (int i13 = 0; i13 < k10; i13++) {
                aVar.c((i13 & 1) == 0 ? 236 : 17, 8);
            }
            if (aVar.j() != i11) {
                throw new h("Bits size does not equal capacity");
            }
            return;
        }
        throw new h("data bits cannot fit in the QR Code" + aVar.j() + " > " + i11);
    }

    static boolean v(int i10, C10361c cVar, C10359a aVar) {
        return cVar.d() - cVar.c(aVar).d() >= (i10 + 7) / 8;
    }
}

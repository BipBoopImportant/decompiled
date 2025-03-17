package rd;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import od.C10109f;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    static final char[] f76398a = {'!', '\"', '#', '$', '%', '&', '\'', '(', ')', '*', '+', ',', '-', '.', '/', ':', ';', '<', '=', '>', '?', '@', '[', '\\', ']', '^', '_'};

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f76399a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f76400b;

        /* JADX WARNING: Can't wrap try/catch for region: R(16:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|(3:19|20|22)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|1|2|3|(2:5|6)|7|9|10|11|12|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0038 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0059 */
        static {
            /*
                rd.m[] r0 = rd.m.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f76400b = r0
                r1 = 1
                rd.m r2 = rd.m.FORCE_SQUARE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f76400b     // Catch:{ NoSuchFieldError -> 0x001d }
                rd.m r3 = rd.m.FORCE_RECTANGLE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                rd.k$d[] r2 = rd.k.d.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f76399a = r2
                rd.k$d r3 = rd.k.d.ASCII     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r1 = f76399a     // Catch:{ NoSuchFieldError -> 0x0038 }
                rd.k$d r2 = rd.k.d.B256     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                int[] r0 = f76399a     // Catch:{ NoSuchFieldError -> 0x0043 }
                rd.k$d r1 = rd.k.d.C40     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f76399a     // Catch:{ NoSuchFieldError -> 0x004e }
                rd.k$d r1 = rd.k.d.TEXT     // Catch:{ NoSuchFieldError -> 0x004e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r0 = f76399a     // Catch:{ NoSuchFieldError -> 0x0059 }
                rd.k$d r1 = rd.k.d.X12     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                int[] r0 = f76399a     // Catch:{ NoSuchFieldError -> 0x0064 }
                rd.k$d r1 = rd.k.d.EDF     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: rd.k.a.<clinit>():void");
        }
    }

    private static final class b {

        /* renamed from: g  reason: collision with root package name */
        private static final int[] f76401g = {3, 5, 8, 10, 12, 16, 18, 22, 30, 32, 36, 44, 49, 62, 86, 114, 144, 174, 204, 280, 368, 456, 576, 696, 816, 1050, 1304, 1558};

        /* renamed from: h  reason: collision with root package name */
        private static final int[] f76402h = {3, 5, 8, 12, 18, 22, 30, 36, 44, 62, 86, 114, 144, 174, 204, 280, 368, 456, 576, 696, 816, 1050, 1304, 1558};

        /* renamed from: i  reason: collision with root package name */
        private static final int[] f76403i = {5, 10, 16, 33, 32, 49};
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final c f76404a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final d f76405b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final int f76406c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public final int f76407d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public final b f76408e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public final int f76409f;

        /* synthetic */ b(c cVar, d dVar, int i10, int i11, b bVar, a aVar) {
            this(cVar, dVar, i10, i11, bVar);
        }

        static byte[] h(int i10) {
            return new byte[]{(byte) i10};
        }

        static byte[] i(int i10, int i11) {
            return new byte[]{(byte) i10, (byte) i11};
        }

        private static int j(boolean z10, int i10, char c10, int i11) {
            if (c10 == i11) {
                return 27;
            }
            if (!z10) {
                if (c10 != 0) {
                    if (i10 == 0 && c10 <= 3) {
                        return c10 - 1;
                    }
                    if (i10 == 1 && c10 <= 31) {
                        return c10;
                    }
                    if (c10 == ' ') {
                        return 3;
                    }
                    if (c10 >= '!' && c10 <= '/') {
                        return c10 - '!';
                    }
                    if (c10 >= '0' && c10 <= '9') {
                        return c10 - ',';
                    }
                    if (c10 >= ':' && c10 <= '@') {
                        return c10 - '+';
                    }
                    if (c10 >= 'A' && c10 <= 'Z') {
                        return c10 - '@';
                    }
                    if (c10 >= '[' && c10 <= '_') {
                        return c10 - 'E';
                    }
                    if (c10 != '`') {
                        return (c10 < 'a' || c10 > 'z') ? (c10 < '{' || c10 > 127) ? c10 : c10 - '`' : c10 - 'S';
                    }
                }
                return 0;
            } else if (c10 <= 31) {
                return c10;
            } else {
                if (c10 == ' ') {
                    return 3;
                }
                return c10 <= '/' ? c10 - '!' : c10 <= '9' ? c10 - ',' : c10 <= '@' ? c10 - '+' : c10 <= 'Z' ? c10 - '3' : c10 <= '_' ? c10 - 'E' : c10 <= 127 ? c10 - '`' : c10;
            }
        }

        static int v(char c10, boolean z10, int i10) {
            if ((!z10 || !k.l(c10)) && (z10 || !k.n(c10))) {
                return ((!z10 || !k.m(c10, i10)) && (z10 || !k.o(c10, i10))) ? 2 : 1;
            }
            return 0;
        }

        private static int w(char c10) {
            if (c10 == 13) {
                return 0;
            }
            if (c10 == '*') {
                return 1;
            }
            if (c10 == '>') {
                return 2;
            }
            if (c10 == ' ') {
                return 3;
            }
            return (c10 < '0' || c10 > '9') ? (c10 < 'A' || c10 > 'Z') ? c10 : c10 - '3' : c10 - ',';
        }

        static void y(byte[] bArr, int i10, int i11, int i12, int i13) {
            int i14 = ((i11 & 255) * 1600) + ((i12 & 255) * 40) + (i13 & 255) + 1;
            bArr[i10] = (byte) (i14 / 256);
            bArr[i10 + 1] = (byte) (i14 % 256);
        }

        /* access modifiers changed from: package-private */
        public int g() {
            int i10 = 0;
            b bVar = this;
            while (bVar != null && bVar.f76405b == d.B256 && i10 <= 250) {
                i10++;
                bVar = bVar.f76408e;
            }
            return i10;
        }

        /* access modifiers changed from: package-private */
        public byte[] k(boolean z10, int i10) {
            ArrayList arrayList = new ArrayList();
            for (int i11 = 0; i11 < this.f76407d; i11++) {
                char charAt = this.f76404a.charAt(this.f76406c + i11);
                if ((z10 && j.h(charAt)) || (!z10 && j.j(charAt))) {
                    arrayList.add(Byte.valueOf((byte) j(z10, 0, charAt, i10)));
                } else if (!k.k(charAt, i10)) {
                    int v10 = v(charAt, z10, i10);
                    arrayList.add(Byte.valueOf((byte) v10));
                    arrayList.add(Byte.valueOf((byte) j(z10, v10, charAt, i10)));
                } else {
                    char c10 = (char) ((charAt & 255) - 128);
                    if ((!z10 || !j.h(c10)) && (z10 || !j.j(c10))) {
                        arrayList.add((byte) 1);
                        arrayList.add((byte) 30);
                        int v11 = v(c10, z10, i10);
                        arrayList.add(Byte.valueOf((byte) v11));
                        arrayList.add(Byte.valueOf((byte) j(z10, v11, c10, i10)));
                    } else {
                        arrayList.add((byte) 1);
                        arrayList.add((byte) 30);
                        arrayList.add(Byte.valueOf((byte) j(z10, 0, c10, i10)));
                    }
                }
            }
            if (arrayList.size() % 3 != 0) {
                arrayList.add((byte) 0);
            }
            byte[] bArr = new byte[((arrayList.size() / 3) * 2)];
            int i12 = 0;
            for (int i13 = 0; i13 < arrayList.size(); i13 += 3) {
                y(bArr, i12, ((Byte) arrayList.get(i13)).byteValue() & 255, ((Byte) arrayList.get(i13 + 1)).byteValue() & 255, ((Byte) arrayList.get(i13 + 2)).byteValue() & 255);
                i12 += 2;
            }
            return bArr;
        }

        /* access modifiers changed from: package-private */
        public int l(int i10) {
            return r(i10) - i10;
        }

        /* access modifiers changed from: package-private */
        public byte[] m() {
            switch (a.f76399a[this.f76405b.ordinal()]) {
                case 1:
                    return this.f76404a.a(this.f76406c) ? i(241, this.f76404a.b(this.f76406c) + 1) : k.k(this.f76404a.charAt(this.f76406c), this.f76404a.f()) ? i(235, this.f76404a.charAt(this.f76406c) - 127) : this.f76407d == 2 ? h(((this.f76404a.charAt(this.f76406c) - '0') * 10) + this.f76404a.charAt(this.f76406c + 1) + 82) : this.f76404a.h(this.f76406c) ? h(232) : h(this.f76404a.charAt(this.f76406c) + 1);
                case 2:
                    return h(this.f76404a.charAt(this.f76406c));
                case 3:
                    return k(true, this.f76404a.f());
                case 4:
                    return k(false, this.f76404a.f());
                case 5:
                    return x();
                case 6:
                    return n();
                default:
                    return new byte[0];
            }
        }

        /* access modifiers changed from: package-private */
        public byte[] n() {
            int ceil = (int) Math.ceil(((double) this.f76407d) / 4.0d);
            byte[] bArr = new byte[(ceil * 3)];
            int i10 = this.f76406c;
            int min = Math.min((this.f76407d + i10) - 1, this.f76404a.length() - 1);
            for (int i11 = 0; i11 < ceil; i11 += 3) {
                int[] iArr = new int[4];
                for (int i12 = 0; i12 < 4; i12++) {
                    if (i10 <= min) {
                        iArr[i12] = this.f76404a.charAt(i10) & '?';
                        i10++;
                    } else {
                        iArr[i12] = i10 == min + 1 ? 31 : 0;
                    }
                }
                int i13 = (iArr[0] << 18) | (iArr[1] << 12) | (iArr[2] << 6) | iArr[3];
                bArr[i11] = (byte) ((i13 >> 16) & 255);
                bArr[i11 + 1] = (byte) ((i13 >> 8) & 255);
                bArr[i11 + 2] = (byte) (i13 & 255);
            }
            return bArr;
        }

        /* access modifiers changed from: package-private */
        public d o() {
            if (this.f76405b == d.EDF) {
                if (this.f76407d < 4) {
                    return d.ASCII;
                }
                int p10 = p();
                if (p10 > 0 && l(this.f76409f + p10) <= 2 - p10) {
                    return d.ASCII;
                }
            }
            d dVar = this.f76405b;
            if (dVar == d.C40 || dVar == d.TEXT || dVar == d.X12) {
                if (this.f76406c + this.f76407d >= this.f76404a.length() && l(this.f76409f) == 0) {
                    return d.ASCII;
                }
                if (p() == 1 && l(this.f76409f + 1) == 0) {
                    return d.ASCII;
                }
            }
            return this.f76405b;
        }

        /* access modifiers changed from: package-private */
        public int p() {
            int length = this.f76404a.length();
            int i10 = this.f76406c + this.f76407d;
            int i11 = length - i10;
            if (i11 <= 4 && i10 < length) {
                if (i11 == 1) {
                    return k.k(this.f76404a.charAt(i10), this.f76404a.f()) ? 0 : 1;
                }
                if (i11 == 2) {
                    if (!k.k(this.f76404a.charAt(i10), this.f76404a.f())) {
                        int i12 = i10 + 1;
                        if (!k.k(this.f76404a.charAt(i12), this.f76404a.f())) {
                            return (!j.f(this.f76404a.charAt(i10)) || !j.f(this.f76404a.charAt(i12))) ? 2 : 1;
                        }
                    }
                    return 0;
                } else if (i11 != 3) {
                    return (!j.f(this.f76404a.charAt(i10)) || !j.f(this.f76404a.charAt(i10 + 1)) || !j.f(this.f76404a.charAt(i10 + 2)) || !j.f(this.f76404a.charAt(i10 + 3))) ? 0 : 2;
                } else {
                    if (!j.f(this.f76404a.charAt(i10)) || !j.f(this.f76404a.charAt(i10 + 1)) || k.k(this.f76404a.charAt(i10 + 2), this.f76404a.f())) {
                        return (!j.f(this.f76404a.charAt(i10 + 1)) || !j.f(this.f76404a.charAt(i10 + 2)) || k.k(this.f76404a.charAt(i10), this.f76404a.f())) ? 0 : 2;
                    }
                    return 2;
                }
            }
        }

        /* access modifiers changed from: package-private */
        public byte[] q() {
            int[] iArr = a.f76399a;
            switch (iArr[t().ordinal()]) {
                case 1:
                case 2:
                    int i10 = iArr[this.f76405b.ordinal()];
                    if (i10 == 2) {
                        return h(231);
                    }
                    if (i10 == 3) {
                        return h(230);
                    }
                    if (i10 == 4) {
                        return h(239);
                    }
                    if (i10 == 5) {
                        return h(238);
                    }
                    if (i10 == 6) {
                        return h(240);
                    }
                    break;
                case 3:
                case 4:
                case 5:
                    if (this.f76405b != t()) {
                        switch (iArr[this.f76405b.ordinal()]) {
                            case 1:
                                return h(254);
                            case 2:
                                return i(254, 231);
                            case 3:
                                return i(254, 230);
                            case 4:
                                return i(254, 239);
                            case 5:
                                return i(254, 238);
                            case 6:
                                return i(254, 240);
                        }
                    }
                    break;
            }
            return new byte[0];
        }

        /* access modifiers changed from: package-private */
        public int r(int i10) {
            int i11 = a.f76400b[this.f76404a.l().ordinal()];
            if (i11 == 1) {
                for (int i12 : f76402h) {
                    if (i12 >= i10) {
                        return i12;
                    }
                }
            } else if (i11 == 2) {
                for (int i13 : f76403i) {
                    if (i13 >= i10) {
                        return i13;
                    }
                }
            }
            for (int i14 : f76401g) {
                if (i14 >= i10) {
                    return i14;
                }
            }
            int[] iArr = f76401g;
            return iArr[iArr.length - 1];
        }

        /* access modifiers changed from: package-private */
        public d s() {
            return this.f76405b;
        }

        /* access modifiers changed from: package-private */
        public d t() {
            b bVar = this.f76408e;
            return bVar == null ? d.ASCII : bVar.o();
        }

        /* access modifiers changed from: package-private */
        public d u() {
            b bVar = this.f76408e;
            return bVar == null ? d.ASCII : bVar.f76405b;
        }

        /* access modifiers changed from: package-private */
        public byte[] x() {
            int i10 = (this.f76407d / 3) * 2;
            byte[] bArr = new byte[i10];
            for (int i11 = 0; i11 < i10; i11 += 2) {
                int i12 = (i11 / 2) * 3;
                y(bArr, i11, w(this.f76404a.charAt(this.f76406c + i12)), w(this.f76404a.charAt(this.f76406c + i12 + 1)), w(this.f76404a.charAt(this.f76406c + i12 + 2)));
            }
            return bArr;
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:35:0x0071, code lost:
            if (r0 == r1) goto L_0x0073;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:36:0x0073, code lost:
            r10 = r10 + 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:51:0x009b, code lost:
            if (r0 != rd.k.d.X12) goto L_0x00c6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:63:0x00c3, code lost:
            if (r0 != rd.k.d.X12) goto L_0x00c6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:64:0x00c6, code lost:
            r5.f76409f = r10;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:65:0x00c8, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private b(rd.k.c r6, rd.k.d r7, int r8, int r9, rd.k.b r10) {
            /*
                r5 = this;
                r5.<init>()
                r5.f76404a = r6
                r5.f76405b = r7
                r5.f76406c = r8
                r5.f76407d = r9
                r5.f76408e = r10
                r9 = 0
                if (r10 == 0) goto L_0x0013
                int r10 = r10.f76409f
                goto L_0x0014
            L_0x0013:
                r10 = r9
            L_0x0014:
                rd.k$d r0 = r5.t()
                int[] r1 = rd.k.a.f76399a
                int r2 = r7.ordinal()
                r1 = r1[r2]
                switch(r1) {
                    case 1: goto L_0x009e;
                    case 2: goto L_0x0079;
                    case 3: goto L_0x0048;
                    case 4: goto L_0x0048;
                    case 5: goto L_0x0048;
                    case 6: goto L_0x0025;
                    default: goto L_0x0023;
                }
            L_0x0023:
                goto L_0x00c6
            L_0x0025:
                int r6 = r10 + 3
                rd.k$d r7 = rd.k.d.ASCII
                if (r0 == r7) goto L_0x0044
                rd.k$d r7 = rd.k.d.B256
                if (r0 != r7) goto L_0x0030
                goto L_0x0044
            L_0x0030:
                rd.k$d r7 = rd.k.d.C40
                if (r0 == r7) goto L_0x0040
                rd.k$d r7 = rd.k.d.TEXT
                if (r0 == r7) goto L_0x0040
                rd.k$d r7 = rd.k.d.X12
                if (r0 != r7) goto L_0x003d
                goto L_0x0040
            L_0x003d:
                r10 = r6
                goto L_0x00c6
            L_0x0040:
                int r10 = r10 + 5
                goto L_0x00c6
            L_0x0044:
                int r10 = r10 + 4
                goto L_0x00c6
            L_0x0048:
                rd.k$d r1 = rd.k.d.X12
                if (r7 != r1) goto L_0x004f
                int r10 = r10 + 2
                goto L_0x005e
            L_0x004f:
                r2 = 1
                int[] r3 = new int[r2]
                rd.k$d r4 = rd.k.d.C40
                if (r7 != r4) goto L_0x0057
                r9 = r2
            L_0x0057:
                int r6 = rd.k.j(r6, r8, r9, r3)
                int r6 = r6 * 2
                int r10 = r10 + r6
            L_0x005e:
                rd.k$d r6 = rd.k.d.ASCII
                if (r0 == r6) goto L_0x0076
                rd.k$d r6 = rd.k.d.B256
                if (r0 != r6) goto L_0x0067
                goto L_0x0076
            L_0x0067:
                if (r0 == r7) goto L_0x00c6
                rd.k$d r6 = rd.k.d.C40
                if (r0 == r6) goto L_0x0073
                rd.k$d r6 = rd.k.d.TEXT
                if (r0 == r6) goto L_0x0073
                if (r0 != r1) goto L_0x00c6
            L_0x0073:
                int r10 = r10 + 2
                goto L_0x00c6
            L_0x0076:
                int r10 = r10 + 1
                goto L_0x00c6
            L_0x0079:
                int r6 = r10 + 1
                rd.k$d r7 = rd.k.d.B256
                if (r0 == r7) goto L_0x0082
            L_0x007f:
                int r10 = r10 + 2
                goto L_0x008c
            L_0x0082:
                int r7 = r5.g()
                r8 = 250(0xfa, float:3.5E-43)
                if (r7 != r8) goto L_0x008b
                goto L_0x007f
            L_0x008b:
                r10 = r6
            L_0x008c:
                rd.k$d r6 = rd.k.d.ASCII
                if (r0 != r6) goto L_0x0091
                goto L_0x0076
            L_0x0091:
                rd.k$d r6 = rd.k.d.C40
                if (r0 == r6) goto L_0x0073
                rd.k$d r6 = rd.k.d.TEXT
                if (r0 == r6) goto L_0x0073
                rd.k$d r6 = rd.k.d.X12
                if (r0 != r6) goto L_0x00c6
                goto L_0x0073
            L_0x009e:
                int r7 = r10 + 1
                boolean r9 = r6.a(r8)
                if (r9 != 0) goto L_0x00b7
                char r8 = r6.charAt(r8)
                int r6 = r6.f()
                boolean r6 = rd.k.k(r8, r6)
                if (r6 == 0) goto L_0x00b5
                goto L_0x00b7
            L_0x00b5:
                r10 = r7
                goto L_0x00b9
            L_0x00b7:
                int r10 = r10 + 2
            L_0x00b9:
                rd.k$d r6 = rd.k.d.C40
                if (r0 == r6) goto L_0x0076
                rd.k$d r6 = rd.k.d.TEXT
                if (r0 == r6) goto L_0x0076
                rd.k$d r6 = rd.k.d.X12
                if (r0 != r6) goto L_0x00c6
                goto L_0x0076
            L_0x00c6:
                r5.f76409f = r10
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: rd.k.b.<init>(rd.k$c, rd.k$d, int, int, rd.k$b):void");
        }
    }

    private static final class c extends C10109f {

        /* renamed from: c  reason: collision with root package name */
        private final m f76410c;

        /* renamed from: d  reason: collision with root package name */
        private final int f76411d;

        /* synthetic */ c(String str, Charset charset, int i10, m mVar, int i11, a aVar) {
            this(str, charset, i10, mVar, i11);
        }

        /* access modifiers changed from: private */
        public int k() {
            return this.f76411d;
        }

        /* access modifiers changed from: private */
        public m l() {
            return this.f76410c;
        }

        private c(String str, Charset charset, int i10, m mVar, int i11) {
            super(str, charset, i10);
            this.f76410c = mVar;
            this.f76411d = i11;
        }
    }

    enum d {
        ASCII,
        C40,
        TEXT,
        X12,
        EDF,
        B256
    }

    private static final class e {

        /* renamed from: a  reason: collision with root package name */
        private final byte[] f76412a;

        e(b bVar) {
            int i10;
            c b10 = bVar.f76404a;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            int i11 = 0;
            int c10 = ((bVar.f76405b == d.C40 || bVar.f76405b == d.TEXT || bVar.f76405b == d.X12) && bVar.o() != d.ASCII) ? c(b.h(254), arrayList) : 0;
            for (b bVar2 = bVar; bVar2 != null; bVar2 = bVar2.f76408e) {
                int c11 = c10 + c(bVar2.m(), arrayList);
                if (bVar2.f76408e == null || bVar2.u() != bVar2.s()) {
                    if (bVar2.s() == d.B256) {
                        if (c11 <= 249) {
                            arrayList.add(0, Byte.valueOf((byte) c11));
                            i10 = c11 + 1;
                        } else {
                            arrayList.add(0, Byte.valueOf((byte) (c11 % 250)));
                            arrayList.add(0, Byte.valueOf((byte) ((c11 / 250) + 249)));
                            i10 = c11 + 2;
                        }
                        arrayList2.add(Integer.valueOf(arrayList.size()));
                        arrayList3.add(Integer.valueOf(i10));
                    }
                    c(bVar2.q(), arrayList);
                    c11 = 0;
                }
            }
            if (b10.k() == 5) {
                c(b.h(236), arrayList);
            } else if (b10.k() == 6) {
                c(b.h(237), arrayList);
            }
            if (b10.f() > 0) {
                c(b.h(232), arrayList);
            }
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                a(arrayList, arrayList.size() - ((Integer) arrayList2.get(i12)).intValue(), ((Integer) arrayList3.get(i12)).intValue());
            }
            int r10 = bVar.r(arrayList.size());
            if (arrayList.size() < r10) {
                arrayList.add((byte) -127);
            }
            while (arrayList.size() < r10) {
                arrayList.add(Byte.valueOf((byte) d(arrayList.size() + 1)));
            }
            this.f76412a = new byte[arrayList.size()];
            while (true) {
                byte[] bArr = this.f76412a;
                if (i11 < bArr.length) {
                    bArr[i11] = ((Byte) arrayList.get(i11)).byteValue();
                    i11++;
                } else {
                    return;
                }
            }
        }

        static void a(List<Byte> list, int i10, int i11) {
            for (int i12 = 0; i12 < i11; i12++) {
                int i13 = i10 + i12;
                int byteValue = (list.get(i13).byteValue() & 255) + (((i13 + 1) * 149) % 255) + 1;
                if (byteValue > 255) {
                    byteValue -= 256;
                }
                list.set(i13, Byte.valueOf((byte) byteValue));
            }
        }

        static int c(byte[] bArr, List<Byte> list) {
            for (int length = bArr.length - 1; length >= 0; length--) {
                list.add(0, Byte.valueOf(bArr[length]));
            }
            return bArr.length;
        }

        private static int d(int i10) {
            int i11 = (i10 * 149) % 253;
            int i12 = i11 + 130;
            return i12 <= 254 ? i12 : i11 - 124;
        }

        public byte[] b() {
            return this.f76412a;
        }
    }

    static void e(b[][] bVarArr, b bVar) {
        int a10 = bVar.f76406c + bVar.f76407d;
        if (bVarArr[a10][bVar.o().ordinal()] == null || bVarArr[a10][bVar.o().ordinal()].f76409f > bVar.f76409f) {
            bVarArr[a10][bVar.o().ordinal()] = bVar;
        }
    }

    /* JADX WARNING: type inference failed for: r11v0 */
    /* JADX WARNING: type inference failed for: r11v4 */
    /* JADX WARNING: type inference failed for: r11v7 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void f(rd.k.c r17, rd.k.b[][] r18, int r19, rd.k.b r20) {
        /*
            r7 = r17
            r8 = r18
            r9 = r19
            boolean r0 = r7.a(r9)
            if (r0 == 0) goto L_0x0020
            rd.k$b r10 = new rd.k$b
            rd.k$d r2 = rd.k.d.ASCII
            r4 = 1
            r6 = 0
            r0 = r10
            r1 = r17
            r3 = r19
            r5 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6)
            e(r8, r10)
            return
        L_0x0020:
            char r0 = r7.charAt(r9)
            r10 = 3
            r11 = 0
            r12 = 1
            if (r20 == 0) goto L_0x0031
            rd.k$d r1 = r20.o()
            rd.k$d r2 = rd.k.d.EDF
            if (r1 == r2) goto L_0x00f5
        L_0x0031:
            boolean r0 = rd.j.f(r0)
            r13 = 2
            if (r0 == 0) goto L_0x005e
            boolean r0 = r7.g(r9, r13)
            if (r0 == 0) goto L_0x005e
            int r0 = r9 + 1
            char r0 = r7.charAt(r0)
            boolean r0 = rd.j.f(r0)
            if (r0 == 0) goto L_0x005e
            rd.k$b r14 = new rd.k$b
            rd.k$d r2 = rd.k.d.ASCII
            r4 = 2
            r6 = 0
            r0 = r14
            r1 = r17
            r3 = r19
            r5 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6)
            e(r8, r14)
            goto L_0x0071
        L_0x005e:
            rd.k$b r14 = new rd.k$b
            rd.k$d r2 = rd.k.d.ASCII
            r4 = 1
            r6 = 0
            r0 = r14
            r1 = r17
            r3 = r19
            r5 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6)
            e(r8, r14)
        L_0x0071:
            rd.k$d r0 = rd.k.d.C40
            rd.k$d r1 = rd.k.d.TEXT
            rd.k$d[] r14 = new rd.k.d[]{r0, r1}
            r15 = r11
        L_0x007a:
            if (r15 >= r13) goto L_0x00a7
            r2 = r14[r15]
            int[] r0 = new int[r12]
            rd.k$d r1 = rd.k.d.C40
            if (r2 != r1) goto L_0x0086
            r1 = r12
            goto L_0x0087
        L_0x0086:
            r1 = r11
        L_0x0087:
            int r1 = j(r7, r9, r1, r0)
            if (r1 <= 0) goto L_0x00a3
            rd.k$b r6 = new rd.k$b
            r4 = r0[r11]
            r16 = 0
            r0 = r6
            r1 = r17
            r3 = r19
            r5 = r20
            r11 = r6
            r6 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6)
            e(r8, r11)
        L_0x00a3:
            int r15 = r15 + 1
            r11 = 0
            goto L_0x007a
        L_0x00a7:
            boolean r0 = r7.g(r9, r10)
            if (r0 == 0) goto L_0x00e2
            char r0 = r7.charAt(r9)
            boolean r0 = rd.j.k(r0)
            if (r0 == 0) goto L_0x00e2
            int r0 = r9 + 1
            char r0 = r7.charAt(r0)
            boolean r0 = rd.j.k(r0)
            if (r0 == 0) goto L_0x00e2
            int r0 = r9 + 2
            char r0 = r7.charAt(r0)
            boolean r0 = rd.j.k(r0)
            if (r0 == 0) goto L_0x00e2
            rd.k$b r11 = new rd.k$b
            rd.k$d r2 = rd.k.d.X12
            r4 = 3
            r6 = 0
            r0 = r11
            r1 = r17
            r3 = r19
            r5 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6)
            e(r8, r11)
        L_0x00e2:
            rd.k$b r11 = new rd.k$b
            rd.k$d r2 = rd.k.d.B256
            r4 = 1
            r6 = 0
            r0 = r11
            r1 = r17
            r3 = r19
            r5 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6)
            e(r8, r11)
        L_0x00f5:
            r11 = 0
        L_0x00f6:
            if (r11 >= r10) goto L_0x0120
            int r0 = r9 + r11
            boolean r1 = r7.g(r0, r12)
            if (r1 == 0) goto L_0x0120
            char r0 = r7.charAt(r0)
            boolean r0 = rd.j.i(r0)
            if (r0 == 0) goto L_0x0120
            rd.k$b r13 = new rd.k$b
            rd.k$d r2 = rd.k.d.EDF
            int r11 = r11 + 1
            r6 = 0
            r0 = r13
            r1 = r17
            r3 = r19
            r4 = r11
            r5 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6)
            e(r8, r13)
            goto L_0x00f6
        L_0x0120:
            if (r11 != r10) goto L_0x0148
            r0 = 4
            boolean r0 = r7.g(r9, r0)
            if (r0 == 0) goto L_0x0148
            int r0 = r9 + 3
            char r0 = r7.charAt(r0)
            boolean r0 = rd.j.i(r0)
            if (r0 == 0) goto L_0x0148
            rd.k$b r10 = new rd.k$b
            rd.k$d r2 = rd.k.d.EDF
            r4 = 4
            r6 = 0
            r0 = r10
            r1 = r17
            r3 = r19
            r5 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6)
            e(r8, r10)
        L_0x0148:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: rd.k.f(rd.k$c, rd.k$b[][], int, rd.k$b):void");
    }

    static byte[] g(String str, Charset charset, int i10, m mVar, int i11) {
        return i(new c(str, charset, i10, mVar, i11, (a) null)).b();
    }

    public static String h(String str, Charset charset, int i10, m mVar) {
        int i11;
        if (str.startsWith("[)>\u001e05\u001d") && str.endsWith("\u001e\u0004")) {
            str = str.substring(7, str.length() - 2);
            i11 = 5;
        } else if (!str.startsWith("[)>\u001e06\u001d") || !str.endsWith("\u001e\u0004")) {
            i11 = 0;
        } else {
            str = str.substring(7, str.length() - 2);
            i11 = 6;
        }
        return new String(g(str, charset, i10, mVar, i11), StandardCharsets.ISO_8859_1);
    }

    static e i(c cVar) {
        int length = cVar.length();
        int[] iArr = new int[2];
        iArr[1] = 6;
        int i10 = 0;
        iArr[0] = length + 1;
        b[][] bVarArr = (b[][]) Array.newInstance(b.class, iArr);
        f(cVar, bVarArr, 0, (b) null);
        for (int i11 = 1; i11 <= length; i11++) {
            for (int i12 = 0; i12 < 6; i12++) {
                b bVar = bVarArr[i11][i12];
                if (bVar != null && i11 < length) {
                    f(cVar, bVarArr, i11, bVar);
                }
            }
            for (int i13 = 0; i13 < 6; i13++) {
                bVarArr[i11 - 1][i13] = null;
            }
        }
        int i14 = -1;
        int i15 = Integer.MAX_VALUE;
        while (i10 < 6) {
            b bVar2 = bVarArr[length][i10];
            if (bVar2 != null) {
                int f10 = (i10 < 1 || i10 > 3) ? bVar2.f76409f : bVar2.f76409f + 1;
                if (f10 < i15) {
                    i14 = i10;
                    i15 = f10;
                }
            }
            i10++;
        }
        if (i14 >= 0) {
            return new e(bVarArr[length][i14]);
        }
        throw new IllegalStateException("Failed to encode \"" + cVar + "\"");
    }

    static int j(c cVar, int i10, boolean z10, int[] iArr) {
        int i11 = 0;
        for (int i12 = i10; i12 < cVar.length(); i12++) {
            if (cVar.a(i12)) {
                iArr[0] = 0;
                return 0;
            }
            char charAt = cVar.charAt(i12);
            if ((z10 && j.h(charAt)) || (!z10 && j.j(charAt))) {
                i11++;
            } else if (!k(charAt, cVar.f())) {
                i11 += 2;
            } else {
                char c10 = charAt & 255;
                i11 = (c10 < 128 || ((!z10 || !j.h((char) (c10 + 65408))) && (z10 || !j.j((char) (c10 + 65408))))) ? i11 + 4 : i11 + 3;
            }
            if (i11 % 3 == 0 || ((i11 - 2) % 3 == 0 && i12 + 1 == cVar.length())) {
                iArr[0] = (i12 - i10) + 1;
                return (int) Math.ceil(((double) i11) / 3.0d);
            }
        }
        iArr[0] = 0;
        return 0;
    }

    static boolean k(char c10, int i10) {
        return c10 != i10 && c10 >= 128 && c10 <= 255;
    }

    /* access modifiers changed from: private */
    public static boolean l(char c10) {
        return c10 <= 31;
    }

    /* access modifiers changed from: private */
    public static boolean m(char c10, int i10) {
        for (char c11 : f76398a) {
            if (c11 == c10) {
                return true;
            }
        }
        return c10 == i10;
    }

    /* access modifiers changed from: private */
    public static boolean n(char c10) {
        return l(c10);
    }

    /* access modifiers changed from: private */
    public static boolean o(char c10, int i10) {
        return m(c10, i10);
    }
}

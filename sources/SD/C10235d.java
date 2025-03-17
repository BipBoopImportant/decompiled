package sd;

import com.oppwa.mobile.connect.checkout.dialog.CheckoutActivity;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import ld.C10008a;
import ld.C10010c;
import org.maplibre.android.log.Logger;

/* renamed from: sd.d  reason: case insensitive filesystem */
public final class C10235d extends n {

    /* renamed from: sd.d$a */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f76505a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f76506b;

        /* JADX WARNING: Can't wrap try/catch for region: R(17:0|(2:1|2)|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Can't wrap try/catch for region: R(19:0|1|2|3|5|6|7|9|10|11|13|14|15|16|17|18|19|20|22) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0039 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004d */
        static {
            /*
                sd.d$c$a[] r0 = sd.C10235d.c.a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f76506b = r0
                r1 = 1
                sd.d$c$a r2 = sd.C10235d.c.a.A     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f76506b     // Catch:{ NoSuchFieldError -> 0x001d }
                sd.d$c$a r3 = sd.C10235d.c.a.B     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                r2 = 3
                int[] r3 = f76506b     // Catch:{ NoSuchFieldError -> 0x0028 }
                sd.d$c$a r4 = sd.C10235d.c.a.C     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                sd.d$c$b[] r3 = sd.C10235d.c.b.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f76505a = r3
                sd.d$c$b r4 = sd.C10235d.c.b.A     // Catch:{ NoSuchFieldError -> 0x0039 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0039 }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x0039 }
            L_0x0039:
                int[] r1 = f76505a     // Catch:{ NoSuchFieldError -> 0x0043 }
                sd.d$c$b r3 = sd.C10235d.c.b.B     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r0 = f76505a     // Catch:{ NoSuchFieldError -> 0x004d }
                sd.d$c$b r1 = sd.C10235d.c.b.C     // Catch:{ NoSuchFieldError -> 0x004d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x004d }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x004d }
            L_0x004d:
                int[] r0 = f76505a     // Catch:{ NoSuchFieldError -> 0x0058 }
                sd.d$c$b r1 = sd.C10235d.c.b.SHIFT     // Catch:{ NoSuchFieldError -> 0x0058 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0058 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0058 }
            L_0x0058:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: sd.C10235d.a.<clinit>():void");
        }
    }

    /* renamed from: sd.d$b */
    private enum b {
        UNCODABLE,
        ONE_DIGIT,
        TWO_DIGITS,
        FNC_1
    }

    /* renamed from: sd.d$c */
    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        private int[][] f76507a;

        /* renamed from: b  reason: collision with root package name */
        private b[][] f76508b;

        /* renamed from: sd.d$c$a */
        private enum a {
            A,
            B,
            C,
            NONE
        }

        /* renamed from: sd.d$c$b */
        private enum b {
            A,
            B,
            C,
            SHIFT,
            NONE
        }

        private c() {
        }

        private static void b(Collection<int[]> collection, int i10, int[] iArr, int[] iArr2, int i11) {
            collection.add(C10234c.f76504a[i10]);
            if (i11 != 0) {
                iArr2[0] = iArr2[0] + 1;
            }
            iArr[0] = iArr[0] + (i10 * iArr2[0]);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0021, code lost:
            r11 = r11 + 1;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private boolean c(java.lang.CharSequence r9, sd.C10235d.c.a r10, int r11) {
            /*
                r8 = this;
                char r0 = r9.charAt(r11)
                int[] r1 = sd.C10235d.a.f76506b
                int r10 = r10.ordinal()
                r10 = r1[r10]
                r1 = 244(0xf4, float:3.42E-43)
                r2 = 243(0xf3, float:3.4E-43)
                r3 = 242(0xf2, float:3.39E-43)
                r4 = 241(0xf1, float:3.38E-43)
                r5 = 0
                r6 = 1
                if (r10 == r6) goto L_0x004c
                r7 = 2
                if (r10 == r7) goto L_0x003a
                r1 = 3
                if (r10 == r1) goto L_0x001f
                return r5
            L_0x001f:
                if (r0 == r4) goto L_0x0038
                int r11 = r11 + r6
                int r10 = r9.length()
                if (r11 >= r10) goto L_0x0039
                boolean r10 = f(r0)
                if (r10 == 0) goto L_0x0039
                char r9 = r9.charAt(r11)
                boolean r9 = f(r9)
                if (r9 == 0) goto L_0x0039
            L_0x0038:
                r5 = r6
            L_0x0039:
                return r5
            L_0x003a:
                if (r0 == r4) goto L_0x004a
                if (r0 == r3) goto L_0x004a
                if (r0 == r2) goto L_0x004a
                if (r0 == r1) goto L_0x004a
                java.lang.String r9 = " !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklmnopqrstuvwxyz{|}~ÿ"
                int r9 = r9.indexOf(r0)
                if (r9 < 0) goto L_0x004b
            L_0x004a:
                r5 = r6
            L_0x004b:
                return r5
            L_0x004c:
                if (r0 == r4) goto L_0x005c
                if (r0 == r3) goto L_0x005c
                if (r0 == r2) goto L_0x005c
                if (r0 == r1) goto L_0x005c
                java.lang.String r9 = " !\"#$%&'()*+,-./0123456789:;<=>?@ABCDEFGHIJKLMNOPQRSTUVWXYZ[\\]^_\u0000\u0001\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001fÿ"
                int r9 = r9.indexOf(r0)
                if (r9 < 0) goto L_0x005d
            L_0x005c:
                r5 = r6
            L_0x005d:
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: sd.C10235d.c.c(java.lang.CharSequence, sd.d$c$a, int):boolean");
        }

        private int d(CharSequence charSequence, a aVar, int i10) {
            int i11;
            int i12;
            int i13 = this.f76507a[aVar.ordinal()][i10];
            if (i13 > 0) {
                return i13;
            }
            b bVar = b.NONE;
            int i14 = i10 + 1;
            int i15 = 0;
            int i16 = 1;
            boolean z10 = i14 >= charSequence.length();
            a[] aVarArr = {a.A, a.B};
            int i17 = Integer.MAX_VALUE;
            while (true) {
                int i18 = 2;
                if (i15 > 1) {
                    break;
                }
                if (c(charSequence, aVarArr[i15], i10)) {
                    b bVar2 = b.NONE;
                    a aVar2 = aVarArr[i15];
                    if (aVar != aVar2) {
                        bVar2 = b.valueOf(aVar2.toString());
                        i12 = 2;
                    } else {
                        i12 = 1;
                    }
                    if (!z10) {
                        i12 += d(charSequence, aVarArr[i15], i14);
                    }
                    if (i12 < i17) {
                        bVar = bVar2;
                        i17 = i12;
                    }
                    if (aVar == aVarArr[(i15 + 1) % 2]) {
                        b bVar3 = b.SHIFT;
                        if (!z10) {
                            i18 = 2 + d(charSequence, aVar, i14);
                        }
                        if (i18 < i17) {
                            i17 = i18;
                            bVar = bVar3;
                        }
                    }
                }
                i15++;
            }
            a aVar3 = a.C;
            if (c(charSequence, aVar3, i10)) {
                b bVar4 = b.NONE;
                if (aVar != aVar3) {
                    bVar4 = b.C;
                    i11 = 2;
                } else {
                    i11 = 1;
                }
                if (charSequence.charAt(i10) != 241) {
                    i16 = 2;
                }
                int i19 = i16 + i10;
                if (i19 < charSequence.length()) {
                    i11 += d(charSequence, aVar3, i19);
                }
                if (i11 < i17) {
                    bVar = bVar4;
                    i17 = i11;
                }
            }
            if (i17 != Integer.MAX_VALUE) {
                this.f76507a[aVar.ordinal()][i10] = i17;
                this.f76508b[aVar.ordinal()][i10] = bVar;
                return i17;
            }
            throw new IllegalArgumentException("Bad character in input: ASCII value=" + charSequence.charAt(i10));
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Removed duplicated region for block: B:27:0x009b  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x00ba  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean[] e(java.lang.String r17) {
            /*
                r16 = this;
                r0 = r16
                r1 = r17
                int r2 = r17.length()
                r3 = 2
                int[] r4 = new int[r3]
                r5 = 1
                r4[r5] = r2
                r2 = 0
                r6 = 4
                r4[r2] = r6
                java.lang.Class r7 = java.lang.Integer.TYPE
                java.lang.Object r4 = java.lang.reflect.Array.newInstance(r7, r4)
                int[][] r4 = (int[][]) r4
                r0.f76507a = r4
                int r4 = r17.length()
                int[] r7 = new int[r3]
                r7[r5] = r4
                r7[r2] = r6
                java.lang.Class<sd.d$c$b> r4 = sd.C10235d.c.b.class
                java.lang.Object r4 = java.lang.reflect.Array.newInstance(r4, r7)
                sd.d$c$b[][] r4 = (sd.C10235d.c.b[][]) r4
                r0.f76508b = r4
                sd.d$c$a r4 = sd.C10235d.c.a.NONE
                r0.d(r1, r4, r2)
                java.util.ArrayList r7 = new java.util.ArrayList
                r7.<init>()
                int[] r8 = new int[]{r2}
                int[] r9 = new int[]{r5}
                int r10 = r17.length()
                r11 = r2
            L_0x0047:
                if (r11 >= r10) goto L_0x00fd
                sd.d$c$b[][] r12 = r0.f76508b
                int r13 = r4.ordinal()
                r12 = r12[r13]
                r12 = r12[r11]
                int[] r13 = sd.C10235d.a.f76505a
                int r14 = r12.ordinal()
                r13 = r13[r14]
                r14 = 101(0x65, float:1.42E-43)
                r15 = 100
                if (r13 == r5) goto L_0x0089
                if (r13 == r3) goto L_0x007d
                r3 = 3
                if (r13 == r3) goto L_0x006f
                if (r13 == r6) goto L_0x0069
                goto L_0x0095
            L_0x0069:
                r3 = 98
                b(r7, r3, r8, r9, r11)
                goto L_0x0095
            L_0x006f:
                sd.d$c$a r3 = sd.C10235d.c.a.C
                if (r11 != 0) goto L_0x0076
                r4 = 105(0x69, float:1.47E-43)
                goto L_0x0078
            L_0x0076:
                r4 = 99
            L_0x0078:
                b(r7, r4, r8, r9, r11)
            L_0x007b:
                r4 = r3
                goto L_0x0095
            L_0x007d:
                sd.d$c$a r3 = sd.C10235d.c.a.B
                if (r11 != 0) goto L_0x0084
                r4 = 104(0x68, float:1.46E-43)
                goto L_0x0085
            L_0x0084:
                r4 = r15
            L_0x0085:
                b(r7, r4, r8, r9, r11)
                goto L_0x007b
            L_0x0089:
                sd.d$c$a r3 = sd.C10235d.c.a.A
                if (r11 != 0) goto L_0x0090
                r4 = 103(0x67, float:1.44E-43)
                goto L_0x0091
            L_0x0090:
                r4 = r14
            L_0x0091:
                b(r7, r4, r8, r9, r11)
                goto L_0x007b
            L_0x0095:
                sd.d$c$a r3 = sd.C10235d.c.a.C
                r13 = 102(0x66, float:1.43E-43)
                if (r4 != r3) goto L_0x00ba
                char r3 = r1.charAt(r11)
                r12 = 241(0xf1, float:3.38E-43)
                if (r3 != r12) goto L_0x00a7
                b(r7, r13, r8, r9, r11)
                goto L_0x00f9
            L_0x00a7:
                int r3 = r11 + 2
                java.lang.String r3 = r1.substring(r11, r3)
                int r3 = java.lang.Integer.parseInt(r3)
                b(r7, r3, r8, r9, r11)
                int r3 = r11 + 1
                if (r3 >= r10) goto L_0x00f9
                r11 = r3
                goto L_0x00f9
            L_0x00ba:
                char r3 = r1.charAt(r11)
                switch(r3) {
                    case 241: goto L_0x00e1;
                    case 242: goto L_0x00de;
                    case 243: goto L_0x00db;
                    case 244: goto L_0x00c8;
                    default: goto L_0x00c1;
                }
            L_0x00c1:
                char r3 = r1.charAt(r11)
                int r14 = r3 + -32
                goto L_0x00e2
            L_0x00c8:
                sd.d$c$a r3 = sd.C10235d.c.a.A
                if (r4 != r3) goto L_0x00d0
                sd.d$c$b r3 = sd.C10235d.c.b.SHIFT
                if (r12 != r3) goto L_0x00e2
            L_0x00d0:
                sd.d$c$a r3 = sd.C10235d.c.a.B
                if (r4 != r3) goto L_0x00d9
                sd.d$c$b r3 = sd.C10235d.c.b.SHIFT
                if (r12 != r3) goto L_0x00d9
                goto L_0x00e2
            L_0x00d9:
                r14 = r15
                goto L_0x00e2
            L_0x00db:
                r14 = 96
                goto L_0x00e2
            L_0x00de:
                r14 = 97
                goto L_0x00e2
            L_0x00e1:
                r14 = r13
            L_0x00e2:
                sd.d$c$a r3 = sd.C10235d.c.a.A
                if (r4 != r3) goto L_0x00ea
                sd.d$c$b r3 = sd.C10235d.c.b.SHIFT
                if (r12 != r3) goto L_0x00f2
            L_0x00ea:
                sd.d$c$a r3 = sd.C10235d.c.a.B
                if (r4 != r3) goto L_0x00f6
                sd.d$c$b r3 = sd.C10235d.c.b.SHIFT
                if (r12 != r3) goto L_0x00f6
            L_0x00f2:
                if (r14 >= 0) goto L_0x00f6
                int r14 = r14 + 96
            L_0x00f6:
                b(r7, r14, r8, r9, r11)
            L_0x00f9:
                int r11 = r11 + r5
                r3 = 2
                goto L_0x0047
            L_0x00fd:
                r1 = 0
                r0.f76507a = r1
                r0.f76508b = r1
                r1 = r8[r2]
                boolean[] r1 = sd.C10235d.m(r7, r1)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: sd.C10235d.c.e(java.lang.String):boolean[]");
        }

        private static boolean f(char c10) {
            return c10 >= '0' && c10 <= '9';
        }

        /* synthetic */ c(a aVar) {
            this();
        }
    }

    private static int i(String str, Map<C10010c, ?> map) {
        int i10 = -1;
        int length = str.length();
        if (length < 1 || length > 80) {
            throw new IllegalArgumentException("Contents length should be between 1 and 80 characters, but got " + length);
        }
        if (map != null) {
            C10010c cVar = C10010c.FORCE_CODE_SET;
            if (map.containsKey(cVar)) {
                String obj = map.get(cVar).toString();
                obj.hashCode();
                switch (obj.hashCode()) {
                    case 65:
                        if (obj.equals("A")) {
                            i10 = 0;
                            break;
                        }
                        break;
                    case 66:
                        if (obj.equals("B")) {
                            i10 = 1;
                            break;
                        }
                        break;
                    case 67:
                        if (obj.equals("C")) {
                            i10 = 2;
                            break;
                        }
                        break;
                }
                switch (i10) {
                    case 0:
                        i10 = CheckoutActivity.RESULT_CANCELED;
                        break;
                    case 1:
                        i10 = 100;
                        break;
                    case 2:
                        i10 = 99;
                        break;
                    default:
                        throw new IllegalArgumentException("Unsupported code set hint: " + obj);
                }
            }
        }
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            switch (charAt) {
                case 241:
                case 242:
                case 243:
                case 244:
                    break;
                default:
                    if (charAt > 127) {
                        throw new IllegalArgumentException("Bad character in input: ASCII value=" + charAt);
                    }
                    break;
            }
            switch (i10) {
                case Logger.NONE /*99*/:
                    if (charAt >= '0' && ((charAt <= '9' || charAt > 127) && charAt != 242 && charAt != 243 && charAt != 244)) {
                        break;
                    } else {
                        throw new IllegalArgumentException("Bad character in input for forced code set C: ASCII value=" + charAt);
                    }
                    break;
                case CheckoutActivity.RESULT_OK /*100*/:
                    if (charAt >= ' ') {
                        break;
                    } else {
                        throw new IllegalArgumentException("Bad character in input for forced code set B: ASCII value=" + charAt);
                    }
                case CheckoutActivity.RESULT_CANCELED /*101*/:
                    if (charAt > '_' && charAt <= 127) {
                        throw new IllegalArgumentException("Bad character in input for forced code set A: ASCII value=" + charAt);
                    }
            }
        }
        return i10;
    }

    private static int j(CharSequence charSequence, int i10, int i11) {
        b l10;
        b l11;
        char charAt;
        b l12 = l(charSequence, i10);
        b bVar = b.ONE_DIGIT;
        if (l12 != bVar) {
            b bVar2 = b.UNCODABLE;
            if (l12 == bVar2) {
                if (i10 >= charSequence.length() || ((charAt = charSequence.charAt(i10)) >= ' ' && (i11 != 101 || (charAt >= '`' && (charAt < 241 || charAt > 244))))) {
                    return 100;
                }
                return CheckoutActivity.RESULT_CANCELED;
            } else if (i11 == 101 && l12 == b.FNC_1) {
                return CheckoutActivity.RESULT_CANCELED;
            } else {
                if (i11 == 99) {
                    return 99;
                }
                if (i11 == 100) {
                    b bVar3 = b.FNC_1;
                    if (l12 == bVar3 || (l10 = l(charSequence, i10 + 2)) == bVar2 || l10 == bVar) {
                        return 100;
                    }
                    if (l10 == bVar3) {
                        return l(charSequence, i10 + 3) == b.TWO_DIGITS ? 99 : 100;
                    }
                    int i12 = i10 + 4;
                    while (true) {
                        l11 = l(charSequence, i12);
                        if (l11 != b.TWO_DIGITS) {
                            break;
                        }
                        i12 += 2;
                    }
                    return l11 == b.ONE_DIGIT ? 100 : 99;
                }
                if (l12 == b.FNC_1) {
                    l12 = l(charSequence, i10 + 1);
                }
                return l12 == b.TWO_DIGITS ? 99 : 100;
            }
        } else if (i11 == 101) {
            return CheckoutActivity.RESULT_CANCELED;
        } else {
            return 100;
        }
    }

    private static boolean[] k(String str, int i10) {
        int i11;
        int length = str.length();
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1;
        while (i12 < length) {
            int j10 = i10 == -1 ? j(str, i12, i14) : i10;
            int i16 = 100;
            if (j10 == i14) {
                switch (str.charAt(i12)) {
                    case 241:
                        i16 = CheckoutActivity.RESULT_ERROR;
                        break;
                    case 242:
                        i16 = 97;
                        break;
                    case 243:
                        i16 = 96;
                        break;
                    case 244:
                        if (i14 == 101) {
                            i16 = 101;
                            break;
                        }
                        break;
                    default:
                        if (i14 != 100) {
                            if (i14 == 101) {
                                char charAt = str.charAt(i12);
                                i16 = charAt - ' ';
                                if (i16 < 0) {
                                    i16 = charAt + '@';
                                    break;
                                }
                            } else {
                                int i17 = i12 + 1;
                                if (i17 != length) {
                                    i16 = Integer.parseInt(str.substring(i12, i12 + 2));
                                    i12 = i17;
                                    break;
                                } else {
                                    throw new IllegalArgumentException("Bad number of characters for digit only encoding.");
                                }
                            }
                        } else {
                            i16 = str.charAt(i12) - ' ';
                            break;
                        }
                        break;
                }
                i12++;
            } else {
                if (i14 == 0) {
                    i11 = j10 != 100 ? j10 != 101 ? 105 : 103 : 104;
                } else {
                    i11 = j10;
                }
                i14 = j10;
            }
            arrayList.add(C10234c.f76504a[i11]);
            i13 += i11 * i15;
            if (i12 != 0) {
                i15++;
            }
        }
        return m(arrayList, i13);
    }

    private static b l(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        if (i10 >= length) {
            return b.UNCODABLE;
        }
        char charAt = charSequence.charAt(i10);
        if (charAt == 241) {
            return b.FNC_1;
        }
        if (charAt < '0' || charAt > '9') {
            return b.UNCODABLE;
        }
        int i11 = i10 + 1;
        if (i11 >= length) {
            return b.ONE_DIGIT;
        }
        char charAt2 = charSequence.charAt(i11);
        return (charAt2 < '0' || charAt2 > '9') ? b.ONE_DIGIT : b.TWO_DIGITS;
    }

    static boolean[] m(Collection<int[]> collection, int i10) {
        int[][] iArr = C10234c.f76504a;
        collection.add(iArr[i10 % 103]);
        collection.add(iArr[106]);
        int i11 = 0;
        int i12 = 0;
        for (int[] next : collection) {
            for (int i13 : r7.next()) {
                i12 += i13;
            }
        }
        boolean[] zArr = new boolean[i12];
        for (int[] b10 : collection) {
            i11 += n.b(zArr, i11, b10, true);
        }
        return zArr;
    }

    public boolean[] d(String str) {
        return e(str, (Map<C10010c, ?>) null);
    }

    public boolean[] e(String str, Map<C10010c, ?> map) {
        int i10 = i(str, map);
        if (map != null) {
            C10010c cVar = C10010c.CODE128_COMPACT;
            if (map.containsKey(cVar) && Boolean.parseBoolean(map.get(cVar).toString())) {
                return new c((a) null).e(str);
            }
        }
        return k(str, i10);
    }

    /* access modifiers changed from: protected */
    public Collection<C10008a> g() {
        return Collections.singleton(C10008a.CODE_128);
    }
}

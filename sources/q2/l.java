package q2;

import p2.d;
import p2.e;
import p2.i;
import q2.f;
import q2.p;

public class l extends p {

    /* renamed from: k  reason: collision with root package name */
    private static int[] f27800k = new int[2];

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f27801a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                q2.p$b[] r0 = q2.p.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f27801a = r0
                q2.p$b r1 = q2.p.b.START     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f27801a     // Catch:{ NoSuchFieldError -> 0x001d }
                q2.p$b r1 = q2.p.b.END     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f27801a     // Catch:{ NoSuchFieldError -> 0x0028 }
                q2.p$b r1 = q2.p.b.CENTER     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: q2.l.a.<clinit>():void");
        }
    }

    public l(e eVar) {
        super(eVar);
        this.f27834h.f27788e = f.a.LEFT;
        this.f27835i.f27788e = f.a.RIGHT;
        this.f27832f = 0;
    }

    private void q(int[] iArr, int i10, int i11, int i12, int i13, float f10, int i14) {
        int i15 = i11 - i10;
        int i16 = i13 - i12;
        if (i14 == -1) {
            int i17 = (int) ((((float) i16) * f10) + 0.5f);
            int i18 = (int) ((((float) i15) / f10) + 0.5f);
            if (i17 <= i15) {
                iArr[0] = i17;
                iArr[1] = i16;
            } else if (i18 <= i16) {
                iArr[0] = i15;
                iArr[1] = i18;
            }
        } else if (i14 == 0) {
            iArr[0] = (int) ((((float) i16) * f10) + 0.5f);
            iArr[1] = i16;
        } else if (i14 == 1) {
            iArr[0] = i15;
            iArr[1] = (int) ((((float) i15) * f10) + 0.5f);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x02ba, code lost:
        if (r14 != 1) goto L_0x031f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(q2.d r17) {
        /*
            r16 = this;
            r8 = r16
            int[] r0 = q2.l.a.f27801a
            q2.p$b r1 = r8.f27836j
            int r1 = r1.ordinal()
            r0 = r0[r1]
            r1 = 2
            r2 = 3
            r9 = 1
            r10 = 0
            if (r0 == r9) goto L_0x0029
            if (r0 == r1) goto L_0x0023
            if (r0 == r2) goto L_0x0017
            goto L_0x002e
        L_0x0017:
            p2.e r0 = r8.f27828b
            p2.d r1 = r0.f27428O
            p2.d r0 = r0.f27430Q
            r3 = r17
            r8.n(r3, r1, r0, r10)
            return
        L_0x0023:
            r3 = r17
            r16.o(r17)
            goto L_0x002e
        L_0x0029:
            r3 = r17
            r16.p(r17)
        L_0x002e:
            q2.g r0 = r8.f27831e
            boolean r0 = r0.f27793j
            r11 = 1056964608(0x3f000000, float:0.5)
            if (r0 != 0) goto L_0x031f
            p2.e$b r0 = r8.f27830d
            p2.e$b r3 = p2.e.b.MATCH_CONSTRAINT
            if (r0 != r3) goto L_0x031f
            p2.e r0 = r8.f27828b
            int r3 = r0.f27484w
            if (r3 == r1) goto L_0x0302
            if (r3 == r2) goto L_0x0046
            goto L_0x031f
        L_0x0046:
            int r1 = r0.f27486x
            r3 = -1
            if (r1 == 0) goto L_0x008f
            if (r1 != r2) goto L_0x004e
            goto L_0x008f
        L_0x004e:
            int r0 = r0.w()
            if (r0 == r3) goto L_0x007a
            if (r0 == 0) goto L_0x006b
            if (r0 == r9) goto L_0x005a
            r0 = r10
            goto L_0x0088
        L_0x005a:
            p2.e r0 = r8.f27828b
            q2.n r1 = r0.f27450f
            q2.g r1 = r1.f27831e
            int r1 = r1.f27790g
            float r1 = (float) r1
            float r0 = r0.v()
        L_0x0067:
            float r1 = r1 * r0
        L_0x0068:
            float r1 = r1 + r11
            int r0 = (int) r1
            goto L_0x0088
        L_0x006b:
            p2.e r0 = r8.f27828b
            q2.n r1 = r0.f27450f
            q2.g r1 = r1.f27831e
            int r1 = r1.f27790g
            float r1 = (float) r1
            float r0 = r0.v()
            float r1 = r1 / r0
            goto L_0x0068
        L_0x007a:
            p2.e r0 = r8.f27828b
            q2.n r1 = r0.f27450f
            q2.g r1 = r1.f27831e
            int r1 = r1.f27790g
            float r1 = (float) r1
            float r0 = r0.v()
            goto L_0x0067
        L_0x0088:
            q2.g r1 = r8.f27831e
            r1.d(r0)
            goto L_0x031f
        L_0x008f:
            q2.n r1 = r0.f27450f
            q2.f r12 = r1.f27834h
            q2.f r13 = r1.f27835i
            p2.d r1 = r0.f27428O
            p2.d r1 = r1.f27399f
            if (r1 == 0) goto L_0x009d
            r1 = r9
            goto L_0x009e
        L_0x009d:
            r1 = r10
        L_0x009e:
            p2.d r2 = r0.f27429P
            p2.d r2 = r2.f27399f
            if (r2 == 0) goto L_0x00a6
            r2 = r9
            goto L_0x00a7
        L_0x00a6:
            r2 = r10
        L_0x00a7:
            p2.d r4 = r0.f27430Q
            p2.d r4 = r4.f27399f
            if (r4 == 0) goto L_0x00af
            r4 = r9
            goto L_0x00b0
        L_0x00af:
            r4 = r10
        L_0x00b0:
            p2.d r5 = r0.f27431R
            p2.d r5 = r5.f27399f
            if (r5 == 0) goto L_0x00b8
            r5 = r9
            goto L_0x00b9
        L_0x00b8:
            r5 = r10
        L_0x00b9:
            int r14 = r0.w()
            if (r1 == 0) goto L_0x0200
            if (r2 == 0) goto L_0x0200
            if (r4 == 0) goto L_0x0200
            if (r5 == 0) goto L_0x0200
            p2.e r0 = r8.f27828b
            float r15 = r0.v()
            boolean r0 = r12.f27793j
            if (r0 == 0) goto L_0x012e
            boolean r0 = r13.f27793j
            if (r0 == 0) goto L_0x012e
            q2.f r0 = r8.f27834h
            boolean r1 = r0.f27786c
            if (r1 == 0) goto L_0x012d
            q2.f r1 = r8.f27835i
            boolean r1 = r1.f27786c
            if (r1 != 0) goto L_0x00e0
            goto L_0x012d
        L_0x00e0:
            java.util.List<q2.f> r0 = r0.f27795l
            java.lang.Object r0 = r0.get(r10)
            q2.f r0 = (q2.f) r0
            int r0 = r0.f27790g
            q2.f r1 = r8.f27834h
            int r1 = r1.f27789f
            int r2 = r0 + r1
            q2.f r0 = r8.f27835i
            java.util.List<q2.f> r0 = r0.f27795l
            java.lang.Object r0 = r0.get(r10)
            q2.f r0 = (q2.f) r0
            int r0 = r0.f27790g
            q2.f r1 = r8.f27835i
            int r1 = r1.f27789f
            int r3 = r0 - r1
            int r0 = r12.f27790g
            int r1 = r12.f27789f
            int r4 = r0 + r1
            int r0 = r13.f27790g
            int r1 = r13.f27789f
            int r5 = r0 - r1
            int[] r1 = f27800k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.q(r1, r2, r3, r4, r5, r6, r7)
            q2.g r0 = r8.f27831e
            int[] r1 = f27800k
            r1 = r1[r10]
            r0.d(r1)
            p2.e r0 = r8.f27828b
            q2.n r0 = r0.f27450f
            q2.g r0 = r0.f27831e
            int[] r1 = f27800k
            r1 = r1[r9]
            r0.d(r1)
        L_0x012d:
            return
        L_0x012e:
            q2.f r0 = r8.f27834h
            boolean r1 = r0.f27793j
            if (r1 == 0) goto L_0x018b
            q2.f r1 = r8.f27835i
            boolean r2 = r1.f27793j
            if (r2 == 0) goto L_0x018b
            boolean r2 = r12.f27786c
            if (r2 == 0) goto L_0x018a
            boolean r2 = r13.f27786c
            if (r2 != 0) goto L_0x0143
            goto L_0x018a
        L_0x0143:
            int r2 = r0.f27790g
            int r0 = r0.f27789f
            int r2 = r2 + r0
            int r0 = r1.f27790g
            int r1 = r1.f27789f
            int r3 = r0 - r1
            java.util.List<q2.f> r0 = r12.f27795l
            java.lang.Object r0 = r0.get(r10)
            q2.f r0 = (q2.f) r0
            int r0 = r0.f27790g
            int r1 = r12.f27789f
            int r4 = r0 + r1
            java.util.List<q2.f> r0 = r13.f27795l
            java.lang.Object r0 = r0.get(r10)
            q2.f r0 = (q2.f) r0
            int r0 = r0.f27790g
            int r1 = r13.f27789f
            int r5 = r0 - r1
            int[] r1 = f27800k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.q(r1, r2, r3, r4, r5, r6, r7)
            q2.g r0 = r8.f27831e
            int[] r1 = f27800k
            r1 = r1[r10]
            r0.d(r1)
            p2.e r0 = r8.f27828b
            q2.n r0 = r0.f27450f
            q2.g r0 = r0.f27831e
            int[] r1 = f27800k
            r1 = r1[r9]
            r0.d(r1)
            goto L_0x018b
        L_0x018a:
            return
        L_0x018b:
            q2.f r0 = r8.f27834h
            boolean r1 = r0.f27786c
            if (r1 == 0) goto L_0x01ff
            q2.f r1 = r8.f27835i
            boolean r1 = r1.f27786c
            if (r1 == 0) goto L_0x01ff
            boolean r1 = r12.f27786c
            if (r1 == 0) goto L_0x01ff
            boolean r1 = r13.f27786c
            if (r1 != 0) goto L_0x01a0
            goto L_0x01ff
        L_0x01a0:
            java.util.List<q2.f> r0 = r0.f27795l
            java.lang.Object r0 = r0.get(r10)
            q2.f r0 = (q2.f) r0
            int r0 = r0.f27790g
            q2.f r1 = r8.f27834h
            int r1 = r1.f27789f
            int r2 = r0 + r1
            q2.f r0 = r8.f27835i
            java.util.List<q2.f> r0 = r0.f27795l
            java.lang.Object r0 = r0.get(r10)
            q2.f r0 = (q2.f) r0
            int r0 = r0.f27790g
            q2.f r1 = r8.f27835i
            int r1 = r1.f27789f
            int r3 = r0 - r1
            java.util.List<q2.f> r0 = r12.f27795l
            java.lang.Object r0 = r0.get(r10)
            q2.f r0 = (q2.f) r0
            int r0 = r0.f27790g
            int r1 = r12.f27789f
            int r4 = r0 + r1
            java.util.List<q2.f> r0 = r13.f27795l
            java.lang.Object r0 = r0.get(r10)
            q2.f r0 = (q2.f) r0
            int r0 = r0.f27790g
            int r1 = r13.f27789f
            int r5 = r0 - r1
            int[] r1 = f27800k
            r0 = r16
            r6 = r15
            r7 = r14
            r0.q(r1, r2, r3, r4, r5, r6, r7)
            q2.g r0 = r8.f27831e
            int[] r1 = f27800k
            r1 = r1[r10]
            r0.d(r1)
            p2.e r0 = r8.f27828b
            q2.n r0 = r0.f27450f
            q2.g r0 = r0.f27831e
            int[] r1 = f27800k
            r1 = r1[r9]
            r0.d(r1)
            goto L_0x031f
        L_0x01ff:
            return
        L_0x0200:
            if (r1 == 0) goto L_0x0289
            if (r4 == 0) goto L_0x0289
            q2.f r0 = r8.f27834h
            boolean r0 = r0.f27786c
            if (r0 == 0) goto L_0x0288
            q2.f r0 = r8.f27835i
            boolean r0 = r0.f27786c
            if (r0 != 0) goto L_0x0212
            goto L_0x0288
        L_0x0212:
            p2.e r0 = r8.f27828b
            float r0 = r0.v()
            q2.f r1 = r8.f27834h
            java.util.List<q2.f> r1 = r1.f27795l
            java.lang.Object r1 = r1.get(r10)
            q2.f r1 = (q2.f) r1
            int r1 = r1.f27790g
            q2.f r2 = r8.f27834h
            int r2 = r2.f27789f
            int r1 = r1 + r2
            q2.f r2 = r8.f27835i
            java.util.List<q2.f> r2 = r2.f27795l
            java.lang.Object r2 = r2.get(r10)
            q2.f r2 = (q2.f) r2
            int r2 = r2.f27790g
            q2.f r4 = r8.f27835i
            int r4 = r4.f27789f
            int r2 = r2 - r4
            if (r14 == r3) goto L_0x0265
            if (r14 == 0) goto L_0x0265
            if (r14 == r9) goto L_0x0242
            goto L_0x031f
        L_0x0242:
            int r2 = r2 - r1
            int r1 = r8.g(r2, r10)
            float r2 = (float) r1
            float r2 = r2 / r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.g(r2, r9)
            if (r2 == r3) goto L_0x0255
            float r1 = (float) r3
            float r1 = r1 * r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x0255:
            q2.g r0 = r8.f27831e
            r0.d(r1)
            p2.e r0 = r8.f27828b
            q2.n r0 = r0.f27450f
            q2.g r0 = r0.f27831e
            r0.d(r3)
            goto L_0x031f
        L_0x0265:
            int r2 = r2 - r1
            int r1 = r8.g(r2, r10)
            float r2 = (float) r1
            float r2 = r2 * r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.g(r2, r9)
            if (r2 == r3) goto L_0x0278
            float r1 = (float) r3
            float r1 = r1 / r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x0278:
            q2.g r0 = r8.f27831e
            r0.d(r1)
            p2.e r0 = r8.f27828b
            q2.n r0 = r0.f27450f
            q2.g r0 = r0.f27831e
            r0.d(r3)
            goto L_0x031f
        L_0x0288:
            return
        L_0x0289:
            if (r2 == 0) goto L_0x031f
            if (r5 == 0) goto L_0x031f
            boolean r0 = r12.f27786c
            if (r0 == 0) goto L_0x0301
            boolean r0 = r13.f27786c
            if (r0 != 0) goto L_0x0296
            goto L_0x0301
        L_0x0296:
            p2.e r0 = r8.f27828b
            float r0 = r0.v()
            java.util.List<q2.f> r1 = r12.f27795l
            java.lang.Object r1 = r1.get(r10)
            q2.f r1 = (q2.f) r1
            int r1 = r1.f27790g
            int r2 = r12.f27789f
            int r1 = r1 + r2
            java.util.List<q2.f> r2 = r13.f27795l
            java.lang.Object r2 = r2.get(r10)
            q2.f r2 = (q2.f) r2
            int r2 = r2.f27790g
            int r4 = r13.f27789f
            int r2 = r2 - r4
            if (r14 == r3) goto L_0x02df
            if (r14 == 0) goto L_0x02bd
            if (r14 == r9) goto L_0x02df
            goto L_0x031f
        L_0x02bd:
            int r2 = r2 - r1
            int r1 = r8.g(r2, r9)
            float r2 = (float) r1
            float r2 = r2 * r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.g(r2, r10)
            if (r2 == r3) goto L_0x02d0
            float r1 = (float) r3
            float r1 = r1 / r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x02d0:
            q2.g r0 = r8.f27831e
            r0.d(r3)
            p2.e r0 = r8.f27828b
            q2.n r0 = r0.f27450f
            q2.g r0 = r0.f27831e
            r0.d(r1)
            goto L_0x031f
        L_0x02df:
            int r2 = r2 - r1
            int r1 = r8.g(r2, r9)
            float r2 = (float) r1
            float r2 = r2 / r0
            float r2 = r2 + r11
            int r2 = (int) r2
            int r3 = r8.g(r2, r10)
            if (r2 == r3) goto L_0x02f2
            float r1 = (float) r3
            float r1 = r1 * r0
            float r1 = r1 + r11
            int r1 = (int) r1
        L_0x02f2:
            q2.g r0 = r8.f27831e
            r0.d(r3)
            p2.e r0 = r8.f27828b
            q2.n r0 = r0.f27450f
            q2.g r0 = r0.f27831e
            r0.d(r1)
            goto L_0x031f
        L_0x0301:
            return
        L_0x0302:
            p2.e r0 = r0.L()
            if (r0 == 0) goto L_0x031f
            q2.l r0 = r0.f27448e
            q2.g r0 = r0.f27831e
            boolean r1 = r0.f27793j
            if (r1 == 0) goto L_0x031f
            p2.e r1 = r8.f27828b
            float r1 = r1.f27406B
            int r0 = r0.f27790g
            float r0 = (float) r0
            float r0 = r0 * r1
            float r0 = r0 + r11
            int r0 = (int) r0
            q2.g r1 = r8.f27831e
            r1.d(r0)
        L_0x031f:
            q2.f r0 = r8.f27834h
            boolean r1 = r0.f27786c
            if (r1 == 0) goto L_0x043f
            q2.f r1 = r8.f27835i
            boolean r2 = r1.f27786c
            if (r2 != 0) goto L_0x032d
            goto L_0x043f
        L_0x032d:
            boolean r0 = r0.f27793j
            if (r0 == 0) goto L_0x033c
            boolean r0 = r1.f27793j
            if (r0 == 0) goto L_0x033c
            q2.g r0 = r8.f27831e
            boolean r0 = r0.f27793j
            if (r0 == 0) goto L_0x033c
            return
        L_0x033c:
            q2.g r0 = r8.f27831e
            boolean r0 = r0.f27793j
            if (r0 != 0) goto L_0x0386
            p2.e$b r0 = r8.f27830d
            p2.e$b r1 = p2.e.b.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x0386
            p2.e r0 = r8.f27828b
            int r1 = r0.f27484w
            if (r1 != 0) goto L_0x0386
            boolean r0 = r0.k0()
            if (r0 != 0) goto L_0x0386
            q2.f r0 = r8.f27834h
            java.util.List<q2.f> r0 = r0.f27795l
            java.lang.Object r0 = r0.get(r10)
            q2.f r0 = (q2.f) r0
            q2.f r1 = r8.f27835i
            java.util.List<q2.f> r1 = r1.f27795l
            java.lang.Object r1 = r1.get(r10)
            q2.f r1 = (q2.f) r1
            int r0 = r0.f27790g
            q2.f r2 = r8.f27834h
            int r3 = r2.f27789f
            int r0 = r0 + r3
            int r1 = r1.f27790g
            q2.f r3 = r8.f27835i
            int r3 = r3.f27789f
            int r1 = r1 + r3
            int r3 = r1 - r0
            r2.d(r0)
            q2.f r0 = r8.f27835i
            r0.d(r1)
            q2.g r0 = r8.f27831e
            r0.d(r3)
            return
        L_0x0386:
            q2.g r0 = r8.f27831e
            boolean r0 = r0.f27793j
            if (r0 != 0) goto L_0x03ea
            p2.e$b r0 = r8.f27830d
            p2.e$b r1 = p2.e.b.MATCH_CONSTRAINT
            if (r0 != r1) goto L_0x03ea
            int r0 = r8.f27827a
            if (r0 != r9) goto L_0x03ea
            q2.f r0 = r8.f27834h
            java.util.List<q2.f> r0 = r0.f27795l
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x03ea
            q2.f r0 = r8.f27835i
            java.util.List<q2.f> r0 = r0.f27795l
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x03ea
            q2.f r0 = r8.f27834h
            java.util.List<q2.f> r0 = r0.f27795l
            java.lang.Object r0 = r0.get(r10)
            q2.f r0 = (q2.f) r0
            q2.f r1 = r8.f27835i
            java.util.List<q2.f> r1 = r1.f27795l
            java.lang.Object r1 = r1.get(r10)
            q2.f r1 = (q2.f) r1
            int r0 = r0.f27790g
            q2.f r2 = r8.f27834h
            int r2 = r2.f27789f
            int r0 = r0 + r2
            int r1 = r1.f27790g
            q2.f r2 = r8.f27835i
            int r2 = r2.f27789f
            int r1 = r1 + r2
            int r1 = r1 - r0
            q2.g r0 = r8.f27831e
            int r0 = r0.f27796m
            int r0 = java.lang.Math.min(r1, r0)
            p2.e r1 = r8.f27828b
            int r2 = r1.f27404A
            int r1 = r1.f27490z
            int r0 = java.lang.Math.max(r1, r0)
            if (r2 <= 0) goto L_0x03e5
            int r0 = java.lang.Math.min(r2, r0)
        L_0x03e5:
            q2.g r1 = r8.f27831e
            r1.d(r0)
        L_0x03ea:
            q2.g r0 = r8.f27831e
            boolean r0 = r0.f27793j
            if (r0 != 0) goto L_0x03f1
            return
        L_0x03f1:
            q2.f r0 = r8.f27834h
            java.util.List<q2.f> r0 = r0.f27795l
            java.lang.Object r0 = r0.get(r10)
            q2.f r0 = (q2.f) r0
            q2.f r1 = r8.f27835i
            java.util.List<q2.f> r1 = r1.f27795l
            java.lang.Object r1 = r1.get(r10)
            q2.f r1 = (q2.f) r1
            int r2 = r0.f27790g
            q2.f r3 = r8.f27834h
            int r3 = r3.f27789f
            int r2 = r2 + r3
            int r3 = r1.f27790g
            q2.f r4 = r8.f27835i
            int r4 = r4.f27789f
            int r3 = r3 + r4
            p2.e r4 = r8.f27828b
            float r4 = r4.y()
            if (r0 != r1) goto L_0x0420
            int r2 = r0.f27790g
            int r3 = r1.f27790g
            r4 = r11
        L_0x0420:
            int r3 = r3 - r2
            q2.g r0 = r8.f27831e
            int r0 = r0.f27790g
            int r3 = r3 - r0
            q2.f r0 = r8.f27834h
            float r1 = (float) r2
            float r1 = r1 + r11
            float r2 = (float) r3
            float r2 = r2 * r4
            float r1 = r1 + r2
            int r1 = (int) r1
            r0.d(r1)
            q2.f r0 = r8.f27835i
            q2.f r1 = r8.f27834h
            int r1 = r1.f27790g
            q2.g r2 = r8.f27831e
            int r2 = r2.f27790g
            int r1 = r1 + r2
            r0.d(r1)
        L_0x043f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: q2.l.a(q2.d):void");
    }

    /* access modifiers changed from: package-private */
    public void d() {
        e L10;
        e L11;
        e eVar = this.f27828b;
        if (eVar.f27440a) {
            this.f27831e.d(eVar.Y());
        }
        if (!this.f27831e.f27793j) {
            e.b A10 = this.f27828b.A();
            this.f27830d = A10;
            if (A10 != e.b.MATCH_CONSTRAINT) {
                e.b bVar = e.b.MATCH_PARENT;
                if (A10 == bVar && (L11 = this.f27828b.L()) != null && (L11.A() == e.b.FIXED || L11.A() == bVar)) {
                    int Y10 = (L11.Y() - this.f27828b.f27428O.f()) - this.f27828b.f27430Q.f();
                    b(this.f27834h, L11.f27448e.f27834h, this.f27828b.f27428O.f());
                    b(this.f27835i, L11.f27448e.f27835i, -this.f27828b.f27430Q.f());
                    this.f27831e.d(Y10);
                    return;
                } else if (this.f27830d == e.b.FIXED) {
                    this.f27831e.d(this.f27828b.Y());
                }
            }
        } else {
            e.b bVar2 = this.f27830d;
            e.b bVar3 = e.b.MATCH_PARENT;
            if (bVar2 == bVar3 && (L10 = this.f27828b.L()) != null && (L10.A() == e.b.FIXED || L10.A() == bVar3)) {
                b(this.f27834h, L10.f27448e.f27834h, this.f27828b.f27428O.f());
                b(this.f27835i, L10.f27448e.f27835i, -this.f27828b.f27430Q.f());
                return;
            }
        }
        g gVar = this.f27831e;
        if (gVar.f27793j) {
            e eVar2 = this.f27828b;
            if (eVar2.f27440a) {
                d[] dVarArr = eVar2.f27436W;
                d dVar = dVarArr[0];
                d dVar2 = dVar.f27399f;
                if (dVar2 == null || dVarArr[1].f27399f == null) {
                    if (dVar2 != null) {
                        f h10 = h(dVar);
                        if (h10 != null) {
                            b(this.f27834h, h10, this.f27828b.f27436W[0].f());
                            b(this.f27835i, this.f27834h, this.f27831e.f27790g);
                            return;
                        }
                        return;
                    }
                    d dVar3 = dVarArr[1];
                    if (dVar3.f27399f != null) {
                        f h11 = h(dVar3);
                        if (h11 != null) {
                            b(this.f27835i, h11, -this.f27828b.f27436W[1].f());
                            b(this.f27834h, this.f27835i, -this.f27831e.f27790g);
                            return;
                        }
                        return;
                    } else if (!(eVar2 instanceof i) && eVar2.L() != null && this.f27828b.o(d.a.CENTER).f27399f == null) {
                        b(this.f27834h, this.f27828b.L().f27448e.f27834h, this.f27828b.Z());
                        b(this.f27835i, this.f27834h, this.f27831e.f27790g);
                        return;
                    } else {
                        return;
                    }
                } else if (eVar2.k0()) {
                    this.f27834h.f27789f = this.f27828b.f27436W[0].f();
                    this.f27835i.f27789f = -this.f27828b.f27436W[1].f();
                    return;
                } else {
                    f h12 = h(this.f27828b.f27436W[0]);
                    if (h12 != null) {
                        b(this.f27834h, h12, this.f27828b.f27436W[0].f());
                    }
                    f h13 = h(this.f27828b.f27436W[1]);
                    if (h13 != null) {
                        b(this.f27835i, h13, -this.f27828b.f27436W[1].f());
                    }
                    this.f27834h.f27785b = true;
                    this.f27835i.f27785b = true;
                    return;
                }
            }
        }
        if (this.f27830d == e.b.MATCH_CONSTRAINT) {
            e eVar3 = this.f27828b;
            int i10 = eVar3.f27484w;
            if (i10 == 2) {
                e L12 = eVar3.L();
                if (L12 != null) {
                    g gVar2 = L12.f27450f.f27831e;
                    this.f27831e.f27795l.add(gVar2);
                    gVar2.f27794k.add(this.f27831e);
                    g gVar3 = this.f27831e;
                    gVar3.f27785b = true;
                    gVar3.f27794k.add(this.f27834h);
                    this.f27831e.f27794k.add(this.f27835i);
                }
            } else if (i10 == 3) {
                if (eVar3.f27486x == 3) {
                    this.f27834h.f27784a = this;
                    this.f27835i.f27784a = this;
                    n nVar = eVar3.f27450f;
                    nVar.f27834h.f27784a = this;
                    nVar.f27835i.f27784a = this;
                    gVar.f27784a = this;
                    if (eVar3.m0()) {
                        this.f27831e.f27795l.add(this.f27828b.f27450f.f27831e);
                        this.f27828b.f27450f.f27831e.f27794k.add(this.f27831e);
                        n nVar2 = this.f27828b.f27450f;
                        nVar2.f27831e.f27784a = this;
                        this.f27831e.f27795l.add(nVar2.f27834h);
                        this.f27831e.f27795l.add(this.f27828b.f27450f.f27835i);
                        this.f27828b.f27450f.f27834h.f27794k.add(this.f27831e);
                        this.f27828b.f27450f.f27835i.f27794k.add(this.f27831e);
                    } else if (this.f27828b.k0()) {
                        this.f27828b.f27450f.f27831e.f27795l.add(this.f27831e);
                        this.f27831e.f27794k.add(this.f27828b.f27450f.f27831e);
                    } else {
                        this.f27828b.f27450f.f27831e.f27795l.add(this.f27831e);
                    }
                } else {
                    g gVar4 = eVar3.f27450f.f27831e;
                    gVar.f27795l.add(gVar4);
                    gVar4.f27794k.add(this.f27831e);
                    this.f27828b.f27450f.f27834h.f27794k.add(this.f27831e);
                    this.f27828b.f27450f.f27835i.f27794k.add(this.f27831e);
                    g gVar5 = this.f27831e;
                    gVar5.f27785b = true;
                    gVar5.f27794k.add(this.f27834h);
                    this.f27831e.f27794k.add(this.f27835i);
                    this.f27834h.f27795l.add(this.f27831e);
                    this.f27835i.f27795l.add(this.f27831e);
                }
            }
        }
        e eVar4 = this.f27828b;
        d[] dVarArr2 = eVar4.f27436W;
        d dVar4 = dVarArr2[0];
        d dVar5 = dVar4.f27399f;
        if (dVar5 == null || dVarArr2[1].f27399f == null) {
            if (dVar5 != null) {
                f h14 = h(dVar4);
                if (h14 != null) {
                    b(this.f27834h, h14, this.f27828b.f27436W[0].f());
                    c(this.f27835i, this.f27834h, 1, this.f27831e);
                    return;
                }
                return;
            }
            d dVar6 = dVarArr2[1];
            if (dVar6.f27399f != null) {
                f h15 = h(dVar6);
                if (h15 != null) {
                    b(this.f27835i, h15, -this.f27828b.f27436W[1].f());
                    c(this.f27834h, this.f27835i, -1, this.f27831e);
                }
            } else if (!(eVar4 instanceof i) && eVar4.L() != null) {
                b(this.f27834h, this.f27828b.L().f27448e.f27834h, this.f27828b.Z());
                c(this.f27835i, this.f27834h, 1, this.f27831e);
            }
        } else if (eVar4.k0()) {
            this.f27834h.f27789f = this.f27828b.f27436W[0].f();
            this.f27835i.f27789f = -this.f27828b.f27436W[1].f();
        } else {
            f h16 = h(this.f27828b.f27436W[0]);
            f h17 = h(this.f27828b.f27436W[1]);
            if (h16 != null) {
                h16.b(this);
            }
            if (h17 != null) {
                h17.b(this);
            }
            this.f27836j = p.b.CENTER;
        }
    }

    public void e() {
        f fVar = this.f27834h;
        if (fVar.f27793j) {
            this.f27828b.q1(fVar.f27790g);
        }
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.f27829c = null;
        this.f27834h.c();
        this.f27835i.c();
        this.f27831e.c();
        this.f27833g = false;
    }

    /* access modifiers changed from: package-private */
    public boolean m() {
        return this.f27830d != e.b.MATCH_CONSTRAINT || this.f27828b.f27484w == 0;
    }

    /* access modifiers changed from: package-private */
    public void r() {
        this.f27833g = false;
        this.f27834h.c();
        this.f27834h.f27793j = false;
        this.f27835i.c();
        this.f27835i.f27793j = false;
        this.f27831e.f27793j = false;
    }

    public String toString() {
        return "HorizontalRun " + this.f27828b.t();
    }
}

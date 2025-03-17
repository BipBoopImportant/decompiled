package G8;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LG8/s;", "", "<init>", "()V", "", "patternStr", "value", "", "a", "(Ljava/lang/String;Ljava/lang/String;)Z", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class s {

    /* renamed from: a  reason: collision with root package name */
    public static final s f36287a = new s();

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f36288a;

        /* JADX WARNING: Can't wrap try/catch for region: R(11:0|1|2|3|4|5|6|7|8|9|11) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0019 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0022 */
        static {
            /*
                G8.o[] r0 = G8.o.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                G8.o r1 = G8.o.LT     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                G8.o r1 = G8.o.LTE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                G8.o r1 = G8.o.GT     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                G8.o r1 = G8.o.GTE     // Catch:{ NoSuchFieldError -> 0x002b }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                f36288a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: G8.s.a.<clinit>():void");
        }
    }

    private s() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0062, code lost:
        if (r8.f(r7, r1) >= 0) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006f, code lost:
        if (r8.f(r7, r1) > 0) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0076, code lost:
        if (r8.f(r7, r1) <= 0) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007d, code lost:
        if (r8.f(r7, r1) < 0) goto L_0x007f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0079  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean a(java.lang.String r7, java.lang.String r8) {
        /*
            java.lang.String r0 = "patternStr"
            kotlin.jvm.internal.C17542s.j(r7, r0)
            java.lang.String r0 = "value"
            kotlin.jvm.internal.C17542s.j(r8, r0)
            G8.x$a r0 = G8.x.f36297c
            G8.x r8 = r0.a(r8)
            java.lang.CharSequence r7 = HJ.C15854t.z1(r7)
            java.lang.String r7 = r7.toString()
            java.lang.String r1 = "<="
            r2 = 0
            r3 = 2
            r4 = 0
            boolean r1 = HJ.C15854t.W(r7, r1, r2, r3, r4)
            r5 = 1
            if (r1 == 0) goto L_0x002f
            G8.o r1 = G8.o.LTE
        L_0x0026:
            java.lang.String r7 = HJ.C15854t.E1(r7, r3)
        L_0x002a:
            G8.x r7 = r0.a(r7)
            goto L_0x004c
        L_0x002f:
            java.lang.String r1 = "<"
            boolean r1 = HJ.C15854t.W(r7, r1, r2, r3, r4)
            if (r1 == 0) goto L_0x003e
            G8.o r1 = G8.o.LT
        L_0x0039:
            java.lang.String r7 = HJ.C15854t.E1(r7, r5)
            goto L_0x002a
        L_0x003e:
            java.lang.String r1 = ">="
            boolean r1 = HJ.C15854t.W(r7, r1, r2, r3, r4)
            if (r1 == 0) goto L_0x0049
            G8.o r1 = G8.o.GTE
            goto L_0x0026
        L_0x0049:
            G8.o r1 = G8.o.GT
            goto L_0x0039
        L_0x004c:
            int[] r4 = G8.s.a.f36288a
            int r6 = r1.ordinal()
            r4 = r4[r6]
            if (r4 == r5) goto L_0x0079
            if (r4 == r3) goto L_0x0072
            r3 = 3
            if (r4 == r3) goto L_0x006b
            r3 = 4
            if (r4 != r3) goto L_0x0065
            int r1 = r8.f(r7, r1)
            if (r1 < 0) goto L_0x0080
            goto L_0x007f
        L_0x0065:
            XH.t r7 = new XH.t
            r7.<init>()
            throw r7
        L_0x006b:
            int r1 = r8.f(r7, r1)
            if (r1 <= 0) goto L_0x0080
            goto L_0x007f
        L_0x0072:
            int r1 = r8.f(r7, r1)
            if (r1 > 0) goto L_0x0080
            goto L_0x007f
        L_0x0079:
            int r1 = r8.f(r7, r1)
            if (r1 >= 0) goto L_0x0080
        L_0x007f:
            r2 = r5
        L_0x0080:
            r0.c(r7)
            r0.c(r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: G8.s.a(java.lang.String, java.lang.String):boolean");
    }
}

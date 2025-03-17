package ga;

/* renamed from: ga.y  reason: case insensitive filesystem */
final class C7922y extends C7915q {

    /* renamed from: g  reason: collision with root package name */
    static final C7915q f51424g = new C7922y((Object) null, new Object[0], 0);

    /* renamed from: d  reason: collision with root package name */
    private final transient Object f51425d;

    /* renamed from: e  reason: collision with root package name */
    final transient Object[] f51426e;

    /* renamed from: f  reason: collision with root package name */
    private final transient int f51427f;

    private C7922y(Object obj, Object[] objArr, int i10) {
        this.f51425d = obj;
        this.f51426e = objArr;
        this.f51427f = i10;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.lang.Object[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: short[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v25, resolved type: short[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0061  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static ga.C7922y i(int r16, java.lang.Object[] r17, ga.C7914p r18) {
        /*
            r0 = r16
            r1 = r17
            r2 = r18
            if (r0 != 0) goto L_0x000d
            ga.q r0 = f51424g
            ga.y r0 = (ga.C7922y) r0
            return r0
        L_0x000d:
            r3 = 0
            r4 = 0
            r5 = 1
            if (r0 != r5) goto L_0x0025
            r0 = r1[r4]
            r0.getClass()
            r2 = r1[r5]
            r2.getClass()
            ga.C7905g.a(r0, r2)
            ga.y r0 = new ga.y
            r0.<init>(r3, r1, r5)
            return r0
        L_0x0025:
            int r6 = r1.length
            int r6 = r6 >> r5
            java.lang.String r7 = "index"
            ga.C7902d.b(r0, r6, r7)
            r6 = 2
            int r7 = java.lang.Math.max(r0, r6)
            r8 = 751619276(0x2ccccccc, float:5.8207657E-12)
            if (r7 >= r8) goto L_0x004a
            int r8 = r7 + -1
            int r8 = java.lang.Integer.highestOneBit(r8)
        L_0x003c:
            int r8 = r8 + r8
            double r9 = (double) r8
            r11 = 4604480259023595110(0x3fe6666666666666, double:0.7)
            double r9 = r9 * r11
            double r11 = (double) r7
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 >= 0) goto L_0x004e
            goto L_0x003c
        L_0x004a:
            r8 = 1073741824(0x40000000, float:2.0)
            if (r7 >= r8) goto L_0x01e3
        L_0x004e:
            if (r0 != r5) goto L_0x0061
            r7 = r1[r4]
            r7.getClass()
            r8 = r1[r5]
            r8.getClass()
            ga.C7905g.a(r7, r8)
            r7 = r5
            r5 = r6
            goto L_0x01b6
        L_0x0061:
            int r7 = r8 + -1
            r9 = 128(0x80, float:1.794E-43)
            r10 = 3
            r11 = -1
            if (r8 > r9) goto L_0x00db
            byte[] r8 = new byte[r8]
            java.util.Arrays.fill(r8, r11)
            r9 = r4
            r11 = r9
        L_0x0070:
            if (r9 >= r0) goto L_0x00c3
            int r12 = r11 + r11
            int r13 = r9 + r9
            r14 = r1[r13]
            r14.getClass()
            r13 = r13 ^ r5
            r13 = r1[r13]
            r13.getClass()
            ga.C7905g.a(r14, r13)
            int r15 = r14.hashCode()
            int r15 = ga.C7907i.a(r15)
        L_0x008c:
            r15 = r15 & r7
            byte r6 = r8[r15]
            r5 = 255(0xff, float:3.57E-43)
            r6 = r6 & r5
            if (r6 != r5) goto L_0x00a2
            byte r5 = (byte) r12
            r8[r15] = r5
            if (r11 >= r9) goto L_0x009f
            r1[r12] = r14
            r5 = r12 ^ 1
            r1[r5] = r13
        L_0x009f:
            int r11 = r11 + 1
            goto L_0x00b9
        L_0x00a2:
            r5 = r1[r6]
            boolean r5 = r14.equals(r5)
            if (r5 == 0) goto L_0x00be
            r3 = r6 ^ 1
            ga.o r5 = new ga.o
            r6 = r1[r3]
            r6.getClass()
            r5.<init>(r14, r13, r6)
            r1[r3] = r13
            r3 = r5
        L_0x00b9:
            int r9 = r9 + 1
            r5 = 1
            r6 = 2
            goto L_0x0070
        L_0x00be:
            int r15 = r15 + 1
            r5 = 1
            r6 = 2
            goto L_0x008c
        L_0x00c3:
            if (r11 != r0) goto L_0x00ca
            r3 = r8
        L_0x00c6:
            r5 = 2
        L_0x00c7:
            r7 = 1
            goto L_0x01b6
        L_0x00ca:
            java.lang.Object[] r5 = new java.lang.Object[r10]
            r5[r4] = r8
            java.lang.Integer r6 = java.lang.Integer.valueOf(r11)
            r7 = 1
            r5[r7] = r6
            r6 = 2
            r5[r6] = r3
            r3 = r5
            r5 = r6
            goto L_0x00c7
        L_0x00db:
            r5 = 32768(0x8000, float:4.5918E-41)
            if (r8 > r5) goto L_0x014e
            short[] r5 = new short[r8]
            java.util.Arrays.fill(r5, r11)
            r6 = r4
            r8 = r6
        L_0x00e7:
            if (r6 >= r0) goto L_0x0138
            int r9 = r8 + r8
            int r11 = r6 + r6
            r12 = r1[r11]
            r12.getClass()
            r13 = 1
            r11 = r11 ^ r13
            r11 = r1[r11]
            r11.getClass()
            ga.C7905g.a(r12, r11)
            int r13 = r12.hashCode()
            int r13 = ga.C7907i.a(r13)
        L_0x0104:
            r13 = r13 & r7
            short r14 = r5[r13]
            char r14 = (char) r14
            r15 = 65535(0xffff, float:9.1834E-41)
            if (r14 != r15) goto L_0x011b
            short r14 = (short) r9
            r5[r13] = r14
            if (r8 >= r6) goto L_0x0118
            r1[r9] = r12
            r9 = r9 ^ 1
            r1[r9] = r11
        L_0x0118:
            int r8 = r8 + 1
            goto L_0x0132
        L_0x011b:
            r15 = r1[r14]
            boolean r15 = r12.equals(r15)
            if (r15 == 0) goto L_0x0135
            r3 = r14 ^ 1
            ga.o r9 = new ga.o
            r13 = r1[r3]
            r13.getClass()
            r9.<init>(r12, r11, r13)
            r1[r3] = r11
            r3 = r9
        L_0x0132:
            int r6 = r6 + 1
            goto L_0x00e7
        L_0x0135:
            int r13 = r13 + 1
            goto L_0x0104
        L_0x0138:
            if (r8 != r0) goto L_0x013c
        L_0x013a:
            r3 = r5
            goto L_0x00c6
        L_0x013c:
            java.lang.Object[] r6 = new java.lang.Object[r10]
            r6[r4] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            r9 = 1
            r6[r9] = r5
            r5 = 2
            r6[r5] = r3
            r3 = r6
            r7 = r9
            goto L_0x01b6
        L_0x014e:
            r9 = 1
            int[] r5 = new int[r8]
            java.util.Arrays.fill(r5, r11)
            r6 = r4
            r8 = r6
        L_0x0156:
            if (r6 >= r0) goto L_0x01a4
            int r12 = r8 + r8
            int r13 = r6 + r6
            r14 = r1[r13]
            r14.getClass()
            r13 = r13 ^ r9
            r9 = r1[r13]
            r9.getClass()
            ga.C7905g.a(r14, r9)
            int r13 = r14.hashCode()
            int r13 = ga.C7907i.a(r13)
        L_0x0172:
            r13 = r13 & r7
            r15 = r5[r13]
            if (r15 != r11) goto L_0x0184
            r5[r13] = r12
            if (r8 >= r6) goto L_0x0181
            r1[r12] = r14
            r12 = r12 ^ 1
            r1[r12] = r9
        L_0x0181:
            int r8 = r8 + 1
            goto L_0x019b
        L_0x0184:
            r11 = r1[r15]
            boolean r11 = r14.equals(r11)
            if (r11 == 0) goto L_0x01a0
            r3 = r15 ^ 1
            ga.o r11 = new ga.o
            r12 = r1[r3]
            r12.getClass()
            r11.<init>(r14, r9, r12)
            r1[r3] = r9
            r3 = r11
        L_0x019b:
            int r6 = r6 + 1
            r9 = 1
            r11 = -1
            goto L_0x0156
        L_0x01a0:
            int r13 = r13 + 1
            r11 = -1
            goto L_0x0172
        L_0x01a4:
            if (r8 != r0) goto L_0x01a7
            goto L_0x013a
        L_0x01a7:
            java.lang.Object[] r6 = new java.lang.Object[r10]
            r6[r4] = r5
            java.lang.Integer r5 = java.lang.Integer.valueOf(r8)
            r7 = 1
            r6[r7] = r5
            r5 = 2
            r6[r5] = r3
            r3 = r6
        L_0x01b6:
            boolean r6 = r3 instanceof java.lang.Object[]
            if (r6 == 0) goto L_0x01dd
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            r0 = r3[r5]
            ga.o r0 = (ga.C7913o) r0
            if (r2 == 0) goto L_0x01d8
            r2.f51407c = r0
            r0 = r3[r4]
            r2 = r3[r7]
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            int r3 = r2 + r2
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r3)
            r3 = r0
            r0 = r2
            goto L_0x01dd
        L_0x01d8:
            java.lang.IllegalArgumentException r0 = r0.a()
            throw r0
        L_0x01dd:
            ga.y r2 = new ga.y
            r2.<init>(r3, r1, r0)
            return r2
        L_0x01e3:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "collection too large"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ga.C7922y.i(int, java.lang.Object[], ga.p):ga.y");
    }

    /* access modifiers changed from: package-private */
    public final C7909k a() {
        return new C7921x(this.f51426e, 1, this.f51427f);
    }

    /* access modifiers changed from: package-private */
    public final r d() {
        return new C7919v(this, this.f51426e, 0, this.f51427f);
    }

    /* access modifiers changed from: package-private */
    public final r f() {
        return new C7920w(this, new C7921x(this.f51426e, 0, this.f51427f));
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x009e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009f A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object get(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f51425d
            java.lang.Object[] r1 = r9.f51426e
            int r2 = r9.f51427f
            r3 = 0
            if (r10 != 0) goto L_0x000c
        L_0x0009:
            r10 = r3
            goto L_0x009c
        L_0x000c:
            r4 = 1
            if (r2 != r4) goto L_0x0022
            r0 = 0
            r0 = r1[r0]
            r0.getClass()
            boolean r10 = r0.equals(r10)
            if (r10 == 0) goto L_0x0009
            r10 = r1[r4]
            r10.getClass()
            goto L_0x009c
        L_0x0022:
            if (r0 != 0) goto L_0x0025
            goto L_0x0009
        L_0x0025:
            boolean r2 = r0 instanceof byte[]
            r5 = -1
            if (r2 == 0) goto L_0x0051
            r2 = r0
            byte[] r2 = (byte[]) r2
            int r0 = r2.length
            int r6 = r0 + -1
            int r0 = r10.hashCode()
            int r0 = ga.C7907i.a(r0)
        L_0x0038:
            r0 = r0 & r6
            byte r5 = r2[r0]
            r7 = 255(0xff, float:3.57E-43)
            r5 = r5 & r7
            if (r5 != r7) goto L_0x0041
            goto L_0x0009
        L_0x0041:
            r7 = r1[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L_0x004e
            r10 = r5 ^ 1
            r10 = r1[r10]
            goto L_0x009c
        L_0x004e:
            int r0 = r0 + 1
            goto L_0x0038
        L_0x0051:
            boolean r2 = r0 instanceof short[]
            if (r2 == 0) goto L_0x007d
            r2 = r0
            short[] r2 = (short[]) r2
            int r0 = r2.length
            int r6 = r0 + -1
            int r0 = r10.hashCode()
            int r0 = ga.C7907i.a(r0)
        L_0x0063:
            r0 = r0 & r6
            short r5 = r2[r0]
            char r5 = (char) r5
            r7 = 65535(0xffff, float:9.1834E-41)
            if (r5 != r7) goto L_0x006d
            goto L_0x0009
        L_0x006d:
            r7 = r1[r5]
            boolean r7 = r10.equals(r7)
            if (r7 == 0) goto L_0x007a
            r10 = r5 ^ 1
            r10 = r1[r10]
            goto L_0x009c
        L_0x007a:
            int r0 = r0 + 1
            goto L_0x0063
        L_0x007d:
            int[] r0 = (int[]) r0
            int r2 = r0.length
            int r2 = r2 + r5
            int r6 = r10.hashCode()
            int r6 = ga.C7907i.a(r6)
        L_0x0089:
            r6 = r6 & r2
            r7 = r0[r6]
            if (r7 != r5) goto L_0x0090
            goto L_0x0009
        L_0x0090:
            r8 = r1[r7]
            boolean r8 = r10.equals(r8)
            if (r8 == 0) goto L_0x00a0
            r10 = r7 ^ 1
            r10 = r1[r10]
        L_0x009c:
            if (r10 != 0) goto L_0x009f
            return r3
        L_0x009f:
            return r10
        L_0x00a0:
            int r6 = r6 + 1
            goto L_0x0089
        */
        throw new UnsupportedOperationException("Method not decompiled: ga.C7922y.get(java.lang.Object):java.lang.Object");
    }

    public final int size() {
        return this.f51427f;
    }
}

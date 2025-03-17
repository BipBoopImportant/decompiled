package ha;

final class F0 extends C8079n0 {

    /* renamed from: f  reason: collision with root package name */
    static final C8079n0 f51880f = new F0((Object) null, new Object[0], 0);

    /* renamed from: d  reason: collision with root package name */
    final transient Object[] f51881d;

    /* renamed from: e  reason: collision with root package name */
    private final transient int f51882e;

    private F0(Object obj, Object[] objArr, int i10) {
        this.f51881d = objArr;
        this.f51882e = i10;
    }

    static F0 i(int i10, Object[] objArr, C8069m0 m0Var) {
        Object obj = objArr[0];
        obj.getClass();
        Object obj2 = objArr[1];
        obj2.getClass();
        Q.b(obj, obj2);
        return new F0((Object) null, objArr, 1);
    }

    /* access modifiers changed from: package-private */
    public final C8009g0 a() {
        return new E0(this.f51881d, 1, this.f51882e);
    }

    /* access modifiers changed from: package-private */
    public final C8089o0 d() {
        return new C0(this, this.f51881d, 0, this.f51882e);
    }

    /* access modifiers changed from: package-private */
    public final C8089o0 f() {
        return new D0(this, new E0(this.f51881d, 0, this.f51882e));
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0020 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001f A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object get(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object[] r0 = r4.f51881d
            int r1 = r4.f51882e
            r2 = 0
            if (r5 != 0) goto L_0x0009
        L_0x0007:
            r5 = r2
            goto L_0x001d
        L_0x0009:
            r3 = 1
            if (r1 != r3) goto L_0x0007
            r1 = 0
            r1 = r0[r1]
            r1.getClass()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x0007
            r5 = r0[r3]
            r5.getClass()
        L_0x001d:
            if (r5 != 0) goto L_0x0020
            return r2
        L_0x0020:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ha.F0.get(java.lang.Object):java.lang.Object");
    }

    public final int size() {
        return this.f51882e;
    }
}

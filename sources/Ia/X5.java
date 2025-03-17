package ia;

final class X5 extends P5 {

    /* renamed from: f  reason: collision with root package name */
    static final P5 f53481f = new X5((Object) null, new Object[0], 0);

    /* renamed from: d  reason: collision with root package name */
    final transient Object[] f53482d;

    /* renamed from: e  reason: collision with root package name */
    private final transient int f53483e;

    private X5(Object obj, Object[] objArr, int i10) {
        this.f53482d = objArr;
        this.f53483e = i10;
    }

    static X5 i(int i10, Object[] objArr, O5 o52) {
        Object obj = objArr[0];
        obj.getClass();
        Object obj2 = objArr[1];
        obj2.getClass();
        C8287j3.a(obj, obj2);
        return new X5((Object) null, objArr, 1);
    }

    /* access modifiers changed from: package-private */
    public final M4 a() {
        return new W5(this.f53482d, 1, this.f53483e);
    }

    /* access modifiers changed from: package-private */
    public final Q5 d() {
        return new U5(this, this.f53482d, 0, this.f53483e);
    }

    /* access modifiers changed from: package-private */
    public final Q5 f() {
        return new V5(this, new W5(this.f53482d, 0, this.f53483e));
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0020 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x001f A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object get(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object[] r0 = r4.f53482d
            int r1 = r4.f53483e
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
        throw new UnsupportedOperationException("Method not decompiled: ia.X5.get(java.lang.Object):java.lang.Object");
    }

    public final int size() {
        return this.f53483e;
    }
}

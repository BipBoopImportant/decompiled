package ia;

final class S5 extends N5 {

    /* renamed from: e  reason: collision with root package name */
    static final N5 f53413e = new S5(new Object[0], 0);

    /* renamed from: c  reason: collision with root package name */
    final transient Object[] f53414c;

    /* renamed from: d  reason: collision with root package name */
    private final transient int f53415d;

    S5(Object[] objArr, int i10) {
        this.f53414c = objArr;
        this.f53415d = i10;
    }

    /* access modifiers changed from: package-private */
    public final int b(Object[] objArr, int i10) {
        System.arraycopy(this.f53414c, 0, objArr, 0, this.f53415d);
        return this.f53415d;
    }

    public final Object get(int i10) {
        G1.a(i10, this.f53415d, "index");
        Object obj = this.f53414c[i10];
        obj.getClass();
        return obj;
    }

    /* access modifiers changed from: package-private */
    public final int i() {
        return this.f53415d;
    }

    /* access modifiers changed from: package-private */
    public final int j() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final Object[] k() {
        return this.f53414c;
    }

    public final int size() {
        return this.f53415d;
    }
}

package ha;

final class A0 extends C8059l0 {

    /* renamed from: f  reason: collision with root package name */
    static final C8059l0 f51772f = new A0(new Object[0], 0);

    /* renamed from: d  reason: collision with root package name */
    final transient Object[] f51773d;

    /* renamed from: e  reason: collision with root package name */
    private final transient int f51774e;

    A0(Object[] objArr, int i10) {
        this.f51773d = objArr;
        this.f51774e = i10;
    }

    /* access modifiers changed from: package-private */
    public final int b(Object[] objArr, int i10) {
        System.arraycopy(this.f51773d, 0, objArr, i10, this.f51774e);
        return i10 + this.f51774e;
    }

    public final Object get(int i10) {
        C8167w.a(i10, this.f51774e, "index");
        Object obj = this.f51773d[i10];
        obj.getClass();
        return obj;
    }

    /* access modifiers changed from: package-private */
    public final int i() {
        return this.f51774e;
    }

    /* access modifiers changed from: package-private */
    public final int j() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final Object[] m() {
        return this.f51773d;
    }

    public final int size() {
        return this.f51774e;
    }
}

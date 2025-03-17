package ga;

/* renamed from: ga.t  reason: case insensitive filesystem */
final class C7917t extends C7912n {

    /* renamed from: f  reason: collision with root package name */
    static final C7912n f51412f = new C7917t(new Object[0], 0);

    /* renamed from: d  reason: collision with root package name */
    final transient Object[] f51413d;

    /* renamed from: e  reason: collision with root package name */
    private final transient int f51414e;

    C7917t(Object[] objArr, int i10) {
        this.f51413d = objArr;
        this.f51414e = i10;
    }

    /* access modifiers changed from: package-private */
    public final int b(Object[] objArr, int i10) {
        System.arraycopy(this.f51413d, 0, objArr, 0, this.f51414e);
        return this.f51414e;
    }

    public final Object get(int i10) {
        C7902d.a(i10, this.f51414e, "index");
        Object obj = this.f51413d[i10];
        obj.getClass();
        return obj;
    }

    /* access modifiers changed from: package-private */
    public final int i() {
        return this.f51414e;
    }

    /* access modifiers changed from: package-private */
    public final int j() {
        return 0;
    }

    /* access modifiers changed from: package-private */
    public final Object[] k() {
        return this.f51413d;
    }

    public final int size() {
        return this.f51414e;
    }
}

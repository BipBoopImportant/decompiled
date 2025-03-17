package ga;

/* renamed from: ga.x  reason: case insensitive filesystem */
final class C7921x extends C7912n {

    /* renamed from: d  reason: collision with root package name */
    private final transient Object[] f51421d;

    /* renamed from: e  reason: collision with root package name */
    private final transient int f51422e;

    /* renamed from: f  reason: collision with root package name */
    private final transient int f51423f;

    C7921x(Object[] objArr, int i10, int i11) {
        this.f51421d = objArr;
        this.f51422e = i10;
        this.f51423f = i11;
    }

    public final Object get(int i10) {
        C7902d.a(i10, this.f51423f, "index");
        Object obj = this.f51421d[i10 + i10 + this.f51422e];
        obj.getClass();
        return obj;
    }

    public final int size() {
        return this.f51423f;
    }
}

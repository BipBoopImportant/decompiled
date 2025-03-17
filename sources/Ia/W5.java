package ia;

final class W5 extends N5 {

    /* renamed from: c  reason: collision with root package name */
    private final transient Object[] f53467c;

    /* renamed from: d  reason: collision with root package name */
    private final transient int f53468d;

    /* renamed from: e  reason: collision with root package name */
    private final transient int f53469e;

    W5(Object[] objArr, int i10, int i11) {
        this.f53467c = objArr;
        this.f53468d = i10;
        this.f53469e = i11;
    }

    public final Object get(int i10) {
        G1.a(i10, this.f53469e, "index");
        Object obj = this.f53467c[i10 + i10 + this.f53468d];
        obj.getClass();
        return obj;
    }

    public final int size() {
        return this.f53469e;
    }
}

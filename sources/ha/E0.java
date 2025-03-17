package ha;

final class E0 extends C8059l0 {

    /* renamed from: d  reason: collision with root package name */
    private final transient Object[] f51863d;

    /* renamed from: e  reason: collision with root package name */
    private final transient int f51864e;

    /* renamed from: f  reason: collision with root package name */
    private final transient int f51865f;

    E0(Object[] objArr, int i10, int i11) {
        this.f51863d = objArr;
        this.f51864e = i10;
        this.f51865f = i11;
    }

    public final Object get(int i10) {
        C8167w.a(i10, this.f51865f, "index");
        Object obj = this.f51863d[i10 + i10 + this.f51864e];
        obj.getClass();
        return obj;
    }

    public final int size() {
        return this.f51865f;
    }
}

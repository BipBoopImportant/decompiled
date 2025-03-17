package V9;

@Deprecated
public abstract class a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final int f40488a;

    /* renamed from: b  reason: collision with root package name */
    private final String f40489b;

    /* renamed from: c  reason: collision with root package name */
    private final T f40490c;

    @Deprecated
    /* renamed from: V9.a$a  reason: collision with other inner class name */
    public static class C0669a extends a<Boolean> {
        public C0669a(int i10, String str, Boolean bool) {
            super(i10, str, bool);
        }
    }

    private a(int i10, String str, T t10) {
        this.f40488a = i10;
        this.f40489b = str;
        this.f40490c = t10;
        c.a().a(this);
    }

    @Deprecated
    public static C0669a a(int i10, String str, Boolean bool) {
        return new C0669a(i10, str, bool);
    }
}

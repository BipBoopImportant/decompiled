package Kb;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    private final E<?> f61468a;

    /* renamed from: b  reason: collision with root package name */
    private final int f61469b;

    /* renamed from: c  reason: collision with root package name */
    private final int f61470c;

    private q(Class<?> cls, int i10, int i11) {
        this(E.b(cls), i10, i11);
    }

    public static q a(Class<?> cls) {
        return new q(cls, 0, 2);
    }

    private static String b(int i10) {
        if (i10 == 0) {
            return "direct";
        }
        if (i10 == 1) {
            return "provider";
        }
        if (i10 == 2) {
            return "deferred";
        }
        throw new AssertionError("Unsupported injection: " + i10);
    }

    @Deprecated
    public static q h(Class<?> cls) {
        return new q(cls, 0, 0);
    }

    public static q i(E<?> e10) {
        return new q(e10, 0, 1);
    }

    public static q j(Class<?> cls) {
        return new q(cls, 0, 1);
    }

    public static q k(E<?> e10) {
        return new q(e10, 1, 0);
    }

    public static q l(Class<?> cls) {
        return new q(cls, 1, 0);
    }

    public static q m(E<?> e10) {
        return new q(e10, 1, 1);
    }

    public static q n(Class<?> cls) {
        return new q(cls, 1, 1);
    }

    public static q o(Class<?> cls) {
        return new q(cls, 2, 0);
    }

    public E<?> c() {
        return this.f61468a;
    }

    public boolean d() {
        return this.f61470c == 2;
    }

    public boolean e() {
        return this.f61470c == 0;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return this.f61468a.equals(qVar.f61468a) && this.f61469b == qVar.f61469b && this.f61470c == qVar.f61470c;
    }

    public boolean f() {
        return this.f61469b == 1;
    }

    public boolean g() {
        return this.f61469b == 2;
    }

    public int hashCode() {
        return ((((this.f61468a.hashCode() ^ 1000003) * 1000003) ^ this.f61469b) * 1000003) ^ this.f61470c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Dependency{anInterface=");
        sb2.append(this.f61468a);
        sb2.append(", type=");
        int i10 = this.f61469b;
        sb2.append(i10 == 1 ? "required" : i10 == 0 ? "optional" : "set");
        sb2.append(", injection=");
        sb2.append(b(this.f61470c));
        sb2.append("}");
        return sb2.toString();
    }

    private q(E<?> e10, int i10, int i11) {
        this.f61468a = (E) D.c(e10, "Null dependency anInterface.");
        this.f61469b = i10;
        this.f61470c = i11;
    }
}

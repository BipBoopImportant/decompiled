package H2;

public class d<F, S> {

    /* renamed from: a  reason: collision with root package name */
    public final F f7052a;

    /* renamed from: b  reason: collision with root package name */
    public final S f7053b;

    public d(F f10, S s10) {
        this.f7052a = f10;
        this.f7053b = s10;
    }

    public static <A, B> d<A, B> a(A a10, B b10) {
        return new d<>(a10, b10);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return c.a(dVar.f7052a, this.f7052a) && c.a(dVar.f7053b, this.f7053b);
    }

    public int hashCode() {
        F f10 = this.f7052a;
        int i10 = 0;
        int hashCode = f10 == null ? 0 : f10.hashCode();
        S s10 = this.f7053b;
        if (s10 != null) {
            i10 = s10.hashCode();
        }
        return hashCode ^ i10;
    }

    public String toString() {
        return "Pair{" + this.f7052a + " " + this.f7053b + "}";
    }
}

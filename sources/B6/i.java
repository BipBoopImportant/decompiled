package B6;

import H2.d;

public class i<T> {

    /* renamed from: a  reason: collision with root package name */
    T f33241a;

    /* renamed from: b  reason: collision with root package name */
    T f33242b;

    private static boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    public void b(T t10, T t11) {
        this.f33241a = t10;
        this.f33242b = t11;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return a(dVar.f7052a, this.f33241a) && a(dVar.f7053b, this.f33242b);
    }

    public int hashCode() {
        T t10 = this.f33241a;
        int i10 = 0;
        int hashCode = t10 == null ? 0 : t10.hashCode();
        T t11 = this.f33242b;
        if (t11 != null) {
            i10 = t11.hashCode();
        }
        return hashCode ^ i10;
    }

    public String toString() {
        return "Pair{" + this.f33241a + " " + this.f33242b + "}";
    }
}

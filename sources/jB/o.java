package jb;

final class o<T> extends k<T> {

    /* renamed from: a  reason: collision with root package name */
    private final T f74796a;

    o(T t10) {
        this.f74796a = t10;
    }

    public T b() {
        return this.f74796a;
    }

    public boolean c() {
        return true;
    }

    public boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f74796a.equals(((o) obj).f74796a);
        }
        return false;
    }

    public int hashCode() {
        return this.f74796a.hashCode() + 1502476572;
    }

    public String toString() {
        return "Optional.of(" + this.f74796a + ")";
    }
}

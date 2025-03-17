package jb;

/* renamed from: jb.a  reason: case insensitive filesystem */
final class C9890a<T> extends k<T> {

    /* renamed from: a  reason: collision with root package name */
    static final C9890a<Object> f74780a = new C9890a<>();

    private C9890a() {
    }

    static <T> k<T> e() {
        return f74780a;
    }

    public T b() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public boolean c() {
        return false;
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int hashCode() {
        return 2040732332;
    }

    public String toString() {
        return "Optional.absent()";
    }
}

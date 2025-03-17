package ca;

public class h {

    /* renamed from: a  reason: collision with root package name */
    private final Class f45776a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f45777b;

    private h(Class cls, Object obj) {
        this.f45776a = cls;
        this.f45777b = obj;
    }

    public static h a(Class cls, Object obj) {
        return new h(cls, obj);
    }

    public final Class b() {
        return this.f45776a;
    }

    public final Object c() {
        return this.f45777b;
    }
}

package jc;

/* renamed from: jc.a  reason: case insensitive filesystem */
public class C9894a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<T> f74817a;

    /* renamed from: b  reason: collision with root package name */
    private final T f74818b;

    public T a() {
        return this.f74818b;
    }

    public Class<T> b() {
        return this.f74817a;
    }

    public String toString() {
        return String.format("Event{type: %s, payload: %s}", new Object[]{this.f74817a, this.f74818b});
    }
}

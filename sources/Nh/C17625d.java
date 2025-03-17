package nH;

import bH.C17034a;

/* renamed from: nH.d  reason: case insensitive filesystem */
public final class C17625d<T> implements C17624c<T>, C17034a<T> {

    /* renamed from: b  reason: collision with root package name */
    private static final C17625d<Object> f144810b = new C17625d<>((Object) null);

    /* renamed from: a  reason: collision with root package name */
    private final T f144811a;

    private C17625d(T t10) {
        this.f144811a = t10;
    }

    public static <T> C17624c<T> a(T t10) {
        return new C17625d(C17627f.c(t10, "instance cannot be null"));
    }

    public T get() {
        return this.f144811a;
    }
}

package QL;

import GK.C15776D;
import GK.C15777E;
import java.util.Objects;

public final class x<T> {

    /* renamed from: a  reason: collision with root package name */
    private final C15776D f137907a;

    /* renamed from: b  reason: collision with root package name */
    private final T f137908b;

    /* renamed from: c  reason: collision with root package name */
    private final C15777E f137909c;

    private x(C15776D d10, T t10, C15777E e10) {
        this.f137907a = d10;
        this.f137908b = t10;
        this.f137909c = e10;
    }

    public static <T> x<T> c(C15777E e10, C15776D d10) {
        Objects.requireNonNull(e10, "body == null");
        Objects.requireNonNull(d10, "rawResponse == null");
        if (!d10.e1()) {
            return new x<>(d10, (Object) null, e10);
        }
        throw new IllegalArgumentException("rawResponse should not be successful response");
    }

    public static <T> x<T> g(T t10, C15776D d10) {
        Objects.requireNonNull(d10, "rawResponse == null");
        if (d10.e1()) {
            return new x<>(d10, t10, (C15777E) null);
        }
        throw new IllegalArgumentException("rawResponse must be successful response");
    }

    public T a() {
        return this.f137908b;
    }

    public int b() {
        return this.f137907a.g();
    }

    public C15777E d() {
        return this.f137909c;
    }

    public boolean e() {
        return this.f137907a.e1();
    }

    public String f() {
        return this.f137907a.s();
    }

    public String toString() {
        return this.f137907a.toString();
    }
}

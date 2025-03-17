package jb;

import java.io.Serializable;

public abstract class k<T> implements Serializable {
    k() {
    }

    public static <T> k<T> a() {
        return C9890a.e();
    }

    public static <T> k<T> d(T t10) {
        return new o(l.j(t10));
    }

    public abstract T b();

    public abstract boolean c();
}

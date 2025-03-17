package Kb;

import java.lang.annotation.Annotation;

public final class E<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Class<? extends Annotation> f61411a;

    /* renamed from: b  reason: collision with root package name */
    private final Class<T> f61412b;

    private @interface a {
    }

    public E(Class<? extends Annotation> cls, Class<T> cls2) {
        this.f61411a = cls;
        this.f61412b = cls2;
    }

    public static <T> E<T> a(Class<? extends Annotation> cls, Class<T> cls2) {
        return new E<>(cls, cls2);
    }

    public static <T> E<T> b(Class<T> cls) {
        return new E<>(a.class, cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || E.class != obj.getClass()) {
            return false;
        }
        E e10 = (E) obj;
        if (!this.f61412b.equals(e10.f61412b)) {
            return false;
        }
        return this.f61411a.equals(e10.f61411a);
    }

    public int hashCode() {
        return (this.f61412b.hashCode() * 31) + this.f61411a.hashCode();
    }

    public String toString() {
        if (this.f61411a == a.class) {
            return this.f61412b.getName();
        }
        return "@" + this.f61411a.getName() + " " + this.f61412b.getName();
    }
}

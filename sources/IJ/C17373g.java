package iJ;

import DI.C15538I;
import kotlin.jvm.internal.C17542s;
import uJ.C18096U;

/* renamed from: iJ.g  reason: case insensitive filesystem */
public abstract class C17373g<T> {

    /* renamed from: a  reason: collision with root package name */
    private final T f143502a;

    public C17373g(T t10) {
        this.f143502a = t10;
    }

    public abstract C18096U a(C15538I i10);

    public T b() {
        return this.f143502a;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            Object b10 = b();
            Object obj2 = null;
            C17373g gVar = obj instanceof C17373g ? (C17373g) obj : null;
            if (gVar != null) {
                obj2 = gVar.b();
            }
            return C17542s.e(b10, obj2);
        }
    }

    public int hashCode() {
        Object b10 = b();
        if (b10 != null) {
            return b10.hashCode();
        }
        return 0;
    }

    public String toString() {
        return String.valueOf(b());
    }
}

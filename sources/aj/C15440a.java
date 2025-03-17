package AJ;

import kotlin.jvm.internal.C17542s;

/* renamed from: AJ.a  reason: case insensitive filesystem */
public final class C15440a<T> {

    /* renamed from: a  reason: collision with root package name */
    private final T f133150a;

    /* renamed from: b  reason: collision with root package name */
    private final T f133151b;

    public C15440a(T t10, T t11) {
        this.f133150a = t10;
        this.f133151b = t11;
    }

    public final T a() {
        return this.f133150a;
    }

    public final T b() {
        return this.f133151b;
    }

    public final T c() {
        return this.f133150a;
    }

    public final T d() {
        return this.f133151b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15440a)) {
            return false;
        }
        C15440a aVar = (C15440a) obj;
        return C17542s.e(this.f133150a, aVar.f133150a) && C17542s.e(this.f133151b, aVar.f133151b);
    }

    public int hashCode() {
        T t10 = this.f133150a;
        int i10 = 0;
        int hashCode = (t10 == null ? 0 : t10.hashCode()) * 31;
        T t11 = this.f133151b;
        if (t11 != null) {
            i10 = t11.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        return "ApproximationBounds(lower=" + this.f133150a + ", upper=" + this.f133151b + ')';
    }
}

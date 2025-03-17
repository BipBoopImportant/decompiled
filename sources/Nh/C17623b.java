package nH;

import WH.C16729a;
import bH.C17034a;

/* renamed from: nH.b  reason: case insensitive filesystem */
public final class C17623b<T> implements C17628g<T>, C17034a<T> {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f144807c = new Object();

    /* renamed from: a  reason: collision with root package name */
    private volatile C17628g<T> f144808a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Object f144809b = f144807c;

    private C17623b(C17628g<T> gVar) {
        this.f144808a = gVar;
    }

    private synchronized Object a() {
        T t10;
        t10 = this.f144809b;
        if (t10 == f144807c) {
            t10 = this.f144808a.get();
            this.f144809b = e(this.f144809b, t10);
            this.f144808a = null;
        }
        return t10;
    }

    public static <T> C17034a<T> b(C17628g<T> gVar) {
        return gVar instanceof C17034a ? (C17034a) gVar : new C17623b((C17628g) C17627f.b(gVar));
    }

    @Deprecated
    public static <P extends C16729a<T>, T> C16729a<T> c(P p10) {
        return d(C17629h.a(p10));
    }

    public static <T> C17628g<T> d(C17628g<T> gVar) {
        C17627f.b(gVar);
        return gVar instanceof C17623b ? gVar : new C17623b(gVar);
    }

    private static Object e(Object obj, Object obj2) {
        if (obj == f144807c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    public T get() {
        T t10 = this.f144809b;
        return t10 == f144807c ? a() : t10;
    }
}

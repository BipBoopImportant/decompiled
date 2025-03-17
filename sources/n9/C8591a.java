package n9;

import WH.C16729a;

/* renamed from: n9.a  reason: case insensitive filesystem */
public final class C8591a<T> implements C16729a<T> {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f55105c = new Object();

    /* renamed from: a  reason: collision with root package name */
    private volatile C16729a<T> f55106a;

    /* renamed from: b  reason: collision with root package name */
    private volatile Object f55107b = f55105c;

    private C8591a(C16729a<T> aVar) {
        this.f55106a = aVar;
    }

    public static <P extends C16729a<T>, T> C16729a<T> a(P p10) {
        d.b(p10);
        return p10 instanceof C8591a ? p10 : new C8591a(p10);
    }

    private static Object b(Object obj, Object obj2) {
        if (obj == f55105c || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    public T get() {
        T t10 = this.f55107b;
        T t11 = f55105c;
        if (t10 == t11) {
            synchronized (this) {
                try {
                    t10 = this.f55107b;
                    if (t10 == t11) {
                        t10 = this.f55106a.get();
                        this.f55107b = b(this.f55107b, t10);
                        this.f55106a = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return t10;
    }
}

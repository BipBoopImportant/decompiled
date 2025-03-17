package T7;

import C7.d;
import java.util.ArrayList;
import java.util.List;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private final List<C0655a<?>> f40111a = new ArrayList();

    /* renamed from: T7.a$a  reason: collision with other inner class name */
    private static final class C0655a<T> {

        /* renamed from: a  reason: collision with root package name */
        private final Class<T> f40112a;

        /* renamed from: b  reason: collision with root package name */
        final d<T> f40113b;

        C0655a(Class<T> cls, d<T> dVar) {
            this.f40112a = cls;
            this.f40113b = dVar;
        }

        /* access modifiers changed from: package-private */
        public boolean a(Class<?> cls) {
            return this.f40112a.isAssignableFrom(cls);
        }
    }

    public synchronized <T> void a(Class<T> cls, d<T> dVar) {
        this.f40111a.add(new C0655a(cls, dVar));
    }

    public synchronized <T> d<T> b(Class<T> cls) {
        for (C0655a next : this.f40111a) {
            if (next.a(cls)) {
                return next.f40113b;
            }
        }
        return null;
    }
}

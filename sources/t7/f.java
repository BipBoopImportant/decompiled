package T7;

import C7.l;
import java.util.ArrayList;
import java.util.List;

public class f {

    /* renamed from: a  reason: collision with root package name */
    private final List<a<?>> f40125a = new ArrayList();

    private static final class a<T> {

        /* renamed from: a  reason: collision with root package name */
        private final Class<T> f40126a;

        /* renamed from: b  reason: collision with root package name */
        final l<T> f40127b;

        a(Class<T> cls, l<T> lVar) {
            this.f40126a = cls;
            this.f40127b = lVar;
        }

        /* access modifiers changed from: package-private */
        public boolean a(Class<?> cls) {
            return this.f40126a.isAssignableFrom(cls);
        }
    }

    public synchronized <Z> void a(Class<Z> cls, l<Z> lVar) {
        this.f40125a.add(new a(cls, lVar));
    }

    public synchronized <Z> l<Z> b(Class<Z> cls) {
        int size = this.f40125a.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = this.f40125a.get(i10);
            if (aVar.a(cls)) {
                return aVar.f40127b;
            }
        }
        return null;
    }
}

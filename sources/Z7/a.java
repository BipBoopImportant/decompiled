package Z7;

import H2.h;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final g<Object> f41411a = new C0728a();

    /* renamed from: Z7.a$a  reason: collision with other inner class name */
    class C0728a implements g<Object> {
        C0728a() {
        }

        public void a(Object obj) {
        }
    }

    class b implements d<List<T>> {
        b() {
        }

        /* renamed from: b */
        public List<T> a() {
            return new ArrayList();
        }
    }

    class c implements g<List<T>> {
        c() {
        }

        /* renamed from: b */
        public void a(List<T> list) {
            list.clear();
        }
    }

    public interface d<T> {
        T a();
    }

    private static final class e<T> implements H2.f<T> {

        /* renamed from: a  reason: collision with root package name */
        private final d<T> f41412a;

        /* renamed from: b  reason: collision with root package name */
        private final g<T> f41413b;

        /* renamed from: c  reason: collision with root package name */
        private final H2.f<T> f41414c;

        e(H2.f<T> fVar, d<T> dVar, g<T> gVar) {
            this.f41414c = fVar;
            this.f41412a = dVar;
            this.f41413b = gVar;
        }

        public boolean a(T t10) {
            if (t10 instanceof f) {
                ((f) t10).j().b(true);
            }
            this.f41413b.a(t10);
            return this.f41414c.a(t10);
        }

        public T b() {
            T b10 = this.f41414c.b();
            if (b10 == null) {
                b10 = this.f41412a.a();
                if (Log.isLoggable("FactoryPools", 2)) {
                    Log.v("FactoryPools", "Created new " + b10.getClass());
                }
            }
            if (b10 instanceof f) {
                ((f) b10).j().b(false);
            }
            return b10;
        }
    }

    public interface f {
        c j();
    }

    public interface g<T> {
        void a(T t10);
    }

    private static <T extends f> H2.f<T> a(H2.f<T> fVar, d<T> dVar) {
        return b(fVar, dVar, c());
    }

    private static <T> H2.f<T> b(H2.f<T> fVar, d<T> dVar, g<T> gVar) {
        return new e(fVar, dVar, gVar);
    }

    private static <T> g<T> c() {
        return f41411a;
    }

    public static <T extends f> H2.f<T> d(int i10, d<T> dVar) {
        return a(new h(i10), dVar);
    }

    public static <T> H2.f<List<T>> e() {
        return f(20);
    }

    public static <T> H2.f<List<T>> f(int i10) {
        return b(new h(i10), new b(), new c());
    }
}

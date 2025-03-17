package I7;

import C7.i;
import I7.o;
import com.bumptech.glide.g;
import com.bumptech.glide.load.data.d;

public class x<Model> implements o<Model, Model> {

    /* renamed from: a  reason: collision with root package name */
    private static final x<?> f37073a = new x<>();

    public static class a<Model> implements p<Model, Model> {

        /* renamed from: a  reason: collision with root package name */
        private static final a<?> f37074a = new a<>();

        public static <T> a<T> a() {
            return f37074a;
        }

        public o<Model, Model> d(s sVar) {
            return x.c();
        }

        public void teardown() {
        }
    }

    private static class b<Model> implements d<Model> {

        /* renamed from: a  reason: collision with root package name */
        private final Model f37075a;

        b(Model model) {
            this.f37075a = model;
        }

        public Class<Model> a() {
            return this.f37075a.getClass();
        }

        public void b() {
        }

        public void cancel() {
        }

        public C7.a d() {
            return C7.a.LOCAL;
        }

        public void f(g gVar, d.a<? super Model> aVar) {
            aVar.e(this.f37075a);
        }
    }

    public static <T> x<T> c() {
        return f37073a;
    }

    public boolean a(Model model) {
        return true;
    }

    public o.a<Model> b(Model model, int i10, int i11, i iVar) {
        return new o.a<>(new X7.d(model), new b(model));
    }
}

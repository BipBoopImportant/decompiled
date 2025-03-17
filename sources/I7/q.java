package I7;

import H2.f;
import com.bumptech.glide.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class q {

    /* renamed from: a  reason: collision with root package name */
    private final s f37040a;

    /* renamed from: b  reason: collision with root package name */
    private final a f37041b;

    private static class a {

        /* renamed from: a  reason: collision with root package name */
        private final Map<Class<?>, C0585a<?>> f37042a = new HashMap();

        /* renamed from: I7.q$a$a  reason: collision with other inner class name */
        private static class C0585a<Model> {

            /* renamed from: a  reason: collision with root package name */
            final List<o<Model, ?>> f37043a;

            public C0585a(List<o<Model, ?>> list) {
                this.f37043a = list;
            }
        }

        a() {
        }

        public void a() {
            this.f37042a.clear();
        }

        public <Model> List<o<Model, ?>> b(Class<Model> cls) {
            C0585a aVar = this.f37042a.get(cls);
            if (aVar == null) {
                return null;
            }
            return aVar.f37043a;
        }

        public <Model> void c(Class<Model> cls, List<o<Model, ?>> list) {
            if (this.f37042a.put(cls, new C0585a(list)) != null) {
                throw new IllegalStateException("Already cached loaders for model: " + cls);
            }
        }
    }

    public q(f<List<Throwable>> fVar) {
        this(new s(fVar));
    }

    private static <A> Class<A> b(A a10) {
        return a10.getClass();
    }

    private synchronized <A> List<o<A, ?>> e(Class<A> cls) {
        List<o<A, ?>> b10;
        b10 = this.f37041b.b(cls);
        if (b10 == null) {
            b10 = Collections.unmodifiableList(this.f37040a.e(cls));
            this.f37041b.c(cls, b10);
        }
        return b10;
    }

    private <Model, Data> void g(List<p<? extends Model, ? extends Data>> list) {
        for (p<? extends Model, ? extends Data> teardown : list) {
            teardown.teardown();
        }
    }

    public synchronized <Model, Data> void a(Class<Model> cls, Class<Data> cls2, p<? extends Model, ? extends Data> pVar) {
        this.f37040a.b(cls, cls2, pVar);
        this.f37041b.a();
    }

    public synchronized List<Class<?>> c(Class<?> cls) {
        return this.f37040a.g(cls);
    }

    public <A> List<o<A, ?>> d(A a10) {
        List e10 = e(b(a10));
        if (!e10.isEmpty()) {
            int size = e10.size();
            List<o<A, ?>> emptyList = Collections.emptyList();
            boolean z10 = true;
            for (int i10 = 0; i10 < size; i10++) {
                o oVar = (o) e10.get(i10);
                if (oVar.a(a10)) {
                    if (z10) {
                        emptyList = new ArrayList<>(size - i10);
                        z10 = false;
                    }
                    emptyList.add(oVar);
                }
            }
            if (!emptyList.isEmpty()) {
                return emptyList;
            }
            throw new i.c(a10, e10);
        }
        throw new i.c(a10);
    }

    public synchronized <Model, Data> void f(Class<Model> cls, Class<Data> cls2, p<? extends Model, ? extends Data> pVar) {
        g(this.f37040a.j(cls, cls2, pVar));
        this.f37041b.a();
    }

    private q(s sVar) {
        this.f37041b = new a();
        this.f37040a = sVar;
    }
}

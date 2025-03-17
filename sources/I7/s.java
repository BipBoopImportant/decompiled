package I7;

import C7.i;
import H2.f;
import I7.o;
import Y7.k;
import com.bumptech.glide.i;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class s {

    /* renamed from: e  reason: collision with root package name */
    private static final c f37053e = new c();

    /* renamed from: f  reason: collision with root package name */
    private static final o<Object, Object> f37054f = new a();

    /* renamed from: a  reason: collision with root package name */
    private final List<b<?, ?>> f37055a;

    /* renamed from: b  reason: collision with root package name */
    private final c f37056b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<b<?, ?>> f37057c;

    /* renamed from: d  reason: collision with root package name */
    private final f<List<Throwable>> f37058d;

    private static class a implements o<Object, Object> {
        a() {
        }

        public boolean a(Object obj) {
            return false;
        }

        public o.a<Object> b(Object obj, int i10, int i11, i iVar) {
            return null;
        }
    }

    private static class b<Model, Data> {

        /* renamed from: a  reason: collision with root package name */
        private final Class<Model> f37059a;

        /* renamed from: b  reason: collision with root package name */
        final Class<Data> f37060b;

        /* renamed from: c  reason: collision with root package name */
        final p<? extends Model, ? extends Data> f37061c;

        public b(Class<Model> cls, Class<Data> cls2, p<? extends Model, ? extends Data> pVar) {
            this.f37059a = cls;
            this.f37060b = cls2;
            this.f37061c = pVar;
        }

        public boolean a(Class<?> cls) {
            return this.f37059a.isAssignableFrom(cls);
        }

        public boolean b(Class<?> cls, Class<?> cls2) {
            return a(cls) && this.f37060b.isAssignableFrom(cls2);
        }
    }

    static class c {
        c() {
        }

        public <Model, Data> r<Model, Data> a(List<o<Model, Data>> list, f<List<Throwable>> fVar) {
            return new r<>(list, fVar);
        }
    }

    public s(f<List<Throwable>> fVar) {
        this(fVar, f37053e);
    }

    private <Model, Data> void a(Class<Model> cls, Class<Data> cls2, p<? extends Model, ? extends Data> pVar, boolean z10) {
        b bVar = new b(cls, cls2, pVar);
        List<b<?, ?>> list = this.f37055a;
        list.add(z10 ? list.size() : 0, bVar);
    }

    private <Model, Data> o<Model, Data> c(b<?, ?> bVar) {
        return (o) k.d(bVar.f37061c.d(this));
    }

    private static <Model, Data> o<Model, Data> f() {
        return f37054f;
    }

    private <Model, Data> p<Model, Data> h(b<?, ?> bVar) {
        return bVar.f37061c;
    }

    /* access modifiers changed from: package-private */
    public synchronized <Model, Data> void b(Class<Model> cls, Class<Data> cls2, p<? extends Model, ? extends Data> pVar) {
        a(cls, cls2, pVar, true);
    }

    public synchronized <Model, Data> o<Model, Data> d(Class<Model> cls, Class<Data> cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z10 = false;
            for (b next : this.f37055a) {
                if (this.f37057c.contains(next)) {
                    z10 = true;
                } else if (next.b(cls, cls2)) {
                    this.f37057c.add(next);
                    arrayList.add(c(next));
                    this.f37057c.remove(next);
                }
            }
            if (arrayList.size() > 1) {
                return this.f37056b.a(arrayList, this.f37058d);
            } else if (arrayList.size() == 1) {
                return (o) arrayList.get(0);
            } else if (z10) {
                return f();
            } else {
                throw new i.c((Class<?>) cls, (Class<?>) cls2);
            }
        } catch (Throwable th2) {
            this.f37057c.clear();
            throw th2;
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized <Model> List<o<Model, ?>> e(Class<Model> cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (b next : this.f37055a) {
                if (!this.f37057c.contains(next)) {
                    if (next.a(cls)) {
                        this.f37057c.add(next);
                        arrayList.add(c(next));
                        this.f37057c.remove(next);
                    }
                }
            }
        } catch (Throwable th2) {
            this.f37057c.clear();
            throw th2;
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public synchronized List<Class<?>> g(Class<?> cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (b next : this.f37055a) {
            if (!arrayList.contains(next.f37060b) && next.a(cls)) {
                arrayList.add(next.f37060b);
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public synchronized <Model, Data> List<p<? extends Model, ? extends Data>> i(Class<Model> cls, Class<Data> cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator<b<?, ?>> it = this.f37055a.iterator();
        while (it.hasNext()) {
            b next = it.next();
            if (next.b(cls, cls2)) {
                it.remove();
                arrayList.add(h(next));
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: package-private */
    public synchronized <Model, Data> List<p<? extends Model, ? extends Data>> j(Class<Model> cls, Class<Data> cls2, p<? extends Model, ? extends Data> pVar) {
        List<p<? extends Model, ? extends Data>> i10;
        i10 = i(cls, cls2);
        b(cls, cls2, pVar);
        return i10;
    }

    s(f<List<Throwable>> fVar, c cVar) {
        this.f37055a = new ArrayList();
        this.f37057c = new HashSet();
        this.f37058d = fVar;
        this.f37056b = cVar;
    }
}

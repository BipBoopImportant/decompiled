package T7;

import E7.i;
import E7.t;
import H2.f;
import Q7.g;
import Y7.j;
import j0.C5445a;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class c {

    /* renamed from: c  reason: collision with root package name */
    private static final t<?, ?, ?> f40115c;

    /* renamed from: a  reason: collision with root package name */
    private final C5445a<j, t<?, ?, ?>> f40116a = new C5445a<>();

    /* renamed from: b  reason: collision with root package name */
    private final AtomicReference<j> f40117b = new AtomicReference<>();

    static {
        Class<Object> cls = Object.class;
        Class<Object> cls2 = Object.class;
        Class<Object> cls3 = Object.class;
        f40115c = new t(cls, cls2, cls3, Collections.singletonList(new i(Object.class, Object.class, Object.class, Collections.emptyList(), new g(), (f<List<Throwable>>) null)), (f<List<Throwable>>) null);
    }

    private j b(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        j andSet = this.f40117b.getAndSet((Object) null);
        if (andSet == null) {
            andSet = new j();
        }
        andSet.a(cls, cls2, cls3);
        return andSet;
    }

    public <Data, TResource, Transcode> t<Data, TResource, Transcode> a(Class<Data> cls, Class<TResource> cls2, Class<Transcode> cls3) {
        t<Data, TResource, Transcode> tVar;
        j b10 = b(cls, cls2, cls3);
        synchronized (this.f40116a) {
            tVar = this.f40116a.get(b10);
        }
        this.f40117b.set(b10);
        return tVar;
    }

    public boolean c(t<?, ?, ?> tVar) {
        return f40115c.equals(tVar);
    }

    public void d(Class<?> cls, Class<?> cls2, Class<?> cls3, t<?, ?, ?> tVar) {
        synchronized (this.f40116a) {
            C5445a<j, t<?, ?, ?>> aVar = this.f40116a;
            j jVar = new j(cls, cls2, cls3);
            if (tVar == null) {
                tVar = f40115c;
            }
            aVar.put(jVar, tVar);
        }
    }
}

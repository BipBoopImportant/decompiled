package T7;

import Y7.j;
import j0.C5445a;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class d {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReference<j> f40118a = new AtomicReference<>();

    /* renamed from: b  reason: collision with root package name */
    private final C5445a<j, List<Class<?>>> f40119b = new C5445a<>();

    public List<Class<?>> a(Class<?> cls, Class<?> cls2, Class<?> cls3) {
        List<Class<?>> list;
        j andSet = this.f40118a.getAndSet((Object) null);
        if (andSet == null) {
            andSet = new j(cls, cls2, cls3);
        } else {
            andSet.a(cls, cls2, cls3);
        }
        synchronized (this.f40119b) {
            list = this.f40119b.get(andSet);
        }
        this.f40118a.set(andSet);
        return list;
    }

    public void b(Class<?> cls, Class<?> cls2, Class<?> cls3, List<Class<?>> list) {
        synchronized (this.f40119b) {
            this.f40119b.put(new j(cls, cls2, cls3), list);
        }
    }
}

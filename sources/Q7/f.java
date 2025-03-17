package Q7;

import java.util.ArrayList;
import java.util.List;

public class f {

    /* renamed from: a  reason: collision with root package name */
    private final List<a<?, ?>> f39634a = new ArrayList();

    private static final class a<Z, R> {

        /* renamed from: a  reason: collision with root package name */
        final Class<Z> f39635a;

        /* renamed from: b  reason: collision with root package name */
        final Class<R> f39636b;

        /* renamed from: c  reason: collision with root package name */
        final e<Z, R> f39637c;

        a(Class<Z> cls, Class<R> cls2, e<Z, R> eVar) {
            this.f39635a = cls;
            this.f39636b = cls2;
            this.f39637c = eVar;
        }

        public boolean a(Class<?> cls, Class<?> cls2) {
            return this.f39635a.isAssignableFrom(cls) && cls2.isAssignableFrom(this.f39636b);
        }
    }

    public synchronized <Z, R> e<Z, R> a(Class<Z> cls, Class<R> cls2) {
        if (cls2.isAssignableFrom(cls)) {
            return g.b();
        }
        for (a next : this.f39634a) {
            if (next.a(cls, cls2)) {
                return next.f39637c;
            }
        }
        throw new IllegalArgumentException("No transcoder registered to transcode from " + cls + " to " + cls2);
    }

    public synchronized <Z, R> List<Class<R>> b(Class<Z> cls, Class<R> cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (a next : this.f39634a) {
            if (next.a(cls, cls2) && !arrayList.contains(next.f39636b)) {
                arrayList.add(next.f39636b);
            }
        }
        return arrayList;
    }

    public synchronized <Z, R> void c(Class<Z> cls, Class<R> cls2, e<Z, R> eVar) {
        this.f39634a.add(new a(cls, cls2, eVar));
    }
}

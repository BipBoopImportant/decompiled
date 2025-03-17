package com.bumptech.glide.load.data;

import Y7.k;
import com.bumptech.glide.load.data.e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class f {

    /* renamed from: b  reason: collision with root package name */
    private static final e.a<?> f46580b = new a();

    /* renamed from: a  reason: collision with root package name */
    private final Map<Class<?>, e.a<?>> f46581a = new HashMap();

    class a implements e.a<Object> {
        a() {
        }

        public Class<Object> a() {
            throw new UnsupportedOperationException("Not implemented");
        }

        public e<Object> b(Object obj) {
            return new b(obj);
        }
    }

    private static final class b implements e<Object> {

        /* renamed from: a  reason: collision with root package name */
        private final Object f46582a;

        b(Object obj) {
            this.f46582a = obj;
        }

        public Object a() {
            return this.f46582a;
        }

        public void b() {
        }
    }

    public synchronized <T> e<T> a(T t10) {
        e.a<?> aVar;
        try {
            k.d(t10);
            aVar = this.f46581a.get(t10.getClass());
            if (aVar == null) {
                Iterator<e.a<?>> it = this.f46581a.values().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    e.a<?> next = it.next();
                    if (next.a().isAssignableFrom(t10.getClass())) {
                        aVar = next;
                        break;
                    }
                }
            }
            if (aVar == null) {
                aVar = f46580b;
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return aVar.b(t10);
    }

    public synchronized void b(e.a<?> aVar) {
        this.f46581a.put(aVar.a(), aVar);
    }
}

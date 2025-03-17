package Kb;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import jc.C9896c;
import mc.C10035a;
import mc.C10036b;

final class F implements C9129d {

    /* renamed from: a  reason: collision with root package name */
    private final Set<E<?>> f61413a;

    /* renamed from: b  reason: collision with root package name */
    private final Set<E<?>> f61414b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<E<?>> f61415c;

    /* renamed from: d  reason: collision with root package name */
    private final Set<E<?>> f61416d;

    /* renamed from: e  reason: collision with root package name */
    private final Set<E<?>> f61417e;

    /* renamed from: f  reason: collision with root package name */
    private final Set<Class<?>> f61418f;

    /* renamed from: g  reason: collision with root package name */
    private final C9129d f61419g;

    private static class a implements C9896c {

        /* renamed from: a  reason: collision with root package name */
        private final Set<Class<?>> f61420a;

        /* renamed from: b  reason: collision with root package name */
        private final C9896c f61421b;

        public a(Set<Class<?>> set, C9896c cVar) {
            this.f61420a = set;
            this.f61421b = cVar;
        }
    }

    F(C9128c<?> cVar, C9129d dVar) {
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        for (q next : cVar.g()) {
            if (next.e()) {
                if (next.g()) {
                    hashSet4.add(next.c());
                } else {
                    hashSet.add(next.c());
                }
            } else if (next.d()) {
                hashSet3.add(next.c());
            } else if (next.g()) {
                hashSet5.add(next.c());
            } else {
                hashSet2.add(next.c());
            }
        }
        if (!cVar.k().isEmpty()) {
            hashSet.add(E.b(C9896c.class));
        }
        this.f61413a = Collections.unmodifiableSet(hashSet);
        this.f61414b = Collections.unmodifiableSet(hashSet2);
        this.f61415c = Collections.unmodifiableSet(hashSet3);
        this.f61416d = Collections.unmodifiableSet(hashSet4);
        this.f61417e = Collections.unmodifiableSet(hashSet5);
        this.f61418f = cVar.k();
        this.f61419g = dVar;
    }

    public <T> T a(Class<T> cls) {
        if (this.f61413a.contains(E.b(cls))) {
            T a10 = this.f61419g.a(cls);
            return !cls.equals(C9896c.class) ? a10 : new a(this.f61418f, (C9896c) a10);
        }
        throw new s(String.format("Attempting to request an undeclared dependency %s.", new Object[]{cls}));
    }

    public <T> T b(E<T> e10) {
        if (this.f61413a.contains(e10)) {
            return this.f61419g.b(e10);
        }
        throw new s(String.format("Attempting to request an undeclared dependency %s.", new Object[]{e10}));
    }

    public <T> C10036b<Set<T>> c(E<T> e10) {
        if (this.f61417e.contains(e10)) {
            return this.f61419g.c(e10);
        }
        throw new s(String.format("Attempting to request an undeclared dependency Provider<Set<%s>>.", new Object[]{e10}));
    }

    public <T> C10036b<T> e(Class<T> cls) {
        return g(E.b(cls));
    }

    public <T> Set<T> f(E<T> e10) {
        if (this.f61416d.contains(e10)) {
            return this.f61419g.f(e10);
        }
        throw new s(String.format("Attempting to request an undeclared dependency Set<%s>.", new Object[]{e10}));
    }

    public <T> C10036b<T> g(E<T> e10) {
        if (this.f61414b.contains(e10)) {
            return this.f61419g.g(e10);
        }
        throw new s(String.format("Attempting to request an undeclared dependency Provider<%s>.", new Object[]{e10}));
    }

    public <T> C10035a<T> h(E<T> e10) {
        if (this.f61415c.contains(e10)) {
            return this.f61419g.h(e10);
        }
        throw new s(String.format("Attempting to request an undeclared dependency Deferred<%s>.", new Object[]{e10}));
    }

    public <T> C10035a<T> i(Class<T> cls) {
        return h(E.b(cls));
    }
}

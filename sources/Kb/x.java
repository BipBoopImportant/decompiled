package Kb;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import mc.C10036b;

class x<T> implements C10036b<Set<T>> {

    /* renamed from: a  reason: collision with root package name */
    private volatile Set<C10036b<T>> f61480a = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: b  reason: collision with root package name */
    private volatile Set<T> f61481b = null;

    x(Collection<C10036b<T>> collection) {
        this.f61480a.addAll(collection);
    }

    static x<?> b(Collection<C10036b<?>> collection) {
        return new x<>((Set) collection);
    }

    private synchronized void d() {
        try {
            for (C10036b<T> bVar : this.f61480a) {
                this.f61481b.add(bVar.get());
            }
            this.f61480a = null;
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void a(C10036b<T> bVar) {
        try {
            if (this.f61481b == null) {
                this.f61480a.add(bVar);
            } else {
                this.f61481b.add(bVar.get());
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    /* renamed from: c */
    public Set<T> get() {
        if (this.f61481b == null) {
            synchronized (this) {
                try {
                    if (this.f61481b == null) {
                        this.f61481b = Collections.newSetFromMap(new ConcurrentHashMap());
                        d();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return Collections.unmodifiableSet(this.f61481b);
    }
}

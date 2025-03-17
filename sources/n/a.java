package N;

import N.c;
import java.util.ArrayDeque;

public class a<T> implements c<T> {

    /* renamed from: a  reason: collision with root package name */
    private final int f9152a;

    /* renamed from: b  reason: collision with root package name */
    private final ArrayDeque<T> f9153b;

    /* renamed from: c  reason: collision with root package name */
    private final Object f9154c;

    /* renamed from: d  reason: collision with root package name */
    final c.a<T> f9155d;

    public a(int i10) {
        this(i10, (c.a) null);
    }

    public T a() {
        T removeLast;
        synchronized (this.f9154c) {
            removeLast = this.f9153b.removeLast();
        }
        return removeLast;
    }

    public void b(T t10) {
        Object a10;
        synchronized (this.f9154c) {
            try {
                a10 = this.f9153b.size() >= this.f9152a ? a() : null;
                this.f9153b.addFirst(t10);
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        c.a<T> aVar = this.f9155d;
        if (aVar != null && a10 != null) {
            aVar.a(a10);
        }
    }

    public boolean isEmpty() {
        boolean isEmpty;
        synchronized (this.f9154c) {
            isEmpty = this.f9153b.isEmpty();
        }
        return isEmpty;
    }

    public a(int i10, c.a<T> aVar) {
        this.f9154c = new Object();
        this.f9152a = i10;
        this.f9153b = new ArrayDeque<>(i10);
        this.f9155d = aVar;
    }
}

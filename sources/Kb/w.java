package Kb;

import mc.C10036b;

public class w<T> implements C10036b<T> {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f61477c = new Object();

    /* renamed from: a  reason: collision with root package name */
    private volatile Object f61478a = f61477c;

    /* renamed from: b  reason: collision with root package name */
    private volatile C10036b<T> f61479b;

    public w(C10036b<T> bVar) {
        this.f61479b = bVar;
    }

    public T get() {
        T t10 = this.f61478a;
        T t11 = f61477c;
        if (t10 == t11) {
            synchronized (this) {
                try {
                    t10 = this.f61478a;
                    if (t10 == t11) {
                        t10 = this.f61479b.get();
                        this.f61478a = t10;
                        this.f61479b = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return t10;
    }
}

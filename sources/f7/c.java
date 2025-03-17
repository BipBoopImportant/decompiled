package F7;

import F7.l;
import java.util.Queue;

abstract class c<T extends l> {

    /* renamed from: a  reason: collision with root package name */
    private final Queue<T> f35467a = Y7.l.f(20);

    c() {
    }

    /* access modifiers changed from: package-private */
    public abstract T a();

    /* access modifiers changed from: package-private */
    public T b() {
        T t10 = (l) this.f35467a.poll();
        return t10 == null ? a() : t10;
    }

    public void c(T t10) {
        if (this.f35467a.size() < 20) {
            this.f35467a.offer(t10);
        }
    }
}

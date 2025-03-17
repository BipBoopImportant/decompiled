package G7;

import Y7.k;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

final class c {

    /* renamed from: a  reason: collision with root package name */
    private final Map<String, a> f36229a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    private final b f36230b = new b();

    private static class a {

        /* renamed from: a  reason: collision with root package name */
        final Lock f36231a = new ReentrantLock();

        /* renamed from: b  reason: collision with root package name */
        int f36232b;

        a() {
        }
    }

    private static class b {

        /* renamed from: a  reason: collision with root package name */
        private final Queue<a> f36233a = new ArrayDeque();

        b() {
        }

        /* access modifiers changed from: package-private */
        public a a() {
            a poll;
            synchronized (this.f36233a) {
                poll = this.f36233a.poll();
            }
            return poll == null ? new a() : poll;
        }

        /* access modifiers changed from: package-private */
        public void b(a aVar) {
            synchronized (this.f36233a) {
                try {
                    if (this.f36233a.size() < 10) {
                        this.f36233a.offer(aVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    c() {
    }

    /* access modifiers changed from: package-private */
    public void a(String str) {
        a aVar;
        synchronized (this) {
            try {
                aVar = this.f36229a.get(str);
                if (aVar == null) {
                    aVar = this.f36230b.a();
                    this.f36229a.put(str, aVar);
                }
                aVar.f36232b++;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        aVar.f36231a.lock();
    }

    /* access modifiers changed from: package-private */
    public void b(String str) {
        a aVar;
        synchronized (this) {
            try {
                aVar = (a) k.d(this.f36229a.get(str));
                int i10 = aVar.f36232b;
                if (i10 >= 1) {
                    int i11 = i10 - 1;
                    aVar.f36232b = i11;
                    if (i11 == 0) {
                        a remove = this.f36229a.remove(str);
                        if (remove.equals(aVar)) {
                            this.f36230b.b(remove);
                        } else {
                            throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + remove + ", safeKey: " + str);
                        }
                    }
                } else {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f36232b);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        aVar.f36231a.unlock();
    }
}

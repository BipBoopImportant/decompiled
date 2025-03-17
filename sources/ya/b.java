package ya;

import android.util.SparseArray;
import androidx.annotation.RecentlyNonNull;
import ya.c;

public abstract class b<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Object f58065a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private C0937b<T> f58066b;

    public static class a<T> {

        /* renamed from: a  reason: collision with root package name */
        private final SparseArray<T> f58067a;

        /* renamed from: b  reason: collision with root package name */
        private final c.b f58068b;

        /* renamed from: c  reason: collision with root package name */
        private final boolean f58069c;

        public a(@RecentlyNonNull SparseArray<T> sparseArray, @RecentlyNonNull c.b bVar, boolean z10) {
            this.f58067a = sparseArray;
            this.f58068b = bVar;
            this.f58069c = z10;
        }

        public boolean a() {
            return this.f58069c;
        }

        @RecentlyNonNull
        public SparseArray<T> b() {
            return this.f58067a;
        }

        @RecentlyNonNull
        public c.b c() {
            return this.f58068b;
        }
    }

    /* renamed from: ya.b$b  reason: collision with other inner class name */
    public interface C0937b<T> {
        void a(@RecentlyNonNull a<T> aVar);

        void release();
    }

    @RecentlyNonNull
    public abstract SparseArray<T> a(@RecentlyNonNull c cVar);

    public boolean b() {
        return true;
    }

    public void c(@RecentlyNonNull c cVar) {
        c.b bVar = new c.b(cVar.c());
        bVar.i();
        a aVar = new a(a(cVar), bVar, b());
        synchronized (this.f58065a) {
            try {
                C0937b<T> bVar2 = this.f58066b;
                if (bVar2 != null) {
                    bVar2.a(aVar);
                } else {
                    throw new IllegalStateException("Detector processor must first be set with setProcessor in order to receive detection results.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void d() {
        synchronized (this.f58065a) {
            try {
                C0937b<T> bVar = this.f58066b;
                if (bVar != null) {
                    bVar.release();
                    this.f58066b = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void e(@RecentlyNonNull C0937b<T> bVar) {
        synchronized (this.f58065a) {
            try {
                C0937b<T> bVar2 = this.f58066b;
                if (bVar2 != null) {
                    bVar2.release();
                }
                this.f58066b = bVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

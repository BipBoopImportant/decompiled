package androidx.recyclerview.widget;

import androidx.recyclerview.widget.h;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public final class c<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f43943a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f43944b;

    /* renamed from: c  reason: collision with root package name */
    private final h.f<T> f43945c;

    public static final class a<T> {

        /* renamed from: d  reason: collision with root package name */
        private static final Object f43946d = new Object();

        /* renamed from: e  reason: collision with root package name */
        private static Executor f43947e;

        /* renamed from: a  reason: collision with root package name */
        private Executor f43948a;

        /* renamed from: b  reason: collision with root package name */
        private Executor f43949b;

        /* renamed from: c  reason: collision with root package name */
        private final h.f<T> f43950c;

        public a(h.f<T> fVar) {
            this.f43950c = fVar;
        }

        public c<T> a() {
            if (this.f43949b == null) {
                synchronized (f43946d) {
                    try {
                        if (f43947e == null) {
                            f43947e = Executors.newFixedThreadPool(2);
                        }
                    } catch (Throwable th2) {
                        while (true) {
                            throw th2;
                        }
                    }
                }
                this.f43949b = f43947e;
            }
            return new c<>(this.f43948a, this.f43949b, this.f43950c);
        }
    }

    c(Executor executor, Executor executor2, h.f<T> fVar) {
        this.f43943a = executor;
        this.f43944b = executor2;
        this.f43945c = fVar;
    }

    public Executor a() {
        return this.f43944b;
    }

    public h.f<T> b() {
        return this.f43945c;
    }

    public Executor c() {
        return this.f43943a;
    }
}

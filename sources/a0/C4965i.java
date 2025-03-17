package a0;

import android.view.Surface;
import java.util.concurrent.Executor;
import ob.C10101e;

/* renamed from: a0.i  reason: case insensitive filesystem */
public interface C4965i {

    /* renamed from: a0.i$a */
    public interface a {
    }

    /* renamed from: a0.i$b */
    public interface b extends a {

        /* renamed from: a0.i$b$a */
        public interface a {
            void a(Surface surface);
        }

        void b(Executor executor, a aVar);
    }

    a a();

    void b(long j10);

    void c();

    Y d();

    void e(C4966j jVar, Executor executor);

    C10101e<Void> f();

    void g();

    int h();

    void release();

    void start();
}

package L3;

import android.view.Surface;
import java.util.List;
import java.util.concurrent.Executor;
import q3.C5807s;
import q3.S;
import t3.D;

/* renamed from: L3.E  reason: case insensitive filesystem */
public interface C6635E {

    /* renamed from: L3.E$a */
    public interface a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f38059a = new C0600a();

        /* renamed from: L3.E$a$a  reason: collision with other inner class name */
        class C0600a implements a {
            C0600a() {
            }

            public void a(C6635E e10, S s10) {
            }

            public void b(C6635E e10) {
            }

            public void c(C6635E e10) {
            }
        }

        void a(C6635E e10, S s10);

        void b(C6635E e10);

        void c(C6635E e10);
    }

    /* renamed from: L3.E$b */
    public interface b {
        void a(long j10);

        void b();
    }

    /* renamed from: L3.E$c */
    public static final class c extends Exception {

        /* renamed from: a  reason: collision with root package name */
        public final C5807s f38060a;

        public c(Throwable th2, C5807s sVar) {
            super(th2);
            this.f38060a = sVar;
        }
    }

    void A(boolean z10);

    void B(boolean z10);

    boolean d();

    void h();

    Surface i();

    boolean isInitialized();

    void j(float f10);

    void k(long j10, long j11);

    boolean l(long j10, boolean z10, long j11, long j12, b bVar);

    void m(long j10, long j11, long j12, long j13);

    void n(Surface surface, D d10);

    void o();

    void p(List<Object> list);

    void q(o oVar);

    void r(a aVar, Executor executor);

    void release();

    boolean s(boolean z10);

    void t(boolean z10);

    void u();

    void v(C5807s sVar);

    void w(int i10, C5807s sVar);

    void x();

    void y(int i10);

    void z();
}

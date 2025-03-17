package K3;

import java.util.concurrent.Executor;
import t3.C5957h;

/* renamed from: K3.a  reason: case insensitive filesystem */
public interface C6579a extends Executor {

    /* renamed from: K3.a$a  reason: collision with other inner class name */
    class C0596a implements C6579a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Executor f37499a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ C5957h f37500b;

        C0596a(Executor executor, C5957h hVar) {
            this.f37499a = executor;
            this.f37500b = hVar;
        }

        public void execute(Runnable runnable) {
            this.f37499a.execute(runnable);
        }

        public void release() {
            this.f37500b.accept(this.f37499a);
        }
    }

    static <T extends Executor> C6579a o0(T t10, C5957h<T> hVar) {
        return new C0596a(t10, hVar);
    }

    void release();
}

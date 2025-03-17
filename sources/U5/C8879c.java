package u5;

import QJ.C16340x0;
import QJ.M;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;
import t5.C8794E;

/* renamed from: u5.c  reason: case insensitive filesystem */
public class C8879c implements C8878b {

    /* renamed from: a  reason: collision with root package name */
    private final C8794E f56840a;

    /* renamed from: b  reason: collision with root package name */
    private final M f56841b;

    /* renamed from: c  reason: collision with root package name */
    final Handler f56842c = new Handler(Looper.getMainLooper());

    /* renamed from: d  reason: collision with root package name */
    private final Executor f56843d = new a();

    /* renamed from: u5.c$a */
    class a implements Executor {
        a() {
        }

        public void execute(Runnable runnable) {
            C8879c.this.f56842c.post(runnable);
        }
    }

    public C8879c(Executor executor) {
        C8794E e10 = new C8794E(executor);
        this.f56840a = e10;
        this.f56841b = C16340x0.b(e10);
    }

    public Executor a() {
        return this.f56843d;
    }

    public M b() {
        return this.f56841b;
    }

    /* renamed from: e */
    public C8794E c() {
        return this.f56840a;
    }
}

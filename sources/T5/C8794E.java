package t5;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import u5.C8877a;

/* renamed from: t5.E  reason: case insensitive filesystem */
public class C8794E implements C8877a {

    /* renamed from: a  reason: collision with root package name */
    private final ArrayDeque<a> f56561a = new ArrayDeque<>();

    /* renamed from: b  reason: collision with root package name */
    private final Executor f56562b;

    /* renamed from: c  reason: collision with root package name */
    private Runnable f56563c;

    /* renamed from: d  reason: collision with root package name */
    final Object f56564d = new Object();

    /* renamed from: t5.E$a */
    static class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final C8794E f56565a;

        /* renamed from: b  reason: collision with root package name */
        final Runnable f56566b;

        a(C8794E e10, Runnable runnable) {
            this.f56565a = e10;
            this.f56566b = runnable;
        }

        public void run() {
            try {
                this.f56566b.run();
                synchronized (this.f56565a.f56564d) {
                    this.f56565a.a();
                }
            } catch (Throwable th2) {
                synchronized (this.f56565a.f56564d) {
                    this.f56565a.a();
                    throw th2;
                }
            }
        }
    }

    public C8794E(Executor executor) {
        this.f56562b = executor;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        Runnable poll = this.f56561a.poll();
        this.f56563c = poll;
        if (poll != null) {
            this.f56562b.execute(poll);
        }
    }

    public void execute(Runnable runnable) {
        synchronized (this.f56564d) {
            try {
                this.f56561a.add(new a(this, runnable));
                if (this.f56563c == null) {
                    a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public boolean l0() {
        boolean z10;
        synchronized (this.f56564d) {
            z10 = !this.f56561a.isEmpty();
        }
        return z10;
    }
}

package o3;

import android.os.Binder;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

abstract class c<Result> {

    /* renamed from: e  reason: collision with root package name */
    private static Handler f26763e;

    /* renamed from: a  reason: collision with root package name */
    private final FutureTask<Result> f26764a = new b(new a());

    /* renamed from: b  reason: collision with root package name */
    private volatile e f26765b = e.PENDING;

    /* renamed from: c  reason: collision with root package name */
    final AtomicBoolean f26766c = new AtomicBoolean();

    /* renamed from: d  reason: collision with root package name */
    final AtomicBoolean f26767d = new AtomicBoolean();

    class a implements Callable<Result> {
        a() {
        }

        public Result call() {
            c.this.f26767d.set(true);
            Result result = null;
            try {
                Process.setThreadPriority(10);
                result = c.this.b();
                Binder.flushPendingCommands();
                c.this.i(result);
                return result;
            } catch (Throwable th2) {
                c.this.i(result);
                throw th2;
            }
        }
    }

    class b extends FutureTask<Result> {
        b(Callable callable) {
            super(callable);
        }

        /* access modifiers changed from: protected */
        public void done() {
            try {
                c.this.j(get());
            } catch (InterruptedException e10) {
                Log.w("AsyncTask", e10);
            } catch (ExecutionException e11) {
                throw new RuntimeException("An error occurred while executing doInBackground()", e11.getCause());
            } catch (CancellationException unused) {
                c.this.j(null);
            } catch (Throwable th2) {
                throw new RuntimeException("An error occurred while executing doInBackground()", th2);
            }
        }
    }

    /* renamed from: o3.c$c  reason: collision with other inner class name */
    class C0429c implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f26770a;

        C0429c(Object obj) {
            this.f26770a = obj;
        }

        public void run() {
            c.this.d(this.f26770a);
        }
    }

    static /* synthetic */ class d {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f26772a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|6) */
        /* JADX WARNING: Code restructure failed: missing block: B:7:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        static {
            /*
                o3.c$e[] r0 = o3.c.e.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f26772a = r0
                o3.c$e r1 = o3.c.e.RUNNING     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f26772a     // Catch:{ NoSuchFieldError -> 0x001d }
                o3.c$e r1 = o3.c.e.FINISHED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o3.c.d.<clinit>():void");
        }
    }

    public enum e {
        PENDING,
        RUNNING,
        FINISHED
    }

    c() {
    }

    private static Handler e() {
        Handler handler;
        synchronized (c.class) {
            try {
                if (f26763e == null) {
                    f26763e = new Handler(Looper.getMainLooper());
                }
                handler = f26763e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }

    public final boolean a(boolean z10) {
        this.f26766c.set(true);
        return this.f26764a.cancel(z10);
    }

    /* access modifiers changed from: protected */
    public abstract Result b();

    public final void c(Executor executor) {
        if (this.f26765b != e.PENDING) {
            int i10 = d.f26772a[this.f26765b.ordinal()];
            if (i10 == 1) {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            } else if (i10 != 2) {
                throw new IllegalStateException("We should never reach this state");
            } else {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
        } else {
            this.f26765b = e.RUNNING;
            executor.execute(this.f26764a);
        }
    }

    /* access modifiers changed from: package-private */
    public void d(Result result) {
        if (f()) {
            g(result);
        } else {
            h(result);
        }
        this.f26765b = e.FINISHED;
    }

    public final boolean f() {
        return this.f26766c.get();
    }

    /* access modifiers changed from: protected */
    public void g(Result result) {
    }

    /* access modifiers changed from: protected */
    public void h(Result result) {
    }

    /* access modifiers changed from: package-private */
    public void i(Result result) {
        e().post(new C0429c(result));
    }

    /* access modifiers changed from: package-private */
    public void j(Result result) {
        if (!this.f26767d.get()) {
            i(result);
        }
    }
}

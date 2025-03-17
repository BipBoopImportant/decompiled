package com.android.volley;

import android.os.Handler;
import java.util.concurrent.Executor;

public class f implements q {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f46212a;

    class a implements Executor {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Handler f46213a;

        a(Handler handler) {
            this.f46213a = handler;
        }

        public void execute(Runnable runnable) {
            this.f46213a.post(runnable);
        }
    }

    private static class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final n f46215a;

        /* renamed from: b  reason: collision with root package name */
        private final p f46216b;

        /* renamed from: c  reason: collision with root package name */
        private final Runnable f46217c;

        public b(n nVar, p pVar, Runnable runnable) {
            this.f46215a = nVar;
            this.f46216b = pVar;
            this.f46217c = runnable;
        }

        public void run() {
            if (this.f46215a.isCanceled()) {
                this.f46215a.finish("canceled-at-delivery");
                return;
            }
            if (this.f46216b.b()) {
                this.f46215a.deliverResponse(this.f46216b.f46245a);
            } else {
                this.f46215a.deliverError(this.f46216b.f46247c);
            }
            if (this.f46216b.f46248d) {
                this.f46215a.addMarker("intermediate-response");
            } else {
                this.f46215a.finish("done");
            }
            Runnable runnable = this.f46217c;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public f(Handler handler) {
        this.f46212a = new a(handler);
    }

    public void a(n<?> nVar, p<?> pVar) {
        b(nVar, pVar, (Runnable) null);
    }

    public void b(n<?> nVar, p<?> pVar, Runnable runnable) {
        nVar.markDelivered();
        nVar.addMarker("post-response");
        this.f46212a.execute(new b(nVar, pVar, runnable));
    }

    public void c(n<?> nVar, u uVar) {
        nVar.addMarker("post-error");
        this.f46212a.execute(new b(nVar, p.a(uVar), (Runnable) null));
    }
}

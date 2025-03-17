package androidx.emoji2.text;

import D2.p;
import android.content.Context;
import androidx.emoji2.text.f;
import androidx.lifecycle.C5205h;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.r;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

public class EmojiCompatInitializer implements T4.a<Boolean> {

    class a implements C5205h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ r f21534a;

        a(r rVar) {
            this.f21534a = rVar;
        }

        public void onResume(C5221y yVar) {
            EmojiCompatInitializer.this.e();
            this.f21534a.g(this);
        }
    }

    static class b extends f.c {
        protected b(Context context) {
            super(new c(context));
            b(1);
        }
    }

    static class c implements f.h {

        /* renamed from: a  reason: collision with root package name */
        private final Context f21536a;

        class a extends f.i {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f.i f21537a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ ThreadPoolExecutor f21538b;

            a(f.i iVar, ThreadPoolExecutor threadPoolExecutor) {
                this.f21537a = iVar;
                this.f21538b = threadPoolExecutor;
            }

            public void a(Throwable th2) {
                try {
                    this.f21537a.a(th2);
                } finally {
                    this.f21538b.shutdown();
                }
            }

            public void b(n nVar) {
                try {
                    this.f21537a.b(nVar);
                } finally {
                    this.f21538b.shutdown();
                }
            }
        }

        c(Context context) {
            this.f21536a = context.getApplicationContext();
        }

        public void a(f.i iVar) {
            ThreadPoolExecutor b10 = c.b("EmojiCompatInitializer");
            b10.execute(new g(this, iVar, b10));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void d(f.i iVar, ThreadPoolExecutor threadPoolExecutor) {
            try {
                k a10 = d.a(this.f21536a);
                if (a10 != null) {
                    a10.c(threadPoolExecutor);
                    a10.a().a(new a(iVar, threadPoolExecutor));
                    return;
                }
                throw new RuntimeException("EmojiCompat font provider not available on this device.");
            } catch (Throwable th2) {
                iVar.a(th2);
                threadPoolExecutor.shutdown();
            }
        }
    }

    static class d implements Runnable {
        d() {
        }

        public void run() {
            try {
                p.a("EmojiCompat.EmojiCompatInitializer.run");
                if (f.k()) {
                    f.c().n();
                }
            } finally {
                p.b();
            }
        }
    }

    public List<Class<? extends T4.a<?>>> a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    /* renamed from: c */
    public Boolean b(Context context) {
        f.j(new b(context));
        d(context);
        return Boolean.TRUE;
    }

    /* access modifiers changed from: package-private */
    public void d(Context context) {
        r lifecycle = ((C5221y) androidx.startup.a.e(context).f(ProcessLifecycleInitializer.class)).getLifecycle();
        lifecycle.c(new a(lifecycle));
    }

    /* access modifiers changed from: package-private */
    public void e() {
        c.d().postDelayed(new d(), 500);
    }
}

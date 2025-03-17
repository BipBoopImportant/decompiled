package E2;

import E2.i;
import E2.k;
import android.graphics.Typeface;
import java.util.concurrent.Executor;

class a {

    /* renamed from: a  reason: collision with root package name */
    private final k.c f5956a;

    /* renamed from: b  reason: collision with root package name */
    private final Executor f5957b;

    /* renamed from: E2.a$a  reason: collision with other inner class name */
    class C0047a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k.c f5958a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ Typeface f5959b;

        C0047a(k.c cVar, Typeface typeface) {
            this.f5958a = cVar;
            this.f5959b = typeface;
        }

        public void run() {
            this.f5958a.b(this.f5959b);
        }
    }

    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ k.c f5961a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f5962b;

        b(k.c cVar, int i10) {
            this.f5961a = cVar;
            this.f5962b = i10;
        }

        public void run() {
            this.f5961a.a(this.f5962b);
        }
    }

    a(k.c cVar, Executor executor) {
        this.f5956a = cVar;
        this.f5957b = executor;
    }

    private void a(int i10) {
        this.f5957b.execute(new b(this.f5956a, i10));
    }

    private void c(Typeface typeface) {
        this.f5957b.execute(new C0047a(this.f5956a, typeface));
    }

    /* access modifiers changed from: package-private */
    public void b(i.e eVar) {
        if (eVar.a()) {
            c(eVar.f5990a);
        } else {
            a(eVar.f5991b);
        }
    }
}

package Nb;

import Tb.F;
import Tb.G;
import java.io.File;
import java.util.concurrent.atomic.AtomicReference;
import mc.C10035a;
import mc.C10036b;

public final class d implements a {

    /* renamed from: c  reason: collision with root package name */
    private static final h f61971c = new b();

    /* renamed from: a  reason: collision with root package name */
    private final C10035a<a> f61972a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicReference<a> f61973b = new AtomicReference<>((Object) null);

    private static final class b implements h {
        private b() {
        }

        public File a() {
            return null;
        }

        public F.a b() {
            return null;
        }

        public File c() {
            return null;
        }

        public File d() {
            return null;
        }

        public File e() {
            return null;
        }

        public File f() {
            return null;
        }

        public File g() {
            return null;
        }
    }

    public d(C10035a<a> aVar) {
        this.f61972a = aVar;
        aVar.a(new b(this));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void g(C10036b bVar) {
        g.f().b("Crashlytics native component now available.");
        this.f61973b.set((a) bVar.get());
    }

    public h a(String str) {
        a aVar = this.f61973b.get();
        return aVar == null ? f61971c : aVar.a(str);
    }

    public boolean b() {
        a aVar = this.f61973b.get();
        return aVar != null && aVar.b();
    }

    public void c(String str, String str2, long j10, G g10) {
        g f10 = g.f();
        f10.i("Deferring native open session: " + str);
        this.f61972a.a(new c(str, str2, j10, g10));
    }

    public boolean d(String str) {
        a aVar = this.f61973b.get();
        return aVar != null && aVar.d(str);
    }
}

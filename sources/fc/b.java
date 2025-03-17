package Fc;

import Ac.a;
import j9.c;
import j9.d;
import j9.i;
import j9.j;
import mc.C10036b;

final class b {

    /* renamed from: d  reason: collision with root package name */
    private static final a f60424d = a.e();

    /* renamed from: a  reason: collision with root package name */
    private final String f60425a;

    /* renamed from: b  reason: collision with root package name */
    private final C10036b<j> f60426b;

    /* renamed from: c  reason: collision with root package name */
    private i<Gc.i> f60427c;

    b(C10036b<j> bVar, String str) {
        this.f60425a = str;
        this.f60426b = bVar;
    }

    private boolean a() {
        if (this.f60427c == null) {
            j jVar = this.f60426b.get();
            if (jVar != null) {
                this.f60427c = jVar.b(this.f60425a, Gc.i.class, c.b("proto"), new a());
            } else {
                f60424d.j("Flg TransportFactory is not available at the moment");
            }
        }
        return this.f60427c != null;
    }

    public void b(Gc.i iVar) {
        if (!a()) {
            f60424d.j("Unable to dispatch event because Flg Transport is not available");
        } else {
            this.f60427c.b(d.f(iVar));
        }
    }
}

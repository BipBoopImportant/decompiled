package R7;

import Y7.l;
import androidx.lifecycle.C5220x;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.M;
import androidx.lifecycle.r;
import java.util.HashSet;
import java.util.Set;

final class k implements j, C5220x {

    /* renamed from: a  reason: collision with root package name */
    private final Set<l> f39703a = new HashSet();

    /* renamed from: b  reason: collision with root package name */
    private final r f39704b;

    k(r rVar) {
        this.f39704b = rVar;
        rVar.c(this);
    }

    public void a(l lVar) {
        this.f39703a.add(lVar);
        if (this.f39704b.d() == r.b.DESTROYED) {
            lVar.l();
        } else if (this.f39704b.d().b(r.b.STARTED)) {
            lVar.k();
        } else {
            lVar.g();
        }
    }

    public void b(l lVar) {
        this.f39703a.remove(lVar);
    }

    @M(r.a.ON_DESTROY)
    public void onDestroy(C5221y yVar) {
        for (T l10 : l.j(this.f39703a)) {
            l10.l();
        }
        yVar.getLifecycle().g(this);
    }

    @M(r.a.ON_START)
    public void onStart(C5221y yVar) {
        for (T k10 : l.j(this.f39703a)) {
            k10.k();
        }
    }

    @M(r.a.ON_STOP)
    public void onStop(C5221y yVar) {
        for (T g10 : l.j(this.f39703a)) {
            g10.g();
        }
    }
}

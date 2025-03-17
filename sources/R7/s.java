package R7;

import V7.i;
import Y7.l;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;

public final class s implements l {

    /* renamed from: a  reason: collision with root package name */
    private final Set<i<?>> f39734a = Collections.newSetFromMap(new WeakHashMap());

    public void a() {
        this.f39734a.clear();
    }

    public List<i<?>> d() {
        return l.j(this.f39734a);
    }

    public void g() {
        for (T g10 : l.j(this.f39734a)) {
            g10.g();
        }
    }

    public void k() {
        for (T k10 : l.j(this.f39734a)) {
            k10.k();
        }
    }

    public void l() {
        for (T l10 : l.j(this.f39734a)) {
            l10.l();
        }
    }

    public void n(i<?> iVar) {
        this.f39734a.add(iVar);
    }

    public void o(i<?> iVar) {
        this.f39734a.remove(iVar);
    }
}

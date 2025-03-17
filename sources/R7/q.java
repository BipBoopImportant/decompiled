package R7;

import U7.d;
import Y7.l;
import android.util.Log;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.WeakHashMap;

public class q {

    /* renamed from: a  reason: collision with root package name */
    private final Set<d> f39717a = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: b  reason: collision with root package name */
    private final Set<d> f39718b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    private boolean f39719c;

    public boolean a(d dVar) {
        boolean z10 = true;
        if (dVar == null) {
            return true;
        }
        boolean remove = this.f39717a.remove(dVar);
        if (!this.f39718b.remove(dVar) && !remove) {
            z10 = false;
        }
        if (z10) {
            dVar.clear();
        }
        return z10;
    }

    public void b() {
        for (T a10 : l.j(this.f39717a)) {
            a(a10);
        }
        this.f39718b.clear();
    }

    public void c() {
        this.f39719c = true;
        for (T t10 : l.j(this.f39717a)) {
            if (t10.isRunning() || t10.h()) {
                t10.clear();
                this.f39718b.add(t10);
            }
        }
    }

    public void d() {
        this.f39719c = true;
        for (T t10 : l.j(this.f39717a)) {
            if (t10.isRunning()) {
                t10.c();
                this.f39718b.add(t10);
            }
        }
    }

    public void e() {
        for (T t10 : l.j(this.f39717a)) {
            if (!t10.h() && !t10.f()) {
                t10.clear();
                if (!this.f39719c) {
                    t10.j();
                } else {
                    this.f39718b.add(t10);
                }
            }
        }
    }

    public void f() {
        this.f39719c = false;
        for (T t10 : l.j(this.f39717a)) {
            if (!t10.h() && !t10.isRunning()) {
                t10.j();
            }
        }
        this.f39718b.clear();
    }

    public void g(d dVar) {
        this.f39717a.add(dVar);
        if (!this.f39719c) {
            dVar.j();
            return;
        }
        dVar.clear();
        if (Log.isLoggable("RequestTracker", 2)) {
            Log.v("RequestTracker", "Paused, delaying request");
        }
        this.f39718b.add(dVar);
    }

    public String toString() {
        return super.toString() + "{numRequests=" + this.f39717a.size() + ", isPaused=" + this.f39719c + "}";
    }
}

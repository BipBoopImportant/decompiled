package T;

import C.C4400j;
import C.C4402k;
import C.C4408p;
import C.H0;
import J.f;
import android.annotation.SuppressLint;
import androidx.lifecycle.C5220x;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.M;
import androidx.lifecycle.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

@SuppressLint({"UsesNonDefaultVisibleForTesting"})
public final class b implements C5220x, C4400j {

    /* renamed from: a  reason: collision with root package name */
    private final Object f13462a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final C5221y f13463b;

    /* renamed from: c  reason: collision with root package name */
    private final f f13464c;

    /* renamed from: d  reason: collision with root package name */
    private volatile boolean f13465d = false;

    /* renamed from: e  reason: collision with root package name */
    private boolean f13466e = false;

    /* renamed from: f  reason: collision with root package name */
    private boolean f13467f = false;

    b(C5221y yVar, f fVar) {
        this.f13463b = yVar;
        this.f13464c = fVar;
        if (yVar.getLifecycle().d().b(r.b.STARTED)) {
            fVar.l();
        } else {
            fVar.A();
        }
        yVar.getLifecycle().c(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0026, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f13462a
            monitor-enter(r0)
            boolean r1 = r3.f13466e     // Catch:{ all -> 0x0009 }
            if (r1 != 0) goto L_0x000b
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            return
        L_0x0009:
            r1 = move-exception
            goto L_0x0027
        L_0x000b:
            r1 = 0
            r3.f13466e = r1     // Catch:{ all -> 0x0009 }
            androidx.lifecycle.y r1 = r3.f13463b     // Catch:{ all -> 0x0009 }
            androidx.lifecycle.r r1 = r1.getLifecycle()     // Catch:{ all -> 0x0009 }
            androidx.lifecycle.r$b r1 = r1.d()     // Catch:{ all -> 0x0009 }
            androidx.lifecycle.r$b r2 = androidx.lifecycle.r.b.STARTED     // Catch:{ all -> 0x0009 }
            boolean r1 = r1.b(r2)     // Catch:{ all -> 0x0009 }
            if (r1 == 0) goto L_0x0025
            androidx.lifecycle.y r1 = r3.f13463b     // Catch:{ all -> 0x0009 }
            r3.onStart(r1)     // Catch:{ all -> 0x0009 }
        L_0x0025:
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            return
        L_0x0027:
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: T.b.A():void");
    }

    public C4402k a() {
        return this.f13464c.a();
    }

    public C4408p b() {
        return this.f13464c.b();
    }

    /* access modifiers changed from: package-private */
    public void k(Collection<H0> collection) {
        synchronized (this.f13462a) {
            this.f13464c.k(collection);
        }
    }

    @M(r.a.ON_DESTROY)
    public void onDestroy(C5221y yVar) {
        synchronized (this.f13462a) {
            f fVar = this.f13464c;
            fVar.Z(fVar.J());
        }
    }

    @M(r.a.ON_PAUSE)
    public void onPause(C5221y yVar) {
        this.f13464c.g(false);
    }

    @M(r.a.ON_RESUME)
    public void onResume(C5221y yVar) {
        this.f13464c.g(true);
    }

    @M(r.a.ON_START)
    public void onStart(C5221y yVar) {
        synchronized (this.f13462a) {
            try {
                if (!this.f13466e && !this.f13467f) {
                    this.f13464c.l();
                    this.f13465d = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @M(r.a.ON_STOP)
    public void onStop(C5221y yVar) {
        synchronized (this.f13462a) {
            try {
                if (!this.f13466e && !this.f13467f) {
                    this.f13464c.A();
                    this.f13465d = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public f s() {
        return this.f13464c;
    }

    public C5221y t() {
        C5221y yVar;
        synchronized (this.f13462a) {
            yVar = this.f13463b;
        }
        return yVar;
    }

    /* access modifiers changed from: package-private */
    public C4408p u() {
        return this.f13464c.G();
    }

    public List<H0> v() {
        List<H0> unmodifiableList;
        synchronized (this.f13462a) {
            unmodifiableList = Collections.unmodifiableList(this.f13464c.J());
        }
        return unmodifiableList;
    }

    public boolean w(H0 h02) {
        boolean contains;
        synchronized (this.f13462a) {
            contains = this.f13464c.J().contains(h02);
        }
        return contains;
    }

    public void x() {
        synchronized (this.f13462a) {
            try {
                if (!this.f13466e) {
                    onStop(this.f13463b);
                    this.f13466e = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void y(Collection<H0> collection) {
        synchronized (this.f13462a) {
            ArrayList arrayList = new ArrayList(collection);
            arrayList.retainAll(this.f13464c.J());
            this.f13464c.Z(arrayList);
        }
    }

    /* access modifiers changed from: package-private */
    public void z() {
        synchronized (this.f13462a) {
            f fVar = this.f13464c;
            fVar.Z(fVar.J());
        }
    }
}

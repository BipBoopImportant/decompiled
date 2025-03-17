package androidx.camera.core;

import C.t0;
import C.u0;
import android.view.Surface;
import androidx.camera.core.e;
import androidx.camera.core.impl.C5048t0;
import java.util.concurrent.Executor;

public class q implements C5048t0 {

    /* renamed from: a  reason: collision with root package name */
    private final Object f17064a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private int f17065b = 0;

    /* renamed from: c  reason: collision with root package name */
    private boolean f17066c = false;

    /* renamed from: d  reason: collision with root package name */
    private final C5048t0 f17067d;

    /* renamed from: e  reason: collision with root package name */
    private final Surface f17068e;

    /* renamed from: f  reason: collision with root package name */
    private e.a f17069f;

    /* renamed from: g  reason: collision with root package name */
    private final e.a f17070g = new u0(this);

    public q(C5048t0 t0Var) {
        this.f17067d = t0Var;
        this.f17068e = t0Var.getSurface();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void j(n nVar) {
        e.a aVar;
        synchronized (this.f17064a) {
            try {
                int i10 = this.f17065b - 1;
                this.f17065b = i10;
                if (this.f17066c && i10 == 0) {
                    close();
                }
                aVar = this.f17069f;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        if (aVar != null) {
            aVar.a(nVar);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void k(C5048t0.a aVar, C5048t0 t0Var) {
        aVar.a(this);
    }

    private n n(n nVar) {
        if (nVar == null) {
            return null;
        }
        this.f17065b++;
        s sVar = new s(nVar);
        sVar.c(this.f17070g);
        return sVar;
    }

    public n b() {
        n n10;
        synchronized (this.f17064a) {
            n10 = n(this.f17067d.b());
        }
        return n10;
    }

    public int c() {
        int c10;
        synchronized (this.f17064a) {
            c10 = this.f17067d.c();
        }
        return c10;
    }

    public void close() {
        synchronized (this.f17064a) {
            try {
                Surface surface = this.f17068e;
                if (surface != null) {
                    surface.release();
                }
                this.f17067d.close();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void d() {
        synchronized (this.f17064a) {
            this.f17067d.d();
        }
    }

    public int e() {
        int e10;
        synchronized (this.f17064a) {
            e10 = this.f17067d.e();
        }
        return e10;
    }

    public void f(C5048t0.a aVar, Executor executor) {
        synchronized (this.f17064a) {
            this.f17067d.f(new t0(this, aVar), executor);
        }
    }

    public n g() {
        n n10;
        synchronized (this.f17064a) {
            n10 = n(this.f17067d.g());
        }
        return n10;
    }

    public int getHeight() {
        int height;
        synchronized (this.f17064a) {
            height = this.f17067d.getHeight();
        }
        return height;
    }

    public Surface getSurface() {
        Surface surface;
        synchronized (this.f17064a) {
            surface = this.f17067d.getSurface();
        }
        return surface;
    }

    public int getWidth() {
        int width;
        synchronized (this.f17064a) {
            width = this.f17067d.getWidth();
        }
        return width;
    }

    public int i() {
        int e10;
        synchronized (this.f17064a) {
            e10 = this.f17067d.e() - this.f17065b;
        }
        return e10;
    }

    public void l() {
        synchronized (this.f17064a) {
            try {
                this.f17066c = true;
                this.f17067d.d();
                if (this.f17065b == 0) {
                    close();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void m(e.a aVar) {
        synchronized (this.f17064a) {
            this.f17069f = aVar;
        }
    }
}

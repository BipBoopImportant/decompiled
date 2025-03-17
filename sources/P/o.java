package P;

import C.C4389d0;
import C.C4391e0;
import C.C4417z;
import C.G0;
import C.v0;
import O.C;
import O.C4701k;
import O.C4703m;
import O.S;
import Q.d;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import androidx.concurrent.futures.c;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import nI.q;

public class o implements S, SurfaceTexture.OnFrameAvailableListener {

    /* renamed from: a  reason: collision with root package name */
    private final c f11794a;

    /* renamed from: b  reason: collision with root package name */
    final HandlerThread f11795b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f11796c;

    /* renamed from: d  reason: collision with root package name */
    final Handler f11797d;

    /* renamed from: e  reason: collision with root package name */
    private int f11798e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f11799f;

    /* renamed from: g  reason: collision with root package name */
    private final AtomicBoolean f11800g;

    /* renamed from: h  reason: collision with root package name */
    final Map<v0, Surface> f11801h;

    /* renamed from: i  reason: collision with root package name */
    private SurfaceTexture f11802i;

    /* renamed from: j  reason: collision with root package name */
    private SurfaceTexture f11803j;

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static q<C4417z, C4389d0, C4389d0, S> f11804a = new n();

        public static S a(C4417z zVar, C4389d0 d0Var, C4389d0 d0Var2) {
            return f11804a.invoke(zVar, d0Var, d0Var2);
        }
    }

    o(C4417z zVar, C4389d0 d0Var, C4389d0 d0Var2) {
        this(zVar, Collections.emptyMap(), d0Var, d0Var2);
    }

    private void m() {
        if (this.f11799f && this.f11798e == 0) {
            for (v0 close : this.f11801h.keySet()) {
                close.close();
            }
            this.f11801h.clear();
            this.f11794a.k();
            this.f11795b.quit();
        }
    }

    private void n(Runnable runnable) {
        o(runnable, new l());
    }

    private void o(Runnable runnable, Runnable runnable2) {
        try {
            this.f11796c.execute(new k(this, runnable2, runnable));
        } catch (RejectedExecutionException e10) {
            C4391e0.m("DualSurfaceProcessor", "Unable to executor runnable", e10);
            runnable2.run();
        }
    }

    private void p(C4417z zVar, Map<d.e, C> map) {
        try {
            c.a(new g(this, zVar, map)).get();
        } catch (InterruptedException | ExecutionException e10) {
            e = e10;
            if (e instanceof ExecutionException) {
                e = e.getCause();
            }
            if (e instanceof RuntimeException) {
                throw ((RuntimeException) e);
            }
            throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void q() {
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void r(Runnable runnable, Runnable runnable2) {
        if (this.f11799f) {
            runnable.run();
        } else {
            runnable2.run();
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void s(C4417z zVar, Map map, c.a aVar) {
        try {
            this.f11794a.h(zVar, map);
            aVar.c(null);
        } catch (RuntimeException e10) {
            aVar.f(e10);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object t(C4417z zVar, Map map, c.a aVar) {
        n(new i(this, zVar, map, aVar));
        return "Init GlRenderer";
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void u(SurfaceTexture surfaceTexture, Surface surface, G0.g gVar) {
        surfaceTexture.setOnFrameAvailableListener((SurfaceTexture.OnFrameAvailableListener) null);
        surfaceTexture.release();
        surface.release();
        this.f11798e--;
        m();
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void v(G0 g02) {
        this.f11798e++;
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f11794a.t(g02.s()));
        surfaceTexture.setDefaultBufferSize(g02.p().getWidth(), g02.p().getHeight());
        Surface surface = new Surface(surfaceTexture);
        g02.D(surface, this.f11796c, new m(this, surfaceTexture, surface));
        if (g02.s()) {
            this.f11802i = surfaceTexture;
            return;
        }
        this.f11803j = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this, this.f11797d);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void w(v0 v0Var, v0.b bVar) {
        v0Var.close();
        Surface remove = this.f11801h.remove(v0Var);
        if (remove != null) {
            this.f11794a.r(remove);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void x(v0 v0Var) {
        Surface i32 = v0Var.i3(this.f11796c, new j(this, v0Var));
        this.f11794a.j(i32);
        this.f11801h.put(v0Var, i32);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void y() {
        this.f11799f = true;
        m();
    }

    public void a(v0 v0Var) {
        if (this.f11800g.get()) {
            v0Var.close();
            return;
        }
        h hVar = new h(this, v0Var);
        Objects.requireNonNull(v0Var);
        o(hVar, new C4701k(v0Var));
    }

    public void c(G0 g02) {
        if (this.f11800g.get()) {
            g02.G();
            return;
        }
        f fVar = new f(this, g02);
        Objects.requireNonNull(g02);
        o(fVar, new C4703m(g02));
    }

    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2;
        if (!this.f11800g.get() && (surfaceTexture2 = this.f11802i) != null && this.f11803j != null) {
            surfaceTexture2.updateTexImage();
            this.f11803j.updateTexImage();
            for (Map.Entry next : this.f11801h.entrySet()) {
                Surface surface = (Surface) next.getValue();
                v0 v0Var = (v0) next.getKey();
                if (v0Var.getFormat() == 34) {
                    try {
                        this.f11794a.v(surfaceTexture.getTimestamp(), surface, v0Var, this.f11802i, this.f11803j);
                    } catch (RuntimeException e10) {
                        C4391e0.d("DualSurfaceProcessor", "Failed to render with OpenGL.", e10);
                    }
                }
            }
        }
    }

    public void release() {
        if (!this.f11800g.getAndSet(true)) {
            n(new e(this));
        }
    }

    o(C4417z zVar, Map<d.e, C> map, C4389d0 d0Var, C4389d0 d0Var2) {
        this.f11798e = 0;
        this.f11799f = false;
        this.f11800g = new AtomicBoolean(false);
        this.f11801h = new LinkedHashMap();
        HandlerThread handlerThread = new HandlerThread("GL Thread");
        this.f11795b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f11797d = handler;
        this.f11796c = H.a.e(handler);
        this.f11794a = new c(d0Var, d0Var2);
        try {
            p(zVar, map);
        } catch (RuntimeException e10) {
            release();
            throw e10;
        }
    }
}

package org.maplibre.android.maps.renderer.surfaceview;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import java.util.ArrayList;
import org.maplibre.android.maps.renderer.MapRenderer;

public abstract class MapLibreSurfaceView extends SurfaceView implements SurfaceHolder.Callback2 {

    /* renamed from: a  reason: collision with root package name */
    protected final c f146011a = new c();

    /* renamed from: b  reason: collision with root package name */
    protected a f146012b;

    /* renamed from: c  reason: collision with root package name */
    protected b f146013c;

    /* renamed from: d  reason: collision with root package name */
    protected a f146014d;

    /* renamed from: e  reason: collision with root package name */
    protected boolean f146015e;

    public interface a {
        void a();
    }

    static abstract class b extends Thread {

        /* renamed from: a  reason: collision with root package name */
        protected boolean f146016a;

        /* renamed from: b  reason: collision with root package name */
        protected boolean f146017b;

        /* renamed from: c  reason: collision with root package name */
        protected boolean f146018c;

        /* renamed from: d  reason: collision with root package name */
        protected boolean f146019d;

        /* renamed from: e  reason: collision with root package name */
        protected boolean f146020e;

        /* renamed from: f  reason: collision with root package name */
        protected boolean f146021f;

        /* renamed from: g  reason: collision with root package name */
        protected int f146022g = 0;

        /* renamed from: h  reason: collision with root package name */
        protected int f146023h = 0;

        /* renamed from: i  reason: collision with root package name */
        protected MapRenderer.a f146024i = MapRenderer.a.WHEN_DIRTY;

        /* renamed from: j  reason: collision with root package name */
        protected boolean f146025j = true;

        /* renamed from: k  reason: collision with root package name */
        protected boolean f146026k = false;

        /* renamed from: l  reason: collision with root package name */
        protected boolean f146027l;

        /* renamed from: m  reason: collision with root package name */
        protected ArrayList<Runnable> f146028m = new ArrayList<>();

        /* renamed from: n  reason: collision with root package name */
        protected boolean f146029n = true;

        /* renamed from: o  reason: collision with root package name */
        protected Runnable f146030o = null;

        /* renamed from: p  reason: collision with root package name */
        protected c f146031p = null;

        b(c cVar) {
            this.f146031p = cVar;
        }

        public abstract boolean a();

        public MapRenderer.a b() {
            MapRenderer.a aVar;
            synchronized (this.f146031p) {
                aVar = this.f146024i;
            }
            return aVar;
        }

        /* access modifiers changed from: protected */
        public abstract void c();

        /* JADX WARNING: Can't wrap try/catch for region: R(7:9|10|12|13|22|18|5) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x000b, code lost:
            continue;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x001b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void d() {
            /*
                r2 = this;
                org.maplibre.android.maps.renderer.surfaceview.MapLibreSurfaceView$c r0 = r2.f146031p
                monitor-enter(r0)
                r1 = 1
                r2.f146018c = r1     // Catch:{ all -> 0x0019 }
                org.maplibre.android.maps.renderer.surfaceview.MapLibreSurfaceView$c r1 = r2.f146031p     // Catch:{ all -> 0x0019 }
                r1.notifyAll()     // Catch:{ all -> 0x0019 }
            L_0x000b:
                boolean r1 = r2.f146017b     // Catch:{ all -> 0x0019 }
                if (r1 != 0) goto L_0x0023
                boolean r1 = r2.f146019d     // Catch:{ all -> 0x0019 }
                if (r1 != 0) goto L_0x0023
                org.maplibre.android.maps.renderer.surfaceview.MapLibreSurfaceView$c r1 = r2.f146031p     // Catch:{ InterruptedException -> 0x001b }
                r1.wait()     // Catch:{ InterruptedException -> 0x001b }
                goto L_0x000b
            L_0x0019:
                r1 = move-exception
                goto L_0x0025
            L_0x001b:
                java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0019 }
                r1.interrupt()     // Catch:{ all -> 0x0019 }
                goto L_0x000b
            L_0x0023:
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                return
            L_0x0025:
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: org.maplibre.android.maps.renderer.surfaceview.MapLibreSurfaceView.b.d():void");
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(7:11|12|14|15|25|20|5) */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x0010, code lost:
            continue;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0024 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void e() {
            /*
                r3 = this;
                org.maplibre.android.maps.renderer.surfaceview.MapLibreSurfaceView$c r0 = r3.f146031p
                monitor-enter(r0)
                r1 = 0
                r3.f146018c = r1     // Catch:{ all -> 0x0022 }
                r2 = 1
                r3.f146025j = r2     // Catch:{ all -> 0x0022 }
                r3.f146027l = r1     // Catch:{ all -> 0x0022 }
                org.maplibre.android.maps.renderer.surfaceview.MapLibreSurfaceView$c r1 = r3.f146031p     // Catch:{ all -> 0x0022 }
                r1.notifyAll()     // Catch:{ all -> 0x0022 }
            L_0x0010:
                boolean r1 = r3.f146017b     // Catch:{ all -> 0x0022 }
                if (r1 != 0) goto L_0x002c
                boolean r1 = r3.f146019d     // Catch:{ all -> 0x0022 }
                if (r1 == 0) goto L_0x002c
                boolean r1 = r3.f146027l     // Catch:{ all -> 0x0022 }
                if (r1 != 0) goto L_0x002c
                org.maplibre.android.maps.renderer.surfaceview.MapLibreSurfaceView$c r1 = r3.f146031p     // Catch:{ InterruptedException -> 0x0024 }
                r1.wait()     // Catch:{ InterruptedException -> 0x0024 }
                goto L_0x0010
            L_0x0022:
                r1 = move-exception
                goto L_0x002e
            L_0x0024:
                java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0022 }
                r1.interrupt()     // Catch:{ all -> 0x0022 }
                goto L_0x0010
            L_0x002c:
                monitor-exit(r0)     // Catch:{ all -> 0x0022 }
                return
            L_0x002e:
                monitor-exit(r0)     // Catch:{ all -> 0x0022 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: org.maplibre.android.maps.renderer.surfaceview.MapLibreSurfaceView.b.e():void");
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(7:18|19|20|21|32|26|10) */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x003f, code lost:
            return;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0036 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void f(int r2, int r3) {
            /*
                r1 = this;
                org.maplibre.android.maps.renderer.surfaceview.MapLibreSurfaceView$c r0 = r1.f146031p
                monitor-enter(r0)
                r1.f146022g = r2     // Catch:{ all -> 0x0017 }
                r1.f146023h = r3     // Catch:{ all -> 0x0017 }
                r2 = 1
                r1.f146029n = r2     // Catch:{ all -> 0x0017 }
                r1.f146025j = r2     // Catch:{ all -> 0x0017 }
                r2 = 0
                r1.f146027l = r2     // Catch:{ all -> 0x0017 }
                java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0017 }
                if (r2 != r1) goto L_0x0019
                monitor-exit(r0)     // Catch:{ all -> 0x0017 }
                return
            L_0x0017:
                r2 = move-exception
                goto L_0x0040
            L_0x0019:
                org.maplibre.android.maps.renderer.surfaceview.MapLibreSurfaceView$c r2 = r1.f146031p     // Catch:{ all -> 0x0017 }
                r2.notifyAll()     // Catch:{ all -> 0x0017 }
            L_0x001e:
                boolean r2 = r1.f146017b     // Catch:{ all -> 0x0017 }
                if (r2 != 0) goto L_0x003e
                boolean r2 = r1.f146019d     // Catch:{ all -> 0x0017 }
                if (r2 != 0) goto L_0x003e
                boolean r2 = r1.f146027l     // Catch:{ all -> 0x0017 }
                if (r2 != 0) goto L_0x003e
                boolean r2 = r1.a()     // Catch:{ all -> 0x0017 }
                if (r2 == 0) goto L_0x003e
                org.maplibre.android.maps.renderer.surfaceview.MapLibreSurfaceView$c r2 = r1.f146031p     // Catch:{ InterruptedException -> 0x0036 }
                r2.wait()     // Catch:{ InterruptedException -> 0x0036 }
                goto L_0x001e
            L_0x0036:
                java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0017 }
                r2.interrupt()     // Catch:{ all -> 0x0017 }
                goto L_0x001e
            L_0x003e:
                monitor-exit(r0)     // Catch:{ all -> 0x0017 }
                return
            L_0x0040:
                monitor-exit(r0)     // Catch:{ all -> 0x0017 }
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: org.maplibre.android.maps.renderer.surfaceview.MapLibreSurfaceView.b.f(int, int):void");
        }

        public void g(Runnable runnable) {
            synchronized (this.f146031p) {
                this.f146028m.add(runnable);
                this.f146031p.notifyAll();
            }
        }

        /* access modifiers changed from: protected */
        public boolean h() {
            return !this.f146019d && this.f146020e && this.f146022g > 0 && this.f146023h > 0 && (this.f146025j || this.f146024i == MapRenderer.a.CONTINUOUS);
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(7:7|8|10|11|19|16|5) */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x000b, code lost:
            continue;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0017 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void i() {
            /*
                r2 = this;
                org.maplibre.android.maps.renderer.surfaceview.MapLibreSurfaceView$c r0 = r2.f146031p
                monitor-enter(r0)
                r1 = 1
                r2.f146016a = r1     // Catch:{ all -> 0x0015 }
                org.maplibre.android.maps.renderer.surfaceview.MapLibreSurfaceView$c r1 = r2.f146031p     // Catch:{ all -> 0x0015 }
                r1.notifyAll()     // Catch:{ all -> 0x0015 }
            L_0x000b:
                boolean r1 = r2.f146017b     // Catch:{ all -> 0x0015 }
                if (r1 != 0) goto L_0x001f
                org.maplibre.android.maps.renderer.surfaceview.MapLibreSurfaceView$c r1 = r2.f146031p     // Catch:{ InterruptedException -> 0x0017 }
                r1.wait()     // Catch:{ InterruptedException -> 0x0017 }
                goto L_0x000b
            L_0x0015:
                r1 = move-exception
                goto L_0x0021
            L_0x0017:
                java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0015 }
                r1.interrupt()     // Catch:{ all -> 0x0015 }
                goto L_0x000b
            L_0x001f:
                monitor-exit(r0)     // Catch:{ all -> 0x0015 }
                return
            L_0x0021:
                monitor-exit(r0)     // Catch:{ all -> 0x0015 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: org.maplibre.android.maps.renderer.surfaceview.MapLibreSurfaceView.b.i():void");
        }

        public void j() {
            synchronized (this.f146031p) {
                this.f146025j = true;
                this.f146031p.notifyAll();
            }
        }

        public void k(Runnable runnable) {
            synchronized (this.f146031p) {
                try {
                    if (Thread.currentThread() != this) {
                        this.f146026k = true;
                        this.f146025j = true;
                        this.f146027l = false;
                        this.f146030o = runnable;
                        this.f146031p.notifyAll();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void l(MapRenderer.a aVar) {
            synchronized (this.f146031p) {
                this.f146024i = aVar;
                this.f146031p.notifyAll();
            }
        }

        public abstract void m();

        /* JADX WARNING: Can't wrap try/catch for region: R(7:9|10|12|13|22|18|5) */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x000b, code lost:
            continue;
         */
        /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x001b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void n() {
            /*
                r2 = this;
                org.maplibre.android.maps.renderer.surfaceview.MapLibreSurfaceView$c r0 = r2.f146031p
                monitor-enter(r0)
                r1 = 0
                r2.f146020e = r1     // Catch:{ all -> 0x0019 }
                org.maplibre.android.maps.renderer.surfaceview.MapLibreSurfaceView$c r1 = r2.f146031p     // Catch:{ all -> 0x0019 }
                r1.notifyAll()     // Catch:{ all -> 0x0019 }
            L_0x000b:
                boolean r1 = r2.f146017b     // Catch:{ all -> 0x0019 }
                if (r1 != 0) goto L_0x0023
                boolean r1 = r2.f146021f     // Catch:{ all -> 0x0019 }
                if (r1 != 0) goto L_0x0023
                org.maplibre.android.maps.renderer.surfaceview.MapLibreSurfaceView$c r1 = r2.f146031p     // Catch:{ InterruptedException -> 0x001b }
                r1.wait()     // Catch:{ InterruptedException -> 0x001b }
                goto L_0x000b
            L_0x0019:
                r1 = move-exception
                goto L_0x0025
            L_0x001b:
                java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0019 }
                r1.interrupt()     // Catch:{ all -> 0x0019 }
                goto L_0x000b
            L_0x0023:
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                return
            L_0x0025:
                monitor-exit(r0)     // Catch:{ all -> 0x0019 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: org.maplibre.android.maps.renderer.surfaceview.MapLibreSurfaceView.b.n():void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0003, code lost:
            continue;
         */
        /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
        /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0013 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void o() {
            /*
                r2 = this;
                org.maplibre.android.maps.renderer.surfaceview.MapLibreSurfaceView$c r0 = r2.f146031p
                monitor-enter(r0)
            L_0x0003:
                java.util.ArrayList<java.lang.Runnable> r1 = r2.f146028m     // Catch:{ all -> 0x0011 }
                boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0011 }
                if (r1 != 0) goto L_0x001b
                org.maplibre.android.maps.renderer.surfaceview.MapLibreSurfaceView$c r1 = r2.f146031p     // Catch:{ InterruptedException -> 0x0013 }
                r1.wait()     // Catch:{ InterruptedException -> 0x0013 }
                goto L_0x0003
            L_0x0011:
                r1 = move-exception
                goto L_0x001d
            L_0x0013:
                java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0011 }
                r1.interrupt()     // Catch:{ all -> 0x0011 }
                goto L_0x0003
            L_0x001b:
                monitor-exit(r0)     // Catch:{ all -> 0x0011 }
                return
            L_0x001d:
                monitor-exit(r0)     // Catch:{ all -> 0x0011 }
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: org.maplibre.android.maps.renderer.surfaceview.MapLibreSurfaceView.b.o():void");
        }

        public void run() {
            setName("RenderThread " + getId());
            try {
                c();
            } catch (InterruptedException unused) {
            } catch (Throwable th2) {
                this.f146031p.a(this);
                throw th2;
            }
            this.f146031p.a(this);
        }
    }

    protected static class c {
        protected c() {
        }

        /* access modifiers changed from: package-private */
        public synchronized void a(b bVar) {
            bVar.f146017b = true;
            notifyAll();
        }
    }

    public MapLibreSurfaceView(Context context) {
        super(context);
        c();
    }

    private void c() {
        SurfaceHolder holder = getHolder();
        holder.setFormat(-2);
        holder.addCallback(this);
    }

    /* access modifiers changed from: protected */
    public void a() {
        if (this.f146013c != null) {
            throw new IllegalStateException("setRenderer has already been called for this instance.");
        }
    }

    /* access modifiers changed from: protected */
    public abstract void b();

    public void d() {
        this.f146013c.d();
    }

    public void e() {
        this.f146013c.e();
    }

    public void f(Runnable runnable) {
        this.f146013c.g(runnable);
    }

    /* access modifiers changed from: protected */
    public void finalize() {
        try {
            b bVar = this.f146013c;
            if (bVar != null) {
                bVar.i();
            }
        } finally {
            super.finalize();
        }
    }

    public void g() {
        this.f146013c.j();
    }

    public MapRenderer.a getRenderingRefreshMode() {
        return this.f146013c.b();
    }

    public void h() {
        this.f146013c.o();
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f146015e && this.f146012b != null) {
            MapRenderer.a aVar = MapRenderer.a.WHEN_DIRTY;
            b bVar = this.f146013c;
            MapRenderer.a b10 = bVar != null ? bVar.b() : aVar;
            b();
            if (b10 != aVar) {
                this.f146013c.l(b10);
            }
            this.f146013c.start();
        }
        this.f146015e = false;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        a aVar = this.f146014d;
        if (aVar != null) {
            aVar.a();
        }
        b bVar = this.f146013c;
        if (bVar != null) {
            bVar.i();
        }
        this.f146015e = true;
        super.onDetachedFromWindow();
    }

    public void setDetachedListener(a aVar) {
        if (this.f146014d == null) {
            this.f146014d = aVar;
            return;
        }
        throw new IllegalArgumentException("Detached from window listener has been already set.");
    }

    public void setRenderer(a aVar) {
        a();
        this.f146012b = aVar;
        b();
        this.f146013c.start();
    }

    public void setRenderingRefreshMode(MapRenderer.a aVar) {
        this.f146013c.l(aVar);
    }

    public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        this.f146013c.f(i11, i12);
    }

    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f146013c.m();
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.f146013c.n();
    }

    @Deprecated
    public void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
    }

    public void surfaceRedrawNeededAsync(SurfaceHolder surfaceHolder, Runnable runnable) {
        b bVar = this.f146013c;
        if (bVar != null) {
            bVar.k(runnable);
        }
    }
}

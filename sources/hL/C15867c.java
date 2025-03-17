package HL;

import android.graphics.SurfaceTexture;
import android.view.TextureView;
import java.util.ArrayList;

/* renamed from: HL.c  reason: case insensitive filesystem */
abstract class C15867c extends Thread implements TextureView.SurfaceTextureListener {

    /* renamed from: a  reason: collision with root package name */
    protected final C15866b f135377a;

    /* renamed from: b  reason: collision with root package name */
    protected final Object f135378b = new Object();

    /* renamed from: c  reason: collision with root package name */
    protected final ArrayList<Runnable> f135379c = new ArrayList<>();

    /* renamed from: d  reason: collision with root package name */
    protected SurfaceTexture f135380d;

    /* renamed from: e  reason: collision with root package name */
    protected int f135381e;

    /* renamed from: f  reason: collision with root package name */
    protected int f135382f;

    /* renamed from: g  reason: collision with root package name */
    protected boolean f135383g;

    /* renamed from: h  reason: collision with root package name */
    protected boolean f135384h;

    /* renamed from: i  reason: collision with root package name */
    protected boolean f135385i;

    /* renamed from: j  reason: collision with root package name */
    protected boolean f135386j;

    /* renamed from: k  reason: collision with root package name */
    protected boolean f135387k;

    /* renamed from: l  reason: collision with root package name */
    protected boolean f135388l;

    C15867c(TextureView textureView, C15866b bVar) {
        textureView.setOpaque(!bVar.a());
        textureView.setSurfaceTextureListener(this);
        this.f135377a = bVar;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(7:7|8|10|11|19|16|5) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x000b, code lost:
        continue;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0017 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a() {
        /*
            r2 = this;
            java.lang.Object r0 = r2.f135378b
            monitor-enter(r0)
            r1 = 1
            r2.f135387k = r1     // Catch:{ all -> 0x0015 }
            java.lang.Object r1 = r2.f135378b     // Catch:{ all -> 0x0015 }
            r1.notifyAll()     // Catch:{ all -> 0x0015 }
        L_0x000b:
            boolean r1 = r2.f135388l     // Catch:{ all -> 0x0015 }
            if (r1 != 0) goto L_0x001f
            java.lang.Object r1 = r2.f135378b     // Catch:{ InterruptedException -> 0x0017 }
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
        throw new UnsupportedOperationException("Method not decompiled: HL.C15867c.a():void");
    }

    /* access modifiers changed from: package-private */
    public void b() {
        synchronized (this.f135378b) {
            this.f135385i = true;
            this.f135378b.notifyAll();
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        synchronized (this.f135378b) {
            this.f135385i = false;
            this.f135378b.notifyAll();
        }
    }

    /* access modifiers changed from: package-private */
    public void d(Runnable runnable) {
        if (runnable != null) {
            synchronized (this.f135378b) {
                this.f135379c.add(runnable);
                this.f135378b.notifyAll();
            }
            return;
        }
        throw new IllegalArgumentException("runnable must not be null");
    }

    /* access modifiers changed from: package-private */
    public void e() {
        synchronized (this.f135378b) {
            this.f135383g = true;
            this.f135378b.notifyAll();
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0003, code lost:
        continue;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0015 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f135378b
            monitor-enter(r0)
        L_0x0003:
            java.util.ArrayList<java.lang.Runnable> r1 = r4.f135379c     // Catch:{ all -> 0x0013 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0013 }
            if (r1 != 0) goto L_0x001d
            java.lang.Object r1 = r4.f135378b     // Catch:{ InterruptedException -> 0x0015 }
            r2 = 0
            r1.wait(r2)     // Catch:{ InterruptedException -> 0x0015 }
            goto L_0x0003
        L_0x0013:
            r1 = move-exception
            goto L_0x001f
        L_0x0015:
            java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0013 }
            r1.interrupt()     // Catch:{ all -> 0x0013 }
            goto L_0x0003
        L_0x001d:
            monitor-exit(r0)     // Catch:{ all -> 0x0013 }
            return
        L_0x001f:
            monitor-exit(r0)     // Catch:{ all -> 0x0013 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: HL.C15867c.f():void");
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i10, int i11) {
        synchronized (this.f135378b) {
            this.f135380d = surfaceTexture;
            this.f135381e = i10;
            this.f135382f = i11;
            this.f135383g = true;
            this.f135378b.notifyAll();
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        synchronized (this.f135378b) {
            this.f135380d = null;
            this.f135386j = true;
            this.f135383g = false;
            this.f135378b.notifyAll();
        }
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i10, int i11) {
        synchronized (this.f135378b) {
            this.f135381e = i10;
            this.f135382f = i11;
            this.f135384h = true;
            this.f135383g = true;
            this.f135378b.notifyAll();
        }
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}

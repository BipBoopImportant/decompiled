package androidx.camera.core;

import C.C4385b0;
import C.C4391e0;
import D2.m;
import G.q;
import K.a;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.ImageWriter;
import androidx.camera.core.f;
import androidx.camera.core.impl.C5048t0;
import androidx.concurrent.futures.c;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;

abstract class i implements C5048t0.a {

    /* renamed from: a  reason: collision with root package name */
    private f.a f16694a;

    /* renamed from: b  reason: collision with root package name */
    private volatile int f16695b;

    /* renamed from: c  reason: collision with root package name */
    private volatile int f16696c;

    /* renamed from: d  reason: collision with root package name */
    private volatile int f16697d = 1;

    /* renamed from: e  reason: collision with root package name */
    private volatile boolean f16698e;

    /* renamed from: f  reason: collision with root package name */
    private volatile boolean f16699f;

    /* renamed from: g  reason: collision with root package name */
    private Executor f16700g;

    /* renamed from: h  reason: collision with root package name */
    private q f16701h;

    /* renamed from: i  reason: collision with root package name */
    private ImageWriter f16702i;

    /* renamed from: j  reason: collision with root package name */
    private Rect f16703j = new Rect();

    /* renamed from: k  reason: collision with root package name */
    private Rect f16704k = new Rect();

    /* renamed from: l  reason: collision with root package name */
    private Matrix f16705l = new Matrix();

    /* renamed from: m  reason: collision with root package name */
    private Matrix f16706m = new Matrix();

    /* renamed from: n  reason: collision with root package name */
    ByteBuffer f16707n;

    /* renamed from: o  reason: collision with root package name */
    ByteBuffer f16708o;

    /* renamed from: p  reason: collision with root package name */
    ByteBuffer f16709p;

    /* renamed from: q  reason: collision with root package name */
    ByteBuffer f16710q;

    /* renamed from: r  reason: collision with root package name */
    private final Object f16711r = new Object();

    /* renamed from: s  reason: collision with root package name */
    protected boolean f16712s = true;

    i() {
    }

    private void h(n nVar) {
        if (this.f16697d == 1) {
            if (this.f16708o == null) {
                this.f16708o = ByteBuffer.allocateDirect(nVar.getWidth() * nVar.getHeight());
            }
            this.f16708o.position(0);
            if (this.f16709p == null) {
                this.f16709p = ByteBuffer.allocateDirect((nVar.getWidth() * nVar.getHeight()) / 4);
            }
            this.f16709p.position(0);
            if (this.f16710q == null) {
                this.f16710q = ByteBuffer.allocateDirect((nVar.getWidth() * nVar.getHeight()) / 4);
            }
            this.f16710q.position(0);
        } else if (this.f16697d == 2 && this.f16707n == null) {
            this.f16707n = ByteBuffer.allocateDirect(nVar.getWidth() * nVar.getHeight() * 4);
        }
    }

    private static q i(int i10, int i11, int i12, int i13, int i14) {
        boolean z10 = i12 == 90 || i12 == 270;
        int i15 = z10 ? i11 : i10;
        if (!z10) {
            i10 = i11;
        }
        return new q(o.a(i15, i10, i13, i14));
    }

    static Matrix k(int i10, int i11, int i12, int i13, int i14) {
        Matrix matrix = new Matrix();
        if (i14 > 0) {
            matrix.setRectToRect(new RectF(0.0f, 0.0f, (float) i10, (float) i11), q.f6106a, Matrix.ScaleToFit.FILL);
            matrix.postRotate((float) i14);
            matrix.postConcat(q.c(new RectF(0.0f, 0.0f, (float) i12, (float) i13)));
        }
        return matrix;
    }

    static Rect l(Rect rect, Matrix matrix) {
        RectF rectF = new RectF(rect);
        matrix.mapRect(rectF);
        Rect rect2 = new Rect();
        rectF.round(rect2);
        return rect2;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void m(n nVar, Matrix matrix, n nVar2, Rect rect, f.a aVar, c.a aVar2) {
        if (this.f16712s) {
            r rVar = new r(nVar2, C4385b0.f(nVar.F2().b(), nVar.F2().a(), this.f16698e ? 0 : this.f16695b, matrix));
            if (!rect.isEmpty()) {
                rVar.setCropRect(rect);
            }
            aVar.d(rVar);
            aVar2.c(null);
            return;
        }
        aVar2.f(new m("ImageAnalysis is detached"));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object n(Executor executor, n nVar, Matrix matrix, n nVar2, Rect rect, f.a aVar, c.a aVar2) {
        Executor executor2 = executor;
        executor.execute(new h(this, nVar, matrix, nVar2, rect, aVar, aVar2));
        return "analyzeImage";
    }

    private void p(int i10, int i11, int i12, int i13) {
        Matrix k10 = k(i10, i11, i12, i13, this.f16695b);
        this.f16704k = l(this.f16703j, k10);
        this.f16706m.setConcat(this.f16705l, k10);
    }

    private void q(n nVar, int i10) {
        q qVar = this.f16701h;
        if (qVar != null) {
            qVar.l();
            this.f16701h = i(nVar.getWidth(), nVar.getHeight(), i10, this.f16701h.c(), this.f16701h.e());
            if (this.f16697d == 1) {
                ImageWriter imageWriter = this.f16702i;
                if (imageWriter != null) {
                    a.a(imageWriter);
                }
                this.f16702i = a.c(this.f16701h.getSurface(), this.f16701h.e());
            }
        }
    }

    public void a(C5048t0 t0Var) {
        try {
            n d10 = d(t0Var);
            if (d10 != null) {
                o(d10);
            }
        } catch (IllegalStateException e10) {
            C4391e0.d("ImageAnalysisAnalyzer", "Failed to acquire image.", e10);
        }
    }

    /* access modifiers changed from: package-private */
    public abstract n d(C5048t0 t0Var);

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0073  */
    ob.C10101e<java.lang.Void> e(androidx.camera.core.n r15) {
        /*
            r14 = this;
            boolean r0 = r14.f16698e
            r1 = 0
            if (r0 == 0) goto L_0x0008
            int r0 = r14.f16695b
            goto L_0x0009
        L_0x0008:
            r0 = r1
        L_0x0009:
            java.lang.Object r2 = r14.f16711r
            monitor-enter(r2)
            java.util.concurrent.Executor r9 = r14.f16700g     // Catch:{ all -> 0x001b }
            androidx.camera.core.f$a r10 = r14.f16694a     // Catch:{ all -> 0x001b }
            boolean r3 = r14.f16698e     // Catch:{ all -> 0x001b }
            r11 = 1
            if (r3 == 0) goto L_0x001e
            int r3 = r14.f16696c     // Catch:{ all -> 0x001b }
            if (r0 == r3) goto L_0x001e
            r12 = r11
            goto L_0x001f
        L_0x001b:
            r15 = move-exception
            goto L_0x00c5
        L_0x001e:
            r12 = r1
        L_0x001f:
            if (r12 == 0) goto L_0x0024
            r14.q(r15, r0)     // Catch:{ all -> 0x001b }
        L_0x0024:
            boolean r3 = r14.f16698e     // Catch:{ all -> 0x001b }
            if (r3 == 0) goto L_0x002b
            r14.h(r15)     // Catch:{ all -> 0x001b }
        L_0x002b:
            androidx.camera.core.q r3 = r14.f16701h     // Catch:{ all -> 0x001b }
            android.media.ImageWriter r4 = r14.f16702i     // Catch:{ all -> 0x001b }
            java.nio.ByteBuffer r5 = r14.f16707n     // Catch:{ all -> 0x001b }
            java.nio.ByteBuffer r6 = r14.f16708o     // Catch:{ all -> 0x001b }
            java.nio.ByteBuffer r7 = r14.f16709p     // Catch:{ all -> 0x001b }
            java.nio.ByteBuffer r8 = r14.f16710q     // Catch:{ all -> 0x001b }
            monitor-exit(r2)     // Catch:{ all -> 0x001b }
            if (r10 == 0) goto L_0x00b9
            if (r9 == 0) goto L_0x00b9
            boolean r2 = r14.f16712s
            if (r2 == 0) goto L_0x00b9
            if (r3 == 0) goto L_0x006b
            int r2 = r14.f16697d
            r13 = 2
            if (r2 != r13) goto L_0x004e
            boolean r2 = r14.f16699f
            androidx.camera.core.n r2 = androidx.camera.core.ImageProcessingUtil.g(r15, r3, r5, r0, r2)
            goto L_0x006c
        L_0x004e:
            int r2 = r14.f16697d
            if (r2 != r11) goto L_0x006b
            boolean r2 = r14.f16699f
            if (r2 == 0) goto L_0x0059
            androidx.camera.core.ImageProcessingUtil.c(r15)
        L_0x0059:
            if (r4 == 0) goto L_0x006b
            if (r6 == 0) goto L_0x006b
            if (r7 == 0) goto L_0x006b
            if (r8 == 0) goto L_0x006b
            r2 = r15
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r0
            androidx.camera.core.n r2 = androidx.camera.core.ImageProcessingUtil.o(r2, r3, r4, r5, r6, r7, r8)
            goto L_0x006c
        L_0x006b:
            r2 = 0
        L_0x006c:
            if (r2 != 0) goto L_0x006f
            r1 = r11
        L_0x006f:
            if (r1 == 0) goto L_0x0073
            r8 = r15
            goto L_0x0074
        L_0x0073:
            r8 = r2
        L_0x0074:
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            android.graphics.Matrix r7 = new android.graphics.Matrix
            r7.<init>()
            java.lang.Object r3 = r14.f16711r
            monitor-enter(r3)
            if (r12 == 0) goto L_0x009b
            if (r1 != 0) goto L_0x009b
            int r1 = r15.getWidth()     // Catch:{ all -> 0x0099 }
            int r4 = r15.getHeight()     // Catch:{ all -> 0x0099 }
            int r5 = r8.getWidth()     // Catch:{ all -> 0x0099 }
            int r6 = r8.getHeight()     // Catch:{ all -> 0x0099 }
            r14.p(r1, r4, r5, r6)     // Catch:{ all -> 0x0099 }
            goto L_0x009b
        L_0x0099:
            r15 = move-exception
            goto L_0x00b7
        L_0x009b:
            r14.f16696c = r0     // Catch:{ all -> 0x0099 }
            android.graphics.Rect r0 = r14.f16704k     // Catch:{ all -> 0x0099 }
            r2.set(r0)     // Catch:{ all -> 0x0099 }
            android.graphics.Matrix r0 = r14.f16706m     // Catch:{ all -> 0x0099 }
            r7.set(r0)     // Catch:{ all -> 0x0099 }
            monitor-exit(r3)     // Catch:{ all -> 0x0099 }
            androidx.camera.core.g r0 = new androidx.camera.core.g
            r3 = r0
            r4 = r14
            r5 = r9
            r6 = r15
            r9 = r2
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            ob.e r15 = androidx.concurrent.futures.c.a(r0)
            goto L_0x00c4
        L_0x00b7:
            monitor-exit(r3)     // Catch:{ all -> 0x0099 }
            throw r15
        L_0x00b9:
            D2.m r15 = new D2.m
            java.lang.String r0 = "No analyzer or executor currently set."
            r15.<init>(r0)
            ob.e r15 = I.n.n(r15)
        L_0x00c4:
            return r15
        L_0x00c5:
            monitor-exit(r2)     // Catch:{ all -> 0x001b }
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.i.e(androidx.camera.core.n):ob.e");
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.f16712s = true;
    }

    /* access modifiers changed from: package-private */
    public abstract void g();

    /* access modifiers changed from: package-private */
    public void j() {
        this.f16712s = false;
        g();
    }

    /* access modifiers changed from: package-private */
    public abstract void o(n nVar);

    /* access modifiers changed from: package-private */
    public void r(Executor executor, f.a aVar) {
        if (aVar == null) {
            g();
        }
        synchronized (this.f16711r) {
            this.f16694a = aVar;
            this.f16700g = executor;
        }
    }

    /* access modifiers changed from: package-private */
    public void s(boolean z10) {
        this.f16699f = z10;
    }

    /* access modifiers changed from: package-private */
    public void t(int i10) {
        this.f16697d = i10;
    }

    /* access modifiers changed from: package-private */
    public void u(boolean z10) {
        this.f16698e = z10;
    }

    /* access modifiers changed from: package-private */
    public void v(q qVar) {
        synchronized (this.f16711r) {
            this.f16701h = qVar;
        }
    }

    /* access modifiers changed from: package-private */
    public void w(int i10) {
        this.f16695b = i10;
    }

    /* access modifiers changed from: package-private */
    public void x(Matrix matrix) {
        synchronized (this.f16711r) {
            this.f16705l = matrix;
            this.f16706m = new Matrix(this.f16705l);
        }
    }

    /* access modifiers changed from: package-private */
    public void y(Rect rect) {
        synchronized (this.f16711r) {
            this.f16703j = rect;
            this.f16704k = new Rect(this.f16703j);
        }
    }
}

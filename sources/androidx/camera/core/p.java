package androidx.camera.core;

import C.C4391e0;
import C.C4393f0;
import C.C4395g0;
import C.W;
import H2.i;
import J.c;
import android.media.ImageReader;
import android.util.LongSparseArray;
import android.view.Surface;
import androidx.camera.core.e;
import androidx.camera.core.impl.C5040p;
import androidx.camera.core.impl.C5048t0;
import androidx.camera.core.impl.C5059z;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

public class p implements C5048t0, e.a {

    /* renamed from: a  reason: collision with root package name */
    private final Object f17050a;

    /* renamed from: b  reason: collision with root package name */
    private C5040p f17051b;

    /* renamed from: c  reason: collision with root package name */
    private int f17052c;

    /* renamed from: d  reason: collision with root package name */
    private C5048t0.a f17053d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f17054e;

    /* renamed from: f  reason: collision with root package name */
    private final C5048t0 f17055f;

    /* renamed from: g  reason: collision with root package name */
    C5048t0.a f17056g;

    /* renamed from: h  reason: collision with root package name */
    private Executor f17057h;

    /* renamed from: i  reason: collision with root package name */
    private final LongSparseArray<W> f17058i;

    /* renamed from: j  reason: collision with root package name */
    private final LongSparseArray<n> f17059j;

    /* renamed from: k  reason: collision with root package name */
    private int f17060k;

    /* renamed from: l  reason: collision with root package name */
    private final List<n> f17061l;

    /* renamed from: m  reason: collision with root package name */
    private final List<n> f17062m;

    class a extends C5040p {
        a() {
        }

        public void b(int i10, C5059z zVar) {
            super.b(i10, zVar);
            p.this.s(zVar);
        }
    }

    public p(int i10, int i11, int i12, int i13) {
        this(j(i10, i11, i12, i13));
    }

    private static C5048t0 j(int i10, int i11, int i12, int i13) {
        return new d(ImageReader.newInstance(i10, i11, i12, i13));
    }

    private void k(n nVar) {
        synchronized (this.f17050a) {
            try {
                int indexOf = this.f17061l.indexOf(nVar);
                if (indexOf >= 0) {
                    this.f17061l.remove(indexOf);
                    int i10 = this.f17060k;
                    if (indexOf <= i10) {
                        this.f17060k = i10 - 1;
                    }
                }
                this.f17062m.remove(nVar);
                if (this.f17052c > 0) {
                    n(this.f17055f);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void l(r rVar) {
        C5048t0.a aVar;
        Executor executor;
        synchronized (this.f17050a) {
            try {
                if (this.f17061l.size() < e()) {
                    rVar.c(this);
                    this.f17061l.add(rVar);
                    aVar = this.f17056g;
                    executor = this.f17057h;
                } else {
                    C4391e0.a("TAG", "Maximum image number reached.");
                    rVar.close();
                    aVar = null;
                    executor = null;
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        if (aVar == null) {
            return;
        }
        if (executor != null) {
            executor.execute(new C4395g0(this, aVar));
        } else {
            aVar.a(this);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void o(C5048t0.a aVar) {
        aVar.a(this);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void p(C5048t0 t0Var) {
        synchronized (this.f17050a) {
            this.f17052c++;
        }
        n(t0Var);
    }

    private void q() {
        synchronized (this.f17050a) {
            try {
                for (int size = this.f17058i.size() - 1; size >= 0; size--) {
                    W valueAt = this.f17058i.valueAt(size);
                    long a10 = valueAt.a();
                    n nVar = this.f17059j.get(a10);
                    if (nVar != null) {
                        this.f17059j.remove(a10);
                        this.f17058i.removeAt(size);
                        l(new r(nVar, valueAt));
                    }
                }
                r();
            } finally {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void r() {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f17050a
            monitor-enter(r0)
            android.util.LongSparseArray<androidx.camera.core.n> r1 = r7.f17059j     // Catch:{ all -> 0x005b }
            int r1 = r1.size()     // Catch:{ all -> 0x005b }
            if (r1 == 0) goto L_0x007e
            android.util.LongSparseArray<C.W> r1 = r7.f17058i     // Catch:{ all -> 0x005b }
            int r1 = r1.size()     // Catch:{ all -> 0x005b }
            if (r1 != 0) goto L_0x0014
            goto L_0x007e
        L_0x0014:
            android.util.LongSparseArray<androidx.camera.core.n> r1 = r7.f17059j     // Catch:{ all -> 0x005b }
            r2 = 0
            long r3 = r1.keyAt(r2)     // Catch:{ all -> 0x005b }
            java.lang.Long r1 = java.lang.Long.valueOf(r3)     // Catch:{ all -> 0x005b }
            android.util.LongSparseArray<C.W> r5 = r7.f17058i     // Catch:{ all -> 0x005b }
            long r5 = r5.keyAt(r2)     // Catch:{ all -> 0x005b }
            java.lang.Long r2 = java.lang.Long.valueOf(r5)     // Catch:{ all -> 0x005b }
            boolean r1 = r2.equals(r1)     // Catch:{ all -> 0x005b }
            r1 = r1 ^ 1
            H2.i.a(r1)     // Catch:{ all -> 0x005b }
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 <= 0) goto L_0x0060
            android.util.LongSparseArray<androidx.camera.core.n> r1 = r7.f17059j     // Catch:{ all -> 0x005b }
            int r1 = r1.size()     // Catch:{ all -> 0x005b }
            int r1 = r1 + -1
        L_0x003e:
            if (r1 < 0) goto L_0x007c
            android.util.LongSparseArray<androidx.camera.core.n> r2 = r7.f17059j     // Catch:{ all -> 0x005b }
            long r2 = r2.keyAt(r1)     // Catch:{ all -> 0x005b }
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 >= 0) goto L_0x005d
            android.util.LongSparseArray<androidx.camera.core.n> r2 = r7.f17059j     // Catch:{ all -> 0x005b }
            java.lang.Object r2 = r2.valueAt(r1)     // Catch:{ all -> 0x005b }
            androidx.camera.core.n r2 = (androidx.camera.core.n) r2     // Catch:{ all -> 0x005b }
            r2.close()     // Catch:{ all -> 0x005b }
            android.util.LongSparseArray<androidx.camera.core.n> r2 = r7.f17059j     // Catch:{ all -> 0x005b }
            r2.removeAt(r1)     // Catch:{ all -> 0x005b }
            goto L_0x005d
        L_0x005b:
            r1 = move-exception
            goto L_0x0080
        L_0x005d:
            int r1 = r1 + -1
            goto L_0x003e
        L_0x0060:
            android.util.LongSparseArray<C.W> r1 = r7.f17058i     // Catch:{ all -> 0x005b }
            int r1 = r1.size()     // Catch:{ all -> 0x005b }
            int r1 = r1 + -1
        L_0x0068:
            if (r1 < 0) goto L_0x007c
            android.util.LongSparseArray<C.W> r2 = r7.f17058i     // Catch:{ all -> 0x005b }
            long r5 = r2.keyAt(r1)     // Catch:{ all -> 0x005b }
            int r2 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x0079
            android.util.LongSparseArray<C.W> r2 = r7.f17058i     // Catch:{ all -> 0x005b }
            r2.removeAt(r1)     // Catch:{ all -> 0x005b }
        L_0x0079:
            int r1 = r1 + -1
            goto L_0x0068
        L_0x007c:
            monitor-exit(r0)     // Catch:{ all -> 0x005b }
            return
        L_0x007e:
            monitor-exit(r0)     // Catch:{ all -> 0x005b }
            return
        L_0x0080:
            monitor-exit(r0)     // Catch:{ all -> 0x005b }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.p.r():void");
    }

    public void a(n nVar) {
        synchronized (this.f17050a) {
            k(nVar);
        }
    }

    public n b() {
        synchronized (this.f17050a) {
            try {
                if (this.f17061l.isEmpty()) {
                    return null;
                }
                if (this.f17060k < this.f17061l.size()) {
                    ArrayList<n> arrayList = new ArrayList<>();
                    for (int i10 = 0; i10 < this.f17061l.size() - 1; i10++) {
                        if (!this.f17062m.contains(this.f17061l.get(i10))) {
                            arrayList.add(this.f17061l.get(i10));
                        }
                    }
                    for (n close : arrayList) {
                        close.close();
                    }
                    int size = this.f17061l.size();
                    List<n> list = this.f17061l;
                    this.f17060k = size;
                    n nVar = list.get(size - 1);
                    this.f17062m.add(nVar);
                    return nVar;
                }
                throw new IllegalStateException("Maximum image number reached.");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int c() {
        int c10;
        synchronized (this.f17050a) {
            c10 = this.f17055f.c();
        }
        return c10;
    }

    public void close() {
        synchronized (this.f17050a) {
            try {
                if (!this.f17054e) {
                    for (n close : new ArrayList(this.f17061l)) {
                        close.close();
                    }
                    this.f17061l.clear();
                    this.f17055f.close();
                    this.f17054e = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void d() {
        synchronized (this.f17050a) {
            this.f17055f.d();
            this.f17056g = null;
            this.f17057h = null;
            this.f17052c = 0;
        }
    }

    public int e() {
        int e10;
        synchronized (this.f17050a) {
            e10 = this.f17055f.e();
        }
        return e10;
    }

    public void f(C5048t0.a aVar, Executor executor) {
        synchronized (this.f17050a) {
            this.f17056g = (C5048t0.a) i.g(aVar);
            this.f17057h = (Executor) i.g(executor);
            this.f17055f.f(this.f17053d, executor);
        }
    }

    public n g() {
        synchronized (this.f17050a) {
            try {
                if (this.f17061l.isEmpty()) {
                    return null;
                }
                if (this.f17060k < this.f17061l.size()) {
                    List<n> list = this.f17061l;
                    int i10 = this.f17060k;
                    this.f17060k = i10 + 1;
                    n nVar = list.get(i10);
                    this.f17062m.add(nVar);
                    return nVar;
                }
                throw new IllegalStateException("Maximum image number reached.");
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public int getHeight() {
        int height;
        synchronized (this.f17050a) {
            height = this.f17055f.getHeight();
        }
        return height;
    }

    public Surface getSurface() {
        Surface surface;
        synchronized (this.f17050a) {
            surface = this.f17055f.getSurface();
        }
        return surface;
    }

    public int getWidth() {
        int width;
        synchronized (this.f17050a) {
            width = this.f17055f.getWidth();
        }
        return width;
    }

    public C5040p m() {
        return this.f17051b;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void n(androidx.camera.core.impl.C5048t0 r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.f17050a
            monitor-enter(r0)
            boolean r1 = r6.f17054e     // Catch:{ all -> 0x0009 }
            if (r1 == 0) goto L_0x000b
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            return
        L_0x0009:
            r7 = move-exception
            goto L_0x0060
        L_0x000b:
            android.util.LongSparseArray<androidx.camera.core.n> r1 = r6.f17059j     // Catch:{ all -> 0x0009 }
            int r1 = r1.size()     // Catch:{ all -> 0x0009 }
            java.util.List<androidx.camera.core.n> r2 = r6.f17061l     // Catch:{ all -> 0x0009 }
            int r2 = r2.size()     // Catch:{ all -> 0x0009 }
            int r1 = r1 + r2
            int r2 = r7.e()     // Catch:{ all -> 0x0009 }
            if (r1 < r2) goto L_0x0027
            java.lang.String r7 = "MetadataImageReader"
            java.lang.String r1 = "Skip to acquire the next image because the acquired image count has reached the max images count."
            C.C4391e0.a(r7, r1)     // Catch:{ all -> 0x0009 }
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            return
        L_0x0027:
            androidx.camera.core.n r2 = r7.g()     // Catch:{ IllegalStateException -> 0x0048 }
            if (r2 == 0) goto L_0x0051
            int r3 = r6.f17052c     // Catch:{ all -> 0x0009 }
            int r3 = r3 + -1
            r6.f17052c = r3     // Catch:{ all -> 0x0009 }
            int r1 = r1 + 1
            android.util.LongSparseArray<androidx.camera.core.n> r3 = r6.f17059j     // Catch:{ all -> 0x0009 }
            C.W r4 = r2.F2()     // Catch:{ all -> 0x0009 }
            long r4 = r4.a()     // Catch:{ all -> 0x0009 }
            r3.put(r4, r2)     // Catch:{ all -> 0x0009 }
            r6.q()     // Catch:{ all -> 0x0009 }
            goto L_0x0051
        L_0x0046:
            r7 = move-exception
            goto L_0x005f
        L_0x0048:
            r2 = move-exception
            java.lang.String r3 = "MetadataImageReader"
            java.lang.String r4 = "Failed to acquire next image."
            C.C4391e0.b(r3, r4, r2)     // Catch:{ all -> 0x0046 }
            r2 = 0
        L_0x0051:
            if (r2 == 0) goto L_0x005d
            int r2 = r6.f17052c     // Catch:{ all -> 0x0009 }
            if (r2 <= 0) goto L_0x005d
            int r2 = r7.e()     // Catch:{ all -> 0x0009 }
            if (r1 < r2) goto L_0x0027
        L_0x005d:
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            return
        L_0x005f:
            throw r7     // Catch:{ all -> 0x0009 }
        L_0x0060:
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.p.n(androidx.camera.core.impl.t0):void");
    }

    /* access modifiers changed from: package-private */
    public void s(C5059z zVar) {
        synchronized (this.f17050a) {
            try {
                if (!this.f17054e) {
                    this.f17058i.put(zVar.a(), new c(zVar));
                    q();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    p(C5048t0 t0Var) {
        this.f17050a = new Object();
        this.f17051b = new a();
        this.f17052c = 0;
        this.f17053d = new C4393f0(this);
        this.f17054e = false;
        this.f17058i = new LongSparseArray<>();
        this.f17059j = new LongSparseArray<>();
        this.f17062m = new ArrayList();
        this.f17055f = t0Var;
        this.f17060k = 0;
        this.f17061l = new ArrayList(e());
    }
}

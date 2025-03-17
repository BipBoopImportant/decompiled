package U7;

import E7.k;
import E7.q;
import E7.v;
import N7.f;
import V7.h;
import W7.e;
import Y7.l;
import Z7.b;
import Z7.c;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.c;
import com.bumptech.glide.d;
import com.bumptech.glide.g;
import java.util.List;
import java.util.concurrent.Executor;

public final class i<R> implements d, h, h {

    /* renamed from: E  reason: collision with root package name */
    private static final boolean f40332E = Log.isLoggable("GlideRequest", 2);

    /* renamed from: A  reason: collision with root package name */
    private int f40333A;

    /* renamed from: B  reason: collision with root package name */
    private int f40334B;

    /* renamed from: C  reason: collision with root package name */
    private boolean f40335C;

    /* renamed from: D  reason: collision with root package name */
    private RuntimeException f40336D;

    /* renamed from: a  reason: collision with root package name */
    private int f40337a;

    /* renamed from: b  reason: collision with root package name */
    private final String f40338b;

    /* renamed from: c  reason: collision with root package name */
    private final c f40339c;

    /* renamed from: d  reason: collision with root package name */
    private final Object f40340d;

    /* renamed from: e  reason: collision with root package name */
    private final f<R> f40341e;

    /* renamed from: f  reason: collision with root package name */
    private final e f40342f;

    /* renamed from: g  reason: collision with root package name */
    private final Context f40343g;

    /* renamed from: h  reason: collision with root package name */
    private final d f40344h;

    /* renamed from: i  reason: collision with root package name */
    private final Object f40345i;

    /* renamed from: j  reason: collision with root package name */
    private final Class<R> f40346j;

    /* renamed from: k  reason: collision with root package name */
    private final a<?> f40347k;

    /* renamed from: l  reason: collision with root package name */
    private final int f40348l;

    /* renamed from: m  reason: collision with root package name */
    private final int f40349m;

    /* renamed from: n  reason: collision with root package name */
    private final g f40350n;

    /* renamed from: o  reason: collision with root package name */
    private final V7.i<R> f40351o;

    /* renamed from: p  reason: collision with root package name */
    private final List<f<R>> f40352p;

    /* renamed from: q  reason: collision with root package name */
    private final e<? super R> f40353q;

    /* renamed from: r  reason: collision with root package name */
    private final Executor f40354r;

    /* renamed from: s  reason: collision with root package name */
    private v<R> f40355s;

    /* renamed from: t  reason: collision with root package name */
    private k.d f40356t;

    /* renamed from: u  reason: collision with root package name */
    private long f40357u;

    /* renamed from: v  reason: collision with root package name */
    private volatile k f40358v;

    /* renamed from: w  reason: collision with root package name */
    private a f40359w;

    /* renamed from: x  reason: collision with root package name */
    private Drawable f40360x;

    /* renamed from: y  reason: collision with root package name */
    private Drawable f40361y;

    /* renamed from: z  reason: collision with root package name */
    private Drawable f40362z;

    private enum a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    private i(Context context, d dVar, Object obj, Object obj2, Class<R> cls, a<?> aVar, int i10, int i11, g gVar, V7.i<R> iVar, f<R> fVar, List<f<R>> list, e eVar, k kVar, e<? super R> eVar2, Executor executor) {
        this.f40338b = f40332E ? String.valueOf(super.hashCode()) : null;
        this.f40339c = c.a();
        this.f40340d = obj;
        this.f40343g = context;
        this.f40344h = dVar;
        this.f40345i = obj2;
        this.f40346j = cls;
        this.f40347k = aVar;
        this.f40348l = i10;
        this.f40349m = i11;
        this.f40350n = gVar;
        this.f40351o = iVar;
        this.f40341e = fVar;
        this.f40352p = list;
        this.f40342f = eVar;
        this.f40358v = kVar;
        this.f40353q = eVar2;
        this.f40354r = executor;
        this.f40359w = a.PENDING;
        if (this.f40336D == null && dVar.g().a(c.C0809c.class)) {
            this.f40336D = new RuntimeException("Glide request origin trace");
        }
    }

    private void A(q qVar, int i10) {
        boolean z10;
        this.f40339c.c();
        synchronized (this.f40340d) {
            try {
                qVar.k(this.f40336D);
                int h10 = this.f40344h.h();
                if (h10 <= i10) {
                    Log.w("Glide", "Load failed for [" + this.f40345i + "] with dimensions [" + this.f40333A + "x" + this.f40334B + "]", qVar);
                    if (h10 <= 4) {
                        qVar.g("Glide");
                    }
                }
                this.f40356t = null;
                this.f40359w = a.FAILED;
                x();
                boolean z11 = true;
                this.f40335C = true;
                List<f<R>> list = this.f40352p;
                if (list != null) {
                    z10 = false;
                    for (f<R> a10 : list) {
                        z10 |= a10.a(qVar, this.f40345i, this.f40351o, t());
                    }
                } else {
                    z10 = false;
                }
                f<R> fVar = this.f40341e;
                if (fVar == null || !fVar.a(qVar, this.f40345i, this.f40351o, t())) {
                    z11 = false;
                }
                if (!z10 && !z11) {
                    C();
                }
                this.f40335C = false;
                b.f("GlideRequest", this.f40337a);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x00d3 A[Catch:{ all -> 0x00b5 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void B(E7.v<R> r16, R r17, C7.a r18, boolean r19) {
        /*
            r15 = this;
            r1 = r15
            r0 = r18
            boolean r9 = r15.t()
            U7.i$a r2 = U7.i.a.COMPLETE
            r1.f40359w = r2
            r2 = r16
            r1.f40355s = r2
            com.bumptech.glide.d r2 = r1.f40344h
            int r2 = r2.h()
            r3 = 3
            if (r2 > r3) goto L_0x006f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Finished loading "
            r2.append(r3)
            java.lang.Class r3 = r17.getClass()
            java.lang.String r3 = r3.getSimpleName()
            r2.append(r3)
            java.lang.String r3 = " from "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r3 = " for "
            r2.append(r3)
            java.lang.Object r3 = r1.f40345i
            r2.append(r3)
            java.lang.String r3 = " with size ["
            r2.append(r3)
            int r3 = r1.f40333A
            r2.append(r3)
            java.lang.String r3 = "x"
            r2.append(r3)
            int r3 = r1.f40334B
            r2.append(r3)
            java.lang.String r3 = "] in "
            r2.append(r3)
            long r3 = r1.f40357u
            double r3 = Y7.g.a(r3)
            r2.append(r3)
            java.lang.String r3 = " ms"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "Glide"
            android.util.Log.d(r3, r2)
        L_0x006f:
            r15.y()
            r10 = 1
            r1.f40335C = r10
            r11 = 0
            java.util.List<U7.f<R>> r2 = r1.f40352p     // Catch:{ all -> 0x00b5 }
            if (r2 == 0) goto L_0x00b9
            java.util.Iterator r12 = r2.iterator()     // Catch:{ all -> 0x00b5 }
            r8 = r11
        L_0x007f:
            boolean r2 = r12.hasNext()     // Catch:{ all -> 0x00b5 }
            if (r2 == 0) goto L_0x00ba
            java.lang.Object r2 = r12.next()     // Catch:{ all -> 0x00b5 }
            r13 = r2
            U7.f r13 = (U7.f) r13     // Catch:{ all -> 0x00b5 }
            java.lang.Object r4 = r1.f40345i     // Catch:{ all -> 0x00b5 }
            V7.i<R> r5 = r1.f40351o     // Catch:{ all -> 0x00b5 }
            r2 = r13
            r3 = r17
            r6 = r18
            r7 = r9
            boolean r2 = r2.b(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00b5 }
            r14 = r8 | r2
            boolean r2 = r13 instanceof U7.c     // Catch:{ all -> 0x00b5 }
            if (r2 == 0) goto L_0x00b7
            r2 = r13
            U7.c r2 = (U7.c) r2     // Catch:{ all -> 0x00b5 }
            java.lang.Object r4 = r1.f40345i     // Catch:{ all -> 0x00b5 }
            V7.i<R> r5 = r1.f40351o     // Catch:{ all -> 0x00b5 }
            r3 = r17
            r6 = r18
            r7 = r9
            r8 = r19
            boolean r2 = r2.d(r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x00b5 }
            r2 = r2 | r14
            r8 = r2
            goto L_0x007f
        L_0x00b5:
            r0 = move-exception
            goto L_0x00ea
        L_0x00b7:
            r8 = r14
            goto L_0x007f
        L_0x00b9:
            r8 = r11
        L_0x00ba:
            U7.f<R> r2 = r1.f40341e     // Catch:{ all -> 0x00b5 }
            if (r2 == 0) goto L_0x00ce
            java.lang.Object r4 = r1.f40345i     // Catch:{ all -> 0x00b5 }
            V7.i<R> r5 = r1.f40351o     // Catch:{ all -> 0x00b5 }
            r3 = r17
            r6 = r18
            r7 = r9
            boolean r2 = r2.b(r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00b5 }
            if (r2 == 0) goto L_0x00ce
            goto L_0x00cf
        L_0x00ce:
            r10 = r11
        L_0x00cf:
            r2 = r8 | r10
            if (r2 != 0) goto L_0x00e0
            W7.e<? super R> r2 = r1.f40353q     // Catch:{ all -> 0x00b5 }
            W7.d r0 = r2.a(r0, r9)     // Catch:{ all -> 0x00b5 }
            V7.i<R> r2 = r1.f40351o     // Catch:{ all -> 0x00b5 }
            r3 = r17
            r2.j(r3, r0)     // Catch:{ all -> 0x00b5 }
        L_0x00e0:
            r1.f40335C = r11
            java.lang.String r0 = "GlideRequest"
            int r2 = r1.f40337a
            Z7.b.f(r0, r2)
            return
        L_0x00ea:
            r1.f40335C = r11
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: U7.i.B(E7.v, java.lang.Object, C7.a, boolean):void");
    }

    private void C() {
        if (m()) {
            Drawable r10 = this.f40345i == null ? r() : null;
            if (r10 == null) {
                r10 = q();
            }
            if (r10 == null) {
                r10 = s();
            }
            this.f40351o.m(r10);
        }
    }

    private void k() {
        if (this.f40335C) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    private boolean l() {
        e eVar = this.f40342f;
        return eVar == null || eVar.d(this);
    }

    private boolean m() {
        e eVar = this.f40342f;
        return eVar == null || eVar.k(this);
    }

    private boolean n() {
        e eVar = this.f40342f;
        return eVar == null || eVar.e(this);
    }

    private void o() {
        k();
        this.f40339c.c();
        this.f40351o.c(this);
        k.d dVar = this.f40356t;
        if (dVar != null) {
            dVar.a();
            this.f40356t = null;
        }
    }

    private void p(Object obj) {
        List<f<R>> list = this.f40352p;
        if (list != null) {
            for (f next : list) {
                if (next instanceof c) {
                    ((c) next).c(obj);
                }
            }
        }
    }

    private Drawable q() {
        if (this.f40360x == null) {
            Drawable m10 = this.f40347k.m();
            this.f40360x = m10;
            if (m10 == null && this.f40347k.l() > 0) {
                this.f40360x = u(this.f40347k.l());
            }
        }
        return this.f40360x;
    }

    private Drawable r() {
        if (this.f40362z == null) {
            Drawable n10 = this.f40347k.n();
            this.f40362z = n10;
            if (n10 == null && this.f40347k.o() > 0) {
                this.f40362z = u(this.f40347k.o());
            }
        }
        return this.f40362z;
    }

    private Drawable s() {
        if (this.f40361y == null) {
            Drawable w10 = this.f40347k.w();
            this.f40361y = w10;
            if (w10 == null && this.f40347k.y() > 0) {
                this.f40361y = u(this.f40347k.y());
            }
        }
        return this.f40361y;
    }

    private boolean t() {
        e eVar = this.f40342f;
        return eVar == null || !eVar.getRoot().a();
    }

    private Drawable u(int i10) {
        return f.a(this.f40343g, i10, this.f40347k.E() != null ? this.f40347k.E() : this.f40343g.getTheme());
    }

    private void v(String str) {
        Log.v("GlideRequest", str + " this: " + this.f40338b);
    }

    private static int w(int i10, float f10) {
        return i10 == Integer.MIN_VALUE ? i10 : Math.round(f10 * ((float) i10));
    }

    private void x() {
        e eVar = this.f40342f;
        if (eVar != null) {
            eVar.g(this);
        }
    }

    private void y() {
        e eVar = this.f40342f;
        if (eVar != null) {
            eVar.b(this);
        }
    }

    public static <R> i<R> z(Context context, d dVar, Object obj, Object obj2, Class<R> cls, a<?> aVar, int i10, int i11, g gVar, V7.i<R> iVar, f<R> fVar, List<f<R>> list, e eVar, k kVar, e<? super R> eVar2, Executor executor) {
        return new i(context, dVar, obj, obj2, cls, aVar, i10, i11, gVar, iVar, fVar, list, eVar, kVar, eVar2, executor);
    }

    public boolean a() {
        boolean z10;
        synchronized (this.f40340d) {
            z10 = this.f40359w == a.COMPLETE;
        }
        return z10;
    }

    public void b(q qVar) {
        A(qVar, 5);
    }

    public void c() {
        synchronized (this.f40340d) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003a, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        r5.f40358v.k(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void clear() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f40340d
            monitor-enter(r0)
            r5.k()     // Catch:{ all -> 0x0013 }
            Z7.c r1 = r5.f40339c     // Catch:{ all -> 0x0013 }
            r1.c()     // Catch:{ all -> 0x0013 }
            U7.i$a r1 = r5.f40359w     // Catch:{ all -> 0x0013 }
            U7.i$a r2 = U7.i.a.CLEARED     // Catch:{ all -> 0x0013 }
            if (r1 != r2) goto L_0x0015
            monitor-exit(r0)     // Catch:{ all -> 0x0013 }
            return
        L_0x0013:
            r1 = move-exception
            goto L_0x0042
        L_0x0015:
            r5.o()     // Catch:{ all -> 0x0013 }
            E7.v<R> r1 = r5.f40355s     // Catch:{ all -> 0x0013 }
            r3 = 0
            if (r1 == 0) goto L_0x0020
            r5.f40355s = r3     // Catch:{ all -> 0x0013 }
            goto L_0x0021
        L_0x0020:
            r1 = r3
        L_0x0021:
            boolean r3 = r5.l()     // Catch:{ all -> 0x0013 }
            if (r3 == 0) goto L_0x0030
            V7.i<R> r3 = r5.f40351o     // Catch:{ all -> 0x0013 }
            android.graphics.drawable.Drawable r4 = r5.s()     // Catch:{ all -> 0x0013 }
            r3.f(r4)     // Catch:{ all -> 0x0013 }
        L_0x0030:
            java.lang.String r3 = "GlideRequest"
            int r4 = r5.f40337a     // Catch:{ all -> 0x0013 }
            Z7.b.f(r3, r4)     // Catch:{ all -> 0x0013 }
            r5.f40359w = r2     // Catch:{ all -> 0x0013 }
            monitor-exit(r0)     // Catch:{ all -> 0x0013 }
            if (r1 == 0) goto L_0x0041
            E7.k r0 = r5.f40358v
            r0.k(r1)
        L_0x0041:
            return
        L_0x0042:
            monitor-exit(r0)     // Catch:{ all -> 0x0013 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: U7.i.clear():void");
    }

    public void d(v<?> vVar, C7.a aVar, boolean z10) {
        this.f40339c.c();
        v<?> vVar2 = null;
        try {
            synchronized (this.f40340d) {
                try {
                    this.f40356t = null;
                    if (vVar == null) {
                        b(new q("Expected to receive a Resource<R> with an object of " + this.f40346j + " inside, but instead got null."));
                        return;
                    }
                    Object obj = vVar.get();
                    if (obj != null) {
                        if (this.f40346j.isAssignableFrom(obj.getClass())) {
                            if (!n()) {
                                try {
                                    this.f40355s = null;
                                    this.f40359w = a.COMPLETE;
                                    b.f("GlideRequest", this.f40337a);
                                    this.f40358v.k(vVar);
                                    return;
                                } catch (Throwable th2) {
                                    vVar2 = vVar;
                                    th = th2;
                                    throw th;
                                }
                            } else {
                                B(vVar, obj, aVar, z10);
                                return;
                            }
                        }
                    }
                    this.f40355s = null;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Expected to receive an object of ");
                    sb2.append(this.f40346j);
                    sb2.append(" but instead got ");
                    sb2.append(obj != null ? obj.getClass() : "");
                    sb2.append("{");
                    sb2.append(obj);
                    sb2.append("} inside Resource{");
                    sb2.append(vVar);
                    sb2.append("}.");
                    sb2.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                    b(new q(sb2.toString()));
                    this.f40358v.k(vVar);
                } catch (Throwable th3) {
                    th = th3;
                    throw th;
                }
            }
        } catch (Throwable th4) {
            if (vVar2 != null) {
                this.f40358v.k(vVar2);
            }
            throw th4;
        }
    }

    public void e(int i10, int i11) {
        Object obj;
        this.f40339c.c();
        Object obj2 = this.f40340d;
        synchronized (obj2) {
            try {
                boolean z10 = f40332E;
                if (z10) {
                    v("Got onSizeReady in " + Y7.g.a(this.f40357u));
                }
                if (this.f40359w == a.WAITING_FOR_SIZE) {
                    a aVar = a.RUNNING;
                    this.f40359w = aVar;
                    float D10 = this.f40347k.D();
                    this.f40333A = w(i10, D10);
                    this.f40334B = w(i11, D10);
                    if (z10) {
                        v("finished setup for calling load in " + Y7.g.a(this.f40357u));
                    }
                    a aVar2 = aVar;
                    boolean z11 = z10;
                    a aVar3 = aVar2;
                    obj = obj2;
                    try {
                        this.f40356t = this.f40358v.f(this.f40344h, this.f40345i, this.f40347k.C(), this.f40333A, this.f40334B, this.f40347k.A(), this.f40346j, this.f40350n, this.f40347k.k(), this.f40347k.G(), this.f40347k.S(), this.f40347k.O(), this.f40347k.r(), this.f40347k.M(), this.f40347k.I(), this.f40347k.H(), this.f40347k.p(), this, this.f40354r);
                        if (this.f40359w != aVar3) {
                            this.f40356t = null;
                        }
                        if (z11) {
                            v("finished onSizeReady in " + Y7.g.a(this.f40357u));
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
                obj = obj2;
                throw th;
            }
        }
    }

    public boolean f() {
        boolean z10;
        synchronized (this.f40340d) {
            z10 = this.f40359w == a.CLEARED;
        }
        return z10;
    }

    public Object g() {
        this.f40339c.c();
        return this.f40340d;
    }

    public boolean h() {
        boolean z10;
        synchronized (this.f40340d) {
            z10 = this.f40359w == a.COMPLETE;
        }
        return z10;
    }

    public boolean i(d dVar) {
        int i10;
        int i11;
        Object obj;
        Class<R> cls;
        a<?> aVar;
        g gVar;
        int size;
        int i12;
        int i13;
        Object obj2;
        Class<R> cls2;
        a<?> aVar2;
        g gVar2;
        int size2;
        d dVar2 = dVar;
        if (!(dVar2 instanceof i)) {
            return false;
        }
        synchronized (this.f40340d) {
            try {
                i10 = this.f40348l;
                i11 = this.f40349m;
                obj = this.f40345i;
                cls = this.f40346j;
                aVar = this.f40347k;
                gVar = this.f40350n;
                List<f<R>> list = this.f40352p;
                size = list != null ? list.size() : 0;
            } finally {
                while (true) {
                }
            }
        }
        i iVar = (i) dVar2;
        synchronized (iVar.f40340d) {
            try {
                i12 = iVar.f40348l;
                i13 = iVar.f40349m;
                obj2 = iVar.f40345i;
                cls2 = iVar.f40346j;
                aVar2 = iVar.f40347k;
                gVar2 = iVar.f40350n;
                List<f<R>> list2 = iVar.f40352p;
                size2 = list2 != null ? list2.size() : 0;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return i10 == i12 && i11 == i13 && l.c(obj, obj2) && cls.equals(cls2) && l.b(aVar, aVar2) && gVar == gVar2 && size == size2;
    }

    public boolean isRunning() {
        boolean z10;
        synchronized (this.f40340d) {
            try {
                a aVar = this.f40359w;
                if (aVar != a.RUNNING) {
                    if (aVar != a.WAITING_FOR_SIZE) {
                        z10 = false;
                    }
                }
                z10 = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00ae, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void j() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f40340d
            monitor-enter(r0)
            r5.k()     // Catch:{ all -> 0x0028 }
            Z7.c r1 = r5.f40339c     // Catch:{ all -> 0x0028 }
            r1.c()     // Catch:{ all -> 0x0028 }
            long r1 = Y7.g.b()     // Catch:{ all -> 0x0028 }
            r5.f40357u = r1     // Catch:{ all -> 0x0028 }
            java.lang.Object r1 = r5.f40345i     // Catch:{ all -> 0x0028 }
            if (r1 != 0) goto L_0x0040
            int r1 = r5.f40348l     // Catch:{ all -> 0x0028 }
            int r2 = r5.f40349m     // Catch:{ all -> 0x0028 }
            boolean r1 = Y7.l.u(r1, r2)     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x002b
            int r1 = r5.f40348l     // Catch:{ all -> 0x0028 }
            r5.f40333A = r1     // Catch:{ all -> 0x0028 }
            int r1 = r5.f40349m     // Catch:{ all -> 0x0028 }
            r5.f40334B = r1     // Catch:{ all -> 0x0028 }
            goto L_0x002b
        L_0x0028:
            r1 = move-exception
            goto L_0x00b7
        L_0x002b:
            android.graphics.drawable.Drawable r1 = r5.r()     // Catch:{ all -> 0x0028 }
            if (r1 != 0) goto L_0x0033
            r1 = 5
            goto L_0x0034
        L_0x0033:
            r1 = 3
        L_0x0034:
            E7.q r2 = new E7.q     // Catch:{ all -> 0x0028 }
            java.lang.String r3 = "Received null model"
            r2.<init>(r3)     // Catch:{ all -> 0x0028 }
            r5.A(r2, r1)     // Catch:{ all -> 0x0028 }
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0040:
            U7.i$a r2 = r5.f40359w     // Catch:{ all -> 0x0028 }
            U7.i$a r3 = U7.i.a.RUNNING     // Catch:{ all -> 0x0028 }
            if (r2 == r3) goto L_0x00af
            U7.i$a r4 = U7.i.a.COMPLETE     // Catch:{ all -> 0x0028 }
            if (r2 != r4) goto L_0x0054
            E7.v<R> r1 = r5.f40355s     // Catch:{ all -> 0x0028 }
            C7.a r2 = C7.a.MEMORY_CACHE     // Catch:{ all -> 0x0028 }
            r3 = 0
            r5.d(r1, r2, r3)     // Catch:{ all -> 0x0028 }
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x0054:
            r5.p(r1)     // Catch:{ all -> 0x0028 }
            java.lang.String r1 = "GlideRequest"
            int r1 = Z7.b.b(r1)     // Catch:{ all -> 0x0028 }
            r5.f40337a = r1     // Catch:{ all -> 0x0028 }
            U7.i$a r1 = U7.i.a.WAITING_FOR_SIZE     // Catch:{ all -> 0x0028 }
            r5.f40359w = r1     // Catch:{ all -> 0x0028 }
            int r2 = r5.f40348l     // Catch:{ all -> 0x0028 }
            int r4 = r5.f40349m     // Catch:{ all -> 0x0028 }
            boolean r2 = Y7.l.u(r2, r4)     // Catch:{ all -> 0x0028 }
            if (r2 == 0) goto L_0x0075
            int r2 = r5.f40348l     // Catch:{ all -> 0x0028 }
            int r4 = r5.f40349m     // Catch:{ all -> 0x0028 }
            r5.e(r2, r4)     // Catch:{ all -> 0x0028 }
            goto L_0x007a
        L_0x0075:
            V7.i<R> r2 = r5.f40351o     // Catch:{ all -> 0x0028 }
            r2.h(r5)     // Catch:{ all -> 0x0028 }
        L_0x007a:
            U7.i$a r2 = r5.f40359w     // Catch:{ all -> 0x0028 }
            if (r2 == r3) goto L_0x0080
            if (r2 != r1) goto L_0x008f
        L_0x0080:
            boolean r1 = r5.m()     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x008f
            V7.i<R> r1 = r5.f40351o     // Catch:{ all -> 0x0028 }
            android.graphics.drawable.Drawable r2 = r5.s()     // Catch:{ all -> 0x0028 }
            r1.e(r2)     // Catch:{ all -> 0x0028 }
        L_0x008f:
            boolean r1 = f40332E     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x00ad
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0028 }
            r1.<init>()     // Catch:{ all -> 0x0028 }
            java.lang.String r2 = "finished run method in "
            r1.append(r2)     // Catch:{ all -> 0x0028 }
            long r2 = r5.f40357u     // Catch:{ all -> 0x0028 }
            double r2 = Y7.g.a(r2)     // Catch:{ all -> 0x0028 }
            r1.append(r2)     // Catch:{ all -> 0x0028 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0028 }
            r5.v(r1)     // Catch:{ all -> 0x0028 }
        L_0x00ad:
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            return
        L_0x00af:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x0028 }
            java.lang.String r2 = "Cannot restart a running request"
            r1.<init>(r2)     // Catch:{ all -> 0x0028 }
            throw r1     // Catch:{ all -> 0x0028 }
        L_0x00b7:
            monitor-exit(r0)     // Catch:{ all -> 0x0028 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: U7.i.j():void");
    }

    public String toString() {
        Object obj;
        Class<R> cls;
        synchronized (this.f40340d) {
            obj = this.f40345i;
            cls = this.f40346j;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}

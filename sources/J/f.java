package J;

import C.C4389d0;
import C.C4391e0;
import C.C4400j;
import C.C4402k;
import C.C4404l;
import C.C4408p;
import C.C4417z;
import C.G0;
import C.H0;
import C.J0;
import C.U;
import C.p0;
import G.q;
import H2.i;
import S.h;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.util.Log;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.B;
import androidx.camera.core.impl.C5010a;
import androidx.camera.core.impl.C5039o0;
import androidx.camera.core.impl.C5043q0;
import androidx.camera.core.impl.E0;
import androidx.camera.core.impl.F;
import androidx.camera.core.impl.G;
import androidx.camera.core.impl.I;
import androidx.camera.core.impl.J;
import androidx.camera.core.impl.M0;
import androidx.camera.core.impl.U0;
import androidx.camera.core.impl.V0;
import androidx.camera.core.impl.X;
import androidx.camera.core.impl.Z0;
import androidx.camera.core.impl.c1;
import androidx.camera.core.impl.o1;
import androidx.camera.core.impl.p1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class f implements C4400j {

    /* renamed from: a  reason: collision with root package name */
    private final J f8750a;

    /* renamed from: b  reason: collision with root package name */
    private final J f8751b;

    /* renamed from: c  reason: collision with root package name */
    private final G f8752c;

    /* renamed from: d  reason: collision with root package name */
    private final p1 f8753d;

    /* renamed from: e  reason: collision with root package name */
    private final b f8754e;

    /* renamed from: f  reason: collision with root package name */
    private final List<H0> f8755f = new ArrayList();

    /* renamed from: g  reason: collision with root package name */
    private final List<H0> f8756g = new ArrayList();

    /* renamed from: h  reason: collision with root package name */
    private final D.a f8757h;

    /* renamed from: i  reason: collision with root package name */
    private J0 f8758i;

    /* renamed from: j  reason: collision with root package name */
    private List<C4404l> f8759j = Collections.emptyList();

    /* renamed from: k  reason: collision with root package name */
    private final B f8760k;

    /* renamed from: l  reason: collision with root package name */
    private final Object f8761l = new Object();

    /* renamed from: m  reason: collision with root package name */
    private boolean f8762m = true;

    /* renamed from: n  reason: collision with root package name */
    private X f8763n = null;

    /* renamed from: o  reason: collision with root package name */
    private H0 f8764o;

    /* renamed from: p  reason: collision with root package name */
    private h f8765p;

    /* renamed from: q  reason: collision with root package name */
    private final U0 f8766q;

    /* renamed from: r  reason: collision with root package name */
    private final V0 f8767r;

    /* renamed from: s  reason: collision with root package name */
    private final V0 f8768s;

    /* renamed from: t  reason: collision with root package name */
    private final C4389d0 f8769t;

    /* renamed from: u  reason: collision with root package name */
    private final C4389d0 f8770u;

    public static final class a extends Exception {
        public a(Throwable th2) {
            super(th2);
        }
    }

    public static abstract class b {
        public static b a(String str, C5039o0 o0Var) {
            return new a(str, o0Var);
        }

        public abstract C5039o0 b();

        public abstract String c();
    }

    private static class c {

        /* renamed from: a  reason: collision with root package name */
        o1<?> f8771a;

        /* renamed from: b  reason: collision with root package name */
        o1<?> f8772b;

        c(o1<?> o1Var, o1<?> o1Var2) {
            this.f8771a = o1Var;
            this.f8772b = o1Var2;
        }
    }

    public f(J j10, J j11, V0 v02, V0 v03, C4389d0 d0Var, C4389d0 d0Var2, D.a aVar, G g10, p1 p1Var) {
        this.f8750a = j10;
        this.f8751b = j11;
        this.f8769t = d0Var;
        this.f8770u = d0Var2;
        this.f8757h = aVar;
        this.f8752c = g10;
        this.f8753d = p1Var;
        B r10 = v02.r();
        this.f8760k = r10;
        this.f8766q = new U0(j10.d(), r10.W((Z0) null));
        this.f8767r = v02;
        this.f8768s = v03;
        this.f8754e = B(v02, v03);
    }

    public static b B(V0 v02, V0 v03) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(v02.d());
        sb2.append(v03 == null ? "" : v03.d());
        return b.a(sb2.toString(), v02.r().Q());
    }

    private static o1<?> C(p1 p1Var, h hVar) {
        o1<?> k10 = new p0.a().f().k(false, p1Var);
        if (k10 == null) {
            return null;
        }
        E0 c02 = E0.c0(k10);
        c02.d0(m.f8790c);
        return hVar.z(c02).e();
    }

    private int E() {
        synchronized (this.f8761l) {
            try {
                return this.f8757h.c() == 2 ? 1 : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static Map<H0, c> F(Collection<H0> collection, p1 p1Var, p1 p1Var2) {
        HashMap hashMap = new HashMap();
        for (H0 next : collection) {
            hashMap.put(next, new c(h.t0(next) ? C(p1Var, (h) next) : next.k(false, p1Var), next.k(true, p1Var2)));
        }
        return hashMap;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: boolean} */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int H(boolean r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.f8761l
            monitor-enter(r0)
            java.util.List<C.l> r1 = r7.f8759j     // Catch:{ all -> 0x002c }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x002c }
            r2 = 0
        L_0x000a:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x002c }
            r4 = 0
            if (r3 == 0) goto L_0x002e
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x002c }
            C.l r3 = (C.C4404l) r3     // Catch:{ all -> 0x002c }
            int r5 = r3.g()     // Catch:{ all -> 0x002c }
            int r5 = O.a0.d(r5)     // Catch:{ all -> 0x002c }
            r6 = 1
            if (r5 <= r6) goto L_0x000a
            if (r2 != 0) goto L_0x0025
            r4 = r6
        L_0x0025:
            java.lang.String r2 = "Can only have one sharing effect."
            H2.i.j(r4, r2)     // Catch:{ all -> 0x002c }
            r2 = r3
            goto L_0x000a
        L_0x002c:
            r8 = move-exception
            goto L_0x003b
        L_0x002e:
            if (r2 != 0) goto L_0x0031
            goto L_0x0035
        L_0x0031:
            int r4 = r2.g()     // Catch:{ all -> 0x002c }
        L_0x0035:
            if (r8 == 0) goto L_0x0039
            r4 = r4 | 3
        L_0x0039:
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            return r4
        L_0x003b:
            monitor-exit(r0)     // Catch:{ all -> 0x002c }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: J.f.H(boolean):int");
    }

    private Set<H0> I(Collection<H0> collection, boolean z10) {
        HashSet hashSet = new HashSet();
        int H10 = H(z10);
        for (H0 next : collection) {
            i.b(!h.t0(next), "Only support one level of sharing for now.");
            if (next.B(H10)) {
                hashSet.add(next);
            }
        }
        return hashSet;
    }

    private boolean K() {
        boolean z10;
        synchronized (this.f8761l) {
            z10 = this.f8760k.W((Z0) null) != null;
        }
        return z10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x002e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean L(androidx.camera.core.impl.c1 r4, androidx.camera.core.impl.X0 r5) {
        /*
            androidx.camera.core.impl.X r4 = r4.d()
            androidx.camera.core.impl.X r0 = r5.f()
            java.util.Set r1 = r4.e()
            int r1 = r1.size()
            androidx.camera.core.impl.X r5 = r5.f()
            java.util.Set r5 = r5.e()
            int r5 = r5.size()
            r2 = 1
            if (r1 == r5) goto L_0x0020
            return r2
        L_0x0020:
            java.util.Set r5 = r4.e()
            java.util.Iterator r5 = r5.iterator()
        L_0x0028:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x0049
            java.lang.Object r1 = r5.next()
            androidx.camera.core.impl.X$a r1 = (androidx.camera.core.impl.X.a) r1
            boolean r3 = r0.b(r1)
            if (r3 == 0) goto L_0x0048
            java.lang.Object r3 = r0.a(r1)
            java.lang.Object r1 = r4.a(r1)
            boolean r1 = java.util.Objects.equals(r3, r1)
            if (r1 != 0) goto L_0x0028
        L_0x0048:
            return r2
        L_0x0049:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: J.f.L(androidx.camera.core.impl.c1, androidx.camera.core.impl.X0):boolean");
    }

    private static boolean M(Collection<H0> collection) {
        for (H0 j10 : collection) {
            if (T(j10.j().G())) {
                return true;
            }
        }
        return false;
    }

    private static boolean N(Collection<H0> collection) {
        for (H0 next : collection) {
            if (S(next)) {
                o1<?> j10 = next.j();
                X.a<Integer> aVar = C5043q0.f16997N;
                if (j10.b(aVar) && ((Integer) i.g((Integer) j10.a(aVar))).intValue() == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean O(Collection<H0> collection) {
        for (H0 W10 : collection) {
            if (W(W10)) {
                return true;
            }
        }
        return false;
    }

    private boolean P() {
        boolean z10;
        synchronized (this.f8761l) {
            z10 = true;
            if (this.f8760k.u() != 1) {
                z10 = false;
            }
        }
        return z10;
    }

    private static boolean Q(Collection<H0> collection) {
        boolean z10 = false;
        boolean z11 = false;
        for (H0 next : collection) {
            if (U(next) || h.t0(next)) {
                z10 = true;
            } else if (S(next)) {
                z11 = true;
            }
        }
        return z10 && !z11;
    }

    private static boolean R(Collection<H0> collection) {
        boolean z10 = false;
        boolean z11 = false;
        for (H0 next : collection) {
            if (U(next) || h.t0(next)) {
                z11 = true;
            } else if (S(next)) {
                z10 = true;
            }
        }
        return z10 && !z11;
    }

    private static boolean S(H0 h02) {
        return h02 instanceof U;
    }

    private static boolean T(C4417z zVar) {
        return (zVar.a() == 10) || (zVar.b() != 1 && zVar.b() != 0);
    }

    private static boolean U(H0 h02) {
        return h02 instanceof p0;
    }

    static boolean V(Collection<H0> collection) {
        int[] iArr = {1, 2, 4};
        HashSet hashSet = new HashSet();
        for (H0 next : collection) {
            int i10 = 0;
            while (true) {
                if (i10 < 3) {
                    int i11 = iArr[i10];
                    if (next.B(i11)) {
                        if (hashSet.contains(Integer.valueOf(i11))) {
                            return false;
                        }
                        hashSet.add(Integer.valueOf(i11));
                    }
                    i10++;
                }
            }
        }
        return true;
    }

    private static boolean W(H0 h02) {
        if (h02 != null) {
            if (h02.j().b(o1.f16978F)) {
                return h02.j().getCaptureType() == p1.b.VIDEO_CAPTURE;
            }
            Log.e("CameraUseCaseAdapter", h02 + " UseCase does not have capture type.");
        }
        return false;
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void X(Surface surface, SurfaceTexture surfaceTexture, G0.g gVar) {
        surface.release();
        surfaceTexture.release();
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ void Y(G0 g02) {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(g02.p().getWidth(), g02.p().getHeight());
        surfaceTexture.detachFromGLContext();
        Surface surface = new Surface(surfaceTexture);
        g02.D(surface, H.a.a(), new e(surface, surfaceTexture));
    }

    private void a0() {
        synchronized (this.f8761l) {
            try {
                if (this.f8763n != null) {
                    this.f8750a.d().n(this.f8763n);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static List<C4404l> c0(List<C4404l> list, Collection<H0> collection) {
        ArrayList arrayList = new ArrayList(list);
        for (H0 next : collection) {
            next.S((C4404l) null);
            for (C4404l next2 : list) {
                if (next.B(next2.g())) {
                    boolean z10 = next.l() == null;
                    i.j(z10, next + " already has effect" + next.l());
                    next.S(next2);
                    arrayList.remove(next2);
                }
            }
        }
        return arrayList;
    }

    static void e0(List<C4404l> list, Collection<H0> collection, Collection<H0> collection2) {
        List<C4404l> c02 = c0(list, collection);
        ArrayList arrayList = new ArrayList(collection2);
        arrayList.removeAll(collection);
        List<C4404l> c03 = c0(c02, arrayList);
        if (c03.size() > 0) {
            C4391e0.l("CameraUseCaseAdapter", "Unused effects: " + c03);
        }
    }

    private void g0(Map<H0, c1> map, Collection<H0> collection) {
        synchronized (this.f8761l) {
            try {
                if (this.f8758i != null && !collection.isEmpty()) {
                    Map<H0, Rect> a10 = o.a(this.f8750a.d().g(), this.f8750a.j().f() == 0, this.f8758i.a(), this.f8750a.j().o(this.f8758i.c()), this.f8758i.d(), this.f8758i.b(), map);
                    for (H0 next : collection) {
                        next.V((Rect) i.g(a10.get(next)));
                    }
                }
                for (H0 next2 : collection) {
                    next2.T(u(this.f8750a.d().g(), ((c1) i.g(map.get(next2))).e()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void n() {
        synchronized (this.f8761l) {
            F d10 = this.f8750a.d();
            this.f8763n = d10.j();
            d10.p();
        }
    }

    static Collection<H0> s(Collection<H0> collection, H0 h02, h hVar) {
        ArrayList arrayList = new ArrayList(collection);
        if (h02 != null) {
            arrayList.add(h02);
        }
        if (hVar != null) {
            arrayList.add(hVar);
            arrayList.removeAll(hVar.k0());
        }
        return arrayList;
    }

    private H0 t(Collection<H0> collection, h hVar) {
        H0 h02;
        synchronized (this.f8761l) {
            try {
                ArrayList arrayList = new ArrayList(collection);
                if (hVar != null) {
                    arrayList.add(hVar);
                    arrayList.removeAll(hVar.k0());
                }
                if (P()) {
                    if (R(arrayList)) {
                        h02 = U(this.f8764o) ? this.f8764o : y();
                    } else if (Q(arrayList)) {
                        h02 = S(this.f8764o) ? this.f8764o : x();
                    }
                }
                h02 = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return h02;
    }

    private static Matrix u(Rect rect, Size size) {
        i.b(rect.width() > 0 && rect.height() > 0, "Cannot compute viewport crop rects zero sized sensor rect.");
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(0.0f, 0.0f, (float) size.getWidth(), (float) size.getHeight()), rectF, Matrix.ScaleToFit.CENTER);
        matrix.invert(matrix);
        return matrix;
    }

    private Map<H0, c1> v(int i10, I i11, Collection<H0> collection, Collection<H0> collection2, Map<H0, c> map) {
        Size size;
        Rect rect;
        boolean z10;
        I i12 = i11;
        ArrayList arrayList = new ArrayList();
        String d10 = i11.d();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        Iterator<H0> it = collection2.iterator();
        while (true) {
            size = null;
            if (!it.hasNext()) {
                break;
            }
            H0 next = it.next();
            C5010a a10 = C5010a.a(this.f8752c.b(i10, d10, next.m(), next.f()), next.m(), next.f(), ((c1) i.g(next.e())).b(), h.i0(next), next.e().d(), next.j().x((Range<Integer>) null));
            arrayList.add(a10);
            hashMap2.put(a10, next);
            hashMap.put(next, next.e());
        }
        int i13 = i10;
        if (!collection.isEmpty()) {
            HashMap hashMap3 = new HashMap();
            HashMap hashMap4 = new HashMap();
            try {
                rect = this.f8750a.d().g();
            } catch (NullPointerException unused) {
                rect = null;
            }
            if (rect != null) {
                size = q.m(rect);
            }
            k kVar = new k(i12, size);
            Iterator<H0> it2 = collection.iterator();
            loop1:
            while (true) {
                z10 = false;
                while (true) {
                    if (!it2.hasNext()) {
                        break loop1;
                    }
                    H0 next2 = it2.next();
                    c cVar = map.get(next2);
                    o1<?> D10 = next2.D(i12, cVar.f8771a, cVar.f8772b);
                    hashMap3.put(D10, next2);
                    hashMap4.put(D10, kVar.m(D10));
                    if (next2.j() instanceof M0) {
                        if (((M0) next2.j()).D() == 2) {
                            z10 = true;
                        }
                    }
                }
            }
            Pair<Map<o1<?>, c1>, Map<C5010a, c1>> a11 = this.f8752c.a(i10, d10, arrayList, hashMap4, z10, O(collection));
            for (Map.Entry entry : hashMap3.entrySet()) {
                hashMap.put((H0) entry.getValue(), (c1) ((Map) a11.first).get(entry.getKey()));
            }
            for (Map.Entry entry2 : ((Map) a11.second).entrySet()) {
                if (hashMap2.containsKey(entry2.getKey())) {
                    hashMap.put((H0) hashMap2.get(entry2.getKey()), (c1) entry2.getValue());
                }
            }
        }
        return hashMap;
    }

    private void w(Collection<H0> collection) {
        if (K()) {
            if (M(collection)) {
                throw new IllegalArgumentException("Extensions are only supported for use with standard dynamic range.");
            } else if (N(collection)) {
                throw new IllegalArgumentException("Extensions are not supported for use with Ultra HDR image capture.");
            }
        }
        synchronized (this.f8761l) {
            try {
                if (!this.f8759j.isEmpty()) {
                    if (N(collection)) {
                        throw new IllegalArgumentException("Ultra HDR image capture does not support for use with CameraEffect.");
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private U x() {
        return new U.b().r("ImageCapture-Extra").f();
    }

    private p0 y() {
        p0 f10 = new p0.a().o("Preview-Extra").f();
        f10.o0(new d());
        return f10;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private S.h z(java.util.Collection<C.H0> r9, boolean r10) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.f8761l
            monitor-enter(r0)
            java.util.Set r6 = r8.I(r9, r10)     // Catch:{ all -> 0x001c }
            int r9 = r6.size()     // Catch:{ all -> 0x001c }
            r10 = 2
            r1 = 0
            if (r9 >= r10) goto L_0x0020
            boolean r9 = r8.K()     // Catch:{ all -> 0x001c }
            if (r9 == 0) goto L_0x001e
            boolean r9 = O(r6)     // Catch:{ all -> 0x001c }
            if (r9 != 0) goto L_0x0020
            goto L_0x001e
        L_0x001c:
            r9 = move-exception
            goto L_0x004f
        L_0x001e:
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
            return r1
        L_0x0020:
            S.h r9 = r8.f8765p     // Catch:{ all -> 0x001c }
            if (r9 == 0) goto L_0x0035
            java.util.Set r9 = r9.k0()     // Catch:{ all -> 0x001c }
            boolean r9 = r9.equals(r6)     // Catch:{ all -> 0x001c }
            if (r9 == 0) goto L_0x0035
            S.h r9 = r8.f8765p     // Catch:{ all -> 0x001c }
            java.util.Objects.requireNonNull(r9)     // Catch:{ all -> 0x001c }
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
            return r9
        L_0x0035:
            boolean r9 = V(r6)     // Catch:{ all -> 0x001c }
            if (r9 != 0) goto L_0x003d
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
            return r1
        L_0x003d:
            S.h r9 = new S.h     // Catch:{ all -> 0x001c }
            androidx.camera.core.impl.J r2 = r8.f8750a     // Catch:{ all -> 0x001c }
            androidx.camera.core.impl.J r3 = r8.f8751b     // Catch:{ all -> 0x001c }
            C.d0 r4 = r8.f8769t     // Catch:{ all -> 0x001c }
            C.d0 r5 = r8.f8770u     // Catch:{ all -> 0x001c }
            androidx.camera.core.impl.p1 r7 = r8.f8753d     // Catch:{ all -> 0x001c }
            r1 = r9
            r1.<init>(r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x001c }
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
            return r9
        L_0x004f:
            monitor-exit(r0)     // Catch:{ all -> 0x001c }
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: J.f.z(java.util.Collection, boolean):S.h");
    }

    public void A() {
        synchronized (this.f8761l) {
            try {
                if (this.f8762m) {
                    this.f8750a.i(new ArrayList(this.f8756g));
                    J j10 = this.f8751b;
                    if (j10 != null) {
                        j10.i(new ArrayList(this.f8756g));
                    }
                    n();
                    this.f8762m = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public b D() {
        return this.f8754e;
    }

    public C4408p G() {
        return this.f8768s;
    }

    public List<H0> J() {
        ArrayList arrayList;
        synchronized (this.f8761l) {
            arrayList = new ArrayList(this.f8755f);
        }
        return arrayList;
    }

    public void Z(Collection<H0> collection) {
        synchronized (this.f8761l) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.f8755f);
            linkedHashSet.removeAll(collection);
            J j10 = this.f8751b;
            boolean z10 = false;
            boolean z11 = j10 != null;
            if (j10 != null) {
                z10 = true;
            }
            f0(linkedHashSet, z11, z10);
        }
    }

    public C4402k a() {
        return this.f8766q;
    }

    public C4408p b() {
        return this.f8767r;
    }

    public void b0(List<C4404l> list) {
        synchronized (this.f8761l) {
            this.f8759j = list;
        }
    }

    public void d0(J0 j02) {
        synchronized (this.f8761l) {
            this.f8758i = j02;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0105, code lost:
        r4 = r11.get(r3);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void f0(java.util.Collection<C.H0> r20, boolean r21, boolean r22) {
        /*
            r19 = this;
            r7 = r19
            r8 = r20
            r9 = r22
            java.lang.Object r10 = r7.f8761l
            monitor-enter(r10)
            r19.w(r20)     // Catch:{ all -> 0x0020 }
            r11 = 1
            if (r21 != 0) goto L_0x0023
            boolean r0 = r19.K()     // Catch:{ all -> 0x0020 }
            if (r0 == 0) goto L_0x0023
            boolean r0 = O(r20)     // Catch:{ all -> 0x0020 }
            if (r0 == 0) goto L_0x0023
            r7.f0(r8, r11, r9)     // Catch:{ all -> 0x0020 }
            monitor-exit(r10)     // Catch:{ all -> 0x0020 }
            return
        L_0x0020:
            r0 = move-exception
            goto L_0x01ee
        L_0x0023:
            S.h r0 = r19.z(r20, r21)     // Catch:{ all -> 0x0020 }
            C.H0 r12 = r7.t(r8, r0)     // Catch:{ all -> 0x0020 }
            java.util.Collection r13 = s(r8, r12, r0)     // Catch:{ all -> 0x0020 }
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x0020 }
            r14.<init>(r13)     // Catch:{ all -> 0x0020 }
            java.util.List<C.H0> r1 = r7.f8756g     // Catch:{ all -> 0x0020 }
            r14.removeAll(r1)     // Catch:{ all -> 0x0020 }
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ all -> 0x0020 }
            r15.<init>(r13)     // Catch:{ all -> 0x0020 }
            java.util.List<C.H0> r1 = r7.f8756g     // Catch:{ all -> 0x0020 }
            r15.retainAll(r1)     // Catch:{ all -> 0x0020 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x0020 }
            java.util.List<C.H0> r1 = r7.f8756g     // Catch:{ all -> 0x0020 }
            r6.<init>(r1)     // Catch:{ all -> 0x0020 }
            r6.removeAll(r13)     // Catch:{ all -> 0x0020 }
            androidx.camera.core.impl.B r1 = r7.f8760k     // Catch:{ all -> 0x0020 }
            androidx.camera.core.impl.p1 r1 = r1.j()     // Catch:{ all -> 0x0020 }
            androidx.camera.core.impl.p1 r2 = r7.f8753d     // Catch:{ all -> 0x0020 }
            java.util.Map r5 = F(r14, r1, r2)     // Catch:{ all -> 0x0020 }
            java.util.Map r16 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0020 }
            int r2 = r19.E()     // Catch:{ IllegalArgumentException -> 0x0096 }
            androidx.camera.core.impl.J r1 = r7.f8750a     // Catch:{ IllegalArgumentException -> 0x0096 }
            androidx.camera.core.impl.I r3 = r1.j()     // Catch:{ IllegalArgumentException -> 0x0096 }
            r1 = r19
            r4 = r14
            r17 = r5
            r5 = r15
            r18 = r6
            r6 = r17
            java.util.Map r6 = r1.v(r2, r3, r4, r5, r6)     // Catch:{ IllegalArgumentException -> 0x0096 }
            androidx.camera.core.impl.J r1 = r7.f8751b     // Catch:{ IllegalArgumentException -> 0x0096 }
            if (r1 == 0) goto L_0x0099
            int r2 = r19.E()     // Catch:{ IllegalArgumentException -> 0x0096 }
            androidx.camera.core.impl.J r1 = r7.f8751b     // Catch:{ IllegalArgumentException -> 0x0096 }
            java.util.Objects.requireNonNull(r1)     // Catch:{ IllegalArgumentException -> 0x0096 }
            androidx.camera.core.impl.J r1 = (androidx.camera.core.impl.J) r1     // Catch:{ IllegalArgumentException -> 0x0096 }
            androidx.camera.core.impl.I r3 = r1.j()     // Catch:{ IllegalArgumentException -> 0x0096 }
            r1 = r19
            r4 = r14
            r5 = r15
            r11 = r6
            r6 = r17
            java.util.Map r16 = r1.v(r2, r3, r4, r5, r6)     // Catch:{ IllegalArgumentException -> 0x0096 }
        L_0x0093:
            r1 = r16
            goto L_0x009b
        L_0x0096:
            r0 = move-exception
            goto L_0x01d6
        L_0x0099:
            r11 = r6
            goto L_0x0093
        L_0x009b:
            r7.g0(r11, r13)     // Catch:{ all -> 0x0020 }
            java.util.List<C.l> r2 = r7.f8759j     // Catch:{ all -> 0x0020 }
            e0(r2, r13, r8)     // Catch:{ all -> 0x0020 }
            java.util.Iterator r2 = r18.iterator()     // Catch:{ all -> 0x0020 }
        L_0x00a7:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0020 }
            if (r3 == 0) goto L_0x00b9
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0020 }
            C.H0 r3 = (C.H0) r3     // Catch:{ all -> 0x0020 }
            androidx.camera.core.impl.J r4 = r7.f8750a     // Catch:{ all -> 0x0020 }
            r3.W(r4)     // Catch:{ all -> 0x0020 }
            goto L_0x00a7
        L_0x00b9:
            androidx.camera.core.impl.J r2 = r7.f8750a     // Catch:{ all -> 0x0020 }
            r3 = r18
            r2.i(r3)     // Catch:{ all -> 0x0020 }
            androidx.camera.core.impl.J r2 = r7.f8751b     // Catch:{ all -> 0x0020 }
            if (r2 == 0) goto L_0x00e9
            java.util.Iterator r2 = r3.iterator()     // Catch:{ all -> 0x0020 }
        L_0x00c8:
            boolean r4 = r2.hasNext()     // Catch:{ all -> 0x0020 }
            if (r4 == 0) goto L_0x00df
            java.lang.Object r4 = r2.next()     // Catch:{ all -> 0x0020 }
            C.H0 r4 = (C.H0) r4     // Catch:{ all -> 0x0020 }
            androidx.camera.core.impl.J r5 = r7.f8751b     // Catch:{ all -> 0x0020 }
            java.util.Objects.requireNonNull(r5)     // Catch:{ all -> 0x0020 }
            androidx.camera.core.impl.J r5 = (androidx.camera.core.impl.J) r5     // Catch:{ all -> 0x0020 }
            r4.W(r5)     // Catch:{ all -> 0x0020 }
            goto L_0x00c8
        L_0x00df:
            androidx.camera.core.impl.J r2 = r7.f8751b     // Catch:{ all -> 0x0020 }
            java.util.Objects.requireNonNull(r2)     // Catch:{ all -> 0x0020 }
            androidx.camera.core.impl.J r2 = (androidx.camera.core.impl.J) r2     // Catch:{ all -> 0x0020 }
            r2.i(r3)     // Catch:{ all -> 0x0020 }
        L_0x00e9:
            boolean r2 = r3.isEmpty()     // Catch:{ all -> 0x0020 }
            if (r2 == 0) goto L_0x0134
            java.util.Iterator r2 = r15.iterator()     // Catch:{ all -> 0x0020 }
        L_0x00f3:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0020 }
            if (r3 == 0) goto L_0x0134
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0020 }
            C.H0 r3 = (C.H0) r3     // Catch:{ all -> 0x0020 }
            boolean r4 = r11.containsKey(r3)     // Catch:{ all -> 0x0020 }
            if (r4 == 0) goto L_0x00f3
            java.lang.Object r4 = r11.get(r3)     // Catch:{ all -> 0x0020 }
            androidx.camera.core.impl.c1 r4 = (androidx.camera.core.impl.c1) r4     // Catch:{ all -> 0x0020 }
            androidx.camera.core.impl.X r5 = r4.d()     // Catch:{ all -> 0x0020 }
            if (r5 == 0) goto L_0x00f3
            androidx.camera.core.impl.X0 r6 = r3.w()     // Catch:{ all -> 0x0020 }
            boolean r4 = L(r4, r6)     // Catch:{ all -> 0x0020 }
            if (r4 == 0) goto L_0x00f3
            r3.Z(r5)     // Catch:{ all -> 0x0020 }
            boolean r4 = r7.f8762m     // Catch:{ all -> 0x0020 }
            if (r4 == 0) goto L_0x00f3
            androidx.camera.core.impl.J r4 = r7.f8750a     // Catch:{ all -> 0x0020 }
            r4.l(r3)     // Catch:{ all -> 0x0020 }
            androidx.camera.core.impl.J r4 = r7.f8751b     // Catch:{ all -> 0x0020 }
            if (r4 == 0) goto L_0x00f3
            java.util.Objects.requireNonNull(r4)     // Catch:{ all -> 0x0020 }
            androidx.camera.core.impl.J r4 = (androidx.camera.core.impl.J) r4     // Catch:{ all -> 0x0020 }
            r4.l(r3)     // Catch:{ all -> 0x0020 }
            goto L_0x00f3
        L_0x0134:
            java.util.Iterator r2 = r14.iterator()     // Catch:{ all -> 0x0020 }
        L_0x0138:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0020 }
            if (r3 == 0) goto L_0x0193
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0020 }
            C.H0 r3 = (C.H0) r3     // Catch:{ all -> 0x0020 }
            r4 = r17
            java.lang.Object r5 = r4.get(r3)     // Catch:{ all -> 0x0020 }
            J.f$c r5 = (J.f.c) r5     // Catch:{ all -> 0x0020 }
            java.util.Objects.requireNonNull(r5)     // Catch:{ all -> 0x0020 }
            androidx.camera.core.impl.J r6 = r7.f8751b     // Catch:{ all -> 0x0020 }
            if (r6 == 0) goto L_0x0177
            androidx.camera.core.impl.J r9 = r7.f8750a     // Catch:{ all -> 0x0020 }
            java.util.Objects.requireNonNull(r6)     // Catch:{ all -> 0x0020 }
            androidx.camera.core.impl.J r6 = (androidx.camera.core.impl.J) r6     // Catch:{ all -> 0x0020 }
            androidx.camera.core.impl.o1<?> r15 = r5.f8771a     // Catch:{ all -> 0x0020 }
            androidx.camera.core.impl.o1<?> r5 = r5.f8772b     // Catch:{ all -> 0x0020 }
            r3.b(r9, r6, r15, r5)     // Catch:{ all -> 0x0020 }
            java.lang.Object r5 = r11.get(r3)     // Catch:{ all -> 0x0020 }
            androidx.camera.core.impl.c1 r5 = (androidx.camera.core.impl.c1) r5     // Catch:{ all -> 0x0020 }
            java.lang.Object r5 = H2.i.g(r5)     // Catch:{ all -> 0x0020 }
            androidx.camera.core.impl.c1 r5 = (androidx.camera.core.impl.c1) r5     // Catch:{ all -> 0x0020 }
            java.lang.Object r6 = r1.get(r3)     // Catch:{ all -> 0x0020 }
            androidx.camera.core.impl.c1 r6 = (androidx.camera.core.impl.c1) r6     // Catch:{ all -> 0x0020 }
            r3.Y(r5, r6)     // Catch:{ all -> 0x0020 }
            goto L_0x0190
        L_0x0177:
            androidx.camera.core.impl.J r6 = r7.f8750a     // Catch:{ all -> 0x0020 }
            androidx.camera.core.impl.o1<?> r9 = r5.f8771a     // Catch:{ all -> 0x0020 }
            androidx.camera.core.impl.o1<?> r5 = r5.f8772b     // Catch:{ all -> 0x0020 }
            r15 = 0
            r3.b(r6, r15, r9, r5)     // Catch:{ all -> 0x0020 }
            java.lang.Object r5 = r11.get(r3)     // Catch:{ all -> 0x0020 }
            androidx.camera.core.impl.c1 r5 = (androidx.camera.core.impl.c1) r5     // Catch:{ all -> 0x0020 }
            java.lang.Object r5 = H2.i.g(r5)     // Catch:{ all -> 0x0020 }
            androidx.camera.core.impl.c1 r5 = (androidx.camera.core.impl.c1) r5     // Catch:{ all -> 0x0020 }
            r3.Y(r5, r15)     // Catch:{ all -> 0x0020 }
        L_0x0190:
            r17 = r4
            goto L_0x0138
        L_0x0193:
            boolean r1 = r7.f8762m     // Catch:{ all -> 0x0020 }
            if (r1 == 0) goto L_0x01a8
            androidx.camera.core.impl.J r1 = r7.f8750a     // Catch:{ all -> 0x0020 }
            r1.h(r14)     // Catch:{ all -> 0x0020 }
            androidx.camera.core.impl.J r1 = r7.f8751b     // Catch:{ all -> 0x0020 }
            if (r1 == 0) goto L_0x01a8
            java.util.Objects.requireNonNull(r1)     // Catch:{ all -> 0x0020 }
            androidx.camera.core.impl.J r1 = (androidx.camera.core.impl.J) r1     // Catch:{ all -> 0x0020 }
            r1.h(r14)     // Catch:{ all -> 0x0020 }
        L_0x01a8:
            java.util.Iterator r1 = r14.iterator()     // Catch:{ all -> 0x0020 }
        L_0x01ac:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x0020 }
            if (r2 == 0) goto L_0x01bc
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x0020 }
            C.H0 r2 = (C.H0) r2     // Catch:{ all -> 0x0020 }
            r2.H()     // Catch:{ all -> 0x0020 }
            goto L_0x01ac
        L_0x01bc:
            java.util.List<C.H0> r1 = r7.f8755f     // Catch:{ all -> 0x0020 }
            r1.clear()     // Catch:{ all -> 0x0020 }
            java.util.List<C.H0> r1 = r7.f8755f     // Catch:{ all -> 0x0020 }
            r1.addAll(r8)     // Catch:{ all -> 0x0020 }
            java.util.List<C.H0> r1 = r7.f8756g     // Catch:{ all -> 0x0020 }
            r1.clear()     // Catch:{ all -> 0x0020 }
            java.util.List<C.H0> r1 = r7.f8756g     // Catch:{ all -> 0x0020 }
            r1.addAll(r13)     // Catch:{ all -> 0x0020 }
            r7.f8764o = r12     // Catch:{ all -> 0x0020 }
            r7.f8765p = r0     // Catch:{ all -> 0x0020 }
            monitor-exit(r10)     // Catch:{ all -> 0x0020 }
            return
        L_0x01d6:
            if (r21 != 0) goto L_0x01ed
            boolean r1 = r19.K()     // Catch:{ all -> 0x0020 }
            if (r1 != 0) goto L_0x01ed
            D.a r1 = r7.f8757h     // Catch:{ all -> 0x0020 }
            int r1 = r1.c()     // Catch:{ all -> 0x0020 }
            r2 = 2
            if (r1 == r2) goto L_0x01ed
            r1 = 1
            r7.f0(r8, r1, r9)     // Catch:{ all -> 0x0020 }
            monitor-exit(r10)     // Catch:{ all -> 0x0020 }
            return
        L_0x01ed:
            throw r0     // Catch:{ all -> 0x0020 }
        L_0x01ee:
            monitor-exit(r10)     // Catch:{ all -> 0x0020 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: J.f.f0(java.util.Collection, boolean, boolean):void");
    }

    public void g(boolean z10) {
        this.f8750a.g(z10);
    }

    public void k(Collection<H0> collection) {
        synchronized (this.f8761l) {
            try {
                this.f8750a.o(this.f8760k);
                J j10 = this.f8751b;
                if (j10 != null) {
                    j10.o(this.f8760k);
                }
                LinkedHashSet linkedHashSet = new LinkedHashSet(this.f8755f);
                linkedHashSet.addAll(collection);
                J j11 = this.f8751b;
                boolean z10 = false;
                boolean z11 = j11 != null;
                if (j11 != null) {
                    z10 = true;
                }
                f0(linkedHashSet, z11, z10);
            } catch (IllegalArgumentException e10) {
                throw new a(e10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void l() {
        synchronized (this.f8761l) {
            try {
                if (!this.f8762m) {
                    if (!this.f8756g.isEmpty()) {
                        this.f8750a.o(this.f8760k);
                        J j10 = this.f8751b;
                        if (j10 != null) {
                            j10.o(this.f8760k);
                        }
                    }
                    this.f8750a.h(this.f8756g);
                    J j11 = this.f8751b;
                    if (j11 != null) {
                        j11.h(this.f8756g);
                    }
                    a0();
                    for (H0 H10 : this.f8756g) {
                        H10.H();
                    }
                    this.f8762m = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

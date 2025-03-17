package E7;

import C7.i;
import C7.l;
import C7.m;
import E7.f;
import E7.i;
import L7.n;
import Z7.a;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

class h<R> implements f.a, Runnable, Comparable<h<?>>, a.f {

    /* renamed from: A  reason: collision with root package name */
    private C7.a f35059A;

    /* renamed from: B  reason: collision with root package name */
    private com.bumptech.glide.load.data.d<?> f35060B;

    /* renamed from: C  reason: collision with root package name */
    private volatile f f35061C;

    /* renamed from: D  reason: collision with root package name */
    private volatile boolean f35062D;

    /* renamed from: E  reason: collision with root package name */
    private volatile boolean f35063E;

    /* renamed from: F  reason: collision with root package name */
    private boolean f35064F;

    /* renamed from: a  reason: collision with root package name */
    private final g<R> f35065a = new g<>();

    /* renamed from: b  reason: collision with root package name */
    private final List<Throwable> f35066b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    private final Z7.c f35067c = Z7.c.a();

    /* renamed from: d  reason: collision with root package name */
    private final e f35068d;

    /* renamed from: e  reason: collision with root package name */
    private final H2.f<h<?>> f35069e;

    /* renamed from: f  reason: collision with root package name */
    private final d<?> f35070f = new d<>();

    /* renamed from: g  reason: collision with root package name */
    private final f f35071g = new f();

    /* renamed from: h  reason: collision with root package name */
    private com.bumptech.glide.d f35072h;

    /* renamed from: i  reason: collision with root package name */
    private C7.f f35073i;

    /* renamed from: j  reason: collision with root package name */
    private com.bumptech.glide.g f35074j;

    /* renamed from: k  reason: collision with root package name */
    private n f35075k;

    /* renamed from: l  reason: collision with root package name */
    private int f35076l;

    /* renamed from: m  reason: collision with root package name */
    private int f35077m;

    /* renamed from: n  reason: collision with root package name */
    private j f35078n;

    /* renamed from: o  reason: collision with root package name */
    private i f35079o;

    /* renamed from: p  reason: collision with root package name */
    private b<R> f35080p;

    /* renamed from: q  reason: collision with root package name */
    private int f35081q;

    /* renamed from: r  reason: collision with root package name */
    private C0562h f35082r;

    /* renamed from: s  reason: collision with root package name */
    private g f35083s;

    /* renamed from: t  reason: collision with root package name */
    private long f35084t;

    /* renamed from: u  reason: collision with root package name */
    private boolean f35085u;

    /* renamed from: v  reason: collision with root package name */
    private Object f35086v;

    /* renamed from: w  reason: collision with root package name */
    private Thread f35087w;

    /* renamed from: x  reason: collision with root package name */
    private C7.f f35088x;

    /* renamed from: y  reason: collision with root package name */
    private C7.f f35089y;

    /* renamed from: z  reason: collision with root package name */
    private Object f35090z;

    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f35091a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f35092b;

        /* renamed from: c  reason: collision with root package name */
        static final /* synthetic */ int[] f35093c;

        /* JADX WARNING: Can't wrap try/catch for region: R(25:0|1|2|3|(2:5|6)|7|9|10|11|12|13|15|16|17|18|19|20|21|23|24|25|26|27|28|30) */
        /* JADX WARNING: Code restructure failed: missing block: B:31:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x002e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0043 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x006a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x0074 */
        static {
            /*
                C7.c[] r0 = C7.c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f35093c = r0
                r1 = 1
                C7.c r2 = C7.c.SOURCE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                r0 = 2
                int[] r2 = f35093c     // Catch:{ NoSuchFieldError -> 0x001d }
                C7.c r3 = C7.c.TRANSFORMED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                E7.h$h[] r2 = E7.h.C0562h.values()
                int r2 = r2.length
                int[] r2 = new int[r2]
                f35092b = r2
                E7.h$h r3 = E7.h.C0562h.RESOURCE_CACHE     // Catch:{ NoSuchFieldError -> 0x002e }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x002e }
                r2[r3] = r1     // Catch:{ NoSuchFieldError -> 0x002e }
            L_0x002e:
                int[] r2 = f35092b     // Catch:{ NoSuchFieldError -> 0x0038 }
                E7.h$h r3 = E7.h.C0562h.DATA_CACHE     // Catch:{ NoSuchFieldError -> 0x0038 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0038 }
                r2[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0038 }
            L_0x0038:
                r2 = 3
                int[] r3 = f35092b     // Catch:{ NoSuchFieldError -> 0x0043 }
                E7.h$h r4 = E7.h.C0562h.SOURCE     // Catch:{ NoSuchFieldError -> 0x0043 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0043 }
                r3[r4] = r2     // Catch:{ NoSuchFieldError -> 0x0043 }
            L_0x0043:
                int[] r3 = f35092b     // Catch:{ NoSuchFieldError -> 0x004e }
                E7.h$h r4 = E7.h.C0562h.FINISHED     // Catch:{ NoSuchFieldError -> 0x004e }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r5 = 4
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                int[] r3 = f35092b     // Catch:{ NoSuchFieldError -> 0x0059 }
                E7.h$h r4 = E7.h.C0562h.INITIALIZE     // Catch:{ NoSuchFieldError -> 0x0059 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0059 }
                r5 = 5
                r3[r4] = r5     // Catch:{ NoSuchFieldError -> 0x0059 }
            L_0x0059:
                E7.h$g[] r3 = E7.h.g.values()
                int r3 = r3.length
                int[] r3 = new int[r3]
                f35091a = r3
                E7.h$g r4 = E7.h.g.INITIALIZE     // Catch:{ NoSuchFieldError -> 0x006a }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x006a }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x006a }
            L_0x006a:
                int[] r1 = f35091a     // Catch:{ NoSuchFieldError -> 0x0074 }
                E7.h$g r3 = E7.h.g.SWITCH_TO_SOURCE_SERVICE     // Catch:{ NoSuchFieldError -> 0x0074 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0074 }
                r1[r3] = r0     // Catch:{ NoSuchFieldError -> 0x0074 }
            L_0x0074:
                int[] r0 = f35091a     // Catch:{ NoSuchFieldError -> 0x007e }
                E7.h$g r1 = E7.h.g.DECODE_DATA     // Catch:{ NoSuchFieldError -> 0x007e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x007e }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x007e }
            L_0x007e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: E7.h.a.<clinit>():void");
        }
    }

    interface b<R> {
        void b(q qVar);

        void d(v<R> vVar, C7.a aVar, boolean z10);

        void e(h<?> hVar);
    }

    private final class c<Z> implements i.a<Z> {

        /* renamed from: a  reason: collision with root package name */
        private final C7.a f35094a;

        c(C7.a aVar) {
            this.f35094a = aVar;
        }

        public v<Z> a(v<Z> vVar) {
            return h.this.Q(this.f35094a, vVar);
        }
    }

    private static class d<Z> {

        /* renamed from: a  reason: collision with root package name */
        private C7.f f35096a;

        /* renamed from: b  reason: collision with root package name */
        private l<Z> f35097b;

        /* renamed from: c  reason: collision with root package name */
        private u<Z> f35098c;

        d() {
        }

        /* access modifiers changed from: package-private */
        public void a() {
            this.f35096a = null;
            this.f35097b = null;
            this.f35098c = null;
        }

        /* access modifiers changed from: package-private */
        public void b(e eVar, C7.i iVar) {
            Z7.b.a("DecodeJob.encode");
            try {
                eVar.a().b(this.f35096a, new e(this.f35097b, this.f35098c, iVar));
            } finally {
                this.f35098c.g();
                Z7.b.e();
            }
        }

        /* access modifiers changed from: package-private */
        public boolean c() {
            return this.f35098c != null;
        }

        /* access modifiers changed from: package-private */
        public <X> void d(C7.f fVar, l<X> lVar, u<X> uVar) {
            this.f35096a = fVar;
            this.f35097b = lVar;
            this.f35098c = uVar;
        }
    }

    interface e {
        G7.a a();
    }

    private static class f {

        /* renamed from: a  reason: collision with root package name */
        private boolean f35099a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f35100b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f35101c;

        f() {
        }

        private boolean a(boolean z10) {
            return (this.f35101c || z10 || this.f35100b) && this.f35099a;
        }

        /* access modifiers changed from: package-private */
        public synchronized boolean b() {
            this.f35100b = true;
            return a(false);
        }

        /* access modifiers changed from: package-private */
        public synchronized boolean c() {
            this.f35101c = true;
            return a(false);
        }

        /* access modifiers changed from: package-private */
        public synchronized boolean d(boolean z10) {
            this.f35099a = true;
            return a(z10);
        }

        /* access modifiers changed from: package-private */
        public synchronized void e() {
            this.f35100b = false;
            this.f35099a = false;
            this.f35101c = false;
        }
    }

    private enum g {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* renamed from: E7.h$h  reason: collision with other inner class name */
    private enum C0562h {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    h(e eVar, H2.f<h<?>> fVar) {
        this.f35068d = eVar;
        this.f35069e = fVar;
    }

    private <Data> v<R> B(com.bumptech.glide.load.data.d<?> dVar, Data data, C7.a aVar) {
        if (data == null) {
            dVar.b();
            return null;
        }
        try {
            long b10 = Y7.g.b();
            v<R> C10 = C(data, aVar);
            if (Log.isLoggable("DecodeJob", 2)) {
                J("Decoded result " + C10, b10);
            }
            return C10;
        } finally {
            dVar.b();
        }
    }

    private <Data> v<R> C(Data data, C7.a aVar) {
        return V(data, aVar, this.f35065a.h(data.getClass()));
    }

    private void D() {
        v<R> vVar;
        if (Log.isLoggable("DecodeJob", 2)) {
            long j10 = this.f35084t;
            K("Retrieved data", j10, "data: " + this.f35090z + ", cache key: " + this.f35088x + ", fetcher: " + this.f35060B);
        }
        try {
            vVar = B(this.f35060B, this.f35090z, this.f35059A);
        } catch (q e10) {
            e10.i(this.f35089y, this.f35059A);
            this.f35066b.add(e10);
            vVar = null;
        }
        if (vVar != null) {
            M(vVar, this.f35059A, this.f35064F);
        } else {
            U();
        }
    }

    private f E() {
        int i10 = a.f35092b[this.f35082r.ordinal()];
        if (i10 == 1) {
            return new w(this.f35065a, this);
        }
        if (i10 == 2) {
            return new c(this.f35065a, this);
        }
        if (i10 == 3) {
            return new z(this.f35065a, this);
        }
        if (i10 == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.f35082r);
    }

    private C0562h F(C0562h hVar) {
        int i10 = a.f35092b[hVar.ordinal()];
        if (i10 == 1) {
            return this.f35078n.a() ? C0562h.DATA_CACHE : F(C0562h.DATA_CACHE);
        }
        if (i10 == 2) {
            return this.f35085u ? C0562h.FINISHED : C0562h.SOURCE;
        }
        if (i10 == 3 || i10 == 4) {
            return C0562h.FINISHED;
        }
        if (i10 == 5) {
            return this.f35078n.b() ? C0562h.RESOURCE_CACHE : F(C0562h.RESOURCE_CACHE);
        }
        throw new IllegalArgumentException("Unrecognized stage: " + hVar);
    }

    private C7.i G(C7.a aVar) {
        C7.i iVar = this.f35079o;
        boolean z10 = aVar == C7.a.RESOURCE_DISK_CACHE || this.f35065a.x();
        C7.h hVar = n.f38409j;
        Boolean bool = (Boolean) iVar.c(hVar);
        if (bool != null && (!bool.booleanValue() || z10)) {
            return iVar;
        }
        C7.i iVar2 = new C7.i();
        iVar2.d(this.f35079o);
        iVar2.f(hVar, Boolean.valueOf(z10));
        return iVar2;
    }

    private int H() {
        return this.f35074j.ordinal();
    }

    private void J(String str, long j10) {
        K(str, j10, (String) null);
    }

    private void K(String str, long j10, String str2) {
        String str3;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" in ");
        sb2.append(Y7.g.a(j10));
        sb2.append(", load key: ");
        sb2.append(this.f35075k);
        if (str2 != null) {
            str3 = ", " + str2;
        } else {
            str3 = "";
        }
        sb2.append(str3);
        sb2.append(", thread: ");
        sb2.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sb2.toString());
    }

    private void L(v<R> vVar, C7.a aVar, boolean z10) {
        X();
        this.f35080p.d(vVar, aVar, z10);
    }

    private void M(v<R> vVar, C7.a aVar, boolean z10) {
        u<R> uVar;
        u<R> uVar2;
        Z7.b.a("DecodeJob.notifyEncodeAndRelease");
        try {
            if (vVar instanceof r) {
                ((r) vVar).b();
            }
            if (this.f35070f.c()) {
                u<R> e10 = u.e(vVar);
                uVar2 = e10;
                uVar = e10;
            } else {
                uVar2 = null;
                uVar = vVar;
            }
            L(uVar, aVar, z10);
            this.f35082r = C0562h.ENCODE;
            if (this.f35070f.c()) {
                this.f35070f.b(this.f35068d, this.f35079o);
            }
            if (uVar2 != null) {
                uVar2.g();
            }
            O();
            Z7.b.e();
        } catch (Throwable th2) {
            Z7.b.e();
            throw th2;
        }
    }

    private void N() {
        X();
        this.f35080p.b(new q("Failed to load resource", (List<Throwable>) new ArrayList(this.f35066b)));
        P();
    }

    private void O() {
        if (this.f35071g.b()) {
            S();
        }
    }

    private void P() {
        if (this.f35071g.c()) {
            S();
        }
    }

    private void S() {
        this.f35071g.e();
        this.f35070f.a();
        this.f35065a.a();
        this.f35062D = false;
        this.f35072h = null;
        this.f35073i = null;
        this.f35079o = null;
        this.f35074j = null;
        this.f35075k = null;
        this.f35080p = null;
        this.f35082r = null;
        this.f35061C = null;
        this.f35087w = null;
        this.f35088x = null;
        this.f35090z = null;
        this.f35059A = null;
        this.f35060B = null;
        this.f35084t = 0;
        this.f35063E = false;
        this.f35086v = null;
        this.f35066b.clear();
        this.f35069e.a(this);
    }

    private void T(g gVar) {
        this.f35083s = gVar;
        this.f35080p.e(this);
    }

    private void U() {
        this.f35087w = Thread.currentThread();
        this.f35084t = Y7.g.b();
        boolean z10 = false;
        while (!this.f35063E && this.f35061C != null && !(z10 = this.f35061C.a())) {
            this.f35082r = F(this.f35082r);
            this.f35061C = E();
            if (this.f35082r == C0562h.SOURCE) {
                T(g.SWITCH_TO_SOURCE_SERVICE);
                return;
            }
        }
        if ((this.f35082r == C0562h.FINISHED || this.f35063E) && !z10) {
            N();
        }
    }

    private <Data, ResourceType> v<R> V(Data data, C7.a aVar, t<Data, ResourceType, R> tVar) {
        C7.i G10 = G(aVar);
        com.bumptech.glide.load.data.e l10 = this.f35072h.i().l(data);
        try {
            return tVar.a(l10, G10, this.f35076l, this.f35077m, new c(aVar));
        } finally {
            l10.b();
        }
    }

    private void W() {
        int i10 = a.f35091a[this.f35083s.ordinal()];
        if (i10 == 1) {
            this.f35082r = F(C0562h.INITIALIZE);
            this.f35061C = E();
            U();
        } else if (i10 == 2) {
            U();
        } else if (i10 == 3) {
            D();
        } else {
            throw new IllegalStateException("Unrecognized run reason: " + this.f35083s);
        }
    }

    private void X() {
        Throwable th2;
        this.f35067c.c();
        if (this.f35062D) {
            if (this.f35066b.isEmpty()) {
                th2 = null;
            } else {
                List<Throwable> list = this.f35066b;
                th2 = list.get(list.size() - 1);
            }
            throw new IllegalStateException("Already notified", th2);
        }
        this.f35062D = true;
    }

    /* access modifiers changed from: package-private */
    public h<R> I(com.bumptech.glide.d dVar, Object obj, n nVar, C7.f fVar, int i10, int i11, Class<?> cls, Class<R> cls2, com.bumptech.glide.g gVar, j jVar, Map<Class<?>, m<?>> map, boolean z10, boolean z11, boolean z12, C7.i iVar, b<R> bVar, int i12) {
        this.f35065a.v(dVar, obj, fVar, i10, i11, jVar, cls, cls2, gVar, iVar, map, z10, z11, this.f35068d);
        this.f35072h = dVar;
        this.f35073i = fVar;
        this.f35074j = gVar;
        this.f35075k = nVar;
        this.f35076l = i10;
        this.f35077m = i11;
        this.f35078n = jVar;
        this.f35085u = z12;
        this.f35079o = iVar;
        this.f35080p = bVar;
        this.f35081q = i12;
        this.f35083s = g.INITIALIZE;
        this.f35086v = obj;
        return this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v5, resolved type: E7.x} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v6, resolved type: E7.d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v8, resolved type: E7.x} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: E7.x} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <Z> E7.v<Z> Q(C7.a r12, E7.v<Z> r13) {
        /*
            r11 = this;
            java.lang.Object r0 = r13.get()
            java.lang.Class r8 = r0.getClass()
            C7.a r0 = C7.a.RESOURCE_DISK_CACHE
            r1 = 0
            if (r12 == r0) goto L_0x0020
            E7.g<R> r0 = r11.f35065a
            C7.m r0 = r0.s(r8)
            com.bumptech.glide.d r2 = r11.f35072h
            int r3 = r11.f35076l
            int r4 = r11.f35077m
            E7.v r2 = r0.a(r2, r13, r3, r4)
            r7 = r0
            r0 = r2
            goto L_0x0022
        L_0x0020:
            r0 = r13
            r7 = r1
        L_0x0022:
            boolean r2 = r13.equals(r0)
            if (r2 != 0) goto L_0x002b
            r13.c()
        L_0x002b:
            E7.g<R> r13 = r11.f35065a
            boolean r13 = r13.w(r0)
            if (r13 == 0) goto L_0x0041
            E7.g<R> r13 = r11.f35065a
            C7.l r1 = r13.n(r0)
            C7.i r13 = r11.f35079o
            C7.c r13 = r1.a(r13)
        L_0x003f:
            r10 = r1
            goto L_0x0044
        L_0x0041:
            C7.c r13 = C7.c.NONE
            goto L_0x003f
        L_0x0044:
            E7.g<R> r1 = r11.f35065a
            C7.f r2 = r11.f35088x
            boolean r1 = r1.y(r2)
            r2 = 1
            r1 = r1 ^ r2
            E7.j r3 = r11.f35078n
            boolean r12 = r3.d(r1, r12, r13)
            if (r12 == 0) goto L_0x00b4
            if (r10 == 0) goto L_0x00a6
            int[] r12 = E7.h.a.f35093c
            int r1 = r13.ordinal()
            r12 = r12[r1]
            if (r12 == r2) goto L_0x0093
            r1 = 2
            if (r12 != r1) goto L_0x007c
            E7.x r12 = new E7.x
            E7.g<R> r13 = r11.f35065a
            F7.b r2 = r13.b()
            C7.f r3 = r11.f35088x
            C7.f r4 = r11.f35073i
            int r5 = r11.f35076l
            int r6 = r11.f35077m
            C7.i r9 = r11.f35079o
            r1 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            goto L_0x009c
        L_0x007c:
            java.lang.IllegalArgumentException r12 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Unknown strategy: "
            r0.append(r1)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r12.<init>(r13)
            throw r12
        L_0x0093:
            E7.d r12 = new E7.d
            C7.f r13 = r11.f35088x
            C7.f r1 = r11.f35073i
            r12.<init>(r13, r1)
        L_0x009c:
            E7.u r0 = E7.u.e(r0)
            E7.h$d<?> r13 = r11.f35070f
            r13.d(r12, r10, r0)
            goto L_0x00b4
        L_0x00a6:
            com.bumptech.glide.i$d r12 = new com.bumptech.glide.i$d
            java.lang.Object r13 = r0.get()
            java.lang.Class r13 = r13.getClass()
            r12.<init>(r13)
            throw r12
        L_0x00b4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: E7.h.Q(C7.a, E7.v):E7.v");
    }

    /* access modifiers changed from: package-private */
    public void R(boolean z10) {
        if (this.f35071g.d(z10)) {
            S();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean Y() {
        C0562h F10 = F(C0562h.INITIALIZE);
        return F10 == C0562h.RESOURCE_CACHE || F10 == C0562h.DATA_CACHE;
    }

    public void a() {
        this.f35063E = true;
        f fVar = this.f35061C;
        if (fVar != null) {
            fVar.cancel();
        }
    }

    public void b(C7.f fVar, Object obj, com.bumptech.glide.load.data.d<?> dVar, C7.a aVar, C7.f fVar2) {
        this.f35088x = fVar;
        this.f35090z = obj;
        this.f35060B = dVar;
        this.f35059A = aVar;
        this.f35089y = fVar2;
        boolean z10 = false;
        if (fVar != this.f35065a.c().get(0)) {
            z10 = true;
        }
        this.f35064F = z10;
        if (Thread.currentThread() != this.f35087w) {
            T(g.DECODE_DATA);
            return;
        }
        Z7.b.a("DecodeJob.decodeFromRetrievedData");
        try {
            D();
        } finally {
            Z7.b.e();
        }
    }

    public Z7.c j() {
        return this.f35067c;
    }

    public void m() {
        T(g.SWITCH_TO_SOURCE_SERVICE);
    }

    public void n(C7.f fVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar, C7.a aVar) {
        dVar.b();
        q qVar = new q("Fetching data failed", (Throwable) exc);
        qVar.j(fVar, aVar, dVar.a());
        this.f35066b.add(qVar);
        if (Thread.currentThread() != this.f35087w) {
            T(g.SWITCH_TO_SOURCE_SERVICE);
        } else {
            U();
        }
    }

    public void run() {
        Z7.b.c("DecodeJob#run(reason=%s, model=%s)", this.f35083s, this.f35086v);
        com.bumptech.glide.load.data.d<?> dVar = this.f35060B;
        try {
            if (this.f35063E) {
                N();
                if (dVar != null) {
                    dVar.b();
                }
                Z7.b.e();
                return;
            }
            W();
            if (dVar != null) {
                dVar.b();
            }
            Z7.b.e();
        } catch (b e10) {
            throw e10;
        } catch (Throwable th2) {
            if (dVar != null) {
                dVar.b();
            }
            Z7.b.e();
            throw th2;
        }
    }

    /* renamed from: v */
    public int compareTo(h<?> hVar) {
        int H10 = H() - hVar.H();
        return H10 == 0 ? this.f35081q - hVar.f35081q : H10;
    }
}

package E7;

import C7.i;
import C7.m;
import E7.h;
import E7.p;
import G7.a;
import G7.h;
import H2.f;
import Z7.a;
import android.util.Log;
import com.bumptech.glide.g;
import java.util.Map;
import java.util.concurrent.Executor;

public class k implements m, h.a, p.a {

    /* renamed from: i  reason: collision with root package name */
    private static final boolean f35112i = Log.isLoggable("Engine", 2);

    /* renamed from: a  reason: collision with root package name */
    private final s f35113a;

    /* renamed from: b  reason: collision with root package name */
    private final o f35114b;

    /* renamed from: c  reason: collision with root package name */
    private final h f35115c;

    /* renamed from: d  reason: collision with root package name */
    private final b f35116d;

    /* renamed from: e  reason: collision with root package name */
    private final y f35117e;

    /* renamed from: f  reason: collision with root package name */
    private final c f35118f;

    /* renamed from: g  reason: collision with root package name */
    private final a f35119g;

    /* renamed from: h  reason: collision with root package name */
    private final a f35120h;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        final h.e f35121a;

        /* renamed from: b  reason: collision with root package name */
        final f<h<?>> f35122b = Z7.a.d(150, new C0563a());

        /* renamed from: c  reason: collision with root package name */
        private int f35123c;

        /* renamed from: E7.k$a$a  reason: collision with other inner class name */
        class C0563a implements a.d<h<?>> {
            C0563a() {
            }

            /* renamed from: b */
            public h<?> a() {
                a aVar = a.this;
                return new h<>(aVar.f35121a, aVar.f35122b);
            }
        }

        a(h.e eVar) {
            this.f35121a = eVar;
        }

        /* access modifiers changed from: package-private */
        public <R> h<R> a(com.bumptech.glide.d dVar, Object obj, n nVar, C7.f fVar, int i10, int i11, Class<?> cls, Class<R> cls2, g gVar, j jVar, Map<Class<?>, m<?>> map, boolean z10, boolean z11, boolean z12, i iVar, h.b<R> bVar) {
            h hVar = (h) Y7.k.d(this.f35122b.b());
            int i12 = this.f35123c;
            int i13 = i12;
            this.f35123c = i12 + 1;
            return hVar.I(dVar, obj, nVar, fVar, i10, i11, cls, cls2, gVar, jVar, map, z10, z11, z12, iVar, bVar, i13);
        }
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        final H7.a f35125a;

        /* renamed from: b  reason: collision with root package name */
        final H7.a f35126b;

        /* renamed from: c  reason: collision with root package name */
        final H7.a f35127c;

        /* renamed from: d  reason: collision with root package name */
        final H7.a f35128d;

        /* renamed from: e  reason: collision with root package name */
        final m f35129e;

        /* renamed from: f  reason: collision with root package name */
        final p.a f35130f;

        /* renamed from: g  reason: collision with root package name */
        final f<l<?>> f35131g = Z7.a.d(150, new a());

        class a implements a.d<l<?>> {
            a() {
            }

            /* renamed from: b */
            public l<?> a() {
                b bVar = b.this;
                return new l(bVar.f35125a, bVar.f35126b, bVar.f35127c, bVar.f35128d, bVar.f35129e, bVar.f35130f, bVar.f35131g);
            }
        }

        b(H7.a aVar, H7.a aVar2, H7.a aVar3, H7.a aVar4, m mVar, p.a aVar5) {
            this.f35125a = aVar;
            this.f35126b = aVar2;
            this.f35127c = aVar3;
            this.f35128d = aVar4;
            this.f35129e = mVar;
            this.f35130f = aVar5;
        }

        /* access modifiers changed from: package-private */
        public <R> l<R> a(C7.f fVar, boolean z10, boolean z11, boolean z12, boolean z13) {
            return ((l) Y7.k.d(this.f35131g.b())).l(fVar, z10, z11, z12, z13);
        }
    }

    private static class c implements h.e {

        /* renamed from: a  reason: collision with root package name */
        private final a.C0573a f35133a;

        /* renamed from: b  reason: collision with root package name */
        private volatile G7.a f35134b;

        c(a.C0573a aVar) {
            this.f35133a = aVar;
        }

        public G7.a a() {
            if (this.f35134b == null) {
                synchronized (this) {
                    try {
                        if (this.f35134b == null) {
                            this.f35134b = this.f35133a.g();
                        }
                        if (this.f35134b == null) {
                            this.f35134b = new G7.b();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return this.f35134b;
        }
    }

    public class d {

        /* renamed from: a  reason: collision with root package name */
        private final l<?> f35135a;

        /* renamed from: b  reason: collision with root package name */
        private final U7.h f35136b;

        d(U7.h hVar, l<?> lVar) {
            this.f35136b = hVar;
            this.f35135a = lVar;
        }

        public void a() {
            synchronized (k.this) {
                this.f35135a.r(this.f35136b);
            }
        }
    }

    public k(G7.h hVar, a.C0573a aVar, H7.a aVar2, H7.a aVar3, H7.a aVar4, H7.a aVar5, boolean z10) {
        this(hVar, aVar, aVar2, aVar3, aVar4, aVar5, (s) null, (o) null, (a) null, (b) null, (a) null, (y) null, z10);
    }

    private p<?> e(C7.f fVar) {
        v<?> c10 = this.f35115c.c(fVar);
        if (c10 == null) {
            return null;
        }
        return c10 instanceof p ? (p) c10 : new p<>(c10, true, true, fVar, this);
    }

    private p<?> g(C7.f fVar) {
        p<?> e10 = this.f35120h.e(fVar);
        if (e10 != null) {
            e10.b();
        }
        return e10;
    }

    private p<?> h(C7.f fVar) {
        p<?> e10 = e(fVar);
        if (e10 != null) {
            e10.b();
            this.f35120h.a(fVar, e10);
        }
        return e10;
    }

    private p<?> i(n nVar, boolean z10, long j10) {
        if (!z10) {
            return null;
        }
        p<?> g10 = g(nVar);
        if (g10 != null) {
            if (f35112i) {
                j("Loaded resource from active resources", j10, nVar);
            }
            return g10;
        }
        p<?> h10 = h(nVar);
        if (h10 == null) {
            return null;
        }
        if (f35112i) {
            j("Loaded resource from cache", j10, nVar);
        }
        return h10;
    }

    private static void j(String str, long j10, C7.f fVar) {
        Log.v("Engine", str + " in " + Y7.g.a(j10) + "ms, key: " + fVar);
    }

    private <R> d l(com.bumptech.glide.d dVar, Object obj, C7.f fVar, int i10, int i11, Class<?> cls, Class<R> cls2, g gVar, j jVar, Map<Class<?>, m<?>> map, boolean z10, boolean z11, i iVar, boolean z12, boolean z13, boolean z14, boolean z15, U7.h hVar, Executor executor, n nVar, long j10) {
        U7.h hVar2 = hVar;
        Executor executor2 = executor;
        n nVar2 = nVar;
        long j11 = j10;
        l<?> a10 = this.f35113a.a(nVar2, z15);
        if (a10 != null) {
            a10.a(hVar2, executor2);
            if (f35112i) {
                j("Added to existing load", j11, nVar2);
            }
            return new d(hVar2, a10);
        }
        l a11 = this.f35116d.a(nVar, z12, z13, z14, z15);
        l lVar = a11;
        n nVar3 = nVar2;
        h<R> a12 = this.f35119g.a(dVar, obj, nVar, fVar, i10, i11, cls, cls2, gVar, jVar, map, z10, z11, z15, iVar, a11);
        this.f35113a.c(nVar3, lVar);
        l lVar2 = lVar;
        n nVar4 = nVar3;
        U7.h hVar3 = hVar;
        lVar2.a(hVar3, executor);
        lVar2.s(a12);
        if (f35112i) {
            j("Started new load", j10, nVar4);
        }
        return new d(hVar3, lVar2);
    }

    public void a(C7.f fVar, p<?> pVar) {
        this.f35120h.d(fVar);
        if (pVar.f()) {
            this.f35115c.d(fVar, pVar);
        } else {
            this.f35117e.a(pVar, false);
        }
    }

    public void b(v<?> vVar) {
        this.f35117e.a(vVar, true);
    }

    public synchronized void c(l<?> lVar, C7.f fVar) {
        this.f35113a.d(fVar, lVar);
    }

    public synchronized void d(l<?> lVar, C7.f fVar, p<?> pVar) {
        if (pVar != null) {
            try {
                if (pVar.f()) {
                    this.f35120h.a(fVar, pVar);
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        this.f35113a.d(fVar, lVar);
    }

    public <R> d f(com.bumptech.glide.d dVar, Object obj, C7.f fVar, int i10, int i11, Class<?> cls, Class<R> cls2, g gVar, j jVar, Map<Class<?>, m<?>> map, boolean z10, boolean z11, i iVar, boolean z12, boolean z13, boolean z14, boolean z15, U7.h hVar, Executor executor) {
        long b10 = f35112i ? Y7.g.b() : 0;
        n a10 = this.f35114b.a(obj, fVar, i10, i11, map, cls, cls2, iVar);
        synchronized (this) {
            try {
                p<?> i12 = i(a10, z12, b10);
                if (i12 == null) {
                    d l10 = l(dVar, obj, fVar, i10, i11, cls, cls2, gVar, jVar, map, z10, z11, iVar, z12, z13, z14, z15, hVar, executor, a10, b10);
                    return l10;
                }
                hVar.d(i12, C7.a.MEMORY_CACHE, false);
                return null;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
    }

    public void k(v<?> vVar) {
        if (vVar instanceof p) {
            ((p) vVar).g();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    k(G7.h hVar, a.C0573a aVar, H7.a aVar2, H7.a aVar3, H7.a aVar4, H7.a aVar5, s sVar, o oVar, a aVar6, b bVar, a aVar7, y yVar, boolean z10) {
        this.f35115c = hVar;
        a.C0573a aVar8 = aVar;
        c cVar = new c(aVar);
        this.f35118f = cVar;
        a aVar9 = aVar6 == null ? new a(z10) : aVar6;
        this.f35120h = aVar9;
        aVar9.f(this);
        this.f35114b = oVar == null ? new o() : oVar;
        this.f35113a = sVar == null ? new s() : sVar;
        this.f35116d = bVar == null ? new b(aVar2, aVar3, aVar4, aVar5, this, this) : bVar;
        this.f35119g = aVar7 == null ? new a(cVar) : aVar7;
        this.f35117e = yVar == null ? new y() : yVar;
        hVar.e(this);
    }
}

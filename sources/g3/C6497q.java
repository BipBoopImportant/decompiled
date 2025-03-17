package G3;

import C3.w;
import G3.C6479C;
import G3.C6500u;
import G3.V;
import G3.f0;
import J3.C6572e;
import J3.j;
import N3.C6674l;
import N3.C6678p;
import N3.C6679q;
import N3.I;
import N3.J;
import N3.O;
import N3.u;
import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import jb.r;
import k4.C8424h;
import k4.C8431o;
import k4.s;
import kb.C9967v;
import q3.C5807s;
import q3.w;
import t3.C5950a;
import t3.N;
import w3.g;
import w3.l;

/* renamed from: G3.q  reason: case insensitive filesystem */
public final class C6497q implements K {

    /* renamed from: c  reason: collision with root package name */
    private final a f35955c;

    /* renamed from: d  reason: collision with root package name */
    private g.a f35956d;

    /* renamed from: e  reason: collision with root package name */
    private s.a f35957e;

    /* renamed from: f  reason: collision with root package name */
    private C6479C.a f35958f;

    /* renamed from: g  reason: collision with root package name */
    private C6498s f35959g;

    /* renamed from: h  reason: collision with root package name */
    private j f35960h;

    /* renamed from: i  reason: collision with root package name */
    private long f35961i;

    /* renamed from: j  reason: collision with root package name */
    private long f35962j;

    /* renamed from: k  reason: collision with root package name */
    private long f35963k;

    /* renamed from: l  reason: collision with root package name */
    private float f35964l;

    /* renamed from: m  reason: collision with root package name */
    private float f35965m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f35966n;

    /* renamed from: G3.q$a */
    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final u f35967a;

        /* renamed from: b  reason: collision with root package name */
        private final Map<Integer, r<C6479C.a>> f35968b = new HashMap();

        /* renamed from: c  reason: collision with root package name */
        private final Map<Integer, C6479C.a> f35969c = new HashMap();

        /* renamed from: d  reason: collision with root package name */
        private g.a f35970d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f35971e = true;

        /* renamed from: f  reason: collision with root package name */
        private s.a f35972f;

        /* renamed from: g  reason: collision with root package name */
        private C6572e f35973g;

        /* renamed from: h  reason: collision with root package name */
        private w f35974h;

        /* renamed from: i  reason: collision with root package name */
        private j f35975i;

        public a(u uVar, s.a aVar) {
            this.f35967a = uVar;
            this.f35972f = aVar;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ C6479C.a k(g.a aVar) {
            return new V.b(aVar, this.f35967a);
        }

        private r<C6479C.a> l(int i10) {
            r<C6479C.a> rVar;
            r<C6479C.a> lVar;
            r<C6479C.a> rVar2 = this.f35968b.get(Integer.valueOf(i10));
            if (rVar2 != null) {
                return rVar2;
            }
            g.a aVar = (g.a) C5950a.e(this.f35970d);
            Class<C6479C.a> cls = C6479C.a.class;
            if (i10 == 0) {
                lVar = new C6492l(Class.forName("androidx.media3.exoplayer.dash.DashMediaSource$Factory").asSubclass(cls), aVar);
            } else if (i10 == 1) {
                lVar = new C6493m(Class.forName("androidx.media3.exoplayer.smoothstreaming.SsMediaSource$Factory").asSubclass(cls), aVar);
            } else if (i10 != 2) {
                if (i10 == 3) {
                    rVar = new C6495o(Class.forName("androidx.media3.exoplayer.rtsp.RtspMediaSource$Factory").asSubclass(cls));
                } else if (i10 == 4) {
                    rVar = new C6496p(this, aVar);
                } else {
                    throw new IllegalArgumentException("Unrecognized contentType: " + i10);
                }
                this.f35968b.put(Integer.valueOf(i10), rVar);
                return rVar;
            } else {
                lVar = new C6494n(Class.forName("androidx.media3.exoplayer.hls.HlsMediaSource$Factory").asSubclass(cls), aVar);
            }
            rVar = lVar;
            this.f35968b.put(Integer.valueOf(i10), rVar);
            return rVar;
        }

        public C6479C.a f(int i10) {
            C6479C.a aVar = this.f35969c.get(Integer.valueOf(i10));
            if (aVar != null) {
                return aVar;
            }
            C6479C.a aVar2 = l(i10).get();
            C6572e eVar = this.f35973g;
            if (eVar != null) {
                aVar2.g(eVar);
            }
            w wVar = this.f35974h;
            if (wVar != null) {
                aVar2.f(wVar);
            }
            j jVar = this.f35975i;
            if (jVar != null) {
                aVar2.c(jVar);
            }
            aVar2.b(this.f35972f);
            aVar2.e(this.f35971e);
            this.f35969c.put(Integer.valueOf(i10), aVar2);
            return aVar2;
        }

        public void m(C6572e eVar) {
            this.f35973g = eVar;
            for (C6479C.a g10 : this.f35969c.values()) {
                g10.g(eVar);
            }
        }

        public void n(g.a aVar) {
            if (aVar != this.f35970d) {
                this.f35970d = aVar;
                this.f35968b.clear();
                this.f35969c.clear();
            }
        }

        public void o(w wVar) {
            this.f35974h = wVar;
            for (C6479C.a f10 : this.f35969c.values()) {
                f10.f(wVar);
            }
        }

        public void p(int i10) {
            u uVar = this.f35967a;
            if (uVar instanceof C6674l) {
                ((C6674l) uVar).m(i10);
            }
        }

        public void q(j jVar) {
            this.f35975i = jVar;
            for (C6479C.a c10 : this.f35969c.values()) {
                c10.c(jVar);
            }
        }

        public void r(boolean z10) {
            this.f35971e = z10;
            this.f35967a.c(z10);
            for (C6479C.a e10 : this.f35969c.values()) {
                e10.e(z10);
            }
        }

        public void s(s.a aVar) {
            this.f35972f = aVar;
            this.f35967a.b(aVar);
            for (C6479C.a b10 : this.f35969c.values()) {
                b10.b(aVar);
            }
        }
    }

    /* renamed from: G3.q$b */
    private static final class b implements C6678p {

        /* renamed from: a  reason: collision with root package name */
        private final C5807s f35976a;

        public b(C5807s sVar) {
            this.f35976a = sVar;
        }

        public void a(long j10, long j11) {
        }

        public void b(N3.r rVar) {
            O t10 = rVar.t(0, 3);
            rVar.n(new J.b(-9223372036854775807L));
            rVar.r();
            t10.e(this.f35976a.b().s0("text/x-unknown").R(this.f35976a.f28244o).M());
        }

        public boolean h(C6679q qVar) {
            return true;
        }

        public int j(C6679q qVar, I i10) {
            return qVar.a(Integer.MAX_VALUE) == -1 ? -1 : 0;
        }

        public void release() {
        }
    }

    public C6497q(Context context) {
        this((g.a) new l.a(context));
    }

    /* access modifiers changed from: private */
    public /* synthetic */ C6678p[] k(C5807s sVar) {
        return new C6678p[]{this.f35957e.b(sVar) ? new C8431o(this.f35957e.a(sVar), sVar) : new b(sVar)};
    }

    private static C6479C l(q3.w wVar, C6479C c10) {
        w.d dVar = wVar.f28323f;
        if (dVar.f28348b == 0 && dVar.f28350d == Long.MIN_VALUE && !dVar.f28352f) {
            return c10;
        }
        w.d dVar2 = wVar.f28323f;
        return new C6485e(c10, dVar2.f28348b, dVar2.f28350d, !dVar2.f28353g, dVar2.f28351e, dVar2.f28352f);
    }

    private C6479C m(q3.w wVar, C6479C c10) {
        C5950a.e(wVar.f28319b);
        wVar.f28319b.getClass();
        return c10;
    }

    /* access modifiers changed from: private */
    public static C6479C.a n(Class<? extends C6479C.a> cls) {
        try {
            return (C6479C.a) cls.getConstructor((Class[]) null).newInstance((Object[]) null);
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    /* access modifiers changed from: private */
    public static C6479C.a o(Class<? extends C6479C.a> cls, g.a aVar) {
        try {
            return (C6479C.a) cls.getConstructor(new Class[]{g.a.class}).newInstance(new Object[]{aVar});
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }

    public C6479C d(q3.w wVar) {
        C5950a.e(wVar.f28319b);
        String scheme = wVar.f28319b.f28411a.getScheme();
        if (scheme != null && scheme.equals("ssai")) {
            return ((C6479C.a) C5950a.e(this.f35958f)).d(wVar);
        }
        if (Objects.equals(wVar.f28319b.f28412b, "application/x-image-uri")) {
            return new C6500u.b(N.P0(wVar.f28319b.f28419i), (C6498s) C5950a.e(this.f35959g)).d(wVar);
        }
        w.h hVar = wVar.f28319b;
        int y02 = N.y0(hVar.f28411a, hVar.f28412b);
        if (wVar.f28319b.f28419i != -9223372036854775807L) {
            this.f35955c.p(1);
        }
        try {
            C6479C.a f10 = this.f35955c.f(y02);
            w.g.a a10 = wVar.f28321d.a();
            if (wVar.f28321d.f28393a == -9223372036854775807L) {
                a10.k(this.f35961i);
            }
            if (wVar.f28321d.f28396d == -3.4028235E38f) {
                a10.j(this.f35964l);
            }
            if (wVar.f28321d.f28397e == -3.4028235E38f) {
                a10.h(this.f35965m);
            }
            if (wVar.f28321d.f28394b == -9223372036854775807L) {
                a10.i(this.f35962j);
            }
            if (wVar.f28321d.f28395c == -9223372036854775807L) {
                a10.g(this.f35963k);
            }
            w.g f11 = a10.f();
            if (!f11.equals(wVar.f28321d)) {
                wVar = wVar.a().b(f11).a();
            }
            C6479C d10 = f10.d(wVar);
            C9967v<w.k> vVar = ((w.h) N.i(wVar.f28319b)).f28416f;
            if (!vVar.isEmpty()) {
                C6479C[] cArr = new C6479C[(vVar.size() + 1)];
                cArr[0] = d10;
                for (int i10 = 0; i10 < vVar.size(); i10++) {
                    if (this.f35966n) {
                        V.b l10 = new V.b(this.f35956d, (u) new C6491k(this, new C5807s.b().s0(vVar.get(i10).f28438b).i0(vVar.get(i10).f28439c).u0(vVar.get(i10).f28440d).q0(vVar.get(i10).f28441e).g0(vVar.get(i10).f28442f).e0(vVar.get(i10).f28443g).M())).l(true);
                        j jVar = this.f35960h;
                        if (jVar != null) {
                            l10.c(jVar);
                        }
                        cArr[i10 + 1] = l10.d(q3.w.c(vVar.get(i10).f28437a.toString()));
                    } else {
                        f0.b bVar = new f0.b(this.f35956d);
                        j jVar2 = this.f35960h;
                        if (jVar2 != null) {
                            bVar.b(jVar2);
                        }
                        cArr[i10 + 1] = bVar.a(vVar.get(i10), -9223372036854775807L);
                    }
                }
                d10 = new N(cArr);
            }
            return m(wVar, l(wVar, d10));
        } catch (ClassNotFoundException e10) {
            throw new IllegalStateException(e10);
        }
    }

    @Deprecated
    /* renamed from: j */
    public C6497q e(boolean z10) {
        this.f35966n = z10;
        this.f35955c.r(z10);
        return this;
    }

    /* renamed from: p */
    public C6497q g(C6572e eVar) {
        this.f35955c.m((C6572e) C5950a.e(eVar));
        return this;
    }

    public C6497q q(g.a aVar) {
        this.f35956d = aVar;
        this.f35955c.n(aVar);
        return this;
    }

    /* renamed from: r */
    public C6497q f(C3.w wVar) {
        this.f35955c.o((C3.w) C5950a.f(wVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior."));
        return this;
    }

    /* renamed from: s */
    public C6497q c(j jVar) {
        this.f35960h = (j) C5950a.f(jVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.f35955c.q(jVar);
        return this;
    }

    /* renamed from: t */
    public C6497q b(s.a aVar) {
        this.f35957e = (s.a) C5950a.e(aVar);
        this.f35955c.s(aVar);
        return this;
    }

    public C6497q(Context context, u uVar) {
        this((g.a) new l.a(context), uVar);
    }

    public C6497q(g.a aVar) {
        this(aVar, (u) new C6674l());
    }

    public C6497q(g.a aVar, u uVar) {
        this.f35956d = aVar;
        C8424h hVar = new C8424h();
        this.f35957e = hVar;
        a aVar2 = new a(uVar, hVar);
        this.f35955c = aVar2;
        aVar2.n(aVar);
        this.f35961i = -9223372036854775807L;
        this.f35962j = -9223372036854775807L;
        this.f35963k = -9223372036854775807L;
        this.f35964l = -3.4028235E38f;
        this.f35965m = -3.4028235E38f;
        this.f35966n = true;
    }
}

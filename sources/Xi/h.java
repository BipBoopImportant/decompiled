package XI;

import XI.q;
import eJ.C17190a;
import eJ.C17191b;
import eJ.C17193d;
import eJ.C17194e;
import eJ.C17195f;
import eJ.C17196g;
import eJ.C17198i;
import eJ.C17199j;
import eJ.C17200k;
import eJ.C17207r;
import eJ.C17208s;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class h extends C17198i implements C17207r {

    /* renamed from: m  reason: collision with root package name */
    private static final h f139977m;

    /* renamed from: n  reason: collision with root package name */
    public static C17208s<h> f139978n = new a();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C17193d f139979b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public int f139980c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public int f139981d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public int f139982e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public c f139983f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public q f139984g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public int f139985h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public List<h> f139986i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public List<h> f139987j;

    /* renamed from: k  reason: collision with root package name */
    private byte f139988k;

    /* renamed from: l  reason: collision with root package name */
    private int f139989l;

    static class a extends C17191b<h> {
        a() {
        }

        /* renamed from: m */
        public h c(C17194e eVar, C17196g gVar) {
            return new h(eVar, gVar);
        }
    }

    public static final class b extends C17198i.b<h, b> implements C17207r {

        /* renamed from: b  reason: collision with root package name */
        private int f139990b;

        /* renamed from: c  reason: collision with root package name */
        private int f139991c;

        /* renamed from: d  reason: collision with root package name */
        private int f139992d;

        /* renamed from: e  reason: collision with root package name */
        private c f139993e = c.TRUE;

        /* renamed from: f  reason: collision with root package name */
        private q f139994f = q.S();

        /* renamed from: g  reason: collision with root package name */
        private int f139995g;

        /* renamed from: h  reason: collision with root package name */
        private List<h> f139996h = Collections.emptyList();

        /* renamed from: i  reason: collision with root package name */
        private List<h> f139997i = Collections.emptyList();

        private b() {
            u();
        }

        /* access modifiers changed from: private */
        public static b o() {
            return new b();
        }

        private void p() {
            if ((this.f139990b & 32) != 32) {
                this.f139996h = new ArrayList(this.f139996h);
                this.f139990b |= 32;
            }
        }

        private void r() {
            if ((this.f139990b & 64) != 64) {
                this.f139997i = new ArrayList(this.f139997i);
                this.f139990b |= 64;
            }
        }

        private void u() {
        }

        public b A(int i10) {
            this.f139990b |= 1;
            this.f139991c = i10;
            return this;
        }

        public b C(int i10) {
            this.f139990b |= 16;
            this.f139995g = i10;
            return this;
        }

        public b D(int i10) {
            this.f139990b |= 2;
            this.f139992d = i10;
            return this;
        }

        /* renamed from: l */
        public h g() {
            h m10 = m();
            if (m10.isInitialized()) {
                return m10;
            }
            throw C17190a.C3485a.c(m10);
        }

        public h m() {
            h hVar = new h((C17198i.b) this);
            int i10 = this.f139990b;
            int i11 = 1;
            if ((i10 & 1) != 1) {
                i11 = 0;
            }
            int unused = hVar.f139981d = this.f139991c;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            int unused2 = hVar.f139982e = this.f139992d;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            c unused3 = hVar.f139983f = this.f139993e;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            q unused4 = hVar.f139984g = this.f139994f;
            if ((i10 & 16) == 16) {
                i11 |= 16;
            }
            int unused5 = hVar.f139985h = this.f139995g;
            if ((this.f139990b & 32) == 32) {
                this.f139996h = Collections.unmodifiableList(this.f139996h);
                this.f139990b &= -33;
            }
            List unused6 = hVar.f139986i = this.f139996h;
            if ((this.f139990b & 64) == 64) {
                this.f139997i = Collections.unmodifiableList(this.f139997i);
                this.f139990b &= -65;
            }
            List unused7 = hVar.f139987j = this.f139997i;
            int unused8 = hVar.f139980c = i11;
            return hVar;
        }

        /* renamed from: n */
        public b d() {
            return o().f(m());
        }

        /* renamed from: v */
        public b f(h hVar) {
            if (hVar == h.A()) {
                return this;
            }
            if (hVar.I()) {
                A(hVar.B());
            }
            if (hVar.L()) {
                D(hVar.G());
            }
            if (hVar.H()) {
                z(hVar.z());
            }
            if (hVar.J()) {
                y(hVar.C());
            }
            if (hVar.K()) {
                C(hVar.D());
            }
            if (!hVar.f139986i.isEmpty()) {
                if (this.f139996h.isEmpty()) {
                    this.f139996h = hVar.f139986i;
                    this.f139990b &= -33;
                } else {
                    p();
                    this.f139996h.addAll(hVar.f139986i);
                }
            }
            if (!hVar.f139987j.isEmpty()) {
                if (this.f139997i.isEmpty()) {
                    this.f139997i = hVar.f139987j;
                    this.f139990b &= -65;
                } else {
                    r();
                    this.f139997i.addAll(hVar.f139987j);
                }
            }
            j(e().i(hVar.f139979b));
            return this;
        }

        /* renamed from: w */
        public b o1(C17194e eVar, C17196g gVar) {
            h hVar;
            h hVar2 = null;
            try {
                h c10 = h.f139978n.c(eVar, gVar);
                if (c10 != null) {
                    f(c10);
                }
                return this;
            } catch (C17200k e10) {
                hVar = (h) e10.a();
                throw e10;
            } catch (Throwable th2) {
                th = th2;
                hVar2 = hVar;
            }
            if (hVar2 != null) {
                f(hVar2);
            }
            throw th;
        }

        public b y(q qVar) {
            if ((this.f139990b & 8) != 8 || this.f139994f == q.S()) {
                this.f139994f = qVar;
            } else {
                this.f139994f = q.t0(this.f139994f).f(qVar).r();
            }
            this.f139990b |= 8;
            return this;
        }

        public b z(c cVar) {
            cVar.getClass();
            this.f139990b |= 4;
            this.f139993e = cVar;
            return this;
        }
    }

    public enum c implements C17199j.a {
        TRUE(0, 0),
        FALSE(1, 1),
        NULL(2, 2);
        
        private static C17199j.b<c> internalValueMap;
        private final int value;

        static class a implements C17199j.b<c> {
            a() {
            }

            /* renamed from: b */
            public c a(int i10) {
                return c.a(i10);
            }
        }

        static {
            internalValueMap = new a();
        }

        private c(int i10, int i11) {
            this.value = i11;
        }

        public static c a(int i10) {
            if (i10 == 0) {
                return TRUE;
            }
            if (i10 == 1) {
                return FALSE;
            }
            if (i10 != 2) {
                return null;
            }
            return NULL;
        }

        public final int d() {
            return this.value;
        }
    }

    static {
        h hVar = new h(true);
        f139977m = hVar;
        hVar.M();
    }

    public static h A() {
        return f139977m;
    }

    private void M() {
        this.f139981d = 0;
        this.f139982e = 0;
        this.f139983f = c.TRUE;
        this.f139984g = q.S();
        this.f139985h = 0;
        this.f139986i = Collections.emptyList();
        this.f139987j = Collections.emptyList();
    }

    public static b N() {
        return b.o();
    }

    public static b O(h hVar) {
        return N().f(hVar);
    }

    public int B() {
        return this.f139981d;
    }

    public q C() {
        return this.f139984g;
    }

    public int D() {
        return this.f139985h;
    }

    public h E(int i10) {
        return this.f139987j.get(i10);
    }

    public int F() {
        return this.f139987j.size();
    }

    public int G() {
        return this.f139982e;
    }

    public boolean H() {
        return (this.f139980c & 4) == 4;
    }

    public boolean I() {
        return (this.f139980c & 1) == 1;
    }

    public boolean J() {
        return (this.f139980c & 8) == 8;
    }

    public boolean K() {
        return (this.f139980c & 16) == 16;
    }

    public boolean L() {
        return (this.f139980c & 2) == 2;
    }

    /* renamed from: P */
    public b newBuilderForType() {
        return N();
    }

    /* renamed from: Q */
    public b toBuilder() {
        return O(this);
    }

    public void a(C17195f fVar) {
        getSerializedSize();
        if ((this.f139980c & 1) == 1) {
            fVar.a0(1, this.f139981d);
        }
        if ((this.f139980c & 2) == 2) {
            fVar.a0(2, this.f139982e);
        }
        if ((this.f139980c & 4) == 4) {
            fVar.S(3, this.f139983f.d());
        }
        if ((this.f139980c & 8) == 8) {
            fVar.d0(4, this.f139984g);
        }
        if ((this.f139980c & 16) == 16) {
            fVar.a0(5, this.f139985h);
        }
        for (int i10 = 0; i10 < this.f139986i.size(); i10++) {
            fVar.d0(6, this.f139986i.get(i10));
        }
        for (int i11 = 0; i11 < this.f139987j.size(); i11++) {
            fVar.d0(7, this.f139987j.get(i11));
        }
        fVar.i0(this.f139979b);
    }

    public C17208s<h> getParserForType() {
        return f139978n;
    }

    public int getSerializedSize() {
        int i10 = this.f139989l;
        if (i10 != -1) {
            return i10;
        }
        int o10 = (this.f139980c & 1) == 1 ? C17195f.o(1, this.f139981d) : 0;
        if ((this.f139980c & 2) == 2) {
            o10 += C17195f.o(2, this.f139982e);
        }
        if ((this.f139980c & 4) == 4) {
            o10 += C17195f.h(3, this.f139983f.d());
        }
        if ((this.f139980c & 8) == 8) {
            o10 += C17195f.s(4, this.f139984g);
        }
        if ((this.f139980c & 16) == 16) {
            o10 += C17195f.o(5, this.f139985h);
        }
        for (int i11 = 0; i11 < this.f139986i.size(); i11++) {
            o10 += C17195f.s(6, this.f139986i.get(i11));
        }
        for (int i12 = 0; i12 < this.f139987j.size(); i12++) {
            o10 += C17195f.s(7, this.f139987j.get(i12));
        }
        int size = o10 + this.f139979b.size();
        this.f139989l = size;
        return size;
    }

    public final boolean isInitialized() {
        byte b10 = this.f139988k;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!J() || C().isInitialized()) {
            for (int i10 = 0; i10 < y(); i10++) {
                if (!x(i10).isInitialized()) {
                    this.f139988k = 0;
                    return false;
                }
            }
            for (int i11 = 0; i11 < F(); i11++) {
                if (!E(i11).isInitialized()) {
                    this.f139988k = 0;
                    return false;
                }
            }
            this.f139988k = 1;
            return true;
        }
        this.f139988k = 0;
        return false;
    }

    public h x(int i10) {
        return this.f139986i.get(i10);
    }

    public int y() {
        return this.f139986i.size();
    }

    public c z() {
        return this.f139983f;
    }

    private h(C17198i.b bVar) {
        super(bVar);
        this.f139988k = -1;
        this.f139989l = -1;
        this.f139979b = bVar.e();
    }

    private h(boolean z10) {
        this.f139988k = -1;
        this.f139989l = -1;
        this.f139979b = C17193d.f143014a;
    }

    private h(C17194e eVar, C17196g gVar) {
        this.f139988k = -1;
        this.f139989l = -1;
        M();
        C17193d.b B10 = C17193d.B();
        C17195f J10 = C17195f.J(B10, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                int K10 = eVar.K();
                if (K10 != 0) {
                    if (K10 == 8) {
                        this.f139980c |= 1;
                        this.f139981d = eVar.s();
                    } else if (K10 == 16) {
                        this.f139980c |= 2;
                        this.f139982e = eVar.s();
                    } else if (K10 == 24) {
                        int n10 = eVar.n();
                        c a10 = c.a(n10);
                        if (a10 == null) {
                            J10.o0(K10);
                            J10.o0(n10);
                        } else {
                            this.f139980c |= 4;
                            this.f139983f = a10;
                        }
                    } else if (K10 == 34) {
                        q.c v02 = (this.f139980c & 8) == 8 ? this.f139984g.toBuilder() : null;
                        q qVar = (q) eVar.u(q.f140132v, gVar);
                        this.f139984g = qVar;
                        if (v02 != null) {
                            v02.f(qVar);
                            this.f139984g = v02.r();
                        }
                        this.f139980c |= 8;
                    } else if (K10 == 40) {
                        this.f139980c |= 16;
                        this.f139985h = eVar.s();
                    } else if (K10 == 50) {
                        if (!(z11 & true)) {
                            this.f139986i = new ArrayList();
                            z11 |= true;
                        }
                        this.f139986i.add(eVar.u(f139978n, gVar));
                    } else if (K10 == 58) {
                        if (!(z11 & true)) {
                            this.f139987j = new ArrayList();
                            z11 |= true;
                        }
                        this.f139987j.add(eVar.u(f139978n, gVar));
                    } else if (k(eVar, J10, gVar, K10)) {
                    }
                }
                z10 = true;
            } catch (C17200k e10) {
                throw e10.i(this);
            } catch (IOException e11) {
                throw new C17200k(e11.getMessage()).i(this);
            } catch (Throwable th2) {
                if (z11 & true) {
                    this.f139986i = Collections.unmodifiableList(this.f139986i);
                }
                if (z11 & true) {
                    this.f139987j = Collections.unmodifiableList(this.f139987j);
                }
                try {
                    J10.I();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f139979b = B10.g();
                    throw th3;
                }
                this.f139979b = B10.g();
                h();
                throw th2;
            }
        }
        if (z11 & true) {
            this.f139986i = Collections.unmodifiableList(this.f139986i);
        }
        if (z11 & true) {
            this.f139987j = Collections.unmodifiableList(this.f139987j);
        }
        try {
            J10.I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f139979b = B10.g();
            throw th4;
        }
        this.f139979b = B10.g();
        h();
    }
}

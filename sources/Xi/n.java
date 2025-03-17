package XI;

import androidx.recyclerview.widget.RecyclerView;
import eJ.C17190a;
import eJ.C17191b;
import eJ.C17193d;
import eJ.C17194e;
import eJ.C17195f;
import eJ.C17196g;
import eJ.C17198i;
import eJ.C17200k;
import eJ.C17207r;
import eJ.C17208s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class n extends C17198i.d<n> implements C17207r {

    /* renamed from: v  reason: collision with root package name */
    private static final n f140066v;

    /* renamed from: w  reason: collision with root package name */
    public static C17208s<n> f140067w = new a();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C17193d f140068c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public int f140069d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public int f140070e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public int f140071f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public int f140072g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public q f140073h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public int f140074i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public List<s> f140075j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public q f140076k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public int f140077l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public List<q> f140078m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public List<Integer> f140079n;

    /* renamed from: o  reason: collision with root package name */
    private int f140080o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public u f140081p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public int f140082q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public int f140083r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public List<Integer> f140084s;

    /* renamed from: t  reason: collision with root package name */
    private byte f140085t;

    /* renamed from: u  reason: collision with root package name */
    private int f140086u;

    static class a extends C17191b<n> {
        a() {
        }

        /* renamed from: m */
        public n c(C17194e eVar, C17196g gVar) {
            return new n(eVar, gVar);
        }
    }

    public static final class b extends C17198i.c<n, b> implements C17207r {

        /* renamed from: d  reason: collision with root package name */
        private int f140087d;

        /* renamed from: e  reason: collision with root package name */
        private int f140088e = 518;

        /* renamed from: f  reason: collision with root package name */
        private int f140089f = 2054;

        /* renamed from: g  reason: collision with root package name */
        private int f140090g;

        /* renamed from: h  reason: collision with root package name */
        private q f140091h = q.S();

        /* renamed from: i  reason: collision with root package name */
        private int f140092i;

        /* renamed from: j  reason: collision with root package name */
        private List<s> f140093j = Collections.emptyList();

        /* renamed from: k  reason: collision with root package name */
        private q f140094k = q.S();

        /* renamed from: l  reason: collision with root package name */
        private int f140095l;

        /* renamed from: m  reason: collision with root package name */
        private List<q> f140096m = Collections.emptyList();

        /* renamed from: n  reason: collision with root package name */
        private List<Integer> f140097n = Collections.emptyList();

        /* renamed from: o  reason: collision with root package name */
        private u f140098o = u.D();

        /* renamed from: p  reason: collision with root package name */
        private int f140099p;

        /* renamed from: q  reason: collision with root package name */
        private int f140100q;

        /* renamed from: r  reason: collision with root package name */
        private List<Integer> f140101r = Collections.emptyList();

        private b() {
            C();
        }

        private void A() {
            if ((this.f140087d & 8192) != 8192) {
                this.f140101r = new ArrayList(this.f140101r);
                this.f140087d |= 8192;
            }
        }

        private void C() {
        }

        /* access modifiers changed from: private */
        public static b v() {
            return new b();
        }

        private void w() {
            if ((this.f140087d & 512) != 512) {
                this.f140097n = new ArrayList(this.f140097n);
                this.f140087d |= 512;
            }
        }

        private void y() {
            if ((this.f140087d & 256) != 256) {
                this.f140096m = new ArrayList(this.f140096m);
                this.f140087d |= 256;
            }
        }

        private void z() {
            if ((this.f140087d & 32) != 32) {
                this.f140093j = new ArrayList(this.f140093j);
                this.f140087d |= 32;
            }
        }

        /* renamed from: D */
        public b f(n nVar) {
            if (nVar == n.T()) {
                return this;
            }
            if (nVar.j0()) {
                K(nVar.V());
            }
            if (nVar.m0()) {
                N(nVar.Y());
            }
            if (nVar.l0()) {
                M(nVar.X());
            }
            if (nVar.p0()) {
                H(nVar.b0());
            }
            if (nVar.q0()) {
                P(nVar.c0());
            }
            if (!nVar.f140075j.isEmpty()) {
                if (this.f140093j.isEmpty()) {
                    this.f140093j = nVar.f140075j;
                    this.f140087d &= -33;
                } else {
                    z();
                    this.f140093j.addAll(nVar.f140075j);
                }
            }
            if (nVar.n0()) {
                G(nVar.Z());
            }
            if (nVar.o0()) {
                O(nVar.a0());
            }
            if (!nVar.f140078m.isEmpty()) {
                if (this.f140096m.isEmpty()) {
                    this.f140096m = nVar.f140078m;
                    this.f140087d &= -257;
                } else {
                    y();
                    this.f140096m.addAll(nVar.f140078m);
                }
            }
            if (!nVar.f140079n.isEmpty()) {
                if (this.f140097n.isEmpty()) {
                    this.f140097n = nVar.f140079n;
                    this.f140087d &= -513;
                } else {
                    w();
                    this.f140097n.addAll(nVar.f140079n);
                }
            }
            if (nVar.s0()) {
                I(nVar.e0());
            }
            if (nVar.k0()) {
                L(nVar.W());
            }
            if (nVar.r0()) {
                Q(nVar.d0());
            }
            if (!nVar.f140084s.isEmpty()) {
                if (this.f140101r.isEmpty()) {
                    this.f140101r = nVar.f140084s;
                    this.f140087d &= -8193;
                } else {
                    A();
                    this.f140101r.addAll(nVar.f140084s);
                }
            }
            n(nVar);
            j(e().i(nVar.f140068c));
            return this;
        }

        /* renamed from: E */
        public b o1(C17194e eVar, C17196g gVar) {
            n nVar;
            n nVar2 = null;
            try {
                n c10 = n.f140067w.c(eVar, gVar);
                if (c10 != null) {
                    f(c10);
                }
                return this;
            } catch (C17200k e10) {
                nVar = (n) e10.a();
                throw e10;
            } catch (Throwable th2) {
                th = th2;
                nVar2 = nVar;
            }
            if (nVar2 != null) {
                f(nVar2);
            }
            throw th;
        }

        public b G(q qVar) {
            if ((this.f140087d & 64) != 64 || this.f140094k == q.S()) {
                this.f140094k = qVar;
            } else {
                this.f140094k = q.t0(this.f140094k).f(qVar).r();
            }
            this.f140087d |= 64;
            return this;
        }

        public b H(q qVar) {
            if ((this.f140087d & 8) != 8 || this.f140091h == q.S()) {
                this.f140091h = qVar;
            } else {
                this.f140091h = q.t0(this.f140091h).f(qVar).r();
            }
            this.f140087d |= 8;
            return this;
        }

        public b I(u uVar) {
            if ((this.f140087d & 1024) != 1024 || this.f140098o == u.D()) {
                this.f140098o = uVar;
            } else {
                this.f140098o = u.T(this.f140098o).f(uVar).r();
            }
            this.f140087d |= 1024;
            return this;
        }

        public b K(int i10) {
            this.f140087d |= 1;
            this.f140088e = i10;
            return this;
        }

        public b L(int i10) {
            this.f140087d |= RecyclerView.n.FLAG_MOVED;
            this.f140099p = i10;
            return this;
        }

        public b M(int i10) {
            this.f140087d |= 4;
            this.f140090g = i10;
            return this;
        }

        public b N(int i10) {
            this.f140087d |= 2;
            this.f140089f = i10;
            return this;
        }

        public b O(int i10) {
            this.f140087d |= 128;
            this.f140095l = i10;
            return this;
        }

        public b P(int i10) {
            this.f140087d |= 16;
            this.f140092i = i10;
            return this;
        }

        public b Q(int i10) {
            this.f140087d |= RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT;
            this.f140100q = i10;
            return this;
        }

        /* renamed from: p */
        public n g() {
            n r10 = r();
            if (r10.isInitialized()) {
                return r10;
            }
            throw C17190a.C3485a.c(r10);
        }

        public n r() {
            n nVar = new n((C17198i.c) this);
            int i10 = this.f140087d;
            int i11 = 1;
            if ((i10 & 1) != 1) {
                i11 = 0;
            }
            int unused = nVar.f140070e = this.f140088e;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            int unused2 = nVar.f140071f = this.f140089f;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            int unused3 = nVar.f140072g = this.f140090g;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            q unused4 = nVar.f140073h = this.f140091h;
            if ((i10 & 16) == 16) {
                i11 |= 16;
            }
            int unused5 = nVar.f140074i = this.f140092i;
            if ((this.f140087d & 32) == 32) {
                this.f140093j = Collections.unmodifiableList(this.f140093j);
                this.f140087d &= -33;
            }
            List unused6 = nVar.f140075j = this.f140093j;
            if ((i10 & 64) == 64) {
                i11 |= 32;
            }
            q unused7 = nVar.f140076k = this.f140094k;
            if ((i10 & 128) == 128) {
                i11 |= 64;
            }
            int unused8 = nVar.f140077l = this.f140095l;
            if ((this.f140087d & 256) == 256) {
                this.f140096m = Collections.unmodifiableList(this.f140096m);
                this.f140087d &= -257;
            }
            List unused9 = nVar.f140078m = this.f140096m;
            if ((this.f140087d & 512) == 512) {
                this.f140097n = Collections.unmodifiableList(this.f140097n);
                this.f140087d &= -513;
            }
            List unused10 = nVar.f140079n = this.f140097n;
            if ((i10 & 1024) == 1024) {
                i11 |= 128;
            }
            u unused11 = nVar.f140081p = this.f140098o;
            if ((i10 & RecyclerView.n.FLAG_MOVED) == 2048) {
                i11 |= 256;
            }
            int unused12 = nVar.f140082q = this.f140099p;
            if ((i10 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096) {
                i11 |= 512;
            }
            int unused13 = nVar.f140083r = this.f140100q;
            if ((this.f140087d & 8192) == 8192) {
                this.f140101r = Collections.unmodifiableList(this.f140101r);
                this.f140087d &= -8193;
            }
            List unused14 = nVar.f140084s = this.f140101r;
            int unused15 = nVar.f140069d = i11;
            return nVar;
        }

        /* renamed from: u */
        public b d() {
            return v().f(r());
        }
    }

    static {
        n nVar = new n(true);
        f140066v = nVar;
        nVar.t0();
    }

    public static n T() {
        return f140066v;
    }

    private void t0() {
        this.f140070e = 518;
        this.f140071f = 2054;
        this.f140072g = 0;
        this.f140073h = q.S();
        this.f140074i = 0;
        this.f140075j = Collections.emptyList();
        this.f140076k = q.S();
        this.f140077l = 0;
        this.f140078m = Collections.emptyList();
        this.f140079n = Collections.emptyList();
        this.f140081p = u.D();
        this.f140082q = 0;
        this.f140083r = 0;
        this.f140084s = Collections.emptyList();
    }

    public static b u0() {
        return b.v();
    }

    public static b v0(n nVar) {
        return u0().f(nVar);
    }

    public q P(int i10) {
        return this.f140078m.get(i10);
    }

    public int Q() {
        return this.f140078m.size();
    }

    public List<Integer> R() {
        return this.f140079n;
    }

    public List<q> S() {
        return this.f140078m;
    }

    /* renamed from: U */
    public n getDefaultInstanceForType() {
        return f140066v;
    }

    public int V() {
        return this.f140070e;
    }

    public int W() {
        return this.f140082q;
    }

    public int X() {
        return this.f140072g;
    }

    public int Y() {
        return this.f140071f;
    }

    public q Z() {
        return this.f140076k;
    }

    public void a(C17195f fVar) {
        getSerializedSize();
        C17198i.d<MessageType>.defpackage.a t10 = t();
        if ((this.f140069d & 2) == 2) {
            fVar.a0(1, this.f140071f);
        }
        if ((this.f140069d & 4) == 4) {
            fVar.a0(2, this.f140072g);
        }
        if ((this.f140069d & 8) == 8) {
            fVar.d0(3, this.f140073h);
        }
        for (int i10 = 0; i10 < this.f140075j.size(); i10++) {
            fVar.d0(4, this.f140075j.get(i10));
        }
        if ((this.f140069d & 32) == 32) {
            fVar.d0(5, this.f140076k);
        }
        if ((this.f140069d & 128) == 128) {
            fVar.d0(6, this.f140081p);
        }
        if ((this.f140069d & 256) == 256) {
            fVar.a0(7, this.f140082q);
        }
        if ((this.f140069d & 512) == 512) {
            fVar.a0(8, this.f140083r);
        }
        if ((this.f140069d & 16) == 16) {
            fVar.a0(9, this.f140074i);
        }
        if ((this.f140069d & 64) == 64) {
            fVar.a0(10, this.f140077l);
        }
        if ((this.f140069d & 1) == 1) {
            fVar.a0(11, this.f140070e);
        }
        for (int i11 = 0; i11 < this.f140078m.size(); i11++) {
            fVar.d0(12, this.f140078m.get(i11));
        }
        if (R().size() > 0) {
            fVar.o0(106);
            fVar.o0(this.f140080o);
        }
        for (int i12 = 0; i12 < this.f140079n.size(); i12++) {
            fVar.b0(this.f140079n.get(i12).intValue());
        }
        for (int i13 = 0; i13 < this.f140084s.size(); i13++) {
            fVar.a0(31, this.f140084s.get(i13).intValue());
        }
        t10.a(19000, fVar);
        fVar.i0(this.f140068c);
    }

    public int a0() {
        return this.f140077l;
    }

    public q b0() {
        return this.f140073h;
    }

    public int c0() {
        return this.f140074i;
    }

    public int d0() {
        return this.f140083r;
    }

    public u e0() {
        return this.f140081p;
    }

    public s f0(int i10) {
        return this.f140075j.get(i10);
    }

    public int g0() {
        return this.f140075j.size();
    }

    public C17208s<n> getParserForType() {
        return f140067w;
    }

    public int getSerializedSize() {
        int i10 = this.f140086u;
        if (i10 != -1) {
            return i10;
        }
        int o10 = (this.f140069d & 2) == 2 ? C17195f.o(1, this.f140071f) : 0;
        if ((this.f140069d & 4) == 4) {
            o10 += C17195f.o(2, this.f140072g);
        }
        if ((this.f140069d & 8) == 8) {
            o10 += C17195f.s(3, this.f140073h);
        }
        for (int i11 = 0; i11 < this.f140075j.size(); i11++) {
            o10 += C17195f.s(4, this.f140075j.get(i11));
        }
        if ((this.f140069d & 32) == 32) {
            o10 += C17195f.s(5, this.f140076k);
        }
        if ((this.f140069d & 128) == 128) {
            o10 += C17195f.s(6, this.f140081p);
        }
        if ((this.f140069d & 256) == 256) {
            o10 += C17195f.o(7, this.f140082q);
        }
        if ((this.f140069d & 512) == 512) {
            o10 += C17195f.o(8, this.f140083r);
        }
        if ((this.f140069d & 16) == 16) {
            o10 += C17195f.o(9, this.f140074i);
        }
        if ((this.f140069d & 64) == 64) {
            o10 += C17195f.o(10, this.f140077l);
        }
        if ((this.f140069d & 1) == 1) {
            o10 += C17195f.o(11, this.f140070e);
        }
        for (int i12 = 0; i12 < this.f140078m.size(); i12++) {
            o10 += C17195f.s(12, this.f140078m.get(i12));
        }
        int i13 = 0;
        for (int i14 = 0; i14 < this.f140079n.size(); i14++) {
            i13 += C17195f.p(this.f140079n.get(i14).intValue());
        }
        int i15 = o10 + i13;
        if (!R().isEmpty()) {
            i15 = i15 + 1 + C17195f.p(i13);
        }
        this.f140080o = i13;
        int i16 = 0;
        for (int i17 = 0; i17 < this.f140084s.size(); i17++) {
            i16 += C17195f.p(this.f140084s.get(i17).intValue());
        }
        int size = i15 + i16 + (i0().size() * 2) + o() + this.f140068c.size();
        this.f140086u = size;
        return size;
    }

    public List<s> h0() {
        return this.f140075j;
    }

    public List<Integer> i0() {
        return this.f140084s;
    }

    public final boolean isInitialized() {
        byte b10 = this.f140085t;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!l0()) {
            this.f140085t = 0;
            return false;
        } else if (!p0() || b0().isInitialized()) {
            for (int i10 = 0; i10 < g0(); i10++) {
                if (!f0(i10).isInitialized()) {
                    this.f140085t = 0;
                    return false;
                }
            }
            if (!n0() || Z().isInitialized()) {
                for (int i11 = 0; i11 < Q(); i11++) {
                    if (!P(i11).isInitialized()) {
                        this.f140085t = 0;
                        return false;
                    }
                }
                if (s0() && !e0().isInitialized()) {
                    this.f140085t = 0;
                    return false;
                } else if (!n()) {
                    this.f140085t = 0;
                    return false;
                } else {
                    this.f140085t = 1;
                    return true;
                }
            } else {
                this.f140085t = 0;
                return false;
            }
        } else {
            this.f140085t = 0;
            return false;
        }
    }

    public boolean j0() {
        return (this.f140069d & 1) == 1;
    }

    public boolean k0() {
        return (this.f140069d & 256) == 256;
    }

    public boolean l0() {
        return (this.f140069d & 4) == 4;
    }

    public boolean m0() {
        return (this.f140069d & 2) == 2;
    }

    public boolean n0() {
        return (this.f140069d & 32) == 32;
    }

    public boolean o0() {
        return (this.f140069d & 64) == 64;
    }

    public boolean p0() {
        return (this.f140069d & 8) == 8;
    }

    public boolean q0() {
        return (this.f140069d & 16) == 16;
    }

    public boolean r0() {
        return (this.f140069d & 512) == 512;
    }

    public boolean s0() {
        return (this.f140069d & 128) == 128;
    }

    /* renamed from: w0 */
    public b newBuilderForType() {
        return u0();
    }

    /* renamed from: x0 */
    public b toBuilder() {
        return v0(this);
    }

    private n(C17198i.c<n, ?> cVar) {
        super(cVar);
        this.f140080o = -1;
        this.f140085t = -1;
        this.f140086u = -1;
        this.f140068c = cVar.e();
    }

    private n(boolean z10) {
        this.f140080o = -1;
        this.f140085t = -1;
        this.f140086u = -1;
        this.f140068c = C17193d.f143014a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v1, resolved type: XI.q$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v5, resolved type: XI.q$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v7, resolved type: XI.u$b} */
    /* JADX WARNING: type inference failed for: r10v0 */
    /* JADX WARNING: type inference failed for: r10v25 */
    /* JADX WARNING: type inference failed for: r10v26 */
    /* JADX WARNING: type inference failed for: r10v27 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private n(eJ.C17194e r13, eJ.C17196g r14) {
        /*
            r12 = this;
            r12.<init>()
            r0 = -1
            r12.f140080o = r0
            r12.f140085t = r0
            r12.f140086u = r0
            r12.t0()
            eJ.d$b r0 = eJ.C17193d.B()
            r1 = 1
            eJ.f r2 = eJ.C17195f.J(r0, r1)
            r3 = 0
            r4 = r3
        L_0x0018:
            r5 = 256(0x100, float:3.59E-43)
            r6 = 32
            r7 = 8192(0x2000, float:1.14794E-41)
            r8 = 512(0x200, float:7.175E-43)
            if (r3 != 0) goto L_0x023e
            int r9 = r13.K()     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r10 = 0
            switch(r9) {
                case 0: goto L_0x0030;
                case 8: goto L_0x01d7;
                case 16: goto L_0x01c9;
                case 26: goto L_0x01a0;
                case 34: goto L_0x0186;
                case 42: goto L_0x015f;
                case 50: goto L_0x0136;
                case 56: goto L_0x0129;
                case 64: goto L_0x011c;
                case 72: goto L_0x010e;
                case 80: goto L_0x0100;
                case 88: goto L_0x00f3;
                case 98: goto L_0x00d9;
                case 104: goto L_0x00bd;
                case 106: goto L_0x0089;
                case 248: goto L_0x006e;
                case 250: goto L_0x003b;
                default: goto L_0x002a;
            }     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
        L_0x002a:
            boolean r5 = r12.k(r13, r2, r14, r9)     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            if (r5 != 0) goto L_0x0018
        L_0x0030:
            r3 = r1
            goto L_0x0018
        L_0x0032:
            r13 = move-exception
            goto L_0x01f8
        L_0x0035:
            r13 = move-exception
            goto L_0x01e5
        L_0x0038:
            r13 = move-exception
            goto L_0x01f3
        L_0x003b:
            int r9 = r13.A()     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            int r9 = r13.j(r9)     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r10 = r4 & 8192(0x2000, float:1.14794E-41)
            if (r10 == r7) goto L_0x0056
            int r10 = r13.e()     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            if (r10 <= 0) goto L_0x0056
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r10.<init>()     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r12.f140084s = r10     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r4 = r4 | 8192(0x2000, float:1.14794E-41)
        L_0x0056:
            int r10 = r13.e()     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            if (r10 <= 0) goto L_0x006a
            java.util.List<java.lang.Integer> r10 = r12.f140084s     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            int r11 = r13.s()     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r10.add(r11)     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            goto L_0x0056
        L_0x006a:
            r13.i(r9)     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            goto L_0x0018
        L_0x006e:
            r9 = r4 & 8192(0x2000, float:1.14794E-41)
            if (r9 == r7) goto L_0x007b
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r9.<init>()     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r12.f140084s = r9     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r4 = r4 | 8192(0x2000, float:1.14794E-41)
        L_0x007b:
            java.util.List<java.lang.Integer> r9 = r12.f140084s     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            int r10 = r13.s()     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r9.add(r10)     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            goto L_0x0018
        L_0x0089:
            int r9 = r13.A()     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            int r9 = r13.j(r9)     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r10 = r4 & 512(0x200, float:7.175E-43)
            if (r10 == r8) goto L_0x00a4
            int r10 = r13.e()     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            if (r10 <= 0) goto L_0x00a4
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r10.<init>()     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r12.f140079n = r10     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r4 = r4 | 512(0x200, float:7.175E-43)
        L_0x00a4:
            int r10 = r13.e()     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            if (r10 <= 0) goto L_0x00b8
            java.util.List<java.lang.Integer> r10 = r12.f140079n     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            int r11 = r13.s()     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r10.add(r11)     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            goto L_0x00a4
        L_0x00b8:
            r13.i(r9)     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            goto L_0x0018
        L_0x00bd:
            r9 = r4 & 512(0x200, float:7.175E-43)
            if (r9 == r8) goto L_0x00ca
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r9.<init>()     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r12.f140079n = r9     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r4 = r4 | 512(0x200, float:7.175E-43)
        L_0x00ca:
            java.util.List<java.lang.Integer> r9 = r12.f140079n     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            int r10 = r13.s()     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r9.add(r10)     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            goto L_0x0018
        L_0x00d9:
            r9 = r4 & 256(0x100, float:3.59E-43)
            if (r9 == r5) goto L_0x00e6
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r9.<init>()     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r12.f140078m = r9     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r4 = r4 | 256(0x100, float:3.59E-43)
        L_0x00e6:
            java.util.List<XI.q> r9 = r12.f140078m     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            eJ.s<XI.q> r10 = XI.q.f140132v     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            eJ.q r10 = r13.u(r10, r14)     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r9.add(r10)     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            goto L_0x0018
        L_0x00f3:
            int r9 = r12.f140069d     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r9 = r9 | r1
            r12.f140069d = r9     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            int r9 = r13.s()     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r12.f140070e = r9     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            goto L_0x0018
        L_0x0100:
            int r9 = r12.f140069d     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r9 = r9 | 64
            r12.f140069d = r9     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            int r9 = r13.s()     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r12.f140077l = r9     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            goto L_0x0018
        L_0x010e:
            int r9 = r12.f140069d     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r9 = r9 | 16
            r12.f140069d = r9     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            int r9 = r13.s()     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r12.f140074i = r9     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            goto L_0x0018
        L_0x011c:
            int r9 = r12.f140069d     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r9 = r9 | r8
            r12.f140069d = r9     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            int r9 = r13.s()     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r12.f140083r = r9     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            goto L_0x0018
        L_0x0129:
            int r9 = r12.f140069d     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r9 = r9 | r5
            r12.f140069d = r9     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            int r9 = r13.s()     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r12.f140082q = r9     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            goto L_0x0018
        L_0x0136:
            int r9 = r12.f140069d     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r11 = 128(0x80, float:1.794E-43)
            r9 = r9 & r11
            if (r9 != r11) goto L_0x0143
            XI.u r9 = r12.f140081p     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            XI.u$b r10 = r9.toBuilder()     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
        L_0x0143:
            eJ.s<XI.u> r9 = XI.u.f140236n     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            eJ.q r9 = r13.u(r9, r14)     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            XI.u r9 = (XI.u) r9     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r12.f140081p = r9     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            if (r10 == 0) goto L_0x0158
            r10.f(r9)     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            XI.u r9 = r10.r()     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r12.f140081p = r9     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
        L_0x0158:
            int r9 = r12.f140069d     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r9 = r9 | r11
            r12.f140069d = r9     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            goto L_0x0018
        L_0x015f:
            int r9 = r12.f140069d     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r9 = r9 & r6
            if (r9 != r6) goto L_0x016a
            XI.q r9 = r12.f140076k     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            XI.q$c r10 = r9.toBuilder()     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
        L_0x016a:
            eJ.s<XI.q> r9 = XI.q.f140132v     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            eJ.q r9 = r13.u(r9, r14)     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            XI.q r9 = (XI.q) r9     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r12.f140076k = r9     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            if (r10 == 0) goto L_0x017f
            r10.f(r9)     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            XI.q r9 = r10.r()     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r12.f140076k = r9     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
        L_0x017f:
            int r9 = r12.f140069d     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r9 = r9 | r6
            r12.f140069d = r9     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            goto L_0x0018
        L_0x0186:
            r9 = r4 & 32
            if (r9 == r6) goto L_0x0193
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r9.<init>()     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r12.f140075j = r9     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r4 = r4 | 32
        L_0x0193:
            java.util.List<XI.s> r9 = r12.f140075j     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            eJ.s<XI.s> r10 = XI.s.f140205o     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            eJ.q r10 = r13.u(r10, r14)     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r9.add(r10)     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            goto L_0x0018
        L_0x01a0:
            int r9 = r12.f140069d     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r11 = 8
            r9 = r9 & r11
            if (r9 != r11) goto L_0x01ad
            XI.q r9 = r12.f140073h     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            XI.q$c r10 = r9.toBuilder()     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
        L_0x01ad:
            eJ.s<XI.q> r9 = XI.q.f140132v     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            eJ.q r9 = r13.u(r9, r14)     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            XI.q r9 = (XI.q) r9     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r12.f140073h = r9     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            if (r10 == 0) goto L_0x01c2
            r10.f(r9)     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            XI.q r9 = r10.r()     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r12.f140073h = r9     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
        L_0x01c2:
            int r9 = r12.f140069d     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r9 = r9 | r11
            r12.f140069d = r9     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            goto L_0x0018
        L_0x01c9:
            int r9 = r12.f140069d     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r9 = r9 | 4
            r12.f140069d = r9     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            int r9 = r13.s()     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r12.f140072g = r9     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            goto L_0x0018
        L_0x01d7:
            int r9 = r12.f140069d     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r9 = r9 | 2
            r12.f140069d = r9     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            int r9 = r13.s()     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            r12.f140071f = r9     // Catch:{ k -> 0x0038, IOException -> 0x0035 }
            goto L_0x0018
        L_0x01e5:
            eJ.k r14 = new eJ.k     // Catch:{ all -> 0x0032 }
            java.lang.String r13 = r13.getMessage()     // Catch:{ all -> 0x0032 }
            r14.<init>(r13)     // Catch:{ all -> 0x0032 }
            eJ.k r13 = r14.i(r12)     // Catch:{ all -> 0x0032 }
            throw r13     // Catch:{ all -> 0x0032 }
        L_0x01f3:
            eJ.k r13 = r13.i(r12)     // Catch:{ all -> 0x0032 }
            throw r13     // Catch:{ all -> 0x0032 }
        L_0x01f8:
            r14 = r4 & 32
            if (r14 != r6) goto L_0x0204
            java.util.List<XI.s> r14 = r12.f140075j
            java.util.List r14 = java.util.Collections.unmodifiableList(r14)
            r12.f140075j = r14
        L_0x0204:
            r14 = r4 & 256(0x100, float:3.59E-43)
            if (r14 != r5) goto L_0x0210
            java.util.List<XI.q> r14 = r12.f140078m
            java.util.List r14 = java.util.Collections.unmodifiableList(r14)
            r12.f140078m = r14
        L_0x0210:
            r14 = r4 & 512(0x200, float:7.175E-43)
            if (r14 != r8) goto L_0x021c
            java.util.List<java.lang.Integer> r14 = r12.f140079n
            java.util.List r14 = java.util.Collections.unmodifiableList(r14)
            r12.f140079n = r14
        L_0x021c:
            r14 = r4 & 8192(0x2000, float:1.14794E-41)
            if (r14 != r7) goto L_0x0228
            java.util.List<java.lang.Integer> r14 = r12.f140084s
            java.util.List r14 = java.util.Collections.unmodifiableList(r14)
            r12.f140084s = r14
        L_0x0228:
            r2.I()     // Catch:{ IOException -> 0x022b, all -> 0x0232 }
        L_0x022b:
            eJ.d r14 = r0.g()
            r12.f140068c = r14
            goto L_0x023a
        L_0x0232:
            r13 = move-exception
            eJ.d r14 = r0.g()
            r12.f140068c = r14
            throw r13
        L_0x023a:
            r12.h()
            throw r13
        L_0x023e:
            r13 = r4 & 32
            if (r13 != r6) goto L_0x024a
            java.util.List<XI.s> r13 = r12.f140075j
            java.util.List r13 = java.util.Collections.unmodifiableList(r13)
            r12.f140075j = r13
        L_0x024a:
            r13 = r4 & 256(0x100, float:3.59E-43)
            if (r13 != r5) goto L_0x0256
            java.util.List<XI.q> r13 = r12.f140078m
            java.util.List r13 = java.util.Collections.unmodifiableList(r13)
            r12.f140078m = r13
        L_0x0256:
            r13 = r4 & 512(0x200, float:7.175E-43)
            if (r13 != r8) goto L_0x0262
            java.util.List<java.lang.Integer> r13 = r12.f140079n
            java.util.List r13 = java.util.Collections.unmodifiableList(r13)
            r12.f140079n = r13
        L_0x0262:
            r13 = r4 & 8192(0x2000, float:1.14794E-41)
            if (r13 != r7) goto L_0x026e
            java.util.List<java.lang.Integer> r13 = r12.f140084s
            java.util.List r13 = java.util.Collections.unmodifiableList(r13)
            r12.f140084s = r13
        L_0x026e:
            r2.I()     // Catch:{ IOException -> 0x0271, all -> 0x0278 }
        L_0x0271:
            eJ.d r13 = r0.g()
            r12.f140068c = r13
            goto L_0x0280
        L_0x0278:
            r13 = move-exception
            eJ.d r14 = r0.g()
            r12.f140068c = r14
            throw r13
        L_0x0280:
            r12.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: XI.n.<init>(eJ.e, eJ.g):void");
    }
}

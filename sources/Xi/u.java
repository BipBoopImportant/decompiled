package XI;

import XI.q;
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
import java.io.IOException;

public final class u extends C17198i.d<u> implements C17207r {

    /* renamed from: m  reason: collision with root package name */
    private static final u f140235m;

    /* renamed from: n  reason: collision with root package name */
    public static C17208s<u> f140236n = new a();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C17193d f140237c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public int f140238d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public int f140239e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public int f140240f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public q f140241g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public int f140242h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public q f140243i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public int f140244j;

    /* renamed from: k  reason: collision with root package name */
    private byte f140245k;

    /* renamed from: l  reason: collision with root package name */
    private int f140246l;

    static class a extends C17191b<u> {
        a() {
        }

        /* renamed from: m */
        public u c(C17194e eVar, C17196g gVar) {
            return new u(eVar, gVar);
        }
    }

    public static final class b extends C17198i.c<u, b> implements C17207r {

        /* renamed from: d  reason: collision with root package name */
        private int f140247d;

        /* renamed from: e  reason: collision with root package name */
        private int f140248e;

        /* renamed from: f  reason: collision with root package name */
        private int f140249f;

        /* renamed from: g  reason: collision with root package name */
        private q f140250g = q.S();

        /* renamed from: h  reason: collision with root package name */
        private int f140251h;

        /* renamed from: i  reason: collision with root package name */
        private q f140252i = q.S();

        /* renamed from: j  reason: collision with root package name */
        private int f140253j;

        private b() {
            w();
        }

        /* access modifiers changed from: private */
        public static b v() {
            return new b();
        }

        private void w() {
        }

        public b A(q qVar) {
            if ((this.f140247d & 4) != 4 || this.f140250g == q.S()) {
                this.f140250g = qVar;
            } else {
                this.f140250g = q.t0(this.f140250g).f(qVar).r();
            }
            this.f140247d |= 4;
            return this;
        }

        public b C(q qVar) {
            if ((this.f140247d & 16) != 16 || this.f140252i == q.S()) {
                this.f140252i = qVar;
            } else {
                this.f140252i = q.t0(this.f140252i).f(qVar).r();
            }
            this.f140247d |= 16;
            return this;
        }

        public b D(int i10) {
            this.f140247d |= 1;
            this.f140248e = i10;
            return this;
        }

        public b E(int i10) {
            this.f140247d |= 2;
            this.f140249f = i10;
            return this;
        }

        public b G(int i10) {
            this.f140247d |= 8;
            this.f140251h = i10;
            return this;
        }

        public b H(int i10) {
            this.f140247d |= 32;
            this.f140253j = i10;
            return this;
        }

        /* renamed from: p */
        public u g() {
            u r10 = r();
            if (r10.isInitialized()) {
                return r10;
            }
            throw C17190a.C3485a.c(r10);
        }

        public u r() {
            u uVar = new u((C17198i.c) this);
            int i10 = this.f140247d;
            int i11 = 1;
            if ((i10 & 1) != 1) {
                i11 = 0;
            }
            int unused = uVar.f140239e = this.f140248e;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            int unused2 = uVar.f140240f = this.f140249f;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            q unused3 = uVar.f140241g = this.f140250g;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            int unused4 = uVar.f140242h = this.f140251h;
            if ((i10 & 16) == 16) {
                i11 |= 16;
            }
            q unused5 = uVar.f140243i = this.f140252i;
            if ((i10 & 32) == 32) {
                i11 |= 32;
            }
            int unused6 = uVar.f140244j = this.f140253j;
            int unused7 = uVar.f140238d = i11;
            return uVar;
        }

        /* renamed from: u */
        public b d() {
            return v().f(r());
        }

        /* renamed from: y */
        public b f(u uVar) {
            if (uVar == u.D()) {
                return this;
            }
            if (uVar.L()) {
                D(uVar.F());
            }
            if (uVar.M()) {
                E(uVar.G());
            }
            if (uVar.N()) {
                A(uVar.H());
            }
            if (uVar.O()) {
                G(uVar.I());
            }
            if (uVar.P()) {
                C(uVar.J());
            }
            if (uVar.Q()) {
                H(uVar.K());
            }
            n(uVar);
            j(e().i(uVar.f140237c));
            return this;
        }

        /* renamed from: z */
        public b o1(C17194e eVar, C17196g gVar) {
            u uVar;
            u uVar2 = null;
            try {
                u c10 = u.f140236n.c(eVar, gVar);
                if (c10 != null) {
                    f(c10);
                }
                return this;
            } catch (C17200k e10) {
                uVar = (u) e10.a();
                throw e10;
            } catch (Throwable th2) {
                th = th2;
                uVar2 = uVar;
            }
            if (uVar2 != null) {
                f(uVar2);
            }
            throw th;
        }
    }

    static {
        u uVar = new u(true);
        f140235m = uVar;
        uVar.R();
    }

    public static u D() {
        return f140235m;
    }

    private void R() {
        this.f140239e = 0;
        this.f140240f = 0;
        this.f140241g = q.S();
        this.f140242h = 0;
        this.f140243i = q.S();
        this.f140244j = 0;
    }

    public static b S() {
        return b.v();
    }

    public static b T(u uVar) {
        return S().f(uVar);
    }

    /* renamed from: E */
    public u getDefaultInstanceForType() {
        return f140235m;
    }

    public int F() {
        return this.f140239e;
    }

    public int G() {
        return this.f140240f;
    }

    public q H() {
        return this.f140241g;
    }

    public int I() {
        return this.f140242h;
    }

    public q J() {
        return this.f140243i;
    }

    public int K() {
        return this.f140244j;
    }

    public boolean L() {
        return (this.f140238d & 1) == 1;
    }

    public boolean M() {
        return (this.f140238d & 2) == 2;
    }

    public boolean N() {
        return (this.f140238d & 4) == 4;
    }

    public boolean O() {
        return (this.f140238d & 8) == 8;
    }

    public boolean P() {
        return (this.f140238d & 16) == 16;
    }

    public boolean Q() {
        return (this.f140238d & 32) == 32;
    }

    /* renamed from: U */
    public b newBuilderForType() {
        return S();
    }

    /* renamed from: V */
    public b toBuilder() {
        return T(this);
    }

    public void a(C17195f fVar) {
        getSerializedSize();
        C17198i.d<MessageType>.defpackage.a t10 = t();
        if ((this.f140238d & 1) == 1) {
            fVar.a0(1, this.f140239e);
        }
        if ((this.f140238d & 2) == 2) {
            fVar.a0(2, this.f140240f);
        }
        if ((this.f140238d & 4) == 4) {
            fVar.d0(3, this.f140241g);
        }
        if ((this.f140238d & 16) == 16) {
            fVar.d0(4, this.f140243i);
        }
        if ((this.f140238d & 8) == 8) {
            fVar.a0(5, this.f140242h);
        }
        if ((this.f140238d & 32) == 32) {
            fVar.a0(6, this.f140244j);
        }
        t10.a(200, fVar);
        fVar.i0(this.f140237c);
    }

    public C17208s<u> getParserForType() {
        return f140236n;
    }

    public int getSerializedSize() {
        int i10 = this.f140246l;
        if (i10 != -1) {
            return i10;
        }
        int o10 = (this.f140238d & 1) == 1 ? C17195f.o(1, this.f140239e) : 0;
        if ((this.f140238d & 2) == 2) {
            o10 += C17195f.o(2, this.f140240f);
        }
        if ((this.f140238d & 4) == 4) {
            o10 += C17195f.s(3, this.f140241g);
        }
        if ((this.f140238d & 16) == 16) {
            o10 += C17195f.s(4, this.f140243i);
        }
        if ((this.f140238d & 8) == 8) {
            o10 += C17195f.o(5, this.f140242h);
        }
        if ((this.f140238d & 32) == 32) {
            o10 += C17195f.o(6, this.f140244j);
        }
        int o11 = o10 + o() + this.f140237c.size();
        this.f140246l = o11;
        return o11;
    }

    public final boolean isInitialized() {
        byte b10 = this.f140245k;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!M()) {
            this.f140245k = 0;
            return false;
        } else if (N() && !H().isInitialized()) {
            this.f140245k = 0;
            return false;
        } else if (P() && !J().isInitialized()) {
            this.f140245k = 0;
            return false;
        } else if (!n()) {
            this.f140245k = 0;
            return false;
        } else {
            this.f140245k = 1;
            return true;
        }
    }

    private u(C17198i.c<u, ?> cVar) {
        super(cVar);
        this.f140245k = -1;
        this.f140246l = -1;
        this.f140237c = cVar.e();
    }

    private u(boolean z10) {
        this.f140245k = -1;
        this.f140246l = -1;
        this.f140237c = C17193d.f143014a;
    }

    private u(C17194e eVar, C17196g gVar) {
        this.f140245k = -1;
        this.f140246l = -1;
        R();
        C17193d.b B10 = C17193d.B();
        C17195f J10 = C17195f.J(B10, 1);
        boolean z10 = false;
        while (!z10) {
            try {
                int K10 = eVar.K();
                if (K10 != 0) {
                    if (K10 == 8) {
                        this.f140238d |= 1;
                        this.f140239e = eVar.s();
                    } else if (K10 != 16) {
                        q.c cVar = null;
                        if (K10 == 26) {
                            cVar = (this.f140238d & 4) == 4 ? this.f140241g.toBuilder() : cVar;
                            q qVar = (q) eVar.u(q.f140132v, gVar);
                            this.f140241g = qVar;
                            if (cVar != null) {
                                cVar.f(qVar);
                                this.f140241g = cVar.r();
                            }
                            this.f140238d |= 4;
                        } else if (K10 == 34) {
                            cVar = (this.f140238d & 16) == 16 ? this.f140243i.toBuilder() : cVar;
                            q qVar2 = (q) eVar.u(q.f140132v, gVar);
                            this.f140243i = qVar2;
                            if (cVar != null) {
                                cVar.f(qVar2);
                                this.f140243i = cVar.r();
                            }
                            this.f140238d |= 16;
                        } else if (K10 == 40) {
                            this.f140238d |= 8;
                            this.f140242h = eVar.s();
                        } else if (K10 == 48) {
                            this.f140238d |= 32;
                            this.f140244j = eVar.s();
                        } else if (k(eVar, J10, gVar, K10)) {
                        }
                    } else {
                        this.f140238d |= 2;
                        this.f140240f = eVar.s();
                    }
                }
                z10 = true;
            } catch (C17200k e10) {
                throw e10.i(this);
            } catch (IOException e11) {
                throw new C17200k(e11.getMessage()).i(this);
            } catch (Throwable th2) {
                try {
                    J10.I();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f140237c = B10.g();
                    throw th3;
                }
                this.f140237c = B10.g();
                h();
                throw th2;
            }
        }
        try {
            J10.I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f140237c = B10.g();
            throw th4;
        }
        this.f140237c = B10.g();
        h();
    }
}

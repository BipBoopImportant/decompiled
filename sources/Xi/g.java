package XI;

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

public final class g extends C17198i.d<g> implements C17207r {

    /* renamed from: h  reason: collision with root package name */
    private static final g f139968h;

    /* renamed from: i  reason: collision with root package name */
    public static C17208s<g> f139969i = new a();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C17193d f139970c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public int f139971d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public int f139972e;

    /* renamed from: f  reason: collision with root package name */
    private byte f139973f;

    /* renamed from: g  reason: collision with root package name */
    private int f139974g;

    static class a extends C17191b<g> {
        a() {
        }

        /* renamed from: m */
        public g c(C17194e eVar, C17196g gVar) {
            return new g(eVar, gVar);
        }
    }

    public static final class b extends C17198i.c<g, b> implements C17207r {

        /* renamed from: d  reason: collision with root package name */
        private int f139975d;

        /* renamed from: e  reason: collision with root package name */
        private int f139976e;

        private b() {
            w();
        }

        /* access modifiers changed from: private */
        public static b v() {
            return new b();
        }

        private void w() {
        }

        public b A(int i10) {
            this.f139975d |= 1;
            this.f139976e = i10;
            return this;
        }

        /* renamed from: p */
        public g g() {
            g r10 = r();
            if (r10.isInitialized()) {
                return r10;
            }
            throw C17190a.C3485a.c(r10);
        }

        public g r() {
            g gVar = new g((C17198i.c) this);
            int i10 = 1;
            if ((this.f139975d & 1) != 1) {
                i10 = 0;
            }
            int unused = gVar.f139972e = this.f139976e;
            int unused2 = gVar.f139971d = i10;
            return gVar;
        }

        /* renamed from: u */
        public b d() {
            return v().f(r());
        }

        /* renamed from: y */
        public b f(g gVar) {
            if (gVar == g.y()) {
                return this;
            }
            if (gVar.B()) {
                A(gVar.A());
            }
            n(gVar);
            j(e().i(gVar.f139970c));
            return this;
        }

        /* renamed from: z */
        public b o1(C17194e eVar, C17196g gVar) {
            g gVar2;
            g gVar3 = null;
            try {
                g c10 = g.f139969i.c(eVar, gVar);
                if (c10 != null) {
                    f(c10);
                }
                return this;
            } catch (C17200k e10) {
                gVar2 = (g) e10.a();
                throw e10;
            } catch (Throwable th2) {
                th = th2;
                gVar3 = gVar2;
            }
            if (gVar3 != null) {
                f(gVar3);
            }
            throw th;
        }
    }

    static {
        g gVar = new g(true);
        f139968h = gVar;
        gVar.C();
    }

    private void C() {
        this.f139972e = 0;
    }

    public static b D() {
        return b.v();
    }

    public static b E(g gVar) {
        return D().f(gVar);
    }

    public static g y() {
        return f139968h;
    }

    public int A() {
        return this.f139972e;
    }

    public boolean B() {
        return (this.f139971d & 1) == 1;
    }

    /* renamed from: F */
    public b newBuilderForType() {
        return D();
    }

    /* renamed from: G */
    public b toBuilder() {
        return E(this);
    }

    public void a(C17195f fVar) {
        getSerializedSize();
        C17198i.d<MessageType>.defpackage.a t10 = t();
        if ((this.f139971d & 1) == 1) {
            fVar.a0(1, this.f139972e);
        }
        t10.a(200, fVar);
        fVar.i0(this.f139970c);
    }

    public C17208s<g> getParserForType() {
        return f139969i;
    }

    public int getSerializedSize() {
        int i10 = this.f139974g;
        if (i10 != -1) {
            return i10;
        }
        int o10 = ((this.f139971d & 1) == 1 ? C17195f.o(1, this.f139972e) : 0) + o() + this.f139970c.size();
        this.f139974g = o10;
        return o10;
    }

    public final boolean isInitialized() {
        byte b10 = this.f139973f;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!n()) {
            this.f139973f = 0;
            return false;
        }
        this.f139973f = 1;
        return true;
    }

    /* renamed from: z */
    public g getDefaultInstanceForType() {
        return f139968h;
    }

    private g(C17198i.c<g, ?> cVar) {
        super(cVar);
        this.f139973f = -1;
        this.f139974g = -1;
        this.f139970c = cVar.e();
    }

    private g(boolean z10) {
        this.f139973f = -1;
        this.f139974g = -1;
        this.f139970c = C17193d.f143014a;
    }

    private g(C17194e eVar, C17196g gVar) {
        this.f139973f = -1;
        this.f139974g = -1;
        C();
        C17193d.b B10 = C17193d.B();
        C17195f J10 = C17195f.J(B10, 1);
        boolean z10 = false;
        while (!z10) {
            try {
                int K10 = eVar.K();
                if (K10 != 0) {
                    if (K10 == 8) {
                        this.f139971d |= 1;
                        this.f139972e = eVar.s();
                    } else if (k(eVar, J10, gVar, K10)) {
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
                    this.f139970c = B10.g();
                    throw th3;
                }
                this.f139970c = B10.g();
                h();
                throw th2;
            }
        }
        try {
            J10.I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f139970c = B10.g();
            throw th4;
        }
        this.f139970c = B10.g();
        h();
    }
}

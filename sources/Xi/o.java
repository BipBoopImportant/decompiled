package XI;

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

public final class o extends C17198i implements C17207r {

    /* renamed from: f  reason: collision with root package name */
    private static final o f140102f;

    /* renamed from: g  reason: collision with root package name */
    public static C17208s<o> f140103g = new a();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C17193d f140104b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public List<c> f140105c;

    /* renamed from: d  reason: collision with root package name */
    private byte f140106d;

    /* renamed from: e  reason: collision with root package name */
    private int f140107e;

    static class a extends C17191b<o> {
        a() {
        }

        /* renamed from: m */
        public o c(C17194e eVar, C17196g gVar) {
            return new o(eVar, gVar);
        }
    }

    public static final class b extends C17198i.b<o, b> implements C17207r {

        /* renamed from: b  reason: collision with root package name */
        private int f140108b;

        /* renamed from: c  reason: collision with root package name */
        private List<c> f140109c = Collections.emptyList();

        private b() {
            r();
        }

        /* access modifiers changed from: private */
        public static b o() {
            return new b();
        }

        private void p() {
            if ((this.f140108b & 1) != 1) {
                this.f140109c = new ArrayList(this.f140109c);
                this.f140108b |= 1;
            }
        }

        private void r() {
        }

        /* renamed from: l */
        public o g() {
            o m10 = m();
            if (m10.isInitialized()) {
                return m10;
            }
            throw C17190a.C3485a.c(m10);
        }

        public o m() {
            o oVar = new o((C17198i.b) this);
            if ((this.f140108b & 1) == 1) {
                this.f140109c = Collections.unmodifiableList(this.f140109c);
                this.f140108b &= -2;
            }
            List unused = oVar.f140105c = this.f140109c;
            return oVar;
        }

        /* renamed from: n */
        public b d() {
            return o().f(m());
        }

        /* renamed from: u */
        public b f(o oVar) {
            if (oVar == o.p()) {
                return this;
            }
            if (!oVar.f140105c.isEmpty()) {
                if (this.f140109c.isEmpty()) {
                    this.f140109c = oVar.f140105c;
                    this.f140108b &= -2;
                } else {
                    p();
                    this.f140109c.addAll(oVar.f140105c);
                }
            }
            j(e().i(oVar.f140104b));
            return this;
        }

        /* renamed from: v */
        public b o1(C17194e eVar, C17196g gVar) {
            o oVar;
            o oVar2 = null;
            try {
                o c10 = o.f140103g.c(eVar, gVar);
                if (c10 != null) {
                    f(c10);
                }
                return this;
            } catch (C17200k e10) {
                oVar = (o) e10.a();
                throw e10;
            } catch (Throwable th2) {
                th = th2;
                oVar2 = oVar;
            }
            if (oVar2 != null) {
                f(oVar2);
            }
            throw th;
        }
    }

    static {
        o oVar = new o(true);
        f140102f = oVar;
        oVar.s();
    }

    public static o p() {
        return f140102f;
    }

    private void s() {
        this.f140105c = Collections.emptyList();
    }

    public static b t() {
        return b.o();
    }

    public static b u(o oVar) {
        return t().f(oVar);
    }

    public void a(C17195f fVar) {
        getSerializedSize();
        for (int i10 = 0; i10 < this.f140105c.size(); i10++) {
            fVar.d0(1, this.f140105c.get(i10));
        }
        fVar.i0(this.f140104b);
    }

    public C17208s<o> getParserForType() {
        return f140103g;
    }

    public int getSerializedSize() {
        int i10 = this.f140107e;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f140105c.size(); i12++) {
            i11 += C17195f.s(1, this.f140105c.get(i12));
        }
        int size = i11 + this.f140104b.size();
        this.f140107e = size;
        return size;
    }

    public final boolean isInitialized() {
        byte b10 = this.f140106d;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < r(); i10++) {
            if (!q(i10).isInitialized()) {
                this.f140106d = 0;
                return false;
            }
        }
        this.f140106d = 1;
        return true;
    }

    public c q(int i10) {
        return this.f140105c.get(i10);
    }

    public int r() {
        return this.f140105c.size();
    }

    /* renamed from: v */
    public b newBuilderForType() {
        return t();
    }

    /* renamed from: w */
    public b toBuilder() {
        return u(this);
    }

    public static final class c extends C17198i implements C17207r {

        /* renamed from: i  reason: collision with root package name */
        private static final c f140110i;

        /* renamed from: j  reason: collision with root package name */
        public static C17208s<c> f140111j = new a();
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final C17193d f140112b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public int f140113c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public int f140114d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public int f140115e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public C3436c f140116f;

        /* renamed from: g  reason: collision with root package name */
        private byte f140117g;

        /* renamed from: h  reason: collision with root package name */
        private int f140118h;

        static class a extends C17191b<c> {
            a() {
            }

            /* renamed from: m */
            public c c(C17194e eVar, C17196g gVar) {
                return new c(eVar, gVar);
            }
        }

        public static final class b extends C17198i.b<c, b> implements C17207r {

            /* renamed from: b  reason: collision with root package name */
            private int f140119b;

            /* renamed from: c  reason: collision with root package name */
            private int f140120c = -1;

            /* renamed from: d  reason: collision with root package name */
            private int f140121d;

            /* renamed from: e  reason: collision with root package name */
            private C3436c f140122e = C3436c.PACKAGE;

            private b() {
                p();
            }

            /* access modifiers changed from: private */
            public static b o() {
                return new b();
            }

            private void p() {
            }

            /* renamed from: l */
            public c g() {
                c m10 = m();
                if (m10.isInitialized()) {
                    return m10;
                }
                throw C17190a.C3485a.c(m10);
            }

            public c m() {
                c cVar = new c((C17198i.b) this);
                int i10 = this.f140119b;
                int i11 = 1;
                if ((i10 & 1) != 1) {
                    i11 = 0;
                }
                int unused = cVar.f140114d = this.f140120c;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                int unused2 = cVar.f140115e = this.f140121d;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                C3436c unused3 = cVar.f140116f = this.f140122e;
                int unused4 = cVar.f140113c = i11;
                return cVar;
            }

            /* renamed from: n */
            public b d() {
                return o().f(m());
            }

            /* renamed from: r */
            public b f(c cVar) {
                if (cVar == c.r()) {
                    return this;
                }
                if (cVar.w()) {
                    w(cVar.t());
                }
                if (cVar.x()) {
                    y(cVar.u());
                }
                if (cVar.v()) {
                    v(cVar.s());
                }
                j(e().i(cVar.f140112b));
                return this;
            }

            /* renamed from: u */
            public b o1(C17194e eVar, C17196g gVar) {
                c cVar;
                c cVar2 = null;
                try {
                    c c10 = c.f140111j.c(eVar, gVar);
                    if (c10 != null) {
                        f(c10);
                    }
                    return this;
                } catch (C17200k e10) {
                    cVar = (c) e10.a();
                    throw e10;
                } catch (Throwable th2) {
                    th = th2;
                    cVar2 = cVar;
                }
                if (cVar2 != null) {
                    f(cVar2);
                }
                throw th;
            }

            public b v(C3436c cVar) {
                cVar.getClass();
                this.f140119b |= 4;
                this.f140122e = cVar;
                return this;
            }

            public b w(int i10) {
                this.f140119b |= 1;
                this.f140120c = i10;
                return this;
            }

            public b y(int i10) {
                this.f140119b |= 2;
                this.f140121d = i10;
                return this;
            }
        }

        /* renamed from: XI.o$c$c  reason: collision with other inner class name */
        public enum C3436c implements C17199j.a {
            CLASS(0, 0),
            PACKAGE(1, 1),
            LOCAL(2, 2);
            
            private static C17199j.b<C3436c> internalValueMap;
            private final int value;

            /* renamed from: XI.o$c$c$a */
            static class a implements C17199j.b<C3436c> {
                a() {
                }

                /* renamed from: b */
                public C3436c a(int i10) {
                    return C3436c.a(i10);
                }
            }

            static {
                internalValueMap = new a();
            }

            private C3436c(int i10, int i11) {
                this.value = i11;
            }

            public static C3436c a(int i10) {
                if (i10 == 0) {
                    return CLASS;
                }
                if (i10 == 1) {
                    return PACKAGE;
                }
                if (i10 != 2) {
                    return null;
                }
                return LOCAL;
            }

            public final int d() {
                return this.value;
            }
        }

        static {
            c cVar = new c(true);
            f140110i = cVar;
            cVar.y();
        }

        public static b A(c cVar) {
            return z().f(cVar);
        }

        public static c r() {
            return f140110i;
        }

        private void y() {
            this.f140114d = -1;
            this.f140115e = 0;
            this.f140116f = C3436c.PACKAGE;
        }

        public static b z() {
            return b.o();
        }

        /* renamed from: B */
        public b newBuilderForType() {
            return z();
        }

        /* renamed from: C */
        public b toBuilder() {
            return A(this);
        }

        public void a(C17195f fVar) {
            getSerializedSize();
            if ((this.f140113c & 1) == 1) {
                fVar.a0(1, this.f140114d);
            }
            if ((this.f140113c & 2) == 2) {
                fVar.a0(2, this.f140115e);
            }
            if ((this.f140113c & 4) == 4) {
                fVar.S(3, this.f140116f.d());
            }
            fVar.i0(this.f140112b);
        }

        public C17208s<c> getParserForType() {
            return f140111j;
        }

        public int getSerializedSize() {
            int i10 = this.f140118h;
            if (i10 != -1) {
                return i10;
            }
            int o10 = (this.f140113c & 1) == 1 ? C17195f.o(1, this.f140114d) : 0;
            if ((this.f140113c & 2) == 2) {
                o10 += C17195f.o(2, this.f140115e);
            }
            if ((this.f140113c & 4) == 4) {
                o10 += C17195f.h(3, this.f140116f.d());
            }
            int size = o10 + this.f140112b.size();
            this.f140118h = size;
            return size;
        }

        public final boolean isInitialized() {
            byte b10 = this.f140117g;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (!x()) {
                this.f140117g = 0;
                return false;
            }
            this.f140117g = 1;
            return true;
        }

        public C3436c s() {
            return this.f140116f;
        }

        public int t() {
            return this.f140114d;
        }

        public int u() {
            return this.f140115e;
        }

        public boolean v() {
            return (this.f140113c & 4) == 4;
        }

        public boolean w() {
            return (this.f140113c & 1) == 1;
        }

        public boolean x() {
            return (this.f140113c & 2) == 2;
        }

        private c(C17198i.b bVar) {
            super(bVar);
            this.f140117g = -1;
            this.f140118h = -1;
            this.f140112b = bVar.e();
        }

        private c(boolean z10) {
            this.f140117g = -1;
            this.f140118h = -1;
            this.f140112b = C17193d.f143014a;
        }

        private c(C17194e eVar, C17196g gVar) {
            this.f140117g = -1;
            this.f140118h = -1;
            y();
            C17193d.b B10 = C17193d.B();
            C17195f J10 = C17195f.J(B10, 1);
            boolean z10 = false;
            while (!z10) {
                try {
                    int K10 = eVar.K();
                    if (K10 != 0) {
                        if (K10 == 8) {
                            this.f140113c |= 1;
                            this.f140114d = eVar.s();
                        } else if (K10 == 16) {
                            this.f140113c |= 2;
                            this.f140115e = eVar.s();
                        } else if (K10 == 24) {
                            int n10 = eVar.n();
                            C3436c a10 = C3436c.a(n10);
                            if (a10 == null) {
                                J10.o0(K10);
                                J10.o0(n10);
                            } else {
                                this.f140113c |= 4;
                                this.f140116f = a10;
                            }
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
                        this.f140112b = B10.g();
                        throw th3;
                    }
                    this.f140112b = B10.g();
                    h();
                    throw th2;
                }
            }
            try {
                J10.I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f140112b = B10.g();
                throw th4;
            }
            this.f140112b = B10.g();
            h();
        }
    }

    private o(C17198i.b bVar) {
        super(bVar);
        this.f140106d = -1;
        this.f140107e = -1;
        this.f140104b = bVar.e();
    }

    private o(boolean z10) {
        this.f140106d = -1;
        this.f140107e = -1;
        this.f140104b = C17193d.f143014a;
    }

    private o(C17194e eVar, C17196g gVar) {
        this.f140106d = -1;
        this.f140107e = -1;
        s();
        C17193d.b B10 = C17193d.B();
        C17195f J10 = C17195f.J(B10, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                int K10 = eVar.K();
                if (K10 != 0) {
                    if (K10 == 10) {
                        if (!z11) {
                            this.f140105c = new ArrayList();
                            z11 = true;
                        }
                        this.f140105c.add(eVar.u(c.f140111j, gVar));
                    } else if (k(eVar, J10, gVar, K10)) {
                    }
                }
                z10 = true;
            } catch (C17200k e10) {
                throw e10.i(this);
            } catch (IOException e11) {
                throw new C17200k(e11.getMessage()).i(this);
            } catch (Throwable th2) {
                if (z11) {
                    this.f140105c = Collections.unmodifiableList(this.f140105c);
                }
                try {
                    J10.I();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f140104b = B10.g();
                    throw th3;
                }
                this.f140104b = B10.g();
                h();
                throw th2;
            }
        }
        if (z11) {
            this.f140105c = Collections.unmodifiableList(this.f140105c);
        }
        try {
            J10.I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f140104b = B10.g();
            throw th4;
        }
        this.f140104b = B10.g();
        h();
    }
}

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

public final class v extends C17198i implements C17207r {

    /* renamed from: l  reason: collision with root package name */
    private static final v f140254l;

    /* renamed from: m  reason: collision with root package name */
    public static C17208s<v> f140255m = new a();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C17193d f140256b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public int f140257c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public int f140258d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public int f140259e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public c f140260f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public int f140261g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public int f140262h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public d f140263i;

    /* renamed from: j  reason: collision with root package name */
    private byte f140264j;

    /* renamed from: k  reason: collision with root package name */
    private int f140265k;

    static class a extends C17191b<v> {
        a() {
        }

        /* renamed from: m */
        public v c(C17194e eVar, C17196g gVar) {
            return new v(eVar, gVar);
        }
    }

    public static final class b extends C17198i.b<v, b> implements C17207r {

        /* renamed from: b  reason: collision with root package name */
        private int f140266b;

        /* renamed from: c  reason: collision with root package name */
        private int f140267c;

        /* renamed from: d  reason: collision with root package name */
        private int f140268d;

        /* renamed from: e  reason: collision with root package name */
        private c f140269e = c.ERROR;

        /* renamed from: f  reason: collision with root package name */
        private int f140270f;

        /* renamed from: g  reason: collision with root package name */
        private int f140271g;

        /* renamed from: h  reason: collision with root package name */
        private d f140272h = d.LANGUAGE_VERSION;

        private b() {
            p();
        }

        /* access modifiers changed from: private */
        public static b o() {
            return new b();
        }

        private void p() {
        }

        public b A(int i10) {
            this.f140266b |= 2;
            this.f140268d = i10;
            return this;
        }

        public b C(d dVar) {
            dVar.getClass();
            this.f140266b |= 32;
            this.f140272h = dVar;
            return this;
        }

        /* renamed from: l */
        public v g() {
            v m10 = m();
            if (m10.isInitialized()) {
                return m10;
            }
            throw C17190a.C3485a.c(m10);
        }

        public v m() {
            v vVar = new v((C17198i.b) this);
            int i10 = this.f140266b;
            int i11 = 1;
            if ((i10 & 1) != 1) {
                i11 = 0;
            }
            int unused = vVar.f140258d = this.f140267c;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            int unused2 = vVar.f140259e = this.f140268d;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            c unused3 = vVar.f140260f = this.f140269e;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            int unused4 = vVar.f140261g = this.f140270f;
            if ((i10 & 16) == 16) {
                i11 |= 16;
            }
            int unused5 = vVar.f140262h = this.f140271g;
            if ((i10 & 32) == 32) {
                i11 |= 32;
            }
            d unused6 = vVar.f140263i = this.f140272h;
            int unused7 = vVar.f140257c = i11;
            return vVar;
        }

        /* renamed from: n */
        public b d() {
            return o().f(m());
        }

        /* renamed from: r */
        public b f(v vVar) {
            if (vVar == v.u()) {
                return this;
            }
            if (vVar.E()) {
                z(vVar.y());
            }
            if (vVar.F()) {
                A(vVar.z());
            }
            if (vVar.C()) {
                w(vVar.w());
            }
            if (vVar.B()) {
                v(vVar.v());
            }
            if (vVar.D()) {
                y(vVar.x());
            }
            if (vVar.G()) {
                C(vVar.A());
            }
            j(e().i(vVar.f140256b));
            return this;
        }

        /* renamed from: u */
        public b o1(C17194e eVar, C17196g gVar) {
            v vVar;
            v vVar2 = null;
            try {
                v c10 = v.f140255m.c(eVar, gVar);
                if (c10 != null) {
                    f(c10);
                }
                return this;
            } catch (C17200k e10) {
                vVar = (v) e10.a();
                throw e10;
            } catch (Throwable th2) {
                th = th2;
                vVar2 = vVar;
            }
            if (vVar2 != null) {
                f(vVar2);
            }
            throw th;
        }

        public b v(int i10) {
            this.f140266b |= 8;
            this.f140270f = i10;
            return this;
        }

        public b w(c cVar) {
            cVar.getClass();
            this.f140266b |= 4;
            this.f140269e = cVar;
            return this;
        }

        public b y(int i10) {
            this.f140266b |= 16;
            this.f140271g = i10;
            return this;
        }

        public b z(int i10) {
            this.f140266b |= 1;
            this.f140267c = i10;
            return this;
        }
    }

    public enum c implements C17199j.a {
        WARNING(0, 0),
        ERROR(1, 1),
        HIDDEN(2, 2);
        
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
                return WARNING;
            }
            if (i10 == 1) {
                return ERROR;
            }
            if (i10 != 2) {
                return null;
            }
            return HIDDEN;
        }

        public final int d() {
            return this.value;
        }
    }

    public enum d implements C17199j.a {
        LANGUAGE_VERSION(0, 0),
        COMPILER_VERSION(1, 1),
        API_VERSION(2, 2);
        
        private static C17199j.b<d> internalValueMap;
        private final int value;

        static class a implements C17199j.b<d> {
            a() {
            }

            /* renamed from: b */
            public d a(int i10) {
                return d.a(i10);
            }
        }

        static {
            internalValueMap = new a();
        }

        private d(int i10, int i11) {
            this.value = i11;
        }

        public static d a(int i10) {
            if (i10 == 0) {
                return LANGUAGE_VERSION;
            }
            if (i10 == 1) {
                return COMPILER_VERSION;
            }
            if (i10 != 2) {
                return null;
            }
            return API_VERSION;
        }

        public final int d() {
            return this.value;
        }
    }

    static {
        v vVar = new v(true);
        f140254l = vVar;
        vVar.H();
    }

    private void H() {
        this.f140258d = 0;
        this.f140259e = 0;
        this.f140260f = c.ERROR;
        this.f140261g = 0;
        this.f140262h = 0;
        this.f140263i = d.LANGUAGE_VERSION;
    }

    public static b I() {
        return b.o();
    }

    public static b J(v vVar) {
        return I().f(vVar);
    }

    public static v u() {
        return f140254l;
    }

    public d A() {
        return this.f140263i;
    }

    public boolean B() {
        return (this.f140257c & 8) == 8;
    }

    public boolean C() {
        return (this.f140257c & 4) == 4;
    }

    public boolean D() {
        return (this.f140257c & 16) == 16;
    }

    public boolean E() {
        return (this.f140257c & 1) == 1;
    }

    public boolean F() {
        return (this.f140257c & 2) == 2;
    }

    public boolean G() {
        return (this.f140257c & 32) == 32;
    }

    /* renamed from: K */
    public b newBuilderForType() {
        return I();
    }

    /* renamed from: L */
    public b toBuilder() {
        return J(this);
    }

    public void a(C17195f fVar) {
        getSerializedSize();
        if ((this.f140257c & 1) == 1) {
            fVar.a0(1, this.f140258d);
        }
        if ((this.f140257c & 2) == 2) {
            fVar.a0(2, this.f140259e);
        }
        if ((this.f140257c & 4) == 4) {
            fVar.S(3, this.f140260f.d());
        }
        if ((this.f140257c & 8) == 8) {
            fVar.a0(4, this.f140261g);
        }
        if ((this.f140257c & 16) == 16) {
            fVar.a0(5, this.f140262h);
        }
        if ((this.f140257c & 32) == 32) {
            fVar.S(6, this.f140263i.d());
        }
        fVar.i0(this.f140256b);
    }

    public C17208s<v> getParserForType() {
        return f140255m;
    }

    public int getSerializedSize() {
        int i10 = this.f140265k;
        if (i10 != -1) {
            return i10;
        }
        int o10 = (this.f140257c & 1) == 1 ? C17195f.o(1, this.f140258d) : 0;
        if ((this.f140257c & 2) == 2) {
            o10 += C17195f.o(2, this.f140259e);
        }
        if ((this.f140257c & 4) == 4) {
            o10 += C17195f.h(3, this.f140260f.d());
        }
        if ((this.f140257c & 8) == 8) {
            o10 += C17195f.o(4, this.f140261g);
        }
        if ((this.f140257c & 16) == 16) {
            o10 += C17195f.o(5, this.f140262h);
        }
        if ((this.f140257c & 32) == 32) {
            o10 += C17195f.h(6, this.f140263i.d());
        }
        int size = o10 + this.f140256b.size();
        this.f140265k = size;
        return size;
    }

    public final boolean isInitialized() {
        byte b10 = this.f140264j;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f140264j = 1;
        return true;
    }

    public int v() {
        return this.f140261g;
    }

    public c w() {
        return this.f140260f;
    }

    public int x() {
        return this.f140262h;
    }

    public int y() {
        return this.f140258d;
    }

    public int z() {
        return this.f140259e;
    }

    private v(C17198i.b bVar) {
        super(bVar);
        this.f140264j = -1;
        this.f140265k = -1;
        this.f140256b = bVar.e();
    }

    private v(boolean z10) {
        this.f140264j = -1;
        this.f140265k = -1;
        this.f140256b = C17193d.f143014a;
    }

    private v(C17194e eVar, C17196g gVar) {
        this.f140264j = -1;
        this.f140265k = -1;
        H();
        C17193d.b B10 = C17193d.B();
        C17195f J10 = C17195f.J(B10, 1);
        boolean z10 = false;
        while (!z10) {
            try {
                int K10 = eVar.K();
                if (K10 != 0) {
                    if (K10 == 8) {
                        this.f140257c |= 1;
                        this.f140258d = eVar.s();
                    } else if (K10 == 16) {
                        this.f140257c |= 2;
                        this.f140259e = eVar.s();
                    } else if (K10 == 24) {
                        int n10 = eVar.n();
                        c a10 = c.a(n10);
                        if (a10 == null) {
                            J10.o0(K10);
                            J10.o0(n10);
                        } else {
                            this.f140257c |= 4;
                            this.f140260f = a10;
                        }
                    } else if (K10 == 32) {
                        this.f140257c |= 8;
                        this.f140261g = eVar.s();
                    } else if (K10 == 40) {
                        this.f140257c |= 16;
                        this.f140262h = eVar.s();
                    } else if (K10 == 48) {
                        int n11 = eVar.n();
                        d a11 = d.a(n11);
                        if (a11 == null) {
                            J10.o0(K10);
                            J10.o0(n11);
                        } else {
                            this.f140257c |= 32;
                            this.f140263i = a11;
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
                    this.f140256b = B10.g();
                    throw th3;
                }
                this.f140256b = B10.g();
                h();
                throw th2;
            }
        }
        try {
            J10.I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f140256b = B10.g();
            throw th4;
        }
        this.f140256b = B10.g();
        h();
    }
}

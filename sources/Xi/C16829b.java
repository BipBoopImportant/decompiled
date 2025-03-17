package XI;

import com.oppwa.mobile.connect.BuildConfig;
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

/* renamed from: XI.b  reason: case insensitive filesystem */
public final class C16829b extends C17198i implements C17207r {

    /* renamed from: h  reason: collision with root package name */
    private static final C16829b f139820h;

    /* renamed from: i  reason: collision with root package name */
    public static C17208s<C16829b> f139821i = new a();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C17193d f139822b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public int f139823c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public int f139824d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public List<C3431b> f139825e;

    /* renamed from: f  reason: collision with root package name */
    private byte f139826f;

    /* renamed from: g  reason: collision with root package name */
    private int f139827g;

    /* renamed from: XI.b$a */
    static class a extends C17191b<C16829b> {
        a() {
        }

        /* renamed from: m */
        public C16829b c(C17194e eVar, C17196g gVar) {
            return new C16829b(eVar, gVar);
        }
    }

    /* renamed from: XI.b$b  reason: collision with other inner class name */
    public static final class C3431b extends C17198i implements C17207r {

        /* renamed from: h  reason: collision with root package name */
        private static final C3431b f139828h;

        /* renamed from: i  reason: collision with root package name */
        public static C17208s<C3431b> f139829i = new a();
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final C17193d f139830b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public int f139831c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public int f139832d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public c f139833e;

        /* renamed from: f  reason: collision with root package name */
        private byte f139834f;

        /* renamed from: g  reason: collision with root package name */
        private int f139835g;

        /* renamed from: XI.b$b$a */
        static class a extends C17191b<C3431b> {
            a() {
            }

            /* renamed from: m */
            public C3431b c(C17194e eVar, C17196g gVar) {
                return new C3431b(eVar, gVar);
            }
        }

        /* renamed from: XI.b$b$b  reason: collision with other inner class name */
        public static final class C3432b extends C17198i.b<C3431b, C3432b> implements C17207r {

            /* renamed from: b  reason: collision with root package name */
            private int f139836b;

            /* renamed from: c  reason: collision with root package name */
            private int f139837c;

            /* renamed from: d  reason: collision with root package name */
            private c f139838d = c.G();

            private C3432b() {
                p();
            }

            /* access modifiers changed from: private */
            public static C3432b o() {
                return new C3432b();
            }

            private void p() {
            }

            /* renamed from: l */
            public C3431b g() {
                C3431b m10 = m();
                if (m10.isInitialized()) {
                    return m10;
                }
                throw C17190a.C3485a.c(m10);
            }

            public C3431b m() {
                C3431b bVar = new C3431b((C17198i.b) this);
                int i10 = this.f139836b;
                int i11 = 1;
                if ((i10 & 1) != 1) {
                    i11 = 0;
                }
                int unused = bVar.f139832d = this.f139837c;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                c unused2 = bVar.f139833e = this.f139838d;
                int unused3 = bVar.f139831c = i11;
                return bVar;
            }

            /* renamed from: n */
            public C3432b d() {
                return o().f(m());
            }

            /* renamed from: r */
            public C3432b f(C3431b bVar) {
                if (bVar == C3431b.q()) {
                    return this;
                }
                if (bVar.t()) {
                    w(bVar.r());
                }
                if (bVar.u()) {
                    v(bVar.s());
                }
                j(e().i(bVar.f139830b));
                return this;
            }

            /* renamed from: u */
            public C3432b o1(C17194e eVar, C17196g gVar) {
                C3431b bVar;
                C3431b bVar2 = null;
                try {
                    C3431b c10 = C3431b.f139829i.c(eVar, gVar);
                    if (c10 != null) {
                        f(c10);
                    }
                    return this;
                } catch (C17200k e10) {
                    bVar = (C3431b) e10.a();
                    throw e10;
                } catch (Throwable th2) {
                    th = th2;
                    bVar2 = bVar;
                }
                if (bVar2 != null) {
                    f(bVar2);
                }
                throw th;
            }

            public C3432b v(c cVar) {
                if ((this.f139836b & 2) != 2 || this.f139838d == c.G()) {
                    this.f139838d = cVar;
                } else {
                    this.f139838d = c.a0(this.f139838d).f(cVar).m();
                }
                this.f139836b |= 2;
                return this;
            }

            public C3432b w(int i10) {
                this.f139836b |= 1;
                this.f139837c = i10;
                return this;
            }
        }

        static {
            C3431b bVar = new C3431b(true);
            f139828h = bVar;
            bVar.v();
        }

        public static C3431b q() {
            return f139828h;
        }

        private void v() {
            this.f139832d = 0;
            this.f139833e = c.G();
        }

        public static C3432b w() {
            return C3432b.o();
        }

        public static C3432b x(C3431b bVar) {
            return w().f(bVar);
        }

        public void a(C17195f fVar) {
            getSerializedSize();
            if ((this.f139831c & 1) == 1) {
                fVar.a0(1, this.f139832d);
            }
            if ((this.f139831c & 2) == 2) {
                fVar.d0(2, this.f139833e);
            }
            fVar.i0(this.f139830b);
        }

        public C17208s<C3431b> getParserForType() {
            return f139829i;
        }

        public int getSerializedSize() {
            int i10 = this.f139835g;
            if (i10 != -1) {
                return i10;
            }
            int o10 = (this.f139831c & 1) == 1 ? C17195f.o(1, this.f139832d) : 0;
            if ((this.f139831c & 2) == 2) {
                o10 += C17195f.s(2, this.f139833e);
            }
            int size = o10 + this.f139830b.size();
            this.f139835g = size;
            return size;
        }

        public final boolean isInitialized() {
            byte b10 = this.f139834f;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (!t()) {
                this.f139834f = 0;
                return false;
            } else if (!u()) {
                this.f139834f = 0;
                return false;
            } else if (!s().isInitialized()) {
                this.f139834f = 0;
                return false;
            } else {
                this.f139834f = 1;
                return true;
            }
        }

        public int r() {
            return this.f139832d;
        }

        public c s() {
            return this.f139833e;
        }

        public boolean t() {
            return (this.f139831c & 1) == 1;
        }

        public boolean u() {
            return (this.f139831c & 2) == 2;
        }

        /* renamed from: y */
        public C3432b newBuilderForType() {
            return w();
        }

        /* renamed from: z */
        public C3432b toBuilder() {
            return x(this);
        }

        /* renamed from: XI.b$b$c */
        public static final class c extends C17198i implements C17207r {

            /* renamed from: q  reason: collision with root package name */
            private static final c f139839q;

            /* renamed from: r  reason: collision with root package name */
            public static C17208s<c> f139840r = new a();
            /* access modifiers changed from: private */

            /* renamed from: b  reason: collision with root package name */
            public final C17193d f139841b;
            /* access modifiers changed from: private */

            /* renamed from: c  reason: collision with root package name */
            public int f139842c;
            /* access modifiers changed from: private */

            /* renamed from: d  reason: collision with root package name */
            public C3434c f139843d;
            /* access modifiers changed from: private */

            /* renamed from: e  reason: collision with root package name */
            public long f139844e;
            /* access modifiers changed from: private */

            /* renamed from: f  reason: collision with root package name */
            public float f139845f;
            /* access modifiers changed from: private */

            /* renamed from: g  reason: collision with root package name */
            public double f139846g;
            /* access modifiers changed from: private */

            /* renamed from: h  reason: collision with root package name */
            public int f139847h;
            /* access modifiers changed from: private */

            /* renamed from: i  reason: collision with root package name */
            public int f139848i;
            /* access modifiers changed from: private */

            /* renamed from: j  reason: collision with root package name */
            public int f139849j;
            /* access modifiers changed from: private */

            /* renamed from: k  reason: collision with root package name */
            public C16829b f139850k;
            /* access modifiers changed from: private */

            /* renamed from: l  reason: collision with root package name */
            public List<c> f139851l;
            /* access modifiers changed from: private */

            /* renamed from: m  reason: collision with root package name */
            public int f139852m;
            /* access modifiers changed from: private */

            /* renamed from: n  reason: collision with root package name */
            public int f139853n;

            /* renamed from: o  reason: collision with root package name */
            private byte f139854o;

            /* renamed from: p  reason: collision with root package name */
            private int f139855p;

            /* renamed from: XI.b$b$c$a */
            static class a extends C17191b<c> {
                a() {
                }

                /* renamed from: m */
                public c c(C17194e eVar, C17196g gVar) {
                    return new c(eVar, gVar);
                }
            }

            /* renamed from: XI.b$b$c$b  reason: collision with other inner class name */
            public static final class C3433b extends C17198i.b<c, C3433b> implements C17207r {

                /* renamed from: b  reason: collision with root package name */
                private int f139856b;

                /* renamed from: c  reason: collision with root package name */
                private C3434c f139857c = C3434c.BYTE;

                /* renamed from: d  reason: collision with root package name */
                private long f139858d;

                /* renamed from: e  reason: collision with root package name */
                private float f139859e;

                /* renamed from: f  reason: collision with root package name */
                private double f139860f;

                /* renamed from: g  reason: collision with root package name */
                private int f139861g;

                /* renamed from: h  reason: collision with root package name */
                private int f139862h;

                /* renamed from: i  reason: collision with root package name */
                private int f139863i;

                /* renamed from: j  reason: collision with root package name */
                private C16829b f139864j = C16829b.u();

                /* renamed from: k  reason: collision with root package name */
                private List<c> f139865k = Collections.emptyList();

                /* renamed from: l  reason: collision with root package name */
                private int f139866l;

                /* renamed from: m  reason: collision with root package name */
                private int f139867m;

                private C3433b() {
                    r();
                }

                /* access modifiers changed from: private */
                public static C3433b o() {
                    return new C3433b();
                }

                private void p() {
                    if ((this.f139856b & 256) != 256) {
                        this.f139865k = new ArrayList(this.f139865k);
                        this.f139856b |= 256;
                    }
                }

                private void r() {
                }

                public C3433b A(double d10) {
                    this.f139856b |= 8;
                    this.f139860f = d10;
                    return this;
                }

                public C3433b C(int i10) {
                    this.f139856b |= 64;
                    this.f139863i = i10;
                    return this;
                }

                public C3433b D(int i10) {
                    this.f139856b |= 1024;
                    this.f139867m = i10;
                    return this;
                }

                public C3433b E(float f10) {
                    this.f139856b |= 4;
                    this.f139859e = f10;
                    return this;
                }

                public C3433b G(long j10) {
                    this.f139856b |= 2;
                    this.f139858d = j10;
                    return this;
                }

                public C3433b H(int i10) {
                    this.f139856b |= 16;
                    this.f139861g = i10;
                    return this;
                }

                public C3433b I(C3434c cVar) {
                    cVar.getClass();
                    this.f139856b |= 1;
                    this.f139857c = cVar;
                    return this;
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
                    int i10 = this.f139856b;
                    int i11 = 1;
                    if ((i10 & 1) != 1) {
                        i11 = 0;
                    }
                    C3434c unused = cVar.f139843d = this.f139857c;
                    if ((i10 & 2) == 2) {
                        i11 |= 2;
                    }
                    long unused2 = cVar.f139844e = this.f139858d;
                    if ((i10 & 4) == 4) {
                        i11 |= 4;
                    }
                    float unused3 = cVar.f139845f = this.f139859e;
                    if ((i10 & 8) == 8) {
                        i11 |= 8;
                    }
                    double unused4 = cVar.f139846g = this.f139860f;
                    if ((i10 & 16) == 16) {
                        i11 |= 16;
                    }
                    int unused5 = cVar.f139847h = this.f139861g;
                    if ((i10 & 32) == 32) {
                        i11 |= 32;
                    }
                    int unused6 = cVar.f139848i = this.f139862h;
                    if ((i10 & 64) == 64) {
                        i11 |= 64;
                    }
                    int unused7 = cVar.f139849j = this.f139863i;
                    if ((i10 & 128) == 128) {
                        i11 |= 128;
                    }
                    C16829b unused8 = cVar.f139850k = this.f139864j;
                    if ((this.f139856b & 256) == 256) {
                        this.f139865k = Collections.unmodifiableList(this.f139865k);
                        this.f139856b &= -257;
                    }
                    List unused9 = cVar.f139851l = this.f139865k;
                    if ((i10 & 512) == 512) {
                        i11 |= 256;
                    }
                    int unused10 = cVar.f139852m = this.f139866l;
                    if ((i10 & 1024) == 1024) {
                        i11 |= 512;
                    }
                    int unused11 = cVar.f139853n = this.f139867m;
                    int unused12 = cVar.f139842c = i11;
                    return cVar;
                }

                /* renamed from: n */
                public C3433b d() {
                    return o().f(m());
                }

                public C3433b u(C16829b bVar) {
                    if ((this.f139856b & 128) != 128 || this.f139864j == C16829b.u()) {
                        this.f139864j = bVar;
                    } else {
                        this.f139864j = C16829b.z(this.f139864j).f(bVar).m();
                    }
                    this.f139856b |= 128;
                    return this;
                }

                /* renamed from: v */
                public C3433b f(c cVar) {
                    if (cVar == c.G()) {
                        return this;
                    }
                    if (cVar.X()) {
                        I(cVar.N());
                    }
                    if (cVar.V()) {
                        G(cVar.L());
                    }
                    if (cVar.U()) {
                        E(cVar.K());
                    }
                    if (cVar.R()) {
                        A(cVar.H());
                    }
                    if (cVar.W()) {
                        H(cVar.M());
                    }
                    if (cVar.Q()) {
                        z(cVar.F());
                    }
                    if (cVar.S()) {
                        C(cVar.I());
                    }
                    if (cVar.O()) {
                        u(cVar.A());
                    }
                    if (!cVar.f139851l.isEmpty()) {
                        if (this.f139865k.isEmpty()) {
                            this.f139865k = cVar.f139851l;
                            this.f139856b &= -257;
                        } else {
                            p();
                            this.f139865k.addAll(cVar.f139851l);
                        }
                    }
                    if (cVar.P()) {
                        y(cVar.B());
                    }
                    if (cVar.T()) {
                        D(cVar.J());
                    }
                    j(e().i(cVar.f139841b));
                    return this;
                }

                /* renamed from: w */
                public C3433b o1(C17194e eVar, C17196g gVar) {
                    c cVar;
                    c cVar2 = null;
                    try {
                        c c10 = c.f139840r.c(eVar, gVar);
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

                public C3433b y(int i10) {
                    this.f139856b |= 512;
                    this.f139866l = i10;
                    return this;
                }

                public C3433b z(int i10) {
                    this.f139856b |= 32;
                    this.f139862h = i10;
                    return this;
                }
            }

            /* renamed from: XI.b$b$c$c  reason: collision with other inner class name */
            public enum C3434c implements C17199j.a {
                BYTE(0, 0),
                CHAR(1, 1),
                SHORT(2, 2),
                INT(3, 3),
                LONG(4, 4),
                FLOAT(5, 5),
                DOUBLE(6, 6),
                BOOLEAN(7, 7),
                STRING(8, 8),
                CLASS(9, 9),
                ENUM(10, 10),
                ANNOTATION(11, 11),
                ARRAY(12, 12);
                
                private static C17199j.b<C3434c> internalValueMap;
                private final int value;

                /* renamed from: XI.b$b$c$c$a */
                static class a implements C17199j.b<C3434c> {
                    a() {
                    }

                    /* renamed from: b */
                    public C3434c a(int i10) {
                        return C3434c.a(i10);
                    }
                }

                static {
                    internalValueMap = new a();
                }

                private C3434c(int i10, int i11) {
                    this.value = i11;
                }

                public static C3434c a(int i10) {
                    switch (i10) {
                        case 0:
                            return BYTE;
                        case 1:
                            return CHAR;
                        case 2:
                            return SHORT;
                        case 3:
                            return INT;
                        case 4:
                            return LONG;
                        case 5:
                            return FLOAT;
                        case 6:
                            return DOUBLE;
                        case 7:
                            return BOOLEAN;
                        case 8:
                            return STRING;
                        case 9:
                            return CLASS;
                        case 10:
                            return ENUM;
                        case 11:
                            return ANNOTATION;
                        case 12:
                            return ARRAY;
                        default:
                            return null;
                    }
                }

                public final int d() {
                    return this.value;
                }
            }

            static {
                c cVar = new c(true);
                f139839q = cVar;
                cVar.Y();
            }

            public static c G() {
                return f139839q;
            }

            private void Y() {
                this.f139843d = C3434c.BYTE;
                this.f139844e = 0;
                this.f139845f = 0.0f;
                this.f139846g = 0.0d;
                this.f139847h = 0;
                this.f139848i = 0;
                this.f139849j = 0;
                this.f139850k = C16829b.u();
                this.f139851l = Collections.emptyList();
                this.f139852m = 0;
                this.f139853n = 0;
            }

            public static C3433b Z() {
                return C3433b.o();
            }

            public static C3433b a0(c cVar) {
                return Z().f(cVar);
            }

            public C16829b A() {
                return this.f139850k;
            }

            public int B() {
                return this.f139852m;
            }

            public c C(int i10) {
                return this.f139851l.get(i10);
            }

            public int D() {
                return this.f139851l.size();
            }

            public List<c> E() {
                return this.f139851l;
            }

            public int F() {
                return this.f139848i;
            }

            public double H() {
                return this.f139846g;
            }

            public int I() {
                return this.f139849j;
            }

            public int J() {
                return this.f139853n;
            }

            public float K() {
                return this.f139845f;
            }

            public long L() {
                return this.f139844e;
            }

            public int M() {
                return this.f139847h;
            }

            public C3434c N() {
                return this.f139843d;
            }

            public boolean O() {
                return (this.f139842c & 128) == 128;
            }

            public boolean P() {
                return (this.f139842c & 256) == 256;
            }

            public boolean Q() {
                return (this.f139842c & 32) == 32;
            }

            public boolean R() {
                return (this.f139842c & 8) == 8;
            }

            public boolean S() {
                return (this.f139842c & 64) == 64;
            }

            public boolean T() {
                return (this.f139842c & 512) == 512;
            }

            public boolean U() {
                return (this.f139842c & 4) == 4;
            }

            public boolean V() {
                return (this.f139842c & 2) == 2;
            }

            public boolean W() {
                return (this.f139842c & 16) == 16;
            }

            public boolean X() {
                return (this.f139842c & 1) == 1;
            }

            public void a(C17195f fVar) {
                getSerializedSize();
                if ((this.f139842c & 1) == 1) {
                    fVar.S(1, this.f139843d.d());
                }
                if ((this.f139842c & 2) == 2) {
                    fVar.t0(2, this.f139844e);
                }
                if ((this.f139842c & 4) == 4) {
                    fVar.W(3, this.f139845f);
                }
                if ((this.f139842c & 8) == 8) {
                    fVar.Q(4, this.f139846g);
                }
                if ((this.f139842c & 16) == 16) {
                    fVar.a0(5, this.f139847h);
                }
                if ((this.f139842c & 32) == 32) {
                    fVar.a0(6, this.f139848i);
                }
                if ((this.f139842c & 64) == 64) {
                    fVar.a0(7, this.f139849j);
                }
                if ((this.f139842c & 128) == 128) {
                    fVar.d0(8, this.f139850k);
                }
                for (int i10 = 0; i10 < this.f139851l.size(); i10++) {
                    fVar.d0(9, this.f139851l.get(i10));
                }
                if ((this.f139842c & 512) == 512) {
                    fVar.a0(10, this.f139853n);
                }
                if ((this.f139842c & 256) == 256) {
                    fVar.a0(11, this.f139852m);
                }
                fVar.i0(this.f139841b);
            }

            /* renamed from: b0 */
            public C3433b newBuilderForType() {
                return Z();
            }

            /* renamed from: c0 */
            public C3433b toBuilder() {
                return a0(this);
            }

            public C17208s<c> getParserForType() {
                return f139840r;
            }

            public int getSerializedSize() {
                int i10 = this.f139855p;
                if (i10 != -1) {
                    return i10;
                }
                int h10 = (this.f139842c & 1) == 1 ? C17195f.h(1, this.f139843d.d()) : 0;
                if ((this.f139842c & 2) == 2) {
                    h10 += C17195f.A(2, this.f139844e);
                }
                if ((this.f139842c & 4) == 4) {
                    h10 += C17195f.l(3, this.f139845f);
                }
                if ((this.f139842c & 8) == 8) {
                    h10 += C17195f.f(4, this.f139846g);
                }
                if ((this.f139842c & 16) == 16) {
                    h10 += C17195f.o(5, this.f139847h);
                }
                if ((this.f139842c & 32) == 32) {
                    h10 += C17195f.o(6, this.f139848i);
                }
                if ((this.f139842c & 64) == 64) {
                    h10 += C17195f.o(7, this.f139849j);
                }
                if ((this.f139842c & 128) == 128) {
                    h10 += C17195f.s(8, this.f139850k);
                }
                for (int i11 = 0; i11 < this.f139851l.size(); i11++) {
                    h10 += C17195f.s(9, this.f139851l.get(i11));
                }
                if ((this.f139842c & 512) == 512) {
                    h10 += C17195f.o(10, this.f139853n);
                }
                if ((this.f139842c & 256) == 256) {
                    h10 += C17195f.o(11, this.f139852m);
                }
                int size = h10 + this.f139841b.size();
                this.f139855p = size;
                return size;
            }

            public final boolean isInitialized() {
                byte b10 = this.f139854o;
                if (b10 == 1) {
                    return true;
                }
                if (b10 == 0) {
                    return false;
                }
                if (!O() || A().isInitialized()) {
                    for (int i10 = 0; i10 < D(); i10++) {
                        if (!C(i10).isInitialized()) {
                            this.f139854o = 0;
                            return false;
                        }
                    }
                    this.f139854o = 1;
                    return true;
                }
                this.f139854o = 0;
                return false;
            }

            private c(C17198i.b bVar) {
                super(bVar);
                this.f139854o = -1;
                this.f139855p = -1;
                this.f139841b = bVar.e();
            }

            private c(boolean z10) {
                this.f139854o = -1;
                this.f139855p = -1;
                this.f139841b = C17193d.f143014a;
            }

            private c(C17194e eVar, C17196g gVar) {
                this.f139854o = -1;
                this.f139855p = -1;
                Y();
                C17193d.b B10 = C17193d.B();
                C17195f J10 = C17195f.J(B10, 1);
                boolean z10 = false;
                boolean z11 = false;
                while (!z10) {
                    try {
                        int K10 = eVar.K();
                        switch (K10) {
                            case 0:
                                z10 = true;
                                break;
                            case 8:
                                int n10 = eVar.n();
                                C3434c a10 = C3434c.a(n10);
                                if (a10 != null) {
                                    this.f139842c |= 1;
                                    this.f139843d = a10;
                                    break;
                                } else {
                                    J10.o0(K10);
                                    J10.o0(n10);
                                    break;
                                }
                            case 16:
                                this.f139842c |= 2;
                                this.f139844e = eVar.H();
                                break;
                            case 29:
                                this.f139842c |= 4;
                                this.f139845f = eVar.q();
                                break;
                            case BuildConfig.TARGET_SDK_VERSION:
                                this.f139842c |= 8;
                                this.f139846g = eVar.m();
                                break;
                            case 40:
                                this.f139842c |= 16;
                                this.f139847h = eVar.s();
                                break;
                            case 48:
                                this.f139842c |= 32;
                                this.f139848i = eVar.s();
                                break;
                            case 56:
                                this.f139842c |= 64;
                                this.f139849j = eVar.s();
                                break;
                            case 66:
                                c B11 = (this.f139842c & 128) == 128 ? this.f139850k.toBuilder() : null;
                                C16829b bVar = (C16829b) eVar.u(C16829b.f139821i, gVar);
                                this.f139850k = bVar;
                                if (B11 != null) {
                                    B11.f(bVar);
                                    this.f139850k = B11.m();
                                }
                                this.f139842c |= 128;
                                break;
                            case 74:
                                if (!(z11 & true)) {
                                    this.f139851l = new ArrayList();
                                    z11 = true;
                                }
                                this.f139851l.add(eVar.u(f139840r, gVar));
                                break;
                            case 80:
                                this.f139842c |= 512;
                                this.f139853n = eVar.s();
                                break;
                            case 88:
                                this.f139842c |= 256;
                                this.f139852m = eVar.s();
                                break;
                            default:
                                if (k(eVar, J10, gVar, K10)) {
                                    break;
                                }
                                z10 = true;
                                break;
                        }
                    } catch (C17200k e10) {
                        throw e10.i(this);
                    } catch (IOException e11) {
                        throw new C17200k(e11.getMessage()).i(this);
                    } catch (Throwable th2) {
                        if (z11 & true) {
                            this.f139851l = Collections.unmodifiableList(this.f139851l);
                        }
                        try {
                            J10.I();
                        } catch (IOException unused) {
                        } catch (Throwable th3) {
                            this.f139841b = B10.g();
                            throw th3;
                        }
                        this.f139841b = B10.g();
                        h();
                        throw th2;
                    }
                }
                if (z11 & true) {
                    this.f139851l = Collections.unmodifiableList(this.f139851l);
                }
                try {
                    J10.I();
                } catch (IOException unused2) {
                } catch (Throwable th4) {
                    this.f139841b = B10.g();
                    throw th4;
                }
                this.f139841b = B10.g();
                h();
            }
        }

        private C3431b(C17198i.b bVar) {
            super(bVar);
            this.f139834f = -1;
            this.f139835g = -1;
            this.f139830b = bVar.e();
        }

        private C3431b(boolean z10) {
            this.f139834f = -1;
            this.f139835g = -1;
            this.f139830b = C17193d.f143014a;
        }

        private C3431b(C17194e eVar, C17196g gVar) {
            this.f139834f = -1;
            this.f139835g = -1;
            v();
            C17193d.b B10 = C17193d.B();
            C17195f J10 = C17195f.J(B10, 1);
            boolean z10 = false;
            while (!z10) {
                try {
                    int K10 = eVar.K();
                    if (K10 != 0) {
                        if (K10 == 8) {
                            this.f139831c |= 1;
                            this.f139832d = eVar.s();
                        } else if (K10 == 18) {
                            c.C3433b c02 = (this.f139831c & 2) == 2 ? this.f139833e.toBuilder() : null;
                            c cVar = (c) eVar.u(c.f139840r, gVar);
                            this.f139833e = cVar;
                            if (c02 != null) {
                                c02.f(cVar);
                                this.f139833e = c02.m();
                            }
                            this.f139831c |= 2;
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
                        this.f139830b = B10.g();
                        throw th3;
                    }
                    this.f139830b = B10.g();
                    h();
                    throw th2;
                }
            }
            try {
                J10.I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f139830b = B10.g();
                throw th4;
            }
            this.f139830b = B10.g();
            h();
        }
    }

    /* renamed from: XI.b$c */
    public static final class c extends C17198i.b<C16829b, c> implements C17207r {

        /* renamed from: b  reason: collision with root package name */
        private int f139868b;

        /* renamed from: c  reason: collision with root package name */
        private int f139869c;

        /* renamed from: d  reason: collision with root package name */
        private List<C3431b> f139870d = Collections.emptyList();

        private c() {
            r();
        }

        /* access modifiers changed from: private */
        public static c o() {
            return new c();
        }

        private void p() {
            if ((this.f139868b & 2) != 2) {
                this.f139870d = new ArrayList(this.f139870d);
                this.f139868b |= 2;
            }
        }

        private void r() {
        }

        /* renamed from: l */
        public C16829b g() {
            C16829b m10 = m();
            if (m10.isInitialized()) {
                return m10;
            }
            throw C17190a.C3485a.c(m10);
        }

        public C16829b m() {
            C16829b bVar = new C16829b((C17198i.b) this);
            int i10 = 1;
            if ((this.f139868b & 1) != 1) {
                i10 = 0;
            }
            int unused = bVar.f139824d = this.f139869c;
            if ((this.f139868b & 2) == 2) {
                this.f139870d = Collections.unmodifiableList(this.f139870d);
                this.f139868b &= -3;
            }
            List unused2 = bVar.f139825e = this.f139870d;
            int unused3 = bVar.f139823c = i10;
            return bVar;
        }

        /* renamed from: n */
        public c d() {
            return o().f(m());
        }

        /* renamed from: u */
        public c f(C16829b bVar) {
            if (bVar == C16829b.u()) {
                return this;
            }
            if (bVar.w()) {
                w(bVar.v());
            }
            if (!bVar.f139825e.isEmpty()) {
                if (this.f139870d.isEmpty()) {
                    this.f139870d = bVar.f139825e;
                    this.f139868b &= -3;
                } else {
                    p();
                    this.f139870d.addAll(bVar.f139825e);
                }
            }
            j(e().i(bVar.f139822b));
            return this;
        }

        /* renamed from: v */
        public c o1(C17194e eVar, C17196g gVar) {
            C16829b bVar;
            C16829b bVar2 = null;
            try {
                C16829b c10 = C16829b.f139821i.c(eVar, gVar);
                if (c10 != null) {
                    f(c10);
                }
                return this;
            } catch (C17200k e10) {
                bVar = (C16829b) e10.a();
                throw e10;
            } catch (Throwable th2) {
                th = th2;
                bVar2 = bVar;
            }
            if (bVar2 != null) {
                f(bVar2);
            }
            throw th;
        }

        public c w(int i10) {
            this.f139868b |= 1;
            this.f139869c = i10;
            return this;
        }
    }

    static {
        C16829b bVar = new C16829b(true);
        f139820h = bVar;
        bVar.x();
    }

    public static C16829b u() {
        return f139820h;
    }

    private void x() {
        this.f139824d = 0;
        this.f139825e = Collections.emptyList();
    }

    public static c y() {
        return c.o();
    }

    public static c z(C16829b bVar) {
        return y().f(bVar);
    }

    /* renamed from: A */
    public c newBuilderForType() {
        return y();
    }

    /* renamed from: B */
    public c toBuilder() {
        return z(this);
    }

    public void a(C17195f fVar) {
        getSerializedSize();
        if ((this.f139823c & 1) == 1) {
            fVar.a0(1, this.f139824d);
        }
        for (int i10 = 0; i10 < this.f139825e.size(); i10++) {
            fVar.d0(2, this.f139825e.get(i10));
        }
        fVar.i0(this.f139822b);
    }

    public C17208s<C16829b> getParserForType() {
        return f139821i;
    }

    public int getSerializedSize() {
        int i10 = this.f139827g;
        if (i10 != -1) {
            return i10;
        }
        int o10 = (this.f139823c & 1) == 1 ? C17195f.o(1, this.f139824d) : 0;
        for (int i11 = 0; i11 < this.f139825e.size(); i11++) {
            o10 += C17195f.s(2, this.f139825e.get(i11));
        }
        int size = o10 + this.f139822b.size();
        this.f139827g = size;
        return size;
    }

    public final boolean isInitialized() {
        byte b10 = this.f139826f;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!w()) {
            this.f139826f = 0;
            return false;
        }
        for (int i10 = 0; i10 < s(); i10++) {
            if (!r(i10).isInitialized()) {
                this.f139826f = 0;
                return false;
            }
        }
        this.f139826f = 1;
        return true;
    }

    public C3431b r(int i10) {
        return this.f139825e.get(i10);
    }

    public int s() {
        return this.f139825e.size();
    }

    public List<C3431b> t() {
        return this.f139825e;
    }

    public int v() {
        return this.f139824d;
    }

    public boolean w() {
        return (this.f139823c & 1) == 1;
    }

    private C16829b(C17198i.b bVar) {
        super(bVar);
        this.f139826f = -1;
        this.f139827g = -1;
        this.f139822b = bVar.e();
    }

    private C16829b(boolean z10) {
        this.f139826f = -1;
        this.f139827g = -1;
        this.f139822b = C17193d.f143014a;
    }

    private C16829b(C17194e eVar, C17196g gVar) {
        this.f139826f = -1;
        this.f139827g = -1;
        x();
        C17193d.b B10 = C17193d.B();
        C17195f J10 = C17195f.J(B10, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                int K10 = eVar.K();
                if (K10 != 0) {
                    if (K10 == 8) {
                        this.f139823c |= 1;
                        this.f139824d = eVar.s();
                    } else if (K10 == 18) {
                        if (!(z11 & true)) {
                            this.f139825e = new ArrayList();
                            z11 = true;
                        }
                        this.f139825e.add(eVar.u(C3431b.f139829i, gVar));
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
                    this.f139825e = Collections.unmodifiableList(this.f139825e);
                }
                try {
                    J10.I();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f139822b = B10.g();
                    throw th3;
                }
                this.f139822b = B10.g();
                h();
                throw th2;
            }
        }
        if (z11 & true) {
            this.f139825e = Collections.unmodifiableList(this.f139825e);
        }
        try {
            J10.I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f139822b = B10.g();
            throw th4;
        }
        this.f139822b = B10.g();
        h();
    }
}

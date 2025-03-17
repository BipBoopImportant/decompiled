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

public final class s extends C17198i.d<s> implements C17207r {

    /* renamed from: n  reason: collision with root package name */
    private static final s f140204n;

    /* renamed from: o  reason: collision with root package name */
    public static C17208s<s> f140205o = new a();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C17193d f140206c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public int f140207d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public int f140208e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public int f140209f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public boolean f140210g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public c f140211h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public List<q> f140212i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public List<Integer> f140213j;

    /* renamed from: k  reason: collision with root package name */
    private int f140214k;

    /* renamed from: l  reason: collision with root package name */
    private byte f140215l;

    /* renamed from: m  reason: collision with root package name */
    private int f140216m;

    static class a extends C17191b<s> {
        a() {
        }

        /* renamed from: m */
        public s c(C17194e eVar, C17196g gVar) {
            return new s(eVar, gVar);
        }
    }

    public static final class b extends C17198i.c<s, b> implements C17207r {

        /* renamed from: d  reason: collision with root package name */
        private int f140217d;

        /* renamed from: e  reason: collision with root package name */
        private int f140218e;

        /* renamed from: f  reason: collision with root package name */
        private int f140219f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f140220g;

        /* renamed from: h  reason: collision with root package name */
        private c f140221h = c.INV;

        /* renamed from: i  reason: collision with root package name */
        private List<q> f140222i = Collections.emptyList();

        /* renamed from: j  reason: collision with root package name */
        private List<Integer> f140223j = Collections.emptyList();

        private b() {
            z();
        }

        /* access modifiers changed from: private */
        public static b v() {
            return new b();
        }

        private void w() {
            if ((this.f140217d & 32) != 32) {
                this.f140223j = new ArrayList(this.f140223j);
                this.f140217d |= 32;
            }
        }

        private void y() {
            if ((this.f140217d & 16) != 16) {
                this.f140222i = new ArrayList(this.f140222i);
                this.f140217d |= 16;
            }
        }

        private void z() {
        }

        /* renamed from: A */
        public b f(s sVar) {
            if (sVar == s.F()) {
                return this;
            }
            if (sVar.P()) {
                D(sVar.H());
            }
            if (sVar.Q()) {
                E(sVar.I());
            }
            if (sVar.R()) {
                G(sVar.J());
            }
            if (sVar.S()) {
                H(sVar.O());
            }
            if (!sVar.f140212i.isEmpty()) {
                if (this.f140222i.isEmpty()) {
                    this.f140222i = sVar.f140212i;
                    this.f140217d &= -17;
                } else {
                    y();
                    this.f140222i.addAll(sVar.f140212i);
                }
            }
            if (!sVar.f140213j.isEmpty()) {
                if (this.f140223j.isEmpty()) {
                    this.f140223j = sVar.f140213j;
                    this.f140217d &= -33;
                } else {
                    w();
                    this.f140223j.addAll(sVar.f140213j);
                }
            }
            n(sVar);
            j(e().i(sVar.f140206c));
            return this;
        }

        /* renamed from: C */
        public b o1(C17194e eVar, C17196g gVar) {
            s sVar;
            s sVar2 = null;
            try {
                s c10 = s.f140205o.c(eVar, gVar);
                if (c10 != null) {
                    f(c10);
                }
                return this;
            } catch (C17200k e10) {
                sVar = (s) e10.a();
                throw e10;
            } catch (Throwable th2) {
                th = th2;
                sVar2 = sVar;
            }
            if (sVar2 != null) {
                f(sVar2);
            }
            throw th;
        }

        public b D(int i10) {
            this.f140217d |= 1;
            this.f140218e = i10;
            return this;
        }

        public b E(int i10) {
            this.f140217d |= 2;
            this.f140219f = i10;
            return this;
        }

        public b G(boolean z10) {
            this.f140217d |= 4;
            this.f140220g = z10;
            return this;
        }

        public b H(c cVar) {
            cVar.getClass();
            this.f140217d |= 8;
            this.f140221h = cVar;
            return this;
        }

        /* renamed from: p */
        public s g() {
            s r10 = r();
            if (r10.isInitialized()) {
                return r10;
            }
            throw C17190a.C3485a.c(r10);
        }

        public s r() {
            s sVar = new s((C17198i.c) this);
            int i10 = this.f140217d;
            int i11 = 1;
            if ((i10 & 1) != 1) {
                i11 = 0;
            }
            int unused = sVar.f140208e = this.f140218e;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            int unused2 = sVar.f140209f = this.f140219f;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            boolean unused3 = sVar.f140210g = this.f140220g;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            c unused4 = sVar.f140211h = this.f140221h;
            if ((this.f140217d & 16) == 16) {
                this.f140222i = Collections.unmodifiableList(this.f140222i);
                this.f140217d &= -17;
            }
            List unused5 = sVar.f140212i = this.f140222i;
            if ((this.f140217d & 32) == 32) {
                this.f140223j = Collections.unmodifiableList(this.f140223j);
                this.f140217d &= -33;
            }
            List unused6 = sVar.f140213j = this.f140223j;
            int unused7 = sVar.f140207d = i11;
            return sVar;
        }

        /* renamed from: u */
        public b d() {
            return v().f(r());
        }
    }

    public enum c implements C17199j.a {
        IN(0, 0),
        OUT(1, 1),
        INV(2, 2);
        
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
                return IN;
            }
            if (i10 == 1) {
                return OUT;
            }
            if (i10 != 2) {
                return null;
            }
            return INV;
        }

        public final int d() {
            return this.value;
        }
    }

    static {
        s sVar = new s(true);
        f140204n = sVar;
        sVar.T();
    }

    public static s F() {
        return f140204n;
    }

    private void T() {
        this.f140208e = 0;
        this.f140209f = 0;
        this.f140210g = false;
        this.f140211h = c.INV;
        this.f140212i = Collections.emptyList();
        this.f140213j = Collections.emptyList();
    }

    public static b U() {
        return b.v();
    }

    public static b V(s sVar) {
        return U().f(sVar);
    }

    /* renamed from: G */
    public s getDefaultInstanceForType() {
        return f140204n;
    }

    public int H() {
        return this.f140208e;
    }

    public int I() {
        return this.f140209f;
    }

    public boolean J() {
        return this.f140210g;
    }

    public q K(int i10) {
        return this.f140212i.get(i10);
    }

    public int L() {
        return this.f140212i.size();
    }

    public List<Integer> M() {
        return this.f140213j;
    }

    public List<q> N() {
        return this.f140212i;
    }

    public c O() {
        return this.f140211h;
    }

    public boolean P() {
        return (this.f140207d & 1) == 1;
    }

    public boolean Q() {
        return (this.f140207d & 2) == 2;
    }

    public boolean R() {
        return (this.f140207d & 4) == 4;
    }

    public boolean S() {
        return (this.f140207d & 8) == 8;
    }

    /* renamed from: W */
    public b newBuilderForType() {
        return U();
    }

    /* renamed from: X */
    public b toBuilder() {
        return V(this);
    }

    public void a(C17195f fVar) {
        getSerializedSize();
        C17198i.d<MessageType>.defpackage.a t10 = t();
        if ((this.f140207d & 1) == 1) {
            fVar.a0(1, this.f140208e);
        }
        if ((this.f140207d & 2) == 2) {
            fVar.a0(2, this.f140209f);
        }
        if ((this.f140207d & 4) == 4) {
            fVar.L(3, this.f140210g);
        }
        if ((this.f140207d & 8) == 8) {
            fVar.S(4, this.f140211h.d());
        }
        for (int i10 = 0; i10 < this.f140212i.size(); i10++) {
            fVar.d0(5, this.f140212i.get(i10));
        }
        if (M().size() > 0) {
            fVar.o0(50);
            fVar.o0(this.f140214k);
        }
        for (int i11 = 0; i11 < this.f140213j.size(); i11++) {
            fVar.b0(this.f140213j.get(i11).intValue());
        }
        t10.a(1000, fVar);
        fVar.i0(this.f140206c);
    }

    public C17208s<s> getParserForType() {
        return f140205o;
    }

    public int getSerializedSize() {
        int i10 = this.f140216m;
        if (i10 != -1) {
            return i10;
        }
        int o10 = (this.f140207d & 1) == 1 ? C17195f.o(1, this.f140208e) : 0;
        if ((this.f140207d & 2) == 2) {
            o10 += C17195f.o(2, this.f140209f);
        }
        if ((this.f140207d & 4) == 4) {
            o10 += C17195f.a(3, this.f140210g);
        }
        if ((this.f140207d & 8) == 8) {
            o10 += C17195f.h(4, this.f140211h.d());
        }
        for (int i11 = 0; i11 < this.f140212i.size(); i11++) {
            o10 += C17195f.s(5, this.f140212i.get(i11));
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f140213j.size(); i13++) {
            i12 += C17195f.p(this.f140213j.get(i13).intValue());
        }
        int i14 = o10 + i12;
        if (!M().isEmpty()) {
            i14 = i14 + 1 + C17195f.p(i12);
        }
        this.f140214k = i12;
        int o11 = i14 + o() + this.f140206c.size();
        this.f140216m = o11;
        return o11;
    }

    public final boolean isInitialized() {
        byte b10 = this.f140215l;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!P()) {
            this.f140215l = 0;
            return false;
        } else if (!Q()) {
            this.f140215l = 0;
            return false;
        } else {
            for (int i10 = 0; i10 < L(); i10++) {
                if (!K(i10).isInitialized()) {
                    this.f140215l = 0;
                    return false;
                }
            }
            if (!n()) {
                this.f140215l = 0;
                return false;
            }
            this.f140215l = 1;
            return true;
        }
    }

    private s(C17198i.c<s, ?> cVar) {
        super(cVar);
        this.f140214k = -1;
        this.f140215l = -1;
        this.f140216m = -1;
        this.f140206c = cVar.e();
    }

    private s(boolean z10) {
        this.f140214k = -1;
        this.f140215l = -1;
        this.f140216m = -1;
        this.f140206c = C17193d.f143014a;
    }

    private s(C17194e eVar, C17196g gVar) {
        this.f140214k = -1;
        this.f140215l = -1;
        this.f140216m = -1;
        T();
        C17193d.b B10 = C17193d.B();
        C17195f J10 = C17195f.J(B10, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                int K10 = eVar.K();
                if (K10 != 0) {
                    if (K10 == 8) {
                        this.f140207d |= 1;
                        this.f140208e = eVar.s();
                    } else if (K10 == 16) {
                        this.f140207d |= 2;
                        this.f140209f = eVar.s();
                    } else if (K10 == 24) {
                        this.f140207d |= 4;
                        this.f140210g = eVar.k();
                    } else if (K10 == 32) {
                        int n10 = eVar.n();
                        c a10 = c.a(n10);
                        if (a10 == null) {
                            J10.o0(K10);
                            J10.o0(n10);
                        } else {
                            this.f140207d |= 8;
                            this.f140211h = a10;
                        }
                    } else if (K10 == 42) {
                        if (!(z11 & true)) {
                            this.f140212i = new ArrayList();
                            z11 |= true;
                        }
                        this.f140212i.add(eVar.u(q.f140132v, gVar));
                    } else if (K10 == 48) {
                        if (!(z11 & true)) {
                            this.f140213j = new ArrayList();
                            z11 |= true;
                        }
                        this.f140213j.add(Integer.valueOf(eVar.s()));
                    } else if (K10 == 50) {
                        int j10 = eVar.j(eVar.A());
                        if (!(z11 & true) && eVar.e() > 0) {
                            this.f140213j = new ArrayList();
                            z11 |= true;
                        }
                        while (eVar.e() > 0) {
                            this.f140213j.add(Integer.valueOf(eVar.s()));
                        }
                        eVar.i(j10);
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
                    this.f140212i = Collections.unmodifiableList(this.f140212i);
                }
                if (z11 & true) {
                    this.f140213j = Collections.unmodifiableList(this.f140213j);
                }
                try {
                    J10.I();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f140206c = B10.g();
                    throw th3;
                }
                this.f140206c = B10.g();
                h();
                throw th2;
            }
        }
        if (z11 & true) {
            this.f140212i = Collections.unmodifiableList(this.f140212i);
        }
        if (z11 & true) {
            this.f140213j = Collections.unmodifiableList(this.f140213j);
        }
        try {
            J10.I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f140206c = B10.g();
            throw th4;
        }
        this.f140206c = B10.g();
        h();
    }
}

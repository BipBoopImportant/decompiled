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
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class r extends C17198i.d<r> implements C17207r {

    /* renamed from: p  reason: collision with root package name */
    private static final r f140179p;

    /* renamed from: q  reason: collision with root package name */
    public static C17208s<r> f140180q = new a();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C17193d f140181c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public int f140182d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public int f140183e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public int f140184f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public List<s> f140185g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public q f140186h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public int f140187i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public q f140188j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public int f140189k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public List<C16829b> f140190l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public List<Integer> f140191m;

    /* renamed from: n  reason: collision with root package name */
    private byte f140192n;

    /* renamed from: o  reason: collision with root package name */
    private int f140193o;

    static class a extends C17191b<r> {
        a() {
        }

        /* renamed from: m */
        public r c(C17194e eVar, C17196g gVar) {
            return new r(eVar, gVar);
        }
    }

    public static final class b extends C17198i.c<r, b> implements C17207r {

        /* renamed from: d  reason: collision with root package name */
        private int f140194d;

        /* renamed from: e  reason: collision with root package name */
        private int f140195e = 6;

        /* renamed from: f  reason: collision with root package name */
        private int f140196f;

        /* renamed from: g  reason: collision with root package name */
        private List<s> f140197g = Collections.emptyList();

        /* renamed from: h  reason: collision with root package name */
        private q f140198h = q.S();

        /* renamed from: i  reason: collision with root package name */
        private int f140199i;

        /* renamed from: j  reason: collision with root package name */
        private q f140200j = q.S();

        /* renamed from: k  reason: collision with root package name */
        private int f140201k;

        /* renamed from: l  reason: collision with root package name */
        private List<C16829b> f140202l = Collections.emptyList();

        /* renamed from: m  reason: collision with root package name */
        private List<Integer> f140203m = Collections.emptyList();

        private b() {
            A();
        }

        private void A() {
        }

        /* access modifiers changed from: private */
        public static b v() {
            return new b();
        }

        private void w() {
            if ((this.f140194d & 128) != 128) {
                this.f140202l = new ArrayList(this.f140202l);
                this.f140194d |= 128;
            }
        }

        private void y() {
            if ((this.f140194d & 4) != 4) {
                this.f140197g = new ArrayList(this.f140197g);
                this.f140194d |= 4;
            }
        }

        private void z() {
            if ((this.f140194d & 256) != 256) {
                this.f140203m = new ArrayList(this.f140203m);
                this.f140194d |= 256;
            }
        }

        public b C(q qVar) {
            if ((this.f140194d & 32) != 32 || this.f140200j == q.S()) {
                this.f140200j = qVar;
            } else {
                this.f140200j = q.t0(this.f140200j).f(qVar).r();
            }
            this.f140194d |= 32;
            return this;
        }

        /* renamed from: D */
        public b f(r rVar) {
            if (rVar == r.M()) {
                return this;
            }
            if (rVar.a0()) {
                I(rVar.Q());
            }
            if (rVar.b0()) {
                K(rVar.R());
            }
            if (!rVar.f140185g.isEmpty()) {
                if (this.f140197g.isEmpty()) {
                    this.f140197g = rVar.f140185g;
                    this.f140194d &= -5;
                } else {
                    y();
                    this.f140197g.addAll(rVar.f140185g);
                }
            }
            if (rVar.c0()) {
                G(rVar.V());
            }
            if (rVar.d0()) {
                L(rVar.W());
            }
            if (rVar.Y()) {
                C(rVar.O());
            }
            if (rVar.Z()) {
                H(rVar.P());
            }
            if (!rVar.f140190l.isEmpty()) {
                if (this.f140202l.isEmpty()) {
                    this.f140202l = rVar.f140190l;
                    this.f140194d &= -129;
                } else {
                    w();
                    this.f140202l.addAll(rVar.f140190l);
                }
            }
            if (!rVar.f140191m.isEmpty()) {
                if (this.f140203m.isEmpty()) {
                    this.f140203m = rVar.f140191m;
                    this.f140194d &= -257;
                } else {
                    z();
                    this.f140203m.addAll(rVar.f140191m);
                }
            }
            n(rVar);
            j(e().i(rVar.f140181c));
            return this;
        }

        /* renamed from: E */
        public b o1(C17194e eVar, C17196g gVar) {
            r rVar;
            r rVar2 = null;
            try {
                r c10 = r.f140180q.c(eVar, gVar);
                if (c10 != null) {
                    f(c10);
                }
                return this;
            } catch (C17200k e10) {
                rVar = (r) e10.a();
                throw e10;
            } catch (Throwable th2) {
                th = th2;
                rVar2 = rVar;
            }
            if (rVar2 != null) {
                f(rVar2);
            }
            throw th;
        }

        public b G(q qVar) {
            if ((this.f140194d & 8) != 8 || this.f140198h == q.S()) {
                this.f140198h = qVar;
            } else {
                this.f140198h = q.t0(this.f140198h).f(qVar).r();
            }
            this.f140194d |= 8;
            return this;
        }

        public b H(int i10) {
            this.f140194d |= 64;
            this.f140201k = i10;
            return this;
        }

        public b I(int i10) {
            this.f140194d |= 1;
            this.f140195e = i10;
            return this;
        }

        public b K(int i10) {
            this.f140194d |= 2;
            this.f140196f = i10;
            return this;
        }

        public b L(int i10) {
            this.f140194d |= 16;
            this.f140199i = i10;
            return this;
        }

        /* renamed from: p */
        public r g() {
            r r10 = r();
            if (r10.isInitialized()) {
                return r10;
            }
            throw C17190a.C3485a.c(r10);
        }

        public r r() {
            r rVar = new r((C17198i.c) this);
            int i10 = this.f140194d;
            int i11 = 1;
            if ((i10 & 1) != 1) {
                i11 = 0;
            }
            int unused = rVar.f140183e = this.f140195e;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            int unused2 = rVar.f140184f = this.f140196f;
            if ((this.f140194d & 4) == 4) {
                this.f140197g = Collections.unmodifiableList(this.f140197g);
                this.f140194d &= -5;
            }
            List unused3 = rVar.f140185g = this.f140197g;
            if ((i10 & 8) == 8) {
                i11 |= 4;
            }
            q unused4 = rVar.f140186h = this.f140198h;
            if ((i10 & 16) == 16) {
                i11 |= 8;
            }
            int unused5 = rVar.f140187i = this.f140199i;
            if ((i10 & 32) == 32) {
                i11 |= 16;
            }
            q unused6 = rVar.f140188j = this.f140200j;
            if ((i10 & 64) == 64) {
                i11 |= 32;
            }
            int unused7 = rVar.f140189k = this.f140201k;
            if ((this.f140194d & 128) == 128) {
                this.f140202l = Collections.unmodifiableList(this.f140202l);
                this.f140194d &= -129;
            }
            List unused8 = rVar.f140190l = this.f140202l;
            if ((this.f140194d & 256) == 256) {
                this.f140203m = Collections.unmodifiableList(this.f140203m);
                this.f140194d &= -257;
            }
            List unused9 = rVar.f140191m = this.f140203m;
            int unused10 = rVar.f140182d = i11;
            return rVar;
        }

        /* renamed from: u */
        public b d() {
            return v().f(r());
        }
    }

    static {
        r rVar = new r(true);
        f140179p = rVar;
        rVar.e0();
    }

    public static r M() {
        return f140179p;
    }

    private void e0() {
        this.f140183e = 6;
        this.f140184f = 0;
        this.f140185g = Collections.emptyList();
        this.f140186h = q.S();
        this.f140187i = 0;
        this.f140188j = q.S();
        this.f140189k = 0;
        this.f140190l = Collections.emptyList();
        this.f140191m = Collections.emptyList();
    }

    public static b f0() {
        return b.v();
    }

    public static b g0(r rVar) {
        return f0().f(rVar);
    }

    public static r i0(InputStream inputStream, C17196g gVar) {
        return f140180q.d(inputStream, gVar);
    }

    public C16829b J(int i10) {
        return this.f140190l.get(i10);
    }

    public int K() {
        return this.f140190l.size();
    }

    public List<C16829b> L() {
        return this.f140190l;
    }

    /* renamed from: N */
    public r getDefaultInstanceForType() {
        return f140179p;
    }

    public q O() {
        return this.f140188j;
    }

    public int P() {
        return this.f140189k;
    }

    public int Q() {
        return this.f140183e;
    }

    public int R() {
        return this.f140184f;
    }

    public s S(int i10) {
        return this.f140185g.get(i10);
    }

    public int T() {
        return this.f140185g.size();
    }

    public List<s> U() {
        return this.f140185g;
    }

    public q V() {
        return this.f140186h;
    }

    public int W() {
        return this.f140187i;
    }

    public List<Integer> X() {
        return this.f140191m;
    }

    public boolean Y() {
        return (this.f140182d & 16) == 16;
    }

    public boolean Z() {
        return (this.f140182d & 32) == 32;
    }

    public void a(C17195f fVar) {
        getSerializedSize();
        C17198i.d<MessageType>.defpackage.a t10 = t();
        if ((this.f140182d & 1) == 1) {
            fVar.a0(1, this.f140183e);
        }
        if ((this.f140182d & 2) == 2) {
            fVar.a0(2, this.f140184f);
        }
        for (int i10 = 0; i10 < this.f140185g.size(); i10++) {
            fVar.d0(3, this.f140185g.get(i10));
        }
        if ((this.f140182d & 4) == 4) {
            fVar.d0(4, this.f140186h);
        }
        if ((this.f140182d & 8) == 8) {
            fVar.a0(5, this.f140187i);
        }
        if ((this.f140182d & 16) == 16) {
            fVar.d0(6, this.f140188j);
        }
        if ((this.f140182d & 32) == 32) {
            fVar.a0(7, this.f140189k);
        }
        for (int i11 = 0; i11 < this.f140190l.size(); i11++) {
            fVar.d0(8, this.f140190l.get(i11));
        }
        for (int i12 = 0; i12 < this.f140191m.size(); i12++) {
            fVar.a0(31, this.f140191m.get(i12).intValue());
        }
        t10.a(200, fVar);
        fVar.i0(this.f140181c);
    }

    public boolean a0() {
        return (this.f140182d & 1) == 1;
    }

    public boolean b0() {
        return (this.f140182d & 2) == 2;
    }

    public boolean c0() {
        return (this.f140182d & 4) == 4;
    }

    public boolean d0() {
        return (this.f140182d & 8) == 8;
    }

    public C17208s<r> getParserForType() {
        return f140180q;
    }

    public int getSerializedSize() {
        int i10 = this.f140193o;
        if (i10 != -1) {
            return i10;
        }
        int o10 = (this.f140182d & 1) == 1 ? C17195f.o(1, this.f140183e) : 0;
        if ((this.f140182d & 2) == 2) {
            o10 += C17195f.o(2, this.f140184f);
        }
        for (int i11 = 0; i11 < this.f140185g.size(); i11++) {
            o10 += C17195f.s(3, this.f140185g.get(i11));
        }
        if ((this.f140182d & 4) == 4) {
            o10 += C17195f.s(4, this.f140186h);
        }
        if ((this.f140182d & 8) == 8) {
            o10 += C17195f.o(5, this.f140187i);
        }
        if ((this.f140182d & 16) == 16) {
            o10 += C17195f.s(6, this.f140188j);
        }
        if ((this.f140182d & 32) == 32) {
            o10 += C17195f.o(7, this.f140189k);
        }
        for (int i12 = 0; i12 < this.f140190l.size(); i12++) {
            o10 += C17195f.s(8, this.f140190l.get(i12));
        }
        int i13 = 0;
        for (int i14 = 0; i14 < this.f140191m.size(); i14++) {
            i13 += C17195f.p(this.f140191m.get(i14).intValue());
        }
        int size = o10 + i13 + (X().size() * 2) + o() + this.f140181c.size();
        this.f140193o = size;
        return size;
    }

    /* renamed from: h0 */
    public b newBuilderForType() {
        return f0();
    }

    public final boolean isInitialized() {
        byte b10 = this.f140192n;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!b0()) {
            this.f140192n = 0;
            return false;
        }
        for (int i10 = 0; i10 < T(); i10++) {
            if (!S(i10).isInitialized()) {
                this.f140192n = 0;
                return false;
            }
        }
        if (c0() && !V().isInitialized()) {
            this.f140192n = 0;
            return false;
        } else if (!Y() || O().isInitialized()) {
            for (int i11 = 0; i11 < K(); i11++) {
                if (!J(i11).isInitialized()) {
                    this.f140192n = 0;
                    return false;
                }
            }
            if (!n()) {
                this.f140192n = 0;
                return false;
            }
            this.f140192n = 1;
            return true;
        } else {
            this.f140192n = 0;
            return false;
        }
    }

    /* renamed from: j0 */
    public b toBuilder() {
        return g0(this);
    }

    private r(C17198i.c<r, ?> cVar) {
        super(cVar);
        this.f140192n = -1;
        this.f140193o = -1;
        this.f140181c = cVar.e();
    }

    private r(boolean z10) {
        this.f140192n = -1;
        this.f140193o = -1;
        this.f140181c = C17193d.f143014a;
    }

    private r(C17194e eVar, C17196g gVar) {
        this.f140192n = -1;
        this.f140193o = -1;
        e0();
        C17193d.b B10 = C17193d.B();
        C17195f J10 = C17195f.J(B10, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                int K10 = eVar.K();
                q.c cVar = null;
                switch (K10) {
                    case 0:
                        z10 = true;
                        break;
                    case 8:
                        this.f140182d |= 1;
                        this.f140183e = eVar.s();
                        break;
                    case 16:
                        this.f140182d |= 2;
                        this.f140184f = eVar.s();
                        break;
                    case 26:
                        if (!(z11 & true)) {
                            this.f140185g = new ArrayList();
                            z11 |= true;
                        }
                        this.f140185g.add(eVar.u(s.f140205o, gVar));
                        break;
                    case 34:
                        cVar = (this.f140182d & 4) == 4 ? this.f140186h.toBuilder() : cVar;
                        q qVar = (q) eVar.u(q.f140132v, gVar);
                        this.f140186h = qVar;
                        if (cVar != null) {
                            cVar.f(qVar);
                            this.f140186h = cVar.r();
                        }
                        this.f140182d |= 4;
                        break;
                    case 40:
                        this.f140182d |= 8;
                        this.f140187i = eVar.s();
                        break;
                    case 50:
                        cVar = (this.f140182d & 16) == 16 ? this.f140188j.toBuilder() : cVar;
                        q qVar2 = (q) eVar.u(q.f140132v, gVar);
                        this.f140188j = qVar2;
                        if (cVar != null) {
                            cVar.f(qVar2);
                            this.f140188j = cVar.r();
                        }
                        this.f140182d |= 16;
                        break;
                    case 56:
                        this.f140182d |= 32;
                        this.f140189k = eVar.s();
                        break;
                    case 66:
                        if (!(z11 & true)) {
                            this.f140190l = new ArrayList();
                            z11 |= true;
                        }
                        this.f140190l.add(eVar.u(C16829b.f139821i, gVar));
                        break;
                    case 248:
                        if (!(z11 & true)) {
                            this.f140191m = new ArrayList();
                            z11 |= true;
                        }
                        this.f140191m.add(Integer.valueOf(eVar.s()));
                        break;
                    case 250:
                        int j10 = eVar.j(eVar.A());
                        if (!(z11 & true) && eVar.e() > 0) {
                            this.f140191m = new ArrayList();
                            z11 |= true;
                        }
                        while (eVar.e() > 0) {
                            this.f140191m.add(Integer.valueOf(eVar.s()));
                        }
                        eVar.i(j10);
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
                    this.f140185g = Collections.unmodifiableList(this.f140185g);
                }
                if (z11 & true) {
                    this.f140190l = Collections.unmodifiableList(this.f140190l);
                }
                if (z11 & true) {
                    this.f140191m = Collections.unmodifiableList(this.f140191m);
                }
                try {
                    J10.I();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f140181c = B10.g();
                    throw th3;
                }
                this.f140181c = B10.g();
                h();
                throw th2;
            }
        }
        if (z11 & true) {
            this.f140185g = Collections.unmodifiableList(this.f140185g);
        }
        if (z11 & true) {
            this.f140190l = Collections.unmodifiableList(this.f140190l);
        }
        if (z11 & true) {
            this.f140191m = Collections.unmodifiableList(this.f140191m);
        }
        try {
            J10.I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f140181c = B10.g();
            throw th4;
        }
        this.f140181c = B10.g();
        h();
    }
}

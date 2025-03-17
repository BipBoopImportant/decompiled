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
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class i extends C17198i.d<i> implements C17207r {

    /* renamed from: v  reason: collision with root package name */
    private static final i f139998v;

    /* renamed from: w  reason: collision with root package name */
    public static C17208s<i> f139999w = new a();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C17193d f140000c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public int f140001d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public int f140002e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public int f140003f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public int f140004g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public q f140005h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public int f140006i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public List<s> f140007j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public q f140008k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public int f140009l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public List<q> f140010m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public List<Integer> f140011n;

    /* renamed from: o  reason: collision with root package name */
    private int f140012o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public List<u> f140013p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public t f140014q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public List<Integer> f140015r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public e f140016s;

    /* renamed from: t  reason: collision with root package name */
    private byte f140017t;

    /* renamed from: u  reason: collision with root package name */
    private int f140018u;

    static class a extends C17191b<i> {
        a() {
        }

        /* renamed from: m */
        public i c(C17194e eVar, C17196g gVar) {
            return new i(eVar, gVar);
        }
    }

    public static final class b extends C17198i.c<i, b> implements C17207r {

        /* renamed from: d  reason: collision with root package name */
        private int f140019d;

        /* renamed from: e  reason: collision with root package name */
        private int f140020e = 6;

        /* renamed from: f  reason: collision with root package name */
        private int f140021f = 6;

        /* renamed from: g  reason: collision with root package name */
        private int f140022g;

        /* renamed from: h  reason: collision with root package name */
        private q f140023h = q.S();

        /* renamed from: i  reason: collision with root package name */
        private int f140024i;

        /* renamed from: j  reason: collision with root package name */
        private List<s> f140025j = Collections.emptyList();

        /* renamed from: k  reason: collision with root package name */
        private q f140026k = q.S();

        /* renamed from: l  reason: collision with root package name */
        private int f140027l;

        /* renamed from: m  reason: collision with root package name */
        private List<q> f140028m = Collections.emptyList();

        /* renamed from: n  reason: collision with root package name */
        private List<Integer> f140029n = Collections.emptyList();

        /* renamed from: o  reason: collision with root package name */
        private List<u> f140030o = Collections.emptyList();

        /* renamed from: p  reason: collision with root package name */
        private t f140031p = t.r();

        /* renamed from: q  reason: collision with root package name */
        private List<Integer> f140032q = Collections.emptyList();

        /* renamed from: r  reason: collision with root package name */
        private e f140033r = e.p();

        private b() {
            D();
        }

        private void A() {
            if ((this.f140019d & 1024) != 1024) {
                this.f140030o = new ArrayList(this.f140030o);
                this.f140019d |= 1024;
            }
        }

        private void C() {
            if ((this.f140019d & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) != 4096) {
                this.f140032q = new ArrayList(this.f140032q);
                this.f140019d |= RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT;
            }
        }

        private void D() {
        }

        /* access modifiers changed from: private */
        public static b v() {
            return new b();
        }

        private void w() {
            if ((this.f140019d & 512) != 512) {
                this.f140029n = new ArrayList(this.f140029n);
                this.f140019d |= 512;
            }
        }

        private void y() {
            if ((this.f140019d & 256) != 256) {
                this.f140028m = new ArrayList(this.f140028m);
                this.f140019d |= 256;
            }
        }

        private void z() {
            if ((this.f140019d & 32) != 32) {
                this.f140025j = new ArrayList(this.f140025j);
                this.f140019d |= 32;
            }
        }

        public b E(e eVar) {
            if ((this.f140019d & 8192) != 8192 || this.f140033r == e.p()) {
                this.f140033r = eVar;
            } else {
                this.f140033r = e.u(this.f140033r).f(eVar).m();
            }
            this.f140019d |= 8192;
            return this;
        }

        /* renamed from: G */
        public b f(i iVar) {
            if (iVar == i.V()) {
                return this;
            }
            if (iVar.n0()) {
                M(iVar.X());
            }
            if (iVar.p0()) {
                O(iVar.Z());
            }
            if (iVar.o0()) {
                N(iVar.Y());
            }
            if (iVar.s0()) {
                K(iVar.c0());
            }
            if (iVar.t0()) {
                Q(iVar.d0());
            }
            if (!iVar.f140007j.isEmpty()) {
                if (this.f140025j.isEmpty()) {
                    this.f140025j = iVar.f140007j;
                    this.f140019d &= -33;
                } else {
                    z();
                    this.f140025j.addAll(iVar.f140007j);
                }
            }
            if (iVar.q0()) {
                I(iVar.a0());
            }
            if (iVar.r0()) {
                P(iVar.b0());
            }
            if (!iVar.f140010m.isEmpty()) {
                if (this.f140028m.isEmpty()) {
                    this.f140028m = iVar.f140010m;
                    this.f140019d &= -257;
                } else {
                    y();
                    this.f140028m.addAll(iVar.f140010m);
                }
            }
            if (!iVar.f140011n.isEmpty()) {
                if (this.f140029n.isEmpty()) {
                    this.f140029n = iVar.f140011n;
                    this.f140019d &= -513;
                } else {
                    w();
                    this.f140029n.addAll(iVar.f140011n);
                }
            }
            if (!iVar.f140013p.isEmpty()) {
                if (this.f140030o.isEmpty()) {
                    this.f140030o = iVar.f140013p;
                    this.f140019d &= -1025;
                } else {
                    A();
                    this.f140030o.addAll(iVar.f140013p);
                }
            }
            if (iVar.u0()) {
                L(iVar.h0());
            }
            if (!iVar.f140015r.isEmpty()) {
                if (this.f140032q.isEmpty()) {
                    this.f140032q = iVar.f140015r;
                    this.f140019d &= -4097;
                } else {
                    C();
                    this.f140032q.addAll(iVar.f140015r);
                }
            }
            if (iVar.m0()) {
                E(iVar.U());
            }
            n(iVar);
            j(e().i(iVar.f140000c));
            return this;
        }

        /* renamed from: H */
        public b o1(C17194e eVar, C17196g gVar) {
            i iVar;
            i iVar2 = null;
            try {
                i c10 = i.f139999w.c(eVar, gVar);
                if (c10 != null) {
                    f(c10);
                }
                return this;
            } catch (C17200k e10) {
                iVar = (i) e10.a();
                throw e10;
            } catch (Throwable th2) {
                th = th2;
                iVar2 = iVar;
            }
            if (iVar2 != null) {
                f(iVar2);
            }
            throw th;
        }

        public b I(q qVar) {
            if ((this.f140019d & 64) != 64 || this.f140026k == q.S()) {
                this.f140026k = qVar;
            } else {
                this.f140026k = q.t0(this.f140026k).f(qVar).r();
            }
            this.f140019d |= 64;
            return this;
        }

        public b K(q qVar) {
            if ((this.f140019d & 8) != 8 || this.f140023h == q.S()) {
                this.f140023h = qVar;
            } else {
                this.f140023h = q.t0(this.f140023h).f(qVar).r();
            }
            this.f140019d |= 8;
            return this;
        }

        public b L(t tVar) {
            if ((this.f140019d & RecyclerView.n.FLAG_MOVED) != 2048 || this.f140031p == t.r()) {
                this.f140031p = tVar;
            } else {
                this.f140031p = t.z(this.f140031p).f(tVar).m();
            }
            this.f140019d |= RecyclerView.n.FLAG_MOVED;
            return this;
        }

        public b M(int i10) {
            this.f140019d |= 1;
            this.f140020e = i10;
            return this;
        }

        public b N(int i10) {
            this.f140019d |= 4;
            this.f140022g = i10;
            return this;
        }

        public b O(int i10) {
            this.f140019d |= 2;
            this.f140021f = i10;
            return this;
        }

        public b P(int i10) {
            this.f140019d |= 128;
            this.f140027l = i10;
            return this;
        }

        public b Q(int i10) {
            this.f140019d |= 16;
            this.f140024i = i10;
            return this;
        }

        /* renamed from: p */
        public i g() {
            i r10 = r();
            if (r10.isInitialized()) {
                return r10;
            }
            throw C17190a.C3485a.c(r10);
        }

        public i r() {
            i iVar = new i((C17198i.c) this);
            int i10 = this.f140019d;
            int i11 = 1;
            if ((i10 & 1) != 1) {
                i11 = 0;
            }
            int unused = iVar.f140002e = this.f140020e;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            int unused2 = iVar.f140003f = this.f140021f;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            int unused3 = iVar.f140004g = this.f140022g;
            if ((i10 & 8) == 8) {
                i11 |= 8;
            }
            q unused4 = iVar.f140005h = this.f140023h;
            if ((i10 & 16) == 16) {
                i11 |= 16;
            }
            int unused5 = iVar.f140006i = this.f140024i;
            if ((this.f140019d & 32) == 32) {
                this.f140025j = Collections.unmodifiableList(this.f140025j);
                this.f140019d &= -33;
            }
            List unused6 = iVar.f140007j = this.f140025j;
            if ((i10 & 64) == 64) {
                i11 |= 32;
            }
            q unused7 = iVar.f140008k = this.f140026k;
            if ((i10 & 128) == 128) {
                i11 |= 64;
            }
            int unused8 = iVar.f140009l = this.f140027l;
            if ((this.f140019d & 256) == 256) {
                this.f140028m = Collections.unmodifiableList(this.f140028m);
                this.f140019d &= -257;
            }
            List unused9 = iVar.f140010m = this.f140028m;
            if ((this.f140019d & 512) == 512) {
                this.f140029n = Collections.unmodifiableList(this.f140029n);
                this.f140019d &= -513;
            }
            List unused10 = iVar.f140011n = this.f140029n;
            if ((this.f140019d & 1024) == 1024) {
                this.f140030o = Collections.unmodifiableList(this.f140030o);
                this.f140019d &= -1025;
            }
            List unused11 = iVar.f140013p = this.f140030o;
            if ((i10 & RecyclerView.n.FLAG_MOVED) == 2048) {
                i11 |= 128;
            }
            t unused12 = iVar.f140014q = this.f140031p;
            if ((this.f140019d & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096) {
                this.f140032q = Collections.unmodifiableList(this.f140032q);
                this.f140019d &= -4097;
            }
            List unused13 = iVar.f140015r = this.f140032q;
            if ((i10 & 8192) == 8192) {
                i11 |= 256;
            }
            e unused14 = iVar.f140016s = this.f140033r;
            int unused15 = iVar.f140001d = i11;
            return iVar;
        }

        /* renamed from: u */
        public b d() {
            return v().f(r());
        }
    }

    static {
        i iVar = new i(true);
        f139998v = iVar;
        iVar.v0();
    }

    public static i V() {
        return f139998v;
    }

    private void v0() {
        this.f140002e = 6;
        this.f140003f = 6;
        this.f140004g = 0;
        this.f140005h = q.S();
        this.f140006i = 0;
        this.f140007j = Collections.emptyList();
        this.f140008k = q.S();
        this.f140009l = 0;
        this.f140010m = Collections.emptyList();
        this.f140011n = Collections.emptyList();
        this.f140013p = Collections.emptyList();
        this.f140014q = t.r();
        this.f140015r = Collections.emptyList();
        this.f140016s = e.p();
    }

    public static b w0() {
        return b.v();
    }

    public static b x0(i iVar) {
        return w0().f(iVar);
    }

    public static i z0(InputStream inputStream, C17196g gVar) {
        return f139999w.a(inputStream, gVar);
    }

    /* renamed from: A0 */
    public b toBuilder() {
        return x0(this);
    }

    public q Q(int i10) {
        return this.f140010m.get(i10);
    }

    public int R() {
        return this.f140010m.size();
    }

    public List<Integer> S() {
        return this.f140011n;
    }

    public List<q> T() {
        return this.f140010m;
    }

    public e U() {
        return this.f140016s;
    }

    /* renamed from: W */
    public i getDefaultInstanceForType() {
        return f139998v;
    }

    public int X() {
        return this.f140002e;
    }

    public int Y() {
        return this.f140004g;
    }

    public int Z() {
        return this.f140003f;
    }

    public void a(C17195f fVar) {
        getSerializedSize();
        C17198i.d<MessageType>.defpackage.a t10 = t();
        if ((this.f140001d & 2) == 2) {
            fVar.a0(1, this.f140003f);
        }
        if ((this.f140001d & 4) == 4) {
            fVar.a0(2, this.f140004g);
        }
        if ((this.f140001d & 8) == 8) {
            fVar.d0(3, this.f140005h);
        }
        for (int i10 = 0; i10 < this.f140007j.size(); i10++) {
            fVar.d0(4, this.f140007j.get(i10));
        }
        if ((this.f140001d & 32) == 32) {
            fVar.d0(5, this.f140008k);
        }
        for (int i11 = 0; i11 < this.f140013p.size(); i11++) {
            fVar.d0(6, this.f140013p.get(i11));
        }
        if ((this.f140001d & 16) == 16) {
            fVar.a0(7, this.f140006i);
        }
        if ((this.f140001d & 64) == 64) {
            fVar.a0(8, this.f140009l);
        }
        if ((this.f140001d & 1) == 1) {
            fVar.a0(9, this.f140002e);
        }
        for (int i12 = 0; i12 < this.f140010m.size(); i12++) {
            fVar.d0(10, this.f140010m.get(i12));
        }
        if (S().size() > 0) {
            fVar.o0(90);
            fVar.o0(this.f140012o);
        }
        for (int i13 = 0; i13 < this.f140011n.size(); i13++) {
            fVar.b0(this.f140011n.get(i13).intValue());
        }
        if ((this.f140001d & 128) == 128) {
            fVar.d0(30, this.f140014q);
        }
        for (int i14 = 0; i14 < this.f140015r.size(); i14++) {
            fVar.a0(31, this.f140015r.get(i14).intValue());
        }
        if ((this.f140001d & 256) == 256) {
            fVar.d0(32, this.f140016s);
        }
        t10.a(19000, fVar);
        fVar.i0(this.f140000c);
    }

    public q a0() {
        return this.f140008k;
    }

    public int b0() {
        return this.f140009l;
    }

    public q c0() {
        return this.f140005h;
    }

    public int d0() {
        return this.f140006i;
    }

    public s e0(int i10) {
        return this.f140007j.get(i10);
    }

    public int f0() {
        return this.f140007j.size();
    }

    public List<s> g0() {
        return this.f140007j;
    }

    public C17208s<i> getParserForType() {
        return f139999w;
    }

    public int getSerializedSize() {
        int i10 = this.f140018u;
        if (i10 != -1) {
            return i10;
        }
        int o10 = (this.f140001d & 2) == 2 ? C17195f.o(1, this.f140003f) : 0;
        if ((this.f140001d & 4) == 4) {
            o10 += C17195f.o(2, this.f140004g);
        }
        if ((this.f140001d & 8) == 8) {
            o10 += C17195f.s(3, this.f140005h);
        }
        for (int i11 = 0; i11 < this.f140007j.size(); i11++) {
            o10 += C17195f.s(4, this.f140007j.get(i11));
        }
        if ((this.f140001d & 32) == 32) {
            o10 += C17195f.s(5, this.f140008k);
        }
        for (int i12 = 0; i12 < this.f140013p.size(); i12++) {
            o10 += C17195f.s(6, this.f140013p.get(i12));
        }
        if ((this.f140001d & 16) == 16) {
            o10 += C17195f.o(7, this.f140006i);
        }
        if ((this.f140001d & 64) == 64) {
            o10 += C17195f.o(8, this.f140009l);
        }
        if ((this.f140001d & 1) == 1) {
            o10 += C17195f.o(9, this.f140002e);
        }
        for (int i13 = 0; i13 < this.f140010m.size(); i13++) {
            o10 += C17195f.s(10, this.f140010m.get(i13));
        }
        int i14 = 0;
        for (int i15 = 0; i15 < this.f140011n.size(); i15++) {
            i14 += C17195f.p(this.f140011n.get(i15).intValue());
        }
        int i16 = o10 + i14;
        if (!S().isEmpty()) {
            i16 = i16 + 1 + C17195f.p(i14);
        }
        this.f140012o = i14;
        if ((this.f140001d & 128) == 128) {
            i16 += C17195f.s(30, this.f140014q);
        }
        int i17 = 0;
        for (int i18 = 0; i18 < this.f140015r.size(); i18++) {
            i17 += C17195f.p(this.f140015r.get(i18).intValue());
        }
        int size = i16 + i17 + (l0().size() * 2);
        if ((this.f140001d & 256) == 256) {
            size += C17195f.s(32, this.f140016s);
        }
        int o11 = size + o() + this.f140000c.size();
        this.f140018u = o11;
        return o11;
    }

    public t h0() {
        return this.f140014q;
    }

    public u i0(int i10) {
        return this.f140013p.get(i10);
    }

    public final boolean isInitialized() {
        byte b10 = this.f140017t;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!o0()) {
            this.f140017t = 0;
            return false;
        } else if (!s0() || c0().isInitialized()) {
            for (int i10 = 0; i10 < f0(); i10++) {
                if (!e0(i10).isInitialized()) {
                    this.f140017t = 0;
                    return false;
                }
            }
            if (!q0() || a0().isInitialized()) {
                for (int i11 = 0; i11 < R(); i11++) {
                    if (!Q(i11).isInitialized()) {
                        this.f140017t = 0;
                        return false;
                    }
                }
                for (int i12 = 0; i12 < j0(); i12++) {
                    if (!i0(i12).isInitialized()) {
                        this.f140017t = 0;
                        return false;
                    }
                }
                if (u0() && !h0().isInitialized()) {
                    this.f140017t = 0;
                    return false;
                } else if (m0() && !U().isInitialized()) {
                    this.f140017t = 0;
                    return false;
                } else if (!n()) {
                    this.f140017t = 0;
                    return false;
                } else {
                    this.f140017t = 1;
                    return true;
                }
            } else {
                this.f140017t = 0;
                return false;
            }
        } else {
            this.f140017t = 0;
            return false;
        }
    }

    public int j0() {
        return this.f140013p.size();
    }

    public List<u> k0() {
        return this.f140013p;
    }

    public List<Integer> l0() {
        return this.f140015r;
    }

    public boolean m0() {
        return (this.f140001d & 256) == 256;
    }

    public boolean n0() {
        return (this.f140001d & 1) == 1;
    }

    public boolean o0() {
        return (this.f140001d & 4) == 4;
    }

    public boolean p0() {
        return (this.f140001d & 2) == 2;
    }

    public boolean q0() {
        return (this.f140001d & 32) == 32;
    }

    public boolean r0() {
        return (this.f140001d & 64) == 64;
    }

    public boolean s0() {
        return (this.f140001d & 8) == 8;
    }

    public boolean t0() {
        return (this.f140001d & 16) == 16;
    }

    public boolean u0() {
        return (this.f140001d & 128) == 128;
    }

    /* renamed from: y0 */
    public b newBuilderForType() {
        return w0();
    }

    private i(C17198i.c<i, ?> cVar) {
        super(cVar);
        this.f140012o = -1;
        this.f140017t = -1;
        this.f140018u = -1;
        this.f140000c = cVar.e();
    }

    private i(boolean z10) {
        this.f140012o = -1;
        this.f140017t = -1;
        this.f140018u = -1;
        this.f140000c = C17193d.f143014a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: XI.q$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v5, resolved type: XI.q$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v18, resolved type: XI.t$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v27, resolved type: XI.e$b} */
    /* JADX WARNING: type inference failed for: r11v0 */
    /* JADX WARNING: type inference failed for: r11v29 */
    /* JADX WARNING: type inference failed for: r11v30 */
    /* JADX WARNING: type inference failed for: r11v31 */
    /* JADX WARNING: type inference failed for: r11v32 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private i(eJ.C17194e r14, eJ.C17196g r15) {
        /*
            r13 = this;
            r13.<init>()
            r0 = -1
            r13.f140012o = r0
            r13.f140017t = r0
            r13.f140018u = r0
            r13.v0()
            eJ.d$b r0 = eJ.C17193d.B()
            r1 = 1
            eJ.f r2 = eJ.C17195f.J(r0, r1)
            r3 = 0
            r4 = r3
        L_0x0018:
            r5 = 1024(0x400, float:1.435E-42)
            r6 = 32
            r7 = 512(0x200, float:7.175E-43)
            r8 = 4096(0x1000, float:5.74E-42)
            r9 = 256(0x100, float:3.59E-43)
            if (r3 != 0) goto L_0x0273
            int r10 = r14.K()     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r11 = 0
            switch(r10) {
                case 0: goto L_0x0032;
                case 8: goto L_0x0200;
                case 16: goto L_0x01f2;
                case 26: goto L_0x01c9;
                case 34: goto L_0x01af;
                case 42: goto L_0x0188;
                case 50: goto L_0x016e;
                case 56: goto L_0x0160;
                case 64: goto L_0x0152;
                case 72: goto L_0x0145;
                case 82: goto L_0x012b;
                case 88: goto L_0x010f;
                case 90: goto L_0x00db;
                case 242: goto L_0x00b2;
                case 248: goto L_0x0096;
                case 250: goto L_0x0063;
                case 258: goto L_0x003d;
                default: goto L_0x002c;
            }     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
        L_0x002c:
            boolean r5 = r13.k(r14, r2, r15, r10)     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            if (r5 != 0) goto L_0x0018
        L_0x0032:
            r3 = r1
            goto L_0x0018
        L_0x0034:
            r14 = move-exception
            goto L_0x0221
        L_0x0037:
            r14 = move-exception
            goto L_0x020e
        L_0x003a:
            r14 = move-exception
            goto L_0x021c
        L_0x003d:
            int r10 = r13.f140001d     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r10 = r10 & r9
            if (r10 != r9) goto L_0x0048
            XI.e r10 = r13.f140016s     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            XI.e$b r11 = r10.toBuilder()     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
        L_0x0048:
            eJ.s<XI.e> r10 = XI.e.f139946g     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            eJ.q r10 = r14.u(r10, r15)     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            XI.e r10 = (XI.e) r10     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r13.f140016s = r10     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            if (r11 == 0) goto L_0x005d
            r11.f(r10)     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            XI.e r10 = r11.m()     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r13.f140016s = r10     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
        L_0x005d:
            int r10 = r13.f140001d     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r10 = r10 | r9
            r13.f140001d = r10     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            goto L_0x0018
        L_0x0063:
            int r10 = r14.A()     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            int r10 = r14.j(r10)     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r11 = r4 & 4096(0x1000, float:5.74E-42)
            if (r11 == r8) goto L_0x007e
            int r11 = r14.e()     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            if (r11 <= 0) goto L_0x007e
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r11.<init>()     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r13.f140015r = r11     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r4 = r4 | 4096(0x1000, float:5.74E-42)
        L_0x007e:
            int r11 = r14.e()     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            if (r11 <= 0) goto L_0x0092
            java.util.List<java.lang.Integer> r11 = r13.f140015r     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            int r12 = r14.s()     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r11.add(r12)     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            goto L_0x007e
        L_0x0092:
            r14.i(r10)     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            goto L_0x0018
        L_0x0096:
            r10 = r4 & 4096(0x1000, float:5.74E-42)
            if (r10 == r8) goto L_0x00a3
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r10.<init>()     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r13.f140015r = r10     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r4 = r4 | 4096(0x1000, float:5.74E-42)
        L_0x00a3:
            java.util.List<java.lang.Integer> r10 = r13.f140015r     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            int r11 = r14.s()     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r10.add(r11)     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            goto L_0x0018
        L_0x00b2:
            int r10 = r13.f140001d     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r12 = 128(0x80, float:1.794E-43)
            r10 = r10 & r12
            if (r10 != r12) goto L_0x00bf
            XI.t r10 = r13.f140014q     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            XI.t$b r11 = r10.toBuilder()     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
        L_0x00bf:
            eJ.s<XI.t> r10 = XI.t.f140225i     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            eJ.q r10 = r14.u(r10, r15)     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            XI.t r10 = (XI.t) r10     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r13.f140014q = r10     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            if (r11 == 0) goto L_0x00d4
            r11.f(r10)     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            XI.t r10 = r11.m()     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r13.f140014q = r10     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
        L_0x00d4:
            int r10 = r13.f140001d     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r10 = r10 | r12
            r13.f140001d = r10     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            goto L_0x0018
        L_0x00db:
            int r10 = r14.A()     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            int r10 = r14.j(r10)     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r11 = r4 & 512(0x200, float:7.175E-43)
            if (r11 == r7) goto L_0x00f6
            int r11 = r14.e()     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            if (r11 <= 0) goto L_0x00f6
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r11.<init>()     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r13.f140011n = r11     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r4 = r4 | 512(0x200, float:7.175E-43)
        L_0x00f6:
            int r11 = r14.e()     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            if (r11 <= 0) goto L_0x010a
            java.util.List<java.lang.Integer> r11 = r13.f140011n     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            int r12 = r14.s()     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r11.add(r12)     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            goto L_0x00f6
        L_0x010a:
            r14.i(r10)     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            goto L_0x0018
        L_0x010f:
            r10 = r4 & 512(0x200, float:7.175E-43)
            if (r10 == r7) goto L_0x011c
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r10.<init>()     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r13.f140011n = r10     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r4 = r4 | 512(0x200, float:7.175E-43)
        L_0x011c:
            java.util.List<java.lang.Integer> r10 = r13.f140011n     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            int r11 = r14.s()     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r10.add(r11)     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            goto L_0x0018
        L_0x012b:
            r10 = r4 & 256(0x100, float:3.59E-43)
            if (r10 == r9) goto L_0x0138
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r10.<init>()     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r13.f140010m = r10     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r4 = r4 | 256(0x100, float:3.59E-43)
        L_0x0138:
            java.util.List<XI.q> r10 = r13.f140010m     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            eJ.s<XI.q> r11 = XI.q.f140132v     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            eJ.q r11 = r14.u(r11, r15)     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r10.add(r11)     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            goto L_0x0018
        L_0x0145:
            int r10 = r13.f140001d     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r10 = r10 | r1
            r13.f140001d = r10     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            int r10 = r14.s()     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r13.f140002e = r10     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            goto L_0x0018
        L_0x0152:
            int r10 = r13.f140001d     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r10 = r10 | 64
            r13.f140001d = r10     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            int r10 = r14.s()     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r13.f140009l = r10     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            goto L_0x0018
        L_0x0160:
            int r10 = r13.f140001d     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r10 = r10 | 16
            r13.f140001d = r10     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            int r10 = r14.s()     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r13.f140006i = r10     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            goto L_0x0018
        L_0x016e:
            r10 = r4 & 1024(0x400, float:1.435E-42)
            if (r10 == r5) goto L_0x017b
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r10.<init>()     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r13.f140013p = r10     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r4 = r4 | 1024(0x400, float:1.435E-42)
        L_0x017b:
            java.util.List<XI.u> r10 = r13.f140013p     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            eJ.s<XI.u> r11 = XI.u.f140236n     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            eJ.q r11 = r14.u(r11, r15)     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r10.add(r11)     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            goto L_0x0018
        L_0x0188:
            int r10 = r13.f140001d     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r10 = r10 & r6
            if (r10 != r6) goto L_0x0193
            XI.q r10 = r13.f140008k     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            XI.q$c r11 = r10.toBuilder()     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
        L_0x0193:
            eJ.s<XI.q> r10 = XI.q.f140132v     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            eJ.q r10 = r14.u(r10, r15)     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            XI.q r10 = (XI.q) r10     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r13.f140008k = r10     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            if (r11 == 0) goto L_0x01a8
            r11.f(r10)     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            XI.q r10 = r11.r()     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r13.f140008k = r10     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
        L_0x01a8:
            int r10 = r13.f140001d     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r10 = r10 | r6
            r13.f140001d = r10     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            goto L_0x0018
        L_0x01af:
            r10 = r4 & 32
            if (r10 == r6) goto L_0x01bc
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r10.<init>()     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r13.f140007j = r10     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r4 = r4 | 32
        L_0x01bc:
            java.util.List<XI.s> r10 = r13.f140007j     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            eJ.s<XI.s> r11 = XI.s.f140205o     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            eJ.q r11 = r14.u(r11, r15)     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r10.add(r11)     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            goto L_0x0018
        L_0x01c9:
            int r10 = r13.f140001d     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r12 = 8
            r10 = r10 & r12
            if (r10 != r12) goto L_0x01d6
            XI.q r10 = r13.f140005h     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            XI.q$c r11 = r10.toBuilder()     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
        L_0x01d6:
            eJ.s<XI.q> r10 = XI.q.f140132v     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            eJ.q r10 = r14.u(r10, r15)     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            XI.q r10 = (XI.q) r10     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r13.f140005h = r10     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            if (r11 == 0) goto L_0x01eb
            r11.f(r10)     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            XI.q r10 = r11.r()     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r13.f140005h = r10     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
        L_0x01eb:
            int r10 = r13.f140001d     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r10 = r10 | r12
            r13.f140001d = r10     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            goto L_0x0018
        L_0x01f2:
            int r10 = r13.f140001d     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r10 = r10 | 4
            r13.f140001d = r10     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            int r10 = r14.s()     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r13.f140004g = r10     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            goto L_0x0018
        L_0x0200:
            int r10 = r13.f140001d     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r10 = r10 | 2
            r13.f140001d = r10     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            int r10 = r14.s()     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            r13.f140003f = r10     // Catch:{ k -> 0x003a, IOException -> 0x0037 }
            goto L_0x0018
        L_0x020e:
            eJ.k r15 = new eJ.k     // Catch:{ all -> 0x0034 }
            java.lang.String r14 = r14.getMessage()     // Catch:{ all -> 0x0034 }
            r15.<init>(r14)     // Catch:{ all -> 0x0034 }
            eJ.k r14 = r15.i(r13)     // Catch:{ all -> 0x0034 }
            throw r14     // Catch:{ all -> 0x0034 }
        L_0x021c:
            eJ.k r14 = r14.i(r13)     // Catch:{ all -> 0x0034 }
            throw r14     // Catch:{ all -> 0x0034 }
        L_0x0221:
            r15 = r4 & 32
            if (r15 != r6) goto L_0x022d
            java.util.List<XI.s> r15 = r13.f140007j
            java.util.List r15 = java.util.Collections.unmodifiableList(r15)
            r13.f140007j = r15
        L_0x022d:
            r15 = r4 & 1024(0x400, float:1.435E-42)
            if (r15 != r5) goto L_0x0239
            java.util.List<XI.u> r15 = r13.f140013p
            java.util.List r15 = java.util.Collections.unmodifiableList(r15)
            r13.f140013p = r15
        L_0x0239:
            r15 = r4 & 256(0x100, float:3.59E-43)
            if (r15 != r9) goto L_0x0245
            java.util.List<XI.q> r15 = r13.f140010m
            java.util.List r15 = java.util.Collections.unmodifiableList(r15)
            r13.f140010m = r15
        L_0x0245:
            r15 = r4 & 512(0x200, float:7.175E-43)
            if (r15 != r7) goto L_0x0251
            java.util.List<java.lang.Integer> r15 = r13.f140011n
            java.util.List r15 = java.util.Collections.unmodifiableList(r15)
            r13.f140011n = r15
        L_0x0251:
            r15 = r4 & 4096(0x1000, float:5.74E-42)
            if (r15 != r8) goto L_0x025d
            java.util.List<java.lang.Integer> r15 = r13.f140015r
            java.util.List r15 = java.util.Collections.unmodifiableList(r15)
            r13.f140015r = r15
        L_0x025d:
            r2.I()     // Catch:{ IOException -> 0x0260, all -> 0x0267 }
        L_0x0260:
            eJ.d r15 = r0.g()
            r13.f140000c = r15
            goto L_0x026f
        L_0x0267:
            r14 = move-exception
            eJ.d r15 = r0.g()
            r13.f140000c = r15
            throw r14
        L_0x026f:
            r13.h()
            throw r14
        L_0x0273:
            r14 = r4 & 32
            if (r14 != r6) goto L_0x027f
            java.util.List<XI.s> r14 = r13.f140007j
            java.util.List r14 = java.util.Collections.unmodifiableList(r14)
            r13.f140007j = r14
        L_0x027f:
            r14 = r4 & 1024(0x400, float:1.435E-42)
            if (r14 != r5) goto L_0x028b
            java.util.List<XI.u> r14 = r13.f140013p
            java.util.List r14 = java.util.Collections.unmodifiableList(r14)
            r13.f140013p = r14
        L_0x028b:
            r14 = r4 & 256(0x100, float:3.59E-43)
            if (r14 != r9) goto L_0x0297
            java.util.List<XI.q> r14 = r13.f140010m
            java.util.List r14 = java.util.Collections.unmodifiableList(r14)
            r13.f140010m = r14
        L_0x0297:
            r14 = r4 & 512(0x200, float:7.175E-43)
            if (r14 != r7) goto L_0x02a3
            java.util.List<java.lang.Integer> r14 = r13.f140011n
            java.util.List r14 = java.util.Collections.unmodifiableList(r14)
            r13.f140011n = r14
        L_0x02a3:
            r14 = r4 & 4096(0x1000, float:5.74E-42)
            if (r14 != r8) goto L_0x02af
            java.util.List<java.lang.Integer> r14 = r13.f140015r
            java.util.List r14 = java.util.Collections.unmodifiableList(r14)
            r13.f140015r = r14
        L_0x02af:
            r2.I()     // Catch:{ IOException -> 0x02b2, all -> 0x02b9 }
        L_0x02b2:
            eJ.d r14 = r0.g()
            r13.f140000c = r14
            goto L_0x02c1
        L_0x02b9:
            r14 = move-exception
            eJ.d r15 = r0.g()
            r13.f140000c = r15
            throw r14
        L_0x02c1:
            r13.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: XI.i.<init>(eJ.e, eJ.g):void");
    }
}

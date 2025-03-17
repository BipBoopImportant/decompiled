package XI;

import androidx.recyclerview.widget.RecyclerView;
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

public final class q extends C17198i.d<q> implements C17207r {

    /* renamed from: u  reason: collision with root package name */
    private static final q f140131u;

    /* renamed from: v  reason: collision with root package name */
    public static C17208s<q> f140132v = new a();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C17193d f140133c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public int f140134d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public List<b> f140135e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public boolean f140136f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public int f140137g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public q f140138h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public int f140139i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public int f140140j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public int f140141k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public int f140142l;
    /* access modifiers changed from: private */

    /* renamed from: m  reason: collision with root package name */
    public int f140143m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public q f140144n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public int f140145o;
    /* access modifiers changed from: private */

    /* renamed from: p  reason: collision with root package name */
    public q f140146p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public int f140147q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public int f140148r;

    /* renamed from: s  reason: collision with root package name */
    private byte f140149s;

    /* renamed from: t  reason: collision with root package name */
    private int f140150t;

    static class a extends C17191b<q> {
        a() {
        }

        /* renamed from: m */
        public q c(C17194e eVar, C17196g gVar) {
            return new q(eVar, gVar);
        }
    }

    public static final class c extends C17198i.c<q, c> implements C17207r {

        /* renamed from: d  reason: collision with root package name */
        private int f140164d;

        /* renamed from: e  reason: collision with root package name */
        private List<b> f140165e = Collections.emptyList();

        /* renamed from: f  reason: collision with root package name */
        private boolean f140166f;

        /* renamed from: g  reason: collision with root package name */
        private int f140167g;

        /* renamed from: h  reason: collision with root package name */
        private q f140168h = q.S();

        /* renamed from: i  reason: collision with root package name */
        private int f140169i;

        /* renamed from: j  reason: collision with root package name */
        private int f140170j;

        /* renamed from: k  reason: collision with root package name */
        private int f140171k;

        /* renamed from: l  reason: collision with root package name */
        private int f140172l;

        /* renamed from: m  reason: collision with root package name */
        private int f140173m;

        /* renamed from: n  reason: collision with root package name */
        private q f140174n = q.S();

        /* renamed from: o  reason: collision with root package name */
        private int f140175o;

        /* renamed from: p  reason: collision with root package name */
        private q f140176p = q.S();

        /* renamed from: q  reason: collision with root package name */
        private int f140177q;

        /* renamed from: r  reason: collision with root package name */
        private int f140178r;

        private c() {
            y();
        }

        /* access modifiers changed from: private */
        public static c v() {
            return new c();
        }

        private void w() {
            if ((this.f140164d & 1) != 1) {
                this.f140165e = new ArrayList(this.f140165e);
                this.f140164d |= 1;
            }
        }

        private void y() {
        }

        public c A(q qVar) {
            if ((this.f140164d & 8) != 8 || this.f140168h == q.S()) {
                this.f140168h = qVar;
            } else {
                this.f140168h = q.t0(this.f140168h).f(qVar).r();
            }
            this.f140164d |= 8;
            return this;
        }

        /* renamed from: C */
        public c f(q qVar) {
            if (qVar == q.S()) {
                return this;
            }
            if (!qVar.f140135e.isEmpty()) {
                if (this.f140165e.isEmpty()) {
                    this.f140165e = qVar.f140135e;
                    this.f140164d &= -2;
                } else {
                    w();
                    this.f140165e.addAll(qVar.f140135e);
                }
            }
            if (qVar.l0()) {
                M(qVar.Y());
            }
            if (qVar.i0()) {
                K(qVar.V());
            }
            if (qVar.j0()) {
                A(qVar.W());
            }
            if (qVar.k0()) {
                L(qVar.X());
            }
            if (qVar.g0()) {
                H(qVar.R());
            }
            if (qVar.p0()) {
                P(qVar.c0());
            }
            if (qVar.q0()) {
                Q(qVar.d0());
            }
            if (qVar.o0()) {
                O(qVar.b0());
            }
            if (qVar.m0()) {
                E(qVar.Z());
            }
            if (qVar.n0()) {
                N(qVar.a0());
            }
            if (qVar.e0()) {
                z(qVar.M());
            }
            if (qVar.f0()) {
                G(qVar.N());
            }
            if (qVar.h0()) {
                I(qVar.U());
            }
            n(qVar);
            j(e().i(qVar.f140133c));
            return this;
        }

        /* renamed from: D */
        public c o1(C17194e eVar, C17196g gVar) {
            q qVar;
            q qVar2 = null;
            try {
                q c10 = q.f140132v.c(eVar, gVar);
                if (c10 != null) {
                    f(c10);
                }
                return this;
            } catch (C17200k e10) {
                qVar = (q) e10.a();
                throw e10;
            } catch (Throwable th2) {
                th = th2;
                qVar2 = qVar;
            }
            if (qVar2 != null) {
                f(qVar2);
            }
            throw th;
        }

        public c E(q qVar) {
            if ((this.f140164d & 512) != 512 || this.f140174n == q.S()) {
                this.f140174n = qVar;
            } else {
                this.f140174n = q.t0(this.f140174n).f(qVar).r();
            }
            this.f140164d |= 512;
            return this;
        }

        public c G(int i10) {
            this.f140164d |= RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT;
            this.f140177q = i10;
            return this;
        }

        public c H(int i10) {
            this.f140164d |= 32;
            this.f140170j = i10;
            return this;
        }

        public c I(int i10) {
            this.f140164d |= 8192;
            this.f140178r = i10;
            return this;
        }

        public c K(int i10) {
            this.f140164d |= 4;
            this.f140167g = i10;
            return this;
        }

        public c L(int i10) {
            this.f140164d |= 16;
            this.f140169i = i10;
            return this;
        }

        public c M(boolean z10) {
            this.f140164d |= 2;
            this.f140166f = z10;
            return this;
        }

        public c N(int i10) {
            this.f140164d |= 1024;
            this.f140175o = i10;
            return this;
        }

        public c O(int i10) {
            this.f140164d |= 256;
            this.f140173m = i10;
            return this;
        }

        public c P(int i10) {
            this.f140164d |= 64;
            this.f140171k = i10;
            return this;
        }

        public c Q(int i10) {
            this.f140164d |= 128;
            this.f140172l = i10;
            return this;
        }

        /* renamed from: p */
        public q g() {
            q r10 = r();
            if (r10.isInitialized()) {
                return r10;
            }
            throw C17190a.C3485a.c(r10);
        }

        public q r() {
            q qVar = new q((C17198i.c) this);
            int i10 = this.f140164d;
            int i11 = 1;
            if ((i10 & 1) == 1) {
                this.f140165e = Collections.unmodifiableList(this.f140165e);
                this.f140164d &= -2;
            }
            List unused = qVar.f140135e = this.f140165e;
            if ((i10 & 2) != 2) {
                i11 = 0;
            }
            boolean unused2 = qVar.f140136f = this.f140166f;
            if ((i10 & 4) == 4) {
                i11 |= 2;
            }
            int unused3 = qVar.f140137g = this.f140167g;
            if ((i10 & 8) == 8) {
                i11 |= 4;
            }
            q unused4 = qVar.f140138h = this.f140168h;
            if ((i10 & 16) == 16) {
                i11 |= 8;
            }
            int unused5 = qVar.f140139i = this.f140169i;
            if ((i10 & 32) == 32) {
                i11 |= 16;
            }
            int unused6 = qVar.f140140j = this.f140170j;
            if ((i10 & 64) == 64) {
                i11 |= 32;
            }
            int unused7 = qVar.f140141k = this.f140171k;
            if ((i10 & 128) == 128) {
                i11 |= 64;
            }
            int unused8 = qVar.f140142l = this.f140172l;
            if ((i10 & 256) == 256) {
                i11 |= 128;
            }
            int unused9 = qVar.f140143m = this.f140173m;
            if ((i10 & 512) == 512) {
                i11 |= 256;
            }
            q unused10 = qVar.f140144n = this.f140174n;
            if ((i10 & 1024) == 1024) {
                i11 |= 512;
            }
            int unused11 = qVar.f140145o = this.f140175o;
            if ((i10 & RecyclerView.n.FLAG_MOVED) == 2048) {
                i11 |= 1024;
            }
            q unused12 = qVar.f140146p = this.f140176p;
            if ((i10 & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096) {
                i11 |= RecyclerView.n.FLAG_MOVED;
            }
            int unused13 = qVar.f140147q = this.f140177q;
            if ((i10 & 8192) == 8192) {
                i11 |= RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT;
            }
            int unused14 = qVar.f140148r = this.f140178r;
            int unused15 = qVar.f140134d = i11;
            return qVar;
        }

        /* renamed from: u */
        public c d() {
            return v().f(r());
        }

        public c z(q qVar) {
            if ((this.f140164d & RecyclerView.n.FLAG_MOVED) != 2048 || this.f140176p == q.S()) {
                this.f140176p = qVar;
            } else {
                this.f140176p = q.t0(this.f140176p).f(qVar).r();
            }
            this.f140164d |= RecyclerView.n.FLAG_MOVED;
            return this;
        }
    }

    static {
        q qVar = new q(true);
        f140131u = qVar;
        qVar.r0();
    }

    public static q S() {
        return f140131u;
    }

    private void r0() {
        this.f140135e = Collections.emptyList();
        this.f140136f = false;
        this.f140137g = 0;
        this.f140138h = S();
        this.f140139i = 0;
        this.f140140j = 0;
        this.f140141k = 0;
        this.f140142l = 0;
        this.f140143m = 0;
        this.f140144n = S();
        this.f140145o = 0;
        this.f140146p = S();
        this.f140147q = 0;
        this.f140148r = 0;
    }

    public static c s0() {
        return c.v();
    }

    public static c t0(q qVar) {
        return s0().f(qVar);
    }

    public q M() {
        return this.f140146p;
    }

    public int N() {
        return this.f140147q;
    }

    public b O(int i10) {
        return this.f140135e.get(i10);
    }

    public int P() {
        return this.f140135e.size();
    }

    public List<b> Q() {
        return this.f140135e;
    }

    public int R() {
        return this.f140140j;
    }

    /* renamed from: T */
    public q getDefaultInstanceForType() {
        return f140131u;
    }

    public int U() {
        return this.f140148r;
    }

    public int V() {
        return this.f140137g;
    }

    public q W() {
        return this.f140138h;
    }

    public int X() {
        return this.f140139i;
    }

    public boolean Y() {
        return this.f140136f;
    }

    public q Z() {
        return this.f140144n;
    }

    public void a(C17195f fVar) {
        getSerializedSize();
        C17198i.d<MessageType>.defpackage.a t10 = t();
        if ((this.f140134d & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096) {
            fVar.a0(1, this.f140148r);
        }
        for (int i10 = 0; i10 < this.f140135e.size(); i10++) {
            fVar.d0(2, this.f140135e.get(i10));
        }
        if ((this.f140134d & 1) == 1) {
            fVar.L(3, this.f140136f);
        }
        if ((this.f140134d & 2) == 2) {
            fVar.a0(4, this.f140137g);
        }
        if ((this.f140134d & 4) == 4) {
            fVar.d0(5, this.f140138h);
        }
        if ((this.f140134d & 16) == 16) {
            fVar.a0(6, this.f140140j);
        }
        if ((this.f140134d & 32) == 32) {
            fVar.a0(7, this.f140141k);
        }
        if ((this.f140134d & 8) == 8) {
            fVar.a0(8, this.f140139i);
        }
        if ((this.f140134d & 64) == 64) {
            fVar.a0(9, this.f140142l);
        }
        if ((this.f140134d & 256) == 256) {
            fVar.d0(10, this.f140144n);
        }
        if ((this.f140134d & 512) == 512) {
            fVar.a0(11, this.f140145o);
        }
        if ((this.f140134d & 128) == 128) {
            fVar.a0(12, this.f140143m);
        }
        if ((this.f140134d & 1024) == 1024) {
            fVar.d0(13, this.f140146p);
        }
        if ((this.f140134d & RecyclerView.n.FLAG_MOVED) == 2048) {
            fVar.a0(14, this.f140147q);
        }
        t10.a(200, fVar);
        fVar.i0(this.f140133c);
    }

    public int a0() {
        return this.f140145o;
    }

    public int b0() {
        return this.f140143m;
    }

    public int c0() {
        return this.f140141k;
    }

    public int d0() {
        return this.f140142l;
    }

    public boolean e0() {
        return (this.f140134d & 1024) == 1024;
    }

    public boolean f0() {
        return (this.f140134d & RecyclerView.n.FLAG_MOVED) == 2048;
    }

    public boolean g0() {
        return (this.f140134d & 16) == 16;
    }

    public C17208s<q> getParserForType() {
        return f140132v;
    }

    public int getSerializedSize() {
        int i10 = this.f140150t;
        if (i10 != -1) {
            return i10;
        }
        int o10 = (this.f140134d & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096 ? C17195f.o(1, this.f140148r) : 0;
        for (int i11 = 0; i11 < this.f140135e.size(); i11++) {
            o10 += C17195f.s(2, this.f140135e.get(i11));
        }
        if ((this.f140134d & 1) == 1) {
            o10 += C17195f.a(3, this.f140136f);
        }
        if ((this.f140134d & 2) == 2) {
            o10 += C17195f.o(4, this.f140137g);
        }
        if ((this.f140134d & 4) == 4) {
            o10 += C17195f.s(5, this.f140138h);
        }
        if ((this.f140134d & 16) == 16) {
            o10 += C17195f.o(6, this.f140140j);
        }
        if ((this.f140134d & 32) == 32) {
            o10 += C17195f.o(7, this.f140141k);
        }
        if ((this.f140134d & 8) == 8) {
            o10 += C17195f.o(8, this.f140139i);
        }
        if ((this.f140134d & 64) == 64) {
            o10 += C17195f.o(9, this.f140142l);
        }
        if ((this.f140134d & 256) == 256) {
            o10 += C17195f.s(10, this.f140144n);
        }
        if ((this.f140134d & 512) == 512) {
            o10 += C17195f.o(11, this.f140145o);
        }
        if ((this.f140134d & 128) == 128) {
            o10 += C17195f.o(12, this.f140143m);
        }
        if ((this.f140134d & 1024) == 1024) {
            o10 += C17195f.s(13, this.f140146p);
        }
        if ((this.f140134d & RecyclerView.n.FLAG_MOVED) == 2048) {
            o10 += C17195f.o(14, this.f140147q);
        }
        int o11 = o10 + o() + this.f140133c.size();
        this.f140150t = o11;
        return o11;
    }

    public boolean h0() {
        return (this.f140134d & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096;
    }

    public boolean i0() {
        return (this.f140134d & 2) == 2;
    }

    public final boolean isInitialized() {
        byte b10 = this.f140149s;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < P(); i10++) {
            if (!O(i10).isInitialized()) {
                this.f140149s = 0;
                return false;
            }
        }
        if (j0() && !W().isInitialized()) {
            this.f140149s = 0;
            return false;
        } else if (m0() && !Z().isInitialized()) {
            this.f140149s = 0;
            return false;
        } else if (e0() && !M().isInitialized()) {
            this.f140149s = 0;
            return false;
        } else if (!n()) {
            this.f140149s = 0;
            return false;
        } else {
            this.f140149s = 1;
            return true;
        }
    }

    public boolean j0() {
        return (this.f140134d & 4) == 4;
    }

    public boolean k0() {
        return (this.f140134d & 8) == 8;
    }

    public boolean l0() {
        return (this.f140134d & 1) == 1;
    }

    public boolean m0() {
        return (this.f140134d & 256) == 256;
    }

    public boolean n0() {
        return (this.f140134d & 512) == 512;
    }

    public boolean o0() {
        return (this.f140134d & 128) == 128;
    }

    public boolean p0() {
        return (this.f140134d & 32) == 32;
    }

    public boolean q0() {
        return (this.f140134d & 64) == 64;
    }

    /* renamed from: u0 */
    public c newBuilderForType() {
        return s0();
    }

    /* renamed from: v0 */
    public c toBuilder() {
        return t0(this);
    }

    public static final class b extends C17198i implements C17207r {

        /* renamed from: i  reason: collision with root package name */
        private static final b f140151i;

        /* renamed from: j  reason: collision with root package name */
        public static C17208s<b> f140152j = new a();
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final C17193d f140153b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public int f140154c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public c f140155d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public q f140156e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public int f140157f;

        /* renamed from: g  reason: collision with root package name */
        private byte f140158g;

        /* renamed from: h  reason: collision with root package name */
        private int f140159h;

        static class a extends C17191b<b> {
            a() {
            }

            /* renamed from: m */
            public b c(C17194e eVar, C17196g gVar) {
                return new b(eVar, gVar);
            }
        }

        /* renamed from: XI.q$b$b  reason: collision with other inner class name */
        public static final class C3437b extends C17198i.b<b, C3437b> implements C17207r {

            /* renamed from: b  reason: collision with root package name */
            private int f140160b;

            /* renamed from: c  reason: collision with root package name */
            private c f140161c = c.INV;

            /* renamed from: d  reason: collision with root package name */
            private q f140162d = q.S();

            /* renamed from: e  reason: collision with root package name */
            private int f140163e;

            private C3437b() {
                p();
            }

            /* access modifiers changed from: private */
            public static C3437b o() {
                return new C3437b();
            }

            private void p() {
            }

            /* renamed from: l */
            public b g() {
                b m10 = m();
                if (m10.isInitialized()) {
                    return m10;
                }
                throw C17190a.C3485a.c(m10);
            }

            public b m() {
                b bVar = new b((C17198i.b) this);
                int i10 = this.f140160b;
                int i11 = 1;
                if ((i10 & 1) != 1) {
                    i11 = 0;
                }
                c unused = bVar.f140155d = this.f140161c;
                if ((i10 & 2) == 2) {
                    i11 |= 2;
                }
                q unused2 = bVar.f140156e = this.f140162d;
                if ((i10 & 4) == 4) {
                    i11 |= 4;
                }
                int unused3 = bVar.f140157f = this.f140163e;
                int unused4 = bVar.f140154c = i11;
                return bVar;
            }

            /* renamed from: n */
            public C3437b d() {
                return o().f(m());
            }

            /* renamed from: r */
            public C3437b f(b bVar) {
                if (bVar == b.r()) {
                    return this;
                }
                if (bVar.v()) {
                    w(bVar.s());
                }
                if (bVar.w()) {
                    v(bVar.t());
                }
                if (bVar.x()) {
                    y(bVar.u());
                }
                j(e().i(bVar.f140153b));
                return this;
            }

            /* renamed from: u */
            public C3437b o1(C17194e eVar, C17196g gVar) {
                b bVar;
                b bVar2 = null;
                try {
                    b c10 = b.f140152j.c(eVar, gVar);
                    if (c10 != null) {
                        f(c10);
                    }
                    return this;
                } catch (C17200k e10) {
                    bVar = (b) e10.a();
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

            public C3437b v(q qVar) {
                if ((this.f140160b & 2) != 2 || this.f140162d == q.S()) {
                    this.f140162d = qVar;
                } else {
                    this.f140162d = q.t0(this.f140162d).f(qVar).r();
                }
                this.f140160b |= 2;
                return this;
            }

            public C3437b w(c cVar) {
                cVar.getClass();
                this.f140160b |= 1;
                this.f140161c = cVar;
                return this;
            }

            public C3437b y(int i10) {
                this.f140160b |= 4;
                this.f140163e = i10;
                return this;
            }
        }

        public enum c implements C17199j.a {
            IN(0, 0),
            OUT(1, 1),
            INV(2, 2),
            STAR(3, 3);
            
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
                if (i10 == 2) {
                    return INV;
                }
                if (i10 != 3) {
                    return null;
                }
                return STAR;
            }

            public final int d() {
                return this.value;
            }
        }

        static {
            b bVar = new b(true);
            f140151i = bVar;
            bVar.y();
        }

        public static C3437b A(b bVar) {
            return z().f(bVar);
        }

        public static b r() {
            return f140151i;
        }

        private void y() {
            this.f140155d = c.INV;
            this.f140156e = q.S();
            this.f140157f = 0;
        }

        public static C3437b z() {
            return C3437b.o();
        }

        /* renamed from: B */
        public C3437b newBuilderForType() {
            return z();
        }

        /* renamed from: C */
        public C3437b toBuilder() {
            return A(this);
        }

        public void a(C17195f fVar) {
            getSerializedSize();
            if ((this.f140154c & 1) == 1) {
                fVar.S(1, this.f140155d.d());
            }
            if ((this.f140154c & 2) == 2) {
                fVar.d0(2, this.f140156e);
            }
            if ((this.f140154c & 4) == 4) {
                fVar.a0(3, this.f140157f);
            }
            fVar.i0(this.f140153b);
        }

        public C17208s<b> getParserForType() {
            return f140152j;
        }

        public int getSerializedSize() {
            int i10 = this.f140159h;
            if (i10 != -1) {
                return i10;
            }
            int h10 = (this.f140154c & 1) == 1 ? C17195f.h(1, this.f140155d.d()) : 0;
            if ((this.f140154c & 2) == 2) {
                h10 += C17195f.s(2, this.f140156e);
            }
            if ((this.f140154c & 4) == 4) {
                h10 += C17195f.o(3, this.f140157f);
            }
            int size = h10 + this.f140153b.size();
            this.f140159h = size;
            return size;
        }

        public final boolean isInitialized() {
            byte b10 = this.f140158g;
            if (b10 == 1) {
                return true;
            }
            if (b10 == 0) {
                return false;
            }
            if (!w() || t().isInitialized()) {
                this.f140158g = 1;
                return true;
            }
            this.f140158g = 0;
            return false;
        }

        public c s() {
            return this.f140155d;
        }

        public q t() {
            return this.f140156e;
        }

        public int u() {
            return this.f140157f;
        }

        public boolean v() {
            return (this.f140154c & 1) == 1;
        }

        public boolean w() {
            return (this.f140154c & 2) == 2;
        }

        public boolean x() {
            return (this.f140154c & 4) == 4;
        }

        private b(C17198i.b bVar) {
            super(bVar);
            this.f140158g = -1;
            this.f140159h = -1;
            this.f140153b = bVar.e();
        }

        private b(boolean z10) {
            this.f140158g = -1;
            this.f140159h = -1;
            this.f140153b = C17193d.f143014a;
        }

        private b(C17194e eVar, C17196g gVar) {
            this.f140158g = -1;
            this.f140159h = -1;
            y();
            C17193d.b B10 = C17193d.B();
            C17195f J10 = C17195f.J(B10, 1);
            boolean z10 = false;
            while (!z10) {
                try {
                    int K10 = eVar.K();
                    if (K10 != 0) {
                        if (K10 == 8) {
                            int n10 = eVar.n();
                            c a10 = c.a(n10);
                            if (a10 == null) {
                                J10.o0(K10);
                                J10.o0(n10);
                            } else {
                                this.f140154c |= 1;
                                this.f140155d = a10;
                            }
                        } else if (K10 == 18) {
                            c v02 = (this.f140154c & 2) == 2 ? this.f140156e.toBuilder() : null;
                            q qVar = (q) eVar.u(q.f140132v, gVar);
                            this.f140156e = qVar;
                            if (v02 != null) {
                                v02.f(qVar);
                                this.f140156e = v02.r();
                            }
                            this.f140154c |= 2;
                        } else if (K10 == 24) {
                            this.f140154c |= 4;
                            this.f140157f = eVar.s();
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
                        this.f140153b = B10.g();
                        throw th3;
                    }
                    this.f140153b = B10.g();
                    h();
                    throw th2;
                }
            }
            try {
                J10.I();
            } catch (IOException unused2) {
            } catch (Throwable th4) {
                this.f140153b = B10.g();
                throw th4;
            }
            this.f140153b = B10.g();
            h();
        }
    }

    private q(C17198i.c<q, ?> cVar) {
        super(cVar);
        this.f140149s = -1;
        this.f140150t = -1;
        this.f140133c = cVar.e();
    }

    private q(boolean z10) {
        this.f140149s = -1;
        this.f140150t = -1;
        this.f140133c = C17193d.f143014a;
    }

    private q(C17194e eVar, C17196g gVar) {
        this.f140149s = -1;
        this.f140150t = -1;
        r0();
        C17193d.b B10 = C17193d.B();
        C17195f J10 = C17195f.J(B10, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                int K10 = eVar.K();
                c cVar = null;
                switch (K10) {
                    case 0:
                        z10 = true;
                        break;
                    case 8:
                        this.f140134d |= RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT;
                        this.f140148r = eVar.s();
                        break;
                    case 18:
                        if (!z11) {
                            this.f140135e = new ArrayList();
                            z11 = true;
                        }
                        this.f140135e.add(eVar.u(b.f140152j, gVar));
                        break;
                    case BuildConfig.MIN_SDK_VERSION:
                        this.f140134d |= 1;
                        this.f140136f = eVar.k();
                        break;
                    case 32:
                        this.f140134d |= 2;
                        this.f140137g = eVar.s();
                        break;
                    case 42:
                        cVar = (this.f140134d & 4) == 4 ? this.f140138h.toBuilder() : cVar;
                        q qVar = (q) eVar.u(f140132v, gVar);
                        this.f140138h = qVar;
                        if (cVar != null) {
                            cVar.f(qVar);
                            this.f140138h = cVar.r();
                        }
                        this.f140134d |= 4;
                        break;
                    case 48:
                        this.f140134d |= 16;
                        this.f140140j = eVar.s();
                        break;
                    case 56:
                        this.f140134d |= 32;
                        this.f140141k = eVar.s();
                        break;
                    case 64:
                        this.f140134d |= 8;
                        this.f140139i = eVar.s();
                        break;
                    case 72:
                        this.f140134d |= 64;
                        this.f140142l = eVar.s();
                        break;
                    case 82:
                        cVar = (this.f140134d & 256) == 256 ? this.f140144n.toBuilder() : cVar;
                        q qVar2 = (q) eVar.u(f140132v, gVar);
                        this.f140144n = qVar2;
                        if (cVar != null) {
                            cVar.f(qVar2);
                            this.f140144n = cVar.r();
                        }
                        this.f140134d |= 256;
                        break;
                    case 88:
                        this.f140134d |= 512;
                        this.f140145o = eVar.s();
                        break;
                    case 96:
                        this.f140134d |= 128;
                        this.f140143m = eVar.s();
                        break;
                    case 106:
                        cVar = (this.f140134d & 1024) == 1024 ? this.f140146p.toBuilder() : cVar;
                        q qVar3 = (q) eVar.u(f140132v, gVar);
                        this.f140146p = qVar3;
                        if (cVar != null) {
                            cVar.f(qVar3);
                            this.f140146p = cVar.r();
                        }
                        this.f140134d |= 1024;
                        break;
                    case 112:
                        this.f140134d |= RecyclerView.n.FLAG_MOVED;
                        this.f140147q = eVar.s();
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
                if (z11) {
                    this.f140135e = Collections.unmodifiableList(this.f140135e);
                }
                try {
                    J10.I();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f140133c = B10.g();
                    throw th3;
                }
                this.f140133c = B10.g();
                h();
                throw th2;
            }
        }
        if (z11) {
            this.f140135e = Collections.unmodifiableList(this.f140135e);
        }
        try {
            J10.I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f140133c = B10.g();
            throw th4;
        }
        this.f140133c = B10.g();
        h();
    }
}

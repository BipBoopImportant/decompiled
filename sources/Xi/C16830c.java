package XI;

import androidx.recyclerview.widget.RecyclerView;
import com.google.ar.core.ImageMetadata;
import com.sugarcube.app.base.network.models.UploadKt;
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
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: XI.c  reason: case insensitive filesystem */
public final class C16830c extends C17198i.d<C16830c> implements C17207r {

    /* renamed from: K  reason: collision with root package name */
    private static final C16830c f139871K;

    /* renamed from: L  reason: collision with root package name */
    public static C17208s<C16830c> f139872L = new a();
    /* access modifiers changed from: private */

    /* renamed from: A  reason: collision with root package name */
    public List<Integer> f139873A;

    /* renamed from: B  reason: collision with root package name */
    private int f139874B;
    /* access modifiers changed from: private */

    /* renamed from: C  reason: collision with root package name */
    public List<q> f139875C;
    /* access modifiers changed from: private */

    /* renamed from: D  reason: collision with root package name */
    public List<Integer> f139876D;

    /* renamed from: E  reason: collision with root package name */
    private int f139877E;
    /* access modifiers changed from: private */

    /* renamed from: F  reason: collision with root package name */
    public t f139878F;
    /* access modifiers changed from: private */

    /* renamed from: G  reason: collision with root package name */
    public List<Integer> f139879G;
    /* access modifiers changed from: private */

    /* renamed from: H  reason: collision with root package name */
    public w f139880H;

    /* renamed from: I  reason: collision with root package name */
    private byte f139881I;

    /* renamed from: J  reason: collision with root package name */
    private int f139882J;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C17193d f139883c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public int f139884d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public int f139885e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public int f139886f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public int f139887g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public List<s> f139888h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public List<q> f139889i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public List<Integer> f139890j;

    /* renamed from: k  reason: collision with root package name */
    private int f139891k;
    /* access modifiers changed from: private */

    /* renamed from: l  reason: collision with root package name */
    public List<Integer> f139892l;

    /* renamed from: m  reason: collision with root package name */
    private int f139893m;
    /* access modifiers changed from: private */

    /* renamed from: n  reason: collision with root package name */
    public List<q> f139894n;
    /* access modifiers changed from: private */

    /* renamed from: o  reason: collision with root package name */
    public List<Integer> f139895o;

    /* renamed from: p  reason: collision with root package name */
    private int f139896p;
    /* access modifiers changed from: private */

    /* renamed from: q  reason: collision with root package name */
    public List<C16831d> f139897q;
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public List<i> f139898r;
    /* access modifiers changed from: private */

    /* renamed from: s  reason: collision with root package name */
    public List<n> f139899s;
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public List<r> f139900t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public List<g> f139901u;
    /* access modifiers changed from: private */

    /* renamed from: v  reason: collision with root package name */
    public List<Integer> f139902v;

    /* renamed from: w  reason: collision with root package name */
    private int f139903w;
    /* access modifiers changed from: private */

    /* renamed from: x  reason: collision with root package name */
    public int f139904x;
    /* access modifiers changed from: private */

    /* renamed from: y  reason: collision with root package name */
    public q f139905y;
    /* access modifiers changed from: private */

    /* renamed from: z  reason: collision with root package name */
    public int f139906z;

    /* renamed from: XI.c$a */
    static class a extends C17191b<C16830c> {
        a() {
        }

        /* renamed from: m */
        public C16830c c(C17194e eVar, C17196g gVar) {
            return new C16830c(eVar, gVar);
        }
    }

    /* renamed from: XI.c$b */
    public static final class b extends C17198i.c<C16830c, b> implements C17207r {

        /* renamed from: A  reason: collision with root package name */
        private List<Integer> f139907A = Collections.emptyList();

        /* renamed from: B  reason: collision with root package name */
        private w f139908B = w.p();

        /* renamed from: d  reason: collision with root package name */
        private int f139909d;

        /* renamed from: e  reason: collision with root package name */
        private int f139910e = 6;

        /* renamed from: f  reason: collision with root package name */
        private int f139911f;

        /* renamed from: g  reason: collision with root package name */
        private int f139912g;

        /* renamed from: h  reason: collision with root package name */
        private List<s> f139913h = Collections.emptyList();

        /* renamed from: i  reason: collision with root package name */
        private List<q> f139914i = Collections.emptyList();

        /* renamed from: j  reason: collision with root package name */
        private List<Integer> f139915j = Collections.emptyList();

        /* renamed from: k  reason: collision with root package name */
        private List<Integer> f139916k = Collections.emptyList();

        /* renamed from: l  reason: collision with root package name */
        private List<q> f139917l = Collections.emptyList();

        /* renamed from: m  reason: collision with root package name */
        private List<Integer> f139918m = Collections.emptyList();

        /* renamed from: n  reason: collision with root package name */
        private List<C16831d> f139919n = Collections.emptyList();

        /* renamed from: o  reason: collision with root package name */
        private List<i> f139920o = Collections.emptyList();

        /* renamed from: p  reason: collision with root package name */
        private List<n> f139921p = Collections.emptyList();

        /* renamed from: q  reason: collision with root package name */
        private List<r> f139922q = Collections.emptyList();

        /* renamed from: r  reason: collision with root package name */
        private List<g> f139923r = Collections.emptyList();

        /* renamed from: s  reason: collision with root package name */
        private List<Integer> f139924s = Collections.emptyList();

        /* renamed from: t  reason: collision with root package name */
        private int f139925t;

        /* renamed from: u  reason: collision with root package name */
        private q f139926u = q.S();

        /* renamed from: v  reason: collision with root package name */
        private int f139927v;

        /* renamed from: w  reason: collision with root package name */
        private List<Integer> f139928w = Collections.emptyList();

        /* renamed from: x  reason: collision with root package name */
        private List<q> f139929x = Collections.emptyList();

        /* renamed from: y  reason: collision with root package name */
        private List<Integer> f139930y = Collections.emptyList();

        /* renamed from: z  reason: collision with root package name */
        private t f139931z = t.r();

        private b() {
            Q();
        }

        private void A() {
            if ((this.f139909d & 8192) != 8192) {
                this.f139923r = new ArrayList(this.f139923r);
                this.f139909d |= 8192;
            }
        }

        private void C() {
            if ((this.f139909d & 1024) != 1024) {
                this.f139920o = new ArrayList(this.f139920o);
                this.f139909d |= 1024;
            }
        }

        private void D() {
            if ((this.f139909d & 262144) != 262144) {
                this.f139928w = new ArrayList(this.f139928w);
                this.f139909d |= 262144;
            }
        }

        private void E() {
            if ((this.f139909d & ImageMetadata.SHADING_MODE) != 1048576) {
                this.f139930y = new ArrayList(this.f139930y);
                this.f139909d |= ImageMetadata.SHADING_MODE;
            }
        }

        private void G() {
            if ((this.f139909d & ImageMetadata.LENS_APERTURE) != 524288) {
                this.f139929x = new ArrayList(this.f139929x);
                this.f139909d |= ImageMetadata.LENS_APERTURE;
            }
        }

        private void H() {
            if ((this.f139909d & 64) != 64) {
                this.f139916k = new ArrayList(this.f139916k);
                this.f139909d |= 64;
            }
        }

        private void I() {
            if ((this.f139909d & RecyclerView.n.FLAG_MOVED) != 2048) {
                this.f139921p = new ArrayList(this.f139921p);
                this.f139909d |= RecyclerView.n.FLAG_MOVED;
            }
        }

        private void K() {
            if ((this.f139909d & 16384) != 16384) {
                this.f139924s = new ArrayList(this.f139924s);
                this.f139909d |= 16384;
            }
        }

        private void L() {
            if ((this.f139909d & 32) != 32) {
                this.f139915j = new ArrayList(this.f139915j);
                this.f139909d |= 32;
            }
        }

        private void M() {
            if ((this.f139909d & 16) != 16) {
                this.f139914i = new ArrayList(this.f139914i);
                this.f139909d |= 16;
            }
        }

        private void N() {
            if ((this.f139909d & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) != 4096) {
                this.f139922q = new ArrayList(this.f139922q);
                this.f139909d |= RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT;
            }
        }

        private void O() {
            if ((this.f139909d & 8) != 8) {
                this.f139913h = new ArrayList(this.f139913h);
                this.f139909d |= 8;
            }
        }

        private void P() {
            if ((this.f139909d & 4194304) != 4194304) {
                this.f139907A = new ArrayList(this.f139907A);
                this.f139909d |= 4194304;
            }
        }

        private void Q() {
        }

        /* access modifiers changed from: private */
        public static b v() {
            return new b();
        }

        private void w() {
            if ((this.f139909d & 512) != 512) {
                this.f139919n = new ArrayList(this.f139919n);
                this.f139909d |= 512;
            }
        }

        private void y() {
            if ((this.f139909d & 256) != 256) {
                this.f139918m = new ArrayList(this.f139918m);
                this.f139909d |= 256;
            }
        }

        private void z() {
            if ((this.f139909d & 128) != 128) {
                this.f139917l = new ArrayList(this.f139917l);
                this.f139909d |= 128;
            }
        }

        /* renamed from: R */
        public b f(C16830c cVar) {
            if (cVar == C16830c.t0()) {
                return this;
            }
            if (cVar.g1()) {
                Y(cVar.y0());
            }
            if (cVar.h1()) {
                Z(cVar.z0());
            }
            if (cVar.f1()) {
                X(cVar.l0());
            }
            if (!cVar.f139888h.isEmpty()) {
                if (this.f139913h.isEmpty()) {
                    this.f139913h = cVar.f139888h;
                    this.f139909d &= -9;
                } else {
                    O();
                    this.f139913h.addAll(cVar.f139888h);
                }
            }
            if (!cVar.f139889i.isEmpty()) {
                if (this.f139914i.isEmpty()) {
                    this.f139914i = cVar.f139889i;
                    this.f139909d &= -17;
                } else {
                    M();
                    this.f139914i.addAll(cVar.f139889i);
                }
            }
            if (!cVar.f139890j.isEmpty()) {
                if (this.f139915j.isEmpty()) {
                    this.f139915j = cVar.f139890j;
                    this.f139909d &= -33;
                } else {
                    L();
                    this.f139915j.addAll(cVar.f139890j);
                }
            }
            if (!cVar.f139892l.isEmpty()) {
                if (this.f139916k.isEmpty()) {
                    this.f139916k = cVar.f139892l;
                    this.f139909d &= -65;
                } else {
                    H();
                    this.f139916k.addAll(cVar.f139892l);
                }
            }
            if (!cVar.f139894n.isEmpty()) {
                if (this.f139917l.isEmpty()) {
                    this.f139917l = cVar.f139894n;
                    this.f139909d &= -129;
                } else {
                    z();
                    this.f139917l.addAll(cVar.f139894n);
                }
            }
            if (!cVar.f139895o.isEmpty()) {
                if (this.f139918m.isEmpty()) {
                    this.f139918m = cVar.f139895o;
                    this.f139909d &= -257;
                } else {
                    y();
                    this.f139918m.addAll(cVar.f139895o);
                }
            }
            if (!cVar.f139897q.isEmpty()) {
                if (this.f139919n.isEmpty()) {
                    this.f139919n = cVar.f139897q;
                    this.f139909d &= -513;
                } else {
                    w();
                    this.f139919n.addAll(cVar.f139897q);
                }
            }
            if (!cVar.f139898r.isEmpty()) {
                if (this.f139920o.isEmpty()) {
                    this.f139920o = cVar.f139898r;
                    this.f139909d &= -1025;
                } else {
                    C();
                    this.f139920o.addAll(cVar.f139898r);
                }
            }
            if (!cVar.f139899s.isEmpty()) {
                if (this.f139921p.isEmpty()) {
                    this.f139921p = cVar.f139899s;
                    this.f139909d &= -2049;
                } else {
                    I();
                    this.f139921p.addAll(cVar.f139899s);
                }
            }
            if (!cVar.f139900t.isEmpty()) {
                if (this.f139922q.isEmpty()) {
                    this.f139922q = cVar.f139900t;
                    this.f139909d &= -4097;
                } else {
                    N();
                    this.f139922q.addAll(cVar.f139900t);
                }
            }
            if (!cVar.f139901u.isEmpty()) {
                if (this.f139923r.isEmpty()) {
                    this.f139923r = cVar.f139901u;
                    this.f139909d &= -8193;
                } else {
                    A();
                    this.f139923r.addAll(cVar.f139901u);
                }
            }
            if (!cVar.f139902v.isEmpty()) {
                if (this.f139924s.isEmpty()) {
                    this.f139924s = cVar.f139902v;
                    this.f139909d &= -16385;
                } else {
                    K();
                    this.f139924s.addAll(cVar.f139902v);
                }
            }
            if (cVar.i1()) {
                a0(cVar.D0());
            }
            if (cVar.j1()) {
                T(cVar.E0());
            }
            if (cVar.k1()) {
                b0(cVar.F0());
            }
            if (!cVar.f139873A.isEmpty()) {
                if (this.f139928w.isEmpty()) {
                    this.f139928w = cVar.f139873A;
                    this.f139909d &= -262145;
                } else {
                    D();
                    this.f139928w.addAll(cVar.f139873A);
                }
            }
            if (!cVar.f139875C.isEmpty()) {
                if (this.f139929x.isEmpty()) {
                    this.f139929x = cVar.f139875C;
                    this.f139909d &= -524289;
                } else {
                    G();
                    this.f139929x.addAll(cVar.f139875C);
                }
            }
            if (!cVar.f139876D.isEmpty()) {
                if (this.f139930y.isEmpty()) {
                    this.f139930y = cVar.f139876D;
                    this.f139909d &= -1048577;
                } else {
                    E();
                    this.f139930y.addAll(cVar.f139876D);
                }
            }
            if (cVar.l1()) {
                V(cVar.c1());
            }
            if (!cVar.f139879G.isEmpty()) {
                if (this.f139907A.isEmpty()) {
                    this.f139907A = cVar.f139879G;
                    this.f139909d &= -4194305;
                } else {
                    P();
                    this.f139907A.addAll(cVar.f139879G);
                }
            }
            if (cVar.m1()) {
                W(cVar.e1());
            }
            n(cVar);
            j(e().i(cVar.f139883c));
            return this;
        }

        /* renamed from: S */
        public b o1(C17194e eVar, C17196g gVar) {
            C16830c cVar;
            C16830c cVar2 = null;
            try {
                C16830c c10 = C16830c.f139872L.c(eVar, gVar);
                if (c10 != null) {
                    f(c10);
                }
                return this;
            } catch (C17200k e10) {
                cVar = (C16830c) e10.a();
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

        public b T(q qVar) {
            if ((this.f139909d & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) != 65536 || this.f139926u == q.S()) {
                this.f139926u = qVar;
            } else {
                this.f139926u = q.t0(this.f139926u).f(qVar).r();
            }
            this.f139909d |= ImageMetadata.CONTROL_AE_ANTIBANDING_MODE;
            return this;
        }

        public b V(t tVar) {
            if ((this.f139909d & UploadKt.MAX_CHUNK_SIZE) != 2097152 || this.f139931z == t.r()) {
                this.f139931z = tVar;
            } else {
                this.f139931z = t.z(this.f139931z).f(tVar).m();
            }
            this.f139909d |= UploadKt.MAX_CHUNK_SIZE;
            return this;
        }

        public b W(w wVar) {
            if ((this.f139909d & 8388608) != 8388608 || this.f139908B == w.p()) {
                this.f139908B = wVar;
            } else {
                this.f139908B = w.u(this.f139908B).f(wVar).m();
            }
            this.f139909d |= 8388608;
            return this;
        }

        public b X(int i10) {
            this.f139909d |= 4;
            this.f139912g = i10;
            return this;
        }

        public b Y(int i10) {
            this.f139909d |= 1;
            this.f139910e = i10;
            return this;
        }

        public b Z(int i10) {
            this.f139909d |= 2;
            this.f139911f = i10;
            return this;
        }

        public b a0(int i10) {
            this.f139909d |= 32768;
            this.f139925t = i10;
            return this;
        }

        public b b0(int i10) {
            this.f139909d |= 131072;
            this.f139927v = i10;
            return this;
        }

        /* renamed from: p */
        public C16830c g() {
            C16830c r10 = r();
            if (r10.isInitialized()) {
                return r10;
            }
            throw C17190a.C3485a.c(r10);
        }

        public C16830c r() {
            C16830c cVar = new C16830c((C17198i.c) this);
            int i10 = this.f139909d;
            int i11 = 1;
            if ((i10 & 1) != 1) {
                i11 = 0;
            }
            int unused = cVar.f139885e = this.f139910e;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            int unused2 = cVar.f139886f = this.f139911f;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            int unused3 = cVar.f139887g = this.f139912g;
            if ((this.f139909d & 8) == 8) {
                this.f139913h = Collections.unmodifiableList(this.f139913h);
                this.f139909d &= -9;
            }
            List unused4 = cVar.f139888h = this.f139913h;
            if ((this.f139909d & 16) == 16) {
                this.f139914i = Collections.unmodifiableList(this.f139914i);
                this.f139909d &= -17;
            }
            List unused5 = cVar.f139889i = this.f139914i;
            if ((this.f139909d & 32) == 32) {
                this.f139915j = Collections.unmodifiableList(this.f139915j);
                this.f139909d &= -33;
            }
            List unused6 = cVar.f139890j = this.f139915j;
            if ((this.f139909d & 64) == 64) {
                this.f139916k = Collections.unmodifiableList(this.f139916k);
                this.f139909d &= -65;
            }
            List unused7 = cVar.f139892l = this.f139916k;
            if ((this.f139909d & 128) == 128) {
                this.f139917l = Collections.unmodifiableList(this.f139917l);
                this.f139909d &= -129;
            }
            List unused8 = cVar.f139894n = this.f139917l;
            if ((this.f139909d & 256) == 256) {
                this.f139918m = Collections.unmodifiableList(this.f139918m);
                this.f139909d &= -257;
            }
            List unused9 = cVar.f139895o = this.f139918m;
            if ((this.f139909d & 512) == 512) {
                this.f139919n = Collections.unmodifiableList(this.f139919n);
                this.f139909d &= -513;
            }
            List unused10 = cVar.f139897q = this.f139919n;
            if ((this.f139909d & 1024) == 1024) {
                this.f139920o = Collections.unmodifiableList(this.f139920o);
                this.f139909d &= -1025;
            }
            List unused11 = cVar.f139898r = this.f139920o;
            if ((this.f139909d & RecyclerView.n.FLAG_MOVED) == 2048) {
                this.f139921p = Collections.unmodifiableList(this.f139921p);
                this.f139909d &= -2049;
            }
            List unused12 = cVar.f139899s = this.f139921p;
            if ((this.f139909d & RecyclerView.n.FLAG_APPEARED_IN_PRE_LAYOUT) == 4096) {
                this.f139922q = Collections.unmodifiableList(this.f139922q);
                this.f139909d &= -4097;
            }
            List unused13 = cVar.f139900t = this.f139922q;
            if ((this.f139909d & 8192) == 8192) {
                this.f139923r = Collections.unmodifiableList(this.f139923r);
                this.f139909d &= -8193;
            }
            List unused14 = cVar.f139901u = this.f139923r;
            if ((this.f139909d & 16384) == 16384) {
                this.f139924s = Collections.unmodifiableList(this.f139924s);
                this.f139909d &= -16385;
            }
            List unused15 = cVar.f139902v = this.f139924s;
            if ((i10 & 32768) == 32768) {
                i11 |= 8;
            }
            int unused16 = cVar.f139904x = this.f139925t;
            if ((i10 & ImageMetadata.CONTROL_AE_ANTIBANDING_MODE) == 65536) {
                i11 |= 16;
            }
            q unused17 = cVar.f139905y = this.f139926u;
            if ((i10 & 131072) == 131072) {
                i11 |= 32;
            }
            int unused18 = cVar.f139906z = this.f139927v;
            if ((this.f139909d & 262144) == 262144) {
                this.f139928w = Collections.unmodifiableList(this.f139928w);
                this.f139909d &= -262145;
            }
            List unused19 = cVar.f139873A = this.f139928w;
            if ((this.f139909d & ImageMetadata.LENS_APERTURE) == 524288) {
                this.f139929x = Collections.unmodifiableList(this.f139929x);
                this.f139909d &= -524289;
            }
            List unused20 = cVar.f139875C = this.f139929x;
            if ((this.f139909d & ImageMetadata.SHADING_MODE) == 1048576) {
                this.f139930y = Collections.unmodifiableList(this.f139930y);
                this.f139909d &= -1048577;
            }
            List unused21 = cVar.f139876D = this.f139930y;
            if ((i10 & UploadKt.MAX_CHUNK_SIZE) == 2097152) {
                i11 |= 64;
            }
            t unused22 = cVar.f139878F = this.f139931z;
            if ((this.f139909d & 4194304) == 4194304) {
                this.f139907A = Collections.unmodifiableList(this.f139907A);
                this.f139909d &= -4194305;
            }
            List unused23 = cVar.f139879G = this.f139907A;
            if ((i10 & 8388608) == 8388608) {
                i11 |= 128;
            }
            w unused24 = cVar.f139880H = this.f139908B;
            int unused25 = cVar.f139884d = i11;
            return cVar;
        }

        /* renamed from: u */
        public b d() {
            return v().f(r());
        }
    }

    /* renamed from: XI.c$c  reason: collision with other inner class name */
    public enum C3435c implements C17199j.a {
        CLASS(0, 0),
        INTERFACE(1, 1),
        ENUM_CLASS(2, 2),
        ENUM_ENTRY(3, 3),
        ANNOTATION_CLASS(4, 4),
        OBJECT(5, 5),
        COMPANION_OBJECT(6, 6);
        
        private static C17199j.b<C3435c> internalValueMap;
        private final int value;

        /* renamed from: XI.c$c$a */
        static class a implements C17199j.b<C3435c> {
            a() {
            }

            /* renamed from: b */
            public C3435c a(int i10) {
                return C3435c.a(i10);
            }
        }

        static {
            internalValueMap = new a();
        }

        private C3435c(int i10, int i11) {
            this.value = i11;
        }

        public static C3435c a(int i10) {
            switch (i10) {
                case 0:
                    return CLASS;
                case 1:
                    return INTERFACE;
                case 2:
                    return ENUM_CLASS;
                case 3:
                    return ENUM_ENTRY;
                case 4:
                    return ANNOTATION_CLASS;
                case 5:
                    return OBJECT;
                case 6:
                    return COMPANION_OBJECT;
                default:
                    return null;
            }
        }

        public final int d() {
            return this.value;
        }
    }

    static {
        C16830c cVar = new C16830c(true);
        f139871K = cVar;
        cVar.n1();
    }

    private void n1() {
        this.f139885e = 6;
        this.f139886f = 0;
        this.f139887g = 0;
        this.f139888h = Collections.emptyList();
        this.f139889i = Collections.emptyList();
        this.f139890j = Collections.emptyList();
        this.f139892l = Collections.emptyList();
        this.f139894n = Collections.emptyList();
        this.f139895o = Collections.emptyList();
        this.f139897q = Collections.emptyList();
        this.f139898r = Collections.emptyList();
        this.f139899s = Collections.emptyList();
        this.f139900t = Collections.emptyList();
        this.f139901u = Collections.emptyList();
        this.f139902v = Collections.emptyList();
        this.f139904x = 0;
        this.f139905y = q.S();
        this.f139906z = 0;
        this.f139873A = Collections.emptyList();
        this.f139875C = Collections.emptyList();
        this.f139876D = Collections.emptyList();
        this.f139878F = t.r();
        this.f139879G = Collections.emptyList();
        this.f139880H = w.p();
    }

    public static b p1() {
        return b.v();
    }

    public static b q1(C16830c cVar) {
        return p1().f(cVar);
    }

    public static C16830c s1(InputStream inputStream, C17196g gVar) {
        return f139872L.a(inputStream, gVar);
    }

    public static C16830c t0() {
        return f139871K;
    }

    public i A0(int i10) {
        return this.f139898r.get(i10);
    }

    public int B0() {
        return this.f139898r.size();
    }

    public List<i> C0() {
        return this.f139898r;
    }

    public int D0() {
        return this.f139904x;
    }

    public q E0() {
        return this.f139905y;
    }

    public int F0() {
        return this.f139906z;
    }

    public int G0() {
        return this.f139873A.size();
    }

    public List<Integer> H0() {
        return this.f139873A;
    }

    public q I0(int i10) {
        return this.f139875C.get(i10);
    }

    public int J0() {
        return this.f139875C.size();
    }

    public int K0() {
        return this.f139876D.size();
    }

    public List<Integer> L0() {
        return this.f139876D;
    }

    public List<q> M0() {
        return this.f139875C;
    }

    public List<Integer> N0() {
        return this.f139892l;
    }

    public n O0(int i10) {
        return this.f139899s.get(i10);
    }

    public int P0() {
        return this.f139899s.size();
    }

    public List<n> Q0() {
        return this.f139899s;
    }

    public List<Integer> R0() {
        return this.f139902v;
    }

    public q S0(int i10) {
        return this.f139889i.get(i10);
    }

    public int T0() {
        return this.f139889i.size();
    }

    public List<Integer> U0() {
        return this.f139890j;
    }

    public List<q> V0() {
        return this.f139889i;
    }

    public r W0(int i10) {
        return this.f139900t.get(i10);
    }

    public int X0() {
        return this.f139900t.size();
    }

    public List<r> Y0() {
        return this.f139900t;
    }

    public s Z0(int i10) {
        return this.f139888h.get(i10);
    }

    public void a(C17195f fVar) {
        getSerializedSize();
        C17198i.d<MessageType>.defpackage.a t10 = t();
        if ((this.f139884d & 1) == 1) {
            fVar.a0(1, this.f139885e);
        }
        if (U0().size() > 0) {
            fVar.o0(18);
            fVar.o0(this.f139891k);
        }
        for (int i10 = 0; i10 < this.f139890j.size(); i10++) {
            fVar.b0(this.f139890j.get(i10).intValue());
        }
        if ((this.f139884d & 2) == 2) {
            fVar.a0(3, this.f139886f);
        }
        if ((this.f139884d & 4) == 4) {
            fVar.a0(4, this.f139887g);
        }
        for (int i11 = 0; i11 < this.f139888h.size(); i11++) {
            fVar.d0(5, this.f139888h.get(i11));
        }
        for (int i12 = 0; i12 < this.f139889i.size(); i12++) {
            fVar.d0(6, this.f139889i.get(i12));
        }
        if (N0().size() > 0) {
            fVar.o0(58);
            fVar.o0(this.f139893m);
        }
        for (int i13 = 0; i13 < this.f139892l.size(); i13++) {
            fVar.b0(this.f139892l.get(i13).intValue());
        }
        for (int i14 = 0; i14 < this.f139897q.size(); i14++) {
            fVar.d0(8, this.f139897q.get(i14));
        }
        for (int i15 = 0; i15 < this.f139898r.size(); i15++) {
            fVar.d0(9, this.f139898r.get(i15));
        }
        for (int i16 = 0; i16 < this.f139899s.size(); i16++) {
            fVar.d0(10, this.f139899s.get(i16));
        }
        for (int i17 = 0; i17 < this.f139900t.size(); i17++) {
            fVar.d0(11, this.f139900t.get(i17));
        }
        for (int i18 = 0; i18 < this.f139901u.size(); i18++) {
            fVar.d0(13, this.f139901u.get(i18));
        }
        if (R0().size() > 0) {
            fVar.o0(130);
            fVar.o0(this.f139903w);
        }
        for (int i19 = 0; i19 < this.f139902v.size(); i19++) {
            fVar.b0(this.f139902v.get(i19).intValue());
        }
        if ((this.f139884d & 8) == 8) {
            fVar.a0(17, this.f139904x);
        }
        if ((this.f139884d & 16) == 16) {
            fVar.d0(18, this.f139905y);
        }
        if ((this.f139884d & 32) == 32) {
            fVar.a0(19, this.f139906z);
        }
        for (int i20 = 0; i20 < this.f139894n.size(); i20++) {
            fVar.d0(20, this.f139894n.get(i20));
        }
        if (r0().size() > 0) {
            fVar.o0(170);
            fVar.o0(this.f139896p);
        }
        for (int i21 = 0; i21 < this.f139895o.size(); i21++) {
            fVar.b0(this.f139895o.get(i21).intValue());
        }
        if (H0().size() > 0) {
            fVar.o0(178);
            fVar.o0(this.f139874B);
        }
        for (int i22 = 0; i22 < this.f139873A.size(); i22++) {
            fVar.b0(this.f139873A.get(i22).intValue());
        }
        for (int i23 = 0; i23 < this.f139875C.size(); i23++) {
            fVar.d0(23, this.f139875C.get(i23));
        }
        if (L0().size() > 0) {
            fVar.o0(194);
            fVar.o0(this.f139877E);
        }
        for (int i24 = 0; i24 < this.f139876D.size(); i24++) {
            fVar.b0(this.f139876D.get(i24).intValue());
        }
        if ((this.f139884d & 64) == 64) {
            fVar.d0(30, this.f139878F);
        }
        for (int i25 = 0; i25 < this.f139879G.size(); i25++) {
            fVar.a0(31, this.f139879G.get(i25).intValue());
        }
        if ((this.f139884d & 128) == 128) {
            fVar.d0(32, this.f139880H);
        }
        t10.a(19000, fVar);
        fVar.i0(this.f139883c);
    }

    public int a1() {
        return this.f139888h.size();
    }

    public List<s> b1() {
        return this.f139888h;
    }

    public t c1() {
        return this.f139878F;
    }

    public List<Integer> d1() {
        return this.f139879G;
    }

    public w e1() {
        return this.f139880H;
    }

    public boolean f1() {
        return (this.f139884d & 4) == 4;
    }

    public boolean g1() {
        return (this.f139884d & 1) == 1;
    }

    public C17208s<C16830c> getParserForType() {
        return f139872L;
    }

    public int getSerializedSize() {
        int i10 = this.f139882J;
        if (i10 != -1) {
            return i10;
        }
        int o10 = (this.f139884d & 1) == 1 ? C17195f.o(1, this.f139885e) : 0;
        int i11 = 0;
        for (int i12 = 0; i12 < this.f139890j.size(); i12++) {
            i11 += C17195f.p(this.f139890j.get(i12).intValue());
        }
        int i13 = o10 + i11;
        if (!U0().isEmpty()) {
            i13 = i13 + 1 + C17195f.p(i11);
        }
        this.f139891k = i11;
        if ((this.f139884d & 2) == 2) {
            i13 += C17195f.o(3, this.f139886f);
        }
        if ((this.f139884d & 4) == 4) {
            i13 += C17195f.o(4, this.f139887g);
        }
        for (int i14 = 0; i14 < this.f139888h.size(); i14++) {
            i13 += C17195f.s(5, this.f139888h.get(i14));
        }
        for (int i15 = 0; i15 < this.f139889i.size(); i15++) {
            i13 += C17195f.s(6, this.f139889i.get(i15));
        }
        int i16 = 0;
        for (int i17 = 0; i17 < this.f139892l.size(); i17++) {
            i16 += C17195f.p(this.f139892l.get(i17).intValue());
        }
        int i18 = i13 + i16;
        if (!N0().isEmpty()) {
            i18 = i18 + 1 + C17195f.p(i16);
        }
        this.f139893m = i16;
        for (int i19 = 0; i19 < this.f139897q.size(); i19++) {
            i18 += C17195f.s(8, this.f139897q.get(i19));
        }
        for (int i20 = 0; i20 < this.f139898r.size(); i20++) {
            i18 += C17195f.s(9, this.f139898r.get(i20));
        }
        for (int i21 = 0; i21 < this.f139899s.size(); i21++) {
            i18 += C17195f.s(10, this.f139899s.get(i21));
        }
        for (int i22 = 0; i22 < this.f139900t.size(); i22++) {
            i18 += C17195f.s(11, this.f139900t.get(i22));
        }
        for (int i23 = 0; i23 < this.f139901u.size(); i23++) {
            i18 += C17195f.s(13, this.f139901u.get(i23));
        }
        int i24 = 0;
        for (int i25 = 0; i25 < this.f139902v.size(); i25++) {
            i24 += C17195f.p(this.f139902v.get(i25).intValue());
        }
        int i26 = i18 + i24;
        if (!R0().isEmpty()) {
            i26 = i26 + 2 + C17195f.p(i24);
        }
        this.f139903w = i24;
        if ((this.f139884d & 8) == 8) {
            i26 += C17195f.o(17, this.f139904x);
        }
        if ((this.f139884d & 16) == 16) {
            i26 += C17195f.s(18, this.f139905y);
        }
        if ((this.f139884d & 32) == 32) {
            i26 += C17195f.o(19, this.f139906z);
        }
        for (int i27 = 0; i27 < this.f139894n.size(); i27++) {
            i26 += C17195f.s(20, this.f139894n.get(i27));
        }
        int i28 = 0;
        for (int i29 = 0; i29 < this.f139895o.size(); i29++) {
            i28 += C17195f.p(this.f139895o.get(i29).intValue());
        }
        int i30 = i26 + i28;
        if (!r0().isEmpty()) {
            i30 = i30 + 2 + C17195f.p(i28);
        }
        this.f139896p = i28;
        int i31 = 0;
        for (int i32 = 0; i32 < this.f139873A.size(); i32++) {
            i31 += C17195f.p(this.f139873A.get(i32).intValue());
        }
        int i33 = i30 + i31;
        if (!H0().isEmpty()) {
            i33 = i33 + 2 + C17195f.p(i31);
        }
        this.f139874B = i31;
        for (int i34 = 0; i34 < this.f139875C.size(); i34++) {
            i33 += C17195f.s(23, this.f139875C.get(i34));
        }
        int i35 = 0;
        for (int i36 = 0; i36 < this.f139876D.size(); i36++) {
            i35 += C17195f.p(this.f139876D.get(i36).intValue());
        }
        int i37 = i33 + i35;
        if (!L0().isEmpty()) {
            i37 = i37 + 2 + C17195f.p(i35);
        }
        this.f139877E = i35;
        if ((this.f139884d & 64) == 64) {
            i37 += C17195f.s(30, this.f139878F);
        }
        int i38 = 0;
        for (int i39 = 0; i39 < this.f139879G.size(); i39++) {
            i38 += C17195f.p(this.f139879G.get(i39).intValue());
        }
        int size = i37 + i38 + (d1().size() * 2);
        if ((this.f139884d & 128) == 128) {
            size += C17195f.s(32, this.f139880H);
        }
        int o11 = size + o() + this.f139883c.size();
        this.f139882J = o11;
        return o11;
    }

    public boolean h1() {
        return (this.f139884d & 2) == 2;
    }

    public boolean i1() {
        return (this.f139884d & 8) == 8;
    }

    public final boolean isInitialized() {
        byte b10 = this.f139881I;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!h1()) {
            this.f139881I = 0;
            return false;
        }
        for (int i10 = 0; i10 < a1(); i10++) {
            if (!Z0(i10).isInitialized()) {
                this.f139881I = 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < T0(); i11++) {
            if (!S0(i11).isInitialized()) {
                this.f139881I = 0;
                return false;
            }
        }
        for (int i12 = 0; i12 < q0(); i12++) {
            if (!p0(i12).isInitialized()) {
                this.f139881I = 0;
                return false;
            }
        }
        for (int i13 = 0; i13 < n0(); i13++) {
            if (!m0(i13).isInitialized()) {
                this.f139881I = 0;
                return false;
            }
        }
        for (int i14 = 0; i14 < B0(); i14++) {
            if (!A0(i14).isInitialized()) {
                this.f139881I = 0;
                return false;
            }
        }
        for (int i15 = 0; i15 < P0(); i15++) {
            if (!O0(i15).isInitialized()) {
                this.f139881I = 0;
                return false;
            }
        }
        for (int i16 = 0; i16 < X0(); i16++) {
            if (!W0(i16).isInitialized()) {
                this.f139881I = 0;
                return false;
            }
        }
        for (int i17 = 0; i17 < w0(); i17++) {
            if (!v0(i17).isInitialized()) {
                this.f139881I = 0;
                return false;
            }
        }
        if (!j1() || E0().isInitialized()) {
            for (int i18 = 0; i18 < J0(); i18++) {
                if (!I0(i18).isInitialized()) {
                    this.f139881I = 0;
                    return false;
                }
            }
            if (l1() && !c1().isInitialized()) {
                this.f139881I = 0;
                return false;
            } else if (!n()) {
                this.f139881I = 0;
                return false;
            } else {
                this.f139881I = 1;
                return true;
            }
        } else {
            this.f139881I = 0;
            return false;
        }
    }

    public boolean j1() {
        return (this.f139884d & 16) == 16;
    }

    public boolean k1() {
        return (this.f139884d & 32) == 32;
    }

    public int l0() {
        return this.f139887g;
    }

    public boolean l1() {
        return (this.f139884d & 64) == 64;
    }

    public C16831d m0(int i10) {
        return this.f139897q.get(i10);
    }

    public boolean m1() {
        return (this.f139884d & 128) == 128;
    }

    public int n0() {
        return this.f139897q.size();
    }

    public List<C16831d> o0() {
        return this.f139897q;
    }

    public q p0(int i10) {
        return this.f139894n.get(i10);
    }

    public int q0() {
        return this.f139894n.size();
    }

    public List<Integer> r0() {
        return this.f139895o;
    }

    /* renamed from: r1 */
    public b newBuilderForType() {
        return p1();
    }

    public List<q> s0() {
        return this.f139894n;
    }

    /* renamed from: t1 */
    public b toBuilder() {
        return q1(this);
    }

    /* renamed from: u0 */
    public C16830c getDefaultInstanceForType() {
        return f139871K;
    }

    public g v0(int i10) {
        return this.f139901u.get(i10);
    }

    public int w0() {
        return this.f139901u.size();
    }

    public List<g> x0() {
        return this.f139901u;
    }

    public int y0() {
        return this.f139885e;
    }

    public int z0() {
        return this.f139886f;
    }

    private C16830c(C17198i.c<C16830c, ?> cVar) {
        super(cVar);
        this.f139891k = -1;
        this.f139893m = -1;
        this.f139896p = -1;
        this.f139903w = -1;
        this.f139874B = -1;
        this.f139877E = -1;
        this.f139881I = -1;
        this.f139882J = -1;
        this.f139883c = cVar.e();
    }

    private C16830c(boolean z10) {
        this.f139891k = -1;
        this.f139893m = -1;
        this.f139896p = -1;
        this.f139903w = -1;
        this.f139874B = -1;
        this.f139877E = -1;
        this.f139881I = -1;
        this.f139882J = -1;
        this.f139883c = C17193d.f143014a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v0, resolved type: XI.q$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v1, resolved type: XI.q$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v3, resolved type: XI.q$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v95, resolved type: XI.t$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v6, resolved type: XI.q$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v23, resolved type: XI.w$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v8, resolved type: XI.q$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v9, resolved type: XI.q$c} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v10, resolved type: XI.q$c} */
    /* JADX WARNING: type inference failed for: r16v4, types: [XI.t$b] */
    /* JADX WARNING: type inference failed for: r16v7, types: [XI.w$b] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private C16830c(eJ.C17194e r18, eJ.C17196g r19) {
        /*
            r17 = this;
            r1 = r17
            r2 = r18
            r3 = r19
            r17.<init>()
            r4 = -1
            r1.f139891k = r4
            r1.f139893m = r4
            r1.f139896p = r4
            r1.f139903w = r4
            r1.f139874B = r4
            r1.f139877E = r4
            r1.f139881I = r4
            r1.f139882J = r4
            r17.n1()
            eJ.d$b r4 = eJ.C17193d.B()
            r5 = 1
            eJ.f r6 = eJ.C17195f.J(r4, r5)
            r7 = 0
            r8 = r7
        L_0x0028:
            r14 = 524288(0x80000, float:7.34684E-40)
            r11 = 262144(0x40000, float:3.67342E-40)
            r12 = 1048576(0x100000, float:1.469368E-39)
            r13 = 4194304(0x400000, float:5.877472E-39)
            r5 = 128(0x80, float:1.794E-43)
            r9 = 64
            if (r7 != 0) goto L_0x054f
            int r15 = r18.K()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r16 = 0
            switch(r15) {
                case 0: goto L_0x044a;
                case 8: goto L_0x043d;
                case 16: goto L_0x041f;
                case 18: goto L_0x03e9;
                case 24: goto L_0x03db;
                case 32: goto L_0x03cd;
                case 42: goto L_0x03b1;
                case 50: goto L_0x0395;
                case 56: goto L_0x0379;
                case 58: goto L_0x0345;
                case 66: goto L_0x0329;
                case 74: goto L_0x030d;
                case 82: goto L_0x02f1;
                case 90: goto L_0x02d5;
                case 106: goto L_0x02b9;
                case 128: goto L_0x029b;
                case 130: goto L_0x0265;
                case 136: goto L_0x0256;
                case 146: goto L_0x0229;
                case 152: goto L_0x021a;
                case 162: goto L_0x01fe;
                case 168: goto L_0x01e0;
                case 170: goto L_0x01aa;
                case 176: goto L_0x018f;
                case 178: goto L_0x015c;
                case 186: goto L_0x0143;
                case 192: goto L_0x0128;
                case 194: goto L_0x00f5;
                case 242: goto L_0x00cc;
                case 248: goto L_0x00b1;
                case 250: goto L_0x007d;
                case 258: goto L_0x0055;
                default: goto L_0x003f;
            }     // Catch:{ k -> 0x0051, IOException -> 0x004d }
        L_0x003f:
            boolean r5 = r1.k(r2, r6, r3, r15)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            if (r5 != 0) goto L_0x0046
            r7 = 1
        L_0x0046:
            r10 = 1
            goto L_0x044c
        L_0x0049:
            r0 = move-exception
            r2 = r0
            goto L_0x0462
        L_0x004d:
            r0 = move-exception
            r2 = r0
            goto L_0x044f
        L_0x0051:
            r0 = move-exception
            r2 = r0
            goto L_0x045d
        L_0x0055:
            int r15 = r1.f139884d     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r15 = r15 & r5
            if (r15 != r5) goto L_0x0060
            XI.w r15 = r1.f139880H     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            XI.w$b r16 = r15.toBuilder()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
        L_0x0060:
            r15 = r16
            eJ.s<XI.w> r10 = XI.w.f140274g     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            eJ.q r10 = r2.u(r10, r3)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            XI.w r10 = (XI.w) r10     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r1.f139880H = r10     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            if (r15 == 0) goto L_0x0077
            r15.f(r10)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            XI.w r10 = r15.m()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r1.f139880H = r10     // Catch:{ k -> 0x0051, IOException -> 0x004d }
        L_0x0077:
            int r10 = r1.f139884d     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r10 = r10 | r5
            r1.f139884d = r10     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x0046
        L_0x007d:
            int r10 = r18.A()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            int r10 = r2.j(r10)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r15 = r8 & r13
            if (r15 == r13) goto L_0x0097
            int r15 = r18.e()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            if (r15 <= 0) goto L_0x0097
            java.util.ArrayList r15 = new java.util.ArrayList     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r15.<init>()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r1.f139879G = r15     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r8 = r8 | r13
        L_0x0097:
            int r15 = r18.e()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            if (r15 <= 0) goto L_0x00ad
            java.util.List<java.lang.Integer> r15 = r1.f139879G     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            int r16 = r18.s()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            java.lang.Integer r5 = java.lang.Integer.valueOf(r16)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r15.add(r5)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5 = 128(0x80, float:1.794E-43)
            goto L_0x0097
        L_0x00ad:
            r2.i(r10)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x0046
        L_0x00b1:
            r5 = r8 & r13
            if (r5 == r13) goto L_0x00bd
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5.<init>()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r1.f139879G = r5     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r8 = r8 | r13
        L_0x00bd:
            java.util.List<java.lang.Integer> r5 = r1.f139879G     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            int r10 = r18.s()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5.add(r10)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x0046
        L_0x00cc:
            int r5 = r1.f139884d     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5 = r5 & r9
            if (r5 != r9) goto L_0x00d7
            XI.t r5 = r1.f139878F     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            XI.t$b r16 = r5.toBuilder()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
        L_0x00d7:
            r5 = r16
            eJ.s<XI.t> r10 = XI.t.f140225i     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            eJ.q r10 = r2.u(r10, r3)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            XI.t r10 = (XI.t) r10     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r1.f139878F = r10     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            if (r5 == 0) goto L_0x00ee
            r5.f(r10)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            XI.t r5 = r5.m()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r1.f139878F = r5     // Catch:{ k -> 0x0051, IOException -> 0x004d }
        L_0x00ee:
            int r5 = r1.f139884d     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5 = r5 | r9
            r1.f139884d = r5     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x0046
        L_0x00f5:
            int r5 = r18.A()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            int r5 = r2.j(r5)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r10 = r8 & r12
            if (r10 == r12) goto L_0x010f
            int r10 = r18.e()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            if (r10 <= 0) goto L_0x010f
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r10.<init>()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r1.f139876D = r10     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r8 = r8 | r12
        L_0x010f:
            int r10 = r18.e()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            if (r10 <= 0) goto L_0x0123
            java.util.List<java.lang.Integer> r10 = r1.f139876D     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            int r15 = r18.s()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r10.add(r15)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x010f
        L_0x0123:
            r2.i(r5)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x0046
        L_0x0128:
            r5 = r8 & r12
            if (r5 == r12) goto L_0x0134
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5.<init>()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r1.f139876D = r5     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r8 = r8 | r12
        L_0x0134:
            java.util.List<java.lang.Integer> r5 = r1.f139876D     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            int r10 = r18.s()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5.add(r10)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x0046
        L_0x0143:
            r5 = r8 & r14
            if (r5 == r14) goto L_0x014f
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5.<init>()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r1.f139875C = r5     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r8 = r8 | r14
        L_0x014f:
            java.util.List<XI.q> r5 = r1.f139875C     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            eJ.s<XI.q> r10 = XI.q.f140132v     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            eJ.q r10 = r2.u(r10, r3)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5.add(r10)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x0046
        L_0x015c:
            int r5 = r18.A()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            int r5 = r2.j(r5)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r10 = r8 & r11
            if (r10 == r11) goto L_0x0176
            int r10 = r18.e()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            if (r10 <= 0) goto L_0x0176
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r10.<init>()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r1.f139873A = r10     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r8 = r8 | r11
        L_0x0176:
            int r10 = r18.e()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            if (r10 <= 0) goto L_0x018a
            java.util.List<java.lang.Integer> r10 = r1.f139873A     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            int r15 = r18.s()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r10.add(r15)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x0176
        L_0x018a:
            r2.i(r5)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x0046
        L_0x018f:
            r5 = r8 & r11
            if (r5 == r11) goto L_0x019b
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5.<init>()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r1.f139873A = r5     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r8 = r8 | r11
        L_0x019b:
            java.util.List<java.lang.Integer> r5 = r1.f139873A     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            int r10 = r18.s()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5.add(r10)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x0046
        L_0x01aa:
            int r5 = r18.A()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            int r5 = r2.j(r5)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r10 = r8 & 256(0x100, float:3.59E-43)
            r15 = 256(0x100, float:3.59E-43)
            if (r10 == r15) goto L_0x01c7
            int r10 = r18.e()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            if (r10 <= 0) goto L_0x01c7
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r10.<init>()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r1.f139895o = r10     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r8 = r8 | 256(0x100, float:3.59E-43)
        L_0x01c7:
            int r10 = r18.e()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            if (r10 <= 0) goto L_0x01db
            java.util.List<java.lang.Integer> r10 = r1.f139895o     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            int r15 = r18.s()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r10.add(r15)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x01c7
        L_0x01db:
            r2.i(r5)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x0046
        L_0x01e0:
            r5 = r8 & 256(0x100, float:3.59E-43)
            r10 = 256(0x100, float:3.59E-43)
            if (r5 == r10) goto L_0x01ef
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5.<init>()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r1.f139895o = r5     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r8 = r8 | 256(0x100, float:3.59E-43)
        L_0x01ef:
            java.util.List<java.lang.Integer> r5 = r1.f139895o     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            int r10 = r18.s()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5.add(r10)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x0046
        L_0x01fe:
            r5 = r8 & 128(0x80, float:1.794E-43)
            r10 = 128(0x80, float:1.794E-43)
            if (r5 == r10) goto L_0x020d
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5.<init>()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r1.f139894n = r5     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r8 = r8 | 128(0x80, float:1.794E-43)
        L_0x020d:
            java.util.List<XI.q> r5 = r1.f139894n     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            eJ.s<XI.q> r10 = XI.q.f140132v     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            eJ.q r10 = r2.u(r10, r3)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5.add(r10)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x0046
        L_0x021a:
            int r5 = r1.f139884d     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r10 = 32
            r5 = r5 | r10
            r1.f139884d = r5     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            int r5 = r18.s()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r1.f139906z = r5     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x0046
        L_0x0229:
            int r5 = r1.f139884d     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r10 = 16
            r5 = r5 & r10
            if (r5 != r10) goto L_0x0236
            XI.q r5 = r1.f139905y     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            XI.q$c r16 = r5.toBuilder()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
        L_0x0236:
            r5 = r16
            eJ.s<XI.q> r10 = XI.q.f140132v     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            eJ.q r10 = r2.u(r10, r3)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            XI.q r10 = (XI.q) r10     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r1.f139905y = r10     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            if (r5 == 0) goto L_0x024d
            r5.f(r10)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            XI.q r5 = r5.r()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r1.f139905y = r5     // Catch:{ k -> 0x0051, IOException -> 0x004d }
        L_0x024d:
            int r5 = r1.f139884d     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r10 = 16
            r5 = r5 | r10
            r1.f139884d = r5     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x0046
        L_0x0256:
            int r5 = r1.f139884d     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r10 = 8
            r5 = r5 | r10
            r1.f139884d = r5     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            int r5 = r18.s()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r1.f139904x = r5     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x0046
        L_0x0265:
            int r5 = r18.A()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            int r5 = r2.j(r5)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r10 = r8 & 16384(0x4000, float:2.2959E-41)
            r15 = 16384(0x4000, float:2.2959E-41)
            if (r10 == r15) goto L_0x0282
            int r10 = r18.e()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            if (r10 <= 0) goto L_0x0282
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r10.<init>()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r1.f139902v = r10     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r8 = r8 | 16384(0x4000, float:2.2959E-41)
        L_0x0282:
            int r10 = r18.e()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            if (r10 <= 0) goto L_0x0296
            java.util.List<java.lang.Integer> r10 = r1.f139902v     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            int r15 = r18.s()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r10.add(r15)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x0282
        L_0x0296:
            r2.i(r5)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x0046
        L_0x029b:
            r5 = r8 & 16384(0x4000, float:2.2959E-41)
            r10 = 16384(0x4000, float:2.2959E-41)
            if (r5 == r10) goto L_0x02aa
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5.<init>()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r1.f139902v = r5     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r8 = r8 | 16384(0x4000, float:2.2959E-41)
        L_0x02aa:
            java.util.List<java.lang.Integer> r5 = r1.f139902v     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            int r10 = r18.s()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5.add(r10)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x0046
        L_0x02b9:
            r5 = r8 & 8192(0x2000, float:1.14794E-41)
            r10 = 8192(0x2000, float:1.14794E-41)
            if (r5 == r10) goto L_0x02c8
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5.<init>()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r1.f139901u = r5     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r8 = r8 | 8192(0x2000, float:1.14794E-41)
        L_0x02c8:
            java.util.List<XI.g> r5 = r1.f139901u     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            eJ.s<XI.g> r10 = XI.g.f139969i     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            eJ.q r10 = r2.u(r10, r3)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5.add(r10)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x0046
        L_0x02d5:
            r5 = r8 & 4096(0x1000, float:5.74E-42)
            r10 = 4096(0x1000, float:5.74E-42)
            if (r5 == r10) goto L_0x02e4
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5.<init>()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r1.f139900t = r5     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r8 = r8 | 4096(0x1000, float:5.74E-42)
        L_0x02e4:
            java.util.List<XI.r> r5 = r1.f139900t     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            eJ.s<XI.r> r10 = XI.r.f140180q     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            eJ.q r10 = r2.u(r10, r3)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5.add(r10)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x0046
        L_0x02f1:
            r5 = r8 & 2048(0x800, float:2.87E-42)
            r10 = 2048(0x800, float:2.87E-42)
            if (r5 == r10) goto L_0x0300
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5.<init>()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r1.f139899s = r5     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r8 = r8 | 2048(0x800, float:2.87E-42)
        L_0x0300:
            java.util.List<XI.n> r5 = r1.f139899s     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            eJ.s<XI.n> r10 = XI.n.f140067w     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            eJ.q r10 = r2.u(r10, r3)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5.add(r10)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x0046
        L_0x030d:
            r5 = r8 & 1024(0x400, float:1.435E-42)
            r10 = 1024(0x400, float:1.435E-42)
            if (r5 == r10) goto L_0x031c
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5.<init>()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r1.f139898r = r5     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r8 = r8 | 1024(0x400, float:1.435E-42)
        L_0x031c:
            java.util.List<XI.i> r5 = r1.f139898r     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            eJ.s<XI.i> r10 = XI.i.f139999w     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            eJ.q r10 = r2.u(r10, r3)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5.add(r10)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x0046
        L_0x0329:
            r5 = r8 & 512(0x200, float:7.175E-43)
            r10 = 512(0x200, float:7.175E-43)
            if (r5 == r10) goto L_0x0338
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5.<init>()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r1.f139897q = r5     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r8 = r8 | 512(0x200, float:7.175E-43)
        L_0x0338:
            java.util.List<XI.d> r5 = r1.f139897q     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            eJ.s<XI.d> r10 = XI.C16831d.f139933k     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            eJ.q r10 = r2.u(r10, r3)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5.add(r10)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x0046
        L_0x0345:
            int r5 = r18.A()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            int r5 = r2.j(r5)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r10 = r8 & 64
            if (r10 == r9) goto L_0x0360
            int r10 = r18.e()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            if (r10 <= 0) goto L_0x0360
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r10.<init>()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r1.f139892l = r10     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r8 = r8 | 64
        L_0x0360:
            int r10 = r18.e()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            if (r10 <= 0) goto L_0x0374
            java.util.List<java.lang.Integer> r10 = r1.f139892l     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            int r15 = r18.s()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r10.add(r15)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x0360
        L_0x0374:
            r2.i(r5)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x0046
        L_0x0379:
            r5 = r8 & 64
            if (r5 == r9) goto L_0x0386
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5.<init>()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r1.f139892l = r5     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r8 = r8 | 64
        L_0x0386:
            java.util.List<java.lang.Integer> r5 = r1.f139892l     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            int r10 = r18.s()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5.add(r10)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x0046
        L_0x0395:
            r5 = r8 & 16
            r10 = 16
            if (r5 == r10) goto L_0x03a4
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5.<init>()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r1.f139889i = r5     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r8 = r8 | 16
        L_0x03a4:
            java.util.List<XI.q> r5 = r1.f139889i     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            eJ.s<XI.q> r10 = XI.q.f140132v     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            eJ.q r10 = r2.u(r10, r3)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5.add(r10)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x0046
        L_0x03b1:
            r5 = r8 & 8
            r10 = 8
            if (r5 == r10) goto L_0x03c0
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5.<init>()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r1.f139888h = r5     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r8 = r8 | 8
        L_0x03c0:
            java.util.List<XI.s> r5 = r1.f139888h     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            eJ.s<XI.s> r10 = XI.s.f140205o     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            eJ.q r10 = r2.u(r10, r3)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5.add(r10)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x0046
        L_0x03cd:
            int r5 = r1.f139884d     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5 = r5 | 4
            r1.f139884d = r5     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            int r5 = r18.s()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r1.f139887g = r5     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x0046
        L_0x03db:
            int r5 = r1.f139884d     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5 = r5 | 2
            r1.f139884d = r5     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            int r5 = r18.s()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r1.f139886f = r5     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x0046
        L_0x03e9:
            int r5 = r18.A()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            int r5 = r2.j(r5)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r10 = r8 & 32
            r15 = 32
            if (r10 == r15) goto L_0x0406
            int r10 = r18.e()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            if (r10 <= 0) goto L_0x0406
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r10.<init>()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r1.f139890j = r10     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r8 = r8 | 32
        L_0x0406:
            int r10 = r18.e()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            if (r10 <= 0) goto L_0x041a
            java.util.List<java.lang.Integer> r10 = r1.f139890j     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            int r15 = r18.s()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            java.lang.Integer r15 = java.lang.Integer.valueOf(r15)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r10.add(r15)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x0406
        L_0x041a:
            r2.i(r5)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x0046
        L_0x041f:
            r5 = r8 & 32
            r10 = 32
            if (r5 == r10) goto L_0x042e
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5.<init>()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r1.f139890j = r5     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r8 = r8 | 32
        L_0x042e:
            java.util.List<java.lang.Integer> r5 = r1.f139890j     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            int r10 = r18.s()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r5.add(r10)     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x0046
        L_0x043d:
            int r5 = r1.f139884d     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r10 = 1
            r5 = r5 | r10
            r1.f139884d = r5     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            int r5 = r18.s()     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            r1.f139885e = r5     // Catch:{ k -> 0x0051, IOException -> 0x004d }
            goto L_0x044c
        L_0x044a:
            r10 = 1
            r7 = r10
        L_0x044c:
            r5 = r10
            goto L_0x0028
        L_0x044f:
            eJ.k r3 = new eJ.k     // Catch:{ all -> 0x0049 }
            java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x0049 }
            r3.<init>(r2)     // Catch:{ all -> 0x0049 }
            eJ.k r2 = r3.i(r1)     // Catch:{ all -> 0x0049 }
            throw r2     // Catch:{ all -> 0x0049 }
        L_0x045d:
            eJ.k r2 = r2.i(r1)     // Catch:{ all -> 0x0049 }
            throw r2     // Catch:{ all -> 0x0049 }
        L_0x0462:
            r3 = r8 & 32
            r5 = 32
            if (r3 != r5) goto L_0x0470
            java.util.List<java.lang.Integer> r3 = r1.f139890j
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.f139890j = r3
        L_0x0470:
            r3 = r8 & 8
            r5 = 8
            if (r3 != r5) goto L_0x047e
            java.util.List<XI.s> r3 = r1.f139888h
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.f139888h = r3
        L_0x047e:
            r3 = r8 & 16
            r5 = 16
            if (r3 != r5) goto L_0x048c
            java.util.List<XI.q> r3 = r1.f139889i
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.f139889i = r3
        L_0x048c:
            r3 = r8 & 64
            if (r3 != r9) goto L_0x0498
            java.util.List<java.lang.Integer> r3 = r1.f139892l
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.f139892l = r3
        L_0x0498:
            r3 = r8 & 512(0x200, float:7.175E-43)
            r5 = 512(0x200, float:7.175E-43)
            if (r3 != r5) goto L_0x04a6
            java.util.List<XI.d> r3 = r1.f139897q
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.f139897q = r3
        L_0x04a6:
            r3 = r8 & 1024(0x400, float:1.435E-42)
            r5 = 1024(0x400, float:1.435E-42)
            if (r3 != r5) goto L_0x04b4
            java.util.List<XI.i> r3 = r1.f139898r
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.f139898r = r3
        L_0x04b4:
            r3 = r8 & 2048(0x800, float:2.87E-42)
            r5 = 2048(0x800, float:2.87E-42)
            if (r3 != r5) goto L_0x04c2
            java.util.List<XI.n> r3 = r1.f139899s
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.f139899s = r3
        L_0x04c2:
            r3 = r8 & 4096(0x1000, float:5.74E-42)
            r5 = 4096(0x1000, float:5.74E-42)
            if (r3 != r5) goto L_0x04d0
            java.util.List<XI.r> r3 = r1.f139900t
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.f139900t = r3
        L_0x04d0:
            r3 = r8 & 8192(0x2000, float:1.14794E-41)
            r5 = 8192(0x2000, float:1.14794E-41)
            if (r3 != r5) goto L_0x04de
            java.util.List<XI.g> r3 = r1.f139901u
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.f139901u = r3
        L_0x04de:
            r3 = r8 & 16384(0x4000, float:2.2959E-41)
            r5 = 16384(0x4000, float:2.2959E-41)
            if (r3 != r5) goto L_0x04ec
            java.util.List<java.lang.Integer> r3 = r1.f139902v
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.f139902v = r3
        L_0x04ec:
            r3 = r8 & 128(0x80, float:1.794E-43)
            r5 = 128(0x80, float:1.794E-43)
            if (r3 != r5) goto L_0x04fa
            java.util.List<XI.q> r3 = r1.f139894n
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.f139894n = r3
        L_0x04fa:
            r3 = r8 & 256(0x100, float:3.59E-43)
            r5 = 256(0x100, float:3.59E-43)
            if (r3 != r5) goto L_0x0508
            java.util.List<java.lang.Integer> r3 = r1.f139895o
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.f139895o = r3
        L_0x0508:
            r3 = r8 & r11
            if (r3 != r11) goto L_0x0514
            java.util.List<java.lang.Integer> r3 = r1.f139873A
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.f139873A = r3
        L_0x0514:
            r3 = r8 & r14
            if (r3 != r14) goto L_0x0520
            java.util.List<XI.q> r3 = r1.f139875C
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.f139875C = r3
        L_0x0520:
            r3 = r8 & r12
            if (r3 != r12) goto L_0x052c
            java.util.List<java.lang.Integer> r3 = r1.f139876D
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.f139876D = r3
        L_0x052c:
            r3 = r8 & r13
            if (r3 != r13) goto L_0x0538
            java.util.List<java.lang.Integer> r3 = r1.f139879G
            java.util.List r3 = java.util.Collections.unmodifiableList(r3)
            r1.f139879G = r3
        L_0x0538:
            r6.I()     // Catch:{ IOException -> 0x053b, all -> 0x0542 }
        L_0x053b:
            eJ.d r3 = r4.g()
            r1.f139883c = r3
            goto L_0x054b
        L_0x0542:
            r0 = move-exception
            r2 = r0
            eJ.d r3 = r4.g()
            r1.f139883c = r3
            throw r2
        L_0x054b:
            r17.h()
            throw r2
        L_0x054f:
            r2 = r8 & 32
            r3 = 32
            if (r2 != r3) goto L_0x055d
            java.util.List<java.lang.Integer> r2 = r1.f139890j
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.f139890j = r2
        L_0x055d:
            r2 = r8 & 8
            r3 = 8
            if (r2 != r3) goto L_0x056b
            java.util.List<XI.s> r2 = r1.f139888h
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.f139888h = r2
        L_0x056b:
            r2 = r8 & 16
            r3 = 16
            if (r2 != r3) goto L_0x0579
            java.util.List<XI.q> r2 = r1.f139889i
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.f139889i = r2
        L_0x0579:
            r2 = r8 & 64
            if (r2 != r9) goto L_0x0585
            java.util.List<java.lang.Integer> r2 = r1.f139892l
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.f139892l = r2
        L_0x0585:
            r2 = r8 & 512(0x200, float:7.175E-43)
            r3 = 512(0x200, float:7.175E-43)
            if (r2 != r3) goto L_0x0593
            java.util.List<XI.d> r2 = r1.f139897q
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.f139897q = r2
        L_0x0593:
            r2 = r8 & 1024(0x400, float:1.435E-42)
            r3 = 1024(0x400, float:1.435E-42)
            if (r2 != r3) goto L_0x05a1
            java.util.List<XI.i> r2 = r1.f139898r
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.f139898r = r2
        L_0x05a1:
            r2 = r8 & 2048(0x800, float:2.87E-42)
            r3 = 2048(0x800, float:2.87E-42)
            if (r2 != r3) goto L_0x05af
            java.util.List<XI.n> r2 = r1.f139899s
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.f139899s = r2
        L_0x05af:
            r2 = r8 & 4096(0x1000, float:5.74E-42)
            r3 = 4096(0x1000, float:5.74E-42)
            if (r2 != r3) goto L_0x05bd
            java.util.List<XI.r> r2 = r1.f139900t
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.f139900t = r2
        L_0x05bd:
            r2 = r8 & 8192(0x2000, float:1.14794E-41)
            r3 = 8192(0x2000, float:1.14794E-41)
            if (r2 != r3) goto L_0x05cb
            java.util.List<XI.g> r2 = r1.f139901u
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.f139901u = r2
        L_0x05cb:
            r2 = r8 & 16384(0x4000, float:2.2959E-41)
            r3 = 16384(0x4000, float:2.2959E-41)
            if (r2 != r3) goto L_0x05d9
            java.util.List<java.lang.Integer> r2 = r1.f139902v
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.f139902v = r2
        L_0x05d9:
            r2 = r8 & 128(0x80, float:1.794E-43)
            r3 = 128(0x80, float:1.794E-43)
            if (r2 != r3) goto L_0x05e7
            java.util.List<XI.q> r2 = r1.f139894n
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.f139894n = r2
        L_0x05e7:
            r2 = r8 & 256(0x100, float:3.59E-43)
            r3 = 256(0x100, float:3.59E-43)
            if (r2 != r3) goto L_0x05f5
            java.util.List<java.lang.Integer> r2 = r1.f139895o
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.f139895o = r2
        L_0x05f5:
            r2 = r8 & r11
            if (r2 != r11) goto L_0x0601
            java.util.List<java.lang.Integer> r2 = r1.f139873A
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.f139873A = r2
        L_0x0601:
            r2 = r8 & r14
            if (r2 != r14) goto L_0x060d
            java.util.List<XI.q> r2 = r1.f139875C
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.f139875C = r2
        L_0x060d:
            r2 = r8 & r12
            if (r2 != r12) goto L_0x0619
            java.util.List<java.lang.Integer> r2 = r1.f139876D
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.f139876D = r2
        L_0x0619:
            r2 = r8 & r13
            if (r2 != r13) goto L_0x0625
            java.util.List<java.lang.Integer> r2 = r1.f139879G
            java.util.List r2 = java.util.Collections.unmodifiableList(r2)
            r1.f139879G = r2
        L_0x0625:
            r6.I()     // Catch:{ IOException -> 0x0628, all -> 0x062f }
        L_0x0628:
            eJ.d r2 = r4.g()
            r1.f139883c = r2
            goto L_0x0638
        L_0x062f:
            r0 = move-exception
            r2 = r0
            eJ.d r3 = r4.g()
            r1.f139883c = r3
            throw r2
        L_0x0638:
            r17.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: XI.C16830c.<init>(eJ.e, eJ.g):void");
    }
}

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
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class l extends C17198i.d<l> implements C17207r {

    /* renamed from: l  reason: collision with root package name */
    private static final l f140034l;

    /* renamed from: m  reason: collision with root package name */
    public static C17208s<l> f140035m = new a();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C17193d f140036c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public int f140037d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public List<i> f140038e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public List<n> f140039f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public List<r> f140040g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public t f140041h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public w f140042i;

    /* renamed from: j  reason: collision with root package name */
    private byte f140043j;

    /* renamed from: k  reason: collision with root package name */
    private int f140044k;

    static class a extends C17191b<l> {
        a() {
        }

        /* renamed from: m */
        public l c(C17194e eVar, C17196g gVar) {
            return new l(eVar, gVar);
        }
    }

    public static final class b extends C17198i.c<l, b> implements C17207r {

        /* renamed from: d  reason: collision with root package name */
        private int f140045d;

        /* renamed from: e  reason: collision with root package name */
        private List<i> f140046e = Collections.emptyList();

        /* renamed from: f  reason: collision with root package name */
        private List<n> f140047f = Collections.emptyList();

        /* renamed from: g  reason: collision with root package name */
        private List<r> f140048g = Collections.emptyList();

        /* renamed from: h  reason: collision with root package name */
        private t f140049h = t.r();

        /* renamed from: i  reason: collision with root package name */
        private w f140050i = w.p();

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
            if ((this.f140045d & 1) != 1) {
                this.f140046e = new ArrayList(this.f140046e);
                this.f140045d |= 1;
            }
        }

        private void y() {
            if ((this.f140045d & 2) != 2) {
                this.f140047f = new ArrayList(this.f140047f);
                this.f140045d |= 2;
            }
        }

        private void z() {
            if ((this.f140045d & 4) != 4) {
                this.f140048g = new ArrayList(this.f140048g);
                this.f140045d |= 4;
            }
        }

        /* renamed from: C */
        public b f(l lVar) {
            if (lVar == l.F()) {
                return this;
            }
            if (!lVar.f140038e.isEmpty()) {
                if (this.f140046e.isEmpty()) {
                    this.f140046e = lVar.f140038e;
                    this.f140045d &= -2;
                } else {
                    w();
                    this.f140046e.addAll(lVar.f140038e);
                }
            }
            if (!lVar.f140039f.isEmpty()) {
                if (this.f140047f.isEmpty()) {
                    this.f140047f = lVar.f140039f;
                    this.f140045d &= -3;
                } else {
                    y();
                    this.f140047f.addAll(lVar.f140039f);
                }
            }
            if (!lVar.f140040g.isEmpty()) {
                if (this.f140048g.isEmpty()) {
                    this.f140048g = lVar.f140040g;
                    this.f140045d &= -5;
                } else {
                    z();
                    this.f140048g.addAll(lVar.f140040g);
                }
            }
            if (lVar.S()) {
                E(lVar.Q());
            }
            if (lVar.T()) {
                G(lVar.R());
            }
            n(lVar);
            j(e().i(lVar.f140036c));
            return this;
        }

        /* renamed from: D */
        public b o1(C17194e eVar, C17196g gVar) {
            l lVar;
            l lVar2 = null;
            try {
                l c10 = l.f140035m.c(eVar, gVar);
                if (c10 != null) {
                    f(c10);
                }
                return this;
            } catch (C17200k e10) {
                lVar = (l) e10.a();
                throw e10;
            } catch (Throwable th2) {
                th = th2;
                lVar2 = lVar;
            }
            if (lVar2 != null) {
                f(lVar2);
            }
            throw th;
        }

        public b E(t tVar) {
            if ((this.f140045d & 8) != 8 || this.f140049h == t.r()) {
                this.f140049h = tVar;
            } else {
                this.f140049h = t.z(this.f140049h).f(tVar).m();
            }
            this.f140045d |= 8;
            return this;
        }

        public b G(w wVar) {
            if ((this.f140045d & 16) != 16 || this.f140050i == w.p()) {
                this.f140050i = wVar;
            } else {
                this.f140050i = w.u(this.f140050i).f(wVar).m();
            }
            this.f140045d |= 16;
            return this;
        }

        /* renamed from: p */
        public l g() {
            l r10 = r();
            if (r10.isInitialized()) {
                return r10;
            }
            throw C17190a.C3485a.c(r10);
        }

        public l r() {
            l lVar = new l((C17198i.c) this);
            int i10 = this.f140045d;
            int i11 = 1;
            if ((i10 & 1) == 1) {
                this.f140046e = Collections.unmodifiableList(this.f140046e);
                this.f140045d &= -2;
            }
            List unused = lVar.f140038e = this.f140046e;
            if ((this.f140045d & 2) == 2) {
                this.f140047f = Collections.unmodifiableList(this.f140047f);
                this.f140045d &= -3;
            }
            List unused2 = lVar.f140039f = this.f140047f;
            if ((this.f140045d & 4) == 4) {
                this.f140048g = Collections.unmodifiableList(this.f140048g);
                this.f140045d &= -5;
            }
            List unused3 = lVar.f140040g = this.f140048g;
            if ((i10 & 8) != 8) {
                i11 = 0;
            }
            t unused4 = lVar.f140041h = this.f140049h;
            if ((i10 & 16) == 16) {
                i11 |= 2;
            }
            w unused5 = lVar.f140042i = this.f140050i;
            int unused6 = lVar.f140037d = i11;
            return lVar;
        }

        /* renamed from: u */
        public b d() {
            return v().f(r());
        }
    }

    static {
        l lVar = new l(true);
        f140034l = lVar;
        lVar.U();
    }

    public static l F() {
        return f140034l;
    }

    private void U() {
        this.f140038e = Collections.emptyList();
        this.f140039f = Collections.emptyList();
        this.f140040g = Collections.emptyList();
        this.f140041h = t.r();
        this.f140042i = w.p();
    }

    public static b V() {
        return b.v();
    }

    public static b W(l lVar) {
        return V().f(lVar);
    }

    public static l Y(InputStream inputStream, C17196g gVar) {
        return f140035m.a(inputStream, gVar);
    }

    /* renamed from: G */
    public l getDefaultInstanceForType() {
        return f140034l;
    }

    public i H(int i10) {
        return this.f140038e.get(i10);
    }

    public int I() {
        return this.f140038e.size();
    }

    public List<i> J() {
        return this.f140038e;
    }

    public n K(int i10) {
        return this.f140039f.get(i10);
    }

    public int L() {
        return this.f140039f.size();
    }

    public List<n> M() {
        return this.f140039f;
    }

    public r N(int i10) {
        return this.f140040g.get(i10);
    }

    public int O() {
        return this.f140040g.size();
    }

    public List<r> P() {
        return this.f140040g;
    }

    public t Q() {
        return this.f140041h;
    }

    public w R() {
        return this.f140042i;
    }

    public boolean S() {
        return (this.f140037d & 1) == 1;
    }

    public boolean T() {
        return (this.f140037d & 2) == 2;
    }

    /* renamed from: X */
    public b newBuilderForType() {
        return V();
    }

    /* renamed from: Z */
    public b toBuilder() {
        return W(this);
    }

    public void a(C17195f fVar) {
        getSerializedSize();
        C17198i.d<MessageType>.defpackage.a t10 = t();
        for (int i10 = 0; i10 < this.f140038e.size(); i10++) {
            fVar.d0(3, this.f140038e.get(i10));
        }
        for (int i11 = 0; i11 < this.f140039f.size(); i11++) {
            fVar.d0(4, this.f140039f.get(i11));
        }
        for (int i12 = 0; i12 < this.f140040g.size(); i12++) {
            fVar.d0(5, this.f140040g.get(i12));
        }
        if ((this.f140037d & 1) == 1) {
            fVar.d0(30, this.f140041h);
        }
        if ((this.f140037d & 2) == 2) {
            fVar.d0(32, this.f140042i);
        }
        t10.a(200, fVar);
        fVar.i0(this.f140036c);
    }

    public C17208s<l> getParserForType() {
        return f140035m;
    }

    public int getSerializedSize() {
        int i10 = this.f140044k;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f140038e.size(); i12++) {
            i11 += C17195f.s(3, this.f140038e.get(i12));
        }
        for (int i13 = 0; i13 < this.f140039f.size(); i13++) {
            i11 += C17195f.s(4, this.f140039f.get(i13));
        }
        for (int i14 = 0; i14 < this.f140040g.size(); i14++) {
            i11 += C17195f.s(5, this.f140040g.get(i14));
        }
        if ((this.f140037d & 1) == 1) {
            i11 += C17195f.s(30, this.f140041h);
        }
        if ((this.f140037d & 2) == 2) {
            i11 += C17195f.s(32, this.f140042i);
        }
        int o10 = i11 + o() + this.f140036c.size();
        this.f140044k = o10;
        return o10;
    }

    public final boolean isInitialized() {
        byte b10 = this.f140043j;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < I(); i10++) {
            if (!H(i10).isInitialized()) {
                this.f140043j = 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < L(); i11++) {
            if (!K(i11).isInitialized()) {
                this.f140043j = 0;
                return false;
            }
        }
        for (int i12 = 0; i12 < O(); i12++) {
            if (!N(i12).isInitialized()) {
                this.f140043j = 0;
                return false;
            }
        }
        if (S() && !Q().isInitialized()) {
            this.f140043j = 0;
            return false;
        } else if (!n()) {
            this.f140043j = 0;
            return false;
        } else {
            this.f140043j = 1;
            return true;
        }
    }

    private l(C17198i.c<l, ?> cVar) {
        super(cVar);
        this.f140043j = -1;
        this.f140044k = -1;
        this.f140036c = cVar.e();
    }

    private l(boolean z10) {
        this.f140043j = -1;
        this.f140044k = -1;
        this.f140036c = C17193d.f143014a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: XI.t$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: XI.w$b} */
    /* JADX WARNING: type inference failed for: r9v0 */
    /* JADX WARNING: type inference failed for: r9v5 */
    /* JADX WARNING: type inference failed for: r9v6 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private l(eJ.C17194e r11, eJ.C17196g r12) {
        /*
            r10 = this;
            r10.<init>()
            r0 = -1
            r10.f140043j = r0
            r10.f140044k = r0
            r10.U()
            eJ.d$b r0 = eJ.C17193d.B()
            r1 = 1
            eJ.f r2 = eJ.C17195f.J(r0, r1)
            r3 = 0
            r4 = r3
        L_0x0016:
            r5 = 4
            r6 = 2
            if (r3 != 0) goto L_0x012d
            int r7 = r11.K()     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            if (r7 == 0) goto L_0x003b
            r8 = 26
            if (r7 == r8) goto L_0x00c6
            r8 = 34
            if (r7 == r8) goto L_0x00ac
            r8 = 42
            if (r7 == r8) goto L_0x0092
            r8 = 242(0xf2, float:3.39E-43)
            r9 = 0
            if (r7 == r8) goto L_0x006c
            r8 = 258(0x102, float:3.62E-43)
            if (r7 == r8) goto L_0x0046
            boolean r5 = r10.k(r11, r2, r12, r7)     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            if (r5 != 0) goto L_0x0016
        L_0x003b:
            r3 = r1
            goto L_0x0016
        L_0x003d:
            r11 = move-exception
            goto L_0x00f3
        L_0x0040:
            r11 = move-exception
            goto L_0x00e0
        L_0x0043:
            r11 = move-exception
            goto L_0x00ee
        L_0x0046:
            int r7 = r10.f140037d     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            r7 = r7 & r6
            if (r7 != r6) goto L_0x0051
            XI.w r7 = r10.f140042i     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            XI.w$b r9 = r7.toBuilder()     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
        L_0x0051:
            eJ.s<XI.w> r7 = XI.w.f140274g     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            eJ.q r7 = r11.u(r7, r12)     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            XI.w r7 = (XI.w) r7     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            r10.f140042i = r7     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            if (r9 == 0) goto L_0x0066
            r9.f(r7)     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            XI.w r7 = r9.m()     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            r10.f140042i = r7     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
        L_0x0066:
            int r7 = r10.f140037d     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            r7 = r7 | r6
            r10.f140037d = r7     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            goto L_0x0016
        L_0x006c:
            int r7 = r10.f140037d     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            r7 = r7 & r1
            if (r7 != r1) goto L_0x0077
            XI.t r7 = r10.f140041h     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            XI.t$b r9 = r7.toBuilder()     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
        L_0x0077:
            eJ.s<XI.t> r7 = XI.t.f140225i     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            eJ.q r7 = r11.u(r7, r12)     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            XI.t r7 = (XI.t) r7     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            r10.f140041h = r7     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            if (r9 == 0) goto L_0x008c
            r9.f(r7)     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            XI.t r7 = r9.m()     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            r10.f140041h = r7     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
        L_0x008c:
            int r7 = r10.f140037d     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            r7 = r7 | r1
            r10.f140037d = r7     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            goto L_0x0016
        L_0x0092:
            r7 = r4 & 4
            if (r7 == r5) goto L_0x009f
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            r7.<init>()     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            r10.f140040g = r7     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            r4 = r4 | 4
        L_0x009f:
            java.util.List<XI.r> r7 = r10.f140040g     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            eJ.s<XI.r> r8 = XI.r.f140180q     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            eJ.q r8 = r11.u(r8, r12)     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            r7.add(r8)     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            goto L_0x0016
        L_0x00ac:
            r7 = r4 & 2
            if (r7 == r6) goto L_0x00b9
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            r7.<init>()     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            r10.f140039f = r7     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            r4 = r4 | 2
        L_0x00b9:
            java.util.List<XI.n> r7 = r10.f140039f     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            eJ.s<XI.n> r8 = XI.n.f140067w     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            eJ.q r8 = r11.u(r8, r12)     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            r7.add(r8)     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            goto L_0x0016
        L_0x00c6:
            r7 = r4 & 1
            if (r7 == r1) goto L_0x00d3
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            r7.<init>()     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            r10.f140038e = r7     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            r4 = r4 | 1
        L_0x00d3:
            java.util.List<XI.i> r7 = r10.f140038e     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            eJ.s<XI.i> r8 = XI.i.f139999w     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            eJ.q r8 = r11.u(r8, r12)     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            r7.add(r8)     // Catch:{ k -> 0x0043, IOException -> 0x0040 }
            goto L_0x0016
        L_0x00e0:
            eJ.k r12 = new eJ.k     // Catch:{ all -> 0x003d }
            java.lang.String r11 = r11.getMessage()     // Catch:{ all -> 0x003d }
            r12.<init>(r11)     // Catch:{ all -> 0x003d }
            eJ.k r11 = r12.i(r10)     // Catch:{ all -> 0x003d }
            throw r11     // Catch:{ all -> 0x003d }
        L_0x00ee:
            eJ.k r11 = r11.i(r10)     // Catch:{ all -> 0x003d }
            throw r11     // Catch:{ all -> 0x003d }
        L_0x00f3:
            r12 = r4 & 1
            if (r12 != r1) goto L_0x00ff
            java.util.List<XI.i> r12 = r10.f140038e
            java.util.List r12 = java.util.Collections.unmodifiableList(r12)
            r10.f140038e = r12
        L_0x00ff:
            r12 = r4 & 2
            if (r12 != r6) goto L_0x010b
            java.util.List<XI.n> r12 = r10.f140039f
            java.util.List r12 = java.util.Collections.unmodifiableList(r12)
            r10.f140039f = r12
        L_0x010b:
            r12 = r4 & 4
            if (r12 != r5) goto L_0x0117
            java.util.List<XI.r> r12 = r10.f140040g
            java.util.List r12 = java.util.Collections.unmodifiableList(r12)
            r10.f140040g = r12
        L_0x0117:
            r2.I()     // Catch:{ IOException -> 0x011a, all -> 0x0121 }
        L_0x011a:
            eJ.d r12 = r0.g()
            r10.f140036c = r12
            goto L_0x0129
        L_0x0121:
            r11 = move-exception
            eJ.d r12 = r0.g()
            r10.f140036c = r12
            throw r11
        L_0x0129:
            r10.h()
            throw r11
        L_0x012d:
            r11 = r4 & 1
            if (r11 != r1) goto L_0x0139
            java.util.List<XI.i> r11 = r10.f140038e
            java.util.List r11 = java.util.Collections.unmodifiableList(r11)
            r10.f140038e = r11
        L_0x0139:
            r11 = r4 & 2
            if (r11 != r6) goto L_0x0145
            java.util.List<XI.n> r11 = r10.f140039f
            java.util.List r11 = java.util.Collections.unmodifiableList(r11)
            r10.f140039f = r11
        L_0x0145:
            r11 = r4 & 4
            if (r11 != r5) goto L_0x0151
            java.util.List<XI.r> r11 = r10.f140040g
            java.util.List r11 = java.util.Collections.unmodifiableList(r11)
            r10.f140040g = r11
        L_0x0151:
            r2.I()     // Catch:{ IOException -> 0x0154, all -> 0x015b }
        L_0x0154:
            eJ.d r11 = r0.g()
            r10.f140036c = r11
            goto L_0x0163
        L_0x015b:
            r11 = move-exception
            eJ.d r12 = r0.g()
            r10.f140036c = r12
            throw r11
        L_0x0163:
            r10.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: XI.l.<init>(eJ.e, eJ.g):void");
    }
}

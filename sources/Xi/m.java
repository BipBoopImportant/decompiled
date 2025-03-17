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

public final class m extends C17198i.d<m> implements C17207r {

    /* renamed from: k  reason: collision with root package name */
    private static final m f140051k;

    /* renamed from: l  reason: collision with root package name */
    public static C17208s<m> f140052l = new a();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C17193d f140053c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public int f140054d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public p f140055e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public o f140056f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public l f140057g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public List<C16830c> f140058h;

    /* renamed from: i  reason: collision with root package name */
    private byte f140059i;

    /* renamed from: j  reason: collision with root package name */
    private int f140060j;

    static class a extends C17191b<m> {
        a() {
        }

        /* renamed from: m */
        public m c(C17194e eVar, C17196g gVar) {
            return new m(eVar, gVar);
        }
    }

    public static final class b extends C17198i.c<m, b> implements C17207r {

        /* renamed from: d  reason: collision with root package name */
        private int f140061d;

        /* renamed from: e  reason: collision with root package name */
        private p f140062e = p.p();

        /* renamed from: f  reason: collision with root package name */
        private o f140063f = o.p();

        /* renamed from: g  reason: collision with root package name */
        private l f140064g = l.F();

        /* renamed from: h  reason: collision with root package name */
        private List<C16830c> f140065h = Collections.emptyList();

        private b() {
            y();
        }

        /* access modifiers changed from: private */
        public static b v() {
            return new b();
        }

        private void w() {
            if ((this.f140061d & 8) != 8) {
                this.f140065h = new ArrayList(this.f140065h);
                this.f140061d |= 8;
            }
        }

        private void y() {
        }

        /* renamed from: A */
        public b o1(C17194e eVar, C17196g gVar) {
            m mVar;
            m mVar2 = null;
            try {
                m c10 = m.f140052l.c(eVar, gVar);
                if (c10 != null) {
                    f(c10);
                }
                return this;
            } catch (C17200k e10) {
                mVar = (m) e10.a();
                throw e10;
            } catch (Throwable th2) {
                th = th2;
                mVar2 = mVar;
            }
            if (mVar2 != null) {
                f(mVar2);
            }
            throw th;
        }

        public b C(l lVar) {
            if ((this.f140061d & 4) != 4 || this.f140064g == l.F()) {
                this.f140064g = lVar;
            } else {
                this.f140064g = l.W(this.f140064g).f(lVar).r();
            }
            this.f140061d |= 4;
            return this;
        }

        public b D(o oVar) {
            if ((this.f140061d & 2) != 2 || this.f140063f == o.p()) {
                this.f140063f = oVar;
            } else {
                this.f140063f = o.u(this.f140063f).f(oVar).m();
            }
            this.f140061d |= 2;
            return this;
        }

        public b E(p pVar) {
            if ((this.f140061d & 1) != 1 || this.f140062e == p.p()) {
                this.f140062e = pVar;
            } else {
                this.f140062e = p.u(this.f140062e).f(pVar).m();
            }
            this.f140061d |= 1;
            return this;
        }

        /* renamed from: p */
        public m g() {
            m r10 = r();
            if (r10.isInitialized()) {
                return r10;
            }
            throw C17190a.C3485a.c(r10);
        }

        public m r() {
            m mVar = new m((C17198i.c) this);
            int i10 = this.f140061d;
            int i11 = 1;
            if ((i10 & 1) != 1) {
                i11 = 0;
            }
            p unused = mVar.f140055e = this.f140062e;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            o unused2 = mVar.f140056f = this.f140063f;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            l unused3 = mVar.f140057g = this.f140064g;
            if ((this.f140061d & 8) == 8) {
                this.f140065h = Collections.unmodifiableList(this.f140065h);
                this.f140061d &= -9;
            }
            List unused4 = mVar.f140058h = this.f140065h;
            int unused5 = mVar.f140054d = i11;
            return mVar;
        }

        /* renamed from: u */
        public b d() {
            return v().f(r());
        }

        /* renamed from: z */
        public b f(m mVar) {
            if (mVar == m.F()) {
                return this;
            }
            if (mVar.M()) {
                E(mVar.J());
            }
            if (mVar.L()) {
                D(mVar.I());
            }
            if (mVar.K()) {
                C(mVar.H());
            }
            if (!mVar.f140058h.isEmpty()) {
                if (this.f140065h.isEmpty()) {
                    this.f140065h = mVar.f140058h;
                    this.f140061d &= -9;
                } else {
                    w();
                    this.f140065h.addAll(mVar.f140058h);
                }
            }
            n(mVar);
            j(e().i(mVar.f140053c));
            return this;
        }
    }

    static {
        m mVar = new m(true);
        f140051k = mVar;
        mVar.N();
    }

    public static m F() {
        return f140051k;
    }

    private void N() {
        this.f140055e = p.p();
        this.f140056f = o.p();
        this.f140057g = l.F();
        this.f140058h = Collections.emptyList();
    }

    public static b O() {
        return b.v();
    }

    public static b P(m mVar) {
        return O().f(mVar);
    }

    public static m R(InputStream inputStream, C17196g gVar) {
        return f140052l.a(inputStream, gVar);
    }

    public C16830c C(int i10) {
        return this.f140058h.get(i10);
    }

    public int D() {
        return this.f140058h.size();
    }

    public List<C16830c> E() {
        return this.f140058h;
    }

    /* renamed from: G */
    public m getDefaultInstanceForType() {
        return f140051k;
    }

    public l H() {
        return this.f140057g;
    }

    public o I() {
        return this.f140056f;
    }

    public p J() {
        return this.f140055e;
    }

    public boolean K() {
        return (this.f140054d & 4) == 4;
    }

    public boolean L() {
        return (this.f140054d & 2) == 2;
    }

    public boolean M() {
        return (this.f140054d & 1) == 1;
    }

    /* renamed from: Q */
    public b newBuilderForType() {
        return O();
    }

    /* renamed from: S */
    public b toBuilder() {
        return P(this);
    }

    public void a(C17195f fVar) {
        getSerializedSize();
        C17198i.d<MessageType>.defpackage.a t10 = t();
        if ((this.f140054d & 1) == 1) {
            fVar.d0(1, this.f140055e);
        }
        if ((this.f140054d & 2) == 2) {
            fVar.d0(2, this.f140056f);
        }
        if ((this.f140054d & 4) == 4) {
            fVar.d0(3, this.f140057g);
        }
        for (int i10 = 0; i10 < this.f140058h.size(); i10++) {
            fVar.d0(4, this.f140058h.get(i10));
        }
        t10.a(200, fVar);
        fVar.i0(this.f140053c);
    }

    public C17208s<m> getParserForType() {
        return f140052l;
    }

    public int getSerializedSize() {
        int i10 = this.f140060j;
        if (i10 != -1) {
            return i10;
        }
        int s10 = (this.f140054d & 1) == 1 ? C17195f.s(1, this.f140055e) : 0;
        if ((this.f140054d & 2) == 2) {
            s10 += C17195f.s(2, this.f140056f);
        }
        if ((this.f140054d & 4) == 4) {
            s10 += C17195f.s(3, this.f140057g);
        }
        for (int i11 = 0; i11 < this.f140058h.size(); i11++) {
            s10 += C17195f.s(4, this.f140058h.get(i11));
        }
        int o10 = s10 + o() + this.f140053c.size();
        this.f140060j = o10;
        return o10;
    }

    public final boolean isInitialized() {
        byte b10 = this.f140059i;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (L() && !I().isInitialized()) {
            this.f140059i = 0;
            return false;
        } else if (!K() || H().isInitialized()) {
            for (int i10 = 0; i10 < D(); i10++) {
                if (!C(i10).isInitialized()) {
                    this.f140059i = 0;
                    return false;
                }
            }
            if (!n()) {
                this.f140059i = 0;
                return false;
            }
            this.f140059i = 1;
            return true;
        } else {
            this.f140059i = 0;
            return false;
        }
    }

    private m(C17198i.c<m, ?> cVar) {
        super(cVar);
        this.f140059i = -1;
        this.f140060j = -1;
        this.f140053c = cVar.e();
    }

    private m(boolean z10) {
        this.f140059i = -1;
        this.f140060j = -1;
        this.f140053c = C17193d.f143014a;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: XI.p$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v3, resolved type: XI.o$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: XI.l$b} */
    /* JADX WARNING: type inference failed for: r8v0 */
    /* JADX WARNING: type inference failed for: r8v7 */
    /* JADX WARNING: type inference failed for: r8v8 */
    /* JADX WARNING: type inference failed for: r8v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private m(eJ.C17194e r10, eJ.C17196g r11) {
        /*
            r9 = this;
            r9.<init>()
            r0 = -1
            r9.f140059i = r0
            r9.f140060j = r0
            r9.N()
            eJ.d$b r0 = eJ.C17193d.B()
            r1 = 1
            eJ.f r2 = eJ.C17195f.J(r0, r1)
            r3 = 0
            r4 = r3
        L_0x0016:
            r5 = 8
            if (r3 != 0) goto L_0x0105
            int r6 = r10.K()     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            if (r6 == 0) goto L_0x0037
            r7 = 10
            r8 = 0
            if (r6 == r7) goto L_0x00a9
            r7 = 18
            if (r6 == r7) goto L_0x0081
            r7 = 26
            if (r6 == r7) goto L_0x005a
            r7 = 34
            if (r6 == r7) goto L_0x0042
            boolean r5 = r9.k(r10, r2, r11, r6)     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            if (r5 != 0) goto L_0x0016
        L_0x0037:
            r3 = r1
            goto L_0x0016
        L_0x0039:
            r10 = move-exception
            goto L_0x00e3
        L_0x003c:
            r10 = move-exception
            goto L_0x00d0
        L_0x003f:
            r10 = move-exception
            goto L_0x00de
        L_0x0042:
            r6 = r4 & 8
            if (r6 == r5) goto L_0x004e
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            r6.<init>()     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            r9.f140058h = r6     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            r4 = r5
        L_0x004e:
            java.util.List<XI.c> r6 = r9.f140058h     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            eJ.s<XI.c> r7 = XI.C16830c.f139872L     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            eJ.q r7 = r10.u(r7, r11)     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            r6.add(r7)     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            goto L_0x0016
        L_0x005a:
            int r6 = r9.f140054d     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            r7 = 4
            r6 = r6 & r7
            if (r6 != r7) goto L_0x0066
            XI.l r6 = r9.f140057g     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            XI.l$b r8 = r6.toBuilder()     // Catch:{ k -> 0x003f, IOException -> 0x003c }
        L_0x0066:
            eJ.s<XI.l> r6 = XI.l.f140035m     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            eJ.q r6 = r10.u(r6, r11)     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            XI.l r6 = (XI.l) r6     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            r9.f140057g = r6     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            if (r8 == 0) goto L_0x007b
            r8.f(r6)     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            XI.l r6 = r8.r()     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            r9.f140057g = r6     // Catch:{ k -> 0x003f, IOException -> 0x003c }
        L_0x007b:
            int r6 = r9.f140054d     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            r6 = r6 | r7
            r9.f140054d = r6     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            goto L_0x0016
        L_0x0081:
            int r6 = r9.f140054d     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            r7 = 2
            r6 = r6 & r7
            if (r6 != r7) goto L_0x008d
            XI.o r6 = r9.f140056f     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            XI.o$b r8 = r6.toBuilder()     // Catch:{ k -> 0x003f, IOException -> 0x003c }
        L_0x008d:
            eJ.s<XI.o> r6 = XI.o.f140103g     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            eJ.q r6 = r10.u(r6, r11)     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            XI.o r6 = (XI.o) r6     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            r9.f140056f = r6     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            if (r8 == 0) goto L_0x00a2
            r8.f(r6)     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            XI.o r6 = r8.m()     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            r9.f140056f = r6     // Catch:{ k -> 0x003f, IOException -> 0x003c }
        L_0x00a2:
            int r6 = r9.f140054d     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            r6 = r6 | r7
            r9.f140054d = r6     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            goto L_0x0016
        L_0x00a9:
            int r6 = r9.f140054d     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            r6 = r6 & r1
            if (r6 != r1) goto L_0x00b4
            XI.p r6 = r9.f140055e     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            XI.p$b r8 = r6.toBuilder()     // Catch:{ k -> 0x003f, IOException -> 0x003c }
        L_0x00b4:
            eJ.s<XI.p> r6 = XI.p.f140124g     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            eJ.q r6 = r10.u(r6, r11)     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            XI.p r6 = (XI.p) r6     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            r9.f140055e = r6     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            if (r8 == 0) goto L_0x00c9
            r8.f(r6)     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            XI.p r6 = r8.m()     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            r9.f140055e = r6     // Catch:{ k -> 0x003f, IOException -> 0x003c }
        L_0x00c9:
            int r6 = r9.f140054d     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            r6 = r6 | r1
            r9.f140054d = r6     // Catch:{ k -> 0x003f, IOException -> 0x003c }
            goto L_0x0016
        L_0x00d0:
            eJ.k r11 = new eJ.k     // Catch:{ all -> 0x0039 }
            java.lang.String r10 = r10.getMessage()     // Catch:{ all -> 0x0039 }
            r11.<init>(r10)     // Catch:{ all -> 0x0039 }
            eJ.k r10 = r11.i(r9)     // Catch:{ all -> 0x0039 }
            throw r10     // Catch:{ all -> 0x0039 }
        L_0x00de:
            eJ.k r10 = r10.i(r9)     // Catch:{ all -> 0x0039 }
            throw r10     // Catch:{ all -> 0x0039 }
        L_0x00e3:
            r11 = r4 & 8
            if (r11 != r5) goto L_0x00ef
            java.util.List<XI.c> r11 = r9.f140058h
            java.util.List r11 = java.util.Collections.unmodifiableList(r11)
            r9.f140058h = r11
        L_0x00ef:
            r2.I()     // Catch:{ IOException -> 0x00f2, all -> 0x00f9 }
        L_0x00f2:
            eJ.d r11 = r0.g()
            r9.f140053c = r11
            goto L_0x0101
        L_0x00f9:
            r10 = move-exception
            eJ.d r11 = r0.g()
            r9.f140053c = r11
            throw r10
        L_0x0101:
            r9.h()
            throw r10
        L_0x0105:
            r10 = r4 & 8
            if (r10 != r5) goto L_0x0111
            java.util.List<XI.c> r10 = r9.f140058h
            java.util.List r10 = java.util.Collections.unmodifiableList(r10)
            r9.f140058h = r10
        L_0x0111:
            r2.I()     // Catch:{ IOException -> 0x0114, all -> 0x011b }
        L_0x0114:
            eJ.d r10 = r0.g()
            r9.f140053c = r10
            goto L_0x0123
        L_0x011b:
            r10 = move-exception
            eJ.d r11 = r0.g()
            r9.f140053c = r11
            throw r10
        L_0x0123:
            r9.h()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: XI.m.<init>(eJ.e, eJ.g):void");
    }
}

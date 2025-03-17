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
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class t extends C17198i implements C17207r {

    /* renamed from: h  reason: collision with root package name */
    private static final t f140224h;

    /* renamed from: i  reason: collision with root package name */
    public static C17208s<t> f140225i = new a();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C17193d f140226b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public int f140227c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public List<q> f140228d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public int f140229e;

    /* renamed from: f  reason: collision with root package name */
    private byte f140230f;

    /* renamed from: g  reason: collision with root package name */
    private int f140231g;

    static class a extends C17191b<t> {
        a() {
        }

        /* renamed from: m */
        public t c(C17194e eVar, C17196g gVar) {
            return new t(eVar, gVar);
        }
    }

    public static final class b extends C17198i.b<t, b> implements C17207r {

        /* renamed from: b  reason: collision with root package name */
        private int f140232b;

        /* renamed from: c  reason: collision with root package name */
        private List<q> f140233c = Collections.emptyList();

        /* renamed from: d  reason: collision with root package name */
        private int f140234d = -1;

        private b() {
            r();
        }

        /* access modifiers changed from: private */
        public static b o() {
            return new b();
        }

        private void p() {
            if ((this.f140232b & 1) != 1) {
                this.f140233c = new ArrayList(this.f140233c);
                this.f140232b |= 1;
            }
        }

        private void r() {
        }

        /* renamed from: l */
        public t g() {
            t m10 = m();
            if (m10.isInitialized()) {
                return m10;
            }
            throw C17190a.C3485a.c(m10);
        }

        public t m() {
            t tVar = new t((C17198i.b) this);
            int i10 = this.f140232b;
            int i11 = 1;
            if ((i10 & 1) == 1) {
                this.f140233c = Collections.unmodifiableList(this.f140233c);
                this.f140232b &= -2;
            }
            List unused = tVar.f140228d = this.f140233c;
            if ((i10 & 2) != 2) {
                i11 = 0;
            }
            int unused2 = tVar.f140229e = this.f140234d;
            int unused3 = tVar.f140227c = i11;
            return tVar;
        }

        /* renamed from: n */
        public b d() {
            return o().f(m());
        }

        /* renamed from: u */
        public b f(t tVar) {
            if (tVar == t.r()) {
                return this;
            }
            if (!tVar.f140228d.isEmpty()) {
                if (this.f140233c.isEmpty()) {
                    this.f140233c = tVar.f140228d;
                    this.f140232b &= -2;
                } else {
                    p();
                    this.f140233c.addAll(tVar.f140228d);
                }
            }
            if (tVar.w()) {
                w(tVar.s());
            }
            j(e().i(tVar.f140226b));
            return this;
        }

        /* renamed from: v */
        public b o1(C17194e eVar, C17196g gVar) {
            t tVar;
            t tVar2 = null;
            try {
                t c10 = t.f140225i.c(eVar, gVar);
                if (c10 != null) {
                    f(c10);
                }
                return this;
            } catch (C17200k e10) {
                tVar = (t) e10.a();
                throw e10;
            } catch (Throwable th2) {
                th = th2;
                tVar2 = tVar;
            }
            if (tVar2 != null) {
                f(tVar2);
            }
            throw th;
        }

        public b w(int i10) {
            this.f140232b |= 2;
            this.f140234d = i10;
            return this;
        }
    }

    static {
        t tVar = new t(true);
        f140224h = tVar;
        tVar.x();
    }

    public static t r() {
        return f140224h;
    }

    private void x() {
        this.f140228d = Collections.emptyList();
        this.f140229e = -1;
    }

    public static b y() {
        return b.o();
    }

    public static b z(t tVar) {
        return y().f(tVar);
    }

    /* renamed from: A */
    public b newBuilderForType() {
        return y();
    }

    /* renamed from: B */
    public b toBuilder() {
        return z(this);
    }

    public void a(C17195f fVar) {
        getSerializedSize();
        for (int i10 = 0; i10 < this.f140228d.size(); i10++) {
            fVar.d0(1, this.f140228d.get(i10));
        }
        if ((this.f140227c & 1) == 1) {
            fVar.a0(2, this.f140229e);
        }
        fVar.i0(this.f140226b);
    }

    public C17208s<t> getParserForType() {
        return f140225i;
    }

    public int getSerializedSize() {
        int i10 = this.f140231g;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f140228d.size(); i12++) {
            i11 += C17195f.s(1, this.f140228d.get(i12));
        }
        if ((this.f140227c & 1) == 1) {
            i11 += C17195f.o(2, this.f140229e);
        }
        int size = i11 + this.f140226b.size();
        this.f140231g = size;
        return size;
    }

    public final boolean isInitialized() {
        byte b10 = this.f140230f;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < u(); i10++) {
            if (!t(i10).isInitialized()) {
                this.f140230f = 0;
                return false;
            }
        }
        this.f140230f = 1;
        return true;
    }

    public int s() {
        return this.f140229e;
    }

    public q t(int i10) {
        return this.f140228d.get(i10);
    }

    public int u() {
        return this.f140228d.size();
    }

    public List<q> v() {
        return this.f140228d;
    }

    public boolean w() {
        return (this.f140227c & 1) == 1;
    }

    private t(C17198i.b bVar) {
        super(bVar);
        this.f140230f = -1;
        this.f140231g = -1;
        this.f140226b = bVar.e();
    }

    private t(boolean z10) {
        this.f140230f = -1;
        this.f140231g = -1;
        this.f140226b = C17193d.f143014a;
    }

    private t(C17194e eVar, C17196g gVar) {
        this.f140230f = -1;
        this.f140231g = -1;
        x();
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
                            this.f140228d = new ArrayList();
                            z11 = true;
                        }
                        this.f140228d.add(eVar.u(q.f140132v, gVar));
                    } else if (K10 == 16) {
                        this.f140227c |= 1;
                        this.f140229e = eVar.s();
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
                    this.f140228d = Collections.unmodifiableList(this.f140228d);
                }
                try {
                    J10.I();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f140226b = B10.g();
                    throw th3;
                }
                this.f140226b = B10.g();
                h();
                throw th2;
            }
        }
        if (z11) {
            this.f140228d = Collections.unmodifiableList(this.f140228d);
        }
        try {
            J10.I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f140226b = B10.g();
            throw th4;
        }
        this.f140226b = B10.g();
        h();
    }
}

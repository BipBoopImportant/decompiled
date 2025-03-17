package XI;

import eJ.C17190a;
import eJ.C17191b;
import eJ.C17193d;
import eJ.C17194e;
import eJ.C17195f;
import eJ.C17196g;
import eJ.C17198i;
import eJ.C17200k;
import eJ.C17203n;
import eJ.C17204o;
import eJ.C17207r;
import eJ.C17208s;
import eJ.C17209t;
import java.io.IOException;

public final class p extends C17198i implements C17207r {

    /* renamed from: f  reason: collision with root package name */
    private static final p f140123f;

    /* renamed from: g  reason: collision with root package name */
    public static C17208s<p> f140124g = new a();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C17193d f140125b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public C17204o f140126c;

    /* renamed from: d  reason: collision with root package name */
    private byte f140127d;

    /* renamed from: e  reason: collision with root package name */
    private int f140128e;

    static class a extends C17191b<p> {
        a() {
        }

        /* renamed from: m */
        public p c(C17194e eVar, C17196g gVar) {
            return new p(eVar, gVar);
        }
    }

    public static final class b extends C17198i.b<p, b> implements C17207r {

        /* renamed from: b  reason: collision with root package name */
        private int f140129b;

        /* renamed from: c  reason: collision with root package name */
        private C17204o f140130c = C17203n.f143079b;

        private b() {
            r();
        }

        /* access modifiers changed from: private */
        public static b o() {
            return new b();
        }

        private void p() {
            if ((this.f140129b & 1) != 1) {
                this.f140130c = new C17203n(this.f140130c);
                this.f140129b |= 1;
            }
        }

        private void r() {
        }

        /* renamed from: l */
        public p g() {
            p m10 = m();
            if (m10.isInitialized()) {
                return m10;
            }
            throw C17190a.C3485a.c(m10);
        }

        public p m() {
            p pVar = new p((C17198i.b) this);
            if ((this.f140129b & 1) == 1) {
                this.f140130c = this.f140130c.w();
                this.f140129b &= -2;
            }
            C17204o unused = pVar.f140126c = this.f140130c;
            return pVar;
        }

        /* renamed from: n */
        public b d() {
            return o().f(m());
        }

        /* renamed from: u */
        public b f(p pVar) {
            if (pVar == p.p()) {
                return this;
            }
            if (!pVar.f140126c.isEmpty()) {
                if (this.f140130c.isEmpty()) {
                    this.f140130c = pVar.f140126c;
                    this.f140129b &= -2;
                } else {
                    p();
                    this.f140130c.addAll(pVar.f140126c);
                }
            }
            j(e().i(pVar.f140125b));
            return this;
        }

        /* renamed from: v */
        public b o1(C17194e eVar, C17196g gVar) {
            p pVar;
            p pVar2 = null;
            try {
                p c10 = p.f140124g.c(eVar, gVar);
                if (c10 != null) {
                    f(c10);
                }
                return this;
            } catch (C17200k e10) {
                pVar = (p) e10.a();
                throw e10;
            } catch (Throwable th2) {
                th = th2;
                pVar2 = pVar;
            }
            if (pVar2 != null) {
                f(pVar2);
            }
            throw th;
        }
    }

    static {
        p pVar = new p(true);
        f140123f = pVar;
        pVar.s();
    }

    public static p p() {
        return f140123f;
    }

    private void s() {
        this.f140126c = C17203n.f143079b;
    }

    public static b t() {
        return b.o();
    }

    public static b u(p pVar) {
        return t().f(pVar);
    }

    public void a(C17195f fVar) {
        getSerializedSize();
        for (int i10 = 0; i10 < this.f140126c.size(); i10++) {
            fVar.O(1, this.f140126c.b1(i10));
        }
        fVar.i0(this.f140125b);
    }

    public C17208s<p> getParserForType() {
        return f140124g;
    }

    public int getSerializedSize() {
        int i10 = this.f140128e;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f140126c.size(); i12++) {
            i11 += C17195f.e(this.f140126c.b1(i12));
        }
        int size = i11 + r().size() + this.f140125b.size();
        this.f140128e = size;
        return size;
    }

    public final boolean isInitialized() {
        byte b10 = this.f140127d;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f140127d = 1;
        return true;
    }

    public String q(int i10) {
        return (String) this.f140126c.get(i10);
    }

    public C17209t r() {
        return this.f140126c;
    }

    /* renamed from: v */
    public b newBuilderForType() {
        return t();
    }

    /* renamed from: w */
    public b toBuilder() {
        return u(this);
    }

    private p(C17198i.b bVar) {
        super(bVar);
        this.f140127d = -1;
        this.f140128e = -1;
        this.f140125b = bVar.e();
    }

    private p(boolean z10) {
        this.f140127d = -1;
        this.f140128e = -1;
        this.f140125b = C17193d.f143014a;
    }

    private p(C17194e eVar, C17196g gVar) {
        this.f140127d = -1;
        this.f140128e = -1;
        s();
        C17193d.b B10 = C17193d.B();
        C17195f J10 = C17195f.J(B10, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                int K10 = eVar.K();
                if (K10 != 0) {
                    if (K10 == 10) {
                        C17193d l10 = eVar.l();
                        if (!z11) {
                            this.f140126c = new C17203n();
                            z11 = true;
                        }
                        this.f140126c.h1(l10);
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
                    this.f140126c = this.f140126c.w();
                }
                try {
                    J10.I();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f140125b = B10.g();
                    throw th3;
                }
                this.f140125b = B10.g();
                h();
                throw th2;
            }
        }
        if (z11) {
            this.f140126c = this.f140126c.w();
        }
        try {
            J10.I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f140125b = B10.g();
            throw th4;
        }
        this.f140125b = B10.g();
        h();
    }
}

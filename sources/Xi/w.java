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

public final class w extends C17198i implements C17207r {

    /* renamed from: f  reason: collision with root package name */
    private static final w f140273f;

    /* renamed from: g  reason: collision with root package name */
    public static C17208s<w> f140274g = new a();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C17193d f140275b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public List<v> f140276c;

    /* renamed from: d  reason: collision with root package name */
    private byte f140277d;

    /* renamed from: e  reason: collision with root package name */
    private int f140278e;

    static class a extends C17191b<w> {
        a() {
        }

        /* renamed from: m */
        public w c(C17194e eVar, C17196g gVar) {
            return new w(eVar, gVar);
        }
    }

    public static final class b extends C17198i.b<w, b> implements C17207r {

        /* renamed from: b  reason: collision with root package name */
        private int f140279b;

        /* renamed from: c  reason: collision with root package name */
        private List<v> f140280c = Collections.emptyList();

        private b() {
            r();
        }

        /* access modifiers changed from: private */
        public static b o() {
            return new b();
        }

        private void p() {
            if ((this.f140279b & 1) != 1) {
                this.f140280c = new ArrayList(this.f140280c);
                this.f140279b |= 1;
            }
        }

        private void r() {
        }

        /* renamed from: l */
        public w g() {
            w m10 = m();
            if (m10.isInitialized()) {
                return m10;
            }
            throw C17190a.C3485a.c(m10);
        }

        public w m() {
            w wVar = new w((C17198i.b) this);
            if ((this.f140279b & 1) == 1) {
                this.f140280c = Collections.unmodifiableList(this.f140280c);
                this.f140279b &= -2;
            }
            List unused = wVar.f140276c = this.f140280c;
            return wVar;
        }

        /* renamed from: n */
        public b d() {
            return o().f(m());
        }

        /* renamed from: u */
        public b f(w wVar) {
            if (wVar == w.p()) {
                return this;
            }
            if (!wVar.f140276c.isEmpty()) {
                if (this.f140280c.isEmpty()) {
                    this.f140280c = wVar.f140276c;
                    this.f140279b &= -2;
                } else {
                    p();
                    this.f140280c.addAll(wVar.f140276c);
                }
            }
            j(e().i(wVar.f140275b));
            return this;
        }

        /* renamed from: v */
        public b o1(C17194e eVar, C17196g gVar) {
            w wVar;
            w wVar2 = null;
            try {
                w c10 = w.f140274g.c(eVar, gVar);
                if (c10 != null) {
                    f(c10);
                }
                return this;
            } catch (C17200k e10) {
                wVar = (w) e10.a();
                throw e10;
            } catch (Throwable th2) {
                th = th2;
                wVar2 = wVar;
            }
            if (wVar2 != null) {
                f(wVar2);
            }
            throw th;
        }
    }

    static {
        w wVar = new w(true);
        f140273f = wVar;
        wVar.s();
    }

    public static w p() {
        return f140273f;
    }

    private void s() {
        this.f140276c = Collections.emptyList();
    }

    public static b t() {
        return b.o();
    }

    public static b u(w wVar) {
        return t().f(wVar);
    }

    public void a(C17195f fVar) {
        getSerializedSize();
        for (int i10 = 0; i10 < this.f140276c.size(); i10++) {
            fVar.d0(1, this.f140276c.get(i10));
        }
        fVar.i0(this.f140275b);
    }

    public C17208s<w> getParserForType() {
        return f140274g;
    }

    public int getSerializedSize() {
        int i10 = this.f140278e;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f140276c.size(); i12++) {
            i11 += C17195f.s(1, this.f140276c.get(i12));
        }
        int size = i11 + this.f140275b.size();
        this.f140278e = size;
        return size;
    }

    public final boolean isInitialized() {
        byte b10 = this.f140277d;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f140277d = 1;
        return true;
    }

    public int q() {
        return this.f140276c.size();
    }

    public List<v> r() {
        return this.f140276c;
    }

    /* renamed from: v */
    public b newBuilderForType() {
        return t();
    }

    /* renamed from: w */
    public b toBuilder() {
        return u(this);
    }

    private w(C17198i.b bVar) {
        super(bVar);
        this.f140277d = -1;
        this.f140278e = -1;
        this.f140275b = bVar.e();
    }

    private w(boolean z10) {
        this.f140277d = -1;
        this.f140278e = -1;
        this.f140275b = C17193d.f143014a;
    }

    private w(C17194e eVar, C17196g gVar) {
        this.f140277d = -1;
        this.f140278e = -1;
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
                        if (!z11) {
                            this.f140276c = new ArrayList();
                            z11 = true;
                        }
                        this.f140276c.add(eVar.u(v.f140255m, gVar));
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
                    this.f140276c = Collections.unmodifiableList(this.f140276c);
                }
                try {
                    J10.I();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f140275b = B10.g();
                    throw th3;
                }
                this.f140275b = B10.g();
                h();
                throw th2;
            }
        }
        if (z11) {
            this.f140276c = Collections.unmodifiableList(this.f140276c);
        }
        try {
            J10.I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f140275b = B10.g();
            throw th4;
        }
        this.f140275b = B10.g();
        h();
    }
}

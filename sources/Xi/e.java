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

public final class e extends C17198i implements C17207r {

    /* renamed from: f  reason: collision with root package name */
    private static final e f139945f;

    /* renamed from: g  reason: collision with root package name */
    public static C17208s<e> f139946g = new a();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C17193d f139947b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public List<f> f139948c;

    /* renamed from: d  reason: collision with root package name */
    private byte f139949d;

    /* renamed from: e  reason: collision with root package name */
    private int f139950e;

    static class a extends C17191b<e> {
        a() {
        }

        /* renamed from: m */
        public e c(C17194e eVar, C17196g gVar) {
            return new e(eVar, gVar);
        }
    }

    public static final class b extends C17198i.b<e, b> implements C17207r {

        /* renamed from: b  reason: collision with root package name */
        private int f139951b;

        /* renamed from: c  reason: collision with root package name */
        private List<f> f139952c = Collections.emptyList();

        private b() {
            r();
        }

        /* access modifiers changed from: private */
        public static b o() {
            return new b();
        }

        private void p() {
            if ((this.f139951b & 1) != 1) {
                this.f139952c = new ArrayList(this.f139952c);
                this.f139951b |= 1;
            }
        }

        private void r() {
        }

        /* renamed from: l */
        public e g() {
            e m10 = m();
            if (m10.isInitialized()) {
                return m10;
            }
            throw C17190a.C3485a.c(m10);
        }

        public e m() {
            e eVar = new e((C17198i.b) this);
            if ((this.f139951b & 1) == 1) {
                this.f139952c = Collections.unmodifiableList(this.f139952c);
                this.f139951b &= -2;
            }
            List unused = eVar.f139948c = this.f139952c;
            return eVar;
        }

        /* renamed from: n */
        public b d() {
            return o().f(m());
        }

        /* renamed from: u */
        public b f(e eVar) {
            if (eVar == e.p()) {
                return this;
            }
            if (!eVar.f139948c.isEmpty()) {
                if (this.f139952c.isEmpty()) {
                    this.f139952c = eVar.f139948c;
                    this.f139951b &= -2;
                } else {
                    p();
                    this.f139952c.addAll(eVar.f139948c);
                }
            }
            j(e().i(eVar.f139947b));
            return this;
        }

        /* renamed from: v */
        public b o1(C17194e eVar, C17196g gVar) {
            e eVar2;
            e eVar3 = null;
            try {
                e c10 = e.f139946g.c(eVar, gVar);
                if (c10 != null) {
                    f(c10);
                }
                return this;
            } catch (C17200k e10) {
                eVar2 = (e) e10.a();
                throw e10;
            } catch (Throwable th2) {
                th = th2;
                eVar3 = eVar2;
            }
            if (eVar3 != null) {
                f(eVar3);
            }
            throw th;
        }
    }

    static {
        e eVar = new e(true);
        f139945f = eVar;
        eVar.s();
    }

    public static e p() {
        return f139945f;
    }

    private void s() {
        this.f139948c = Collections.emptyList();
    }

    public static b t() {
        return b.o();
    }

    public static b u(e eVar) {
        return t().f(eVar);
    }

    public void a(C17195f fVar) {
        getSerializedSize();
        for (int i10 = 0; i10 < this.f139948c.size(); i10++) {
            fVar.d0(1, this.f139948c.get(i10));
        }
        fVar.i0(this.f139947b);
    }

    public C17208s<e> getParserForType() {
        return f139946g;
    }

    public int getSerializedSize() {
        int i10 = this.f139950e;
        if (i10 != -1) {
            return i10;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f139948c.size(); i12++) {
            i11 += C17195f.s(1, this.f139948c.get(i12));
        }
        int size = i11 + this.f139947b.size();
        this.f139950e = size;
        return size;
    }

    public final boolean isInitialized() {
        byte b10 = this.f139949d;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < r(); i10++) {
            if (!q(i10).isInitialized()) {
                this.f139949d = 0;
                return false;
            }
        }
        this.f139949d = 1;
        return true;
    }

    public f q(int i10) {
        return this.f139948c.get(i10);
    }

    public int r() {
        return this.f139948c.size();
    }

    /* renamed from: v */
    public b newBuilderForType() {
        return t();
    }

    /* renamed from: w */
    public b toBuilder() {
        return u(this);
    }

    private e(C17198i.b bVar) {
        super(bVar);
        this.f139949d = -1;
        this.f139950e = -1;
        this.f139947b = bVar.e();
    }

    private e(boolean z10) {
        this.f139949d = -1;
        this.f139950e = -1;
        this.f139947b = C17193d.f143014a;
    }

    private e(C17194e eVar, C17196g gVar) {
        this.f139949d = -1;
        this.f139950e = -1;
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
                            this.f139948c = new ArrayList();
                            z11 = true;
                        }
                        this.f139948c.add(eVar.u(f.f139954k, gVar));
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
                    this.f139948c = Collections.unmodifiableList(this.f139948c);
                }
                try {
                    J10.I();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f139947b = B10.g();
                    throw th3;
                }
                this.f139947b = B10.g();
                h();
                throw th2;
            }
        }
        if (z11) {
            this.f139948c = Collections.unmodifiableList(this.f139948c);
        }
        try {
            J10.I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f139947b = B10.g();
            throw th4;
        }
        this.f139947b = B10.g();
        h();
    }
}

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

/* renamed from: XI.d  reason: case insensitive filesystem */
public final class C16831d extends C17198i.d<C16831d> implements C17207r {

    /* renamed from: j  reason: collision with root package name */
    private static final C16831d f139932j;

    /* renamed from: k  reason: collision with root package name */
    public static C17208s<C16831d> f139933k = new a();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final C17193d f139934c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public int f139935d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public int f139936e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public List<u> f139937f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public List<Integer> f139938g;

    /* renamed from: h  reason: collision with root package name */
    private byte f139939h;

    /* renamed from: i  reason: collision with root package name */
    private int f139940i;

    /* renamed from: XI.d$a */
    static class a extends C17191b<C16831d> {
        a() {
        }

        /* renamed from: m */
        public C16831d c(C17194e eVar, C17196g gVar) {
            return new C16831d(eVar, gVar);
        }
    }

    /* renamed from: XI.d$b */
    public static final class b extends C17198i.c<C16831d, b> implements C17207r {

        /* renamed from: d  reason: collision with root package name */
        private int f139941d;

        /* renamed from: e  reason: collision with root package name */
        private int f139942e = 6;

        /* renamed from: f  reason: collision with root package name */
        private List<u> f139943f = Collections.emptyList();

        /* renamed from: g  reason: collision with root package name */
        private List<Integer> f139944g = Collections.emptyList();

        private b() {
            z();
        }

        /* access modifiers changed from: private */
        public static b v() {
            return new b();
        }

        private void w() {
            if ((this.f139941d & 2) != 2) {
                this.f139943f = new ArrayList(this.f139943f);
                this.f139941d |= 2;
            }
        }

        private void y() {
            if ((this.f139941d & 4) != 4) {
                this.f139944g = new ArrayList(this.f139944g);
                this.f139941d |= 4;
            }
        }

        private void z() {
        }

        /* renamed from: A */
        public b f(C16831d dVar) {
            if (dVar == C16831d.C()) {
                return this;
            }
            if (dVar.J()) {
                D(dVar.E());
            }
            if (!dVar.f139937f.isEmpty()) {
                if (this.f139943f.isEmpty()) {
                    this.f139943f = dVar.f139937f;
                    this.f139941d &= -3;
                } else {
                    w();
                    this.f139943f.addAll(dVar.f139937f);
                }
            }
            if (!dVar.f139938g.isEmpty()) {
                if (this.f139944g.isEmpty()) {
                    this.f139944g = dVar.f139938g;
                    this.f139941d &= -5;
                } else {
                    y();
                    this.f139944g.addAll(dVar.f139938g);
                }
            }
            n(dVar);
            j(e().i(dVar.f139934c));
            return this;
        }

        /* renamed from: C */
        public b o1(C17194e eVar, C17196g gVar) {
            C16831d dVar;
            C16831d dVar2 = null;
            try {
                C16831d c10 = C16831d.f139933k.c(eVar, gVar);
                if (c10 != null) {
                    f(c10);
                }
                return this;
            } catch (C17200k e10) {
                dVar = (C16831d) e10.a();
                throw e10;
            } catch (Throwable th2) {
                th = th2;
                dVar2 = dVar;
            }
            if (dVar2 != null) {
                f(dVar2);
            }
            throw th;
        }

        public b D(int i10) {
            this.f139941d |= 1;
            this.f139942e = i10;
            return this;
        }

        /* renamed from: p */
        public C16831d g() {
            C16831d r10 = r();
            if (r10.isInitialized()) {
                return r10;
            }
            throw C17190a.C3485a.c(r10);
        }

        public C16831d r() {
            C16831d dVar = new C16831d((C17198i.c) this);
            int i10 = 1;
            if ((this.f139941d & 1) != 1) {
                i10 = 0;
            }
            int unused = dVar.f139936e = this.f139942e;
            if ((this.f139941d & 2) == 2) {
                this.f139943f = Collections.unmodifiableList(this.f139943f);
                this.f139941d &= -3;
            }
            List unused2 = dVar.f139937f = this.f139943f;
            if ((this.f139941d & 4) == 4) {
                this.f139944g = Collections.unmodifiableList(this.f139944g);
                this.f139941d &= -5;
            }
            List unused3 = dVar.f139938g = this.f139944g;
            int unused4 = dVar.f139935d = i10;
            return dVar;
        }

        /* renamed from: u */
        public b d() {
            return v().f(r());
        }
    }

    static {
        C16831d dVar = new C16831d(true);
        f139932j = dVar;
        dVar.K();
    }

    public static C16831d C() {
        return f139932j;
    }

    private void K() {
        this.f139936e = 6;
        this.f139937f = Collections.emptyList();
        this.f139938g = Collections.emptyList();
    }

    public static b L() {
        return b.v();
    }

    public static b M(C16831d dVar) {
        return L().f(dVar);
    }

    /* renamed from: D */
    public C16831d getDefaultInstanceForType() {
        return f139932j;
    }

    public int E() {
        return this.f139936e;
    }

    public u F(int i10) {
        return this.f139937f.get(i10);
    }

    public int G() {
        return this.f139937f.size();
    }

    public List<u> H() {
        return this.f139937f;
    }

    public List<Integer> I() {
        return this.f139938g;
    }

    public boolean J() {
        return (this.f139935d & 1) == 1;
    }

    /* renamed from: N */
    public b newBuilderForType() {
        return L();
    }

    /* renamed from: O */
    public b toBuilder() {
        return M(this);
    }

    public void a(C17195f fVar) {
        getSerializedSize();
        C17198i.d<MessageType>.defpackage.a t10 = t();
        if ((this.f139935d & 1) == 1) {
            fVar.a0(1, this.f139936e);
        }
        for (int i10 = 0; i10 < this.f139937f.size(); i10++) {
            fVar.d0(2, this.f139937f.get(i10));
        }
        for (int i11 = 0; i11 < this.f139938g.size(); i11++) {
            fVar.a0(31, this.f139938g.get(i11).intValue());
        }
        t10.a(19000, fVar);
        fVar.i0(this.f139934c);
    }

    public C17208s<C16831d> getParserForType() {
        return f139933k;
    }

    public int getSerializedSize() {
        int i10 = this.f139940i;
        if (i10 != -1) {
            return i10;
        }
        int o10 = (this.f139935d & 1) == 1 ? C17195f.o(1, this.f139936e) : 0;
        for (int i11 = 0; i11 < this.f139937f.size(); i11++) {
            o10 += C17195f.s(2, this.f139937f.get(i11));
        }
        int i12 = 0;
        for (int i13 = 0; i13 < this.f139938g.size(); i13++) {
            i12 += C17195f.p(this.f139938g.get(i13).intValue());
        }
        int size = o10 + i12 + (I().size() * 2) + o() + this.f139934c.size();
        this.f139940i = size;
        return size;
    }

    public final boolean isInitialized() {
        byte b10 = this.f139939h;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < G(); i10++) {
            if (!F(i10).isInitialized()) {
                this.f139939h = 0;
                return false;
            }
        }
        if (!n()) {
            this.f139939h = 0;
            return false;
        }
        this.f139939h = 1;
        return true;
    }

    private C16831d(C17198i.c<C16831d, ?> cVar) {
        super(cVar);
        this.f139939h = -1;
        this.f139940i = -1;
        this.f139934c = cVar.e();
    }

    private C16831d(boolean z10) {
        this.f139939h = -1;
        this.f139940i = -1;
        this.f139934c = C17193d.f143014a;
    }

    private C16831d(C17194e eVar, C17196g gVar) {
        this.f139939h = -1;
        this.f139940i = -1;
        K();
        C17193d.b B10 = C17193d.B();
        C17195f J10 = C17195f.J(B10, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                int K10 = eVar.K();
                if (K10 != 0) {
                    if (K10 == 8) {
                        this.f139935d |= 1;
                        this.f139936e = eVar.s();
                    } else if (K10 == 18) {
                        if (!(z11 & true)) {
                            this.f139937f = new ArrayList();
                            z11 |= true;
                        }
                        this.f139937f.add(eVar.u(u.f140236n, gVar));
                    } else if (K10 == 248) {
                        if (!(z11 & true)) {
                            this.f139938g = new ArrayList();
                            z11 |= true;
                        }
                        this.f139938g.add(Integer.valueOf(eVar.s()));
                    } else if (K10 == 250) {
                        int j10 = eVar.j(eVar.A());
                        if (!(z11 & true) && eVar.e() > 0) {
                            this.f139938g = new ArrayList();
                            z11 |= true;
                        }
                        while (eVar.e() > 0) {
                            this.f139938g.add(Integer.valueOf(eVar.s()));
                        }
                        eVar.i(j10);
                    } else if (k(eVar, J10, gVar, K10)) {
                    }
                }
                z10 = true;
            } catch (C17200k e10) {
                throw e10.i(this);
            } catch (IOException e11) {
                throw new C17200k(e11.getMessage()).i(this);
            } catch (Throwable th2) {
                if (z11 & true) {
                    this.f139937f = Collections.unmodifiableList(this.f139937f);
                }
                if (z11 & true) {
                    this.f139938g = Collections.unmodifiableList(this.f139938g);
                }
                try {
                    J10.I();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f139934c = B10.g();
                    throw th3;
                }
                this.f139934c = B10.g();
                h();
                throw th2;
            }
        }
        if (z11 & true) {
            this.f139937f = Collections.unmodifiableList(this.f139937f);
        }
        if (z11 & true) {
            this.f139938g = Collections.unmodifiableList(this.f139938g);
        }
        try {
            J10.I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f139934c = B10.g();
            throw th4;
        }
        this.f139934c = B10.g();
        h();
    }
}

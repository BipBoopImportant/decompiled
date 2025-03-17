package XI;

import XI.h;
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

public final class f extends C17198i implements C17207r {

    /* renamed from: j  reason: collision with root package name */
    private static final f f139953j;

    /* renamed from: k  reason: collision with root package name */
    public static C17208s<f> f139954k = new a();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final C17193d f139955b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public int f139956c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public c f139957d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public List<h> f139958e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public h f139959f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public d f139960g;

    /* renamed from: h  reason: collision with root package name */
    private byte f139961h;

    /* renamed from: i  reason: collision with root package name */
    private int f139962i;

    static class a extends C17191b<f> {
        a() {
        }

        /* renamed from: m */
        public f c(C17194e eVar, C17196g gVar) {
            return new f(eVar, gVar);
        }
    }

    public static final class b extends C17198i.b<f, b> implements C17207r {

        /* renamed from: b  reason: collision with root package name */
        private int f139963b;

        /* renamed from: c  reason: collision with root package name */
        private c f139964c = c.RETURNS_CONSTANT;

        /* renamed from: d  reason: collision with root package name */
        private List<h> f139965d = Collections.emptyList();

        /* renamed from: e  reason: collision with root package name */
        private h f139966e = h.A();

        /* renamed from: f  reason: collision with root package name */
        private d f139967f = d.AT_MOST_ONCE;

        private b() {
            r();
        }

        /* access modifiers changed from: private */
        public static b o() {
            return new b();
        }

        private void p() {
            if ((this.f139963b & 2) != 2) {
                this.f139965d = new ArrayList(this.f139965d);
                this.f139963b |= 2;
            }
        }

        private void r() {
        }

        /* renamed from: l */
        public f g() {
            f m10 = m();
            if (m10.isInitialized()) {
                return m10;
            }
            throw C17190a.C3485a.c(m10);
        }

        public f m() {
            f fVar = new f((C17198i.b) this);
            int i10 = this.f139963b;
            int i11 = 1;
            if ((i10 & 1) != 1) {
                i11 = 0;
            }
            c unused = fVar.f139957d = this.f139964c;
            if ((this.f139963b & 2) == 2) {
                this.f139965d = Collections.unmodifiableList(this.f139965d);
                this.f139963b &= -3;
            }
            List unused2 = fVar.f139958e = this.f139965d;
            if ((i10 & 4) == 4) {
                i11 |= 2;
            }
            h unused3 = fVar.f139959f = this.f139966e;
            if ((i10 & 8) == 8) {
                i11 |= 4;
            }
            d unused4 = fVar.f139960g = this.f139967f;
            int unused5 = fVar.f139956c = i11;
            return fVar;
        }

        /* renamed from: n */
        public b d() {
            return o().f(m());
        }

        public b u(h hVar) {
            if ((this.f139963b & 4) != 4 || this.f139966e == h.A()) {
                this.f139966e = hVar;
            } else {
                this.f139966e = h.O(this.f139966e).f(hVar).m();
            }
            this.f139963b |= 4;
            return this;
        }

        /* renamed from: v */
        public b f(f fVar) {
            if (fVar == f.u()) {
                return this;
            }
            if (fVar.A()) {
                y(fVar.x());
            }
            if (!fVar.f139958e.isEmpty()) {
                if (this.f139965d.isEmpty()) {
                    this.f139965d = fVar.f139958e;
                    this.f139963b &= -3;
                } else {
                    p();
                    this.f139965d.addAll(fVar.f139958e);
                }
            }
            if (fVar.z()) {
                u(fVar.t());
            }
            if (fVar.B()) {
                z(fVar.y());
            }
            j(e().i(fVar.f139955b));
            return this;
        }

        /* renamed from: w */
        public b o1(C17194e eVar, C17196g gVar) {
            f fVar;
            f fVar2 = null;
            try {
                f c10 = f.f139954k.c(eVar, gVar);
                if (c10 != null) {
                    f(c10);
                }
                return this;
            } catch (C17200k e10) {
                fVar = (f) e10.a();
                throw e10;
            } catch (Throwable th2) {
                th = th2;
                fVar2 = fVar;
            }
            if (fVar2 != null) {
                f(fVar2);
            }
            throw th;
        }

        public b y(c cVar) {
            cVar.getClass();
            this.f139963b |= 1;
            this.f139964c = cVar;
            return this;
        }

        public b z(d dVar) {
            dVar.getClass();
            this.f139963b |= 8;
            this.f139967f = dVar;
            return this;
        }
    }

    public enum c implements C17199j.a {
        RETURNS_CONSTANT(0, 0),
        CALLS(1, 1),
        RETURNS_NOT_NULL(2, 2);
        
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
                return RETURNS_CONSTANT;
            }
            if (i10 == 1) {
                return CALLS;
            }
            if (i10 != 2) {
                return null;
            }
            return RETURNS_NOT_NULL;
        }

        public final int d() {
            return this.value;
        }
    }

    public enum d implements C17199j.a {
        AT_MOST_ONCE(0, 0),
        EXACTLY_ONCE(1, 1),
        AT_LEAST_ONCE(2, 2);
        
        private static C17199j.b<d> internalValueMap;
        private final int value;

        static class a implements C17199j.b<d> {
            a() {
            }

            /* renamed from: b */
            public d a(int i10) {
                return d.a(i10);
            }
        }

        static {
            internalValueMap = new a();
        }

        private d(int i10, int i11) {
            this.value = i11;
        }

        public static d a(int i10) {
            if (i10 == 0) {
                return AT_MOST_ONCE;
            }
            if (i10 == 1) {
                return EXACTLY_ONCE;
            }
            if (i10 != 2) {
                return null;
            }
            return AT_LEAST_ONCE;
        }

        public final int d() {
            return this.value;
        }
    }

    static {
        f fVar = new f(true);
        f139953j = fVar;
        fVar.C();
    }

    private void C() {
        this.f139957d = c.RETURNS_CONSTANT;
        this.f139958e = Collections.emptyList();
        this.f139959f = h.A();
        this.f139960g = d.AT_MOST_ONCE;
    }

    public static b D() {
        return b.o();
    }

    public static b E(f fVar) {
        return D().f(fVar);
    }

    public static f u() {
        return f139953j;
    }

    public boolean A() {
        return (this.f139956c & 1) == 1;
    }

    public boolean B() {
        return (this.f139956c & 4) == 4;
    }

    /* renamed from: F */
    public b newBuilderForType() {
        return D();
    }

    /* renamed from: G */
    public b toBuilder() {
        return E(this);
    }

    public void a(C17195f fVar) {
        getSerializedSize();
        if ((this.f139956c & 1) == 1) {
            fVar.S(1, this.f139957d.d());
        }
        for (int i10 = 0; i10 < this.f139958e.size(); i10++) {
            fVar.d0(2, this.f139958e.get(i10));
        }
        if ((this.f139956c & 2) == 2) {
            fVar.d0(3, this.f139959f);
        }
        if ((this.f139956c & 4) == 4) {
            fVar.S(4, this.f139960g.d());
        }
        fVar.i0(this.f139955b);
    }

    public C17208s<f> getParserForType() {
        return f139954k;
    }

    public int getSerializedSize() {
        int i10 = this.f139962i;
        if (i10 != -1) {
            return i10;
        }
        int h10 = (this.f139956c & 1) == 1 ? C17195f.h(1, this.f139957d.d()) : 0;
        for (int i11 = 0; i11 < this.f139958e.size(); i11++) {
            h10 += C17195f.s(2, this.f139958e.get(i11));
        }
        if ((this.f139956c & 2) == 2) {
            h10 += C17195f.s(3, this.f139959f);
        }
        if ((this.f139956c & 4) == 4) {
            h10 += C17195f.h(4, this.f139960g.d());
        }
        int size = h10 + this.f139955b.size();
        this.f139962i = size;
        return size;
    }

    public final boolean isInitialized() {
        byte b10 = this.f139961h;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < w(); i10++) {
            if (!v(i10).isInitialized()) {
                this.f139961h = 0;
                return false;
            }
        }
        if (!z() || t().isInitialized()) {
            this.f139961h = 1;
            return true;
        }
        this.f139961h = 0;
        return false;
    }

    public h t() {
        return this.f139959f;
    }

    public h v(int i10) {
        return this.f139958e.get(i10);
    }

    public int w() {
        return this.f139958e.size();
    }

    public c x() {
        return this.f139957d;
    }

    public d y() {
        return this.f139960g;
    }

    public boolean z() {
        return (this.f139956c & 2) == 2;
    }

    private f(C17198i.b bVar) {
        super(bVar);
        this.f139961h = -1;
        this.f139962i = -1;
        this.f139955b = bVar.e();
    }

    private f(boolean z10) {
        this.f139961h = -1;
        this.f139962i = -1;
        this.f139955b = C17193d.f143014a;
    }

    private f(C17194e eVar, C17196g gVar) {
        this.f139961h = -1;
        this.f139962i = -1;
        C();
        C17193d.b B10 = C17193d.B();
        C17195f J10 = C17195f.J(B10, 1);
        boolean z10 = false;
        boolean z11 = false;
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
                            this.f139956c |= 1;
                            this.f139957d = a10;
                        }
                    } else if (K10 == 18) {
                        if (!(z11 & true)) {
                            this.f139958e = new ArrayList();
                            z11 = true;
                        }
                        this.f139958e.add(eVar.u(h.f139978n, gVar));
                    } else if (K10 == 26) {
                        h.b Q10 = (this.f139956c & 2) == 2 ? this.f139959f.toBuilder() : null;
                        h hVar = (h) eVar.u(h.f139978n, gVar);
                        this.f139959f = hVar;
                        if (Q10 != null) {
                            Q10.f(hVar);
                            this.f139959f = Q10.m();
                        }
                        this.f139956c |= 2;
                    } else if (K10 == 32) {
                        int n11 = eVar.n();
                        d a11 = d.a(n11);
                        if (a11 == null) {
                            J10.o0(K10);
                            J10.o0(n11);
                        } else {
                            this.f139956c |= 4;
                            this.f139960g = a11;
                        }
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
                    this.f139958e = Collections.unmodifiableList(this.f139958e);
                }
                try {
                    J10.I();
                } catch (IOException unused) {
                } catch (Throwable th3) {
                    this.f139955b = B10.g();
                    throw th3;
                }
                this.f139955b = B10.g();
                h();
                throw th2;
            }
        }
        if (z11 & true) {
            this.f139958e = Collections.unmodifiableList(this.f139958e);
        }
        try {
            J10.I();
        } catch (IOException unused2) {
        } catch (Throwable th4) {
            this.f139955b = B10.g();
            throw th4;
        }
        this.f139955b = B10.g();
        h();
    }
}

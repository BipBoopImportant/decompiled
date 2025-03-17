package Tb;

import Tb.F;
import java.util.List;

final class m extends F.e.d.a {

    /* renamed from: a  reason: collision with root package name */
    private final F.e.d.a.b f63740a;

    /* renamed from: b  reason: collision with root package name */
    private final List<F.c> f63741b;

    /* renamed from: c  reason: collision with root package name */
    private final List<F.c> f63742c;

    /* renamed from: d  reason: collision with root package name */
    private final Boolean f63743d;

    /* renamed from: e  reason: collision with root package name */
    private final F.e.d.a.c f63744e;

    /* renamed from: f  reason: collision with root package name */
    private final List<F.e.d.a.c> f63745f;

    /* renamed from: g  reason: collision with root package name */
    private final int f63746g;

    static final class b extends F.e.d.a.C1096a {

        /* renamed from: a  reason: collision with root package name */
        private F.e.d.a.b f63747a;

        /* renamed from: b  reason: collision with root package name */
        private List<F.c> f63748b;

        /* renamed from: c  reason: collision with root package name */
        private List<F.c> f63749c;

        /* renamed from: d  reason: collision with root package name */
        private Boolean f63750d;

        /* renamed from: e  reason: collision with root package name */
        private F.e.d.a.c f63751e;

        /* renamed from: f  reason: collision with root package name */
        private List<F.e.d.a.c> f63752f;

        /* renamed from: g  reason: collision with root package name */
        private int f63753g;

        /* renamed from: h  reason: collision with root package name */
        private byte f63754h;

        public F.e.d.a a() {
            F.e.d.a.b bVar;
            if (this.f63754h == 1 && (bVar = this.f63747a) != null) {
                return new m(bVar, this.f63748b, this.f63749c, this.f63750d, this.f63751e, this.f63752f, this.f63753g);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f63747a == null) {
                sb2.append(" execution");
            }
            if ((1 & this.f63754h) == 0) {
                sb2.append(" uiOrientation");
            }
            throw new IllegalStateException("Missing required properties:" + sb2);
        }

        public F.e.d.a.C1096a b(List<F.e.d.a.c> list) {
            this.f63752f = list;
            return this;
        }

        public F.e.d.a.C1096a c(Boolean bool) {
            this.f63750d = bool;
            return this;
        }

        public F.e.d.a.C1096a d(F.e.d.a.c cVar) {
            this.f63751e = cVar;
            return this;
        }

        public F.e.d.a.C1096a e(List<F.c> list) {
            this.f63748b = list;
            return this;
        }

        public F.e.d.a.C1096a f(F.e.d.a.b bVar) {
            if (bVar != null) {
                this.f63747a = bVar;
                return this;
            }
            throw new NullPointerException("Null execution");
        }

        public F.e.d.a.C1096a g(List<F.c> list) {
            this.f63749c = list;
            return this;
        }

        public F.e.d.a.C1096a h(int i10) {
            this.f63753g = i10;
            this.f63754h = (byte) (this.f63754h | 1);
            return this;
        }

        b() {
        }

        private b(F.e.d.a aVar) {
            this.f63747a = aVar.f();
            this.f63748b = aVar.e();
            this.f63749c = aVar.g();
            this.f63750d = aVar.c();
            this.f63751e = aVar.d();
            this.f63752f = aVar.b();
            this.f63753g = aVar.h();
            this.f63754h = 1;
        }
    }

    public List<F.e.d.a.c> b() {
        return this.f63745f;
    }

    public Boolean c() {
        return this.f63743d;
    }

    public F.e.d.a.c d() {
        return this.f63744e;
    }

    public List<F.c> e() {
        return this.f63741b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002c, code lost:
        r1 = r4.f63742c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0041, code lost:
        r1 = r4.f63743d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0056, code lost:
        r1 = r4.f63744e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x006b, code lost:
        r1 = r4.f63745f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.f63741b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof Tb.F.e.d.a
            r2 = 0
            if (r1 == 0) goto L_0x008b
            Tb.F$e$d$a r5 = (Tb.F.e.d.a) r5
            Tb.F$e$d$a$b r1 = r4.f63740a
            Tb.F$e$d$a$b r3 = r5.f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0089
            java.util.List<Tb.F$c> r1 = r4.f63741b
            if (r1 != 0) goto L_0x0022
            java.util.List r1 = r5.e()
            if (r1 != 0) goto L_0x0089
            goto L_0x002c
        L_0x0022:
            java.util.List r3 = r5.e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0089
        L_0x002c:
            java.util.List<Tb.F$c> r1 = r4.f63742c
            if (r1 != 0) goto L_0x0037
            java.util.List r1 = r5.g()
            if (r1 != 0) goto L_0x0089
            goto L_0x0041
        L_0x0037:
            java.util.List r3 = r5.g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0089
        L_0x0041:
            java.lang.Boolean r1 = r4.f63743d
            if (r1 != 0) goto L_0x004c
            java.lang.Boolean r1 = r5.c()
            if (r1 != 0) goto L_0x0089
            goto L_0x0056
        L_0x004c:
            java.lang.Boolean r3 = r5.c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0089
        L_0x0056:
            Tb.F$e$d$a$c r1 = r4.f63744e
            if (r1 != 0) goto L_0x0061
            Tb.F$e$d$a$c r1 = r5.d()
            if (r1 != 0) goto L_0x0089
            goto L_0x006b
        L_0x0061:
            Tb.F$e$d$a$c r3 = r5.d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0089
        L_0x006b:
            java.util.List<Tb.F$e$d$a$c> r1 = r4.f63745f
            if (r1 != 0) goto L_0x0076
            java.util.List r1 = r5.b()
            if (r1 != 0) goto L_0x0089
            goto L_0x0080
        L_0x0076:
            java.util.List r3 = r5.b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0089
        L_0x0080:
            int r1 = r4.f63746g
            int r5 = r5.h()
            if (r1 != r5) goto L_0x0089
            goto L_0x008a
        L_0x0089:
            r0 = r2
        L_0x008a:
            return r0
        L_0x008b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Tb.m.equals(java.lang.Object):boolean");
    }

    public F.e.d.a.b f() {
        return this.f63740a;
    }

    public List<F.c> g() {
        return this.f63742c;
    }

    public int h() {
        return this.f63746g;
    }

    public int hashCode() {
        int hashCode = (this.f63740a.hashCode() ^ 1000003) * 1000003;
        List<F.c> list = this.f63741b;
        int i10 = 0;
        int hashCode2 = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List<F.c> list2 = this.f63742c;
        int hashCode3 = (hashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.f63743d;
        int hashCode4 = (hashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        F.e.d.a.c cVar = this.f63744e;
        int hashCode5 = (hashCode4 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        List<F.e.d.a.c> list3 = this.f63745f;
        if (list3 != null) {
            i10 = list3.hashCode();
        }
        return ((hashCode5 ^ i10) * 1000003) ^ this.f63746g;
    }

    public F.e.d.a.C1096a i() {
        return new b(this);
    }

    public String toString() {
        return "Application{execution=" + this.f63740a + ", customAttributes=" + this.f63741b + ", internalKeys=" + this.f63742c + ", background=" + this.f63743d + ", currentProcessDetails=" + this.f63744e + ", appProcessDetails=" + this.f63745f + ", uiOrientation=" + this.f63746g + "}";
    }

    private m(F.e.d.a.b bVar, List<F.c> list, List<F.c> list2, Boolean bool, F.e.d.a.c cVar, List<F.e.d.a.c> list3, int i10) {
        this.f63740a = bVar;
        this.f63741b = list;
        this.f63742c = list2;
        this.f63743d = bool;
        this.f63744e = cVar;
        this.f63745f = list3;
        this.f63746g = i10;
    }
}

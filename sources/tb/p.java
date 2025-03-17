package Tb;

import Tb.F;
import java.util.List;

final class p extends F.e.d.a.b.c {

    /* renamed from: a  reason: collision with root package name */
    private final String f63774a;

    /* renamed from: b  reason: collision with root package name */
    private final String f63775b;

    /* renamed from: c  reason: collision with root package name */
    private final List<F.e.d.a.b.C1103e.C1105b> f63776c;

    /* renamed from: d  reason: collision with root package name */
    private final F.e.d.a.b.c f63777d;

    /* renamed from: e  reason: collision with root package name */
    private final int f63778e;

    static final class b extends F.e.d.a.b.c.C1100a {

        /* renamed from: a  reason: collision with root package name */
        private String f63779a;

        /* renamed from: b  reason: collision with root package name */
        private String f63780b;

        /* renamed from: c  reason: collision with root package name */
        private List<F.e.d.a.b.C1103e.C1105b> f63781c;

        /* renamed from: d  reason: collision with root package name */
        private F.e.d.a.b.c f63782d;

        /* renamed from: e  reason: collision with root package name */
        private int f63783e;

        /* renamed from: f  reason: collision with root package name */
        private byte f63784f;

        b() {
        }

        public F.e.d.a.b.c a() {
            String str;
            List<F.e.d.a.b.C1103e.C1105b> list;
            if (this.f63784f == 1 && (str = this.f63779a) != null && (list = this.f63781c) != null) {
                return new p(str, this.f63780b, list, this.f63782d, this.f63783e);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f63779a == null) {
                sb2.append(" type");
            }
            if (this.f63781c == null) {
                sb2.append(" frames");
            }
            if ((1 & this.f63784f) == 0) {
                sb2.append(" overflowCount");
            }
            throw new IllegalStateException("Missing required properties:" + sb2);
        }

        public F.e.d.a.b.c.C1100a b(F.e.d.a.b.c cVar) {
            this.f63782d = cVar;
            return this;
        }

        public F.e.d.a.b.c.C1100a c(List<F.e.d.a.b.C1103e.C1105b> list) {
            if (list != null) {
                this.f63781c = list;
                return this;
            }
            throw new NullPointerException("Null frames");
        }

        public F.e.d.a.b.c.C1100a d(int i10) {
            this.f63783e = i10;
            this.f63784f = (byte) (this.f63784f | 1);
            return this;
        }

        public F.e.d.a.b.c.C1100a e(String str) {
            this.f63780b = str;
            return this;
        }

        public F.e.d.a.b.c.C1100a f(String str) {
            if (str != null) {
                this.f63779a = str;
                return this;
            }
            throw new NullPointerException("Null type");
        }
    }

    public F.e.d.a.b.c b() {
        return this.f63777d;
    }

    public List<F.e.d.a.b.C1103e.C1105b> c() {
        return this.f63776c;
    }

    public int d() {
        return this.f63778e;
    }

    public String e() {
        return this.f63775b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0038, code lost:
        r1 = r4.f63777d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r1 = r4.f63775b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof Tb.F.e.d.a.b.c
            r2 = 0
            if (r1 == 0) goto L_0x0058
            Tb.F$e$d$a$b$c r5 = (Tb.F.e.d.a.b.c) r5
            java.lang.String r1 = r4.f63774a
            java.lang.String r3 = r5.f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0056
            java.lang.String r1 = r4.f63775b
            if (r1 != 0) goto L_0x0022
            java.lang.String r1 = r5.e()
            if (r1 != 0) goto L_0x0056
            goto L_0x002c
        L_0x0022:
            java.lang.String r3 = r5.e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0056
        L_0x002c:
            java.util.List<Tb.F$e$d$a$b$e$b> r1 = r4.f63776c
            java.util.List r3 = r5.c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0056
            Tb.F$e$d$a$b$c r1 = r4.f63777d
            if (r1 != 0) goto L_0x0043
            Tb.F$e$d$a$b$c r1 = r5.b()
            if (r1 != 0) goto L_0x0056
            goto L_0x004d
        L_0x0043:
            Tb.F$e$d$a$b$c r3 = r5.b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0056
        L_0x004d:
            int r1 = r4.f63778e
            int r5 = r5.d()
            if (r1 != r5) goto L_0x0056
            goto L_0x0057
        L_0x0056:
            r0 = r2
        L_0x0057:
            return r0
        L_0x0058:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Tb.p.equals(java.lang.Object):boolean");
    }

    public String f() {
        return this.f63774a;
    }

    public int hashCode() {
        int hashCode = (this.f63774a.hashCode() ^ 1000003) * 1000003;
        String str = this.f63775b;
        int i10 = 0;
        int hashCode2 = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f63776c.hashCode()) * 1000003;
        F.e.d.a.b.c cVar = this.f63777d;
        if (cVar != null) {
            i10 = cVar.hashCode();
        }
        return ((hashCode2 ^ i10) * 1000003) ^ this.f63778e;
    }

    public String toString() {
        return "Exception{type=" + this.f63774a + ", reason=" + this.f63775b + ", frames=" + this.f63776c + ", causedBy=" + this.f63777d + ", overflowCount=" + this.f63778e + "}";
    }

    private p(String str, String str2, List<F.e.d.a.b.C1103e.C1105b> list, F.e.d.a.b.c cVar, int i10) {
        this.f63774a = str;
        this.f63775b = str2;
        this.f63776c = list;
        this.f63777d = cVar;
        this.f63778e = i10;
    }
}

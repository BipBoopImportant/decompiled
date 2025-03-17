package Tb;

import Tb.F;

final class s extends F.e.d.a.b.C1103e.C1105b {

    /* renamed from: a  reason: collision with root package name */
    private final long f63799a;

    /* renamed from: b  reason: collision with root package name */
    private final String f63800b;

    /* renamed from: c  reason: collision with root package name */
    private final String f63801c;

    /* renamed from: d  reason: collision with root package name */
    private final long f63802d;

    /* renamed from: e  reason: collision with root package name */
    private final int f63803e;

    static final class b extends F.e.d.a.b.C1103e.C1105b.C1106a {

        /* renamed from: a  reason: collision with root package name */
        private long f63804a;

        /* renamed from: b  reason: collision with root package name */
        private String f63805b;

        /* renamed from: c  reason: collision with root package name */
        private String f63806c;

        /* renamed from: d  reason: collision with root package name */
        private long f63807d;

        /* renamed from: e  reason: collision with root package name */
        private int f63808e;

        /* renamed from: f  reason: collision with root package name */
        private byte f63809f;

        b() {
        }

        public F.e.d.a.b.C1103e.C1105b a() {
            String str;
            if (this.f63809f == 7 && (str = this.f63805b) != null) {
                return new s(this.f63804a, str, this.f63806c, this.f63807d, this.f63808e);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f63809f & 1) == 0) {
                sb2.append(" pc");
            }
            if (this.f63805b == null) {
                sb2.append(" symbol");
            }
            if ((this.f63809f & 2) == 0) {
                sb2.append(" offset");
            }
            if ((this.f63809f & 4) == 0) {
                sb2.append(" importance");
            }
            throw new IllegalStateException("Missing required properties:" + sb2);
        }

        public F.e.d.a.b.C1103e.C1105b.C1106a b(String str) {
            this.f63806c = str;
            return this;
        }

        public F.e.d.a.b.C1103e.C1105b.C1106a c(int i10) {
            this.f63808e = i10;
            this.f63809f = (byte) (this.f63809f | 4);
            return this;
        }

        public F.e.d.a.b.C1103e.C1105b.C1106a d(long j10) {
            this.f63807d = j10;
            this.f63809f = (byte) (this.f63809f | 2);
            return this;
        }

        public F.e.d.a.b.C1103e.C1105b.C1106a e(long j10) {
            this.f63804a = j10;
            this.f63809f = (byte) (this.f63809f | 1);
            return this;
        }

        public F.e.d.a.b.C1103e.C1105b.C1106a f(String str) {
            if (str != null) {
                this.f63805b = str;
                return this;
            }
            throw new NullPointerException("Null symbol");
        }
    }

    public String b() {
        return this.f63801c;
    }

    public int c() {
        return this.f63803e;
    }

    public long d() {
        return this.f63802d;
    }

    public long e() {
        return this.f63799a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        r1 = r7.f63801c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof Tb.F.e.d.a.b.C1103e.C1105b
            r2 = 0
            if (r1 == 0) goto L_0x004b
            Tb.F$e$d$a$b$e$b r8 = (Tb.F.e.d.a.b.C1103e.C1105b) r8
            long r3 = r7.f63799a
            long r5 = r8.e()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0049
            java.lang.String r1 = r7.f63800b
            java.lang.String r3 = r8.f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0049
            java.lang.String r1 = r7.f63801c
            if (r1 != 0) goto L_0x002c
            java.lang.String r1 = r8.b()
            if (r1 != 0) goto L_0x0049
            goto L_0x0036
        L_0x002c:
            java.lang.String r3 = r8.b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0049
        L_0x0036:
            long r3 = r7.f63802d
            long r5 = r8.d()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0049
            int r1 = r7.f63803e
            int r8 = r8.c()
            if (r1 != r8) goto L_0x0049
            goto L_0x004a
        L_0x0049:
            r0 = r2
        L_0x004a:
            return r0
        L_0x004b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Tb.s.equals(java.lang.Object):boolean");
    }

    public String f() {
        return this.f63800b;
    }

    public int hashCode() {
        long j10 = this.f63799a;
        int hashCode = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ this.f63800b.hashCode()) * 1000003;
        String str = this.f63801c;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j11 = this.f63802d;
        return ((((hashCode ^ hashCode2) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003) ^ this.f63803e;
    }

    public String toString() {
        return "Frame{pc=" + this.f63799a + ", symbol=" + this.f63800b + ", file=" + this.f63801c + ", offset=" + this.f63802d + ", importance=" + this.f63803e + "}";
    }

    private s(long j10, String str, String str2, long j11, int i10) {
        this.f63799a = j10;
        this.f63800b = str;
        this.f63801c = str2;
        this.f63802d = j11;
        this.f63803e = i10;
    }
}

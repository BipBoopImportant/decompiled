package Tb;

import Tb.F;
import java.util.List;

final class h extends F.e {

    /* renamed from: a  reason: collision with root package name */
    private final String f63668a;

    /* renamed from: b  reason: collision with root package name */
    private final String f63669b;

    /* renamed from: c  reason: collision with root package name */
    private final String f63670c;

    /* renamed from: d  reason: collision with root package name */
    private final long f63671d;

    /* renamed from: e  reason: collision with root package name */
    private final Long f63672e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f63673f;

    /* renamed from: g  reason: collision with root package name */
    private final F.e.a f63674g;

    /* renamed from: h  reason: collision with root package name */
    private final F.e.f f63675h;

    /* renamed from: i  reason: collision with root package name */
    private final F.e.C1110e f63676i;

    /* renamed from: j  reason: collision with root package name */
    private final F.e.c f63677j;

    /* renamed from: k  reason: collision with root package name */
    private final List<F.e.d> f63678k;

    /* renamed from: l  reason: collision with root package name */
    private final int f63679l;

    static final class b extends F.e.b {

        /* renamed from: a  reason: collision with root package name */
        private String f63680a;

        /* renamed from: b  reason: collision with root package name */
        private String f63681b;

        /* renamed from: c  reason: collision with root package name */
        private String f63682c;

        /* renamed from: d  reason: collision with root package name */
        private long f63683d;

        /* renamed from: e  reason: collision with root package name */
        private Long f63684e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f63685f;

        /* renamed from: g  reason: collision with root package name */
        private F.e.a f63686g;

        /* renamed from: h  reason: collision with root package name */
        private F.e.f f63687h;

        /* renamed from: i  reason: collision with root package name */
        private F.e.C1110e f63688i;

        /* renamed from: j  reason: collision with root package name */
        private F.e.c f63689j;

        /* renamed from: k  reason: collision with root package name */
        private List<F.e.d> f63690k;

        /* renamed from: l  reason: collision with root package name */
        private int f63691l;

        /* renamed from: m  reason: collision with root package name */
        private byte f63692m;

        public F.e a() {
            String str;
            String str2;
            F.e.a aVar;
            if (this.f63692m == 7 && (str = this.f63680a) != null && (str2 = this.f63681b) != null && (aVar = this.f63686g) != null) {
                return new h(str, str2, this.f63682c, this.f63683d, this.f63684e, this.f63685f, aVar, this.f63687h, this.f63688i, this.f63689j, this.f63690k, this.f63691l);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f63680a == null) {
                sb2.append(" generator");
            }
            if (this.f63681b == null) {
                sb2.append(" identifier");
            }
            if ((this.f63692m & 1) == 0) {
                sb2.append(" startedAt");
            }
            if ((this.f63692m & 2) == 0) {
                sb2.append(" crashed");
            }
            if (this.f63686g == null) {
                sb2.append(" app");
            }
            if ((this.f63692m & 4) == 0) {
                sb2.append(" generatorType");
            }
            throw new IllegalStateException("Missing required properties:" + sb2);
        }

        public F.e.b b(F.e.a aVar) {
            if (aVar != null) {
                this.f63686g = aVar;
                return this;
            }
            throw new NullPointerException("Null app");
        }

        public F.e.b c(String str) {
            this.f63682c = str;
            return this;
        }

        public F.e.b d(boolean z10) {
            this.f63685f = z10;
            this.f63692m = (byte) (this.f63692m | 2);
            return this;
        }

        public F.e.b e(F.e.c cVar) {
            this.f63689j = cVar;
            return this;
        }

        public F.e.b f(Long l10) {
            this.f63684e = l10;
            return this;
        }

        public F.e.b g(List<F.e.d> list) {
            this.f63690k = list;
            return this;
        }

        public F.e.b h(String str) {
            if (str != null) {
                this.f63680a = str;
                return this;
            }
            throw new NullPointerException("Null generator");
        }

        public F.e.b i(int i10) {
            this.f63691l = i10;
            this.f63692m = (byte) (this.f63692m | 4);
            return this;
        }

        public F.e.b j(String str) {
            if (str != null) {
                this.f63681b = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }

        public F.e.b l(F.e.C1110e eVar) {
            this.f63688i = eVar;
            return this;
        }

        public F.e.b m(long j10) {
            this.f63683d = j10;
            this.f63692m = (byte) (this.f63692m | 1);
            return this;
        }

        public F.e.b n(F.e.f fVar) {
            this.f63687h = fVar;
            return this;
        }

        b() {
        }

        private b(F.e eVar) {
            this.f63680a = eVar.g();
            this.f63681b = eVar.i();
            this.f63682c = eVar.c();
            this.f63683d = eVar.l();
            this.f63684e = eVar.e();
            this.f63685f = eVar.n();
            this.f63686g = eVar.b();
            this.f63687h = eVar.m();
            this.f63688i = eVar.k();
            this.f63689j = eVar.d();
            this.f63690k = eVar.f();
            this.f63691l = eVar.h();
            this.f63692m = 7;
        }
    }

    public F.e.a b() {
        return this.f63674g;
    }

    public String c() {
        return this.f63670c;
    }

    public F.e.c d() {
        return this.f63677j;
    }

    public Long e() {
        return this.f63672e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0042, code lost:
        r1 = r7.f63672e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006b, code lost:
        r1 = r7.f63675h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0080, code lost:
        r1 = r7.f63676i;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0095, code lost:
        r1 = r7.f63677j;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00aa, code lost:
        r1 = r7.f63678k;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0023, code lost:
        r1 = r7.f63670c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r8 instanceof Tb.F.e
            r2 = 0
            if (r1 == 0) goto L_0x00ca
            Tb.F$e r8 = (Tb.F.e) r8
            java.lang.String r1 = r7.f63668a
            java.lang.String r3 = r8.g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00c8
            java.lang.String r1 = r7.f63669b
            java.lang.String r3 = r8.i()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00c8
            java.lang.String r1 = r7.f63670c
            if (r1 != 0) goto L_0x002e
            java.lang.String r1 = r8.c()
            if (r1 != 0) goto L_0x00c8
            goto L_0x0038
        L_0x002e:
            java.lang.String r3 = r8.c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00c8
        L_0x0038:
            long r3 = r7.f63671d
            long r5 = r8.l()
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x00c8
            java.lang.Long r1 = r7.f63672e
            if (r1 != 0) goto L_0x004d
            java.lang.Long r1 = r8.e()
            if (r1 != 0) goto L_0x00c8
            goto L_0x0057
        L_0x004d:
            java.lang.Long r3 = r8.e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00c8
        L_0x0057:
            boolean r1 = r7.f63673f
            boolean r3 = r8.n()
            if (r1 != r3) goto L_0x00c8
            Tb.F$e$a r1 = r7.f63674g
            Tb.F$e$a r3 = r8.b()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00c8
            Tb.F$e$f r1 = r7.f63675h
            if (r1 != 0) goto L_0x0076
            Tb.F$e$f r1 = r8.m()
            if (r1 != 0) goto L_0x00c8
            goto L_0x0080
        L_0x0076:
            Tb.F$e$f r3 = r8.m()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00c8
        L_0x0080:
            Tb.F$e$e r1 = r7.f63676i
            if (r1 != 0) goto L_0x008b
            Tb.F$e$e r1 = r8.k()
            if (r1 != 0) goto L_0x00c8
            goto L_0x0095
        L_0x008b:
            Tb.F$e$e r3 = r8.k()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00c8
        L_0x0095:
            Tb.F$e$c r1 = r7.f63677j
            if (r1 != 0) goto L_0x00a0
            Tb.F$e$c r1 = r8.d()
            if (r1 != 0) goto L_0x00c8
            goto L_0x00aa
        L_0x00a0:
            Tb.F$e$c r3 = r8.d()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00c8
        L_0x00aa:
            java.util.List<Tb.F$e$d> r1 = r7.f63678k
            if (r1 != 0) goto L_0x00b5
            java.util.List r1 = r8.f()
            if (r1 != 0) goto L_0x00c8
            goto L_0x00bf
        L_0x00b5:
            java.util.List r3 = r8.f()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00c8
        L_0x00bf:
            int r1 = r7.f63679l
            int r8 = r8.h()
            if (r1 != r8) goto L_0x00c8
            goto L_0x00c9
        L_0x00c8:
            r0 = r2
        L_0x00c9:
            return r0
        L_0x00ca:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Tb.h.equals(java.lang.Object):boolean");
    }

    public List<F.e.d> f() {
        return this.f63678k;
    }

    public String g() {
        return this.f63668a;
    }

    public int h() {
        return this.f63679l;
    }

    public int hashCode() {
        int hashCode = (((this.f63668a.hashCode() ^ 1000003) * 1000003) ^ this.f63669b.hashCode()) * 1000003;
        String str = this.f63670c;
        int i10 = 0;
        int hashCode2 = str == null ? 0 : str.hashCode();
        long j10 = this.f63671d;
        int i11 = (((hashCode ^ hashCode2) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003;
        Long l10 = this.f63672e;
        int hashCode3 = (((((i11 ^ (l10 == null ? 0 : l10.hashCode())) * 1000003) ^ (this.f63673f ? 1231 : 1237)) * 1000003) ^ this.f63674g.hashCode()) * 1000003;
        F.e.f fVar = this.f63675h;
        int hashCode4 = (hashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        F.e.C1110e eVar = this.f63676i;
        int hashCode5 = (hashCode4 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        F.e.c cVar = this.f63677j;
        int hashCode6 = (hashCode5 ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        List<F.e.d> list = this.f63678k;
        if (list != null) {
            i10 = list.hashCode();
        }
        return ((hashCode6 ^ i10) * 1000003) ^ this.f63679l;
    }

    public String i() {
        return this.f63669b;
    }

    public F.e.C1110e k() {
        return this.f63676i;
    }

    public long l() {
        return this.f63671d;
    }

    public F.e.f m() {
        return this.f63675h;
    }

    public boolean n() {
        return this.f63673f;
    }

    public F.e.b o() {
        return new b(this);
    }

    public String toString() {
        return "Session{generator=" + this.f63668a + ", identifier=" + this.f63669b + ", appQualitySessionId=" + this.f63670c + ", startedAt=" + this.f63671d + ", endedAt=" + this.f63672e + ", crashed=" + this.f63673f + ", app=" + this.f63674g + ", user=" + this.f63675h + ", os=" + this.f63676i + ", device=" + this.f63677j + ", events=" + this.f63678k + ", generatorType=" + this.f63679l + "}";
    }

    private h(String str, String str2, String str3, long j10, Long l10, boolean z10, F.e.a aVar, F.e.f fVar, F.e.C1110e eVar, F.e.c cVar, List<F.e.d> list, int i10) {
        this.f63668a = str;
        this.f63669b = str2;
        this.f63670c = str3;
        this.f63671d = j10;
        this.f63672e = l10;
        this.f63673f = z10;
        this.f63674g = aVar;
        this.f63675h = fVar;
        this.f63676i = eVar;
        this.f63677j = cVar;
        this.f63678k = list;
        this.f63679l = i10;
    }
}

package k9;

import java.util.List;
import k9.C8487u;

/* renamed from: k9.k  reason: case insensitive filesystem */
final class C8477k extends C8487u {

    /* renamed from: a  reason: collision with root package name */
    private final long f54477a;

    /* renamed from: b  reason: collision with root package name */
    private final long f54478b;

    /* renamed from: c  reason: collision with root package name */
    private final C8481o f54479c;

    /* renamed from: d  reason: collision with root package name */
    private final Integer f54480d;

    /* renamed from: e  reason: collision with root package name */
    private final String f54481e;

    /* renamed from: f  reason: collision with root package name */
    private final List<C8486t> f54482f;

    /* renamed from: g  reason: collision with root package name */
    private final C8490x f54483g;

    /* renamed from: k9.k$b */
    static final class b extends C8487u.a {

        /* renamed from: a  reason: collision with root package name */
        private Long f54484a;

        /* renamed from: b  reason: collision with root package name */
        private Long f54485b;

        /* renamed from: c  reason: collision with root package name */
        private C8481o f54486c;

        /* renamed from: d  reason: collision with root package name */
        private Integer f54487d;

        /* renamed from: e  reason: collision with root package name */
        private String f54488e;

        /* renamed from: f  reason: collision with root package name */
        private List<C8486t> f54489f;

        /* renamed from: g  reason: collision with root package name */
        private C8490x f54490g;

        b() {
        }

        public C8487u a() {
            String str = "";
            if (this.f54484a == null) {
                str = str + " requestTimeMs";
            }
            if (this.f54485b == null) {
                str = str + " requestUptimeMs";
            }
            if (str.isEmpty()) {
                return new C8477k(this.f54484a.longValue(), this.f54485b.longValue(), this.f54486c, this.f54487d, this.f54488e, this.f54489f, this.f54490g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public C8487u.a b(C8481o oVar) {
            this.f54486c = oVar;
            return this;
        }

        public C8487u.a c(List<C8486t> list) {
            this.f54489f = list;
            return this;
        }

        /* access modifiers changed from: package-private */
        public C8487u.a d(Integer num) {
            this.f54487d = num;
            return this;
        }

        /* access modifiers changed from: package-private */
        public C8487u.a e(String str) {
            this.f54488e = str;
            return this;
        }

        public C8487u.a f(C8490x xVar) {
            this.f54490g = xVar;
            return this;
        }

        public C8487u.a g(long j10) {
            this.f54484a = Long.valueOf(j10);
            return this;
        }

        public C8487u.a h(long j10) {
            this.f54485b = Long.valueOf(j10);
            return this;
        }
    }

    public C8481o b() {
        return this.f54479c;
    }

    public List<C8486t> c() {
        return this.f54482f;
    }

    public Integer d() {
        return this.f54480d;
    }

    public String e() {
        return this.f54481e;
    }

    public boolean equals(Object obj) {
        C8481o oVar;
        Integer num;
        String str;
        List<C8486t> list;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8487u)) {
            return false;
        }
        C8487u uVar = (C8487u) obj;
        if (this.f54477a == uVar.g() && this.f54478b == uVar.h() && ((oVar = this.f54479c) != null ? oVar.equals(uVar.b()) : uVar.b() == null) && ((num = this.f54480d) != null ? num.equals(uVar.d()) : uVar.d() == null) && ((str = this.f54481e) != null ? str.equals(uVar.e()) : uVar.e() == null) && ((list = this.f54482f) != null ? list.equals(uVar.c()) : uVar.c() == null)) {
            C8490x xVar = this.f54483g;
            if (xVar == null) {
                if (uVar.f() == null) {
                    return true;
                }
            } else if (xVar.equals(uVar.f())) {
                return true;
            }
        }
        return false;
    }

    public C8490x f() {
        return this.f54483g;
    }

    public long g() {
        return this.f54477a;
    }

    public long h() {
        return this.f54478b;
    }

    public int hashCode() {
        long j10 = this.f54477a;
        long j11 = this.f54478b;
        int i10 = (((((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j11 >>> 32) ^ j11))) * 1000003;
        C8481o oVar = this.f54479c;
        int i11 = 0;
        int hashCode = (i10 ^ (oVar == null ? 0 : oVar.hashCode())) * 1000003;
        Integer num = this.f54480d;
        int hashCode2 = (hashCode ^ (num == null ? 0 : num.hashCode())) * 1000003;
        String str = this.f54481e;
        int hashCode3 = (hashCode2 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        List<C8486t> list = this.f54482f;
        int hashCode4 = (hashCode3 ^ (list == null ? 0 : list.hashCode())) * 1000003;
        C8490x xVar = this.f54483g;
        if (xVar != null) {
            i11 = xVar.hashCode();
        }
        return hashCode4 ^ i11;
    }

    public String toString() {
        return "LogRequest{requestTimeMs=" + this.f54477a + ", requestUptimeMs=" + this.f54478b + ", clientInfo=" + this.f54479c + ", logSource=" + this.f54480d + ", logSourceName=" + this.f54481e + ", logEvents=" + this.f54482f + ", qosTier=" + this.f54483g + "}";
    }

    private C8477k(long j10, long j11, C8481o oVar, Integer num, String str, List<C8486t> list, C8490x xVar) {
        this.f54477a = j10;
        this.f54478b = j11;
        this.f54479c = oVar;
        this.f54480d = num;
        this.f54481e = str;
        this.f54482f = list;
        this.f54483g = xVar;
    }
}

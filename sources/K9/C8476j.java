package k9;

import java.util.Arrays;
import k9.C8486t;

/* renamed from: k9.j  reason: case insensitive filesystem */
final class C8476j extends C8486t {

    /* renamed from: a  reason: collision with root package name */
    private final long f54459a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f54460b;

    /* renamed from: c  reason: collision with root package name */
    private final C8482p f54461c;

    /* renamed from: d  reason: collision with root package name */
    private final long f54462d;

    /* renamed from: e  reason: collision with root package name */
    private final byte[] f54463e;

    /* renamed from: f  reason: collision with root package name */
    private final String f54464f;

    /* renamed from: g  reason: collision with root package name */
    private final long f54465g;

    /* renamed from: h  reason: collision with root package name */
    private final C8489w f54466h;

    /* renamed from: i  reason: collision with root package name */
    private final C8483q f54467i;

    /* renamed from: k9.j$b */
    static final class b extends C8486t.a {

        /* renamed from: a  reason: collision with root package name */
        private Long f54468a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f54469b;

        /* renamed from: c  reason: collision with root package name */
        private C8482p f54470c;

        /* renamed from: d  reason: collision with root package name */
        private Long f54471d;

        /* renamed from: e  reason: collision with root package name */
        private byte[] f54472e;

        /* renamed from: f  reason: collision with root package name */
        private String f54473f;

        /* renamed from: g  reason: collision with root package name */
        private Long f54474g;

        /* renamed from: h  reason: collision with root package name */
        private C8489w f54475h;

        /* renamed from: i  reason: collision with root package name */
        private C8483q f54476i;

        b() {
        }

        public C8486t a() {
            String str = "";
            if (this.f54468a == null) {
                str = str + " eventTimeMs";
            }
            if (this.f54471d == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f54474g == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new C8476j(this.f54468a.longValue(), this.f54469b, this.f54470c, this.f54471d.longValue(), this.f54472e, this.f54473f, this.f54474g.longValue(), this.f54475h, this.f54476i);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public C8486t.a b(C8482p pVar) {
            this.f54470c = pVar;
            return this;
        }

        public C8486t.a c(Integer num) {
            this.f54469b = num;
            return this;
        }

        public C8486t.a d(long j10) {
            this.f54468a = Long.valueOf(j10);
            return this;
        }

        public C8486t.a e(long j10) {
            this.f54471d = Long.valueOf(j10);
            return this;
        }

        public C8486t.a f(C8483q qVar) {
            this.f54476i = qVar;
            return this;
        }

        public C8486t.a g(C8489w wVar) {
            this.f54475h = wVar;
            return this;
        }

        /* access modifiers changed from: package-private */
        public C8486t.a h(byte[] bArr) {
            this.f54472e = bArr;
            return this;
        }

        /* access modifiers changed from: package-private */
        public C8486t.a i(String str) {
            this.f54473f = str;
            return this;
        }

        public C8486t.a j(long j10) {
            this.f54474g = Long.valueOf(j10);
            return this;
        }
    }

    public C8482p b() {
        return this.f54461c;
    }

    public Integer c() {
        return this.f54460b;
    }

    public long d() {
        return this.f54459a;
    }

    public long e() {
        return this.f54462d;
    }

    public boolean equals(Object obj) {
        Integer num;
        C8482p pVar;
        String str;
        C8489w wVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8486t)) {
            return false;
        }
        C8486t tVar = (C8486t) obj;
        if (this.f54459a == tVar.d() && ((num = this.f54460b) != null ? num.equals(tVar.c()) : tVar.c() == null) && ((pVar = this.f54461c) != null ? pVar.equals(tVar.b()) : tVar.b() == null) && this.f54462d == tVar.e()) {
            if (Arrays.equals(this.f54463e, tVar instanceof C8476j ? ((C8476j) tVar).f54463e : tVar.h()) && ((str = this.f54464f) != null ? str.equals(tVar.i()) : tVar.i() == null) && this.f54465g == tVar.j() && ((wVar = this.f54466h) != null ? wVar.equals(tVar.g()) : tVar.g() == null)) {
                C8483q qVar = this.f54467i;
                if (qVar == null) {
                    if (tVar.f() == null) {
                        return true;
                    }
                } else if (qVar.equals(tVar.f())) {
                    return true;
                }
            }
        }
        return false;
    }

    public C8483q f() {
        return this.f54467i;
    }

    public C8489w g() {
        return this.f54466h;
    }

    public byte[] h() {
        return this.f54463e;
    }

    public int hashCode() {
        long j10 = this.f54459a;
        int i10 = (((int) (j10 ^ (j10 >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f54460b;
        int i11 = 0;
        int hashCode = (i10 ^ (num == null ? 0 : num.hashCode())) * 1000003;
        C8482p pVar = this.f54461c;
        int hashCode2 = pVar == null ? 0 : pVar.hashCode();
        long j11 = this.f54462d;
        int hashCode3 = (((((hashCode ^ hashCode2) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f54463e)) * 1000003;
        String str = this.f54464f;
        int hashCode4 = str == null ? 0 : str.hashCode();
        long j12 = this.f54465g;
        int i12 = (((hashCode3 ^ hashCode4) * 1000003) ^ ((int) ((j12 >>> 32) ^ j12))) * 1000003;
        C8489w wVar = this.f54466h;
        int hashCode5 = (i12 ^ (wVar == null ? 0 : wVar.hashCode())) * 1000003;
        C8483q qVar = this.f54467i;
        if (qVar != null) {
            i11 = qVar.hashCode();
        }
        return hashCode5 ^ i11;
    }

    public String i() {
        return this.f54464f;
    }

    public long j() {
        return this.f54465g;
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f54459a + ", eventCode=" + this.f54460b + ", complianceData=" + this.f54461c + ", eventUptimeMs=" + this.f54462d + ", sourceExtension=" + Arrays.toString(this.f54463e) + ", sourceExtensionJsonProto3=" + this.f54464f + ", timezoneOffsetSeconds=" + this.f54465g + ", networkConnectionInfo=" + this.f54466h + ", experimentIds=" + this.f54467i + "}";
    }

    private C8476j(long j10, Integer num, C8482p pVar, long j11, byte[] bArr, String str, long j12, C8489w wVar, C8483q qVar) {
        this.f54459a = j10;
        this.f54460b = num;
        this.f54461c = pVar;
        this.f54462d = j11;
        this.f54463e = bArr;
        this.f54464f = str;
        this.f54465g = j12;
        this.f54466h = wVar;
        this.f54467i = qVar;
    }
}

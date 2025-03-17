package pc;

import pc.C10134c;
import pc.d;

/* renamed from: pc.a  reason: case insensitive filesystem */
final class C10132a extends d {

    /* renamed from: b  reason: collision with root package name */
    private final String f75814b;

    /* renamed from: c  reason: collision with root package name */
    private final C10134c.a f75815c;

    /* renamed from: d  reason: collision with root package name */
    private final String f75816d;

    /* renamed from: e  reason: collision with root package name */
    private final String f75817e;

    /* renamed from: f  reason: collision with root package name */
    private final long f75818f;

    /* renamed from: g  reason: collision with root package name */
    private final long f75819g;

    /* renamed from: h  reason: collision with root package name */
    private final String f75820h;

    /* renamed from: pc.a$b */
    static final class b extends d.a {

        /* renamed from: a  reason: collision with root package name */
        private String f75821a;

        /* renamed from: b  reason: collision with root package name */
        private C10134c.a f75822b;

        /* renamed from: c  reason: collision with root package name */
        private String f75823c;

        /* renamed from: d  reason: collision with root package name */
        private String f75824d;

        /* renamed from: e  reason: collision with root package name */
        private Long f75825e;

        /* renamed from: f  reason: collision with root package name */
        private Long f75826f;

        /* renamed from: g  reason: collision with root package name */
        private String f75827g;

        public d a() {
            String str = "";
            if (this.f75822b == null) {
                str = str + " registrationStatus";
            }
            if (this.f75825e == null) {
                str = str + " expiresInSecs";
            }
            if (this.f75826f == null) {
                str = str + " tokenCreationEpochInSecs";
            }
            if (str.isEmpty()) {
                return new C10132a(this.f75821a, this.f75822b, this.f75823c, this.f75824d, this.f75825e.longValue(), this.f75826f.longValue(), this.f75827g);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public d.a b(String str) {
            this.f75823c = str;
            return this;
        }

        public d.a c(long j10) {
            this.f75825e = Long.valueOf(j10);
            return this;
        }

        public d.a d(String str) {
            this.f75821a = str;
            return this;
        }

        public d.a e(String str) {
            this.f75827g = str;
            return this;
        }

        public d.a f(String str) {
            this.f75824d = str;
            return this;
        }

        public d.a g(C10134c.a aVar) {
            if (aVar != null) {
                this.f75822b = aVar;
                return this;
            }
            throw new NullPointerException("Null registrationStatus");
        }

        public d.a h(long j10) {
            this.f75826f = Long.valueOf(j10);
            return this;
        }

        b() {
        }

        private b(d dVar) {
            this.f75821a = dVar.d();
            this.f75822b = dVar.g();
            this.f75823c = dVar.b();
            this.f75824d = dVar.f();
            this.f75825e = Long.valueOf(dVar.c());
            this.f75826f = Long.valueOf(dVar.h());
            this.f75827g = dVar.e();
        }
    }

    public String b() {
        return this.f75816d;
    }

    public long c() {
        return this.f75818f;
    }

    public String d() {
        return this.f75814b;
    }

    public String e() {
        return this.f75820h;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        String str3 = this.f75814b;
        if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
            if (this.f75815c.equals(dVar.g()) && ((str = this.f75816d) != null ? str.equals(dVar.b()) : dVar.b() == null) && ((str2 = this.f75817e) != null ? str2.equals(dVar.f()) : dVar.f() == null) && this.f75818f == dVar.c() && this.f75819g == dVar.h()) {
                String str4 = this.f75820h;
                if (str4 == null) {
                    if (dVar.e() == null) {
                        return true;
                    }
                } else if (str4.equals(dVar.e())) {
                    return true;
                }
            }
        }
        return false;
    }

    public String f() {
        return this.f75817e;
    }

    public C10134c.a g() {
        return this.f75815c;
    }

    public long h() {
        return this.f75819g;
    }

    public int hashCode() {
        String str = this.f75814b;
        int i10 = 0;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ this.f75815c.hashCode()) * 1000003;
        String str2 = this.f75816d;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f75817e;
        int hashCode3 = str3 == null ? 0 : str3.hashCode();
        long j10 = this.f75818f;
        long j11 = this.f75819g;
        int i11 = (((((hashCode2 ^ hashCode3) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003) ^ ((int) (j11 ^ (j11 >>> 32)))) * 1000003;
        String str4 = this.f75820h;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return i11 ^ i10;
    }

    public d.a n() {
        return new b(this);
    }

    public String toString() {
        return "PersistedInstallationEntry{firebaseInstallationId=" + this.f75814b + ", registrationStatus=" + this.f75815c + ", authToken=" + this.f75816d + ", refreshToken=" + this.f75817e + ", expiresInSecs=" + this.f75818f + ", tokenCreationEpochInSecs=" + this.f75819g + ", fisError=" + this.f75820h + "}";
    }

    private C10132a(String str, C10134c.a aVar, String str2, String str3, long j10, long j11, String str4) {
        this.f75814b = str;
        this.f75815c = aVar;
        this.f75816d = str2;
        this.f75817e = str3;
        this.f75818f = j10;
        this.f75819g = j11;
        this.f75820h = str4;
    }
}

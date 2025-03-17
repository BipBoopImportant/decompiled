package Tb;

import Tb.F;

/* renamed from: Tb.b  reason: case insensitive filesystem */
final class C9274b extends F {

    /* renamed from: b  reason: collision with root package name */
    private final String f63606b;

    /* renamed from: c  reason: collision with root package name */
    private final String f63607c;

    /* renamed from: d  reason: collision with root package name */
    private final int f63608d;

    /* renamed from: e  reason: collision with root package name */
    private final String f63609e;

    /* renamed from: f  reason: collision with root package name */
    private final String f63610f;

    /* renamed from: g  reason: collision with root package name */
    private final String f63611g;

    /* renamed from: h  reason: collision with root package name */
    private final String f63612h;

    /* renamed from: i  reason: collision with root package name */
    private final String f63613i;

    /* renamed from: j  reason: collision with root package name */
    private final String f63614j;

    /* renamed from: k  reason: collision with root package name */
    private final F.e f63615k;

    /* renamed from: l  reason: collision with root package name */
    private final F.d f63616l;

    /* renamed from: m  reason: collision with root package name */
    private final F.a f63617m;

    /* renamed from: Tb.b$b  reason: collision with other inner class name */
    static final class C1112b extends F.b {

        /* renamed from: a  reason: collision with root package name */
        private String f63618a;

        /* renamed from: b  reason: collision with root package name */
        private String f63619b;

        /* renamed from: c  reason: collision with root package name */
        private int f63620c;

        /* renamed from: d  reason: collision with root package name */
        private String f63621d;

        /* renamed from: e  reason: collision with root package name */
        private String f63622e;

        /* renamed from: f  reason: collision with root package name */
        private String f63623f;

        /* renamed from: g  reason: collision with root package name */
        private String f63624g;

        /* renamed from: h  reason: collision with root package name */
        private String f63625h;

        /* renamed from: i  reason: collision with root package name */
        private String f63626i;

        /* renamed from: j  reason: collision with root package name */
        private F.e f63627j;

        /* renamed from: k  reason: collision with root package name */
        private F.d f63628k;

        /* renamed from: l  reason: collision with root package name */
        private F.a f63629l;

        /* renamed from: m  reason: collision with root package name */
        private byte f63630m;

        public F a() {
            if (this.f63630m == 1 && this.f63618a != null && this.f63619b != null && this.f63621d != null && this.f63625h != null && this.f63626i != null) {
                return new C9274b(this.f63618a, this.f63619b, this.f63620c, this.f63621d, this.f63622e, this.f63623f, this.f63624g, this.f63625h, this.f63626i, this.f63627j, this.f63628k, this.f63629l);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f63618a == null) {
                sb2.append(" sdkVersion");
            }
            if (this.f63619b == null) {
                sb2.append(" gmpAppId");
            }
            if ((1 & this.f63630m) == 0) {
                sb2.append(" platform");
            }
            if (this.f63621d == null) {
                sb2.append(" installationUuid");
            }
            if (this.f63625h == null) {
                sb2.append(" buildVersion");
            }
            if (this.f63626i == null) {
                sb2.append(" displayVersion");
            }
            throw new IllegalStateException("Missing required properties:" + sb2);
        }

        public F.b b(F.a aVar) {
            this.f63629l = aVar;
            return this;
        }

        public F.b c(String str) {
            this.f63624g = str;
            return this;
        }

        public F.b d(String str) {
            if (str != null) {
                this.f63625h = str;
                return this;
            }
            throw new NullPointerException("Null buildVersion");
        }

        public F.b e(String str) {
            if (str != null) {
                this.f63626i = str;
                return this;
            }
            throw new NullPointerException("Null displayVersion");
        }

        public F.b f(String str) {
            this.f63623f = str;
            return this;
        }

        public F.b g(String str) {
            this.f63622e = str;
            return this;
        }

        public F.b h(String str) {
            if (str != null) {
                this.f63619b = str;
                return this;
            }
            throw new NullPointerException("Null gmpAppId");
        }

        public F.b i(String str) {
            if (str != null) {
                this.f63621d = str;
                return this;
            }
            throw new NullPointerException("Null installationUuid");
        }

        public F.b j(F.d dVar) {
            this.f63628k = dVar;
            return this;
        }

        public F.b k(int i10) {
            this.f63620c = i10;
            this.f63630m = (byte) (this.f63630m | 1);
            return this;
        }

        public F.b l(String str) {
            if (str != null) {
                this.f63618a = str;
                return this;
            }
            throw new NullPointerException("Null sdkVersion");
        }

        public F.b m(F.e eVar) {
            this.f63627j = eVar;
            return this;
        }

        C1112b() {
        }

        private C1112b(F f10) {
            this.f63618a = f10.m();
            this.f63619b = f10.i();
            this.f63620c = f10.l();
            this.f63621d = f10.j();
            this.f63622e = f10.h();
            this.f63623f = f10.g();
            this.f63624g = f10.d();
            this.f63625h = f10.e();
            this.f63626i = f10.f();
            this.f63627j = f10.n();
            this.f63628k = f10.k();
            this.f63629l = f10.c();
            this.f63630m = 1;
        }
    }

    public F.a c() {
        return this.f63617m;
    }

    public String d() {
        return this.f63612h;
    }

    public String e() {
        return this.f63613i;
    }

    public boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        F.e eVar;
        F.d dVar;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f10 = (F) obj;
        if (this.f63606b.equals(f10.m()) && this.f63607c.equals(f10.i()) && this.f63608d == f10.l() && this.f63609e.equals(f10.j()) && ((str = this.f63610f) != null ? str.equals(f10.h()) : f10.h() == null) && ((str2 = this.f63611g) != null ? str2.equals(f10.g()) : f10.g() == null) && ((str3 = this.f63612h) != null ? str3.equals(f10.d()) : f10.d() == null) && this.f63613i.equals(f10.e()) && this.f63614j.equals(f10.f()) && ((eVar = this.f63615k) != null ? eVar.equals(f10.n()) : f10.n() == null) && ((dVar = this.f63616l) != null ? dVar.equals(f10.k()) : f10.k() == null)) {
            F.a aVar = this.f63617m;
            if (aVar == null) {
                if (f10.c() == null) {
                    return true;
                }
            } else if (aVar.equals(f10.c())) {
                return true;
            }
        }
        return false;
    }

    public String f() {
        return this.f63614j;
    }

    public String g() {
        return this.f63611g;
    }

    public String h() {
        return this.f63610f;
    }

    public int hashCode() {
        int hashCode = (((((((this.f63606b.hashCode() ^ 1000003) * 1000003) ^ this.f63607c.hashCode()) * 1000003) ^ this.f63608d) * 1000003) ^ this.f63609e.hashCode()) * 1000003;
        String str = this.f63610f;
        int i10 = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f63611g;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f63612h;
        int hashCode4 = (((((hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003) ^ this.f63613i.hashCode()) * 1000003) ^ this.f63614j.hashCode()) * 1000003;
        F.e eVar = this.f63615k;
        int hashCode5 = (hashCode4 ^ (eVar == null ? 0 : eVar.hashCode())) * 1000003;
        F.d dVar = this.f63616l;
        int hashCode6 = (hashCode5 ^ (dVar == null ? 0 : dVar.hashCode())) * 1000003;
        F.a aVar = this.f63617m;
        if (aVar != null) {
            i10 = aVar.hashCode();
        }
        return hashCode6 ^ i10;
    }

    public String i() {
        return this.f63607c;
    }

    public String j() {
        return this.f63609e;
    }

    public F.d k() {
        return this.f63616l;
    }

    public int l() {
        return this.f63608d;
    }

    public String m() {
        return this.f63606b;
    }

    public F.e n() {
        return this.f63615k;
    }

    /* access modifiers changed from: protected */
    public F.b o() {
        return new C1112b(this);
    }

    public String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.f63606b + ", gmpAppId=" + this.f63607c + ", platform=" + this.f63608d + ", installationUuid=" + this.f63609e + ", firebaseInstallationId=" + this.f63610f + ", firebaseAuthenticationToken=" + this.f63611g + ", appQualitySessionId=" + this.f63612h + ", buildVersion=" + this.f63613i + ", displayVersion=" + this.f63614j + ", session=" + this.f63615k + ", ndkPayload=" + this.f63616l + ", appExitInfo=" + this.f63617m + "}";
    }

    private C9274b(String str, String str2, int i10, String str3, String str4, String str5, String str6, String str7, String str8, F.e eVar, F.d dVar, F.a aVar) {
        this.f63606b = str;
        this.f63607c = str2;
        this.f63608d = i10;
        this.f63609e = str3;
        this.f63610f = str4;
        this.f63611g = str5;
        this.f63612h = str6;
        this.f63613i = str7;
        this.f63614j = str8;
        this.f63615k = eVar;
        this.f63616l = dVar;
        this.f63617m = aVar;
    }
}

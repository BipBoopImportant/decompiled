package Tb;

import Tb.F;

final class i extends F.e.a {

    /* renamed from: a  reason: collision with root package name */
    private final String f63693a;

    /* renamed from: b  reason: collision with root package name */
    private final String f63694b;

    /* renamed from: c  reason: collision with root package name */
    private final String f63695c;

    /* renamed from: d  reason: collision with root package name */
    private final F.e.a.b f63696d;

    /* renamed from: e  reason: collision with root package name */
    private final String f63697e;

    /* renamed from: f  reason: collision with root package name */
    private final String f63698f;

    /* renamed from: g  reason: collision with root package name */
    private final String f63699g;

    static final class b extends F.e.a.C1095a {

        /* renamed from: a  reason: collision with root package name */
        private String f63700a;

        /* renamed from: b  reason: collision with root package name */
        private String f63701b;

        /* renamed from: c  reason: collision with root package name */
        private String f63702c;

        /* renamed from: d  reason: collision with root package name */
        private F.e.a.b f63703d;

        /* renamed from: e  reason: collision with root package name */
        private String f63704e;

        /* renamed from: f  reason: collision with root package name */
        private String f63705f;

        /* renamed from: g  reason: collision with root package name */
        private String f63706g;

        b() {
        }

        public F.e.a a() {
            String str;
            String str2 = this.f63700a;
            if (str2 != null && (str = this.f63701b) != null) {
                return new i(str2, str, this.f63702c, this.f63703d, this.f63704e, this.f63705f, this.f63706g);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f63700a == null) {
                sb2.append(" identifier");
            }
            if (this.f63701b == null) {
                sb2.append(" version");
            }
            throw new IllegalStateException("Missing required properties:" + sb2);
        }

        public F.e.a.C1095a b(String str) {
            this.f63705f = str;
            return this;
        }

        public F.e.a.C1095a c(String str) {
            this.f63706g = str;
            return this;
        }

        public F.e.a.C1095a d(String str) {
            this.f63702c = str;
            return this;
        }

        public F.e.a.C1095a e(String str) {
            if (str != null) {
                this.f63700a = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }

        public F.e.a.C1095a f(String str) {
            this.f63704e = str;
            return this;
        }

        public F.e.a.C1095a g(String str) {
            if (str != null) {
                this.f63701b = str;
                return this;
            }
            throw new NullPointerException("Null version");
        }
    }

    public String b() {
        return this.f63698f;
    }

    public String c() {
        return this.f63699g;
    }

    public String d() {
        return this.f63695c;
    }

    public String e() {
        return this.f63693a;
    }

    public boolean equals(Object obj) {
        String str;
        F.e.a.b bVar;
        String str2;
        String str3;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.a)) {
            return false;
        }
        F.e.a aVar = (F.e.a) obj;
        if (this.f63693a.equals(aVar.e()) && this.f63694b.equals(aVar.h()) && ((str = this.f63695c) != null ? str.equals(aVar.d()) : aVar.d() == null) && ((bVar = this.f63696d) != null ? bVar.equals(aVar.g()) : aVar.g() == null) && ((str2 = this.f63697e) != null ? str2.equals(aVar.f()) : aVar.f() == null) && ((str3 = this.f63698f) != null ? str3.equals(aVar.b()) : aVar.b() == null)) {
            String str4 = this.f63699g;
            if (str4 == null) {
                if (aVar.c() == null) {
                    return true;
                }
            } else if (str4.equals(aVar.c())) {
                return true;
            }
        }
        return false;
    }

    public String f() {
        return this.f63697e;
    }

    public F.e.a.b g() {
        return this.f63696d;
    }

    public String h() {
        return this.f63694b;
    }

    public int hashCode() {
        int hashCode = (((this.f63693a.hashCode() ^ 1000003) * 1000003) ^ this.f63694b.hashCode()) * 1000003;
        String str = this.f63695c;
        int i10 = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        F.e.a.b bVar = this.f63696d;
        int hashCode3 = (hashCode2 ^ (bVar == null ? 0 : bVar.hashCode())) * 1000003;
        String str2 = this.f63697e;
        int hashCode4 = (hashCode3 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f63698f;
        int hashCode5 = (hashCode4 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f63699g;
        if (str4 != null) {
            i10 = str4.hashCode();
        }
        return hashCode5 ^ i10;
    }

    public String toString() {
        return "Application{identifier=" + this.f63693a + ", version=" + this.f63694b + ", displayVersion=" + this.f63695c + ", organization=" + this.f63696d + ", installationUuid=" + this.f63697e + ", developmentPlatform=" + this.f63698f + ", developmentPlatformVersion=" + this.f63699g + "}";
    }

    private i(String str, String str2, String str3, F.e.a.b bVar, String str4, String str5, String str6) {
        this.f63693a = str;
        this.f63694b = str2;
        this.f63695c = str3;
        this.f63696d = bVar;
        this.f63697e = str4;
        this.f63698f = str5;
        this.f63699g = str6;
    }
}

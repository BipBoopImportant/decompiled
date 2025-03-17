package qc;

import qc.C10185d;

/* renamed from: qc.a  reason: case insensitive filesystem */
final class C10182a extends C10185d {

    /* renamed from: a  reason: collision with root package name */
    private final String f76017a;

    /* renamed from: b  reason: collision with root package name */
    private final String f76018b;

    /* renamed from: c  reason: collision with root package name */
    private final String f76019c;

    /* renamed from: d  reason: collision with root package name */
    private final f f76020d;

    /* renamed from: e  reason: collision with root package name */
    private final C10185d.b f76021e;

    /* renamed from: qc.a$b */
    static final class b extends C10185d.a {

        /* renamed from: a  reason: collision with root package name */
        private String f76022a;

        /* renamed from: b  reason: collision with root package name */
        private String f76023b;

        /* renamed from: c  reason: collision with root package name */
        private String f76024c;

        /* renamed from: d  reason: collision with root package name */
        private f f76025d;

        /* renamed from: e  reason: collision with root package name */
        private C10185d.b f76026e;

        b() {
        }

        public C10185d a() {
            return new C10182a(this.f76022a, this.f76023b, this.f76024c, this.f76025d, this.f76026e);
        }

        public C10185d.a b(f fVar) {
            this.f76025d = fVar;
            return this;
        }

        public C10185d.a c(String str) {
            this.f76023b = str;
            return this;
        }

        public C10185d.a d(String str) {
            this.f76024c = str;
            return this;
        }

        public C10185d.a e(C10185d.b bVar) {
            this.f76026e = bVar;
            return this;
        }

        public C10185d.a f(String str) {
            this.f76022a = str;
            return this;
        }
    }

    public f b() {
        return this.f76020d;
    }

    public String c() {
        return this.f76018b;
    }

    public String d() {
        return this.f76019c;
    }

    public C10185d.b e() {
        return this.f76021e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C10185d)) {
            return false;
        }
        C10185d dVar = (C10185d) obj;
        String str = this.f76017a;
        if (str != null ? str.equals(dVar.f()) : dVar.f() == null) {
            String str2 = this.f76018b;
            if (str2 != null ? str2.equals(dVar.c()) : dVar.c() == null) {
                String str3 = this.f76019c;
                if (str3 != null ? str3.equals(dVar.d()) : dVar.d() == null) {
                    f fVar = this.f76020d;
                    if (fVar != null ? fVar.equals(dVar.b()) : dVar.b() == null) {
                        C10185d.b bVar = this.f76021e;
                        if (bVar == null) {
                            if (dVar.e() == null) {
                                return true;
                            }
                        } else if (bVar.equals(dVar.e())) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public String f() {
        return this.f76017a;
    }

    public int hashCode() {
        String str = this.f76017a;
        int i10 = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f76018b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f76019c;
        int hashCode3 = (hashCode2 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        f fVar = this.f76020d;
        int hashCode4 = (hashCode3 ^ (fVar == null ? 0 : fVar.hashCode())) * 1000003;
        C10185d.b bVar = this.f76021e;
        if (bVar != null) {
            i10 = bVar.hashCode();
        }
        return hashCode4 ^ i10;
    }

    public String toString() {
        return "InstallationResponse{uri=" + this.f76017a + ", fid=" + this.f76018b + ", refreshToken=" + this.f76019c + ", authToken=" + this.f76020d + ", responseCode=" + this.f76021e + "}";
    }

    private C10182a(String str, String str2, String str3, f fVar, C10185d.b bVar) {
        this.f76017a = str;
        this.f76018b = str2;
        this.f76019c = str3;
        this.f76020d = fVar;
        this.f76021e = bVar;
    }
}

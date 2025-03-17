package k9;

import k9.C8482p;

/* renamed from: k9.f  reason: case insensitive filesystem */
final class C8472f extends C8482p {

    /* renamed from: a  reason: collision with root package name */
    private final C8485s f54447a;

    /* renamed from: b  reason: collision with root package name */
    private final C8482p.b f54448b;

    /* renamed from: k9.f$b */
    static final class b extends C8482p.a {

        /* renamed from: a  reason: collision with root package name */
        private C8485s f54449a;

        /* renamed from: b  reason: collision with root package name */
        private C8482p.b f54450b;

        b() {
        }

        public C8482p a() {
            return new C8472f(this.f54449a, this.f54450b);
        }

        public C8482p.a b(C8485s sVar) {
            this.f54449a = sVar;
            return this;
        }

        public C8482p.a c(C8482p.b bVar) {
            this.f54450b = bVar;
            return this;
        }
    }

    public C8485s b() {
        return this.f54447a;
    }

    public C8482p.b c() {
        return this.f54448b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8482p)) {
            return false;
        }
        C8482p pVar = (C8482p) obj;
        C8485s sVar = this.f54447a;
        if (sVar != null ? sVar.equals(pVar.b()) : pVar.b() == null) {
            C8482p.b bVar = this.f54448b;
            if (bVar == null) {
                if (pVar.c() == null) {
                    return true;
                }
            } else if (bVar.equals(pVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        C8485s sVar = this.f54447a;
        int i10 = 0;
        int hashCode = ((sVar == null ? 0 : sVar.hashCode()) ^ 1000003) * 1000003;
        C8482p.b bVar = this.f54448b;
        if (bVar != null) {
            i10 = bVar.hashCode();
        }
        return hashCode ^ i10;
    }

    public String toString() {
        return "ComplianceData{privacyContext=" + this.f54447a + ", productIdOrigin=" + this.f54448b + "}";
    }

    private C8472f(C8485s sVar, C8482p.b bVar) {
        this.f54447a = sVar;
        this.f54448b = bVar;
    }
}

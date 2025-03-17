package k9;

import k9.C8481o;

/* renamed from: k9.e  reason: case insensitive filesystem */
final class C8471e extends C8481o {

    /* renamed from: a  reason: collision with root package name */
    private final C8481o.b f54443a;

    /* renamed from: b  reason: collision with root package name */
    private final C8467a f54444b;

    /* renamed from: k9.e$b */
    static final class b extends C8481o.a {

        /* renamed from: a  reason: collision with root package name */
        private C8481o.b f54445a;

        /* renamed from: b  reason: collision with root package name */
        private C8467a f54446b;

        b() {
        }

        public C8481o a() {
            return new C8471e(this.f54445a, this.f54446b);
        }

        public C8481o.a b(C8467a aVar) {
            this.f54446b = aVar;
            return this;
        }

        public C8481o.a c(C8481o.b bVar) {
            this.f54445a = bVar;
            return this;
        }
    }

    public C8467a b() {
        return this.f54444b;
    }

    public C8481o.b c() {
        return this.f54443a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8481o)) {
            return false;
        }
        C8481o oVar = (C8481o) obj;
        C8481o.b bVar = this.f54443a;
        if (bVar != null ? bVar.equals(oVar.c()) : oVar.c() == null) {
            C8467a aVar = this.f54444b;
            if (aVar == null) {
                if (oVar.b() == null) {
                    return true;
                }
            } else if (aVar.equals(oVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        C8481o.b bVar = this.f54443a;
        int i10 = 0;
        int hashCode = ((bVar == null ? 0 : bVar.hashCode()) ^ 1000003) * 1000003;
        C8467a aVar = this.f54444b;
        if (aVar != null) {
            i10 = aVar.hashCode();
        }
        return hashCode ^ i10;
    }

    public String toString() {
        return "ClientInfo{clientType=" + this.f54443a + ", androidClientInfo=" + this.f54444b + "}";
    }

    private C8471e(C8481o.b bVar, C8467a aVar) {
        this.f54443a = bVar;
        this.f54444b = aVar;
    }
}

package k9;

import k9.C8489w;

/* renamed from: k9.m  reason: case insensitive filesystem */
final class C8479m extends C8489w {

    /* renamed from: a  reason: collision with root package name */
    private final C8489w.c f54492a;

    /* renamed from: b  reason: collision with root package name */
    private final C8489w.b f54493b;

    /* renamed from: k9.m$b */
    static final class b extends C8489w.a {

        /* renamed from: a  reason: collision with root package name */
        private C8489w.c f54494a;

        /* renamed from: b  reason: collision with root package name */
        private C8489w.b f54495b;

        b() {
        }

        public C8489w a() {
            return new C8479m(this.f54494a, this.f54495b);
        }

        public C8489w.a b(C8489w.b bVar) {
            this.f54495b = bVar;
            return this;
        }

        public C8489w.a c(C8489w.c cVar) {
            this.f54494a = cVar;
            return this;
        }
    }

    public C8489w.b b() {
        return this.f54493b;
    }

    public C8489w.c c() {
        return this.f54492a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8489w)) {
            return false;
        }
        C8489w wVar = (C8489w) obj;
        C8489w.c cVar = this.f54492a;
        if (cVar != null ? cVar.equals(wVar.c()) : wVar.c() == null) {
            C8489w.b bVar = this.f54493b;
            if (bVar == null) {
                if (wVar.b() == null) {
                    return true;
                }
            } else if (bVar.equals(wVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        C8489w.c cVar = this.f54492a;
        int i10 = 0;
        int hashCode = ((cVar == null ? 0 : cVar.hashCode()) ^ 1000003) * 1000003;
        C8489w.b bVar = this.f54493b;
        if (bVar != null) {
            i10 = bVar.hashCode();
        }
        return hashCode ^ i10;
    }

    public String toString() {
        return "NetworkConnectionInfo{networkType=" + this.f54492a + ", mobileSubtype=" + this.f54493b + "}";
    }

    private C8479m(C8489w.c cVar, C8489w.b bVar) {
        this.f54492a = cVar;
        this.f54493b = bVar;
    }
}

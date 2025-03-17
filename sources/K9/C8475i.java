package k9;

import k9.C8485s;

/* renamed from: k9.i  reason: case insensitive filesystem */
final class C8475i extends C8485s {

    /* renamed from: a  reason: collision with root package name */
    private final C8484r f54457a;

    /* renamed from: k9.i$b */
    static final class b extends C8485s.a {

        /* renamed from: a  reason: collision with root package name */
        private C8484r f54458a;

        b() {
        }

        public C8485s a() {
            return new C8475i(this.f54458a);
        }

        public C8485s.a b(C8484r rVar) {
            this.f54458a = rVar;
            return this;
        }
    }

    public C8484r b() {
        return this.f54457a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8485s)) {
            return false;
        }
        C8484r rVar = this.f54457a;
        C8484r b10 = ((C8485s) obj).b();
        return rVar == null ? b10 == null : rVar.equals(b10);
    }

    public int hashCode() {
        C8484r rVar = this.f54457a;
        return (rVar == null ? 0 : rVar.hashCode()) ^ 1000003;
    }

    public String toString() {
        return "ExternalPrivacyContext{prequest=" + this.f54457a + "}";
    }

    private C8475i(C8484r rVar) {
        this.f54457a = rVar;
    }
}

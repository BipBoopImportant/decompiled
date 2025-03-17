package Tb;

import Tb.F;

/* renamed from: Tb.e  reason: case insensitive filesystem */
final class C9277e extends F.c {

    /* renamed from: a  reason: collision with root package name */
    private final String f63656a;

    /* renamed from: b  reason: collision with root package name */
    private final String f63657b;

    /* renamed from: Tb.e$b */
    static final class b extends F.c.a {

        /* renamed from: a  reason: collision with root package name */
        private String f63658a;

        /* renamed from: b  reason: collision with root package name */
        private String f63659b;

        b() {
        }

        public F.c a() {
            String str;
            String str2 = this.f63658a;
            if (str2 != null && (str = this.f63659b) != null) {
                return new C9277e(str2, str);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f63658a == null) {
                sb2.append(" key");
            }
            if (this.f63659b == null) {
                sb2.append(" value");
            }
            throw new IllegalStateException("Missing required properties:" + sb2);
        }

        public F.c.a b(String str) {
            if (str != null) {
                this.f63658a = str;
                return this;
            }
            throw new NullPointerException("Null key");
        }

        public F.c.a c(String str) {
            if (str != null) {
                this.f63659b = str;
                return this;
            }
            throw new NullPointerException("Null value");
        }
    }

    public String b() {
        return this.f63656a;
    }

    public String c() {
        return this.f63657b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.c)) {
            return false;
        }
        F.c cVar = (F.c) obj;
        return this.f63656a.equals(cVar.b()) && this.f63657b.equals(cVar.c());
    }

    public int hashCode() {
        return ((this.f63656a.hashCode() ^ 1000003) * 1000003) ^ this.f63657b.hashCode();
    }

    public String toString() {
        return "CustomAttribute{key=" + this.f63656a + ", value=" + this.f63657b + "}";
    }

    private C9277e(String str, String str2) {
        this.f63656a = str;
        this.f63657b = str2;
    }
}

package Tb;

import Tb.F;

final class x extends F.e.d.C1109e.b {

    /* renamed from: a  reason: collision with root package name */
    private final String f63843a;

    /* renamed from: b  reason: collision with root package name */
    private final String f63844b;

    static final class b extends F.e.d.C1109e.b.a {

        /* renamed from: a  reason: collision with root package name */
        private String f63845a;

        /* renamed from: b  reason: collision with root package name */
        private String f63846b;

        b() {
        }

        public F.e.d.C1109e.b a() {
            String str;
            String str2 = this.f63845a;
            if (str2 != null && (str = this.f63846b) != null) {
                return new x(str2, str);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f63845a == null) {
                sb2.append(" rolloutId");
            }
            if (this.f63846b == null) {
                sb2.append(" variantId");
            }
            throw new IllegalStateException("Missing required properties:" + sb2);
        }

        public F.e.d.C1109e.b.a b(String str) {
            if (str != null) {
                this.f63845a = str;
                return this;
            }
            throw new NullPointerException("Null rolloutId");
        }

        public F.e.d.C1109e.b.a c(String str) {
            if (str != null) {
                this.f63846b = str;
                return this;
            }
            throw new NullPointerException("Null variantId");
        }
    }

    public String b() {
        return this.f63843a;
    }

    public String c() {
        return this.f63844b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.C1109e.b)) {
            return false;
        }
        F.e.d.C1109e.b bVar = (F.e.d.C1109e.b) obj;
        return this.f63843a.equals(bVar.b()) && this.f63844b.equals(bVar.c());
    }

    public int hashCode() {
        return ((this.f63843a.hashCode() ^ 1000003) * 1000003) ^ this.f63844b.hashCode();
    }

    public String toString() {
        return "RolloutVariant{rolloutId=" + this.f63843a + ", variantId=" + this.f63844b + "}";
    }

    private x(String str, String str2) {
        this.f63843a = str;
        this.f63844b = str2;
    }
}

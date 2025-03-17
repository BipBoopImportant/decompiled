package Tb;

import Tb.F;

/* renamed from: Tb.d  reason: case insensitive filesystem */
final class C9276d extends F.a.C1093a {

    /* renamed from: a  reason: collision with root package name */
    private final String f63650a;

    /* renamed from: b  reason: collision with root package name */
    private final String f63651b;

    /* renamed from: c  reason: collision with root package name */
    private final String f63652c;

    /* renamed from: Tb.d$b */
    static final class b extends F.a.C1093a.C1094a {

        /* renamed from: a  reason: collision with root package name */
        private String f63653a;

        /* renamed from: b  reason: collision with root package name */
        private String f63654b;

        /* renamed from: c  reason: collision with root package name */
        private String f63655c;

        b() {
        }

        public F.a.C1093a a() {
            String str;
            String str2;
            String str3 = this.f63653a;
            if (str3 != null && (str = this.f63654b) != null && (str2 = this.f63655c) != null) {
                return new C9276d(str3, str, str2);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f63653a == null) {
                sb2.append(" arch");
            }
            if (this.f63654b == null) {
                sb2.append(" libraryName");
            }
            if (this.f63655c == null) {
                sb2.append(" buildId");
            }
            throw new IllegalStateException("Missing required properties:" + sb2);
        }

        public F.a.C1093a.C1094a b(String str) {
            if (str != null) {
                this.f63653a = str;
                return this;
            }
            throw new NullPointerException("Null arch");
        }

        public F.a.C1093a.C1094a c(String str) {
            if (str != null) {
                this.f63655c = str;
                return this;
            }
            throw new NullPointerException("Null buildId");
        }

        public F.a.C1093a.C1094a d(String str) {
            if (str != null) {
                this.f63654b = str;
                return this;
            }
            throw new NullPointerException("Null libraryName");
        }
    }

    public String b() {
        return this.f63650a;
    }

    public String c() {
        return this.f63652c;
    }

    public String d() {
        return this.f63651b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.a.C1093a)) {
            return false;
        }
        F.a.C1093a aVar = (F.a.C1093a) obj;
        return this.f63650a.equals(aVar.b()) && this.f63651b.equals(aVar.d()) && this.f63652c.equals(aVar.c());
    }

    public int hashCode() {
        return ((((this.f63650a.hashCode() ^ 1000003) * 1000003) ^ this.f63651b.hashCode()) * 1000003) ^ this.f63652c.hashCode();
    }

    public String toString() {
        return "BuildIdMappingForArch{arch=" + this.f63650a + ", libraryName=" + this.f63651b + ", buildId=" + this.f63652c + "}";
    }

    private C9276d(String str, String str2, String str3) {
        this.f63650a = str;
        this.f63651b = str2;
        this.f63652c = str3;
    }
}

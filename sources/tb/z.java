package Tb;

import Tb.F;

final class z extends F.e.C1110e {

    /* renamed from: a  reason: collision with root package name */
    private final int f63849a;

    /* renamed from: b  reason: collision with root package name */
    private final String f63850b;

    /* renamed from: c  reason: collision with root package name */
    private final String f63851c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f63852d;

    static final class b extends F.e.C1110e.a {

        /* renamed from: a  reason: collision with root package name */
        private int f63853a;

        /* renamed from: b  reason: collision with root package name */
        private String f63854b;

        /* renamed from: c  reason: collision with root package name */
        private String f63855c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f63856d;

        /* renamed from: e  reason: collision with root package name */
        private byte f63857e;

        b() {
        }

        public F.e.C1110e a() {
            String str;
            String str2;
            if (this.f63857e == 3 && (str = this.f63854b) != null && (str2 = this.f63855c) != null) {
                return new z(this.f63853a, str, str2, this.f63856d);
            }
            StringBuilder sb2 = new StringBuilder();
            if ((this.f63857e & 1) == 0) {
                sb2.append(" platform");
            }
            if (this.f63854b == null) {
                sb2.append(" version");
            }
            if (this.f63855c == null) {
                sb2.append(" buildVersion");
            }
            if ((this.f63857e & 2) == 0) {
                sb2.append(" jailbroken");
            }
            throw new IllegalStateException("Missing required properties:" + sb2);
        }

        public F.e.C1110e.a b(String str) {
            if (str != null) {
                this.f63855c = str;
                return this;
            }
            throw new NullPointerException("Null buildVersion");
        }

        public F.e.C1110e.a c(boolean z10) {
            this.f63856d = z10;
            this.f63857e = (byte) (this.f63857e | 2);
            return this;
        }

        public F.e.C1110e.a d(int i10) {
            this.f63853a = i10;
            this.f63857e = (byte) (this.f63857e | 1);
            return this;
        }

        public F.e.C1110e.a e(String str) {
            if (str != null) {
                this.f63854b = str;
                return this;
            }
            throw new NullPointerException("Null version");
        }
    }

    public String b() {
        return this.f63851c;
    }

    public int c() {
        return this.f63849a;
    }

    public String d() {
        return this.f63850b;
    }

    public boolean e() {
        return this.f63852d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.C1110e)) {
            return false;
        }
        F.e.C1110e eVar = (F.e.C1110e) obj;
        return this.f63849a == eVar.c() && this.f63850b.equals(eVar.d()) && this.f63851c.equals(eVar.b()) && this.f63852d == eVar.e();
    }

    public int hashCode() {
        return ((((((this.f63849a ^ 1000003) * 1000003) ^ this.f63850b.hashCode()) * 1000003) ^ this.f63851c.hashCode()) * 1000003) ^ (this.f63852d ? 1231 : 1237);
    }

    public String toString() {
        return "OperatingSystem{platform=" + this.f63849a + ", version=" + this.f63850b + ", buildVersion=" + this.f63851c + ", jailbroken=" + this.f63852d + "}";
    }

    private z(int i10, String str, String str2, boolean z10) {
        this.f63849a = i10;
        this.f63850b = str;
        this.f63851c = str2;
        this.f63852d = z10;
    }
}

package Q;

import Q.e;

final class a extends e {

    /* renamed from: a  reason: collision with root package name */
    private final String f11890a;

    /* renamed from: b  reason: collision with root package name */
    private final String f11891b;

    /* renamed from: c  reason: collision with root package name */
    private final String f11892c;

    /* renamed from: d  reason: collision with root package name */
    private final String f11893d;

    static final class b extends e.a {

        /* renamed from: a  reason: collision with root package name */
        private String f11894a;

        /* renamed from: b  reason: collision with root package name */
        private String f11895b;

        /* renamed from: c  reason: collision with root package name */
        private String f11896c;

        /* renamed from: d  reason: collision with root package name */
        private String f11897d;

        b() {
        }

        public e a() {
            String str = "";
            if (this.f11894a == null) {
                str = str + " glVersion";
            }
            if (this.f11895b == null) {
                str = str + " eglVersion";
            }
            if (this.f11896c == null) {
                str = str + " glExtensions";
            }
            if (this.f11897d == null) {
                str = str + " eglExtensions";
            }
            if (str.isEmpty()) {
                return new a(this.f11894a, this.f11895b, this.f11896c, this.f11897d);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        public e.a b(String str) {
            if (str != null) {
                this.f11897d = str;
                return this;
            }
            throw new NullPointerException("Null eglExtensions");
        }

        public e.a c(String str) {
            if (str != null) {
                this.f11895b = str;
                return this;
            }
            throw new NullPointerException("Null eglVersion");
        }

        public e.a d(String str) {
            if (str != null) {
                this.f11896c = str;
                return this;
            }
            throw new NullPointerException("Null glExtensions");
        }

        public e.a e(String str) {
            if (str != null) {
                this.f11894a = str;
                return this;
            }
            throw new NullPointerException("Null glVersion");
        }
    }

    public String b() {
        return this.f11893d;
    }

    public String c() {
        return this.f11891b;
    }

    public String d() {
        return this.f11892c;
    }

    public String e() {
        return this.f11890a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f11890a.equals(eVar.e()) && this.f11891b.equals(eVar.c()) && this.f11892c.equals(eVar.d()) && this.f11893d.equals(eVar.b());
    }

    public int hashCode() {
        return ((((((this.f11890a.hashCode() ^ 1000003) * 1000003) ^ this.f11891b.hashCode()) * 1000003) ^ this.f11892c.hashCode()) * 1000003) ^ this.f11893d.hashCode();
    }

    public String toString() {
        return "GraphicDeviceInfo{glVersion=" + this.f11890a + ", eglVersion=" + this.f11891b + ", glExtensions=" + this.f11892c + ", eglExtensions=" + this.f11893d + "}";
    }

    private a(String str, String str2, String str3, String str4) {
        this.f11890a = str;
        this.f11891b = str2;
        this.f11892c = str3;
        this.f11893d = str4;
    }
}

package Tb;

import Tb.F;

final class A extends F.e.f {

    /* renamed from: a  reason: collision with root package name */
    private final String f63435a;

    static final class b extends F.e.f.a {

        /* renamed from: a  reason: collision with root package name */
        private String f63436a;

        b() {
        }

        public F.e.f a() {
            String str = this.f63436a;
            if (str != null) {
                return new A(str);
            }
            throw new IllegalStateException("Missing required properties:" + " identifier");
        }

        public F.e.f.a b(String str) {
            if (str != null) {
                this.f63436a = str;
                return this;
            }
            throw new NullPointerException("Null identifier");
        }
    }

    public String b() {
        return this.f63435a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.f) {
            return this.f63435a.equals(((F.e.f) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f63435a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "User{identifier=" + this.f63435a + "}";
    }

    private A(String str) {
        this.f63435a = str;
    }
}

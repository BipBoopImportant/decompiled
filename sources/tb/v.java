package Tb;

import Tb.F;

final class v extends F.e.d.C1108d {

    /* renamed from: a  reason: collision with root package name */
    private final String f63832a;

    static final class b extends F.e.d.C1108d.a {

        /* renamed from: a  reason: collision with root package name */
        private String f63833a;

        b() {
        }

        public F.e.d.C1108d a() {
            String str = this.f63833a;
            if (str != null) {
                return new v(str);
            }
            throw new IllegalStateException("Missing required properties:" + " content");
        }

        public F.e.d.C1108d.a b(String str) {
            if (str != null) {
                this.f63833a = str;
                return this;
            }
            throw new NullPointerException("Null content");
        }
    }

    public String b() {
        return this.f63832a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F.e.d.C1108d) {
            return this.f63832a.equals(((F.e.d.C1108d) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f63832a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Log{content=" + this.f63832a + "}";
    }

    private v(String str) {
        this.f63832a = str;
    }
}

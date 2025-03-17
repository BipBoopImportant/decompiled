package Tb;

import Tb.F;
import java.util.List;

final class r extends F.e.d.a.b.C1103e {

    /* renamed from: a  reason: collision with root package name */
    private final String f63792a;

    /* renamed from: b  reason: collision with root package name */
    private final int f63793b;

    /* renamed from: c  reason: collision with root package name */
    private final List<F.e.d.a.b.C1103e.C1105b> f63794c;

    static final class b extends F.e.d.a.b.C1103e.C1104a {

        /* renamed from: a  reason: collision with root package name */
        private String f63795a;

        /* renamed from: b  reason: collision with root package name */
        private int f63796b;

        /* renamed from: c  reason: collision with root package name */
        private List<F.e.d.a.b.C1103e.C1105b> f63797c;

        /* renamed from: d  reason: collision with root package name */
        private byte f63798d;

        b() {
        }

        public F.e.d.a.b.C1103e a() {
            String str;
            List<F.e.d.a.b.C1103e.C1105b> list;
            if (this.f63798d == 1 && (str = this.f63795a) != null && (list = this.f63797c) != null) {
                return new r(str, this.f63796b, list);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f63795a == null) {
                sb2.append(" name");
            }
            if ((1 & this.f63798d) == 0) {
                sb2.append(" importance");
            }
            if (this.f63797c == null) {
                sb2.append(" frames");
            }
            throw new IllegalStateException("Missing required properties:" + sb2);
        }

        public F.e.d.a.b.C1103e.C1104a b(List<F.e.d.a.b.C1103e.C1105b> list) {
            if (list != null) {
                this.f63797c = list;
                return this;
            }
            throw new NullPointerException("Null frames");
        }

        public F.e.d.a.b.C1103e.C1104a c(int i10) {
            this.f63796b = i10;
            this.f63798d = (byte) (this.f63798d | 1);
            return this;
        }

        public F.e.d.a.b.C1103e.C1104a d(String str) {
            if (str != null) {
                this.f63795a = str;
                return this;
            }
            throw new NullPointerException("Null name");
        }
    }

    public List<F.e.d.a.b.C1103e.C1105b> b() {
        return this.f63794c;
    }

    public int c() {
        return this.f63793b;
    }

    public String d() {
        return this.f63792a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.a.b.C1103e)) {
            return false;
        }
        F.e.d.a.b.C1103e eVar = (F.e.d.a.b.C1103e) obj;
        return this.f63792a.equals(eVar.d()) && this.f63793b == eVar.c() && this.f63794c.equals(eVar.b());
    }

    public int hashCode() {
        return ((((this.f63792a.hashCode() ^ 1000003) * 1000003) ^ this.f63793b) * 1000003) ^ this.f63794c.hashCode();
    }

    public String toString() {
        return "Thread{name=" + this.f63792a + ", importance=" + this.f63793b + ", frames=" + this.f63794c + "}";
    }

    private r(String str, int i10, List<F.e.d.a.b.C1103e.C1105b> list) {
        this.f63792a = str;
        this.f63793b = i10;
        this.f63794c = list;
    }
}

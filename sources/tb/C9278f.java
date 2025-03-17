package Tb;

import Tb.F;
import java.util.List;

/* renamed from: Tb.f  reason: case insensitive filesystem */
final class C9278f extends F.d {

    /* renamed from: a  reason: collision with root package name */
    private final List<F.d.b> f63660a;

    /* renamed from: b  reason: collision with root package name */
    private final String f63661b;

    /* renamed from: Tb.f$b */
    static final class b extends F.d.a {

        /* renamed from: a  reason: collision with root package name */
        private List<F.d.b> f63662a;

        /* renamed from: b  reason: collision with root package name */
        private String f63663b;

        b() {
        }

        public F.d a() {
            List<F.d.b> list = this.f63662a;
            if (list != null) {
                return new C9278f(list, this.f63663b);
            }
            throw new IllegalStateException("Missing required properties:" + " files");
        }

        public F.d.a b(List<F.d.b> list) {
            if (list != null) {
                this.f63662a = list;
                return this;
            }
            throw new NullPointerException("Null files");
        }

        public F.d.a c(String str) {
            this.f63663b = str;
            return this;
        }
    }

    public List<F.d.b> b() {
        return this.f63660a;
    }

    public String c() {
        return this.f63661b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.d)) {
            return false;
        }
        F.d dVar = (F.d) obj;
        if (this.f63660a.equals(dVar.b())) {
            String str = this.f63661b;
            if (str == null) {
                if (dVar.c() == null) {
                    return true;
                }
            } else if (str.equals(dVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (this.f63660a.hashCode() ^ 1000003) * 1000003;
        String str = this.f63661b;
        return hashCode ^ (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "FilesPayload{files=" + this.f63660a + ", orgId=" + this.f63661b + "}";
    }

    private C9278f(List<F.d.b> list, String str) {
        this.f63660a = list;
        this.f63661b = str;
    }
}

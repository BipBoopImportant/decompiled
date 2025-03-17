package Tb;

import Tb.F;
import java.util.List;

final class n extends F.e.d.a.b {

    /* renamed from: a  reason: collision with root package name */
    private final List<F.e.d.a.b.C1103e> f63755a;

    /* renamed from: b  reason: collision with root package name */
    private final F.e.d.a.b.c f63756b;

    /* renamed from: c  reason: collision with root package name */
    private final F.a f63757c;

    /* renamed from: d  reason: collision with root package name */
    private final F.e.d.a.b.C1101d f63758d;

    /* renamed from: e  reason: collision with root package name */
    private final List<F.e.d.a.b.C1097a> f63759e;

    static final class b extends F.e.d.a.b.C1099b {

        /* renamed from: a  reason: collision with root package name */
        private List<F.e.d.a.b.C1103e> f63760a;

        /* renamed from: b  reason: collision with root package name */
        private F.e.d.a.b.c f63761b;

        /* renamed from: c  reason: collision with root package name */
        private F.a f63762c;

        /* renamed from: d  reason: collision with root package name */
        private F.e.d.a.b.C1101d f63763d;

        /* renamed from: e  reason: collision with root package name */
        private List<F.e.d.a.b.C1097a> f63764e;

        b() {
        }

        public F.e.d.a.b a() {
            List<F.e.d.a.b.C1097a> list;
            F.e.d.a.b.C1101d dVar = this.f63763d;
            if (dVar != null && (list = this.f63764e) != null) {
                return new n(this.f63760a, this.f63761b, this.f63762c, dVar, list);
            }
            StringBuilder sb2 = new StringBuilder();
            if (this.f63763d == null) {
                sb2.append(" signal");
            }
            if (this.f63764e == null) {
                sb2.append(" binaries");
            }
            throw new IllegalStateException("Missing required properties:" + sb2);
        }

        public F.e.d.a.b.C1099b b(F.a aVar) {
            this.f63762c = aVar;
            return this;
        }

        public F.e.d.a.b.C1099b c(List<F.e.d.a.b.C1097a> list) {
            if (list != null) {
                this.f63764e = list;
                return this;
            }
            throw new NullPointerException("Null binaries");
        }

        public F.e.d.a.b.C1099b d(F.e.d.a.b.c cVar) {
            this.f63761b = cVar;
            return this;
        }

        public F.e.d.a.b.C1099b e(F.e.d.a.b.C1101d dVar) {
            if (dVar != null) {
                this.f63763d = dVar;
                return this;
            }
            throw new NullPointerException("Null signal");
        }

        public F.e.d.a.b.C1099b f(List<F.e.d.a.b.C1103e> list) {
            this.f63760a = list;
            return this;
        }
    }

    public F.a b() {
        return this.f63757c;
    }

    public List<F.e.d.a.b.C1097a> c() {
        return this.f63759e;
    }

    public F.e.d.a.b.c d() {
        return this.f63756b;
    }

    public F.e.d.a.b.C1101d e() {
        return this.f63758d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof F.e.d.a.b)) {
            return false;
        }
        F.e.d.a.b bVar = (F.e.d.a.b) obj;
        List<F.e.d.a.b.C1103e> list = this.f63755a;
        if (list != null ? list.equals(bVar.f()) : bVar.f() == null) {
            F.e.d.a.b.c cVar = this.f63756b;
            if (cVar != null ? cVar.equals(bVar.d()) : bVar.d() == null) {
                F.a aVar = this.f63757c;
                if (aVar != null ? aVar.equals(bVar.b()) : bVar.b() == null) {
                    if (this.f63758d.equals(bVar.e()) && this.f63759e.equals(bVar.c())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public List<F.e.d.a.b.C1103e> f() {
        return this.f63755a;
    }

    public int hashCode() {
        List<F.e.d.a.b.C1103e> list = this.f63755a;
        int i10 = 0;
        int hashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        F.e.d.a.b.c cVar = this.f63756b;
        int hashCode2 = (hashCode ^ (cVar == null ? 0 : cVar.hashCode())) * 1000003;
        F.a aVar = this.f63757c;
        if (aVar != null) {
            i10 = aVar.hashCode();
        }
        return ((((hashCode2 ^ i10) * 1000003) ^ this.f63758d.hashCode()) * 1000003) ^ this.f63759e.hashCode();
    }

    public String toString() {
        return "Execution{threads=" + this.f63755a + ", exception=" + this.f63756b + ", appExitInfo=" + this.f63757c + ", signal=" + this.f63758d + ", binaries=" + this.f63759e + "}";
    }

    private n(List<F.e.d.a.b.C1103e> list, F.e.d.a.b.c cVar, F.a aVar, F.e.d.a.b.C1101d dVar, List<F.e.d.a.b.C1097a> list2) {
        this.f63755a = list;
        this.f63756b = cVar;
        this.f63757c = aVar;
        this.f63758d = dVar;
        this.f63759e = list2;
    }
}

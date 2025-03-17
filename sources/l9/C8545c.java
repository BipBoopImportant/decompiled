package l9;

import j9.c;
import j9.d;
import j9.h;
import l9.o;

/* renamed from: l9.c  reason: case insensitive filesystem */
final class C8545c extends o {

    /* renamed from: a  reason: collision with root package name */
    private final p f54860a;

    /* renamed from: b  reason: collision with root package name */
    private final String f54861b;

    /* renamed from: c  reason: collision with root package name */
    private final d<?> f54862c;

    /* renamed from: d  reason: collision with root package name */
    private final h<?, byte[]> f54863d;

    /* renamed from: e  reason: collision with root package name */
    private final c f54864e;

    /* renamed from: l9.c$b */
    static final class b extends o.a {

        /* renamed from: a  reason: collision with root package name */
        private p f54865a;

        /* renamed from: b  reason: collision with root package name */
        private String f54866b;

        /* renamed from: c  reason: collision with root package name */
        private d<?> f54867c;

        /* renamed from: d  reason: collision with root package name */
        private h<?, byte[]> f54868d;

        /* renamed from: e  reason: collision with root package name */
        private c f54869e;

        b() {
        }

        public o a() {
            String str = "";
            if (this.f54865a == null) {
                str = str + " transportContext";
            }
            if (this.f54866b == null) {
                str = str + " transportName";
            }
            if (this.f54867c == null) {
                str = str + " event";
            }
            if (this.f54868d == null) {
                str = str + " transformer";
            }
            if (this.f54869e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new C8545c(this.f54865a, this.f54866b, this.f54867c, this.f54868d, this.f54869e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        /* access modifiers changed from: package-private */
        public o.a b(c cVar) {
            if (cVar != null) {
                this.f54869e = cVar;
                return this;
            }
            throw new NullPointerException("Null encoding");
        }

        /* access modifiers changed from: package-private */
        public o.a c(d<?> dVar) {
            if (dVar != null) {
                this.f54867c = dVar;
                return this;
            }
            throw new NullPointerException("Null event");
        }

        /* access modifiers changed from: package-private */
        public o.a d(h<?, byte[]> hVar) {
            if (hVar != null) {
                this.f54868d = hVar;
                return this;
            }
            throw new NullPointerException("Null transformer");
        }

        public o.a e(p pVar) {
            if (pVar != null) {
                this.f54865a = pVar;
                return this;
            }
            throw new NullPointerException("Null transportContext");
        }

        public o.a f(String str) {
            if (str != null) {
                this.f54866b = str;
                return this;
            }
            throw new NullPointerException("Null transportName");
        }
    }

    public c b() {
        return this.f54864e;
    }

    /* access modifiers changed from: package-private */
    public d<?> c() {
        return this.f54862c;
    }

    /* access modifiers changed from: package-private */
    public h<?, byte[]> e() {
        return this.f54863d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f54860a.equals(oVar.f()) && this.f54861b.equals(oVar.g()) && this.f54862c.equals(oVar.c()) && this.f54863d.equals(oVar.e()) && this.f54864e.equals(oVar.b());
    }

    public p f() {
        return this.f54860a;
    }

    public String g() {
        return this.f54861b;
    }

    public int hashCode() {
        return ((((((((this.f54860a.hashCode() ^ 1000003) * 1000003) ^ this.f54861b.hashCode()) * 1000003) ^ this.f54862c.hashCode()) * 1000003) ^ this.f54863d.hashCode()) * 1000003) ^ this.f54864e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f54860a + ", transportName=" + this.f54861b + ", event=" + this.f54862c + ", transformer=" + this.f54863d + ", encoding=" + this.f54864e + "}";
    }

    private C8545c(p pVar, String str, d<?> dVar, h<?, byte[]> hVar, c cVar) {
        this.f54860a = pVar;
        this.f54861b = str;
        this.f54862c = dVar;
        this.f54863d = hVar;
        this.f54864e = cVar;
    }
}

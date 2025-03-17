package DE;

import java.util.Map;
import java.util.StringJoiner;

/* renamed from: DE.d  reason: case insensitive filesystem */
public class C12749d extends C12746a implements h {

    /* renamed from: c  reason: collision with root package name */
    private final g f108612c;

    /* renamed from: d  reason: collision with root package name */
    private final String f108613d;

    /* renamed from: e  reason: collision with root package name */
    private final String f108614e;

    /* renamed from: f  reason: collision with root package name */
    private final Number f108615f;

    /* renamed from: g  reason: collision with root package name */
    private final Number f108616g;

    /* renamed from: h  reason: collision with root package name */
    private final Map<String, ?> f108617h;

    /* renamed from: DE.d$b */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private g f108618a;

        /* renamed from: b  reason: collision with root package name */
        private String f108619b;

        /* renamed from: c  reason: collision with root package name */
        private String f108620c;

        /* renamed from: d  reason: collision with root package name */
        private Number f108621d;

        /* renamed from: e  reason: collision with root package name */
        private Number f108622e;

        /* renamed from: f  reason: collision with root package name */
        private Map<String, ?> f108623f;

        public C12749d a() {
            return new C12749d(this.f108618a, this.f108619b, this.f108620c, this.f108621d, this.f108622e, this.f108623f);
        }

        public b b(String str) {
            this.f108619b = str;
            return this;
        }

        public b c(String str) {
            this.f108620c = str;
            return this;
        }

        public b d(Number number) {
            this.f108621d = number;
            return this;
        }

        public b e(Map<String, ?> map) {
            this.f108623f = map;
            return this;
        }

        public b f(g gVar) {
            this.f108618a = gVar;
            return this;
        }

        public b g(Number number) {
            this.f108622e = number;
            return this;
        }
    }

    public g a() {
        return this.f108612c;
    }

    public String d() {
        return this.f108613d;
    }

    public String e() {
        return this.f108614e;
    }

    public Number f() {
        return this.f108615f;
    }

    public Map<String, ?> g() {
        return this.f108617h;
    }

    public Number h() {
        return this.f108616g;
    }

    public String toString() {
        StringJoiner stringJoiner = new StringJoiner(", ", C12749d.class.getSimpleName() + "[", "]");
        StringJoiner add = stringJoiner.add("userContext=" + this.f108612c);
        StringJoiner add2 = add.add("eventId='" + this.f108613d + "'");
        StringJoiner add3 = add2.add("eventKey='" + this.f108614e + "'");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("revenue=");
        sb2.append(this.f108615f);
        StringJoiner add4 = add3.add(sb2.toString());
        StringJoiner add5 = add4.add("value=" + this.f108616g);
        return add5.add("tags=" + this.f108617h).toString();
    }

    private C12749d(g gVar, String str, String str2, Number number, Number number2, Map<String, ?> map) {
        this.f108612c = gVar;
        this.f108613d = str;
        this.f108614e = str2;
        this.f108615f = number;
        this.f108616g = number2;
        this.f108617h = map;
    }
}

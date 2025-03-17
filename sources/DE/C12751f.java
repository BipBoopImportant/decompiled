package DE;

import com.optimizely.ab.event.internal.payload.DecisionMetadata;
import java.util.StringJoiner;

/* renamed from: DE.f  reason: case insensitive filesystem */
public class C12751f extends C12746a implements h {

    /* renamed from: c  reason: collision with root package name */
    private final g f108625c;

    /* renamed from: d  reason: collision with root package name */
    private final String f108626d;

    /* renamed from: e  reason: collision with root package name */
    private final String f108627e;

    /* renamed from: f  reason: collision with root package name */
    private final String f108628f;

    /* renamed from: g  reason: collision with root package name */
    private final String f108629g;

    /* renamed from: h  reason: collision with root package name */
    private final String f108630h;

    /* renamed from: i  reason: collision with root package name */
    private final DecisionMetadata f108631i;

    /* renamed from: DE.f$b */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        private g f108632a;

        /* renamed from: b  reason: collision with root package name */
        private String f108633b;

        /* renamed from: c  reason: collision with root package name */
        private String f108634c;

        /* renamed from: d  reason: collision with root package name */
        private String f108635d;

        /* renamed from: e  reason: collision with root package name */
        private String f108636e;

        /* renamed from: f  reason: collision with root package name */
        private String f108637f;

        /* renamed from: g  reason: collision with root package name */
        private DecisionMetadata f108638g;

        public C12751f a() {
            return new C12751f(this.f108632a, this.f108633b, this.f108634c, this.f108635d, this.f108636e, this.f108637f, this.f108638g);
        }

        public b b(String str) {
            this.f108634c = str;
            return this;
        }

        public b c(String str) {
            this.f108635d = str;
            return this;
        }

        public b d(String str) {
            this.f108633b = str;
            return this;
        }

        public b e(DecisionMetadata decisionMetadata) {
            this.f108638g = decisionMetadata;
            return this;
        }

        public b f(g gVar) {
            this.f108632a = gVar;
            return this;
        }

        public b g(String str) {
            this.f108637f = str;
            return this;
        }

        public b h(String str) {
            this.f108636e = str;
            return this;
        }
    }

    public g a() {
        return this.f108625c;
    }

    public String d() {
        return this.f108627e;
    }

    public String e() {
        return this.f108626d;
    }

    public DecisionMetadata f() {
        return this.f108631i;
    }

    public String g() {
        return this.f108630h;
    }

    public String toString() {
        StringJoiner stringJoiner = new StringJoiner(", ", C12751f.class.getSimpleName() + "[", "]");
        StringJoiner add = stringJoiner.add("userContext=" + this.f108625c);
        StringJoiner add2 = add.add("layerId='" + this.f108626d + "'");
        StringJoiner add3 = add2.add("experimentId='" + this.f108627e + "'");
        StringJoiner add4 = add3.add("experimentKey='" + this.f108628f + "'");
        StringJoiner add5 = add4.add("variationKey='" + this.f108629g + "'");
        return add5.add("variationId='" + this.f108630h + "'").toString();
    }

    private C12751f(g gVar, String str, String str2, String str3, String str4, String str5, DecisionMetadata decisionMetadata) {
        this.f108625c = gVar;
        this.f108626d = str;
        this.f108627e = str2;
        this.f108628f = str3;
        this.f108629g = str4;
        this.f108630h = str5;
        this.f108631i = decisionMetadata;
    }
}

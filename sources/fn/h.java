package Fn;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001:\u0003\u0014\u0019\u0017B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u0017\u0010\u001aR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001b\u0010\u001a¨\u0006\u001c"}, d2 = {"LFn/h;", "", "LFn/h$a;", "currentPrice", "", "totalSavings", "familySavings", "upsellSavings", "<init>", "(LFn/h$a;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LFn/h$a;", "()LFn/h$a;", "b", "Ljava/lang/Double;", "c", "()Ljava/lang/Double;", "d", "caas_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final a f80980a;

    /* renamed from: b  reason: collision with root package name */
    private final Double f80981b;

    /* renamed from: c  reason: collision with root package name */
    private final Double f80982c;

    /* renamed from: d  reason: collision with root package name */
    private final Double f80983d;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u0019\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018¨\u0006\u001d"}, d2 = {"LFn/h$a;", "", "LFn/h$c;", "totalPrice", "totalProductExclDiscount", "", "LFn/h$b;", "discountSummaries", "assemblyPrice", "<init>", "(LFn/h$c;LFn/h$c;Ljava/util/List;LFn/h$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "LFn/h$c;", "c", "()LFn/h$c;", "b", "d", "Ljava/util/List;", "()Ljava/util/List;", "caas_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final c f80984a;

        /* renamed from: b  reason: collision with root package name */
        private final c f80985b;

        /* renamed from: c  reason: collision with root package name */
        private final List<b> f80986c;

        /* renamed from: d  reason: collision with root package name */
        private final c f80987d;

        public a(c cVar, c cVar2, List<b> list, c cVar3) {
            C17542s.j(cVar, "totalPrice");
            C17542s.j(list, "discountSummaries");
            this.f80984a = cVar;
            this.f80985b = cVar2;
            this.f80986c = list;
            this.f80987d = cVar3;
        }

        public final c a() {
            return this.f80987d;
        }

        public final List<b> b() {
            return this.f80986c;
        }

        public final c c() {
            return this.f80984a;
        }

        public final c d() {
            return this.f80985b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f80984a, aVar.f80984a) && C17542s.e(this.f80985b, aVar.f80985b) && C17542s.e(this.f80986c, aVar.f80986c) && C17542s.e(this.f80987d, aVar.f80987d);
        }

        public int hashCode() {
            int hashCode = this.f80984a.hashCode() * 31;
            c cVar = this.f80985b;
            int i10 = 0;
            int hashCode2 = (((hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31) + this.f80986c.hashCode()) * 31;
            c cVar2 = this.f80987d;
            if (cVar2 != null) {
                i10 = cVar2.hashCode();
            }
            return hashCode2 + i10;
        }

        public String toString() {
            c cVar = this.f80984a;
            c cVar2 = this.f80985b;
            List<b> list = this.f80986c;
            c cVar3 = this.f80987d;
            return "CartReceiptPrice(totalPrice=" + cVar + ", totalProductExclDiscount=" + cVar2 + ", discountSummaries=" + list + ", assemblyPrice=" + cVar3 + ")";
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0017\u0010\n¨\u0006\u0018"}, d2 = {"LFn/h$b;", "", "", "amount", "", "couponCode", "description", "<init>", "(DLjava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "()D", "b", "Ljava/lang/String;", "c", "caas_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private final double f80988a;

        /* renamed from: b  reason: collision with root package name */
        private final String f80989b;

        /* renamed from: c  reason: collision with root package name */
        private final String f80990c;

        public b(double d10, String str, String str2) {
            this.f80988a = d10;
            this.f80989b = str;
            this.f80990c = str2;
        }

        public final double a() {
            return this.f80988a;
        }

        public final String b() {
            return this.f80989b;
        }

        public final String c() {
            return this.f80990c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Double.compare(this.f80988a, bVar.f80988a) == 0 && C17542s.e(this.f80989b, bVar.f80989b) && C17542s.e(this.f80990c, bVar.f80990c);
        }

        public int hashCode() {
            int hashCode = Double.hashCode(this.f80988a) * 31;
            String str = this.f80989b;
            int i10 = 0;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f80990c;
            if (str2 != null) {
                i10 = str2.hashCode();
            }
            return hashCode2 + i10;
        }

        public String toString() {
            double d10 = this.f80988a;
            String str = this.f80989b;
            String str2 = this.f80990c;
            return "DiscountSummary(amount=" + d10 + ", couponCode=" + str + ", description=" + str2 + ")";
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0018\u0010\u0015¨\u0006\u0019"}, d2 = {"LFn/h$c;", "", "", "inclTax", "exclTax", "tax", "<init>", "(Ljava/lang/Double;DLjava/lang/Double;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Double;", "b", "()Ljava/lang/Double;", "D", "()D", "c", "caas_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final Double f80991a;

        /* renamed from: b  reason: collision with root package name */
        private final double f80992b;

        /* renamed from: c  reason: collision with root package name */
        private final Double f80993c;

        public c(Double d10, double d11, Double d12) {
            this.f80991a = d10;
            this.f80992b = d11;
            this.f80993c = d12;
        }

        public final double a() {
            return this.f80992b;
        }

        public final Double b() {
            return this.f80991a;
        }

        public final Double c() {
            return this.f80993c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return C17542s.e(this.f80991a, cVar.f80991a) && Double.compare(this.f80992b, cVar.f80992b) == 0 && C17542s.e(this.f80993c, cVar.f80993c);
        }

        public int hashCode() {
            Double d10 = this.f80991a;
            int i10 = 0;
            int hashCode = (((d10 == null ? 0 : d10.hashCode()) * 31) + Double.hashCode(this.f80992b)) * 31;
            Double d11 = this.f80993c;
            if (d11 != null) {
                i10 = d11.hashCode();
            }
            return hashCode + i10;
        }

        public String toString() {
            Double d10 = this.f80991a;
            double d11 = this.f80992b;
            Double d12 = this.f80993c;
            return "Price(inclTax=" + d10 + ", exclTax=" + d11 + ", tax=" + d12 + ")";
        }
    }

    public h(a aVar, Double d10, Double d11, Double d12) {
        C17542s.j(aVar, "currentPrice");
        this.f80980a = aVar;
        this.f80981b = d10;
        this.f80982c = d11;
        this.f80983d = d12;
    }

    public final a a() {
        return this.f80980a;
    }

    public final Double b() {
        return this.f80982c;
    }

    public final Double c() {
        return this.f80981b;
    }

    public final Double d() {
        return this.f80983d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return C17542s.e(this.f80980a, hVar.f80980a) && C17542s.e(this.f80981b, hVar.f80981b) && C17542s.e(this.f80982c, hVar.f80982c) && C17542s.e(this.f80983d, hVar.f80983d);
    }

    public int hashCode() {
        int hashCode = this.f80980a.hashCode() * 31;
        Double d10 = this.f80981b;
        int i10 = 0;
        int hashCode2 = (hashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.f80982c;
        int hashCode3 = (hashCode2 + (d11 == null ? 0 : d11.hashCode())) * 31;
        Double d12 = this.f80983d;
        if (d12 != null) {
            i10 = d12.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        a aVar = this.f80980a;
        Double d10 = this.f80981b;
        Double d11 = this.f80982c;
        Double d12 = this.f80983d;
        return "CaasTotalPrice(currentPrice=" + aVar + ", totalSavings=" + d10 + ", familySavings=" + d11 + ", upsellSavings=" + d12 + ")";
    }
}

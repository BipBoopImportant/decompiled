package vh;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001:\u0001\u0010B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lvh/X;", "", "Lvh/X$a;", "priceExclSavings", "<init>", "(Lvh/X$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lvh/X$a;", "()Lvh/X$a;", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class X {

    /* renamed from: a  reason: collision with root package name */
    private final a f77323a;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u0017"}, d2 = {"Lvh/X$a;", "", "", "inclTax", "exclTax", "tax", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Double;", "b", "()Ljava/lang/Double;", "c", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final Double f77324a;

        /* renamed from: b  reason: collision with root package name */
        private final Double f77325b;

        /* renamed from: c  reason: collision with root package name */
        private final Double f77326c;

        public a(Double d10, Double d11, Double d12) {
            this.f77324a = d10;
            this.f77325b = d11;
            this.f77326c = d12;
        }

        public final Double a() {
            return this.f77325b;
        }

        public final Double b() {
            return this.f77324a;
        }

        public final Double c() {
            return this.f77326c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return C17542s.e(this.f77324a, aVar.f77324a) && C17542s.e(this.f77325b, aVar.f77325b) && C17542s.e(this.f77326c, aVar.f77326c);
        }

        public int hashCode() {
            Double d10 = this.f77324a;
            int i10 = 0;
            int hashCode = (d10 == null ? 0 : d10.hashCode()) * 31;
            Double d11 = this.f77325b;
            int hashCode2 = (hashCode + (d11 == null ? 0 : d11.hashCode())) * 31;
            Double d12 = this.f77326c;
            if (d12 != null) {
                i10 = d12.hashCode();
            }
            return hashCode2 + i10;
        }

        public String toString() {
            Double d10 = this.f77324a;
            Double d11 = this.f77325b;
            Double d12 = this.f77326c;
            return "PriceExclSavings(inclTax=" + d10 + ", exclTax=" + d11 + ", tax=" + d12 + ")";
        }
    }

    public X(a aVar) {
        this.f77323a = aVar;
    }

    public final a a() {
        return this.f77323a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof X) && C17542s.e(this.f77323a, ((X) obj).f77323a);
    }

    public int hashCode() {
        a aVar = this.f77323a;
        if (aVar == null) {
            return 0;
        }
        return aVar.hashCode();
    }

    public String toString() {
        a aVar = this.f77323a;
        return "PriceExclSavingsFragment(priceExclSavings=" + aVar + ")";
    }
}

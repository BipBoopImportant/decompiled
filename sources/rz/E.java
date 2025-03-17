package rz;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018¨\u0006\u0019"}, d2 = {"Lrz/E;", "", "", "totalPriceInclVat", "totalPriceExclVat", "familyUpsellDiscount", "<init>", "(DDLjava/lang/Double;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "c", "()D", "b", "Ljava/lang/Double;", "()Ljava/lang/Double;", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class E {

    /* renamed from: a  reason: collision with root package name */
    private final double f130721a;

    /* renamed from: b  reason: collision with root package name */
    private final double f130722b;

    /* renamed from: c  reason: collision with root package name */
    private final Double f130723c;

    public E(double d10, double d11, Double d12) {
        this.f130721a = d10;
        this.f130722b = d11;
        this.f130723c = d12;
    }

    public final Double a() {
        return this.f130723c;
    }

    public final double b() {
        return this.f130722b;
    }

    public final double c() {
        return this.f130721a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e10 = (E) obj;
        return Double.compare(this.f130721a, e10.f130721a) == 0 && Double.compare(this.f130722b, e10.f130722b) == 0 && C17542s.e(this.f130723c, e10.f130723c);
    }

    public int hashCode() {
        int hashCode = ((Double.hashCode(this.f130721a) * 31) + Double.hashCode(this.f130722b)) * 31;
        Double d10 = this.f130723c;
        return hashCode + (d10 == null ? 0 : d10.hashCode());
    }

    public String toString() {
        double d10 = this.f130721a;
        double d11 = this.f130722b;
        Double d12 = this.f130723c;
        return "ScanAndGoCurrentTotalPricing(totalPriceInclVat=" + d10 + ", totalPriceExclVat=" + d11 + ", familyUpsellDiscount=" + d12 + ")";
    }
}

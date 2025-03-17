package Ah;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0017"}, d2 = {"LAh/w;", "", "", "exclTax", "inclTax", "<init>", "(DLjava/lang/Double;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "()D", "b", "Ljava/lang/Double;", "()Ljava/lang/Double;", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class w {

    /* renamed from: a  reason: collision with root package name */
    private final double f58859a;

    /* renamed from: b  reason: collision with root package name */
    private final Double f58860b;

    public w(double d10, Double d11) {
        this.f58859a = d10;
        this.f58860b = d11;
    }

    public final double a() {
        return this.f58859a;
    }

    public final Double b() {
        return this.f58860b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return Double.compare(this.f58859a, wVar.f58859a) == 0 && C17542s.e(this.f58860b, wVar.f58860b);
    }

    public int hashCode() {
        int hashCode = Double.hashCode(this.f58859a) * 31;
        Double d10 = this.f58860b;
        return hashCode + (d10 == null ? 0 : d10.hashCode());
    }

    public String toString() {
        double d10 = this.f58859a;
        Double d11 = this.f58860b;
        return "PriceFragment(exclTax=" + d10 + ", inclTax=" + d11 + ")";
    }
}

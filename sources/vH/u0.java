package vh;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0011\u0010\u0014¨\u0006\u0015"}, d2 = {"Lvh/u0;", "", "", "inclTax", "exclTax", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Double;", "b", "()Ljava/lang/Double;", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class u0 {

    /* renamed from: a  reason: collision with root package name */
    private final Double f77555a;

    /* renamed from: b  reason: collision with root package name */
    private final Double f77556b;

    public u0(Double d10, Double d11) {
        this.f77555a = d10;
        this.f77556b = d11;
    }

    public final Double a() {
        return this.f77556b;
    }

    public final Double b() {
        return this.f77555a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj;
        return C17542s.e(this.f77555a, u0Var.f77555a) && C17542s.e(this.f77556b, u0Var.f77556b);
    }

    public int hashCode() {
        Double d10 = this.f77555a;
        int i10 = 0;
        int hashCode = (d10 == null ? 0 : d10.hashCode()) * 31;
        Double d11 = this.f77556b;
        if (d11 != null) {
            i10 = d11.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        Double d10 = this.f77555a;
        Double d11 = this.f77556b;
        return "SolutionPriceFragment(inclTax=" + d10 + ", exclTax=" + d11 + ")";
    }
}

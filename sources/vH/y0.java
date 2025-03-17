package vh;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"Lvh/y0;", "", "", "taxType", "", "totalTaxAmount", "<init>", "(Ljava/lang/String;Ljava/lang/Double;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Ljava/lang/Double;", "()Ljava/lang/Double;", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class y0 {

    /* renamed from: a  reason: collision with root package name */
    private final String f77574a;

    /* renamed from: b  reason: collision with root package name */
    private final Double f77575b;

    public y0(String str, Double d10) {
        this.f77574a = str;
        this.f77575b = d10;
    }

    public final String a() {
        return this.f77574a;
    }

    public final Double b() {
        return this.f77575b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return C17542s.e(this.f77574a, y0Var.f77574a) && C17542s.e(this.f77575b, y0Var.f77575b);
    }

    public int hashCode() {
        String str = this.f77574a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Double d10 = this.f77575b;
        if (d10 != null) {
            i10 = d10.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        String str = this.f77574a;
        Double d10 = this.f77575b;
        return "TaxSummaryFragment(taxType=" + str + ", totalTaxAmount=" + d10 + ")";
    }
}

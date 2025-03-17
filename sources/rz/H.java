package rz;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001a"}, d2 = {"Lrz/H;", "", "", "inclTax", "exclTax", "tax", "<init>", "(DLjava/lang/Double;Ljava/lang/Double;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "b", "()D", "Ljava/lang/Double;", "()Ljava/lang/Double;", "c", "getTax", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class H {

    /* renamed from: a  reason: collision with root package name */
    private final double f130732a;

    /* renamed from: b  reason: collision with root package name */
    private final Double f130733b;

    /* renamed from: c  reason: collision with root package name */
    private final Double f130734c;

    public H(double d10, Double d11, Double d12) {
        this.f130732a = d10;
        this.f130733b = d11;
        this.f130734c = d12;
    }

    public final Double a() {
        return this.f130733b;
    }

    public final double b() {
        return this.f130732a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H)) {
            return false;
        }
        H h10 = (H) obj;
        return Double.compare(this.f130732a, h10.f130732a) == 0 && C17542s.e(this.f130733b, h10.f130733b) && C17542s.e(this.f130734c, h10.f130734c);
    }

    public int hashCode() {
        int hashCode = Double.hashCode(this.f130732a) * 31;
        Double d10 = this.f130733b;
        int i10 = 0;
        int hashCode2 = (hashCode + (d10 == null ? 0 : d10.hashCode())) * 31;
        Double d11 = this.f130734c;
        if (d11 != null) {
            i10 = d11.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        double d10 = this.f130732a;
        Double d11 = this.f130733b;
        Double d12 = this.f130734c;
        return "ScanAndGoOrderTotal(inclTax=" + d10 + ", exclTax=" + d11 + ", tax=" + d12 + ")";
    }
}

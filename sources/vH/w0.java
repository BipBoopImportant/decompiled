package vh;

import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001b\u0010\fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001a\u0010\u001d¨\u0006\u001e"}, d2 = {"Lvh/w0;", "", "", "taxAmount", "", "code", "taxPercentage", "type", "taxableAmount", "<init>", "(DLjava/lang/String;DLjava/lang/String;Ljava/lang/Double;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "D", "b", "()D", "Ljava/lang/String;", "c", "d", "e", "Ljava/lang/Double;", "()Ljava/lang/Double;", "apollo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class w0 {

    /* renamed from: a  reason: collision with root package name */
    private final double f77563a;

    /* renamed from: b  reason: collision with root package name */
    private final String f77564b;

    /* renamed from: c  reason: collision with root package name */
    private final double f77565c;

    /* renamed from: d  reason: collision with root package name */
    private final String f77566d;

    /* renamed from: e  reason: collision with root package name */
    private final Double f77567e;

    public w0(double d10, String str, double d11, String str2, Double d12) {
        this.f77563a = d10;
        this.f77564b = str;
        this.f77565c = d11;
        this.f77566d = str2;
        this.f77567e = d12;
    }

    public final String a() {
        return this.f77564b;
    }

    public final double b() {
        return this.f77563a;
    }

    public final double c() {
        return this.f77565c;
    }

    public final Double d() {
        return this.f77567e;
    }

    public final String e() {
        return this.f77566d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return Double.compare(this.f77563a, w0Var.f77563a) == 0 && C17542s.e(this.f77564b, w0Var.f77564b) && Double.compare(this.f77565c, w0Var.f77565c) == 0 && C17542s.e(this.f77566d, w0Var.f77566d) && C17542s.e(this.f77567e, w0Var.f77567e);
    }

    public int hashCode() {
        int hashCode = Double.hashCode(this.f77563a) * 31;
        String str = this.f77564b;
        int i10 = 0;
        int hashCode2 = (((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Double.hashCode(this.f77565c)) * 31;
        String str2 = this.f77566d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d10 = this.f77567e;
        if (d10 != null) {
            i10 = d10.hashCode();
        }
        return hashCode3 + i10;
    }

    public String toString() {
        double d10 = this.f77563a;
        String str = this.f77564b;
        double d11 = this.f77565c;
        String str2 = this.f77566d;
        Double d12 = this.f77567e;
        return "TaxPriceFragment(taxAmount=" + d10 + ", code=" + str + ", taxPercentage=" + d11 + ", type=" + str2 + ", taxableAmount=" + d12 + ")";
    }
}

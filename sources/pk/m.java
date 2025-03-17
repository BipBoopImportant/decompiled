package pk;

import Op.i1;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0013\b\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u0019\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b\u0015\u0010!¨\u0006\""}, d2 = {"Lpk/m;", "", "", "totalPrice", "familyDiscountAmount", "LOp/i1;", "currencyConfig", "", "isFamilyMember", "areAllItemPricesIncluded", "<init>", "(DLjava/lang/Double;LOp/i1;ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "D", "d", "()D", "b", "Ljava/lang/Double;", "c", "()Ljava/lang/Double;", "LOp/i1;", "()LOp/i1;", "Z", "e", "()Z", "shoppinglist-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m {

    /* renamed from: a  reason: collision with root package name */
    private final double f101007a;

    /* renamed from: b  reason: collision with root package name */
    private final Double f101008b;

    /* renamed from: c  reason: collision with root package name */
    private final i1 f101009c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f101010d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f101011e;

    public m(double d10, Double d11, i1 i1Var, boolean z10, boolean z11) {
        C17542s.j(i1Var, "currencyConfig");
        this.f101007a = d10;
        this.f101008b = d11;
        this.f101009c = i1Var;
        this.f101010d = z10;
        this.f101011e = z11;
    }

    public final boolean a() {
        return this.f101011e;
    }

    public final i1 b() {
        return this.f101009c;
    }

    public final Double c() {
        return this.f101008b;
    }

    public final double d() {
        return this.f101007a;
    }

    public final boolean e() {
        return this.f101010d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return Double.compare(this.f101007a, mVar.f101007a) == 0 && C17542s.e(this.f101008b, mVar.f101008b) && C17542s.e(this.f101009c, mVar.f101009c) && this.f101010d == mVar.f101010d && this.f101011e == mVar.f101011e;
    }

    public int hashCode() {
        int hashCode = Double.hashCode(this.f101007a) * 31;
        Double d10 = this.f101008b;
        return ((((((hashCode + (d10 == null ? 0 : d10.hashCode())) * 31) + this.f101009c.hashCode()) * 31) + Boolean.hashCode(this.f101010d)) * 31) + Boolean.hashCode(this.f101011e);
    }

    public String toString() {
        double d10 = this.f101007a;
        Double d11 = this.f101008b;
        i1 i1Var = this.f101009c;
        boolean z10 = this.f101010d;
        boolean z11 = this.f101011e;
        return "ListTotalPrice(totalPrice=" + d10 + ", familyDiscountAmount=" + d11 + ", currencyConfig=" + i1Var + ", isFamilyMember=" + z10 + ", areAllItemPricesIncluded=" + z11 + ")";
    }
}

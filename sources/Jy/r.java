package Jy;

import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.P;
import xB.C15201a;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010#\u001a\u00020\u001e8\u0016X\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"LJy/r;", "LJy/o;", "LxB/a;", "", "inclTax", "exclTax", "", "showTotalPricesInclVat", "<init>", "(DDZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "D", "h", "()D", "b", "g", "c", "Z", "i", "()Z", "", "d", "J", "f", "()J", "stableId", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r extends o implements C15201a {

    /* renamed from: a  reason: collision with root package name */
    private final double f111466a;

    /* renamed from: b  reason: collision with root package name */
    private final double f111467b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f111468c;

    /* renamed from: d  reason: collision with root package name */
    private final long f111469d = ((long) Objects.hash(new Object[]{P.b(r.class)}));

    public r(double d10, double d11, boolean z10) {
        super((DefaultConstructorMarker) null);
        this.f111466a = d10;
        this.f111467b = d11;
        this.f111468c = z10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return Double.compare(this.f111466a, rVar.f111466a) == 0 && Double.compare(this.f111467b, rVar.f111467b) == 0 && this.f111468c == rVar.f111468c;
    }

    public long f() {
        return this.f111469d;
    }

    public final double g() {
        return this.f111467b;
    }

    public final double h() {
        return this.f111466a;
    }

    public int hashCode() {
        return (((Double.hashCode(this.f111466a) * 31) + Double.hashCode(this.f111467b)) * 31) + Boolean.hashCode(this.f111468c);
    }

    public final boolean i() {
        return this.f111468c;
    }

    public String toString() {
        double d10 = this.f111466a;
        double d11 = this.f111467b;
        boolean z10 = this.f111468c;
        return "TotalPriceModel(inclTax=" + d10 + ", exclTax=" + d11 + ", showTotalPricesInclVat=" + z10 + ")";
    }
}

package ho;

import Do.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\b\u0018\u00002\u00020\u0001B'\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0017\u0010\u001c¨\u0006\u001d"}, d2 = {"Lho/c;", "", "", "Lho/b;", "availableDeliveryOptions", "", "showTotalExclTaxInCartAndCheckout", "LDo/a;", "checkoutStep", "<init>", "(Ljava/util/List;ZLDo/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Z", "c", "()Z", "LDo/a;", "()LDo/a;", "checkout-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final List<b> f98112a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f98113b;

    /* renamed from: c  reason: collision with root package name */
    private final a f98114c;

    public c(List<? extends b> list, boolean z10, a aVar) {
        C17542s.j(aVar, "checkoutStep");
        this.f98112a = list;
        this.f98113b = z10;
        this.f98114c = aVar;
    }

    public final List<b> a() {
        return this.f98112a;
    }

    public final a b() {
        return this.f98114c;
    }

    public final boolean c() {
        return this.f98113b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return C17542s.e(this.f98112a, cVar.f98112a) && this.f98113b == cVar.f98113b && C17542s.e(this.f98114c, cVar.f98114c);
    }

    public int hashCode() {
        List<b> list = this.f98112a;
        return ((((list == null ? 0 : list.hashCode()) * 31) + Boolean.hashCode(this.f98113b)) * 31) + this.f98114c.hashCode();
    }

    public String toString() {
        List<b> list = this.f98112a;
        boolean z10 = this.f98113b;
        a aVar = this.f98114c;
        return "DeliveryOptionsData(availableDeliveryOptions=" + list + ", showTotalExclTaxInCartAndCheckout=" + z10 + ", checkoutStep=" + aVar + ")";
    }
}

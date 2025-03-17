package gi;

import com.ingka.ikea.core.model.product.ProductLarge;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.P;
import xB.C15201a;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0010\t\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u001a\u0010'\u001a\u00020\"8\u0016X\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lgi/n;", "Lgi/N;", "LxB/a;", "Lcom/ingka/ikea/core/model/product/ProductLarge;", "productLarge", "", "itemNo", "", "isSectionExpanded", "isShowMoreInfoExpanded", "<init>", "(Lcom/ingka/ikea/core/model/product/ProductLarge;Ljava/lang/String;ZZ)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/core/model/product/ProductLarge;", "h", "()Lcom/ingka/ikea/core/model/product/ProductLarge;", "b", "Ljava/lang/String;", "g", "c", "Z", "i", "()Z", "d", "j", "", "e", "J", "f", "()J", "stableId", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: gi.n  reason: case insensitive filesystem */
public final class C9759n implements N, C15201a {

    /* renamed from: a  reason: collision with root package name */
    private final ProductLarge f73440a;

    /* renamed from: b  reason: collision with root package name */
    private final String f73441b;

    /* renamed from: c  reason: collision with root package name */
    private final boolean f73442c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f73443d;

    /* renamed from: e  reason: collision with root package name */
    private final long f73444e = ((long) Objects.hash(new Object[]{P.b(C9759n.class)}));

    public C9759n(ProductLarge productLarge, String str, boolean z10, boolean z11) {
        C17542s.j(productLarge, "productLarge");
        C17542s.j(str, "itemNo");
        this.f73440a = productLarge;
        this.f73441b = str;
        this.f73442c = z10;
        this.f73443d = z11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9759n)) {
            return false;
        }
        C9759n nVar = (C9759n) obj;
        return C17542s.e(this.f73440a, nVar.f73440a) && C17542s.e(this.f73441b, nVar.f73441b) && this.f73442c == nVar.f73442c && this.f73443d == nVar.f73443d;
    }

    public long f() {
        return this.f73444e;
    }

    public final String g() {
        return this.f73441b;
    }

    public final ProductLarge h() {
        return this.f73440a;
    }

    public int hashCode() {
        return (((((this.f73440a.hashCode() * 31) + this.f73441b.hashCode()) * 31) + Boolean.hashCode(this.f73442c)) * 31) + Boolean.hashCode(this.f73443d);
    }

    public final boolean i() {
        return this.f73442c;
    }

    public final boolean j() {
        return this.f73443d;
    }

    public String toString() {
        ProductLarge productLarge = this.f73440a;
        String str = this.f73441b;
        boolean z10 = this.f73442c;
        boolean z11 = this.f73443d;
        return "MoreInfoDelegateModel(productLarge=" + productLarge + ", itemNo=" + str + ", isSectionExpanded=" + z10 + ", isShowMoreInfoExpanded=" + z11 + ")";
    }
}

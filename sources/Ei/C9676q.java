package ei;

import com.ingka.ikea.core.model.product.CustomerBenefit;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0016\u0010\f¨\u0006\u001b"}, d2 = {"Lei/q;", "", "", "Lcom/ingka/ikea/core/model/product/CustomerBenefit;", "customerBenefits", "", "showMoreButtonStringRes", "", "designers", "<init>", "(Ljava/util/List;Ljava/lang/Integer;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", "Ljava/lang/String;", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: ei.q  reason: case insensitive filesystem */
public final class C9676q {

    /* renamed from: a  reason: collision with root package name */
    private final List<CustomerBenefit> f72905a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f72906b;

    /* renamed from: c  reason: collision with root package name */
    private final String f72907c;

    public C9676q(List<CustomerBenefit> list, Integer num, String str) {
        C17542s.j(list, "customerBenefits");
        this.f72905a = list;
        this.f72906b = num;
        this.f72907c = str;
    }

    public final List<CustomerBenefit> a() {
        return this.f72905a;
    }

    public final String b() {
        return this.f72907c;
    }

    public final Integer c() {
        return this.f72906b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9676q)) {
            return false;
        }
        C9676q qVar = (C9676q) obj;
        return C17542s.e(this.f72905a, qVar.f72905a) && C17542s.e(this.f72906b, qVar.f72906b) && C17542s.e(this.f72907c, qVar.f72907c);
    }

    public int hashCode() {
        int hashCode = this.f72905a.hashCode() * 31;
        Integer num = this.f72906b;
        int i10 = 0;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f72907c;
        if (str != null) {
            i10 = str.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        List<CustomerBenefit> list = this.f72905a;
        Integer num = this.f72906b;
        String str = this.f72907c;
        return "CustomerBenefitModel(customerBenefits=" + list + ", showMoreButtonStringRes=" + num + ", designers=" + str + ")";
    }
}

package zj;

import KJ.C15985a;
import KJ.C15987c;
import Oo.b;
import com.ingka.ikea.core.model.product.CustomerBenefit;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0012\b\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ6\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u000eR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0011R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u00068F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, d2 = {"Lzj/g;", "", "", "isExpanded", "", "designerInfo", "LKJ/c;", "Lcom/ingka/ikea/core/model/product/CustomerBenefit;", "items", "<init>", "(ZLjava/lang/String;LKJ/c;)V", "a", "(ZLjava/lang/String;LKJ/c;)Lzj/g;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "f", "()Z", "b", "Ljava/lang/String;", "d", "c", "LKJ/c;", "btnResId", "e", "()LKJ/c;", "itemList", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: zj.g  reason: case insensitive filesystem */
public final class C12526g {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f107386a;

    /* renamed from: b  reason: collision with root package name */
    private final String f107387b;

    /* renamed from: c  reason: collision with root package name */
    private final C15987c<CustomerBenefit> f107388c;

    public C12526g(boolean z10, String str, C15987c<CustomerBenefit> cVar) {
        C17542s.j(cVar, "items");
        this.f107386a = z10;
        this.f107387b = str;
        this.f107388c = cVar;
    }

    public static /* synthetic */ C12526g b(C12526g gVar, boolean z10, String str, C15987c<CustomerBenefit> cVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = gVar.f107386a;
        }
        if ((i10 & 2) != 0) {
            str = gVar.f107387b;
        }
        if ((i10 & 4) != 0) {
            cVar = gVar.f107388c;
        }
        return gVar.a(z10, str, cVar);
    }

    public final C12526g a(boolean z10, String str, C15987c<CustomerBenefit> cVar) {
        C17542s.j(cVar, "items");
        return new C12526g(z10, str, cVar);
    }

    public final int c() {
        return this.f107386a ? b.f84664h9 : b.f84675i9;
    }

    public final String d() {
        return this.f107387b;
    }

    public final C15987c<CustomerBenefit> e() {
        return this.f107386a ? this.f107388c : this.f107388c.isEmpty() ? this.f107388c : this.f107388c.subList(0, 1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12526g)) {
            return false;
        }
        C12526g gVar = (C12526g) obj;
        return this.f107386a == gVar.f107386a && C17542s.e(this.f107387b, gVar.f107387b) && C17542s.e(this.f107388c, gVar.f107388c);
    }

    public final boolean f() {
        return this.f107386a;
    }

    public int hashCode() {
        int hashCode = Boolean.hashCode(this.f107386a) * 31;
        String str = this.f107387b;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f107388c.hashCode();
    }

    public String toString() {
        boolean z10 = this.f107386a;
        String str = this.f107387b;
        C15987c<CustomerBenefit> cVar = this.f107388c;
        return "CustomerBenefitUiData(isExpanded=" + z10 + ", designerInfo=" + str + ", items=" + cVar + ")";
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12526g(boolean z10, String str, C15987c cVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, str, (i10 & 4) != 0 ? C15985a.a() : cVar);
    }
}

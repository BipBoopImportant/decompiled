package zj;

import Op.h1;
import com.ingka.ikea.core.model.product.MoreInfo;
import com.ingka.ikea.core.model.product.PackageDetailsItem;
import com.ingka.ikea.core.model.product.PackageInformation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0018\u0010 R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010!\u001a\u0004\b\u001e\u0010\"R\u001f\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b#\u0010!\u001a\u0004\b\u001a\u0010\"¨\u0006$"}, d2 = {"Lzj/c;", "", "", "itemNo", "LOp/h1;", "sectionType", "Lcom/ingka/ikea/core/model/product/MoreInfo;", "moreInfo", "", "Lcom/ingka/ikea/core/model/product/PackageInformation;", "productMeasurements", "Lcom/ingka/ikea/core/model/product/PackageDetailsItem;", "packageDetailsItems", "<init>", "(Ljava/lang/String;LOp/h1;Lcom/ingka/ikea/core/model/product/MoreInfo;Ljava/util/List;Ljava/util/List;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "LOp/h1;", "d", "()LOp/h1;", "c", "Lcom/ingka/ikea/core/model/product/MoreInfo;", "()Lcom/ingka/ikea/core/model/product/MoreInfo;", "Ljava/util/List;", "()Ljava/util/List;", "e", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: zj.c  reason: case insensitive filesystem */
public final class C12522c {

    /* renamed from: a  reason: collision with root package name */
    private final String f107371a;

    /* renamed from: b  reason: collision with root package name */
    private final h1 f107372b;

    /* renamed from: c  reason: collision with root package name */
    private final MoreInfo f107373c;

    /* renamed from: d  reason: collision with root package name */
    private final List<PackageInformation> f107374d;

    /* renamed from: e  reason: collision with root package name */
    private final List<PackageDetailsItem> f107375e;

    public C12522c(String str, h1 h1Var, MoreInfo moreInfo, List<PackageInformation> list, List<PackageDetailsItem> list2) {
        C17542s.j(str, "itemNo");
        C17542s.j(h1Var, "sectionType");
        C17542s.j(moreInfo, "moreInfo");
        this.f107371a = str;
        this.f107372b = h1Var;
        this.f107373c = moreInfo;
        this.f107374d = list;
        this.f107375e = list2;
    }

    public final MoreInfo a() {
        return this.f107373c;
    }

    public final List<PackageDetailsItem> b() {
        return this.f107375e;
    }

    public final List<PackageInformation> c() {
        return this.f107374d;
    }

    public final h1 d() {
        return this.f107372b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12522c)) {
            return false;
        }
        C12522c cVar = (C12522c) obj;
        return C17542s.e(this.f107371a, cVar.f107371a) && this.f107372b == cVar.f107372b && C17542s.e(this.f107373c, cVar.f107373c) && C17542s.e(this.f107374d, cVar.f107374d) && C17542s.e(this.f107375e, cVar.f107375e);
    }

    public int hashCode() {
        int hashCode = ((((this.f107371a.hashCode() * 31) + this.f107372b.hashCode()) * 31) + this.f107373c.hashCode()) * 31;
        List<PackageInformation> list = this.f107374d;
        int i10 = 0;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<PackageDetailsItem> list2 = this.f107375e;
        if (list2 != null) {
            i10 = list2.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        String str = this.f107371a;
        h1 h1Var = this.f107372b;
        MoreInfo moreInfo = this.f107373c;
        List<PackageInformation> list = this.f107374d;
        List<PackageDetailsItem> list2 = this.f107375e;
        return "UiData(itemNo=" + str + ", sectionType=" + h1Var + ", moreInfo=" + moreInfo + ", productMeasurements=" + list + ", packageDetailsItems=" + list2 + ")";
    }
}

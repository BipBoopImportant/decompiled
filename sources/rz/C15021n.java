package rz;

import com.ingka.ikea.core.model.product.MoreInfo;
import com.ingka.ikea.core.model.product.PackageInfoData;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, d2 = {"Lrz/n;", "", "Lcom/ingka/ikea/core/model/product/MoreInfo;", "moreInfo", "Lcom/ingka/ikea/core/model/product/PackageInfoData;", "packageInfo", "Lrz/k;", "measurements", "<init>", "(Lcom/ingka/ikea/core/model/product/MoreInfo;Lcom/ingka/ikea/core/model/product/PackageInfoData;Lrz/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/ingka/ikea/core/model/product/MoreInfo;", "b", "()Lcom/ingka/ikea/core/model/product/MoreInfo;", "Lcom/ingka/ikea/core/model/product/PackageInfoData;", "c", "()Lcom/ingka/ikea/core/model/product/PackageInfoData;", "Lrz/k;", "()Lrz/k;", "datalayer_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: rz.n  reason: case insensitive filesystem */
public final class C15021n {

    /* renamed from: a  reason: collision with root package name */
    private final MoreInfo f130876a;

    /* renamed from: b  reason: collision with root package name */
    private final PackageInfoData f130877b;

    /* renamed from: c  reason: collision with root package name */
    private final C15018k f130878c;

    public C15021n(MoreInfo moreInfo, PackageInfoData packageInfoData, C15018k kVar) {
        C17542s.j(moreInfo, "moreInfo");
        C17542s.j(packageInfoData, "packageInfo");
        C17542s.j(kVar, "measurements");
        this.f130876a = moreInfo;
        this.f130877b = packageInfoData;
        this.f130878c = kVar;
    }

    public final C15018k a() {
        return this.f130878c;
    }

    public final MoreInfo b() {
        return this.f130876a;
    }

    public final PackageInfoData c() {
        return this.f130877b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15021n)) {
            return false;
        }
        C15021n nVar = (C15021n) obj;
        return C17542s.e(this.f130876a, nVar.f130876a) && C17542s.e(this.f130877b, nVar.f130877b) && C17542s.e(this.f130878c, nVar.f130878c);
    }

    public int hashCode() {
        return (((this.f130876a.hashCode() * 31) + this.f130877b.hashCode()) * 31) + this.f130878c.hashCode();
    }

    public String toString() {
        MoreInfo moreInfo = this.f130876a;
        PackageInfoData packageInfoData = this.f130877b;
        C15018k kVar = this.f130878c;
        return "CombinationProductDetails(moreInfo=" + moreInfo + ", packageInfo=" + packageInfoData + ", measurements=" + kVar + ")";
    }
}

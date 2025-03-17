package Tj;

import Tj.n;
import com.ingka.ikea.core.model.product.PackageDetailsItem;
import com.ingka.ikea.core.model.product.PackageInformation;
import com.ingka.ikea.core.model.product.ProductDimension;
import com.ingka.ikea.core.model.product.ProductLarge;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\f"}, d2 = {"LTj/y;", "", "LTj/z;", "productSectionBuilder", "<init>", "(LTj/z;)V", "Lcom/ingka/ikea/core/model/product/ProductLarge;", "product", "LTj/n$a;", "a", "(Lcom/ingka/ikea/core/model/product/ProductLarge;)LTj/n$a;", "LTj/z;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class y {

    /* renamed from: a  reason: collision with root package name */
    private final z f87720a;

    public y(z zVar) {
        C17542s.j(zVar, "productSectionBuilder");
        this.f87720a = zVar;
    }

    public final n.a a(ProductLarge productLarge) {
        C17542s.j(productLarge, "product");
        ArrayList arrayList = new ArrayList();
        ArrayList<PackageDetailsItem> arrayList2 = new ArrayList<>();
        for (Object next : productLarge.n().a().b()) {
            if (C17542s.e(((PackageDetailsItem) next).getType(), w.DETAILED_MEASUREMENT.b())) {
                arrayList2.add(next);
            }
        }
        ArrayList<List> arrayList3 = new ArrayList<>();
        for (PackageDetailsItem b10 : arrayList2) {
            ProductDimension b11 = b10.b();
            List<PackageInformation> b12 = b11 != null ? b11.b() : null;
            if (b12 != null) {
                arrayList3.add(b12);
            }
        }
        for (List addAll : arrayList3) {
            arrayList.addAll(addAll);
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object next2 : productLarge.n().a().b()) {
            if (C17542s.e(((PackageDetailsItem) next2).getType(), w.PACKAGE_MEASUREMENTS.b())) {
                arrayList4.add(next2);
            }
        }
        return new n.a(productLarge.i(), productLarge.m(), arrayList, arrayList4, this.f87720a.c(productLarge.m()));
    }
}

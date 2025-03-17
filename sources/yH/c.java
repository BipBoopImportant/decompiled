package Yh;

import XH.C16807N;
import YH.C16877v;
import Zh.a;
import com.ingka.ikea.core.model.product.GoodToKnow;
import com.ingka.ikea.core.model.product.MoreInfo;
import com.ingka.ikea.core.model.product.ProductLarge;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.C17631a;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0011\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LYh/c;", "LYh/m;", "Lcom/ingka/ikea/core/model/product/ProductLarge;", "productLarge", "<init>", "(Lcom/ingka/ikea/core/model/product/ProductLarge;)V", "LXH/N;", "y", "()LXH/N;", "k", "Lcom/ingka/ikea/core/model/product/ProductLarge;", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c extends m {

    /* renamed from: k  reason: collision with root package name */
    private final ProductLarge f65000k;

    public c(ProductLarge productLarge) {
        C17542s.j(productLarge, "productLarge");
        this.f65000k = productLarge;
        y();
    }

    private final C16807N y() {
        List<GoodToKnow> i10;
        MoreInfo m10 = this.f65000k.m();
        if (m10 == null || (i10 = m10.i()) == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int size = i10.size() - 1;
        int i11 = 0;
        for (Object next : i10) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C16877v.x();
            }
            arrayList.add(new a(((GoodToKnow) next).a(), f.TEXT, i11 < size ? u() : 0, (String) null, (String) null, (C17631a) null, 56, (DefaultConstructorMarker) null));
            i11 = i12;
        }
        if (!arrayList.isEmpty()) {
            t().addAll(arrayList);
        }
        return C16807N.f139792a;
    }
}

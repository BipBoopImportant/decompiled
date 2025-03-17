package Tj;

import Op.h1;
import YH.C16877v;
import com.ingka.ikea.core.model.product.MoreInfo;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"LTj/z;", "", "<init>", "()V", "Lcom/ingka/ikea/core/model/product/MoreInfo;", "moreInfo", "", "b", "(Lcom/ingka/ikea/core/model/product/MoreInfo;)Z", "a", "", "LOp/h1;", "c", "(Lcom/ingka/ikea/core/model/product/MoreInfo;)Ljava/util/List;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class z {
    private final boolean a(MoreInfo moreInfo) {
        Collection i10 = moreInfo.i();
        return !(i10 == null || i10.isEmpty());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000e, code lost:
        r0 = r2.f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        r2 = r2.e();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean b(com.ingka.ikea.core.model.product.MoreInfo r2) {
        /*
            r1 = this;
            java.util.List r0 = r2.g()
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L_0x000e
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x002b
        L_0x000e:
            java.util.List r0 = r2.f()
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L_0x001c
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x002b
        L_0x001c:
            java.util.List r2 = r2.e()
            java.util.Collection r2 = (java.util.Collection) r2
            if (r2 == 0) goto L_0x002d
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x002b
            goto L_0x002d
        L_0x002b:
            r2 = 1
            goto L_0x002e
        L_0x002d:
            r2 = 0
        L_0x002e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Tj.z.b(com.ingka.ikea.core.model.product.MoreInfo):boolean");
    }

    public final List<h1> c(MoreInfo moreInfo) {
        C17542s.j(moreInfo, "moreInfo");
        List c10 = C16877v.c();
        if (a(moreInfo)) {
            c10.add(h1.GOOD_TO_KNOW);
        }
        if (b(moreInfo)) {
            c10.add(h1.MATERIALS_AND_CARE);
        }
        c10.add(h1.DETAILS_AND_SIZING);
        return C16877v.a(c10);
    }
}

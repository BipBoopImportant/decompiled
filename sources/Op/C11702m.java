package op;

import com.ingka.ikea.core.model.product.ProductLarge;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0003\u001a\u0011\u0010\u0007\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\u0003¨\u0006\b"}, d2 = {"Lcom/ingka/ikea/core/model/product/ProductLarge;", "", "a", "(Lcom/ingka/ikea/core/model/product/ProductLarge;)Z", "c", "b", "d", "e", "model_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* renamed from: op.m  reason: case insensitive filesystem */
public final class C11702m {
    public static final boolean a(ProductLarge productLarge) {
        C17542s.j(productLarge, "<this>");
        return !productLarge.m().b().isEmpty();
    }

    public static final boolean b(ProductLarge productLarge) {
        C17542s.j(productLarge, "<this>");
        Collection i10 = productLarge.m().i();
        return !(i10 == null || i10.isEmpty());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0017, code lost:
        r0 = r1.m().f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0029, code lost:
        r1 = r1.m().e();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean c(com.ingka.ikea.core.model.product.ProductLarge r1) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C17542s.j(r1, r0)
            com.ingka.ikea.core.model.product.MoreInfo r0 = r1.m()
            java.util.List r0 = r0.g()
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L_0x0017
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x003c
        L_0x0017:
            com.ingka.ikea.core.model.product.MoreInfo r0 = r1.m()
            java.util.List r0 = r0.f()
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L_0x0029
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x003c
        L_0x0029:
            com.ingka.ikea.core.model.product.MoreInfo r1 = r1.m()
            java.util.List r1 = r1.e()
            java.util.Collection r1 = (java.util.Collection) r1
            if (r1 == 0) goto L_0x003e
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x003c
            goto L_0x003e
        L_0x003c:
            r1 = 1
            goto L_0x003f
        L_0x003e:
            r1 = 0
        L_0x003f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: op.C11702m.c(com.ingka.ikea.core.model.product.ProductLarge):boolean");
    }

    public static final boolean d(ProductLarge productLarge) {
        C17542s.j(productLarge, "<this>");
        Collection j10 = productLarge.m().j();
        return !(j10 == null || j10.isEmpty());
    }

    public static final boolean e(ProductLarge productLarge) {
        C17542s.j(productLarge, "<this>");
        return productLarge.m().k() != null;
    }
}

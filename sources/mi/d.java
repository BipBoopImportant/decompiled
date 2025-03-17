package mi;

import IC.C13023e;
import IC.C13026h;
import KJ.C15985a;
import KJ.C15987c;
import Op.B0;
import Op.C10828d;
import Rl.e;
import XH.C16807N;
import XH.t;
import YH.C16877v;
import com.ingka.ikea.core.model.product.ProductItem;
import com.ingka.ikea.core.model.product.ProductLarge;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kp.C11522d;
import mi.b;
import mi.j;
import ni.g;
import ni.h;
import oi.a;
import op.C11699j;
import qx.C14956a;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\u0010\u001a\u00020\u000f*\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0014\u001a\u00020\u000f*\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0016\u001a\u00020\u000f*\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0016\u0010\u0011J;\u0010\u001e\u001a\u00020\u001d2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010!\u001a\u00020\u000f*\b\u0012\u0004\u0012\u00020 0\u000bH\u0002¢\u0006\u0004\b!\u0010\"J7\u0010'\u001a\u00020&2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00192\b\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lmi/d;", "", "<init>", "()V", "Lni/g;", "pipConfig", "Lni/h;", "productDetailsState", "Lmi/i;", "g", "(Lni/g;Lni/h;)Lmi/i;", "", "Lmi/j$f;", "Lcom/ingka/ikea/core/model/product/ProductLarge;", "productLarge", "LXH/N;", "c", "(Ljava/util/List;Lcom/ingka/ikea/core/model/product/ProductLarge;)V", "LRl/e;", "marketConfig", "b", "(Ljava/util/List;Lcom/ingka/ikea/core/model/product/ProductLarge;LRl/e;)V", "a", "Lkp/d;", "currencyConfig", "", "isAddingToCart", "isProductDetailsLoading", "hasError", "Lmi/b;", "e", "(Lcom/ingka/ikea/core/model/product/ProductLarge;Lkp/d;ZZZ)Lmi/b;", "Lmi/k;", "d", "(Ljava/util/List;)V", "shareItemLoading", "Loi/a;", "messageState", "Lmi/l;", "f", "(Lni/h;Lni/g;ZLoi/a;Z)Lmi/l;", "productinformationpage-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d {
    private final void a(List<j.f> list, ProductLarge productLarge) {
        if (!productLarge.p().isEmpty()) {
            String i10 = productLarge.i();
            String i11 = productLarge.h().i();
            Iterable<ProductItem.ProductDisclaimer> p10 = productLarge.p();
            ArrayList arrayList = new ArrayList(C16877v.y(p10, 10));
            for (ProductItem.ProductDisclaimer c10 : p10) {
                arrayList.add(B0.c(c10));
            }
            list.add(new j.b(i10, i11, C15985a.h(arrayList)));
        }
    }

    private final void b(List<j.f> list, ProductLarge productLarge, e eVar) {
        String i10 = productLarge.i();
        j.c.a aVar = null;
        C10828d.h g10 = B0.g(productLarge.h(), eVar.c(), false, 2, (Object) null);
        C11522d c10 = eVar.c();
        boolean g11 = eVar.g();
        Float c11 = productLarge.c();
        if (c11 != null) {
            aVar = new j.c.a(c11.floatValue(), productLarge.r());
        }
        list.add(new j.c(i10, g10, c10, g11, aVar));
    }

    private final void c(List<j.f> list, ProductLarge productLarge) {
        list.add(new j.e(C15985a.h(productLarge.g())));
    }

    private final void d(List<k> list) {
        list.add(e.b());
    }

    private final b e(ProductLarge productLarge, C11522d dVar, boolean z10, boolean z11, boolean z12) {
        C13023e eVar;
        if (z11 || z12) {
            return b.a.f75459a;
        }
        Boolean valueOf = productLarge != null ? Boolean.valueOf(productLarge.t()) : null;
        if (C17542s.e(valueOf, Boolean.TRUE)) {
            if (dVar == null || (eVar = C13026h.c(C14956a.f130484a.b(productLarge.h().g().e().c(), dVar))) == null) {
                eVar = C13026h.a(Oo.b.f84487R);
            }
            return new b.c(eVar, z10);
        } else if (C17542s.e(valueOf, Boolean.FALSE)) {
            return b.C1384b.f75460a;
        } else {
            if (valueOf == null) {
                return b.a.f75459a;
            }
            throw new t();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r4 = r4.a();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final mi.i g(ni.g r4, ni.h r5) {
        /*
            r3 = this;
            boolean r4 = r4.b()
            if (r4 == 0) goto L_0x0033
            op.j r4 = r5.d()
            if (r4 == 0) goto L_0x0030
            com.ingka.ikea.core.model.product.ProductLarge r4 = r4.a()
            if (r4 == 0) goto L_0x0030
            mi.i$b r5 = new mi.i$b
            java.lang.String r0 = r4.i()
            java.lang.String r1 = r4.j()
            com.ingka.ikea.core.model.product.ProductItem$ProductInfo r2 = r4.h()
            java.lang.String r2 = r2.i()
            com.ingka.ikea.core.model.product.ProductItem$ProductInfo r4 = r4.h()
            java.lang.String r4 = r4.c()
            r5.<init>(r0, r1, r2, r4)
            goto L_0x0035
        L_0x0030:
            mi.i$a r5 = mi.i.a.f75477a
            goto L_0x0035
        L_0x0033:
            mi.i$a r5 = mi.i.a.f75477a
        L_0x0035:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mi.d.g(ni.g, ni.h):mi.i");
    }

    public final l f(h hVar, g gVar, boolean z10, a aVar, boolean z11) {
        ProductLarge a10;
        h hVar2 = hVar;
        g gVar2 = gVar;
        C17542s.j(hVar, "productDetailsState");
        C17542s.j(gVar2, "pipConfig");
        boolean z12 = hVar.e() || z10;
        boolean z13 = hVar.c() != null;
        i g10 = g(gVar2, hVar);
        List c10 = C16877v.c();
        C11699j d10 = hVar.d();
        if (!(d10 == null || (a10 = d10.a()) == null)) {
            List c11 = C16877v.c();
            c(c11, a10);
            e a11 = gVar.a();
            if (a11 != null) {
                b(c11, a10, a11);
            }
            a(c11, a10);
            c11.add(j.a.f75484a);
            c11.add(e.a());
            c10.add(new j(C15985a.h(C16877v.a(c11))));
            d(c10);
            c10.add(new a(a10.i()));
            c10.add(new c(a10.i()));
            c10.add(new f(a10.i()));
        }
        C16807N n10 = C16807N.f139792a;
        C15987c h10 = C15985a.h(C16877v.a(c10));
        C11699j d11 = hVar.d();
        C11522d dVar = null;
        ProductLarge a12 = d11 != null ? d11.a() : null;
        e a13 = gVar.a();
        if (a13 != null) {
            dVar = a13.c();
        }
        return new l(z12, z13, g10, aVar, h10, e(a12, dVar, z11, hVar.e(), hVar.c() != null));
    }
}

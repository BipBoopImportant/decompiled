package Fj;

import Il.a;
import KJ.C15985a;
import KJ.C15987c;
import Op.B0;
import Op.C10828d;
import Vi.d0;
import YH.C16877v;
import com.ingka.ikea.core.model.product.ProductItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kp.C11522d;
import rz.I;
import rz.Y;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\r"}, d2 = {"LFj/i;", "", "LIl/a;", "appConfigApi", "<init>", "(LIl/a;)V", "Lrz/I;", "scanAndGoProduct", "", "LVi/d0;", "a", "(Lrz/I;)Ljava/util/List;", "LIl/a;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private final a f80878a;

    public i(a aVar) {
        C17542s.j(aVar, "appConfigApi");
        this.f80878a = aVar;
    }

    public final List<d0> a(I i10) {
        C17542s.j(i10, "scanAndGoProduct");
        List c10 = C16877v.c();
        String f10 = i10.k().f();
        String g10 = i10.k().g();
        C10828d.h g11 = B0.g(i10.k().e(), this.f80878a.s(), false, 2, (Object) null);
        Iterable<ProductItem.ProductDisclaimer> i11 = i10.k().i();
        ArrayList arrayList = new ArrayList(C16877v.y(i11, 10));
        for (ProductItem.ProductDisclaimer c11 : i11) {
            arrayList.add(B0.c(c11));
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object next : arrayList) {
            if (((C10828d.g) next).d() != C10828d.g.a.COLOR_INFO) {
                arrayList2.add(next);
            }
        }
        C15987c h10 = C15985a.h(arrayList2);
        C11522d s10 = this.f80878a.s();
        boolean w10 = this.f80878a.w();
        Y o10 = i10.o();
        c10.add(new d0(f10, g10, g11, h10, s10, w10, o10 instanceof Y.a ? (Y.a) o10 : null, i10.k().j()));
        return C16877v.a(c10);
    }
}

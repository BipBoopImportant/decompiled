package CC;

import Dl.b;
import KJ.C15985a;
import KJ.C15987c;
import YH.C16877v;
import com.ingka.ikea.core.model.product.ProductItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rz.C15014g;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LCC/a;", "", "<init>", "()V", "", "Lrz/g;", "cartItems", "LKJ/c;", "LDl/b;", "a", "(Ljava/util/List;)LKJ/c;", "timeslot-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: CC.a  reason: case insensitive filesystem */
public final class C12692a {
    public final C15987c<b> a(List<C15014g> list) {
        C17542s.j(list, "cartItems");
        Iterable<C15014g> iterable = list;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (C15014g g10 : iterable) {
            ProductItem g11 = g10.g();
            String url = g11.d().getUrl();
            arrayList.add(new b(g11.f(), g11.d().A0(), url, 0, 8, (DefaultConstructorMarker) null));
        }
        return C15985a.l(arrayList);
    }
}

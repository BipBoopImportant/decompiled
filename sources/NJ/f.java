package Nj;

import Nj.e;
import XH.x;
import YH.C16877v;
import com.ingka.ikea.core.remotemodel.product.ProductLiteRemote;
import dI.C17164e;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import rz.C15026t;
import rz.C15031y;
import rz.U;
import rz.Y;
import rz.b0;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J@\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bHB¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"LNj/f;", "LNj/e;", "<init>", "()V", "", "Lrz/b0;", "supportedProducts", "unSupportedProducts", "", "", "favorites", "LXH/x;", "LNj/e$a;", "a", "(Ljava/util/List;Ljava/util/List;Ljava/util/Set;LdI/e;)Ljava/lang/Object;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f implements e {
    public Object a(List<b0> list, List<b0> list2, Set<String> set, C17164e<? super x<e.a>> eVar) {
        x.a aVar = x.f139812b;
        Iterable<b0> iterable = list2;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (b0 b0Var : iterable) {
            arrayList.add(b0.b(b0Var, (String) null, (String) null, (ProductLiteRemote) null, (U) null, (C15031y) null, (C15026t) null, (Y) null, set.contains(b0Var.d()), 0, 383, (Object) null));
        }
        return x.b(new e.a(list, arrayList));
    }
}

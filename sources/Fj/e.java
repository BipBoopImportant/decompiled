package Fj;

import Hz.a;
import XH.C16807N;
import YH.C16877v;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import rz.C15015h;
import rz.C15016i;
import rz.I;
import uK.C18146a;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LFj/e;", "", "<init>", "()V", "Lrz/I;", "scanAndGoProduct", "LFj/c;", "inAndOutOfStockConfig", "", "b", "(Lrz/I;LFj/c;)Ljava/util/List;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e {
    /* access modifiers changed from: private */
    public static final C16807N c(c cVar) {
        cVar.b();
        return C16807N.f139792a;
    }

    public final List<Object> b(I i10, c cVar) {
        List<C15015h> list;
        List<C15015h> list2;
        C17542s.j(i10, "scanAndGoProduct");
        C17542s.j(cVar, "inAndOutOfStockConfig");
        C15016i d10 = i10.d();
        C15016i.a aVar = d10 instanceof C15016i.a ? (C15016i.a) d10 : null;
        if (aVar == null || (list = aVar.a()) == null) {
            list = C16877v.n();
        }
        if (aVar == null || (list2 = aVar.b()) == null) {
            list2 = C16877v.n();
        }
        Collection collection = list;
        boolean z10 = !collection.isEmpty() && !list2.isEmpty();
        List c10 = C16877v.c();
        c10.addAll(collection);
        Collection collection2 = list2;
        if (!collection2.isEmpty()) {
            if (z10) {
                c10.add(new a(cVar.a(), Integer.valueOf(C18146a.f148220R5), new d(cVar)));
            }
            c10.addAll(collection2);
        }
        return C16877v.a(c10);
    }
}

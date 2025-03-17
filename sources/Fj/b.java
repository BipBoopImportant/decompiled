package Fj;

import Lj.t;
import YH.C16877v;
import dl.C11210o;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import rz.I;
import rz.Q;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LFj/b;", "", "<init>", "()V", "Lrz/I;", "scanAndGoProduct", "", "bottomPadding", "", "a", "(Lrz/I;I)Ljava/util/List;", "scanandgo-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {
    public final List<Object> a(I i10, int i11) {
        C17542s.j(i10, "scanAndGoProduct");
        List c10 = C16877v.c();
        if (!i10.b().isEmpty()) {
            Iterable<Q> b10 = i10.b();
            ArrayList arrayList = new ArrayList(C16877v.y(b10, 10));
            for (Q q10 : b10) {
                arrayList.add(new t.a(q10.b(), q10.a()));
            }
            c10.addAll(arrayList);
            c10.add(new C11210o("", i11));
        }
        return C16877v.a(c10);
    }
}

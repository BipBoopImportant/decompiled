package Pp;

import IC.C13026h;
import KJ.C15985a;
import KJ.C15987c;
import Oo.b;
import Op.C10828d;
import Pp.d;
import YH.C16877v;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LPp/a;", "", "<init>", "()V", "LPp/d$a;", "itemToMap", "LKJ/c;", "LOp/d$g;", "a", "(LPp/d$a;)LKJ/c;", "product_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a {
    public final C15987c<C10828d.g> a(d.a aVar) {
        C17542s.j(aVar, "itemToMap");
        List c10 = C16877v.c();
        if (aVar.m() && !aVar.i().e().isEmpty()) {
            c10.add(new C10828d.g(C13026h.a(b.f84362E4), (C10828d.C1720d) null, C10828d.g.a.MATERIALS, new C10828d.e.a((String) null, "undefined"), 2, (DefaultConstructorMarker) null));
        }
        return C15985a.h(C16877v.a(c10));
    }
}

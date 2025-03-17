package Ny;

import Jy.o;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import rz.C15014g;
import rz.C15031y;
import rz.J;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"LNy/f;", "", "<init>", "()V", "Lrz/g;", "cartRepresentation", "", "itemsUpdateQuantity", "LJy/o$a;", "a", "(Lrz/g;Ljava/util/List;)LJy/o$a;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f {
    public final o.a a(C15014g gVar, List<C15014g> list) {
        C17542s.j(gVar, "cartRepresentation");
        C17542s.j(list, "itemsUpdateQuantity");
        boolean b10 = gVar.b();
        boolean z10 = true;
        boolean z11 = gVar.i() == C15031y.SELF_SERVE;
        boolean z12 = gVar.i() == C15031y.CASH_AND_CARRY;
        Iterable iterable = list;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (C17542s.e(((C15014g) it.next()).a(), gVar.a())) {
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        z10 = false;
        return (!z11 || b10) ? (!z12 || b10) ? new o.a.C2708a(gVar, J.b(gVar), z10) : new o.a.b(gVar, false, z10) : new o.a.d(gVar, false, z10);
    }
}

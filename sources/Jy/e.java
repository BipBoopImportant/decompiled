package Jy;

import Jy.o;
import Op.b1;
import XH.t;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import rz.C15031y;
import rz.U;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LJy/e;", "", "<init>", "()V", "LJy/o$a;", "item", "LOp/b1;", "a", "(LJy/o$a;)LOp/b1;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e {
    public final b1 a(o.a aVar) {
        b1.b bVar;
        C17542s.j(aVar, "item");
        U h10 = aVar.g().h();
        if (h10 instanceof U.c) {
            return b1.a.f85084a;
        }
        boolean z10 = true;
        if (h10 instanceof U.b) {
            int c10 = aVar.g().h().c();
            if (aVar.n() || aVar.g().i() != C15031y.FULL_SERVE) {
                z10 = false;
            }
            bVar = new b1.b(c10, z10, 0, (Integer) null, 12, (DefaultConstructorMarker) null);
        } else if (h10 instanceof U.a) {
            bVar = new b1.b(aVar.g().h().c(), !aVar.n(), 0, (Integer) null, 12, (DefaultConstructorMarker) null);
        } else {
            throw new t();
        }
        return bVar;
    }
}

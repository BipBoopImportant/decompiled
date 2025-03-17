package Hy;

import By.C12674m;
import Hy.w;
import IC.C13026h;
import XH.t;
import YH.C16877v;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C17542s;
import uK.C18148c;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"LHy/v;", "", "<init>", "()V", "LHy/w;", "mode", "", "LHy/b;", "a", "(LHy/w;)Ljava/util/List;", "cart-implementation_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class v {
    public final List<C13014b> a(w wVar) {
        C17542s.j(wVar, "mode");
        if (C17542s.e(wVar, w.a.f110891a)) {
            return C16877v.e(new C13014b(C18148c.BoxExpress, C13026h.a(C12674m.f108284i0)));
        }
        if (C17542s.e(wVar, w.b.f110892a)) {
            return C16877v.n();
        }
        if (C17542s.e(wVar, w.c.f110893a)) {
            return C16877v.q(new C13014b(C18148c.CreditCard, C13026h.a(C12674m.f108282h0)), new C13014b(C18148c.BoxExpress, C13026h.a(C12674m.f108278f0)));
        }
        throw new t();
    }
}

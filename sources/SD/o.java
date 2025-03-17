package sd;

import java.util.Map;
import ld.C10008a;
import ld.C10010c;
import ld.g;
import od.C10105b;

public final class o implements g {

    /* renamed from: a  reason: collision with root package name */
    private final j f76524a = new j();

    public C10105b a(String str, C10008a aVar, int i10, int i11, Map<C10010c, ?> map) {
        if (aVar == C10008a.UPC_A) {
            j jVar = this.f76524a;
            return jVar.a('0' + str, C10008a.EAN_13, i10, i11, map);
        }
        throw new IllegalArgumentException("Can only encode UPC-A, but got " + aVar);
    }
}

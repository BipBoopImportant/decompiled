package ZI;

import XI.q;
import XI.t;
import YH.C16877v;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C17542s;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    private final List<q> f140843a;

    public g(t tVar) {
        C17542s.j(tVar, "typeTable");
        List<q> v10 = tVar.v();
        if (tVar.w()) {
            int s10 = tVar.s();
            List<q> v11 = tVar.v();
            C17542s.i(v11, "getTypeList(...)");
            Iterable iterable = v11;
            ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
            int i10 = 0;
            for (Object next : iterable) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    C16877v.x();
                }
                q qVar = (q) next;
                if (i10 >= s10) {
                    qVar = qVar.toBuilder().M(true).g();
                }
                arrayList.add(qVar);
                i10 = i11;
            }
            v10 = arrayList;
        }
        C17542s.i(v10, "run(...)");
        this.f140843a = v10;
    }

    public final q a(int i10) {
        return this.f140843a.get(i10);
    }
}

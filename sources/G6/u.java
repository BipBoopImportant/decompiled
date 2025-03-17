package G6;

import H6.c;
import J6.a;
import java.util.ArrayList;
import java.util.List;
import w6.C8927i;
import z6.C9027i;

class u {

    /* renamed from: a  reason: collision with root package name */
    static c.a f36219a = c.a.a("k");

    static <T> List<a<T>> a(c cVar, C8927i iVar, float f10, N<T> n10, boolean z10) {
        ArrayList arrayList = new ArrayList();
        if (cVar.i() == c.b.STRING) {
            iVar.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        cVar.e();
        while (cVar.hasNext()) {
            if (cVar.n(f36219a) != 0) {
                cVar.a0();
            } else if (cVar.i() == c.b.BEGIN_ARRAY) {
                cVar.d();
                if (cVar.i() == c.b.NUMBER) {
                    arrayList.add(t.c(cVar, iVar, f10, n10, false, z10));
                } else {
                    while (cVar.hasNext()) {
                        arrayList.add(t.c(cVar, iVar, f10, n10, true, z10));
                    }
                }
                cVar.f();
            } else {
                arrayList.add(t.c(cVar, iVar, f10, n10, false, z10));
            }
        }
        cVar.g();
        b(arrayList);
        return arrayList;
    }

    public static <T> void b(List<? extends a<T>> list) {
        int i10;
        T t10;
        int size = list.size();
        int i11 = 0;
        while (true) {
            i10 = size - 1;
            if (i11 >= i10) {
                break;
            }
            a aVar = (a) list.get(i11);
            i11++;
            a aVar2 = (a) list.get(i11);
            aVar.f37357h = Float.valueOf(aVar2.f37356g);
            if (aVar.f37352c == null && (t10 = aVar2.f37351b) != null) {
                aVar.f37352c = t10;
                if (aVar instanceof C9027i) {
                    ((C9027i) aVar).j();
                }
            }
        }
        a aVar3 = (a) list.get(i10);
        if ((aVar3.f37351b == null || aVar3.f37352c == null) && list.size() > 1) {
            list.remove(aVar3);
        }
    }
}

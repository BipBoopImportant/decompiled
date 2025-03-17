package CI;

import DI.C15558e;
import DI.n0;
import YH.C16877v;
import YH.X;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import uJ.C18113f0;
import uJ.z0;
import zJ.C18755d;

/* renamed from: CI.y  reason: case insensitive filesystem */
public final class C15518y {
    public static final z0 a(C15558e eVar, C15558e eVar2) {
        C17542s.j(eVar, "from");
        C17542s.j(eVar2, "to");
        eVar.t().size();
        eVar2.t().size();
        z0.a aVar = z0.f147956c;
        List<n0> t10 = eVar.t();
        C17542s.i(t10, "getDeclaredTypeParameters(...)");
        Iterable<n0> iterable = t10;
        ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
        for (n0 k10 : iterable) {
            arrayList.add(k10.k());
        }
        List<n0> t11 = eVar2.t();
        C17542s.i(t11, "getDeclaredTypeParameters(...)");
        Iterable<n0> iterable2 = t11;
        ArrayList arrayList2 = new ArrayList(C16877v.y(iterable2, 10));
        for (n0 r10 : iterable2) {
            C18113f0 r11 = r10.r();
            C17542s.i(r11, "getDefaultType(...)");
            arrayList2.add(C18755d.d(r11));
        }
        return z0.a.e(aVar, X.v(C16877v.D1(arrayList, arrayList2)), false, 2, (Object) null);
    }
}

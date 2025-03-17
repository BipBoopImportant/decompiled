package OI;

import DI.C15554a;
import DI.i0;
import DI.u0;
import EI.C15649h;
import GI.C15727V;
import XH.v;
import YH.C16877v;
import cJ.C17069f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kJ.C17506e;
import kotlin.jvm.internal.C17542s;
import uJ.C18096U;

public final class h {
    public static final List<u0> a(Collection<? extends C18096U> collection, Collection<? extends u0> collection2, C15554a aVar) {
        Collection<? extends C18096U> collection3 = collection;
        Collection<? extends u0> collection4 = collection2;
        C17542s.j(collection3, "newValueParameterTypes");
        C17542s.j(collection4, "oldValueParameters");
        C17542s.j(aVar, "newOwner");
        collection.size();
        collection2.size();
        Iterable D12 = C16877v.D1(collection3, collection4);
        ArrayList arrayList = new ArrayList(C16877v.y(D12, 10));
        Iterator it = D12.iterator();
        while (it.hasNext()) {
            v vVar = (v) it.next();
            C18096U u10 = (C18096U) vVar.a();
            u0 u0Var = (u0) vVar.b();
            int index = u0Var.getIndex();
            C15649h annotations = u0Var.getAnnotations();
            C17069f name = u0Var.getName();
            C17542s.i(name, "getName(...)");
            boolean B02 = u0Var.B0();
            boolean s02 = u0Var.s0();
            boolean r02 = u0Var.r0();
            C18096U k10 = u0Var.w0() != null ? C17506e.s(aVar).p().k(u10) : null;
            i0 i10 = u0Var.i();
            C17542s.i(i10, "getSource(...)");
            Iterator it2 = it;
            C15727V v10 = r3;
            C15727V v11 = new C15727V(aVar, (u0) null, index, annotations, name, u10, B02, s02, r02, k10, i10);
            arrayList.add(v10);
            it = it2;
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [nJ.k] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final QI.a0 b(DI.C15558e r3) {
        /*
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.C17542s.j(r3, r0)
            DI.e r3 = kJ.C17506e.x(r3)
            r0 = 0
            if (r3 != 0) goto L_0x000d
            return r0
        L_0x000d:
            nJ.k r1 = r3.o0()
            boolean r2 = r1 instanceof QI.a0
            if (r2 == 0) goto L_0x0018
            r0 = r1
            QI.a0 r0 = (QI.a0) r0
        L_0x0018:
            if (r0 != 0) goto L_0x001e
            QI.a0 r0 = b(r3)
        L_0x001e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: OI.h.b(DI.e):QI.a0");
    }
}

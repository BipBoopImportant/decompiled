package qJ;

import DI.C15530A;
import DI.C15539J;
import DI.s0;
import XH.C16796C;
import XH.v;
import XI.C16830c;
import XI.q;
import YH.C16877v;
import ZI.c;
import ZI.f;
import ZI.g;
import cJ.C17069f;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C17542s;
import nI.C17642l;
import yJ.C18741j;

/* renamed from: qJ.Z  reason: case insensitive filesystem */
public final class C17812Z {
    public static final <T extends C18741j> s0<T> a(C16830c cVar, c cVar2, g gVar, C17642l<? super q, ? extends T> lVar, C17642l<? super C17069f, ? extends T> lVar2) {
        C18741j jVar;
        List list;
        C17542s.j(cVar, "<this>");
        C17542s.j(cVar2, "nameResolver");
        C17542s.j(gVar, "typeTable");
        C17542s.j(lVar, "typeDeserializer");
        C17542s.j(lVar2, "typeOfPublicProperty");
        if (cVar.G0() > 0) {
            Iterable H02 = cVar.H0();
            C17542s.i(H02, "getMultiFieldValueClassUnderlyingNameList(...)");
            Iterable<Integer> iterable = H02;
            ArrayList arrayList = new ArrayList(C16877v.y(iterable, 10));
            for (Integer num : iterable) {
                C17542s.g(num);
                arrayList.add(C17799L.b(cVar2, num.intValue()));
            }
            v a10 = C16796C.a(Integer.valueOf(cVar.K0()), Integer.valueOf(cVar.J0()));
            if (C17542s.e(a10, C16796C.a(Integer.valueOf(arrayList.size()), 0))) {
                Iterable L02 = cVar.L0();
                C17542s.i(L02, "getMultiFieldValueClassUnderlyingTypeIdList(...)");
                Iterable<Integer> iterable2 = L02;
                list = new ArrayList(C16877v.y(iterable2, 10));
                for (Integer num2 : iterable2) {
                    C17542s.g(num2);
                    list.add(gVar.a(num2.intValue()));
                }
            } else if (C17542s.e(a10, C16796C.a(0, Integer.valueOf(arrayList.size())))) {
                list = cVar.M0();
            } else {
                throw new IllegalStateException(("class " + C17799L.b(cVar2, cVar.z0()) + " has illegal multi-field value class representation").toString());
            }
            C17542s.g(list);
            Iterable<Object> iterable3 = list;
            ArrayList arrayList2 = new ArrayList(C16877v.y(iterable3, 10));
            for (Object invoke : iterable3) {
                arrayList2.add(lVar.invoke(invoke));
            }
            return new C15539J(C16877v.D1(arrayList, arrayList2));
        } else if (!cVar.i1()) {
            return null;
        } else {
            C17069f b10 = C17799L.b(cVar2, cVar.D0());
            q i10 = f.i(cVar, gVar);
            if ((i10 != null && (jVar = (C18741j) lVar.invoke(i10)) != null) || (jVar = (C18741j) lVar2.invoke(b10)) != null) {
                return new C15530A(b10, jVar);
            }
            throw new IllegalStateException(("cannot determine underlying type for value class " + C17799L.b(cVar2, cVar.z0()) + " with property " + b10).toString());
        }
    }
}

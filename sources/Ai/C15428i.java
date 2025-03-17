package AI;

import AI.C15435p;
import BI.f;
import BI.g;
import DI.C15558e;
import DI.C15561h;
import DI.C15566m;
import EI.C15644c;
import EI.C15649h;
import EI.C15653l;
import EJ.C15660a;
import XH.C16796C;
import YH.C16877v;
import YH.X;
import cJ.C17066c;
import cJ.C17067d;
import cJ.C17069f;
import iJ.C17373g;
import iJ.C17380n;
import iJ.C17391y;
import java.util.ArrayList;
import java.util.List;
import kJ.C17506e;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import uJ.C18096U;
import uJ.C18099X;
import uJ.C18113f0;
import uJ.E0;
import uJ.v0;
import zJ.C18755d;

/* renamed from: AI.i  reason: case insensitive filesystem */
public final class C15428i {
    public static final int a(C18096U u10) {
        C17542s.j(u10, "<this>");
        C15644c v10 = u10.getAnnotations().v(C15435p.a.f133055D);
        if (v10 == null) {
            return 0;
        }
        C17373g gVar = (C17373g) X.k(v10.a(), C15435p.f133039q);
        C17542s.h(gVar, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.constants.IntValue");
        return ((Number) ((C17380n) gVar).b()).intValue();
    }

    public static final C18113f0 b(C15429j jVar, C15649h hVar, C18096U u10, List<? extends C18096U> list, List<? extends C18096U> list2, List<C17069f> list3, C18096U u11, boolean z10) {
        C17542s.j(jVar, "builtIns");
        C17542s.j(hVar, "annotations");
        C17542s.j(list, "contextReceiverTypes");
        C17542s.j(list2, "parameterTypes");
        C17542s.j(u11, "returnType");
        List<E0> g10 = g(u10, list, list2, list3, u11, jVar);
        C15558e f10 = f(jVar, list2.size() + list.size() + (u10 == null ? 0 : 1), z10);
        if (u10 != null) {
            hVar = u(hVar, jVar);
        }
        if (!list.isEmpty()) {
            hVar = t(hVar, jVar, list.size());
        }
        return C18099X.h(v0.b(hVar), f10, g10);
    }

    public static /* synthetic */ C18113f0 c(C15429j jVar, C15649h hVar, C18096U u10, List list, List list2, List list3, C18096U u11, boolean z10, int i10, Object obj) {
        return b(jVar, hVar, u10, list, list2, list3, u11, (i10 & 128) != 0 ? false : z10);
    }

    public static final C17069f d(C18096U u10) {
        String str;
        C17542s.j(u10, "<this>");
        C15644c v10 = u10.getAnnotations().v(C15435p.a.f133057E);
        if (v10 == null) {
            return null;
        }
        Object c12 = C16877v.c1(v10.a().values());
        C17391y yVar = c12 instanceof C17391y ? (C17391y) c12 : null;
        if (!(yVar == null || (str = (String) yVar.b()) == null)) {
            if (!C17069f.C(str)) {
                str = null;
            }
            if (str != null) {
                return C17069f.v(str);
            }
        }
        return null;
    }

    public static final List<C18096U> e(C18096U u10) {
        C17542s.j(u10, "<this>");
        p(u10);
        int a10 = a(u10);
        if (a10 == 0) {
            return C16877v.n();
        }
        Iterable<E0> subList = u10.L0().subList(0, a10);
        ArrayList arrayList = new ArrayList(C16877v.y(subList, 10));
        for (E0 type : subList) {
            arrayList.add(type.getType());
        }
        return arrayList;
    }

    public static final C15558e f(C15429j jVar, int i10, boolean z10) {
        C17542s.j(jVar, "builtIns");
        C15558e Y10 = z10 ? jVar.Y(i10) : jVar.D(i10);
        C17542s.g(Y10);
        return Y10;
    }

    public static final List<E0> g(C18096U u10, List<? extends C18096U> list, List<? extends C18096U> list2, List<C17069f> list3, C18096U u11, C15429j jVar) {
        C17069f fVar;
        List<? extends C18096U> list4 = list;
        List<? extends C18096U> list5 = list2;
        List<C17069f> list6 = list3;
        C17542s.j(list4, "contextReceiverTypes");
        C17542s.j(list5, "parameterTypes");
        C17542s.j(u11, "returnType");
        C17542s.j(jVar, "builtIns");
        int i10 = 0;
        ArrayList arrayList = new ArrayList(list2.size() + list.size() + (u10 != null ? 1 : 0) + 1);
        Iterable<C18096U> iterable = list4;
        ArrayList arrayList2 = new ArrayList(C16877v.y(iterable, 10));
        for (C18096U d10 : iterable) {
            arrayList2.add(C18755d.d(d10));
        }
        arrayList.addAll(arrayList2);
        C15660a.a(arrayList, u10 != null ? C18755d.d(u10) : null);
        for (Object next : list5) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                C16877v.x();
            }
            C18096U u12 = (C18096U) next;
            if (list6 == null || (fVar = list6.get(i10)) == null || fVar.B()) {
                fVar = null;
            }
            if (fVar != null) {
                C17066c cVar = C15435p.a.f133057E;
                C17069f fVar2 = C15435p.f133035m;
                String b10 = fVar.b();
                C17542s.i(b10, "asString(...)");
                u12 = C18755d.C(u12, C15649h.f134231V.a(C16877v.U0(u12.getAnnotations(), new C15653l(jVar, cVar, X.f(C16796C.a(fVar2, new C17391y(b10))), false, 8, (DefaultConstructorMarker) null))));
            }
            arrayList.add(C18755d.d(u12));
            i10 = i11;
        }
        arrayList.add(C18755d.d(u11));
        return arrayList;
    }

    public static final f h(C15566m mVar) {
        C17542s.j(mVar, "<this>");
        if ((mVar instanceof C15558e) && C15429j.C0(mVar)) {
            return i(C17506e.p(mVar));
        }
        return null;
    }

    private static final f i(C17067d dVar) {
        if (!dVar.f() || dVar.e()) {
            return null;
        }
        g a10 = g.f133291c.a();
        C17066c d10 = dVar.m().d();
        String b10 = dVar.j().b();
        C17542s.i(b10, "asString(...)");
        return a10.b(d10, b10);
    }

    public static final f j(C18096U u10) {
        C17542s.j(u10, "<this>");
        C15561h e10 = u10.N0().e();
        if (e10 != null) {
            return h(e10);
        }
        return null;
    }

    public static final C18096U k(C18096U u10) {
        C17542s.j(u10, "<this>");
        p(u10);
        if (!s(u10)) {
            return null;
        }
        return u10.L0().get(a(u10)).getType();
    }

    public static final C18096U l(C18096U u10) {
        C17542s.j(u10, "<this>");
        p(u10);
        C18096U type = ((E0) C16877v.I0(u10.L0())).getType();
        C17542s.i(type, "getType(...)");
        return type;
    }

    public static final List<E0> m(C18096U u10) {
        C17542s.j(u10, "<this>");
        p(u10);
        List<E0> L02 = u10.L0();
        return L02.subList(a(u10) + (n(u10) ? 1 : 0), L02.size() - 1);
    }

    public static final boolean n(C18096U u10) {
        C17542s.j(u10, "<this>");
        return p(u10) && s(u10);
    }

    public static final boolean o(C15566m mVar) {
        C17542s.j(mVar, "<this>");
        f h10 = h(mVar);
        return C17542s.e(h10, f.a.f133287e) || C17542s.e(h10, f.d.f133290e);
    }

    public static final boolean p(C18096U u10) {
        C17542s.j(u10, "<this>");
        C15561h e10 = u10.N0().e();
        return e10 != null && o(e10);
    }

    public static final boolean q(C18096U u10) {
        C17542s.j(u10, "<this>");
        return C17542s.e(j(u10), f.a.f133287e);
    }

    public static final boolean r(C18096U u10) {
        C17542s.j(u10, "<this>");
        return C17542s.e(j(u10), f.d.f133290e);
    }

    private static final boolean s(C18096U u10) {
        return u10.getAnnotations().v(C15435p.a.f133053C) != null;
    }

    public static final C15649h t(C15649h hVar, C15429j jVar, int i10) {
        C17542s.j(hVar, "<this>");
        C17542s.j(jVar, "builtIns");
        C17066c cVar = C15435p.a.f133055D;
        if (hVar.f2(cVar)) {
            return hVar;
        }
        return C15649h.f134231V.a(C16877v.U0(hVar, new C15653l(jVar, cVar, X.f(C16796C.a(C15435p.f133039q, new C17380n(i10))), false, 8, (DefaultConstructorMarker) null)));
    }

    public static final C15649h u(C15649h hVar, C15429j jVar) {
        C17542s.j(hVar, "<this>");
        C17542s.j(jVar, "builtIns");
        C17066c cVar = C15435p.a.f133053C;
        if (hVar.f2(cVar)) {
            return hVar;
        }
        return C15649h.f134231V.a(C16877v.U0(hVar, new C15653l(jVar, cVar, X.j(), false, 8, (DefaultConstructorMarker) null)));
    }
}

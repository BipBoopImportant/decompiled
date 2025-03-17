package II;

import EJ.C15662c;
import GI.C15746p;
import VI.C16682n;
import VI.C16691w;
import VI.C16692x;
import WI.C16730a;
import YH.C16877v;
import cJ.C17065b;
import cJ.C17066c;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.C17542s;
import lJ.C17557d;
import nJ.C17647b;
import nJ.C17656k;

/* renamed from: II.a  reason: case insensitive filesystem */
public final class C15892a {

    /* renamed from: a  reason: collision with root package name */
    private final C16682n f135477a;

    /* renamed from: b  reason: collision with root package name */
    private final C15898g f135478b;

    /* renamed from: c  reason: collision with root package name */
    private final ConcurrentHashMap<C17065b, C17656k> f135479c = new ConcurrentHashMap<>();

    public C15892a(C16682n nVar, C15898g gVar) {
        C17542s.j(nVar, "resolver");
        C17542s.j(gVar, "kotlinClassFinder");
        this.f135477a = nVar;
        this.f135478b = gVar;
    }

    public final C17656k a(C15897f fVar) {
        List<C16692x> list;
        C17542s.j(fVar, "fileClass");
        ConcurrentHashMap<C17065b, C17656k> concurrentHashMap = this.f135479c;
        C17065b k10 = fVar.k();
        C17656k kVar = concurrentHashMap.get(k10);
        if (kVar == null) {
            C17066c f10 = fVar.k().f();
            if (fVar.b().c() == C16730a.C3422a.MULTIFILE_CLASS) {
                list = new ArrayList<>();
                for (String d10 : fVar.b().f()) {
                    C17065b.a aVar = C17065b.f141241d;
                    C17066c e10 = C17557d.d(d10).e();
                    C17542s.i(e10, "getFqNameForTopLevelClassMaybeWithDollars(...)");
                    C16692x b10 = C16691w.b(this.f135478b, aVar.c(e10), C15662c.a(this.f135477a.f().g()));
                    if (b10 != null) {
                        list.add(b10);
                    }
                }
            } else {
                list = C16877v.e(fVar);
            }
            C15746p pVar = new C15746p(this.f135477a.f().q(), f10);
            ArrayList arrayList = new ArrayList();
            for (C16692x c10 : list) {
                C17656k c11 = this.f135477a.c(pVar, c10);
                if (c11 != null) {
                    arrayList.add(c11);
                }
            }
            Iterable t12 = C16877v.t1(arrayList);
            C17647b.a aVar2 = C17647b.f144817d;
            C17656k a10 = aVar2.a("package " + f10 + " (" + fVar + ')', t12);
            C17656k putIfAbsent = concurrentHashMap.putIfAbsent(k10, a10);
            kVar = putIfAbsent == null ? a10 : putIfAbsent;
        }
        C17542s.i(kVar, "getOrPut(...)");
        return kVar;
    }
}

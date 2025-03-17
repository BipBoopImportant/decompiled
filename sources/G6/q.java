package G6;

import C6.b;
import C6.d;
import D6.f;
import D6.g;
import D6.s;
import H6.c;
import J6.a;
import java.util.ArrayList;
import java.util.Collections;
import w6.C8927i;

class q {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f36209a = c.a.a("nm", "g", "o", "t", "s", "e", "w", "lc", "lj", "ml", "hd", "d");

    /* renamed from: b  reason: collision with root package name */
    private static final c.a f36210b = c.a.a("p", "k");

    /* renamed from: c  reason: collision with root package name */
    private static final c.a f36211c = c.a.a("n", "v");

    static f a(c cVar, C8927i iVar) {
        String str;
        C6.c cVar2;
        c cVar3 = cVar;
        C8927i iVar2 = iVar;
        ArrayList arrayList = new ArrayList();
        float f10 = 0.0f;
        String str2 = null;
        g gVar = null;
        C6.c cVar4 = null;
        C6.f fVar = null;
        C6.f fVar2 = null;
        b bVar = null;
        s.b bVar2 = null;
        s.c cVar5 = null;
        b bVar3 = null;
        boolean z10 = false;
        d dVar = null;
        while (cVar.hasNext()) {
            switch (cVar3.n(f36209a)) {
                case 0:
                    str2 = cVar.C1();
                    continue;
                case 1:
                    str = str2;
                    cVar.e();
                    int i10 = -1;
                    while (cVar.hasNext()) {
                        int n10 = cVar3.n(f36210b);
                        if (n10 != 0) {
                            cVar2 = cVar4;
                            if (n10 != 1) {
                                cVar.o();
                                cVar.a0();
                            } else {
                                cVar4 = C6509d.g(cVar3, iVar2, i10);
                            }
                        } else {
                            cVar2 = cVar4;
                            i10 = cVar.G0();
                        }
                        cVar4 = cVar2;
                    }
                    C6.c cVar6 = cVar4;
                    cVar.g();
                    break;
                case 2:
                    String str3 = str2;
                    dVar = C6509d.h(cVar, iVar);
                    continue;
                case 3:
                    str = str2;
                    gVar = cVar.G0() == 1 ? g.LINEAR : g.RADIAL;
                    break;
                case 4:
                    String str4 = str2;
                    fVar = C6509d.i(cVar, iVar);
                    continue;
                case 5:
                    String str5 = str2;
                    fVar2 = C6509d.i(cVar, iVar);
                    continue;
                case 6:
                    String str6 = str2;
                    bVar = C6509d.e(cVar, iVar);
                    continue;
                case 7:
                    str = str2;
                    bVar2 = s.b.values()[cVar.G0() - 1];
                    break;
                case 8:
                    str = str2;
                    cVar5 = s.c.values()[cVar.G0() - 1];
                    break;
                case 9:
                    str = str2;
                    f10 = (float) cVar.d2();
                    break;
                case 10:
                    z10 = cVar.w1();
                    continue;
                case 11:
                    cVar.d();
                    while (cVar.hasNext()) {
                        cVar.e();
                        String str7 = null;
                        b bVar4 = null;
                        while (cVar.hasNext()) {
                            int n11 = cVar3.n(f36211c);
                            if (n11 != 0) {
                                b bVar5 = bVar3;
                                if (n11 != 1) {
                                    cVar.o();
                                    cVar.a0();
                                } else {
                                    bVar4 = C6509d.e(cVar, iVar);
                                }
                                bVar3 = bVar5;
                            } else {
                                b bVar6 = bVar3;
                                str7 = cVar.C1();
                            }
                        }
                        b bVar7 = bVar3;
                        cVar.g();
                        if (str7.equals("o")) {
                            bVar3 = bVar4;
                        } else {
                            if (str7.equals("d") || str7.equals("g")) {
                                iVar2.u(true);
                                arrayList.add(bVar4);
                            }
                            bVar3 = bVar7;
                        }
                    }
                    b bVar8 = bVar3;
                    cVar.f();
                    if (arrayList.size() == 1) {
                        arrayList.add((b) arrayList.get(0));
                    }
                    bVar3 = bVar8;
                    continue;
                default:
                    cVar.o();
                    cVar.a0();
                    continue;
            }
            str2 = str;
        }
        String str8 = str2;
        if (dVar == null) {
            dVar = new d(Collections.singletonList(new a(100)));
        }
        return new f(str8, gVar, cVar4, dVar, fVar, fVar2, bVar, bVar2, cVar5, f10, arrayList, bVar3, z10);
    }
}

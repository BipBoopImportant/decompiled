package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;

public final class L extends A {
    protected L() {
        this.f48528a.add(Z.FOR_IN);
        this.f48528a.add(Z.FOR_IN_CONST);
        this.f48528a.add(Z.FOR_IN_LET);
        this.f48528a.add(Z.FOR_LET);
        this.f48528a.add(Z.FOR_OF);
        this.f48528a.add(Z.FOR_OF_CONST);
        this.f48528a.add(Z.FOR_OF_LET);
        this.f48528a.add(Z.WHILE);
    }

    private static C7400s c(P p10, C7400s sVar, C7400s sVar2) {
        return d(p10, sVar.zzh(), sVar2);
    }

    private static C7400s d(P p10, Iterator<C7400s> it, C7400s sVar) {
        if (it != null) {
            while (it.hasNext()) {
                C7400s a10 = p10.a(it.next()).a((C7298g) sVar);
                if (a10 instanceof C7343l) {
                    C7343l lVar = (C7343l) a10;
                    if ("break".equals(lVar.b())) {
                        return C7400s.f49052k0;
                    }
                    if ("return".equals(lVar.b())) {
                        return lVar;
                    }
                }
            }
        }
        return C7400s.f49052k0;
    }

    private static C7400s e(P p10, C7400s sVar, C7400s sVar2) {
        if (sVar instanceof Iterable) {
            return d(p10, ((Iterable) sVar).iterator(), sVar2);
        }
        throw new IllegalArgumentException("Non-iterable type in for...of loop.");
    }

    public final C7400s b(String str, C7275d3 d3Var, List<C7400s> list) {
        switch (O.f48764a[C7265c2.c(str).ordinal()]) {
            case 1:
                C7265c2.f(Z.FOR_IN, 3, list);
                if (list.get(0) instanceof C7416u) {
                    return c(new T(d3Var, list.get(0).i()), d3Var.b(list.get(1)), d3Var.b(list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_IN must be a string");
            case 2:
                C7265c2.f(Z.FOR_IN_CONST, 3, list);
                if (list.get(0) instanceof C7416u) {
                    return c(new N(d3Var, list.get(0).i()), d3Var.b(list.get(1)), d3Var.b(list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_IN_CONST must be a string");
            case 3:
                C7265c2.f(Z.FOR_IN_LET, 3, list);
                if (list.get(0) instanceof C7416u) {
                    return c(new Q(d3Var, list.get(0).i()), d3Var.b(list.get(1)), d3Var.b(list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_IN_LET must be a string");
            case 4:
                C7265c2.f(Z.FOR_LET, 4, list);
                C7400s b10 = d3Var.b(list.get(0));
                if (b10 instanceof C7298g) {
                    C7298g gVar = (C7298g) b10;
                    C7400s sVar = list.get(1);
                    C7400s sVar2 = list.get(2);
                    C7400s b11 = d3Var.b(list.get(3));
                    C7275d3 d10 = d3Var.d();
                    for (int i10 = 0; i10 < gVar.s(); i10++) {
                        String i11 = gVar.p(i10).i();
                        d10.h(i11, d3Var.c(i11));
                    }
                    while (d3Var.b(sVar).zzd().booleanValue()) {
                        C7400s a10 = d3Var.a((C7298g) b11);
                        if (a10 instanceof C7343l) {
                            C7343l lVar = (C7343l) a10;
                            if ("break".equals(lVar.b())) {
                                return C7400s.f49052k0;
                            }
                            if ("return".equals(lVar.b())) {
                                return lVar;
                            }
                        }
                        C7275d3 d11 = d3Var.d();
                        for (int i12 = 0; i12 < gVar.s(); i12++) {
                            String i13 = gVar.p(i12).i();
                            d11.h(i13, d10.c(i13));
                        }
                        d11.b(sVar2);
                        d10 = d11;
                    }
                    return C7400s.f49052k0;
                }
                throw new IllegalArgumentException("Initializer variables in FOR_LET must be an ArrayList");
            case 5:
                C7265c2.f(Z.FOR_OF, 3, list);
                if (list.get(0) instanceof C7416u) {
                    return e(new T(d3Var, list.get(0).i()), d3Var.b(list.get(1)), d3Var.b(list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_OF must be a string");
            case 6:
                C7265c2.f(Z.FOR_OF_CONST, 3, list);
                if (list.get(0) instanceof C7416u) {
                    return e(new N(d3Var, list.get(0).i()), d3Var.b(list.get(1)), d3Var.b(list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_OF_CONST must be a string");
            case 7:
                C7265c2.f(Z.FOR_OF_LET, 3, list);
                if (list.get(0) instanceof C7416u) {
                    return e(new Q(d3Var, list.get(0).i()), d3Var.b(list.get(1)), d3Var.b(list.get(2)));
                }
                throw new IllegalArgumentException("Variable name in FOR_OF_LET must be a string");
            case 8:
                C7265c2.f(Z.WHILE, 4, list);
                C7400s sVar3 = list.get(0);
                C7400s sVar4 = list.get(1);
                C7400s b12 = d3Var.b(list.get(3));
                if (d3Var.b(list.get(2)).zzd().booleanValue()) {
                    C7400s a11 = d3Var.a((C7298g) b12);
                    if (a11 instanceof C7343l) {
                        C7343l lVar2 = (C7343l) a11;
                        if (!"break".equals(lVar2.b())) {
                            if ("return".equals(lVar2.b())) {
                                return lVar2;
                            }
                        }
                        return C7400s.f49052k0;
                    }
                }
                while (d3Var.b(sVar3).zzd().booleanValue()) {
                    C7400s a12 = d3Var.a((C7298g) b12);
                    if (a12 instanceof C7343l) {
                        C7343l lVar3 = (C7343l) a12;
                        if ("break".equals(lVar3.b())) {
                            return C7400s.f49052k0;
                        }
                        if ("return".equals(lVar3.b())) {
                            return lVar3;
                        }
                    }
                    d3Var.b(sVar4);
                }
                return C7400s.f49052k0;
            default:
                return super.a(str);
        }
    }
}

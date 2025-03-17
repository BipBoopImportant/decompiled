package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

public final class F extends A {
    protected F() {
        this.f48528a.add(Z.APPLY);
        this.f48528a.add(Z.BLOCK);
        this.f48528a.add(Z.BREAK);
        this.f48528a.add(Z.CASE);
        this.f48528a.add(Z.DEFAULT);
        this.f48528a.add(Z.CONTINUE);
        this.f48528a.add(Z.DEFINE_FUNCTION);
        this.f48528a.add(Z.FN);
        this.f48528a.add(Z.IF);
        this.f48528a.add(Z.QUOTE);
        this.f48528a.add(Z.RETURN);
        this.f48528a.add(Z.SWITCH);
        this.f48528a.add(Z.TERNARY);
    }

    private static C7400s c(C7275d3 d3Var, List<C7400s> list) {
        C7265c2.j(Z.FN, 2, list);
        C7400s b10 = d3Var.b(list.get(0));
        C7400s b11 = d3Var.b(list.get(1));
        if (b11 instanceof C7298g) {
            List<C7400s> C10 = ((C7298g) b11).C();
            List<C7400s> arrayList = new ArrayList<>();
            if (list.size() > 2) {
                arrayList = list.subList(2, list.size());
            }
            return new C7408t(b10.i(), C10, arrayList, d3Var);
        }
        throw new IllegalArgumentException(String.format("FN requires an ArrayValue of parameter names found %s", new Object[]{b11.getClass().getCanonicalName()}));
    }

    public final C7400s b(String str, C7275d3 d3Var, List<C7400s> list) {
        int i10 = 0;
        switch (I.f48679a[C7265c2.c(str).ordinal()]) {
            case 1:
                C7265c2.f(Z.APPLY, 3, list);
                C7400s b10 = d3Var.b(list.get(0));
                String i11 = d3Var.b(list.get(1)).i();
                C7400s b11 = d3Var.b(list.get(2));
                if (!(b11 instanceof C7298g)) {
                    throw new IllegalArgumentException(String.format("Function arguments for Apply are not a list found %s", new Object[]{b11.getClass().getCanonicalName()}));
                } else if (!i11.isEmpty()) {
                    return b10.k(i11, d3Var, ((C7298g) b11).C());
                } else {
                    throw new IllegalArgumentException("Function name for apply is undefined");
                }
            case 2:
                return d3Var.d().a(new C7298g(list));
            case 3:
                C7265c2.f(Z.BREAK, 0, list);
                return C7400s.f49055n0;
            case 4:
            case 5:
                if (!list.isEmpty()) {
                    C7400s b12 = d3Var.b(list.get(0));
                    if (b12 instanceof C7298g) {
                        return d3Var.a((C7298g) b12);
                    }
                }
                return C7400s.f49052k0;
            case 6:
                C7265c2.f(Z.BREAK, 0, list);
                return C7400s.f49054m0;
            case 7:
                C7265c2.j(Z.DEFINE_FUNCTION, 2, list);
                C7408t tVar = (C7408t) c(d3Var, list);
                if (tVar.b() == null) {
                    d3Var.h("", tVar);
                } else {
                    d3Var.h(tVar.b(), tVar);
                }
                return tVar;
            case 8:
                return c(d3Var, list);
            case 9:
                C7265c2.j(Z.IF, 2, list);
                C7400s b13 = d3Var.b(list.get(0));
                C7400s b14 = d3Var.b(list.get(1));
                C7400s b15 = list.size() > 2 ? d3Var.b(list.get(2)) : null;
                C7400s sVar = C7400s.f49052k0;
                C7400s a10 = b13.zzd().booleanValue() ? d3Var.a((C7298g) b14) : b15 != null ? d3Var.a((C7298g) b15) : sVar;
                return a10 instanceof C7343l ? a10 : sVar;
            case 10:
                return new C7298g(list);
            case 11:
                if (list.isEmpty()) {
                    return C7400s.f49056o0;
                }
                C7265c2.f(Z.RETURN, 1, list);
                return new C7343l("return", d3Var.b(list.get(0)));
            case 12:
                C7265c2.f(Z.SWITCH, 3, list);
                C7400s b16 = d3Var.b(list.get(0));
                C7400s b17 = d3Var.b(list.get(1));
                C7400s b18 = d3Var.b(list.get(2));
                if (!(b17 instanceof C7298g)) {
                    throw new IllegalArgumentException("Malformed SWITCH statement, cases are not a list");
                } else if (b18 instanceof C7298g) {
                    C7298g gVar = (C7298g) b17;
                    C7298g gVar2 = (C7298g) b18;
                    boolean z10 = false;
                    while (true) {
                        if (i10 < gVar.s()) {
                            if (z10 || b16.equals(d3Var.b(gVar.p(i10)))) {
                                C7400s b19 = d3Var.b(gVar2.p(i10));
                                if (!(b19 instanceof C7343l)) {
                                    z10 = true;
                                } else if (!((C7343l) b19).b().equals("break")) {
                                    return b19;
                                }
                            }
                            i10++;
                        } else if (gVar.s() + 1 == gVar2.s()) {
                            C7400s b20 = d3Var.b(gVar2.p(gVar.s()));
                            if (b20 instanceof C7343l) {
                                String b21 = ((C7343l) b20).b();
                                if (b21.equals("return") || b21.equals("continue")) {
                                    return b20;
                                }
                            }
                        }
                    }
                    return C7400s.f49052k0;
                } else {
                    throw new IllegalArgumentException("Malformed SWITCH statement, case statements are not a list");
                }
            case 13:
                C7265c2.f(Z.TERNARY, 3, list);
                return d3Var.b(list.get(0)).zzd().booleanValue() ? d3Var.b(list.get(1)) : d3Var.b(list.get(2));
            default:
                return super.a(str);
        }
    }
}

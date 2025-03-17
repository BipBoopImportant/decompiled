package com.google.android.gms.internal.measurement;

import com.optimizely.ab.config.FeatureVariable;
import java.util.List;

public final class X extends A {
    protected X() {
        this.f48528a.add(Z.ASSIGN);
        this.f48528a.add(Z.CONST);
        this.f48528a.add(Z.CREATE_ARRAY);
        this.f48528a.add(Z.CREATE_OBJECT);
        this.f48528a.add(Z.EXPRESSION_LIST);
        this.f48528a.add(Z.GET);
        this.f48528a.add(Z.GET_INDEX);
        this.f48528a.add(Z.GET_PROPERTY);
        this.f48528a.add(Z.NULL);
        this.f48528a.add(Z.SET_PROPERTY);
        this.f48528a.add(Z.TYPEOF);
        this.f48528a.add(Z.UNDEFINED);
        this.f48528a.add(Z.VAR);
    }

    public final C7400s b(String str, C7275d3 d3Var, List<C7400s> list) {
        String str2;
        int i10 = 0;
        switch (W.f48820a[C7265c2.c(str).ordinal()]) {
            case 1:
                C7265c2.f(Z.ASSIGN, 2, list);
                C7400s b10 = d3Var.b(list.get(0));
                if (!(b10 instanceof C7416u)) {
                    throw new IllegalArgumentException(String.format("Expected string for assign var. got %s", new Object[]{b10.getClass().getCanonicalName()}));
                } else if (d3Var.g(b10.i())) {
                    C7400s b11 = d3Var.b(list.get(1));
                    d3Var.h(b10.i(), b11);
                    return b11;
                } else {
                    throw new IllegalArgumentException(String.format("Attempting to assign undefined value %s", new Object[]{b10.i()}));
                }
            case 2:
                C7265c2.j(Z.CONST, 2, list);
                if (list.size() % 2 == 0) {
                    while (i10 < list.size() - 1) {
                        C7400s b12 = d3Var.b(list.get(i10));
                        if (b12 instanceof C7416u) {
                            d3Var.f(b12.i(), d3Var.b(list.get(i10 + 1)));
                            i10 += 2;
                        } else {
                            throw new IllegalArgumentException(String.format("Expected string for const name. got %s", new Object[]{b12.getClass().getCanonicalName()}));
                        }
                    }
                    return C7400s.f49052k0;
                }
                throw new IllegalArgumentException(String.format("CONST requires an even number of arguments, found %s", new Object[]{Integer.valueOf(list.size())}));
            case 3:
                if (list.isEmpty()) {
                    return new C7298g();
                }
                C7298g gVar = new C7298g();
                for (C7400s b13 : list) {
                    C7400s b14 = d3Var.b(b13);
                    if (!(b14 instanceof C7343l)) {
                        gVar.y(i10, b14);
                        i10++;
                    } else {
                        throw new IllegalStateException("Failed to evaluate array element");
                    }
                }
                return gVar;
            case 4:
                if (list.isEmpty()) {
                    return new r();
                }
                if (list.size() % 2 == 0) {
                    r rVar = new r();
                    while (i10 < list.size() - 1) {
                        C7400s b15 = d3Var.b(list.get(i10));
                        C7400s b16 = d3Var.b(list.get(i10 + 1));
                        if ((b15 instanceof C7343l) || (b16 instanceof C7343l)) {
                            throw new IllegalStateException("Failed to evaluate map entry");
                        }
                        rVar.m(b15.i(), b16);
                        i10 += 2;
                    }
                    return rVar;
                }
                throw new IllegalArgumentException(String.format("CREATE_OBJECT requires an even number of arguments, found %s", new Object[]{Integer.valueOf(list.size())}));
            case 5:
                C7265c2.j(Z.EXPRESSION_LIST, 1, list);
                C7400s sVar = C7400s.f49052k0;
                while (i10 < list.size()) {
                    sVar = d3Var.b(list.get(i10));
                    if (!(sVar instanceof C7343l)) {
                        i10++;
                    } else {
                        throw new IllegalStateException("ControlValue cannot be in an expression list");
                    }
                }
                return sVar;
            case 6:
                C7265c2.f(Z.GET, 1, list);
                C7400s b17 = d3Var.b(list.get(0));
                if (b17 instanceof C7416u) {
                    return d3Var.c(b17.i());
                }
                throw new IllegalArgumentException(String.format("Expected string for get var. got %s", new Object[]{b17.getClass().getCanonicalName()}));
            case 7:
            case 8:
                C7265c2.f(Z.GET_PROPERTY, 2, list);
                C7400s b18 = d3Var.b(list.get(0));
                C7400s b19 = d3Var.b(list.get(1));
                if ((b18 instanceof C7298g) && C7265c2.l(b19)) {
                    return ((C7298g) b18).p(b19.h().intValue());
                }
                if (b18 instanceof C7352m) {
                    return ((C7352m) b18).zza(b19.i());
                }
                if (b18 instanceof C7416u) {
                    if ("length".equals(b19.i())) {
                        return new C7334k(Double.valueOf((double) b18.i().length()));
                    }
                    if (C7265c2.l(b19) && b19.h().doubleValue() < ((double) b18.i().length())) {
                        return new C7416u(String.valueOf(b18.i().charAt(b19.h().intValue())));
                    }
                }
                return C7400s.f49052k0;
            case 9:
                C7265c2.f(Z.NULL, 0, list);
                return C7400s.f49053l0;
            case 10:
                C7265c2.f(Z.SET_PROPERTY, 3, list);
                C7400s b20 = d3Var.b(list.get(0));
                C7400s b21 = d3Var.b(list.get(1));
                C7400s b22 = d3Var.b(list.get(2));
                if (b20 == C7400s.f49052k0 || b20 == C7400s.f49053l0) {
                    throw new IllegalStateException(String.format("Can't set property %s of %s", new Object[]{b21.i(), b20.i()}));
                }
                if ((b20 instanceof C7298g) && (b21 instanceof C7334k)) {
                    ((C7298g) b20).y(b21.h().intValue(), b22);
                } else if (b20 instanceof C7352m) {
                    ((C7352m) b20).m(b21.i(), b22);
                }
                return b22;
            case 11:
                C7265c2.f(Z.TYPEOF, 1, list);
                C7400s b23 = d3Var.b(list.get(0));
                if (b23 instanceof C7456z) {
                    str2 = "undefined";
                } else if (b23 instanceof C7307h) {
                    str2 = FeatureVariable.BOOLEAN_TYPE;
                } else if (b23 instanceof C7334k) {
                    str2 = "number";
                } else if (b23 instanceof C7416u) {
                    str2 = FeatureVariable.STRING_TYPE;
                } else if (b23 instanceof C7408t) {
                    str2 = "function";
                } else if ((b23 instanceof C7424v) || (b23 instanceof C7343l)) {
                    throw new IllegalArgumentException(String.format("Unsupported value type %s in typeof", new Object[]{b23}));
                } else {
                    str2 = "object";
                }
                return new C7416u(str2);
            case 12:
                C7265c2.f(Z.UNDEFINED, 0, list);
                return C7400s.f49052k0;
            case 13:
                C7265c2.j(Z.VAR, 1, list);
                for (C7400s b24 : list) {
                    C7400s b25 = d3Var.b(b24);
                    if (b25 instanceof C7416u) {
                        d3Var.e(b25.i(), C7400s.f49052k0);
                    } else {
                        throw new IllegalArgumentException(String.format("Expected string for var name. got %s", new Object[]{b25.getClass().getCanonicalName()}));
                    }
                }
                return C7400s.f49052k0;
            default:
                return super.a(str);
        }
    }
}

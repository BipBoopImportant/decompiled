package com.google.android.gms.internal.measurement;

import java.util.List;

public final class S extends A {
    protected S() {
        this.f48528a.add(Z.ADD);
        this.f48528a.add(Z.DIVIDE);
        this.f48528a.add(Z.MODULUS);
        this.f48528a.add(Z.MULTIPLY);
        this.f48528a.add(Z.NEGATE);
        this.f48528a.add(Z.POST_DECREMENT);
        this.f48528a.add(Z.POST_INCREMENT);
        this.f48528a.add(Z.PRE_DECREMENT);
        this.f48528a.add(Z.PRE_INCREMENT);
        this.f48528a.add(Z.SUBTRACT);
    }

    public final C7400s b(String str, C7275d3 d3Var, List<C7400s> list) {
        switch (V.f48817a[C7265c2.c(str).ordinal()]) {
            case 1:
                C7265c2.f(Z.ADD, 2, list);
                C7400s b10 = d3Var.b(list.get(0));
                C7400s b11 = d3Var.b(list.get(1));
                if (!(b10 instanceof C7352m) && !(b10 instanceof C7416u) && !(b11 instanceof C7352m) && !(b11 instanceof C7416u)) {
                    return new C7334k(Double.valueOf(b10.h().doubleValue() + b11.h().doubleValue()));
                }
                String i10 = b10.i();
                String i11 = b11.i();
                return new C7416u(i10 + i11);
            case 2:
                C7265c2.f(Z.DIVIDE, 2, list);
                return new C7334k(Double.valueOf(d3Var.b(list.get(0)).h().doubleValue() / d3Var.b(list.get(1)).h().doubleValue()));
            case 3:
                C7265c2.f(Z.MODULUS, 2, list);
                return new C7334k(Double.valueOf(d3Var.b(list.get(0)).h().doubleValue() % d3Var.b(list.get(1)).h().doubleValue()));
            case 4:
                C7265c2.f(Z.MULTIPLY, 2, list);
                return new C7334k(Double.valueOf(d3Var.b(list.get(0)).h().doubleValue() * d3Var.b(list.get(1)).h().doubleValue()));
            case 5:
                C7265c2.f(Z.NEGATE, 1, list);
                return new C7334k(Double.valueOf(d3Var.b(list.get(0)).h().doubleValue() * -1.0d));
            case 6:
            case 7:
                C7265c2.g(str, 2, list);
                C7400s b12 = d3Var.b(list.get(0));
                d3Var.b(list.get(1));
                return b12;
            case 8:
            case 9:
                C7265c2.g(str, 1, list);
                return d3Var.b(list.get(0));
            case 10:
                C7265c2.f(Z.SUBTRACT, 2, list);
                return new C7334k(Double.valueOf(d3Var.b(list.get(0)).h().doubleValue() + new C7334k(Double.valueOf(d3Var.b(list.get(1)).h().doubleValue() * -1.0d)).h().doubleValue()));
            default:
                return super.a(str);
        }
    }
}

package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.y  reason: case insensitive filesystem */
public final class C7448y extends A {
    public C7448y() {
        this.f48528a.add(Z.BITWISE_AND);
        this.f48528a.add(Z.BITWISE_LEFT_SHIFT);
        this.f48528a.add(Z.BITWISE_NOT);
        this.f48528a.add(Z.BITWISE_OR);
        this.f48528a.add(Z.BITWISE_RIGHT_SHIFT);
        this.f48528a.add(Z.BITWISE_UNSIGNED_RIGHT_SHIFT);
        this.f48528a.add(Z.BITWISE_XOR);
    }

    public final C7400s b(String str, C7275d3 d3Var, List<C7400s> list) {
        switch (B.f48539a[C7265c2.c(str).ordinal()]) {
            case 1:
                C7265c2.f(Z.BITWISE_AND, 2, list);
                return new C7334k(Double.valueOf((double) (C7265c2.i(d3Var.b(list.get(0)).h().doubleValue()) & C7265c2.i(d3Var.b(list.get(1)).h().doubleValue()))));
            case 2:
                C7265c2.f(Z.BITWISE_LEFT_SHIFT, 2, list);
                return new C7334k(Double.valueOf((double) (C7265c2.i(d3Var.b(list.get(0)).h().doubleValue()) << ((int) (C7265c2.m(d3Var.b(list.get(1)).h().doubleValue()) & 31)))));
            case 3:
                C7265c2.f(Z.BITWISE_NOT, 1, list);
                return new C7334k(Double.valueOf((double) (~C7265c2.i(d3Var.b(list.get(0)).h().doubleValue()))));
            case 4:
                C7265c2.f(Z.BITWISE_OR, 2, list);
                return new C7334k(Double.valueOf((double) (C7265c2.i(d3Var.b(list.get(0)).h().doubleValue()) | C7265c2.i(d3Var.b(list.get(1)).h().doubleValue()))));
            case 5:
                C7265c2.f(Z.BITWISE_RIGHT_SHIFT, 2, list);
                return new C7334k(Double.valueOf((double) (C7265c2.i(d3Var.b(list.get(0)).h().doubleValue()) >> ((int) (C7265c2.m(d3Var.b(list.get(1)).h().doubleValue()) & 31)))));
            case 6:
                C7265c2.f(Z.BITWISE_UNSIGNED_RIGHT_SHIFT, 2, list);
                return new C7334k(Double.valueOf((double) (C7265c2.m(d3Var.b(list.get(0)).h().doubleValue()) >>> ((int) (C7265c2.m(d3Var.b(list.get(1)).h().doubleValue()) & 31)))));
            case 7:
                C7265c2.f(Z.BITWISE_XOR, 2, list);
                return new C7334k(Double.valueOf((double) (C7265c2.i(d3Var.b(list.get(0)).h().doubleValue()) ^ C7265c2.i(d3Var.b(list.get(1)).h().doubleValue()))));
            default:
                return super.a(str);
        }
    }
}

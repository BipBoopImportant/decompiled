package com.google.android.gms.internal.measurement;

import java.util.List;

public final class J extends A {
    protected J() {
        this.f48528a.add(Z.AND);
        this.f48528a.add(Z.NOT);
        this.f48528a.add(Z.OR);
    }

    public final C7400s b(String str, C7275d3 d3Var, List<C7400s> list) {
        int i10 = M.f48744a[C7265c2.c(str).ordinal()];
        if (i10 == 1) {
            C7265c2.f(Z.AND, 2, list);
            C7400s b10 = d3Var.b(list.get(0));
            return !b10.zzd().booleanValue() ? b10 : d3Var.b(list.get(1));
        } else if (i10 == 2) {
            C7265c2.f(Z.NOT, 1, list);
            return new C7307h(Boolean.valueOf(!d3Var.b(list.get(0)).zzd().booleanValue()));
        } else if (i10 != 3) {
            return super.a(str);
        } else {
            C7265c2.f(Z.OR, 2, list);
            C7400s b11 = d3Var.b(list.get(0));
            return b11.zzd().booleanValue() ? b11 : d3Var.b(list.get(1));
        }
    }
}

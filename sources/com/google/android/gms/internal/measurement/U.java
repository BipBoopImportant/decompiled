package com.google.android.gms.internal.measurement;

import java.util.List;

public final class U extends A {
    public final C7400s b(String str, C7275d3 d3Var, List<C7400s> list) {
        if (str == null || str.isEmpty() || !d3Var.g(str)) {
            throw new IllegalArgumentException(String.format("Command not found: %s", new Object[]{str}));
        }
        C7400s c10 = d3Var.c(str);
        if (c10 instanceof C7361n) {
            return ((C7361n) c10).a(d3Var, list);
        }
        throw new IllegalArgumentException(String.format("Function %s is not defined", new Object[]{str}));
    }
}

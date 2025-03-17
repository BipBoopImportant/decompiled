package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

public abstract class A {

    /* renamed from: a  reason: collision with root package name */
    final List<Z> f48528a = new ArrayList();

    protected A() {
    }

    /* access modifiers changed from: package-private */
    public final C7400s a(String str) {
        if (this.f48528a.contains(C7265c2.c(str))) {
            throw new UnsupportedOperationException("Command not implemented: " + str);
        }
        throw new IllegalArgumentException("Command not supported");
    }

    public abstract C7400s b(String str, C7275d3 d3Var, List<C7400s> list);
}

package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.concurrent.Callable;

public final class K7 extends C7361n {

    /* renamed from: c  reason: collision with root package name */
    private final Callable<Object> f48717c;

    public K7(String str, Callable<Object> callable) {
        super(str);
        this.f48717c = callable;
    }

    public final C7400s a(C7275d3 d3Var, List<C7400s> list) {
        try {
            return C7294f4.b(this.f48717c.call());
        } catch (Exception unused) {
            return C7400s.f49052k0;
        }
    }
}

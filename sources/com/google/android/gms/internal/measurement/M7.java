package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class M7 extends C7361n {

    /* renamed from: c  reason: collision with root package name */
    private final C7295f5 f48753c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, C7361n> f48754d = new HashMap();

    public M7(C7295f5 f5Var) {
        super("require");
        this.f48753c = f5Var;
    }

    public final C7400s a(C7275d3 d3Var, List<C7400s> list) {
        C7265c2.g("require", 1, list);
        String i10 = d3Var.b(list.get(0)).i();
        if (this.f48754d.containsKey(i10)) {
            return this.f48754d.get(i10);
        }
        C7400s a10 = this.f48753c.a(i10);
        if (a10 instanceof C7361n) {
            this.f48754d.put(i10, (C7361n) a10);
        }
        return a10;
    }
}

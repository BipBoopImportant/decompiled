package com.google.android.gms.internal.measurement;

import java.util.List;

public final class E7 extends C7361n {
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final I7 f48650c;

    public E7(I7 i72) {
        super("internal.logger");
        this.f48650c = i72;
        this.f49018b.put("log", new H7(this, false, true));
        this.f49018b.put("silent", new D7(this, "silent"));
        ((C7361n) this.f49018b.get("silent")).m("log", new H7(this, true, true));
        this.f49018b.put("unmonitored", new G7(this, "unmonitored"));
        ((C7361n) this.f49018b.get("unmonitored")).m("log", new H7(this, false, false));
    }

    public final C7400s a(C7275d3 d3Var, List<C7400s> list) {
        return C7400s.f49052k0;
    }
}

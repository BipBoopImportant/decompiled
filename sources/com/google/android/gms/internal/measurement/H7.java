package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class H7 extends C7361n {

    /* renamed from: c  reason: collision with root package name */
    private boolean f48676c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f48677d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ E7 f48678e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public H7(E7 e72, boolean z10, boolean z11) {
        super("log");
        this.f48678e = e72;
        this.f48676c = z10;
        this.f48677d = z11;
    }

    public final C7400s a(C7275d3 d3Var, List<C7400s> list) {
        C7265c2.k("log", 1, list);
        if (list.size() == 1) {
            this.f48678e.f48650c.a(F7.INFO, d3Var.b(list.get(0)).i(), Collections.emptyList(), this.f48676c, this.f48677d);
            return C7400s.f49052k0;
        }
        F7 a10 = F7.a(C7265c2.i(d3Var.b(list.get(0)).h().doubleValue()));
        String i10 = d3Var.b(list.get(1)).i();
        if (list.size() == 2) {
            this.f48678e.f48650c.a(a10, i10, Collections.emptyList(), this.f48676c, this.f48677d);
            return C7400s.f49052k0;
        }
        ArrayList arrayList = new ArrayList();
        for (int i11 = 2; i11 < Math.min(list.size(), 5); i11++) {
            arrayList.add(d3Var.b(list.get(i11)).i());
        }
        this.f48678e.f48650c.a(a10, i10, arrayList, this.f48676c, this.f48677d);
        return C7400s.f49052k0;
    }
}

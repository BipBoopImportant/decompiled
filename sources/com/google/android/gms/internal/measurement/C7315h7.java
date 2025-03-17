package com.google.android.gms.internal.measurement;

import java.util.List;

/* renamed from: com.google.android.gms.internal.measurement.h7  reason: case insensitive filesystem */
final class C7315h7 extends C7361n {

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ G6 f48940c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C7315h7(F5 f52, String str, G6 g62) {
        super(str);
        this.f48940c = g62;
    }

    public final C7400s a(C7275d3 d3Var, List<C7400s> list) {
        C7265c2.g("getValue", 2, list);
        C7400s b10 = d3Var.b(list.get(0));
        C7400s b11 = d3Var.b(list.get(1));
        String zza = this.f48940c.zza(b10.i());
        return zza != null ? new C7416u(zza) : b11;
    }
}

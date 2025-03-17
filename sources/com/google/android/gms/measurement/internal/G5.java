package com.google.android.gms.measurement.internal;

import android.content.Intent;

final class G5 extends A {

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ C7728y5 f49645e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    G5(C7728y5 y5Var, C7657o3 o3Var) {
        super(o3Var);
        this.f49645e = y5Var;
    }

    public final void d() {
        this.f49645e.J0();
        String str = (String) this.f49645e.f50518q.pollFirst();
        if (str != null) {
            C7728y5 y5Var = this.f49645e;
            y5Var.f50500I = y5Var.zzb().c();
            this.f49645e.f().I().b("Sending trigger URI notification to app", str);
            Intent intent = new Intent();
            intent.setAction("com.google.android.gms.measurement.TRIGGERS_AVAILABLE");
            intent.setPackage(str);
            this.f49645e.zza().sendBroadcast(intent);
        }
        this.f49645e.X();
    }
}

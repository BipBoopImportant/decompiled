package com.google.android.gms.internal.measurement;

import K9.C6620s;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C7327j1;

/* renamed from: com.google.android.gms.internal.measurement.n1  reason: case insensitive filesystem */
final class C7363n1 extends C7327j1.a {

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ String f49019e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ String f49020f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ Bundle f49021g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ C7327j1 f49022h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C7363n1(C7327j1 j1Var, String str, String str2, Bundle bundle) {
        super(j1Var);
        this.f49019e = str;
        this.f49020f = str2;
        this.f49021g = bundle;
        this.f49022h = j1Var;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        ((Q0) C6620s.l(this.f49022h.f48973i)).clearConditionalUserProperty(this.f49019e, this.f49020f, this.f49021g);
    }
}

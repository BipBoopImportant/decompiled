package com.google.android.gms.internal.measurement;

import K9.C6620s;
import android.os.Bundle;
import com.google.android.gms.internal.measurement.C7327j1;

final class L1 extends C7327j1.a {

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ Long f48718e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ String f48719f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ String f48720g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ Bundle f48721h;

    /* renamed from: i  reason: collision with root package name */
    private final /* synthetic */ boolean f48722i;

    /* renamed from: j  reason: collision with root package name */
    private final /* synthetic */ boolean f48723j;

    /* renamed from: k  reason: collision with root package name */
    private final /* synthetic */ C7327j1 f48724k;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    L1(C7327j1 j1Var, Long l10, String str, String str2, Bundle bundle, boolean z10, boolean z11) {
        super(j1Var);
        this.f48718e = l10;
        this.f48719f = str;
        this.f48720g = str2;
        this.f48721h = bundle;
        this.f48722i = z10;
        this.f48723j = z11;
        this.f48724k = j1Var;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        Long l10 = this.f48718e;
        ((Q0) C6620s.l(this.f48724k.f48973i)).logEvent(this.f48719f, this.f48720g, this.f48721h, this.f48722i, this.f48723j, l10 == null ? this.f48974a : l10.longValue());
    }
}

package com.google.android.gms.internal.measurement;

import K9.C6620s;
import T9.d;
import com.google.android.gms.internal.measurement.C7327j1;

final class G1 extends C7327j1.a {

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ int f48659e = 5;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ String f48660f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ Object f48661g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ Object f48662h;

    /* renamed from: i  reason: collision with root package name */
    private final /* synthetic */ Object f48663i;

    /* renamed from: j  reason: collision with root package name */
    private final /* synthetic */ C7327j1 f48664j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    G1(C7327j1 j1Var, boolean z10, int i10, String str, Object obj, Object obj2, Object obj3) {
        super(false);
        this.f48660f = str;
        this.f48661g = obj;
        this.f48662h = null;
        this.f48663i = null;
        this.f48664j = j1Var;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        ((Q0) C6620s.l(this.f48664j.f48973i)).logHealthData(this.f48659e, this.f48660f, d.L3(this.f48661g), d.L3(null), d.L3(null));
    }
}

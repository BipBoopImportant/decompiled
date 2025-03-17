package com.google.android.gms.internal.measurement;

import K9.C6620s;
import T9.d;
import com.google.android.gms.internal.measurement.C7327j1;

/* renamed from: com.google.android.gms.internal.measurement.l1  reason: case insensitive filesystem */
final class C7345l1 extends C7327j1.a {

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ String f48991e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ String f48992f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ Object f48993g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ boolean f48994h;

    /* renamed from: i  reason: collision with root package name */
    private final /* synthetic */ C7327j1 f48995i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C7345l1(C7327j1 j1Var, String str, String str2, Object obj, boolean z10) {
        super(j1Var);
        this.f48991e = str;
        this.f48992f = str2;
        this.f48993g = obj;
        this.f48994h = z10;
        this.f48995i = j1Var;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        ((Q0) C6620s.l(this.f48995i.f48973i)).setUserProperty(this.f48991e, this.f48992f, d.L3(this.f48993g), this.f48994h, this.f48974a);
    }
}

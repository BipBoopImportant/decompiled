package com.google.android.gms.internal.measurement;

import K9.C6620s;
import T9.d;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.internal.measurement.C7327j1;
import sa.C8768v;

/* renamed from: com.google.android.gms.internal.measurement.m1  reason: case insensitive filesystem */
final class C7354m1 extends C7327j1.a {

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ String f48999e;

    /* renamed from: f  reason: collision with root package name */
    private final /* synthetic */ String f49000f;

    /* renamed from: g  reason: collision with root package name */
    private final /* synthetic */ Context f49001g;

    /* renamed from: h  reason: collision with root package name */
    private final /* synthetic */ Bundle f49002h;

    /* renamed from: i  reason: collision with root package name */
    private final /* synthetic */ C7327j1 f49003i;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C7354m1(C7327j1 j1Var, String str, String str2, Context context, Bundle bundle) {
        super(j1Var);
        this.f48999e = str;
        this.f49000f = str2;
        this.f49001g = context;
        this.f49002h = bundle;
        this.f49003i = j1Var;
    }

    public final void a() {
        String str;
        String str2;
        String str3;
        try {
            if (this.f49003i.I(this.f48999e, this.f49000f)) {
                str = this.f49000f;
                str2 = this.f48999e;
                str3 = this.f49003i.f48965a;
            } else {
                str3 = null;
                str2 = null;
                str = null;
            }
            C6620s.l(this.f49001g);
            C7327j1 j1Var = this.f49003i;
            j1Var.f48973i = j1Var.c(this.f49001g, true);
            if (this.f49003i.f48973i == null) {
                Log.w(this.f49003i.f48965a, "Failed to connect to measurement client.");
                return;
            }
            int a10 = DynamiteModule.a(this.f49001g, ModuleDescriptor.MODULE_ID);
            int c10 = DynamiteModule.c(this.f49001g, ModuleDescriptor.MODULE_ID);
            ((Q0) C6620s.l(this.f49003i.f48973i)).initialize(d.L3(this.f49001g), new C7282e1(114010, (long) Math.max(a10, c10), c10 < a10, str3, str2, str, this.f49002h, C8768v.a(this.f49001g)), this.f48974a);
        } catch (Exception e10) {
            this.f49003i.q(e10, true, false);
        }
    }
}

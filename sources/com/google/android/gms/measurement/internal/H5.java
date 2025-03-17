package com.google.android.gms.measurement.internal;

import K9.C6620s;
import android.os.Bundle;

final class H5 implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final /* synthetic */ String f49652a;

    /* renamed from: b  reason: collision with root package name */
    private final /* synthetic */ String f49653b;

    /* renamed from: c  reason: collision with root package name */
    private final /* synthetic */ Bundle f49654c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ I5 f49655d;

    H5(I5 i52, String str, String str2, Bundle bundle) {
        this.f49652a = str;
        this.f49653b = str2;
        this.f49654c = bundle;
        this.f49655d = i52;
    }

    public final void run() {
        this.f49655d.f49671a.w((J) C6620s.l(this.f49655d.f49671a.I0().F(this.f49652a, this.f49653b, this.f49654c, "auto", this.f49655d.f49671a.zzb().a(), false, true)), this.f49652a);
    }
}

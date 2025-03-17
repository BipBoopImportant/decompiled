package com.oppwa.mobile.connect.provider.threeds.v2;

import android.app.Activity;

public final /* synthetic */ class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Activity f122129a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ a f122130b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ String f122131c;

    public /* synthetic */ l(Activity activity, a aVar, String str) {
        this.f122129a = activity;
        this.f122130b = aVar;
        this.f122131c = str;
    }

    public final void run() {
        new c(this.f122129a.getApplicationContext(), this.f122130b).a(this.f122131c);
    }
}

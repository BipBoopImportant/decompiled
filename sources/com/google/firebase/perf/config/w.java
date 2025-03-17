package com.google.firebase.perf.config;

import android.content.Context;

public final /* synthetic */ class w implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ x f68552a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Context f68553b;

    public /* synthetic */ w(x xVar, Context context) {
        this.f68552a = xVar;
        this.f68553b = context;
    }

    public final void run() {
        this.f68552a.i(this.f68553b);
    }
}

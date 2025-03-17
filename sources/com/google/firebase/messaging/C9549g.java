package com.google.firebase.messaging;

import android.content.Intent;
import xa.C8972m;

/* renamed from: com.google.firebase.messaging.g  reason: case insensitive filesystem */
public final /* synthetic */ class C9549g implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C9550h f68434a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Intent f68435b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ C8972m f68436c;

    public /* synthetic */ C9549g(C9550h hVar, Intent intent, C8972m mVar) {
        this.f68434a = hVar;
        this.f68435b = intent;
        this.f68436c = mVar;
    }

    public final void run() {
        this.f68434a.i(this.f68435b, this.f68436c);
    }
}

package com.google.firebase.messaging;

import xa.C8972m;

/* renamed from: com.google.firebase.messaging.y  reason: case insensitive filesystem */
public final /* synthetic */ class C9566y implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f68492a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C8972m f68493b;

    public /* synthetic */ C9566y(FirebaseMessaging firebaseMessaging, C8972m mVar) {
        this.f68492a = firebaseMessaging;
        this.f68493b = mVar;
    }

    public final void run() {
        this.f68492a.F(this.f68493b);
    }
}

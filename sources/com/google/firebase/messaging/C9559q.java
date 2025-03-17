package com.google.firebase.messaging;

import xa.C8972m;

/* renamed from: com.google.firebase.messaging.q  reason: case insensitive filesystem */
public final /* synthetic */ class C9559q implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f68479a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C8972m f68480b;

    public /* synthetic */ C9559q(FirebaseMessaging firebaseMessaging, C8972m mVar) {
        this.f68479a = firebaseMessaging;
        this.f68480b = mVar;
    }

    public final void run() {
        this.f68479a.E(this.f68480b);
    }
}

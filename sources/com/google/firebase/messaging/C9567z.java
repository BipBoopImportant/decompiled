package com.google.firebase.messaging;

import xa.C8972m;

/* renamed from: com.google.firebase.messaging.z  reason: case insensitive filesystem */
public final /* synthetic */ class C9567z implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f68494a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C8972m f68495b;

    public /* synthetic */ C9567z(FirebaseMessaging firebaseMessaging, C8972m mVar) {
        this.f68494a = firebaseMessaging;
        this.f68495b = mVar;
    }

    public final void run() {
        this.f68494a.D(this.f68495b);
    }
}

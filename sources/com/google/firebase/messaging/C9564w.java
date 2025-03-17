package com.google.firebase.messaging;

import com.google.firebase.messaging.V;
import com.google.firebase.messaging.a0;
import xa.C8971l;

/* renamed from: com.google.firebase.messaging.w  reason: case insensitive filesystem */
public final /* synthetic */ class C9564w implements V.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f68486a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f68487b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ a0.a f68488c;

    public /* synthetic */ C9564w(FirebaseMessaging firebaseMessaging, String str, a0.a aVar) {
        this.f68486a = firebaseMessaging;
        this.f68487b = str;
        this.f68488c = aVar;
    }

    public final C8971l start() {
        return this.f68486a.C(this.f68487b, this.f68488c);
    }
}

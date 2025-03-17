package com.google.firebase.messaging;

import com.google.firebase.messaging.a0;
import xa.C8970k;
import xa.C8971l;

/* renamed from: com.google.firebase.messaging.x  reason: case insensitive filesystem */
public final /* synthetic */ class C9565x implements C8970k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ FirebaseMessaging f68489a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f68490b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ a0.a f68491c;

    public /* synthetic */ C9565x(FirebaseMessaging firebaseMessaging, String str, a0.a aVar) {
        this.f68489a = firebaseMessaging;
        this.f68490b = str;
        this.f68491c = aVar;
    }

    public final C8971l then(Object obj) {
        return this.f68489a.B(this.f68490b, this.f68491c, (String) obj);
    }
}

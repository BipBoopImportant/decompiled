package com.google.firebase.messaging;

import android.content.Intent;
import xa.C8965f;
import xa.C8971l;

/* renamed from: com.google.firebase.messaging.f  reason: case insensitive filesystem */
public final /* synthetic */ class C9548f implements C8965f {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C9550h f68423a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Intent f68424b;

    public /* synthetic */ C9548f(C9550h hVar, Intent intent) {
        this.f68423a = hVar;
        this.f68424b = intent;
    }

    public final void onComplete(C8971l lVar) {
        this.f68423a.h(this.f68424b, lVar);
    }
}

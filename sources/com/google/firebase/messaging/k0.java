package com.google.firebase.messaging;

import K4.m;
import android.content.Intent;
import android.os.Binder;
import android.os.Process;
import android.util.Log;
import com.google.firebase.messaging.n0;
import xa.C8971l;

class k0 extends Binder {

    /* renamed from: a  reason: collision with root package name */
    private final a f68463a;

    interface a {
        C8971l<Void> a(Intent intent);
    }

    k0(a aVar) {
        this.f68463a = aVar;
    }

    /* access modifiers changed from: package-private */
    public void c(n0.a aVar) {
        if (Binder.getCallingUid() == Process.myUid()) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "service received new intent via bind strategy");
            }
            this.f68463a.a(aVar.f68476a).b(new m(), new j0(aVar));
            return;
        }
        throw new SecurityException("Binding only allowed within app");
    }
}

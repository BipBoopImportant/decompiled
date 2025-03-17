package com.google.ar.core;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.util.Log;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.ar.core.h  reason: case insensitive filesystem */
final class C9500h implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Activity f67761a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ V f67762b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ X f67763c;

    C9500h(X x10, Activity activity, V v10) {
        this.f67761a = activity;
        this.f67762b = v10;
        this.f67763c = x10;
    }

    public final void run() {
        try {
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            this.f67763c.f().d(this.f67761a.getApplicationInfo().packageName, Collections.singletonList(X.k()), new Bundle(), new C9498f(this, atomicBoolean));
            new Handler().postDelayed(new C9499g(this, atomicBoolean), 3000);
        } catch (RemoteException e10) {
            Log.w("ARCore-InstallService", "requestInstall threw, launching fullscreen.", e10);
            this.f67763c.i(this.f67761a, this.f67762b);
        }
    }
}

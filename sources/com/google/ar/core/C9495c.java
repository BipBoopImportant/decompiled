package com.google.ar.core;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.google.ar.core.ArCoreApk;

/* renamed from: com.google.ar.core.c  reason: case insensitive filesystem */
final class C9495c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f67748a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ F f67749b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ X f67750c;

    C9495c(X x10, Context context, F f10) {
        this.f67748a = context;
        this.f67749b = f10;
        this.f67750c = x10;
    }

    public final void run() {
        try {
            this.f67750c.f().e(this.f67748a.getApplicationInfo().packageName, X.k(), new C9494b(this));
        } catch (RemoteException e10) {
            Log.e("ARCore-InstallService", "requestInfo threw", e10);
            this.f67749b.a(ArCoreApk.Availability.UNKNOWN_ERROR);
        }
    }
}

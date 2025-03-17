package com.google.ar.core;

import android.content.pm.PackageInstaller;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.ar.core.d  reason: case insensitive filesystem */
final class C9496d extends PackageInstaller.SessionCallback {

    /* renamed from: a  reason: collision with root package name */
    final Map f67751a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ V f67752b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ X f67753c;

    C9496d(X x10, V v10) {
        this.f67752b = v10;
        this.f67753c = x10;
    }

    public final void onActiveChanged(int i10, boolean z10) {
    }

    public final void onBadgingChanged(int i10) {
    }

    public final void onCreated(int i10) {
        this.f67751a.put(Integer.valueOf(i10), this.f67753c.g().getSessionInfo(i10));
    }

    public final void onFinished(int i10, boolean z10) {
        PackageInstaller.SessionInfo sessionInfo = (PackageInstaller.SessionInfo) this.f67751a.remove(Integer.valueOf(i10));
        if (sessionInfo != null && "com.google.ar.core".equals(sessionInfo.getAppPackageName())) {
            Log.i("ARCore-InstallService", "Detected ARCore install completion");
            this.f67752b.a(W.COMPLETED);
        }
    }

    public final void onProgressChanged(int i10, float f10) {
    }
}

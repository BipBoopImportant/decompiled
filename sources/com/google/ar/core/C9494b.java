package com.google.ar.core;

import android.os.Bundle;
import android.util.Log;
import com.google.ar.core.ArCoreApk;
import com.google.ar.core.dependencies.i;

/* renamed from: com.google.ar.core.b  reason: case insensitive filesystem */
final class C9494b extends i {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ C9495c f67747a;

    C9494b(C9495c cVar) {
        this.f67747a = cVar;
    }

    public final void b(Bundle bundle) {
    }

    public final void c(Bundle bundle) {
        int i10 = bundle.getInt("error.code", -100);
        if (i10 == -5) {
            Log.e("ARCore-InstallService", "The device is not supported.");
            this.f67747a.f67749b.a(ArCoreApk.Availability.UNSUPPORTED_DEVICE_NOT_CAPABLE);
        } else if (i10 == -3) {
            Log.e("ARCore-InstallService", "The Google Play application must be updated.");
            this.f67747a.f67749b.a(ArCoreApk.Availability.UNKNOWN_ERROR);
        } else if (i10 != 0) {
            Log.e("ARCore-InstallService", O.b((byte) 22, i10, "requestInfo returned: "));
            this.f67747a.f67749b.a(ArCoreApk.Availability.UNKNOWN_ERROR);
        } else {
            this.f67747a.f67749b.a(ArCoreApk.Availability.SUPPORTED_NOT_INSTALLED);
        }
    }
}

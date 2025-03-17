package androidx.camera.core.impl;

import C.C4391e0;
import C.C4409q;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.LinkedHashSet;

public final class T {

    /* renamed from: a  reason: collision with root package name */
    private static final C4409q f16775a = new C4409q.a().c(2).b();

    private static class a {
        static int a(Context context) {
            return context.getDeviceId();
        }
    }

    public static class b extends Exception {

        /* renamed from: a  reason: collision with root package name */
        private int f16776a;

        public b(String str, int i10, Throwable th2) {
            super(str, th2);
            this.f16776a = i10;
        }

        public int a() {
            return this.f16776a;
        }
    }

    public static void a(Context context, N n10, C4409q qVar) {
        Integer num;
        int i10 = 0;
        IllegalArgumentException illegalArgumentException = null;
        if (Build.VERSION.SDK_INT < 34 || a.a(context) == 0) {
            if (qVar != null) {
                try {
                    num = qVar.d();
                    if (num == null) {
                        C4391e0.l("CameraValidator", "No lens facing info in the availableCamerasSelector, don't verify the camera lens facing.");
                        return;
                    }
                } catch (IllegalStateException e10) {
                    C4391e0.d("CameraValidator", "Cannot get lens facing from the availableCamerasSelector don't verify the camera lens facing.", e10);
                    return;
                }
            } else {
                num = null;
            }
            C4391e0.a("CameraValidator", "Verifying camera lens facing on " + Build.DEVICE + ", lensFacingInteger: " + num);
            PackageManager packageManager = context.getPackageManager();
            try {
                if (packageManager.hasSystemFeature("android.hardware.camera")) {
                    if (qVar != null) {
                        if (num.intValue() == 1) {
                        }
                    }
                    C4409q.f5395d.e(n10.a());
                    i10 = 1;
                }
            } catch (IllegalArgumentException e11) {
                illegalArgumentException = e11;
                C4391e0.m("CameraValidator", "Camera LENS_FACING_BACK verification failed", illegalArgumentException);
            }
            try {
                if (packageManager.hasSystemFeature("android.hardware.camera.front")) {
                    if (qVar != null) {
                        if (num.intValue() == 0) {
                        }
                    }
                    C4409q.f5394c.e(n10.a());
                    i10++;
                }
            } catch (IllegalArgumentException e12) {
                illegalArgumentException = e12;
                C4391e0.m("CameraValidator", "Camera LENS_FACING_FRONT verification failed", illegalArgumentException);
            }
            try {
                f16775a.e(n10.a());
                C4391e0.a("CameraValidator", "Found a LENS_FACING_EXTERNAL camera");
                i10++;
            } catch (IllegalArgumentException unused) {
            }
            if (illegalArgumentException != null) {
                C4391e0.c("CameraValidator", "Camera LensFacing verification failed, existing cameras: " + n10.a());
                throw new b("Expected camera missing from device.", i10, illegalArgumentException);
            }
            return;
        }
        LinkedHashSet<J> a10 = n10.a();
        if (!a10.isEmpty()) {
            C4391e0.a("CameraValidator", "Virtual device with ID: " + a.a(context) + " has " + a10.size() + " cameras. Skipping validation.");
            return;
        }
        throw new b("No cameras available", 0, (Throwable) null);
    }
}

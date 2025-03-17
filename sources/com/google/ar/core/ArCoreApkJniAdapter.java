package com.google.ar.core;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.ar.core.ArCoreApk;
import com.google.ar.core.annotations.UsedByNative;
import com.google.ar.core.exceptions.ResourceExhaustedException;
import com.google.ar.core.exceptions.UnavailableApkTooOldException;
import com.google.ar.core.exceptions.UnavailableArcoreNotInstalledException;
import com.google.ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.ar.core.exceptions.UnavailableSdkTooOldException;
import com.google.ar.core.exceptions.UnavailableUserDeclinedInstallationException;
import java.util.HashMap;
import java.util.Map;

@UsedByNative("arcoreapk.cc")
final class ArCoreApkJniAdapter {

    /* renamed from: a  reason: collision with root package name */
    private static final Map f67664a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f67665b = 0;

    static {
        HashMap hashMap = new HashMap();
        f67664a = hashMap;
        hashMap.put(IllegalArgumentException.class, Integer.valueOf(C9502j.ERROR_INVALID_ARGUMENT.f67797G));
        hashMap.put(ResourceExhaustedException.class, Integer.valueOf(C9502j.ERROR_RESOURCE_EXHAUSTED.f67797G));
        hashMap.put(UnavailableArcoreNotInstalledException.class, Integer.valueOf(C9502j.UNAVAILABLE_ARCORE_NOT_INSTALLED.f67797G));
        hashMap.put(UnavailableDeviceNotCompatibleException.class, Integer.valueOf(C9502j.UNAVAILABLE_DEVICE_NOT_COMPATIBLE.f67797G));
        hashMap.put(UnavailableApkTooOldException.class, Integer.valueOf(C9502j.UNAVAILABLE_APK_TOO_OLD.f67797G));
        hashMap.put(UnavailableSdkTooOldException.class, Integer.valueOf(C9502j.UNAVAILABLE_SDK_TOO_OLD.f67797G));
        hashMap.put(UnavailableUserDeclinedInstallationException.class, Integer.valueOf(C9502j.UNAVAILABLE_USER_DECLINED_INSTALLATION.f67797G));
    }

    private ArCoreApkJniAdapter() {
    }

    private static int b(Throwable th2) {
        Log.e("ARCore-ArCoreApkJniAdap", "Exception details:", th2);
        Map map = f67664a;
        Class<?> cls = th2.getClass();
        return map.containsKey(cls) ? ((Integer) map.get(cls)).intValue() : C9502j.ERROR_FATAL.f67797G;
    }

    @UsedByNative("arcoreapk.cc")
    static int checkAvailability(Context context) {
        try {
            return ArCoreApk.getInstance().checkAvailability(context).nativeCode;
        } catch (Throwable th2) {
            b(th2);
            return ArCoreApk.Availability.UNKNOWN_ERROR.nativeCode;
        }
    }

    @UsedByNative("arcoreapk.cc")
    static void checkAvailabilityAsync(Context context, long j10, long j11) {
        L l10 = new L(j10, j11);
        try {
            ArCoreApk.getInstance().checkAvailabilityAsync(context, l10);
        } catch (Throwable th2) {
            b(th2);
            new Handler(Looper.getMainLooper()).post(new K(l10));
        }
    }

    /* access modifiers changed from: private */
    public static native void nativeInvokeAvailabilityCallback(long j10, long j11, int i10);

    @UsedByNative("arcoreapk.cc")
    static int requestInstall(Activity activity, boolean z10, int[] iArr) {
        try {
            iArr[0] = ArCoreApk.getInstance().requestInstall(activity, z10).nativeCode;
            return C9502j.SUCCESS.f67797G;
        } catch (Throwable th2) {
            return b(th2);
        }
    }

    @UsedByNative("arcoreapk.cc")
    static int requestInstallCustom(Activity activity, boolean z10, int i10, int i11, int[] iArr) {
        try {
            iArr[0] = ArCoreApk.getInstance().requestInstall(activity, z10, ArCoreApk.InstallBehavior.forNumber(i10), ArCoreApk.UserMessageType.forNumber(i11)).nativeCode;
            return C9502j.SUCCESS.f67797G;
        } catch (Throwable th2) {
            return b(th2);
        }
    }
}

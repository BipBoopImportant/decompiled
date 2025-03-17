package com.google.ar.core;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import com.google.ar.core.ArCoreApk;
import com.google.ar.core.exceptions.FatalException;
import com.google.ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.ar.core.exceptions.UnavailableUserDeclinedInstallationException;
import java.util.Objects;
import java.util.function.Consumer;

final class J extends ArCoreApk {

    /* renamed from: m  reason: collision with root package name */
    private static final J f67676m = new J();

    /* renamed from: a  reason: collision with root package name */
    private final Handler f67677a = new Handler(Looper.getMainLooper());

    /* renamed from: b  reason: collision with root package name */
    Exception f67678b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f67679c;

    /* renamed from: d  reason: collision with root package name */
    boolean f67680d = true;

    /* renamed from: e  reason: collision with root package name */
    private int f67681e;

    /* renamed from: f  reason: collision with root package name */
    private long f67682f;

    /* renamed from: g  reason: collision with root package name */
    private ArCoreApk.Availability f67683g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f67684h;

    /* renamed from: i  reason: collision with root package name */
    private X f67685i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f67686j;

    /* renamed from: k  reason: collision with root package name */
    private boolean f67687k;

    /* renamed from: l  reason: collision with root package name */
    private int f67688l;

    J() {
    }

    public static J a() {
        return f67676m;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0021 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void h(android.content.Context r3, com.google.ar.core.F r4) {
        /*
            r2 = this;
            boolean r0 = j()
            if (r0 != 0) goto L_0x000c
            com.google.ar.core.ArCoreApk$Availability r3 = com.google.ar.core.ArCoreApk.Availability.UNSUPPORTED_DEVICE_NOT_CAPABLE
            r4.a(r3)
            return
        L_0x000c:
            boolean r0 = r2.d(r3)     // Catch:{ FatalException -> 0x0024 }
            if (r0 == 0) goto L_0x002c
            r2.c()     // Catch:{ FatalException -> 0x0024 }
            android.app.PendingIntent r3 = com.google.ar.core.C9504l.a(r3)     // Catch:{ UnavailableDeviceNotCompatibleException -> 0x0026, UnavailableUserDeclinedInstallationException | RuntimeException -> 0x0021 }
            if (r3 == 0) goto L_0x001e
            com.google.ar.core.ArCoreApk$Availability r3 = com.google.ar.core.ArCoreApk.Availability.SUPPORTED_APK_TOO_OLD     // Catch:{ UnavailableDeviceNotCompatibleException -> 0x0026, UnavailableUserDeclinedInstallationException | RuntimeException -> 0x0021 }
            goto L_0x0028
        L_0x001e:
            com.google.ar.core.ArCoreApk$Availability r3 = com.google.ar.core.ArCoreApk.Availability.SUPPORTED_INSTALLED     // Catch:{ UnavailableDeviceNotCompatibleException -> 0x0026, UnavailableUserDeclinedInstallationException | RuntimeException -> 0x0021 }
            goto L_0x0028
        L_0x0021:
            com.google.ar.core.ArCoreApk$Availability r3 = com.google.ar.core.ArCoreApk.Availability.UNKNOWN_ERROR     // Catch:{ FatalException -> 0x0024 }
            goto L_0x0028
        L_0x0024:
            r3 = move-exception
            goto L_0x004d
        L_0x0026:
            com.google.ar.core.ArCoreApk$Availability r3 = com.google.ar.core.ArCoreApk.Availability.UNSUPPORTED_DEVICE_NOT_CAPABLE     // Catch:{ FatalException -> 0x0024 }
        L_0x0028:
            r4.a(r3)     // Catch:{ FatalException -> 0x0024 }
            return
        L_0x002c:
            int r0 = k(r3)     // Catch:{ FatalException -> 0x0024 }
            r1 = -1
            if (r0 == r1) goto L_0x0039
            com.google.ar.core.ArCoreApk$Availability r3 = com.google.ar.core.ArCoreApk.Availability.SUPPORTED_APK_TOO_OLD     // Catch:{ FatalException -> 0x0024 }
            r4.a(r3)     // Catch:{ FatalException -> 0x0024 }
            return
        L_0x0039:
            boolean r0 = r2.i(r3)     // Catch:{ FatalException -> 0x0024 }
            if (r0 == 0) goto L_0x0045
            com.google.ar.core.ArCoreApk$Availability r3 = com.google.ar.core.ArCoreApk.Availability.SUPPORTED_NOT_INSTALLED     // Catch:{ FatalException -> 0x0024 }
            r4.a(r3)     // Catch:{ FatalException -> 0x0024 }
            return
        L_0x0045:
            com.google.ar.core.X r0 = r2.b(r3)     // Catch:{ FatalException -> 0x0024 }
            r0.c(r3, r4)     // Catch:{ FatalException -> 0x0024 }
            return
        L_0x004d:
            java.lang.String r0 = "ARCore-ArCoreApk"
            java.lang.String r1 = "Error while checking app details and ARCore status"
            android.util.Log.e(r0, r1, r3)
            com.google.ar.core.ArCoreApk$Availability r3 = com.google.ar.core.ArCoreApk.Availability.UNKNOWN_ERROR
            r4.a(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ar.core.J.h(android.content.Context, com.google.ar.core.F):void");
    }

    private final boolean i(Context context) {
        l(context);
        return this.f67687k;
    }

    private static boolean j() {
        return true;
    }

    private static int k(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.ar.core", 4);
            int i10 = packageInfo.versionCode;
            if (i10 != 0) {
                return i10;
            }
            ServiceInfo[] serviceInfoArr = packageInfo.services;
            return (serviceInfoArr == null || serviceInfoArr.length == 0) ? -1 : 0;
        } catch (PackageManager.NameNotFoundException unused) {
            return -1;
        }
    }

    private final synchronized void l(Context context) {
        if (!this.f67686j) {
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            try {
                Bundle bundle = packageManager.getApplicationInfo(packageName, 128).metaData;
                if (bundle.containsKey("com.google.ar.core")) {
                    String string = bundle.getString("com.google.ar.core");
                    Objects.requireNonNull(string);
                    this.f67687k = string.equals("required");
                    if (bundle.containsKey("com.google.ar.core.min_apk_version")) {
                        this.f67688l = bundle.getInt("com.google.ar.core.min_apk_version");
                        ActivityInfo[] activityInfoArr = packageManager.getPackageInfo(packageName, 1).activities;
                        String canonicalName = InstallActivity.class.getCanonicalName();
                        for (ActivityInfo activityInfo : activityInfoArr) {
                            if (canonicalName.equals(activityInfo.name)) {
                                this.f67686j = true;
                                return;
                            }
                        }
                        StringBuilder sb2 = new StringBuilder(String.valueOf(canonicalName).length() + 43);
                        sb2.append("Application manifest must contain activity ");
                        sb2.append(canonicalName);
                        throw new FatalException(sb2.toString());
                    }
                    throw new FatalException("Application manifest must contain meta-data com.google.ar.core.min_apk_version");
                }
                throw new FatalException("Application manifest must contain meta-data com.google.ar.core");
            } catch (PackageManager.NameNotFoundException e10) {
                throw new FatalException("Could not load application package metadata", e10);
            } catch (PackageManager.NameNotFoundException e11) {
                throw new FatalException("Could not load application package info", e11);
            }
        }
    }

    private static final ArCoreApk.InstallStatus m(Activity activity) {
        PendingIntent a10 = C9504l.a(activity);
        if (a10 != null) {
            try {
                Log.i("ARCore-ArCoreApk", "Starting setup activity");
                activity.startIntentSender(a10.getIntentSender(), (Intent) null, 0, 0, 0, Build.VERSION.SDK_INT > 33 ? ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle() : null);
                return ArCoreApk.InstallStatus.INSTALL_REQUESTED;
            } catch (IntentSender.SendIntentException e10) {
                e = e10;
                Log.w("ARCore-ArCoreApk", "Setup activity launch failed", e);
                return ArCoreApk.InstallStatus.INSTALLED;
            } catch (RuntimeException e11) {
                e = e11;
                Log.w("ARCore-ArCoreApk", "Setup activity launch failed", e);
                return ArCoreApk.InstallStatus.INSTALLED;
            }
        }
        return ArCoreApk.InstallStatus.INSTALLED;
    }

    /* access modifiers changed from: package-private */
    public final synchronized X b(Context context) {
        try {
            if (this.f67685i == null) {
                X x10 = new X((byte[]) null);
                x10.a(context.getApplicationContext());
                this.f67685i = x10;
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
        return this.f67685i;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void c() {
        try {
            if (this.f67678b == null) {
                this.f67681e = 0;
            }
            this.f67679c = false;
            X x10 = this.f67685i;
            if (x10 != null) {
                x10.b();
                this.f67685i = null;
            }
        } catch (Throwable th2) {
            while (true) {
                throw th2;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002b, code lost:
        return r2;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0021 A[Catch:{ all -> 0x000c }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x002c A[Catch:{ all -> 0x000c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.ar.core.ArCoreApk.Availability checkAvailability(android.content.Context r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            com.google.ar.core.ArCoreApk$Availability r0 = r1.f67683g     // Catch:{ all -> 0x000c }
            if (r0 == 0) goto L_0x000e
            boolean r0 = r0.isUnknown()     // Catch:{ all -> 0x000c }
            if (r0 == 0) goto L_0x001d
            goto L_0x000e
        L_0x000c:
            r2 = move-exception
            goto L_0x003f
        L_0x000e:
            boolean r0 = r1.f67684h     // Catch:{ all -> 0x000c }
            if (r0 != 0) goto L_0x001d
            r0 = 1
            r1.f67684h = r0     // Catch:{ all -> 0x000c }
            com.google.ar.core.G r0 = new com.google.ar.core.G     // Catch:{ all -> 0x000c }
            r0.<init>(r1)     // Catch:{ all -> 0x000c }
            r1.h(r2, r0)     // Catch:{ all -> 0x000c }
        L_0x001d:
            com.google.ar.core.ArCoreApk$Availability r2 = r1.f67683g     // Catch:{ all -> 0x000c }
            if (r2 == 0) goto L_0x002c
            boolean r0 = r2.isUnsupported()     // Catch:{ all -> 0x000c }
            if (r0 != 0) goto L_0x002a
            r0 = 0
            r1.f67683g = r0     // Catch:{ all -> 0x000c }
        L_0x002a:
            monitor-exit(r1)     // Catch:{ all -> 0x000c }
            return r2
        L_0x002c:
            boolean r2 = r1.f67684h     // Catch:{ all -> 0x000c }
            if (r2 == 0) goto L_0x0034
            com.google.ar.core.ArCoreApk$Availability r2 = com.google.ar.core.ArCoreApk.Availability.UNKNOWN_CHECKING     // Catch:{ all -> 0x000c }
            monitor-exit(r1)     // Catch:{ all -> 0x000c }
            return r2
        L_0x0034:
            java.lang.String r2 = "ARCore-ArCoreApk"
            java.lang.String r0 = "request not running but result is null?"
            android.util.Log.e(r2, r0)     // Catch:{ all -> 0x000c }
            com.google.ar.core.ArCoreApk$Availability r2 = com.google.ar.core.ArCoreApk.Availability.UNKNOWN_ERROR     // Catch:{ all -> 0x000c }
            monitor-exit(r1)     // Catch:{ all -> 0x000c }
            return r2
        L_0x003f:
            monitor-exit(r1)     // Catch:{ all -> 0x000c }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ar.core.J.checkAvailability(android.content.Context):com.google.ar.core.ArCoreApk$Availability");
    }

    public final void checkAvailabilityAsync(Context context, Consumer<ArCoreApk.Availability> consumer) {
        h(context, new H(this, consumer));
    }

    /* access modifiers changed from: package-private */
    public final boolean d(Context context) {
        l(context);
        return k(context) == 0 || k(context) >= this.f67688l;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Handler e() {
        return this.f67677a;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void f(ArCoreApk.Availability availability) {
        this.f67683g = availability;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void g() {
        this.f67684h = false;
    }

    public final ArCoreApk.InstallStatus requestInstall(Activity activity, boolean z10) {
        ArCoreApk.UserMessageType userMessageType;
        ArCoreApk.InstallBehavior installBehavior = i(activity) ? ArCoreApk.InstallBehavior.REQUIRED : ArCoreApk.InstallBehavior.OPTIONAL;
        if (i(activity)) {
            userMessageType = ArCoreApk.UserMessageType.APPLICATION;
        } else {
            userMessageType = ArCoreApk.UserMessageType.USER_ALREADY_INFORMED;
        }
        return requestInstall(activity, z10, installBehavior, userMessageType);
    }

    public final ArCoreApk.InstallStatus requestInstall(Activity activity, boolean z10, ArCoreApk.InstallBehavior installBehavior, ArCoreApk.UserMessageType userMessageType) {
        if (!j()) {
            throw new UnavailableDeviceNotCompatibleException();
        } else if (d(activity)) {
            c();
            return m(activity);
        } else if (this.f67679c) {
            return ArCoreApk.InstallStatus.INSTALL_REQUESTED;
        } else {
            Exception exc = this.f67678b;
            if (exc != null) {
                if (z10) {
                    Log.w("ARCore-ArCoreApk", "Clearing previous failure: ", exc);
                    this.f67678b = null;
                } else if (exc instanceof UnavailableDeviceNotCompatibleException) {
                    Log.e("ARCore-ArCoreApk", "Throwing UnavailableDeviceNotCompatibleException");
                    throw ((UnavailableDeviceNotCompatibleException) exc);
                } else if (exc instanceof UnavailableUserDeclinedInstallationException) {
                    Log.e("ARCore-ArCoreApk", "Throwing UnavailableUserDeclinedInstallationException");
                    throw ((UnavailableUserDeclinedInstallationException) exc);
                } else if (exc instanceof RuntimeException) {
                    Log.e("ARCore-ArCoreApk", "Throwing RuntimeException.");
                    throw ((RuntimeException) exc);
                } else {
                    throw new RuntimeException("Unexpected exception type", exc);
                }
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            if (uptimeMillis - this.f67682f > 5000) {
                this.f67681e = 0;
            }
            int i10 = this.f67681e + 1;
            this.f67681e = i10;
            this.f67682f = uptimeMillis;
            if (i10 <= 2) {
                try {
                    activity.startActivity(new Intent(activity, InstallActivity.class).putExtra("message", userMessageType).putExtra("behavior", installBehavior));
                    this.f67679c = true;
                    return ArCoreApk.InstallStatus.INSTALL_REQUESTED;
                } catch (ActivityNotFoundException e10) {
                    throw new FatalException("Failed to launch InstallActivity.", e10);
                }
            } else {
                throw new FatalException("Requesting ARCore installation too rapidly.");
            }
        }
    }
}

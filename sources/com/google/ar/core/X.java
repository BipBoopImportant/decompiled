package com.google.ar.core;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.IntentSender;
import android.content.ServiceConnection;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import com.google.ar.core.ArCoreApk;
import com.google.ar.core.dependencies.g;
import com.google.ar.core.dependencies.h;
import com.google.ar.core.exceptions.FatalException;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

final class X {

    /* renamed from: a  reason: collision with root package name */
    private final Queue f67737a;

    /* renamed from: b  reason: collision with root package name */
    private Context f67738b;

    /* renamed from: c  reason: collision with root package name */
    private h f67739c;

    /* renamed from: d  reason: collision with root package name */
    private final ServiceConnection f67740d;

    /* renamed from: e  reason: collision with root package name */
    private BroadcastReceiver f67741e;

    /* renamed from: f  reason: collision with root package name */
    private Context f67742f;

    /* renamed from: g  reason: collision with root package name */
    private PackageInstaller f67743g;

    /* renamed from: h  reason: collision with root package name */
    private PackageInstaller.SessionCallback f67744h;

    /* renamed from: i  reason: collision with root package name */
    private volatile int f67745i;

    X() {
    }

    static /* synthetic */ Bundle k() {
        Bundle bundle = new Bundle();
        bundle.putCharSequence("package.name", "com.google.ar.core");
        return bundle;
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public final synchronized void d(IBinder iBinder) {
        h b10 = g.b(iBinder);
        Log.i("ARCore-InstallService", "Install service connected");
        this.f67739c = b10;
        this.f67745i = 3;
        for (Runnable run : this.f67737a) {
            run.run();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public final synchronized void e() {
        Log.i("ARCore-InstallService", "Install service disconnected");
        this.f67745i = 1;
        this.f67739c = null;
    }

    private final synchronized void n(Runnable runnable) {
        int i10 = this.f67745i;
        int i11 = i10 - 1;
        if (i10 == 0) {
            throw null;
        } else if (i11 == 0) {
            throw new C9501i();
        } else if (i11 == 1) {
            this.f67737a.offer(runnable);
        } else if (i11 == 2) {
            runnable.run();
        }
    }

    private static void o(Activity activity, V v10) {
        boolean z10;
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.google.ar.core"));
            J a10 = J.a();
            Iterator<ResolveInfo> it = activity.getPackageManager().queryIntentActivities(intent, ImageMetadata.CONTROL_AE_ANTIBANDING_MODE).iterator();
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
                ActivityInfo activityInfo = it.next().activityInfo;
                if (activityInfo != null && activityInfo.name.equals("com.sec.android.app.samsungapps.MainForChina")) {
                    z10 = true;
                    break;
                }
            }
            a10.f67680d = !z10;
            activity.startActivity(intent);
        } catch (ActivityNotFoundException e10) {
            v10.b(new FatalException("Failed to launch installer.", e10));
        }
    }

    private static void p(Activity activity, Bundle bundle, V v10) {
        PendingIntent pendingIntent = (PendingIntent) bundle.getParcelable("resolution.intent");
        if (pendingIntent != null) {
            try {
                activity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1234, new Intent(activity, activity.getClass()), 0, 0, 0);
            } catch (IntentSender.SendIntentException e10) {
                v10.b(new FatalException("Installation Intent failed", e10));
            }
        } else {
            Log.e("ARCore-InstallService", "Did not get pending intent.");
            v10.b(new FatalException("Installation intent failed to unparcel."));
        }
    }

    public final synchronized void a(Context context) {
        this.f67738b = context;
        if (context.bindService(new Intent("com.google.android.play.core.install.BIND_INSTALL_SERVICE").setPackage("com.android.vending"), this.f67740d, 1)) {
            this.f67745i = 2;
            return;
        }
        this.f67745i = 1;
        this.f67738b = null;
        Log.w("ARCore-InstallService", "bindService returned false.");
        context.unbindService(this.f67740d);
    }

    public final synchronized void b() {
        try {
            int i10 = this.f67745i;
            int i11 = i10 - 1;
            if (i10 != 0) {
                if (i11 == 1 || i11 == 2) {
                    this.f67738b.unbindService(this.f67740d);
                    this.f67738b = null;
                    this.f67745i = 1;
                }
                BroadcastReceiver broadcastReceiver = this.f67741e;
                if (broadcastReceiver != null) {
                    this.f67742f.unregisterReceiver(broadcastReceiver);
                }
                PackageInstaller.SessionCallback sessionCallback = this.f67744h;
                if (sessionCallback != null) {
                    this.f67743g.unregisterSessionCallback(sessionCallback);
                    this.f67744h = null;
                    return;
                }
                return;
            }
            throw null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void c(Context context, F f10) {
        try {
            n(new C9495c(this, context, f10));
        } catch (C9501i unused) {
            Log.e("ARCore-InstallService", "Play Store install service could not be bound.");
            f10.a(ArCoreApk.Availability.UNKNOWN_ERROR);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ h f() {
        return this.f67739c;
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ PackageInstaller g() {
        return this.f67743g;
    }

    @SuppressLint({"UnprotectedReceiver"})
    public final void h(Activity activity, V v10) {
        if (this.f67744h == null) {
            try {
                this.f67743g = activity.getPackageManager().getPackageInstaller();
                C9496d dVar = new C9496d(this, v10);
                this.f67744h = dVar;
                this.f67743g.registerSessionCallback(dVar);
            } catch (NullPointerException unused) {
                v10.b(new FatalException("Unable to obtain Android PackageInstaller; is this a Play Instant App?"));
            }
        }
        if (this.f67741e == null) {
            C9497e eVar = new C9497e(v10);
            this.f67741e = eVar;
            this.f67742f = activity;
            if (Build.VERSION.SDK_INT >= 33) {
                activity.registerReceiver(eVar, new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"), 2);
            } else {
                activity.registerReceiver(eVar, new IntentFilter("com.google.android.play.core.install.ACTION_INSTALL_STATUS"));
            }
        }
        try {
            n(new C9500h(this, activity, v10));
        } catch (C9501i unused2) {
            Log.w("ARCore-InstallService", "requestInstall bind failed, launching fullscreen.");
            o(activity, v10);
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void i(Activity activity, V v10) {
        o(activity, v10);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void j(Activity activity, Bundle bundle, V v10) {
        p(activity, bundle, v10);
    }

    X(byte[] bArr) {
        this();
        this.f67737a = new ArrayDeque();
        this.f67745i = 1;
        this.f67740d = new Y(this);
    }
}

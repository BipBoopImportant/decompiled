package com.google.firebase.messaging;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import androidx.core.app.o;
import com.google.android.gms.common.util.l;
import com.google.firebase.messaging.C9545c;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import xa.C8974o;

/* renamed from: com.google.firebase.messaging.e  reason: case insensitive filesystem */
class C9547e {

    /* renamed from: a  reason: collision with root package name */
    private final ExecutorService f68415a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f68416b;

    /* renamed from: c  reason: collision with root package name */
    private final J f68417c;

    public C9547e(Context context, J j10, ExecutorService executorService) {
        this.f68415a = executorService;
        this.f68416b = context;
        this.f68417c = j10;
    }

    private boolean b() {
        if (((KeyguardManager) this.f68416b.getSystemService("keyguard")).inKeyguardRestrictedInputMode()) {
            return false;
        }
        if (!l.c()) {
            SystemClock.sleep(10);
        }
        int myPid = Process.myPid();
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = ((ActivityManager) this.f68416b.getSystemService("activity")).getRunningAppProcesses();
        if (runningAppProcesses == null) {
            return false;
        }
        for (ActivityManager.RunningAppProcessInfo next : runningAppProcesses) {
            if (next.pid == myPid) {
                return next.importance == 100;
            }
        }
        return false;
    }

    private void c(C9545c.a aVar) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Showing notification");
        }
        ((NotificationManager) this.f68416b.getSystemService("notification")).notify(aVar.f68404b, aVar.f68405c, aVar.f68403a.b());
    }

    private F d() {
        F f10 = F.f(this.f68417c.p("gcm.n.image"));
        if (f10 != null) {
            f10.i(this.f68415a);
        }
        return f10;
    }

    private void e(o.e eVar, F f10) {
        if (f10 != null) {
            try {
                Bitmap bitmap = (Bitmap) C8974o.b(f10.g(), 5, TimeUnit.SECONDS);
                eVar.n(bitmap);
                eVar.x(new o.b().i(bitmap).h((Bitmap) null));
            } catch (ExecutionException e10) {
                Log.w("FirebaseMessaging", "Failed to download image: " + e10.getCause());
            } catch (InterruptedException unused) {
                Log.w("FirebaseMessaging", "Interrupted while downloading image, showing notification without it");
                f10.close();
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                Log.w("FirebaseMessaging", "Failed to download image in time, showing notification without it");
                f10.close();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean a() {
        if (this.f68417c.a("gcm.n.noui")) {
            return true;
        }
        if (b()) {
            return false;
        }
        F d10 = d();
        C9545c.a e10 = C9545c.e(this.f68416b, this.f68417c);
        e(e10.f68403a, d10);
        c(e10);
        return true;
    }
}

package androidx.work.impl.foreground;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import androidx.lifecycle.D;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.C7055y;
import androidx.work.impl.foreground.a;

public class SystemForegroundService extends D implements a.b {
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final String f45277e = C7055y.i("SystemFgService");

    /* renamed from: f  reason: collision with root package name */
    private static SystemForegroundService f45278f = null;

    /* renamed from: b  reason: collision with root package name */
    private boolean f45279b;

    /* renamed from: c  reason: collision with root package name */
    a f45280c;

    /* renamed from: d  reason: collision with root package name */
    NotificationManager f45281d;

    static class a {
        static void a(Service service, int i10, Notification notification, int i11) {
            service.startForeground(i10, notification, i11);
        }
    }

    static class b {
        static void a(Service service, int i10, Notification notification, int i11) {
            try {
                service.startForeground(i10, notification, i11);
            } catch (ForegroundServiceStartNotAllowedException e10) {
                C7055y.e().l(SystemForegroundService.f45277e, "Unable to start foreground service", e10);
            } catch (SecurityException e11) {
                C7055y.e().l(SystemForegroundService.f45277e, "Unable to start foreground service", e11);
            }
        }
    }

    private void f() {
        this.f45281d = (NotificationManager) getApplicationContext().getSystemService("notification");
        a aVar = new a(getApplicationContext());
        this.f45280c = aVar;
        aVar.o(this);
    }

    public void a(int i10, Notification notification) {
        this.f45281d.notify(i10, notification);
    }

    public void c(int i10, int i11, Notification notification) {
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31) {
            b.a(this, i10, notification, i11);
        } else if (i12 >= 29) {
            a.a(this, i10, notification, i11);
        } else {
            startForeground(i10, notification);
        }
    }

    public void d(int i10) {
        this.f45281d.cancel(i10);
    }

    public void onCreate() {
        super.onCreate();
        f45278f = this;
        f();
    }

    public void onDestroy() {
        super.onDestroy();
        this.f45280c.l();
    }

    public int onStartCommand(Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f45279b) {
            C7055y.e().f(f45277e, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.f45280c.l();
            f();
            this.f45279b = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f45280c.m(intent);
        return 3;
    }

    public void onTimeout(int i10) {
        if (Build.VERSION.SDK_INT < 35) {
            this.f45280c.n(i10, RecyclerView.n.FLAG_MOVED);
        }
    }

    public void stop() {
        this.f45279b = true;
        C7055y.e().a(f45277e, "Shutting down.");
        stopForeground(true);
        f45278f = null;
        stopSelf();
    }

    public void onTimeout(int i10, int i11) {
        this.f45280c.n(i10, i11);
    }
}

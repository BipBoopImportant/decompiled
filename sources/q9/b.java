package Q9;

import K9.C6620s;
import K9.w0;
import S9.c;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.android.gms.common.util.l;
import com.sugarcube.app.base.network.models.UploadKt;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

public class b {

    /* renamed from: b  reason: collision with root package name */
    private static final Object f39642b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static volatile b f39643c;

    /* renamed from: a  reason: collision with root package name */
    public final ConcurrentHashMap f39644a = new ConcurrentHashMap();

    private b() {
    }

    public static b b() {
        if (f39643c == null) {
            synchronized (f39642b) {
                try {
                    if (f39643c == null) {
                        f39643c = new b();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        b bVar = f39643c;
        C6620s.l(bVar);
        return bVar;
    }

    private static void e(Context context, ServiceConnection serviceConnection) {
        try {
            context.unbindService(serviceConnection);
        } catch (IllegalArgumentException | IllegalStateException | NoSuchElementException unused) {
        }
    }

    private final boolean f(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i10, boolean z10, Executor executor) {
        ComponentName component = intent.getComponent();
        if (component != null) {
            String packageName = component.getPackageName();
            "com.google.android.gms".equals(packageName);
            try {
                if ((c.a(context).c(packageName, 0).flags & UploadKt.MAX_CHUNK_SIZE) != 0) {
                    Log.w("ConnectionTracker", "Attempted to bind to a service in a STOPPED package.");
                    return false;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        if (!g(serviceConnection)) {
            return h(context, intent, serviceConnection, i10, executor);
        }
        ServiceConnection serviceConnection2 = (ServiceConnection) this.f39644a.putIfAbsent(serviceConnection, serviceConnection);
        if (!(serviceConnection2 == null || serviceConnection == serviceConnection2)) {
            Log.w("ConnectionTracker", String.format("Duplicate binding with the same ServiceConnection: %s, %s, %s.", new Object[]{serviceConnection, str, intent.getAction()}));
        }
        try {
            boolean h10 = h(context, intent, serviceConnection, i10, executor);
            if (h10) {
                return h10;
            }
            return false;
        } finally {
            this.f39644a.remove(serviceConnection, serviceConnection);
        }
    }

    private static boolean g(ServiceConnection serviceConnection) {
        return !(serviceConnection instanceof w0);
    }

    private static final boolean h(Context context, Intent intent, ServiceConnection serviceConnection, int i10, Executor executor) {
        if (executor == null) {
            executor = null;
        }
        return (!l.g() || executor == null) ? context.bindService(intent, serviceConnection, i10) : context.bindService(intent, i10, executor, serviceConnection);
    }

    public boolean a(Context context, Intent intent, ServiceConnection serviceConnection, int i10) {
        return f(context, context.getClass().getName(), intent, serviceConnection, i10, true, (Executor) null);
    }

    public void c(Context context, ServiceConnection serviceConnection) {
        if (!g(serviceConnection) || !this.f39644a.containsKey(serviceConnection)) {
            e(context, serviceConnection);
            return;
        }
        try {
            e(context, (ServiceConnection) this.f39644a.get(serviceConnection));
        } finally {
            this.f39644a.remove(serviceConnection);
        }
    }

    public final boolean d(Context context, String str, Intent intent, ServiceConnection serviceConnection, int i10, Executor executor) {
        return f(context, str, intent, serviceConnection, 4225, true, executor);
    }
}

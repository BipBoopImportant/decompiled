package androidx.core.app;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import c.C5260a;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class s {

    /* renamed from: c  reason: collision with root package name */
    private static final Object f21103c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private static String f21104d;

    /* renamed from: e  reason: collision with root package name */
    private static Set<String> f21105e = new HashSet();

    /* renamed from: f  reason: collision with root package name */
    private static final Object f21106f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private static e f21107g;

    /* renamed from: a  reason: collision with root package name */
    private final Context f21108a;

    /* renamed from: b  reason: collision with root package name */
    private final NotificationManager f21109b;

    static class a {
        static boolean a(NotificationManager notificationManager) {
            return notificationManager.areNotificationsEnabled();
        }
    }

    static class b {
        static void a(NotificationManager notificationManager, NotificationChannel notificationChannel) {
            notificationManager.createNotificationChannel(notificationChannel);
        }

        static void b(NotificationManager notificationManager, String str) {
            notificationManager.deleteNotificationChannel(str);
        }

        static NotificationChannel c(NotificationManager notificationManager, String str) {
            return notificationManager.getNotificationChannel(str);
        }
    }

    private static class c implements f {

        /* renamed from: a  reason: collision with root package name */
        final String f21110a;

        /* renamed from: b  reason: collision with root package name */
        final int f21111b;

        /* renamed from: c  reason: collision with root package name */
        final String f21112c;

        /* renamed from: d  reason: collision with root package name */
        final Notification f21113d;

        c(String str, int i10, String str2, Notification notification) {
            this.f21110a = str;
            this.f21111b = i10;
            this.f21112c = str2;
            this.f21113d = notification;
        }

        public void a(C5260a aVar) {
            aVar.y3(this.f21110a, this.f21111b, this.f21112c, this.f21113d);
        }

        public String toString() {
            return "NotifyTask[" + "packageName:" + this.f21110a + ", id:" + this.f21111b + ", tag:" + this.f21112c + "]";
        }
    }

    private static class d {

        /* renamed from: a  reason: collision with root package name */
        final ComponentName f21114a;

        /* renamed from: b  reason: collision with root package name */
        final IBinder f21115b;

        d(ComponentName componentName, IBinder iBinder) {
            this.f21114a = componentName;
            this.f21115b = iBinder;
        }
    }

    private static class e implements Handler.Callback, ServiceConnection {

        /* renamed from: a  reason: collision with root package name */
        private final Context f21116a;

        /* renamed from: b  reason: collision with root package name */
        private final HandlerThread f21117b;

        /* renamed from: c  reason: collision with root package name */
        private final Handler f21118c;

        /* renamed from: d  reason: collision with root package name */
        private final Map<ComponentName, a> f21119d = new HashMap();

        /* renamed from: e  reason: collision with root package name */
        private Set<String> f21120e = new HashSet();

        private static class a {

            /* renamed from: a  reason: collision with root package name */
            final ComponentName f21121a;

            /* renamed from: b  reason: collision with root package name */
            boolean f21122b = false;

            /* renamed from: c  reason: collision with root package name */
            C5260a f21123c;

            /* renamed from: d  reason: collision with root package name */
            ArrayDeque<f> f21124d = new ArrayDeque<>();

            /* renamed from: e  reason: collision with root package name */
            int f21125e = 0;

            a(ComponentName componentName) {
                this.f21121a = componentName;
            }
        }

        e(Context context) {
            this.f21116a = context;
            HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
            this.f21117b = handlerThread;
            handlerThread.start();
            this.f21118c = new Handler(handlerThread.getLooper(), this);
        }

        private boolean a(a aVar) {
            if (aVar.f21122b) {
                return true;
            }
            boolean bindService = this.f21116a.bindService(new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(aVar.f21121a), this, 33);
            aVar.f21122b = bindService;
            if (bindService) {
                aVar.f21125e = 0;
            } else {
                Log.w("NotifManCompat", "Unable to bind to listener " + aVar.f21121a);
                this.f21116a.unbindService(this);
            }
            return aVar.f21122b;
        }

        private void b(a aVar) {
            if (aVar.f21122b) {
                this.f21116a.unbindService(this);
                aVar.f21122b = false;
            }
            aVar.f21123c = null;
        }

        private void c(f fVar) {
            j();
            for (a next : this.f21119d.values()) {
                next.f21124d.add(fVar);
                g(next);
            }
        }

        private void d(ComponentName componentName) {
            a aVar = this.f21119d.get(componentName);
            if (aVar != null) {
                g(aVar);
            }
        }

        private void e(ComponentName componentName, IBinder iBinder) {
            a aVar = this.f21119d.get(componentName);
            if (aVar != null) {
                aVar.f21123c = C5260a.C0357a.I3(iBinder);
                aVar.f21125e = 0;
                g(aVar);
            }
        }

        private void f(ComponentName componentName) {
            a aVar = this.f21119d.get(componentName);
            if (aVar != null) {
                b(aVar);
            }
        }

        private void g(a aVar) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Processing component " + aVar.f21121a + ", " + aVar.f21124d.size() + " queued tasks");
            }
            if (!aVar.f21124d.isEmpty()) {
                if (!a(aVar) || aVar.f21123c == null) {
                    i(aVar);
                    return;
                }
                while (true) {
                    f peek = aVar.f21124d.peek();
                    if (peek == null) {
                        break;
                    }
                    try {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Sending task " + peek);
                        }
                        peek.a(aVar.f21123c);
                        aVar.f21124d.remove();
                    } catch (DeadObjectException unused) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Remote service has died: " + aVar.f21121a);
                        }
                    } catch (RemoteException e10) {
                        Log.w("NotifManCompat", "RemoteException communicating with " + aVar.f21121a, e10);
                    }
                }
                if (!aVar.f21124d.isEmpty()) {
                    i(aVar);
                }
            }
        }

        private void i(a aVar) {
            if (!this.f21118c.hasMessages(3, aVar.f21121a)) {
                int i10 = aVar.f21125e;
                int i11 = i10 + 1;
                aVar.f21125e = i11;
                if (i11 > 6) {
                    Log.w("NotifManCompat", "Giving up on delivering " + aVar.f21124d.size() + " tasks to " + aVar.f21121a + " after " + aVar.f21125e + " retries");
                    aVar.f21124d.clear();
                    return;
                }
                int i12 = (1 << i10) * 1000;
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Scheduling retry for " + i12 + " ms");
                }
                this.f21118c.sendMessageDelayed(this.f21118c.obtainMessage(3, aVar.f21121a), (long) i12);
            }
        }

        private void j() {
            Set<String> h10 = s.h(this.f21116a);
            if (!h10.equals(this.f21120e)) {
                this.f21120e = h10;
                List<ResolveInfo> queryIntentServices = this.f21116a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet<ComponentName> hashSet = new HashSet<>();
                for (ResolveInfo next : queryIntentServices) {
                    if (h10.contains(next.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = next.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (next.serviceInfo.permission != null) {
                            Log.w("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                        } else {
                            hashSet.add(componentName);
                        }
                    }
                }
                for (ComponentName componentName2 : hashSet) {
                    if (!this.f21119d.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                        }
                        this.f21119d.put(componentName2, new a(componentName2));
                    }
                }
                Iterator<Map.Entry<ComponentName, a>> it = this.f21119d.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry next2 = it.next();
                    if (!hashSet.contains(next2.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + next2.getKey());
                        }
                        b((a) next2.getValue());
                        it.remove();
                    }
                }
            }
        }

        public void h(f fVar) {
            this.f21118c.obtainMessage(0, fVar).sendToTarget();
        }

        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                c((f) message.obj);
                return true;
            } else if (i10 == 1) {
                d dVar = (d) message.obj;
                e(dVar.f21114a, dVar.f21115b);
                return true;
            } else if (i10 == 2) {
                f((ComponentName) message.obj);
                return true;
            } else if (i10 != 3) {
                return false;
            } else {
                d((ComponentName) message.obj);
                return true;
            }
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Connected to service " + componentName);
            }
            this.f21118c.obtainMessage(1, new d(componentName, iBinder)).sendToTarget();
        }

        public void onServiceDisconnected(ComponentName componentName) {
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Disconnected from service " + componentName);
            }
            this.f21118c.obtainMessage(2, componentName).sendToTarget();
        }
    }

    private interface f {
        void a(C5260a aVar);
    }

    private s(Context context) {
        this.f21108a = context;
        this.f21109b = (NotificationManager) context.getSystemService("notification");
    }

    public static s g(Context context) {
        return new s(context);
    }

    public static Set<String> h(Context context) {
        Set<String> set;
        String string = Settings.Secure.getString(context.getContentResolver(), "enabled_notification_listeners");
        synchronized (f21103c) {
            if (string != null) {
                try {
                    if (!string.equals(f21104d)) {
                        String[] split = string.split(":", -1);
                        HashSet hashSet = new HashSet(split.length);
                        for (String unflattenFromString : split) {
                            ComponentName unflattenFromString2 = ComponentName.unflattenFromString(unflattenFromString);
                            if (unflattenFromString2 != null) {
                                hashSet.add(unflattenFromString2.getPackageName());
                            }
                        }
                        f21105e = hashSet;
                        f21104d = string;
                    }
                } finally {
                }
            }
            set = f21105e;
        }
        return set;
    }

    private void l(f fVar) {
        synchronized (f21106f) {
            try {
                if (f21107g == null) {
                    f21107g = new e(this.f21108a.getApplicationContext());
                }
                f21107g.h(fVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static boolean m(Notification notification) {
        Bundle a10 = o.a(notification);
        return a10 != null && a10.getBoolean("android.support.useSideChannel");
    }

    public boolean a() {
        return a.a(this.f21109b);
    }

    public void b(int i10) {
        c((String) null, i10);
    }

    public void c(String str, int i10) {
        this.f21109b.cancel(str, i10);
    }

    public void d(NotificationChannel notificationChannel) {
        b.a(this.f21109b, notificationChannel);
    }

    public void e(n nVar) {
        d(nVar.b());
    }

    public void f(String str) {
        b.b(this.f21109b, str);
    }

    public NotificationChannel i(String str) {
        return b.c(this.f21109b, str);
    }

    public void j(int i10, Notification notification) {
        k((String) null, i10, notification);
    }

    public void k(String str, int i10, Notification notification) {
        if (m(notification)) {
            l(new c(this.f21108a.getPackageName(), i10, str, notification));
            this.f21109b.cancel(str, i10);
            return;
        }
        this.f21109b.notify(str, i10, notification);
    }
}

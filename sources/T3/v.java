package t3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public final class v {

    /* renamed from: e  reason: collision with root package name */
    private static v f29552e;

    /* renamed from: a  reason: collision with root package name */
    private final Handler f29553a = new Handler(Looper.getMainLooper());

    /* renamed from: b  reason: collision with root package name */
    private final CopyOnWriteArrayList<WeakReference<c>> f29554b = new CopyOnWriteArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private final Object f29555c = new Object();

    /* renamed from: d  reason: collision with root package name */
    private int f29556d = 0;

    private static final class b {

        private static final class a extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

            /* renamed from: a  reason: collision with root package name */
            private final v f29557a;

            public a(v vVar) {
                this.f29557a = vVar;
            }

            public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
                int a10 = telephonyDisplayInfo.getOverrideNetworkType();
                int i10 = 5;
                boolean z10 = a10 == 3 || a10 == 4 || a10 == 5;
                v vVar = this.f29557a;
                if (z10) {
                    i10 = 10;
                }
                vVar.k(i10);
            }
        }

        public static void a(Context context, v vVar) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) C5950a.e((TelephonyManager) context.getSystemService("phone"));
                a aVar = new a(vVar);
                telephonyManager.registerTelephonyCallback(context.getMainExecutor(), aVar);
                telephonyManager.unregisterTelephonyCallback(aVar);
            } catch (RuntimeException unused) {
                vVar.k(5);
            }
        }
    }

    public interface c {
        void a(int i10);
    }

    private final class d extends BroadcastReceiver {
        private d() {
        }

        public void onReceive(Context context, Intent intent) {
            int b10 = v.g(context);
            if (N.f29462a < 31 || b10 != 5) {
                v.this.k(b10);
            } else {
                b.a(context, v.this);
            }
        }
    }

    private v(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new d(), intentFilter);
    }

    public static synchronized v d(Context context) {
        v vVar;
        synchronized (v.class) {
            try {
                if (f29552e == null) {
                    f29552e = new v(context);
                }
                vVar = f29552e;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return vVar;
    }

    private static int e(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
                return 4;
            case 13:
                return 5;
            case 18:
                return 2;
            case 20:
                return N.f29462a >= 29 ? 9 : 0;
            default:
                return 6;
        }
    }

    /* access modifiers changed from: private */
    public static int g(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i10 = 0;
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i10 = 1;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        return 2;
                    }
                    if (!(type == 4 || type == 5)) {
                        if (type != 6) {
                            return type != 9 ? 8 : 7;
                        }
                        return 5;
                    }
                }
                return e(activeNetworkInfo);
            }
        } catch (SecurityException unused) {
        }
        return i10;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void h(c cVar) {
        cVar.a(f());
    }

    private void j() {
        Iterator<WeakReference<c>> it = this.f29554b.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            if (next.get() == null) {
                this.f29554b.remove(next);
            }
        }
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x000e, code lost:
        r0 = r3.f29554b.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0018, code lost:
        if (r0.hasNext() == false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001a, code lost:
        r1 = r0.next();
        r2 = (t3.v.c) r1.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0026, code lost:
        if (r2 == null) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0028, code lost:
        r2.a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002c, code lost:
        r3.f29554b.remove(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0032, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void k(int r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f29555c
            monitor-enter(r0)
            int r1 = r3.f29556d     // Catch:{ all -> 0x0009 }
            if (r1 != r4) goto L_0x000b
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            return
        L_0x0009:
            r4 = move-exception
            goto L_0x0033
        L_0x000b:
            r3.f29556d = r4     // Catch:{ all -> 0x0009 }
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<t3.v$c>> r0 = r3.f29554b
            java.util.Iterator r0 = r0.iterator()
        L_0x0014:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0032
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r2 = r1.get()
            t3.v$c r2 = (t3.v.c) r2
            if (r2 == 0) goto L_0x002c
            r2.a(r4)
            goto L_0x0014
        L_0x002c:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<t3.v$c>> r2 = r3.f29554b
            r2.remove(r1)
            goto L_0x0014
        L_0x0032:
            return
        L_0x0033:
            monitor-exit(r0)     // Catch:{ all -> 0x0009 }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: t3.v.k(int):void");
    }

    public int f() {
        int i10;
        synchronized (this.f29555c) {
            i10 = this.f29556d;
        }
        return i10;
    }

    public void i(c cVar) {
        j();
        this.f29554b.add(new WeakReference(cVar));
        this.f29553a.post(new u(this, cVar));
    }
}

package R7;

import R7.b;
import Y7.f;
import Y7.l;
import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

final class r {

    /* renamed from: d  reason: collision with root package name */
    private static volatile r f39720d;

    /* renamed from: a  reason: collision with root package name */
    private final c f39721a;

    /* renamed from: b  reason: collision with root package name */
    final Set<b.a> f39722b = new HashSet();

    /* renamed from: c  reason: collision with root package name */
    private boolean f39723c;

    class a implements f.b<ConnectivityManager> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f39724a;

        a(Context context) {
            this.f39724a = context;
        }

        /* renamed from: a */
        public ConnectivityManager get() {
            return (ConnectivityManager) this.f39724a.getSystemService("connectivity");
        }
    }

    class b implements b.a {
        b() {
        }

        public void a(boolean z10) {
            ArrayList<b.a> arrayList;
            l.a();
            synchronized (r.this) {
                arrayList = new ArrayList<>(r.this.f39722b);
            }
            for (b.a a10 : arrayList) {
                a10.a(z10);
            }
        }
    }

    private interface c {
        void a();

        boolean b();
    }

    private static final class d implements c {

        /* renamed from: a  reason: collision with root package name */
        boolean f39727a;

        /* renamed from: b  reason: collision with root package name */
        final b.a f39728b;

        /* renamed from: c  reason: collision with root package name */
        private final f.b<ConnectivityManager> f39729c;

        /* renamed from: d  reason: collision with root package name */
        private final ConnectivityManager.NetworkCallback f39730d = new a();

        class a extends ConnectivityManager.NetworkCallback {

            /* renamed from: R7.r$d$a$a  reason: collision with other inner class name */
            class C0637a implements Runnable {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ boolean f39732a;

                C0637a(boolean z10) {
                    this.f39732a = z10;
                }

                public void run() {
                    a.this.a(this.f39732a);
                }
            }

            a() {
            }

            private void b(boolean z10) {
                l.v(new C0637a(z10));
            }

            /* access modifiers changed from: package-private */
            public void a(boolean z10) {
                l.a();
                d dVar = d.this;
                boolean z11 = dVar.f39727a;
                dVar.f39727a = z10;
                if (z11 != z10) {
                    dVar.f39728b.a(z10);
                }
            }

            public void onAvailable(Network network) {
                b(true);
            }

            public void onLost(Network network) {
                b(false);
            }
        }

        d(f.b<ConnectivityManager> bVar, b.a aVar) {
            this.f39729c = bVar;
            this.f39728b = aVar;
        }

        public void a() {
            this.f39729c.get().unregisterNetworkCallback(this.f39730d);
        }

        @SuppressLint({"MissingPermission"})
        public boolean b() {
            this.f39727a = this.f39729c.get().getActiveNetwork() != null;
            try {
                this.f39729c.get().registerDefaultNetworkCallback(this.f39730d);
                return true;
            } catch (RuntimeException e10) {
                if (Log.isLoggable("ConnectivityMonitor", 5)) {
                    Log.w("ConnectivityMonitor", "Failed to register callback", e10);
                }
                return false;
            }
        }
    }

    private r(Context context) {
        this.f39721a = new d(f.a(new a(context)), new b());
    }

    static r a(Context context) {
        if (f39720d == null) {
            synchronized (r.class) {
                try {
                    if (f39720d == null) {
                        f39720d = new r(context.getApplicationContext());
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f39720d;
    }

    private void b() {
        if (!this.f39723c && !this.f39722b.isEmpty()) {
            this.f39723c = this.f39721a.b();
        }
    }

    private void c() {
        if (this.f39723c && this.f39722b.isEmpty()) {
            this.f39721a.a();
            this.f39723c = false;
        }
    }

    /* access modifiers changed from: package-private */
    public synchronized void d(b.a aVar) {
        this.f39722b.add(aVar);
        b();
    }

    /* access modifiers changed from: package-private */
    public synchronized void e(b.a aVar) {
        this.f39722b.remove(aVar);
        c();
    }
}

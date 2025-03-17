package org.maplibre.android.net;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.maplibre.android.log.Logger;

public class b extends BroadcastReceiver {
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: d  reason: collision with root package name */
    private static b f146047d;

    /* renamed from: a  reason: collision with root package name */
    private List<a> f146048a = new CopyOnWriteArrayList();

    /* renamed from: b  reason: collision with root package name */
    private Context f146049b;

    /* renamed from: c  reason: collision with root package name */
    private Boolean f146050c;

    private b(Context context) {
        this.f146049b = context;
    }

    public static synchronized b b(Context context) {
        b bVar;
        synchronized (b.class) {
            try {
                if (f146047d == null) {
                    b bVar2 = new b(context.getApplicationContext());
                    f146047d = bVar2;
                    bVar2.a(new NativeConnectivityListener());
                }
                bVar = f146047d;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        return bVar;
    }

    private boolean d() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f146049b.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    private void e(boolean z10) {
        Logger.v("Mbgl-ConnectivityReceiver", z10 ? "connected - true" : "connected - false");
        for (a a10 : this.f146048a) {
            a10.a(z10);
        }
    }

    public void a(a aVar) {
        this.f146048a.add(aVar);
    }

    public boolean c() {
        Boolean bool = this.f146050c;
        return bool != null ? bool.booleanValue() : d();
    }

    public void f(Boolean bool) {
        this.f146050c = bool;
        e(bool != null ? bool.booleanValue() : d());
    }

    public void onReceive(Context context, Intent intent) {
        if (this.f146050c == null) {
            e(d());
        }
    }
}

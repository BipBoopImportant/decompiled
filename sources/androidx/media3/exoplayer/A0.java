package androidx.media3.exoplayer;

import android.content.Context;
import android.net.wifi.WifiManager;
import t3.q;

final class A0 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f22374a;

    /* renamed from: b  reason: collision with root package name */
    private WifiManager.WifiLock f22375b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f22376c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f22377d;

    public A0(Context context) {
        this.f22374a = context.getApplicationContext();
    }

    private void c() {
        WifiManager.WifiLock wifiLock = this.f22375b;
        if (wifiLock != null) {
            if (!this.f22376c || !this.f22377d) {
                wifiLock.release();
            } else {
                wifiLock.acquire();
            }
        }
    }

    public void a(boolean z10) {
        if (z10 && this.f22375b == null) {
            WifiManager wifiManager = (WifiManager) this.f22374a.getApplicationContext().getSystemService("wifi");
            if (wifiManager == null) {
                q.h("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            }
            WifiManager.WifiLock createWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
            this.f22375b = createWifiLock;
            createWifiLock.setReferenceCounted(false);
        }
        this.f22376c = z10;
        c();
    }

    public void b(boolean z10) {
        this.f22377d = z10;
        c();
    }
}

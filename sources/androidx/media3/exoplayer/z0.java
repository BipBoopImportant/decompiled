package androidx.media3.exoplayer;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.PowerManager;
import t3.q;

final class z0 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f22906a;

    /* renamed from: b  reason: collision with root package name */
    private PowerManager.WakeLock f22907b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f22908c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f22909d;

    public z0(Context context) {
        this.f22906a = context.getApplicationContext();
    }

    @SuppressLint({"WakelockTimeout"})
    private void c() {
        PowerManager.WakeLock wakeLock = this.f22907b;
        if (wakeLock != null) {
            if (!this.f22908c || !this.f22909d) {
                wakeLock.release();
            } else {
                wakeLock.acquire();
            }
        }
    }

    public void a(boolean z10) {
        if (z10 && this.f22907b == null) {
            PowerManager powerManager = (PowerManager) this.f22906a.getSystemService("power");
            if (powerManager == null) {
                q.h("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                return;
            }
            PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
            this.f22907b = newWakeLock;
            newWakeLock.setReferenceCounted(false);
        }
        this.f22908c = z10;
        c();
    }

    public void b(boolean z10) {
        this.f22909d = z10;
        c();
    }
}

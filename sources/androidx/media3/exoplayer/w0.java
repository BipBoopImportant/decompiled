package androidx.media3.exoplayer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import t3.C5950a;
import t3.N;
import t3.q;

final class w0 {

    /* renamed from: a  reason: collision with root package name */
    private final Context f22892a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Handler f22893b;

    /* renamed from: c  reason: collision with root package name */
    private final b f22894c;

    /* renamed from: d  reason: collision with root package name */
    private final AudioManager f22895d;

    /* renamed from: e  reason: collision with root package name */
    private c f22896e;

    /* renamed from: f  reason: collision with root package name */
    private int f22897f;

    /* renamed from: g  reason: collision with root package name */
    private int f22898g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f22899h;

    public interface b {
        void D(int i10, boolean z10);
    }

    private final class c extends BroadcastReceiver {
        private c() {
        }

        public void onReceive(Context context, Intent intent) {
            w0.this.f22893b.post(new x0(w0.this));
        }
    }

    public w0(Context context, Handler handler, b bVar, int i10) {
        Context applicationContext = context.getApplicationContext();
        this.f22892a = applicationContext;
        this.f22893b = handler;
        this.f22894c = bVar;
        AudioManager audioManager = (AudioManager) C5950a.i((AudioManager) applicationContext.getSystemService("audio"));
        this.f22895d = audioManager;
        this.f22897f = i10;
        this.f22898g = f(audioManager, i10);
        this.f22899h = e(audioManager, i10);
        c cVar = new c();
        try {
            applicationContext.registerReceiver(cVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f22896e = cVar;
        } catch (RuntimeException e10) {
            q.i("StreamVolumeManager", "Error registering stream volume receiver", e10);
        }
    }

    private static boolean e(AudioManager audioManager, int i10) {
        return N.f29462a >= 23 ? audioManager.isStreamMute(i10) : f(audioManager, i10) == 0;
    }

    private static int f(AudioManager audioManager, int i10) {
        try {
            return audioManager.getStreamVolume(i10);
        } catch (RuntimeException e10) {
            q.i("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i10, e10);
            return audioManager.getStreamMaxVolume(i10);
        }
    }

    /* access modifiers changed from: private */
    public void h() {
        int f10 = f(this.f22895d, this.f22897f);
        boolean e10 = e(this.f22895d, this.f22897f);
        if (this.f22898g != f10 || this.f22899h != e10) {
            this.f22898g = f10;
            this.f22899h = e10;
            this.f22894c.D(f10, e10);
        }
    }

    public int c() {
        return this.f22895d.getStreamMaxVolume(this.f22897f);
    }

    public int d() {
        if (N.f29462a >= 28) {
            return this.f22895d.getStreamMinVolume(this.f22897f);
        }
        return 0;
    }

    public void g() {
        c cVar = this.f22896e;
        if (cVar != null) {
            try {
                this.f22892a.unregisterReceiver(cVar);
            } catch (RuntimeException e10) {
                q.i("StreamVolumeManager", "Error unregistering stream volume receiver", e10);
            }
            this.f22896e = null;
        }
    }
}

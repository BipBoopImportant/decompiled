package androidx.media3.exoplayer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* renamed from: androidx.media3.exoplayer.a  reason: case insensitive filesystem */
final class C5223a {

    /* renamed from: a  reason: collision with root package name */
    private final Context f22641a;

    /* renamed from: b  reason: collision with root package name */
    private final C0352a f22642b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public boolean f22643c;

    /* renamed from: androidx.media3.exoplayer.a$a  reason: collision with other inner class name */
    private final class C0352a extends BroadcastReceiver implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final b f22644a;

        /* renamed from: b  reason: collision with root package name */
        private final Handler f22645b;

        public C0352a(Handler handler, b bVar) {
            this.f22645b = handler;
            this.f22644a = bVar;
        }

        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f22645b.post(this);
            }
        }

        public void run() {
            if (C5223a.this.f22643c) {
                this.f22644a.p();
            }
        }
    }

    /* renamed from: androidx.media3.exoplayer.a$b */
    public interface b {
        void p();
    }

    public C5223a(Context context, Handler handler, b bVar) {
        this.f22641a = context.getApplicationContext();
        this.f22642b = new C0352a(handler, bVar);
    }

    public void b(boolean z10) {
        if (z10 && !this.f22643c) {
            this.f22641a.registerReceiver(this.f22642b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            this.f22643c = true;
        } else if (!z10 && this.f22643c) {
            this.f22641a.unregisterReceiver(this.f22642b);
            this.f22643c = false;
        }
    }
}

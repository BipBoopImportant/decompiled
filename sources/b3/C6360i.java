package B3;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.ContentObserver;
import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Handler;
import q3.C5792c;
import t3.C5950a;
import t3.N;

/* renamed from: B3.i  reason: case insensitive filesystem */
public final class C6360i {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Context f33048a;

    /* renamed from: b  reason: collision with root package name */
    private final f f33049b;

    /* renamed from: c  reason: collision with root package name */
    private final Handler f33050c;

    /* renamed from: d  reason: collision with root package name */
    private final c f33051d;

    /* renamed from: e  reason: collision with root package name */
    private final BroadcastReceiver f33052e;

    /* renamed from: f  reason: collision with root package name */
    private final d f33053f;

    /* renamed from: g  reason: collision with root package name */
    private C6356e f33054g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public C6361j f33055h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public C5792c f33056i;

    /* renamed from: j  reason: collision with root package name */
    private boolean f33057j;

    /* renamed from: B3.i$b */
    private static final class b {
        public static void a(Context context, AudioDeviceCallback audioDeviceCallback, Handler handler) {
            ((AudioManager) C5950a.e((AudioManager) context.getSystemService("audio"))).registerAudioDeviceCallback(audioDeviceCallback, handler);
        }

        public static void b(Context context, AudioDeviceCallback audioDeviceCallback) {
            ((AudioManager) C5950a.e((AudioManager) context.getSystemService("audio"))).unregisterAudioDeviceCallback(audioDeviceCallback);
        }
    }

    /* renamed from: B3.i$c */
    private final class c extends AudioDeviceCallback {
        private c() {
        }

        public void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
            C6360i iVar = C6360i.this;
            iVar.f(C6356e.g(iVar.f33048a, C6360i.this.f33056i, C6360i.this.f33055h));
        }

        public void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
            if (N.s(audioDeviceInfoArr, C6360i.this.f33055h)) {
                C6361j unused = C6360i.this.f33055h = null;
            }
            C6360i iVar = C6360i.this;
            iVar.f(C6356e.g(iVar.f33048a, C6360i.this.f33056i, C6360i.this.f33055h));
        }
    }

    /* renamed from: B3.i$d */
    private final class d extends ContentObserver {

        /* renamed from: a  reason: collision with root package name */
        private final ContentResolver f33059a;

        /* renamed from: b  reason: collision with root package name */
        private final Uri f33060b;

        public d(Handler handler, ContentResolver contentResolver, Uri uri) {
            super(handler);
            this.f33059a = contentResolver;
            this.f33060b = uri;
        }

        public void a() {
            this.f33059a.registerContentObserver(this.f33060b, false, this);
        }

        public void b() {
            this.f33059a.unregisterContentObserver(this);
        }

        public void onChange(boolean z10) {
            C6360i iVar = C6360i.this;
            iVar.f(C6356e.g(iVar.f33048a, C6360i.this.f33056i, C6360i.this.f33055h));
        }
    }

    /* renamed from: B3.i$e */
    private final class e extends BroadcastReceiver {
        private e() {
        }

        public void onReceive(Context context, Intent intent) {
            if (!isInitialStickyBroadcast()) {
                C6360i iVar = C6360i.this;
                iVar.f(C6356e.f(context, intent, iVar.f33056i, C6360i.this.f33055h));
            }
        }
    }

    /* renamed from: B3.i$f */
    public interface f {
        void a(C6356e eVar);
    }

    C6360i(Context context, f fVar, C5792c cVar, C6361j jVar) {
        Context applicationContext = context.getApplicationContext();
        this.f33048a = applicationContext;
        this.f33049b = (f) C5950a.e(fVar);
        this.f33056i = cVar;
        this.f33055h = jVar;
        Handler C10 = N.C();
        this.f33050c = C10;
        d dVar = null;
        this.f33051d = N.f29462a >= 23 ? new c() : null;
        this.f33052e = new e();
        Uri j10 = C6356e.j();
        this.f33053f = j10 != null ? new d(C10, applicationContext.getContentResolver(), j10) : dVar;
    }

    /* access modifiers changed from: private */
    public void f(C6356e eVar) {
        if (this.f33057j && !eVar.equals(this.f33054g)) {
            this.f33054g = eVar;
            this.f33049b.a(eVar);
        }
    }

    public C6356e g() {
        c cVar;
        if (this.f33057j) {
            return (C6356e) C5950a.e(this.f33054g);
        }
        this.f33057j = true;
        d dVar = this.f33053f;
        if (dVar != null) {
            dVar.a();
        }
        if (N.f29462a >= 23 && (cVar = this.f33051d) != null) {
            b.a(this.f33048a, cVar, this.f33050c);
        }
        C6356e f10 = C6356e.f(this.f33048a, this.f33048a.registerReceiver(this.f33052e, new IntentFilter("android.media.action.HDMI_AUDIO_PLUG"), (String) null, this.f33050c), this.f33056i, this.f33055h);
        this.f33054g = f10;
        return f10;
    }

    public void h(C5792c cVar) {
        this.f33056i = cVar;
        f(C6356e.g(this.f33048a, cVar, this.f33055h));
    }

    public void i(AudioDeviceInfo audioDeviceInfo) {
        C6361j jVar = this.f33055h;
        C6361j jVar2 = null;
        if (!N.d(audioDeviceInfo, jVar == null ? null : jVar.f33063a)) {
            if (audioDeviceInfo != null) {
                jVar2 = new C6361j(audioDeviceInfo);
            }
            this.f33055h = jVar2;
            f(C6356e.g(this.f33048a, this.f33056i, jVar2));
        }
    }

    public void j() {
        c cVar;
        if (this.f33057j) {
            this.f33054g = null;
            if (N.f29462a >= 23 && (cVar = this.f33051d) != null) {
                b.b(this.f33048a, cVar);
            }
            this.f33048a.unregisterReceiver(this.f33052e);
            d dVar = this.f33053f;
            if (dVar != null) {
                dVar.b();
            }
            this.f33057j = false;
        }
    }
}

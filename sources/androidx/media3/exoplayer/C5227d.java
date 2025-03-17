package androidx.media3.exoplayer;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import jb.r;
import jb.s;
import q3.C5792c;
import t3.C5950a;
import t3.N;
import t3.q;

/* renamed from: androidx.media3.exoplayer.d  reason: case insensitive filesystem */
final class C5227d {

    /* renamed from: a  reason: collision with root package name */
    private final r<AudioManager> f22679a;

    /* renamed from: b  reason: collision with root package name */
    private final a f22680b;

    /* renamed from: c  reason: collision with root package name */
    private b f22681c;

    /* renamed from: d  reason: collision with root package name */
    private C5792c f22682d;

    /* renamed from: e  reason: collision with root package name */
    private int f22683e;

    /* renamed from: f  reason: collision with root package name */
    private int f22684f;

    /* renamed from: g  reason: collision with root package name */
    private float f22685g = 1.0f;

    /* renamed from: h  reason: collision with root package name */
    private AudioFocusRequest f22686h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f22687i;

    /* renamed from: androidx.media3.exoplayer.d$a */
    private class a implements AudioManager.OnAudioFocusChangeListener {

        /* renamed from: a  reason: collision with root package name */
        private final Handler f22688a;

        public a(Handler handler) {
            this.f22688a = handler;
        }

        /* access modifiers changed from: private */
        public /* synthetic */ void b(int i10) {
            C5227d.this.i(i10);
        }

        public void onAudioFocusChange(int i10) {
            this.f22688a.post(new C5226c(this, i10));
        }
    }

    /* renamed from: androidx.media3.exoplayer.d$b */
    public interface b {
        void F(float f10);

        void G(int i10);
    }

    public C5227d(Context context, Handler handler, b bVar) {
        this.f22679a = s.a(new C5225b(context));
        this.f22681c = bVar;
        this.f22680b = new a(handler);
        this.f22683e = 0;
    }

    private void b() {
        this.f22679a.get().abandonAudioFocus(this.f22680b);
    }

    private void c() {
        int i10 = this.f22683e;
        if (i10 != 1 && i10 != 0) {
            if (N.f29462a >= 26) {
                d();
            } else {
                b();
            }
        }
    }

    private void d() {
        if (this.f22686h != null) {
            this.f22679a.get().abandonAudioFocusRequest(this.f22686h);
        }
    }

    private static int f(C5792c cVar) {
        if (cVar == null) {
            return 0;
        }
        switch (cVar.f28116c) {
            case 0:
                q.h("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            case 1:
            case 14:
                return 1;
            case 2:
            case 4:
                return 2;
            case 3:
                return 0;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 12:
            case 13:
                break;
            case 11:
                if (cVar.f28114a == 1) {
                    return 2;
                }
                break;
            case 16:
                return 4;
            default:
                q.h("AudioFocusManager", "Unidentified audio usage: " + cVar.f28116c);
                return 0;
        }
        return 3;
    }

    private void g(int i10) {
        b bVar = this.f22681c;
        if (bVar != null) {
            bVar.G(i10);
        }
    }

    /* access modifiers changed from: private */
    public void i(int i10) {
        if (i10 == -3 || i10 == -2) {
            if (i10 == -2 || s()) {
                g(0);
                p(3);
                return;
            }
            p(4);
        } else if (i10 == -1) {
            g(-1);
            c();
            p(1);
        } else if (i10 != 1) {
            q.h("AudioFocusManager", "Unknown focus change type: " + i10);
        } else {
            p(2);
            g(1);
        }
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ AudioManager j(Context context) {
        return (AudioManager) C5950a.e((AudioManager) context.getApplicationContext().getSystemService("audio"));
    }

    private int l() {
        if (this.f22683e == 2) {
            return 1;
        }
        if ((N.f29462a >= 26 ? n() : m()) == 1) {
            p(2);
            return 1;
        }
        p(1);
        return -1;
    }

    private int m() {
        return this.f22679a.get().requestAudioFocus(this.f22680b, N.l0(((C5792c) C5950a.e(this.f22682d)).f28116c), this.f22684f);
    }

    private int n() {
        AudioFocusRequest audioFocusRequest = this.f22686h;
        if (audioFocusRequest == null || this.f22687i) {
            this.f22686h = (audioFocusRequest == null ? new AudioFocusRequest.Builder(this.f22684f) : new AudioFocusRequest.Builder(this.f22686h)).setAudioAttributes(((C5792c) C5950a.e(this.f22682d)).a().f28120a).setWillPauseWhenDucked(s()).setOnAudioFocusChangeListener(this.f22680b).build();
            this.f22687i = false;
        }
        return this.f22679a.get().requestAudioFocus(this.f22686h);
    }

    private void p(int i10) {
        if (this.f22683e != i10) {
            this.f22683e = i10;
            float f10 = i10 == 4 ? 0.2f : 1.0f;
            if (this.f22685g != f10) {
                this.f22685g = f10;
                b bVar = this.f22681c;
                if (bVar != null) {
                    bVar.F(f10);
                }
            }
        }
    }

    private boolean q(int i10) {
        return i10 != 1 && this.f22684f == 1;
    }

    private boolean s() {
        C5792c cVar = this.f22682d;
        return cVar != null && cVar.f28114a == 1;
    }

    public float h() {
        return this.f22685g;
    }

    public void k() {
        this.f22681c = null;
        c();
        p(0);
    }

    public void o(C5792c cVar) {
        if (!N.d(this.f22682d, cVar)) {
            this.f22682d = cVar;
            int f10 = f(cVar);
            this.f22684f = f10;
            boolean z10 = true;
            if (!(f10 == 1 || f10 == 0)) {
                z10 = false;
            }
            C5950a.b(z10, "Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.");
        }
    }

    public int r(boolean z10, int i10) {
        if (!q(i10)) {
            c();
            p(0);
            return 1;
        } else if (z10) {
            return l();
        } else {
            int i11 = this.f22683e;
            if (i11 != 1) {
                return i11 != 3 ? 1 : 0;
            }
            return -1;
        }
    }
}

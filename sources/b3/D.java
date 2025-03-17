package B3;

import B3.C6362k;
import B3.M;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import q3.A;
import q3.C5792c;
import q3.C5807s;
import t3.C5950a;
import t3.N;

public final class D implements M.d {

    /* renamed from: a  reason: collision with root package name */
    private final Context f32859a;

    /* renamed from: b  reason: collision with root package name */
    private Boolean f32860b;

    private static final class a {
        public static C6362k a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z10) {
            return !AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes) ? C6362k.f33064d : new C6362k.b().e(true).g(z10).d();
        }
    }

    private static final class b {
        public static C6362k a(AudioFormat audioFormat, AudioAttributes audioAttributes, boolean z10) {
            int a10 = AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
            if (a10 == 0) {
                return C6362k.f33064d;
            }
            return new C6362k.b().e(true).f(N.f29462a > 32 && a10 == 2).g(z10).d();
        }
    }

    public D(Context context) {
        this.f32859a = context;
    }

    private boolean b(Context context) {
        Boolean bool = this.f32860b;
        if (bool != null) {
            return bool.booleanValue();
        }
        if (context != null) {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager != null) {
                String parameters = audioManager.getParameters("offloadVariableRateSupported");
                this.f32860b = Boolean.valueOf(parameters != null && parameters.equals("offloadVariableRateSupported=1"));
            } else {
                this.f32860b = Boolean.FALSE;
            }
        } else {
            this.f32860b = Boolean.FALSE;
        }
        return this.f32860b.booleanValue();
    }

    public C6362k a(C5807s sVar, C5792c cVar) {
        C5950a.e(sVar);
        C5950a.e(cVar);
        int i10 = N.f29462a;
        if (i10 < 29 || sVar.f28220E == -1) {
            return C6362k.f33064d;
        }
        boolean b10 = b(this.f32859a);
        int f10 = A.f((String) C5950a.e(sVar.f28244o), sVar.f28240k);
        if (f10 == 0 || i10 < N.K(f10)) {
            return C6362k.f33064d;
        }
        int M10 = N.M(sVar.f28219D);
        if (M10 == 0) {
            return C6362k.f33064d;
        }
        try {
            AudioFormat L10 = N.L(sVar.f28220E, M10, f10);
            return i10 >= 31 ? b.a(L10, cVar.a().f28120a, b10) : a.a(L10, cVar.a().f28120a, b10);
        } catch (IllegalArgumentException unused) {
            return C6362k.f33064d;
        }
    }
}

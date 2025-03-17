package B3;

import B3.C6375y;
import B3.M;
import android.media.AudioAttributes;
import android.media.AudioTrack;
import q3.C5792c;
import t3.N;

public class W implements M.f {
    private AudioTrack b(C6375y.a aVar, C5792c cVar, int i10) {
        return new AudioTrack(e(cVar, aVar.f33105d), N.L(aVar.f33103b, aVar.f33104c, aVar.f33102a), aVar.f33107f, 1, i10);
    }

    private AudioTrack c(C6375y.a aVar, C5792c cVar, int i10) {
        AudioTrack.Builder sessionId = new AudioTrack.Builder().setAudioAttributes(e(cVar, aVar.f33105d)).setAudioFormat(N.L(aVar.f33103b, aVar.f33104c, aVar.f33102a)).setTransferMode(1).setBufferSizeInBytes(aVar.f33107f).setSessionId(i10);
        if (N.f29462a >= 29) {
            g(sessionId, aVar.f33106e);
        }
        return d(sessionId).build();
    }

    private AudioAttributes e(C5792c cVar, boolean z10) {
        return z10 ? f() : cVar.a().f28120a;
    }

    private AudioAttributes f() {
        return new AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
    }

    private void g(AudioTrack.Builder builder, boolean z10) {
        AudioTrack.Builder unused = builder.setOffloadedPlayback(z10);
    }

    public final AudioTrack a(C6375y.a aVar, C5792c cVar, int i10) {
        return N.f29462a >= 23 ? c(aVar, cVar, i10) : b(aVar, cVar, i10);
    }

    /* access modifiers changed from: protected */
    public AudioTrack.Builder d(AudioTrack.Builder builder) {
        return builder;
    }
}

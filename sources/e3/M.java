package E3;

import E3.q;
import android.media.MediaCodec;

public final /* synthetic */ class M implements MediaCodec.OnFrameRenderedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ N f34754a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ q.d f34755b;

    public /* synthetic */ M(N n10, q.d dVar) {
        this.f34754a = n10;
        this.f34755b = dVar;
    }

    public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
        this.f34754a.r(this.f34755b, mediaCodec, j10, j11);
    }
}

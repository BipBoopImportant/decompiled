package E3;

import E3.q;
import android.media.MediaCodec;

/* renamed from: E3.b  reason: case insensitive filesystem */
public final /* synthetic */ class C6454b implements MediaCodec.OnFrameRenderedListener {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C6455c f34759a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ q.d f34760b;

    public /* synthetic */ C6454b(C6455c cVar, q.d dVar) {
        this.f34759a = cVar;
        this.f34760b = dVar;
    }

    public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
        this.f34759a.y(this.f34760b, mediaCodec, j10, j11);
    }
}

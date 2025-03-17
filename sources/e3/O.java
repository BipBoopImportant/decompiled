package E3;

import android.media.MediaCodec;
import android.os.Bundle;
import y3.c;

class O implements r {

    /* renamed from: a  reason: collision with root package name */
    private final MediaCodec f34758a;

    public O(MediaCodec mediaCodec) {
        this.f34758a = mediaCodec;
    }

    public void a() {
    }

    public void c(int i10, int i11, int i12, long j10, int i13) {
        this.f34758a.queueInputBuffer(i10, i11, i12, j10, i13);
    }

    public void d(int i10, int i11, c cVar, long j10, int i12) {
        this.f34758a.queueSecureInputBuffer(i10, i11, cVar.a(), j10, i12);
    }

    public void e(Bundle bundle) {
        this.f34758a.setParameters(bundle);
    }

    public void flush() {
    }

    public void shutdown() {
    }

    public void start() {
    }
}

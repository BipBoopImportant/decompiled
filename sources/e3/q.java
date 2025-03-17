package E3;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import q3.C5807s;

public interface q {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final t f34814a;

        /* renamed from: b  reason: collision with root package name */
        public final MediaFormat f34815b;

        /* renamed from: c  reason: collision with root package name */
        public final C5807s f34816c;

        /* renamed from: d  reason: collision with root package name */
        public final Surface f34817d;

        /* renamed from: e  reason: collision with root package name */
        public final MediaCrypto f34818e;

        /* renamed from: f  reason: collision with root package name */
        public final C6467o f34819f;

        private a(t tVar, MediaFormat mediaFormat, C5807s sVar, Surface surface, MediaCrypto mediaCrypto, C6467o oVar) {
            this.f34814a = tVar;
            this.f34815b = mediaFormat;
            this.f34816c = sVar;
            this.f34817d = surface;
            this.f34818e = mediaCrypto;
            this.f34819f = oVar;
        }

        public static a a(t tVar, MediaFormat mediaFormat, C5807s sVar, MediaCrypto mediaCrypto, C6467o oVar) {
            return new a(tVar, mediaFormat, sVar, (Surface) null, mediaCrypto, oVar);
        }

        public static a b(t tVar, MediaFormat mediaFormat, C5807s sVar, Surface surface, MediaCrypto mediaCrypto) {
            return new a(tVar, mediaFormat, sVar, surface, mediaCrypto, (C6467o) null);
        }
    }

    public interface b {
        q a(a aVar);
    }

    public interface c {
        void a() {
        }

        void b() {
        }
    }

    public interface d {
        void a(q qVar, long j10, long j11);
    }

    void b(int i10);

    void c(int i10, int i11, int i12, long j10, int i13);

    void d(int i10, int i11, y3.c cVar, long j10, int i12);

    void e(Bundle bundle);

    MediaFormat f();

    void flush();

    void g();

    boolean h(c cVar) {
        return false;
    }

    ByteBuffer i(int i10);

    void j(Surface surface);

    void k(d dVar, Handler handler);

    boolean l();

    void m(int i10, long j10);

    int n();

    int o(MediaCodec.BufferInfo bufferInfo);

    void p(int i10, boolean z10);

    ByteBuffer q(int i10);

    void release();
}

package E3;

import E3.q;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import t3.C5950a;
import t3.I;
import y3.c;

public final class N implements q {

    /* renamed from: a  reason: collision with root package name */
    private final MediaCodec f34756a;

    /* renamed from: b  reason: collision with root package name */
    private final C6467o f34757b;

    public static class b implements q.b {
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0045  */
        @android.annotation.SuppressLint({"WrongConstant"})
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public E3.q a(E3.q.a r7) {
            /*
                r6 = this;
                r0 = 0
                android.media.MediaCodec r1 = r6.b(r7)     // Catch:{ IOException -> 0x0042, RuntimeException -> 0x0040 }
                java.lang.String r2 = "configureCodec"
                t3.I.a(r2)     // Catch:{ IOException -> 0x0020, RuntimeException -> 0x001d }
                android.view.Surface r2 = r7.f34817d     // Catch:{ IOException -> 0x0020, RuntimeException -> 0x001d }
                if (r2 != 0) goto L_0x0022
                E3.t r3 = r7.f34814a     // Catch:{ IOException -> 0x0020, RuntimeException -> 0x001d }
                boolean r3 = r3.f34833k     // Catch:{ IOException -> 0x0020, RuntimeException -> 0x001d }
                if (r3 == 0) goto L_0x0022
                int r3 = t3.N.f29462a     // Catch:{ IOException -> 0x0020, RuntimeException -> 0x001d }
                r4 = 35
                if (r3 < r4) goto L_0x0022
                r3 = 8
                goto L_0x0023
            L_0x001d:
                r7 = move-exception
            L_0x001e:
                r0 = r1
                goto L_0x0043
            L_0x0020:
                r7 = move-exception
                goto L_0x001e
            L_0x0022:
                r3 = 0
            L_0x0023:
                android.media.MediaFormat r4 = r7.f34815b     // Catch:{ IOException -> 0x0020, RuntimeException -> 0x001d }
                android.media.MediaCrypto r5 = r7.f34818e     // Catch:{ IOException -> 0x0020, RuntimeException -> 0x001d }
                r1.configure(r4, r2, r5, r3)     // Catch:{ IOException -> 0x0020, RuntimeException -> 0x001d }
                t3.I.b()     // Catch:{ IOException -> 0x0020, RuntimeException -> 0x001d }
                java.lang.String r2 = "startCodec"
                t3.I.a(r2)     // Catch:{ IOException -> 0x0020, RuntimeException -> 0x001d }
                r1.start()     // Catch:{ IOException -> 0x0020, RuntimeException -> 0x001d }
                t3.I.b()     // Catch:{ IOException -> 0x0020, RuntimeException -> 0x001d }
                E3.N r2 = new E3.N     // Catch:{ IOException -> 0x0020, RuntimeException -> 0x001d }
                E3.o r7 = r7.f34819f     // Catch:{ IOException -> 0x0020, RuntimeException -> 0x001d }
                r2.<init>(r1, r7)     // Catch:{ IOException -> 0x0020, RuntimeException -> 0x001d }
                return r2
            L_0x0040:
                r7 = move-exception
                goto L_0x0043
            L_0x0042:
                r7 = move-exception
            L_0x0043:
                if (r0 == 0) goto L_0x0048
                r0.release()
            L_0x0048:
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: E3.N.b.a(E3.q$a):E3.q");
        }

        /* access modifiers changed from: protected */
        public MediaCodec b(q.a aVar) {
            C5950a.e(aVar.f34814a);
            String str = aVar.f34814a.f34823a;
            I.a("createCodec:" + str);
            MediaCodec createByCodecName = MediaCodec.createByCodecName(str);
            I.b();
            return createByCodecName;
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void r(q.d dVar, MediaCodec mediaCodec, long j10, long j11) {
        dVar.a(this, j10, j11);
    }

    public void b(int i10) {
        this.f34756a.setVideoScalingMode(i10);
    }

    public void c(int i10, int i11, int i12, long j10, int i13) {
        this.f34756a.queueInputBuffer(i10, i11, i12, j10, i13);
    }

    public void d(int i10, int i11, c cVar, long j10, int i12) {
        this.f34756a.queueSecureInputBuffer(i10, i11, cVar.a(), j10, i12);
    }

    public void e(Bundle bundle) {
        this.f34756a.setParameters(bundle);
    }

    public MediaFormat f() {
        return this.f34756a.getOutputFormat();
    }

    public void flush() {
        this.f34756a.flush();
    }

    public void g() {
        this.f34756a.detachOutputSurface();
    }

    public ByteBuffer i(int i10) {
        return this.f34756a.getInputBuffer(i10);
    }

    public void j(Surface surface) {
        this.f34756a.setOutputSurface(surface);
    }

    public void k(q.d dVar, Handler handler) {
        this.f34756a.setOnFrameRenderedListener(new M(this, dVar), handler);
    }

    public boolean l() {
        return false;
    }

    public void m(int i10, long j10) {
        this.f34756a.releaseOutputBuffer(i10, j10);
    }

    public int n() {
        return this.f34756a.dequeueInputBuffer(0);
    }

    public int o(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f34756a.dequeueOutputBuffer(bufferInfo, 0);
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    public void p(int i10, boolean z10) {
        this.f34756a.releaseOutputBuffer(i10, z10);
    }

    public ByteBuffer q(int i10) {
        return this.f34756a.getOutputBuffer(i10);
    }

    /* JADX INFO: finally extract failed */
    public void release() {
        C6467o oVar;
        C6467o oVar2;
        try {
            int i10 = t3.N.f29462a;
            if (i10 >= 30 && i10 < 33) {
                this.f34756a.stop();
            }
            if (i10 >= 35 && (oVar2 = this.f34757b) != null) {
                oVar2.d(this.f34756a);
            }
            this.f34756a.release();
        } catch (Throwable th2) {
            if (t3.N.f29462a >= 35 && (oVar = this.f34757b) != null) {
                oVar.d(this.f34756a);
            }
            this.f34756a.release();
            throw th2;
        }
    }

    private N(MediaCodec mediaCodec, C6467o oVar) {
        this.f34756a = mediaCodec;
        this.f34757b = oVar;
        if (t3.N.f29462a >= 35 && oVar != null) {
            oVar.b(mediaCodec);
        }
    }
}

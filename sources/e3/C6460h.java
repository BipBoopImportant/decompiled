package E3;

import E3.q;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import j0.C5449e;
import java.util.ArrayDeque;
import t3.C5950a;
import t3.N;

/* renamed from: E3.h  reason: case insensitive filesystem */
final class C6460h extends MediaCodec.Callback {

    /* renamed from: a  reason: collision with root package name */
    private final Object f34788a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final HandlerThread f34789b;

    /* renamed from: c  reason: collision with root package name */
    private Handler f34790c;

    /* renamed from: d  reason: collision with root package name */
    private final C5449e f34791d;

    /* renamed from: e  reason: collision with root package name */
    private final C5449e f34792e;

    /* renamed from: f  reason: collision with root package name */
    private final ArrayDeque<MediaCodec.BufferInfo> f34793f;

    /* renamed from: g  reason: collision with root package name */
    private final ArrayDeque<MediaFormat> f34794g;

    /* renamed from: h  reason: collision with root package name */
    private MediaFormat f34795h;

    /* renamed from: i  reason: collision with root package name */
    private MediaFormat f34796i;

    /* renamed from: j  reason: collision with root package name */
    private MediaCodec.CodecException f34797j;

    /* renamed from: k  reason: collision with root package name */
    private MediaCodec.CryptoException f34798k;

    /* renamed from: l  reason: collision with root package name */
    private long f34799l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f34800m;

    /* renamed from: n  reason: collision with root package name */
    private IllegalStateException f34801n;

    /* renamed from: o  reason: collision with root package name */
    private q.c f34802o;

    C6460h(HandlerThread handlerThread) {
        this.f34789b = handlerThread;
        this.f34791d = new C5449e();
        this.f34792e = new C5449e();
        this.f34793f = new ArrayDeque<>();
        this.f34794g = new ArrayDeque<>();
    }

    private void b(MediaFormat mediaFormat) {
        this.f34792e.a(-2);
        this.f34794g.add(mediaFormat);
    }

    private void f() {
        if (!this.f34794g.isEmpty()) {
            this.f34796i = this.f34794g.getLast();
        }
        this.f34791d.b();
        this.f34792e.b();
        this.f34793f.clear();
        this.f34794g.clear();
    }

    private boolean i() {
        return this.f34799l > 0 || this.f34800m;
    }

    private void j() {
        k();
        m();
        l();
    }

    private void k() {
        IllegalStateException illegalStateException = this.f34801n;
        if (illegalStateException != null) {
            this.f34801n = null;
            throw illegalStateException;
        }
    }

    private void l() {
        MediaCodec.CryptoException cryptoException = this.f34798k;
        if (cryptoException != null) {
            this.f34798k = null;
            throw cryptoException;
        }
    }

    private void m() {
        MediaCodec.CodecException codecException = this.f34797j;
        if (codecException != null) {
            this.f34797j = null;
            throw codecException;
        }
    }

    /* access modifiers changed from: private */
    public void n() {
        synchronized (this.f34788a) {
            try {
                if (!this.f34800m) {
                    long j10 = this.f34799l - 1;
                    this.f34799l = j10;
                    if (j10 <= 0) {
                        if (j10 < 0) {
                            o(new IllegalStateException());
                        } else {
                            f();
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void o(IllegalStateException illegalStateException) {
        synchronized (this.f34788a) {
            this.f34801n = illegalStateException;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0021, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int c() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f34788a
            monitor-enter(r0)
            r3.j()     // Catch:{ all -> 0x000f }
            boolean r1 = r3.i()     // Catch:{ all -> 0x000f }
            r2 = -1
            if (r1 == 0) goto L_0x0011
            monitor-exit(r0)     // Catch:{ all -> 0x000f }
            return r2
        L_0x000f:
            r1 = move-exception
            goto L_0x0022
        L_0x0011:
            j0.e r1 = r3.f34791d     // Catch:{ all -> 0x000f }
            boolean r1 = r1.d()     // Catch:{ all -> 0x000f }
            if (r1 == 0) goto L_0x001a
            goto L_0x0020
        L_0x001a:
            j0.e r1 = r3.f34791d     // Catch:{ all -> 0x000f }
            int r2 = r1.e()     // Catch:{ all -> 0x000f }
        L_0x0020:
            monitor-exit(r0)     // Catch:{ all -> 0x000f }
            return r2
        L_0x0022:
            monitor-exit(r0)     // Catch:{ all -> 0x000f }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: E3.C6460h.c():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004b, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int d(android.media.MediaCodec.BufferInfo r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.f34788a
            monitor-enter(r0)
            r9.j()     // Catch:{ all -> 0x000f }
            boolean r1 = r9.i()     // Catch:{ all -> 0x000f }
            r2 = -1
            if (r1 == 0) goto L_0x0011
            monitor-exit(r0)     // Catch:{ all -> 0x000f }
            return r2
        L_0x000f:
            r10 = move-exception
            goto L_0x004c
        L_0x0011:
            j0.e r1 = r9.f34792e     // Catch:{ all -> 0x000f }
            boolean r1 = r1.d()     // Catch:{ all -> 0x000f }
            if (r1 == 0) goto L_0x001b
            monitor-exit(r0)     // Catch:{ all -> 0x000f }
            return r2
        L_0x001b:
            j0.e r1 = r9.f34792e     // Catch:{ all -> 0x000f }
            int r1 = r1.e()     // Catch:{ all -> 0x000f }
            if (r1 < 0) goto L_0x003d
            android.media.MediaFormat r2 = r9.f34795h     // Catch:{ all -> 0x000f }
            t3.C5950a.i(r2)     // Catch:{ all -> 0x000f }
            java.util.ArrayDeque<android.media.MediaCodec$BufferInfo> r2 = r9.f34793f     // Catch:{ all -> 0x000f }
            java.lang.Object r2 = r2.remove()     // Catch:{ all -> 0x000f }
            android.media.MediaCodec$BufferInfo r2 = (android.media.MediaCodec.BufferInfo) r2     // Catch:{ all -> 0x000f }
            int r4 = r2.offset     // Catch:{ all -> 0x000f }
            int r5 = r2.size     // Catch:{ all -> 0x000f }
            long r6 = r2.presentationTimeUs     // Catch:{ all -> 0x000f }
            int r8 = r2.flags     // Catch:{ all -> 0x000f }
            r3 = r10
            r3.set(r4, r5, r6, r8)     // Catch:{ all -> 0x000f }
            goto L_0x004a
        L_0x003d:
            r10 = -2
            if (r1 != r10) goto L_0x004a
            java.util.ArrayDeque<android.media.MediaFormat> r10 = r9.f34794g     // Catch:{ all -> 0x000f }
            java.lang.Object r10 = r10.remove()     // Catch:{ all -> 0x000f }
            android.media.MediaFormat r10 = (android.media.MediaFormat) r10     // Catch:{ all -> 0x000f }
            r9.f34795h = r10     // Catch:{ all -> 0x000f }
        L_0x004a:
            monitor-exit(r0)     // Catch:{ all -> 0x000f }
            return r1
        L_0x004c:
            monitor-exit(r0)     // Catch:{ all -> 0x000f }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: E3.C6460h.d(android.media.MediaCodec$BufferInfo):int");
    }

    public void e() {
        synchronized (this.f34788a) {
            this.f34799l++;
            ((Handler) N.i(this.f34790c)).post(new C6459g(this));
        }
    }

    public MediaFormat g() {
        MediaFormat mediaFormat;
        synchronized (this.f34788a) {
            try {
                mediaFormat = this.f34795h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mediaFormat;
    }

    public void h(MediaCodec mediaCodec) {
        C5950a.g(this.f34790c == null);
        this.f34789b.start();
        Handler handler = new Handler(this.f34789b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f34790c = handler;
    }

    public void onCryptoError(MediaCodec mediaCodec, MediaCodec.CryptoException cryptoException) {
        synchronized (this.f34788a) {
            this.f34798k = cryptoException;
        }
    }

    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f34788a) {
            this.f34797j = codecException;
        }
    }

    public void onInputBufferAvailable(MediaCodec mediaCodec, int i10) {
        synchronized (this.f34788a) {
            try {
                this.f34791d.a(i10);
                q.c cVar = this.f34802o;
                if (cVar != null) {
                    cVar.a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i10, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f34788a) {
            try {
                MediaFormat mediaFormat = this.f34796i;
                if (mediaFormat != null) {
                    b(mediaFormat);
                    this.f34796i = null;
                }
                this.f34792e.a(i10);
                this.f34793f.add(bufferInfo);
                q.c cVar = this.f34802o;
                if (cVar != null) {
                    cVar.b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f34788a) {
            b(mediaFormat);
            this.f34796i = null;
        }
    }

    public void p(q.c cVar) {
        synchronized (this.f34788a) {
            this.f34802o = cVar;
        }
    }

    public void q() {
        synchronized (this.f34788a) {
            this.f34800m = true;
            this.f34789b.quit();
            f();
        }
    }
}

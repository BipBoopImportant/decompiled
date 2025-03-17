package E3;

import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import d0.i;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import t3.C5950a;
import t3.C5956g;
import t3.N;
import y3.c;

/* renamed from: E3.f  reason: case insensitive filesystem */
class C6458f implements r {

    /* renamed from: g  reason: collision with root package name */
    private static final ArrayDeque<b> f34772g = new ArrayDeque<>();

    /* renamed from: h  reason: collision with root package name */
    private static final Object f34773h = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final MediaCodec f34774a;

    /* renamed from: b  reason: collision with root package name */
    private final HandlerThread f34775b;

    /* renamed from: c  reason: collision with root package name */
    private Handler f34776c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicReference<RuntimeException> f34777d;

    /* renamed from: e  reason: collision with root package name */
    private final C5956g f34778e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f34779f;

    /* renamed from: E3.f$a */
    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        public void handleMessage(Message message) {
            C6458f.this.j(message);
        }
    }

    /* renamed from: E3.f$b */
    private static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f34781a;

        /* renamed from: b  reason: collision with root package name */
        public int f34782b;

        /* renamed from: c  reason: collision with root package name */
        public int f34783c;

        /* renamed from: d  reason: collision with root package name */
        public final MediaCodec.CryptoInfo f34784d = new MediaCodec.CryptoInfo();

        /* renamed from: e  reason: collision with root package name */
        public long f34785e;

        /* renamed from: f  reason: collision with root package name */
        public int f34786f;

        b() {
        }

        public void a(int i10, int i11, int i12, long j10, int i13) {
            this.f34781a = i10;
            this.f34782b = i11;
            this.f34783c = i12;
            this.f34785e = j10;
            this.f34786f = i13;
        }
    }

    public C6458f(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new C5956g());
    }

    private void f() {
        this.f34778e.c();
        ((Handler) C5950a.e(this.f34776c)).obtainMessage(3).sendToTarget();
        this.f34778e.a();
    }

    private static void g(c cVar, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = cVar.f32270f;
        cryptoInfo.numBytesOfClearData = i(cVar.f32268d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = i(cVar.f32269e, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) C5950a.e(h(cVar.f32266b, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) C5950a.e(h(cVar.f32265a, cryptoInfo.iv));
        cryptoInfo.mode = cVar.f32267c;
        if (N.f29462a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(cVar.f32271g, cVar.f32272h));
        }
    }

    private static byte[] h(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 == null || bArr2.length < bArr.length) {
            return Arrays.copyOf(bArr, bArr.length);
        }
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        return bArr2;
    }

    private static int[] i(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 == null || iArr2.length < iArr.length) {
            return Arrays.copyOf(iArr, iArr.length);
        }
        System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
        return iArr2;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: E3.f$b} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: E3.f$b} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void j(android.os.Message r11) {
        /*
            r10 = this;
            int r0 = r11.what
            r1 = 1
            if (r0 == r1) goto L_0x0042
            r1 = 2
            if (r0 == r1) goto L_0x002e
            r1 = 3
            r2 = 0
            if (r0 == r1) goto L_0x0028
            r1 = 4
            if (r0 == r1) goto L_0x0020
            java.util.concurrent.atomic.AtomicReference<java.lang.RuntimeException> r0 = r10.f34777d
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            int r11 = r11.what
            java.lang.String r11 = java.lang.String.valueOf(r11)
            r1.<init>(r11)
            d0.i.a(r0, r2, r1)
            goto L_0x0055
        L_0x0020:
            java.lang.Object r11 = r11.obj
            android.os.Bundle r11 = (android.os.Bundle) r11
            r10.m(r11)
            goto L_0x0055
        L_0x0028:
            t3.g r11 = r10.f34778e
            r11.e()
            goto L_0x0055
        L_0x002e:
            java.lang.Object r11 = r11.obj
            r2 = r11
            E3.f$b r2 = (E3.C6458f.b) r2
            int r4 = r2.f34781a
            int r5 = r2.f34782b
            android.media.MediaCodec$CryptoInfo r6 = r2.f34784d
            long r7 = r2.f34785e
            int r9 = r2.f34786f
            r3 = r10
            r3.l(r4, r5, r6, r7, r9)
            goto L_0x0055
        L_0x0042:
            java.lang.Object r11 = r11.obj
            r2 = r11
            E3.f$b r2 = (E3.C6458f.b) r2
            int r4 = r2.f34781a
            int r5 = r2.f34782b
            int r6 = r2.f34783c
            long r7 = r2.f34785e
            int r9 = r2.f34786f
            r3 = r10
            r3.k(r4, r5, r6, r7, r9)
        L_0x0055:
            if (r2 == 0) goto L_0x005a
            p(r2)
        L_0x005a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: E3.C6458f.j(android.os.Message):void");
    }

    private void k(int i10, int i11, int i12, long j10, int i13) {
        try {
            this.f34774a.queueInputBuffer(i10, i11, i12, j10, i13);
        } catch (RuntimeException e10) {
            i.a(this.f34777d, (Object) null, e10);
        }
    }

    private void l(int i10, int i11, MediaCodec.CryptoInfo cryptoInfo, long j10, int i12) {
        try {
            synchronized (f34773h) {
                this.f34774a.queueSecureInputBuffer(i10, i11, cryptoInfo, j10, i12);
            }
        } catch (RuntimeException e10) {
            i.a(this.f34777d, (Object) null, e10);
        }
    }

    private void m(Bundle bundle) {
        try {
            this.f34774a.setParameters(bundle);
        } catch (RuntimeException e10) {
            i.a(this.f34777d, (Object) null, e10);
        }
    }

    private void n() {
        ((Handler) C5950a.e(this.f34776c)).removeCallbacksAndMessages((Object) null);
        f();
    }

    private static b o() {
        ArrayDeque<b> arrayDeque = f34772g;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    b bVar = new b();
                    return bVar;
                }
                b removeFirst = arrayDeque.removeFirst();
                return removeFirst;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static void p(b bVar) {
        ArrayDeque<b> arrayDeque = f34772g;
        synchronized (arrayDeque) {
            arrayDeque.add(bVar);
        }
    }

    public void a() {
        RuntimeException andSet = this.f34777d.getAndSet((Object) null);
        if (andSet != null) {
            throw andSet;
        }
    }

    public void c(int i10, int i11, int i12, long j10, int i13) {
        a();
        b o10 = o();
        o10.a(i10, i11, i12, j10, i13);
        ((Handler) N.i(this.f34776c)).obtainMessage(1, o10).sendToTarget();
    }

    public void d(int i10, int i11, c cVar, long j10, int i12) {
        a();
        b o10 = o();
        o10.a(i10, i11, 0, j10, i12);
        g(cVar, o10.f34784d);
        ((Handler) N.i(this.f34776c)).obtainMessage(2, o10).sendToTarget();
    }

    public void e(Bundle bundle) {
        a();
        ((Handler) N.i(this.f34776c)).obtainMessage(4, bundle).sendToTarget();
    }

    public void flush() {
        if (this.f34779f) {
            try {
                n();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    public void shutdown() {
        if (this.f34779f) {
            flush();
            this.f34775b.quit();
        }
        this.f34779f = false;
    }

    public void start() {
        if (!this.f34779f) {
            this.f34775b.start();
            this.f34776c = new a(this.f34775b.getLooper());
            this.f34779f = true;
        }
    }

    C6458f(MediaCodec mediaCodec, HandlerThread handlerThread, C5956g gVar) {
        this.f34774a = mediaCodec;
        this.f34775b = handlerThread;
        this.f34778e = gVar;
        this.f34777d = new AtomicReference<>();
    }
}

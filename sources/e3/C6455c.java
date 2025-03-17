package E3;

import E3.q;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.nio.ByteBuffer;
import jb.r;
import q3.A;
import q3.C5807s;
import t3.I;
import t3.N;
import y3.c;

/* renamed from: E3.c  reason: case insensitive filesystem */
final class C6455c implements q {

    /* renamed from: a  reason: collision with root package name */
    private final MediaCodec f34761a;

    /* renamed from: b  reason: collision with root package name */
    private final C6460h f34762b;

    /* renamed from: c  reason: collision with root package name */
    private final r f34763c;

    /* renamed from: d  reason: collision with root package name */
    private final C6467o f34764d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f34765e;

    /* renamed from: f  reason: collision with root package name */
    private int f34766f;

    /* renamed from: E3.c$b */
    public static final class b implements q.b {

        /* renamed from: a  reason: collision with root package name */
        private final r<HandlerThread> f34767a;

        /* renamed from: b  reason: collision with root package name */
        private final r<HandlerThread> f34768b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f34769c;

        public b(int i10) {
            this(new C6456d(i10), new C6457e(i10));
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ HandlerThread f(int i10) {
            return new HandlerThread(C6455c.u(i10));
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ HandlerThread g(int i10) {
            return new HandlerThread(C6455c.v(i10));
        }

        private static boolean h(C5807s sVar) {
            int i10 = N.f29462a;
            if (i10 < 34) {
                return false;
            }
            return i10 >= 35 || A.q(sVar.f28244o);
        }

        /* JADX WARNING: Removed duplicated region for block: B:29:0x007b  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0081  */
        /* renamed from: d */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public E3.C6455c a(E3.q.a r11) {
            /*
                r10 = this;
                E3.t r0 = r11.f34814a
                java.lang.String r0 = r0.f34823a
                r1 = 0
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0077 }
                r2.<init>()     // Catch:{ Exception -> 0x0077 }
                java.lang.String r3 = "createCodec:"
                r2.append(r3)     // Catch:{ Exception -> 0x0077 }
                r2.append(r0)     // Catch:{ Exception -> 0x0077 }
                java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0077 }
                t3.I.a(r2)     // Catch:{ Exception -> 0x0077 }
                android.media.MediaCodec r0 = android.media.MediaCodec.createByCodecName(r0)     // Catch:{ Exception -> 0x0077 }
                boolean r2 = r10.f34769c     // Catch:{ Exception -> 0x0032 }
                if (r2 == 0) goto L_0x0034
                q3.s r2 = r11.f34816c     // Catch:{ Exception -> 0x0032 }
                boolean r2 = h(r2)     // Catch:{ Exception -> 0x0032 }
                if (r2 == 0) goto L_0x0034
                E3.O r2 = new E3.O     // Catch:{ Exception -> 0x0032 }
                r2.<init>(r0)     // Catch:{ Exception -> 0x0032 }
                r3 = 4
            L_0x002f:
                r6 = r2
                r2 = r3
                goto L_0x0043
            L_0x0032:
                r11 = move-exception
                goto L_0x0079
            L_0x0034:
                E3.f r2 = new E3.f     // Catch:{ Exception -> 0x0032 }
                jb.r<android.os.HandlerThread> r3 = r10.f34768b     // Catch:{ Exception -> 0x0032 }
                java.lang.Object r3 = r3.get()     // Catch:{ Exception -> 0x0032 }
                android.os.HandlerThread r3 = (android.os.HandlerThread) r3     // Catch:{ Exception -> 0x0032 }
                r2.<init>(r0, r3)     // Catch:{ Exception -> 0x0032 }
                r3 = 0
                goto L_0x002f
            L_0x0043:
                E3.c r9 = new E3.c     // Catch:{ Exception -> 0x0032 }
                jb.r<android.os.HandlerThread> r3 = r10.f34767a     // Catch:{ Exception -> 0x0032 }
                java.lang.Object r3 = r3.get()     // Catch:{ Exception -> 0x0032 }
                r5 = r3
                android.os.HandlerThread r5 = (android.os.HandlerThread) r5     // Catch:{ Exception -> 0x0032 }
                E3.o r7 = r11.f34819f     // Catch:{ Exception -> 0x0032 }
                r8 = 0
                r3 = r9
                r4 = r0
                r3.<init>(r4, r5, r6, r7)     // Catch:{ Exception -> 0x0032 }
                t3.I.b()     // Catch:{ Exception -> 0x006c }
                android.view.Surface r1 = r11.f34817d     // Catch:{ Exception -> 0x006c }
                if (r1 != 0) goto L_0x006f
                E3.t r3 = r11.f34814a     // Catch:{ Exception -> 0x006c }
                boolean r3 = r3.f34833k     // Catch:{ Exception -> 0x006c }
                if (r3 == 0) goto L_0x006f
                int r3 = t3.N.f29462a     // Catch:{ Exception -> 0x006c }
                r4 = 35
                if (r3 < r4) goto L_0x006f
                r2 = r2 | 8
                goto L_0x006f
            L_0x006c:
                r11 = move-exception
                r1 = r9
                goto L_0x0079
            L_0x006f:
                android.media.MediaFormat r3 = r11.f34815b     // Catch:{ Exception -> 0x006c }
                android.media.MediaCrypto r11 = r11.f34818e     // Catch:{ Exception -> 0x006c }
                r9.x(r3, r1, r11, r2)     // Catch:{ Exception -> 0x006c }
                return r9
            L_0x0077:
                r11 = move-exception
                r0 = r1
            L_0x0079:
                if (r1 != 0) goto L_0x0081
                if (r0 == 0) goto L_0x0084
                r0.release()
                goto L_0x0084
            L_0x0081:
                r1.release()
            L_0x0084:
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: E3.C6455c.b.a(E3.q$a):E3.c");
        }

        public void e(boolean z10) {
            this.f34769c = z10;
        }

        b(r<HandlerThread> rVar, r<HandlerThread> rVar2) {
            this.f34767a = rVar;
            this.f34768b = rVar2;
            this.f34769c = false;
        }
    }

    /* access modifiers changed from: private */
    public static String u(int i10) {
        return w(i10, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    /* access modifiers changed from: private */
    public static String v(int i10) {
        return w(i10, "ExoPlayer:MediaCodecQueueingThread:");
    }

    private static String w(int i10, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i10 == 1) {
            sb2.append("Audio");
        } else if (i10 == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i10);
            sb2.append(")");
        }
        return sb2.toString();
    }

    /* access modifiers changed from: private */
    public void x(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
        C6467o oVar;
        this.f34762b.h(this.f34761a);
        I.a("configureCodec");
        this.f34761a.configure(mediaFormat, surface, mediaCrypto, i10);
        I.b();
        this.f34763c.start();
        I.a("startCodec");
        this.f34761a.start();
        I.b();
        if (N.f29462a >= 35 && (oVar = this.f34764d) != null) {
            oVar.b(this.f34761a);
        }
        this.f34766f = 1;
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void y(q.d dVar, MediaCodec mediaCodec, long j10, long j11) {
        dVar.a(this, j10, j11);
    }

    public void b(int i10) {
        this.f34761a.setVideoScalingMode(i10);
    }

    public void c(int i10, int i11, int i12, long j10, int i13) {
        this.f34763c.c(i10, i11, i12, j10, i13);
    }

    public void d(int i10, int i11, c cVar, long j10, int i12) {
        this.f34763c.d(i10, i11, cVar, j10, i12);
    }

    public void e(Bundle bundle) {
        this.f34763c.e(bundle);
    }

    public MediaFormat f() {
        return this.f34762b.g();
    }

    public void flush() {
        this.f34763c.flush();
        this.f34761a.flush();
        this.f34762b.e();
        this.f34761a.start();
    }

    public void g() {
        this.f34761a.detachOutputSurface();
    }

    public boolean h(q.c cVar) {
        this.f34762b.p(cVar);
        return true;
    }

    public ByteBuffer i(int i10) {
        return this.f34761a.getInputBuffer(i10);
    }

    public void j(Surface surface) {
        this.f34761a.setOutputSurface(surface);
    }

    public void k(q.d dVar, Handler handler) {
        this.f34761a.setOnFrameRenderedListener(new C6454b(this, dVar), handler);
    }

    public boolean l() {
        return false;
    }

    public void m(int i10, long j10) {
        this.f34761a.releaseOutputBuffer(i10, j10);
    }

    public int n() {
        this.f34763c.a();
        return this.f34762b.c();
    }

    public int o(MediaCodec.BufferInfo bufferInfo) {
        this.f34763c.a();
        return this.f34762b.d(bufferInfo);
    }

    public void p(int i10, boolean z10) {
        this.f34761a.releaseOutputBuffer(i10, z10);
    }

    public ByteBuffer q(int i10) {
        return this.f34761a.getOutputBuffer(i10);
    }

    public void release() {
        C6467o oVar;
        C6467o oVar2;
        C6467o oVar3;
        C6467o oVar4;
        try {
            if (this.f34766f == 1) {
                this.f34763c.shutdown();
                this.f34762b.q();
            }
            this.f34766f = 2;
            if (!this.f34765e) {
                try {
                    int i10 = N.f29462a;
                    if (i10 >= 30 && i10 < 33) {
                        this.f34761a.stop();
                    }
                    if (i10 >= 35 && (oVar4 = this.f34764d) != null) {
                        oVar4.d(this.f34761a);
                    }
                    this.f34761a.release();
                    this.f34765e = true;
                } catch (Throwable th2) {
                    if (N.f29462a >= 35 && (oVar3 = this.f34764d) != null) {
                        oVar3.d(this.f34761a);
                    }
                    this.f34761a.release();
                    this.f34765e = true;
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            if (N.f29462a >= 35 && (oVar = this.f34764d) != null) {
                oVar.d(this.f34761a);
            }
            this.f34761a.release();
            this.f34765e = true;
            throw th3;
        }
    }

    private C6455c(MediaCodec mediaCodec, HandlerThread handlerThread, r rVar, C6467o oVar) {
        this.f34761a = mediaCodec;
        this.f34762b = new C6460h(handlerThread);
        this.f34763c = rVar;
        this.f34764d = oVar;
        this.f34766f = 0;
    }
}

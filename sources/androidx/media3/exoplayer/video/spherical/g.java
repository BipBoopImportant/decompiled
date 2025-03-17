package androidx.media3.exoplayer.video.spherical;

import L3.o;
import M3.C6649a;
import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import q3.C5807s;
import t3.C5950a;
import t3.C5961l;
import t3.G;
import t3.q;

final class g implements o, C6649a {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicBoolean f43082a = new AtomicBoolean();

    /* renamed from: b  reason: collision with root package name */
    private final AtomicBoolean f43083b = new AtomicBoolean(true);

    /* renamed from: c  reason: collision with root package name */
    private final e f43084c = new e();

    /* renamed from: d  reason: collision with root package name */
    private final a f43085d = new a();

    /* renamed from: e  reason: collision with root package name */
    private final G<Long> f43086e = new G<>();

    /* renamed from: f  reason: collision with root package name */
    private final G<c> f43087f = new G<>();

    /* renamed from: g  reason: collision with root package name */
    private final float[] f43088g = new float[16];

    /* renamed from: h  reason: collision with root package name */
    private final float[] f43089h = new float[16];

    /* renamed from: i  reason: collision with root package name */
    private int f43090i;

    /* renamed from: j  reason: collision with root package name */
    private SurfaceTexture f43091j;

    /* renamed from: k  reason: collision with root package name */
    private volatile int f43092k = 0;

    /* renamed from: l  reason: collision with root package name */
    private int f43093l = -1;

    /* renamed from: m  reason: collision with root package name */
    private byte[] f43094m;

    /* access modifiers changed from: private */
    public /* synthetic */ void f(SurfaceTexture surfaceTexture) {
        this.f43082a.set(true);
    }

    private void i(byte[] bArr, int i10, long j10) {
        byte[] bArr2 = this.f43094m;
        int i11 = this.f43093l;
        this.f43094m = bArr;
        if (i10 == -1) {
            i10 = this.f43092k;
        }
        this.f43093l = i10;
        if (i11 != i10 || !Arrays.equals(bArr2, this.f43094m)) {
            byte[] bArr3 = this.f43094m;
            c a10 = bArr3 != null ? d.a(bArr3, this.f43093l) : null;
            if (a10 == null || !e.c(a10)) {
                a10 = c.b(this.f43093l);
            }
            this.f43087f.a(j10, a10);
        }
    }

    public void b(long j10, float[] fArr) {
        this.f43085d.e(j10, fArr);
    }

    public void c(float[] fArr, boolean z10) {
        GLES20.glClear(16384);
        try {
            C5961l.b();
        } catch (C5961l.a e10) {
            q.d("SceneRenderer", "Failed to draw a frame", e10);
        }
        if (this.f43082a.compareAndSet(true, false)) {
            ((SurfaceTexture) C5950a.e(this.f43091j)).updateTexImage();
            try {
                C5961l.b();
            } catch (C5961l.a e11) {
                q.d("SceneRenderer", "Failed to draw a frame", e11);
            }
            if (this.f43083b.compareAndSet(true, false)) {
                C5961l.k(this.f43088g);
            }
            long timestamp = this.f43091j.getTimestamp();
            Long g10 = this.f43086e.g(timestamp);
            if (g10 != null) {
                this.f43085d.c(this.f43088g, g10.longValue());
            }
            c j10 = this.f43087f.j(timestamp);
            if (j10 != null) {
                this.f43084c.d(j10);
            }
        }
        Matrix.multiplyMM(this.f43089h, 0, fArr, 0, this.f43088g, 0);
        this.f43084c.a(this.f43090i, this.f43089h, z10);
    }

    public SurfaceTexture d() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            C5961l.b();
            this.f43084c.b();
            C5961l.b();
            this.f43090i = C5961l.f();
        } catch (C5961l.a e10) {
            q.d("SceneRenderer", "Failed to initialize the renderer", e10);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f43090i);
        this.f43091j = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new f(this));
        return this.f43091j;
    }

    public void e() {
        this.f43086e.c();
        this.f43085d.d();
        this.f43083b.set(true);
    }

    public void g(long j10, long j11, C5807s sVar, MediaFormat mediaFormat) {
        this.f43086e.a(j11, Long.valueOf(j10));
        i(sVar.f28216A, sVar.f28217B, j11);
    }

    public void h(int i10) {
        this.f43092k = i10;
    }
}

package O;

import C.C4391e0;
import C.v0;
import G.m;
import G.q;
import H2.a;
import H2.i;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.J;
import androidx.concurrent.futures.c;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import ob.C10101e;

final class Q implements v0 {

    /* renamed from: a  reason: collision with root package name */
    private final Object f9560a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private final Surface f9561b;

    /* renamed from: c  reason: collision with root package name */
    private final int f9562c;

    /* renamed from: d  reason: collision with root package name */
    private final int f9563d;

    /* renamed from: e  reason: collision with root package name */
    private final Size f9564e;

    /* renamed from: f  reason: collision with root package name */
    private final v0.a f9565f;

    /* renamed from: g  reason: collision with root package name */
    private final v0.a f9566g;

    /* renamed from: h  reason: collision with root package name */
    private final float[] f9567h;

    /* renamed from: i  reason: collision with root package name */
    private final float[] f9568i;

    /* renamed from: j  reason: collision with root package name */
    private final float[] f9569j;

    /* renamed from: k  reason: collision with root package name */
    private final float[] f9570k;

    /* renamed from: l  reason: collision with root package name */
    private a<v0.b> f9571l;

    /* renamed from: m  reason: collision with root package name */
    private Executor f9572m;

    /* renamed from: n  reason: collision with root package name */
    private boolean f9573n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f9574o;

    /* renamed from: p  reason: collision with root package name */
    private final C10101e<Void> f9575p;

    /* renamed from: q  reason: collision with root package name */
    private c.a<Void> f9576q;

    /* renamed from: r  reason: collision with root package name */
    private Matrix f9577r;

    Q(Surface surface, int i10, int i11, Size size, v0.a aVar, v0.a aVar2, Matrix matrix) {
        float[] fArr = new float[16];
        this.f9567h = fArr;
        float[] fArr2 = new float[16];
        this.f9568i = fArr2;
        float[] fArr3 = new float[16];
        this.f9569j = fArr3;
        float[] fArr4 = new float[16];
        this.f9570k = fArr4;
        this.f9573n = false;
        this.f9574o = false;
        this.f9561b = surface;
        this.f9562c = i10;
        this.f9563d = i11;
        this.f9564e = size;
        this.f9565f = aVar;
        this.f9566g = aVar2;
        this.f9577r = matrix;
        e(fArr, fArr3, aVar);
        e(fArr2, fArr4, aVar2);
        this.f9575p = c.a(new O(this));
    }

    private static void e(float[] fArr, float[] fArr2, v0.a aVar) {
        android.opengl.Matrix.setIdentityM(fArr, 0);
        if (aVar != null) {
            m.d(fArr, 0.5f);
            m.c(fArr, (float) aVar.e(), 0.5f, 0.5f);
            if (aVar.d()) {
                android.opengl.Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
                android.opengl.Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
            }
            Size q10 = q.q(aVar.c(), aVar.e());
            Matrix e10 = q.e(q.t(aVar.c()), q.t(q10), aVar.e(), aVar.d());
            RectF rectF = new RectF(aVar.b());
            e10.mapRect(rectF);
            android.opengl.Matrix.translateM(fArr, 0, rectF.left / ((float) q10.getWidth()), ((((float) q10.getHeight()) - rectF.height()) - rectF.top) / ((float) q10.getHeight()), 0.0f);
            android.opengl.Matrix.scaleM(fArr, 0, rectF.width() / ((float) q10.getWidth()), rectF.height() / ((float) q10.getHeight()), 1.0f);
            f(fArr2, aVar.a());
            android.opengl.Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
        }
    }

    private static void f(float[] fArr, J j10) {
        android.opengl.Matrix.setIdentityM(fArr, 0);
        m.d(fArr, 0.5f);
        if (j10 != null) {
            i.j(j10.q(), "Camera has no transform.");
            m.c(fArr, (float) j10.b().c(), 0.5f, 0.5f);
            if (j10.m()) {
                android.opengl.Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
                android.opengl.Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
            }
        }
        android.opengl.Matrix.invertM(fArr, 0, fArr, 0);
    }

    /* access modifiers changed from: private */
    public /* synthetic */ Object h(c.a aVar) {
        this.f9576q = aVar;
        return "SurfaceOutputImpl close future complete";
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void i(AtomicReference atomicReference) {
        ((a) atomicReference.get()).accept(v0.b.c(0, this));
    }

    public void G1(float[] fArr, float[] fArr2) {
        W(fArr, fArr2, true);
    }

    public void W(float[] fArr, float[] fArr2, boolean z10) {
        android.opengl.Matrix.multiplyMM(fArr, 0, fArr2, 0, z10 ? this.f9567h : this.f9568i, 0);
    }

    public Size a() {
        return this.f9564e;
    }

    public void close() {
        synchronized (this.f9560a) {
            try {
                if (!this.f9574o) {
                    this.f9574o = true;
                }
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        this.f9576q.c(null);
    }

    public C10101e<Void> g() {
        return this.f9575p;
    }

    public int getFormat() {
        return this.f9563d;
    }

    public Surface i3(Executor executor, a<v0.b> aVar) {
        boolean z10;
        synchronized (this.f9560a) {
            this.f9572m = executor;
            this.f9571l = aVar;
            z10 = this.f9573n;
        }
        if (z10) {
            l();
        }
        return this.f9561b;
    }

    public void l() {
        Executor executor;
        AtomicReference atomicReference = new AtomicReference();
        synchronized (this.f9560a) {
            try {
                if (this.f9572m != null) {
                    a<v0.b> aVar = this.f9571l;
                    if (aVar != null) {
                        if (!this.f9574o) {
                            atomicReference.set(aVar);
                            executor = this.f9572m;
                            this.f9573n = false;
                        }
                        executor = null;
                    }
                }
                this.f9573n = true;
                executor = null;
            } catch (Throwable th2) {
                while (true) {
                    throw th2;
                }
            }
        }
        if (executor != null) {
            try {
                executor.execute(new P(this, atomicReference));
            } catch (RejectedExecutionException e10) {
                C4391e0.b("SurfaceOutputImpl", "Processor executor closed. Close request not posted.", e10);
            }
        }
    }
}

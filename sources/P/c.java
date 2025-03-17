package P;

import C.C4389d0;
import C.C4391e0;
import C.C4417z;
import C.v0;
import H2.i;
import O.C;
import O.C4715z;
import Q.d;
import Q.e;
import Q.g;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLExt;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import com.sugarcube.decorate_engine.SceneLayout;
import java.util.Map;

public final class c extends C4715z {

    /* renamed from: n  reason: collision with root package name */
    private int f11770n = -1;

    /* renamed from: o  reason: collision with root package name */
    private int f11771o = -1;

    /* renamed from: p  reason: collision with root package name */
    private final C4389d0 f11772p;

    /* renamed from: q  reason: collision with root package name */
    private final C4389d0 f11773q;

    public c(C4389d0 d0Var, C4389d0 d0Var2) {
        this.f11772p = d0Var;
        this.f11773q = d0Var2;
    }

    private static float[] u(Size size, Size size2, C4389d0 d0Var) {
        float[] l10 = d.l();
        float[] l11 = d.l();
        float[] l12 = d.l();
        Matrix.scaleM(l10, 0, ((float) size.getWidth()) / ((float) size2.getWidth()), ((float) size.getHeight()) / ((float) size2.getHeight()), 1.0f);
        Matrix.translateM(l11, 0, d0Var.c() / d0Var.e(), d0Var.d() / d0Var.b(), 0.0f);
        Matrix.multiplyMM(l12, 0, l10, 0, l11, 0);
        return l12;
    }

    private void w(g gVar, v0 v0Var, SurfaceTexture surfaceTexture, C4389d0 d0Var, int i10, boolean z10) {
        s(i10);
        GLES20.glViewport(0, 0, gVar.c(), gVar.b());
        GLES20.glScissor(0, 0, gVar.c(), gVar.b());
        float[] fArr = new float[16];
        surfaceTexture.getTransformMatrix(fArr);
        float[] fArr2 = new float[16];
        v0Var.W(fArr2, fArr, z10);
        d.f fVar = (d.f) i.g(this.f9673k);
        if (fVar instanceof d.g) {
            ((d.g) fVar).h(fArr2);
        }
        fVar.e(u(new Size((int) (((float) gVar.c()) * d0Var.e()), (int) (((float) gVar.b()) * d0Var.b())), new Size(gVar.c(), gVar.b()), d0Var));
        fVar.d(d0Var.a());
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(SceneLayout.kLegacy2DVersion, 771, 1, 771);
        GLES20.glDrawArrays(5, 0, 4);
        d.g("glDrawArrays");
        GLES20.glDisable(3042);
    }

    public e h(C4417z zVar, Map<d.e, C> map) {
        e h10 = super.h(zVar, map);
        this.f11770n = d.p();
        this.f11771o = d.p();
        return h10;
    }

    public void k() {
        super.k();
        this.f11770n = -1;
        this.f11771o = -1;
    }

    public int t(boolean z10) {
        d.i(this.f9663a, true);
        d.h(this.f9665c);
        return z10 ? this.f11770n : this.f11771o;
    }

    public void v(long j10, Surface surface, v0 v0Var, SurfaceTexture surfaceTexture, SurfaceTexture surfaceTexture2) {
        d.i(this.f9663a, true);
        d.h(this.f9665c);
        g f10 = f(surface);
        if (f10 == d.f11920l) {
            f10 = c(surface);
            if (f10 != null) {
                this.f9664b.put(surface, f10);
            } else {
                return;
            }
        }
        if (surface != this.f9671i) {
            i(f10.a());
            this.f9671i = surface;
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16384);
        g gVar = f10;
        v0 v0Var2 = v0Var;
        w(gVar, v0Var2, surfaceTexture, this.f11772p, this.f11770n, true);
        w(gVar, v0Var2, surfaceTexture2, this.f11773q, this.f11771o, true);
        EGLExt.eglPresentationTimeANDROID(this.f9666d, f10.a(), j10);
        if (!EGL14.eglSwapBuffers(this.f9666d, f10.a())) {
            C4391e0.l("DualOpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
            m(surface, false);
        }
    }
}

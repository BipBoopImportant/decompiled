package androidx.media3.exoplayer.video.spherical;

import android.opengl.GLES20;
import android.util.Log;
import androidx.media3.exoplayer.video.spherical.c;
import java.nio.FloatBuffer;
import t3.C5960k;
import t3.C5961l;

final class e {

    /* renamed from: j  reason: collision with root package name */
    private static final float[] f43063j = {1.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: k  reason: collision with root package name */
    private static final float[] f43064k = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: l  reason: collision with root package name */
    private static final float[] f43065l = {1.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: m  reason: collision with root package name */
    private static final float[] f43066m = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 1.0f};

    /* renamed from: n  reason: collision with root package name */
    private static final float[] f43067n = {0.5f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.5f, 1.0f, 1.0f};

    /* renamed from: a  reason: collision with root package name */
    private int f43068a;

    /* renamed from: b  reason: collision with root package name */
    private a f43069b;

    /* renamed from: c  reason: collision with root package name */
    private a f43070c;

    /* renamed from: d  reason: collision with root package name */
    private C5960k f43071d;

    /* renamed from: e  reason: collision with root package name */
    private int f43072e;

    /* renamed from: f  reason: collision with root package name */
    private int f43073f;

    /* renamed from: g  reason: collision with root package name */
    private int f43074g;

    /* renamed from: h  reason: collision with root package name */
    private int f43075h;

    /* renamed from: i  reason: collision with root package name */
    private int f43076i;

    private static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final int f43077a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final FloatBuffer f43078b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final FloatBuffer f43079c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public final int f43080d;

        public a(c.b bVar) {
            this.f43077a = bVar.a();
            this.f43078b = C5961l.e(bVar.f43061c);
            this.f43079c = C5961l.e(bVar.f43062d);
            int i10 = bVar.f43060b;
            if (i10 == 1) {
                this.f43080d = 5;
            } else if (i10 != 2) {
                this.f43080d = 4;
            } else {
                this.f43080d = 6;
            }
        }
    }

    e() {
    }

    public static boolean c(c cVar) {
        c.a aVar = cVar.f43054a;
        c.a aVar2 = cVar.f43055b;
        return aVar.b() == 1 && aVar.a(0).f43059a == 0 && aVar2.b() == 1 && aVar2.a(0).f43059a == 0;
    }

    public void a(int i10, float[] fArr, boolean z10) {
        a aVar = z10 ? this.f43070c : this.f43069b;
        if (aVar != null) {
            int i11 = this.f43068a;
            GLES20.glUniformMatrix3fv(this.f43073f, 1, false, i11 == 1 ? z10 ? f43065l : f43064k : i11 == 2 ? z10 ? f43067n : f43066m : f43063j, 0);
            GLES20.glUniformMatrix4fv(this.f43072e, 1, false, fArr, 0);
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(36197, i10);
            GLES20.glUniform1i(this.f43076i, 0);
            try {
                C5961l.b();
            } catch (C5961l.a e10) {
                Log.e("ProjectionRenderer", "Failed to bind uniforms", e10);
            }
            GLES20.glVertexAttribPointer(this.f43074g, 3, 5126, false, 12, aVar.f43078b);
            try {
                C5961l.b();
            } catch (C5961l.a e11) {
                Log.e("ProjectionRenderer", "Failed to load position data", e11);
            }
            GLES20.glVertexAttribPointer(this.f43075h, 2, 5126, false, 8, aVar.f43079c);
            try {
                C5961l.b();
            } catch (C5961l.a e12) {
                Log.e("ProjectionRenderer", "Failed to load texture data", e12);
            }
            GLES20.glDrawArrays(aVar.f43080d, 0, aVar.f43077a);
            try {
                C5961l.b();
            } catch (C5961l.a e13) {
                Log.e("ProjectionRenderer", "Failed to render", e13);
            }
        }
    }

    public void b() {
        try {
            C5960k kVar = new C5960k("uniform mat4 uMvpMatrix;\nuniform mat3 uTexMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTexCoords;\nvarying vec2 vTexCoords;\n// Standard transformation.\nvoid main() {\n  gl_Position = uMvpMatrix * aPosition;\n  vTexCoords = (uTexMatrix * vec3(aTexCoords, 1)).xy;\n}\n", "// This is required since the texture data is GL_TEXTURE_EXTERNAL_OES.\n#extension GL_OES_EGL_image_external : require\nprecision mediump float;\n// Standard texture rendering shader.\nuniform samplerExternalOES uTexture;\nvarying vec2 vTexCoords;\nvoid main() {\n  gl_FragColor = texture2D(uTexture, vTexCoords);\n}\n");
            this.f43071d = kVar;
            this.f43072e = kVar.j("uMvpMatrix");
            this.f43073f = this.f43071d.j("uTexMatrix");
            this.f43074g = this.f43071d.e("aPosition");
            this.f43075h = this.f43071d.e("aTexCoords");
            this.f43076i = this.f43071d.j("uTexture");
        } catch (C5961l.a e10) {
            Log.e("ProjectionRenderer", "Failed to initialize the program", e10);
        }
    }

    public void d(c cVar) {
        if (c(cVar)) {
            this.f43068a = cVar.f43056c;
            a aVar = new a(cVar.f43054a.a(0));
            this.f43069b = aVar;
            if (!cVar.f43057d) {
                aVar = new a(cVar.f43055b.a(0));
            }
            this.f43070c = aVar;
        }
    }
}

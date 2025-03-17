package androidx.media3.exoplayer.video;

import L3.n;
import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import t3.C5950a;
import t3.C5960k;
import t3.C5961l;
import y3.i;

public final class VideoDecoderGLSurfaceView extends GLSurfaceView implements n {

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f43002b = 0;

    /* renamed from: a  reason: collision with root package name */
    private final a f43003a;

    private static final class a implements GLSurfaceView.Renderer {

        /* renamed from: k  reason: collision with root package name */
        private static final float[] f43004k = {1.164f, 1.164f, 1.164f, 0.0f, -0.392f, 2.017f, 1.596f, -0.813f, 0.0f};

        /* renamed from: l  reason: collision with root package name */
        private static final float[] f43005l = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};

        /* renamed from: m  reason: collision with root package name */
        private static final float[] f43006m = {1.168f, 1.168f, 1.168f, 0.0f, -0.188f, 2.148f, 1.683f, -0.652f, 0.0f};

        /* renamed from: n  reason: collision with root package name */
        private static final String[] f43007n = {"y_tex", "u_tex", "v_tex"};

        /* renamed from: o  reason: collision with root package name */
        private static final FloatBuffer f43008o = C5961l.e(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});

        /* renamed from: a  reason: collision with root package name */
        private final GLSurfaceView f43009a;

        /* renamed from: b  reason: collision with root package name */
        private final int[] f43010b = new int[3];

        /* renamed from: c  reason: collision with root package name */
        private final int[] f43011c = new int[3];

        /* renamed from: d  reason: collision with root package name */
        private final int[] f43012d = new int[3];

        /* renamed from: e  reason: collision with root package name */
        private final int[] f43013e = new int[3];

        /* renamed from: f  reason: collision with root package name */
        private final AtomicReference<i> f43014f = new AtomicReference<>();

        /* renamed from: g  reason: collision with root package name */
        private final FloatBuffer[] f43015g = new FloatBuffer[3];

        /* renamed from: h  reason: collision with root package name */
        private C5960k f43016h;

        /* renamed from: i  reason: collision with root package name */
        private int f43017i;

        /* renamed from: j  reason: collision with root package name */
        private i f43018j;

        public a(GLSurfaceView gLSurfaceView) {
            this.f43009a = gLSurfaceView;
            for (int i10 = 0; i10 < 3; i10++) {
                int[] iArr = this.f43012d;
                this.f43013e[i10] = -1;
                iArr[i10] = -1;
            }
        }

        private void b() {
            try {
                GLES20.glGenTextures(3, this.f43010b, 0);
                for (int i10 = 0; i10 < 3; i10++) {
                    GLES20.glUniform1i(this.f43016h.j(f43007n[i10]), i10);
                    GLES20.glActiveTexture(33984 + i10);
                    C5961l.a(3553, this.f43010b[i10], 9729);
                }
                C5961l.b();
            } catch (C5961l.a e10) {
                Log.e("VideoDecoderGLSV", "Failed to set up the textures", e10);
            }
        }

        public void a(i iVar) {
            i andSet = this.f43014f.getAndSet(iVar);
            if (andSet != null) {
                andSet.J();
            }
            this.f43009a.requestRender();
        }

        public void onDrawFrame(GL10 gl10) {
            i andSet = this.f43014f.getAndSet((Object) null);
            if (andSet != null || this.f43018j != null) {
                if (andSet != null) {
                    i iVar = this.f43018j;
                    if (iVar != null) {
                        iVar.J();
                    }
                    this.f43018j = andSet;
                }
                i iVar2 = (i) C5950a.e(this.f43018j);
                float[] fArr = f43005l;
                int i10 = iVar2.f32309i;
                if (i10 == 1) {
                    fArr = f43004k;
                } else if (i10 == 3) {
                    fArr = f43006m;
                }
                GLES20.glUniformMatrix3fv(this.f43017i, 1, false, fArr, 0);
                int[] iArr = (int[]) C5950a.e(iVar2.f32308h);
                ByteBuffer[] byteBufferArr = (ByteBuffer[]) C5950a.e(iVar2.f32307g);
                for (int i11 = 0; i11 < 3; i11++) {
                    int i12 = iVar2.f32306f;
                    if (i11 != 0) {
                        i12 = (i12 + 1) / 2;
                    }
                    int i13 = i12;
                    GLES20.glActiveTexture(33984 + i11);
                    GLES20.glBindTexture(3553, this.f43010b[i11]);
                    GLES20.glPixelStorei(3317, 1);
                    GLES20.glTexImage2D(3553, 0, 6409, iArr[i11], i13, 0, 6409, 5121, byteBufferArr[i11]);
                }
                int[] iArr2 = new int[3];
                int i14 = iVar2.f32305e;
                iArr2[0] = i14;
                int i15 = (i14 + 1) / 2;
                iArr2[2] = i15;
                iArr2[1] = i15;
                for (int i16 = 0; i16 < 3; i16++) {
                    if (this.f43012d[i16] != iArr2[i16] || this.f43013e[i16] != iArr[i16]) {
                        C5950a.g(iArr[i16] != 0);
                        float f10 = ((float) iArr2[i16]) / ((float) iArr[i16]);
                        this.f43015g[i16] = C5961l.e(new float[]{0.0f, 0.0f, 0.0f, 1.0f, f10, 0.0f, f10, 1.0f});
                        GLES20.glVertexAttribPointer(this.f43011c[i16], 2, 5126, false, 0, this.f43015g[i16]);
                        this.f43012d[i16] = iArr2[i16];
                        this.f43013e[i16] = iArr[i16];
                    }
                }
                GLES20.glClear(16384);
                GLES20.glDrawArrays(5, 0, 4);
                try {
                    C5961l.b();
                } catch (C5961l.a e10) {
                    Log.e("VideoDecoderGLSV", "Failed to draw a frame", e10);
                }
            }
        }

        public void onSurfaceChanged(GL10 gl10, int i10, int i11) {
            GLES20.glViewport(0, 0, i10, i11);
        }

        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            try {
                C5960k kVar = new C5960k("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
                this.f43016h = kVar;
                GLES20.glVertexAttribPointer(kVar.e("in_pos"), 2, 5126, false, 0, f43008o);
                this.f43011c[0] = this.f43016h.e("in_tc_y");
                this.f43011c[1] = this.f43016h.e("in_tc_u");
                this.f43011c[2] = this.f43016h.e("in_tc_v");
                this.f43017i = this.f43016h.j("mColorConversion");
                C5961l.b();
                b();
                C5961l.b();
            } catch (C5961l.a e10) {
                Log.e("VideoDecoderGLSV", "Failed to set up the textures and program", e10);
            }
        }
    }

    public VideoDecoderGLSurfaceView(Context context) {
        this(context, (AttributeSet) null);
    }

    @Deprecated
    public n getVideoDecoderOutputBufferRenderer() {
        return this;
    }

    public void setOutputBuffer(i iVar) {
        this.f43003a.a(iVar);
    }

    public VideoDecoderGLSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a aVar = new a(this);
        this.f43003a = aVar;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(aVar);
        setRenderMode(0);
    }
}

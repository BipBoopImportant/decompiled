package Q;

import C.C4391e0;
import C.C4417z;
import H2.i;
import O.C;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static final int[] f11909a = {12344};

    /* renamed from: b  reason: collision with root package name */
    public static final int[] f11910b = {12445, 13632, 12344};

    /* renamed from: c  reason: collision with root package name */
    public static final String f11911c;

    /* renamed from: d  reason: collision with root package name */
    public static final String f11912d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final C f11913e = new a();
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final C f11914f = new b();
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public static final C f11915g = new c();

    /* renamed from: h  reason: collision with root package name */
    public static final float[] f11916h;

    /* renamed from: i  reason: collision with root package name */
    public static final FloatBuffer f11917i;

    /* renamed from: j  reason: collision with root package name */
    public static final float[] f11918j;

    /* renamed from: k  reason: collision with root package name */
    public static final FloatBuffer f11919k;

    /* renamed from: l  reason: collision with root package name */
    public static final g f11920l = g.d(EGL14.EGL_NO_SURFACE, 0, 0);

    class a implements C {
        a() {
        }

        public String a(String str, String str2) {
            return String.format(Locale.US, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 %s;\nuniform samplerExternalOES %s;\nuniform float uAlphaScale;\nvoid main() {\n    vec4 src = texture2D(%s, %s);\n    gl_FragColor = vec4(src.rgb, src.a * uAlphaScale);\n}\n", new Object[]{str2, str, str, str2});
        }
    }

    class b implements C {
        b() {
        }

        public String a(String str, String str2) {
            return String.format(Locale.US, "#version 300 es\n#extension GL_OES_EGL_image_external_essl3 : require\nprecision mediump float;\nuniform samplerExternalOES %s;\nuniform float uAlphaScale;\nin vec2 %s;\nout vec4 outColor;\n\nvoid main() {\n  vec4 src = texture(%s, %s);\n  outColor = vec4(src.rgb, src.a * uAlphaScale);\n}", new Object[]{str, str2, str, str2});
        }
    }

    class c implements C {
        c() {
        }

        public String a(String str, String str2) {
            return String.format(Locale.US, "#version 300 es\n#extension GL_EXT_YUV_target : require\nprecision mediump float;\nuniform __samplerExternal2DY2YEXT %s;\nuniform float uAlphaScale;\nin vec2 %s;\nout vec4 outColor;\n\nvec3 yuvToRgb(vec3 yuv) {\n  const vec3 yuvOffset = vec3(0.0625, 0.5, 0.5);\n  const mat3 yuvToRgbColorMat = mat3(\n    1.1689f, 1.1689f, 1.1689f,\n    0.0000f, -0.1881f, 2.1502f,\n    1.6853f, -0.6530f, 0.0000f\n  );\n  return clamp(yuvToRgbColorMat * (yuv - yuvOffset), 0.0, 1.0);\n}\n\nvoid main() {\n  vec3 srcYuv = texture(%s, %s).xyz;\n  vec3 srcRgb = yuvToRgb(srcYuv);\n  outColor = vec4(srcRgb, uAlphaScale);\n}", new Object[]{str, str2, str, str2});
        }
    }

    /* renamed from: Q.d$d  reason: collision with other inner class name */
    public static class C0181d extends f {
        public C0181d() {
            super("uniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n}\n", "precision mediump float;\nuniform float uAlphaScale;\nvoid main() {\n    gl_FragColor = vec4(0.0, 0.0, 0.0, uAlphaScale);\n}\n");
        }
    }

    public enum e {
        UNKNOWN,
        DEFAULT,
        YUV
    }

    public static abstract class f {

        /* renamed from: a  reason: collision with root package name */
        protected int f11921a;

        /* renamed from: b  reason: collision with root package name */
        protected int f11922b = -1;

        /* renamed from: c  reason: collision with root package name */
        protected int f11923c = -1;

        /* renamed from: d  reason: collision with root package name */
        protected int f11924d = -1;

        /* JADX WARNING: Removed duplicated region for block: B:27:0x0078  */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x007d  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x0082  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        protected f(java.lang.String r7, java.lang.String r8) {
            /*
                r6 = this;
                java.lang.String r0 = "glAttachShader"
                r6.<init>()
                r1 = -1
                r6.f11922b = r1
                r6.f11923c = r1
                r6.f11924d = r1
                r2 = 35633(0x8b31, float:4.9932E-41)
                int r7 = Q.d.y(r2, r7)     // Catch:{ IllegalStateException -> 0x0074, IllegalArgumentException -> 0x0070 }
                r2 = 35632(0x8b30, float:4.9931E-41)
                int r8 = Q.d.y(r2, r8)     // Catch:{ IllegalStateException -> 0x006e, IllegalArgumentException -> 0x006a }
                int r2 = android.opengl.GLES20.glCreateProgram()     // Catch:{ IllegalStateException -> 0x0068, IllegalArgumentException -> 0x0065 }
                java.lang.String r3 = "glCreateProgram"
                Q.d.g(r3)     // Catch:{ IllegalStateException -> 0x0048, IllegalArgumentException -> 0x0046 }
                android.opengl.GLES20.glAttachShader(r2, r7)     // Catch:{ IllegalStateException -> 0x0048, IllegalArgumentException -> 0x0046 }
                Q.d.g(r0)     // Catch:{ IllegalStateException -> 0x0048, IllegalArgumentException -> 0x0046 }
                android.opengl.GLES20.glAttachShader(r2, r8)     // Catch:{ IllegalStateException -> 0x0048, IllegalArgumentException -> 0x0046 }
                Q.d.g(r0)     // Catch:{ IllegalStateException -> 0x0048, IllegalArgumentException -> 0x0046 }
                android.opengl.GLES20.glLinkProgram(r2)     // Catch:{ IllegalStateException -> 0x0048, IllegalArgumentException -> 0x0046 }
                r0 = 1
                int[] r3 = new int[r0]     // Catch:{ IllegalStateException -> 0x0048, IllegalArgumentException -> 0x0046 }
                r4 = 35714(0x8b82, float:5.0046E-41)
                r5 = 0
                android.opengl.GLES20.glGetProgramiv(r2, r4, r3, r5)     // Catch:{ IllegalStateException -> 0x0048, IllegalArgumentException -> 0x0046 }
                r3 = r3[r5]     // Catch:{ IllegalStateException -> 0x0048, IllegalArgumentException -> 0x0046 }
                if (r3 != r0) goto L_0x004a
                r6.f11921a = r2     // Catch:{ IllegalStateException -> 0x0048, IllegalArgumentException -> 0x0046 }
                r6.c()
                return
            L_0x0046:
                r0 = move-exception
                goto L_0x0076
            L_0x0048:
                r0 = move-exception
                goto L_0x0076
            L_0x004a:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x0048, IllegalArgumentException -> 0x0046 }
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x0048, IllegalArgumentException -> 0x0046 }
                r3.<init>()     // Catch:{ IllegalStateException -> 0x0048, IllegalArgumentException -> 0x0046 }
                java.lang.String r4 = "Could not link program: "
                r3.append(r4)     // Catch:{ IllegalStateException -> 0x0048, IllegalArgumentException -> 0x0046 }
                java.lang.String r4 = android.opengl.GLES20.glGetProgramInfoLog(r2)     // Catch:{ IllegalStateException -> 0x0048, IllegalArgumentException -> 0x0046 }
                r3.append(r4)     // Catch:{ IllegalStateException -> 0x0048, IllegalArgumentException -> 0x0046 }
                java.lang.String r3 = r3.toString()     // Catch:{ IllegalStateException -> 0x0048, IllegalArgumentException -> 0x0046 }
                r0.<init>(r3)     // Catch:{ IllegalStateException -> 0x0048, IllegalArgumentException -> 0x0046 }
                throw r0     // Catch:{ IllegalStateException -> 0x0048, IllegalArgumentException -> 0x0046 }
            L_0x0065:
                r0 = move-exception
            L_0x0066:
                r2 = r1
                goto L_0x0076
            L_0x0068:
                r0 = move-exception
                goto L_0x0066
            L_0x006a:
                r0 = move-exception
            L_0x006b:
                r8 = r1
            L_0x006c:
                r2 = r8
                goto L_0x0076
            L_0x006e:
                r0 = move-exception
                goto L_0x006b
            L_0x0070:
                r0 = move-exception
            L_0x0071:
                r7 = r1
                r8 = r7
                goto L_0x006c
            L_0x0074:
                r0 = move-exception
                goto L_0x0071
            L_0x0076:
                if (r7 == r1) goto L_0x007b
                android.opengl.GLES20.glDeleteShader(r7)
            L_0x007b:
                if (r8 == r1) goto L_0x0080
                android.opengl.GLES20.glDeleteShader(r8)
            L_0x0080:
                if (r2 == r1) goto L_0x0085
                android.opengl.GLES20.glDeleteProgram(r2)
            L_0x0085:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: Q.d.f.<init>(java.lang.String, java.lang.String):void");
        }

        /* access modifiers changed from: private */
        public void c() {
            int glGetAttribLocation = GLES20.glGetAttribLocation(this.f11921a, "aPosition");
            this.f11924d = glGetAttribLocation;
            d.j(glGetAttribLocation, "aPosition");
            int glGetUniformLocation = GLES20.glGetUniformLocation(this.f11921a, "uTransMatrix");
            this.f11922b = glGetUniformLocation;
            d.j(glGetUniformLocation, "uTransMatrix");
            int glGetUniformLocation2 = GLES20.glGetUniformLocation(this.f11921a, "uAlphaScale");
            this.f11923c = glGetUniformLocation2;
            d.j(glGetUniformLocation2, "uAlphaScale");
        }

        public void b() {
            GLES20.glDeleteProgram(this.f11921a);
        }

        public void d(float f10) {
            GLES20.glUniform1f(this.f11923c, f10);
            d.g("glUniform1f");
        }

        public void e(float[] fArr) {
            GLES20.glUniformMatrix4fv(this.f11922b, 1, false, fArr, 0);
            d.g("glUniformMatrix4fv");
        }

        public void f() {
            GLES20.glUseProgram(this.f11921a);
            d.g("glUseProgram");
            GLES20.glEnableVertexAttribArray(this.f11924d);
            d.g("glEnableVertexAttribArray");
            GLES20.glVertexAttribPointer(this.f11924d, 2, 5126, false, 0, d.f11917i);
            d.g("glVertexAttribPointer");
            e(d.l());
            d(1.0f);
        }
    }

    public static class g extends f {

        /* renamed from: e  reason: collision with root package name */
        private int f11925e;

        /* renamed from: f  reason: collision with root package name */
        private int f11926f;

        /* renamed from: g  reason: collision with root package name */
        private int f11927g;

        public g(C4417z zVar, e eVar) {
            this(zVar, g(zVar, eVar));
        }

        private void c() {
            c();
            int glGetUniformLocation = GLES20.glGetUniformLocation(this.f11921a, "sTexture");
            this.f11925e = glGetUniformLocation;
            d.j(glGetUniformLocation, "sTexture");
            int glGetAttribLocation = GLES20.glGetAttribLocation(this.f11921a, "aTextureCoord");
            this.f11927g = glGetAttribLocation;
            d.j(glGetAttribLocation, "aTextureCoord");
            int glGetUniformLocation2 = GLES20.glGetUniformLocation(this.f11921a, "uTexMatrix");
            this.f11926f = glGetUniformLocation2;
            d.j(glGetUniformLocation2, "uTexMatrix");
        }

        private static C g(C4417z zVar, e eVar) {
            if (!zVar.d()) {
                return d.f11913e;
            }
            boolean z10 = eVar != e.UNKNOWN;
            i.b(z10, "No default sampler shader available for" + eVar);
            return eVar == e.YUV ? d.f11915g : d.f11914f;
        }

        public void f() {
            super.f();
            GLES20.glUniform1i(this.f11925e, 0);
            GLES20.glEnableVertexAttribArray(this.f11927g);
            d.g("glEnableVertexAttribArray");
            GLES20.glVertexAttribPointer(this.f11927g, 2, 5126, false, 0, d.f11919k);
            d.g("glVertexAttribPointer");
        }

        public void h(float[] fArr) {
            GLES20.glUniformMatrix4fv(this.f11926f, 1, false, fArr, 0);
            d.g("glUniformMatrix4fv");
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public g(C4417z zVar, C c10) {
            super(zVar.d() ? d.f11912d : d.f11911c, d.v(c10));
            this.f11925e = -1;
            this.f11926f = -1;
            this.f11927g = -1;
            c();
        }
    }

    static {
        Locale locale = Locale.US;
        f11911c = String.format(locale, "uniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 %s;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n    %s = (uTexMatrix * aTextureCoord).xy;\n}\n", new Object[]{"vTextureCoord", "vTextureCoord"});
        f11912d = String.format(locale, "#version 300 es\nin vec4 aPosition;\nin vec4 aTextureCoord;\nuniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nout vec2 %s;\nvoid main() {\n  gl_Position = uTransMatrix * aPosition;\n  %s = (uTexMatrix * aTextureCoord).xy;\n}\n", new Object[]{"vTextureCoord", "vTextureCoord"});
        float[] fArr = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        f11916h = fArr;
        f11917i = m(fArr);
        float[] fArr2 = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        f11918j = fArr2;
        f11919k = m(fArr2);
    }

    public static void e(String str) {
        try {
            f(str);
        } catch (IllegalStateException e10) {
            C4391e0.d("GLUtils", e10.toString(), e10);
        }
    }

    public static void f(String str) {
        int eglGetError = EGL14.eglGetError();
        if (eglGetError != 12288) {
            throw new IllegalStateException(str + ": EGL error: 0x" + Integer.toHexString(eglGetError));
        }
    }

    public static void g(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            throw new IllegalStateException(str + ": GL error 0x" + Integer.toHexString(glGetError));
        }
    }

    public static void h(Thread thread) {
        i.j(thread == Thread.currentThread(), "Method call must be called on the GL thread.");
    }

    public static void i(AtomicBoolean atomicBoolean, boolean z10) {
        i.j(z10 == atomicBoolean.get(), z10 ? "OpenGlRenderer is not initialized" : "OpenGlRenderer is already initialized");
    }

    public static void j(int i10, String str) {
        if (i10 < 0) {
            throw new IllegalStateException("Unable to locate '" + str + "' in program");
        }
    }

    public static int[] k(String str, C4417z zVar) {
        int[] iArr = f11909a;
        if (zVar.b() != 3) {
            return iArr;
        }
        if (str.contains("EGL_EXT_gl_colorspace_bt2020_hlg")) {
            return f11910b;
        }
        C4391e0.l("GLUtils", "Dynamic range uses HLG encoding, but device does not support EGL_EXT_gl_colorspace_bt2020_hlg.Fallback to default colorspace.");
        return iArr;
    }

    public static float[] l() {
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        return fArr;
    }

    public static FloatBuffer m(float[] fArr) {
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        return asFloatBuffer;
    }

    public static EGLSurface n(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i10, int i11) {
        EGLSurface eglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, new int[]{12375, i10, 12374, i11, 12344}, 0);
        f("eglCreatePbufferSurface");
        if (eglCreatePbufferSurface != null) {
            return eglCreatePbufferSurface;
        }
        throw new IllegalStateException("surface was null");
    }

    public static Map<e, f> o(C4417z zVar, Map<e, C> map) {
        Object obj;
        e eVar;
        HashMap hashMap = new HashMap();
        e[] values = e.values();
        int length = values.length;
        for (int i10 = 0; i10 < length; i10++) {
            e eVar2 = values[i10];
            C c10 = map.get(eVar2);
            if (c10 != null) {
                obj = new g(zVar, c10);
            } else if (eVar2 == e.YUV || eVar2 == (eVar = e.DEFAULT)) {
                obj = new g(zVar, eVar2);
            } else {
                i.j(eVar2 == e.UNKNOWN, "Unhandled input format: " + eVar2);
                if (zVar.d()) {
                    obj = new C0181d();
                } else {
                    C c11 = map.get(eVar);
                    obj = c11 != null ? new g(zVar, c11) : new g(zVar, eVar);
                }
            }
            Log.d("GLUtils", "Shader program for input format " + eVar2 + " created: " + obj);
            hashMap.put(eVar2, obj);
        }
        return hashMap;
    }

    public static int p() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        g("glGenTextures");
        int i10 = iArr[0];
        GLES20.glBindTexture(36197, i10);
        g("glBindTexture " + i10);
        GLES20.glTexParameteri(36197, 10241, 9728);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        g("glTexParameter");
        return i10;
    }

    public static EGLSurface q(EGLDisplay eGLDisplay, EGLConfig eGLConfig, Surface surface, int[] iArr) {
        EGLSurface eglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfig, surface, iArr, 0);
        f("eglCreateWindowSurface");
        if (eglCreateWindowSurface != null) {
            return eglCreateWindowSurface;
        }
        throw new IllegalStateException("surface was null");
    }

    public static void r(int i10) {
        GLES20.glDeleteFramebuffers(1, new int[]{i10}, 0);
        g("glDeleteFramebuffers");
    }

    public static void s(int i10) {
        GLES20.glDeleteTextures(1, new int[]{i10}, 0);
        g("glDeleteTextures");
    }

    public static int t() {
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        g("glGenFramebuffers");
        return iArr[0];
    }

    public static int u() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        g("glGenTextures");
        return iArr[0];
    }

    /* access modifiers changed from: private */
    public static String v(C c10) {
        try {
            String a10 = c10.a("sTexture", "vTextureCoord");
            if (a10 != null && a10.contains("vTextureCoord") && a10.contains("sTexture")) {
                return a10;
            }
            throw new IllegalArgumentException("Invalid fragment shader");
        } catch (Throwable th2) {
            if (th2 instanceof IllegalArgumentException) {
                throw th2;
            }
            throw new IllegalArgumentException("Unable retrieve fragment shader source", th2);
        }
    }

    public static String w() {
        Matcher matcher = Pattern.compile("OpenGL ES ([0-9]+)\\.([0-9]+).*").matcher(GLES20.glGetString(7938));
        if (!matcher.find()) {
            return "0.0";
        }
        return ((String) i.g(matcher.group(1))) + "." + ((String) i.g(matcher.group(2)));
    }

    public static Size x(EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
        return new Size(z(eGLDisplay, eGLSurface, 12375), z(eGLDisplay, eGLSurface, 12374));
    }

    public static int y(int i10, String str) {
        int glCreateShader = GLES20.glCreateShader(i10);
        g("glCreateShader type=" + i10);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        C4391e0.l("GLUtils", "Could not compile shader: " + str);
        GLES20.glDeleteShader(glCreateShader);
        throw new IllegalStateException("Could not compile shader type " + i10 + ":" + GLES20.glGetShaderInfoLog(glCreateShader));
    }

    public static int z(EGLDisplay eGLDisplay, EGLSurface eGLSurface, int i10) {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(eGLDisplay, eGLSurface, i10, iArr, 0);
        return iArr[0];
    }
}

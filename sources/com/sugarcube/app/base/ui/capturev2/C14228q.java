package com.sugarcube.app.base.ui.capturev2;

import HJ.C15838d;
import QJ.C16297b0;
import QJ.F0;
import QJ.Q;
import QJ.T;
import XH.C16807N;
import XH.C16824o;
import XH.C16825p;
import XH.v;
import XH.y;
import YH.g0;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.display.DisplayManager;
import android.net.Uri;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.view.WindowManager;
import androidx.lifecycle.C5205h;
import androidx.lifecycle.C5221y;
import androidx.lifecycle.C5222z;
import com.google.ar.core.CameraConfig;
import com.google.ar.core.CameraConfigFilter;
import com.google.ar.core.Config;
import com.google.ar.core.RecordingConfig;
import com.google.ar.core.RecordingStatus;
import com.google.ar.core.Session;
import com.google.ar.core.Track;
import com.google.ar.core.exceptions.RecordingFailedException;
import dI.C17164e;
import dI.C17168i;
import eI.C17187b;
import fF.C14450b;
import fF.C14451c;
import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.EnumSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import javax.microedition.khronos.egl.EGL;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.opengles.GL10;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C17542s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nI.p;

@Metadata(d1 = {"\u0000É\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001r\b\u0007\u0018\u0000 72\u00020\u0001:\u00015B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u0004\u0018\u00010\n2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\fH\u0002¢\u0006\u0004\b\"\u0010#J\u001f\u0010&\u001a\u00020\u00182\u0006\u0010$\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\u0014H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\fH\u0002¢\u0006\u0004\b(\u0010#J\r\u0010)\u001a\u00020\f¢\u0006\u0004\b)\u0010#J\r\u0010*\u001a\u00020\f¢\u0006\u0004\b*\u0010#J\r\u0010+\u001a\u00020\f¢\u0006\u0004\b+\u0010#J\r\u0010,\u001a\u00020\f¢\u0006\u0004\b,\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0016\u0010;\u001a\u00020\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010=\u001a\u00020\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b<\u0010:R\u0016\u0010@\u001a\u00020\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010B\u001a\u00020\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bA\u0010?R\u0016\u0010D\u001a\u00020\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bC\u0010:R\u0016\u0010F\u001a\u00020\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bE\u0010:R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\u0018\u0010L\u001a\u0004\u0018\u00010I8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bJ\u0010KR\u001c\u0010Q\u001a\n N*\u0004\u0018\u00010M0M8\u0002X\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\"\u0010Y\u001a\u00020R8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR$\u0010]\u001a\u0004\u0018\u00010R8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\bZ\u0010T\u001a\u0004\b[\u0010V\"\u0004\b\\\u0010XR0\u0010f\u001a\u0010\u0012\u0004\u0012\u00020_\u0012\u0004\u0012\u00020_\u0018\u00010^8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR\u001b\u0010l\u001a\u00020g8BX\u0002¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010kR\u001b\u0010q\u001a\u00020m8BX\u0002¢\u0006\f\n\u0004\bn\u0010i\u001a\u0004\bo\u0010pR\u0014\u0010u\u001a\u00020r8\u0002X\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u001b\u0010y\u001a\u00020v8BX\u0002¢\u0006\f\n\u0004\bw\u0010i\u001a\u0004\b?\u0010xR\u0016\u0010}\u001a\u0004\u0018\u00010z8\u0002X\u0004¢\u0006\u0006\n\u0004\b{\u0010|R\u0018\u0010\u0001\u001a\u0004\u0018\u00010~8\u0002X\u0004¢\u0006\u0007\n\u0005\b\u0010\u0001R\u0018\u0010\u0001\u001a\u00020\u00188\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0001\u0010?R\u0018\u0010\u0001\u001a\u00020\u00188\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0001\u0010?R\u0018\u0010\u0001\u001a\u00020\u00188\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b\u0001\u0010?R\u0019\u0010\u0001\u001a\u00030\u00018\u0002@\u0002X\u000e¢\u0006\u0007\n\u0005\b+\u0010\u0001R\u0017\u0010\u0001\u001a\u00020\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u0010?R\u0017\u0010\u0001\u001a\u00030\u00018\u0002X\u0004¢\u0006\u0007\n\u0005\b,\u0010\u0001R*\u0010\u0001\u001a\u00030\u00018\u0006@\u0006X\u000e¢\u0006\u0018\n\u0006\b\u0001\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R)\u0010\u0001\u001a\u00030\u00018\u0006@\u0006X\u000e¢\u0006\u0017\n\u0005\b\"\u0010\u0001\u001a\u0006\b\u0001\u0010\u0001\"\u0006\b\u0001\u0010\u0001R\u0016\u0010\u0001\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0007\n\u0005\b(\u0010\u0001R\u0016\u0010\u0001\u001a\u00020\u00148\u0002X\u0004¢\u0006\u0007\n\u0005\b/\u0010\u0001R\u0018\u0010 \u0001\u001a\u00030\u00018BX\u0004¢\u0006\b\u001a\u0006\b\u0001\u0010\u0001¨\u0006¡\u0001"}, d2 = {"Lcom/sugarcube/app/base/ui/capturev2/q;", "", "Lcom/sugarcube/app/base/ui/capturev2/CaptureActivity;", "activity", "Landroid/opengl/GLSurfaceView;", "surface", "Lcom/sugarcube/app/base/ui/capturev2/ArControl;", "arControl", "<init>", "(Lcom/sugarcube/app/base/ui/capturev2/CaptureActivity;Landroid/opengl/GLSurfaceView;Lcom/sugarcube/app/base/ui/capturev2/ArControl;)V", "Lcom/google/ar/core/Session;", "session", "LXH/N;", "Q", "(Lcom/google/ar/core/Session;)V", "", "Lcom/google/ar/core/Session$Feature;", "features", "U", "(Ljava/util/Set;)Lcom/google/ar/core/Session;", "", "recordingPath", "N", "(Lcom/google/ar/core/Session;Ljava/lang/String;)V", "", "R", "()I", "", "O", "()Z", "Ljavax/microedition/khronos/egl/EGLConfig;", "config", "z", "(Ljavax/microedition/khronos/egl/EGLConfig;)V", "C", "()V", "type", "shaderCode", "P", "(ILjava/lang/String;)I", "D", "T", "S", "y", "A", "a", "Lcom/sugarcube/app/base/ui/capturev2/CaptureActivity;", "E", "()Lcom/sugarcube/app/base/ui/capturev2/CaptureActivity;", "b", "Landroid/opengl/GLSurfaceView;", "L", "()Landroid/opengl/GLSurfaceView;", "c", "Lcom/sugarcube/app/base/ui/capturev2/ArControl;", "F", "()Lcom/sugarcube/app/base/ui/capturev2/ArControl;", "d", "Z", "surfaceCreated", "e", "viewportChanged", "f", "I", "viewportWidth", "g", "viewportHeight", "h", "hasSetTextureNames", "i", "arcoreActive", "j", "Lcom/google/ar/core/Session;", "Lcom/sugarcube/app/base/ui/capturev2/l;", "k", "Lcom/sugarcube/app/base/ui/capturev2/l;", "sharedCameraSession", "Ljava/util/UUID;", "kotlin.jvm.PlatformType", "l", "Ljava/util/UUID;", "trackUUID", "Lcom/sugarcube/app/base/ui/capturev2/W;", "m", "Lcom/sugarcube/app/base/ui/capturev2/W;", "getArIntrinsics", "()Lcom/sugarcube/app/base/ui/capturev2/W;", "setArIntrinsics", "(Lcom/sugarcube/app/base/ui/capturev2/W;)V", "ArIntrinsics", "n", "H", "setCameraIntrinsics", "cameraIntrinsics", "LXH/v;", "", "o", "LXH/v;", "G", "()LXH/v;", "setCameraFOV", "(LXH/v;)V", "cameraFOV", "Landroid/view/WindowManager;", "p", "LXH/o;", "M", "()Landroid/view/WindowManager;", "windowManager", "Landroid/hardware/display/DisplayManager;", "q", "J", "()Landroid/hardware/display/DisplayManager;", "displayManager", "com/sugarcube/app/base/ui/capturev2/q$d", "r", "Lcom/sugarcube/app/base/ui/capturev2/q$d;", "displayListener", "Landroid/hardware/camera2/CameraManager;", "s", "()Landroid/hardware/camera2/CameraManager;", "cameraManager", "LfF/c;", "t", "LfF/c;", "pointCloudRenderer", "LfF/b;", "u", "LfF/b;", "planeRenderer", "v", "program", "w", "quadPositionParam", "x", "quadTexCoordParam", "", "[I", "texture", "textureId", "", "[F", "quadCoords", "Ljava/nio/FloatBuffer;", "B", "Ljava/nio/FloatBuffer;", "getQuadCoordsBuffer", "()Ljava/nio/FloatBuffer;", "setQuadCoordsBuffer", "(Ljava/nio/FloatBuffer;)V", "quadCoordsBuffer", "getQuadTexCoordsBuffer", "setQuadTexCoordsBuffer", "quadTexCoordsBuffer", "Ljava/lang/String;", "vertexShaderCode", "fragmentShaderCode", "Lcom/sugarcube/app/base/ui/capturev2/h1;", "K", "()Lcom/sugarcube/app/base/ui/capturev2/h1;", "model", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* renamed from: com.sugarcube.app.base.ui.capturev2.q  reason: case insensitive filesystem */
public final class C14228q {

    /* renamed from: F  reason: collision with root package name */
    public static final c f123966F = new c((DefaultConstructorMarker) null);

    /* renamed from: G  reason: collision with root package name */
    public static final int f123967G = 8;

    /* renamed from: A  reason: collision with root package name */
    private final float[] f123968A;

    /* renamed from: B  reason: collision with root package name */
    private FloatBuffer f123969B;

    /* renamed from: C  reason: collision with root package name */
    private FloatBuffer f123970C;

    /* renamed from: D  reason: collision with root package name */
    private final String f123971D;

    /* renamed from: E  reason: collision with root package name */
    private final String f123972E;

    /* renamed from: a  reason: collision with root package name */
    private final CaptureActivity f123973a;

    /* renamed from: b  reason: collision with root package name */
    private final GLSurfaceView f123974b;

    /* renamed from: c  reason: collision with root package name */
    private final ArControl f123975c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public boolean f123976d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public boolean f123977e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public int f123978f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public int f123979g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f123980h;
    /* access modifiers changed from: private */

    /* renamed from: i  reason: collision with root package name */
    public boolean f123981i;
    /* access modifiers changed from: private */

    /* renamed from: j  reason: collision with root package name */
    public Session f123982j;
    /* access modifiers changed from: private */

    /* renamed from: k  reason: collision with root package name */
    public C14218l f123983k;

    /* renamed from: l  reason: collision with root package name */
    private final UUID f123984l = UUID.fromString("bb2ac08f-d497-4b04-aa2e-72162dd539c5");

    /* renamed from: m  reason: collision with root package name */
    private W f123985m = new W(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 31, (DefaultConstructorMarker) null);

    /* renamed from: n  reason: collision with root package name */
    private W f123986n;

    /* renamed from: o  reason: collision with root package name */
    private v<Float, Float> f123987o;

    /* renamed from: p  reason: collision with root package name */
    private final C16824o f123988p = C16825p.b(new C14222n(this));

    /* renamed from: q  reason: collision with root package name */
    private final C16824o f123989q = C16825p.b(new C14224o(this));
    /* access modifiers changed from: private */

    /* renamed from: r  reason: collision with root package name */
    public final d f123990r = new d(this);

    /* renamed from: s  reason: collision with root package name */
    private final C16824o f123991s = C16825p.b(new C14226p(this));
    /* access modifiers changed from: private */

    /* renamed from: t  reason: collision with root package name */
    public final C14451c f123992t;
    /* access modifiers changed from: private */

    /* renamed from: u  reason: collision with root package name */
    public final C14450b f123993u;

    /* renamed from: v  reason: collision with root package name */
    private int f123994v;

    /* renamed from: w  reason: collision with root package name */
    private int f123995w;

    /* renamed from: x  reason: collision with root package name */
    private int f123996x;

    /* renamed from: y  reason: collision with root package name */
    private int[] f123997y;

    /* renamed from: z  reason: collision with root package name */
    private int f123998z;

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"com/sugarcube/app/base/ui/capturev2/q$a", "Landroid/opengl/GLSurfaceView$Renderer;", "Ljavax/microedition/khronos/opengles/GL10;", "gl", "Ljavax/microedition/khronos/egl/EGLConfig;", "config", "LXH/N;", "onSurfaceCreated", "(Ljavax/microedition/khronos/opengles/GL10;Ljavax/microedition/khronos/egl/EGLConfig;)V", "", "width", "height", "onSurfaceChanged", "(Ljavax/microedition/khronos/opengles/GL10;II)V", "onDrawFrame", "(Ljavax/microedition/khronos/opengles/GL10;)V", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.sugarcube.app.base.ui.capturev2.q$a */
    public static final class a implements GLSurfaceView.Renderer {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C14228q f123999a;

        a(C14228q qVar) {
            this.f123999a = qVar;
        }

        public void onDrawFrame(GL10 gl10) {
            C17542s.j(gl10, "gl");
            GLES20.glClear(16640);
            if (this.f123999a.f123981i) {
                this.f123999a.C();
            }
        }

        public void onSurfaceChanged(GL10 gl10, int i10, int i11) {
            C17542s.j(gl10, "gl");
            this.f123999a.f123978f = i10;
            this.f123999a.f123979g = i11;
            this.f123999a.f123977e = true;
            GLES20.glViewport(0, 0, i10, i11);
        }

        public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
            C17542s.j(gl10, "gl");
            C17542s.j(eGLConfig, "config");
            GLES20.glClearColor(0.1f, 0.1f, 0.1f, 1.0f);
            this.f123999a.z(eGLConfig);
            this.f123999a.y();
            C14451c l10 = this.f123999a.f123992t;
            if (l10 != null) {
                l10.a(this.f123999a.E());
            }
            C14450b k10 = this.f123999a.f123993u;
            if (k10 != null) {
                k10.c(this.f123999a.E(), "models/trigrid.png");
            }
            this.f123999a.f123976d = true;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"com/sugarcube/app/base/ui/capturev2/q$b", "Landroidx/lifecycle/h;", "Landroidx/lifecycle/y;", "owner", "LXH/N;", "onResume", "(Landroidx/lifecycle/y;)V", "onPause", "onDestroy", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.sugarcube.app.base.ui.capturev2.q$b */
    public static final class b implements C5205h {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C14228q f124000a;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @f(c = "com.sugarcube.app.base.ui.capturev2.ArSurface$2$onResume$1$1", f = "ArSurface.kt", l = {169}, m = "invokeSuspend")
        /* renamed from: com.sugarcube.app.base.ui.capturev2.q$b$a */
        static final class a extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            Object f124001c;

            /* renamed from: d  reason: collision with root package name */
            Object f124002d;

            /* renamed from: e  reason: collision with root package name */
            Object f124003e;

            /* renamed from: f  reason: collision with root package name */
            Object f124004f;

            /* renamed from: g  reason: collision with root package name */
            Object f124005g;

            /* renamed from: h  reason: collision with root package name */
            Object f124006h;

            /* renamed from: i  reason: collision with root package name */
            int f124007i;

            /* renamed from: j  reason: collision with root package name */
            int f124008j;

            /* renamed from: k  reason: collision with root package name */
            final /* synthetic */ C14228q f124009k;

            /* renamed from: l  reason: collision with root package name */
            final /* synthetic */ Session f124010l;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            a(C14228q qVar, Session session, C17164e<? super a> eVar) {
                super(2, eVar);
                this.f124009k = qVar;
                this.f124010l = session;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new a(this.f124009k, this.f124010l, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((a) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                C14228q qVar;
                Session session;
                C14218l lVar;
                ArControl arControl;
                Object f10 = C17187b.f();
                int i10 = this.f124008j;
                if (i10 == 0) {
                    y.b(obj);
                    lVar = this.f124009k.f123983k;
                    if (lVar != null) {
                        qVar = this.f124009k;
                        Session session2 = this.f124010l;
                        ArControl F10 = qVar.F();
                        this.f124001c = lVar;
                        this.f124002d = lVar;
                        this.f124003e = qVar;
                        this.f124004f = session2;
                        this.f124005g = lVar;
                        this.f124006h = F10;
                        this.f124007i = 0;
                        this.f124008j = 1;
                        Object i11 = lVar.i(this);
                        if (i11 == f10) {
                            return f10;
                        }
                        arControl = F10;
                        Object obj2 = i11;
                        session = session2;
                        obj = obj2;
                    } else {
                        this.f124009k.Q(this.f124010l);
                        return C16807N.f139792a;
                    }
                } else if (i10 == 1) {
                    arControl = (ArControl) this.f124006h;
                    lVar = (C14218l) this.f124005g;
                    session = (Session) this.f124004f;
                    qVar = (C14228q) this.f124003e;
                    C14218l lVar2 = (C14218l) this.f124002d;
                    C14218l lVar3 = (C14218l) this.f124001c;
                    try {
                        y.b(obj);
                    } catch (Throwable th2) {
                        this.f124009k.F().onError("ArSurface onResume error", th2);
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                arControl.onSharedImageScale(((Number) obj).floatValue());
                lVar.m();
                qVar.Q(session);
                return C16807N.f139792a;
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LQJ/Q;", "LXH/N;", "<anonymous>", "(LQJ/Q;)V"}, k = 3, mv = {2, 1, 0})
        @f(c = "com.sugarcube.app.base.ui.capturev2.ArSurface$2$onResume$1$2", f = "ArSurface.kt", l = {179}, m = "invokeSuspend")
        /* renamed from: com.sugarcube.app.base.ui.capturev2.q$b$b  reason: collision with other inner class name */
        static final class C3040b extends l implements p<Q, C17164e<? super C16807N>, Object> {

            /* renamed from: c  reason: collision with root package name */
            int f124011c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ C14228q f124012d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ Session f124013e;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            C3040b(C14228q qVar, Session session, C17164e<? super C3040b> eVar) {
                super(2, eVar);
                this.f124012d = qVar;
                this.f124013e = session;
            }

            public final C17164e<C16807N> create(Object obj, C17164e<?> eVar) {
                return new C3040b(this.f124012d, this.f124013e, eVar);
            }

            public final Object invoke(Q q10, C17164e<? super C16807N> eVar) {
                return ((C3040b) create(q10, eVar)).invokeSuspend(C16807N.f139792a);
            }

            public final Object invokeSuspend(Object obj) {
                Object f10 = C17187b.f();
                int i10 = this.f124011c;
                if (i10 == 0) {
                    y.b(obj);
                    long millis = TimeUnit.SECONDS.toMillis(2);
                    this.f124011c = 1;
                    if (C16297b0.b(millis, this) == f10) {
                        return f10;
                    }
                } else if (i10 == 1) {
                    y.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ArControl F10 = this.f124012d.F();
                boolean f11 = this.f124012d.f123981i;
                Session session = this.f124013e;
                String recordingPath = this.f124012d.F().getRecordingPath();
                F10.log("initRecording " + f11 + " " + session + " " + recordingPath);
                C14228q qVar = this.f124012d;
                qVar.N(this.f124013e, qVar.F().getRecordingPath());
                return C16807N.f139792a;
            }
        }

        b(C14228q qVar) {
            this.f124000a = qVar;
        }

        public void onDestroy(C5221y yVar) {
            C17542s.j(yVar, "owner");
            this.f124000a.F().onDestroy(this.f124000a.f123982j);
            this.f124000a.A();
            super.onDestroy(yVar);
        }

        public void onPause(C5221y yVar) {
            C17542s.j(yVar, "owner");
            this.f124000a.F().onPause(this.f124000a.f123982j);
            this.f124000a.F().log("ArSurface onPause");
            this.f124000a.L().onPause();
            C14228q qVar = this.f124000a;
            synchronized (qVar) {
                try {
                    if (qVar.f123981i) {
                        Session m10 = qVar.f123982j;
                        if (m10 != null) {
                            m10.pause();
                        }
                        qVar.f123981i = false;
                        C14218l n10 = qVar.f123983k;
                        if (n10 != null) {
                            n10.l();
                        }
                    }
                    C16807N n11 = C16807N.f139792a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f124000a.J().unregisterDisplayListener(this.f124000a.f123990r);
        }

        public void onResume(C5221y yVar) {
            boolean z10;
            Session m10;
            Set set;
            C17542s.j(yVar, "owner");
            this.f124000a.F().onResume(this.f124000a.f123982j);
            ArControl F10 = this.f124000a.F();
            Session m11 = this.f124000a.f123982j;
            F10.log("ArSurface onResume " + m11);
            C14228q qVar = this.f124000a;
            synchronized (qVar) {
                try {
                    boolean useSharedCamera = qVar.F().getUseSharedCamera();
                    z10 = qVar.F().getUseRecording() && !qVar.F().getUseVideoEncoder();
                    m10 = qVar.f123982j;
                    if (m10 == null) {
                        if (useSharedCamera) {
                            set = EnumSet.of(Session.Feature.SHARED_CAMERA);
                            C17542s.g(set);
                        } else {
                            set = g0.d();
                        }
                        m10 = qVar.U(set);
                        if (m10 == null) {
                            return;
                        }
                    }
                    if (useSharedCamera) {
                        if (qVar.f123983k == null) {
                            qVar.f123983k = new C14218l(qVar.E(), m10, qVar.I(), qVar.F());
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
                F0 unused = C16314k.d(C5222z.a(qVar.E()), (C17168i) null, (T) null, new a(qVar, m10, (C17164e<? super a>) null), 3, (Object) null);
                if (z10) {
                    F0 unused2 = C16314k.d(C5222z.a(qVar.E()), (C17168i) null, (T) null, new C3040b(qVar, m10, (C17164e<? super C3040b>) null), 3, (Object) null);
                }
                C16807N n10 = C16807N.f139792a;
                this.f124000a.L().onResume();
                this.f124000a.J().registerDisplayListener(this.f124000a.f123990r, (Handler) null);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/sugarcube/app/base/ui/capturev2/q$c;", "", "<init>", "()V", "", "COORDS_PER_VERTEX", "I", "TEXCOORDS_PER_VERTEX", "FLOAT_SIZE", "NUMBER_VERTICES", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.sugarcube.app.base.ui.capturev2.q$c */
    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"com/sugarcube/app/base/ui/capturev2/q$d", "Landroid/hardware/display/DisplayManager$DisplayListener;", "", "displayId", "LXH/N;", "onDisplayAdded", "(I)V", "onDisplayRemoved", "onDisplayChanged", "base_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    /* renamed from: com.sugarcube.app.base.ui.capturev2.q$d */
    public static final class d implements DisplayManager.DisplayListener {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C14228q f124014a;

        d(C14228q qVar) {
            this.f124014a = qVar;
        }

        public void onDisplayAdded(int i10) {
        }

        public void onDisplayChanged(int i10) {
            this.f124014a.f123977e = true;
        }

        public void onDisplayRemoved(int i10) {
        }
    }

    public C14228q(CaptureActivity captureActivity, GLSurfaceView gLSurfaceView, ArControl arControl) {
        C17542s.j(captureActivity, "activity");
        C17542s.j(gLSurfaceView, "surface");
        C17542s.j(arControl, "arControl");
        this.f123973a = captureActivity;
        this.f123974b = gLSurfaceView;
        this.f123975c = arControl;
        C14450b bVar = null;
        this.f123992t = K().Z0() ? new C14451c() : null;
        this.f123993u = K().Y0() ? new C14450b() : bVar;
        boolean useSharedCamera = arControl.getUseSharedCamera();
        arControl.log("ArSurface init shared=" + useSharedCamera);
        gLSurfaceView.setPreserveEGLContextOnPause(true);
        gLSurfaceView.setEGLContextClientVersion(2);
        gLSurfaceView.setEGLConfigChooser(8, 8, 8, 8, 16, 0);
        gLSurfaceView.setRenderer(new a(this));
        gLSurfaceView.setRenderMode(1);
        gLSurfaceView.setWillNotDraw(false);
        captureActivity.getLifecycle().c(new b(this));
        this.f123997y = new int[1];
        this.f123998z = -1;
        float[] fArr = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        this.f123968A = fArr;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer = allocateDirect.asFloatBuffer();
        asFloatBuffer.put(fArr);
        asFloatBuffer.position(0);
        C17542s.i(asFloatBuffer, "run(...)");
        this.f123969B = asFloatBuffer;
        ByteBuffer allocateDirect2 = ByteBuffer.allocateDirect(32);
        allocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer asFloatBuffer2 = allocateDirect2.asFloatBuffer();
        asFloatBuffer2.position(0);
        C17542s.i(asFloatBuffer2, "run(...)");
        this.f123970C = asFloatBuffer2;
        this.f123971D = "attribute vec4 a_Position;attribute vec2 a_TexCoord;varying vec2 v_TexCoord;void main() {  gl_Position = a_Position;  v_TexCoord = a_TexCoord;}";
        this.f123972E = "#extension GL_OES_EGL_image_external : require\nprecision mediump float;varying vec2 v_TexCoord;uniform samplerExternalOES sTexture;void main() {  gl_FragColor = texture2D(sTexture, v_TexCoord);}";
    }

    /* access modifiers changed from: private */
    public static final DisplayManager B(C14228q qVar) {
        Object systemService = qVar.f123973a.getSystemService("display");
        C17542s.h(systemService, "null cannot be cast to non-null type android.hardware.display.DisplayManager");
        return (DisplayManager) systemService;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:27|(8:29|30|31|32|33|34|35|36)|46|47|(1:49)|50|(3:52|53|54)|58|61) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:46:0x0184 */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0188 A[Catch:{ IllegalStateException -> 0x01c2, all -> 0x002b }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01b4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void C() {
        /*
            r16 = this;
            r1 = r16
            java.lang.String r0 = ") "
            java.lang.String r2 = "toString(...)"
            boolean r3 = r1.f123981i
            if (r3 != 0) goto L_0x000b
            return
        L_0x000b:
            com.google.ar.core.Session r3 = r1.f123982j
            if (r3 != 0) goto L_0x0010
            return
        L_0x0010:
            boolean r4 = r1.f123977e     // Catch:{ all -> 0x002b }
            r5 = 0
            if (r4 == 0) goto L_0x002e
            android.view.WindowManager r4 = r16.M()     // Catch:{ all -> 0x002b }
            android.view.Display r4 = r4.getDefaultDisplay()     // Catch:{ all -> 0x002b }
            int r4 = r4.getRotation()     // Catch:{ all -> 0x002b }
            int r6 = r1.f123978f     // Catch:{ all -> 0x002b }
            int r7 = r1.f123979g     // Catch:{ all -> 0x002b }
            r3.setDisplayGeometry(r4, r6, r7)     // Catch:{ all -> 0x002b }
            r1.f123977e = r5     // Catch:{ all -> 0x002b }
            goto L_0x002e
        L_0x002b:
            r0 = move-exception
            goto L_0x01f2
        L_0x002e:
            boolean r4 = r1.f123980h     // Catch:{ all -> 0x002b }
            if (r4 != 0) goto L_0x0052
            com.sugarcube.app.base.ui.capturev2.ArControl r4 = r1.f123975c     // Catch:{ all -> 0x002b }
            int r6 = r1.f123998z     // Catch:{ all -> 0x002b }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x002b }
            r7.<init>()     // Catch:{ all -> 0x002b }
            java.lang.String r8 = "Set Camera Texture name "
            r7.append(r8)     // Catch:{ all -> 0x002b }
            r7.append(r6)     // Catch:{ all -> 0x002b }
            java.lang.String r6 = r7.toString()     // Catch:{ all -> 0x002b }
            r4.log(r6)     // Catch:{ all -> 0x002b }
            int r4 = r1.f123998z     // Catch:{ all -> 0x002b }
            r3.setCameraTextureName(r4)     // Catch:{ all -> 0x002b }
            r4 = 1
            r1.f123980h = r4     // Catch:{ all -> 0x002b }
        L_0x0052:
            com.google.ar.core.Frame r4 = r3.update()     // Catch:{ all -> 0x002b }
            boolean r6 = r4.hasDisplayGeometryChanged()     // Catch:{ all -> 0x002b }
            r7 = 0
            java.lang.String r8 = " "
            if (r6 == 0) goto L_0x013e
            com.google.ar.core.Coordinates2d r6 = com.google.ar.core.Coordinates2d.OPENGL_NORMALIZED_DEVICE_COORDINATES     // Catch:{ all -> 0x002b }
            java.nio.FloatBuffer r9 = r1.f123969B     // Catch:{ all -> 0x002b }
            com.google.ar.core.Coordinates2d r10 = com.google.ar.core.Coordinates2d.TEXTURE_NORMALIZED     // Catch:{ all -> 0x002b }
            java.nio.FloatBuffer r11 = r1.f123970C     // Catch:{ all -> 0x002b }
            r4.transformCoordinates2d((com.google.ar.core.Coordinates2d) r6, (java.nio.FloatBuffer) r9, (com.google.ar.core.Coordinates2d) r10, (java.nio.FloatBuffer) r11)     // Catch:{ all -> 0x002b }
            com.google.ar.core.Camera r6 = r4.getCamera()     // Catch:{ all -> 0x002b }
            com.google.ar.core.CameraIntrinsics r6 = r6.getTextureIntrinsics()     // Catch:{ all -> 0x002b }
            java.lang.String r9 = "getTextureIntrinsics(...)"
            kotlin.jvm.internal.C17542s.i(r6, r9)     // Catch:{ all -> 0x002b }
            boolean r9 = r16.O()     // Catch:{ all -> 0x002b }
            XH.v r6 = PE.C13341c.c(r6, r9)     // Catch:{ all -> 0x002b }
            r1.f123987o = r6     // Catch:{ all -> 0x002b }
            com.google.ar.core.Camera r6 = r4.getCamera()     // Catch:{ all -> 0x002b }
            boolean r9 = r16.O()     // Catch:{ all -> 0x002b }
            com.google.ar.core.CameraIntrinsics r10 = r6.getImageIntrinsics()     // Catch:{ all -> 0x002b }
            com.sugarcube.app.base.ui.capturev2.W$a r11 = com.sugarcube.app.base.ui.capturev2.W.f123656f     // Catch:{ all -> 0x002b }
            kotlin.jvm.internal.C17542s.g(r10)     // Catch:{ all -> 0x002b }
            r12 = 2
            r13 = 0
            com.sugarcube.app.base.ui.capturev2.W r14 = com.sugarcube.app.base.ui.capturev2.W.a.d(r11, r10, r13, r12, r7)     // Catch:{ all -> 0x002b }
            r1.f123985m = r14     // Catch:{ all -> 0x002b }
            com.google.ar.core.CameraIntrinsics r14 = r6.getImageIntrinsics()     // Catch:{ all -> 0x002b }
            com.sugarcube.app.base.ui.capturev2.W r15 = r1.f123985m     // Catch:{ all -> 0x002b }
            float[] r15 = r15.a()     // Catch:{ all -> 0x002b }
            java.lang.String r15 = java.util.Arrays.toString(r15)     // Catch:{ all -> 0x002b }
            kotlin.jvm.internal.C17542s.i(r15, r2)     // Catch:{ all -> 0x002b }
            int[] r10 = r10.getImageDimensions()     // Catch:{ all -> 0x002b }
            java.lang.String r10 = java.util.Arrays.toString(r10)     // Catch:{ all -> 0x002b }
            kotlin.jvm.internal.C17542s.i(r10, r2)     // Catch:{ all -> 0x002b }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x002b }
            r5.<init>()     // Catch:{ all -> 0x002b }
            java.lang.String r7 = "imageIntrinsics("
            r5.append(r7)     // Catch:{ all -> 0x002b }
            r5.append(r9)     // Catch:{ all -> 0x002b }
            r5.append(r0)     // Catch:{ all -> 0x002b }
            r5.append(r14)     // Catch:{ all -> 0x002b }
            r5.append(r8)     // Catch:{ all -> 0x002b }
            r5.append(r15)     // Catch:{ all -> 0x002b }
            r5.append(r8)     // Catch:{ all -> 0x002b }
            r5.append(r10)     // Catch:{ all -> 0x002b }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x002b }
            com.sugarcube.app.base.ui.capturev2.ArControl r7 = r1.f123975c     // Catch:{ all -> 0x002b }
            r7.log(r5)     // Catch:{ all -> 0x002b }
            com.google.ar.core.CameraIntrinsics r5 = r6.getTextureIntrinsics()     // Catch:{ all -> 0x002b }
            kotlin.jvm.internal.C17542s.g(r5)     // Catch:{ all -> 0x002b }
            r6 = 0
            com.sugarcube.app.base.ui.capturev2.W r7 = com.sugarcube.app.base.ui.capturev2.W.a.d(r11, r5, r13, r12, r6)     // Catch:{ all -> 0x002b }
            r1.f123986n = r7     // Catch:{ all -> 0x002b }
            if (r7 == 0) goto L_0x00f3
            float[] r6 = r7.a()     // Catch:{ all -> 0x002b }
            goto L_0x00f4
        L_0x00f3:
            r6 = 0
        L_0x00f4:
            java.lang.String r6 = java.util.Arrays.toString(r6)     // Catch:{ all -> 0x002b }
            kotlin.jvm.internal.C17542s.i(r6, r2)     // Catch:{ all -> 0x002b }
            int[] r5 = r5.getImageDimensions()     // Catch:{ all -> 0x002b }
            java.lang.String r5 = java.util.Arrays.toString(r5)     // Catch:{ all -> 0x002b }
            kotlin.jvm.internal.C17542s.i(r5, r2)     // Catch:{ all -> 0x002b }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x002b }
            r2.<init>()     // Catch:{ all -> 0x002b }
            java.lang.String r10 = "textureIntrinsics("
            r2.append(r10)     // Catch:{ all -> 0x002b }
            r2.append(r9)     // Catch:{ all -> 0x002b }
            r2.append(r0)     // Catch:{ all -> 0x002b }
            r2.append(r7)     // Catch:{ all -> 0x002b }
            r2.append(r8)     // Catch:{ all -> 0x002b }
            r2.append(r6)     // Catch:{ all -> 0x002b }
            r2.append(r8)     // Catch:{ all -> 0x002b }
            r2.append(r5)     // Catch:{ all -> 0x002b }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x002b }
            com.sugarcube.app.base.ui.capturev2.ArControl r2 = r1.f123975c     // Catch:{ all -> 0x002b }
            r2.log(r0)     // Catch:{ all -> 0x002b }
            com.sugarcube.app.base.ui.capturev2.ArControl r0 = r1.f123975c     // Catch:{ all -> 0x002b }
            com.sugarcube.app.base.ui.capturev2.W r2 = r1.f123986n     // Catch:{ all -> 0x002b }
            r0.onArCameraIntrinsics(r2)     // Catch:{ all -> 0x002b }
            com.sugarcube.app.base.ui.capturev2.ArControl r0 = r1.f123975c     // Catch:{ all -> 0x002b }
            int r2 = r16.R()     // Catch:{ all -> 0x002b }
            r0.onSensorOrientation(r2)     // Catch:{ all -> 0x002b }
        L_0x013e:
            long r5 = r4.getTimestamp()     // Catch:{ all -> 0x002b }
            r9 = 0
            int r0 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x0149
            return
        L_0x0149:
            r16.D()     // Catch:{ all -> 0x002b }
            r0 = 16
            float[] r2 = new float[r0]     // Catch:{ all -> 0x002b }
            com.google.ar.core.Camera r5 = r4.getCamera()     // Catch:{ all -> 0x002b }
            r6 = 1036831949(0x3dcccccd, float:0.1)
            r7 = 1120403456(0x42c80000, float:100.0)
            r9 = 0
            r5.getProjectionMatrix(r2, r9, r6, r7)     // Catch:{ all -> 0x002b }
            fF.c r5 = r1.f123992t     // Catch:{ all -> 0x002b }
            if (r5 == 0) goto L_0x0184
            float[] r0 = new float[r0]     // Catch:{ all -> 0x002b }
            com.google.ar.core.Camera r6 = r4.getCamera()     // Catch:{ all -> 0x002b }
            r6.getViewMatrix(r0, r9)     // Catch:{ all -> 0x002b }
            com.google.ar.core.PointCloud r6 = r4.acquirePointCloud()     // Catch:{ Exception -> 0x0184 }
            r5.c(r6)     // Catch:{ all -> 0x017b }
            r5.b(r0, r2)     // Catch:{ all -> 0x017b }
            XH.N r0 = XH.C16807N.f139792a     // Catch:{ all -> 0x017b }
            r0 = 0
            jI.C17416c.a(r6, r0)     // Catch:{ Exception -> 0x0184 }
            goto L_0x0184
        L_0x017b:
            r0 = move-exception
            r5 = r0
            throw r5     // Catch:{ all -> 0x017e }
        L_0x017e:
            r0 = move-exception
            r7 = r0
            jI.C17416c.a(r6, r5)     // Catch:{ Exception -> 0x0184 }
            throw r7     // Catch:{ Exception -> 0x0184 }
        L_0x0184:
            fF.b r0 = r1.f123993u     // Catch:{ all -> 0x002b }
            if (r0 == 0) goto L_0x0199
            java.lang.Class<com.google.ar.core.Plane> r5 = com.google.ar.core.Plane.class
            java.util.Collection r5 = r3.getAllTrackables(r5)     // Catch:{ all -> 0x002b }
            com.google.ar.core.Camera r6 = r4.getCamera()     // Catch:{ all -> 0x002b }
            com.google.ar.core.Pose r6 = r6.getDisplayOrientedPose()     // Catch:{ all -> 0x002b }
            r0.e(r5, r6, r2)     // Catch:{ all -> 0x002b }
        L_0x0199:
            com.sugarcube.app.base.ui.capturev2.CaptureActivity r0 = r1.f123973a     // Catch:{ all -> 0x002b }
            com.sugarcube.app.base.ui.capturev2.U r0 = r0.F0()     // Catch:{ all -> 0x002b }
            com.sugarcube.app.base.ui.capturev2.R0 r0 = r0.o()     // Catch:{ all -> 0x002b }
            com.sugarcube.app.base.ui.capturev2.ArControl r2 = r1.f123975c     // Catch:{ all -> 0x002b }
            kotlin.jvm.internal.C17542s.g(r4)     // Catch:{ all -> 0x002b }
            int r2 = r2.onDrawFrame(r3, r4, r0)     // Catch:{ all -> 0x002b }
            com.google.ar.core.RecordingStatus r0 = r3.getRecordingStatus()     // Catch:{ all -> 0x002b }
            com.google.ar.core.RecordingStatus r3 = com.google.ar.core.RecordingStatus.OK     // Catch:{ all -> 0x002b }
            if (r0 != r3) goto L_0x01ee
            r0 = 4
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)     // Catch:{ IllegalStateException -> 0x01c2 }
            r0.putInt(r2)     // Catch:{ IllegalStateException -> 0x01c2 }
            java.util.UUID r3 = r1.f123984l     // Catch:{ IllegalStateException -> 0x01c2 }
            r4.recordTrackData(r3, r0)     // Catch:{ IllegalStateException -> 0x01c2 }
            goto L_0x01ee
        L_0x01c2:
            r0 = move-exception
            com.sugarcube.app.base.ui.capturev2.ArControl r3 = r1.f123975c     // Catch:{ all -> 0x002b }
            java.lang.Throwable r5 = r0.getCause()     // Catch:{ all -> 0x002b }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x002b }
            r6.<init>()     // Catch:{ all -> 0x002b }
            java.lang.String r7 = "could not recordTrackData ["
            r6.append(r7)     // Catch:{ all -> 0x002b }
            r6.append(r2)     // Catch:{ all -> 0x002b }
            java.lang.String r2 = "] "
            r6.append(r2)     // Catch:{ all -> 0x002b }
            r6.append(r0)     // Catch:{ all -> 0x002b }
            r6.append(r8)     // Catch:{ all -> 0x002b }
            r6.append(r5)     // Catch:{ all -> 0x002b }
            java.lang.String r2 = r6.toString()     // Catch:{ all -> 0x002b }
            r3.log(r2)     // Catch:{ all -> 0x002b }
            r0.printStackTrace()     // Catch:{ all -> 0x002b }
        L_0x01ee:
            kotlin.jvm.internal.C17542s.g(r4)     // Catch:{ all -> 0x002b }
            goto L_0x0210
        L_0x01f2:
            com.sugarcube.app.base.ui.capturev2.ArControl r2 = r1.f123975c
            com.sugarcube.app.base.ui.capturev2.h1 r3 = r16.K()
            java.util.UUID r3 = r3.r1()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "error processing frame "
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.onError(r3, r0)
        L_0x0210:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.capturev2.C14228q.C():void");
    }

    private final void D() {
        this.f123970C.position(0);
        GLES20.glDisable(2929);
        GLES20.glDepthMask(false);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.f123998z);
        GLES20.glUseProgram(this.f123994v);
        GLES20.glVertexAttribPointer(this.f123995w, 2, 5126, false, 0, this.f123969B);
        GLES20.glVertexAttribPointer(this.f123996x, 2, 5126, false, 0, this.f123970C);
        GLES20.glEnableVertexAttribArray(this.f123995w);
        GLES20.glEnableVertexAttribArray(this.f123996x);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(this.f123995w);
        GLES20.glDisableVertexAttribArray(this.f123996x);
        GLES20.glDepthMask(true);
        GLES20.glEnable(2929);
    }

    /* access modifiers changed from: private */
    public final CameraManager I() {
        return (CameraManager) this.f123991s.getValue();
    }

    /* access modifiers changed from: private */
    public final DisplayManager J() {
        return (DisplayManager) this.f123989q.getValue();
    }

    /* access modifiers changed from: private */
    public final h1 K() {
        return this.f123973a.E0();
    }

    private final WindowManager M() {
        return (WindowManager) this.f123988p.getValue();
    }

    /* access modifiers changed from: private */
    public final void N(Session session, String str) {
        RecordingConfig recordingConfig = new RecordingConfig(session);
        ArControl arControl = this.f123975c;
        UUID uuid = this.f123984l;
        long leastSignificantBits = uuid.getLeastSignificantBits();
        long mostSignificantBits = this.f123984l.getMostSignificantBits();
        arControl.log(uuid + "  " + leastSignificantBits + " " + mostSignificantBits);
        Track id2 = new Track(session).setId(this.f123984l);
        C17542s.i(id2, "setId(...)");
        byte[] bytes = "frame-count".getBytes(C15838d.f135279b);
        C17542s.i(bytes, "getBytes(...)");
        id2.setMetadata(ByteBuffer.wrap(bytes));
        recordingConfig.addTrack(id2);
        recordingConfig.setMp4DatasetUri(Uri.fromFile(new File(str)));
        recordingConfig.setAutoStopOnPause(true);
        try {
            session.startRecording(recordingConfig);
        } catch (RecordingFailedException e10) {
            ArControl arControl2 = this.f123975c;
            UUID r12 = K().r1();
            arControl2.onError("error startRecording " + r12, e10);
        } catch (IllegalStateException e11) {
            ArControl arControl3 = this.f123975c;
            UUID r13 = K().r1();
            arControl3.onError("error startRecording(2) " + r13, e11);
        } catch (Throwable th2) {
            ArControl arControl4 = this.f123975c;
            UUID r14 = K().r1();
            arControl4.onError("error startRecording(3) " + r14, th2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0057 A[Catch:{ all -> 0x001d }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0059 A[Catch:{ all -> 0x001d }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00a2  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean O() {
        /*
            r8 = this;
            com.google.ar.core.Session r0 = r8.f123982j
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x00a3
            int r0 = r8.R()     // Catch:{ all -> 0x001d }
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x001d }
            r4 = 30
            if (r3 < r4) goto L_0x001f
            android.view.WindowManager r3 = r8.M()     // Catch:{ all -> 0x001d }
            android.view.Display r3 = r3.getDefaultDisplay()     // Catch:{ all -> 0x001d }
            int r3 = r3.getRotation()     // Catch:{ all -> 0x001d }
            goto L_0x002b
        L_0x001d:
            r0 = move-exception
            goto L_0x0081
        L_0x001f:
            android.view.WindowManager r3 = r8.M()     // Catch:{ all -> 0x001d }
            android.view.Display r3 = r3.getDefaultDisplay()     // Catch:{ all -> 0x001d }
            int r3 = r3.getRotation()     // Catch:{ all -> 0x001d }
        L_0x002b:
            if (r3 == 0) goto L_0x004b
            if (r3 == r2) goto L_0x0053
            r4 = 2
            if (r3 == r4) goto L_0x0050
            r4 = 3
            if (r3 == r4) goto L_0x004d
            com.sugarcube.app.base.ui.capturev2.ArControl r4 = r8.f123975c     // Catch:{ all -> 0x001d }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x001d }
            r5.<init>()     // Catch:{ all -> 0x001d }
            java.lang.String r6 = "Invalid value, display rotation="
            r5.append(r6)     // Catch:{ all -> 0x001d }
            r5.append(r3)     // Catch:{ all -> 0x001d }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x001d }
            r4.log(r3)     // Catch:{ all -> 0x001d }
        L_0x004b:
            r3 = r1
            goto L_0x0055
        L_0x004d:
            r3 = 270(0x10e, float:3.78E-43)
            goto L_0x0055
        L_0x0050:
            r3 = 180(0xb4, float:2.52E-43)
            goto L_0x0055
        L_0x0053:
            r3 = 90
        L_0x0055:
            if (r0 == r3) goto L_0x0059
            r4 = r2
            goto L_0x005a
        L_0x0059:
            r4 = r1
        L_0x005a:
            com.sugarcube.app.base.ui.capturev2.ArControl r5 = r8.f123975c     // Catch:{ all -> 0x001d }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x001d }
            r6.<init>()     // Catch:{ all -> 0x001d }
            java.lang.String r7 = "isCameraRotated("
            r6.append(r7)     // Catch:{ all -> 0x001d }
            r6.append(r4)     // Catch:{ all -> 0x001d }
            java.lang.String r7 = ") "
            r6.append(r7)     // Catch:{ all -> 0x001d }
            r6.append(r3)     // Catch:{ all -> 0x001d }
            java.lang.String r3 = " "
            r6.append(r3)     // Catch:{ all -> 0x001d }
            r6.append(r0)     // Catch:{ all -> 0x001d }
            java.lang.String r0 = r6.toString()     // Catch:{ all -> 0x001d }
            r5.log(r0)     // Catch:{ all -> 0x001d }
            goto L_0x00a0
        L_0x0081:
            com.sugarcube.app.base.ui.capturev2.ArControl r3 = r8.f123975c
            com.sugarcube.app.base.ui.capturev2.h1 r4 = r8.K()
            java.util.UUID r4 = r4.r1()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "error isCameraRotated "
            r5.append(r6)
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            r3.onError(r4, r0)
            r4 = r2
        L_0x00a0:
            if (r4 != 0) goto L_0x00a3
            r1 = r2
        L_0x00a3:
            r0 = r1 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sugarcube.app.base.ui.capturev2.C14228q.O():boolean");
    }

    private final int P(int i10, String str) {
        int[] iArr = new int[1];
        int glCreateShader = GLES20.glCreateShader(i10);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 0) {
            this.f123975c.log("compile error");
        }
        return glCreateShader;
    }

    /* access modifiers changed from: private */
    public final void Q(Session session) {
        session.resume();
        this.f123981i = true;
        this.f123982j = session;
    }

    private final int R() {
        Session session = this.f123982j;
        if (session != null) {
            Integer num = (Integer) I().getCameraCharacteristics(session.getCameraConfig().getCameraId()).get(CameraCharacteristics.SENSOR_ORIENTATION);
            ArControl arControl = this.f123975c;
            String cameraId = session.getCameraConfig().getCameraId();
            arControl.log("sensorOrientation " + cameraId + " " + num);
            if (num != null) {
                return num.intValue();
            }
        }
        return 0;
    }

    /* access modifiers changed from: private */
    public final Session U(Set<? extends Session.Feature> set) {
        try {
            Session session = new Session(this.f123973a, set);
            Config config = session.getConfig();
            config.setFocusMode(Config.FocusMode.AUTO);
            session.configure(config);
            if (session.getCameraConfig().getFpsRange().getLower().intValue() <= 30) {
                return session;
            }
            CameraConfigFilter targetFps = new CameraConfigFilter(session).setTargetFps(EnumSet.of(CameraConfig.TargetFps.TARGET_FPS_30));
            C17542s.i(targetFps, "setTargetFps(...)");
            for (CameraConfig next : session.getSupportedCameraConfigs(targetFps)) {
                if (C17542s.e(next.getTextureSize(), session.getCameraConfig().getTextureSize()) && C17542s.e(next.getImageSize(), session.getCameraConfig().getImageSize())) {
                    session.setCameraConfig(next);
                    return session;
                }
            }
            return session;
        } catch (Throwable th2) {
            ArControl arControl = this.f123975c;
            UUID r12 = K().r1();
            arControl.onError("tryCreateSession error " + r12, th2);
            return null;
        }
    }

    /* access modifiers changed from: private */
    public static final WindowManager V(C14228q qVar) {
        Object systemService = qVar.f123973a.getSystemService("window");
        C17542s.h(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        return (WindowManager) systemService;
    }

    /* access modifiers changed from: private */
    public static final CameraManager x(C14228q qVar) {
        Object systemService = qVar.f123973a.getSystemService("camera");
        C17542s.h(systemService, "null cannot be cast to non-null type android.hardware.camera2.CameraManager");
        return (CameraManager) systemService;
    }

    /* access modifiers changed from: private */
    public final void z(EGLConfig eGLConfig) {
        try {
            EGL egl = EGLContext.getEGL();
            C17542s.h(egl, "null cannot be cast to non-null type javax.microedition.khronos.egl.EGL10");
            EGL10 egl10 = (EGL10) egl;
            int[] iArr = new int[2];
            egl10.eglGetConfigAttrib(egl10.eglGetCurrentDisplay(), eGLConfig, 12328, iArr);
            EGL14.eglChooseConfig(EGL14.eglGetCurrentDisplay(), new int[]{12328, iArr[0], 12344}, 0, new android.opengl.EGLConfig[1], 0, 1, iArr, 1);
        } catch (IOException e10) {
            ArControl arControl = this.f123975c;
            UUID r12 = K().r1();
            arControl.onError("error createOnGlThread " + r12, e10);
        }
    }

    public final void A() {
        synchronized (this) {
            try {
                this.f123975c.log("ArSurface destroy");
                if (!(this.f123997y.length == 0)) {
                    this.f123975c.log("ArSurface destroy: delete texture");
                    GLES20.glDeleteTextures(1, this.f123997y, 0);
                    this.f123997y = new int[0];
                    this.f123998z = -1;
                }
                this.f123981i = false;
                Session session = this.f123982j;
                if (session != null) {
                    this.f123982j = null;
                    session.close();
                }
                C14218l lVar = this.f123983k;
                if (lVar != null) {
                    this.f123983k = null;
                    lVar.f();
                    C16807N n10 = C16807N.f139792a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final CaptureActivity E() {
        return this.f123973a;
    }

    public final ArControl F() {
        return this.f123975c;
    }

    public final v<Float, Float> G() {
        return this.f123987o;
    }

    public final W H() {
        return this.f123986n;
    }

    public final GLSurfaceView L() {
        return this.f123974b;
    }

    public final void S() {
        ArControl arControl = this.f123975c;
        boolean z10 = this.f123981i;
        Session session = this.f123982j;
        arControl.log("ArSurface stop " + z10 + " " + session);
        C14218l lVar = this.f123983k;
        if (lVar != null) {
            this.f123983k = null;
            lVar.f();
        }
        synchronized (this) {
            try {
                Session session2 = this.f123982j;
                if (session2 != null) {
                    this.f123982j = null;
                    session2.close();
                }
                this.f123981i = false;
                C16807N n10 = C16807N.f139792a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void T() {
        ArControl arControl = this.f123975c;
        boolean z10 = this.f123981i;
        Session session = this.f123982j;
        RecordingStatus recordingStatus = session != null ? session.getRecordingStatus() : null;
        Session session2 = this.f123982j;
        arControl.log("stopRecording " + z10 + " " + recordingStatus + " " + session2);
        Session session3 = this.f123982j;
        if (session3 != null && session3.getRecordingStatus() == RecordingStatus.OK) {
            try {
                session3.stopRecording();
                ArControl arControl2 = this.f123975c;
                RecordingStatus recordingStatus2 = session3.getRecordingStatus();
                arControl2.log("stopRecording stopped " + recordingStatus2);
            } catch (RecordingFailedException e10) {
                ArControl arControl3 = this.f123975c;
                UUID r12 = K().r1();
                arControl3.onError("error stopRecording " + r12, e10);
            }
        }
    }

    public final void y() {
        this.f123975c.log("createOnGlThread");
        GLES20.glGenTextures(1, this.f123997y, 0);
        int i10 = this.f123997y[0];
        this.f123998z = i10;
        GLES20.glBindTexture(36197, i10);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        GLES20.glTexParameteri(36197, 10241, 9729);
        GLES20.glTexParameteri(36197, 10240, 9729);
        int P10 = P(35633, this.f123971D);
        int P11 = P(35632, this.f123972E);
        int glCreateProgram = GLES20.glCreateProgram();
        GLES20.glAttachShader(glCreateProgram, P10);
        GLES20.glAttachShader(glCreateProgram, P11);
        GLES20.glLinkProgram(glCreateProgram);
        this.f123995w = GLES20.glGetAttribLocation(glCreateProgram, "a_Position");
        this.f123996x = GLES20.glGetAttribLocation(glCreateProgram, "a_TexCoord");
        this.f123994v = glCreateProgram;
    }
}
